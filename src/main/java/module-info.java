module javax.jmdns.jmdns {
    requires java.logging;
    //requires org.slf4j;  //deleted this

    exports javax.jmdns;
    exports javax.jmdns.impl;
    exports javax.jmdns.impl.constants;
    exports javax.jmdns.impl.tasks;
    exports javax.jmdns.impl.tasks.resolver;
    exports javax.jmdns.impl.tasks.state;

}
