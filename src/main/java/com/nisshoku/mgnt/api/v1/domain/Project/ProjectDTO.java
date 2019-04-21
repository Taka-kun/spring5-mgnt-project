package com.nisshoku.mgnt.api.v1.domain.Project;

import com.nisshoku.mgnt.domain.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjectDTO extends ProjectBaseDTO{

    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private Double cost;
}