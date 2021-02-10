import java.awt.*;
import javax.swing.*;

public class PointAndClick extends JFrame
{
    JPanel jp;
    JLabel jl;
    JLabel jl2;

    // Constructor
    public PointAndClick()
    {
        // set all necessary properties
        setTitle("Pointy Adventure");                       // set title of window to "Pointy Adventure"
        setSize(600, 400);                                  // width 600, height 400
        setResizable(true);                                 // allows window to be resizable
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     //Ensure window closes when clicking "X"
        setVisible(true);                                   // make frame visible

        jp = new JPanel();                                  // create instance of JPanel
        jp.setLayout(new BorderLayout());                   // set to border layout
        add(jp);                                            // add panel to the frame

        jl = new JLabel("Pointy Adventure");                // create new JLabel
        jl.setVerticalTextPosition(JLabel.TOP);             // align the text in jl to the top
        jl.setHorizontalAlignment(JLabel.CENTER);           // align jl to the center of horizontal axis
        jp.add(jl, BorderLayout.PAGE_START);                // add jl to the panel

        jl2 = new JLabel("To The Moon Studios");            // create new JLabel
        jl2.setVerticalTextPosition(JLabel.BOTTOM);          // align the text in jl2 to the bottom
        jl2.setHorizontalAlignment(JLabel.CENTER);           // align jl2 to the center of horizontal axis
        jp.add(jl2, BorderLayout.PAGE_END);                 // add jl2 to the panel
    } // end PointAndClick

    public static void main(String[] args)
    {
        PointAndClick obj = new PointAndClick();
    } // end main
}
