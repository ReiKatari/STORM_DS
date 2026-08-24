package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw4  reason: default package */
/* loaded from: classes.dex */
public final class lw4 extends defpackage.a1 {
    public final defpackage.jw4 L;
    public int R;
    public defpackage.zb7 X;
    public int Y;

    public lw4(defpackage.jw4 r2, int r3) {
            r1 = this;
            int r0 = r2.d0
            r1.<init>(r3, r0)
            r1.L = r2
            int r2 = r2.f()
            r1.R = r2
            r2 = -1
            r1.Y = r2
            r1.b()
            return
    }

    public final void a() {
            r1 = this;
            int r0 = r1.R
            jw4 r1 = r1.L
            int r1 = r1.f()
            if (r0 != r1) goto Lb
            return
        Lb:
            defpackage.i.l()
            return
    }

    @Override // defpackage.a1, java.util.ListIterator
    public final void add(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.A
            jw4 r1 = r2.L
            r1.add(r0, r3)
            int r3 = r2.A
            int r3 = r3 + 1
            r2.A = r3
            int r3 = r1.a()
            r2.B = r3
            int r3 = r1.f()
            r2.R = r3
            r3 = -1
            r2.Y = r3
            r2.b()
            return
    }

    public final void b() {
            r6 = this;
            jw4 r0 = r6.L
            java.lang.Object[] r1 = r0.Y
            if (r1 != 0) goto La
            r0 = 0
            r6.X = r0
            return
        La:
            int r2 = r0.d0
            r3 = 1
            int r2 = r2 - r3
            r2 = r2 & (-32)
            int r4 = r6.A
            if (r4 <= r2) goto L15
            r4 = r2
        L15:
            int r0 = r0.R
            int r0 = r0 / 5
            int r0 = r0 + r3
            zb7 r5 = r6.X
            if (r5 != 0) goto L26
            zb7 r3 = new zb7
            r3.<init>(r1, r4, r2, r0)
            r6.X = r3
            return
        L26:
            r5.A = r4
            r5.B = r2
            r5.L = r0
            java.lang.Object[] r6 = r5.R
            int r6 = r6.length
            if (r6 >= r0) goto L35
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r5.R = r6
        L35:
            java.lang.Object[] r6 = r5.R
            r0 = 0
            r6[r0] = r1
            if (r4 != r2) goto L3d
            r0 = r3
        L3d:
            r5.X = r0
            int r4 = r4 - r0
            r5.b(r4, r3)
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            r4.a()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3b
            int r0 = r4.A
            r4.Y = r0
            zb7 r1 = r4.X
            jw4 r2 = r4.L
            if (r1 != 0) goto L1c
            java.lang.Object[] r1 = r2.Z
            int r2 = r0 + 1
            r4.A = r2
            r4 = r1[r0]
            return r4
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            int r0 = r4.A
            int r0 = r0 + 1
            r4.A = r0
            java.lang.Object r4 = r1.next()
            return r4
        L2d:
            java.lang.Object[] r0 = r2.Z
            int r2 = r4.A
            int r3 = r2 + 1
            r4.A = r3
            int r4 = r1.B
            int r2 = r2 - r4
            r4 = r0[r2]
            return r4
        L3b:
            defpackage.fa6.c()
            r4 = 0
            return r4
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r4 = this;
            r4.a()
            boolean r0 = r4.hasPrevious()
            if (r0 == 0) goto L35
            int r0 = r4.A
            int r1 = r0 + (-1)
            r4.Y = r1
            zb7 r1 = r4.X
            jw4 r2 = r4.L
            if (r1 != 0) goto L1e
            java.lang.Object[] r1 = r2.Z
            int r0 = r0 + (-1)
            r4.A = r0
            r4 = r1[r0]
            return r4
        L1e:
            int r3 = r1.B
            if (r0 <= r3) goto L2c
            java.lang.Object[] r1 = r2.Z
            int r0 = r0 + (-1)
            r4.A = r0
            int r0 = r0 - r3
            r4 = r1[r0]
            return r4
        L2c:
            int r0 = r0 + (-1)
            r4.A = r0
            java.lang.Object r4 = r1.previous()
            return r4
        L35:
            defpackage.fa6.c()
            r4 = 0
            return r4
    }

    @Override // defpackage.a1, java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            r4.a()
            int r0 = r4.Y
            r1 = -1
            if (r0 == r1) goto L27
            jw4 r2 = r4.L
            r2.b(r0)
            int r0 = r4.Y
            int r3 = r4.A
            if (r0 >= r3) goto L15
            r4.A = r0
        L15:
            int r0 = r2.a()
            r4.B = r0
            int r0 = r2.f()
            r4.R = r0
            r4.Y = r1
            r4.b()
            return
        L27:
            defpackage.e41.m()
            return
    }

    @Override // defpackage.a1, java.util.ListIterator
    public final void set(java.lang.Object r3) {
            r2 = this;
            r2.a()
            int r0 = r2.Y
            r1 = -1
            if (r0 == r1) goto L17
            jw4 r1 = r2.L
            r1.set(r0, r3)
            int r3 = r1.f()
            r2.R = r3
            r2.b()
            return
        L17:
            defpackage.e41.m()
            return
    }
}
