package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qa6  reason: default package */
/* loaded from: classes.dex */
public abstract class qa6 {
    public static final xo a = new xo(Float.NaN, Float.NaN);
    public static final wc7 b = new wc7(new r76(3), new r76(4));
    public static final long c;
    public static final io6 d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new io6(new jk4(floatToRawIntBits));
    }
}
