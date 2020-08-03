package com.lljjssjjll.wd.service.impl;

import com.lljjssjjll.wd.dto.ExerciseDTO;
import com.lljjssjjll.wd.repositroy.ExerciseRepository;
import com.lljjssjjll.wd.service.ExerciseService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseServiceImpl implements ExerciseService {
    @NonNull
    private final ExerciseRepository exerciseRepository;

    @Override
    public List<ExerciseDTO> findActiveExerciseList() {
        return ExerciseDTO.of(exerciseRepository.findByFlag(true));
    }
}
