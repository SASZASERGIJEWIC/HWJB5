public class JBHW1 {
    public static void main(String[] args) {
        System.out.println(canWalk(true,false));
    }
    static boolean canWalk(boolean isWeekend, boolean isRain) {
        boolean canWalk = isWeekend && isRain;
        return canWalk;
    }
}
