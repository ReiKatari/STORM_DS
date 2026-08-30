package x;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends r {
    @Override // p1.a0
    public final Set y() {
        try {
            return ((CameraManager) this.B).getConcurrentCameraIds();
        } catch (CameraAccessException e6) {
            throw new a(e6);
        }
    }
}
