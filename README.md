# JavaByExample
Practicing Java by Examples

We used Geters and Setters

**But what if...?**

Someone gives in a negative age with the setter? Or someone gives a negative price with the setter?

##### Exception opwerpen: IllegalArgumentException

###### Create exception in a constructor

    public class Persoon {
        public Persoon(String naam, String voornaam, int leeftijd, Geslacht geslacht) {
        if (leeftijd < 0) {
            throw new IllegalArgumentException("leeftijd mag niet negatief zijn");
        }
            this.naam = naam;
            this.voornaam = voornaam;
            this.leeftijd = leeftijd;
            this.geslacht = geslacht;
        }
    }
###### Create exception in a method


	
	public class Vak{
        private int studiepunten;
        public void setStudiepunten(int studiepuntenVak){
            if (studiepuntenVak < 0) {
                throw new IllegalArgumentException (“studiepunten moet positief zijn”)
            }
            this.studiepunten = studiepuntenVak;
        }
	}



