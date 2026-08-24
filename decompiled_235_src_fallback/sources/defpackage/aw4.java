package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aw4  reason: default package */
/* loaded from: classes.dex */
public class aw4 extends java.util.AbstractMap implements java.util.Map, defpackage.cg3 {
    public defpackage.yv4 A;
    public defpackage.jd1 B;
    public defpackage.ac7 L;
    public java.lang.Object R;
    public int X;
    public int Y;

    public aw4(defpackage.yv4 r3) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            jd1 r0 = new jd1
            r1 = 15
            r0.<init>(r1)
            r2.B = r0
            ac7 r0 = r3.A
            r2.L = r0
            int r3 = r3.B
            r2.Y = r3
            return
    }

    public defpackage.yv4 a() {
            r3 = this;
            ac7 r0 = r3.L
            yv4 r1 = r3.A
            ac7 r2 = r1.A
            if (r0 != r2) goto L9
            goto L1b
        L9:
            jd1 r0 = new jd1
            r1 = 15
            r0.<init>(r1)
            r3.B = r0
            yv4 r1 = new yv4
            ac7 r0 = r3.L
            int r2 = r3.Y
            r1.<init>(r0, r2)
        L1b:
            r3.A = r1
            return r1
    }

    public /* bridge */ defpackage.yv4 b() {
            r0 = this;
            yv4 r0 = r0.a()
            return r0
    }

    public final void c(int r1) {
            r0 = this;
            r0.Y = r1
            int r1 = r0.X
            int r1 = r1 + 1
            r0.X = r1
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
            r1 = this;
            ac7 r0 = defpackage.ac7.e
            r1.L = r0
            r0 = 0
            r1.c(r0)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r3) {
            r2 = this;
            ac7 r2 = r2.L
            r0 = 0
            if (r3 == 0) goto La
            int r1 = r3.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            boolean r2 = r2.d(r3, r1, r0)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            cw4 r0 = new cw4
            r1 = 0
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object get(java.lang.Object r3) {
            r2 = this;
            ac7 r2 = r2.L
            r0 = 0
            if (r3 == 0) goto La
            int r1 = r3.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            java.lang.Object r2 = r2.g(r3, r1, r0)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Set keySet() {
            r2 = this;
            cw4 r0 = new cw4
            r1 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r0 = 0
            r7.R = r0
            ac7 r1 = r7.L
            if (r8 == 0) goto Ld
            int r0 = r8.hashCode()
        Lb:
            r2 = r0
            goto Lf
        Ld:
            r0 = 0
            goto Lb
        Lf:
            r5 = 0
            r6 = r7
            r3 = r8
            r4 = r9
            ac7 r7 = r1.l(r2, r3, r4, r5, r6)
            r6.L = r7
            java.lang.Object r7 = r6.R
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(java.util.Map r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.yv4
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r6
            yv4 r0 = (defpackage.yv4) r0
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L1c
            boolean r0 = r6 instanceof defpackage.aw4
            if (r0 == 0) goto L14
            r0 = r6
            aw4 r0 = (defpackage.aw4) r0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1d
            yv4 r1 = r0.a()
            goto L1d
        L1c:
            r1 = r0
        L1d:
            if (r1 == 0) goto L42
            oh1 r6 = new oh1
            r6.<init>()
            r0 = 0
            r6.a = r0
            int r2 = r5.Y
            ac7 r3 = r5.L
            ac7 r4 = r1.A
            r4.getClass()
            ac7 r0 = r3.m(r4, r0, r6, r5)
            r5.L = r0
            int r0 = r1.B
            int r0 = r0 + r2
            int r6 = r6.a
            int r0 = r0 - r6
            if (r2 == r0) goto L41
            r5.c(r0)
        L41:
            return
        L42:
            super.putAll(r6)
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.lang.Object remove(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            r3.R = r0
            ac7 r0 = r3.L
            r1 = 0
            if (r4 == 0) goto Ld
            int r2 = r4.hashCode()
            goto Le
        Ld:
            r2 = r1
        Le:
            ac7 r4 = r0.n(r2, r4, r1, r3)
            if (r4 != 0) goto L16
            ac7 r4 = defpackage.ac7.e
        L16:
            r3.L = r4
            java.lang.Object r3 = r3.R
            return r3
    }

    @Override // java.util.Map
    public final boolean remove(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.Y
            ac7 r1 = r8.L
            r7 = 0
            if (r9 == 0) goto Lc
            int r2 = r9.hashCode()
            goto Ld
        Lc:
            r2 = r7
        Ld:
            r5 = 0
            r6 = r8
            r3 = r9
            r4 = r10
            ac7 r8 = r1.o(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L19
            ac7 r8 = defpackage.ac7.e
        L19:
            r6.L = r8
            int r8 = r6.Y
            if (r0 == r8) goto L21
            r8 = 1
            return r8
        L21:
            return r7
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
            r0 = this;
            int r0 = r0.Y
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final java.util.Collection values() {
            r2 = this;
            r04 r0 = new r04
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }
}
