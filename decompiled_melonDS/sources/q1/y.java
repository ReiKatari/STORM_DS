package q1;

import ai.r0;
import h1.u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends ec.j implements mc.p {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f12201b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ float f12202c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ d1.j f12203d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, int i2, float f8, d1.j jVar, cc.c cVar) {
        super(2, cVar);
        this.Z = a0Var;
        this.f12201b0 = i2;
        this.f12202c0 = f8;
        this.f12203d0 = jVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        return ((y) t((cc.c) obj2, (u1) obj)).v(yb.y.f14813a);
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        y yVar = new y(this.Z, this.f12201b0, this.f12202c0, this.f12203d0, cVar);
        yVar.Y = obj;
        return yVar;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        boolean z10;
        int i2;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        int i10 = this.X;
        yb.y yVar = yb.y.f14813a;
        if (i10 != 0) {
            if (i10 == 1) {
                p7.j.I(obj);
                return yVar;
            }
            a0.j.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p7.j.I(obj);
        a0 a0Var = this.Z;
        n1.s sVar = new n1.s((u1) this.Y, a0Var, 1);
        this.X = 1;
        float f8 = d0.f12126a;
        int i11 = this.f12201b0;
        a0Var.f12110s.h(a0Var.j(new Integer(i11).intValue()));
        if (i11 > a0Var.f12097e) {
            z10 = true;
        } else {
            z10 = false;
        }
        int e6 = (sVar.e() - a0Var.f12097e) + 1;
        if (((z10 && i11 > sVar.e()) || (!z10 && i11 < a0Var.f12097e)) && Math.abs(i11 - a0Var.f12097e) >= 3) {
            if (z10) {
                i2 = i11 - e6;
                int i12 = a0Var.f12097e;
                if (i2 < i12) {
                    i2 = i12;
                }
            } else {
                int i13 = e6 + i11;
                i2 = a0Var.f12097e;
                if (i13 <= i2) {
                    i2 = i13;
                }
            }
            sVar.f(i2);
        }
        Object e10 = d1.d.e(0.0f, sVar.b(i11) + this.f12202c0, 0.0f, this.f12203d0, new r0(29, new Object(), sVar), this, 4);
        if (e10 != aVar) {
            e10 = yVar;
        }
        if (e10 == aVar) {
            return aVar;
        }
        return yVar;
    }
}
