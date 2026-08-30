package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i61  reason: default package */
/* loaded from: classes.dex */
public final class i61 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ w61 Z;
    public final /* synthetic */ Context c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i61(w61 w61Var, Context context, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = w61Var;
        this.c0 = context;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        o31 o31Var = (o31) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((i61) t(j11Var, o31Var)).v(o27Var);
            default:
                return ((i61) t(j11Var, o31Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        Context context = this.c0;
        w61 w61Var = this.Z;
        switch (i) {
            case 0:
                return new i61(w61Var, context, j11Var, 0);
            default:
                return new i61(w61Var, context, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        Context context = this.c0;
        w61 w61Var = this.Z;
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
                o45 o45Var = w61Var.j;
                h61 h61Var = new h61(context, null, 0);
                this.Y = 1;
                if (se.m(o45Var, h61Var, this) == p31Var) {
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
                o45 o45Var2 = w61Var.l;
                h61 h61Var2 = new h61(context, null, 1);
                this.Y = 1;
                if (se.m(o45Var2, h61Var2, this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
