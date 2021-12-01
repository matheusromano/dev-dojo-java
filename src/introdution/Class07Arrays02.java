package introdution;

public class Class07Arrays02 {
    public static void main(String[] args) {
        //byte, short, double, float, long, int = 0
        // char '\u0000' ''
        // boolean = false
        // string = null
        String[] names = new String[10];
        names[0] = "Goku";
        names[1] = "Vegeta";
        names[2] = "Majin Boo";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);

        }

    }

}
