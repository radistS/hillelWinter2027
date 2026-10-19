package com.hillel.cw_05;

public record UserDto(
    long id,
    String name,
    String email,
    boolean active
) {}

/*
{
  "id": 101,
  "name": "Alex",
  "email": "alex@example.com",
  "active": true
}
 */
