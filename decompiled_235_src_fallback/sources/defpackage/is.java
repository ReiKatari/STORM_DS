package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: is  reason: default package */
/* loaded from: classes.dex */
public final class is implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;

    public is(android.widget.TextView r2, android.graphics.Typeface r3, int r4) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.R = r3
            r1.B = r4
            return
    }

    public is(com.google.android.material.bottomsheet.BottomSheetBehavior r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.L = r3
            r1.B = r4
            return
    }

    public is(defpackage.pw3 r2, int r3, defpackage.gx3 r4) {
            r1 = this;
            r0 = 2
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.B = r3
            r1.L = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r12 = this;
            int r0 = r12.A
            r1 = 0
            java.lang.Object r2 = r12.L
            int r3 = r12.B
            java.lang.Object r12 = r12.R
            switch(r0) {
                case 0: goto L113;
                case 1: goto L10b;
                default: goto Lc;
            }
        Lc:
            pw3 r12 = (defpackage.pw3) r12
            gx3 r2 = (defpackage.gx3) r2
            boolean r0 = r12.L
            java.lang.String r4 = "Less than 0 remaining futures"
            java.util.concurrent.atomic.AtomicInteger r5 = r12.R
            java.util.ArrayList r6 = r12.B
            gx3 r7 = r12.X
            boolean r8 = r7.isDone()
            if (r8 != 0) goto L105
            if (r6 != 0) goto L24
            goto L105
        L24:
            r8 = 0
            r9 = 1
            boolean r10 = r2.isDone()     // Catch: java.lang.Throwable -> L5b java.lang.Error -> L5e java.lang.RuntimeException -> L60 java.util.concurrent.ExecutionException -> L62 java.util.concurrent.CancellationException -> Lc3
            java.lang.String r11 = "Tried to set value from future which is not done"
            defpackage.np2.A(r11, r10)     // Catch: java.lang.Throwable -> L5b java.lang.Error -> L5e java.lang.RuntimeException -> L60 java.util.concurrent.ExecutionException -> L62 java.util.concurrent.CancellationException -> Lc3
            java.lang.Object r2 = defpackage.l.w(r2)     // Catch: java.lang.Throwable -> L5b java.lang.Error -> L5e java.lang.RuntimeException -> L60 java.util.concurrent.ExecutionException -> L62 java.util.concurrent.CancellationException -> Lc3
            r6.set(r3, r2)     // Catch: java.lang.Throwable -> L5b java.lang.Error -> L5e java.lang.RuntimeException -> L60 java.util.concurrent.ExecutionException -> L62 java.util.concurrent.CancellationException -> Lc3
            int r0 = r5.decrementAndGet()
            if (r0 < 0) goto L3d
            r1 = r9
        L3d:
            defpackage.np2.A(r4, r1)
            if (r0 != 0) goto L10a
            java.util.ArrayList r0 = r12.B
            if (r0 == 0) goto L52
            qb0 r12 = r12.Y
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
        L4d:
            r12.a(r1)
            goto L10a
        L52:
            boolean r12 = r7.isDone()
            defpackage.np2.A(r8, r12)
            goto L10a
        L5b:
            r0 = move-exception
            goto Lc9
        L5e:
            r0 = move-exception
            goto L64
        L60:
            r2 = move-exception
            goto L81
        L62:
            r2 = move-exception
            goto La0
        L64:
            qb0 r2 = r12.Y     // Catch: java.lang.Throwable -> L5b
            r2.c(r0)     // Catch: java.lang.Throwable -> L5b
            int r0 = r5.decrementAndGet()
            if (r0 < 0) goto L70
            r1 = r9
        L70:
            defpackage.np2.A(r4, r1)
            if (r0 != 0) goto L10a
            java.util.ArrayList r0 = r12.B
            if (r0 == 0) goto L52
            qb0 r12 = r12.Y
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L4d
        L81:
            if (r0 == 0) goto L88
            qb0 r0 = r12.Y     // Catch: java.lang.Throwable -> L5b
            r0.c(r2)     // Catch: java.lang.Throwable -> L5b
        L88:
            int r0 = r5.decrementAndGet()
            if (r0 < 0) goto L8f
            r1 = r9
        L8f:
            defpackage.np2.A(r4, r1)
            if (r0 != 0) goto L10a
            java.util.ArrayList r0 = r12.B
            if (r0 == 0) goto L52
            qb0 r12 = r12.Y
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L4d
        La0:
            if (r0 == 0) goto Lab
            qb0 r0 = r12.Y     // Catch: java.lang.Throwable -> L5b
            java.lang.Throwable r2 = r2.getCause()     // Catch: java.lang.Throwable -> L5b
            r0.c(r2)     // Catch: java.lang.Throwable -> L5b
        Lab:
            int r0 = r5.decrementAndGet()
            if (r0 < 0) goto Lb2
            r1 = r9
        Lb2:
            defpackage.np2.A(r4, r1)
            if (r0 != 0) goto L10a
            java.util.ArrayList r0 = r12.B
            if (r0 == 0) goto L52
            qb0 r12 = r12.Y
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L4d
        Lc3:
            if (r0 == 0) goto Lec
            r12.cancel(r1)     // Catch: java.lang.Throwable -> L5b
            goto Lec
        Lc9:
            int r2 = r5.decrementAndGet()
            if (r2 < 0) goto Ld0
            r1 = r9
        Ld0:
            defpackage.np2.A(r4, r1)
            if (r2 != 0) goto Leb
            java.util.ArrayList r1 = r12.B
            if (r1 == 0) goto Le4
            qb0 r12 = r12.Y
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r12.a(r2)
            goto Leb
        Le4:
            boolean r12 = r7.isDone()
            defpackage.np2.A(r8, r12)
        Leb:
            throw r0
        Lec:
            int r0 = r5.decrementAndGet()
            if (r0 < 0) goto Lf3
            r1 = r9
        Lf3:
            defpackage.np2.A(r4, r1)
            if (r0 != 0) goto L10a
            java.util.ArrayList r0 = r12.B
            if (r0 == 0) goto L52
            qb0 r12 = r12.Y
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            goto L4d
        L105:
            java.lang.String r12 = "Future was done before all dependencies completed"
            defpackage.np2.A(r12, r0)
        L10a:
            return
        L10b:
            com.google.android.material.bottomsheet.BottomSheetBehavior r12 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r12
            android.view.View r2 = (android.view.View) r2
            r12.L(r2, r3, r1)
            return
        L113:
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            r2.setTypeface(r12, r3)
            return
    }
}
