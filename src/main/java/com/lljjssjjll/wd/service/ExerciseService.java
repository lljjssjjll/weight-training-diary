package com.lljjssjjll.wd.service;

import com.lljjssjjll.wd.dto.ExerciseDTO;

import java.util.List;

public interface ExerciseService {
    List<ExerciseDTO> findActiveExerciseList();
}
