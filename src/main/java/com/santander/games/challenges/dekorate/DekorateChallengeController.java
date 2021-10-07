package com.santander.games.challenges.dekorate;


import io.dekorate.jib.annotation.JibBuild;
import io.dekorate.openshift.annotation.OpenshiftApplication;
import io.dekorate.s2i.annotation.S2iBuild;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@S2iBuild(enabled = false)
@OpenshiftApplication(expose = true)
@JibBuild(registry="docker.io", group = "aarroyosal", dockerBuild = false)
public class DekorateChallengeController {

    @RequestMapping("/")
    public String hello() {
        return "<h2>Hola mundo</h2>";
    }
}