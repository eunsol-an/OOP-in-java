package chap00.sa02;

public class BusExample {
    public static void main(String[] args) {
        // 버스 2대 생성
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        System.out.println("-------------------------------------");

        // 버스 번호 다른지 확인
        System.out.println("bus1의 버스번호: " + bus1.serialNo);
        System.out.println("bus2의 버스번호: " + bus2.serialNo);
        System.out.println("-------------------------------------");

        // 승객 2명 탑승
        bus1.boardingPassengers(2);
        System.out.println("탑승 승객 수: " + bus1.nowPassenger);
        System.out.println("잔여 승객 수: " + (bus1.maxPassenger - bus1.nowPassenger));
        System.out.println("요금 확인: " + bus1.fare * bus1.nowPassenger);
        System.out.println("-------------------------------------");

        // 버스 주유량 -50
        bus1.setFuel(-50);
        System.out.println("버스 주유량: " + bus1.fuel);
        System.out.println("-------------------------------------");

        // 버스 상태 변경
        bus1.status = "차고지행";
        System.out.println("버스 상태: " + bus1.status);
        System.out.println("-------------------------------------");

        // 버스 주유량 +10
        bus1.setFuel(10);
        System.out.println("버스 주유량: " + bus1.fuel);
        System.out.println("버스 상태: " + bus1.status);
        System.out.println("-------------------------------------");

        // 버스 상태 변경
        bus1.status = "운행";

        // 승객 45명 탑승 -> 인원 초과
        bus1.boardingPassengers(45);
        System.out.println("-------------------------------------");

        // 승객 5명 탑승
        bus1.boardingPassengers(5);
        System.out.println("탑승 승객 수: " + bus1.nowPassenger);
        System.out.println("잔여 승객 수: " + (bus1.maxPassenger - bus1.nowPassenger));
        System.out.println("요금 확인: " + bus1.fare * bus1.nowPassenger);
        System.out.println("-------------------------------------");

        // 버스 주유량 -55
        bus1.setFuel(-55);
        System.out.println("버스 주유량: " + bus1.fuel);
        System.out.println("버스 상태: " + bus1.status);
    }
}
