public class ForEach {
    public static void main(String[] args) {

        String[] name = {
                "Eren", "Jaeger",
                "Attack", "On", "Titan"
        };

        //Tanpa For Each
        for(int i=0; i< name.length; i++){
            System.out.println(name[i]);
        }
        System.out.println("=======FOR EACH=======");
        //Dengan For Each
        for(String nama : name){
            System.out.println(nama);
        }
    }
}
