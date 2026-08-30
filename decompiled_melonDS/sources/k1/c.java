package k1;

import java.util.concurrent.CancellationException;
import me.magnum.melonds.common.camera.DSiCameraSource;
import v2.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c extends CancellationException {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i2) {
        super(str);
        this.A = i2;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.A) {
            case 0:
                setStackTrace(d.f7953a);
                return this;
            case DSiCameraSource.FrontCamera /* 1 */:
                setStackTrace(h.f13612a);
                return this;
            default:
                setStackTrace(x3.b.f14336a);
                return this;
        }
    }
}
