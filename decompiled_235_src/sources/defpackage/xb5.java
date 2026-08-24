package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb5  reason: default package */
/* loaded from: classes.dex */
public final class xb5 {
    public final int a;
    public final Integer b;
    public final Integer c;

    public xb5(int i, Integer num, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb5)) {
            return false;
        }
        xb5 xb5Var = (xb5) obj;
        if (this.a == xb5Var.a && nb3.k(this.b, xb5Var.b) && nb3.k(this.c, xb5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "RaInGameLogoutDiscardSummary(expectedNativeSubmissions=" + this.a + ", confirmedNativeSubmissions=" + this.b + ", confirmedKotlinAchievements=" + this.c + ")";
    }
}
