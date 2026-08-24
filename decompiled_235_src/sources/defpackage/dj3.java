package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dj3  reason: default package */
/* loaded from: classes.dex */
public final class dj3 extends yh2 {
    public final String d;

    public dj3(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof dj3) || !this.d.equals(((dj3) obj).d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return lb1.A("RomPath(path=", this.d, ")");
    }
}
