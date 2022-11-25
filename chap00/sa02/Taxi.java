package chap00.sa02;

public class Taxi extends PublicTransport{
    public String destination; // 목적지
    public int distance; // 목적지까지의 거리
    public int defaultDistance; // 기본 거리
    public int ratePerStreet; // 거리당 요금
    public int moneyBox; // 돈통

    public Taxi() {
        this.maxPassenger = 4;
        this.fare = 3000;
        this.ratePerStreet = 1000;
        this.defaultDistance = 1;
        this.status = "일반";
    }

    public String drive() {
        return (fuel > 10 ? "일반" : "운행불가");
    }

    @Override
    public void boardingPassengers(int personCount) {
        if (personCount < this.maxPassenger && this.status.equals("일반")) {
            this.nowPassenger = personCount;
            this.status = "운행중";
        } else if(personCount > this.maxPassenger) {
            this.nowPassenger = 0;
            System.out.println("최대 승객 수를 초과했습니다.");
        } else {
            System.out.println("탑승 불가합니다.");
            this.status = "운행불가";
        }
    }

    public int calcFare() {
        return this.fare + ((this.distance - this.defaultDistance) * this.ratePerStreet);
    }

    public int payfor() {
        this.moneyBox += calcFare();
        this.nowPassenger = 0;
        this.status = "일반";
        return moneyBox;
    }
}
