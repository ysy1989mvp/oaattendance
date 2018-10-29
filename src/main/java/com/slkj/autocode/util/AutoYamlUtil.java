package com.slkj.autocode.util;

import java.io.FileInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.yaml.snakeyaml.Yaml;

import com.google.gson.Gson;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class AutoYamlUtil {
	public static JSONObject getYaml(){
		try {
            Yaml yaml = new Yaml();
            URL url = AutoYamlUtil.class.getClassLoader().getResource("application.yml");
            if (url != null) {
                //获取test.yaml文件中的配置数据，然后转换为obj，
                Object obj =yaml.load(new FileInputStream(url.getFile()));
                //也可以将值转换为Map
                Map<String,Object> map =(Map<String,Object>)yaml.load(new FileInputStream(url.getFile()));
                Gson gs = new Gson();
                String jsonStr = gs.toJson(map);
                jsonStr = "["+jsonStr+"]";
                JSONArray jsonArray = JSONArray.fromObject(jsonStr);
//                System.out.println(jsonArray.getJSONObject(0).getJSONObject("spring").getJSONObject("datasource").get("driverClassName"));
               return jsonArray.getJSONObject(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
		return null;
	}
	
}
