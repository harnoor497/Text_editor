package text_editor;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class editor extends javax.swing.JFrame 
{
    Color selectColor;
    public editor() 
    {
        initComponents();
       loadFont();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel3 = new javax.swing.JLabel();
        jcbfont = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jbSelectSize = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        M_te = new javax.swing.JMenu();
        MI_quit_te = new javax.swing.JMenuItem();
        M_file = new javax.swing.JMenu();
        MI_new = new javax.swing.JMenuItem();
        MI_open = new javax.swing.JMenuItem();
        MI_save = new javax.swing.JMenuItem();
        MI_close = new javax.swing.JMenuItem();
        M_edit = new javax.swing.JMenu();
        MI_cut = new javax.swing.JMenuItem();
        MI_copy = new javax.swing.JMenuItem();
        MI_paste = new javax.swing.JMenuItem();
        M_format = new javax.swing.JMenu();
        MI_show_color = new javax.swing.JMenuItem();
        M_help = new javax.swing.JMenu();
        MI_tehelp = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem24.setText("jMenuItem24");

        jMenuItem28.setText("jMenuItem28");

        jMenuItem32.setText("jMenuItem32");

        jMenuItem33.setText("jMenuItem33");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jLabel3.setText("Font ");
        jToolBar1.add(jLabel3);

        jcbfont.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbfont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbfontActionPerformed(evt);
            }
        });
        jToolBar1.add(jcbfont);

        jLabel1.setText("Font Size");
        jToolBar1.add(jLabel1);

        jbSelectSize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "14", "18", "22", "26", "30", "34", "36", "40", "44", "48", "52" }));
        jbSelectSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelectSizeActionPerformed(evt);
            }
        });
        jToolBar1.add(jbSelectSize);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        M_te.setText("Text Editor");
        M_te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M_teActionPerformed(evt);
            }
        });

        MI_quit_te.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.META_MASK));
        MI_quit_te.setText("Quit Text Edit");
        MI_quit_te.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_quit_teActionPerformed(evt);
            }
        });
        M_te.add(MI_quit_te);

        jMenuBar1.add(M_te);

        M_file.setText("File");

        MI_new.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.META_MASK));
        MI_new.setText("New");
        MI_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_newActionPerformed(evt);
            }
        });
        M_file.add(MI_new);

        MI_open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.META_MASK));
        MI_open.setText("Open");
        MI_open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_openActionPerformed(evt);
            }
        });
        M_file.add(MI_open);

        MI_save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.META_MASK));
        MI_save.setText("Save");
        MI_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_saveActionPerformed(evt);
            }
        });
        M_file.add(MI_save);

        MI_close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.META_MASK));
        MI_close.setText("Close");
        MI_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_closeActionPerformed(evt);
            }
        });
        M_file.add(MI_close);

        jMenuBar1.add(M_file);

        M_edit.setText("Edit");

        MI_cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.META_MASK));
        MI_cut.setText("Cut");
        MI_cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_cutActionPerformed(evt);
            }
        });
        M_edit.add(MI_cut);

        MI_copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.META_MASK));
        MI_copy.setText("Copy");
        MI_copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_copyActionPerformed(evt);
            }
        });
        M_edit.add(MI_copy);

        MI_paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.META_MASK));
        MI_paste.setText("Paste");
        MI_paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_pasteActionPerformed(evt);
            }
        });
        M_edit.add(MI_paste);

        jMenuBar1.add(M_edit);

        M_format.setText("format ");

        MI_show_color.setText("Show Colors");
        MI_show_color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_show_colorActionPerformed(evt);
            }
        });
        M_format.add(MI_show_color);

        jMenuBar1.add(M_format);

        M_help.setText("Help");

        MI_tehelp.setText("Text Edit Help");
        MI_tehelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MI_tehelpActionPerformed(evt);
            }
        });
        M_help.add(MI_tehelp);

        jMenuBar1.add(M_help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MI_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_newActionPerformed
        String s = evt.getActionCommand(); 
        if (s.equals("New")) 
        {
            jTextPane1.setText(""); 
        }
    }//GEN-LAST:event_MI_newActionPerformed

    private void MI_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_saveActionPerformed
                JFileChooser save = new JFileChooser();
		int option = save.showSaveDialog(this);
		File file = new File(save.getSelectedFile().getPath());
		try
			{
			String source = jTextPane1.getText();
			char buffer[] = new char[source.length()];
			source.getChars(0,source.length(),buffer,0);
			FileWriter f1= new FileWriter(file+".txt");
			for(int i=0;i<buffer.length;i++)
				{
				f1.write(buffer[i]);
				}
			f1.close();

			}
		catch(Exception ae)
			{}
		
    }//GEN-LAST:event_MI_saveActionPerformed

    private void MI_show_colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_show_colorActionPerformed
 Color jColor = selectColor;
        // open color dialog and select Color
        if ((jColor = JColorChooser.showDialog(this, "Select color", jColor)) != null) {
            selectColor = jColor;
            // set text color
            jTextPane1.setForeground(selectColor);
        }
    }//GEN-LAST:event_MI_show_colorActionPerformed

    private void MI_cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_cutActionPerformed
        String s = evt.getActionCommand(); 
  
        if (s.equals("Cut")) { 
            jTextPane1.cut(); 
        }     }//GEN-LAST:event_MI_cutActionPerformed

    private void MI_tehelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_tehelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MI_tehelpActionPerformed

    private void MI_quit_teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_quit_teActionPerformed
 String s = evt.getActionCommand(); 
  
        if (s.equals("Quit Text Edit")) { 
                  this.setVisible(false);      
        }
    }//GEN-LAST:event_MI_quit_teActionPerformed

    private void M_teActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M_teActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_M_teActionPerformed

    private void MI_copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_copyActionPerformed
        String s = evt.getActionCommand(); 
  
        if (s.equals("Copy")) { 
            jTextPane1.copy(); 
        }
    }//GEN-LAST:event_MI_copyActionPerformed

    private void MI_openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_openActionPerformed
 JFileChooser j = new JFileChooser("f:"); 
  
            // Invoke the showsOpenDialog function to show the save dialog 
            int r = j.showOpenDialog(null); 
  
            // If the user selects a file 
            if (r == JFileChooser.APPROVE_OPTION) { 
                // Set the label to the path of the selected directory 
                File fi = new File(j.getSelectedFile().getAbsolutePath()); 
  
             
                    // String 
                    String s1 = "", sl = ""; 
  
                    // File reader 
                    FileReader fr = null; 
            try {
                fr = new FileReader(fi);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
  
                    // Buffered reader 
                    BufferedReader br = new BufferedReader(fr); 
  
            try {
                // Initilize sl
                sl = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
  
            try {
                // Take the input from the file
                while ((s1 = br.readLine()) != null) {
                    sl = sl + "\n" + s1; 
                }
            } catch (IOException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
  
                    // Set the text 
                    jTextPane1.setText(sl); 
            }
    }//GEN-LAST:event_MI_openActionPerformed

    private void MI_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_closeActionPerformed
  String s = evt.getActionCommand(); 
  
        if (s.equals("Close")) { 
                  this.setVisible(false);      
        }
    }//GEN-LAST:event_MI_closeActionPerformed

    private void MI_pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MI_pasteActionPerformed
        String s= evt.getActionCommand();
        if(s.equals("Paste"))
        {
        jTextPane1.paste();
        }
    }//GEN-LAST:event_MI_pasteActionPerformed

    private void jcbfontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbfontActionPerformed
 // Change font of text
        jTextPane1.setFont(new Font(jcbfont.getSelectedItem().toString(),
                Font.PLAIN, Integer.parseInt(jbSelectSize.getSelectedItem().toString())));    }//GEN-LAST:event_jcbfontActionPerformed

    private void jbSelectSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelectSizeActionPerformed
        // Select size of text
     
        String getSize = jbSelectSize.getSelectedItem().toString();
        Font f = jTextPane1.getFont();
        jTextPane1.setFont(new Font(f.getFontName(),
                f.getStyle(), Integer.parseInt(getSize)));
    }//GEN-LAST:event_jbSelectSizeActionPerformed

   
    private void loadFont() {
    GraphicsEnvironment gEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
    // get all font name 
    String[] fontNames = gEnv.getAvailableFontFamilyNames();
        // load to combobox
    ComboBoxModel model = new DefaultComboBoxModel(fontNames);
    jcbfont.setModel(model);
}

     
    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new editor().setVisible(true);
//            }
//        });
               editor er = new editor();
        er.setVisible(true);
       }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MI_close;
    private javax.swing.JMenuItem MI_copy;
    private javax.swing.JMenuItem MI_cut;
    private javax.swing.JMenuItem MI_new;
    private javax.swing.JMenuItem MI_open;
    private javax.swing.JMenuItem MI_paste;
    private javax.swing.JMenuItem MI_quit_te;
    private javax.swing.JMenuItem MI_save;
    private javax.swing.JMenuItem MI_show_color;
    private javax.swing.JMenuItem MI_tehelp;
    private javax.swing.JMenu M_edit;
    private javax.swing.JMenu M_file;
    private javax.swing.JMenu M_format;
    private javax.swing.JMenu M_help;
    private javax.swing.JMenu M_te;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> jbSelectSize;
    private javax.swing.JComboBox<String> jcbfont;
    // End of variables declaration//GEN-END:variables
}