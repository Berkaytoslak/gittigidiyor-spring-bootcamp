### Task

1. Actuator metrics/process.start.time endpointi üzerinden uygulamanın başlangıç zamanı alınacak (http://localhost:8080/actuator/metrics/process.start.time)
2. Json mapping işlemi için gerekli objeler oluşturulacak
3. Mapping işlemi yapılacak (ObjectMapper)
4. Json içerisinde yer alan unix epoch formatı (measurements.value) LocalDateTime a convert edilecek.
5. Bir endpoint üzerinden aşağıdaki örneğe benzer bir string dönülecek;
    " Server is running since : xxxxxxxxxxxxxx"