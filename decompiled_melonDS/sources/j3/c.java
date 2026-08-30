package j3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f7346a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7347b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7348c;

    public c(String str, int i2, long j2) {
        this.f7346a = str;
        this.f7347b = j2;
        this.f7348c = i2;
        if (str.length() != 0) {
            if (i2 >= -1 && i2 <= 63) {
                return;
            }
            a0.j.h("The id must be between -1 and 63");
            throw null;
        }
        a0.j.h("The name of a color space cannot be null and must contain at least 1 character");
        throw null;
    }

    public abstract float a(int i2);

    public abstract float b(int i2);

    public boolean c() {
        return false;
    }

    public abstract long d(float f8, float f10, float f11);

    public abstract float e(float f8, float f10, float f11);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f7348c == cVar.f7348c && this.f7346a.equals(cVar.f7346a)) {
                return b.a(this.f7347b, cVar.f7347b);
            }
            return false;
        }
        return false;
    }

    public abstract long f(float f8, float f10, float f11, float f12, c cVar);

    public int hashCode() {
        int i2 = b.f7345e;
        return w.d.f(this.f7347b, this.f7346a.hashCode() * 31, 31) + this.f7348c;
    }

    public final String toString() {
        return this.f7346a + " (id=" + this.f7348c + ", model=" + ((Object) b.b(this.f7347b)) + ')';
    }
}
