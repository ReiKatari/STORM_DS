package e2;

import a4.j1;
import b3.o;
import i3.t;
import java.util.List;
import l4.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final l4.h f4196a;

    /* renamed from: b  reason: collision with root package name */
    public final r0 f4197b;

    /* renamed from: c  reason: collision with root package name */
    public final p4.d f4198c;

    /* renamed from: d  reason: collision with root package name */
    public final mc.l f4199d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4200e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f4201f;

    /* renamed from: g  reason: collision with root package name */
    public final int f4202g;

    /* renamed from: h  reason: collision with root package name */
    public final int f4203h;

    /* renamed from: i  reason: collision with root package name */
    public final List f4204i;

    /* renamed from: j  reason: collision with root package name */
    public final mc.l f4205j;

    /* renamed from: k  reason: collision with root package name */
    public final t f4206k;

    /* renamed from: l  reason: collision with root package name */
    public final mc.l f4207l;

    public f(l4.h hVar, r0 r0Var, p4.d dVar, mc.l lVar, int i2, boolean z10, int i10, int i11, List list, mc.l lVar2, t tVar, mc.l lVar3) {
        this.f4196a = hVar;
        this.f4197b = r0Var;
        this.f4198c = dVar;
        this.f4199d = lVar;
        this.f4200e = i2;
        this.f4201f = z10;
        this.f4202g = i10;
        this.f4203h = i11;
        this.f4204i = list;
        this.f4205j = lVar2;
        this.f4206k = tVar;
        this.f4207l = lVar3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [e2.i, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? oVar = new o();
        oVar.f4212i0 = this.f4196a;
        oVar.f4213j0 = this.f4197b;
        oVar.f4214k0 = this.f4198c;
        oVar.f4215l0 = this.f4199d;
        oVar.f4216m0 = this.f4200e;
        oVar.f4217n0 = this.f4201f;
        oVar.f4218o0 = this.f4202g;
        oVar.p0 = this.f4203h;
        oVar.f4219q0 = this.f4204i;
        oVar.f4220r0 = this.f4205j;
        oVar.f4221s0 = this.f4206k;
        oVar.f4222t0 = this.f4207l;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (nc.k.a(this.f4206k, fVar.f4206k) && nc.k.a(this.f4196a, fVar.f4196a) && nc.k.a(this.f4197b, fVar.f4197b) && nc.k.a(this.f4204i, fVar.f4204i) && nc.k.a(this.f4198c, fVar.f4198c) && this.f4199d == fVar.f4199d && this.f4207l == fVar.f4207l && this.f4200e == fVar.f4200e && this.f4201f == fVar.f4201f && this.f4202g == fVar.f4202g && this.f4203h == fVar.f4203h && this.f4205j == fVar.f4205j) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r3.f8887a.b(r2.f8887a) != false) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    @Override // a4.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(b3.o r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.f.g(b3.o):void");
    }

    public final int hashCode() {
        int i2;
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f4198c.hashCode() + ((this.f4197b.hashCode() + (this.f4196a.hashCode() * 31)) * 31)) * 31;
        int i13 = 0;
        mc.l lVar = this.f4199d;
        if (lVar != null) {
            i2 = lVar.hashCode();
        } else {
            i2 = 0;
        }
        int e6 = (((w.d.e(w.d.c(this.f4200e, (hashCode + i2) * 31, 31), this.f4201f, 31) + this.f4202g) * 31) + this.f4203h) * 31;
        List list = this.f4204i;
        if (list != null) {
            i10 = list.hashCode();
        } else {
            i10 = 0;
        }
        int i14 = (e6 + i10) * 31;
        mc.l lVar2 = this.f4205j;
        if (lVar2 != null) {
            i11 = lVar2.hashCode();
        } else {
            i11 = 0;
        }
        int i15 = (i14 + i11) * 961;
        t tVar = this.f4206k;
        if (tVar != null) {
            i12 = tVar.hashCode();
        } else {
            i12 = 0;
        }
        int i16 = (i15 + i12) * 31;
        mc.l lVar3 = this.f4207l;
        if (lVar3 != null) {
            i13 = lVar3.hashCode();
        }
        return i16 + i13;
    }
}
