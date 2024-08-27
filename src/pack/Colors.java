package pack;

public enum Colors {
    DEFAULT("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m");

    private final String color;

    Colors(String color){
        this.color = color;
    }


    @Override
    public String toString() {
        return color;
    }

    public Colors out(Object object) {
        System.out.println(color + object);
        return this;
    }
}
