import java.io.*;
import java.util.HashSet;
import java.util.Set;

class Bigram implements Serializable {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bigram)) {
            return false;
        }
        Bigram b = (Bigram) o;
        return b.first == first && b.second == second;
    }

    @Override
    public String toString() {
        return "Bigram{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<>();
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++)
                s.add(new Bigram(ch, ch));
        System.out.println(s.size());

        Bigram b = new Bigram('a', 'a');
//
        // save the object to file
        String fileName = "MyFile";
        try (FileOutputStream fos = new FileOutputStream(fileName);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(b);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // read the object from file
        // save the object to file
        try (FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            b = (Bigram) ois.readObject();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println(b.toString());
    }
}

