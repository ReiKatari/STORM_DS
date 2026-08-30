package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v77  reason: default package */
/* loaded from: classes.dex */
public final class v77 implements po {
    public final String a;

    public v77(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof v77) {
                if (!this.a.equals(((v77) obj).a)) {
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
        return wh1.o(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.a, ')');
    }
}
