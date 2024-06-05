package com.chezis.fptschool;

import java.util.Scanner;

public class AssignmentGD1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        do {
            System.out.println("+==============  M E N U  ==============+");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("10. Thoát");
            System.out.println("+==============  M E N U  ==============+");
            System.out.print("Nhập chức năng muốn chọn : ");
            luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
                    break;
                case 2:
                    System.out.println("2. Xuất danh sách nhân viên ra màn hình");
                    break;
                case 3:
                    System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím");
                    break;
                case 4:
                    System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
                    break;
                case 5:
                    System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
                    break;
                case 6:
                    System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
                    break;
                case 7:
                    System.out.println("7. Sắp xếp nhân viên theo họ và tên");
                    break;
                case 8:
                    System.out.println("8. Sắp xếp nhân viên theo thu nhập");
                    break;
                case 9:
                    System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
                    break;
                case 10:
                    System.out.println("\n\n BẠN ĐÃ THOÁT\n\n");
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập từ 0 -> 10 !");
            }

        } while ( luaChon != 0);
    }
}
