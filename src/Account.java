import java.util.Objects;

public class Account<T> implements Accountable<T>{

    private final T id;
    private int amount;

    public Account(T id, int amount) {
        this.id = id;
        this.amount = amount;
    }


    @Override
    public T getId() {
        return id;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public void setAmount(int sum) {
        this.amount = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account<?> account = (Account<?>) o;
        return amount == account.amount && Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount);
    }
}
