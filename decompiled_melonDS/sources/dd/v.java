package dd;

import ai.s0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends ec.c implements cd.i {
    public final cd.i R;
    public final cc.g X;
    public final int Y;
    public cc.g Z;

    /* renamed from: b0  reason: collision with root package name */
    public cc.c f4049b0;

    public v(cd.i iVar, cc.g gVar) {
        super(t.A, cc.h.A);
        this.R = iVar;
        this.X = gVar;
        this.Y = ((Number) gVar.L(0, new ai.l(10))).intValue();
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        try {
            Object x9 = x(cVar, obj);
            if (x9 == dc.a.COROUTINE_SUSPENDED) {
                return x9;
            }
            return yb.y.f14813a;
        } catch (Throwable th2) {
            this.Z = new q(cVar.g(), th2);
            throw th2;
        }
    }

    @Override // ec.a, ec.d
    public final ec.d f() {
        cc.c cVar = this.f4049b0;
        if (cVar instanceof ec.d) {
            return (ec.d) cVar;
        }
        return null;
    }

    @Override // ec.c, cc.c
    public final cc.g g() {
        cc.g gVar = this.Z;
        if (gVar == null) {
            return cc.h.A;
        }
        return gVar;
    }

    @Override // ec.a
    public final StackTraceElement u() {
        return null;
    }

    @Override // ec.a
    public final Object v(Object obj) {
        Throwable a10 = yb.l.a(obj);
        if (a10 != null) {
            this.Z = new q(g(), a10);
        }
        cc.c cVar = this.f4049b0;
        if (cVar != null) {
            cVar.h(obj);
        }
        return dc.a.COROUTINE_SUSPENDED;
    }

    public final Object x(cc.c cVar, Object obj) {
        cc.g g10 = cVar.g();
        zc.x.j(g10);
        cc.g gVar = this.Z;
        if (gVar != g10) {
            if (!(gVar instanceof q)) {
                if (((Number) g10.L(0, new s0(3, this))).intValue() == this.Y) {
                    this.Z = g10;
                } else {
                    throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.X + ",\n\t\tbut emission happened in " + g10 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
                }
            } else {
                throw new IllegalStateException(vc.i.J("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((q) gVar).B + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
        }
        this.f4049b0 = cVar;
        mc.q qVar = x.f4051a;
        cd.i iVar = this.R;
        iVar.getClass();
        Object i2 = qVar.i(iVar, obj, this);
        if (!nc.k.a(i2, dc.a.COROUTINE_SUSPENDED)) {
            this.f4049b0 = null;
        }
        return i2;
    }
}
