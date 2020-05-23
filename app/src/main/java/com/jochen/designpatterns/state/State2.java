package com.jochen.designpatterns.state;

/**
 * Created by JoChen on 2020/5/22.
 * 状态模式
 */
public class State2 {
    public abstract class NetworkState {
        protected NetworkState next;

        public abstract void Operation1();

        public abstract void Operation2();

        public abstract void Operation3();
    }

    public class OpenState extends NetworkState {

        @Override
        public void Operation1() {
            next = new CloseState();
        }

        @Override
        public void Operation2() {
            next = new ConnectState();
        }

        @Override
        public void Operation3() {
            next = new OpenState();
        }
    }

    public class CloseState extends NetworkState {

        @Override
        public void Operation1() {
            next = new CloseState();
        }

        @Override
        public void Operation2() {
            next = new ConnectState();
        }

        @Override
        public void Operation3() {
            next = new OpenState();
        }
    }

    public class ConnectState extends NetworkState {

        @Override
        public void Operation1() {
            next = new CloseState();
        }

        @Override
        public void Operation2() {
            next = new ConnectState();
        }

        @Override
        public void Operation3() {
            next = new OpenState();
        }
    }

   class NetworkProcessor {
        NetworkState state;

       public NetworkProcessor(NetworkState state) {
           this.state = state;
       }
       public void Operation1() {
           state.Operation1();
           state = state.next;
       }
       public void Operation2() {
           state.Operation2();
           state = state.next;
       }
       public void Operation3() {
           state.Operation3();
           state = state.next;
       }
   }


}
