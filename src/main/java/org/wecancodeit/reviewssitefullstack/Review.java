package org.wecancodeit.reviewssitefullstack;

public class Review {

	private String title;
	private String url;

	public Review(String title, String url) {
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public String getUrl() {
		return url;
	}

}
