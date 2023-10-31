public class VillanoDeUltratumba implements ISerDeUltratumba{
    private String legion;

    public VillanoDeUltratumba(String legion) {
        this.legion = legion;
    }

    public String getLegion() {
        return legion;
    }

    public void setLegion(String legion) {
        this.legion = legion;
    }



    @Override
    public void asustar() {
        System.out.println("Buuuuuuuu!");
    }

    @Override
    public void gritar() {
        System.out.println("Uaaaaay!!");
    }
}
