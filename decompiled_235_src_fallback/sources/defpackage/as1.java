package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as1  reason: default package */
/* loaded from: classes.dex */
public final class as1 extends defpackage.zr1 {
    @Override // defpackage.xr1, defpackage.vr1, defpackage.bs1
    public void b(defpackage.ix6 r17, defpackage.ix6 r18, android.view.Window r19, android.view.View r20, boolean r21, boolean r22) {
            r16 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r17.getClass()
            r0.getClass()
            r1.getClass()
            r2.getClass()
            r5 = 0
            defpackage.kt7.a(r1, r5)
            r1.setStatusBarColor(r5)
            r1.setNavigationBarColor(r5)
            r6 = r17
            int r6 = r6.a(r3)
            int r7 = r0.a(r4)
            boolean r8 = r2 instanceof android.view.ViewGroup
            if (r8 == 0) goto L32
            r8 = r2
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            goto L33
        L32:
            r8 = 0
        L33:
            r10 = 1
            if (r8 == 0) goto L137
            r11 = r5
        L37:
            int r12 = r8.getChildCount()
            if (r11 >= r12) goto L3f
            r12 = r10
            goto L40
        L3f:
            r12 = r5
        L40:
            r14 = 2
            r15 = 4
            if (r12 == 0) goto L103
            int r12 = r11 + 1
            android.view.View r11 = r8.getChildAt(r11)
            if (r11 == 0) goto Lfd
            java.lang.Object r11 = r11.getTag()
            boolean r9 = r11 instanceof java.util.List
            if (r9 == 0) goto Lf9
            r9 = r11
            java.util.List r9 = (java.util.List) r9
            int r13 = r9.size()
            if (r13 != r15) goto Lf9
            java.lang.Object r9 = r9.get(r5)
            boolean r9 = r9 instanceof defpackage.mt0
            if (r9 == 0) goto Lf9
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r8 = r11.iterator()
        L6b:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L137
            java.lang.Object r9 = r8.next()
            boolean r11 = r9 instanceof defpackage.mt0
            if (r11 == 0) goto L7d
            r11 = r9
            mt0 r11 = (defpackage.mt0) r11
            goto L7e
        L7d:
            r11 = 0
        L7e:
            if (r11 == 0) goto Lf6
            mt0 r9 = (defpackage.mt0) r9
            int r11 = r9.a
            k45 r12 = r9.b
            android.graphics.drawable.ColorDrawable r13 = r9.f
            if (r11 == r10) goto Lde
            if (r11 == r14) goto Lc5
            if (r11 == r15) goto Lac
            r5 = 8
            if (r11 == r5) goto L93
            goto Lf6
        L93:
            r9.g = r10
            int r5 = r9.h
            if (r5 == r7) goto Lf6
            r9.h = r7
            r13.setColor(r7)
            r12.e = r13
            ap3 r5 = r12.i
            if (r5 == 0) goto Lf6
            java.lang.Object r5 = r5.L
            android.view.View r5 = (android.view.View) r5
            r5.setBackground(r13)
            goto Lf6
        Lac:
            r9.g = r10
            int r5 = r9.h
            if (r5 == r7) goto Lf6
            r9.h = r7
            r13.setColor(r7)
            r12.e = r13
            ap3 r5 = r12.i
            if (r5 == 0) goto Lf6
            java.lang.Object r5 = r5.L
            android.view.View r5 = (android.view.View) r5
            r5.setBackground(r13)
            goto Lf6
        Lc5:
            r9.g = r10
            int r5 = r9.h
            if (r5 == r6) goto Lf6
            r9.h = r6
            r13.setColor(r6)
            r12.e = r13
            ap3 r5 = r12.i
            if (r5 == 0) goto Lf6
            java.lang.Object r5 = r5.L
            android.view.View r5 = (android.view.View) r5
            r5.setBackground(r13)
            goto Lf6
        Lde:
            r9.g = r10
            int r5 = r9.h
            if (r5 == r7) goto Lf6
            r9.h = r7
            r13.setColor(r7)
            r12.e = r13
            ap3 r5 = r12.i
            if (r5 == 0) goto Lf6
            java.lang.Object r5 = r5.L
            android.view.View r5 = (android.view.View) r5
            r5.setBackground(r13)
        Lf6:
            r5 = 0
            goto L6b
        Lf9:
            r11 = r12
            r5 = 0
            goto L37
        Lfd:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r0.<init>()
            throw r0
        L103:
            if (r6 != 0) goto L107
            if (r7 == 0) goto L137
        L107:
            mt0 r5 = new mt0
            r5.<init>(r14, r6)
            mt0 r6 = new mt0
            r6.<init>(r10, r7)
            mt0 r9 = new mt0
            r9.<init>(r15, r7)
            mt0 r11 = new mt0
            r12 = 8
            r11.<init>(r12, r7)
            mt0[] r5 = new defpackage.mt0[]{r5, r6, r9, r11}
            java.util.List r5 = defpackage.hf.c0(r5)
            m45 r6 = new m45
            r7 = r2
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.content.Context r7 = r7.getContext()
            r6.<init>(r7, r5)
            r6.setTag(r5)
            r8.addView(r6)
        L137:
            int r0 = r0.c
            if (r0 != 0) goto L13d
            r5 = r10
            goto L13e
        L13d:
            r5 = 0
        L13e:
            defpackage.yz0.p(r1, r5)
            s35 r0 = new s35
            r0.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            r5 = 35
            if (r2 < r5) goto L152
            av7 r2 = new av7
            r2.<init>(r1, r0)
            goto L16b
        L152:
            r5 = 30
            if (r2 < r5) goto L15c
            zu7 r2 = new zu7
            r2.<init>(r1, r0)
            goto L16b
        L15c:
            r5 = 26
            if (r2 < r5) goto L166
            xu7 r2 = new xu7
            r2.<init>(r1, r0)
            goto L16b
        L166:
            wu7 r2 = new wu7
            r2.<init>(r1, r0)
        L16b:
            r0 = r3 ^ 1
            r2.d(r0)
            r0 = r4 ^ 1
            r2.c(r0)
            return
    }
}
