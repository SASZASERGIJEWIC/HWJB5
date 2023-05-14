public class JBHW2 {
    public static void main(String[] args) {
        canBuy(true,false);
    }
    public static void canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        boolean canBuy = (isEdekaOpen || isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);

    }
}