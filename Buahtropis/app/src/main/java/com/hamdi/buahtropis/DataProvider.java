package com.hamdi.buahtropis;


import android.content.Context;

import com.hamdi.buahtropis.model.BuahTrofis;
import com.hamdi.buahtropis.model.Hijau;
import com.hamdi.buahtropis.model.Kuning;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {
    private static List<BuahTrofis> buahTrofis = new ArrayList<>();

    private static List<Hijau> initDataHijau(Context ctx) {
        List<Hijau> hijaus = new ArrayList<>();
        hijaus.add(new Hijau("Pepaya", "Pepaya",
                "tanaman ini memang cocok di daerah trofis dan subtrofis, selain itu buah ini juga memiliki kulit yang terbilang tipis namun memiliki daging yang cukup tebal, pepaya bisa di makan secara langsung dan juga bisa di masak dan di jadikan berbagai macam sajian seperti salad, gudeg rujak dll", R.drawable.pepaya));
        hijaus.add(new Hijau("Mangga", "Mangga",
                "Buah ini menjadi sat dari sekian buah paling dari asia selatan,yang juga tumbuh subur di kawasan trofis dan subtrofis", R.drawable.mangga));
        hijaus.add(new Hijau("Jujube", "Jujube",
                "Buah ini di sebut juga kurma tiongkok,kurma merah,kurma india dan kurma korea. buah ini datang dari tiongkok,namun bisa tumbuh daerah subtrofis lain. sekilas bentuknya memang seperti kurma, namun memiliki ukuran yang lebih kecil", R.drawable.jujube));
        hijaus.add(new Hijau("Sirsak", "Sirsak",
                "Buah ini sering juga di sebut durian belanda. buah ini berwarna hijau dengan permukaan seperti berduri. bentuknya oval dan ukuran nya bervariasi.buah ini di tanam sambilan atau di komersilkan. dagingnya putih dan rasanya manis-manis masam. ", R.drawable.sirsak));
        return hijaus;
    }

    private static List<Kuning> initDataKuning(Context ctx) {
        List<Kuning> kunings = new ArrayList<>();
        kunings.add(new Kuning("Jeruk", "Jeruk",
                "Buah ini menjadi 'jeruk terkecil' yang pernah ada. uniknya, kulit buah ini tidak seperti lemon atau jeruk pada umumnya, sebab rasanya cenderung manis. sedangkan daging sedikit terasa masam.", R.drawable.jeruk));
        kunings.add(new Kuning("nangka", "Nangka",
                "Buah ini bisa tumbuh di kawasan di seluruh dunia. abuah ini juga memiliki aroma yang khas karna termasuk dalam anggota mulberry. ", R.drawable.nangka));
        kunings.add(new Kuning("kesemek", "Kesemek",
                "Sejak seribu tahun yang lalu, buah kuno ini tumbuh subuh di jeoang. namun buah ini kini tumbuh subur di indonesia, warna buahnya kuming-oranye. ", R.drawable.kesemek));
        kunings.add(new Kuning("Delima", "Delima",
                "Tumbuh berupa semak atau tanaman rendah dengan buah bulat berwarna kuning atau kemerahan.rasanya begitu segar, dengan bentuk buah seperti butir-butir.", R.drawable.deliman));
        return kunings;
    }

    private static void initAllBuah(Context ctx) {
        buahTrofis.addAll(initDataHijau(ctx));
        buahTrofis.addAll(initDataKuning(ctx));
    }

    public static List<BuahTrofis> getAllBuah(Context ctx) {
        if (buahTrofis.size() == 0) {
            initAllBuah(ctx);
        }
        return buahTrofis;
    }

    public static List<BuahTrofis> getBuahByTipe(Context ctx, String jenis) {
        List<BuahTrofis> hewansByType = new ArrayList<>();
        if (buahTrofis.size() == 0) {
            initAllBuah(ctx);
        }
        for (BuahTrofis h : buahTrofis) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
