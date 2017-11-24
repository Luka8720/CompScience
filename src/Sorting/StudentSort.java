package Sorting;
import java.io.FileReader;
import java.io.BufferedReader;
import javax.swing.DefaultListModel;



public class StudentSort extends javax.swing.JFrame {

    ISSStudent students[];
    DefaultListModel list;

    public StudentSort() {
        initComponents();
        students = new ISSStudent[100];
        list = new DefaultListModel();
        lststudents.setModel(list);//connects data to list
    }
    //Modify to work with ISSStudent, Original was Int 
    ////////////////////////////////////////////////////////////////
    public static void selectionSort(ISSStudent[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(ISSStudent[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i].compareTo(a[minIndex])< 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }

//supporting swap method (same as bubble sort swap)
    public static void swap(ISSStudent[] a, int x, int y) {
        ISSStudent temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

/////////////////////////////////////////////////////////////
    public void getData() {
        FileReader f;
        BufferedReader br;
        try {
            f = new FileReader("src/searching/studata.txt");
            br = new BufferedReader(f);
            for (int i = 0; i < 100; i++) {
                String nm = br.readLine();
                String ad = br.readLine();
                int id = Integer.parseInt(br.readLine());
                students[i] = new ISSStudent(nm, ad, id);
                System.out.println(students[i]);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        };

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lststudents = new javax.swing.JList<>();
        btnopen = new javax.swing.JButton();
        btnsort = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lststudents.setBackground(new java.awt.Color(0, 0, 0));
        lststudents.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(lststudents);

        btnopen.setText("Open File");
        btnopen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopenActionPerformed(evt);
            }
        });

        btnsort.setText("Sort By Name");
        btnsort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnopen)
                    .addComponent(btnsort))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnopen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsort))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnopenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopenActionPerformed
        getData();//fill array from data file
        for (ISSStudent x : students) {
            list.addElement(x.getName());

        }
    }//GEN-LAST:event_btnopenActionPerformed

    private void btnsortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsortActionPerformed
        //clear the list
        list.clear();
        selectionSort(students);
        //re-display the list
        for (ISSStudent x : students) {
            list.addElement(x.getName());

        }
    }//GEN-LAST:event_btnsortActionPerformed

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
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnopen;
    private javax.swing.JButton btnsort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lststudents;
    // End of variables declaration//GEN-END:variables
}
