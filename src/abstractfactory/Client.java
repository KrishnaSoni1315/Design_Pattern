package abstractfactory;

import java.util.Scanner;

/**
 *
 * @author mca207
 */
public class Client {
    
    public static void main(String args[]){
        int i;
       Scanner in = new Scanner(System.in);
       System.out.println("1.DarkTheme");
       System.out.println("2.LightTheme");
       System.out.println("............................");
       i=in.nextInt();
       ThemeFactory tf = ThemeFactory.getTheme(i);
      
       
       iDialog d = tf.getDialogcolor();
       iToolbar t = tf.getToolbarColor();
       System.out.println(t.getToolbarColour());
       System.out.println(d.getDialogColour());
}
}