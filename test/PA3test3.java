import meggy.Meggy;

class PA3test3 {
    public static void main(String[] argv) {
	while(true) {
	    if(Meggy.checkButton(Meggy.Button.B)){
		Meggy.delay(100);
	    }
	    if(Meggy.checkButton(Meggy.Button.A))
		Meggy.setPixel((byte)1, (byte)1, Meggy.Color.RED);
	    Meggy.setPixel((byte)1, (byte)1, Meggy.Color.YELLOW);
	}
    }
}