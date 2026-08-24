package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ib5  reason: default package */
/* loaded from: classes.dex */
public final class ib5 extends jb5 {
    public final String a;

    public ib5(String str) {
        this.a = str;
    }

    @Override // defpackage.jb5
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ib5) || !this.a.equals(((ib5) obj).a)) {
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
        return lb1.A("AuthenticationExpired(username=", this.a, ")");
    }
}
