package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa6  reason: default package */
/* loaded from: classes.dex */
public abstract class pa6 {
    public static final fb6 a = new fb6("SelectionHandleInfo");

    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
