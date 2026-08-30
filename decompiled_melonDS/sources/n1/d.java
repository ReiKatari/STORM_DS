package n1;

import f1.f1;
import h1.n1;
import n2.e0;
import p1.a0;
import p1.u0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements u0 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f9758a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f9759b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f9760c;

    public d(x xVar, boolean z10) {
        this.f9759b = xVar;
        this.f9760c = z10;
        this.f9758a = n2.s.q(new mh.q(xVar, 1));
    }

    @Override // p1.u0
    public final int a() {
        long g10;
        x xVar = this.f9759b;
        if (xVar.i().f9813o == n1.Vertical) {
            g10 = xVar.i().g() & 4294967295L;
        } else {
            g10 = xVar.i().g() >> 32;
        }
        return (int) g10;
    }

    @Override // p1.u0
    public final float b() {
        x xVar = this.f9759b;
        return (xVar.g() * 500) + xVar.h();
    }

    @Override // p1.u0
    public final i4.c c() {
        boolean z10 = this.f9760c;
        e0 e0Var = this.f9758a;
        if (z10) {
            return new i4.c(((Number) e0Var.getValue()).intValue(), 1);
        }
        return new i4.c(1, ((Number) e0Var.getValue()).intValue());
    }

    @Override // p1.u0
    public final Object d(int i2, ai.f fVar) {
        a0 a0Var = x.f9846x;
        x xVar = this.f9759b;
        xVar.getClass();
        Object c4 = xVar.c(f1.Default, new a9.b(xVar, i2, null, 24), fVar);
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        yb.y yVar = yb.y.f14813a;
        if (c4 != aVar) {
            c4 = yVar;
        }
        if (c4 == aVar) {
            return c4;
        }
        return yVar;
    }

    @Override // p1.u0
    public final int e() {
        x xVar = this.f9759b;
        return (-xVar.i().f9811l) + xVar.i().f9814p;
    }

    @Override // p1.u0
    public final float f() {
        x xVar = this.f9759b;
        int g10 = xVar.g();
        int h2 = xVar.h();
        if (xVar.d()) {
            return (g10 * 500) + h2 + 100;
        }
        return (g10 * 500) + h2;
    }
}
