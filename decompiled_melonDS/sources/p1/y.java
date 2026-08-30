package p1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a  reason: collision with root package name */
    public final y2.d f11286a;

    /* renamed from: b  reason: collision with root package name */
    public final ai.s f11287b;

    /* renamed from: c  reason: collision with root package name */
    public final a1.m0 f11288c;

    public y(y2.d dVar, ai.s sVar) {
        this.f11286a = dVar;
        this.f11287b = sVar;
        long[] jArr = a1.u0.f103a;
        this.f11288c = new a1.m0();
    }

    public final mc.p a(int i2, Object obj, Object obj2) {
        a1.m0 m0Var = this.f11288c;
        x xVar = (x) m0Var.g(obj);
        if (xVar != null && xVar.f11283c == i2 && nc.k.a(xVar.f11282b, obj2)) {
            v2.c cVar = xVar.f11284d;
            if (cVar == null) {
                v2.c cVar2 = new v2.c(818252804, true, new ai.r0(26, xVar.f11285e, xVar));
                xVar.f11284d = cVar2;
                return cVar2;
            }
            return cVar;
        }
        x xVar2 = new x(this, i2, obj, obj2);
        m0Var.m(obj, xVar2);
        v2.c cVar3 = xVar2.f11284d;
        if (cVar3 == null) {
            v2.c cVar4 = new v2.c(818252804, true, new ai.r0(26, this, xVar2));
            xVar2.f11284d = cVar4;
            return cVar4;
        }
        return cVar3;
    }

    public final Object b(Object obj) {
        if (obj != null) {
            x xVar = (x) this.f11288c.g(obj);
            if (xVar != null) {
                return xVar.f11282b;
            }
            z zVar = (z) this.f11287b.b();
            int d4 = zVar.d(obj);
            if (d4 != -1) {
                return zVar.c(d4);
            }
            return null;
        }
        return null;
    }
}
