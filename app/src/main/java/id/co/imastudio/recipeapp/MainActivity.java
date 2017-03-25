package id.co.imastudio.recipeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import jp.wasabeef.recyclerview.adapters.SlideInRightAnimationAdapter;

public class MainActivity extends AppCompatActivity {

    //buat variabel
    private List<ResepModel> listResep;
    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi recyclerview
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        //membuat list baru
        listResep = new ArrayList<>();
        
        //coba menampilkan data dummy
//        for (int i = 0; i<= 10 ; i++){
//            ResepModel resepLists = new ResepModel("Resep" + i, "Siang", "5 porsi", "60 menit", R.drawable.resep01);
//            listResep.add(resepLists);
//        }

        //menampilkan data yang berbeda-beda
        ResepModel resepLists = new ResepModel("Udang Tumis Pedas Manis", "Siang", "4 porsi", "115 menit", R.drawable.resep01,
                "Bahan Utama\n" +
                "250 gram udang berukuran besar\n" +
                "1 buah jeruk nipis, peras ambil airnya\n" +
                "5 buah cabai merah besar, iris tipis\n" +
                "5 buah cabai hijau besar, iris tipis\n" +
                "1 buah tomat , potong kotak\n" +
                "4 butir bawang merah , cincang halus\n" +
                "4 siung bawah putih , cincang halus\n" +
                "1 sendok makan saus tiram\n" +
                "Gula secukupnya\n" +
                "Garam secukupnya\n" +
                "Merica bubuk secukupnya\n" +
                "Minyak goreng secukupnya\n" +
                "Air secukupnya\n\n" +
                "Cara Membuat\n" +
                "Bersihkan dan cuci udang, namun jangan buang bagian kulit serta kepalanya. Seteleh dicuci bersih dengan air mengalir anda kemudian bisa melanjutkan melumuri udang tersebut dengan menggunakan air perasan jeruk nipis, tambahkan sedikit garam serta lada secukupnya. Aduk rata hingga merata kemudian anda diamkan selama kurang lebih 20 menit.\n" +
                "Setelah 20 menit berlalu lanjutkan proses memasak dengan memanaskan wajan dan minyak. Kemudian anda tumis bahan-bahan seperti bawang merah dan bawang putih juga cabe merah dan cabe hijau. Tumis hingga terlihat layu dan beraroma wangi. Setelah itu anda tuangkan air putih ke dalam maskan anda kemudian lanjutkan menambahkan tomat dan saus tiram.\n" +
                "Ambil udang kemudian anda masukan ke dalam wajan masakan anda tambahkan gula dan garam sesuai selera.\n" +
                "Aduk sebentar kemudian tutup beberapa saat agar bumbu sedikit meresap. Setelah matang keudian angkat. Usahakan jangan terlalu lama memasak udang agar masih fresh dan juicy ketika disantap.\n" +
                "Sajikan di atas piring selagi masih hangat.\n" +
                "Demikian tadi resep dan cara membuat udang tumis pedas manis. Selera makan anda bisa meniingkat edngan rasanya yang sangat lezat dan menggugah selera. Bagi anda pecinta olahan udang menu ini juga salahsatu yang wajib anda coba, dengan paduan bumbu tumis yang maantap ditambah dengan daging udang yang lebut dan juicy membuat anda ketagihan mencobanya.\n" +
                "Jangan lupa untuk tetap berbgai dengan teman dan sahabat anda. tekan shaer di bagian bawah artikel, dan jangan lupa untuk selalu berbagi komentar melalaui kolom yang sudha disediakan.\n");
        listResep.add(resepLists);

        resepLists = new ResepModel("Kwetiau Kuah Bakso Ikan Spesial", "Malam", "5 porsi", "50 menit", R.drawable.resep02, "Bahan Utama\n" +
                "250 gram kwetiau basah, cuci bersih dan seduh air panas\n" +
                "2 liter kaldu ikan, didihkan\n" +
                "2 sendok makan minyak sayur\n" +
                "1 sendok teh minyak wijen\n" +
                "Saus sambal secukupnya\n\n" +
                "Bumbu\n" +
                "5 siung bawang putih, memarkan\n" +
                "1 ruas jari jahe, iris kecil\n" +
                "½ sendok teh kecap ikan\n" +
                "Garam secukupnya\n" +
                "Gula pasir secukupnya\n" +
                "1 batang daun bawang kecil, iris kecil\n" +
                "Baso Ikan\n" +
                "250 gram daging ikan fillet, haluskan\n" +
                "2 sendok makan tepung sagu\n" +
                "⅓ sendok teh merica bubuk\n" +
                "1 batang daun bawang kecil, iris kecil\n" +
                "Garam secukupnya\n\n" +
                "Cara Membuat Bakso Ikan\n" +
                "Siapkan semua bahanbakso ikan yang sudah anda persiapkan, dan masukan dalam sebuah wadah.\n" +
                "Campur semua bahan bakso ikan tersebut secara merata, kemudian aduk-aduk atau uleni adonan tersebut hingga mudah untuk dibentuk. Jika terlalu keras, maka anda tambahkan sedikit air sehingga adonan mudah dibentuk dan tidak lengket di tangan anda.\n" +
                "Didihkan terlebih dahulu air di dalam panci dengan api sedang saja.\n" +
                "Bentuk bakso ikan menjadi bentuk bulat-bulat atau sesuai dengan selera anda masing-masing, kemudian masukkan bakso ikan ini ke dalam air mendidih.\n" +
                "Biarkan hingga bakso ikan anda mengapung ke permukaan yang berarti menjadi pertanda matang. Setelah matang kemudian angkat dan tiriskan.\n\n" +
                "Cara Membuat Kwetiau\n" +
                "Panaskan minyak sayur dan minyak wijen di atas wajan dengan menggunakan api sedang saja. Masukan bawang putih dan jahe kemudian anda tumis hingga harum. Matikan api.\n" +
                "didihkan kaldu ikan yang anda sudah persiapkan, kemudian anda masukan tumisan bawang putih dan jahe ke dalamnya.\n" +
                "Jangan lupa untuk menambahkan merica bubuk, garam, kecap ikan dan gula pasir secukupnya sebagai perasa makanan. Setelah beberapa saat kemudian anda kecilkan apinya, dan masak kembali selama kurang lebih 5 menit kembali.\n" +
                "Siapkan mangkuk saji, kemudian anda tata dan letakkan kwetiau yang sudah dibersihkan dan direbus di dalam mangkuk anda.\n" +
                "Lengkapi dengan bakso ikan, kemudian siramkan secara perlahan kuah kwetiau yang sudah anda olah di atasnya.\n" +
                "Terakhir taburkan irisan daun bawang sebagai pelengkap, dan hidangkan selagi masih hangat denga saus sambal sesuai dengan selera anda masing-masing.\n" +
                "Demikian resep dan cara membuat kwetiau kuah bakso ikan spesial ala rumahan yang enak dan lezat. Menu ini sangat cocok disajikan saat anda berkumpul bersama keluarga. Jangan lupa berbagi dengan temandan sahabat anda dengan menekan tombol share. Anda juga bisa memberikan komentar terkait dengan resep ini dengan menambahkan komentar di kolom yang tersedia.\n");
        listResep.add(resepLists);

        resepLists = new ResepModel("Ayam Panggang Madu Oven", "Malam", "6 porsi", "75 menit", R.drawable.resep03, "Bahan Utama Ayam Panggang:\n" +
                "1 ekor ayam utuh\n" +
                "2 sendok makan saus tiram\n" +
                "1 sendok makan saus tomat\n" +
                "2 sendok teh air jeruk lemon\n" +
                "1 sendok teh garam\n" +
                "3 siung bawang putih, dihaluskan\n" +
                "3 sendok makan madu\n" +
                "1 sendok makan merica hitam kasar\n" +
                "3 sendok makan margarin, dilelehkan\n\n" +
                "Cara Membersihkan Ayam Sebelum Dimasak:\n" +
                "Untuk cara yang pertama bisa dilakukan dengan terlebih dahulu membersihkan ayamnya. Hal ini penting sekali karena ada beberapa bagian pada ayam yang harus dibuang dibersihkan. Bagian tersebut adalah kotoran atau mungkin sisa bulu halus yang masih menempel pada kulit ayam. Akan tetapi, sebelum itu, pastikan jika anda memotong ayam menjadi beberapa bagian sesuai dengan selera yang anda inginkan.\n" +
                "Setelah ayam dibpotong, silahkan masukkan ayam kedalam wadah untuk kemudian bawa ayam ke tempat cucian dan bersihkan.\n" +
                "Ditempat cucian, bersihkan ayam secara merata dengan menggunakan air bersih. Pastikan jika kotoran dan bulu halus pada ayam bisa dibersihkan secara merata. Setelah ayam dibersihkan, silahkan masukkan ayam kedalam wadah dan tiriskan air cuciannya secara merata.\n" +
                "Terakhir, silahkan lumuri ayam dengan menggunakan air jeruk nipis dan bawang putih. Aduk-aduk dan remas-remas secara merata. Setelah itu, diamkan ayam sementara agar bumbu ini meresap kedalam ayam.\n\n" +
                "Cara Membuat Ayam Panggang Madu Oven:\n" +
                "Untuk hal yang pertama bisa dilakukan dengan mencampurkan semua bahan berikut dalam wadah bahan tersebut diantaranya adalah air jeruk lemon, saus tiram, bawang putih bersama dengan madu, merica hitam dan saus tomat serta margarin. Aduk bahan ini secara merata sampai ayam terlumuri dengan bumbu ini secara merata.\n" +
                "Setelah itu, Lumuri bumbu yang telah anda campurkan pada ayam. Aduk-aduk secara merata sampai bumbu ini melumuri ayam secara merata.\n" +
                "Lalu kemudian, diamkan ayam selama kurang lebih satu jam dalam lemari es.\n" +
                "Setelah 1 jam, keluarkan ayam dan masukan diatas loyang lalu bungkus dengan menggunakan alumunium foil. Hanya saja, sebelum itu, pastikan jika loyang telah terlebih dahulu dilumuri dengan mentega agar ayam tidak menempel.\n" +
                "Nah, baru setelah itu, letakan loyang dalam oven dan panggang selama kurang lebih 50 menit atau sampai ayam matang secara merata dibawah suhu 190 derajat celcius.\n" +
                "Setelah matang, angkat sajian ini dan hidangkan dalam piring saji untuk kemudian hidangan ini akan siap anda sajikan dirumah dengan mudah dan spesial.\n");
        listResep.add(resepLists);

        resepLists = new ResepModel("Rendang Minang Asli Padang", "Pagi", "12 porsi", "240 menit", R.drawable.resep04, "Bahan Utama Untuk Membuat Rendang Minang Asli:\n" +
                "1.5 kg daging\n" +
                "2 liter santan dari 2 butir kelapa\n" +
                "Bumbu dan Rempah Untuk Membuat Rendang Minang Asli:\n" +
                "2 batang daun serai, memarkan\n" +
                "4 lembar daun jeruk purut\n" +
                "2 cm asam kandis/gelugur\n" +
                "2 lembar daun kunyit, simpulkan\n" +
                "Bumbu Rendang Minang Asli yang Dihaluskan:\n" +
                "5 butir kemiri\n" +
                "6 siung bawang putih\n" +
                "100 g cabe merah besar\n" +
                "12 butir bawang merah\n" +
                "100 g cabe merah keriting\n" +
                "2 cm jahe, bakar\n" +
                "2 cm lengkuas\n" +
                "3 cm kunyit, bakar\n" +
                "1/2 sdm ketumbar\n" +
                "2 sdt garam\n" +
                "1/2 sdt pala\n" +
                "1 sdt jintan, sangrai\n" +
                "Penyedap rasa secukupnya\n\n" +
                "Cara Mengolah Daging Rendang Minang Asli:\n" +
                "Cara yang pertama yang bisa anda lakukan pada resep kali ini adalah dengan terlebih dahulu mengolah daging yang sudah disiapkan sebelum dimasak atau diberikan bumbu. Potong-potong daging dengan bentuk dadu dan seukuran yang diinginkan, hanya saja jangan memotong daging terlalu kecil agar ketika dimasak daging tidak menjadi hancur.\n" +
                "Setelah daging dipotong-potong semuanya. Sekarang silahkan cuci bersih daging dengan menggunakan air hingga kotoran yang ada pada daging bisa dibersihkan secara keseluruhan.\n" +
                "Setelah dicuci bersih, tempatkan dalam wadah dan baung air cuciannya hngga daging kering. Sisihkan sementara.\n\n" +
                "Cara Memasak Daging Rendang Minang Asli:\n" +
                "Langkah pertama untuk memasak atau membumbui daging rendang adalah dengan Menuangkan santan dalam wajan berukuran besar, masukkan pula serai, asam, irisan bawang merah dan daun kunyit. Aduk-aduk hingga santan mendidih dan pastikan jika santan yang anda masak tidak menjadi pecah, untuk itu pastikan jika anda terus mengaduk-aduk santan hingga mendidih merata.\n" +
                "Setelah santan mendidih, masukkan bumbu yang telah dihaluskan kedalamnya dan sesekali aduk-aduk selama kurang lebih 20 menit.\n" +
                "Jika anda melihat santan tampak berminyak atau mengeluarkan minyak. Maka silahkan masukkan potongan daging yang telah dibersihkan dan masak dengan menggunakan api sedang hingga santan mengental dan mengering.\n" +
                "Masak hingga daging empuk dan matang merata sambil terus diaduk-aduk agar bagian dasar tidak gosong.\n" +
                "Setelah matang merata, daging sudah empuk dan santan mulai mengering silahkan matikan kompor dan angkat masakan rendang dari kompor. Ambil piring saji dan hidangkan nikmatnya rendang daging khas minang asli yang enak dan lezat. Demikian resep membuat hidangan rendang daging sapi khas minang asli. Semoga bermanfaat dan selamat menikmati.\n");
        listResep.add(resepLists);

        resepLists = new ResepModel("Lele Rica-Rica", "Malam", "4 porsi", "75 menit", R.drawable.resep05, "Bahan Utama Ikan Lele:\n" +
                "4 ekor ikan lele,\n" +
                "1 sendok teh garam\n" +
                "minyak untuk menggoreng\n" +
                "1/2 sendok makan air jeruk nipis\n\n" +
                "Bumbu-Bumbu Ikan Lele:\n" +
                "2 lembar daun salam\n" +
                "200 ml air\n" +
                "1 batang serai, dimemarkan\n" +
                "1 cm lengkuas, dimemarkan\n" +
                "1 sendok teh garam\n" +
                "1/4 sendok teh merica bubuk\n" +
                "2 sendok teh minyak untuk menumis\n" +
                "5 lembar daun jeruk, buang tulangnnya\n\n" +
                "Bumbu yang Ditumbuk Kasar:\n" +
                "3 siung bawang putih\n" +
                "1 buah tomat merah\n" +
                "8 butir bawang merah\n" +
                "2 buah cabai rawit merah\n" +
                "4 buah cabai merah besar\n" +
                "5 buah cabai merah keriting\n" +
                "Tips Membersihkan Ikan Lele yang Efektif:\n\n" +
                "Untuk yang pertama bisa dilakukan adalah dengan membersihkan ikan lele secara merata. Hal ini penting sekali sebab ada beberapa bagian pada ikan lele yang tidak bisa kita konsumsi. Dari beberapa bagian tersebut, bagian pertama yang akan kita bersihkan adalah bagian lendir ikan. Untuk membersihkan bagian ini anda bisa melakukannya dengan cara taburkan garam atau berikan perasan air jeruk nipis dan gosok-gosokkan ikan hingga kesat secara merata. Setelah itu, silahkan bilas kembali ikan dengan air bersih.\n" +
                "Selanjutnya, kita bersihkan bagian jeroan ikan. Caranya, belah perut ikan dengan pisau dapur, jika bagian perut sudah terbuka, silahkan jangkau bagian jeroan ikan dengan menggunakan tangan dan bersihkan secara merata. Sebaiknya, lakukan langkah ini dengan peralahan agar bagian empedu pada ikan tidak pecah yang akan membuat daging ikan terasa pahit.\n" +
                "Setelah itu, bersihkan pula bagian insang dikepala ikan. Caranya, buka bagian kepala ikan dan bersihkan insang ikan hingga bersih merata.\n" +
                "Kemudian, kerat-kerat ikan lele dengan pisau hingga merata agar bumbu meresap pada ikan secara merata.\n" +
                "Terakhir, silahkan lumuri ikan dengan air jeruk nipis dan garam untuk menghilangkan bau amis yang menempel pada ikan. Sisihkan sementara dan biarkan bumbu ini meresap pada ikan selama kurang lebih 10 menit.\n\n" +
                "Cara Membuat Ikan Lele Rica-Rica:\n" +
                "Goreng ikan dalam wajan yang sudah diberikan minyak goreng dan dipanaskan. Silahkan goreng ikan hingga renyah, garing dan juga krispi. Setelah itu, anda bisa mengangkat ikan dan meniriskan minyaknya terlebih dahulu sebelum kita masak bumbu rica-ricanya.\n" +
                "Untuk membuat bumbu rica-rica, panaskan minyak diatas kompor dengan api yang sedang. Masukkan bumbu yang telah ditumbuk kasar bersama dengan bumbu daun salam, lengkuas, daun jeruk dna juga serai. Lalu aduk-aduk hingga bumbu ini mengeluarkan aroma harum yang sedap.\n" +
                "Masukkan ikan lele yang sudah digoreng, aduk-aduk sampai matang dan umbu meresap kedalam daging ikan secara merata.\n" +
                "Masukkan garam bersama dnegan air dan juga merica kedalam tumisa bumbu. Aduk-aduk merata sampai mengental.\n" +
                "Setelah itu, angkat sajian ini dan hidangkan untuk keluarga tercinta dan santap selagi masih hangat agar rasanya semakin nikmat.");
        listResep.add(resepLists);


        //set adapter
        adapter = new ResepAdapter(listResep, this);
//        recyclerView.setAdapter(adapter);

        //mengunakan library animasi
        SlideInRightAnimationAdapter animatorAdapter = new SlideInRightAnimationAdapter(adapter);
        animatorAdapter.setFirstOnly(false);
        recyclerView.setAdapter(animatorAdapter);
    }
}
