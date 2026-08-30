package q4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: g  reason: collision with root package name */
    public static final j f12249g = new j(false, 0, true, 1, 1, s4.b.L);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12250a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12251b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f12252c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12253d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12254e;

    /* renamed from: f  reason: collision with root package name */
    public final s4.b f12255f;

    public j(boolean z10, int i2, boolean z11, int i10, int i11, s4.b bVar) {
        this.f12250a = z10;
        this.f12251b = i2;
        this.f12252c = z11;
        this.f12253d = i10;
        this.f12254e = i11;
        this.f12255f = bVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j) {
                j jVar = (j) obj;
                if (this.f12250a == jVar.f12250a && this.f12251b == jVar.f12251b && this.f12252c == jVar.f12252c && this.f12253d == jVar.f12253d && this.f12254e == jVar.f12254e && nc.k.a(this.f12255f, jVar.f12255f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f12255f.A.hashCode() + w.d.c(this.f12254e, w.d.c(this.f12253d, w.d.e(w.d.c(this.f12251b, Boolean.hashCode(this.f12250a) * 31, 31), this.f12252c, 31), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.f12250a + ", capitalization=" + ((Object) k.a(this.f12251b)) + ", autoCorrect=" + this.f12252c + ", keyboardType=" + ((Object) l.a(this.f12253d)) + ", imeAction=" + ((Object) i.a(this.f12254e)) + ", platformImeOptions=null, hintLocales=" + this.f12255f + ')';
    }
}
