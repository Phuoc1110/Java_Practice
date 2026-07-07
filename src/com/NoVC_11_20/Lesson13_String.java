package com.NoVC_11_20;


public class Lesson13_String {

	public static void main(String[] args) {
		
		/* You convert primitive types to a string with toString
		* String byteString = Byte.toString(bigByte);
		* String shortString = Short.toString(bigByte);
		* String intString = Integer.toString(bigInt);
		* String longString = Long.toString(bigByte);
		* String floatString = Float.toString(bigByte);
		* String doubleString = Double.toString(bigByte);
		* String booleanString = Boolean.toString(bigByte);
		*
		* You convert from String to primitives with parse
		* int stringToInt = Integer.parseInt(intString);
		* parseSort, rseLong, parseByte, parseDouble,
		* parseBoolean, parseFloat
		*/
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if (uppercaseStr.equalsIgnoreCase(lowercaseStr)) {
			System.out.println("They're the same");
		}
		
		String letters = "abcd";
		
		System.out.println(letters.compareToIgnoreCase(lowercaseStr));
		System.out.println(letters.charAt(1));
		System.out.println(letters.startsWith("ab"));
		System.out.println(letters.indexOf("c"));
		
		String l = letters.substring(1,3);
		System.out.println(l);
		
		
		/*
		 * Tính bất biến (Immutability) của String làm cho khi đổi String thì nó thực ra đang tạo ra 1 string mới ở STRING POOL, không xóa string cũ, tốn RAM.
		 * Đổi lại thì khi khởi tạo nhiều string cùng giá trị vd:"Hi" thì sẽ bớt tốn dung lượng hơn ở HEAP vì các biến sẽ cùng trỏ tới dòng string "Hi" đó
		 * StringBuilder thì toàn bộ dữ liệu được lưu ở HEAP, không có tính bất biến nên sẽ tiết kiệm hơn khi phải sửa đổi nhiều, ngoài ra cũng bảo mật kém hơn do không có tính bất biến của String
		 */
		StringBuilder randSB = new StringBuilder("123");
		System.out.println(randSB.capacity());
		randSB.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(randSB.capacity());
		randSB.insert(5, "bbbbbbbbbbbbb");
		System.out.println(randSB);
		randSB.append("c");
		System.out.println(randSB);
		
	}

}