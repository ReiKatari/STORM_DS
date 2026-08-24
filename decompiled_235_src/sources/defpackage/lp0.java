package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lp0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lp0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ lp0(String str, qa4 qa4Var, int i) {
        this.A = i;
        this.B = str;
        this.L = qa4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        String str;
        zo0 zo0Var;
        cp0 cp0Var;
        ic4 ic4Var;
        String str2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.L;
        String str3 = this.B;
        switch (i) {
            case 0:
                sb4 sb4Var = (sb4) qa4Var.getValue();
                if (sb4Var != null && (ic4Var = sb4Var.B) != null && (str2 = (String) ic4Var.B.e) != null) {
                    str = qs6.Q0(str2, "/");
                } else {
                    str = null;
                }
                if (nb3.k(str, cp0.Companion.serializer().e().a())) {
                    sb4 sb4Var2 = (sb4) qa4Var.getValue();
                    if (sb4Var2 != null && (cp0Var = (cp0) bl2.W(sb4Var2, gh5.a(cp0.class))) != null) {
                        return cp0Var.h0;
                    }
                } else if (nb3.k(str, zo0.Companion.serializer().e().a())) {
                    sb4 sb4Var3 = (sb4) qa4Var.getValue();
                    if (sb4Var3 != null && (zo0Var = (zo0) bl2.W(sb4Var3, gh5.a(zo0.class))) != null) {
                        return zo0Var.h0;
                    }
                } else if (nb3.k(str, wo0.INSTANCE.serializer().e().a())) {
                    return str3;
                }
                return null;
            case 1:
                qa4Var.setValue(str3);
                return jg7Var;
            default:
                qa4Var.setValue(str3);
                return jg7Var;
        }
    }
}
