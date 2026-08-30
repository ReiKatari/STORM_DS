package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg4  reason: default package */
/* loaded from: classes.dex */
public final class dg4 {
    public final int a;

    public /* synthetic */ dg4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dg4) {
            if (this.a != ((dg4) obj).a) {
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
        return wh1.g(this.a, "Output-");
    }
}
