package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v57  reason: default package */
/* loaded from: classes.dex */
public final class v57 {
    public final defpackage.p94 a;
    public defpackage.u57 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public float[] g;

    public v57() {
            r2 = this;
            r2.<init>()
            p94 r0 = defpackage.h93.a
            p94 r0 = new p94
            r0.<init>()
            r2.a = r0
            r0 = -1
            r2.c = r0
            r0 = 0
            r2.d = r0
            r2.e = r0
            return
    }

    public final void a(defpackage.u57 r11, long r12, long r14, float[] r16, long r17) {
            r10 = this;
            r0 = r17
            long r2 = r11.g
            long r4 = r0 - r2
            r6 = 0
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 > 0) goto L15
            r4 = -9223372036854775808
            int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r10 != 0) goto L13
            goto L15
        L13:
            r10 = 0
            goto L16
        L15:
            r10 = 1
        L16:
            if (r10 == 0) goto L26
            r11.g = r0
            long r1 = r11.e
            long r3 = r11.f
            r0 = r11
            r5 = r12
            r7 = r14
            r9 = r16
            r0.a(r1, r3, r5, r7, r9)
        L26:
            return
    }

    public final boolean b(long r5, long r7, float[] r9, int r10, int r11) {
            r4 = this;
            long r0 = r4.d
            boolean r0 = defpackage.i93.a(r7, r0)
            r1 = 1
            if (r0 != 0) goto Ld
            r4.d = r7
            r7 = r1
            goto Le
        Ld:
            r7 = 0
        Le:
            long r2 = r4.e
            boolean r8 = defpackage.i93.a(r5, r2)
            if (r8 != 0) goto L19
            r4.e = r5
            r7 = r1
        L19:
            if (r9 == 0) goto L1e
            r4.g = r9
            r7 = r1
        L1e:
            long r5 = (long) r10
            r8 = 32
            long r5 = r5 << r8
            long r8 = (long) r11
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r5 = r5 | r8
            long r8 = r4.f
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L33
            r4.f = r5
            return r1
        L33:
            return r7
    }
}
