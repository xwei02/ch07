public class CircleA {
    public double radius;
    private  int i;
    public CircleA(){radius=1.0;}
    public CircleA(double newRadius){radius=newRadius;}
    public  double computeArea(){return Math.PI*radius*radius; }

    public void setVar(){
        i = 100; //局部類型整數
        int j = 200;
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public void outputVar(){
        System.out.println(i);
    }
}
