package e2;

import a7.v;
import androidx.preference.Preference;
import java.util.List;
import l4.i0;
import l4.n0;
import l4.o0;
import l4.q;
import l4.r0;
import u1.l0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public l4.h f4162a;

    /* renamed from: b  reason: collision with root package name */
    public p4.d f4163b;

    /* renamed from: c  reason: collision with root package name */
    public int f4164c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4165d;

    /* renamed from: e  reason: collision with root package name */
    public int f4166e;

    /* renamed from: f  reason: collision with root package name */
    public int f4167f;

    /* renamed from: g  reason: collision with root package name */
    public List f4168g;

    /* renamed from: h  reason: collision with root package name */
    public b f4169h;

    /* renamed from: j  reason: collision with root package name */
    public x4.c f4171j;

    /* renamed from: k  reason: collision with root package name */
    public r0 f4172k;

    /* renamed from: l  reason: collision with root package name */
    public v f4173l;
    public x4.m m;

    /* renamed from: n  reason: collision with root package name */
    public o0 f4174n;

    /* renamed from: q  reason: collision with root package name */
    public long f4177q;

    /* renamed from: i  reason: collision with root package name */
    public long f4170i = a.f4150a;

    /* renamed from: o  reason: collision with root package name */
    public int f4175o = -1;

    /* renamed from: p  reason: collision with root package name */
    public int f4176p = -1;

    public d(l4.h hVar, r0 r0Var, p4.d dVar, int i2, boolean z10, int i10, int i11, List list) {
        this.f4162a = hVar;
        this.f4163b = dVar;
        this.f4164c = i2;
        this.f4165d = z10;
        this.f4166e = i10;
        this.f4167f = i11;
        this.f4168g = list;
        this.f4172k = r0Var;
    }

    public final int a(int i2, x4.m mVar) {
        int i10 = this.f4175o;
        int i11 = this.f4176p;
        if (i2 == i10 && i10 != -1) {
            return i11;
        }
        long a10 = x4.b.a(0, i2, 0, Preference.DEFAULT_ORDER);
        if (this.f4167f > 1) {
            b bVar = this.f4169h;
            r0 r0Var = this.f4172k;
            x4.c cVar = this.f4171j;
            cVar.getClass();
            b v10 = k0.d.v(bVar, mVar, r0Var, cVar, this.f4163b);
            this.f4169h = v10;
            a10 = v10.a(this.f4167f, a10);
        }
        int o5 = l0.o(b(a10, mVar).f8879e);
        int i12 = x4.a.i(a10);
        if (o5 < i12) {
            o5 = i12;
        }
        this.f4175o = i2;
        this.f4176p = o5;
        return o5;
    }

    public final q b(long j2, x4.m mVar) {
        int i2;
        v e6 = e(mVar);
        long N = ij.a.N(e6.c(), this.f4164c, j2, this.f4165d);
        boolean z10 = this.f4165d;
        int i10 = this.f4164c;
        int i11 = this.f4166e;
        if ((!z10 && (i10 == 2 || i10 == 4 || i10 == 5)) || i11 < 1) {
            i2 = 1;
        } else {
            i2 = i11;
        }
        return new q(e6, N, i2, i10);
    }

    public final boolean c(long j2, x4.m mVar) {
        this.f4177q = (this.f4177q << 2) | 3;
        if (this.f4167f > 1) {
            b bVar = this.f4169h;
            r0 r0Var = this.f4172k;
            x4.c cVar = this.f4171j;
            cVar.getClass();
            b v10 = k0.d.v(bVar, mVar, r0Var, cVar, this.f4163b);
            this.f4169h = v10;
            j2 = v10.a(this.f4167f, j2);
        }
        o0 o0Var = this.f4174n;
        if (o0Var != null) {
            q qVar = o0Var.f8866b;
            n0 n0Var = o0Var.f8865a;
            if (!qVar.f8875a.b()) {
                x4.m mVar2 = n0Var.f8860h;
                long j10 = n0Var.f8862j;
                if (mVar == mVar2 && (x4.a.b(j2, j10) || (x4.a.h(j2) == x4.a.h(j10) && x4.a.j(j2) == x4.a.j(j10) && x4.a.g(j2) >= qVar.f8879e && !qVar.f8877c))) {
                    o0 o0Var2 = this.f4174n;
                    o0Var2.getClass();
                    if (x4.a.b(j2, o0Var2.f8865a.f8862j)) {
                        return false;
                    }
                    o0 o0Var3 = this.f4174n;
                    o0Var3.getClass();
                    this.f4174n = f(mVar, j2, o0Var3.f8866b);
                    return true;
                }
            }
        }
        this.f4174n = f(mVar, j2, b(j2, mVar));
        return true;
    }

    public final void d(x4.c cVar) {
        long j2;
        x4.c cVar2 = this.f4171j;
        if (cVar != null) {
            int i2 = a.f4151b;
            j2 = a.a(cVar.b(), cVar.j());
        } else {
            j2 = a.f4150a;
        }
        if (cVar2 == null) {
            this.f4171j = cVar;
            this.f4170i = j2;
        } else if (cVar != null && this.f4170i == j2) {
        } else {
            this.f4171j = cVar;
            this.f4170i = j2;
            this.f4177q = (this.f4177q << 2) | 1;
            this.f4173l = null;
            this.f4174n = null;
            this.f4176p = -1;
            this.f4175o = -1;
        }
    }

    public final v e(x4.m mVar) {
        v vVar = this.f4173l;
        if (vVar == null || mVar != this.m || vVar.b()) {
            this.m = mVar;
            l4.h hVar = this.f4162a;
            r0 h2 = i0.h(this.f4172k, mVar);
            x4.c cVar = this.f4171j;
            cVar.getClass();
            p4.d dVar = this.f4163b;
            List list = this.f4168g;
            if (list == null) {
                list = zb.q.A;
            }
            vVar = new v(hVar, h2, list, cVar, dVar);
        }
        this.f4173l = vVar;
        return vVar;
    }

    public final o0 f(x4.m mVar, long j2, q qVar) {
        float min = Math.min(qVar.f8875a.c(), qVar.f8878d);
        l4.h hVar = this.f4162a;
        r0 r0Var = this.f4172k;
        List list = this.f4168g;
        if (list == null) {
            list = zb.q.A;
        }
        int i2 = this.f4166e;
        boolean z10 = this.f4165d;
        int i10 = this.f4164c;
        x4.c cVar = this.f4171j;
        cVar.getClass();
        return new o0(new n0(hVar, r0Var, list, i2, z10, i10, cVar, mVar, this.f4163b, j2), qVar, x4.b.d(j2, (l0.o(min) << 32) | (l0.o(qVar.f8879e) & 4294967295L)));
    }

    public final String toString() {
        String str;
        n0 n0Var;
        StringBuilder sb2 = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        Object obj = "null";
        if (this.f4174n == null) {
            str = "null";
        } else {
            str = "<TextLayoutResult>";
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f4170i));
        sb2.append(", history=");
        sb2.append(this.f4177q);
        sb2.append(", constraints=");
        o0 o0Var = this.f4174n;
        if (o0Var != null && (n0Var = o0Var.f8865a) != null) {
            obj = new x4.a(n0Var.f8862j);
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
