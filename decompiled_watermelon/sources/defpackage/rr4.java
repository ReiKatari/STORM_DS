package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rr4  reason: default package */
/* loaded from: classes.dex */
public final class rr4 extends ve2 {
    public final Object e;
    public final long f;

    public rr4(long j, Object obj) {
        this.e = obj;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rr4) {
                rr4 rr4Var = (rr4) obj;
                if (!this.e.equals(rr4Var.e) || this.f != rr4Var.f) {
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
        return "PredictiveBackHandlerInfo(owner=" + this.e + ", compositeKey=" + this.f + ')';
    }
}
