
package longpipes;

/** Main class
 *
 * 
 */
public class LongPipes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PipeIII pipe2 = new PipeIII(1,1000,50,false);
        System.out.println(pipe2.calculateCost());
        
        
        
        
        PipeI  pipe1 = new PipeI(1,10,10,true);
        System.out.println(pipe1.calculateCost());

    }
    
}
