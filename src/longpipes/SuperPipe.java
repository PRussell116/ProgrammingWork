
package longpipes;


public class SuperPipe {

    
    protected int plasticGrade,length,outerDiameter;
    protected double innerDiameter, basicCost;
    private boolean chemRes;
    private double costPerMM;
    
    /**
     **@param plasticGr an integer between 1 and 3 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm with maximum of 6m
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     */    
    public SuperPipe(int plasticGr,int len,int outerDi ,boolean chemRes ){
        plasticGrade = plasticGr;
        length = len; // need to convert from inch to mm
        outerDiameter = outerDi;
        innerDiameter = (float) (outerDi * 0.9); //calculates inner diameter of pipe 
        
        // determine costPerMM based on plastic grade
        switch (plasticGrade) {
            case 1:
                costPerMM = 0.4/25.4;   // 1 inch = 0.4
                break;
            case 2:
                costPerMM = 0.6/25.4;   // 1 inch = 0.6
                break;
            case 3:
                costPerMM = 0.75/25.4;   // 1 inch = 0.75
                break;
            case 4:
                costPerMM = 0.8/25.4;   // 1 inch = 0.8
                break;
            default:
                costPerMM = 0.95/25.4;   // 1 inch = 0.95
                break;
        }
        
    };
    
    /** Gets the length of the pipe
     * @return A integer representing the length of the pipe in mm
     */
    public int getLength(){
        return length;
    } 
    
    /** Gets the outer diameter of the pipe
     * @return an integer representing the outer diameter of the pipe in mm
     */
    public int getOuterDiameter(){
        return outerDiameter;
    }
    
    /** Set the pipes length
     * @param newLeng An integer representing the pipes new length in mm
     */
    public void setLength(int newLeng){
        length = newLeng;
    }
    
    /**Set the pipes outer diameter
     * @param newDia An integer representing the pipes new diameter in mm
     */
    public void setOuterDiameter(int newDia){
        outerDiameter = newDia;
    }
   
    
   /** Calculate the base cost of the pipe based on attributes and set attribute basicCost to the result
    * 
    * @return  a double representing the basic cost of the pipe
    */
  public double calculateCost(){
      Double innerVolume = Math.pow((innerDiameter/2),2) * Math.PI * length;  
      Double outerVolume = Math.pow((outerDiameter/2),2) * Math.PI * length;
      Double pipeVolume = outerVolume - innerVolume;
      
      basicCost = pipeVolume * costPerMM;
      
      // add 14% if it needs chemical resistance
      if(chemRes == true){
          basicCost += basicCost * 0.14;
      }
      return basicCost;
  }
}