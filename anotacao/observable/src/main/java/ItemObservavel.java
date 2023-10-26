public interface ItemObservavel {
    public void addObserver(Interessado interessado);
    public void removeObserver(Interessado interessado);
    public void notifyObservers();
}

