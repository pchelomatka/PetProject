package main.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import main.domain.common.AbstractEntity;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Type extends AbstractEntity {
}
