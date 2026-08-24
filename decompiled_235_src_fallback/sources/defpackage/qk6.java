package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk6  reason: default package */
/* loaded from: classes.dex */
public final class qk6 extends defpackage.h1 {
    public static final defpackage.qk6 B = null;
    public final java.lang.Object[] A;

    static {
            qk6 r0 = new qk6
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.<init>(r1)
            defpackage.qk6.B = r0
            return
    }

    public qk6(java.lang.Object[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            java.lang.Object[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.h1
    public final defpackage.h1 b(int r6, java.lang.Object r7) {
            r5 = this;
            java.lang.Object[] r0 = r5.A
            int r1 = r0.length
            defpackage.np2.y(r6, r1)
            int r1 = r0.length
            if (r6 != r1) goto Le
            h1 r5 = r5.c(r7)
            return r5
        Le:
            int r5 = r0.length
            r1 = 32
            r2 = 0
            if (r5 >= r1) goto L2b
            int r5 = r0.length
            int r5 = r5 + 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r1 = 6
            defpackage.fv.w0(r0, r5, r2, r6, r1)
            int r1 = r6 + 1
            int r2 = r0.length
            defpackage.fv.t0(r0, r5, r1, r6, r2)
            r5[r6] = r7
            qk6 r6 = new qk6
            r6.<init>(r5)
            return r6
        L2b:
            int r5 = r0.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r5)
            int r3 = r6 + 1
            int r4 = r0.length
            int r4 = r4 + (-1)
            defpackage.fv.t0(r0, r5, r3, r6, r4)
            r5[r6] = r7
            r6 = 31
            r6 = r0[r6]
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r7[r2] = r6
            iw4 r6 = new iw4
            int r0 = r0.length
            int r0 = r0 + 1
            r6.<init>(r5, r7, r0, r2)
            return r6
    }

    @Override // defpackage.h1
    public final defpackage.h1 c(java.lang.Object r4) {
            r3 = this;
            java.lang.Object[] r3 = r3.A
            int r0 = r3.length
            r1 = 32
            if (r0 >= r1) goto L17
            int r0 = r3.length
            int r0 = r0 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r3 = r3.length
            r0[r3] = r4
            qk6 r3 = new qk6
            r3.<init>(r0)
            return r3
        L17:
            java.lang.Object[] r0 = new java.lang.Object[r1]
            r1 = 0
            r0[r1] = r4
            iw4 r4 = new iw4
            int r2 = r3.length
            int r2 = r2 + 1
            r4.<init>(r3, r0, r2, r1)
            return r4
    }

    @Override // defpackage.h1
    public final defpackage.h1 d(java.util.Collection r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.A
            int r1 = r0.length
            int r2 = r4.size()
            int r2 = r2 + r1
            r1 = 32
            if (r2 > r1) goto L31
            int r3 = r0.length
            int r1 = r4.size()
            int r1 = r1 + r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r1)
            int r0 = r0.length
            java.util.Iterator r4 = r4.iterator()
        L1b:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r4.next()
            int r2 = r0 + 1
            r3[r0] = r1
            r0 = r2
            goto L1b
        L2b:
            qk6 r4 = new qk6
            r4.<init>(r3)
            return r4
        L31:
            jw4 r3 = r3.f()
            r3.addAll(r4)
            h1 r3 = r3.c()
            return r3
    }

    @Override // defpackage.h1
    public final defpackage.jw4 f() {
            r4 = this;
            jw4 r0 = new jw4
            java.lang.Object[] r1 = r4.A
            r2 = 0
            r3 = 0
            r0.<init>(r4, r3, r1, r2)
            return r0
    }

    @Override // defpackage.h1
    public final defpackage.h1 g(defpackage.g1 r10) {
            r9 = this;
            java.lang.Object[] r0 = r9.A
            int r1 = r0.length
            int r2 = r0.length
            r3 = 0
            r6 = r0
            r4 = r3
            r5 = r4
        L8:
            if (r4 >= r2) goto L2c
            r7 = r0[r4]
            java.lang.Object r8 = r10.g(r7)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L22
            if (r5 != 0) goto L29
            int r1 = r0.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r0, r1)
            r5 = 1
            r1 = r4
            goto L29
        L22:
            if (r5 == 0) goto L29
            int r8 = r1 + 1
            r6[r1] = r7
            r1 = r8
        L29:
            int r4 = r4 + 1
            goto L8
        L2c:
            int r10 = r0.length
            if (r1 != r10) goto L30
            return r9
        L30:
            if (r1 != 0) goto L35
            qk6 r9 = defpackage.qk6.B
            return r9
        L35:
            qk6 r9 = new qk6
            java.lang.Object[] r10 = defpackage.fv.y0(r6, r3, r1)
            r9.<init>(r10)
            return r9
    }

    @Override // java.util.List
    public final java.lang.Object get(int r2) {
            r1 = this;
            java.lang.Object[] r1 = r1.A
            int r0 = r1.length
            defpackage.np2.w(r2, r0)
            r1 = r1[r2]
            return r1
    }

    @Override // defpackage.h1
    public final defpackage.h1 h(int r4) {
            r3 = this;
            java.lang.Object[] r3 = r3.A
            int r0 = r3.length
            defpackage.np2.w(r4, r0)
            int r0 = r3.length
            r1 = 1
            if (r0 != r1) goto Ld
            qk6 r3 = defpackage.qk6.B
            return r3
        Ld:
            int r0 = r3.length
            int r0 = r0 - r1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r3, r0)
            int r1 = r4 + 1
            int r2 = r3.length
            defpackage.fv.t0(r3, r0, r4, r1, r2)
            qk6 r3 = new qk6
            r3.<init>(r0)
            return r3
    }

    @Override // defpackage.h1
    public final defpackage.h1 i(int r2, java.lang.Object r3) {
            r1 = this;
            java.lang.Object[] r1 = r1.A
            int r0 = r1.length
            defpackage.np2.w(r2, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r1[r2] = r3
            qk6 r2 = new qk6
            r2.<init>(r1)
            return r2
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(java.lang.Object r1) {
            r0 = this;
            java.lang.Object[] r0 = r0.A
            int r0 = defpackage.fv.K0(r0, r1)
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            java.lang.Object[] r4 = r4.A
            r0 = -1
            if (r5 != 0) goto L15
            int r5 = r4.length
            int r5 = r5 + r0
            if (r5 < 0) goto L29
        L9:
            int r1 = r5 + (-1)
            r2 = r4[r5]
            if (r2 != 0) goto L10
            return r5
        L10:
            if (r1 >= 0) goto L13
            goto L29
        L13:
            r5 = r1
            goto L9
        L15:
            int r1 = r4.length
            int r1 = r1 + r0
            if (r1 < 0) goto L29
        L19:
            int r2 = r1 + (-1)
            r3 = r4[r1]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L24
            return r1
        L24:
            if (r2 >= 0) goto L27
            goto L29
        L27:
            r1 = r2
            goto L19
        L29:
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public final java.util.ListIterator listIterator(int r3) {
            r2 = this;
            java.lang.Object[] r2 = r2.A
            int r0 = r2.length
            defpackage.np2.y(r3, r0)
            l80 r0 = new l80
            int r1 = r2.length
            r0.<init>(r2, r3, r1)
            return r0
    }
}
