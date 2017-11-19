
package longpipes;


public class PipeI extends Pipe{

   
    private boolean chemResistance;
 
    
    /**
     **@param plasticGr an integer between 1 and 3 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm with maximum of 6m
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     */    
    public PipeI(int plasticGr,int len,int outerDi ,boolean chemRes){
        super(plasticGr,len,outerDi);
        chemResistance = chemRes;
        
    }
    
    /** set the boolean value of chemical resistance 
     * @param newChemRes New boolean value
     */
    public void setChemRes(boolean newChemRes){
        chemResistance =  newChemRes;
    }
    
    /**returns chemResistance
     * @return a Boolean value representing if a pipe has chemical resistance
     */
    public boolean getChemRes(){
        return chemResistance;        
    }
    
   /** Calculate the base cost of the pipe based on attributes and set attribute basicCost to the result
    * 
    * @return  a double representing the basic cost of the pipe
    */
    @Override
    public double calculateCost(){
        
        if(chemResistance == true){
            double parentCost = super.calculateCost();
            double cost = parentCost + basicCost * 0.14;
            return cost;
        }else{
            return super.calculateCost();
        }
    }
}