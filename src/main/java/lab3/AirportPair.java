package lab3;

import java.io.Serializable;

public class AirportPair implements Serializable {
    /*г. Создаем Java объекты для хранения данных — простые объекты реализующие интерфейс Serializable */
    private int allFl;
    private int canceledFl;
    private int delayedFl;
    private double maxDelay;

    public AirportPair(int allFl, int canceledFl, int delayedFl, double maxDelay) {
        this.allFl = allFl;
        this.canceledFl = canceledFl;
        this.delayedFl = delayedFl;
        this.maxDelay = maxDelay;
    }
}