import meggy.Meggy;

class PA5test3 {
    public static void main(String[] argv) {
	while(new engine().launch()){
	    
	}
    }
}

class engine {
    int posX;
    int posY;
    int htX;
    int htY;
    int offsetX;
    int offsetY;

    public void init(int x, int y) {
	posX = x;
	posY = y;
	htX = 0;
	htY = 0;
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
	if(this.collision()) 
	    Meggy.setPixel((byte)posX, (byte)posY, Meggy.Color.RED);
	this.hunterMoveAndDraw();
	//if caught by hunter:
	if(htX == posX && htY == posY)
	    Meggy.toneStart(Meggy.Tone.E3, 3000);
    }

    public boolean collision() {
	boolean ret;

	if(!(0 < posX && posX < 8)) {
	    Meggy.toneStart(Meggy.Tone.C3, 3000);
	    ret = false;
	}
	if(!(0 < posY && posY < 8)) {
	    Meggy.toneStart(Meggy.Tone.D3, 3000);
	    ret = false;
	}
	ret = true;
	return ret;
    }
    
    public void hunterMoveAndDraw() {
	Meggy.setPixel((byte)htX, (byte)htY, Meggy.Color.DARK);	
	if(htX < posX)
	    htX = htX + 1;
	else htX = htX - 1;
	if(htY < posY)
	    htY = htY + 1;
	else htY = htY - 1;
	Meggy.setPixel((byte)htX, (byte)htY, Meggy.Color.BLUE);	
    }
}