package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tq5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qn2 B;
    public final /* synthetic */ qa4 L;

    public /* synthetic */ tq5(qn2 qn2Var, qa4 qa4Var, int i) {
        this.A = i;
        this.B = qn2Var;
        this.L = qa4Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        int i = this.A;
        String str = null;
        jg7 jg7Var = jg7.a;
        qa4 qa4Var = this.L;
        qn2 qn2Var = this.B;
        switch (i) {
            case 0:
                qa4Var.setValue(Boolean.FALSE);
                qn2Var.g(null);
                return jg7Var;
            case 1:
                qa4Var.setValue(Boolean.TRUE);
                qn2Var.g("");
                return jg7Var;
            default:
                String obj = qs6.T0((String) qa4Var.getValue()).toString();
                if (obj.length() > 0) {
                    str = obj;
                }
                qn2Var.g(str);
                return jg7Var;
        }
    }
}
