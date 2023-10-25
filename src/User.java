public class User extends Thread{


    private LibraryManager libMan;


    public User(LibraryManager libMan) {
        this.libMan = libMan;
    }


    public void run(){


        for(int i=0;i<20;i++){
            int num1 = (int) (Math.random() * 5) + 1;

            int num2 = (int) (Math.random() * 2) + 1;


            if(num2 == 1){
                libMan.takeBook(num1);
            }
            else{
                libMan.returnBook(num1);
            }


        }


    }




}
