package backend;

public class Palabras {
    public String[][] naturaleza = new String[3][20];
    public String[][] tecnologia = new String[3][20];
    public String[][] historia = new String[3][20];
    public String[][] deporte = new String[3][20];

    public Palabras() {
        // Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para naturaleza
        naturaleza[0] = new String[] { "RIO", "MAR", "SOL", "AVE", "SER", "LUZ", "ATP", "FLOR", "LUNA", "NUBE", "HOJA","AIRE", "LAGO", "DUNA", "CIELO", "ARBOL", "CORAL", "VALLE", "CUEVA", "CAÑON" };
        naturaleza[1] = new String[] { "LLUVIA", "FLORES", "ARROYO", "MONTES", "PASTOS", "ORILLA", "SELVAS", "PRADERA","MONTAÑA", "TRUENOS", "GLACIAR", "MANADAS", "PAJAROS", "ENERGIA", "BIOSFERA", "ORGÁNICO", "PETRÓLEO","BACTERIA", "DESIERTO", "INSECTOS" };
        naturaleza[2] = new String[] { "CHAPARRÓN", "ATMÓSFERA", "CLIMÁTICO", "EMISIONES", "EXTINCIÓN", "MARSUPIAL","MIGRACIÓN", "ACANTILADO", "ANTICICLÓN", "DEPREDADOR", "PEDÚNCULOS", "HIPOTÁLAMO", "FRAMESTONE","MICROSCOPIO", "COMBUSTIBLE", "PESTICIDAS", "CAPARAZONES", "BIOQUÍMICOS", "GENOTÍPICOS","VOLCARENITA" };

        // Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para historia
        historia[0] = new String[] { "PAZ", "MAL", "ERA", "HOZ", "LUZ", "LEY", "FIN", "EDAD", "EJES", "DIOS", "ARTE","LIRA", "NAZI", "ROMA", "ACTOR", "FEUDO", "NOBEL", "PODER", "VALOR", "CAZAR" };
        historia[1] = new String[] { "GUERRA", "ESTADO", "SOCIAL", "SOVIET", "ATAQUE", "HUMANO", "CASTAS", "IMPERIO","BATALLA", "TRATADO", "COLONIA", "ELEGIAS", "PARTIDO", "SISTEMA", "IMPERIO", "BATALLA", "TRATADO","COLONIA", "ELEGIAS", "PARTIDO" };
        historia[2] = new String[] { "REPÚBLICA", "CONQUISTA", "MONARQUÍA", "VERSALLES", "HISTÓRICO", "BIOGRAFÍA","DICTADURA", "ANTIGÜEDAD", "REVOLUCIÓN", "DEMOCRACIA", "FEUDALISMO", "INDUSTRIAL", "HOLOCAUSTO","MODERNIDAD", "CONFERENCIA", "ILUSTRACIÓN", "AUTOCRÁTICO", "TOTALITARIO", "PROVISIONAL","OLIGARQUÍAS" };

        // Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para tecnología
        tecnologia[0] = new String[] { "APP", "IOT", "CPU", "VPN", "API", "CSS", "LED", "HTML", "JAVA", "NODE", "RUBY","PERL", "WIFI", "CODE", "SWIFT", "MYSQL", "LINUX", "REACT", "ROBOT", "MACOS" };
        tecnologia[1] = new String[] { "CODIGO", "CAMARA", "GADGET", "TABLET", "REDES", "SENSOR", "SCRIPT", "BINARIO","CIFRADO", "PIXELES", "ARCHIVO", "SISTEMA", "TECLADO", "DIGITAL", "CONEXION", "ROBOTICA", "DESCARGA","BUSQUEDA", "PROGRAMA", "INTERNET" };
        tecnologia[2] = new String[] { "IMPRESORA", "ANTIVIRUS", "SITIOSWEB", "STREAMING", "BLUETOOTH", "ALGORITMO","REDSOCIAL", "PROCESADOR", "APLICACION", "SMARTWATCH", "TECNOLOGIA", "INNOVACION", "SMARTPHONE","PLATAFORMA", "MEMORIASRAM", "INFORMATICA", "ELECTRONICA", "COMPUTACION", "COMPUTADORA","CIBERNETICA" };

        // Definir palabras de acuerdo a cada nivel, siendo 0 fácil 2 Dificil para tecnología
        deporte[0] = new String[] { "OUT", "BOX", "JAB", "DAN", "SET", "TIE","BMX","SURF","BALL","GOLF", "JUDO","SPIN", "TEAM","VELA","MATCH","RUGBY","BOXEO","TENIS","ESQUI","BILLAR"};
        deporte[1] = new String[] {"FUTBOL","TENNIS","KARATE","HOCKEY","LEADER","INDOOR","JUNIOR","SOFTBOL","BEISBOL","PARKOUR","ESGRIMA","CRIQUET","AMATEUR","INVICTO","CICLISMO","VOLEIBOL","ARQUERIA","GIMNASIA","PATINAJE","TRIATLON"};
        deporte[2] = new String[] {"ATLETISMO", "GIMNASTAS","ESCALADAS","PARAPENTE","APLINISMO","BADMINTON","OLIMPIADA","EQUITACION","SENDERISMO","BALONCESTO","INCUARTATA","CROCHETAGE","PELOTAZALE","BALONVOLEA","WAKESKATING","WAKESURFING","MOTOCICLISMO","SPORTSWOMAN","DESMARCARSE","RECORDWOMAN"};
    }

}