package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vo3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vo3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qa4 B;
    public final /* synthetic */ java.util.ArrayList L;
    public final /* synthetic */ java.util.List R;

    public /* synthetic */ vo3(defpackage.qa4 r1, java.util.ArrayList r2, java.util.List r3, boolean r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.A
            r1 = 0
            r2 = 1
            java.util.List r3 = r7.R
            java.util.ArrayList r4 = r7.L
            qa4 r7 = r7.B
            jg7 r5 = defpackage.jg7.a
            cx4 r8 = (defpackage.cx4) r8
            switch(r0) {
                case 0: goto L3f;
                default: goto L11;
            }
        L11:
            r8.A = r2
            int r0 = r4.size()
            r2 = r1
        L18:
            if (r2 >= r0) goto L26
            java.lang.Object r6 = r4.get(r2)
            kr3 r6 = (defpackage.kr3) r6
            r6.j(r8)
            int r2 = r2 + 1
            goto L18
        L26:
            int r0 = r3.size()
            r2 = r1
        L2b:
            if (r2 >= r0) goto L39
            java.lang.Object r4 = r3.get(r2)
            kr3 r4 = (defpackage.kr3) r4
            r4.j(r8)
            int r2 = r2 + 1
            goto L2b
        L39:
            r8.A = r1
            r7.getValue()
            return r5
        L3f:
            r8.A = r2
            int r0 = r4.size()
            r2 = r1
        L46:
            if (r2 >= r0) goto L54
            java.lang.Object r6 = r4.get(r2)
            xo3 r6 = (defpackage.xo3) r6
            r6.j(r8)
            int r2 = r2 + 1
            goto L46
        L54:
            int r0 = r3.size()
            r2 = r1
        L59:
            if (r2 >= r0) goto L67
            java.lang.Object r4 = r3.get(r2)
            xo3 r4 = (defpackage.xo3) r4
            r4.j(r8)
            int r2 = r2 + 1
            goto L59
        L67:
            r8.A = r1
            r7.getValue()
            return r5
    }
}
