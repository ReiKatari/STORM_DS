package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4743a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f4744b;

    /* renamed from: c  reason: collision with root package name */
    public static final i4.w f4745c = new i4.w("SelectionHandleInfo");

    static {
        float f8 = 25;
        f4743a = f8;
        f4744b = f8;
    }

    public static final long a(long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) - 1.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
