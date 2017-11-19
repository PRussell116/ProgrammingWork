
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
        SuperPipe pipe1 = new SuperPipe(1,1000,5,true);
        System.out.println(pipe1.calculateCost());

    }
    
}
