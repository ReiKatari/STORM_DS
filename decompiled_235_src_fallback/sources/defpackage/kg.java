package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kg  reason: default package */
/* loaded from: classes.dex */
public final class kg extends defpackage.aj3 implements defpackage.qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ java.util.ArrayList L;

    public /* synthetic */ kg(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.B = r1
            r0.L = r2
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.B
            jg7 r1 = defpackage.jg7.a
            r2 = 0
            java.util.ArrayList r5 = r5.L
            switch(r0) {
                case 0: goto L50;
                case 1: goto L36;
                case 2: goto L20;
                default: goto La;
            }
        La:
            cx4 r6 = (defpackage.cx4) r6
            int r0 = r5.size()
            r3 = r2
        L11:
            if (r3 >= r0) goto L1f
            java.lang.Object r4 = r5.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            defpackage.cx4.m(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L11
        L1f:
            return r1
        L20:
            cx4 r6 = (defpackage.cx4) r6
            int r0 = r5.size()
            r3 = r2
        L27:
            if (r3 >= r0) goto L35
            java.lang.Object r4 = r5.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            defpackage.cx4.j(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L27
        L35:
            return r1
        L36:
            cx4 r6 = (defpackage.cx4) r6
            int r0 = r5.size()
            int r0 = r0 + (-1)
            if (r0 < 0) goto L4f
            r3 = r2
        L41:
            java.lang.Object r4 = r5.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            defpackage.cx4.l(r6, r4, r2, r2)
            if (r3 == r0) goto L4f
            int r3 = r3 + 1
            goto L41
        L4f:
            return r1
        L50:
            cx4 r6 = (defpackage.cx4) r6
            int r0 = r5.size()
            r3 = r2
        L57:
            if (r3 >= r0) goto L65
            java.lang.Object r4 = r5.get(r3)
            dx4 r4 = (defpackage.dx4) r4
            defpackage.cx4.l(r6, r4, r2, r2)
            int r3 = r3 + 1
            goto L57
        L65:
            return r1
    }
}
