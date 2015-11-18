package ahstutoring;

import java.applet.Applet;
import java.awt.Graphics;

/**
 * @author benji
 */
public class AHSTutoring extends Applet{
    @Override
         public void paint(Graphics g) {
             g.drawString("Hello applet!", 50, 25);
         }
         public static void main(String[] args){
             AHSTutoring test = new AHSTutoring();
             test.start();
         }
         // test
}