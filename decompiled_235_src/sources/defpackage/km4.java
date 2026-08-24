package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: km4  reason: default package */
/* loaded from: classes.dex */
public final class km4 {
    public final String a;

    public km4(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof km4) || !this.a.equals(((km4) obj).a)) {
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
        return lb1.q(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
