package defpackage;

import java.lang.reflect.Type;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g43  reason: default package */
/* loaded from: classes.dex */
public final class g43 extends nk6 implements aj2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ k43 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g43(k43 k43Var, j11 j11Var, int i) {
        super(2, j11Var);
        this.X = i;
        this.Z = k43Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.X;
        o27 o27Var = o27.a;
        w92 w92Var = (w92) obj;
        j11 j11Var = (j11) obj2;
        switch (i) {
            case 0:
                return ((g43) t(j11Var, w92Var)).v(o27Var);
            default:
                return ((g43) t(j11Var, w92Var)).v(o27Var);
        }
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        int i = this.X;
        k43 k43Var = this.Z;
        switch (i) {
            case 0:
                return new g43(k43Var, j11Var, 0);
            default:
                return new g43(k43Var, j11Var, 1);
        }
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        int i = this.X;
        o27 o27Var = o27.a;
        k43 k43Var = this.Z;
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
                this.Y = 1;
                Type type = k43.h;
                if (k43Var.c(this) == p31Var) {
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
                this.Y = 1;
                Type type2 = k43.h;
                if (k43Var.c(this) == p31Var2) {
                    return p31Var2;
                }
                return o27Var;
        }
    }
}
