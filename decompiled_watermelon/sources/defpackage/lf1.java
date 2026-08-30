package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf1  reason: default package */
/* loaded from: classes.dex */
public final class lf1 extends ct3 {
    public final int o0;

    public lf1(int i) {
        this.o0 = i;
        if (i > 0) {
            return;
        }
        i.i("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lf1) {
            if (this.o0 == ((lf1) obj).o0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.o0;
    }

    public final String toString() {
        return String.valueOf(this.o0);
    }
}
