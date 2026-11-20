
                                    //Optional Code:
import java.util.Optional;

public class Day4A{
    public static void main(String[] args) {

        Optional<String> a = Optional.of("Kishore");
        Optional<String> b = Optional.ofNullable(null);
        Optional<String> c = Optional.empty();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.isPresent());
        System.out.println(b.isPresent());

        System.out.println(a.get());

        System.out.println(b.orElse("Default Name"));
    }
} 

/*Expected Output: 

Optional[Kishore]
Optional.empty
Optional.empty
true
false
Kishore
Default Name
*/
