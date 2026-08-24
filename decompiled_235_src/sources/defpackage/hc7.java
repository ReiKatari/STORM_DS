package defpackage;

import android.database.SQLException;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc7  reason: default package */
/* loaded from: classes.dex */
public final class hc7 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ nc7 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hc7(nc7 nc7Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.d0 = nc7Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return ((hc7) q((r41) obj2, (bt4) obj)).s(jg7Var);
            default:
                return ((hc7) q((r41) obj2, (d97) obj)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        nc7 nc7Var = this.d0;
        switch (i) {
            case 0:
                hc7 hc7Var = new hc7(nc7Var, r41Var, 0);
                hc7Var.Z = obj;
                return hc7Var;
            default:
                hc7 hc7Var2 = new hc7(nc7Var, r41Var, 1);
                hc7Var2.Z = obj;
                return hc7Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
        return r0;
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        d97 d97Var;
        int i = this.X;
        nc7 nc7Var = this.d0;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object a = nc7.a(nc7Var, (bt4) this.Z, this);
                if (a == x61Var) {
                    return x61Var;
                }
                return a;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                try {
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                oi2.Y(obj);
                                return (Set) obj;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d97Var = (d97) this.Z;
                        oi2.Y(obj);
                    } else {
                        oi2.Y(obj);
                        d97Var = (d97) this.Z;
                        this.Z = d97Var;
                        this.Y = 1;
                        obj = d97Var.c(this);
                        break;
                    }
                    if (!((Boolean) obj).booleanValue()) {
                        c97 c97Var = c97.IMMEDIATE;
                        hc7 hc7Var = new hc7(nc7Var, null, 0);
                        this.Z = null;
                        this.Y = 2;
                        obj = d97Var.a(c97Var, hc7Var, this);
                        break;
                    }
                } catch (SQLException unused) {
                }
                return du1.A;
        }
    }
}
