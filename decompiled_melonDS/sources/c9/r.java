package c9;

import a4.j1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final k f2751a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.d f2752b;

    /* renamed from: c  reason: collision with root package name */
    public final y3.o f2753c;

    public r(k kVar, b3.d dVar, y3.o oVar) {
        this.f2751a = kVar;
        this.f2752b = dVar;
        this.f2753c = oVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c9.s, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f2754i0 = this.f2751a;
        oVar.f2755j0 = this.f2752b;
        oVar.f2756k0 = this.f2753c;
        oVar.f2757l0 = 1.0f;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!this.f2751a.equals(rVar.f2751a) || !nc.k.a(this.f2752b, rVar.f2752b) || !nc.k.a(this.f2753c, rVar.f2753c) || Float.compare(1.0f, 1.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        s sVar = (s) oVar;
        long h2 = sVar.f2754i0.h();
        k kVar = this.f2751a;
        boolean b10 = h3.e.b(h2, kVar.h());
        sVar.f2754i0 = kVar;
        sVar.f2755j0 = this.f2752b;
        sVar.f2756k0 = this.f2753c;
        sVar.f2757l0 = 1.0f;
        if (!b10) {
            a4.l.k(sVar);
        }
        a4.l.j(sVar);
    }

    public final int hashCode() {
        int hashCode = this.f2752b.hashCode();
        return w.d.b(1.0f, (this.f2753c.hashCode() + ((hashCode + (this.f2751a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "ContentPainterElement(painter=" + this.f2751a + ", alignment=" + this.f2752b + ", contentScale=" + this.f2753c + ", alpha=1.0, colorFilter=null)";
    }
}
