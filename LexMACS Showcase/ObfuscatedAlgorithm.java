import java.util.Scanner;

public class ObfuscatedAlgorithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Answer:
        //int a = 593;
        //int b = 59384839;
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(handler(a, b));
        s.close();
    }

    public static int helper(int def3) {
        def3 += 3;
        def3 *= 123;
        def3 -= 231;
        def3 = helperhelper(def3);
        return def3;
    }

    public static int helperhelper(int def__) {
        def__ += 439;
        def__ += 1 + 349 + 3428 - 2324 + 329 - 32;
        return def__;
    }

    public static boolean handler(int a, int b) {
        a *= 815;
        a = helper(a);
        if (a - b - (62774 - 3029 + 30000 + 2000 + 30 + 9 - 2000 - 30 - 30000 - 9 + 3029) == 0) {
            return true;
        }
        return false;
    }
}

/*
a = 593 #int(input())
b = 59384839 #int(input())

def f1(a, b):
    a *= 815
    def def2(def3):
        def3+=3
        def3 *= 123
        def3 -= 231
        def def_(def__):
            def__+=439
            def__+=1+349+3428-2324+329-32
            return def__
        def3 = def_(def3)
        return def3
    a= def2(a)
    if a - b - (62774 - 3029 + 30000 + 2000 + 30 + 9 - 2000 - 30 - 30000 - 9 + 3029) == 0:
        return True
    return False

print(f1(a, b))
*/