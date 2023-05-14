public class JBHW3 {
    public static void main(String[] args) {
        System.out.println(machine(101, 99));
        System.out.println(machine(100, 100));
        System.out.println(machine(100.2, 99.2));
    }
    public static boolean machine(double temperature1, double temperature2) {
        boolean machineWork = temperature1 > 100 && temperature2 < 100;
        return machineWork;
    }
}

//- Представим, что у нас есть устройство, в котором две колбы. Прибор работает корректно, если температура первой колбы
//выше 100 градусов, а температура второй колбы меньше 100 градусов. Вы должны написать метод, который проверяет это
//устройство. Ваша программа должна иметь переменные Temperature1 и Temperature2. В результате он выводит сообщение true
//или false.