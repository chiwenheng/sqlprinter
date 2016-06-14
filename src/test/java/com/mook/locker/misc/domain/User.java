package com.mook.locker.misc.domain;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 9030785649977959711L;

	private Integer id;
	private String name;
	private String password;
	private Long version;
	
	public User() {}
	
	public User(String name, String password, Long version) {
		super();
		this.name = name;
		this.password = password;
		this.version = version;
	}

	public User(Integer id, String name, String password, Long version) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.version = version;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

}
