package transport;
import road.Road;
import water.Water;
import air.Air;

public class Transport {
	public void transportForm() {
		System.out.println("Fill the transport form");
	}
		public static void main (String[]args) {
			Transport t = new Transport();
			Road r = new Road();
			Air a = new Air();
			Water w = new Water();
			
			t.transportForm();r.bike();r.cycle();r.bus();r.car();a.aeroPlane();a.heliCopter();
			w.ship();w.boat();
			
		}
			
			
		}


