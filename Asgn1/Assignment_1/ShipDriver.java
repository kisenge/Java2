/**
This class is the driver for the Ship class.

@author Kisenge Mbaga
*/

public class ShipDriver{

      public static void main(String[] args){


      Ship unsinkable = new Ship (2,5,10000);



      Container blue = new Container ("London",2000,true);
        Container red = new Container ("Cairo",1200, false);
      Container green = new Container ("Halifax", 3000, false);
      Container orange = new Container ("Vancouver", 1000, true);

      Container overWeight = new Container ("San Francisco", 6000, false);
      Container tooHazardous = new Container ("Shanghai", 2000, true);



      unsinkable.addContainer(red);
      unsinkable.addContainer(blue);
      unsinkable.addContainer(green);
      unsinkable.addContainer(orange);

      unsinkable.addContainer(overWeight);
      unsinkable.addContainer(tooHazardous);


      unsinkable.updateWeight(green,2500);

      unsinkable.removeContainer(orange);

    unsinkable.availableWeight();

     unsinkable.displayData();

      }
      }
