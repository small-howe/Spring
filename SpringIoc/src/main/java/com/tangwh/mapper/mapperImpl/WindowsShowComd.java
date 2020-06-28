package com.tangwh.mapper.mapperImpl;

import com.tangwh.mapper.ShowCmd;

/**
 * @PROJECT_NAME: Spring
 * @DESCRIPTION:
 * @USER: Howe
 * @DATE: 2020/6/27 18:13
 */
public class WindowsShowComd implements ShowCmd {

    public String showCmd() {
        return  "dir";
    }
}
