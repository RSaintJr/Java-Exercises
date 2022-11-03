package Exec2;

public class Animal {

    private boolean carnivoro;
    private boolean herbivoro;
    private boolean onivoro;

    public boolean isCarnivoro() {
        return carnivoro;
    }

    public void setCarnivoro(boolean carnivoro) {
        this.carnivoro = carnivoro;
    }

    public boolean isHerbivoro() {
        return herbivoro;
    }

    public void setHerbivoro(boolean herbivoro) {
        this.herbivoro = herbivoro;
    }

    public boolean isOnivoro() {
        return onivoro;
    }

    public void setOnivoro(boolean onivoro) {
        this.onivoro = onivoro;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("carnivoro = ").append(carnivoro);
        sb.append(", herbivoro = ").append(herbivoro);
        sb.append(", onivoro = ").append(onivoro);
        sb.append('}');
        return sb.toString();
    }
}
