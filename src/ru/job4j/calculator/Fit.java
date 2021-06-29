package ru.job4j.calculator;

public class Fit {
/* Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.

    Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15. */
        public static double manWeight(short heightMan) {
            return (heightMan-100) * 1.15 ;
        }

        public static double womanWeight(short heightWoman) {
            return (heightWoman-110) * 1.15 ;
        }

        public static void main(String[] args) {
            short heightMan = 187;
            short heightWoman = 170;
            double man = Fit.manWeight(heightMan);
            double woman =  Fit.womanWeight(heightWoman);
            System.out.println("Man 187 is " + man);
            System.out.println("Woman 170 is " + woman);
        }

    }
