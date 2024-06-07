/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asg;

/**
 *
 * MODEL
 */
public class TiepThi extends NhanVien {

    public double doanhSo;
    public double hoaHong;

    public TiepThi(String manv, String hoten, double luong, double doanhSo, double hoaHong) {
        super(manv, hoten, luong);
        this.doanhSo = doanhSo;
        this.hoaHong = hoaHong;
    }

    @Override
    public double getThuNhap() {
        return super.getThuNhap() + this.doanhSo * this.hoaHong;
    }

    @Override
    public double getThueTN() {
        double tr = 1000000;
        double tongThu = this.getThuNhap();
        if (tongThu <= 9 * tr) {
            return 0;
        } else if (tongThu > 9 * tr && tongThu < 15 * tr) {
            return (tongThu - 9 * tr) * 0.1;
        } else {
            return (tongThu - 9 * tr) * 0.1 + (tongThu - 15 * tr) * 0.12;
        }
    }

}
