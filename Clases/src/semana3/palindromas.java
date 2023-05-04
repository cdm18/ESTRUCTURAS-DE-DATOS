/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana3;

/**
 *
 * @author SALA I
 */
public class palindromas {

    public static void main(String[] args) {
        boolean flag = palindromeCheck("remer");
        System.out.println("La palabra escrita es " + flag);
 
    }

    public static boolean palindromeCheck(String f) {

        if (f.length() == 0 || f.length() == 1) {
            return true;
        }
        if (f.charAt(0) == f.charAt(f.length() - 1)) {
            return palindromeCheck(f.substring(1, f.length() - 1));
        }
        return false;

    }
}
