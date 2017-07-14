import java.util.regex.*;

/**
 * Created by Raven_P0 on 09.07.2017.
 */
public class AddressCheck {
    public static void main(String [] args){
        identifyPerson();
    }


    static  private final Pattern PAT_NAME =  Pattern.compile("[A-Za-z\\s]{1,780}+");
    static  private final Pattern PAT_ADDRESS =  Pattern.compile("^[A-Za-z-\\s]+([Str]\\.||[Street])(\\s[Flat\\s0-9]+)?$");

      static String  longestName = "Adolph Blaine Charles David Earl Frederick Gerald Hubert Irvim John Kenneth Loyd Martin Nero Oliver Paul Quincy Randolph Sherman Thomas Uncas Victor Willian Xerxes Yancy Zeus Wolfeschlegelsteinhausenbergerdorffvoralternwarengewissenhaftschafers wesenchafewarenwholgepflegeundsorgfaltigkeitbeschutzenvonangereifen duchihrraubgiriigfeindewelchevorralternzwolftausendjahresvorandieer scheinenbanderersteerdeemmeshedrraumschiffgebrauchlichtalsseinu rsprungvonkraftgestartseinlangefahrthinzwischensternartigraumaufde rsuchenachdiesternwelshegehabtbewohnbarplanetenkreisedrehensichund wohinderneurassevanverstandigmenshlichkeittkonntevortpflanzenundsiche rfreunanlebenslamdlichfreudeundruhemitnichteinfurchtvorangreifenvon andererintlligentgeschopfsvonhinzwischensternartigraum";


    public static void identifyPerson(){
        firstAndLastNameChecking("John Miller");
        firstAndLastNameChecking("John@Miller");
        firstAndLastNameChecking(longestName);


        streetChecking("Oak Str.");
        streetChecking("Pinewood-Oak Street");
        streetChecking("Pinewood-Oak Str. Flat 66");
        streetChecking("Happy Hour_Str. Flat 77");

    }

    public static void firstAndLastNameChecking (String n){
        Matcher matN = PAT_NAME.matcher(n);
        if(matN.matches() == true){
            System.out.println(n + " is a correct name.");
        }else{
            System.out.println("Typograph error occured.Try again.");
        }
    }

    public static void streetChecking (String ad){
        Matcher matA = PAT_ADDRESS.matcher(ad);
        if(matA.matches() == true){
            System.out.println("The address " + ad + " is excisting.");
        }else{
            System.out.println("Unreal address error occured.Try again.");
        }
    }

}
