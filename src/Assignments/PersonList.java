package Assignments;

import static ArrayLists.PersonArrayList.findInsertPoint;
import static ArrayLists.PersonArrayList.search;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class PersonList extends javax.swing.JFrame {

    ArrayList<Person>people = new ArrayList();
    DefaultListModel list = new DefaultListModel();
    
    public PersonList() {
        initComponents();
        
        people.add(new Person("Bob",25,"M"));
        people.add(new Person("Fran",55,"F"));
        people.add(new Person("Mike",15,"M"));
        people.add(new Person("Sue",30,"F"));
        lstpeople.setModel(list);
        for (Person p:people) {
            list.addElement(p.getName());
        }
    }
    
    public void clearForm(){
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        lstpeople.clearSelection();
    }
    
    public void show(Person p){
        txtname.setText(p.getName());
        txtage.setText(""+p.getAge());
        if(p.getGender()=="M"){
            optmale.setSelected(true);
        }
        else
            optfemale.setSelected(true);
    }
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        optmale = new javax.swing.JRadioButton();
        optfemale = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstpeople = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuexit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudelete = new javax.swing.JMenuItem();
        Menu = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();
        mnufemale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonGroup1.add(optmale);
        optmale.setText("Male");
        optmale.setActionCommand("M");

        buttonGroup1.add(optfemale);
        optfemale.setText("Female");
        optfemale.setActionCommand("F");

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        lstpeople.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstpeopleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(lstpeople);

        jMenu1.setText("File");

        mnuexit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        mnuexit.setText("Exit");
        mnuexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexitActionPerformed(evt);
            }
        });
        jMenu1.add(mnuexit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuclear.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        mnuadd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnudelete.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        mnudelete.setText("Delete");
        mnudelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudeleteActionPerformed(evt);
            }
        });
        jMenu2.add(mnudelete);

        jMenuBar1.add(jMenu2);

        Menu.setText("Filter");

        mnuall.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        mnuall.setText("View All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        Menu.add(mnuall);

        mnumale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_MASK));
        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        Menu.add(mnumale);

        mnufemale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        mnufemale.setText("Female");
        mnufemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemaleActionPerformed(evt);
            }
        });
        Menu.add(mnufemale);

        jMenuBar1.add(Menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optmale)
                        .addGap(27, 27, 27)
                        .addComponent(optfemale))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtname)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optmale)
                            .addComponent(optfemale)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        clearForm();
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        String name = txtname.getText();
        int age = Integer.parseInt(txtage.getText());
        String gender = buttonGroup1.getSelection().getActionCommand();
        Person p = new Person(name, age, gender);
        int loc = findInsertPoint(people, p);
        people.add(loc,p);
        list.add(loc, p.getName());
        clearForm();
    }//GEN-LAST:event_mnuaddActionPerformed

    private void mnudeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudeleteActionPerformed
        String name = "" + lstpeople.getSelectedValue();
        int loc = search(people, new Person(name,0,""));
        list.removeElementAt(lstpeople.getSelectedIndex());
        people.remove(loc);
        clearForm();
    }//GEN-LAST:event_mnudeleteActionPerformed

    private void mnufemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemaleActionPerformed
        list.clear();
        for(Person person : people){
            if(person.getGender()=="F"){
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnufemaleActionPerformed

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        list.clear();
        for(Person person : people){
            if(person.getGender()=="M"){
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnumaleActionPerformed

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        list.clear();
        for(Person person : people){
            if(person.getGender()=="F" || person.getGender()=="M"){
                list.addElement(person.getName());
            }
        }
    }//GEN-LAST:event_mnuallActionPerformed

    private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
    System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

    private void lstpeopleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstpeopleMouseClicked
        String name = ""+lstpeople.getSelectedValue();
        int loc = search(people, new Person(name,0,""));
        show(people.get(loc));
    }//GEN-LAST:event_lstpeopleMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstpeople;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudelete;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnufemale;
    private javax.swing.JMenuItem mnumale;
    private javax.swing.JRadioButton optfemale;
    private javax.swing.JRadioButton optmale;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
