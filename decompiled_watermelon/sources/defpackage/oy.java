package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oy  reason: default package */
/* loaded from: classes.dex */
public final class oy extends ve2 {
    public final Object e;
    public final long f;

    public oy(long j, Object obj) {
        this.e = obj;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof oy) {
                oy oyVar = (oy) obj;
                if (!this.e.equals(oyVar.e) || this.f != oyVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + (this.e.hashCode() * 31);
    }

    public final String toString() {
        return "BackHandlerInfo(owner=" + this.e + ", compositeKey=" + this.f + ')';
    }
}
