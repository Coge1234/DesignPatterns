package com.jochen.designpatterns.abstract_factory;

import java.util.Vector;

/**
 * Created by JoChen on 2020/5/21.
 * 数据库访问有关的基类
 */
public class EmployeeDAO3 {
    abstract class IDBConnection {
        abstract void setConnectString(String data);
    }

    abstract class IDBCommand {
        abstract void setCommandText(String data);

        abstract void setConnection(IDBConnection connection);

        abstract IDataReader executeReader();
    }

    abstract class IDataReader {
        abstract boolean read();
    }

    abstract class IDBFactory {
        public abstract IDBConnection createDBConnection();

        public abstract IDBCommand createDBCommand();

        public abstract IDataReader createDataReader();
    }

    // 支持MySQL
    class MySqlConnection extends IDBConnection {

        @Override
        void setConnectString(String data) {

        }
    }

    class MySqlCommand extends IDBCommand {

        @Override
        void setCommandText(String data) {

        }

        @Override
        void setConnection(IDBConnection connection) {

        }

        @Override
        IDataReader executeReader() {
            return null;
        }
    }

    class MySqlDataReader extends IDataReader {

        @Override
        boolean read() {
            return false;
        }
    }

    class MySqlDBFactory extends IDBFactory {

        @Override
        public IDBConnection createDBConnection() {
            return new MySqlConnection();
        }

        @Override
        public IDBCommand createDBCommand() {
            return new MySqlCommand();
        }

        @Override
        public IDataReader createDataReader() {
            return new MySqlDataReader();
        }
    }

    // 支持Oracle
    class OracleConnection extends IDBConnection {

        @Override
        void setConnectString(String data) {

        }
    }

    class OracleCommand extends IDBCommand {

        @Override
        void setCommandText(String data) {

        }

        @Override
        void setConnection(IDBConnection connection) {

        }

        @Override
        IDataReader executeReader() {
            return null;
        }
    }

    class OracleDataReader extends IDataReader {

        @Override
        boolean read() {
            return false;
        }
    }

    class OracleDBFactory extends IDBFactory {

        @Override
        public IDBConnection createDBConnection() {
            return new OracleConnection();
        }

        @Override
        public IDBCommand createDBCommand() {
            return new OracleCommand();
        }

        @Override
        public IDataReader createDataReader() {
            return new OracleDataReader();
        }
    }


    class EmployeeDAO {
        IDBFactory dbFactory;

        public Vector<EmployeeDAO> getEmployees() {
            Vector<EmployeeDAO> employeeDAOS = null;
            IDBConnection connection = dbFactory.createDBConnection();
            connection.setConnectString("...");
            IDBCommand command = dbFactory.createDBCommand();
            command.setCommandText("...");
            command.setConnection(connection); // 关联性
            IDataReader reader = command.executeReader(); // 关联性
            while (reader.read()) {

            }
            return employeeDAOS;
        }
    }
}
