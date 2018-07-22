package nyc.c4q.hakeemsackes_bramble.namegenerator.objects;

public class Syllable {
    private LetterSounds letterSounds = new LetterSounds();
    private String singleSyllable;

    public Syllable() {
    }

    public String getSingleSyllable() {
        return singleSyllable;
    }

    public void setSingleSyllable(String singleSyllable) {
        this.singleSyllable = singleSyllable;
    }
}
