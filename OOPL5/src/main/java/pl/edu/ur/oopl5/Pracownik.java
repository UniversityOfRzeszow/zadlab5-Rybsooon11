
package pl.edu.ur.oopl5;

public class Pracownik {
    
    public String imie;      
    public String nazwisko;  
    public int wiek;
    public String stanowisko;
    
    public Pracownik(String imie, String nazwisko, int wiek, String stanowisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }
    
    public void show(){
        System.out.println("Osoba");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("wiek: " + this.wiek + " lat");
        System.out.println("Stanowisko: " + this.stanowisko);
    }
    
}
