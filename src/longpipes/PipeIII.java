
package longpipes;

/**
 *
 * 
 */
public class PipeIII extends PipeI{
    protected int colour = 2; // the number of colours is 2
    
    /**
     **@param plasticGr an integer between 2 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     */  
    public PipeIII(int plasticGr,double len,double outerDi ,boolean chemRes){
        super(plasticGr,len,outerDi,chemRes);
        
        
    }
    
    /** gets the second colour of the pipe
     * @return A String containing the second colour of the pipe
     */
    public int getColour(){
        return colour;
    }
    
    /**Set the second colour of the pipe
     * @param newColour A integer representing the pipes second colour
     */
    public void setColour(int newColour){
        colour = newColour;
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
