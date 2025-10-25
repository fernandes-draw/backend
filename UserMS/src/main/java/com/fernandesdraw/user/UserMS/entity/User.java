package com.fernandesdraw.user.UserMS.entity;

import com.fernandesdraw.user.UserMS.dto.UserDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @Column(unique = true)
  private String email;
  private String password;
  private String role;

  public UserDto toDto() {
    return new UserDto(this.id, this.name, this.email, this.password, this.role);
  }
}
