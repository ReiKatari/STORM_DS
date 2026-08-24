package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wu  reason: default package */
/* loaded from: classes.dex */
public final class wu extends defpackage.ci6 implements java.util.Map {
    public defpackage.yv3 R;
    public defpackage.tu X;
    public defpackage.vu Y;

    public wu(defpackage.ci6 r5) {
            r4 = this;
            r0 = 0
            r4.<init>(r0)
            int r1 = r5.L
            int r2 = r4.L
            int r2 = r2 + r1
            r4.b(r2)
            int r2 = r4.L
            if (r2 != 0) goto L25
            if (r1 <= 0) goto L35
            int[] r2 = r5.A
            int[] r3 = r4.A
            defpackage.fv.r0(r0, r0, r1, r2, r3)
            java.lang.Object[] r5 = r5.B
            java.lang.Object[] r2 = r4.B
            int r3 = r1 << 1
            defpackage.fv.t0(r5, r2, r0, r0, r3)
            r4.L = r1
            return
        L25:
            if (r0 >= r1) goto L35
            java.lang.Object r2 = r5.f(r0)
            java.lang.Object r3 = r5.i(r0)
            r4.put(r2, r3)
            int r0 = r0 + 1
            goto L25
        L35:
            return
    }

    @Override // java.util.Map
    public final java.util.Set entrySet() {
            r2 = this;
            yv3 r0 = r2.R
            if (r0 != 0) goto Lc
            yv3 r0 = new yv3
            r1 = 2
            r0.<init>(r1, r2)
            r2.R = r0
        Lc:
            return r0
    }

    public final boolean j(java.util.Collection r2) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = super.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final boolean k(java.util.Collection r3) {
            r2 = this;
            int r0 = r2.L
            java.util.Iterator r3 = r3.iterator()
        L6:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L14
            java.lang.Object r1 = r3.next()
            super.remove(r1)
            goto L6
        L14:
            int r2 = r2.L
            if (r0 == r2) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    @Override // java.util.Map
    public final java.util.Set keySet() {
            r1 = this;
            tu r0 = r1.X
            if (r0 != 0) goto Lb
            tu r0 = new tu
            r0.<init>(r1)
            r1.X = r0
        Lb:
            return r0
    }

    public final boolean l(java.util.Collection r4) {
            r3 = this;
            int r0 = r3.L
            int r1 = r0 + (-1)
        L4:
            if (r1 < 0) goto L16
            java.lang.Object r2 = r3.f(r1)
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L13
            r3.g(r1)
        L13:
            int r1 = r1 + (-1)
            goto L4
        L16:
            int r3 = r3.L
            if (r0 == r3) goto L1c
            r3 = 1
            return r3
        L1c:
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public final void putAll(java.util.Map r3) {
            r2 = this;
            int r0 = r2.L
            int r1 = r3.size()
            int r1 = r1 + r0
            r2.b(r1)
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L12:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2a
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r2.put(r1, r0)
            goto L12
        L2a:
            return
    }

    @Override // java.util.Map
    public final java.util.Collection values() {
            r1 = this;
            vu r0 = r1.Y
            if (r0 != 0) goto Lb
            vu r0 = new vu
            r0.<init>(r1)
            r1.Y = r0
        Lb:
            return r0
    }
}
