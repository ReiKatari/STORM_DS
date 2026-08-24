package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w91  reason: default package */
/* loaded from: classes.dex */
public final class w91 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ la1 Z;
    public final /* synthetic */ Context d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w91(la1 la1Var, Context context, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = la1Var;
        this.d0 = context;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((w91) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((w91) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        Context context = this.d0;
        la1 la1Var = this.Z;
        switch (i) {
            case 0:
                return new w91(la1Var, context, r41Var, 0);
            default:
                return new w91(la1Var, context, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        Context context = this.d0;
        la1 la1Var = this.Z;
        switch (i) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                be5 be5Var = la1Var.l;
                v91 v91Var = new v91(context, null, 0);
                this.Y = 1;
                if (f04.v(be5Var, v91Var, this) == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            default:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                be5 be5Var2 = la1Var.n;
                v91 v91Var2 = new v91(context, null, 1);
                this.Y = 1;
                if (f04.v(be5Var2, v91Var2, this) == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
        }
    }
}
