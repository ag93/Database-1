/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;
import java.sql.*;

/**
 *
 * @author anike
 */
public class Interface2 extends javax.swing.JFrame {

    /**
     * Creates new form Interface2
     */
    public Interface2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ip_student_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ip_fname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ip_lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ip_startsem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ip_startyear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ip_supervisorid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ip_student_type = new javax.swing.JTextField();
        btn_insert = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gta_section_id = new javax.swing.JTextField();
        gta_monthlypay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gra_funding = new javax.swing.JTextField();
        gra_monthlypay = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        ss_type = new javax.swing.JTextField();
        ss_source = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_result = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Student ID :");

        jLabel2.setText("First Name :");

        jLabel3.setText("Last Name :");

        jLabel4.setText("Start Sem :");

        jLabel5.setText("Start Year :");

        ip_startyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_startyearActionPerformed(evt);
            }
        });

        jLabel6.setText("Supervisor ID:");

        jLabel7.setText("Student Type :");

        ip_student_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ip_student_typeActionPerformed(evt);
            }
        });

        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        jLabel8.setText("GTA");

        jLabel9.setText("Section ID");

        jLabel10.setText("Monthly Pay");

        jLabel11.setText("GRA");

        gta_section_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gta_section_idActionPerformed(evt);
            }
        });

        jLabel12.setText("Funding ID");

        jLabel13.setText("Monthly Pay");

        gra_funding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gra_fundingActionPerformed(evt);
            }
        });

        jLabel14.setText("Scholarship Support");

        ss_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ss_typeActionPerformed(evt);
            }
        });

        jLabel15.setText("Type");

        jLabel16.setText("Source");

        jLabel18.setText("Status:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_insert)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(7, 7, 7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ip_student_type, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(ip_student_id, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ip_fname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ip_lname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ip_startsem, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ip_startyear, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ip_supervisorid, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gta_monthlypay, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(gta_section_id))))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(8, 8, 8)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(gra_monthlypay)
                                    .addComponent(gra_funding, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ss_source)
                                    .addComponent(ss_type, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(144, 144, 144)
                                .addComponent(jLabel14))))
                    .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ip_student_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addComponent(gta_section_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(ip_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10)
                                .addComponent(gta_monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(gra_funding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(gra_monthlypay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ss_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ss_source, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(ip_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ip_startsem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ip_startyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(ip_supervisorid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ip_student_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_insert))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_result, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ip_startyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_startyearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_startyearActionPerformed

    private void ip_student_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ip_student_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ip_student_typeActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        // TODO add your handling code here:
        
        String student_type = ip_student_type.getText();
        String fname = ip_fname.getText();
        String lname = ip_lname.getText();
        String student_id = ip_student_id.getText();
        String startsem = ip_startsem.getText();
        int startyear = Integer.parseInt(ip_startyear.getText());
        String supervisor_id = ip_supervisorid.getText();
        
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/doctoral", "root", "password");
            
            switch(student_type)
            {
                case "GTA":
                    String gta_section = gta_section_id.getText();
                    int gta_pay = Integer.parseInt(gta_monthlypay.getText());
                    PreparedStatement s = conn.prepareStatement("insert into phd_student (StudentId, FName, LName, StSem, StYear, Supervisor) values (?,?,?,?,?,?);");
                    s.setString(1, student_id);
                    s.setString(2, fname);
                    s.setString(3, lname);
                    s.setString(4, startsem);
                    s.setInt(5, startyear);
                    s.setString(6, supervisor_id);
                    
                    s.executeUpdate();
                    
                    PreparedStatement s1 = conn.prepareStatement("insert into studentgta (SectionId, MonthlyPay, StudentId) values (?,?,?);");
                    s1.setString(1, gta_section);
                    s1.setInt(2, gta_pay);
                    s1.setString(3, student_id);
                    
                    s1.executeUpdate();
                    
                    //select * from studentgta join phd_student on studentgta.StudentId = phd_student.StudentId where phd_student.StudentId = 'AG5046';
                    PreparedStatement s2 = conn.prepareStatement("select * from studentgta join phd_student on studentgta.StudentId = phd_student.StudentId where phd_student.StudentId = ?;");
                    s2.setString(1, student_id);
                    ResultSet rs = s2.executeQuery();
                    while(rs.next()){
                        String FName = rs.getString(5);
                        String LName = rs.getString(6);
                        String secId = rs.getString(1);
                        String pay = rs.getString(2);
                        lbl_result.setText(FName+" "+LName+" "+ secId+" "+pay);
                        }
                        break;
                    
                case "GRA":
                    String gra_funds = gra_funding.getText();
                    int gra_pay = Integer.parseInt(gra_monthlypay.getText());
                    PreparedStatement s3 = conn.prepareStatement("insert into phd_student (StudentId, FName, LName, StSem, StYear, Supervisor) values (?,?,?,?,?,?);");
                    s3.setString(1, student_id);
                    s3.setString(2, fname);
                    s3.setString(3, lname);
                    s3.setString(4, startsem);
                    s3.setInt(5, startyear);
                    s3.setString(6, supervisor_id);
                    
                    s3.executeUpdate();
                    
                    PreparedStatement s4 = conn.prepareStatement("insert into studentgra (StudentId, Funding, MonthlyPay) values (?,?,?);");
                    s4.setString(1, student_id);
                    s4.setString(2, gra_funds);
                    s4.setInt(3, gra_pay);
                    
                    s4.executeUpdate();
                    
                    PreparedStatement s5 = conn.prepareStatement("select * from studentgra join phd_student on studentgra.StudentId = phd_student.StudentId where phd_student.StudentId = ?;");
                    s5.setString(1, student_id);
                    ResultSet rs2 = s5.executeQuery();
                    while(rs2.next()){
                        String FName = rs2.getString(5);
                        String LName = rs2.getString(6);
                        String fding = rs2.getString(2);
                        String pay = rs2.getString(3);
                        lbl_result.setText(FName+" "+LName+" "+ fding+" "+pay);                                                              
                    }
                    break;
                
                case "Scholarship":
                    
                    String scholar_type = ss_type.getText();
                    String scholar_source = ss_source.getText();
                    
                    PreparedStatement s6 = conn.prepareStatement("insert into phd_student (StudentId, FName, LName, StSem, StYear, Supervisor) values (?,?,?,?,?,?);");
                    s6.setString(1, student_id);
                    s6.setString(2, fname);
                    s6.setString(3, lname);
                    s6.setString(4, startsem);
                    s6.setInt(5, startyear);
                    s6.setString(6, supervisor_id);
                    
                    s6.executeUpdate();
                    
                    PreparedStatement s7 = conn.prepareStatement("insert into studentgra (StudentId, ScholarshipType, Source) values (?,?,?);");
                    s7.setString(1, student_id);
                    s7.setString(2, scholar_type);
                    s7.setString(3, scholar_source);
                    
                    s7.executeUpdate();
                    
                    PreparedStatement s8 = conn.prepareStatement("select * from studentscholarshipsupport join phd_student on studentscholarshipsupport.StudentId = phd_student.StudentId where phd_student.StudentId = ?;");
                    s8.setString(1, student_id);
                    ResultSet rs3 = s8.executeQuery();
                    while(rs3.next()){
                        String FName = rs3.getString(5);
                        String LName = rs3.getString(6);
                        String sch_type = rs3.getString(2);
                        String sch_src = rs3.getString(3);
                        lbl_result.setText(FName+" "+LName+" "+ sch_type+" "+sch_src);                                                              
                    }
                    break;
                
                case "Self":
                    PreparedStatement s9 = conn.prepareStatement("insert into phd_student (StudentId, FName, LName, StSem, StYear, Supervisor) values (?,?,?,?,?,?);");
                    s9.setString(1, student_id);
                    s9.setString(2, fname);
                    s9.setString(3, lname);
                    s9.setString(4, startsem);
                    s9.setInt(5, startyear);
                    s9.setString(6, supervisor_id);
                    
                    s9.executeUpdate();
                    
                    PreparedStatement s10 = conn.prepareStatement("insert into studentselfsupport (StudentId) values (?);");
                    s10.setString(1, student_id);
        
                    s10.executeUpdate();
                    
                    PreparedStatement s11 = conn.prepareStatement("select * from studentscholarshipsupport join phd_student on studentscholarshipsupport.StudentId = phd_student.StudentId where phd_student.StudentId = ?;");
                    s11.setString(1, student_id);
                    ResultSet rs4 = s11.executeQuery();
                    while(rs4.next()){
                        String FName = rs4.getString(3);
                        String LName = rs4.getString(4);
                        String Sid = rs4.getString(2);
                        lbl_result.setText(FName+" "+LName+" "+ Sid);                                                              
                    }
                    break;
                default:
                    System.out.println("Invalid Student Type");
                    lbl_result.setText("Invalid Student Type");
            }
        }
        catch(Exception e){
            e.printStackTrace();
            lbl_result.setText(e.toString());
        }
        
    }//GEN-LAST:event_btn_insertActionPerformed

    private void gta_section_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gta_section_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gta_section_idActionPerformed

    private void gra_fundingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gra_fundingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gra_fundingActionPerformed

    private void ss_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ss_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ss_typeActionPerformed

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
            java.util.logging.Logger.getLogger(Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_insert;
    private javax.swing.JTextField gra_funding;
    private javax.swing.JTextField gra_monthlypay;
    private javax.swing.JTextField gta_monthlypay;
    private javax.swing.JTextField gta_section_id;
    private javax.swing.JTextField ip_fname;
    private javax.swing.JTextField ip_lname;
    private javax.swing.JTextField ip_startsem;
    private javax.swing.JTextField ip_startyear;
    private javax.swing.JTextField ip_student_id;
    private javax.swing.JTextField ip_student_type;
    private javax.swing.JTextField ip_supervisorid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_result;
    private javax.swing.JTextField ss_source;
    private javax.swing.JTextField ss_type;
    // End of variables declaration//GEN-END:variables
}
