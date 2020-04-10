package main.domain.dto.common;

import lombok.Data;

@Data
public abstract class AbstractDTO {

    private Long id;

    private String name;
}
