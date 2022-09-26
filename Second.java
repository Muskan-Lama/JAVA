import java.util.*;
class Second {
    public static void main(String args[]) {

        Scanner x = new Scanner(System.in);
        System.out.println("ENTER INPUT");
        List<String> userData = new ArrayList<>();
        while (true) {
            String s = x.nextLine();
            if (s.equals("XDONE")) {
                break;
            }
                userData.add(s);}
        System.out.println(userData);
    }}



