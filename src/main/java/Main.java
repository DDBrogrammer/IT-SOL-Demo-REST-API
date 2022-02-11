import entity.Driver;
import service.DriverService;

public class Main {

/*    API (Application Programming Interface) là một tập các quy tắc và cơ chế mà theo đó,
    một ứng dụng hay một thành phần sẽ tương tác với một ứng dụng hay thành phần khác.
    API có thể trả về dữ liệu mà bạn cần cho ứng dụng của mình ở những kiểu dữ liệu phổ
     biến như JSON hay XML.

    REST (REpresentational State Transfer) là một dạng chuyển đổi cấu trúc dữ liệu,
    một kiểu kiến trúc để viết API.
    Nó sử dụng phương thức HTTP đơn giản để tạo cho giao tiếp giữa các máy. Vì vậy,
    thay vì sử dụng một URL cho việc xử lý một số thông tin người dùng, REST gửi một
     yêu cầu HTTP như GET,POST, DELETE, vv đến một URL để xử lý dữ liệu.

    RESTful API là một tiêu chuẩn dùng trong việc thiết kế các API cho các ứng dụng web
     để quản lý các resource.
    RESTful là một trong những kiểu thiết kế API được sử dụng phổ biến ngày
    nay để cho các ứng dụng (web, mobile…) khác nhau giao tiếp với nhau.
 */

/*   Status code
     200 OK – Trả về thành công cho những phương thức GET, PUT, PATCH hoặc DELETE.
      201 Created – Trả về khi một Resouce vừa được tạo thành công.
      204 No Content – Trả về khi Resource xoá thành công.
      304 Not Modified – Client có thể sử dụng dữ liệu cache.
      400 Bad Request – Request không hợp lệ
      401 Unauthorized – Request cần có auth.
      403 Forbidden – bị từ chối không cho phép.
      404 Not Found – Không tìm thấy resource từ URI
      405 Method Not Allowed – Phương thức không cho phép với user hiện tại.
      410 Gone – Resource không còn tồn tại, Version cũ đã không còn hỗ trợ.
      415 Unsupported Media Type – Không hỗ trợ kiểu Resource này.
      422 Unprocessable Entity – Dữ liệu không được xác thực
      429 Too Many Requests – Request bị từ chối do bị giới hạn*/
    /* Quy tắc thiết kế API:
     * Sử dụng HTTP method để mô tả về chức năng của resource (POST, GET, PUT, DELETE)
     * POST /api/students/
     * GET /api/students/
     * GET /api/students/
     * Delete /api/student/2
     * Sử chỉ dụng danh từ số nhiều và không sử dụng động từ
     * Liên kết trong resource
     * chỉ được liên kết tối đa 2 đối tương (object)
     * vd: GET /api/users/123/cars/5 (lấy thông tin của car 5 của user 123)
     *  */
   /* Những ràng buộc kiến trúc cơ bản của RESTful API
   *1. Client–server (Máy khách – máy chủ)
   * máy khách và máy chủ phải hoàn toàn tách biệt và được phép phát triển riêng lẻ, độc lập.
   *  Phương thức hoạt động chính của REST là tách biệt giao diện người dùng ra
   * khỏi dữ liệu lưu trữ.
   *
   *2. Stateless (Phi trạng thái)
   * mỗi yêu cầu (request) từ máy khách đến máy chủ có thể được thực hiện độc lập.
   * Đồng thời, mỗi yêu cầu phải chứa mọi thông tin cần thiết để máy chủ hiểu và hoàn thành nó.
   *
   *3. Cacheable (Lưu được vào bộ nhớ cache)
   * ràng buộc này yêu cầu mỗi phản hồi phải đánh dấu dữ liệu bên trong nó là lưu được hoặc không lưu được vào cache.
   * Nếu phản hồi lưu được vào cache, thì máy khách có thể sử dụng lại dữ liệu của phản hồi đó cho các yêu cầu tương
   *  tự sau này.
   *
   *4. Uniform interface (Giao diện thống nhất)
   *REST áp dụng những nguyên tắc chung của kỹ thuật phần mềm cho giao diện thành phần.
   *
   * 5. Layered system (Hệ thống phân lớp)
   *Kiểu hệ thống phân lớp cho phép một kiến trúc chứa nhiều lớp phân cấp.
   * Mỗi lớp sẽ có một chức năng và trách nhiệm cụ thể
   *
   *6. Code on demand (Mã theo yêu cầu)
   *Ràng buộc này cho phép người dùng mở rộng chức năng của máy khách. Họ có thể tải xuống và thực thi mã dưới
   * dạng các ứng dụng nhỏ (applet) hoặc tập lệnh. Điều này sẽ đơn giản hóa công việc cho máy khách, bằng cách
   * giảm các tính năng bắt buộc triển khai từ trước.
   * */


    public static void main(String[] args) {

    }
}
