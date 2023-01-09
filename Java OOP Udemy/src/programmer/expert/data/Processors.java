package programmer.expert.data;

public class Processors {
    public static final int PROCESSORS;

    static{
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
