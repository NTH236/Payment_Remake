Đoạn mã cũ vi phạm hàng loạt các quy tắc cơ bản trong kỹ thuật phần mềm:
- **Vi phạm nguyên lí đóng/mở (Open/Closeed Principle - OCP)**: mỗi khi muốn thêm một kiểu thanh toán mới, ta lại phải class **PaymentService** và thêm một lệnh **else if**. Điều này tạo ra rủi ro **Ignorant Surgery** cực cao, có thể làm gãy đổ các phương thức đang hoạt động ổn định.
- **Antipattern "Switch Statement"**: Khối lệnh **if-else** khổng lồ này chính là dấu hiệu của **Code Smell**. Hệ thống đang phải làm quá nhiều việc kiểm tra điều kiện và thực thi chi tiết, thay vì giao phó trách nhiệm đó cho từng đơn vị chuyên biệt.
- **Liên kết cứng (Tight Coupling)**: Lớp **PaymentService** bị trói chặt với mọi thuật toán thanh toán. Nó biết quá nhiều thứ không cần thiết.
