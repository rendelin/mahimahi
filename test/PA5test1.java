import meggy.Meggy;

class PA5test1 {
    public static void main(String[] argv) {
	while(new engine().launch()){
	    
	}
    }
}

class engine {
    int posX;
    int posY;
    int offsetX;
    int offsetY;

    public void init(int x, int y) {
	posX = x;
	posY = y;
    }

    public boolean launch() {
	if(Meggy.checkButton(Meggy.Button.Up))
	    offsetY = -1;
	if(Meggy.checkButton(Meggy.Button.Down))
	    offsetY = 1;
	if(Meggy.checkButton(Meggy.Button.Left))
	    offsetX = -1;
	if(Meggy.checkButton(Meggy.Button.Right))
	    offsetX = 1;
	this.moveAndDraw(offsetX, offsetY);
	return true;
    }
    
    public void moveAndDraw(int offsetX, int offsetY) {
	Meggy.setPixel((byte)posX, (byte)posY, Meggy.Color.DARK);
	posX = posX + offsetX;
	posY = posY + offsetY;
	Meggy.setPixel((byte)posX, (byte)posY, Meggy.Color.RED);
    }
}