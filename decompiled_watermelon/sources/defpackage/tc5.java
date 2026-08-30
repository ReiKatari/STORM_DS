package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tc5  reason: default package */
/* loaded from: classes.dex */
public final class tc5 extends wc5 {
    public final String a;

    public tc5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tc5) && b53.x(this.a, ((tc5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("LoggedIn(accountName=", this.a, ")");
    }
}
