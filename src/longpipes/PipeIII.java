
package longpipes;

/**
 *
 * 
 */
public class PipeIII extends PipeII{
    protected String colour2;
    
    /**
     **@param plasticGr an integer between 2 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param col1 a String containing the first colour of the pipe
     * @param col2 a String containing the second colour of the pipe
     */  
    public PipeIII(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2){
        super(plasticGr,len,outerDi,chemRes,col1);
        colour2 = col2;
        
    }
    
    /** gets the second colour of the pipe
     * @return A String containing the second colour of the pipe
     */
    public String getColour2(){
        return colour2;
    }
    
    /**Set the second colour of the pipe
     * @param newColour2 A String representing the pipes second colour
     */
    public void setColour2(String newColour2){
        colour2 = newColour2;
    }
    
    
    
    /** Calculate the cost of the pipe2 based on the cost found by parent class and adding additional 16%
    * 
    * @return  a double representing the cost of the pipe 
    */
    @Override
    public double calculateCost(){
        double parentCost = super.calculateCost();    /// not sure if col needs to be added on top of previous
        double cost = parentCost + basicCost * 0.16;
        return cost;
    
    
    }
}
