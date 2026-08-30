package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hg4  reason: default package */
/* loaded from: classes.dex */
public final class hg4 {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof hg4) {
            if (!b53.x(this.a, ((hg4) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "OutputResult(result=" + this.a + ')';
    }
}
