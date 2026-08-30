package f3;

import a4.j1;
import y3.o;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final n3.b f4826a;

    /* renamed from: b  reason: collision with root package name */
    public final b3.d f4827b;

    /* renamed from: c  reason: collision with root package name */
    public final o f4828c;

    /* renamed from: d  reason: collision with root package name */
    public final float f4829d;

    /* renamed from: e  reason: collision with root package name */
    public final i3.l f4830e;

    public l(n3.b bVar, b3.d dVar, o oVar, float f8, i3.l lVar) {
        this.f4826a = bVar;
        this.f4827b = dVar;
        this.f4828c = oVar;
        this.f4829d = f8;
        this.f4830e = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [f3.m, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f4831i0 = this.f4826a;
        oVar.f4832j0 = true;
        oVar.f4833k0 = this.f4827b;
        oVar.f4834l0 = this.f4828c;
        oVar.f4835m0 = this.f4829d;
        oVar.f4836n0 = this.f4830e;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (!nc.k.a(this.f4826a, lVar.f4826a) || !nc.k.a(this.f4827b, lVar.f4827b) || !nc.k.a(this.f4828c, lVar.f4828c) || Float.compare(this.f4829d, lVar.f4829d) != 0 || !nc.k.a(this.f4830e, lVar.f4830e)) {
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
        boolean z10;
        m mVar = (m) oVar;
        boolean z11 = mVar.f4832j0;
        n3.b bVar = this.f4826a;
        if (z11 && h3.e.b(mVar.f4831i0.h(), bVar.h())) {
            z10 = false;
        } else {
            z10 = true;
        }
        mVar.f4831i0 = bVar;
        mVar.f4832j0 = true;
        mVar.f4833k0 = this.f4827b;
        mVar.f4834l0 = this.f4828c;
        mVar.f4835m0 = this.f4829d;
        mVar.f4836n0 = this.f4830e;
        if (z10) {
            a4.l.k(mVar);
        }
        a4.l.j(mVar);
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e(this.f4826a.hashCode() * 31, true, 31);
        int hashCode2 = this.f4828c.hashCode();
        int b10 = w.d.b(this.f4829d, (hashCode2 + ((this.f4827b.hashCode() + e6) * 31)) * 31, 31);
        i3.l lVar = this.f4830e;
        if (lVar == null) {
            hashCode = 0;
        } else {
            hashCode = lVar.hashCode();
        }
        return b10 + hashCode;
    }

    public final String toString() {
        return "PainterElement(painter=" + this.f4826a + ", sizeToIntrinsics=true, alignment=" + this.f4827b + ", contentScale=" + this.f4828c + ", alpha=" + this.f4829d + ", colorFilter=" + this.f4830e + ')';
    }
}
