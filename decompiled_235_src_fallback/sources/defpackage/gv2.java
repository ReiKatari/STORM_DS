package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv2  reason: default package */
/* loaded from: classes.dex */
public final class gv2 implements defpackage.f05 {
    public final defpackage.ic a;
    public final defpackage.ok4 b;
    public long c;

    public gv2(defpackage.ic r1, defpackage.ok4 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.c = r1
            return
    }

    @Override // defpackage.f05
    public final long a(defpackage.m93 r7, long r8, defpackage.kk3 r10, long r11) {
            r6 = this;
            ok4 r8 = r6.b
            long r8 = r8.a()
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r8
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            goto L18
        L16:
            long r8 = r6.c
        L18:
            r6.c = r8
            ic r0 = r6.a
            r3 = 0
            r5 = r10
            r1 = r11
            long r10 = r0.a(r1, r3, r5)
            long r6 = r7.b()
            long r8 = defpackage.kn2.a0(r8)
            long r6 = defpackage.i93.c(r6, r8)
            long r6 = defpackage.i93.c(r6, r10)
            return r6
    }
}
