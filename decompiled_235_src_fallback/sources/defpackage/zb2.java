package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb2  reason: default package */
/* loaded from: classes.dex */
public abstract class zb2 {
    public static final long a = 0;

    static {
            defpackage.wa2.q()
            defpackage.wa2.u()
            r0 = 10000000(0x989680, double:4.9406565E-317)
            defpackage.zb2.a = r0
            return
    }

    public static java.nio.file.attribute.FileTime a(long r4) {
            r0 = -116444736000000000(0xfe624e212ac18000, double:-6.1294289019608E300)
            long r4 = java.lang.Math.addExact(r4, r0)
            long r0 = defpackage.zb2.a
            long r2 = java.lang.Math.floorDiv(r4, r0)
            long r4 = java.lang.Math.floorMod(r4, r0)
            r0 = 100
            long r4 = r4 * r0
            java.time.Instant r4 = defpackage.wa2.r(r2, r4)
            java.nio.file.attribute.FileTime r4 = defpackage.wa2.n(r4)
            return r4
    }
}
