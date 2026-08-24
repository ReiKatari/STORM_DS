package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: np0  reason: default package */
/* loaded from: classes.dex */
public final class np0 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ rc4 B;

    public /* synthetic */ np0(rc4 rc4Var, int i) {
        this.A = i;
        this.B = rc4Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        rc4 rc4Var = this.B;
        switch (i) {
            case 0:
                rm4 rm4Var = (rm4) obj;
                rc4.b(rc4Var, dp0.INSTANCE);
                return jg7Var;
            case 1:
                rc4.b(rc4Var, new cp0(((rm4) obj).a));
                return jg7Var;
            case 2:
                rc4.b(rc4Var, new zo0(((rm4) obj).a));
                return jg7Var;
            default:
                jg7 jg7Var2 = (jg7) obj;
                rc4.b(rc4Var, wo0.INSTANCE);
                return jg7Var;
        }
    }
}
