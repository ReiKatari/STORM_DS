package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a55  reason: default package */
/* loaded from: classes.dex */
public final class a55 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ c55 Z;
    public final /* synthetic */ vw2 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a55(c55 c55Var, vw2 vw2Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = c55Var;
        this.c0 = vw2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((a55) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((a55) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        vw2 vw2Var = this.c0;
        c55 c55Var = this.Z;
        switch (i) {
            case 0:
                return new a55(c55Var, vw2Var, j11Var, 0);
            default:
                return new a55(c55Var, vw2Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        vw2 vw2Var = this.c0;
        c55 c55Var = this.Z;
        switch (i) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        me2.a0(obj);
                    } else {
                        i.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    me2.a0(obj);
                    this.Y = 1;
                    obj = c55.a(c55Var, vw2Var, 0, this);
                    if (obj == p31Var) {
                        return p31Var;
                    }
                }
                ww2 ww2Var = (ww2) obj;
                return obj;
            default:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return obj;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                this.Y = 1;
                Object a = c55.a(c55Var, vw2Var, 1, this);
                if (a == p31Var2) {
                    return p31Var2;
                }
                return a;
        }
    }
}
