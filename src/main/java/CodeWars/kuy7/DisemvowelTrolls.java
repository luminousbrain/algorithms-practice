package CodeWars.kuy7;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel(("This website is for losers LOL!"))); // "Ths wbst s fr lsrs LL!"
    }

    public static String disemvowel(String str) {
        // a, e, i, o, u
        return str.replaceAll("[aouieAOUIE]", "");
    }
}
