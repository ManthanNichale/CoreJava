package com.techouts.cj8.funtaional_interface;

@FunctionalInterface
interface Addition<Demo extends Person>{
    Demo Addition(Demo a, Demo b);
}