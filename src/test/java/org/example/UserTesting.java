package org.example;


import org.junit.Test;

import static org.junit.Assert.*;



    public class UserTesting {
        public String testString = "Maria";
        public String testString1="Ivan";
        public String testString2="Ivan";

        public int testAge = 101;
        public String testPassword = "Parol1997.";
        User u = new User();

    @Test
        public void checkPassword() {
            this.testString=testString;
            assertFalse(testString.isEmpty());
            assertEquals(testString1,testString2);

        }


        @Test
        public void shouldAnswerWithTrue() {
            assertTrue(true);
        }
    }

