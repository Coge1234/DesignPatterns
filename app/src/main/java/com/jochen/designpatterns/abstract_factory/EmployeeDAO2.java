package com.jochen.designpatterns.abstract_factory;

import java.util.Vector;

/**
 * Created by JoChen on 2020/5/21.
 */
public class EmployeeDAO2 {
    abstract class IDBConnection {
        abstract void setConnectString(String data);
    }

    abstract class IDBConnectionFactory {
        public abstract IDBConnection createDBConnection();
    }

    abstract class IDBCommand {
        abstract void setCommandText(String data);
        abstract void setConnection(IDBConnection connection);
        abstract IDataReader executeReader();
    }

    abstract class IDBCommandFactory {
        public abstract IDBCommand createDBCommand();
    }

    abstract class IDataReader{
        abstract boolean read();
    }
    abstract class IDataReaderFactory {
        public abstract IDataReader createDataReader();
    }
    // 支持MySQL
    class MySqlConnection extends IDBConnection {

        @Override
        void setConnectString(String data) {

        }
    }

    class MySqlConnectionFactory extends IDBConnectionFactory {

        @Override
        public IDBConnection createDBConnection() {
            return new MySqlConnection();
        }
    }

    class MySqlDataReader extends IDataReader {

        @Override
        boolean read() {
            return false;
        }
    }

    class MySqlDataReaderFactory extends IDataReaderFactory {

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
    // 支持Oracle
    class OracleConnectionFactory extends IDBConnectionFactory {

        @Override
        public IDBConnection createDBConnection() {
            return null;
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
    class OracleCommandFactory extends IDBCommandFactory {

        @Override
        public IDBCommand createDBCommand() {
            return null;
        }
    }

    class OracleDataReader extends IDataReader {

        @Override
        boolean read() {
            return false;
        }
    }
    class OracleDataReaderFactory extends IDataReaderFactory {

        @Override
        public IDataReader createDataReader() {
            return null;
        }
    }
    class EmployeeDAO {
        IDBConnectionFactory dbConnectionFactory;
        IDBCommandFactory dbCommandFactory;
        IDataReaderFactory dataReaderFactory;
        public Vector<EmployeeDAO> getEmployees() {
            Vector<EmployeeDAO> employeeDAOS = null;
            IDBConnection connection = dbConnectionFactory.createDBConnection();
            connection.setConnectString("...");
            IDBCommand command = dbCommandFactory.createDBCommand();
            command.setCommandText("...");
            command.setConnection(connection); // 关联性
            MySqlDataReader reader = (MySqlDataReader) command.executeReader(); // 关联性
            while (reader.read()) {

            }
            return employeeDAOS;
        }
    }
}
