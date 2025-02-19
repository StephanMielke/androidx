/*
 * Copyright 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.camera.core.streamsharing

import android.hardware.camera2.CameraDevice
import android.os.Build
import androidx.annotation.RequiresApi

/**
 * A fake [CameraDevice.StateCallback].
 */
@RequiresApi(Build.VERSION_CODES.LOLLIPOP)
class FakeCameraStateCallback : CameraDevice.StateCallback() {

    var onOpenedCalled = false
    var onDisconnectedCalled = false
    var onErrorCalled = false

    override fun onOpened(camera: CameraDevice) {
        onOpenedCalled = true
    }

    override fun onDisconnected(camera: CameraDevice) {
        onDisconnectedCalled = true
    }

    override fun onError(camera: CameraDevice, error: Int) {
        onErrorCalled = true
    }
}
