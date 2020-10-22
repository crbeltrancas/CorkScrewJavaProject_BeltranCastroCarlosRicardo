/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart_corkscrew_homework;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.MenuSelectionManager;
import static smart_corkscrew_homework.Smart_Corkscrew_Homework.main;

/**
  *Smart Corkscrew Homework. 
 * Methodology of Programming 2
 * @author Beltran Castro Carlos Ricardo
 * Neptun code: VY6V8S
 */
class MenuElement {

    MenuElement(String main_Menu) {
    }
    MenuElement main = new MenuElement( "Main Menu" ) {
            
        main.addChild( new MenuElement( "Find my corkscrew", menu1);
        findMyCorksrew());
        main.addChild( new MenuElement( "Screw Counter", menu2);
        ScrewCounter();
        main.addChild( new MenuElement( "You Got taste", menu3);
        YougotTaste());
        main.addChild( new MenuElement( "My Corkscrew App", menu4); 
        MyCorksrewAPP());
         
         // Show the Main Menu, this will make the Main Menu as the current screen
        menulist.showMenu( main );

        public void processKeyEvent(KeyEvent event, MenuElement[] path, MenuSelectionManager manager) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void menuSelectionChanged(boolean isIncluded) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public MenuElement[] getSubElements() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Component getComponent() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        }
}
