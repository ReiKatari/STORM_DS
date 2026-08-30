package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tx2  reason: default package */
/* loaded from: classes.dex */
public final class tx2 extends ux2 {
    public final String a;

    public tx2(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tx2) && b53.x(this.a, ((tx2) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("ImportSuccess(fileName=", this.a, ")");
    }
}
