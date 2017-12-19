package vo;

import java.util.Date;

public class UmsVo {
	private int st_id;
	private String name;
	private String sex;
	private int birth;
	private String pw;
	private String role;
	
	public UmsVo() { }
	public UmsVo(int st_id, String name, String sex, int birth, String pw, String role) {
		super();
		this.st_id = st_id;
		this.name = name;
		this.sex = sex;
		this.birth = birth;
		this.pw = pw;
		this.role = role;
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + birth;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		result = prime * result + st_id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UmsVo other = (UmsVo) obj;
		if (birth != other.birth)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		if (st_id != other.st_id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "UmsVo [st_id=" + st_id + ", name=" + name + ", sex=" + sex + ", birth=" + birth + ", pw=" + pw
				+ ", role=" + role + "]";
	}
}
