class Floyd_Triangle {
    public static void main(String[] args) {
        int x = 1;
        for(int i = 1; i<5; i++) {
            //int a = x;
            for (int j=1;j<=i;j++) {
                if(x<10){
                System.out.print("0" + x+" ");
                //a++;
                }
                else System.out.print(x + " ");
                x++;
            }
            
            System.out.println();
        }    
    }
}

/* Program for Floyd triangle
01 
02 03 
04 05 06 
07 08 09 10  */