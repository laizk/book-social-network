package com.t0pz.book.feedback;

import com.t0pz.book.book.Book;
import org.springframework.stereotype.Service;

@Service
public class FeedbackMapper {
    public Feedback toFeedback(FeedbackRequest request) {
        return Feedback.builder()
                .note(request.note())
                .comment(request.comment())
                .book(
                        Book.builder()
                                .id(request.bookId())
                                .archived(false) // Not required and has no impact :: just to satisfy lombok
                                .shareable(false)// Not required and has no impact :: just to satisfy lombok
                                .build()
                    )
                .build();
    }
}
