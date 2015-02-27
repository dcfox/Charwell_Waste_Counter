/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 

/**
 * This example, like all Swing examples, exists in a package:
 * in this case, the "start" package.
 * If you are using an IDE, such as NetBeans, this should work 
 * seamlessly.  If you are compiling and running the examples
 * from the command-line, this may be confusing if you aren't
 * used to using named packages.  In most cases,
 * the quick and dirty solution is to delete or comment out
 * the "package" line from all the source files and the code
 * should work as expected.  For an explanation of how to
 * use the Swing examples as-is from the command line, see
 * http://docs.oracle.com/javase/javatutorials/tutorial/uiswing/start/compile.html#package
 */
/*
 * HelloWorldSwing.java requires no other files. 
 */
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;        

public class HelloWorldSwing {
	private static JTextField textField;
	private static JTextField textField_1;
    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frmChartwellsWasteCounter = new JFrame("HelloWorldSwing");
        frmChartwellsWasteCounter.setTitle("Chartwell's Waste Counter");
        frmChartwellsWasteCounter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        frmChartwellsWasteCounter.getContentPane().add(tabbedPane, BorderLayout.WEST);
        
        JPanel panel_texts = new JPanel();
        tabbedPane.addTab("Enter info", null, panel_texts, null);
        tabbedPane.addTab("Enter info", null, panel_texts, null);
        
        JLabel lblNewLabel = new JLabel("Name (optional)");
        panel_texts.add(lblNewLabel);
        
        textField = new JTextField();
        panel_texts.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel_1 = new JLabel("Weight of waste (lbs.)");
        panel_texts.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        panel_texts.add(textField_1);
        textField_1.setColumns(10);
        
        JPanel panel = new JPanel();
        tabbedPane.addTab("Graphs", null, panel, null);
        
        JPanel panel_button = new JPanel();
        frmChartwellsWasteCounter.getContentPane().add(panel_button, BorderLayout.SOUTH);
        
        JButton btnNewButton = new JButton("Save & Close");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent arg0) {
        		//close window and create csv file
        	}
        });
        panel_button.add(btnNewButton);
        
        JButton btnNewButton_1 = new JButton("Submit");
        btnNewButton_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		//add to list of students
        	}
        });
        panel_button.add(btnNewButton_1);
        
        JPanel panel_top = new JPanel();
        frmChartwellsWasteCounter.getContentPane().add(panel_top, BorderLayout.NORTH);

        //Display the window.
        frmChartwellsWasteCounter.pack();
        frmChartwellsWasteCounter.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}