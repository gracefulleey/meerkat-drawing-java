package meerkatDrawing;

import meerkatDrawing.graphicState.ColorfulState;
import meerkatDrawing.graphicState.MonochromeState;
import meerkatDrawing.graphicState.NormalState;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class TestDrawingTool extends JFrame implements ActionListener {
    private DrawingArea drawing;
    private JPanel sliderPanel;
    private JPanel statePanel;
    private Button repaint;
    private Button backgroundColorButton;
    private Button normalStateButton;
    private Button monochromeStateButton;
    private Button colorfulStateButton;
    private JSlider countSlider;
    private JSlider sizeSlider;

    public TestDrawingTool(String title) {
        super(title);

        constructSliderPanel();

        constructStatePanel();

        setLayout(new BorderLayout());
        add(sliderPanel, BorderLayout.NORTH);
        add(statePanel, BorderLayout.WEST);

        Dimension screenSize = getToolkit().getScreenSize();
        MeerkatDrawing.screenSizeWidth = screenSize.width;
        MeerkatDrawing.screenSizeHeight = screenSize.height;

        constructDrawingArea();

        setBounds(0, 0, screenSize.width, screenSize.height);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void constructStatePanel() {
        statePanel = new JPanel();
        statePanel.setLayout(new BoxLayout(statePanel, BoxLayout.Y_AXIS));

        normalStateButton = new Button("Normal State");
        normalStateButton.addActionListener(this);

        monochromeStateButton = new Button("Monochrome State");
        monochromeStateButton.addActionListener(this);

        colorfulStateButton = new Button("Colorful State");
        colorfulStateButton.addActionListener(this);

        backgroundColorButton = new Button("Background Color");
        backgroundColorButton.addActionListener(this);

        statePanel.add(normalStateButton);
        statePanel.add(monochromeStateButton);
        statePanel.add(colorfulStateButton);
        statePanel.add(backgroundColorButton);
    }

    public void constructSliderPanel() {
        sliderPanel = new JPanel();

        countSlider = new JSlider(
                JSlider.HORIZONTAL, 1, 100, MeerkatDrawing.count);
        sliderPanel.add(countSlider);
        sliderPanel.add(new JLabel("Number of meerkats"));

        sizeSlider = new JSlider(
                JSlider.HORIZONTAL, 1, 100, MeerkatDrawing.size);
        sliderPanel.add(sizeSlider);
        sliderPanel.add(new JLabel("Size of meerkats"));

        countSlider.addChangeListener(e -> {
            if (!countSlider.getValueIsAdjusting()) {
                updateDrawingFromSliders();
            }
        });

        sizeSlider.addChangeListener(e -> {
            if (!sizeSlider.getValueIsAdjusting()) {
                updateDrawingFromSliders();
            }
        });

        repaint = new Button("Repaint");
        repaint.addActionListener(this);
        sliderPanel.add(repaint);
        sliderPanel.add(new JLabel("Press for repaint"));
    }

    private void updateDrawingFromSliders() {
        if (drawing == null) {
            return;
        }

        MeerkatDrawing.count = countSlider.getValue();
        MeerkatDrawing.size = sizeSlider.getValue();

        drawing.getScene().generateMeerkats();
        drawing.repaint();
    }

    private void constructDrawingArea() {
        drawing = new DrawingArea();
        add(drawing, BorderLayout.CENTER);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == repaint) {
            MeerkatDrawing.size = sizeSlider.getValue();
            MeerkatDrawing.count = countSlider.getValue();
            drawing.getScene().generateMeerkats();
            drawing.repaint();
        } else if (e.getSource() == backgroundColorButton) {
            Color selectedColor = JColorChooser.showDialog(
                    this,
                    "Choose Color",
                    MeerkatDrawing.backgroundColor
            );
            if (selectedColor != null) {
                MeerkatDrawing.backgroundColor = selectedColor;
                drawing.setBackground(selectedColor);
                drawing.repaint();
            }
        } else if (e.getSource() == normalStateButton) {
            Scene.setGraphicState(new NormalState());
            drawing.repaint();
        } else if (e.getSource() == monochromeStateButton) {
            Scene.setGraphicState(new MonochromeState());
            drawing.repaint();
        } else if (e.getSource() == colorfulStateButton) {
            Scene.setGraphicState(new ColorfulState());
            drawing.repaint();
        }
    }

    public static void main(String[] args) {

        new TestDrawingTool("Here is a drawing of a meerkat :D");

    }
}