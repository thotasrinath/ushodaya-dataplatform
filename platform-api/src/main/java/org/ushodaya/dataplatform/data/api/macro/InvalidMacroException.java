package org.ushodaya.dataplatform.data.api.macro;

/**
 * Indicates that there is an invalid macro.
 */
public class InvalidMacroException extends RuntimeException {

  public InvalidMacroException(String message) {
    super(message);
  }

  public InvalidMacroException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidMacroException(Throwable cause) {
    super(cause);
  }

}
