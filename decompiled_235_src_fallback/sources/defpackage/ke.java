package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke  reason: default package */
/* loaded from: classes.dex */
public final class ke extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.te L;

    public /* synthetic */ ke(defpackage.te r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r5 = this;
            int r0 = r5.B
            te r5 = r5.L
            switch(r0) {
                case 0: goto L74;
                case 1: goto L2a;
                case 2: goto Lc;
                default: goto L7;
            }
        L7:
            defpackage.te.c(r5)
            r5 = 0
            return r5
        Lc:
            android.view.MotionEvent r0 = r5.r1
            if (r0 == 0) goto L27
            int r0 = r0.getActionMasked()
            r1 = 7
            if (r0 == r1) goto L1c
            r1 = 9
            if (r0 == r1) goto L1c
            goto L27
        L1c:
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.s1 = r0
            g15 r0 = r5.x1
            r5.post(r0)
        L27:
            jg7 r5 = defpackage.jg7.a
            return r5
        L2a:
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.os.LocaleList r5 = r5.getLocales()
            hy3 r0 = new hy3
            iy3 r1 = new iy3
            r1.<init>(r5)
            r0.<init>(r1)
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L50
            android.os.LocaleList r5 = android.os.LocaleList.getDefault()
            hy3 r0 = new hy3
            iy3 r1 = new iy3
            r1.<init>(r5)
            r0.<init>(r1)
        L50:
            int r5 = r0.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r5)
            r2 = 0
        L5a:
            if (r2 >= r5) goto L6e
            fy3 r3 = new fy3
            java.util.Locale r4 = r0.b(r2)
            r4.getClass()
            r3.<init>(r4)
            r1.add(r3)
            int r2 = r2 + 1
            goto L5a
        L6e:
            gy3 r5 = new gy3
            r5.<init>(r1)
            return r5
        L74:
            vs4 r5 = r5.p0
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            return r5
    }
}
