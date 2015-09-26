import meggy.Meggy;

class PA6test1 {
    public static void main(String[] argv) {
    }
}

class engine {
    Meggy.Color[] screen;

    public void init() {
	int tmp;

	tmp = 64;
	screen = new Meggy.Color[tmp];
	while(0 < tmp) {
	    tmp = tmp - 1;
	    screen[tmp] = Meggy.Color.DARK;
	}
    }
}