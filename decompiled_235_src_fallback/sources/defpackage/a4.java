package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public final class a4 implements defpackage.z70 {
    public final float b;
    public final float c;

    public a4(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return
    }

    @Override // defpackage.z70
    public final float a(float r4, float r5, float r6) {
            r3 = this;
            float r5 = r5 + r4
            float r0 = r3.b
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r2 = 0
            float r3 = r3.c
            if (r1 < 0) goto L11
            float r1 = r6 - r3
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 > 0) goto L11
            return r2
        L11:
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L1c
            float r1 = r6 - r3
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            return r2
        L1c:
            float r1 = r4 + r0
            float r1 = java.lang.Math.abs(r1)
            float r2 = r6 - r3
            float r2 = r5 - r2
            float r2 = java.lang.Math.abs(r2)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L30
            float r4 = r4 - r0
            return r4
        L30:
            float r5 = r5 - r6
            float r5 = r5 + r3
            return r5
    }
}
