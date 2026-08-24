package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy2  reason: default package */
/* loaded from: classes.dex */
public final class vy2 {
    public int a;
    public final java.util.ArrayList b;
    public final defpackage.fe5 c;
    public defpackage.uw2[] d;
    public int e;
    public int f;
    public int g;

    public vy2(defpackage.sz2 r2) {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r1.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.b = r0
            fe5 r0 = new fe5
            r0.<init>(r2)
            r1.c = r0
            r2 = 8
            uw2[] r2 = new defpackage.uw2[r2]
            r1.d = r2
            r2 = 7
            r1.e = r2
            return
    }

    public final int a(int r5) {
            r4 = this;
            r0 = 0
            if (r5 <= 0) goto L39
            uw2[] r1 = r4.d
            int r1 = r1.length
            int r1 = r1 + (-1)
        L8:
            int r2 = r4.e
            if (r1 < r2) goto L28
            if (r5 <= 0) goto L28
            uw2[] r2 = r4.d
            r2 = r2[r1]
            r2.getClass()
            int r2 = r2.c
            int r5 = r5 - r2
            int r3 = r4.g
            int r3 = r3 - r2
            r4.g = r3
            int r2 = r4.f
            int r2 = r2 + (-1)
            r4.f = r2
            int r0 = r0 + 1
            int r1 = r1 + (-1)
            goto L8
        L28:
            uw2[] r5 = r4.d
            int r1 = r2 + 1
            int r2 = r2 + 1
            int r2 = r2 + r0
            int r3 = r4.f
            java.lang.System.arraycopy(r5, r1, r5, r2, r3)
            int r5 = r4.e
            int r5 = r5 + r0
            r4.e = r5
        L39:
            return r0
    }

    public final defpackage.da0 b(int r3) {
            r2 = this;
            if (r3 < 0) goto Le
            uw2[] r0 = defpackage.xy2.a
            int r1 = r0.length
            int r1 = r1 + (-1)
            if (r3 > r1) goto Le
            r2 = r0[r3]
            da0 r2 = r2.a
            return r2
        Le:
            uw2[] r0 = defpackage.xy2.a
            int r0 = r0.length
            int r0 = r3 - r0
            int r1 = r2.e
            int r1 = r1 + 1
            int r1 = r1 + r0
            if (r1 < 0) goto L27
            uw2[] r2 = r2.d
            int r0 = r2.length
            if (r1 >= r0) goto L27
            r2 = r2[r1]
            r2.getClass()
            da0 r2 = r2.a
            return r2
        L27:
            java.io.IOException r2 = new java.io.IOException
            int r3 = r3 + 1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Header index too large "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }

    public final void c(defpackage.uw2 r7) {
            r6 = this;
            java.util.ArrayList r0 = r6.b
            r0.add(r7)
            int r0 = r7.c
            int r1 = r6.a
            r2 = 0
            if (r0 <= r1) goto L1e
            uw2[] r7 = r6.d
            r0 = 0
            defpackage.fv.B0(r7, r0)
            uw2[] r7 = r6.d
            int r7 = r7.length
            int r7 = r7 + (-1)
            r6.e = r7
            r6.f = r2
            r6.g = r2
            return
        L1e:
            int r3 = r6.g
            int r3 = r3 + r0
            int r3 = r3 - r1
            r6.a(r3)
            int r1 = r6.f
            int r1 = r1 + 1
            uw2[] r3 = r6.d
            int r4 = r3.length
            if (r1 <= r4) goto L41
            int r1 = r3.length
            int r1 = r1 * 2
            uw2[] r1 = new defpackage.uw2[r1]
            int r4 = r3.length
            int r5 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r4, r5)
            uw2[] r2 = r6.d
            int r2 = r2.length
            int r2 = r2 + (-1)
            r6.e = r2
            r6.d = r1
        L41:
            int r1 = r6.e
            int r2 = r1 + (-1)
            r6.e = r2
            uw2[] r2 = r6.d
            r2[r1] = r7
            int r7 = r6.f
            int r7 = r7 + 1
            r6.f = r7
            int r7 = r6.g
            int r7 = r7 + r0
            r6.g = r7
            return
    }

    public final defpackage.da0 d() {
            r11 = this;
            fe5 r0 = r11.c
            byte r1 = r0.readByte()
            byte[] r2 = defpackage.yy7.a
            r2 = r1 & 255(0xff, float:3.57E-43)
            r3 = 128(0x80, float:1.8E-43)
            r1 = r1 & r3
            r4 = 0
            if (r1 != r3) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = r4
        L13:
            r3 = 127(0x7f, float:1.78E-43)
            int r11 = r11.e(r2, r3)
            long r2 = (long) r11
            if (r1 == 0) goto L99
            k80 r11 = new k80
            r11.<init>()
            int[] r1 = defpackage.j03.a
            r0.getClass()
            r90 r1 = defpackage.j03.c
            r5 = 0
            r8 = r1
            r6 = r5
            r5 = r4
        L2d:
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 >= 0) goto L6b
            byte r9 = r0.readByte()
            byte[] r10 = defpackage.yy7.a
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            r4 = r4 | r9
            int r5 = r5 + 8
        L3e:
            r9 = 8
            if (r5 < r9) goto L67
            int r9 = r5 + (-8)
            int r9 = r4 >>> r9
            r9 = r9 & 255(0xff, float:3.57E-43)
            java.lang.Object r8 = r8.L
            r90[] r8 = (defpackage.r90[]) r8
            r8.getClass()
            r8 = r8[r9]
            r8.getClass()
            java.lang.Object r9 = r8.L
            r90[] r9 = (defpackage.r90[]) r9
            if (r9 != 0) goto L64
            int r9 = r8.A
            r11.n0(r9)
            int r8 = r8.B
            int r5 = r5 - r8
            r8 = r1
            goto L3e
        L64:
            int r5 = r5 + (-8)
            goto L3e
        L67:
            r9 = 1
            long r6 = r6 + r9
            goto L2d
        L6b:
            if (r5 <= 0) goto L92
            int r0 = 8 - r5
            int r0 = r4 << r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.Object r2 = r8.L
            r90[] r2 = (defpackage.r90[]) r2
            r2.getClass()
            r0 = r2[r0]
            r0.getClass()
            int r2 = r0.B
            java.lang.Object r3 = r0.L
            r90[] r3 = (defpackage.r90[]) r3
            if (r3 != 0) goto L92
            if (r2 <= r5) goto L8a
            goto L92
        L8a:
            int r0 = r0.A
            r11.n0(r0)
            int r5 = r5 - r2
            r8 = r1
            goto L6b
        L92:
            long r0 = r11.B
            da0 r11 = r11.l(r0)
            return r11
        L99:
            da0 r11 = r0.l(r2)
            return r11
    }

    public final int e(int r4, int r5) {
            r3 = this;
            r4 = r4 & r5
            if (r4 >= r5) goto L4
            return r4
        L4:
            r4 = 0
        L5:
            fe5 r0 = r3.c
            byte r0 = r0.readByte()
            byte[] r1 = defpackage.yy7.a
            r1 = r0 & 255(0xff, float:3.57E-43)
            r2 = r0 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L1a
            r0 = r0 & 127(0x7f, float:1.78E-43)
            int r0 = r0 << r4
            int r5 = r5 + r0
            int r4 = r4 + 7
            goto L5
        L1a:
            int r3 = r1 << r4
            int r5 = r5 + r3
            return r5
    }
}
