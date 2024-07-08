package com.traveldiary.be.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "comment_re")
public class CommentRe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // 대댓글 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id", nullable = false)
    @JsonBackReference
    private Comment comment;  // 부모 댓글 ID

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private Users user;  // 사용자 ID

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;  // 대댓글 내용

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;  // 생성 시간

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;  // 수정 시간

    @Column(name = "is_deleted", nullable = false)
    private boolean isDeleted = false;  // 삭제 여부

    @Column(name = "is_private", nullable = false)
    private boolean isPrivate = false;  // 비공개 여부

    @Column(name = "report_count", nullable = false)
    private int reportCount = 0;  // 신고 횟수

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;

    @PrePersist
    protected void onCreate() {
        createdAt = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
        if (deleted) {
            deletedAt = LocalDateTime.now();
        } else {
            deletedAt = null;
        }
    }
}
