class Main {
  public static void main(String[] args) {
    
    Complejo c=new Complejo();
    Complejo c1= new Complejo();
    c.leer();
    c1.leer();
    System.out.println("Suma: ");
    c.suma(c1).imprimir();
    System.out.println("Resta: ");
    c.resta(c1).imprimir();
    System.out.println("Multiplicacion: ");
    c.multiplicacion (c1).imprimir();
    System.out.println("Division: ");
    c.division (c1).imprimir();
    System.out.println("Norma: ");
    c.norma().imprimir();
    c1.norma().imprimir();
    System.out.println("Conjugado: ");
    c.conjugado().imprimir();
    c1.conjugado().imprimir();
    
  }
}