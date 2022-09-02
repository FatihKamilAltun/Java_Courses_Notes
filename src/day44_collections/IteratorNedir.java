package day44_collections;

public class IteratorNedir {
    /*
   1- Collection'dan bazi yapilar index desteklemez, bu durumda collection icindeki tum elementleri bize getirebilecek,
    ve gerektiginde elementleri degistirecek bir tasiyicidir.
    2-Iterate=ötelemek demektir. Iterator'ı ilk olusturdugumuzda java  Iterator'ı collection'in ilk elementinin
    yanina koyar. iterator'ı next() ve previous () ile her hareket ettirdigimizde Java iterator 'ı  bir sonraki elemena
    tasır ve tasirken pass ettigi yani üzerinden gectigi elementi yüklenir.

    3-uzerine aldigi elementi remove() ile silebilir, istersek yazdirabilir veya set() ile degistirebiliriz.
    4-Java da iki iterator kullaniriz. Iterator class'i sadece 3 method barındırdığı icin cok kullanisli değildir.
    Sadece ileri doğru gider, remove ile element silebilir veya yazdırabilir.
    5-ListIterator ise Iterator'in child'i olmasina rağmen daha fazla method barındırır. İleri ve geri hareket edebilir
    set ile elementleri degistirebiliriz.
    6-hasNext () ve hasPrevious() methodları yanında element oldugu muddetce bize true dondurur.bu methodları while loop
    ile kullanarak ileri ve geri olarak tum elementler üzurende gezinebiliriz.
     */
}
