package com.jochen.designpatterns.state;

/**
 * Created by JoChen on 2020/5/22.
 */
public class State1 {
    public enum NetworkState {
        Open,
        Close,
        Connect
    }
    public class NetworkProcessor {
        NetworkState state;
        public void Operation1() {
            switch (state) {
                case Open:
                    // ......
                    state = NetworkState.Close;
                    break;
                case Close:
                    // ......
                    state = NetworkState.Connect;
                    break;
                case Connect:
                    // ......
                    state = NetworkState.Open;
                    break;
            }
        }
        public void Operation2() {
            switch (state) {
                case Open:
                    // ......
                    state = NetworkState.Connect;
                    break;
                case Close:
                    // ......
                    state = NetworkState.Open;
                    break;
                case Connect:
                    // ......
                    state = NetworkState.Close;
                    break;
            }
        }
        public void Operation3() {
            // ......
        }
    }
}
