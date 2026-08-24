package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r9  reason: default package */
/* loaded from: classes.dex */
public final class r9 implements defpackage.j8, defpackage.g44 {
    public final androidx.appcompat.widget.Toolbar A;

    public r9(android.widget.FrameLayout r1, androidx.appcompat.widget.Toolbar r2) {
            r0 = this;
            r0.<init>()
            r0.A = r2
            return
    }

    public /* synthetic */ r9(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.g44
    public void H(defpackage.i44 r3) {
            r2 = this;
            androidx.appcompat.widget.Toolbar r2 = r2.A
            androidx.appcompat.widget.ActionMenuView r0 = r2.A
            g8 r0 = r0.s0
            if (r0 == 0) goto Lf
            boolean r0 = r0.j()
            if (r0 == 0) goto Lf
            goto L2b
        Lf:
            m44 r0 = r2.F0
            java.lang.Object r0 = r0.L
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            fl2 r1 = (defpackage.fl2) r1
            androidx.fragment.app.u r1 = r1.a
            r1.t(r3)
            goto L19
        L2b:
            h87 r2 = r2.N0
            if (r2 == 0) goto L32
            r2.H(r3)
        L32:
            return
    }

    @Override // defpackage.g44
    public boolean n(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            r0 = 0
            return r0
    }
}
