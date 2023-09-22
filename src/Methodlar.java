import java.util.*;

public class Methodlar {
    static Scanner scan = new Scanner(System.in);
    Pojo obj1;
    static Map<Integer,Pojo> mapList = new HashMap<>();
    static Integer id=1000;
    public Methodlar(){
        obj1=new Pojo();
    }
    int guncelmiktar = 0;

    public static void anaMenu () throws InterruptedException {
        String tercih="";


        do {


            System.out.println("----------HOŞGELDİNİZ----------");
            System.out.println("===========QA-03===========\n" +
                    "======DEPO YÖNETİMİ ANA MENU========\n" +
                    "\t  1- ÜRÜN TANIMLAMA\n" +
                    "\t  2- ÜRÜN LİSTELEME\n" +
                    "\t  3- ÜRÜN GİRİŞİ   \n" +
                    "\t  4- ÜRÜN RAFA KOYMA   \n" +
                    "\t  5- ÜRÜN ÇIKIŞI \n" +
                    "\t  0- SİSTEMDEN ÇIKIŞ   \n");

            System.out.println("Lütfen bir işlem seçiniz");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1": //ürün tanımlama
                    urunTanimlama();
                    break;
                case "2": // ürün listeleme
                    urunListeleme();
                    break;
                case "3": // ürün girişi
                    urunGirisi();
                    break;
                case "4": // ürün rafa koyma
                    urunuRafaKoy();
                    break;
                case "5": // ürün çıkışı
                    urunCikisi();
                    break;
                case "0": //  sistemden çıkış
                    break;
                default:
                    System.out.println("Lütfen geçerli bir tercih giriniz");

            }

        }while (!tercih.equals("0"));

       Methodlar.projeDurdur();


    }

    public static void projeDurdur() {
        System.out.println("Depo Projesinden Çıkış Yaptınız....");

    }



    public static <urunTanimlama> void urunTanimlama() throws InterruptedException {
        System.out.println("===========QA-03===========\n" +
                "======ÜRÜN TANIMLAMA MENÜSÜ========\n" );

        do{

        System.out.println("Ürünün İsmini Giriniz : ");
        String name = scan.nextLine();
        System.out.println("Ürün üreticisi giriniz :");
        String uretici = scan.nextLine();
        System.out.println("Ürünün birimini giriniz : \n(Kg,Lt,mL,Paket,Çuval,Kutu)");
        String birim = scan.nextLine();
        System.out.println("Ürünün ID sini giriniz");
        int id =scan.nextInt();
        int urunMiktar=0;
        String defaultRaf="Yerleştirilmedi";
        System.out.println("Ürün Tanımlanmıştır..");
        Pojo obj1 = new Pojo (name, uretici, birim, id, urunMiktar, defaultRaf);//urun objesi oluşturuldu
        mapList.put(obj1.getUrunId(), obj1); //map içerisine urunId key, urun objesi eklendi

        id++; //her ürün girişinde id bir arttırıldı

            System.out.print("Tekrar urun tanımlamak isterseniz  \n 1' e basınız \n yoksa 0'a basınız :");
            int devamEtme=scan.nextInt();
            if (devamEtme==0){
                System.out.println("isleminiz gercekleşti.....");
                break;
            }else;

        }while(true);

    }

    public static void urunListeleme() {
        System.out.println("===========QA-03===========\n" +
                "======ÜRÜN LİSTELEME MENÜSÜ========\n" );
        System.out.printf("%-3s      %-10s      %-10s      %-3s     %-6s    %-3s \n", "Id", "Ürün Adı ", "Üretici Adı", "Ürün Birimi", "Ürün Miktarı", "Ürün Raf");
        System.out.println("--------------------------------------------------------------------------------------");
        Collection<Pojo> values= mapList.values();
        List<Pojo> listele= new ArrayList<>();
        listele.addAll(values);
        for (Pojo w: listele){
            System.out.printf("%-3s      %-10s      %-11s      %-10s       %-12s     %-3s \n", w.getUrunId(), w.getUrunIsmi(), w.getUretici(), w.getUrunBirimi(), w.getUrunMiktar(), w.getRaf());
            System.out.println();
        }


    }
    public static void urunGirisi() {
        System.out.println("===========QA-03===========\n" +
                "======ÜRÜN GİRİŞİ MENÜSÜ========\n");

        System.out.println("Giriş yapmak istediğiniz ürünün ID'sini giriniz");
        int id = scan.nextInt();

        boolean idCheck = mapList.containsKey(id);
        if (idCheck) {
            System.out.println("Lütfen ürün miktarı giriniz  : ");
            int miktar = scan.nextInt();
            int sumMiktar = mapList.get(id).getUrunMiktar();
            mapList.get(id).setUrunMiktar(miktar + sumMiktar);

        } else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");
    }

    public static void urunuRafaKoy() {
        System.out.println("===========QA-03===========\n" +
                "======ÜRÜNÜ RAFA EKLEME MENÜSÜ========\n");

        System.out.println("Lütfen rafa yerleştirmek istediğiniz ürünün id numarasını giriniz :");

        int id = scan.nextInt();
                boolean idCheck = mapList.containsKey(id);
                if (idCheck) {
                    System.out.println("Lütfen Ürün Rafını giriniz  : \n(!Raf bilgisini boşluk olmadan giriniz!)");
                    String raf = scan.next();
                    mapList.get(id).setRaf(raf);
                } else System.out.println("Girilen ID de ürün bulunmamaktadır !! ");
         }

    public static void urunCikisi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen çıkış yapmak istediğiniz urun ID giriniz");
        int urunID = input.nextInt();
        Set<Integer> keySet = mapList.keySet();

        for (Integer each : keySet) {

            if (each == urunID) {
                System.out.print("Cikarmak istediginiz miktarı giriniz  :");
                boolean idCheck = mapList.containsKey(id);
                if (idCheck) {
                    System.out.println("Lütfen çıkış yapmak istediğiniz ürün miktarını giriniz  : ");
                    int miktar = scan.nextInt();
                    int sumMiktar = mapList.get(id).getUrunMiktar();
                    mapList.get(id).setUrunMiktar(sumMiktar-miktar);
                    System.out.println("ürün miktarı güncellernmiştir");


                }


            }


            }
        }


}

