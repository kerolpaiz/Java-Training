public class HuaweiModem implements modem {
                public boolean open() {

                             // implementation
                            return true;
                     }

                     public boolean close() {

                             // implementation
                            return false;
                     }

                     public int read() {

                             // implementation
                            return 2;
                     }

                     public int write() {

                             // implementation
                            return 3;
                     }
                

    public static void main (String args[]){
    modem modem = new HuaweiModem();
    modem.open();
    modem.write();
    modem.read();
    modem.close();
    }
}
