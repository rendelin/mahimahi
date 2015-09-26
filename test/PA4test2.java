import meggy.Meggy;

class PA4test2 {
    public static void main(String[] argv) {
	while(new engine().launch()){
	    
	}
    }
}

class engine {
    public boolean launch() {
	if(Meggy.checkButton(Meggy.Button.A)) {
	    this.drawRed();
	}
	if(Meggy.checkButton(Meggy.Button.B))
	    this.shouting(2000);
	if(Meggy.checkButton(Meggy.Button.B) && Meggy.checkButton(Meggy.Button.Up))
	    Meggy.toneStart(this.getATone(), 2000);
	return true;
    }

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

    public Meggy.Tone getATone() {
	return Meggy.Tone.D3;
    }
}