import meggy.Meggy;

class PA3test2 {
    public static void main(String[] argv) {
	while(true) {
	    if(Meggy.checkButton(Meggy.Button.A)) {
		if(!false && (4 - 12 == 0))
		    Meggy.setPixel((byte)1, (byte)1, Meggy.Color.RED);
	    } else
		if(((byte)1)*((byte)5) == 3+2)
		    Meggy.setPixel((byte)1, (byte)1, Meggy.Color.YELLOW);		    
	}
    }
}