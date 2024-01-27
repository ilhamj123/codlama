package week01;

public class task5 {
    
        public static void main(String[] args) {
            // Part a:
            int intValue = 42;
            
            // Part b: 
            System.out.println("Integer value (decimal): " + intValue);
            System.out.println("Integer value (hexadecimal): " + Integer.toHexString(intValue));
            System.out.println("Integer value (octal): " + Integer.toOctalString(intValue));
            
            // Part c: 
            float floatValue = 3.14f;
            
            // Part d: 
            System.out.println("Float value (decimal floating-point): " + floatValue);
            System.out.println("Float value (scientific notation): " + String.format("%e", floatValue));
        }
    }
    

