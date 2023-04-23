/**
This class represents a Container.

@author Kisenge Mbaga
*/

public class Container{


      private int containerWeight;
      private boolean hazardous;
      private String portName;
      private static int containerId = 1000;




      /**
      This method constructs a Ship.
      @param portNameIn the port city of departure.
      @param containerWeightIn the containers weight in kg.
      @param hazardousIn the maximun weight allowed on the ship .
      */

      public Container (String portNameIn, int containerWeightIn , boolean hazardousIn){

        portName = portNameIn;
        containerWeight = containerWeightIn;
        hazardous = hazardousIn;
        containerId++;

      }



      /**
      This method returns the Id.
      @return the container's Id.
      */
      public int getId(){
        return containerId;
      }

      /**
      This method returns the port city of departure.
      @return the port city of departure.
      */
      public String getPort(){
        return portName;
      }

      /**
      This method returns the container's weight.
      @return the container's weight.
      */
      public int getWeight(){
        return containerWeight;
      }


      /**
      This method returns whether a container is hazardous.
      @return whether a container is hazardous.
      */
      public boolean getHazardous(){
        return hazardous;
      }


      /**
      This method changes a container's weight.
      @param newWeight the new weight of the container .
      */
      public int setWeight(int newWeight){
        containerWeight = newWeight;
        return newWeight;
      }



}
