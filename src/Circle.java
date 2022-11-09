public class Circle {
   public double radius;
   public Circle(){
      radius = 1.0;
   }

   public Circle(double newRadius){
      radius = newRadius;
   }
   public double computeArea(){
      return Math.PI*radius*radius;
   }
}
