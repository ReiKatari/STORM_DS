package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b47  reason: default package */
/* loaded from: classes.dex */
public final class b47 implements po {
    public final String a;

    public b47(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b47) {
                if (!this.a.equals(((b47) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.o(new StringBuilder("UrlAnnotation(url="), this.a, ')');
    }
}
