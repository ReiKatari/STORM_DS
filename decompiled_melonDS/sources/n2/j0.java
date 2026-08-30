package n2;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends k1.c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(int i2) {
        super("rememberCoroutineScope left the composition", 1);
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                super("The coroutine scope left the composition", 1);
                return;
            default:
                return;
        }
    }
}
