package com.example.maskerorganik;

import java.util.ArrayList;

public class MaskerData {
    private static String [] clubName ={
            "Daisy" ,
            "Camille" ,
            "SunnyShine" ,
            "Pinkroullete" ,
            "Heygurl",
            "Lavalova",
            "Prettywell.co"


    };
    private static String[] clubDetail= {
            "Daisy Organik merupakan local brand masker organik bubuk yang menggunakan bahan natural berupa oat, milk, greentea, chocolate, strawberry dan dikombinasikan dengan klaim produk serta sesuai dengan kebutuhan kulit kita" ,
            "Camille Beaute merupakn brand masker local yang sangat populer di kalangan remaja. Dengan ingredients yang natural masker camille ini sangat bermanfaat untuk mengatasi masalah kulit remaja. Makser ini sudah BPOM dan aman dipakai untuk semua kalangan.",
            "SunnyShine merupakan masker organik yang baru ini populer. Mereka mengklaim 2 jenis masker yaitu masker wash off dan feel of dengan banyak varian. Baru-baru ini masker SunnyShine sudah dikatakan BPOM dan siap didistribusikan lagi.",
            "Pinkroullete merupakan masker brand local yang paling populer karena kemasan yang menarik minat customer. Masker ini memiliki banyak varian yaitu russian, belgium, venice, chicago, amsterdam, dubai dan beverly. Masing-masing varian memiliki manfaat yang berbeda sesuai dengan masalah kulit kita.",
            "Heygurl merupakan brand masker yang banyak diminati. Pasalnya heygurl ini mengeluarkan masker organik dengan menggunakan bunga safron. Hal ini yang membuat brand Heygurl semakin populer.",
            "Lavalova merupakan brand masker organik local dengan kemasan yang cantik dan lucu. Masker ini diklaim dengan bentuk yang unik guna untuk menarik perhatian customer. Selain itu, masker ini memiliki banyak manfaat untuk wajah",
            "Prettywell.co merupakan masker organik yang baru saja dirilis dan sudah memenuhi standar BPOM. Masker ini memiliki 2 jenis varian masker yang baik untuk kulit wajah."
    };

    private static int[] clubImage = {
            R.drawable.daisy,
            R.drawable.camille,
            R.drawable.sunny,
            R.drawable.pinkroullete,
            R.drawable.heygurl,
            R.drawable.lavalova,
            R.drawable.prettywellco

    };

static ArrayList<MaskerOrganik> getListData(){
    ArrayList<MaskerOrganik> list = new ArrayList<>();
    for (int position = 0; position <clubName.length; position++) {
        MaskerOrganik club = new MaskerOrganik();
        club.setName(clubName[position]);
        club.setDetail(clubDetail[position]);
        club.setPhoto(clubImage[position]);
        list.add(club);
    }
    return list;
}
}
