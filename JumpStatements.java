public class JumpStatements {
    public static void main(String[] args) {

        for (int i = 1; i<= 10; i++) {   // testing brake statement for stoping at 7
            if (i == 7) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        for (int i = 1; i<= 10; i++) {   // testing continue statement for skipping at 7
            if (i == 7) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("\n");

        int j = 1;
        while (j<11) {         // testing  statcontinue statement for printing all but 7
            if (j == 7) {
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        } 
        System.out.println("\n");

        int k = 1;
        while (k<11) {        // testing  continue statement for printing all but 7
            if (k == 7) {
                break;
            }
            System.out.println(k);
            k++;
        }
        System.out.println("\n");

        int l = 1;
        do {
            if (l==7) {
                break;
            }
            System.out.println(l);
            l++;
        } while (l<11);
        System.out.println("\n");

        int m = 1;
        do {
            if (m==7) {
                m++;
                continue;
            }
            System.out.println(m);
            m++;
        } while (m<11);
        System.out.println("\n");
    }
}