package e2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final long f4150a = a(Float.NaN, Float.NaN);

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f4151b = 0;

    public static long a(float f8, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static String b(long j2) {
        return "InlineDensity(density=" + Float.intBitsToFloat((int) (j2 >> 32)) + ", fontScale=" + Float.intBitsToFloat((int) (j2 & 4294967295L)) + ')';
    }
}
