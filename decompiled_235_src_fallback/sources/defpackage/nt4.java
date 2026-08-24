package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nt4  reason: default package */
/* loaded from: classes.dex */
public final class nt4 extends defpackage.gk7 {
    public defpackage.f80 b;
    public float c;
    public java.util.List d;
    public float e;
    public float f;
    public defpackage.f80 g;
    public int h;
    public int i;
    public float j;
    public float k;
    public float l;
    public float m;
    public boolean n;
    public boolean o;
    public boolean p;
    public defpackage.ys6 q;
    public final defpackage.hj r;
    public defpackage.hj s;
    public defpackage.hj t;
    public final defpackage.go3 u;

    public nt4() {
            r2 = this;
            r2.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r2.c = r0
            int r1 = defpackage.el7.a
            yt1 r1 = defpackage.yt1.A
            r2.d = r1
            r2.e = r0
            r1 = 0
            r2.h = r1
            r2.i = r1
            r1 = 1082130432(0x40800000, float:4.0)
            r2.j = r1
            r2.l = r0
            r0 = 1
            r2.n = r0
            r2.o = r0
            hj r0 = defpackage.lj.a()
            r2.r = r0
            r2.s = r0
            xr3 r0 = defpackage.xr3.NONE
            iy0 r1 = defpackage.iy0.k0
            go3 r0 = defpackage.kj2.M(r0, r1)
            r2.u = r0
            return
    }

    @Override // defpackage.gk7
    public final void a(defpackage.no1 r19) {
            r18 = this;
            r0 = r18
            boolean r1 = r0.n
            if (r1 == 0) goto L11
            java.util.List r1 = r0.d
            hj r2 = r0.r
            defpackage.ln2.e0(r1, r2)
            r0.e()
            goto L18
        L11:
            boolean r1 = r0.p
            if (r1 == 0) goto L18
            r0.e()
        L18:
            r1 = 0
            r0.n = r1
            r0.p = r1
            f80 r4 = r0.b
            if (r4 == 0) goto L2d
            hj r3 = r0.s
            float r5 = r0.c
            r6 = 0
            r7 = 56
            r2 = r19
            defpackage.no1.b0(r2, r3, r4, r5, r6, r7)
        L2d:
            f80 r10 = r0.g
            if (r10 == 0) goto L5d
            ys6 r2 = r0.q
            boolean r3 = r0.o
            if (r3 != 0) goto L3c
            if (r2 != 0) goto L3a
            goto L3c
        L3a:
            r12 = r2
            goto L52
        L3c:
            ys6 r11 = new ys6
            float r12 = r0.f
            float r13 = r0.j
            int r14 = r0.h
            int r15 = r0.i
            r16 = 0
            r17 = 16
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r0.q = r11
            r0.o = r1
            r12 = r11
        L52:
            hj r9 = r0.s
            float r11 = r0.e
            r13 = 48
            r8 = r19
            defpackage.no1.b0(r8, r9, r10, r11, r12, r13)
        L5d:
            return
    }

    public final void e() {
            r7 = this;
            float r0 = r7.k
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            hj r2 = r7.r
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r0 != 0) goto L14
            float r0 = r7.l
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L14
            r7.s = r2
            return
        L14:
            hj r0 = r7.s
            boolean r0 = defpackage.nb3.k(r0, r2)
            r4 = 0
            if (r0 == 0) goto L24
            hj r0 = defpackage.lj.a()
            r7.s = r0
            goto L3f
        L24:
            hj r0 = r7.s
            android.graphics.Path r0 = r0.a
            android.graphics.Path$FillType r0 = r0.getFillType()
            android.graphics.Path$FillType r5 = android.graphics.Path.FillType.EVEN_ODD
            if (r0 != r5) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = r4
        L33:
            hj r5 = r7.s
            android.graphics.Path r5 = r5.a
            r5.rewind()
            hj r5 = r7.s
            r5.h(r0)
        L3f:
            go3 r0 = r7.u
            java.lang.Object r5 = r0.getValue()
            jj r5 = (defpackage.jj) r5
            android.graphics.PathMeasure r5 = r5.a
            if (r2 == 0) goto L4e
            android.graphics.Path r2 = r2.a
            goto L4f
        L4e:
            r2 = 0
        L4f:
            r5.setPath(r2, r4)
            java.lang.Object r2 = r0.getValue()
            jj r2 = (defpackage.jj) r2
            android.graphics.PathMeasure r2 = r2.a
            float r2 = r2.getLength()
            float r4 = r7.k
            float r5 = r7.m
            float r4 = r4 + r5
            float r4 = r4 % r3
            float r4 = r4 * r2
            float r6 = r7.l
            float r6 = r6 + r5
            float r6 = r6 % r3
            float r6 = r6 * r2
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto L9c
            hj r3 = r7.t
            if (r3 == 0) goto L73
            goto L79
        L73:
            hj r3 = defpackage.lj.a()
            r7.t = r3
        L79:
            r3.g()
            java.lang.Object r5 = r0.getValue()
            jj r5 = (defpackage.jj) r5
            r5.a(r4, r2, r3)
            hj r2 = r7.s
            defpackage.hj.a(r2, r3)
            r3.g()
            java.lang.Object r0 = r0.getValue()
            jj r0 = (defpackage.jj) r0
            r0.a(r1, r6, r3)
            hj r7 = r7.s
            defpackage.hj.a(r7, r3)
            return
        L9c:
            java.lang.Object r0 = r0.getValue()
            jj r0 = (defpackage.jj) r0
            hj r7 = r7.s
            r0.a(r4, r6, r7)
            return
    }

    public final java.lang.String toString() {
            r0 = this;
            hj r0 = r0.r
            java.lang.String r0 = r0.toString()
            return r0
    }
}
