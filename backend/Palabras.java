package backend;
public class Palabras{
    public static String[][] naturaleza= new String[3][1];
    public static String[][] tecnologia= new String[3][20];
    public static String[][] historia= new String[3][20];
    public static String[][] deporte = new String[3][20];

    public Palabras(){
        //Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para naturaleza
        naturaleza[0] = new String[]{""};
        naturaleza[1] = new String[]{"LLUVIA","FLORES","ARROYO","MONTES","PASTOS","ORILLA","SELVAS","PRADERA","MONTAÑA","TRUENOS", "GLACIAR","MANADAS","PÁJAROS"};
        naturaleza[2] = new String[]{"Hola"};

        //Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para tecnología
        tecnologia[0] = new String[]{"App", "IoT", "CPU", "VPN", "API", "FTP", "LED","HTML", "CSS", "PHP", "JAVA", "NODE", "RUBY","PERL","Python", "Swift", "MySQL", "Linux", "React", "Mongo"};
    }

}