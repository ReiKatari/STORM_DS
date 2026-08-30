package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rx2  reason: default package */
/* loaded from: classes.dex */
public final class rx2 extends ux2 {
    public final String a;

    public rx2(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rx2) && b53.x(this.a, ((rx2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("ExportSuccess(fileName=", this.a, ")");
    }
}
