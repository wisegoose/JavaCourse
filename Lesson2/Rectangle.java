
class Rectangle extends Square {
    int b;

    Rectangle() {
        System.out.println("Введите длину второй стороны");
        this.b = InputData.scanner.nextInt();
        System.out.println(toString());
        new DataBase(toString());
    }

    @Override
    public float perimeter() {
        return 2 * (a + b);
    }

    @Override
    public float area() {
        return a * b;
    }

    @Override
    public String toString(){
        String name = "Rectangle";
        return name + " perimeter:" + perimeter() + " area:" + area();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        return b == rectangle.b;
    }

    @Override
    public int hashCode() {
        return b;
    }
}
