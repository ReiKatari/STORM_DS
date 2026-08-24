package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz5  reason: default package */
/* loaded from: classes.dex */
public final class kz5 {
    public final pq5 a;
    public final String b;
    public final String c;

    public kz5(pq5 pq5Var, String str, String str2) {
        this.a = pq5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof kz5) {
                kz5 kz5Var = (kz5) obj;
                if (!this.a.equals(kz5Var.a) || !nb3.k(this.b, kz5Var.b) || !this.c.equals(kz5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return this.c.hashCode() + ((hashCode2 + hashCode) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RomWithParent(rom=");
        sb.append(this.a);
        sb.append(", parentDocId=");
        sb.append(this.b);
        sb.append(", searchKey=");
        return i61.n(sb, this.c, ")");
    }
}
