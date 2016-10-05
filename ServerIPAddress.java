package com.example.senthil.nutrients;

public class ServerIPAddress {
		private static String ipaddress = null;
		private static String toMobileNo = null;
		
		public static String getToMobileNo() {
			return toMobileNo;
		}

		public static void setToMobileNo(String toMobileNo) {
			ServerIPAddress.toMobileNo = toMobileNo;
		}

		public static String getEmailId() {
			return emailId;
		}

		public static void setEmailId(String emailId) {
			ServerIPAddress.emailId = emailId;
		}

		public static String getImsiNo() {
			return imsiNo;
		}

		public static void setImsiNo(String imsiNo) {
			ServerIPAddress.imsiNo = imsiNo;
		}

		

		public static String getPassword() {
			return password;
		}

		public static void setPassword(String password) {
			ServerIPAddress.password = password;
		}

		private static String emailId = null;
		private static String imsiNo = null;
		private static String mobileNo = null;
		public static String getMobileNo() {
			return mobileNo;
		}

		public static void setMobileNo(String mobileNo) {
			ServerIPAddress.mobileNo = mobileNo;
		}

		private static String password = null;

		public static String getIpaddress() {
			return ipaddress;
		}

		public static void setIpaddress(String ipaddress) {
			ServerIPAddress.ipaddress = ipaddress;
		}
		

	}


