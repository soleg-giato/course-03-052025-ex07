public class Transaction <T extends Account<String>>{

    private final T from;
    private final T to;
    private final int amount;

    Transaction(T from, T to, int amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute(){

        if (from.getAmount() > amount) {
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);
            System.out.printf("Operation complete \nAccount %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getAmount(), to.getId(), to.getAmount());
        }
        else {
            System.out.printf("Operation is invalid. Insufficent funds in the account %s",
                    from.getId());
        }
    }
}
