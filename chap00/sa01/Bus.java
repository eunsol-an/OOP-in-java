package chap00.sa01;

public class Bus {
    // - 포함해야 할 정보
    //    1. 최대 승객수
    //    2. 현재 승객수
    //    3. 요금
    //    4. 버스 번호
    //    5. 주유량
    //    6. 현재 속도
    //    7. 상태
    //        1.  운행, 차고지 행
    // - 기능
    //    1. 운행
    //    2. 버스 상태 변경
    //    3. 승객 탑승
    //    4. 속도 변경

    public static int serialInc = 1000;

    private int maxPassenger;
    private int nowPassenger;
    private int fare;
    private int busNumber;
    private int fuel;
    private int nowSpeed;
    private String status;

    public Bus() {
        serialInc++;
        this.busNumber = serialInc;
        this.maxPassenger = 30;
        this.fuel = 100;
        this.status = "운행";
    }

    public void boardingPassengers(int personCount) {
        if (nowPassenger + personCount < maxPassenger && status.equals("운행")) {
            nowPassenger = personCount;
            fare = personCount * 1000;
        } else {
            System.out.println("탑승 인원이 초과하여 탑승하실 수 없습니다.");
        }
    }

    public void changeSpeed(int speed) {
        if (status.equals("운행") && fuel >= 10) {
            nowSpeed += speed;
        } else {
            System.out.println("경고! 현재 주유량을 확인해주세요.");
            System.out.println("현재 주유량은 " + fuel + "입니다.");
        }
    }

    public int getMaxPassenger() {
        return maxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        this.maxPassenger = maxPassenger;
    }

    public int getNowPassenger() {
        return nowPassenger;
    }

    public void setNowPassenger(int nowPassenger) {
        this.nowPassenger = nowPassenger;
    }

    public int getFare() {
        return fare;
    }

    public void setFare(int fare) {
        this.fare = fare;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel += fuel;
        if (this.fuel < 10) {
            this.status = "차고지행";
            System.out.println("경고! 현재 주유량을 확인해주세요.");
            System.out.println("현재 주유량은 " + this.fuel + "입니다.");
        }
    }

    public int getNowSpeed() {
        return nowSpeed;
    }

    public void setNowSpeed(int nowSpeed) {
        this.nowSpeed = nowSpeed;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
