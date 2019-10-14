package com.aerogramme.HelloWorld;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class TwiloSMSDemo {
    // Find your Account Sid and Token at twilio.com/user/account

    public static final String ACCOUNT_SID = "AC832a1d4c659cb293c1f510938a232571";
    public static final String AUTH_TOKEN = "accbb1b519bbdce92b954852ad9ac265";

    public static void main(String[] args) {

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        String to = "+13306898199";
        String from = "+12348134576";
        String body = "When is the next election in Ghana?";

        PhoneNumber toNumber = new PhoneNumber(to);
        PhoneNumber fromNumber = new PhoneNumber(from);

        Message message = Message.creator(toNumber, fromNumber, body).create();

        System.out.println(message.getSid());
    }
}
