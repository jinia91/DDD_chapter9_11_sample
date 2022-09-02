import entry.Entry;

import java.util.List;

public class Account {
    private long balance;
    private List<Entry> entries;

    public long getBalance() {
        // 캐싱된 balance의 검증후 계산이 필요할경우
        long sumBalance = entries.stream()
                .mapToLong(Entry::getAmount)
                .sum();
        this.balance = sumBalance;
        return sumBalance;
    }
}
