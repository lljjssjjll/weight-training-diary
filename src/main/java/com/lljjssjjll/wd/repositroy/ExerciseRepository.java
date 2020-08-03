package com.lljjssjjll.wd.repositroy;

import com.lljjssjjll.wd.entity.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseRepository extends JpaRepository<Exercise, Long> {
    List<Exercise> findByFlag(boolean flag);
}
