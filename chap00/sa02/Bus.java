package chap00.sa02;

public class Bus extends PublicTransport{
    public Bus() {
        this.maxPassenger = 30;
        this.status = "운행";
        this.fare = 1000;
    }

    @Override
    public void boardingPassengers(int personCount) {
        super.boardingPassengers(personCount);
    }
}
