package org.ushodaya.dataplatform.data.io;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;

/**
 * A {@link ByteArrayOutputStream} that exposes the written raw buffer as ByteBuffer. The {@link
 * #reset()} must be called before reusing this stream so that a new buffer is created underneath.
 */
public final class ExposedByteArrayOutputStream extends ByteArrayOutputStream {

  /**
   * Returns a {@link ByteBuffer} that represents the valid content in the buffer.
   */
  public ByteBuffer toByteBuffer() {
    return ByteBuffer.wrap(buf, 0, count);
  }

  @Override
  public synchronized void reset() {
    super.reset();
    buf = new byte[buf.length];
  }
}
