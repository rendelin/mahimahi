import meggy.Meggy;

class PA4test3 {
    public static void main(String[] argv) {
	while(new engine().launch()){
	    
	}
    }
}

class engine {
    public boolean launch() {
	if(Meggy.checkButton(Meggy.Button.B) && Meggy.checkButton(Meggy.Button.Up))
	    this.recursive(3, 3);
	return true;
    }

    public int recursive(int x, int y) {
	if(0 < x) {
	    this.recursive(x - 1, y); 
	    if(x < 7) {
		this.recursive(x + 1, y); 
		if(0 < y) {
		    this.recursive(x, y - 1); 
		    if(y < 7)
			this.recursive(x, y + 1); 
		}
	    }
	}
	Meggy.delay(500);
	Meggy.setPixel((byte)x, (byte)y, Meggy.Color.RED);
	return 0;
    }
}