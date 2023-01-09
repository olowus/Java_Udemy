public class SwitchStatement {
    public static void main(String[] args) {

        String nilai = "C";

        // switch normal
        switch (nilai){
            case "A":
                System.out.println("Wow Anda lulus dengan sangat baik");
                break;
            case "B":
            case "C":
                System.out.println("Anda lulus dengan baik");
                break;
            case "D":
                System.out.println("Anda tidak lulus");
                break;
            default:
                System.out.println("Mungkin Anda salah jurusan");
                break;
        }

        // switch lambda => hanya berlaku di Java 14
        System.out.println("=======SWITCH LAMBDA=======");
        switch (nilai){
            case "A" -> System.out.println("Wow Anda lulus dengan sangat baik");
            case "B","C"-> System.out.println("Anda lulus dengan baik");
            case "D"-> System.out.println("Anda tidak lulus");
            default -> System.out.println("Mungkin Anda salah jurusan");
        }

        // kata kunci yield => hanya berlaku di Java 14
        System.out.println("=======YIELD=======");
        String ucapan = switch (nilai){
            case "A" : yield "Wow Anda lulus dengan sangat baik";
            case "B","C" : yield "Anda lulus dengan baik";
            case "D" : yield "Anda tidak lulus";
            default : yield "Mungkin Anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
