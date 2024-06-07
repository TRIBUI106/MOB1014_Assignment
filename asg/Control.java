package asg;

/*
CONTROL
 */
import java.util.*;

public class Control {

    public static Service service = new Service();

    public static void inMenu() {
        Scanner sc = new Scanner(System.in);

        String dataInput;
        int option;
        String loaiNV;
        String maNV;
        String hoTen;
        Double luong;
        Double trachNhiem;
        Double doanhSo;
        Double hoaHong;

        while (true) {
            System.out.println("+==============  M E N U  ==============+");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã NV nhập từ bàn phím");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất");
            System.out.println("0. Thoát");
            System.out.println("+==============  M E N U  ==============+");
            System.out.print("Nhập chức năng muốn chọn : ");

            try {
                option = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (option) {
                    case 1:
                        while (true) {
                            try {
                                System.out.println("\nNhập loại nhân viên | Bỏ trống để thoát ");
                                System.out.println("1. Nhân Viên");
                                System.out.println("2. Tiếp Thị");
                                System.out.print("3. Trưởng Phòng\n>> ");
                                loaiNV = new Scanner(System.in).nextLine();

                                if (loaiNV == null || loaiNV.isEmpty() || loaiNV.equals(" ")) {
                                    System.out.println("Đã thoát");
                                    break;
                                }

                                if (!loaiNV.equals("1") && !loaiNV.equals("2") && !loaiNV.equals("3")) {
                                    System.out.println("Vui lòng nhập từ 1 -> 3");
                                    break;
                                }
                                System.out.print("\nNhập thông tin | Bỏ trống để thoát \nMã Nhân Viên\n>> ");
                                maNV = sc.nextLine();
                                if (maNV == null || maNV.isEmpty() || maNV.equals(" ")) {
                                    break;
                                }
                                System.out.print("Họ Tên \n>> ");
                                hoTen = sc.nextLine();
                                System.out.print("Lương \n>> ");
                                luong = new Scanner(System.in).nextDouble();

                                switch (loaiNV) {
                                    case "1":
                                        service.add(new NhanVien(maNV, hoTen, luong));
                                        break;
                                    case "2":
                                        System.out.print("Nhập doanh số\n>> ");
                                        doanhSo = sc.nextDouble();
                                        System.out.print("Nhập hoa hồng\n>> ");
                                        hoaHong = new Scanner(System.in).nextDouble();
                                        service.add(new TiepThi(maNV, hoTen, luong, doanhSo, hoaHong));
                                        break;
                                    case "3":
                                        System.out.print("Nhập lương trách nhiệm\n>> ");
                                        trachNhiem = new Scanner(System.in).nextDouble();
                                        service.add(new TruongPhong(maNV, hoTen, luong, trachNhiem));
                                        break;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Vui lòng nhập từ 1 -> 3!");
                                sc.nextLine();
                            }
                        }
                        break;

                    case 2:
                        try {
                            System.out.println();
                            System.out.println("Nhập loại nhân viên muốn in ra");
                            System.out.println("1. Nhân Viên");
                            System.out.println("2. Tiếp Thị");
                            System.out.println("3. Trưởng Phòng");
                            System.out.print("4. Tất cả\n>> ");
                            double showType = sc.nextDouble();
                            service.showType(showType);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập từ 1 -> 4 !");
                        }
                        break;
                    case 3:
                        try {
                            System.out.println();
                            System.out.print("Nhập mã NV cần tìm kiếm\n>> ");
                            dataInput = sc.nextLine();
                            service.searchWithMaNV(dataInput);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập đúng !");
                        }
                        break;
                    case 4:
                        try {
                            System.out.println();
                            System.out.print("Nhập mã NV cần xóa\n>> ");
                            dataInput = sc.nextLine();
                            service.deleteWithMaNV(dataInput);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập đúng !");
                        }
                        break;
                    case 5:
                        try {
                            System.out.println();
                            System.out.print("Nhập mã NV cần thay đổi\n>> ");
                            dataInput = sc.nextLine();
                            service.updateWithMaNV(dataInput);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập đúng !");
                        }
                        break;
                    case 6:
                        try {
                            System.out.println();
                            System.out.print("Nhập lương của nhân viên cần tìm\n>> ");
                            double luongInput = sc.nextDouble();
                            service.searchWithLuong(luongInput);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập từ 1 -> 4 !");
                        }
                        break;
                    case 7:

                        try {
                            System.out.println();
                            System.out.println("Chọn loại nhân viên cần sắp xếp ( Tên / A - Z )");
                            System.out.println("1. Nhân Viên");
                            System.out.println("2. Tiếp Thị");
                            System.out.print("3. Trưởng Phòng\n>> ");
                            double inputLoaiNV = sc.nextDouble();
                            service.sortWithHoTen(inputLoaiNV);
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập từ từ 1 -> 3!");
                        }
                        break;
                    case 8:
                        try {
                            System.out.println();
                            System.out.println("Chọn loại nhân viên cần sắp xếp ( Lương / Thấp -> Cao )");
                            System.out.println("1. Nhân Viên");
                            System.out.println("2. Tiếp Thị");
                            System.out.print("3. Trưởng Phòng\n>> ");
                            double inputLoaiNV2 = sc.nextDouble();
                            service.sortWithLuong(inputLoaiNV2);
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Vui lòng nhập từ từ 1 -> 3!");
                        }
                    case 9:
                        System.out.println();
                        service.showTop5NhanVien();
                        break;
                    case 0:
                        System.out.println("\n\n\tĐÃ THOÁT CHƯƠNG TRÌNH\n\n");
                        System.exit(0);
                    default:
                        System.out.println("Vui lòng nhập từ 0 -> 9 ");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Vui lòng nhập từ 0 -> 9 !");
                sc.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        inMenu();
    }
}