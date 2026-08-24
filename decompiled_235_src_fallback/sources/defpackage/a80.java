package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a80  reason: default package */
/* loaded from: classes.dex */
public final class a80 implements defpackage.z70 {
    @Override // defpackage.z70
    public final float a(float r3, float r4, float r5) {
            r2 = this;
            float r4 = r4 + r3
            float r4 = r4 - r3
            float r2 = java.lang.Math.abs(r4)
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 > 0) goto Lc
            r4 = 1
            goto Ld
        Lc:
            r4 = 0
        Ld:
            r0 = 1050253722(0x3e99999a, float:0.3)
            float r0 = r0 * r5
            r1 = 0
            float r1 = r1 * r2
            float r0 = r0 - r1
            float r1 = r5 - r0
            if (r4 == 0) goto L1e
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1e
            float r0 = r5 - r2
        L1e:
            float r3 = r3 - r0
            return r3
    }
}
