package Week4.All;

public class UntrustworthyMailWorker implements MailService{

    private MailService[] myMailServise = null;
    public UntrustworthyMailWorker(MailService[] myMailServise){
        this.myMailServise = myMailServise;
        SomeRealMailService = new RealMailService();
    }

    @Override
    public Sendable processMail(Sendable mail) {
        for(int i = 0; i < myMailServise.length; i++){
            myMailServise[i].processMail(mail);
        }
        getRealMailService().processMail(mail);
        return mail;
    }
    RealMailService SomeRealMailService = null;
    public RealMailService getRealMailService(){
        return SomeRealMailService;
    }
}