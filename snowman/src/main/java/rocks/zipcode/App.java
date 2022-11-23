package rocks.zipcode;

public class App 
{
    public static void main( String[] args )
    {
        String input = "(print (multiply 8 (divide 4 (mod 3 2))))";
        
        Compiler compiler = new Compiler();

        System.out.println(";; Input code: "+input);

        String output = compiler.compile(input);

        System.out.println(output);
        
    }
}