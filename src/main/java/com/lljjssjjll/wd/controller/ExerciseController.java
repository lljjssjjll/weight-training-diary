package com.lljjssjjll.wd.controller;

import com.lljjssjjll.wd.dto.ExerciseDTO;
import com.lljjssjjll.wd.service.ExerciseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercises")
@RequiredArgsConstructor
@Api(tags = {"Exercise"})
public class ExerciseController {
    @NonNull
    private final ExerciseService exerciseService;

    @GetMapping
    @ApiOperation(value = "종목 전체 조회")
    public ResponseEntity<List<ExerciseDTO>> getExerciseList() {
        return ResponseEntity.ok(exerciseService.findActiveExerciseList());
    }
}
