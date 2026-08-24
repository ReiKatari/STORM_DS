package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x33  reason: default package */
/* loaded from: classes.dex */
public final class x33 extends y33 {
    public final String a;

    public x33(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof x33) && nb3.k(this.a, ((x33) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lb1.A("ImportSuccess(fileName=", this.a, ")");
    }
}
