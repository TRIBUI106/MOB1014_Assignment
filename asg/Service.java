/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asg;



//──────────────────────────────────────────────────────────────────────────────────────────────────────────
//        ─██████████████─██████──██████─██████████████─██████████████─██████████████─██████──██████─██████████████─
//        ─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─██░░██──██░░██─██░░░░░░░░░░██─
//        ─██████░░██████─██░░██──██░░██─██░░██████░░██─██░░██████░░██─██░░██████░░██─██░░██──██░░██─██████████░░██─
//        ─────██░░██─────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─────────██░░██─
//        ─────██░░██─────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██████░░██─██████████░░██─
//        ─────██░░██─────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─
//        ─────██░░██─────██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─██████████░░██─██░░██████████─
//        ─────██░░██─────██░░░░██░░░░██─██░░██──██░░██─██░░██──██░░██─██░░██──██░░██─────────██░░██─██░░██─────────
//        ─────██░░██─────████░░░░░░████─██░░██████░░██─██░░██████░░██─██░░██████░░██─────────██░░██─██░░██████████─
//        ─────██░░██───────████░░████───██░░░░░░░░░░██─██░░░░░░░░░░██─██░░░░░░░░░░██─────────██░░██─██░░░░░░░░░░██─
//        ─────██████─────────██████─────██████████████─██████████████─██████████████─────────██████─██████████████─
//        ──────────────────────────────────────────────────────────────────────────────────────────────────────────

/*
SERVICE
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Bap Bun
 */
public class Service {

    public ArrayList<NhanVien> arrayNV = new ArrayList<NhanVien>(); // Danh sách nhân viên
    public ArrayList<TruongPhong> arrayTP = new ArrayList<TruongPhong>();// Danh sách trưởng phòng
    public ArrayList<TiepThi> arrayTT = new ArrayList<TiepThi>();//Danh sách tiếp thị


    public boolean timThay = false;


    public void add(NhanVien nv) {
        arrayNV.add(nv);
    }

    public void add(TruongPhong tp) {
        arrayTP.add(tp);
    }

    public void add(TiepThi tt) {
        arrayTT.add(tt);
    }

    public void showAll() {
        if ( !arrayNV.isEmpty() ) {
            System.out.println("Danh Sách Nhân Viên : ");
            for ( NhanVien nv : arrayNV ) {
                System.out.println("Mã Nhân Viên : " + nv.manv);
                System.out.println("Họ & Tên : " + nv.hoten);
                System.out.println("Lương : " + nv.getLuong());
                System.out.println();
            }
        }
        if ( !arrayTT.isEmpty() ) {
            System.out.println("Danh Sách Tiếp Thị : ");
            for ( TiepThi tt : arrayTT ) {
                System.out.println("Mã Nhân Viên : " + tt.manv);
                System.out.println("Họ & Tên : " + tt.hoten);
                System.out.println("Lương : " + tt.getLuong());
                System.out.println();
            }
        }
        if ( !arrayTP.isEmpty() ) {
            System.out.println("Danh Sách Trưởng Phòng : ");
            for ( TruongPhong tp : arrayTP ) {
                System.out.println("Mã Nhân Viên : " + tp.manv);
                System.out.println("Họ & Tên : " + tp.hoten);
                System.out.println("Lương : " + tp.getLuong());
                System.out.println();
            }
        }

        if ( arrayNV.isEmpty() && arrayTP.isEmpty() && arrayTT.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu !");
        }
    }


    public void showOnlyNhanVien() {
        if ( !arrayNV.isEmpty() ) {
            System.out.println("Danh Sách Nhân Viên : ");
            for ( NhanVien nv : arrayNV ) {
                System.out.println("Mã Nhân Viên : " + nv.manv);
                System.out.println("Họ & Tên : " + nv.hoten);
                System.out.println("Lương : " + nv.getLuong());
                System.out.println();
            }
        }

        if ( arrayNV.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu !");
        }
    }
    public void showOnlyTiepThi() {
        if ( !arrayTT.isEmpty() ) {
            System.out.println("Danh Sách Tiếp Thị : ");
            for ( TiepThi tt : arrayTT ) {
                System.out.println("Mã Nhân Viên : " + tt.manv);
                System.out.println("Họ & Tên : " + tt.hoten);
                System.out.println("Lương : " + tt.getLuong());
                System.out.println();
            }
        }

        if ( arrayTT.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu !");
        }
    }
    public void showOnlyTruongPhong() {
        if ( !arrayTP.isEmpty() ) {
            System.out.println("Danh Sách Trưởng Phòng : ");
            for ( TruongPhong tp : arrayTP ) {
                System.out.println("Mã Nhân Viên : " + tp.manv);
                System.out.println("Họ & Tên : " + tp.hoten);
                System.out.println("Lương : " + tp.getLuong());
                System.out.println();
            }
        }

        if ( arrayTP.isEmpty()) {
            System.out.println("Không tìm thấy dữ liệu !");
        }
    }

    public void showType(double showType) {

        if ( showType == 1 ) {
            showOnlyNhanVien();
        } else if ( showType == 2 ) {
            showOnlyTiepThi();
        } else if ( showType == 3 ) {
            showOnlyTruongPhong();
        } else if ( showType == 4 ) {
            showAll();
        }

    }

    public void searchWithMaNV(String inputMaNV) {
        // Search in NhanVien
        for (NhanVien nv : arrayNV) {
            if (nv.manv.equals(inputMaNV)) {
                System.out.println("Tìm Thấy Trong Danh Sách Nhân Viên: ");
                System.out.println("Mã Nhân Viên: " + nv.manv);
                System.out.println("Họ & Tên: " + nv.hoten);
                System.out.println("Lương: " + nv.getLuong());
                return;
            }
        }

        // Search in TiepThi
        for (TiepThi tt : arrayTT) {
            if (tt.manv.equals(inputMaNV)) {
                System.out.println("Tìm Thấy Trong Danh Sách Tiếp Thị: ");
                System.out.println("Mã Nhân Viên: " + tt.manv);
                System.out.println("Họ & Tên: " + tt.hoten);
                System.out.println("Lương: " + tt.getLuong());
                return;
            }
        }

        // Search in TruongPhong
        for (TruongPhong tp : arrayTP) {
            if (tp.manv.equals(inputMaNV)) {
                System.out.println("Tìm Thấy Trong Danh Sách Trưởng Phòng: ");
                System.out.println("Mã Nhân Viên: " + tp.manv);
                System.out.println("Họ & Tên: " + tp.hoten);
                System.out.println("Lương: " + tp.getLuong());
                return;
            }
        }

        // If not found in any list
//        System.out.println("Không tìm thấy nhân viên với mã: " + inputMaNV);
        System.out.println("Không tìm thấy dữ liệu !");
    }

    public void deleteWithMaNV(String maNV) {
        for (NhanVien nv : arrayNV) {
            if (nv.manv.equals(maNV)) {
                arrayNV.remove(nv);
                System.out.println("Đã xóa nhân viên có mã " + maNV);
                System.out.println("Tên : " + nv.hoten);
                System.out.println("Lương : " + nv.getLuong());
                return; // Kết thúc
            }
        }
        for (TiepThi nv : arrayTT) {
            if (nv.manv.equals(maNV)) {
                arrayTT.remove(nv);
                System.out.println("Đã xóa nhân viên có mã " + maNV);
                System.out.println("Tên : " + nv.hoten);
                System.out.println("Lương : " + nv.getLuong());
                return; // Kết thúc
            }
        }
        for (TruongPhong nv : arrayTP) {
            if (nv.manv.equals(maNV)) {
                arrayTP.remove(nv);
                System.out.println("Đã xóa nhân viên có mã " + maNV);
                System.out.println("Tên : " + nv.hoten);
                System.out.println("Lương : " + nv.getLuong());
                return; // Kết thúc
            }
        }
//        System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        System.out.println("Không tìm thấy dữ liệu !");
    }

    public void updateWithMaNV(String maNV) {

        for (TruongPhong tp : arrayTP) {
            if (tp.manv.equals(maNV)) {
                System.out.print("Nhập tên mới\n>> ");
                String newHoTen = new Scanner(System.in).nextLine();
                System.out.print("Nhập lương mới \n>> ");
                double newLuong = new Scanner(System.in).nextDouble();
                System.out.print("Nhập trách nhiệm mới\n>> ");
                double newTrachNhiem = new Scanner(System.in).nextDouble();
                tp.hoten = newHoTen; // Cập nhật tên mới
                tp.setLuong(newLuong); // Cập nhật lương mới
                tp.trachNhiem = newTrachNhiem; // Cập nhật trách nhiệm mới
                System.out.println("Thông tin nhân viên đã được cập nhật thành công!");
                return; // Kết thúc
            }
        }
        for (TiepThi tt : arrayTT) {
            if (tt.manv.equals(maNV)) {
                System.out.print("Nhập tên mới\n>> ");
                String newHoTen = new Scanner(System.in).nextLine();
                System.out.print("Nhập lương mới\n>> ");
                double newLuong = new Scanner(System.in).nextDouble();
                System.out.print("Nhập danh số mới\n>> ");
                double newDoanhSo = new Scanner(System.in).nextDouble();
                System.out.print("Nhập hoa hồng mới \n>> ");
                double newHoaHong = new Scanner(System.in).nextDouble();
                tt.hoten = newHoTen; // Cập nhật tên mới
                // phải dùng setLuong với tham số đầu vào vì luong của lớp cha NhanVien là private
                tt.setLuong(newLuong); // Cập nhật lương mới
                tt.hoaHong = newHoaHong; // Thêm hoa hồng
                tt.doanhSo = newDoanhSo; // Thêm danh số
                System.out.println("Thông tin nhân viên đã được cập nhật thành công!");
                return; // Kết thúc
            }
        }
        int i = 0;
        for (NhanVien nv : arrayNV) {
            i = i + 1;
            if (nv.manv.equals(maNV)) {
//                System.out.println("NV " + maNV + " in pos " + i);
                System.out.print("Nhập tên mới\n>> ");
                String newHoTen = new Scanner(System.in).nextLine();
                System.out.print("Nhập lương\n>> ");
                double newLuong = new Scanner(System.in).nextDouble();
//                arrayNV.set(i,new NhanVien(maNV,newHoTen,newLuong));
                nv.hoten = newHoTen; // Cập nhật tên mới
                nv.setLuong(newLuong); // Cập nhật lương mới
                System.out.println("Thông tin nhân viên đã được cập nhật thành công!");
                return; // Kết thúc
            }
        }
//        System.out.println("Không tìm thấy nhân viên có mã " + maNV);
        System.out.println("Không tìm thấy dữ liệu !");
    }

    public void searchWithLuong(Double inputLuong) {
        // Tìm trong list NhanVien
        for (NhanVien nv : arrayNV) {
            if (nv.getLuong().equals(inputLuong)) {
                timThay = true;
                System.out.println();
                System.out.println("Tìm Thấy Trong Danh Sách Nhân Viên: ");
                System.out.println("Mã Nhân Viên: " + nv.manv);
                System.out.println("Họ & Tên: " + nv.hoten);
                System.out.println("Lương: " + nv.getLuong());
            }
        }

        // Tìm trong list TiepThi
        for (TiepThi tt : arrayTT) {
            if (tt.getLuong().equals(inputLuong)) {
                timThay = true;
                System.out.println("Tìm Thấy Trong Danh Sách Tiếp Thị: ");
                System.out.println("Mã Nhân Viên: " + tt.manv);
                System.out.println("Họ & Tên: " + tt.hoten);
                System.out.println("Lương: " + tt.getLuong());
            }
        }

        // Tìm trong list TruongPhong
        for (TruongPhong tp : arrayTP) {
            if (tp.getLuong().equals(inputLuong)) {
                timThay = true;
                System.out.println("Tìm Thấy Trong Danh Sách Trưởng Phòng: ");
                System.out.println("Mã Nhân Viên: " + tp.manv);
                System.out.println("Họ & Tên: " + tp.hoten);
                System.out.println("Lương: " + tp.getLuong());
            }
        }

        // nếu k tìm thấy
        if (!timThay) {
            System.out.println("Không tìm thấy dữ liệu !");
        }
    }

    public void sortingNhanVienByHoTen(ArrayList<NhanVien> nhanvienList) {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.hoten.compareTo(nv2.hoten);
            }
        };
        Collections.sort(nhanvienList, comp);
    }

    public void sortingTiepThiByHoTen(ArrayList<TiepThi> tiepThiList) {
        Comparator<TiepThi> comp = new Comparator<TiepThi>() {
            @Override
            public int compare(TiepThi tt1, TiepThi tt2) {
                return tt1.hoten.compareTo(tt2.hoten);
            }
        };
        Collections.sort(tiepThiList, comp);
    }

    public void sortingTruongPhongByHoTen(ArrayList<TruongPhong> truongPhongList) {
        Comparator<TruongPhong> comp = new Comparator<TruongPhong>() {
            @Override
            public int compare(TruongPhong tp1, TruongPhong tp2) {
                return tp1.hoten.compareTo(tp2.hoten);
            }
        };
        Collections.sort(truongPhongList, comp);
    }

    public void sortingNhanVienByLuong(ArrayList<NhanVien> nhanvienList) {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.getLuong().compareTo(nv2.getLuong());
            }
        };
        Collections.sort(nhanvienList, comp);
    }

    public void sortingTiepThiByLuong(ArrayList<TiepThi> tiepThiList) {
        Comparator<TiepThi> comp = new Comparator<TiepThi>() {
            @Override
            public int compare(TiepThi tt1, TiepThi tt2) {
                return tt1.getLuong().compareTo(tt2.getLuong());
            }
        };
        Collections.sort(tiepThiList, comp);
    }

    public void sortingTruongPhongByLuong(ArrayList<TruongPhong> truongPhongList) {
        Comparator<TruongPhong> comp = new Comparator<TruongPhong>() {
            @Override
            public int compare(TruongPhong tp1, TruongPhong tp2) {
                return tp1.getLuong().compareTo(tp2.getLuong());
            }
        };
        Collections.sort(truongPhongList, comp);
    }

    public void sortWithHoTen(double loaiNV) {
        if (loaiNV == 1) {
            if (!arrayNV.isEmpty()) {
                System.out.println();
                sortingNhanVienByHoTen(arrayNV);
                System.out.println("Đã sắp xếp nhân viên theo thứ tự họ và tên !");
                showOnlyNhanVien();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        } else if (loaiNV == 2) {
            if (!arrayTT.isEmpty()) {
                sortingTiepThiByHoTen(arrayTT);
                System.out.println();
                System.out.println("Đã sắp xếp tiếp thị theo thứ tự họ và tên !");
                showOnlyTiepThi();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        } else if (loaiNV == 3) {
            if (!arrayTP.isEmpty()) {
                sortingTruongPhongByHoTen(arrayTP);
                System.out.println();
                System.out.println("Đã sắp xếp trưởng phòng theo thứ tự họ và tên !");
                showOnlyTruongPhong();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        }
    }

    public void sortWithLuong(double loaiNV) {

        // Nếu loại nv == 1 thì in Nhân Viên, nếu loại nhân viên == 2 thì in tiếp thị còn nếu == 3 thì in trưởng phòng
        if (loaiNV == 1) {
            if (!arrayNV.isEmpty()) {
                System.out.println();
                sortingNhanVienByLuong(arrayNV);
                System.out.println("Đã sắp xếp nhân viên theo thứ tự họ và tên !");
                showOnlyNhanVien();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        } else if (loaiNV == 2) {
            if (!arrayTT.isEmpty()) {
                sortingTiepThiByLuong(arrayTT);
                System.out.println();
                System.out.println("Đã sắp xếp tiếp thị theo thứ tự họ và tên !");
                showOnlyTiepThi();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        } else if (loaiNV == 3) {
            if (!arrayTP.isEmpty()) {
                sortingTruongPhongByLuong(arrayTP);
                System.out.println();
                System.out.println("Đã sắp xếp trưởng phòng theo thứ tự họ và tên !");
                showOnlyTruongPhong();
            } else {
                System.out.println("Không tìm thấy dữ liệu !");
            }
        }
    }

    public void showTop5NhanVien() {

        int count = 0;
        // Tạo lớp NhanVienReverse mang giá trị gốc là Nhân Viên và đảo ngược
        ArrayList<NhanVien> nhanVienListReverse = new ArrayList<>();
        nhanVienListReverse = arrayNV;
        Collections.reverse(nhanVienListReverse);

        System.out.println("Top 5 Nhân Viên Có Thu Nhập Cao Nhất\n");
        for (NhanVien nv : nhanVienListReverse) {
            System.out.println("Mã Nhân Viên: " + nv.manv);
            System.out.println("Họ & Tên: " + nv.hoten);
            System.out.println("Lương: \n" + nv.getLuong());

            count++;
            if (count == 5) {
                break;
            }
        }



    }
    /*
    public void sortingByMaNV(ArrayList<NhanVien> nhanvienList) {
        Comparator<NhanVien> comp = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien nv1, NhanVien nv2) {
                return nv1.manv.compareTo(nv2.manv);
            }
        };
        Collections.sort(nhanvienList, comp);
    }

     */

    /*
  Old Search Method
    public int search(NhanVien nv) {
        return this.arrayNV.indexOf(nv);
        // Nếu tìm thấy thì trả về vị trí trong dãy
        // Nếu tìm không thấy thì trả về (-1)
    }
    public int search(NhanVien nv2) {
        for ( NhanVien s : arrayNV) {
            System.out.println("MSNV : " + s.manv);
        }
        return 0;
    }
    public void search(String data) {
        if (!this.arrayNV.contains(data)) {
            System.out.println("Không tìm thấy dữ liệu");
        } else {
            System.out.println("Đã tìm thấy nhân viên ở vị trí thứ " + (arrayNV.indexOf(data)-1) + "!");
        }
    }
    */

}
