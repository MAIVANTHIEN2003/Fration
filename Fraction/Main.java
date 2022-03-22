package Fraction;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Fracton ps1 = new Fracton();
        Fracton ps2 = new Fracton();
        Fracton psTong = new Fracton();
        Scanner sc = new Scanner(System.in);
        //Hien thi

        System.out.println("Nhap tu so thu 1:");
        ps1.setTuSo(sc.nextInt());
        System.out.println("Nhap mau so thu 1:");
        ps1.setMauSo(sc.nextInt());

        System.out.println("Nhap tu so thu 2:");
        ps2.setTuSo(sc.nextInt());
        System.out.println("Nhap mau so thu 2:");
        ps2.setMauSo(sc.nextInt());

        System.out.println("Phan so vua nhap la: " + Math.abs(ps1.getTuSo()) + "/" + Math.abs(ps1.getMauSo()));
        System.out.println("Phan so vua nhap la: " + ps2.getTuSo() + "/" + ps2.getMauSo());

        System.out.println("Rut gon phan so 1: ");
        ps1.Rutgon();
        System.out.println("Rut gon phan so 2: ");
        ps2.Rutgon();

        System.out.println("Ngich dao phan so 1: " + ps1.getMauSo() + "/" + ps1.getTuSo());
        System.out.println("Ngich dao phan so 2: " + ps2.getMauSo() + "/" + ps2.getTuSo());



    }



}
