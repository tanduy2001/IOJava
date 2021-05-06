package basic.dev;
/**
 * Lab07
 * @author Admin
 *
 */
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameStudent;
		String idStudent;
		String cmndStudent;
		String nameClassStu;
		String nameSchoolStu;
		float diemTrungBinh;
		
			String namePerson;
			String adressPerson;
			String numberPhonePerson;
			float heSoLuongPerson;
		
				String nameCar;
				String hangCar;
				int giaCar;
				String colorCar;
		
		
		nameStudent = "Luong Minh Duong";
		idStudent  = "2060059";
		cmndStudent = " 191913272";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 9.0f;
		
			namePerson = " Cristiano Messi";
			adressPerson = " Bernabeu de Cam Nou";
			numberPhonePerson = " 0123456789";
			heSoLuongPerson = 4.0f;
		
				nameCar = "Xe Ford Ranger";
				hangCar = "Ford";
				giaCar = 1000000000;
				colorCar = "Blue";
		
		System.out.println("Thong tin SV thu nhat:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
			
		System.out.println("Thong tin Person thu nhat");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);
		
		System.out.println("Thong tin xe thu nhat:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
		
		System.out.println("\n-------------------------------------");

		nameStudent = "Nguyen Duc Minh";
		idStudent  = "2060069";
		cmndStudent = " 192021535";
		nameClassStu = "20CDTH41";
		nameSchoolStu = "HueIC";
		diemTrungBinh = 10.0f;
		
			namePerson = " Lionel Ronaldo";
			adressPerson = " Camp Nou de Santiago";
			numberPhonePerson = " 08083508";
			heSoLuongPerson = 3.9f;
		
				nameCar = "Xe Mercedes Benz";
				hangCar = "Mercedes";
				giaCar = 1000000000;
				colorCar = "Silver";
		
		System.out.println("Thong tin SV thu hai:");
		System.out.printf("Ho va ten: %s, ID = %s, So CMND = %s, Lop: %s, Truong: %s, Diem trung binh: %f\n "
							,nameStudent,idStudent,cmndStudent,nameClassStu,nameSchoolStu,diemTrungBinh);
	
		System.out.println("Thong tin Person thu hai");
		System.out.printf("Ten: %s, Dia chi: %s, So dien thoai: %s, He so luong: %f\n"
							,namePerson,adressPerson,numberPhonePerson,heSoLuongPerson);

		System.out.println("Thong tin xe thu hai:");
		System.out.printf("Ten xe: %s, Hang: %s, gia: %d, Mau: %s", nameCar,hangCar,giaCar,colorCar);
	}

}

