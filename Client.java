import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class Client {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new Zelda();

   }

}


class ImageService{
   public static final String[] standingImageName= {"f.png"};
   public static final String[] walkingLeftImageName= {"l_1.png","l_2.png","l_3.png","l_4.png","l_5.png","l_6.png","l_7.png","l_8.png","l_9.png","l_10.png"};
   public static final String[] walkingRightImageName= {"r_1.png","r_2.png","r_3.png","r_4.png","r_5.png","r_6.png","r_7.png","r_8.png","r_9.png","r_10.png"};
}

abstract class MovingStrategy{
   abstract public String[] getImages();
}
class StandingStrategy extends MovingStrategy{
   public String[] getImages() {
      return ImageService.standingImageName;
   }
}
class WalkingLeftStrategy extends MovingStrategy{
   public String[] getImages() {
      return ImageService.walkingLeftImageName;
   }
}
class WalkingRightStrategy extends MovingStrategy{
   public String[] getImages() {
      return ImageService.walkingRightImageName;
   }
}


class Zelda extends JFrame{
   private static final long serialVersionUID=1L;
   private Field field;
   private Controller controller;
   private MovingStrategy strategy=new StandingStrategy();
   
   private JLabel lbl;
   Point point = lbl.getLocation();
   
   int x = point.x;
   int y = point.y;
   
   public Zelda() {
      super("Zelda");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      setLayout(new BorderLayout());
      
      field=new Field();
      controller=new Controller();
      
      add(field, BorderLayout.CENTER);
      add(controller,BorderLayout.SOUTH);
      
      setSize(400,400);
      setVisible(true);

      Thread th=new Thread(field);
      th.start();
   }
   

private class Field extends JPanel implements Runnable{
   private static final long serialVersionUID=1L;
   
   
   
   
   public Field() {
      setLayout(new BorderLayout());
      lbl=new JLabel();
      lbl.setIcon(new ImageIcon("./img/"+strategy.getImages()[0]));
      add(lbl,BorderLayout.CENTER);
   }
   public void run() {
      int imageIndex=0;
      while(true) {
         String[] path=strategy.getImages();
         
         if(path.length<=imageIndex) {
            imageIndex=0;
         }
         lbl.setIcon(new ImageIcon("./img/"+path[imageIndex]));
         
         imageIndex ++;
         
         try {
            Thread.sleep(100);
         }catch(InterruptedException e) {
            System.out.println(e.getMessage());
         }
      }
   }
}
private class Controller extends JPanel implements ActionListener{
   
   private JButton btnStanding,btnWalkingLeft,btnWalkingRight;
   
   public Controller() {
      setLayout(new FlowLayout());
      
      btnStanding=new JButton("Standing");
      btnWalkingLeft=new JButton("WalkingLeft");
      btnWalkingRight=new JButton("WalkingRight");
      
      btnStanding.addActionListener(this);
      btnWalkingLeft.addActionListener(this);
      btnWalkingRight.addActionListener(this);
      
      add(btnStanding);
      add(btnWalkingLeft);
      add(btnWalkingRight);
   }
   public void actionPerformed(ActionEvent e) {
      JButton btn=(JButton)e.getSource();

      if(btn==btnStanding) {
         strategy=new StandingStrategy();
      }
      else if(btn==btnWalkingLeft) {
    	      while(true) {
    	    	 strategy =new WalkingLeftStrategy();
    	         
    	         lbl.setLocation(x-10,y);
    	        
    	         if(point.getX() < -200) {
    	       	  lbl.setLocation(x+20,y);
    	       	  break;
    	         }
    	         
    	      }
      }
      else if(btn==btnWalkingRight) {
    	  strategy =new WalkingRightStrategy();
    	  while(true) {
        	// Point point = lbl.getLocation();
             lbl.setLocation((x+10),(point.y));
             if(point.getX() > 200) {
            	 lbl.setLocation(x-20,y);
            	 break;
             }
         }
      }
   }
}

}