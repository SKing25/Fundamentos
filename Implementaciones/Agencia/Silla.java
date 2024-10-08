package Agencia;

public class Silla {
   private char letra;
   private int numero;
   private Pasajero pasajero;

   public Silla(char letra, int numero, Pasajero pasajero) {
      this.letra = 'A';
      this.numero = numero;
      this.pasajero = pasajero;
   }

   public char getLetra() {
      return this.letra;
   }

   public void setLetra(char letra) {
      this.letra = letra;
   }

   public int getNumero() {
      return this.numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   public Pasajero getPasajero() {
      return this.pasajero;
   }

   public void setPasajero(Pasajero pasajero) {
      this.pasajero = pasajero;
   }

   public String toString() {
      char var10000 = this.letra;
      return "Silla " + var10000 + " numero " + this.numero + " pasajero " + String.valueOf(this.pasajero);
   }
}
