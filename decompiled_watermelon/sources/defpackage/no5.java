package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no5  reason: default package */
/* loaded from: classes.dex */
public final class no5 {
    public final String a;
    public final Long b;
    public final ul5 c;

    public no5(String str, Long l, ul5 ul5Var) {
        ul5Var.getClass();
        this.a = str;
        this.b = l;
        this.c = ul5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof no5) {
                no5 no5Var = (no5) obj;
                if (!this.a.equals(no5Var.a) || !b53.x(this.b, no5Var.b) || this.c != no5Var.c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        Long l = this.b;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        return "DirectoryCacheStatusUi(directoryName=" + this.a + ", lastScanTimestamp=" + this.b + ", result=" + this.c + ")";
    }
}
