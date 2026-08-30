package a2;

import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements b2.g {
    public final long A;
    public final /* synthetic */ k B;

    public i(k kVar, long j2) {
        this.B = kVar;
        this.A = j2;
    }

    @Override // b2.g
    public final long h0(z zVar) {
        z zVar2 = (z) this.B.f133l0.getValue();
        if (zVar2 != null) {
            return zVar.C(zVar2, this.A);
        }
        k1.b.d("Tried to open context menu before the anchor was placed.");
        wa.b.a();
        return 0L;
    }

    @Override // b2.g
    public final h3.c u(z zVar) {
        return pc.a.h(h0(zVar), 0L);
    }

    @Override // b2.g
    public final x1.c v0() {
        return l.b(this.B);
    }
}
