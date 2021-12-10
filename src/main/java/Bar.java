import java.util.ArrayList;
import java.util.List;

public abstract class Bar implements BarObserver{
    private boolean happyhour;
    private List<BarObserver> observers;

    Bar(){
        observers = new ArrayList<>();
    }

    public boolean isHappyHour() {return happyhour;};
    public void startHappyHour() {
        happyhour = true;
        notifyObservers();
    }
    public void endHappyHour()   {
        happyhour = false;
        notifyObservers();
    };

    public void addObserver(BarObserver observer) {
        observers.add(observer);
    }
    public void removeObserver(BarObserver observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        for (BarObserver observer : observers)
            if (isHappyHour()) observer.happyHourStarted(this);
            else observer.happyHourEnded(this);
    }
}
