package com.example.demo.utils;

public enum ProvinciasEcuador {
    AZUAY("01",""),
    BOLIVAR("02",""),
    CANAR("03","CAÑAR"),
    CARCHI("04","CARCHI"),
    COTOPAXI("05","COTOPAXI"),
    CHIMBORAZO("06","CHIMBORAZO"),
    EL_ORO("07","EL_ORO"),
    ESMERALDAS("08","ESMERALDAS"),
    GUAYAS("09","GUAYAS"),
    IMBABURA("10","IMBABURA"),
    LOJA("11","LOJA"),
    LOS_RIOS("12","LOS_RIOS"),
    MANABI("13","MANABI"),
    MORONA_SANTIAGO("14","MORONA_SANTIAGO"),
    NAPO("15","NAPO"),
    PASTAZA("16","PASTAZA"),
    PICHINCHA("17","PICHINCHA"),
    TUNGURAHUA("18","TUNGURAHUA"),
    ZAMORA_CHINCHIPE("19","ZAMORA_CHINCHIPE"),
    GALAPAGOS("20","GALAPAGOS"),
    SUCUMBIOS("21","SUCUMBIOS"),
    ORELLANA("22","ORELLANA"),
    SANTO_DOMINGO_DE_LOS_TSACHILAS("24","SANTO_DOMINGO_DE_LOS_TSACHILAS"),
    SANTA_ELENA("24","SANTA_ELENA");

    private String Codigo;
    private String Nombre;

    private ProvinciasEcuador(String codigo, String nombre){
        this.Codigo = codigo;
        this.Nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
