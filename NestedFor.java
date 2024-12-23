public class NestedFor {
    public static void main(String[] args) {
        
        for ( int i=1; i<6; i++) 
        {
            for ( int j=1; j<4; j++) 
            {
                for ( int k=1; k<5; k++) 
                {
                    System.out.println("i:" + i + " j:" + j + " k:" + k);
                } 
                System.out.println("\n");
            }
        }

        System.out.println("\n" + "Now with jump statements:");

        for ( int i=1; i <= 4; i++) 
        {
            if(i==3) {
                break;
            }

            for ( int j=1; j<5; j++) 
            {
                if(j == 3) {
                   // j++;
                    continue;
                }
                
                for ( int k=1; k<5; k++) 
                {
                    System.out.println("i:" + i + " j:" + j + " k:" + k);
                } 
                System.out.println("\n");
            }
        }

        System.out.println("\n" + "Now with jump statements with while in between:");

        for ( int i=1; i < 4; i++) 
        {
            if(i==3) {
                break;
            }

            //for ( int j=1; j<5; j++) 
            int j = 1;
            do {
                if(j == 3) {
                    j++;             // *** when using while or do-while loop increment should be done before continue
                    continue;
                }

                // while (j < 5) {
                //     if (j == 3) {
                //         j ++;
                //         continue;
                //     }

                //     for ( int k=1; k<5; k++) 
                // {
                //     System.out.println("i:" + i + " j:" + j + " k:" + k);
                // } 
                // j++;
                // System.out.println("\n");
                // }
                
                for ( int k=1; k<5; k++) 
                {
                    System.out.println("i:" + i + " j:" + j + " k:" + k);
                } 
                j++;
                System.out.println("\n");
            } while (j < 5);
        }

    }
}