package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r82  reason: default package */
/* loaded from: classes.dex */
public final class r82 implements s01 {
    @Override // defpackage.s01
    public final long d(long j, long j2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
        int i = vu5.a;
        return floatToRawIntBits;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r82) || Float.compare(1.0f, 1.0f) != 0) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(1.0f);
    }

    public final String toString() {
        return "FixedScale(value=1.0)";
    }
}
