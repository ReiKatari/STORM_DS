package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mx  reason: default package */
/* loaded from: classes.dex */
public final class mx {
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public final float a(long r9) {
            r8 = this;
            long r0 = r8.e
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r3 = 0
            if (r2 >= 0) goto L8
            return r3
        L8:
            long r4 = r8.g
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r2 < 0) goto L28
            int r2 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r2 >= 0) goto L17
            goto L28
        L17:
            long r9 = r9 - r4
            float r0 = r8.h
            float r1 = r6 - r0
            float r9 = (float) r9
            int r8 = r8.i
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = defpackage.fx3.b(r9, r3, r6)
            float r8 = r8 * r0
            float r8 = r8 + r1
            return r8
        L28:
            long r9 = r9 - r0
            float r9 = (float) r9
            int r8 = r8.a
            float r8 = (float) r8
            float r9 = r9 / r8
            float r8 = defpackage.fx3.b(r9, r3, r6)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r8 = r8 * r9
            return r8
    }
}
