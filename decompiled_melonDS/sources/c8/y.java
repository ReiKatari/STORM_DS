package c8;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends u {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2720a;

    /* renamed from: b  reason: collision with root package name */
    public t f2721b;

    public /* synthetic */ y(t tVar, int i2) {
        this.f2720a = i2;
        this.f2721b = tVar;
    }

    @Override // c8.u, c8.r
    public void a(t tVar) {
        switch (this.f2720a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                z zVar = (z) this.f2721b;
                int i2 = zVar.A0 - 1;
                zVar.A0 = i2;
                if (i2 == 0) {
                    zVar.B0 = false;
                    zVar.p();
                }
                tVar.D(this);
                return;
            case 2:
                this.f2721b.G();
                tVar.D(this);
                return;
            default:
                return;
        }
    }

    @Override // c8.u, c8.r
    public void e(t tVar) {
        switch (this.f2720a) {
            case 0:
                z zVar = (z) this.f2721b;
                zVar.f2722y0.remove(tVar);
                if (!zVar.v()) {
                    zVar.A(zVar, s.f2690e, false);
                    zVar.f2707l0 = true;
                    zVar.A(zVar, s.f2689d, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // c8.u, c8.r
    public void f(t tVar) {
        switch (this.f2720a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                z zVar = (z) this.f2721b;
                if (!zVar.B0) {
                    zVar.O();
                    zVar.B0 = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ y() {
        this.f2720a = 1;
    }
}
