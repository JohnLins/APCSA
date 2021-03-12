public class E118 {
 public static void main(String[] args){
     
     String data = "public class HelloPrinter { public static void main(String[] args){ System.out.println('hello'} }";
     
     for(int i = data.length()-1; i > 0; i--){
         System.out.print(data.charAt(i));
        }
    }
}