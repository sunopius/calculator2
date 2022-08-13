import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String inputString = reader.readLine();
            System.out.println(calc(inputString));
        }

        public static String calc(String input) throws IOException {
            String result="";
            String[] data =input.split(" ");
            int rum1=0, rum2=0; String itk="0";
            Rim[] values =Rim.values();
            int length =data.length;
            if (length>3){ throw new IOException();}

            switch (data[0]){
                case("I"):{rum1=1; break;}
                case("II"):{rum1=2; break;}
                case("III"):{rum1=3;break;}
                case("IV"):{rum1=4;break;}
                case("V"):{rum1=5;break;}
                case("VI"):{rum1=6;break;}
                case("VII"):{rum1=7;break;}
                case("VIII"):{rum1=8;break;}
                case("IX"):{rum1=9;break;}
                case("X"):{rum1=10;break;}
            }
            if (rum1>0) { switch (data[2]){
                case("I"):{rum2=1; break;}
                case("II"):{rum2=2; break;}
                case("III"):{rum2=3;break;}
                case("IV"):{rum2=4;break;}
                case("V"):{rum2=5;break;}
                case("VI"):{rum2=6;break;}
                case("VII"):{rum2=7;break;}
                case("VIII"):{rum2=8;break;}
                case("IX"):{rum2=9;break;}
                case("X"):{rum2=10;break;}
            }}
            if (rum2>0) { switch (data[1]){
                case("+"):{result= String.valueOf(rum1+rum2); break; }
                case("/"):{result= String.valueOf(rum1/rum2); break; }
                case("*"):{result= String.valueOf(rum1*rum2); break; }
                case("-"):{result= String.valueOf(rum1-rum2); break; }
            } if(result.equals(itk)) { throw new IOException();}
                result = values[Integer.parseInt(result)].toString();}
            if (rum2==0) {
                int z=Integer.parseInt(data[0]);
                int x=Integer.parseInt(data[2]);
                if (z>10||z<1&&x>10||x<1) { throw new IOException();}

                switch (data[1]) {
                    case("+"):{result= String.valueOf(z+x); break; }
                    case("/"):{result= String.valueOf(z/x); break; }
                    case("*"):{result= String.valueOf(z*x); break; }
                    case("-"):{result= String.valueOf(z-x); break; }
                }}

            return result;
        }}
