package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sf5  reason: default package */
/* loaded from: classes.dex */
public final class sf5 implements java.lang.Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView B;

    public /* synthetic */ sf5(androidx.recyclerview.widget.RecyclerView r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r20 = this;
            r0 = r20
            int r1 = r0.A
            androidx.recyclerview.widget.RecyclerView r0 = r0.B
            switch(r1) {
                case 0: goto L120;
                default: goto L9;
            }
        L9:
            cg5 r1 = r0.L0
            if (r1 == 0) goto L11c
            ke1 r1 = (defpackage.ke1) r1
            long r4 = r1.d
            java.util.ArrayList r6 = r1.h
            boolean r7 = r6.isEmpty()
            java.util.ArrayList r8 = r1.j
            boolean r9 = r8.isEmpty()
            java.util.ArrayList r10 = r1.k
            boolean r11 = r10.isEmpty()
            java.util.ArrayList r12 = r1.i
            boolean r13 = r12.isEmpty()
            if (r7 == 0) goto L33
            if (r9 == 0) goto L33
            if (r13 == 0) goto L33
            if (r11 == 0) goto L33
            goto L11c
        L33:
            int r14 = r6.size()
            r15 = 0
        L38:
            if (r15 >= r14) goto L71
            java.lang.Object r16 = r6.get(r15)
            int r15 = r15 + 1
            r2 = r16
            wg5 r2 = (defpackage.wg5) r2
            android.view.View r3 = r2.a
            r17 = r6
            android.view.ViewPropertyAnimator r6 = r3.animate()
            r18 = r7
            java.util.ArrayList r7 = r1.q
            r7.add(r2)
            android.view.ViewPropertyAnimator r7 = r6.setDuration(r4)
            r19 = r9
            r9 = 0
            android.view.ViewPropertyAnimator r7 = r7.alpha(r9)
            fe1 r9 = new fe1
            r9.<init>(r1, r2, r6, r3)
            android.view.ViewPropertyAnimator r2 = r7.setListener(r9)
            r2.start()
            r6 = r17
            r7 = r18
            r9 = r19
            goto L38
        L71:
            r17 = r6
            r18 = r7
            r19 = r9
            r17.clear()
            if (r19 != 0) goto La7
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r8)
            java.util.ArrayList r3 = r1.m
            r3.add(r2)
            r8.clear()
            ee1 r3 = new ee1
            r6 = 0
            r3.<init>(r1, r2, r6)
            if (r18 != 0) goto La4
            java.lang.Object r2 = r2.get(r6)
            je1 r2 = (defpackage.je1) r2
            wg5 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r6 = defpackage.ao7.a
            r2.postOnAnimationDelayed(r3, r4)
            goto La7
        La4:
            r3.run()
        La7:
            if (r11 != 0) goto Ld5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r10)
            java.util.ArrayList r3 = r1.n
            r3.add(r2)
            r10.clear()
            ee1 r3 = new ee1
            r6 = 1
            r3.<init>(r1, r2, r6)
            if (r18 != 0) goto Ld2
            r6 = 0
            java.lang.Object r2 = r2.get(r6)
            ie1 r2 = (defpackage.ie1) r2
            wg5 r2 = r2.a
            android.view.View r2 = r2.a
            java.util.WeakHashMap r6 = defpackage.ao7.a
            r2.postOnAnimationDelayed(r3, r4)
            goto Ld5
        Ld2:
            r3.run()
        Ld5:
            if (r13 != 0) goto L11c
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r12)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
            r12.clear()
            ee1 r3 = new ee1
            r6 = 2
            r3.<init>(r1, r2, r6)
            if (r18 == 0) goto Lf8
            if (r19 == 0) goto Lf8
            if (r11 != 0) goto Lf4
            goto Lf8
        Lf4:
            r3.run()
            goto L11c
        Lf8:
            r6 = 0
            if (r18 != 0) goto Lfd
            goto Lfe
        Lfd:
            r4 = r6
        Lfe:
            if (r19 != 0) goto L103
            long r8 = r1.e
            goto L104
        L103:
            r8 = r6
        L104:
            if (r11 != 0) goto L108
            long r6 = r1.f
        L108:
            long r6 = java.lang.Math.max(r8, r6)
            long r6 = r6 + r4
            r1 = 0
            java.lang.Object r2 = r2.get(r1)
            wg5 r2 = (defpackage.wg5) r2
            android.view.View r2 = r2.a
            java.util.WeakHashMap r4 = defpackage.ao7.a
            r2.postOnAnimationDelayed(r3, r6)
            goto L11d
        L11c:
            r1 = 0
        L11d:
            r0.j1 = r1
            return
        L120:
            boolean r1 = r0.t0
            if (r1 == 0) goto L13e
            boolean r1 = r0.isLayoutRequested()
            if (r1 == 0) goto L12b
            goto L13e
        L12b:
            boolean r1 = r0.r0
            if (r1 != 0) goto L133
            r0.requestLayout()
            goto L13e
        L133:
            boolean r1 = r0.w0
            if (r1 == 0) goto L13b
            r6 = 1
            r0.v0 = r6
            goto L13e
        L13b:
            r0.p()
        L13e:
            return
    }
}
