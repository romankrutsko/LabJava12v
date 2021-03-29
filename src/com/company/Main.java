package com.company;

import com.company.AirPort.*;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        AirPortController controller = new AirPortController();
        DataForController data = new DataForController();
        Sort sort = new Sort();
        controller.proceedProgram(data, sort);
    }





}
