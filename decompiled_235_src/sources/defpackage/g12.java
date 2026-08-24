package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g12  reason: default package */
/* loaded from: classes.dex */
public final class g12 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ sz1 Y;
    public final /* synthetic */ pq5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g12(sz1 sz1Var, pq5 pq5Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Y = sz1Var;
        this.Z = pq5Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((g12) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((g12) q(r41Var, w61Var)).s(jg7Var);
            default:
                ((g12) q(r41Var, w61Var)).s(jg7Var);
                return jg7Var;
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        pq5 pq5Var = this.Z;
        sz1 sz1Var = this.Y;
        switch (i) {
            case 0:
                return new g12(sz1Var, pq5Var, r41Var, 0);
            case 1:
                return new g12(sz1Var, pq5Var, r41Var, 1);
            default:
                return new g12(sz1Var, pq5Var, r41Var, 2);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        String a;
        zl1 f;
        boolean z;
        int i = this.X;
        Date date = null;
        pq5 pq5Var = this.Z;
        sz1 sz1Var = this.Y;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                yb2 yb2Var = sz1Var.s;
                yb2Var.getClass();
                pq5Var.getClass();
                zl1 e = yb2Var.e(pq5Var);
                if (e == null || (a = yb2Var.a(pq5Var)) == null) {
                    f = null;
                } else {
                    f = e.f(a.concat(".ml0"));
                }
                if (f != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (f != null) {
                    date = new Date(f.m());
                }
                c46 c46Var = new c46(0, z, date, yb2Var.d(pq5Var, 0), 32);
                return c46.a(c46Var, yb2Var.c.b(pq5Var, c46Var));
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                return sz1Var.s.c(pq5Var);
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                oi2.Y(obj);
                sz1.T(sz1Var, new zx1(null, null));
                hv.L(sz1Var.z, null, null, new u12(sz1Var, (Object) pq5Var, (r41) null, 1), 3);
                return jg7.a;
        }
    }
}
