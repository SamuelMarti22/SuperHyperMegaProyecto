package backend;
public class Palabras{
    public String[][] naturaleza= new String[3][20];
    public String[][] tecnologia= new String[4][20];
    public String[][] historia= new String[3][20];
    public String[][] deporte = new String[3][20];

    public Palabras(){
        //Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para naturaleza
        naturaleza[0] = new String[]{""};
        naturaleza[1] = new String[]{"LLUVIA","FLORES","ARROYO","MONTES","PASTOS","ORILLA","SELVAS","PRADERA","MONTAÑA","TRUENOS", "GLACIAR","MANADAS","PÁJAROS"};
        naturaleza[2] = new String[]{"Hola"};

        //Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para tecnología
        tecnologia[0] = new String[]{"APP", "IOT", "CPU", "VPN", "API", "CSS", "LED","HTML","JAVA", "NODE", "RUBY","PERL", "WIFI", "CODE", "SWIFT", "MYSQL", "LINUX", "REACT", "ROBOT","MACOS"};
        tecnologia[1] = new String[]{"CODIGO","CAMARA","GADGET","TABLET","REDES","SENSOR","SCRIPT","BINARIO","CIFRADO","PIXELES","ARCHIVO","SISTEMA","TECLADO","DIGITAL","CONEXION"};
    }

}