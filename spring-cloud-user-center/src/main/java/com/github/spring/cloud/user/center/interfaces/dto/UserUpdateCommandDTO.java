package com.github.spring.cloud.user.center.interfaces.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.Set;

/**
 * TODO
 * <p>
 * create in 2021/4/23 5:36 下午
 *
 * @author shishaodong
 * @version 0.0.1
 */
@Slf4j
@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserUpdateCommandDTO {

    private Long id;

    private String username;

    private String mobile;

    private String password;

    private String email;

    private Set<Long> roleIds;

    private String note;

}
