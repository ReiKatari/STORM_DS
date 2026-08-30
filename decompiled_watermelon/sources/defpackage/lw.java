package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lw  reason: default package */
/* loaded from: classes.dex */
public final class lw {
    public final int a;

    public /* synthetic */ lw(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lw) {
            if (this.a != ((lw) obj).a) {
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
        return ej6.e("AutoClearFocusBehavior(value=", this.a, ')');
    }
}
