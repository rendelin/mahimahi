import meggy.Meggy;

class PA3test1 {
    public static void main(String[] argv) {
	while(true) {
	    if(Meggy.checkButton(Meggy.Button.A)) {
		Meggy.setPixel((byte)1, (byte)1, Meggy.Color.RED);
	    }
	    if(Meggy.checkButton(Meggy.Button.Up)) {
		Meggy.setPixel((byte)1, (byte)0, Meggy.Color.RED);
	    }
	    if(Meggy.checkButton(Meggy.Button.Down)) {
		Meggy.setPixel((byte)1, (byte)2, Meggy.Color.RED);
	    }
	    if(Meggy.checkButton(Meggy.Button.Left)) {
		Meggy.setPixel((byte)0, (byte)1, Meggy.Color.RED);
	    }
	    if(Meggy.checkButton(Meggy.Button.Right)) {
		Meggy.setPixel((byte)2, (byte)1, Meggy.Color.RED);
	    }

	    if(Meggy.getPixel((byte)1, (byte)1) == Meggy.Color.RED && Meggy.getPixel((byte)1, (byte)0) == Meggy.Color.RED)
		Meggy.setPixel((byte)4, (byte)4, Meggy.Color.YELLOW);
	    else
		Meggy.setPixel((byte)4, (byte)4, Meggy.Color.ORANGE);

	}
    }
}