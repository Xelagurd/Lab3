package lab3;

import java.io.Serializable;

public class FlData implements Serializable {

    /*г. Создаем Java объекты для хранения данных — простые объекты реализующие интерфейс Serializable */
    private int departApId;
    private int arrivalApId;
    private boolean delayed;
    private boolean canceled;
    private double delay;

    public FlData(String flData) throws NumberFormatException {
        String[] splitData = flData.split(",");
    }

    public int getDepartApId() {
        return departApId;
    }

    public int getArrivalApId() {
        return arrivalApId;
    }

    public double getDelay() {
        return delay;
    }

    public int getCanceled() {
        return canceled ? 1 : 0;
    }

    public int getDelayed() {
        return delayed ? 1 : 0;
    }
}