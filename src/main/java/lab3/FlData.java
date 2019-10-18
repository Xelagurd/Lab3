package lab3;

import java.io.Serializable;

public class FlData implements Serializable {

    /*г. Создаем Java объекты для хранения данных — простые объекты реализующие интерфейс Serializable */
    private int departApId;
    private int arrivalApId;
    private boolean delayed;
    private boolean canceled;
    private double delay;
    
    public int getDepartApId() {
        return departApId;
    }

    public int getArrivalApId() {
        return arrivalApId;
    }
}