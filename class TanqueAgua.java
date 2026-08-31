class TanqueAgua{

double capacidadMaximaLitros;
double nivelActualLitros;

public TanqueAgua(double capacidadMaximaLitros, double nivelActualLitros){
    if(nivelActualLitros > capacidadMaximaLitros){
        System.out.println("El nivel actual no puede superar la capacidad máxima del tanque.");
    }
    this.capacidadMaximaLitros = capacidadMaximaLitros;
    this.nivelActualLitros = nivelActualLitros;
}

void llenar(double litros){
 this.nivelActualLitros += litros;
System.out.println("Nivel del tanque: " + this.nivelActualLitros);
System.out.println("--------------------------------------");

if(this.nivelActualLitros > this.capacidadMaximaLitros){
System.out.println("--------------------------------------");
System.out.println("Se ha alcanzado el limite del tanque");
 }

}

void consumir(double litros){
if(litros > nivelActualLitros){
    System.out.println("No se puede retirar agua. No hay suficiente agua.");
}
if(litros < nivelActualLitros){
    this.nivelActualLitros -= litros;
    System.out.println("--------------------------------------");
    System.out.println("Nivel del tanque: " + this.nivelActualLitros);
    System.out.println("--------------------------------------");
}
}
public static void main(String[] args) {
    TanqueAgua t1 = new TanqueAgua(500, 500);
    t1.consumir(100);
    t1.consumir(100);
    t1.llenar(200);
}
}
    
