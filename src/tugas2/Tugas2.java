/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Lab Informatika
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gui gambar = new Gui();
        
    }
    
}

class Gui extends JFrame implements ActionListener {
    JLabel judul = new JLabel("Cuboid Calculator");
    
    JLabel length = new JLabel("Length");
    JTextField tulisLength = new JTextField(10);
    
    JLabel width = new JLabel("Width");
    JTextField tulisWidth = new JTextField(10);
    
    JLabel height = new JLabel("Height");
    JTextField tulisHeight = new JTextField(10);
    
    JLabel result = new JLabel("Result :");
    JButton hitung = new JButton("Count");
    JButton reset = new JButton("Reset");
    
    JLabel hasil1 = new JLabel("");
    JLabel hasil2 = new JLabel("");
    JLabel hasil3 = new JLabel("");
    JLabel hasil4 = new JLabel("");


    
    public Gui() {
        setTitle("tes");
        
        setSize(400, 500);
        
        add(judul);
        add(length);
        add(tulisLength);
        add(width);
        add(tulisWidth);
        add(height);
        add(tulisHeight);
        add(result);
        add(hitung);
        add(reset);
        add(hasil1);
        add(hasil2);
        add(hasil3);
        add(hasil4);
        
        
        setLayout(null);
        judul.setBounds(140, 30, 100, 20);
        
        length.setBounds(40, 90, 100, 20);
        tulisLength.setBounds(140, 90, 200, 20);
        
        width.setBounds(40, 130, 100, 20);
        tulisWidth.setBounds(140, 130, 200, 20);
        
        height.setBounds(40, 170, 100, 20);
        tulisHeight.setBounds(140, 170, 200, 20);
        
        result.setBounds(140, 200, 100, 20);

        hitung.setBounds(100, 430, 90, 20);
        reset.setBounds(200, 430, 90, 20);
        
        hasil1.setBounds(40, 230, 300, 20);
        hasil2.setBounds(40, 260, 300, 20);
        hasil3.setBounds(40, 290, 300, 20);
        hasil4.setBounds(40, 320, 300, 20);
        
        setVisible(true);
        
        
        hitung.addActionListener(this);
        reset.addActionListener(this);
        
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent tes) {
        if(tes.getSource()==hitung) {
            try {
                double p = Double.parseDouble(tulisLength.getText());
                double l = Double.parseDouble(tulisWidth.getText());
                double t = Double.parseDouble(tulisHeight.getText());
                Balok balok1 = new Balok(p,l,t);
                hasil1.setText("Square Area\t: "+Double.toString(balok1.hitungLuas()));
                hasil2.setText("Square Circumference\t: "+Double.toString(balok1.hitungKeliling()));
                hasil3.setText("Cuboid Volume\t: "+Double.toString(balok1.hitungVolume()));
                hasil4.setText("Cuboid Surface Area\t: "+Double.toString(balok1.hitungLuasPermukaan()));
                
            }
            catch(NumberFormatException eror) {
                JOptionPane.showMessageDialog(null, eror.getMessage(), "message", JOptionPane.ERROR_MESSAGE);
            }
        }
        if(tes.getSource()==reset)
        {
            tulisLength.setText("");
            tulisWidth.setText("");
            tulisHeight.setText("");
            hasil1.setText("");
            hasil2.setText("");
            hasil3.setText("");
            hasil4.setText("");
        }
    }
    
}