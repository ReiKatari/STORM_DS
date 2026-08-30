package f1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final j1.i f4660a;

    /* renamed from: b  reason: collision with root package name */
    public final a1 f4661b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4662c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4663d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4664e;

    /* renamed from: f  reason: collision with root package name */
    public final i4.i f4665f;

    /* renamed from: g  reason: collision with root package name */
    public final mc.a f4666g;

    public w(j1.i iVar, a1 a1Var, boolean z10, boolean z11, String str, i4.i iVar2, mc.a aVar) {
        this.f4660a = iVar;
        this.f4661b = a1Var;
        this.f4662c = z10;
        this.f4663d = z11;
        this.f4664e = str;
        this.f4665f = iVar2;
        this.f4666g = aVar;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new g(this.f4660a, this.f4661b, this.f4662c, this.f4663d, this.f4664e, this.f4665f, this.f4666g);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w.class == obj.getClass()) {
                w wVar = (w) obj;
                if (!nc.k.a(this.f4660a, wVar.f4660a) || !nc.k.a(this.f4661b, wVar.f4661b) || this.f4662c != wVar.f4662c || this.f4663d != wVar.f4663d || !nc.k.a(this.f4664e, wVar.f4664e) || !nc.k.a(this.f4665f, wVar.f4665f) || this.f4666g != wVar.f4666g) {
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
        ((y) oVar).c1(this.f4660a, this.f4661b, this.f4662c, this.f4663d, this.f4664e, this.f4665f, this.f4666g);
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12 = 0;
        j1.i iVar = this.f4660a;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int i13 = i2 * 31;
        a1 a1Var = this.f4661b;
        if (a1Var != null) {
            i10 = a1Var.hashCode();
        } else {
            i10 = 0;
        }
        int e6 = w.d.e(w.d.e((i13 + i10) * 31, this.f4662c, 31), this.f4663d, 31);
        String str = this.f4664e;
        if (str != null) {
            i11 = str.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = (e6 + i11) * 31;
        i4.i iVar2 = this.f4665f;
        if (iVar2 != null) {
            i12 = Integer.hashCode(iVar2.f6722a);
        }
        return this.f4666g.hashCode() + ((i14 + i12) * 31);
    }
}
