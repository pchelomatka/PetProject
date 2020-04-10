package main.domain.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.domain.dto.common.AbstractDTO;

@EqualsAndHashCode(callSuper = true)
@Data
public class LibraryDTO extends AbstractDTO {

    private String address;
}
