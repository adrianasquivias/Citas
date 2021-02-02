/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datejava;

import java.io.BufferedReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.table.DefaultTableModel;
import java.util.Scanner;


/**
 *
 * @author adria
 */
public class Window extends javax.swing.JFrame {

    
    private ArrayList<People>Lis;
    public Window() {
        Lis = new ArrayList<People>();
        initComponents();
        //cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jlabelSchedule = new javax.swing.JLabel();
        jlabelName = new javax.swing.JLabel();
        jlabelDate = new javax.swing.JLabel();
        jlabelTime = new javax.swing.JLabel();
        jlabelUbication = new javax.swing.JLabel();
        jlabeldescription = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jTextUbication = new javax.swing.JTextField();
        jTextDescription = new javax.swing.JTextField();
        jDate = new com.toedter.calendar.JDateChooser();
        jComboBox = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonLoad = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jlabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable.setBackground(new java.awt.Color(255, 249, 244));
        jTable.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTable.setForeground(new java.awt.Color(102, 102, 102));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"", null, "", "", ""},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Fecha", "Hora ", "Ubicación", "Descripción"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(406, 0, 480, 486);

        jlabelSchedule.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jlabelSchedule.setForeground(new java.awt.Color(204, 102, 0));
        jlabelSchedule.setText("AGENDA");
        getContentPane().add(jlabelSchedule);
        jlabelSchedule.setBounds(160, 50, 86, 30);

        jlabelName.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabelName.setText("Nombre");
        getContentPane().add(jlabelName);
        jlabelName.setBounds(70, 110, 42, 14);

        jlabelDate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabelDate.setText("Fecha");
        getContentPane().add(jlabelDate);
        jlabelDate.setBounds(70, 160, 31, 14);

        jlabelTime.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabelTime.setText("Horario");
        getContentPane().add(jlabelTime);
        jlabelTime.setBounds(70, 200, 74, 14);

        jlabelUbication.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabelUbication.setText("Ubicación");
        getContentPane().add(jlabelUbication);
        jlabelUbication.setBounds(70, 250, 51, 14);

        jlabeldescription.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jlabeldescription.setText("Descripción");
        getContentPane().add(jlabeldescription);
        jlabeldescription.setBounds(70, 290, 62, 20);

        jTextName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextName);
        jTextName.setBounds(120, 100, 110, 20);
        getContentPane().add(jTextUbication);
        jTextUbication.setBounds(130, 250, 140, 20);

        jTextDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDescriptionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextDescription);
        jTextDescription.setBounds(140, 290, 150, 20);
        getContentPane().add(jDate);
        jDate.setBounds(120, 150, 160, 20);

        jComboBox.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona el horario", "7:00 am - 8:00 am", "8:00 am - 9:00 am", "9:00 am - 10:00 am", "10:00 am - 11:00 am", "11:00 am - 12:00 pm", "12:00 pm - 13:00 pm", "13:00 pm - 14:00 pm", "14:00 pm - 15:00 pm", "15:00 pm - 16:00 pm", "16:00 pm - 17:00 pm", "17:00 pm - 18:00 pm", " " }));
        getContentPane().add(jComboBox);
        jComboBox.setBounds(120, 200, 160, 20);

        jButtonSave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonSave.setText("Agregar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSave);
        jButtonSave.setBounds(150, 320, 110, 23);

        jButtonLoad.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonLoad.setText("Cargar");
        jButtonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLoad);
        jButtonLoad.setBounds(160, 390, 90, 23);

        jButtonDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButtonDelete.setText("Borrar");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDelete);
        jButtonDelete.setBounds(160, 350, 90, 23);

        jlabelWallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/datejava/wallpaper.jpg"))); // NOI18N
        jlabelWallpaper.setText("jLabel1");
        getContentPane().add(jlabelWallpaper);
        jlabelWallpaper.setBounds(0, 10, 410, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameActionPerformed

    private void jTextDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDescriptionActionPerformed
    private void clear(){
        jTextName.setText("");
        jTextUbication.setText("");
        jTextDescription.setText("");
        jComboBox.setSelectedItem(null);
        jDate.setDate(null);
       
   
        
                
        
    }
    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
       
        
        try {
        String NAME = jTextName.getText();
        String UBICATION = jTextUbication.getText();
        String DESCRIPTION = jTextDescription.getText();
        String DATE = new SimpleDateFormat("dd/MM/yyyy").format(jDate.getDate());
        String TIME = jComboBox.getSelectedItem().toString();
       
            Lis.add(new People(NAME,UBICATION,DESCRIPTION, DATE, TIME));
				 
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Comprueba haber llenado las casillas");
            }
            clear();
            seeData();
    }//GEN-LAST:event_jButtonSaveActionPerformed

    public void cargar(){
        File Archive = new File(System.getProperty("user.dir")+"\\Personas.txt");
        String userData[]= new String[6];
        
        People people , aux = new People(); 
        
        int v = 0;
             
        try{
            Scanner myReader = new Scanner(Archive);
           while (myReader.hasNextLine()) {
               
               
               String data = myReader.nextLine();
               userData[v]= data;
               System.out.println("userData"+v+"--"+data);
               
               v++;
               if(v>=5){
                   Lis.add(new People(userData[0],userData[3],userData[4],userData[1],userData[2]));
                   v=0;
                   
               }
          }
           
           //clear();
           seeData();
      myReader.close();
                     
        }catch (IOException e){            
        }
        seeData();
    } 
    
    
    
    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int Container;
        try{
           Container = jTable.getSelectedRow();
           Lis.remove(Container);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Seleccione una fila");
        }
        seeData();
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadActionPerformed
        // TODO add your handling code here:
        cargar();
    }//GEN-LAST:event_jButtonLoadActionPerformed
    private void SAVE(){
        File file = new File("C:\\Users\\adria\\Documents\\NetBeansProjects\\DateJava\\Personas.txt");
        PrintWriter writes;
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (Exception e){
            }
        }
        try{
            People aux;
            writes = new PrintWriter(file,"utf-8");
            for (int i= 0 ; i< Lis.size(); i++){
                aux = Lis.get(i);
                aux.Save(writes);
            }
            writes.close();
        }catch (Exception e){
            
        }
         
    }
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String Buttons[]={"SI","NO"};
        int n = JOptionPane.showOptionDialog(null,"Desea Guardar los datos?","Tittle",0,0,null, Buttons,null);
        if(n == 0)
            SAVE();
    }//GEN-LAST:event_formWindowClosing
    private void seeData(){
        String Mat[][]= new String[Lis.size()][6];
                        int i = 0;
			for (People aux:Lis) {
				Mat[i][0]= aux.getName();
                                Mat[i][1]= aux.getDate();
                                Mat[i][2]= aux.getTime();
				Mat[i][3]= aux.getUbication();
				Mat[i][4]= aux.getDescription();
                                System.out.println("Mat"+i+"--"+aux.getName());
                                i++;
                        }
                        System.out.println("-------");
                        jTable.setModel(new javax.swing.table.DefaultTableModel(
                                Mat,
                                new String [] {
                                "Nombre", "Fecha", "Hora" , "Ubicación", "Descripción"
                                }
        ));
}   
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
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonLoad;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBox;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextDescription;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextUbication;
    private javax.swing.JLabel jlabelDate;
    private javax.swing.JLabel jlabelName;
    private javax.swing.JLabel jlabelSchedule;
    private javax.swing.JLabel jlabelTime;
    private javax.swing.JLabel jlabelUbication;
    private javax.swing.JLabel jlabelWallpaper;
    private javax.swing.JLabel jlabeldescription;
    // End of variables declaration//GEN-END:variables
}
