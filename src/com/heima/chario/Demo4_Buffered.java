package com.heima.chario;

import java.io.*;

public class Demo4_Buffered {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new FileReader("xxx.txt"));
        BufferedWriter  bw = new BufferedWriter(new FileWriter("ccc.txt"));

        String line;

        while ( (line = br.readLine()) != null) {
            bw.write(line);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}
