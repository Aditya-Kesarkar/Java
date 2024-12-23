public class num_pattern {
        public static void main(String[] args) {
            for(int i = 1; i<6; i++) {
                //int x = 1;
                for (int j = 1; j <=5;j++) {
                    if(i*j < 10) {
                    System.out.print("0"+i*j+" ");
                    }
                    else {
                        System.out.print(i*j+" ");
                    }
                }
                System.out.println();
            }    
        }
    }
