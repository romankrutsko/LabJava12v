package com.company.AirPort;

import com.company.AirPort.validator.Validator;

import java.io.IOException;

public class DataForController {
    public int check = 0;
    public AirPortView airPortView = new AirPortView();
    public final Init init = new Init();
    public AirPort[] array = new AirPort[10];
    public Validator validator = new Validator();
    public Writer writer = new Writer();

    public AirPort[] initFile(String answer) throws IOException {
        if (answer.equals("y")) {
            Reader reader = new Reader();
            boolean presence = reader.checkPresenceAndEmptyness();
            if (presence) {
                return array = reader.readToInit();
            } else {
                System.out.println("Unfortunately we should init not from file");
                return array = init.init();
            }
        } else {
           return array = init.init();
        }
    }
}
