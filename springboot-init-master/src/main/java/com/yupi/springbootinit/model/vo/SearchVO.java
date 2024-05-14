package com.yupi.springbootinit.model.vo;

import com.google.gson.Gson;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 帖子视图
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@Data
public class SearchVO implements Serializable {

    private final static Gson GSON = new Gson();

    private List<UserVO> userVoList;

    private List<PostVO> postVoList;

    private List<Picture> pictureVoList;
    private static final long serialVersionUID = 1L;
}
