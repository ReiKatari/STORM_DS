package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o96  reason: default package */
/* loaded from: classes.dex */
public final class o96 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public defpackage.o96 f;
    public defpackage.o96 g;

    public o96() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1.a = r0
            r0 = 1
            r1.e = r0
            r0 = 0
            r1.d = r0
            return
    }

    public o96(byte[] r1, int r2, int r3, boolean r4, boolean r5) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final defpackage.o96 a() {
            r4 = this;
            o96 r0 = r4.f
            r1 = 0
            if (r0 == r4) goto L6
            goto L7
        L6:
            r0 = r1
        L7:
            o96 r2 = r4.g
            r2.getClass()
            o96 r3 = r4.f
            r2.f = r3
            o96 r2 = r4.f
            r2.getClass()
            o96 r3 = r4.g
            r2.g = r3
            r4.f = r1
            r4.g = r1
            return r0
    }

    public final void b(defpackage.o96 r2) {
            r1 = this;
            r2.getClass()
            r2.g = r1
            o96 r0 = r1.f
            r2.f = r0
            o96 r0 = r1.f
            r0.getClass()
            r0.g = r2
            r1.f = r2
            return
    }

    public final defpackage.o96 c() {
            r7 = this;
            r0 = 1
            r7.d = r0
            o96 r1 = new o96
            int r3 = r7.b
            int r4 = r7.c
            r5 = 1
            r6 = 0
            byte[] r2 = r7.a
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    public final void d(defpackage.o96 r6, int r7) {
            r5 = this;
            r6.getClass()
            byte[] r0 = r6.a
            boolean r1 = r6.e
            if (r1 == 0) goto L47
            int r1 = r6.c
            int r2 = r1 + r7
            r3 = 8192(0x2000, float:1.148E-41)
            if (r2 <= r3) goto L31
            boolean r4 = r6.d
            if (r4 != 0) goto L2d
            int r4 = r6.b
            int r2 = r2 - r4
            if (r2 > r3) goto L29
            r2 = 2
            defpackage.fv.u0(r4, r1, r2, r0, r0)
            int r1 = r6.c
            int r2 = r6.b
            int r1 = r1 - r2
            r6.c = r1
            r1 = 0
            r6.b = r1
            goto L31
        L29:
            defpackage.u34.t()
            return
        L2d:
            defpackage.u34.t()
            return
        L31:
            int r1 = r6.c
            int r2 = r5.b
            int r3 = r2 + r7
            byte[] r4 = r5.a
            defpackage.fv.q0(r1, r2, r3, r4, r0)
            int r0 = r6.c
            int r0 = r0 + r7
            r6.c = r0
            int r6 = r5.b
            int r6 = r6 + r7
            r5.b = r6
            return
        L47:
            java.lang.String r5 = "only owner can write"
            defpackage.i.m(r5)
            return
    }
}
