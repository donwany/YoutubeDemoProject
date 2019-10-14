package com.aerogramme.HelloWorld;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


public class Twillo {

        // Find your Account Sid and Token at twilio.com/user/account
        public static final String ACCOUNT_SID = "AC832a1d4c659cb293c1f510938a232571";
        public static final String AUTH_TOKEN = "accbb1b519bbdce92b954852ad9ac265";

        public static void main(String[] args) {

            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

            String TO = "+13306898199";
            String FROM = "+12348134576";
            String BODY = "This is the ship that made the Kessel Run in fourteen parsecs?";

            Message message = Message.creator(new PhoneNumber(TO), new PhoneNumber(FROM), BODY).create();

            System.out.println(message.getSid());

            Message.Status status = message.getStatus();
            System.out.println(status.toString());
        }
}
