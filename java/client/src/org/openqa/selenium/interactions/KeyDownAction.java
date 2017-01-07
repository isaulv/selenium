// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.

package org.openqa.selenium.interactions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.internal.SingleKeyAction;
import org.openqa.selenium.internal.Locatable;

import java.util.Arrays;
import java.util.List;

/**
 * Emulates key press only, without the release.
 *
 */
public class KeyDownAction extends SingleKeyAction implements Action {
  public KeyDownAction(Keyboard keyboard, Mouse mouse, Locatable locationProvider, Keys key) {
    super(keyboard, mouse, locationProvider, key);
  }

  public KeyDownAction(Keyboard keyboard, Mouse mouse, Keys key) {
    super(keyboard, mouse, key);
  }

  public void perform() {
    focusOnElement();

    keyboard.pressKey(key);
  }

  public List<Object> asList() {
    return Arrays.asList("keyDown", key);
  }
}
