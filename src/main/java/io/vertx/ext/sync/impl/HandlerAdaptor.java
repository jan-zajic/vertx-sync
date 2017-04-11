package io.vertx.ext.sync.impl;

import co.paralleluniverse.fibers.FiberAsync;
import io.vertx.core.Handler;

/**
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public abstract class HandlerAdaptor<T> extends FiberAsync<T, Throwable> implements Handler<T>  {

  @Override
  @Suspendable
  public void handle(T res) {
    asyncCompleted(res);
  }
}
