package study.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import study.springboot.domain.posts.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
