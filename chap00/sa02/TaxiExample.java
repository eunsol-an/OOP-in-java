package chap00.sa02;

public class TaxiExample {
    public static void main(String[] args) {
        // 택시 2대 생성
        Taxi taxi1 = new Taxi();
        Taxi taxi2 = new Taxi();
        System.out.println("-------------------------------------");

        // 택시 번호 다른지 확인
        System.out.println("taxi1의 택시번호: " + taxi1.serialNo);
        System.out.println("taxi2의 택시번호: " + taxi2.serialNo);
        System.out.println("운행 가능 여부: " + taxi1.drive());
        System.out.println("-------------------------------------");

        // 승객 2명 탑승
        taxi1.boardingPassengers(2);
        taxi1.destination = "서울역";
        taxi1.distance = 2;
        System.out.println("탑승 승객 수: " + taxi1.nowPassenger);
        System.out.println("잔여 승객 수: " + (taxi1.maxPassenger - taxi1.nowPassenger));
        System.out.println("기본 요금 확인: " + taxi1.fare);
        System.out.println("목적지: " + taxi1.destination);
        System.out.println("목적지까지 거리: " + taxi1.distance + "km");
        System.out.println("지불할 요금: " + taxi1.calcFare());
        System.out.println("상태: " + taxi1.status);
        System.out.println("-------------------------------------");

        // 택시 주유량 -80
        taxi1.setFuel(-80);

        // 택시 요금 결제
        taxi1.payfor();
        System.out.println("택시 주유량: " + taxi1.fuel);
        System.out.println("누적 요금: " + taxi1.calcFare());
        System.out.println("-------------------------------------");

        // 승객 5명 탑승
        taxi1.boardingPassengers(5);

        // 승객 3명 탑승
        taxi1.boardingPassengers(3);
        taxi1.destination = "구로디지털단지역";
        taxi1.distance = 12;
        System.out.println("탑승 승객 수: " + taxi1.nowPassenger);
        System.out.println("잔여 승객 수: " + (taxi1.maxPassenger - taxi1.nowPassenger));
        System.out.println("기본 요금 확인: " + taxi1.fare);
        System.out.println("목적지: " + taxi1.destination);
        System.out.println("목적지까지 거리: " + taxi1.distance + "km");
        System.out.println("지불할 요금: " + taxi1.calcFare());
        System.out.println("상태: " + taxi1.status);
        System.out.println("-------------------------------------");

        // 택시 주유량 -20
        taxi1.setFuel(-20);
        System.out.println("택시 주유량: " + taxi1.fuel);
        System.out.println("상태: " + taxi1.drive());
        System.out.println("누적 요금: " + taxi1.payfor());

    }
}
