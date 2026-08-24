package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa6  reason: default package */
/* loaded from: classes.dex */
public abstract class pa6 {
    public static final defpackage.fb6 a = null;

    static {
            fb6 r0 = new fb6
            java.lang.String r1 = "SelectionHandleInfo"
            r0.<init>(r1)
            defpackage.pa6.a = r0
            return
    }

    public static final long a(long r6) {
            r0 = 32
            long r1 = r6 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r2
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 - r7
            int r7 = java.lang.Float.floatToRawIntBits(r1)
            long r4 = (long) r7
            int r6 = java.lang.Float.floatToRawIntBits(r6)
            long r6 = (long) r6
            long r0 = r4 << r0
            long r6 = r6 & r2
            long r6 = r6 | r0
            return r6
    }
}
