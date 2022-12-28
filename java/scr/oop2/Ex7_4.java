package oop2;

public class Ex7_4 {

    class TvVCR extends Tv1 { // Tv1 클래스를 '상속'시킴 -> 좀더 비중있는 것을 상속으로
    }
    VCR vcr = new VCR(); // VCR 클래스를 '포함'시킴

    void play() {
        vcr.play();
    }

    void stop() {
        vcr.stop();
    }

    void rew() {
        vcr.rew();
    }

    void ff() {
        vcr.ff();
    }
}



    class Tv1 {
        boolean power;
        int channel;

        void power() {
            power = !power;
        }

        void channelUp() {
            ++channel;
        }

        void channelDown() {
            --channel;
        }
    }

    class VCR {
        boolean power;
        int counter = 0;

        void power() {
            power = !power;
        }

        void play() {/*내용생략*/}

        void stop() {/*내용생략*/}

        void rew() {/*내용생략*/}

        void ff() {/*내용생략*/}
    }
