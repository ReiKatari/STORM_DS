package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx2  reason: default package */
/* loaded from: classes.dex */
public final class fx2 extends defpackage.ct7 {
    @Override // defpackage.xh1
    public final void a(defpackage.xh1 r9) {
            r8 = this;
            l21 r9 = r8.b
            a20 r9 = (defpackage.a20) r9
            int r0 = r9.v0
            ci1 r8 = r8.h
            java.util.ArrayList r1 = r8.l
            int r2 = r1.size()
            r3 = -1
            r4 = 0
            r6 = r3
            r5 = r4
        L12:
            if (r5 >= r2) goto L27
            java.lang.Object r7 = r1.get(r5)
            int r5 = r5 + 1
            ci1 r7 = (defpackage.ci1) r7
            int r7 = r7.g
            if (r6 == r3) goto L22
            if (r7 >= r6) goto L23
        L22:
            r6 = r7
        L23:
            if (r4 >= r7) goto L12
            r4 = r7
            goto L12
        L27:
            if (r0 == 0) goto L34
            r1 = 2
            if (r0 != r1) goto L2d
            goto L34
        L2d:
            int r9 = r9.x0
            int r4 = r4 + r9
            r8.d(r4)
            return
        L34:
            int r9 = r9.x0
            int r6 = r6 + r9
            r8.d(r6)
            return
    }

    @Override // defpackage.ct7
    public final void d() {
            r8 = this;
            l21 r0 = r8.b
            boolean r1 = r0 instanceof defpackage.a20
            if (r1 == 0) goto Lf5
            ci1 r1 = r8.h
            r2 = 1
            r1.b = r2
            java.util.ArrayList r3 = r1.l
            a20 r0 = (defpackage.a20) r0
            int r4 = r0.v0
            boolean r5 = r0.w0
            r6 = 8
            r7 = 0
            if (r4 == 0) goto Lc1
            if (r4 == r2) goto L8c
            r2 = 2
            if (r4 == r2) goto L57
            r2 = 3
            if (r4 == r2) goto L22
            goto Lf5
        L22:
            bi1 r2 = defpackage.bi1.BOTTOM
            r1.e = r2
        L26:
            int r2 = r0.u0
            if (r7 >= r2) goto L44
            l21[] r2 = r0.t0
            r2 = r2[r7]
            if (r5 != 0) goto L35
            int r4 = r2.h0
            if (r4 != r6) goto L35
            goto L41
        L35:
            lm7 r2 = r2.e
            ci1 r2 = r2.i
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        L41:
            int r7 = r7 + 1
            goto L26
        L44:
            l21 r0 = r8.b
            lm7 r0 = r0.e
            ci1 r0 = r0.h
            r8.m(r0)
            l21 r0 = r8.b
            lm7 r0 = r0.e
            ci1 r0 = r0.i
            r8.m(r0)
            return
        L57:
            bi1 r2 = defpackage.bi1.TOP
            r1.e = r2
        L5b:
            int r2 = r0.u0
            if (r7 >= r2) goto L79
            l21[] r2 = r0.t0
            r2 = r2[r7]
            if (r5 != 0) goto L6a
            int r4 = r2.h0
            if (r4 != r6) goto L6a
            goto L76
        L6a:
            lm7 r2 = r2.e
            ci1 r2 = r2.h
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        L76:
            int r7 = r7 + 1
            goto L5b
        L79:
            l21 r0 = r8.b
            lm7 r0 = r0.e
            ci1 r0 = r0.h
            r8.m(r0)
            l21 r0 = r8.b
            lm7 r0 = r0.e
            ci1 r0 = r0.i
            r8.m(r0)
            return
        L8c:
            bi1 r2 = defpackage.bi1.RIGHT
            r1.e = r2
        L90:
            int r2 = r0.u0
            if (r7 >= r2) goto Lae
            l21[] r2 = r0.t0
            r2 = r2[r7]
            if (r5 != 0) goto L9f
            int r4 = r2.h0
            if (r4 != r6) goto L9f
            goto Lab
        L9f:
            ly2 r2 = r2.d
            ci1 r2 = r2.i
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        Lab:
            int r7 = r7 + 1
            goto L90
        Lae:
            l21 r0 = r8.b
            ly2 r0 = r0.d
            ci1 r0 = r0.h
            r8.m(r0)
            l21 r0 = r8.b
            ly2 r0 = r0.d
            ci1 r0 = r0.i
            r8.m(r0)
            return
        Lc1:
            bi1 r2 = defpackage.bi1.LEFT
            r1.e = r2
        Lc5:
            int r2 = r0.u0
            if (r7 >= r2) goto Le3
            l21[] r2 = r0.t0
            r2 = r2[r7]
            if (r5 != 0) goto Ld4
            int r4 = r2.h0
            if (r4 != r6) goto Ld4
            goto Le0
        Ld4:
            ly2 r2 = r2.d
            ci1 r2 = r2.h
            java.util.ArrayList r4 = r2.k
            r4.add(r1)
            r3.add(r2)
        Le0:
            int r7 = r7 + 1
            goto Lc5
        Le3:
            l21 r0 = r8.b
            ly2 r0 = r0.d
            ci1 r0 = r0.h
            r8.m(r0)
            l21 r0 = r8.b
            ly2 r0 = r0.d
            ci1 r0 = r0.i
            r8.m(r0)
        Lf5:
            return
    }

    @Override // defpackage.ct7
    public final void e() {
            r3 = this;
            l21 r0 = r3.b
            boolean r1 = r0 instanceof defpackage.a20
            if (r1 == 0) goto L1c
            r1 = r0
            a20 r1 = (defpackage.a20) r1
            int r1 = r1.v0
            ci1 r3 = r3.h
            if (r1 == 0) goto L18
            r2 = 1
            if (r1 != r2) goto L13
            goto L18
        L13:
            int r3 = r3.g
            r0.a0 = r3
            return
        L18:
            int r3 = r3.g
            r0.Z = r3
        L1c:
            return
    }

    @Override // defpackage.ct7
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            ci1 r1 = r1.h
            r1.c()
            return
    }

    @Override // defpackage.ct7
    public final boolean k() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final void m(defpackage.ci1 r2) {
            r1 = this;
            ci1 r1 = r1.h
            java.util.ArrayList r0 = r1.k
            r0.add(r2)
            java.util.ArrayList r2 = r2.l
            r2.add(r1)
            return
    }
}
