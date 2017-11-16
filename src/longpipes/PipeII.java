
package longpipes;


public class PipeII extends SuperPipe{
    protected String colour1;
    
    /**
     **@param plasticGr an integer between 2 and 4 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param col1 a String containing the first colour of the pipe
     */    
    public PipeII(int plasticGr,int len,int outerDi ,boolean chemRes, String col1){
        super(plasticGr,len,outerDi,chemRes);
        colour1 = col1;
        
    }
    
    /**Gets the first colour of the pipe
     * @return returns a String containing the first colour of the pipe
     */
    public String getColour1(){
        return colour1;
    }
    
    /**Set the first colour of the pipe
     * @param newColour1 A String representing the pipes first colour
     */
    public void setColour1(String newColour1){
        colour1 = newColour1;
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
