
package smart_corkscrew_homework;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Scanner;
import javax.swing.MenuSelectionManager;
import static jdk.internal.org.objectweb.asm.util.ASMifier.main;
import static jdk.internal.org.objectweb.asm.util.CheckClassAdapter.main;
import static smart_corkscrew_homework.Smart_Corkscrew_Homework.main;

/**
 *Smart Corkscrew Homework. 
 * Methodology of Programming 2
 * @author Beltran Castro Carlos Ricardo
 * Neptun code: VY6V8S
 * 
 * I am developing a Smart corkscrew with the following capabilities and applications: 
 * >> Finger scanner -- It is a function that helps avoid other users activate the corkscrew
 * (specially Children,underage and people with alcohol problems)
 * >> Location Service (findMysCorkscrew) -- connected to your mobile device which 
 * allows you to pin point the location of your smart corkscrew
 * >> ScrewCounter -- function that helps you count how many screws and bottles 
 * have you opened, keeps track of your alcoholic habits
 * >> YougotTaste -- function that scans the QR code of the bottle that you are about
 * to drink and gives you recommendations and advice on how to drink it
 * >> MyCorkscrewAPP -- Connects to your mobile phone through an special APP where 
 * you can find all information about usage and statistics regarding the Corkscrew
 * 
 */
public class Smart_Corkscrew_Homework { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { // This is the main class to make the Smart corksrew run
        // This is where the system for Smart CorkScrew Runs 
        MyCorkScrew(); {// This is the class that makes the basic menu run            
        }
    }

    private static void MyCorkScrew() {
        
        private static  int CountOpennings; //opening times  attributes
	private static String userName; //UserName attributes
	private static int connectTo; // connection attributes
	private static boolean fingerScanned; //state where finger has been sccaned
	private static int loginCorkScrew; //Login into Corkscrew atribbutes
	private static int power; //power atributes
        private static int autoScrew; //autimatic screw  atributes
        
        System.out.println("welcome to your CorkScrew");
        System.out.println("Please scan your finger" );
        Smart_Corkscrew_Homework();
        System.out.println("Plese Choose and option:"
                + "1.Find my Corksrew"
                + "2.Screw Counter"
                + "3.You got taste"
                + "4.MyCorkScrew APP");
        //Read the menu option
        Scanner ChooseOption = new Scanner(System.in); // user selects the option.
        
        // Access the Main Menu,
        MenuElelement();
        
    
    public static int getCountOpennings() {
		return CountOpennings;
	}

    public static String getuserName() {
		return userName;
	}    

    public static int setconnectTo() {
		return connectTo;
	}


    public static boolean getfingerScanned() {
		return fingerScanned;
	}

    public static int getloginCorkScrew() {
		return loginCorkScrew;
	}

     public static int getpower() {
		return power;
	}

     public static int setautoScrew() {
		return autoScrew;
	} 
}
    




        
       
