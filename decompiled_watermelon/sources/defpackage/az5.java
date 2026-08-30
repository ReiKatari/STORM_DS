package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: az5  reason: default package */
/* loaded from: classes.dex */
public abstract class az5 {
    public static final qz5 a = new qz5("SelectionHandleInfo");

    public static final long a(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - 1.0f) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
