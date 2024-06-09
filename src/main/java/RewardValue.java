public class RewardValue {
    private Double cash;
    private Integer miles;
    private final Double MILES_TO_CASH = 0.0035;

    // Assume cash is Double - based on RewardsConverter.java
    public RewardValue(Double cash) {
        this.cash = cash;
        this.miles = (int)(cash / MILES_TO_CASH);
    }

    // Assume miles is Integer - "How many miles"
    public RewardValue(Integer miles) {
        this.miles = miles;
        this.cash = miles * MILES_TO_CASH;
    }

    public Integer getMilesValue() {
        return this.miles;
    }

    public Double getCashValue() {
        return this.cash;
    }

}
