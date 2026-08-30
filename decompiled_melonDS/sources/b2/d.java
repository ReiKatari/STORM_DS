package b2;

import b4.i3;
import ec.j;
import f1.j1;
import mc.p;
import n2.f1;
import n2.m;
import n2.p1;
import n2.r;
import n2.s;
import yb.y;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final v2.c f1745a;

    /* renamed from: b  reason: collision with root package name */
    public final j1 f1746b = new j1();

    /* renamed from: c  reason: collision with root package name */
    public final f1 f1747c = s.w(null);

    public d(v2.c cVar) {
        this.f1745a = cVar;
    }

    @Override // b2.h
    public final Object a(g gVar, j jVar) {
        c cVar = new c(this, new b(gVar), null, 0);
        f1.f1 f1Var = f1.f1.Default;
        j1 j1Var = this.f1746b;
        j1Var.getClass();
        Object g10 = x.g(new i3(f1Var, j1Var, cVar, (cc.c) null), jVar);
        if (g10 == dc.a.COROUTINE_SUSPENDED) {
            return g10;
        }
        return y.f14813a;
    }

    public final void b(final int i2, final mc.a aVar, m mVar) {
        int i10;
        boolean z10;
        final mc.a aVar2;
        r rVar = (r) mVar;
        rVar.Z(723898654);
        if (rVar.f(this)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i11 = i10 | i2;
        if ((i11 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            b bVar = (b) this.f1747c.getValue();
            if (bVar == null) {
                p1 r5 = rVar.r();
                if (r5 != null) {
                    r5.f9983d = new p(this, aVar, i2, 0) { // from class: b2.a
                        public final /* synthetic */ int A;
                        public final /* synthetic */ d B;
                        public final /* synthetic */ mc.a L;

                        {
                            this.A = r4;
                            this.B = this;
                        }

                        @Override // mc.p
                        public final Object j(Object obj, Object obj2) {
                            int i12 = this.A;
                            m mVar2 = (m) obj;
                            ((Integer) obj2).getClass();
                            switch (i12) {
                                case 0:
                                    this.B.b(s.F(7), this.L, mVar2);
                                    break;
                                default:
                                    this.B.b(s.F(7), this.L, mVar2);
                                    break;
                            }
                            return y.f14813a;
                        }
                    };
                    return;
                }
                return;
            }
            aVar2 = aVar;
            this.f1745a.l(bVar, bVar.f1742a, aVar2, rVar, 384);
        } else {
            aVar2 = aVar;
            rVar.R();
        }
        p1 r10 = rVar.r();
        if (r10 != null) {
            r10.f9983d = new p(this, aVar2, i2, 1) { // from class: b2.a
                public final /* synthetic */ int A;
                public final /* synthetic */ d B;
                public final /* synthetic */ mc.a L;

                {
                    this.A = r4;
                    this.B = this;
                }

                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    int i12 = this.A;
                    m mVar2 = (m) obj;
                    ((Integer) obj2).getClass();
                    switch (i12) {
                        case 0:
                            this.B.b(s.F(7), this.L, mVar2);
                            break;
                        default:
                            this.B.b(s.F(7), this.L, mVar2);
                            break;
                    }
                    return y.f14813a;
                }
            };
        }
    }
}
