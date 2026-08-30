package z1;

import a5.q0;
import d2.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements q0 {
    public final t A;
    public x4.l B;
    public x4.m L;
    public x4.l R;
    public x4.j X;

    public m(t tVar) {
        this.A = tVar;
    }

    @Override // a5.q0
    public final long d(x4.k kVar, long j2, x4.m mVar, long j10) {
        boolean b10;
        x4.j jVar = this.X;
        if (jVar != null) {
            x4.l lVar = this.B;
            boolean z10 = false;
            if (lVar == null) {
                b10 = false;
            } else {
                b10 = x4.l.b(lVar.f14346a, j2);
            }
            if (b10 && this.L == mVar) {
                x4.l lVar2 = this.R;
                if (lVar2 != null) {
                    z10 = x4.l.b(lVar2.f14346a, j10);
                }
                if (z10) {
                    return jVar.f14340a;
                }
            }
        }
        long d4 = this.A.d(kVar, j2, mVar, j10);
        this.B = new x4.l(j2);
        this.L = mVar;
        this.R = new x4.l(j10);
        this.X = new x4.j(d4);
        return d4;
    }
}
