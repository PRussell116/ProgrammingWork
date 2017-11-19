/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Oliver
 */
public class Pipe {
    protected int plasticGrade,length,outerDiameter;
    protected double innerDiameter, basicCost;
    protected double costPerMM;
    
    public Pipe(int plasticGr,int len,int outerDi){
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
    }
    
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
      
        return basicCost;
  }
    
        

    
    
    
    
    
    

    
}
