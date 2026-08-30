package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vw1  reason: default package */
/* loaded from: classes.dex */
public final class vw1 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ hv1 Y;
    public final /* synthetic */ rg5 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw1(hv1 hv1Var, rg5 rg5Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = hv1Var;
        this.Z = rg5Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((vw1) t(j11Var, o31Var)).v(o27Var);
            case 1:
                return ((vw1) t(j11Var, o31Var)).v(o27Var);
            default:
                ((vw1) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        rg5 rg5Var = this.Z;
        hv1 hv1Var = this.Y;
        switch (i) {
            case 0:
                return new vw1(hv1Var, rg5Var, j11Var, 0);
            case 1:
                return new vw1(hv1Var, rg5Var, j11Var, 1);
            default:
                return new vw1(hv1Var, rg5Var, j11Var, 2);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        String a;
        uh1 f;
        boolean z;
        Date date;
        int i = this.X;
        rg5 rg5Var = this.Z;
        hv1 hv1Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                e72 e72Var = hv1Var.s;
                e72Var.getClass();
                rg5Var.getClass();
                uh1 d = e72Var.d(rg5Var);
                if (d == null || (a = e72Var.a(rg5Var)) == null) {
                    f = null;
                } else {
                    f = d.f(a.concat(".ml0"));
                }
                if (f != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (f != null) {
                    date = new Date(f.m());
                } else {
                    date = null;
                }
                ft5 ft5Var = new ft5(0, z, date, null);
                return ft5.a(ft5Var, e72Var.b.b(rg5Var, ft5Var));
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                return hv1Var.s.c(rg5Var);
            default:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                hv1.W(hv1Var, new ot1(null, null));
                tq5.w(hv1Var.z, null, null, new a0(hv1Var, rg5Var, null, 29), 3);
                return o27.a;
        }
    }
}
