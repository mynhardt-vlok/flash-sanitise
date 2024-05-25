package com.byteme.sanitise.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Keyword {
  @Id
  @GeneratedValue
  private Integer id;
  private String word;
}
