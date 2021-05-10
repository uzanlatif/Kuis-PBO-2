package javaswings;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javaswings.Balok;

public class JavaSwings {

    public static void main(String[] args) {
       GUI g = new GUI();
    }
    
}

class GUI extends JFrame implements ActionListener{
    //layout
    JLabel lpanjang = new JLabel ("Panjang");
    JLabel llebar = new JLabel ("Lebar");
    JLabel ltinggi = new JLabel ("Tinggi");
    
    JLabel lhasilLuas = new JLabel ();
    JLabel lhasilKeliling = new JLabel ();
    JLabel lhasilVolume = new JLabel ();
    JLabel lhasilLP = new JLabel ();
    //input
    final JTextField ipanjang = new JTextField(10);
    final JTextField ilebar = new JTextField(10);
    final JTextField itinggi = new JTextField(10);
    //iki gak reti variabel e disimpen nengdi
    
    JButton bsave = new JButton("Hitung"); //button save
    JButton breset = new JButton("Reset");
    
    public GUI(){
        
        setTitle("PROGRAM BALOK");
        setSize(350,400);
        
        setLayout(null);
        add(lpanjang);
        add(ipanjang);
        
        add(ltinggi);
        add(itinggi);
        
        add(llebar);
        add(ilebar);
        add(bsave);
        add(lhasilLuas);
        add(lhasilKeliling);
        add(lhasilVolume);
        add(lhasilLP);
        
        bsave.addActionListener(this);
        
        add(breset);
        breset.addActionListener(this);
        
        //set bounds(x,y,length,hight);
        
        lpanjang.setBounds(10,10,120,20);
        ipanjang.setBounds(130,10,120,20);
        
        llebar.setBounds(10,35,120,20);
        ilebar.setBounds(130,35,120,20);
        
        ltinggi.setBounds(10,60,120,20);
        itinggi.setBounds(130,60,120,20);
        
        bsave.setBounds(30,90,120,20);
        breset.setBounds(180,90,120,20);
        
        lhasilLuas.setBounds(10,120,120,20);
        lhasilKeliling.setBounds(10,150,120,20);
        lhasilVolume.setBounds(10,180,120,20);
        lhasilLP.setBounds(10,210,120,20);
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public void actionPerformed (ActionEvent m){
    
        if(m.getSource()== bsave){
            
            if(ipanjang.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Panjang Kosong");  
            }
            else if(ilebar.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Lebar Kosong");  
            }
            else if(itinggi.getText().isEmpty()){
              JOptionPane.showMessageDialog(this, "Tinggi Kosong");  
            }
            
            else 
                try{
                int panjang = Integer.parseInt(ipanjang.getText());
            int lebar = Integer.parseInt(ilebar.getText());
            int tinggi = Integer.parseInt(itinggi.getText());
            
            Balok opo = new Balok(panjang,lebar,tinggi, panjang*lebar,2*(panjang+lebar));
            
            lhasilLuas.setText("Luas Adalah "+opo.luas);
            lhasilKeliling.setText("Keliling Adalah "+opo.keliling);
            lhasilVolume.setText("Volume Adalah "+opo.volume);
            lhasilLP.setText("Luas Permukaan "+opo.luaspermukaan);
            }
            catch(Exception err){
                JOptionPane.showMessageDialog(this, "Hanya menerima inputan integer (bilangan bulat).");
            }
            
              
        }
        
        if(m.getSource()==breset){
            ipanjang.setText("");
            ilebar.setText("");
            itinggi.setText("");
            
            lhasilLuas.setText("");
            lhasilKeliling.setText("");
            lhasilVolume.setText("");
            lhasilLP.setText("");
            
        }
}
}
