package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i80  reason: default package */
/* loaded from: classes.dex */
public final class i80 implements java.io.Closeable {
    public defpackage.k80 A;
    public boolean B;
    public defpackage.o96 L;
    public long R;
    public byte[] X;
    public int Y;
    public int Z;

    public i80() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.R = r0
            r0 = -1
            r2.Y = r0
            r2.Z = r0
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r3 = this;
            k80 r0 = r3.A
            if (r0 == 0) goto L15
            r0 = 0
            r3.A = r0
            r3.L = r0
            r1 = -1
            r3.R = r1
            r3.X = r0
            r0 = -1
            r3.Y = r0
            r3.Z = r0
            return
        L15:
            java.lang.String r3 = "not attached to a buffer"
            defpackage.i.m(r3)
            return
    }

    public final void e(long r16) {
            r15 = this;
            r1 = r16
            k80 r3 = r15.A
            if (r3 == 0) goto L93
            boolean r4 = r15.B
            if (r4 == 0) goto L8d
            long r4 = r3.B
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r7 = 0
            if (r6 > 0) goto L56
            int r6 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r6 < 0) goto L4c
            long r4 = r4 - r1
        L17:
            int r6 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r6 <= 0) goto L3f
            o96 r6 = r3.A
            r6.getClass()
            o96 r6 = r6.g
            r6.getClass()
            int r9 = r6.c
            int r10 = r6.b
            int r10 = r9 - r10
            long r10 = (long) r10
            int r12 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r12 > 0) goto L3b
            o96 r9 = r6.a()
            r3.A = r9
            defpackage.r96.a(r6)
            long r4 = r4 - r10
            goto L17
        L3b:
            int r4 = (int) r4
            int r9 = r9 - r4
            r6.c = r9
        L3f:
            r4 = 0
            r15.L = r4
            r15.R = r1
            r15.X = r4
            r4 = -1
            r15.Y = r4
            r15.Z = r4
            goto L8a
        L4c:
            java.lang.String r0 = "newSize < 0: "
            java.lang.String r0 = defpackage.lb1.h(r1, r0)
            defpackage.i.f(r0)
            return
        L56:
            if (r6 <= 0) goto L8a
            long r9 = r1 - r4
            r6 = 1
            r11 = r6
        L5c:
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 <= 0) goto L8a
            o96 r12 = r3.j0(r6)
            int r13 = r12.c
            int r13 = 8192 - r13
            long r13 = (long) r13
            long r13 = java.lang.Math.min(r9, r13)
            int r13 = (int) r13
            int r14 = r12.c
            int r14 = r14 + r13
            r12.c = r14
            long r6 = (long) r13
            long r9 = r9 - r6
            if (r11 == 0) goto L86
            r15.L = r12
            r15.R = r4
            byte[] r6 = r12.a
            r15.X = r6
            int r6 = r14 - r13
            r15.Y = r6
            r15.Z = r14
            r11 = 0
        L86:
            r6 = 1
            r7 = 0
            goto L5c
        L8a:
            r3.B = r1
            return
        L8d:
            java.lang.String r0 = "resizeBuffer() only permitted for read/write buffers"
            defpackage.i.m(r0)
            return
        L93:
            java.lang.String r0 = "not attached to a buffer"
            defpackage.i.m(r0)
            return
    }

    public final int h(long r14) {
            r13 = this;
            k80 r0 = r13.A
            if (r0 == 0) goto Lce
            r1 = -1
            int r1 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r1 < 0) goto Lb7
            long r2 = r0.B
            int r4 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r4 > 0) goto Lb7
            if (r1 == 0) goto Laa
            if (r4 != 0) goto L16
            goto Laa
        L16:
            o96 r1 = r0.A
            o96 r4 = r13.L
            r5 = 0
            if (r4 == 0) goto L32
            long r7 = r13.R
            int r9 = r13.Y
            int r10 = r4.b
            int r9 = r9 - r10
            long r9 = (long) r9
            long r7 = r7 - r9
            int r9 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r9 <= 0) goto L30
            r2 = r4
            r4 = r1
            r1 = r2
            r2 = r7
            goto L33
        L30:
            r5 = r7
            goto L33
        L32:
            r4 = r1
        L33:
            long r7 = r2 - r14
            long r9 = r14 - r5
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L4d
        L3b:
            r4.getClass()
            int r1 = r4.c
            int r2 = r4.b
            int r1 = r1 - r2
            long r1 = (long) r1
            long r1 = r1 + r5
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 < 0) goto L63
            o96 r4 = r4.f
            r5 = r1
            goto L3b
        L4d:
            int r4 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r4 <= 0) goto L61
            r1.getClass()
            o96 r1 = r1.g
            r1.getClass()
            int r4 = r1.c
            int r5 = r1.b
            int r4 = r4 - r5
            long r4 = (long) r4
            long r2 = r2 - r4
            goto L4d
        L61:
            r4 = r1
            r5 = r2
        L63:
            boolean r1 = r13.B
            if (r1 == 0) goto L92
            r4.getClass()
            boolean r1 = r4.d
            if (r1 == 0) goto L92
            o96 r7 = new o96
            byte[] r1 = r4.a
            int r2 = r1.length
            byte[] r8 = java.util.Arrays.copyOf(r1, r2)
            int r9 = r4.b
            int r10 = r4.c
            r11 = 0
            r12 = 1
            r7.<init>(r8, r9, r10, r11, r12)
            o96 r1 = r0.A
            if (r1 != r4) goto L86
            r0.A = r7
        L86:
            r4.b(r7)
            o96 r0 = r7.g
            r0.getClass()
            r0.a()
            r4 = r7
        L92:
            r13.L = r4
            r13.R = r14
            r4.getClass()
            byte[] r0 = r4.a
            r13.X = r0
            int r0 = r4.b
            long r14 = r14 - r5
            int r14 = (int) r14
            int r0 = r0 + r14
            r13.Y = r0
            int r14 = r4.c
            r13.Z = r14
            int r14 = r14 - r0
            return r14
        Laa:
            r0 = 0
            r13.L = r0
            r13.R = r14
            r13.X = r0
            r14 = -1
            r13.Y = r14
            r13.Z = r14
            return r14
        Lb7:
            java.lang.ArrayIndexOutOfBoundsException r13 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r1 = "offset="
            java.lang.String r2 = " > size="
            java.lang.StringBuilder r14 = defpackage.xg6.s(r14, r1, r2)
            long r0 = r0.B
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lce:
            java.lang.String r13 = "not attached to a buffer"
            defpackage.i.m(r13)
            r13 = 0
            return r13
    }
}
