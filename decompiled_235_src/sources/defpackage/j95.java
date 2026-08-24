package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j95  reason: default package */
/* loaded from: classes.dex */
public final class j95 extends l95 {
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public j95(int i, long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j95) {
                j95 j95Var = (j95) obj;
                if (!this.a.equals(j95Var.a) || this.b != j95Var.b || this.c != j95Var.c || !this.d.equals(j95Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + lb1.a(this.c, i61.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OnServerError(api=" + this.a + ", relatedId=" + this.b + ", resultCode=" + this.c + ", message=" + this.d + ")";
    }
}
