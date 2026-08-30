package y;

import android.hardware.camera2.params.OutputConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o extends n {
    @Override // y.n, y.l, y.j
    public final Object c() {
        Object obj = this.f14643a;
        p7.m.h(obj instanceof OutputConfiguration);
        return obj;
    }

    @Override // y.n, y.l, y.j
    public final void f(long j2) {
        ((OutputConfiguration) c()).setDynamicRangeProfile(j2);
    }

    @Override // y.j
    public final void g(int i2) {
        ((OutputConfiguration) c()).setMirrorMode(i2);
    }

    @Override // y.j
    public final void i(long j2) {
        if (j2 == -1) {
            return;
        }
        ((OutputConfiguration) c()).setStreamUseCase(j2);
    }
}
