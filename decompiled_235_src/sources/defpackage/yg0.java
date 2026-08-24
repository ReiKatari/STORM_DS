package defpackage;

import android.util.Log;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yg0  reason: default package */
/* loaded from: classes.dex */
public final class yg0 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ zg0 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yg0(zg0 zg0Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = zg0Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((yg0) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((yg0) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        zg0 zg0Var = this.Z;
        switch (i) {
            case 0:
                return new yg0(zg0Var, r41Var, 0);
            default:
                return new yg0(zg0Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        zg0 zg0Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Log.d("CXCP", "Cancelling CameraPipe root Job...");
                    rc3 rc3Var = zg0Var.a;
                    this.Y = 1;
                    if (yh2.n(rc3Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                yg0 yg0Var = new yg0(zg0Var, null, 0);
                this.Y = 1;
                Object N = xk2.N(3000L, yg0Var, this);
                if (N == x61Var2) {
                    return x61Var2;
                }
                return N;
        }
    }
}
