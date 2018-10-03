/*
 * The program should display the width, length, and area all on separate lines.
 * Jessica Qiao
 * September 19th,2018
 */

package area.of.arectangle;

/**
 *
 * @author shqia0005
 */
public class AreaOfArectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double width = 4.8;
        double length = 5.7;
        double area = 0.0;
        
        // algorithm for area calc
        area = width * length;
        System.out.println("the width is " + width);
        System.out.println("the length is " + length);
        System.out.println("the area is " + area);
        
    }
    
}
