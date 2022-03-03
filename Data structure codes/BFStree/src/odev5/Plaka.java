package odev5;

public class Plaka {

    Dugum kok;
    int SehirNo[] = new int[81];
    String SehirAdi[] = new String[81];
    double SehirEnlem[] = new double[81];
    double SehirBoylam[] = new double[81];

    Plaka() {
        kok = null;
    }

    public void Tileri() {

        SehirNo[0] = 01;
        SehirAdi[0] = "Adana";
        SehirEnlem[0] = 37;
        SehirBoylam[0] = 35.321333;
        SehirNo[1] = 02;
        SehirAdi[1] = "Adıyaman";
        SehirEnlem[1] = 37.764751;
        SehirBoylam[1] = 38.278561;
        SehirNo[2] = 03;
        SehirAdi[2] = "Afyon";
        SehirEnlem[2] = 38.750714;
        SehirBoylam[2] = 30.556692;
        SehirNo[3] = 04;
        SehirAdi[3] = "Ağrı";
        SehirEnlem[3] = 39.626922;
        SehirBoylam[3] = 43.021596;
        SehirNo[4] = 05;
        SehirAdi[4] = "Amasya";
        SehirEnlem[4] = 40.64991;
        SehirBoylam[4] = 35.83532;
        SehirNo[5] = 06;
        SehirAdi[5] = "Ankara";
        SehirEnlem[5] = 39.92077;
        SehirBoylam[5] = 32.85411;
        SehirNo[6] = 07;
        SehirAdi[6] = "Antalya";
        SehirEnlem[6] = 36.88414;
        SehirBoylam[6] = 30.70563;
        SehirNo[7] = 8;
        SehirAdi[7] = "Artvin";
        SehirEnlem[7] = 41.18277;
        SehirBoylam[7] = 41.818292;
        SehirNo[8] = 9;
        SehirAdi[8] = "Aydın";
        SehirEnlem[8] = 37.856041;
        SehirBoylam[8] = 27.841631;
        SehirNo[9] = 10;
        SehirAdi[9] = "Balıkesir";
        SehirEnlem[9] = 39.648369;
        SehirBoylam[9] = 27.88261;
        SehirNo[10] = 11;
        SehirAdi[10] = "Bilecik";
        SehirEnlem[10] = 40.056656;
        SehirBoylam[10] = 30.066524;
        SehirNo[11] = 12;
        SehirAdi[11] = "Bingöl";
        SehirEnlem[11] = 39.062635;
        SehirBoylam[11] = 40.76961;
        SehirNo[12] = 13;
        SehirAdi[12] = "Bitlis";
        SehirEnlem[12] = 38.393799;
        SehirBoylam[12] = 42.12318;
        SehirNo[13] = 14;
        SehirAdi[13] = "Bolu";
        SehirEnlem[13] = 40.575977;
        SehirBoylam[13] = 31.578809;
        SehirNo[14] = 15;
        SehirAdi[14] = "Burdur";
        SehirEnlem[14] = 37.461267;
        SehirBoylam[14] = 30.066524;
        SehirNo[15] = 16;
        SehirAdi[15] = "Bursa";
        SehirEnlem[15] = 40.266864;
        SehirBoylam[15] = 29.063448;
        SehirNo[16] = 17;
        SehirAdi[16] = "Çanakkale";
        SehirEnlem[16] = 40.155312;
        SehirBoylam[16] = 26.41416;
        SehirNo[17] = 18;
        SehirAdi[17] = "Çankırı";
        SehirEnlem[17] = 40.601343;
        SehirBoylam[17] = 33.613421;
        SehirNo[18] = 19;
        SehirAdi[18] = "Çorum";
        SehirEnlem[18] = 40.550556;
        SehirBoylam[18] = 34.955556;
        SehirNo[19] = 20;
        SehirAdi[19] = "Denizli";
        SehirEnlem[19] = 37.77652;
        SehirBoylam[19] = 29.08639;
        SehirNo[20] = 21;
        SehirAdi[20] = "Diyarbakır";
        SehirEnlem[20] = 37.91441;
        SehirBoylam[20] = 40.230629;
        SehirNo[21] = 22;
        SehirAdi[21] = "Edirne";
        SehirEnlem[21] = 41.681808;
        SehirBoylam[21] = 26.562269;
        SehirNo[22] = 23;
        SehirAdi[22] = "Elazığ";
        SehirEnlem[22] = 38.680969;
        SehirBoylam[22] = 39.226398;
        SehirNo[23] = 24;
        SehirAdi[23] = "Erzincan";
        SehirEnlem[23] = 39.75;
        SehirBoylam[23] = 39.5;
        SehirNo[24] = 25;
        SehirAdi[24] = "Erzurum";
        SehirEnlem[24] = 39.9;
        SehirBoylam[24] = 41.27;
        SehirNo[25] = 26;
        SehirAdi[25] = "Eskişehir";
        SehirEnlem[25] = 39.776667;
        SehirBoylam[25] = 30.520556;
        SehirNo[26] = 27;
        SehirAdi[26] = "Gaziantep";
        SehirEnlem[26] = 37.06622;
        SehirBoylam[26] = 37.38332;
        SehirNo[27] = 28;
        SehirAdi[27] = "Giresun";
        SehirEnlem[27] = 40.912811;
        SehirBoylam[27] = 38.38953;
        SehirNo[28] = 29;
        SehirAdi[28] = "Gümüşhane";
        SehirEnlem[28] = 40.438588;
        SehirBoylam[28] = 39.508556;
        SehirNo[29] = 30;
        SehirAdi[29] = "Hakkari";
        SehirEnlem[29] = 37.583333;
        SehirBoylam[29] = 43.733333;
        SehirNo[30] = 31;
        SehirAdi[30] = "Hatay";
        SehirEnlem[30] = 36.401849;
        SehirBoylam[30] = 36.34981;
        SehirNo[31] = 32;
        SehirAdi[31] = "Isparta";
        SehirEnlem[31] = 37.764771;
        SehirBoylam[31] = 30.556561;
        SehirNo[32] = 33;
        SehirAdi[32] = "İçel";
        SehirEnlem[32] = 3;
        SehirBoylam[32] = 6; ///
        SehirNo[33] = 34;
        SehirAdi[33] = "İstanbul";
        SehirEnlem[33] = 41.00527;
        SehirBoylam[33] = 28.97696;
        SehirNo[34] = 35;
        SehirAdi[34] = "İzmir";
        SehirEnlem[34] = 38.41885;
        SehirBoylam[34] = 27.12872;
        SehirNo[35] = 36;
        SehirAdi[35] = "Kars";
        SehirEnlem[35] = 40.616667;
        SehirBoylam[35] = 43.1;
        SehirNo[36] = 37;
        SehirAdi[36] = "Kastamonu";
        SehirEnlem[36] = 41.38871;
        SehirBoylam[36] = 33.78273;
        SehirNo[37] = 38;
        SehirAdi[37] = "Kayseri";
        SehirEnlem[37] = 38.73122;
        SehirBoylam[37] = 35.478729;
        SehirNo[38] = 39;
        SehirAdi[38] = "Kırklareli";
        SehirEnlem[38] = 39.846821;
        SehirBoylam[38] = 33.515251;
        SehirNo[39] = 40;
        SehirAdi[39] = "Kırşehir";
        SehirEnlem[39] = 39.14249;
        SehirBoylam[39] = 34.17091;
        SehirNo[40] = 41;
        SehirAdi[40] = "Kocaeli";
        SehirEnlem[40] = 40.85327;
        SehirBoylam[40] = 29.88152;
        SehirNo[41] = 42;
        SehirAdi[41] = "Konya";
        SehirEnlem[41] = 37.866667;
        SehirBoylam[41] = 32.483333;
        SehirNo[42] = 43;
        SehirAdi[42] = "Kütahya";
        SehirEnlem[42] = 39.416667;
        SehirBoylam[42] = 29.983333;
        SehirNo[43] = 44;
        SehirAdi[43] = "Malatya";
        SehirEnlem[43] = 38.35519;
        SehirBoylam[43] = 38.30946;
        SehirNo[44] = 45;
        SehirAdi[44] = "Manisa";
        SehirEnlem[44] = 38.619099;
        SehirBoylam[44] = 27.428921;
        SehirNo[45] = 46;
        SehirAdi[45] = "Kahramanmaraş";
        SehirEnlem[45] = 37.585831;
        SehirBoylam[45] = 36.937149;
        SehirNo[46] = 47;
        SehirAdi[46] = "Mardin";
        SehirEnlem[46] = 37.321163;
        SehirBoylam[46] = 40.724477;
        SehirNo[47] = 48;
        SehirAdi[47] = "Muğla";
        SehirEnlem[47] = 37.215278;
        SehirBoylam[47] = 28.363611;
        SehirNo[48] = 49;
        SehirAdi[48] = "Muş";
        SehirEnlem[48] = 38.946189;
        SehirBoylam[48] = 41.753893;
        SehirNo[49] = 50;
        SehirAdi[49] = "Nevşehir";
        SehirEnlem[49] = 38.69394;
        SehirBoylam[49] = 34.685651;
        SehirNo[50] = 51;
        SehirAdi[50] = "Niğde";
        SehirEnlem[50] = 37.966667;
        SehirBoylam[50] = 34.683333;
        SehirNo[51] = 52;
        SehirAdi[51] = "Ordu";
        SehirEnlem[51] = 40.983879;
        SehirBoylam[51] = 37.876411;
        SehirNo[52] = 53;
        SehirAdi[52] = "Rize";
        SehirEnlem[52] = 41.02005;
        SehirBoylam[52] = 40.523449;
        SehirNo[53] = 54;
        SehirAdi[53] = "Sakarya";
        SehirEnlem[53] = 40.693997;
        SehirBoylam[53] = 30.435763;
        SehirNo[54] = 55;
        SehirAdi[54] = "Samsun";
        SehirEnlem[54] = 41.292782;
        SehirBoylam[54] = 36.33128;
        SehirNo[55] = 56;
        SehirAdi[55] = "Siirt";
        SehirEnlem[55] = 37.933333;
        SehirBoylam[55] = 41.95;
        SehirNo[56] = 57;
        SehirAdi[56] = "Sinop";
        SehirEnlem[56] = 42.02314;
        SehirBoylam[56] = 35.153069;
        SehirNo[57] = 58;
        SehirAdi[57] = "Sivas";
        SehirEnlem[57] = 39.747662;
        SehirBoylam[57] = 37.017879;
        SehirNo[58] = 59;
        SehirAdi[58] = "Tekirdağ";
        SehirEnlem[58] = 40.983333;
        SehirBoylam[58] = 27.516667;
        SehirNo[59] = 60;
        SehirAdi[59] = "Tokat";
        SehirEnlem[59] = 40.316667;
        SehirBoylam[59] = 36.55;
        SehirNo[60] = 61;
        SehirAdi[60] = "Trabzon";
        SehirEnlem[60] = 41.00145;
        SehirBoylam[60] = 39.7178;
        SehirNo[61] = 62;
        SehirAdi[61] = "Tunceli";
        SehirEnlem[61] = 39.307355;
        SehirBoylam[61] = 39.438778;
        SehirNo[62] = 63;
        SehirAdi[62] = "Şanlıurfa";
        SehirEnlem[62] = 37.159149;
        SehirBoylam[62] = 38.796909;
        SehirNo[63] = 64;
        SehirAdi[63] = "Uşak";
        SehirEnlem[63] = 38.682301;
        SehirBoylam[63] = 29.40819;
        SehirNo[64] = 65;
        SehirAdi[64] = "Van";
        SehirEnlem[64] = 38.48914;
        SehirBoylam[64] = 43.40889;
        SehirNo[65] = 66;
        SehirAdi[65] = "Yozgat";
        SehirEnlem[65] = 39.818081;
        SehirBoylam[65] = 34.81469;
        SehirNo[66] = 67;
        SehirAdi[66] = "Zonguldak";
        SehirEnlem[66] = 41.456409;
        SehirBoylam[66] = 31.798731;
        SehirNo[67] = 68;
        SehirAdi[67] = "Aksaray";
        SehirEnlem[67] = 38.36869;
        SehirBoylam[67] = 34.03698;
        SehirNo[68] = 69;
        SehirAdi[68] = "Bayburt";
        SehirEnlem[68] = 40.255169;
        SehirBoylam[68] = 40.22488;
        SehirNo[69] = 70;
        SehirAdi[69] = "Karaman";
        SehirEnlem[69] = 37.17593;
        SehirBoylam[69] = 33.228748;
        SehirNo[70] = 71;
        SehirAdi[70] = "Kırıkkale";
        SehirEnlem[70] = 39.846821;
        SehirBoylam[70] = 33.515251;
        SehirNo[71] = 72;
        SehirAdi[71] = "Batman";
        SehirEnlem[71] = 37.881168;
        SehirBoylam[71] = 41.13509;
        SehirNo[72] = 73;
        SehirAdi[72] = "Şırnak";
        SehirEnlem[72] = 37.418748;
        SehirBoylam[72] = 42.491834;
        SehirNo[73] = 74;
        SehirAdi[73] = "Bartın";
        SehirEnlem[73] = 41.581051;
        SehirBoylam[73] = 32.460979;
        SehirNo[74] = 75;
        SehirAdi[74] = "Ardahan";
        SehirEnlem[74] = 41.110481;
        SehirBoylam[74] = 42.702171;
        SehirNo[75] = 76;
        SehirAdi[75] = "Iğdır";
        SehirEnlem[75] = 39.887984;
        SehirBoylam[75] = 44.004836;
        SehirNo[76] = 77;
        SehirAdi[76] = "Yalova";
        SehirEnlem[76] = 40.65;
        SehirBoylam[76] = 29.266667;
        SehirNo[77] = 78;
        SehirAdi[77] = "Karabük";
        SehirEnlem[77] = 41.2061;
        SehirBoylam[77] = 32.62035;
        SehirNo[78] = 79;
        SehirAdi[78] = "Kilis";
        SehirEnlem[78] = 36.718399;
        SehirBoylam[78] = 37.12122;
        SehirNo[79] = 80;
        SehirAdi[79] = "Osmaniye";
        SehirEnlem[79] = 37.213026;
        SehirBoylam[79] = 36.176261;
        SehirNo[80] = 81;
        SehirAdi[80] = "Düzce";
        SehirEnlem[80] = 40.843849;
        SehirBoylam[80] = 31.15654;

    }

    public void Ekle(Dugum yeni) {
        Dugum tmp = kok;
        Dugum once = null;
        while (tmp != null) {
            once = tmp;
            if (yeni.SehirNo < tmp.SehirNo) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }

        }
        if (once == null) {
            kok = yeni;
        } else if (yeni.SehirNo < once.SehirNo) {
            once.sol = yeni;
        } else {
            once.sag = yeni;
        }
    }

    public void sil(int icerik) {

        kok = silOz(kok, icerik);
    }

    Dugum silOz(Dugum kok, int icerik) {
        if (kok == null) {
            return kok;
        }

        if (icerik < kok.SehirNo) {
            kok.sol = silOz(kok.sol, icerik);
        } else if (icerik > kok.SehirNo) {
            kok.sag = silOz(kok.sag, icerik);
        } else {

            if (kok.sol == null) {
                return kok.sag;
            } else if (kok.sag == null) {
                return kok.sol;
            }

            kok.SehirNo = minValue(kok.sag);

            kok.sag = silOz(kok.sag, kok.SehirNo);

        }
        return kok;
    }

    int minValue(Dugum kok) {
        int minv = kok.SehirNo;
        while (kok.sol != null) {
            minv = kok.sol.SehirNo;
            kok = kok.sol;
        }
        return minv;
    }

    Dugum arama(int aranan) {
        Dugum tmp = kok;
        while (tmp != null) {
            if (tmp.SehirNo == aranan) {
                return tmp;
            } else if (aranan < tmp.SehirNo) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }

        }
        return null;
    }

    //preorder kok sol sag
    public void oncekok(Dugum kok) {
        if (kok == null) {
            return;
        }
        System.out.println(kok.SehirNo);
        oncekok(kok.sol);
        oncekok(kok.sag);

    }
    //postorder sol sag kok

    public void sonrakok(Dugum kok) {
        if (kok == null) {
            return;
        }
        sonrakok(kok.sol);
        sonrakok(kok.sag);
        System.out.println(kok.SehirNo);

    }
    //inorder sol kok sag

    public void ortakok(Dugum kok) {
        if (kok == null) {
            return;
        }
        ortakok(kok.sol);
        System.out.println(kok.SehirNo);
        ortakok(kok.sag);

    }

    void printLevelOrder() {
        int h = height(kok);
        int i = 0;
        for (i = 1; i <= h; i++) {
            printGivenLevel(kok, i);
            System.out.println();
        }
    }

    int height(Dugum kok) {
        if (kok == null) {
            return 0;
        } else {

            int lheight = height(kok.sol);
            int rheight = height(kok.sag);

            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    void printGivenLevel(Dugum kok, int level) {
        if (kok == null) {
            return;
        }
        if (level == 1) {
            System.out.print(kok.SehirNo + " " + kok.SehirAdi + "  ");
        } else if (level > 1) {
            printGivenLevel(kok.sol, level - 1);
            printGivenLevel(kok.sag, level - 1);
        }

    }

    public void indisleme(int indis) {
        Tileri();
        siralama(indis);

    }

    public void siralama(int Sehir) {
        Plaka t1 = new Plaka();
        Plaka t2 = new Plaka();

        t1.kok = sortedArrayToBST(SehirNo, 0, Sehir - 2);
        t2.kok = sortedArrayToBST(SehirNo, Sehir, SehirNo.length - 1);

        kok = new Dugum(SehirNo[Sehir - 1], SehirAdi[Sehir - 1], SehirEnlem[Sehir - 1], SehirBoylam[Sehir - 1]);

        kok.sag = t2.kok;
        kok.sol = t1.kok;

    }

    Dugum sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Dugum node = new Dugum(SehirNo[mid], SehirAdi[mid], SehirEnlem[mid], SehirBoylam[mid]);

        node.sol = sortedArrayToBST(arr, start, mid - 1);
        node.sag = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }

    public void guncelle(int yeniIndis) {
        System.out.println("Sahir güncelledi");
        indisleme(yeniIndis);
    }

    boolean AgacDengliMi(Dugum dugum) {
        int lh;
        int rh;
        if (dugum == null) {
            return true;
        }

        lh = height(dugum.sol);
        rh = height(dugum.sag);

        if (Math.abs(lh - rh) <= 1
                && AgacDengliMi(dugum.sol)
                && AgacDengliMi(dugum.sag)) {
            return true;
        }

        return false;
    }

    boolean AgacIkiliMi() {
        return IkiliAgac(kok, Integer.MIN_VALUE,
                Integer.MAX_VALUE);
    }

    boolean IkiliAgac(Dugum node, int min, int max) {

        if (node == null) {
            return true;
        }

        if (node.SehirNo < min || node.SehirNo > max) {
            return false;
        }

        return (IkiliAgac(node.sol, min, node.SehirNo - 1)
                && IkiliAgac(node.sag, node.SehirNo + 1, max));
    }

}
