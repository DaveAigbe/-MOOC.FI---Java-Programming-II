import java.util.ArrayList;

public class ChangeHistory {
    private final ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        history.add(status);
    }

    public void clear() {
        history.clear();
    }

    public double maxValue() {
        double currentMax = this.history.get(0);

        for (double value : this.history) {
            if (value > currentMax) {
                currentMax = value;
            }
        }

        return currentMax;
    }

    public double minValue() {
        double currentMin = this.history.get(0);

        for (double value : this.history) {
            if (value < currentMin) {
                currentMin = value;
            }
        }

        return currentMin;
    }

    public double average() {
        if (!(this.history.size() == 0)) {
            double total = 0;

            for (double value : this.history) {
                total += value;
            }

            return total / this.history.size();
        }
        return 0;
    }

    public String toString() {
        return history.toString();
    }

}
