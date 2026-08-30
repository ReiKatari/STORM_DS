package y;

import android.hardware.camera2.params.OutputConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class n extends l {
    @Override // y.l, y.j
    public Object c() {
        Object obj = this.f14643a;
        p7.m.h(obj instanceof m);
        return ((m) obj).f14647a;
    }

    @Override // y.l, y.j
    public final String d() {
        return null;
    }

    @Override // y.l, y.j
    public void f(long j2) {
        ((m) this.f14643a).f14648b = j2;
    }

    @Override // y.l, y.j
    public final void h(String str) {
        ((OutputConfiguration) c()).setPhysicalCameraId(str);
    }
}
