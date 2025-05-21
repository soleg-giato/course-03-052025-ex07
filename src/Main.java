public class Main {

    public static void main(String[] args) {

        Account<Integer> acc1 = new Account<>(65545, 99000);
        Account<String> acc2 = new Account<>("00PN6544FF653", 674399);
        Account<String> acc3 = new Account<>("00PN6854ACC32", 270);
        System.out.printf("acc1(Integer): %s", acc1);
        System.out.println();
        System.out.printf("acc2(String): %s", acc2);
        System.out.println();
        System.out.printf("acc3(String): %s", acc3);
        System.out.println();


        // (1) попытаемся провести транзакцию между разнотипными счетами
        System.out.println("(1) попытаемся провести транзакцию между разнотипными счетами");
        System.out.println("...здесь получим ошибку компиляции");
        //Transaction<Account<String>> trx1 = new Transaction<>(acc1, acc3, 65000);
        // здесь получим ошибку компиляции


        // (2) попытаемся провести транзакцию между однотипными счетами
        // с недостатком суммы
        System.out.println("(2) попытаемся провести транзакцию между однотипными счетами с недостатком суммы");
        Transaction<Account<String>> trx2 = new Transaction<>(acc3, acc2, 65000);
        trx2.execute();
        System.out.println();

        // (3) попытаемся провести транзакцию между однотипными счетами
        // с достаточной суммой
        System.out.println("(3) попытаемся провести транзакцию между однотипными счетами с достаточной суммой");
        Transaction<Account<String>> trx3 = new Transaction<>(acc2, acc3, 65000);
        trx3.execute();
        System.out.println();



    }

}
