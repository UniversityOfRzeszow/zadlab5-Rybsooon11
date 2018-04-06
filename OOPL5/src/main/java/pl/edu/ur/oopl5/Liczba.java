
package pl.edu.ur.oopl5;

public class Liczba {
    
     public int liczba;
    
     int tab[] = new int[size(liczba)];
     
    public Liczba(int liczba){
        this.liczba = liczba;
    }
    
    public int size(int liczba) {
        int licznik = 0;
        while (liczba / 10 != 0) {
            liczba = liczba / 10;
            licznik++;
        }
        return licznik;
    }
    
    public void resolution(int liczba) {
        int licznik = 0;

        for (int i = 0; i < size(liczba); i++) {
            tab[i] = liczba % 10;
            liczba = liczba / 10;
        }

    }

    public void unsubscribe(int liczba) {
        resolution(liczba);
        for (int i = 0; i < size(liczba); i++) {
            System.out.println(tab[i]);
        }
    }
}
