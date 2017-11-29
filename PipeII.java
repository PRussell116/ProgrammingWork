
package longpipes;


public class PipeII extends PipeI{
    protected int colour = 1;  // the number of colours is 1
    
    /**
     **@param plasticGr an integer between 2 and 4 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 

     */    
    public PipeII(int plasticGr,int len,int outerDi ,boolean chemRes){
        super(plasticGr,len,outerDi,chemRes);     
    }
    
    /**Gets the first colour of the pipe
     * @return returns a String containing the first colour of the pipe
     */
    public int getColour(){
        return colour;
    }
    
    /**Set the first colour of the pipe
     * @param newColour An integer representing the pipes first colour
     */
    public void setColour1(int newColour){
        colour = newColour;
    }
    
    
    
    /** Calculate the cost of the pipe2 based on the cost found by parent class and adding additional 12%
    * 
    * @return  a double representing the cost of the pipe 
    */
    
    @Override
    public double calculateCost(){
        double parentCost = super.calculateCost();
        double cost = parentCost + basicCost * 0.12;
        return cost;
    
    }
    
}
