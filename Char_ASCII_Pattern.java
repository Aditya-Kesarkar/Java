public class Char_ASCII_Pattern {
    public static void main(String[] args) {
    char ch = 'A';
    for(int i = 1; i < 6; i++) {
        for (int j=1;j<6;j++) {
            System.out.print(ch + "" + (int)ch + " ");
            ch++;
        }
        System.out.println();
    }
}
}
    
    
    /*  for character & ASCII pattern
    A65 B66 C67 D68 E69 
    F70 G71 H72 I73 J74 
    K75 L76 M77 N78 O79 
    P80 Q81 R82 S83 T84 
    U85 V86 W87 X88 Y89  */
