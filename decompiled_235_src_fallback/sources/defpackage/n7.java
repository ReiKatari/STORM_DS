package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n7  reason: default package */
/* loaded from: classes.dex */
public final class n7 implements defpackage.qn2 {
    public final /* synthetic */ java.util.List A;
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.qn2 L;
    public final /* synthetic */ defpackage.qa4 R;
    public final /* synthetic */ defpackage.kk3 X;

    public n7(java.util.List r1, int r2, defpackage.qn2 r3, defpackage.qa4 r4, defpackage.kk3 r5) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            r0.X = r5
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r7) {
            r6 = this;
            wg3 r7 = (defpackage.wg3) r7
            android.view.KeyEvent r7 = r7.a
            r7.getClass()
            int r0 = defpackage.xk2.u(r7)
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L64
            qa4 r0 = r6.R
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L64
            int r7 = r7.getKeyCode()
            long r0 = defpackage.qo2.e(r7)
            long r3 = defpackage.kg3.f
            boolean r7 = defpackage.kg3.a(r0, r3)
            r3 = 1
            if (r7 == 0) goto L30
            r7 = -1
            goto L3b
        L30:
            long r4 = defpackage.kg3.g
            boolean r7 = defpackage.kg3.a(r0, r4)
            if (r7 == 0) goto L3a
            r7 = r3
            goto L3b
        L3a:
            r7 = r2
        L3b:
            kk3 r0 = r6.X
            kk3 r1 = defpackage.kk3.Ltr
            if (r0 != r1) goto L42
            goto L43
        L42:
            int r7 = -r7
        L43:
            if (r7 == 0) goto L64
            java.util.List r0 = r6.A
            int r1 = r0.size()
            int r4 = r6.B
            int r4 = r4 + r7
            if (r4 < 0) goto L64
            if (r4 >= r1) goto L64
            java.lang.Object r7 = r0.get(r4)
            c6 r7 = (defpackage.c6) r7
            long r0 = r7.a
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            qn2 r6 = r6.L
            r6.g(r7)
            r2 = r3
        L64:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
            return r6
    }
}
