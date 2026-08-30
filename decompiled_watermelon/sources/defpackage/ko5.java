package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ko5  reason: default package */
/* loaded from: classes.dex */
public final class ko5 implements mo5 {
    public final String a;

    public ko5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ko5) && b53.x(this.a, ((ko5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("Directory(docId=", this.a, ")");
    }
}
