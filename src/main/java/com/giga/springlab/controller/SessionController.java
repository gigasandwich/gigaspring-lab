package com.giga.springlab.controller;

import java.util.Map;

import com.giga.spring.annotation.controller.Controller;
import com.giga.spring.annotation.controller.GigaSession;
import com.giga.spring.annotation.controller.RequestParameter;
import com.giga.spring.annotation.http.DoGet;
import com.giga.spring.annotation.http.DoPost;
import com.giga.spring.annotation.http.RequestMapping;
import com.giga.spring.util.http.ModelAndView;

@Controller
public class SessionController {
    @DoGet(path = "/sessions-form")
    public ModelAndView sessionsForm() {
        return new ModelAndView("/pages/sessions/index.jsp");
    }

    @DoGet(path = "/sessions")
    public String getSession(@RequestParameter("key") String key, @GigaSession Map<String, Object> session) {
        // /sessions?key=main-character
        Object value = session.get(key);
        return "Session key=" + key + " value=" + (value == null ? "null" : value.toString());
    }

    @DoPost(path = "/sessions")
    public String setSession(@RequestParameter("key") String key, @RequestParameter("value") String value, @GigaSession Map<String, Object> session) {
        session.put(key, value);
        return "Saved session key=" + key + " value=" + value;
    }
}
