/*
 * Copyright © 2014 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package org.ushodaya.dataplatform.data.api.data.schema;

import org.ushodaya.dataplatform.data.api.annotation.Beta;

/**
 * Exception to indicate a given type is not supported.
 */
@Beta
public class UnsupportedTypeException extends Exception {

  public UnsupportedTypeException(String message) {
    super(message);
  }

  public UnsupportedTypeException(String message, Throwable cause) {
    super(message, cause);
  }

  public UnsupportedTypeException(Throwable cause) {
    super(cause);
  }
}
