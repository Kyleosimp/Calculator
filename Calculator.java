package Calculator;

public class Calculator {
    private double x;
    private double y;

    public Calculator(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double Add(){
        double sum = this.x + this.y;
        return sum;
    }
    public double Subtract(){
        double difference = this.x - this. y;
        return difference;
    }
    public double Multiply(){
        double product = this.x * this.y;
        return product;
    }
    public double Divide(){
        double quotient = this.x / this.y;
        return quotient;
    }
    public double square(){
        double xsquared = this.x * this.x;
        return xsquared;
    }
    public double squareRoot(){
        double xsquarerooted = Math.sqrt(this.x);
        return xsquarerooted;
    }
    public double exponents(){
        double xpowy = Math.pow(this.x, this.y);
        return xpowy;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
