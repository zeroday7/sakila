package sakila.vo;

public class Staff {
	private short staffId;		// staff의 고유번호
	private String firstName;	// staff의 이름
	private String lastName;	// staff의 성
	private int addressId;		// staff의 주소 고유번호
	private String picture;		// staff의 이미지 (BLOB->String으로 변경)
	private String email;		// staff의 E-Mail
	private int storeId;		// staff가 속한 store의 고유번호
	private int active;			// staff의 계정 활성여부
	private String username;	// staff의 별명
	private String password;	// staff계정의 비밀번호
	private String lastUpdate;	// staff의 최종 갱신일
	
	public short getStaffId() {
		return staffId;
	}
	
	public void setStaffId(short staffId) {
		this.staffId = staffId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", firstName=" + firstName + ", lastName=" + lastName + ", addressId="
				+ addressId + ", picture=" + picture + ", email=" + email + ", storeId=" + storeId + ", active="
				+ active + ", username=" + username + ", password=" + password + ", lastUpdate=" + lastUpdate + "]";
	}
}
