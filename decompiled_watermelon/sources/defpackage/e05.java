package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e05  reason: default package */
/* loaded from: classes.dex */
public final class e05 extends s05 {
    public final dy4 a;
    public final int b;
    public final int c;
    public final String d;

    public e05(dy4 dy4Var, int i, int i2, String str) {
        this.a = dy4Var;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e05) {
                e05 e05Var = (e05) obj;
                if (!this.a.equals(e05Var.a) || this.b != e05Var.b || this.c != e05Var.c || !this.d.equals(e05Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + wh1.a(this.c, wh1.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AchievementProgressUpdated(achievement=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ")";
    }
}
