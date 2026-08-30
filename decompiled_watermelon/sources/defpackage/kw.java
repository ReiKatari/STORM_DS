package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kw  reason: default package */
/* loaded from: classes.dex */
public final class kw {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof kw) {
            if (this.a != ((kw) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ej6.e("AudioRestrictionMode(value=", this.a, ')');
    }
}
