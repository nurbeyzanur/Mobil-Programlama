# Android Başlangıç Seviyesi Projeler (Beginner)

Bu klasör, Android uygulama geliştirmeyi öğrenirken oluşturulan temel seviye örnek projeleri içerir. Her proje belirli bir konsepti veya UI bileşenini anlamaya odaklanır.

---

## 📂 01-Snackbar-TextView-Example

Bu proje, temel kullanıcı etkileşimlerini ve arayüz güncellemelerini gösterir.

### 🎯 Öğrenilen Kavramlar
Bu örnekte aşağıdaki Android bileşenleri ve yapıları kullanılmıştır:

* **ViewBinding:** `findViewById` yerine daha güvenli ve modern olan ViewBinding yapısının kurulumu ve kullanımı.
* **OnClickListener:** Bir butona (`Button`) tıklandığında aksiyon alma.
* **Snackbar:** Kullanıcıya ekranın alt kısmında geçici bilgilendirme mesajı gösterme (`Snackbar.make`).
* **TextView Manipülasyonu:** Java kodu üzerinden ekrandaki bir yazıyı dinamik olarak değiştirme (`setText`).

### 📱 Nasıl Çalışır?
1. Uygulama açıldığında bir Buton ve bir TextView görüntülenir.
2. Kullanıcı butona tıkladığında:
    - Ekranda "Butona tıkladınız!" yazan bir Snackbar belirir.
    - Mevcut metin "Yeni Mesaj Yazıldı!" olarak güncellenir.