package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx7  reason: default package */
/* loaded from: classes.dex */
public abstract class zx7 {
    public static final android.view.ViewGroup.LayoutParams a = null;

    static {
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            defpackage.zx7.a = r0
            return
    }

    public static final defpackage.xx7 a(defpackage.p0 r7, defpackage.mx0 r8, defpackage.zv0 r9) {
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.ps2.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L3f
            r0 = 6
            v80 r0 = defpackage.nb3.c(r2, r3, r3, r0)
            ex6 r4 = defpackage.sm.i0
            java.lang.Object r4 = r4.getValue()
            l61 r4 = (defpackage.l61) r4
            o41 r4 = defpackage.g04.i(r4)
            u12 r5 = new u12
            r5.<init>(r0, r3)
            r6 = 3
            defpackage.hv.L(r4, r3, r3, r5, r6)
            mc r4 = new mc
            r5 = 14
            r4.<init>(r0, r5)
            java.lang.Object r0 = defpackage.bm6.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.bm6.i     // Catch: java.lang.Throwable -> L3c
            java.util.ArrayList r4 = defpackage.gt0.U0(r4, r5)     // Catch: java.lang.Throwable -> L3c
            defpackage.bm6.i = r4     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r0)
            defpackage.bm6.a()
            goto L3f
        L3c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L3f:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L59
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.te
            if (r1 == 0) goto L50
            te r0 = (defpackage.te) r0
            goto L51
        L50:
            r0 = r3
        L51:
            if (r0 == 0) goto L57
            r0.setComposeViewContext(r8)
            goto L5d
        L57:
            r0 = r3
            goto L5d
        L59:
            r7.removeAllViews()
            goto L57
        L5d:
            if (r0 != 0) goto L71
            te r0 = new te
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.zx7.a
            r7.addView(r1, r4)
        L71:
            r0.setComposeViewContext(r8)
            mx0 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L80
            r8.c()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L80:
            r7 = 2131428091(0x7f0b02fb, float:1.8477817E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.xx7
            if (r2 == 0) goto L8e
            r3 = r1
            xx7 r3 = (defpackage.xx7) r3
        L8e:
            if (r3 != 0) goto La8
            xx7 r3 = new xx7
            cg7 r1 = new cg7
            sm3 r2 = r0.getRoot()
            r1.<init>(r2)
            zx0 r2 = r8.b
            ey0 r4 = new ey0
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        La8:
            r3.b(r9)
            zx0 r7 = r8.b
            yx7 r8 = new yx7
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
    }
}
