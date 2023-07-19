package SamwaMoney.TimeTableArtist.Comment.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MinusComment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "minus_comment_id", nullable = false, updatable = false)
    private Long minusCommentId;

    @Column(nullable = false)
    private String content;
}
