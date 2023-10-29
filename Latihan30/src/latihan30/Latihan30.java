/*
Nama : Evan Eka Laksana
 * Kelas : PBO1
 * NIM : 222050008
 * Deskripsi Program : Program ini berisi program untuk menampilkan Cakep
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan30;
import java.util.Scanner;
public class Latihan30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("\u001b[31mKamu \u001b[32mngerjain sendiri \u001b[33mlatihan 17 sampe \u001b[34mlatihan 30 ini? \u001b[0m");
        System.out.println("\u001b \u001b[31m(Yoi/Enggak) \u001b[0m: ");
        String jawab = scanner.next();
        
        if (jawab.equals("Yoi")){
            System.out.println("\n\u001b[31mCakep Bener. \u001b[35mGood Job \u001b[0m");
        }else {
            System.out.println("""
                               \n \u001b[31Tetep cakep sih.
                               \u001b[36mSing penting paham konsep nya yee.\u001b[0m""");
            System.out.println("Keep the code works dude");
        }
    }
    
}
