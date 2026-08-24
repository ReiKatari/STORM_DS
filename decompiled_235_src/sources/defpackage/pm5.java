package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm5  reason: default package */
/* loaded from: classes.dex */
public final class pm5 extends qm5 {
    public final String a;

    public pm5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pm5) || !this.a.equals(((pm5) obj).a)) {
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
        return lb1.A("LoginExpired(existingUsername=", this.a, ")");
    }
}
