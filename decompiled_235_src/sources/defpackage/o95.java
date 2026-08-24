package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o95  reason: default package */
/* loaded from: classes.dex */
public final class o95 extends ca5 {
    public final o75 a;
    public final int b;
    public final int c;
    public final String d;

    public o95(o75 o75Var, int i, int i2, String str) {
        this.a = o75Var;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o95) {
                o95 o95Var = (o95) obj;
                if (!this.a.equals(o95Var.a) || this.b != o95Var.b || this.c != o95Var.c || !this.d.equals(o95Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + lb1.a(this.c, lb1.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AchievementProgressUpdated(achievement=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ")";
    }
}
