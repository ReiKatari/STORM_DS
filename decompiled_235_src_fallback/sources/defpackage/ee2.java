package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee2  reason: default package */
/* loaded from: classes.dex */
public final class ee2 implements defpackage.xd2 {
    public final int a;
    public final defpackage.hr1 b;
    public final long c;
    public final long d;

    public ee2(int r5, int r6, defpackage.hr1 r7) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            r4.b = r7
            long r0 = (long) r5
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            r4.c = r0
            long r5 = (long) r6
            long r5 = r5 * r2
            r4.d = r5
            return
    }

    @Override // defpackage.xd2
    public final float b(long r10, float r12, float r13, float r14) {
            r9 = this;
            long r1 = r9.d
            long r1 = r10 - r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto Lb
            r1 = r3
        Lb:
            long r5 = r9.c
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L13
            r6 = r5
            goto L14
        L13:
            r6 = r1
        L14:
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            return r14
        L19:
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = r6 - r1
            r0 = r9
            r3 = r12
            r4 = r13
            r5 = r14
            float r8 = r0.e(r1, r3, r4, r5)
            r1 = r6
            float r0 = r0.e(r1, r3, r4, r5)
            float r0 = r0 - r8
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r1
            return r0
    }

    @Override // defpackage.xd2
    public final long c(float r3, float r4, float r5) {
            r2 = this;
            long r3 = r2.d
            long r0 = r2.c
            long r3 = r3 + r0
            return r3
    }

    @Override // defpackage.xd2
    public final float e(long r4, float r6, float r7, float r8) {
            r3 = this;
            long r0 = r3.d
            long r4 = r4 - r0
            r0 = 0
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 >= 0) goto La
            r4 = r0
        La:
            long r0 = r3.c
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L11
            r4 = r0
        L11:
            int r8 = r3.a
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r8 != 0) goto L19
            r4 = r2
            goto L1c
        L19:
            float r4 = (float) r4
            float r5 = (float) r0
            float r4 = r4 / r5
        L1c:
            hr1 r3 = r3.b
            float r3 = r3.b(r4)
            float r2 = r2 - r3
            float r2 = r2 * r6
            float r7 = r7 * r3
            float r7 = r7 + r2
            return r7
    }
}
