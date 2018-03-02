package org.wecancodeit.reviewssitefullstack;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.ui.Model;

public class Controller {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ReviewRepository reviewRepo;

	public void getCategories(Model model) {
		Collection<Category> categories = (Collection<Category>) categoryRepo.findAll();
		model.addAttribute("categories", categories);
	}

	public void getCategory(long categoryId, Model model) {
		Category category = categoryRepo.findOne(categoryId);
		model.addAttribute("category", category);
	}

	public void getReview(long reviewId, Model model) {
		Review review = reviewRepo.findOne(reviewId);
		model.addAttribute("review", review);
	}

}