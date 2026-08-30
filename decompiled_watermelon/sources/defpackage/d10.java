package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d10  reason: default package */
/* loaded from: classes.dex */
public final class d10 {
    public final float a;

    public final boolean equals(Object obj) {
        if (obj instanceof d10) {
            if (Float.compare(this.a, ((d10) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "BaselineShift(multiplier=" + this.a + ')';
    }
}
