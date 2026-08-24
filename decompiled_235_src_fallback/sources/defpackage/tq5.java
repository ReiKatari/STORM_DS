package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tq5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class tq5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qn2 B;
    public final /* synthetic */ defpackage.qa4 L;

    public /* synthetic */ tq5(defpackage.qn2 r1, defpackage.qa4 r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.B = r1
            r0.L = r2
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r4 = this;
            int r0 = r4.A
            r1 = 0
            jg7 r2 = defpackage.jg7.a
            qa4 r3 = r4.L
            qn2 r4 = r4.B
            switch(r0) {
                case 0: goto L30;
                case 1: goto L25;
                default: goto Lc;
            }
        Lc:
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            int r3 = r0.length()
            if (r3 <= 0) goto L21
            r1 = r0
        L21:
            r4.g(r1)
            return r2
        L25:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setValue(r0)
            java.lang.String r0 = ""
            r4.g(r0)
            return r2
        L30:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            r4.g(r1)
            return r2
    }
}
