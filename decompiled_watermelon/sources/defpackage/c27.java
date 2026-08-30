package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c27  reason: default package */
/* loaded from: classes.dex */
public final class c27 implements Comparable {
    public final short A;

    public /* synthetic */ c27(short s) {
        this.A = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return b53.E(this.A & 65535, ((c27) obj).A & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c27) {
            if (this.A != ((c27) obj).A) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.A);
    }

    public final String toString() {
        return String.valueOf(this.A & 65535);
    }
}
