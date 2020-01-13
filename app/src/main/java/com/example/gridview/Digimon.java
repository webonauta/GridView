package com.example.gridview;

public class Digimon {

    private String nombre;
    private int idDrawable;

    public Digimon(String nombre, int idDrawable){
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId(){
        return nombre.hashCode();
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public static Digimon[] ITEMS = {
            new Digimon("Agumon", R.drawable.agumon),
            new Digimon("Clockmon", R.drawable.clockmon),
            new Digimon("Demi Devimon", R.drawable.demidevimon),
            new Digimon("Elecmon", R.drawable.elecmon),
            new Digimon("Etemon", R.drawable.etemon),
            new Digimon("Garudamon", R.drawable.garudamon),
            new Digimon("Gatomon", R.drawable.gatomon),
            new Digimon("Geremon", R.drawable.geremon),
            new Digimon("Gomamon", R.drawable.gomamon),
            new Digimon("Leomon", R.drawable.leomon),
            new Digimon("Metal GreyMon", R.drawable.metalgreymon),
            new Digimon("Monzaemon", R.drawable.monzaemon),
            new Digimon("Patamon", R.drawable.patamon),
            new Digimon("Puppetmon", R.drawable.puppetmon),
            new Digimon("Tentomon", R.drawable.tentomon),

    };

    public static Digimon getItem(int id){
        for (Digimon item: ITEMS){
            if (item.getId()== id){
                return item;
            }
        }
        return null;
    }
}
