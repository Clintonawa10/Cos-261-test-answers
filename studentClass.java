public class studentClass {  
    static String name = "Uma Clinton Awa";  //to input name
    static String matricNo = "2023/257048";  
    static double score = 95;  

    // Constructor  
    public void Student(String name, String matricNo, double score) {  
        studentClass.name = name;  
        studentClass.matricNo = matricNo;  
        studentClass.score = score;  
    }  

    static void displayInfo() {  
        System.out.println("Name: " + name + ", Matric No: " + matricNo + ", Score: " + score);  
    }  
    public static void main(String[] args) {
        displayInfo();
    }
}  
