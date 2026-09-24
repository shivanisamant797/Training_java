public interface Subscription {
    public void request(long n);
    public void cancel();
}
//Request data from publisher or cancel a request .