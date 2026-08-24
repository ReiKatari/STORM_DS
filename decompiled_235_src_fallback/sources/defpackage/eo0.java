package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo0  reason: default package */
/* loaded from: classes.dex */
public final class eo0 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.qa4 B;

    public /* synthetic */ eo0(defpackage.qa4 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.A
            r1 = 0
            qa4 r8 = r8.B
            r2 = 2
            r3 = 1
            switch(r0) {
                case 0: goto L30;
                default: goto La;
            }
        La:
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            r9.getClass()
            int r0 = defpackage.xk2.u(r9)
            if (r0 != r2) goto L2b
            int r9 = r9.getKeyCode()
            long r4 = defpackage.qo2.e(r9)
            long r6 = defpackage.kg3.E
            boolean r9 = defpackage.kg3.a(r4, r6)
            if (r9 == 0) goto L2b
            defpackage.np2.c(r8, r3)
            r1 = r3
        L2b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
        L30:
            wg3 r9 = (defpackage.wg3) r9
            android.view.KeyEvent r9 = r9.a
            r9.getClass()
            int r0 = defpackage.xk2.u(r9)
            if (r0 != r2) goto L53
            int r9 = r9.getKeyCode()
            long r4 = defpackage.qo2.e(r9)
            long r6 = defpackage.kg3.E
            boolean r9 = defpackage.kg3.a(r4, r6)
            if (r9 == 0) goto L53
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            r8.setValue(r9)
            r1 = r3
        L53:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            return r8
    }
}
