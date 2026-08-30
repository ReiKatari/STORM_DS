package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bz5  reason: default package */
/* loaded from: classes.dex */
public abstract class bz5 {
    public static final lo a = new lo(Float.NaN, Float.NaN);
    public static final bz6 b = new bz6(new fu5(22), new fu5(23));
    public static final long c;
    public static final sc6 d;

    static {
        long floatToRawIntBits = (Float.floatToRawIntBits(0.01f) << 32) | (Float.floatToRawIntBits(0.01f) & 4294967295L);
        c = floatToRawIntBits;
        d = new sc6(new mb4(floatToRawIntBits));
    }
}
