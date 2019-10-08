package com.qf.utils;


import com.qf.domain.Code;
import com.qf.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class EmailUtils {
    @Value("${spring.mail.username}")
    private String SEND_USER;
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private RegisterService userCodeService;

    public String sendEmail(String sendTo) {
        SimpleMailMessage sim=new SimpleMailMessage();
        sim.setFrom(SEND_USER);
        sim.setSubject("注册验证码");
        String code=randomCode();
        sim.setText(code);
        sim.setTo(sendTo);
        try{
            javaMailSender.send(sim);
            Code userCode=new Code();
            userCode.setCode(code);
            userCode.setEmail(sendTo);
            userCodeService.addCode(userCode);
            return code;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }

    }
    public static String randomCode(){
        Random random=new Random();
        StringBuffer st=new StringBuffer();
        for (int i=0;i<6;i++){
            int c=random.nextInt(9);
            st.append(c);
        }
        return st.toString();
    }

}
