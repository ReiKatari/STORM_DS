package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bx5  reason: default package */
/* loaded from: classes.dex */
public final class bx5 {
    public final ax5 a;
    public final String b;
    public final String c;

    public bx5(ax5 ax5Var, String str, String str2) {
        ax5Var.getClass();
        this.a = ax5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bx5)) {
            return false;
        }
        bx5 bx5Var = (bx5) obj;
        if (this.a == bx5Var.a && nb3.k(this.b, bx5Var.b) && nb3.k(this.c, bx5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RomGbaSlotConfigUiModel(type=");
        sb.append(this.a);
        sb.append(", gbaRomPath=");
        sb.append(this.b);
        sb.append(", gbaSavePath=");
        return i61.n(sb, this.c, ")");
    }
}
