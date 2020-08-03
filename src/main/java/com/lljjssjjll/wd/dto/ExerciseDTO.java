package com.lljjssjjll.wd.dto;

import com.lljjssjjll.wd.entity.Exercise;
import com.lljjssjjll.wd.entity.enums.Equipment;
import com.lljjssjjll.wd.entity.enums.Target;
import lombok.Getter;
import lombok.Setter;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
public class ExerciseDTO {
    // 종목 아이디
    private Long exerciseId;

    // 이름
    private String name;

    // 부위
    private Target target;

    // 기구
    private Equipment equipment;

    // 무게 사용 여부
    private Boolean useWeight;

    // 지속 시간 사용 여부
    private Boolean useDuration;

    // 단 사용 여부
    private Boolean useDan;

    // 횟수 사용 여부
    private Boolean useReps;

    private static ModelMapper modelMapper = new ModelMapper();

    public static ExerciseDTO of(Exercise exercise) {
        ExerciseDTO exerciseDTO = new ExerciseDTO();
        // 매핑 기본 규칙 : 필드명
        modelMapper.map(exercise, exerciseDTO);
        return exerciseDTO;
    }

    public static List<ExerciseDTO> of(List<Exercise> exerciseList) {
        return exerciseList
                .stream()
                .map(ExerciseDTO::of)
                .collect(Collectors.toList());
    }
}
