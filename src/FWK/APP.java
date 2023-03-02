package FWK;

/**
 * AppConfiguration
 * Definicion de variables globales, constantes y configuraciones
 * para toda la aplicacion
 */
public enum APP {
    GLOBAL;
    public final  String  DB_PATH   = "DB_PATH";
    public final  String  DB_NAME   = "DB_NAME";
    private final String  EXCEPTION_UNDEFINED;
    private final String  EXCEPTION_UNDEFINED_CLASS;
    APP(){
        //Configuraciones del estado de aplicacion
        EXCEPTION_UNDEFINED_CLASS   = "Excepcion sin decripcion de clase ";
        EXCEPTION_UNDEFINED         = "Excepcion sin decripcion";
    }

    public String  getExceptionUndefined()      {   return  EXCEPTION_UNDEFINED; }
    public String  getExceptionUndefinedClass() {   return  EXCEPTION_UNDEFINED_CLASS; }
}

