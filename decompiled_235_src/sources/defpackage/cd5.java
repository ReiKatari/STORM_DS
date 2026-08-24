package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd5  reason: default package */
/* loaded from: classes.dex */
public final class cd5 {
    public final boolean a;
    public final int b;
    public final String c;

    public cd5(String str, int i, boolean z) {
        this.a = z;
        this.b = i;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd5)) {
            return false;
        }
        cd5 cd5Var = (cd5) obj;
        if (this.a == cd5Var.a && this.b == cd5Var.b && nb3.k(this.c, cd5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = lb1.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RaPendingSyncMenuState(isVisible=");
        sb.append(this.a);
        sb.append(", pendingCount=");
        sb.append(this.b);
        sb.append(", label=");
        return i61.n(sb, this.c, ")");
    }
}
