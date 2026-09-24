public interface Processor<T, R> extends Subscriber<T>, Publisher<R> {
}

//Processor interface is the combination of both Subscirber and publisher interface.
