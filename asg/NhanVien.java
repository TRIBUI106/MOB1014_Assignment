/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asg;

public class NhanVien {

    public String manv;
    public String hoten;
    private Double luong;

    public NhanVien() {
        this.manv = "";
        this.hoten = "";
        this.luong = 0.0;
    }

    public Double getLuong() {
        return this.luong;
    }

    public void setLuong() {
        this.luong = 0.0;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public NhanVien(String manv, String hoten, double luong) {
        this.manv = manv;
        this.hoten = hoten;
        this.luong = luong;
    }

    public double getThuNhap() {
        return this.luong;
    }

    public double getThueTN() {
        //Dưới 9tr thì không đóng;
        //Từ 9-15 triệu: đóng 10%
        //Trên 15 triệu: đóng 12%
        double tr = 1000000;
        double tongThu = this.getThuNhap();
        if (tongThu <= 9*tr) {
            return 0;
        } else if (tongThu > 9*tr && tongThu <15*tr )
        {
            return (tongThu - 9*tr)* 0.1;
        }
        else
        {
            return (tongThu - 9*tr)*0.1 + (tongThu - 15*tr )*0.12;
        }
    }

    public String xuatThongTin() {
        return (this.manv + " " + this.hoten + " " + this.luong);
    }
}
