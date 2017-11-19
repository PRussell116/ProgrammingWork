
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
        PipeI pipe1 = new PipeI(1,1000,5,false);
        System.out.println(pipe1.calculateCost());

    }
    
}
