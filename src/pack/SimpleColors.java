package pack;

public enum SimpleColors {
    RED (250, 0,0){
        //класс
        //Анонімний внутрішній класс, що наслідуєтсься від класу
        // конструктора (SinpleColors)

        @Override
        public String toString(){
        return "RED " + red(); //геттер
        }

        @Override
        public void out() {
            System.out.printf ("red: %d, green %d, blue %d%n",
            red(), green(), blue());
        }
    }
    ,
    GREEN (0,250,0),
    BLUE (0,0,250);
    //
    private int number;
    //
    private int red;
    private int green;
    private int blue;

    SimpleColors(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    {

    }

    SimpleColors() {
    }

    SimpleColors(int number) {
        this.number = number;
    }

    public int number() {
        return number;
    }

    public int red() {
        return red;
    }

    public int green() {
        return green;

    }
    public int blue() {
        return blue;
    }

    @Override
    public String toString() {
        return "SimpleColors{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }

   // public abstract void out();

    public void out(){

    };
}
