package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft3  reason: default package */
/* loaded from: classes.dex */
public final class ft3 {
    public final defpackage.ii a;
    public final defpackage.u63 b;
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
    public defpackage.of5 m;
    public defpackage.of5 n;
    public final android.view.inputmethod.CursorAnchorInfo.Builder o;
    public final float[] p;
    public final android.graphics.Matrix q;

    public ft3(defpackage.ii r1, defpackage.u63 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.c = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = new android.view.inputmethod.CursorAnchorInfo$Builder
            r1.<init>()
            r0.o = r1
            float[] r1 = defpackage.v24.a()
            r0.p = r1
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.q = r1
            return
    }

    public final void a() {
            r29 = this;
            r0 = r29
            u63 r1 = r0.b
            android.view.inputmethod.InputMethodManager r2 = r1.n()
            java.lang.Object r3 = r1.B
            android.view.View r3 = (android.view.View) r3
            boolean r2 = r2.isActive(r3)
            if (r2 == 0) goto L22e
            c37 r2 = r0.j
            if (r2 == 0) goto L22e
            mk4 r2 = r0.l
            if (r2 == 0) goto L22e
            a47 r2 = r0.k
            if (r2 == 0) goto L22e
            of5 r2 = r0.m
            if (r2 == 0) goto L22e
            of5 r2 = r0.n
            if (r2 != 0) goto L28
            goto L22e
        L28:
            float[] r2 = r0.p
            defpackage.v24.d(r2)
            ii r4 = r0.a
            et3 r4 = r4.d0
            vs4 r4 = r4.n0
            java.lang.Object r4 = r4.getValue()
            jk3 r4 = (defpackage.jk3) r4
            if (r4 == 0) goto L49
            boolean r5 = r4.t()
            if (r5 == 0) goto L42
            goto L43
        L42:
            r4 = 0
        L43:
            if (r4 != 0) goto L46
            goto L49
        L46:
            r4.k(r2)
        L49:
            of5 r4 = r0.n
            r4.getClass()
            float r4 = r4.a
            float r4 = -r4
            of5 r5 = r0.n
            r5.getClass()
            float r5 = r5.b
            float r5 = -r5
            defpackage.v24.f(r2, r4, r5)
            android.graphics.Matrix r4 = r0.q
            defpackage.hv.X(r4, r2)
            c37 r2 = r0.j
            r2.getClass()
            long r5 = r2.b
            mk4 r7 = r0.l
            r7.getClass()
            a47 r8 = r0.k
            r8.getClass()
            v84 r9 = r8.b
            of5 r10 = r0.m
            r10.getClass()
            float r11 = r10.d
            float r12 = r10.b
            of5 r13 = r0.n
            r13.getClass()
            boolean r14 = r0.f
            boolean r15 = r0.g
            r16 = r1
            boolean r1 = r0.h
            r17 = r1
            boolean r1 = r0.i
            r25 = r1
            android.view.inputmethod.CursorAnchorInfo$Builder r1 = r0.o
            r1.reset()
            r1.setMatrix(r4)
            k47 r4 = r2.c
            r18 = r5
            int r5 = defpackage.k47.f(r18)
            int r6 = defpackage.k47.e(r18)
            r1.setSelectionRange(r5, r6)
            r26 = 1
            if (r14 == 0) goto L106
            if (r5 >= 0) goto Lae
            goto L106
        Lae:
            int r5 = r7.s(r5)
            of5 r14 = r8.c(r5)
            float r6 = r14.a
            r18 = r1
            long r0 = r8.c
            r19 = 32
            long r0 = r0 >> r19
            int r0 = (int) r0
            float r0 = (float) r0
            r1 = 0
            float r0 = defpackage.gi2.p(r6, r1, r0)
            float r1 = r14.b
            boolean r1 = defpackage.nj2.j(r10, r0, r1)
            float r6 = r14.d
            boolean r6 = defpackage.nj2.j(r10, r0, r6)
            jl5 r5 = r8.a(r5)
            r19 = r0
            jl5 r0 = defpackage.jl5.Rtl
            if (r5 != r0) goto Le0
            r0 = r26
            goto Le1
        Le0:
            r0 = 0
        Le1:
            if (r1 != 0) goto Le8
            if (r6 == 0) goto Le6
            goto Le8
        Le6:
            r5 = 0
            goto Lea
        Le8:
            r5 = r26
        Lea:
            if (r1 == 0) goto Lee
            if (r6 != 0) goto Lf0
        Lee:
            r5 = r5 | 2
        Lf0:
            if (r0 == 0) goto Lf4
            r5 = r5 | 4
        Lf4:
            r23 = r5
            float r0 = r14.b
            float r1 = r14.d
            r22 = r1
            r20 = r0
            r21 = r1
            r18.setInsertionMarkerLocation(r19, r20, r21, r22, r23)
            r0 = r18
            goto L107
        L106:
            r0 = r1
        L107:
            if (r15 == 0) goto L1bd
            r1 = -1
            if (r4 == 0) goto L113
            long r5 = r4.a
            int r5 = defpackage.k47.f(r5)
            goto L114
        L113:
            r5 = r1
        L114:
            if (r4 == 0) goto L11c
            long r14 = r4.a
            int r1 = defpackage.k47.e(r14)
        L11c:
            if (r5 < 0) goto L1bd
            if (r5 >= r1) goto L1bd
            fp r2 = r2.a
            java.lang.String r2 = r2.B
            java.lang.CharSequence r2 = r2.subSequence(r5, r1)
            r0.setComposingText(r5, r2)
            int r2 = r7.s(r5)
            int r4 = r7.s(r1)
            int r6 = r4 - r2
            int r6 = r6 * 4
            float[] r6 = new float[r6]
            long r14 = defpackage.jx2.f(r2, r4)
            r9.a(r14, r6)
        L140:
            if (r5 >= r1) goto L1bd
            int r4 = r7.s(r5)
            int r14 = r4 - r2
            int r14 = r14 * 4
            r15 = r6[r14]
            int r18 = r14 + 1
            r19 = r0
            r0 = r6[r18]
            int r18 = r14 + 2
            r27 = r1
            r1 = r6[r18]
            int r14 = r14 + 3
            r14 = r6[r14]
            r28 = r2
            float r2 = r10.a
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L167
            r18 = r26
            goto L169
        L167:
            r18 = 0
        L169:
            float r2 = r10.c
            int r2 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r2 >= 0) goto L172
            r2 = r26
            goto L173
        L172:
            r2 = 0
        L173:
            r2 = r18 & r2
            int r18 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r18 >= 0) goto L17c
            r18 = r26
            goto L17e
        L17c:
            r18 = 0
        L17e:
            r2 = r2 & r18
            int r18 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r18 >= 0) goto L187
            r18 = r26
            goto L189
        L187:
            r18 = 0
        L189:
            r2 = r2 & r18
            boolean r18 = defpackage.nj2.j(r10, r15, r0)
            if (r18 == 0) goto L197
            boolean r18 = defpackage.nj2.j(r10, r1, r14)
            if (r18 != 0) goto L199
        L197:
            r2 = r2 | 2
        L199:
            jl5 r4 = r8.a(r4)
            r21 = r0
            jl5 r0 = defpackage.jl5.Rtl
            if (r4 != r0) goto L1a5
            r2 = r2 | 4
        L1a5:
            r22 = r1
            r24 = r2
            r23 = r14
            r20 = r15
            r18 = r19
            r19 = r5
            r18.addCharacterBounds(r19, r20, r21, r22, r23, r24)
            r0 = r18
            int r5 = r19 + 1
            r1 = r27
            r2 = r28
            goto L140
        L1bd:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L1e0
            if (r17 == 0) goto L1e0
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.a81.h()
            android.graphics.RectF r4 = defpackage.ej2.a0(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.o2.j(r2, r4)
            android.graphics.RectF r4 = defpackage.ej2.a0(r13)
            android.view.inputmethod.EditorBoundsInfo$Builder r2 = defpackage.o2.z(r2, r4)
            android.view.inputmethod.EditorBoundsInfo r2 = defpackage.o2.k(r2)
            defpackage.o2.i(r0, r2)
        L1e0:
            r2 = 34
            if (r1 < r2) goto L21e
            if (r25 == 0) goto L21e
            boolean r1 = r10.f()
            if (r1 != 0) goto L21e
            int r1 = r9.f
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L1f3
            r1 = 0
        L1f3:
            int r2 = r9.e(r12)
            r4 = 0
            int r2 = defpackage.gi2.q(r2, r4, r1)
            int r5 = r9.e(r11)
            int r1 = defpackage.gi2.q(r5, r4, r1)
            if (r2 > r1) goto L21e
        L206:
            float r4 = r8.e(r2)
            float r5 = r9.f(r2)
            float r6 = r8.f(r2)
            float r7 = r9.b(r2)
            defpackage.gi.o(r0, r4, r5, r6, r7)
            if (r2 == r1) goto L21e
            int r2 = r2 + 1
            goto L206
        L21e:
            android.view.inputmethod.CursorAnchorInfo r0 = r0.build()
            android.view.inputmethod.InputMethodManager r1 = r16.n()
            r1.updateCursorAnchorInfo(r3, r0)
            r4 = 0
            r0 = r29
            r0.e = r4
        L22e:
            return
    }
}
