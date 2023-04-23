public class Ship{



      private int maxHazardous;
      private int maxTotalContainter;
      private double maxWeight;
      private Container [] containerList;
      private int containerNumCurrent;
      private int weightCurrent;
      private int hazardousCurrent;

      public Ship (int maxHazardousIn , boolean maxTotalIn, double maxWeightIn){
        maxHazardous = maxHazardousIn;
        maxTotalContainter = maxTotalIn;
        maxWeight = maxWeightIn;
      }




      public boolean addContainer(Container containerNew){

        if (containerNumCurrent < containerList.length){ //if not full

          if (this.getHazardous()){ //Hazard checker.
            hazardousCurrent++;
          }

          for ( int i=0; i < containerList.length-1 ; i++){
  				if ( containerId!=containerList[i].getId()) && ( (weightCurrent + this.getWeight()) < maxWeight)){
  					System.out.print("This container is now listed.")
            containerNumCurrent++;
            weightCurrent = weightCurrent + this.getWeight();
             return true;
  				}
        }

        }


        else(){
          return false;
        }

      }


      public boolean removeContainer(Container containerRemove){


        for ( int i=0; i < containerList.length-1 ; i++){

        if (this.getId().equals(containerList[i])){

          if (this.getHazardous()){ //Hazard checker.
            hazardousCurrent--;
          }

          containerNumCurrent--;

          weightCurrent -= this.getWeight();

          return true;
        }
      }


        public boolean updateWeight(Container containerUpdate,int weightNew){

          for ( int i=0; i < containerList.length-1 ; i++){

          if (this.getId().equals(containerList[i]) && if ((weightCurrent + weightNew)< maxWeight){
            weightCurrent = containerUpdate.setWeight(weightNew);
            }

            return true;
          }

          else(){
            return false;
          }

        }

        public String displayData(){
            for ( int i=0; i < containerList.length-1 ; i++){
              System.out.print (containerList[i].getId() +"\t");
              System.out.print (containerList[i].getPort() +"\t");
              System.out.print (containerList[i].getWeight() + ".00kg"+ "\t");
              System.out.print (containerList[i].getHazardous() + "\t");
              System.out.print ("Total Weight: "weightCurrent + " .00kg");
        }


        public String availableWeight(){
          int availableSpace = maxWeight - weightCurrent;
          System.out.print("You have " + availableSpace + ".00kg of available weight.";
        }


      }
