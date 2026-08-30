package j0;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 implements d0.h1 {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7218b;

    /* renamed from: c  reason: collision with root package name */
    public final d0.h1 f7219c;

    public i0(int i2, long j2) {
        this.f7218b = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f7219c = new i2(j2, new h0(j2));
                return;
            default:
                this.f7219c = new i0(1, j2);
                return;
        }
    }

    @Override // d0.h1
    public final long a() {
        switch (this.f7218b) {
            case 0:
                return ((i2) ((i0) this.f7219c).f7219c).f7220b;
            default:
                return ((i2) this.f7219c).f7220b;
        }
    }

    @Override // d0.h1
    public final d0.g1 b(g0 g0Var) {
        switch (this.f7218b) {
            case 0:
                if (!((i2) ((i0) this.f7219c).f7219c).b(g0Var).f3386b) {
                    Throwable th2 = g0Var.f7205c;
                    if (th2 instanceof n0) {
                        aj.g.s("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                        if (((n0) th2).A > 0) {
                            return d0.g1.f3384f;
                        }
                    }
                    return d0.g1.f3382d;
                }
                return d0.g1.f3383e;
            default:
                return ((i2) this.f7219c).b(g0Var);
        }
    }
}
