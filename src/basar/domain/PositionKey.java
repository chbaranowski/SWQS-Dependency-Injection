package basar.domain;


public class PositionKey {
	
	Long id;

	String kasse;

	public Long getId() {
		return id;
	}

	public String getKasse() {
		return kasse;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setKasse(String kasse) {
		this.kasse = kasse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kasse == null) ? 0 : kasse.hashCode());
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
		PositionKey other = (PositionKey) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kasse == null) {
			if (other.kasse != null)
				return false;
		} else if (!kasse.equals(other.kasse))
			return false;
		return true;
	}
	
}