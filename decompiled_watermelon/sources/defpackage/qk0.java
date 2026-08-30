package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qk0  reason: default package */
/* loaded from: classes.dex */
public final class qk0 {
    public final String a;

    public qk0(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof qk0) || !b53.x(this.a, ((qk0) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("CheatDatabaseEntity(id=null, name=", this.a, ")");
    }
}
