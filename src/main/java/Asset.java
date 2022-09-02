// 누군가의 자산
public class Asset {
    // 자산 총량
    private long amount;

    public long calculateInterestForDate() {
        long result = InterestCalculator.calculateInterestForDate();
        this.amount += result;
        return  result;
    }

    public long calculateFeeForDate() {
        long result = FeeCalculator.calculateFeeForDate();
        this.amount -= result;
        return  result;
    }
}
