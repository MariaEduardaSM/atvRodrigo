

		
		
		
		
import java.util.ArrayList;

public class Testando {


	public static void main(String[] args) {
		
		ArrayList<Caminhao> caminhoes =new ArrayList<Caminhao>();
		Caminhao c1 = new Caminhao ("GJH-2266",1982,3);
		Caminhao c2 = new Caminhao ("PLP-2020",2018,6);
		Caminhao c3 = new Caminhao ("HMT-5062",2003,4);
		Caminhao c4 = new Caminhao ("MAC-2424",2006,2);
		Caminhao c5 = new Caminhao ("LLM-7836",2005,8);
		caminhoes.add(c1);
		caminhoes.add(c2);
		caminhoes.add(c3);
		caminhoes.add(c4);
		caminhoes.add(c5);
		
		System.out.println(" caminhoes \n" + caminhoes );
		
		
		ArrayList<Onibus>bus =new ArrayList<Onibus>();
		Onibus on1 = new Onibus ("DJD-788",2005,2);
		Onibus on2 = new Onibus ("FJG-598",1964,8);
		Onibus on3 = new Onibus("FYH-5544",2003,6);
		Onibus on4 = new Onibus("BJK-1112",2016,4);
		Onibus on5 = new Onibus ("MLP-1105",2008,3);
		bus.add(on1);
		bus.add(on2);
		bus.add(on3);
		bus.add(on4);
		bus.add(on5);
		
		System.out.println(" Onibus:\n" + bus  );
		
	}

}