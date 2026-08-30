package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f0  reason: default package */
/* loaded from: classes.dex */
public final class f0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public final /* synthetic */ g0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f0(g0 g0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Y = g0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                ((f0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
            default:
                ((f0) t(j11Var, o31Var)).v(o27Var);
                return o27Var;
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        g0 g0Var = this.Y;
        switch (i) {
            case 0:
                return new f0(g0Var, j11Var, 0);
            default:
                return new f0(g0Var, j11Var, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ns2] */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        g0 g0Var = this.Y;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                if (g0Var.x0 == null) {
                    ?? obj2 = new Object();
                    l14 l14Var = g0Var.l0;
                    if (l14Var != null) {
                        tq5.w(g0Var.F0(), null, null, new y(l14Var, obj2, null, 0), 3);
                    }
                    g0Var.x0 = obj2;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                me2.a0(obj);
                ns2 ns2Var = g0Var.x0;
                if (ns2Var != null) {
                    os2 os2Var = new os2(ns2Var);
                    l14 l14Var2 = g0Var.l0;
                    if (l14Var2 != null) {
                        tq5.w(g0Var.F0(), null, null, new y(l14Var2, os2Var, null, 1), 3);
                    }
                    g0Var.x0 = null;
                }
                return o27Var;
        }
    }
}
