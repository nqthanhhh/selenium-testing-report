# BÁO CÁO TÌM HIỂU CÔNG CỤ SELENIUM

## 1. Thông tin sinh viên

* Họ và tên: Nguyễn Quốc Thành
* MSSV: 23010038

---

## 2. Giới thiệu Selenium

Selenium là bộ công cụ mã nguồn mở hỗ trợ tự động hóa kiểm thử ứng dụng web. Selenium cho phép mô phỏng các thao tác của người dùng trên trình duyệt như nhập dữ liệu, nhấn nút, kiểm tra kết quả và xác thực chức năng của website.

---

## 3. Công cụ và môi trường sử dụng

* Ngôn ngữ lập trình: Java
* Công cụ kiểm thử: Selenium WebDriver 4.21.0
* Framework kiểm thử: JUnit 5
* IDE: IntelliJ IDEA
* Trình duyệt: Google Chrome
* Công cụ quản lý thư viện: Maven

---

## 4. Tài liệu tham khảo

* https://www.selenium.dev/documentation/
* https://www.saucedemo.com/
* https://www.youtube.com/results?search_query=selenium+java+tutorial

---

## 5. Website kiểm thử

* URL: https://www.saucedemo.com/

Tài khoản sử dụng:

* Username: `standard_user`
* Password: `secret_sauce`

---

## 6. Các test case thực hiện

### Test Case 1: Đăng nhập thành công

**Mục tiêu:** Kiểm tra người dùng có thể đăng nhập với tài khoản hợp lệ.

**Kết quả mong đợi:** Chuyển đến trang danh sách sản phẩm.

<img width="1920" height="1038" alt="download" src="https://github.com/user-attachments/assets/714d94b3-a7c7-4779-866b-3aee11aeafe9" />

---

### Test Case 2: Thêm sản phẩm vào giỏ hàng

**Mục tiêu:** Kiểm tra chức năng thêm sản phẩm vào giỏ hàng.

**Kết quả mong đợi:** Biểu tượng giỏ hàng hiển thị số lượng sản phẩm là `1`.

<img width="1920" height="1025" alt="download" src="https://github.com/user-attachments/assets/24277fdb-2f48-4a2a-bec4-51c920fa695f" />

---

### Test Case 3: Đăng xuất

**Mục tiêu:** Kiểm tra người dùng có thể đăng xuất khỏi hệ thống.

**Kết quả mong đợi:** Hệ thống chuyển về trang đăng nhập.

<img width="1919" height="1042" alt="download" src="https://github.com/user-attachments/assets/4e786768-9ab7-4acb-bced-39c08b8c42ef" />

---

## 7. Kết quả thực hiện

Tất cả các test case đều chạy thành công.



## 8. Cấu trúc dự án

```text
selenium-testing/
├── src/
│   └── test/
│       └── java/
│           ├── LoginTest.java
│           ├── AddToCartTest.java
│           └── LogoutTest.java
├── images/
├── pom.xml
└── README.md
```

---

## 9. Nhận xét

### Ưu điểm

* Tự động hóa thao tác trên trình duyệt.
* Hỗ trợ nhiều trình duyệt khác nhau.
* Dễ tích hợp với JUnit và Maven.
* Phù hợp cho kiểm thử hồi quy.

### Nhược điểm

* Cần kiến thức lập trình để sử dụng hiệu quả.
* Dễ bị ảnh hưởng khi giao diện website thay đổi.

---

## 10. Kết luận

Sau khi tìm hiểu và thực hành, em đã nắm được cách sử dụng Selenium để xây dựng các kịch bản kiểm thử tự động cho ứng dụng web, bao gồm đăng nhập, thêm sản phẩm vào giỏ hàng và đăng xuất.
