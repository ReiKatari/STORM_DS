package r0;

import android.view.Surface;
import j0.t0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements m0.a {
    public final /* synthetic */ l A;
    public final /* synthetic */ k B;
    public final /* synthetic */ int L;
    public final /* synthetic */ d0.h R;
    public final /* synthetic */ d0.h X;

    public /* synthetic */ j(l lVar, k kVar, int i2, d0.h hVar, d0.h hVar2) {
        this.A = lVar;
        this.B = kVar;
        this.L = i2;
        this.R = hVar;
        this.X = hVar2;
    }

    @Override // m0.a
    public final ta.a apply(Object obj) {
        boolean z10;
        k kVar = this.B;
        Surface surface = (Surface) obj;
        l lVar = this.A;
        lVar.getClass();
        surface.getClass();
        try {
            kVar.d();
            m mVar = new m(surface, this.L, lVar.f12588g.f7235a, this.R, this.X);
            mVar.f12599e0.B.a(new g(kVar, 1), ij.a.D());
            if (kVar.f12581r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            p7.m.o("Consumer can only be linked once.", z10);
            kVar.f12581r = mVar;
            return m0.i.c(mVar);
        } catch (t0 e6) {
            return new m0.k(1, e6);
        }
    }
}
