package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi6  reason: default package */
/* loaded from: classes.dex */
public final class gi6 extends defpackage.ga2 {
    public final defpackage.b63 L;
    public boolean R;

    public gi6(defpackage.s03 r1, defpackage.b63 r2, boolean r3, defpackage.u87 r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r4.getClass()
            r0.<init>(r1, r3, r4)
            r0.L = r2
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            s03 r0 = r5.A
            r6.getClass()
            r7.getClass()
            int r7 = r7.getActionMasked()
            r1 = 0
            b63 r2 = r5.L
            r3 = 1
            if (r7 == 0) goto L36
            if (r7 == r3) goto L18
            r4 = 3
            if (r7 == r4) goto L18
            goto L54
        L18:
            boolean r7 = r5.R
            if (r7 == 0) goto L54
            r7 = 0
            r5.R = r7
            r0.b(r2)
            ea2 r7 = defpackage.ea2.KEY_RELEASE
            r5.a(r6, r7)
            boolean r5 = r6 instanceof defpackage.r03
            if (r5 == 0) goto L2e
            r1 = r6
            r03 r1 = (defpackage.r03) r1
        L2e:
            if (r1 == 0) goto L54
            du1 r5 = defpackage.du1.A
            r1.a(r5)
            return r3
        L36:
            boolean r7 = r5.R
            if (r7 != 0) goto L54
            r5.R = r3
            r0.c(r2)
            ea2 r7 = defpackage.ea2.KEY_PRESS
            r5.a(r6, r7)
            boolean r5 = r6 instanceof defpackage.r03
            if (r5 == 0) goto L4b
            r1 = r6
            r03 r1 = (defpackage.r03) r1
        L4b:
            if (r1 == 0) goto L54
            java.util.Set r5 = defpackage.ii2.R(r2)
            r1.a(r5)
        L54:
            return r3
    }
}
