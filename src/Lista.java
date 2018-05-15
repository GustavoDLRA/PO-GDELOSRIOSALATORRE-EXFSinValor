public class Lista<T> {
    Elemento<T> inicio, pivote;
    int nelementos; //Número de elementos en la lista.

    //Constructor por Default
    public Lista() {
        inicio = pivote = null;
        nelementos = 0;
    }

    //Constructor de Lista considerando el primer objeto como existente.
    public Lista(Elemento<T> objeto) {
        inicio = pivote = objeto;
        nelementos = 1;
    }

    public void insertar(Elemento<T> objeto) {
        if (nelementos == 0) {
            inicio = pivote = objeto;
        } else {
            objeto.siguiente = inicio;
            inicio = pivote = objeto;
        }
        nelementos++;
        //Si en un if, encontramos las mismas las mismas líneas de código,
        //estas se tienen que poner afuera.
    }

    //Función para recorrer la lista.
    //Desplaza el pivote y guarda en un String la información de
    //Cada uno de los objetos que recorre.
    public String recorrer() {
        String datos = "";
        pivote = inicio;
        for (int i = 0; i < nelementos; i++) {
            datos += pivote.attrG.toString();
            pivote = pivote.siguiente;
        }
        return datos;
    }

    //Función para eliminar el primer elemento de la lista.
    //Recordar que estos se marcan por el orden en el que fueron
    //Ingresados a la misma.
    public void eliminar() {
        inicio = inicio.siguiente;
        nelementos--;
        if (nelementos == 0) {
            inicio = pivote = null;
        }
    }

    public void buscar(String claves) {
        //El usuario únicamente puede ingresar un codigo para buscar
        //productos existentes en un catálogo, que se le mostrará en la consola.
        //Por lo tanto, la función buscar, únicamente comparará el input
        //del usuario con las claves de producto registradas en el catalogo.
        if (claves.equals("Manzana")) {
            Articulo c1 = new Articulo("Manzana", "Fruto rojo, amarillo o verde con semillas", "$25 k", "18/05/2018", 10);
            System.out.println(c1.toString() + "\nProducto Disponible");
        } else if (claves.equals("Leche")) {
            Articulo c1 = new Articulo("Leche", "Bebida pasteurizada que viene de las vacas", "$20 el litro", "23/05/2018", 20);
            System.out.println(c1.toString() + "\nProducto Disponible");
        }
    }
}