package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jm0  reason: default package */
/* loaded from: classes.dex */
public final class jm0 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ lm0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jm0(lm0 lm0Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = lm0Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((jm0) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((jm0) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        lm0 lm0Var = this.Z;
        switch (i) {
            case 0:
                return new jm0(lm0Var, j11Var, 0);
            default:
                return new jm0(lm0Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        lm0 lm0Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                kh7 b = kh7.b(((nq5) ((wm0) lm0Var.q0.getValue()).b).a);
                b.getClass();
                u92 c = b.c("cheat_import_worker");
                x6 x6Var = new x6(4, lm0Var);
                this.Y = 1;
                Object a = c.a(new z6(x6Var, 27), this);
                if (a != p31Var) {
                    a = o27Var;
                }
                if (a == p31Var) {
                    return p31Var;
                }
                return o27Var;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                qm3 qm3Var = qm3.STARTED;
                jm0 jm0Var = new jm0(lm0Var, null, 0);
                this.Y = 1;
                if (nl2.R(lm0Var, qm3Var, jm0Var, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
