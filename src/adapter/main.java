package adapter;

public class main {
    public static void main(String[] args) {
        VietnameseTarget greeting = new TranslatorAdapter(new JapaneseAdaptee());
        greeting.send("xin chao");
        /**
         * Adapter Pattern giúp nhiều lớp có thể làm việc với nhau dễ dàng mà bình thường không thể.
         * Một trường hợp thường gặp phải và có thể áp dụng Adapter Pattern là khi không thể kế thừa lớp A,
         * nhưng muốn một lớp B có những xử lý tương tự như lớp A.
         * Khi đó chúng ta có thể cài đặt B theo Object Adapter,
         * các xử lý của B sẽ gọi những xử lý của A khi cần.
                Khi muốn sử dụng một lớp đã tồn tại trước đó nhưng interface sử dụng không phù hợp như mong muốn.
        Khi muốn tạo ra những lớp có khả năng sử dụng lại,
         chúng phối hợp với các lớp không liên quan hay những lớp không thể đoán trước được và những lớp này không có những interface tương thích.
        Cần phải có sự chuyển đổi interface từ nhiều nguồn khác nhau.
        Khi cần đảm bảo nguyên tắc Open/ Close trong một ứng dụng
         */
    }
}
