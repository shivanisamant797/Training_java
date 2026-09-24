
@SpringBootTest
class ReactiveProgrammingApplicationTests {

    @Test
    public void test(){
        System.out.println("Reactive Programming");
        Mono<String> monoPublisher = Mono.just(data:"testing");
        monoPublisher.subscribe(new CoreSubscriber<String>(){
            @Override
            public void onSubscribe(Subscription s) {
                System.out.println("onSubscribe");
                s.request(n:1);
            }

            @Override
            public void onNext(String s) {
                System.out.println("onNext : "+s);
            }

            @Override
            public void onError(Throwable t) {
                System.out.println("onError : "+t.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("onComplete");
            }
        }


    }

}