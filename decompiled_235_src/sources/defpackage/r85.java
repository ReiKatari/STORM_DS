package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r85  reason: default package */
/* loaded from: classes.dex */
public final class r85 extends l95 {
    public final long a;
    public final int b;
    public final int c;
    public final String d;

    public r85(int i, int i2, long j, String str) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r85) {
                r85 r85Var = (r85) obj;
                if (this.a != r85Var.a || this.b != r85Var.b || this.c != r85Var.c || !this.d.equals(r85Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + lb1.a(this.c, lb1.a(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "OnAchievementProgressUpdated(achievementId=" + this.a + ", current=" + this.b + ", target=" + this.c + ", progress=" + this.d + ")";
    }
}
