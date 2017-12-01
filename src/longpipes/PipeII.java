
package longpipes;

/**
 *
 * @author up806925
 */
public class PipeII extends PipeI{
    protected int colour = 1;  // the number of colours is 1
    
    /**
     **@param plasticGr an integer between 2 and 4 representing the quality of plastic 
     * @param len a double representing the length of the pipe with a maximum of 6M
     * @param outerDi a double representing the outer diameter of the pipe
     * @param chemRes a boolean value representing if the pipe has chemical resistance 

     */    
    public PipeII(int plasticGr,double len,double outerDi ,boolean chemRes){
        super(plasticGr,len,outerDi,chemRes);     
    }
    
    /**Gets the first colour of the pipe
     * @return returns an int representing the number of colours that the pipe has
     */
    public int getColour(){
        return colour;
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
