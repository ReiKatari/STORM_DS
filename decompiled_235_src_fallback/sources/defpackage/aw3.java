package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw3  reason: default package */
/* loaded from: classes.dex */
public final class aw3 extends java.util.AbstractMap implements java.io.Serializable {
    public static final defpackage.zh2 e0 = null;
    public final java.util.Comparator A;
    public final boolean B;
    public defpackage.zv3 L;
    public int R;
    public int X;
    public final defpackage.zv3 Y;
    public defpackage.yv3 Z;
    public defpackage.yv3 d0;

    static {
            zh2 r0 = new zh2
            r1 = 20
            r0.<init>(r1)
            defpackage.aw3.e0 = r0
            return
    }

    public aw3(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.R = r0
            r1.X = r0
            zh2 r0 = defpackage.aw3.e0
            r1.A = r0
            r1.B = r2
            zv3 r0 = new zv3
            r0.<init>(r2)
            r1.Y = r0
            return
    }

    public final defpackage.zv3 a(boolean r13, java.lang.Object r14) {
            r12 = this;
            zv3 r0 = r12.L
            r1 = 0
            zh2 r2 = defpackage.aw3.e0
            java.util.Comparator r3 = r12.A
            if (r0 == 0) goto L2d
            if (r3 != r2) goto Lf
            r4 = r14
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            goto L10
        Lf:
            r4 = r1
        L10:
            java.lang.Object r5 = r0.Y
            if (r4 == 0) goto L19
            int r5 = r4.compareTo(r5)
            goto L1d
        L19:
            int r5 = r3.compare(r14, r5)
        L1d:
            if (r5 != 0) goto L20
            return r0
        L20:
            if (r5 >= 0) goto L25
            zv3 r6 = r0.B
            goto L27
        L25:
            zv3 r6 = r0.L
        L27:
            if (r6 != 0) goto L2b
        L29:
            r8 = r0
            goto L2f
        L2b:
            r0 = r6
            goto L10
        L2d:
            r5 = 0
            goto L29
        L2f:
            if (r13 != 0) goto L32
            return r1
        L32:
            r13 = 1
            zv3 r10 = r12.Y
            if (r8 != 0) goto L5f
            if (r3 != r2) goto L52
            boolean r0 = r14 instanceof java.lang.Comparable
            if (r0 == 0) goto L3e
            goto L52
        L3e:
            java.lang.ClassCastException r12 = new java.lang.ClassCastException
            java.lang.Class r13 = r14.getClass()
            java.lang.String r13 = r13.getName()
            java.lang.String r14 = " is not Comparable"
            java.lang.String r13 = r13.concat(r14)
            r12.<init>(r13)
            throw r12
        L52:
            zv3 r6 = new zv3
            boolean r7 = r12.B
            zv3 r11 = r10.X
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            r12.L = r6
            goto L73
        L5f:
            r9 = r14
            zv3 r6 = new zv3
            boolean r7 = r12.B
            zv3 r11 = r10.X
            r6.<init>(r7, r8, r9, r10, r11)
            if (r5 >= 0) goto L6e
            r8.B = r6
            goto L70
        L6e:
            r8.L = r6
        L70:
            r12.b(r8, r13)
        L73:
            int r14 = r12.R
            int r14 = r14 + r13
            r12.R = r14
            int r14 = r12.X
            int r14 = r14 + r13
            r12.X = r14
            return r6
    }

    public final void b(defpackage.zv3 r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            zv3 r0 = r8.B
            zv3 r1 = r8.L
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.e0
            goto Ld
        Lc:
            r3 = r2
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.e0
            goto L13
        L12:
            r4 = r2
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            zv3 r0 = r1.B
            zv3 r3 = r1.L
            if (r3 == 0) goto L21
            int r3 = r3.e0
            goto L22
        L21:
            r3 = r2
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.e0
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.f(r1)
            r7.e(r8)
            goto L39
        L36:
            r7.e(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            zv3 r1 = r0.B
            zv3 r3 = r0.L
            if (r3 == 0) goto L49
            int r3 = r3.e0
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.e0
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.e(r0)
            r7.f(r8)
            goto L60
        L5d:
            r7.f(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.e0 = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.e0 = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            zv3 r8 = r8.A
            goto L0
        L79:
            return
    }

    public final void c(defpackage.zv3 r7, boolean r8) {
            r6 = this;
            if (r8 == 0) goto Lc
            zv3 r8 = r7.X
            zv3 r0 = r7.R
            r8.R = r0
            zv3 r0 = r7.R
            r0.X = r8
        Lc:
            zv3 r8 = r7.B
            zv3 r0 = r7.L
            zv3 r1 = r7.A
            r2 = 0
            r3 = 0
            if (r8 == 0) goto L5c
            if (r0 == 0) goto L5c
            int r1 = r8.e0
            int r4 = r0.e0
            if (r1 <= r4) goto L28
            zv3 r0 = r8.L
        L20:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r8 == 0) goto L33
            zv3 r0 = r8.L
            goto L20
        L28:
            zv3 r8 = r0.B
        L2a:
            r5 = r0
            r0 = r8
            r8 = r5
            if (r0 == 0) goto L32
            zv3 r8 = r0.B
            goto L2a
        L32:
            r0 = r8
        L33:
            r6.c(r0, r2)
            zv3 r8 = r7.B
            if (r8 == 0) goto L43
            int r1 = r8.e0
            r0.B = r8
            r8.A = r0
            r7.B = r3
            goto L44
        L43:
            r1 = r2
        L44:
            zv3 r8 = r7.L
            if (r8 == 0) goto L50
            int r2 = r8.e0
            r0.L = r8
            r8.A = r0
            r7.L = r3
        L50:
            int r8 = java.lang.Math.max(r1, r2)
            int r8 = r8 + 1
            r0.e0 = r8
            r6.d(r7, r0)
            return
        L5c:
            if (r8 == 0) goto L64
            r6.d(r7, r8)
            r7.B = r3
            goto L6f
        L64:
            if (r0 == 0) goto L6c
            r6.d(r7, r0)
            r7.L = r3
            goto L6f
        L6c:
            r6.d(r7, r3)
        L6f:
            r6.b(r1, r2)
            int r7 = r6.R
            int r7 = r7 + (-1)
            r6.R = r7
            int r7 = r6.X
            int r7 = r7 + 1
            r6.X = r7
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            r0 = 0
            r1.L = r0
            r0 = 0
            r1.R = r0
            int r0 = r1.X
            int r0 = r0 + 1
            r1.X = r0
            zv3 r1 = r1.Y
            r1.X = r1
            r1.R = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            if (r3 == 0) goto L8
            zv3 r1 = r2.a(r0, r3)     // Catch: java.lang.ClassCastException -> L8
        L8:
            if (r1 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            return r0
    }

    public final void d(defpackage.zv3 r3, defpackage.zv3 r4) {
            r2 = this;
            zv3 r0 = r3.A
            r1 = 0
            r3.A = r1
            if (r4 == 0) goto L9
            r4.A = r0
        L9:
            if (r0 == 0) goto L15
            zv3 r2 = r0.B
            if (r2 != r3) goto L12
            r0.B = r4
            return
        L12:
            r0.L = r4
            return
        L15:
            r2.L = r4
            return
    }

    public final void e(defpackage.zv3 r5) {
            r4 = this;
            zv3 r0 = r5.B
            zv3 r1 = r5.L
            zv3 r2 = r1.B
            zv3 r3 = r1.L
            r5.L = r2
            if (r2 == 0) goto Le
            r2.A = r5
        Le:
            r4.d(r5, r1)
            r1.B = r5
            r5.A = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.e0
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.e0
            goto L22
        L21:
            r2 = r4
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r5.e0 = r0
            if (r3 == 0) goto L2e
            int r4 = r3.e0
        L2e:
            int r4 = java.lang.Math.max(r0, r4)
            int r4 = r4 + 1
            r1.e0 = r4
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            yv3 r0 = r2.Z
            if (r0 != 0) goto Lc
            yv3 r0 = new yv3
            r1 = 0
            r0.<init>(r1, r2)
            r2.Z = r0
        Lc:
            return r0
    }

    public final void f(defpackage.zv3 r5) {
            r4 = this;
            zv3 r0 = r5.B
            zv3 r1 = r5.L
            zv3 r2 = r0.B
            zv3 r3 = r0.L
            r5.B = r3
            if (r3 == 0) goto Le
            r3.A = r5
        Le:
            r4.d(r5, r0)
            r0.L = r5
            r5.A = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.e0
            goto L1c
        L1b:
            r1 = r4
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.e0
            goto L22
        L21:
            r3 = r4
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r5.e0 = r1
            if (r2 == 0) goto L2e
            int r4 = r2.e0
        L2e:
            int r4 = java.lang.Math.max(r1, r4)
            int r4 = r4 + 1
            r0.e0 = r4
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            zv3 r2 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.d0
            return r2
        Lf:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            yv3 r0 = r2.d0
            if (r0 != 0) goto Lc
            yv3 r0 = new yv3
            r1 = 1
            r0.<init>(r1, r2)
            r2.d0 = r0
        Lc:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L1a
            if (r4 != 0) goto L10
            boolean r1 = r2.B
            if (r1 == 0) goto La
            goto L10
        La:
            java.lang.String r2 = "value == null"
            defpackage.u34.x(r2)
            return r0
        L10:
            r0 = 1
            zv3 r2 = r2.a(r0, r3)
            java.lang.Object r3 = r2.d0
            r2.d0 = r4
            return r3
        L1a:
            java.lang.String r2 = "key == null"
            defpackage.u34.x(r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object remove(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            zv3 r3 = r2.a(r1, r3)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.d0
            return r2
        L15:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.R
            return r0
    }
}
