import meggy.Meggy;

class PA6test3 {
    public static void main(String[] argv) {
        new Engine().init();
    }
}

class Engine {
    Meggy.Color[] screen;
    int x;
    int prev_x;
    int y;
    int prev_y;

    public void init() {
        int tmp;

        screen = new Meggy.Color[64];
        tmp = screen.length;
        while(0 < tmp) {
            tmp = tmp - 1;
            screen[tmp] = Meggy.Color.RED;
        }
        Meggy.setAuxLEDs(0);
        x = 3;
        y = 3;  
        while(true){
            this.run();
        }
    }

    public void run() {
	Meggy.Button A;
	Meggy.Button B;
	Meggy.Button Up;
	Meggy.Button Left;
	Meggy.Button Down;
	Meggy.Button Right;

	A = Meggy.Button.A;
	B = Meggy.Button.B;
	Up = Meggy.Button.Up;
	Left = Meggy.Button.Left;
	Down = Meggy.Button.Down;
	Right = Meggy.Button.Right;
        if(Meggy.checkButton(A)) {
            this.reset();
        }
        if(Meggy.checkButton(Up)) {
            if(y < 7) y = y + 1;
        }
        if(Meggy.checkButton(Left)) {
            if(0 < x) x = x - 1;
        }
        if(Meggy.checkButton(Down)) {
            if(0 < y) y = y - 1;
        }
        if(Meggy.checkButton(Right)) {
            if(x < 7) x = x + 1;
        }
        this.draw();
    }

    public void reset() {
        x = 3;
        y = 3;
    }

    public void draw() {
	Meggy.setPixel((byte)prev_x, (byte)prev_y, Meggy.Color.DARK);
	Meggy.setPixel((byte)x, (byte)y, Meggy.Color.RED);
    }
    
    
}