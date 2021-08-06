/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rs.stefanlezaic.zeleznice.srbije.klijent.view.component;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Stefan
 */
public class PanelRegistracija extends javax.swing.JPanel {

    /** Creates new form PanelLoginForme */
    public PanelRegistracija() {
        initComponents();
      
    }

    public JButton getBtnRegistrujSe() {
        return btnRegistrujSe;
    }

    public JLabel getLblEmailRegistracija() {
        return lblEmailRegistracija;
    }

    public JLabel getLblImeRegistracija() {
        return lblImeRegistracija;
    }

    public JLabel getLblKorisnickoImeRegistracija() {
        return lblKorisnickoImeRegistracija;
    }

    public JLabel getLblLozinakRegistracija() {
        return lblLozinakRegistracija;
    }

    public JLabel getLblPotvrdaLozinkeRegistracija() {
        return lblPotvrdaLozinkeRegistracija;
    }

    public JLabel getLblPrezimeRegistracija() {
        return lblPrezimeRegistracija;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtIme() {
        return txtIme;
    }

    public JTextField getTxtKorisnickoIme() {
        return txtKorisnickoIme;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JPasswordField getTxtPasswordPotvrda() {
        return txtPasswordPotvrda;
    }

    public JTextField getTxtPrezime() {
        return txtPrezime;
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmailRegistracija = new javax.swing.JLabel();
        lblImeRegistracija = new javax.swing.JLabel();
        lblPrezimeRegistracija = new javax.swing.JLabel();
        lblKorisnickoImeRegistracija = new javax.swing.JLabel();
        lblLozinakRegistracija = new javax.swing.JLabel();
        lblPotvrdaLozinkeRegistracija = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtIme = new javax.swing.JTextField();
        txtPrezime = new javax.swing.JTextField();
        txtKorisnickoIme = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtPasswordPotvrda = new javax.swing.JPasswordField();
        btnRegistrujSe = new javax.swing.JButton();

        setForeground(new java.awt.Color(0, 0, 0));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmailRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblEmailRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblEmailRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblEmailRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmailRegistracija.setText("Email:");
        add(lblEmailRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 60));

        lblImeRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblImeRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblImeRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblImeRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblImeRegistracija.setText("Ime:");
        add(lblImeRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 230, 60));

        lblPrezimeRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblPrezimeRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblPrezimeRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblPrezimeRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPrezimeRegistracija.setText("Prezime:");
        add(lblPrezimeRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 230, 60));

        lblKorisnickoImeRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblKorisnickoImeRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblKorisnickoImeRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblKorisnickoImeRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblKorisnickoImeRegistracija.setText("Korisnicko ime:");
        add(lblKorisnickoImeRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 230, 60));

        lblLozinakRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblLozinakRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblLozinakRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblLozinakRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLozinakRegistracija.setText("Lozinka:");
        add(lblLozinakRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 230, 60));

        lblPotvrdaLozinkeRegistracija.setBackground(new java.awt.Color(102, 102, 102));
        lblPotvrdaLozinkeRegistracija.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        lblPotvrdaLozinkeRegistracija.setForeground(new java.awt.Color(0, 0, 0));
        lblPotvrdaLozinkeRegistracija.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPotvrdaLozinkeRegistracija.setText("Potvrda loznike:");
        add(lblPotvrdaLozinkeRegistracija, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 230, 60));

        txtEmail.setBackground(new java.awt.Color(102, 102, 102));
        txtEmail.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setOpaque(false);
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 250, 60));

        txtIme.setBackground(new java.awt.Color(102, 102, 102));
        txtIme.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtIme.setForeground(new java.awt.Color(0, 0, 0));
        txtIme.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtIme.setOpaque(false);
        add(txtIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 250, 60));

        txtPrezime.setBackground(new java.awt.Color(102, 102, 102));
        txtPrezime.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtPrezime.setForeground(new java.awt.Color(0, 0, 0));
        txtPrezime.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrezime.setOpaque(false);
        add(txtPrezime, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 250, 60));

        txtKorisnickoIme.setBackground(new java.awt.Color(102, 102, 102));
        txtKorisnickoIme.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtKorisnickoIme.setForeground(new java.awt.Color(0, 0, 0));
        txtKorisnickoIme.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtKorisnickoIme.setOpaque(false);
        add(txtKorisnickoIme, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 250, 60));

        txtPassword.setBackground(new java.awt.Color(102, 102, 102));
        txtPassword.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 0));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPassword.setOpaque(false);
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 250, 60));

        txtPasswordPotvrda.setBackground(new java.awt.Color(102, 102, 102));
        txtPasswordPotvrda.setFont(new java.awt.Font("Arial Unicode MS", 1, 18)); // NOI18N
        txtPasswordPotvrda.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordPotvrda.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPasswordPotvrda.setOpaque(false);
        add(txtPasswordPotvrda, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 250, 60));

        btnRegistrujSe.setBackground(new java.awt.Color(102, 102, 102));
        btnRegistrujSe.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegistrujSe.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrujSe.setText("Registruj se");
        btnRegistrujSe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        btnRegistrujSe.setOpaque(false);
        add(btnRegistrujSe, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 250, 70));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrujSe;
    private javax.swing.JLabel lblEmailRegistracija;
    private javax.swing.JLabel lblImeRegistracija;
    private javax.swing.JLabel lblKorisnickoImeRegistracija;
    private javax.swing.JLabel lblLozinakRegistracija;
    private javax.swing.JLabel lblPotvrdaLozinkeRegistracija;
    private javax.swing.JLabel lblPrezimeRegistracija;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtKorisnickoIme;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordPotvrda;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    public void btnRegistrujSeMouseListener(MouseListener mouseListener) {
        btnRegistrujSe.addMouseListener(mouseListener);
    }

}
