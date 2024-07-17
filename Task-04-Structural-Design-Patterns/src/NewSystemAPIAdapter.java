public class NewSystemAPIAdapter extends OldSystemAPI {
    public NewSystemAPI newSystemAPI;

    public NewSystemAPIAdapter(NewSystemAPI newSystemAPI) {
        this.newSystemAPI = newSystemAPI;
    }

    @Override
    public String call() {

        return super.call();
    }

    private NewSystemAPI convertFromOldToNew(OldSystemAPI oldSystemAPI) {
        return newSystemAPI ;
    }
}
