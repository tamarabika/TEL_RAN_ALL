package com.company;

public class Phone {

        public int number;
        String model;
        double weight;
        String name;
        int length;



        @Override
        public String toString() {
            return
                    "Звонит: " + number +
                            " model: " + model +
                            " weight: " + weight +
                            " name: " + name;

        }

        public Phone (int number, String model, double weight, String name){
            this.number = number;
            this.model = model;
            this.weight =weight;
            this.name = name;
        }

        public Phone receiveCall(int number, String name){
            return receiveCall(number, name);

        }

        public Phone sendMessage(int number, int length){
            return sendMessage(number, length);
        }




        public Phone(){


        }
    }

