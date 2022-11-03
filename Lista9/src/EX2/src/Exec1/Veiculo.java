package Exec1;

public class Veiculo {

    private boolean motor;

    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Veiculo{");
        sb.append("motor =").append(motor);
        sb.append('}');
        return sb.toString();
    }
}
