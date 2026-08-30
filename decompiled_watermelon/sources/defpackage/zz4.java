package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zz4  reason: default package */
/* loaded from: classes.dex */
public final class zz4 extends b05 {
    public final String a;
    public final long b;
    public final int c;
    public final String d;

    public zz4(int i, long j, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zz4) {
                zz4 zz4Var = (zz4) obj;
                if (!this.a.equals(zz4Var.a) || this.b != zz4Var.b || this.c != zz4Var.c || !this.d.equals(zz4Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + wh1.a(this.c, b31.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "OnServerError(api=" + this.a + ", relatedId=" + this.b + ", resultCode=" + this.c + ", message=" + this.d + ")";
    }
}
