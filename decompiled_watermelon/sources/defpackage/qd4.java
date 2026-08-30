package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qd4  reason: default package */
/* loaded from: classes.dex */
public final class qd4 {
    public final String a;

    public qd4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof qd4) && b53.x(this.a, ((qd4) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wh1.A("OpenScreenEvent(newTitle=", this.a, ")");
    }
}
