package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nj5  reason: default package */
/* loaded from: classes.dex */
public final class nj5 extends dk5 {
    public final String a;

    public nj5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nj5) && b53.x(this.a, ((nj5) obj).a)) {
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
        return wh1.A("CustomNameUpdate(customName=", this.a, ")");
    }
}
