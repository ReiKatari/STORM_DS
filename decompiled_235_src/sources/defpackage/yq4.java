package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq4  reason: default package */
/* loaded from: classes.dex */
public final class yq4 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ ue1 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq4(ue1 ue1Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = ue1Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((yq4) q(r41Var, w61Var)).s(jg7Var);
            case 1:
                return ((yq4) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((yq4) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        ue1 ue1Var = this.Z;
        switch (i) {
            case 0:
                return new yq4(ue1Var, r41Var, 0);
            case 1:
                return new yq4(ue1Var, r41Var, 1);
            default:
                return new yq4(ue1Var, r41Var, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
        r7 = r1.f(r1.k() + 1, defpackage.ge7.U(androidx.recyclerview.widget.RecyclerView.B1, androidx.recyclerview.widget.RecyclerView.B1, null, 7), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008c, code lost:
        r7 = r1.f(r1.k() - 1, defpackage.ge7.U(androidx.recyclerview.widget.RecyclerView.B1, androidx.recyclerview.widget.RecyclerView.B1, null, 7), r7);
     */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.X;
        ue1 ue1Var = this.Z;
        jg7 jg7Var = jg7.a;
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
                this.Y = 1;
                or4 or4Var = pr4.a;
                if (ue1Var.k() - 1 < 0 || obj2 != x61Var) {
                    obj2 = jg7Var;
                }
                if (obj2 == x61Var) {
                    return x61Var;
                }
                return jg7Var;
            case 1:
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
                this.Y = 1;
                or4 or4Var2 = pr4.a;
                if (ue1Var.k() + 1 >= ue1Var.n() || obj3 != x61Var2) {
                    obj3 = jg7Var;
                }
                if (obj3 == x61Var2) {
                    return x61Var2;
                }
                return jg7Var;
            default:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object s = nr4.s(ue1Var, xa4.Default, new wg(2, null, 9), this);
                if (s != x61Var3) {
                    s = jg7Var;
                }
                if (s == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
        }
    }
}
