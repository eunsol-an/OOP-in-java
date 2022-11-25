package chap00.sa02;

public class PublicTransport {
    public static int serialInc = 1000;

    public int serialNo;
    public int fuel;
    public int nowSpeed;
    public int maxPassenger;
    public int nowPassenger;
    public int fare;
    public String status;

    public PublicTransport() {
        serialInc++;
        this.serialNo = serialInc;
        this.fuel = 100;
        this.nowSpeed = 0;
    }

    public void boardingPassengers(int personCount) {
        if (this.nowPassenger + personCount < this.maxPassenger && this.status.equals("운행")) {
            this.nowPassenger = personCount;
        } else {
            System.out.println("탑승 인원이 초과하여 탑승하실 수 없습니다.");
        }
    }

    public void changeSpeed(int speed) {
        if (fuel >= 10) {
            nowSpeed += speed;
        } else {
            System.out.println("경고! 현재 주유량을 확인해주세요.");
            System.out.println("현재 주유량은 " + fuel + "입니다.");
        }
    }

    public void setFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) {
            this.status = "차고지행";
            System.out.println("경고! 현재 주유량을 확인해주세요.");
            System.out.println("현재 주유량은 " + this.fuel + "입니다.");
        }
    }
}
