package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class l extends j {
    @Override // y.j
    public final void a(Surface surface) {
        ((OutputConfiguration) c()).addSurface(surface);
    }

    @Override // y.j
    public final void b() {
        ((OutputConfiguration) c()).enableSurfaceSharing();
    }

    @Override // y.j
    public Object c() {
        Object obj = this.f14643a;
        p7.m.h(obj instanceof k);
        return ((k) obj).f14644a;
    }

    @Override // y.j
    public String d() {
        return ((k) this.f14643a).f14645b;
    }

    @Override // y.j
    public final boolean e() {
        throw new AssertionError("isSurfaceSharingEnabled() should not be called on API >= 26");
    }

    @Override // y.j
    public void f(long j2) {
        ((k) this.f14643a).f14646c = j2;
    }

    @Override // y.j
    public void h(String str) {
        ((k) this.f14643a).f14645b = str;
    }
}
