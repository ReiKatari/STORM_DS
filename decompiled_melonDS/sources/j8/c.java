package j8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final h8.b f7764a;

    /* renamed from: b  reason: collision with root package name */
    public final b f7765b;

    /* renamed from: c  reason: collision with root package name */
    public final b f7766c;

    public c(h8.b bVar, b bVar2, b bVar3) {
        this.f7764a = bVar;
        this.f7765b = bVar2;
        this.f7766c = bVar3;
        if (bVar.b() == 0 && bVar.a() == 0) {
            a0.j.h("Bounds must be non zero");
            throw null;
        } else if (bVar.f6320a != 0 && bVar.f6321b != 0) {
            a0.j.h("Bounding rectangle must start at the top or left window edge for folding features");
            throw null;
        }
    }

    public final b a() {
        h8.b bVar = this.f7764a;
        if (bVar.b() > bVar.a()) {
            return b.f7757g;
        }
        return b.f7756f;
    }

    public final boolean b() {
        b bVar = b.f7761k;
        b bVar2 = this.f7765b;
        if (!bVar2.equals(bVar)) {
            if (bVar2.equals(b.f7760j) && this.f7766c.equals(b.f7759i)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (c.class.equals(cls)) {
                obj.getClass();
                c cVar = (c) obj;
                if (!this.f7764a.equals(cVar.f7764a) || !this.f7765b.equals(cVar.f7765b) || !this.f7766c.equals(cVar.f7766c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f7765b.hashCode();
        return this.f7766c.hashCode() + ((hashCode + (this.f7764a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return c.class.getSimpleName() + " { " + this.f7764a + ", type=" + this.f7765b + ", state=" + this.f7766c + " }";
    }
}
