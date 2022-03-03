package ikiliAgac;

public class Agac {

    Dugum kok;
    
    public Agac() {
        kok = null;
    }

    public void Ekle(Dugum yeni) {
        Dugum tmp = kok;
        Dugum once = null;
        while (tmp != null) {
            once = tmp;
            if (yeni.icerik < tmp.icerik) {
                tmp = tmp.sol;
            } else {
                tmp = tmp.sag;
            }
        }
        if (once == null) {
            kok = yeni;
        } else if (yeni.icerik < once.icerik) {
            once.sol = yeni;
        } else {
            once.sag = yeni;
        }
    }

    Dugum arama(int aranan) {
        Dugum tmp = kok;
        while (tmp != null) {
            if (tmp.icerik == aranan) {
                return tmp;
            } else if (aranan < tmp.icerik) {
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
        System.out.println(kok.icerik);
        oncekok(kok.sol);
        oncekok(kok.sag);
    }
    //postorder sol sag kok

    public void sonrakok(Dugum kok) {
        if (kok == null) {
            return;
        }
        oncekok(kok.sol);
        oncekok(kok.sag);
        System.out.println(kok.icerik);
    }
    //inorder sol kok sag

    public void ortakok(Dugum kok) {
        if (kok == null) {
            return;
        }
        oncekok(kok.sol);
        System.out.println(kok.icerik);
        oncekok(kok.sag);
    }

    public void sil(int icerik) {
        kok = silOz(kok, icerik);
    }

    Dugum silOz(Dugum kok, int icerik) {
        if (kok == null) {
            return kok;
        }
        if (icerik < kok.icerik) {
            kok.sol = silOz(kok.sol, icerik);
        } else if (icerik > kok.icerik) {
            kok.sag = silOz(kok.sag, icerik);
        } else {
            if (kok.sol == null) {
                return kok.sag;
            } else if (kok.sag == null) {
                return kok.sol;
            }
            kok.icerik = minValue(kok.sag);
            kok.sag = silOz(kok.sag, kok.icerik);

        }
        return kok;
    }

    int minValue(Dugum kok) {
        int minv = kok.icerik;
        while (kok.sol != null) {
            minv = kok.sol.icerik;
            kok = kok.sol;
        }
        return minv;
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
            /* compute  height of each subtree */
            int lheight = height(kok.sol);
            int rheight = height(kok.sag);
            /* use the larger one */
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

            System.out.print(kok.icerik + " ");
        } else if (level > 1) {
            printGivenLevel(kok.sol, level - 1);
            printGivenLevel(kok.sag, level - 1);

        }
    }
    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // A utility function to right rotate subtree rooted with y 
    // See the diagram given above. 

}
