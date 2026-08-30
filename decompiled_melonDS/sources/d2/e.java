package d2;

import a4.j1;
import f2.b1;
import g3.z;
import l4.q0;
import q4.e0;
import q4.x;
import u1.p0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final e0 f3723a;

    /* renamed from: b  reason: collision with root package name */
    public final x f3724b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f3725c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3726d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f3727e;

    /* renamed from: f  reason: collision with root package name */
    public final q4.q f3728f;

    /* renamed from: g  reason: collision with root package name */
    public final b1 f3729g;

    /* renamed from: h  reason: collision with root package name */
    public final q4.j f3730h;

    /* renamed from: i  reason: collision with root package name */
    public final z f3731i;

    public e(e0 e0Var, x xVar, p0 p0Var, boolean z10, boolean z11, q4.q qVar, b1 b1Var, q4.j jVar, z zVar) {
        this.f3723a = e0Var;
        this.f3724b = xVar;
        this.f3725c = p0Var;
        this.f3726d = z10;
        this.f3727e = z11;
        this.f3728f = qVar;
        this.f3729g = b1Var;
        this.f3730h = jVar;
        this.f3731i = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [d2.h, a4.k, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? kVar = new a4.k();
        kVar.f3732k0 = this.f3723a;
        kVar.f3733l0 = this.f3724b;
        kVar.f3734m0 = this.f3725c;
        kVar.f3735n0 = this.f3726d;
        kVar.f3736o0 = this.f3727e;
        kVar.p0 = this.f3728f;
        b1 b1Var = this.f3729g;
        kVar.f3737q0 = b1Var;
        kVar.f3738r0 = this.f3730h;
        kVar.f3739s0 = this.f3731i;
        b1Var.f4712g = new f(kVar, 4);
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (!this.f3723a.equals(eVar.f3723a) || !nc.k.a(this.f3724b, eVar.f3724b) || !this.f3725c.equals(eVar.f3725c) || this.f3726d != eVar.f3726d || this.f3727e != eVar.f3727e || !nc.k.a(this.f3728f, eVar.f3728f) || !this.f3729g.equals(eVar.f3729g) || !nc.k.a(this.f3730h, eVar.f3730h) || !nc.k.a(this.f3731i, eVar.f3731i)) {
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
        h hVar = (h) oVar;
        boolean z10 = hVar.f3735n0;
        boolean z11 = hVar.f3736o0;
        q4.j jVar = hVar.f3738r0;
        b1 b1Var = hVar.f3737q0;
        hVar.f3732k0 = this.f3723a;
        x xVar = this.f3724b;
        hVar.f3733l0 = xVar;
        hVar.f3734m0 = this.f3725c;
        boolean z12 = this.f3726d;
        hVar.f3735n0 = z12;
        hVar.p0 = this.f3728f;
        b1 b1Var2 = this.f3729g;
        hVar.f3737q0 = b1Var2;
        q4.j jVar2 = this.f3730h;
        hVar.f3738r0 = jVar2;
        hVar.f3739s0 = this.f3731i;
        if (z12 != z10 || z12 != z10 || !nc.k.a(jVar2, jVar) || this.f3727e != z11 || !q0.c(xVar.f12277b)) {
            a4.l.l(hVar);
        }
        if (!b1Var2.equals(b1Var)) {
            b1Var2.f4712g = new f(hVar, 0);
        }
    }

    public final int hashCode() {
        int hashCode = this.f3724b.hashCode();
        int e6 = w.d.e(w.d.e(w.d.e((this.f3725c.hashCode() + ((hashCode + (this.f3723a.hashCode() * 31)) * 31)) * 31, false, 31), this.f3726d, 31), this.f3727e, 31);
        int hashCode2 = this.f3729g.hashCode();
        int hashCode3 = this.f3730h.hashCode();
        return this.f3731i.hashCode() + ((hashCode3 + ((hashCode2 + ((this.f3728f.hashCode() + e6) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.f3723a + ", value=" + this.f3724b + ", state=" + this.f3725c + ", readOnly=false, enabled=" + this.f3726d + ", isPassword=" + this.f3727e + ", offsetMapping=" + this.f3728f + ", manager=" + this.f3729g + ", imeOptions=" + this.f3730h + ", focusRequester=" + this.f3731i + ')';
    }
}
