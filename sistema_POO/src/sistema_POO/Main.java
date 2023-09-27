package sistema_POO;

import java.util.Timer;
import java.util.TimerTask;

import graphic.*;

public class Main {
	
    public static void main(String[] args) {
    	
    	Admin sinac = new Admin("SINAC");
    	
        Estado ventana = new Estado(sinac);
        ventana.setVisible(true);
        ventana.timerExe();
   
    }
}
