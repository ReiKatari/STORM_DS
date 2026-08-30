package defpackage;

import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cj7  reason: default package */
/* loaded from: classes.dex */
public abstract class cj7 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.aj7 a(defpackage.o0 r7, defpackage.qu0 r8, defpackage.et0 r9) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.km2.a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L41
            r0 = 6
            q60 r0 = defpackage.n40.f(r2, r3, r3, r0)
            il6 r4 = defpackage.gm.h0
            java.lang.Object r4 = r4.getValue()
            e31 r4 = (defpackage.e31) r4
            g11 r4 = defpackage.iq2.c(r4)
            wx1 r5 = new wx1
            r6 = 8
            r5.<init>(r0, r3, r6)
            r6 = 3
            defpackage.tq5.w(r4, r3, r3, r5, r6)
            yb r4 = new yb
            r5 = 15
            r4.<init>(r5, r0)
            java.lang.Object r0 = defpackage.ma6.c
            monitor-enter(r0)
            java.util.List r5 = defpackage.ma6.i     // Catch: java.lang.Throwable -> L3e
            java.util.ArrayList r4 = defpackage.tq0.Y0(r5, r4)     // Catch: java.lang.Throwable -> L3e
            defpackage.ma6.i = r4     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            defpackage.ma6.a()
            goto L41
        L3e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        L41:
            int r0 = r7.getChildCount()
            if (r0 <= 0) goto L5b
            android.view.View r0 = r7.getChildAt(r1)
            boolean r1 = r0 instanceof defpackage.ee
            if (r1 == 0) goto L52
            ee r0 = (defpackage.ee) r0
            goto L53
        L52:
            r0 = r3
        L53:
            if (r0 == 0) goto L59
            r0.setComposeViewContext(r8)
            goto L5f
        L59:
            r0 = r3
            goto L5f
        L5b:
            r7.removeAllViews()
            goto L59
        L5f:
            if (r0 != 0) goto L73
            ee r0 = new ee
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1, r8)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = defpackage.cj7.a
            r7.addView(r1, r4)
        L73:
            r0.setComposeViewContext(r8)
            qu0 r7 = r7.getComposeViewContext$ui()
            if (r7 == 0) goto L82
            r8.c()
            r0.setComposeViewContextIncrementedDuringInit$ui(r2)
        L82:
            r7 = 2131428055(0x7f0b02d7, float:1.8477744E38)
            java.lang.Object r1 = r0.getTag(r7)
            boolean r2 = r1 instanceof defpackage.aj7
            if (r2 == 0) goto L90
            r3 = r1
            aj7 r3 = (defpackage.aj7) r3
        L90:
            if (r3 != 0) goto Laa
            aj7 r3 = new aj7
            h27 r1 = new h27
            vf3 r2 = r0.getRoot()
            r1.<init>(r2)
            dv0 r2 = r8.b
            iv0 r4 = new iv0
            r4.<init>(r2, r1)
            r3.<init>(r0, r4)
            r0.setTag(r7, r3)
        Laa:
            r3.b(r9)
            dv0 r7 = r8.b
            bj7 r8 = new bj7
            r8.<init>(r7)
            r0.setFrameEndScheduler$ui(r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cj7.a(o0, qu0, et0):aj7");
    }
}
