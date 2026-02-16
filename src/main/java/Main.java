import cz.uhk.zlomky.Zlomek;
public class Main {

    static void main(){
        IO.println("Projekt ZLOMKY");

        var a=new Zlomek();
        a.setCitatel(1);
        a.setJmenovatel(2);

        IO.println("Zlomek : "+a.getCitatel()+" / "+a.getJmenovatel());
        Zlomek b=new Zlomek(3, 4);
        IO.println(b);

        //operace
        var soucet=a.plus(b);
        var rozdil=a.minus(b);
        var nasobek=a.krat(b);
        var podil=a.deleno(b);

        IO.println(soucet);
        IO.println(rozdil);
        IO.println("Soucet je %s".formatted(soucet.zkratit()));

        Zlomek[] pole=new Zlomek[]{
                new Zlomek(1,3),
                new Zlomek(1,2),
                new Zlomek(6,5),
                new Zlomek(4,3),
                new Zlomek(7,8),
                new Zlomek(13,10)
        };

        Zlomek bla=prumer(pole);
        IO.println("Prumer je %s".formatted(bla.zkratit()));


    }
    private static Zlomek prumer(Zlomek[] p){
        Zlomek soucet=new Zlomek();
        for(var z:p){
            soucet=soucet.plus(z);
        }
        var pocet=new Zlomek(p.length,1);
        return soucet.deleno(pocet);
    }
}
