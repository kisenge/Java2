public class Container{

      public static void main(String[] args){

      private static String containerId = 1000;
      private double containerWeight;
      private boolean hazardous;

      public Container (double containerWeightIn , boolean hazardousIn){
        containerWeight = containerWeightIn;
        hazardous = hazardousIn;
        containerId++;
      }




      public String getId(){
        return containerId;
      }

      public double getWeight(){
        return containerId;
      }

      public boolean getHazardous(){
        return hazardous;
      }


      public void changeWeight(double newWeight){
        containerWeight = newWeight;
      }


      }

}
