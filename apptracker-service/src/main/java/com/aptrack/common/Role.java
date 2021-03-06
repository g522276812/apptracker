package com.aptrack.common;

import lombok.Getter;

/**
 * Created by Murthy on 7/28/2017.
 */
@Getter
public enum Role {
    CANDIDATE(100),
    SPOC(101),
    HR(102),
    MANAGER(103);

    private int code;

    Role(int code) {
        this.code = code;
    }


}
