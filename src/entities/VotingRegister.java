package entities;

import java.util.Objects;

public class VotingRegister {

	private String name;
	private Integer vote;

	public VotingRegister(String name, Integer vote) {
		this.name = name;
		this.vote = vote;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getVote() {
		return vote;
	}

	public void setVote(Integer vote) {
		this.vote = vote;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, vote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VotingRegister other = (VotingRegister) obj;
		return Objects.equals(name, other.name) && Objects.equals(vote, other.vote);
	}

}
