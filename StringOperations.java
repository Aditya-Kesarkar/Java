class StringOperations {
    public static void main(String[] args) {
        System.out.println("String Operations!");
        String str1 = "KodNest Tech";
        String str2 = "Tech";
        
        System.out.println(str1.toUpperCase()); // KODNEST TECH
        System.out.println(str1.toLowerCase()); // kodnest tech
        System.out.println(str1.charAt(4)); // e
        System.out.println(str1.indexOf('e')); // 4
        System.out.println(str1.lastIndexOf('e')); // 9
        System.out.println(str1.contains("n")); // false 
        System.out.println(str1.contains("Nest")); // true
        System.out.println(str1.endsWith("Tech")); // true
        System.out.println(str1.endsWith("tech")); // false
        System.out.println(str1.endsWith("kod")); // false
        System.out.println(str1.substring(4)); // est Tech
        System.out.println(str1.substring(4,9)); // est T
        System.out.println(str1.isEmpty()); // false
        System.out.println(str1.length()); // 12
        System.out.println(str1.replace("N", "T")); // KodTest Tech
        System.out.println(str1.equals("Tech")); // false
    }
}