package sistema_POO;

import java.util.Timer;
import java.util.TimerTask;

import graphic.*;
import admins.*;

public class Main {

	public static void main(String[] args) {
		
		SINAC runSinac = new SINAC();
		MINAE runMinae = new MINAE();
		PMVS runPMVS = new PMVS();
		
		Frame ventana = new Frame();
		ventana.setVisible(true);
		
		// ------------------- Marcador de tiempo cada 2 segundos (ticks) -------------- //
		Timer timer = new Timer();
	    TimerTask tarea = new TimerTask() {
	        @Override
	        public void run() {
	        	
	        	ventana.horasExe += 1;
	        	
	            System.out.println("Se ha ejecutado un ciclo.");
	        }
	    };

	    timer.schedule(tarea, 2000, 2000);
	    
	    
		
	}
}
