package org.wecancodeit.reviewssitefullstack;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {

	@Id
	@GeneratedValue
	private long id;
	private String name;
	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;

	@SuppressWarnings("unused")
	private Category() {
	}

	public Category(String name, Review...reviews) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public long getId() {
		return id;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public int getReviewCount() {
		return 2;
	}

}
