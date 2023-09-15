/**
 * 
                                                                            Bài tập về nhà Tuần 3
    - Sinh viên định nghĩa lớp SortedLinkedList dùng để lưu trữ danh sách liên kết số nguyên có thứ tự từ bé đến lớn với 02 phương thức chính và phương thức print để in danh sách ra màn hình. 02 phương thức chính bao gồm:
        + public void add(int data) để thêm nút với dữ liệu data vào danh sách có thứ tự.
        + public boolean remove(int data) dùng để xóa nút chứa dữ liệu data đầu tiên trong danh sách. Nếu xóa thành công thì trả về true, ngược lại nếu dữ liệu không tồn tại hoặc không có nút nào trong danh sách thì trả về false.
    - Sinh viên sử dụng kiểu dữ liệu int cho dữ liệu chứa trong Node.
        + Ví dụ 1: Cho danh sách liên kết 1 -> 3 -> 7 với head là nút chứa giá trị 1. Khi gọi phương thức add(4) thì danh sách sẽ trở thành 1 -> 3 -> 4 ->7.
        + Ví dụ 2: Cho danh sách rỗng, thực hiện liên tiếp các lệnh add(4), add(1), add(7), add(5), add(2) thì kết quả danh sách là 1 -> 2 -> 4 -> 5 -> 7.
    - Định nghĩa lớp Main chứa phương thức main để kiểm tra lại kết quả, sau khi kiểm thử chạy đúng trên máy thì sinh viên chép nội dung từng file dán vào mục tương ứng trong form.
* 
*/
public class Main {
    public static void main (String [] args) {
        SortedLinkedList sll = new SortedLinkedList ();
        // Add element
        sll.add(4);
        sll.add(1);
        sll.add(5);
        sll.add(5);
        sll.add(3);
        sll.add(9);
        sll.add(9);
        sll.add(0);
        sll.add(0);
        sll.add(2);
        sll.add(9);
        sll.add(8);
        sll.add(10);
        sll.add(2);
        sll.add(4);
        sll.print();
        // Remove element
        sll.remove(10);
        sll.print();
        sll.remove(9);
        sll.print();
        sll.remove(0);
        sll.print();
        sll.remove(4);
        sll.remove(0);
        sll.print();
    }
}