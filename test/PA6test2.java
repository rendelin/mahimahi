import meggy.Meggy;

class PA6test2 {
    public static void main(String[] argv) {
	new Engine().init();
    }
}

class Engine {
    Meggy.Color[] screen;
    int x;
    int y;
    
    public void init() {
	int tmp;

	tmp = 64;
	screen = new Meggy.Color[tmp];
	while(0 < tmp) {
	    tmp = tmp - 1;
	    screen[tmp] = Meggy.Color.DARK;
	}
	Meggy.setAuxLEDs(0);
	x = 3;
	y = 3;	
	while(true){
	    this.run();
	}
    }

    public void run() {
	if(Meggy.checkButton(Meggy.Button.A)) {
	    this.reset();
	}
	if(Meggy.checkButton(Meggy.Button.Up)) {
	    if(y < 7) y = y + 1;
	}
	if(Meggy.checkButton(Meggy.Button.Left)) {
	    if(0 < x) x = x - 1;
	}
	if(Meggy.checkButton(Meggy.Button.Down)) {
	    if(0 < y) y = y - 1;
	}
	if(Meggy.checkButton(Meggy.Button.Right)) {
	    if(x < 7) x = x + 1;
	}
	this.draw();
    }

    public void reset() {
	x = 3;
	y = 3;
    }

    public void draw() {
	Meggy.setPixel((byte)x, (byte)y, Meggy.Color.RED);
    }
}