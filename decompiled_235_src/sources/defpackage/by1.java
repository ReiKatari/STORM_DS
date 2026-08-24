package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by1  reason: default package */
/* loaded from: classes.dex */
public final class by1 extends hy1 {
    public final String a;

    public by1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof by1) || !this.a.equals(((by1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lb1.A("RomNotFoundError(romPath=", this.a, ")");
    }
}
