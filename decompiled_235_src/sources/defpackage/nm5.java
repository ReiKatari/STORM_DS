package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm5  reason: default package */
/* loaded from: classes.dex */
public final class nm5 extends qm5 {
    public final String a;

    public nm5(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof nm5) && nb3.k(this.a, ((nm5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lb1.A("LoggedIn(accountName=", this.a, ")");
    }
}
