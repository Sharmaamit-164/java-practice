package set3;

class amit {
    public static void main(String[] args) {
        String[] excelData = {
                "1,240301120301,OMM PRAKASH MOHAPATRA,0,31,240301120332,KRITI RANJAN MALLIK,1",
                "2,240301120302,SANTOSH MOHANTY,0,32,240301120333,SATYA NIRANJAN SAHOO,1",
                "3,240301120303,SURYAJIT PRADHAN,,33,240301120334,KHUSHI SONAR,1",
                "4,240301120304,PRUTHWIRAJ BHUYAN,0,34,240301120335,ARANIKA PRADHAN,1",
                "5,240301120305,ASHUTOSH PRADHAN,0,35,240301120336,ABHISHEK MOHARANA,1",
                "6,240301120306,GOURAGOPAL MOHANTY,1,36,240301120337,SUBHAM BALIARSINGH,1",
                "7,240301120307,DIBYAJYOTI DAS,1,37,240301120338,SONY SOHANY RANI,1",
                "8,240301120308,BALARAM BISWAL,1,38,240301120339,AMIT KUMAR SHARMA,1",
                "9,240301120309,MAMNUR RAJAK,0,39,240301120340,TARUN KUMAR PATRA,0",
                "10,240301120310,SANGRAM PRADHAN,0,40,240301120341,RK SURAJ,1",
                "11,240301120311,MANMATH NAYAK,0,41,240301120342,PRIYANSHU SAHOO,0",
                "12,240301120312,MU8SKAN KUMARI,1,42,240301120343,SUBHAM JYOTI PRADHAN,1",
                "13,240301120313,TANISHA TANMAYEE NAYAK,1,43,240301120344,SIDHANT BISWAL,1",
                "14,240301120314,B BHARATH KUMAR,0,44,240301120345,SMRUTISWARUPA PRIYADARSINI,1",
                "15,240301120315,PRANGYA PARAMITA DAS,1,45,240301120346,RAJENDRA KUMAR SWAIN,1",
                "16,240301120316,MANORANJAN MUDULI,1,46,240301120347,MALLA DHATRI TEJASVI,1",
                "17,240301120317,MONALI JENA,1,47,240301120348,MUSTAK KHAN,0",
                "18,240301120318,BRAJAKISHORE BEHERA,1,48,240301120349,AASTHA JHA,0",
                "19,240301120319,SUBHRANSU SEKHAR SWAIN,1,49,240301120350,YASHI KUMARI,1",
                "20,240301120320,ARCHITA SAHU,1,50,240301120351,OM NARAYAN,1",
                "21,240301120321,ASISH KUMAR NAYAK,1,51,240301120352,SK MAZHAR UL AMIN,0",
                "22,240301120322,SWADHA SAMRIDHI PARIJA,1,52,240301120353,SOUJANYA MOHARANA,1",
                "23,240301120323,JYOTI PRAKASH SAHOO,1,53,240301120354,RABIN SAMANTA,1",
                "24,240301120324,GANNI SAI BHABANI SHANKAR,1,54,240301120355,SATYAJIT DAS,1",
                "25,240301120325,MOHAMMED TAREEF ALAM,0,55,240301120356,ARYAN RANJAN,1",
                "26,240301120326,SUBHAM SWAIN,1,56,240301120357,DHANAPATI LAVANYA KUMARI,1",
                "27,240301120327,SHRUTISHREE PATTNAIK,0,57,240301120358,SIBASARIT PRIYA RANJAN BHUYAN,1",
                "28,240301120328,PRATHAM RAY,1,58,240301120359,SUBHAM DAS,0",
                "29,240301120329,BISWAJIT BHUYAN,0,59,240301120360,RAKESH PRADHAN,1",
                "30,240301120331,ADITYA BARIK,1,,,"
        };

        System.out.println("Students with attendance 0:");
        System.out.println("---------------------------");

        boolean found = false;
        for (String line : excelData) {
            String[] parts = line.split(",");
            // Check first student in the row
            if (parts.length >= 4 && (parts[3].isEmpty() || parts[3].trim().equals("0"))) {
                System.out.println("Sl. No: " + parts[0] + ", Regd.No: " + parts[1] + ", Name: " + parts[2]);
                found = true;
            }
            // Check second student in the row, if present
            if (parts.length >= 8 && (parts[7].isEmpty() || parts[7].trim().equals("0"))) {
                System.out.println("Sl. No: " + parts[4] + ", Regd.No: " + parts[5] + ", Name: " + parts[6]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No students found with attendance 0.");
        }
    }
}