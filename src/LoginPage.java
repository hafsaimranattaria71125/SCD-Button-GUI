
import com.sun.org.apache.xalan.internal.xsltc.compiler.FlowList;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alpha
 */
public class LoginPage {
// step 1 define gui components
    JFrame fr;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    //BtnHandler hnd;
    
    public LoginPage() {
        initGUI();
     }
    
    public void initGUI()
    {
        //step 
        fr = new JFrame();
      //  hnd = new BtnHandler();
               
        //obtain layout manager and set layout
        Container c = fr.getContentPane();
        FlowLayout fl = new FlowLayout();
        
        c.setLayout(fl);
        
        //c.setLayout(new FlowLayout());
        
        //gui comp init
        btn1 = new JButton("UP");
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.setLocation(fr.getLocation().x ,fr.getLocation().y-10);
            }
        });
        btn2 = new JButton("DOWN");
        
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.setLocation(fr.getLocation().x ,fr.getLocation().y+10 );
            }
        });
        btn3 = new JButton("RIGHT");
        
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.setLocation(fr.getLocation().x +10,fr.getLocation().y );
            }
        });
        
        btn4 = new JButton("LEFT");
        
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.setLocation(fr.getLocation().x -10,fr.getLocation().y );
            }
        });
        
        //attach event handlers with compo
        // test //btn1.addActionListener(hnd);
        //add comp to container
        fr.add(btn1);
        fr.add(btn2);
        fr.add(btn3);
        fr.add(btn4);
        //dress up container
        fr.setSize(300,300);
        fr.setVisible(true);
        fr.setLocationRelativeTo(null);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    
     
}
