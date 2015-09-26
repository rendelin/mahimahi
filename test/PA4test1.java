import meggy.Meggy;

class PA4test1 {
    public static void main(String[] argv) {
	while(true) {
	    if(Meggy.checkButton(Meggy.Button.A)) {
	       	new Util().drawRed();
	    }
	    if(Meggy.checkButton(Meggy.Button.B))
		new Util().shouting(2000);
	}
    }
}

//class declaration:
class Util {
    public void drawRed() {
	Meggy.setPixel((byte)0, (byte)0, Meggy.Color.RED);
	Meggy.toneStart(Meggy.Tone.C3, 1000);
    }
	
    public void shouting(int duration) {
	Meggy.setPixel((byte)0, (byte)0, Meggy.Color.YELLOW);
	Meggy.setPixel((byte)0, (byte)1, Meggy.Color.YELLOW);
	Meggy.setPixel((byte)1, (byte)0, Meggy.Color.YELLOW);
	Meggy.setPixel((byte)1, (byte)1, Meggy.Color.YELLOW);
	Meggy.delay(500);
	Meggy.toneStart(Meggy.Tone.Cs3, duration);
    }
}