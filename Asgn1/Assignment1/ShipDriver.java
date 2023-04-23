public class ShipDriver{

      public static void main(String[] args){


      Ship unsinkable = new Ship (2,5,10 000);


      Container red = new Container (Cairo,1200, no);
      Container blue = new Container (London,2000,yes);
      Container green = new Container (Halifax, 3000, no);
      Container orange = new Container (Vancouver, 1000, yes);

      Container overWeight = new Container (San Francisco, 6000, no);
      Container tooHazardous = new Container (Shanghai, 2000, yes);


      red.addContainer();
      blue.addContainer();
      green.addContainer();
      orange.addContainer();
      overWeight.addContainer();
      tooHazardous.addContainer();


      updateWeight(green,2500);

      removeContainer(orange);

      unsinkable.availableWeight();

      unsinkable.displayData();

      }
      }
