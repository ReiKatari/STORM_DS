package d0;

import android.view.Surface;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z implements m0.c {
    public static final z R;
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;

    static {
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        R = new z(0, new z5.b(valueOf2, valueOf2), new z5.b(valueOf, valueOf));
    }

    public /* synthetic */ z(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    @Override // m0.c
    public void D(Object obj) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                Void r42 = (Void) obj;
                p7.m.o(null, ((b5.i) this.B).b(null));
                return;
            default:
                Void r43 = (Void) obj;
                ((z5.a) this.B).accept(new j(0, (Surface) this.L));
                return;
        }
    }

    @Override // m0.c
    public void z(Throwable th2) {
        switch (this.A) {
            case DSiCameraSource.FrontCamera /* 1 */:
                if (th2 instanceof q1) {
                    p7.m.o(null, ((b5.l) this.L).cancel(false));
                    return;
                } else {
                    p7.m.o(null, ((b5.i) this.B).b(null));
                    return;
                }
            default:
                p7.m.o("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof q1);
                ((z5.a) this.B).accept(new j(1, (Surface) this.L));
                return;
        }
    }
}
