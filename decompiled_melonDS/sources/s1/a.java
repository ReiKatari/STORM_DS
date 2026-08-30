package s1;

import a4.j1;
import a4.l;
import b3.o;
import f1.a1;
import j1.i;
import nc.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12804a;

    /* renamed from: b  reason: collision with root package name */
    public final i f12805b;

    /* renamed from: c  reason: collision with root package name */
    public final a1 f12806c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12807d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f12808e;

    /* renamed from: f  reason: collision with root package name */
    public final i4.i f12809f;

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f12810g;

    public a(boolean z10, i iVar, a1 a1Var, boolean z11, boolean z12, i4.i iVar2, mc.a aVar) {
        this.f12804a = z10;
        this.f12805b = iVar;
        this.f12806c = a1Var;
        this.f12807d = z11;
        this.f12808e = z12;
        this.f12809f = iVar2;
        this.f12810g = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s1.d, f1.g, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? gVar = new f1.g(this.f12805b, this.f12806c, this.f12807d, this.f12808e, null, this.f12809f, this.f12810g);
        gVar.H0 = this.f12804a;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f12804a != aVar.f12804a || !k.a(this.f12805b, aVar.f12805b) || !k.a(this.f12806c, aVar.f12806c) || this.f12807d != aVar.f12807d || this.f12808e != aVar.f12808e || !k.a(this.f12809f, aVar.f12809f) || this.f12810g != aVar.f12810g) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        d dVar = (d) oVar;
        boolean z10 = dVar.H0;
        boolean z11 = this.f12804a;
        if (z10 != z11) {
            dVar.H0 = z11;
            l.l(dVar);
        }
        dVar.c1(this.f12805b, this.f12806c, this.f12807d, this.f12808e, null, this.f12809f, this.f12810g);
    }

    public final int hashCode() {
        int i2;
        int i10;
        int hashCode = Boolean.hashCode(this.f12804a) * 31;
        int i11 = 0;
        i iVar = this.f12805b;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (hashCode + i2) * 31;
        a1 a1Var = this.f12806c;
        if (a1Var != null) {
            i10 = a1Var.hashCode();
        } else {
            i10 = 0;
        }
        int e6 = w.d.e(w.d.e((i12 + i10) * 31, this.f12807d, 31), this.f12808e, 31);
        i4.i iVar2 = this.f12809f;
        if (iVar2 != null) {
            i11 = Integer.hashCode(iVar2.f6722a);
        }
        return this.f12810g.hashCode() + ((e6 + i11) * 31);
    }
}
