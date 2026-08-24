package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj1  reason: default package */
/* loaded from: classes.dex */
public final class pj1 extends ge7 {
    public final int m;

    public pj1(int i) {
        this.m = i;
        if (i > 0) {
            return;
        }
        i.h("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pj1) {
            if (this.m == ((pj1) obj).m) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.m;
    }

    public final String toString() {
        return String.valueOf(this.m);
    }
}
