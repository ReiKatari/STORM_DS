package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sx4  reason: default package */
/* loaded from: classes.dex */
public final class sx4 extends defpackage.qx4 {
    @Override // defpackage.qx4, defpackage.ox4
    public final void a(long r7, long r9) {
            r6 = this;
            r0 = 2143289344(0x7fc00000, float:NaN)
            boolean r1 = java.lang.Float.isNaN(r0)
            if (r1 != 0) goto Ld
            android.widget.Magnifier r1 = r6.a
            r1.setZoom(r0)
        Ld:
            r0 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r9
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            android.widget.Magnifier r6 = r6.a
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r3 = 32
            if (r0 == 0) goto L43
            long r4 = r7 >> r3
            int r0 = (int) r4
            float r0 = java.lang.Float.intBitsToFloat(r0)
            long r7 = r7 & r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r3 = r9 >> r3
            int r8 = (int) r3
            float r8 = java.lang.Float.intBitsToFloat(r8)
            long r9 = r9 & r1
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            r6.show(r0, r7, r8, r9)
            return
        L43:
            long r9 = r7 >> r3
            int r9 = (int) r9
            float r9 = java.lang.Float.intBitsToFloat(r9)
            long r7 = r7 & r1
            int r7 = (int) r7
            float r7 = java.lang.Float.intBitsToFloat(r7)
            r6.show(r9, r7)
            return
    }
}
