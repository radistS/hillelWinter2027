package com.first.app;

import org.apache.commons.lang3.RandomStringUtils;

public class PinCodeGenerator {
    public String generatePinCode(int length){
        return RandomStringUtils.randomNumeric(length);
    }

}
