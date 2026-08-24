package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b81  reason: default package */
/* loaded from: classes.dex */
public final class b81 {
    public final defpackage.te a;
    public final defpackage.bt b;
    public final java.lang.Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public defpackage.c37 j;
    public defpackage.a47 k;
    public defpackage.mk4 l;
    public defpackage.qn2 m;
    public defpackage.of5 n;
    public defpackage.of5 o;
    public final android.view.inputmethod.CursorAnchorInfo.Builder p;
    public final float[] q;
    public final android.graphics.Matrix r;

    public b81(defpackage.te r1, defpackage.bt r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.c = r1
            ne r1 = defpackage.ne.t0
            r0.m = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = new android.view.inputmethod.CursorAnchorInfo$Builder
            r1.<init>()
            r0.p = r1
            float[] r1 = defpackage.v24.a()
            r0.q = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.r = r1
            return
    }

    public final void a() {
            r29 = this;
            r0 = r29
            bt r1 = r0.b
            java.lang.Object r2 = r1.L
            go3 r2 = (defpackage.go3) r2
            java.lang.Object r3 = r2.getValue()
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.Object r1 = r1.B
            android.view.View r1 = (android.view.View) r1
            boolean r3 = r3.isActive(r1)
            if (r3 != 0) goto L19
            return
        L19:
            qn2 r3 = r0.m
            v24 r4 = new v24
            float[] r5 = r0.q
            r4.<init>(r5)
            r3.g(r4)
            te r3 = r0.a
            r3.q(r5)
            android.graphics.Matrix r3 = r0.r
            defpackage.hv.X(r3, r5)
            c37 r4 = r0.j
            r4.getClass()
            long r5 = r4.b
            mk4 r7 = r0.l
            r7.getClass()
            a47 r8 = r0.k
            r8.getClass()
            v84 r9 = r8.b
            of5 r10 = r0.n
            r10.getClass()
            float r11 = r10.d
            float r12 = r10.b
            of5 r13 = r0.o
            r13.getClass()
            boolean r14 = r0.f
            boolean r15 = r0.g
            r16 = r2
            boolean r2 = r0.h
            r17 = r2
            boolean r2 = r0.i
            r25 = r2
            android.view.inputmethod.CursorAnchorInfo$Builder r2 = r0.p
            r2.reset()
            r2.setMatrix(r3)
            k47 r3 = r4.c
            r18 = r5
            int r5 = defpackage.k47.f(r18)
            int r6 = defpackage.k47.e(r18)
            r2.setSelectionRange(r5, r6)
            r26 = 1
            if (r14 == 0) goto Ld6
            if (r5 >= 0) goto L7c
            goto Ld6
        L7c:
            int r5 = r7.s(r5)
            of5 r14 = r8.c(r5)
            float r6 = r14.a
            r27 = r1
            long r0 = r8.c
            r18 = 32
            long r0 = r0 >> r18
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 0
            float r0 = defpackage.gi2.p(r6, r1, r0)
            float r1 = r14.b
            boolean r1 = defpackage.ge7.v(r10, r0, r1)
            float r6 = r14.d
            boolean r6 = defpackage.ge7.v(r10, r0, r6)
            jl5 r5 = r8.a(r5)
            r19 = r0
            jl5 r0 = defpackage.jl5.Rtl
            if (r5 != r0) goto Lae
            r0 = r26
            goto Laf
        Lae:
            r0 = 0
        Laf:
            if (r1 != 0) goto Lb6
            if (r6 == 0) goto Lb4
            goto Lb6
        Lb4:
            r5 = 0
            goto Lb8
        Lb6:
            r5 = r26
        Lb8:
            if (r1 == 0) goto Lbc
            if (r6 != 0) goto Lbe
        Lbc:
            r5 = r5 | 2
        Lbe:
            if (r0 == 0) goto Lc2
            r5 = r5 | 4
        Lc2:
            r23 = r5
            float r0 = r14.b
            float r1 = r14.d
            r22 = r1
            r20 = r0
            r21 = r1
            r18 = r2
            r18.setInsertionMarkerLocation(r19, r20, r21, r22, r23)
            r0 = r18
            goto Ld9
        Ld6:
            r27 = r1
            r0 = r2
        Ld9:
            if (r15 == 0) goto L18b
            r1 = -1
            if (r3 == 0) goto Le5
            long r5 = r3.a
            int r2 = defpackage.k47.f(r5)
            goto Le6
        Le5:
            r2 = r1
        Le6:
            if (r3 == 0) goto Lee
            long r5 = r3.a
            int r1 = defpackage.k47.e(r5)
        Lee:
            if (r2 < 0) goto L18b
            if (r2 >= r1) goto L18b
            fp r3 = r4.a
            java.lang.String r3 = r3.B
            java.lang.CharSequence r3 = r3.subSequence(r2, r1)
            r0.setComposingText(r2, r3)
            int r3 = r7.s(r2)
            int r4 = r7.s(r1)
            int r5 = r4 - r3
            int r5 = r5 * 4
            float[] r5 = new float[r5]
            long r14 = defpackage.jx2.f(r3, r4)
            r9.a(r14, r5)
        L112:
            if (r2 >= r1) goto L18b
            int r4 = r7.s(r2)
            int r6 = r4 - r3
            int r6 = r6 * 4
            r14 = r5[r6]
            int r15 = r6 + 1
            r15 = r5[r15]
            int r18 = r6 + 2
            r19 = r0
            r0 = r5[r18]
            int r6 = r6 + 3
            r6 = r5[r6]
            r28 = r1
            float r1 = r10.a
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 >= 0) goto L137
            r18 = r26
            goto L139
        L137:
            r18 = 0
        L139:
            float r1 = r10.c
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 >= 0) goto L142
            r1 = r26
            goto L143
        L142:
            r1 = 0
        L143:
            r1 = r18 & r1
            int r18 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r18 >= 0) goto L14c
            r18 = r26
            goto L14e
        L14c:
            r18 = 0
        L14e:
            r1 = r1 & r18
            int r18 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r18 >= 0) goto L157
            r18 = r26
            goto L159
        L157:
            r18 = 0
        L159:
            r1 = r1 & r18
            boolean r18 = defpackage.ge7.v(r10, r14, r15)
            if (r18 == 0) goto L167
            boolean r18 = defpackage.ge7.v(r10, r0, r6)
            if (r18 != 0) goto L169
        L167:
            r1 = r1 | 2
        L169:
            jl5 r4 = r8.a(r4)
            r22 = r0
            jl5 r0 = defpackage.jl5.Rtl
            if (r4 != r0) goto L175
            r1 = r1 | 4
        L175:
            r24 = r1
            r23 = r6
            r20 = r14
            r21 = r15
            r18 = r19
            r19 = r2
            r18.addCharacterBounds(r19, r20, r21, r22, r23, r24)
            r0 = r18
            int r2 = r19 + 1
            r1 = r28
            goto L112
        L18b:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L1ae
            if (r17 == 0) goto L1ae
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.a81.h()
            android.graphics.RectF r3 = defpackage.ej2.a0(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.o2.j(r2, r3)
            android.graphics.RectF r3 = defpackage.ej2.a0(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.o2.z(r2, r3)
            android.view.inputmethod.EditorBoundsInfo r2 = defpackage.o2.k(r2)
            defpackage.o2.i(r0, r2)
        L1ae:
            r2 = 34
            if (r1 < r2) goto L1ec
            if (r25 == 0) goto L1ec
            boolean r1 = r10.f()
            if (r1 != 0) goto L1ec
            int r1 = r9.f
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1c1
            r1 = 0
        L1c1:
            int r2 = r9.e(r12)
            r3 = 0
            int r2 = defpackage.gi2.q(r2, r3, r1)
            int r4 = r9.e(r11)
            int r1 = defpackage.gi2.q(r4, r3, r1)
            if (r2 > r1) goto L1ec
        L1d4:
            float r3 = r8.e(r2)
            float r4 = r9.f(r2)
            float r5 = r8.f(r2)
            float r6 = r9.b(r2)
            defpackage.gi.o(r0, r3, r4, r5, r6)
            if (r2 == r1) goto L1ec
            int r2 = r2 + 1
            goto L1d4
        L1ec:
            android.view.inputmethod.CursorAnchorInfo r0 = r0.build()
            java.lang.Object r1 = r16.getValue()
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r2 = r27
            r1.updateCursorAnchorInfo(r2, r0)
            r3 = 0
            r0 = r29
            r0.e = r3
            return
    }
}
