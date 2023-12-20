package com.practo.service;

import com.practo.entity.Review;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ReviewService {

    public Review createReview(Review review);
    public List<Review> getReviewByDoctorId(long doctorId);
}
