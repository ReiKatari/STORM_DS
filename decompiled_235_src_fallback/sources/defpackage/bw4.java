package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw4  reason: default package */
/* loaded from: classes.dex */
public class bw4 extends defpackage.zv4 {
    public final defpackage.aw4 R;
    public java.lang.Object X;
    public boolean Y;
    public int Z;

    public bw4(defpackage.aw4 r2, defpackage.bc7[] r3) {
            r1 = this;
            ac7 r0 = r2.L
            r1.<init>(r0, r3)
            r1.R = r2
            int r2 = r2.X
            r1.Z = r2
            return
    }

    public final void c(int r6, defpackage.ac7 r7, java.lang.Object r8, int r9) {
            r5 = this;
            int r0 = r9 * 5
            r1 = 30
            bc7[] r2 = r5.A
            if (r0 <= r1) goto L2b
            r6 = r2[r9]
            java.lang.Object[] r7 = r7.d
            int r0 = r7.length
            r1 = 0
            r6.a(r7, r0, r1)
        L11:
            r6 = r2[r9]
            java.lang.Object[] r7 = r6.A
            int r6 = r6.L
            r6 = r7[r6]
            boolean r6 = defpackage.nb3.k(r6, r8)
            if (r6 != 0) goto L28
            r6 = r2[r9]
            int r7 = r6.L
            int r7 = r7 + 2
            r6.L = r7
            goto L11
        L28:
            r5.B = r9
            return
        L2b:
            int r0 = defpackage.oi2.I(r6, r0)
            r1 = 1
            int r0 = r1 << r0
            boolean r3 = r7.h(r0)
            if (r3 == 0) goto L4e
            int r6 = r7.f(r0)
            r8 = r2[r9]
            java.lang.Object[] r0 = r7.d
            int r7 = r7.a
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r8.a(r0, r7, r6)
            r5.B = r9
            return
        L4e:
            int r0 = r7.t(r0)
            ac7 r3 = r7.s(r0)
            r2 = r2[r9]
            java.lang.Object[] r4 = r7.d
            int r7 = r7.a
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r2.a(r4, r7, r0)
            int r9 = r9 + r1
            r5.c(r6, r3, r8, r9)
            return
    }

    @Override // defpackage.zv4, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            aw4 r0 = r3.R
            int r0 = r0.X
            int r1 = r3.Z
            r2 = 0
            if (r0 != r1) goto L27
            boolean r0 = r3.L
            if (r0 == 0) goto L23
            bc7[] r0 = r3.A
            int r1 = r3.B
            r0 = r0[r1]
            java.lang.Object[] r1 = r0.A
            int r0 = r0.L
            r0 = r1[r0]
            r3.X = r0
            r0 = 1
            r3.Y = r0
            java.lang.Object r3 = super.next()
            return r3
        L23:
            defpackage.fa6.c()
            return r2
        L27:
            defpackage.i.l()
            return r2
    }

    @Override // defpackage.zv4, java.util.Iterator
    public final void remove() {
            r5 = this;
            boolean r0 = r5.Y
            if (r0 == 0) goto L47
            boolean r0 = r5.L
            r1 = 0
            aw4 r2 = r5.R
            if (r0 == 0) goto L34
            if (r0 == 0) goto L30
            bc7[] r0 = r5.A
            int r3 = r5.B
            r0 = r0[r3]
            java.lang.Object[] r3 = r0.A
            int r0 = r0.L
            r0 = r3[r0]
            java.lang.Object r3 = r5.X
            java.util.Map r4 = defpackage.ge7.n(r2)
            r4.remove(r3)
            if (r0 == 0) goto L29
            int r3 = r0.hashCode()
            goto L2a
        L29:
            r3 = r1
        L2a:
            ac7 r4 = r2.L
            r5.c(r3, r4, r0, r1)
            goto L3d
        L30:
            defpackage.fa6.c()
            return
        L34:
            java.lang.Object r0 = r5.X
            java.util.Map r3 = defpackage.ge7.n(r2)
            r3.remove(r0)
        L3d:
            r0 = 0
            r5.X = r0
            r5.Y = r1
            int r0 = r2.X
            r5.Z = r0
            return
        L47:
            defpackage.e41.m()
            return
    }
}
