package mh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    public final oi.b f9668a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9669b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9670c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9671d;

    /* renamed from: e  reason: collision with root package name */
    public final a4.n f9672e;

    public b(oi.b bVar, int i2, int i10, String str, a4.n nVar) {
        this.f9668a = bVar;
        this.f9669b = i2;
        this.f9670c = i10;
        this.f9671d = str;
        this.f9672e = nVar;
    }

    @Override // mh.h
    public final a4.n a() {
        return this.f9672e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f9668a.equals(bVar.f9668a) || this.f9669b != bVar.f9669b || this.f9670c != bVar.f9670c || !this.f9671d.equals(bVar.f9671d) || !this.f9672e.equals(bVar.f9672e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9672e.hashCode() + w.d.d(w.d.c(this.f9670c, w.d.c(this.f9669b, this.f9668a.hashCode() * 31, 31), 31), 31, this.f9671d);
    }

    public final String toString() {
        return "AchievementProgress(achievement=" + this.f9668a + ", current=" + this.f9669b + ", target=" + this.f9670c + ", progress=" + this.f9671d + ", state=" + this.f9672e + ")";
    }
}
