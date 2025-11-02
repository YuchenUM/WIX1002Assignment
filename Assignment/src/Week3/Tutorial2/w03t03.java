/*Correct the error for the following statements. 
a. System.Println("Java Programming"); 
b. System.in.println("Introduction to Java!") 
c. System.out.println("\t is the horizontal tab character"); 
d. system.out.println("Java is case sensitive!" ); */

package Week3.Tutorial2;

public class w03t03 {
    public static void main(String[] args) {
        //a. add [.out] and use lowercase in [println]
        System.out.println("Java Programming");
        //b. add [;] change [in] to [out]
        System.out.println("Introduction to Java!");
        //c. no error?
        System.out.println("\t is the horizontal tab character");
        //d. use uppercase in [System]
        System.out.println("Java is case sensitive!" );
    }
}
