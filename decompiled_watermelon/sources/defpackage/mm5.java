package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mm5  reason: default package */
/* loaded from: classes.dex */
public final class mm5 {
    public final lm5 a;
    public final String b;
    public final String c;

    public mm5(lm5 lm5Var, String str, String str2) {
        lm5Var.getClass();
        this.a = lm5Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm5)) {
            return false;
        }
        mm5 mm5Var = (mm5) obj;
        if (this.a == mm5Var.a && b53.x(this.b, mm5Var.b) && b53.x(this.c, mm5Var.c)) {
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
        return b31.q(sb, this.c, ")");
    }
}
