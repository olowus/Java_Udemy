public class AplikasiTodoList {
    public static String[] model = new String[3];

    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        viewShowTodoList();
    }

    /**
     * Method Menampilkan TodoList
     */
    public static void showTodoList(){
        System.out.println("======= TODOLIST =======");
        for(int i=0; i< model.length; i++){
            String todo = model[i];
            int no = i+1;

            if(todo != null){
                System.out.println(no+". "+todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Belajar Java Intermediate";
        showTodoList();
    }

    /**
     * Method Menambahkan TodoList
     */
    public static void addTodoList (String todo){
        // pengecekan array penuh / tidak
        boolean isFull = true;
        for(int i=0; i< model.length; i++){
            if(model[i] == null){
                isFull = false;
                break;
            }
        }

        // jika penuh maka array akan resize 2x
        if(isFull){
            String[] temp = model;
            model = new String[model.length*2];

            for(int i=0; i< temp.length; i++){
                model[i] = temp[i];
            }
        }


        // menambahkan data ke array yg null
        for(int i=0; i< model.length; i++){
            if(model[i] == null){
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList(){
        for (int i = 0; i < 25; i++) {
            int no = i+1;
            addTodoList("Test Todo - "+no);
        }
        showTodoList();
    }

    /**
     * Method Menghapus TodoList
     */
    public static boolean removeTodoList(Integer number){
        if( (number-1) >= model.length ){
            return false;
        }else if(model[number-1] == null){
            return false;
        }else{
            for (int i = (number-1); i < model.length; i++) {
                if(i == (model.length-1)){
                    model[i] = null;
                }else{
                    model[i] = model[i+1];
                }
            }
            return true;
        }
    }

    public static void testRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(30);
        System.out.println(result);

        result = removeTodoList(5);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info){
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput(){
        String name = input("Nama");
        System.out.println("Hello "+name);

    }

    /**
     * Method untuk View TodoList
     */
    public static void viewShowTodoList(){
        while(true){
            showTodoList();

            System.out.println("======= MENU =======");
            System.out.println("1. Tambah TodoList");
            System.out.println("2. Hapus TodoList");
            System.out.println("Q. Keluar");
            System.out.println("====================");
            String pilihan = input("Pilih : ");

            if(pilihan.equals("1")){
                viewAddTodoList();
            } else if(pilihan.equals("2")){
                viewRemoveTodoList();
            } else if(pilihan.equalsIgnoreCase("q")){
                break;
            }else{
                System.out.println("Pilihan tidak dimengerti.");
            }
        }
    }

    public static void testViewShowTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        viewShowTodoList();
    }

    /**
     * Method untuk View Add TodoList
     */
    public static void viewAddTodoList(){
        System.out.println("==== MENAMBAH TODOLIST ====");
        String todo = input("Todo (x Jika Batal)");

        if(todo.equalsIgnoreCase("x")){
            // batal
        }else{
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("TEST");
        showTodoList();

        viewAddTodoList();
        showTodoList();
    }

    /**
     * Method untuk View Remove TodoList
     */
    public static void viewRemoveTodoList(){
        System.out.println("==== MENGHAPUS TODOLIST ====");

        String number = input("Nomor yang dihapus (x Jika Batal)");

        if(number.equalsIgnoreCase("x")){
            // batal
        }else{
            boolean success = removeTodoList(Integer.valueOf(number));
            if(!success){
                System.out.println("Gagal menghapus TodoList : "+number);
            }
        }
    }

    public static void testViewRemoveTodoList(){
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}
