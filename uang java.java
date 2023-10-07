
public class uang {
        public static void main(String[] args) throws Exception {
            int jumlahUang = 188600; 
            
            int jumlahPecahanRatusan = jumlahUang / 100000;  
            jumlahUang = jumlahUang % 100000;
            
            int jumlahPecahanLimapuluh = jumlahUang / 50000; 
            jumlahUang = jumlahUang % 50000;
            
            int jumlahPecahanDuapuluh = jumlahUang / 20000; 
            jumlahUang = jumlahUang % 20000;
            
            int jumlahPecahanSepuluh = jumlahUang / 10000; 
            jumlahUang = jumlahUang % 10000;
    
            int jumlahPecahanlimaribu = jumlahUang / 5000; 
            jumlahUang = jumlahUang % 5000;
    
            int jumlahPecahanDuaribu = jumlahUang / 2000; 
            jumlahUang = jumlahUang % 2000;
    
            int jumlahPecahanSeribu = jumlahUang / 1000; 
            jumlahUang = jumlahUang % 1000;
    
            int jumlahPecahanLimaratus = jumlahUang / 500; 
            jumlahUang = jumlahUang % 500;
    
            int jumlahPecahanSeratus = jumlahUang / 100; 
            jumlahUang = jumlahUang % 100;
    
           
        }
    }

