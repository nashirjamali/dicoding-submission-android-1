package com.example.motor;

import java.util.ArrayList;

public class dataBuah {

    private static String[] namabuah = {
            "All New Supra GTR150","Honda Genio","BeAT eSP","PCX Hybrid","Forza","CBR 150 R","Revo X", "Supra X 125","BeAt Street eSP","ALL NEW SOUL GT AKS SSS","MIO S SMART","X-RIDE 125","MIO Z"
    };
    private static String[] descbuah = {
            "Tipe Mesin\t4-Langkah, DOHC, 4 Katup\n" +
                    "Kapasitas Mesin\t149,16 cc\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI\n" +
                    "Diameter X Langkah\t57,3 x 57,8 mm\n" +
                    "Tipe Tranmisi\tManual, 6 Kecepatan\n" +
                    "Rasio Kompresi\t11,3:1",
            "Tipe Mesin\t4 – Langkah, SOHC, eSP\n" +
                    "Sistem Suplai Bahan Bakar\tPGM – FI ( Programmed Fuel Injection )\n" +
                    "Diameter X Langkah\t47,0 x 63,1 mm\n" +
                    "Tipe Tranmisi\tAutomatic, V-Matic\n" +
                    "Rasio Kompresi\t10,0 : 1\n" +
                    "Daya Maksimum\t6,6 kW ( 9,0 PS ) / 7.500 rpm\n" +
                    "Torsi Maksimum\t9,3 Nm ( 0,95 kgf.m ) / 5.500 rpm\n" +
                    "Tipe Starter\tElektrik dan Kick Starter\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type",
            "Tipe Mesin\t4 Langkah, SOHC dengan Pendinginan Udara, eSP\n" +
                    "Volume Langkah\t108,2 cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi (PGM-FI)\n" +
                    "Diameter X Langkah\t50 x 55,1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t9,5 : 1\n" +
                    "Daya Maksimum\t6,38 KW (8,68 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9,01 N.m (0,92 kgf.m)/6.500 rpm\n" +
                    "Tipe Starter\tACG Starter, Pedal & Elektrik\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering",
            "Tipe Mesin\t4 Langkah, SOHC, PGM-FI, berpendingin cairan, eSP\n" +
                    "Kapasitas Mesin\t149,3 cc\n" +
                    "Diameter X Langkah\t57,3 x 57,9 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t10,6:1\n" +
                    "Daya Maksimum\t10,8 kW (14,7 PS) / 8.500 rpm (Mesin), 1,4 KW / 3.000 rpm (Motor)\n" +
                    "Torsi Maksimum\t13,2 N.m (1,35 kgf.m) / 6.500 rpm (Mesin), 4,3 N.m / 3.000 rpm (Motor)\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering",
            "Tipe Mesin\tPendinginan Cairan, 4 Langkah, single cylinder\n" +
                    "Volume Langkah\t249,01 cc\n" +
                    "Sistem Suplai Bahan Bakar\tFuel Injection (PGM-FI)\n" +
                    "Diameter X Langkah\t68 x 68,567 mm\n" +
                    "Tipe Tranmisi\tOtomatis\n" +
                    "Rasio Kompresi\t10,2 : 1\n" +
                    "Daya Maksimum\t17,3 kW / 7500 rpm\n" +
                    "Torsi Maksimum\t24 Nm / 6250 rpm\n" +
                    "Tipe Starter\tElektrik\n" +
                    "Tipe Kopling\tAutomatic Centrifugal Clutch Dry Type\n" +
                    "Sistem Pendingin Mesin\tPendinginan Cairan",
            "Tipe Mesin\t4-Langkah, DOHC - 4 Katup\n" +
                    "Kapasitas Mesin\t149,16 cc\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI\n" +
                    "Diameter X Langkah\t57,3 x 57,8 mm\n" +
                    "Tipe Tranmisi\tManual, 6 kecepatan\n" +
                    "Rasio Kompresi\t11,3 : 1\n" +
                    "Daya Maksimum\t12,6 kW (17,1 PS / 9.000 rpm )\n" +
                    "Torsi Maksimum\t14,4 Nm (1.47 kgf.m / 7.000 rpm )\n" +
                    "Tipe Starter\tElektric Starter\n" +
                    "Tipe Kopling\tWet\n" +
                    "Sistem Pendingin Mesin\tLiquid Cooled with Auto FAn\n" +
                    "Pola Perpindahan Gigi\t1-N-2-3-4-5-6",
            "Tipe Mesin\tSOHC, 4 Langkah, SOHC, Silinder Tunggal\n" +
                    "Kapasitas Mesin\t109,17 cm3\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi/PGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t50 x 55,6 mm\n" +
                    "Tipe Tranmisi\t4 Kecepatan\n" +
                    "Rasio Kompresi\t9,3:1\n" +
                    "Daya Maksimum\t6,56kW (8,91 PS) / 7.500 rpm\n" +
                    "Torsi Maksimum\t8,76 Nm (0,86 kgf.m) / 6.000 rpm\n" +
                    "Tipe Starter\tStarter Kaki & Starter Elektrik\n" +
                    "Tipe Kopling\tMultiplate Wet Clutch with Diaphrgam Spring\n" +
                    "Sistem Pendingin Mesin\tPendingin Udara\n" +
                    "Pola Perpindahan Gigi\tN-1-2-3-4-N",
            "Tipe Mesin\t4-Langkah, SOHC, Silinder Tunggal\n" +
                    "Kapasitas Mesin\t124,89 cc\n" +
                    "Sistem Suplai Bahan Bakar\tPGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t52,4 x 57,9 mm\n" +
                    "Tipe Tranmisi\t4 Speed, Rotary\n" +
                    "Rasio Kompresi\t9,3:1\n" +
                    "Daya Maksimum\t7,40 kW (10,1 PS) / 8.000 rpm\n" +
                    "Torsi Maksimum\t9,30 Nm (0,95 kgf.m) / 4.000 rpm\n" +
                    "Tipe Starter\tStarter Kaki dan Elektrik\n" +
                    "Tipe Kopling\tMultiplate Wet Clutch with Coil Spring\n" +
                    "Sistem Pendingin Mesin\tPendingin Udara\n" +
                    "Pola Perpindahan Gigi\tN-1-2-3-4-N",
            "Tipe Mesin\t4 Langkah, SOHC dengan Pendinginan Udara, eSP\n" +
                    "Volume Langkah\t108,2 cc\n" +
                    "Sistem Suplai Bahan Bakar\tInjeksi/PGM-FI (Programmed Fuel Injection)\n" +
                    "Diameter X Langkah\t50 x 55,1 mm\n" +
                    "Tipe Tranmisi\tOtomatis, V-Matic\n" +
                    "Rasio Kompresi\t9,5 : 1\n" +
                    "Daya Maksimum\t6,38 KW (8,68 PS)/7.500 rpm\n" +
                    "Torsi Maksimum\t9,01 N.m (0,92 kgf.m)/6.500 rpm\n" +
                    "Tipe Starter\tACG Starter, Pedal & Elektrik\n" +
                    "Tipe Kopling\tOtomatis, Sentrifugal, Tipe Kering",

            "Kapasitas Mesin\t125cc\n" +
                    "Kapasitas Oli Mesin\tTotal = 0,84 L ; Berkala = 0,80 L Ganti Filter Oli = 0,80 L\n" +
                    "Sistem Bahan Bakar\tFuel Injection\n" +
                    "Tipe Kopling\tKering, Centrifugal automatic\n" +
                    "Tipe Transmisi\tV-belt automatic\n" +
                    "Tipe Mesin\tAir cooled 4-stroke, SOHC\n" +
                    "Jumlah / Posisi Silinder\tSingle cylinder\n" +
                    "Diameter x Langkah\t52,4 mm x 57,9 mm\n" +
                    "Perbandingan Kompresi\t9,5 : 1\n" +
                    "Daya Maksimum\t7.0 kW / 8000rpm\n" +
                    "Torsi Maksimum\t9.6 Nm / 5500rpm\n" +
                    "Sistem starter\tElectric & Kick starter\n" +
                    "Sistem Pelumasan\tBasah",
            "TIPE MESIN\tAir cooled, 4-stroke, SOHC\n" +
                    "SUSUNAN SILINDER\tSingle cylinder\n" +
                    "DIAMETER X LANGKAH\t52,4 x 57,9 mm\n" +
                    "PERBANDINGAN KOMPRESI\t9,5 : 1\n" +
                    "VOLUME SILINDER\t125cc\n" +
                    "DAYA MAKSIMUM\t7.0kW/8000rpm\n" +
                    "TORSI MAKSIMUM\t9.6N.m/5500rpm\n" +
                    "SISTEM STARTER\tElectric & Kick Starter\n" +
                    "SISTEM PELUMASAN\tWet sump\n" +
                    "KAPASITAS OLI MESIN\tTotal = 0.84 L ; Berkala = 0.80 L\n" +
                    "SISTEM BAHAN BAKAR\tFuel Injection\n" +
                    "TIPE KOPLING\tDry, Centrifugal Automatic\n" +
                    "TIPE TRANSMISI\tV-belt automatic",
            "TIPE MESIN\t4 Langkah, 2 Valve SOHC, Berpendingin Angin, Bluecore\n" +
                    "SUSUNAN SILINDER\tCylinder Tunggal\n" +
                    "DIAMETER X LANGKAH\t52,4 x 57,9 mm\n" +
                    "PERBANDINGAN KOMPRESI\t9,5 : 1\n" +
                    "VOLUME SILINDER\t125 cc\n" +
                    "DAYA MAKSIMUM\t7,0 Kw / 8000 rpm\n" +
                    "TORSI MAKSIMUM\t9,6 N.m / 5500 rpm\n" +
                    "SISTEM STARTER\tElectric Starter & kick starter\n" +
                    "SISTEM PELUMASAN\tWet sump\n" +
                    "KAPASITAS OLI MESIN\tTotal : 0,84 L ; Berkala : 0,80 L ; Ganti Filter Oli : 0,80 L\n" +
                    "SISTEM BAHAN BAKAR\tFuel Injection\n" +
                    "TIPE KOPLING\tDry Centrifugal Clucth\n" +
                    "TIPE TRANSMISI\tFull Automatic",
            "TIPE MESIN\tAir cooled 4-stroke, SOHC\n" +
                    "SUSUNAN SILINDER\tSingle Cylinder\n" +
                    "DIAMETER X LANGKAH\t52,4 x 57,9 mm\n" +
                    "PERBANDINGAN KOMPRESI\t9,5 : 1\n" +
                    "VOLUME SILINDER\t125 cc\n" +
                    "DAYA MAKSIMUM\t7.0 kW / 8000 rpm\n" +
                    "TORSI MAKSIMUM\t9.6 Nm / 5500 rpm\n" +
                    "SISTEM STARTER\tElectric & kick starter\n" +
                    "SISTEM PELUMASAN\tWet sump\n" +
                    "KAPASITAS OLI MESIN\tTotal = 0,84 L ; Berkala = 0,80 L\n" +
                    "SISTEM BAHAN BAKAR\tFuel Injection\n" +
                    "TIPE KOPLING\tDry, Centrifugal Automatic\n" +
                    "TIPE TRANSMISI\tV-belt automatic"
    };
    private static String[] asalbuah = {
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Honda",
            "Yamaha",
            "Yamaha",
            "Yamaha",
            "Yamaha"
    };
    private static String[] vitamin = {
            "23.435.000",
            "17.700.000",
            "16.068.000",
            "42.139.000",
            "81.950.000",
            "28.581.000",
            "16.168.000",
            "17.680.000",
            "16.793.000",
            "17.800.000",
            "16.460.000",
            "18,190,000",
            "15.800.000"
    };
    private static int[] gambar = {
            R.drawable.apel,
            R.drawable.semangka,
            R.drawable.durian,
            R.drawable.jeruk,
            R.drawable.nanas,
            R.drawable.rambutan,
            R.drawable.melon,
            R.drawable.mangga,
            R.drawable.pepaya,
            R.drawable.anggur,
            R.drawable.alpukat,
            R.drawable.stroberi,
            R.drawable.kiwi
    };
    static ArrayList<buah> getListData() {
        ArrayList<buah> list = new ArrayList<>();
        for (int position = 0; position < namabuah.length; position++) {
            buah buahs = new buah();
            buahs.setNama(namabuah[position]);
            buahs.setDesc(descbuah[position]);
            buahs.setGambar(gambar[position]);
            buahs.setAsal(asalbuah[position]);
            buahs.setVitamin(vitamin[position]);
            list.add(buahs);
        }
        return list;
    }
}
