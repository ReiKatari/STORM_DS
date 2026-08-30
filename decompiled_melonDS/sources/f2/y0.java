package f2;

import h1.f3;
import h1.n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends ec.j implements mc.p {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ long Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f4809b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f4810c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f4811d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ Object f4812e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ Object f4813f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(p pVar, String str, long j2, l4.q0 q0Var, b1 b1Var, q4.q qVar, cc.c cVar) {
        super(2, cVar);
        this.f4809b0 = pVar;
        this.f4810c0 = str;
        this.Z = j2;
        this.f4811d0 = q0Var;
        this.f4812e0 = b1Var;
        this.f4813f0 = qVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((y0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            default:
                return ((y0) t((cc.c) obj2, (n2) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new y0((p) this.f4809b0, (String) this.f4810c0, this.Z, (l4.q0) this.f4811d0, (b1) this.f4812e0, (q4.q) this.f4813f0, cVar);
            default:
                y0 y0Var = new y0((f3) this.f4810c0, (h1.j) this.f4811d0, (h1.d) this.f4812e0, this.Z, (zc.y0) this.f4813f0, cVar);
                y0Var.f4809b0 = obj;
                return y0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.y0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(f3 f3Var, h1.j jVar, h1.d dVar, long j2, zc.y0 y0Var, cc.c cVar) {
        super(2, cVar);
        this.f4810c0 = f3Var;
        this.f4811d0 = jVar;
        this.f4812e0 = dVar;
        this.Z = j2;
        this.f4813f0 = y0Var;
    }
}
