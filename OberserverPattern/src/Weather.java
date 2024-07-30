public interface Weather {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
