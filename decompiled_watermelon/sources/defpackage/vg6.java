package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vg6  reason: default package */
/* loaded from: classes.dex */
public final class vg6 implements po {
    public final String a;

    public /* synthetic */ vg6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vg6) {
            if (!this.a.equals(((vg6) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b31.n(')', "StringAnnotation(value=", this.a);
    }
}
