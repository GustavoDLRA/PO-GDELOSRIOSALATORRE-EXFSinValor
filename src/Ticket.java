import java.util.Scanner;

public class Ticket<T> {
    Elemento<T> inicio, pivote;
    int cantElementos;

    public Ticket(){
        inicio=pivote=null;
        cantElementos=0;
    }
    public Ticket(Elemento<T> objeto, int cantElementos){
        this.cantElementos=cantElementos;
        inicio=pivote=objeto;
    }
    public void comprarAlgo( String claves, int cantElementos){
        Articulo manzana = new Articulo(10);
        Articulo leche = new Articulo(20);
        Articulo Pasta = new Articulo(10);
        int originalManzana= manzana.getCantidad();
        int originalLeche = leche.getCantidad();
        int originalPasta = Pasta.getCantidad();
        int totalManzanas=0;
        int totalLeche=0;
        int totalPasta=0;
        int totalTotal;

        if (claves.equals("Manzana")&&cantElementos<manzana.getCantidad()){
            System.out.println("¿Cuantos kilos de manzana desea comprar?\n ");
            Scanner cuantaMan = new Scanner(System.in);
            int manzanasCompradas = cuantaMan.nextInt();
            System.out.println("Manzanas Compradas: "+manzanasCompradas);
            int manzRestantes = originalManzana-manzanasCompradas;
            totalManzanas=manzanasCompradas*25;
            System.out.println("Total Gastado en manzanas: "+totalManzanas);
            System.out.println("Manzanas restantes en inventario: "+manzRestantes);

        }
        else if (claves.equals("Leche" )&& cantElementos<leche.getCantidad()){
            System.out.println("¿Cuantos litros de leche desea comprar?\n");
            Scanner cuantaLec = new Scanner(System.in);
            int LecCompradas= cuantaLec.nextInt();
            System.out.println("Litros de leche comprados: "+LecCompradas);
            int LecRestantes=originalLeche-LecCompradas;
            totalLeche+=LecCompradas*20;
            System.out.println("Total Gastado en Leche: "+totalLeche);
            System.out.println("Litros restantes en inventario: "+LecRestantes);
        }
        else if (claves.equals("Pasta" )&&cantElementos<Pasta.getCantidad()){
            System.out.println("¿Cuantos paquetes de pasta quiere comprar?\n");
            Scanner cuantaPast = new Scanner(System.in);
            int PastCompradas=cuantaPast.nextInt();
            System.out.println("Empaques de pasta comprados: "+PastCompradas);
            int PastRestantes=originalPasta-PastCompradas;
            totalPasta=PastCompradas*10;
            System.out.println("Total Gastado en Pasta: "+totalPasta);
            System.out.println("Paquetes restantes en el inventario: "+PastRestantes);

        }else{
            System.out.println("Producto fuera de inventario o No Registrado. Intente de nuevo");
        }
        totalTotal=totalManzanas+totalLeche+totalPasta;
        System.out.println("\n*TICKET DE COMPRA*\n");
        System.out.println("Total Final Gastado: "+totalTotal);

    }
}