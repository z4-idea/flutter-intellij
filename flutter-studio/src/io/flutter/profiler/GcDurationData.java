/*
 * Copyright 2018 The Chromium Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style license that can be
 * found in the LICENSE file.
 */
package io.flutter.profiler;

import com.android.tools.adtui.model.DefaultDurationData;

public final class GcDurationData extends DefaultDurationData {
  public GcDurationData(long duration) {
    super(duration);
  }
}
