package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx6  reason: default package */
/* loaded from: classes.dex */
public final class gx6 extends defpackage.f55 {
    public final java.util.HashMap L;
    public final /* synthetic */ defpackage.hx6 R;

    public gx6(defpackage.hx6 r1) {
            r0 = this;
            r0.R = r1
            r1 = 0
            r0.<init>(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.L = r1
            return
    }

    @Override // defpackage.f55
    public final void i0(defpackage.au7 r5) {
            r4 = this;
            hx6 r0 = r4.R
            java.util.ArrayList r0 = r0.b
            zt7 r1 = r5.a
            int r1 = r1.d()
            r1 = r1 & 519(0x207, float:7.27E-43)
            if (r1 == 0) goto L36
            java.util.HashMap r4 = r4.L
            r4.remove(r5)
            int r4 = r0.size()
            r5 = 1
            int r4 = r4 - r5
        L19:
            if (r4 < 0) goto L36
            java.lang.Object r1 = r0.get(r4)
            l45 r1 = (defpackage.l45) r1
            int r2 = r1.e
            if (r2 <= 0) goto L27
            r3 = r5
            goto L28
        L27:
            r3 = 0
        L28:
            int r2 = r2 + (-1)
            r1.e = r2
            if (r3 == 0) goto L33
            if (r2 != 0) goto L33
            r1.c()
        L33:
            int r4 = r4 + (-1)
            goto L19
        L36:
            return
    }

    @Override // defpackage.f55
    public final void j0(defpackage.au7 r3) {
            r2 = this;
            hx6 r2 = r2.R
            java.util.ArrayList r2 = r2.b
            zt7 r3 = r3.a
            int r3 = r3.d()
            r3 = r3 & 519(0x207, float:7.27E-43)
            if (r3 == 0) goto L25
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L14:
            if (r3 < 0) goto L25
            java.lang.Object r0 = r2.get(r3)
            l45 r0 = (defpackage.l45) r0
            int r1 = r0.e
            int r1 = r1 + 1
            r0.e = r1
            int r3 = r3 + (-1)
            goto L14
        L25:
            return
    }

    @Override // defpackage.f55
    public final defpackage.vu7 k0(defpackage.vu7 r13, java.util.List r14) {
            r12 = this;
            hx6 r0 = r12.R
            java.util.ArrayList r0 = r0.b
            android.graphics.RectF r1 = new android.graphics.RectF
            r2 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r2, r2, r2, r2)
            int r2 = r14.size()
            r3 = 1
            int r2 = r2 - r3
            r4 = 0
            r5 = r4
        L13:
            if (r2 < 0) goto L4b
            java.lang.Object r6 = r14.get(r2)
            au7 r6 = (defpackage.au7) r6
            java.util.HashMap r7 = r12.L
            java.lang.Object r7 = r7.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L48
            int r7 = r7.intValue()
            zt7 r6 = r6.a
            float r6 = r6.a()
            r8 = r7 & 1
            if (r8 == 0) goto L35
            r1.left = r6
        L35:
            r8 = r7 & 2
            if (r8 == 0) goto L3b
            r1.top = r6
        L3b:
            r8 = r7 & 4
            if (r8 == 0) goto L41
            r1.right = r6
        L41:
            r8 = r7 & 8
            if (r8 == 0) goto L47
            r1.bottom = r6
        L47:
            r5 = r5 | r7
        L48:
            int r2 = r2 + (-1)
            goto L13
        L4b:
            r12 = 519(0x207, float:7.27E-43)
            ru7 r14 = r13.a
            e83 r12 = r14.h(r12)
            r14 = 64
            ru7 r2 = r13.a
            e83 r14 = r2.h(r14)
            e83 r12 = defpackage.e83.b(r12, r14)
            int r14 = r0.size()
            int r14 = r14 - r3
        L64:
            if (r14 < 0) goto Lf2
            java.lang.Object r2 = r0.get(r14)
            l45 r2 = (defpackage.l45) r2
            e83 r6 = r2.d
            java.util.ArrayList r2 = r2.a
            int r7 = r2.size()
            int r7 = r7 - r3
        L75:
            if (r7 < 0) goto Lee
            java.lang.Object r8 = r2.get(r7)
            mt0 r8 = (defpackage.mt0) r8
            int r9 = r8.a
            r10 = r9 & r5
            if (r10 != 0) goto L84
            goto Leb
        L84:
            k45 r10 = r8.b
            boolean r11 = r10.d
            if (r11 == r3) goto L97
            r10.d = r3
            ap3 r10 = r10.i
            if (r10 == 0) goto L97
            java.lang.Object r10 = r10.L
            android.view.View r10 = (android.view.View) r10
            r10.setVisibility(r4)
        L97:
            if (r9 == r3) goto Lda
            r10 = 2
            if (r9 == r10) goto Lc8
            r10 = 4
            if (r9 == r10) goto Lb6
            r10 = 8
            if (r9 == r10) goto La4
            goto Leb
        La4:
            int r9 = r6.d
            if (r9 <= 0) goto Lb0
            int r10 = r12.d
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            r8.b(r10)
        Lb0:
            float r9 = r1.bottom
            r8.a(r9)
            goto Leb
        Lb6:
            int r9 = r6.c
            if (r9 <= 0) goto Lc2
            int r10 = r12.c
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            r8.b(r10)
        Lc2:
            float r9 = r1.right
            r8.a(r9)
            goto Leb
        Lc8:
            int r9 = r6.b
            if (r9 <= 0) goto Ld4
            int r10 = r12.b
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            r8.b(r10)
        Ld4:
            float r9 = r1.top
            r8.a(r9)
            goto Leb
        Lda:
            int r9 = r6.a
            if (r9 <= 0) goto Le6
            int r10 = r12.a
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            r8.b(r10)
        Le6:
            float r9 = r1.left
            r8.a(r9)
        Leb:
            int r7 = r7 + (-1)
            goto L75
        Lee:
            int r14 = r14 + (-1)
            goto L64
        Lf2:
            return r13
    }

    @Override // defpackage.f55
    public final defpackage.rr6 l0(defpackage.au7 r6, defpackage.rr6 r7) {
            r5 = this;
            zt7 r0 = r6.a
            int r0 = r0.d()
            r0 = r0 & 519(0x207, float:7.27E-43)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r7.L
            e83 r0 = (defpackage.e83) r0
            java.lang.Object r1 = r7.B
            e83 r1 = (defpackage.e83) r1
            int r2 = r0.a
            int r3 = r1.a
            if (r2 == r3) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            int r3 = r0.b
            int r4 = r1.b
            if (r3 == r4) goto L23
            r2 = r2 | 2
        L23:
            int r3 = r0.c
            int r4 = r1.c
            if (r3 == r4) goto L2b
            r2 = r2 | 4
        L2b:
            int r0 = r0.d
            int r1 = r1.d
            if (r0 == r1) goto L33
            r2 = r2 | 8
        L33:
            java.util.HashMap r5 = r5.L
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.put(r6, r0)
        L3c:
            return r7
    }
}
