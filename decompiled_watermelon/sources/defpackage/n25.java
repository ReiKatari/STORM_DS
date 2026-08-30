package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n25  reason: default package */
/* loaded from: classes.dex */
public final class n25 {
    public final int a;
    public final Integer b;
    public final Integer c;

    public n25(int i, Integer num, Integer num2) {
        this.a = i;
        this.b = num;
        this.c = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n25)) {
            return false;
        }
        n25 n25Var = (n25) obj;
        if (this.a == n25Var.a && b53.x(this.b, n25Var.b) && b53.x(this.c, n25Var.c)) {
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
