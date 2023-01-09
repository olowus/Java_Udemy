public class TipeDataBukanPrimitif {
    public static void main(String[] args) {

        Integer iniInteger = 100;
        Long iniLong = 1000000L;

        Byte iniByte = null;
        System.out.println(iniByte);

        iniByte = 100;
        System.out.println(iniByte);

        int iniInt = 100;
        Integer iniObjectInteger = iniInt;
        int iniIntDariObject = iniObjectInteger;

        short iniShort = iniObjectInteger.shortValue();
        long iniLong2 = iniObjectInteger.longValue();
        float iniFloat = iniObjectInteger.floatValue();
    }
}
