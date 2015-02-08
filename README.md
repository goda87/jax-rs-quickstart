JAX-RS Quickstart: Gradle & Jetty
=================================

This repository should help you get started with JAX-RS & Servlet 3 in no time.

We're using Jersey, Gradle and an embedded Jetty container.

Quickstart:

    git clone git@github.com:Nimlhug/jax-rs-quickstart.git
    cd jax-rs-quickstart
    gradle jettyEclipseRun

Then navigate your browser to http://localhost:8080/api

Notes
-----

 * The build relies on JDK 8 for no reason in particular. If you don't like it, you can change it.
 * web.xml is not required.
