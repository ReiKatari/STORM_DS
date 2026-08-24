package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt7  reason: default package */
/* loaded from: classes.dex */
public final class vt7 implements android.view.View.OnApplyWindowInsetsListener {
    public final defpackage.f55 a;
    public defpackage.vu7 b;

    public vt7(android.view.View r2, defpackage.f55 r3) {
            r1 = this;
            r1.<init>()
            r1.a = r3
            java.util.WeakHashMap r3 = defpackage.ao7.a
            vu7 r2 = defpackage.tn7.a(r2)
            if (r2 == 0) goto L55
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 36
            if (r3 < r0) goto L19
            hu7 r3 = new hu7
            r3.<init>(r2)
            goto L50
        L19:
            r0 = 35
            if (r3 < r0) goto L23
            gu7 r3 = new gu7
            r3.<init>(r2)
            goto L50
        L23:
            r0 = 34
            if (r3 < r0) goto L2d
            fu7 r3 = new fu7
            r3.<init>(r2)
            goto L50
        L2d:
            r0 = 31
            if (r3 < r0) goto L37
            eu7 r3 = new eu7
            r3.<init>(r2)
            goto L50
        L37:
            r0 = 30
            if (r3 < r0) goto L41
            du7 r3 = new du7
            r3.<init>(r2)
            goto L50
        L41:
            r0 = 29
            if (r3 < r0) goto L4b
            cu7 r3 = new cu7
            r3.<init>(r2)
            goto L50
        L4b:
            bu7 r3 = new bu7
            r3.<init>(r2)
        L50:
            vu7 r2 = r3.b()
            goto L56
        L55:
            r2 = 0
        L56:
            r1.b = r2
            return
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View r20, android.view.WindowInsets r21) {
            r19 = this;
            r0 = r19
            r6 = r20
            boolean r1 = r6.isLaidOut()
            if (r1 != 0) goto L15
            vu7 r1 = defpackage.vu7.g(r20, r21)
            r0.b = r1
            android.view.WindowInsets r0 = defpackage.wt7.j(r20, r21)
            return r0
        L15:
            vu7 r3 = defpackage.vu7.g(r20, r21)
            ru7 r1 = r3.a
            vu7 r2 = r0.b
            if (r2 != 0) goto L27
            java.util.WeakHashMap r2 = defpackage.ao7.a
            vu7 r2 = defpackage.tn7.a(r6)
            r0.b = r2
        L27:
            vu7 r2 = r0.b
            if (r2 != 0) goto L32
            r0.b = r3
            android.view.WindowInsets r0 = defpackage.wt7.j(r20, r21)
            return r0
        L32:
            f55 r2 = defpackage.wt7.k(r6)
            if (r2 == 0) goto L47
            java.lang.Object r2 = r2.B
            vu7 r2 = (defpackage.vu7) r2
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L47
            android.view.WindowInsets r0 = defpackage.wt7.j(r20, r21)
            return r0
        L47:
            r2 = 1
            int[] r4 = new int[r2]
            int[] r5 = new int[r2]
            vu7 r7 = r0.b
            r8 = r2
        L4f:
            r9 = 512(0x200, float:7.17E-43)
            if (r8 > r9) goto La2
            e83 r9 = r1.h(r8)
            ru7 r11 = r7.a
            e83 r11 = r11.h(r8)
            int r12 = r9.a
            int r13 = r9.d
            int r14 = r9.c
            int r9 = r9.b
            int r15 = r11.a
            int r2 = r11.d
            r17 = 0
            int r10 = r11.c
            int r11 = r11.b
            if (r12 > r15) goto L7d
            if (r9 > r11) goto L7d
            if (r14 > r10) goto L7d
            if (r13 <= r2) goto L78
            goto L7d
        L78:
            r18 = r4
            r4 = r17
            goto L80
        L7d:
            r18 = r4
            r4 = 1
        L80:
            if (r12 < r15) goto L8c
            if (r9 < r11) goto L8c
            if (r14 < r10) goto L8c
            if (r13 >= r2) goto L89
            goto L8c
        L89:
            r2 = r17
            goto L8d
        L8c:
            r2 = 1
        L8d:
            if (r4 == r2) goto L9c
            if (r4 == 0) goto L97
            r2 = r18[r17]
            r2 = r2 | r8
            r18[r17] = r2
            goto L9c
        L97:
            r2 = r5[r17]
            r2 = r2 | r8
            r5[r17] = r2
        L9c:
            int r8 = r8 << 1
            r4 = r18
            r2 = 1
            goto L4f
        La2:
            r18 = r4
            r17 = 0
            r2 = r18[r17]
            r4 = r5[r17]
            r5 = r2 | r4
            if (r5 != 0) goto Lb5
            r0.b = r3
            android.view.WindowInsets r0 = defpackage.wt7.j(r20, r21)
            return r0
        Lb5:
            vu7 r7 = r0.b
            r8 = r2 & 8
            if (r8 == 0) goto Lbe
            android.view.animation.PathInterpolator r2 = defpackage.wt7.e
            goto Ld4
        Lbe:
            r8 = r4 & 8
            if (r8 == 0) goto Lc5
            q92 r2 = defpackage.wt7.f
            goto Ld4
        Lc5:
            r2 = r2 & 519(0x207, float:7.27E-43)
            if (r2 == 0) goto Lcc
            android.view.animation.DecelerateInterpolator r2 = defpackage.wt7.g
            goto Ld4
        Lcc:
            r2 = r4 & 519(0x207, float:7.27E-43)
            if (r2 == 0) goto Ld3
            android.view.animation.AccelerateInterpolator r2 = defpackage.wt7.h
            goto Ld4
        Ld3:
            r2 = 0
        Ld4:
            au7 r4 = new au7
            r8 = r5 & 8
            if (r8 == 0) goto Ldd
            r8 = 160(0xa0, double:7.9E-322)
            goto Ldf
        Ldd:
            r8 = 250(0xfa, double:1.235E-321)
        Ldf:
            r4.<init>(r5, r2, r8)
            zt7 r2 = r4.a
            r8 = 0
            r2.e(r8)
            r2 = 2
            float[] r2 = new float[r2]
            r2 = {x0178: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            zt7 r8 = r4.a
            long r8 = r8.b()
            android.animation.ValueAnimator r8 = r2.setDuration(r8)
            e83 r1 = r1.h(r5)
            ru7 r2 = r7.a
            e83 r2 = r2.h(r5)
            int r9 = r1.a
            int r10 = r2.a
            int r9 = java.lang.Math.min(r9, r10)
            int r10 = r1.b
            int r11 = r2.b
            int r12 = java.lang.Math.min(r10, r11)
            int r13 = r1.c
            int r14 = r2.c
            int r15 = java.lang.Math.min(r13, r14)
            r16 = r5
            int r5 = r1.d
            r18 = r7
            int r7 = r2.d
            int r0 = java.lang.Math.min(r5, r7)
            e83 r0 = defpackage.e83.c(r9, r12, r15, r0)
            int r1 = r1.a
            int r2 = r2.a
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = java.lang.Math.max(r10, r11)
            int r9 = java.lang.Math.max(r13, r14)
            int r5 = java.lang.Math.max(r5, r7)
            e83 r1 = defpackage.e83.c(r1, r2, r9, r5)
            rr6 r7 = new rr6
            r2 = 14
            r7.<init>(r2, r0, r1)
            r0 = r17
            defpackage.wt7.g(r6, r4, r3, r0)
            ut7 r1 = new ut7
            r2 = r4
            r5 = r16
            r4 = r18
            r1.<init>(r2, r3, r4, r5, r6)
            r8.addUpdateListener(r1)
            t97 r0 = new t97
            r0.<init>(r2, r6)
            r8.addListener(r0)
            el0 r0 = new el0
            r0.<init>(r6, r2, r7, r8)
            defpackage.fm4.a(r6, r0)
            r0 = r19
            r0.b = r3
            android.view.WindowInsets r0 = defpackage.wt7.j(r20, r21)
            return r0
    }
}
