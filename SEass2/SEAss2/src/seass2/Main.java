/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package seass2;
import java.io.*;

/**
 *
 * @author 20312768
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
String cmd ="";

World w = new World();
Player p = new Player();
p.l = w.babblingbrook;


while(true){
           try{
    cmd = r.readLine();
           }catch(Exception e){};
    System.out.println(cmd);
    
    if(cmd.equals ("north")){
    p.gonorth();
    p.l = w.sunnyfield;
    System.out.println("you moved north to sunny field");
        }
    else if(cmd.equals ("east")){
    p.goeast();
    p.l = w.mistymountain;
    System.out.println("you moved east to misty mountain");

    }
}

}
}
