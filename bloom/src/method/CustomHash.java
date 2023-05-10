package method;

public class CustomHash implements HashFunction{
    @Override
    public int hash(String word) {
        int val = word.hashCode();
        int r1 = (int) (Math.random() * 10000000);
        val = val % r1;
        int r = (int) (Math.random() * 100);
        int r3 = (int) (Math.random() * 100);
        // Convertir la chaîne de caractères en un entier
        int val2 = word.hashCode();
        int r2 = (int) (Math.random() * 10000000);
        val2 = val2 % r2;


        return (val >>> r) + (val2 >>> r3); // Choisissez un grand nombre premier pour votre filtre de Bloom
    }
}
