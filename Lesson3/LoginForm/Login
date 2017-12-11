
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

class Login extends JFrame {
    static ArrayList<String> usersDataBase = new ArrayList<String>();

    Login() {

        setTitle("Login Form");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        new LoginForm();
        setVisible(true);
    }

    Login(String name, String pass)throws IOException {

        try (BufferedReader in = new BufferedReader(new FileReader("Users.txt"))) {
            String str;
            while ((str = in.readLine()) != null) {
                usersDataBase.add(str);
            }
        }
        String namePass = name + pass;
        if (usersDataBase.contains(namePass)) { new Calculator();}
        else { System.out.println("invalid username or password"); }
    }

    Login(String name, String pass, String pass2) throws IOException {
        String str = name + pass;
        if (pass.equals(pass2)) {
            usersDataBase.add(str);
            //for (String s : usersDataBase) { System.out.println(s); }
            try (FileWriter filewriter = new FileWriter("Users.txt")) {
                for (String s : usersDataBase) {
                    filewriter.write(s);
                    filewriter.flush();
                }
            }
        }else { System.out.println("passwords are not the same"); }
    }
}
