package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y15  reason: default package */
/* loaded from: classes.dex */
public final class y15 extends z15 {
    public final String a;

    public y15(String str) {
        this.a = str;
    }

    @Override // defpackage.z15
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof y15) || !this.a.equals(((y15) obj).a)) {
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
        return wh1.A("AuthenticationExpired(username=", this.a, ")");
    }
}
