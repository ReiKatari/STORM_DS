package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: po5  reason: default package */
/* loaded from: classes.dex */
public final class po5 {
    public final rg5 a;
    public final String b;
    public final String c;

    public po5(rg5 rg5Var, String str, String str2) {
        this.a = rg5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof po5) {
                po5 po5Var = (po5) obj;
                if (!this.a.equals(po5Var.a) || !b53.x(this.b, po5Var.b) || !this.c.equals(po5Var.c)) {
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
        return b31.q(sb, this.c, ")");
    }
}
