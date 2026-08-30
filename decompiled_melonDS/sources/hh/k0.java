package hh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f6538a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6539b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6540c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6541d;

    public k0(oi.b bVar, int i2, int i10, String str) {
        this.f6538a = bVar;
        this.f6539b = i2;
        this.f6540c = i10;
        this.f6541d = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k0) {
                k0 k0Var = (k0) obj;
                if (!this.f6538a.equals(k0Var.f6538a) || this.f6539b != k0Var.f6539b || this.f6540c != k0Var.f6540c || !this.f6541d.equals(k0Var.f6541d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6541d.hashCode() + w.d.c(this.f6540c, w.d.c(this.f6539b, this.f6538a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AchievementProgressUpdated(achievement=" + this.f6538a + ", current=" + this.f6539b + ", target=" + this.f6540c + ", progress=" + this.f6541d + ")";
    }
}
