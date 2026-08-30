package e2;

import androidx.preference.Preference;
import l4.i0;
import l4.r0;
import l4.u;
import u1.l0;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f4178a;

    /* renamed from: b  reason: collision with root package name */
    public r0 f4179b;

    /* renamed from: c  reason: collision with root package name */
    public p4.d f4180c;

    /* renamed from: d  reason: collision with root package name */
    public int f4181d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4182e;

    /* renamed from: f  reason: collision with root package name */
    public int f4183f;

    /* renamed from: g  reason: collision with root package name */
    public int f4184g;

    /* renamed from: i  reason: collision with root package name */
    public x4.c f4186i;

    /* renamed from: j  reason: collision with root package name */
    public l4.b f4187j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4188k;

    /* renamed from: l  reason: collision with root package name */
    public long f4189l;
    public b m;

    /* renamed from: n  reason: collision with root package name */
    public u f4190n;

    /* renamed from: o  reason: collision with root package name */
    public x4.m f4191o;

    /* renamed from: s  reason: collision with root package name */
    public long f4195s;

    /* renamed from: h  reason: collision with root package name */
    public long f4185h = a.f4150a;

    /* renamed from: p  reason: collision with root package name */
    public long f4192p = x4.b.h(0, 0, 0, 0);

    /* renamed from: q  reason: collision with root package name */
    public int f4193q = -1;

    /* renamed from: r  reason: collision with root package name */
    public int f4194r = -1;

    public e(String str, r0 r0Var, p4.d dVar, int i2, boolean z10, int i10, int i11) {
        this.f4178a = str;
        this.f4179b = r0Var;
        this.f4180c = dVar;
        this.f4181d = i2;
        this.f4182e = z10;
        this.f4183f = i10;
        this.f4184g = i11;
        long j2 = 0;
        this.f4189l = (j2 & 4294967295L) | (j2 << 32);
    }

    public static long f(e eVar, long j2, x4.m mVar) {
        r0 r0Var = eVar.f4179b;
        b bVar = eVar.m;
        x4.c cVar = eVar.f4186i;
        cVar.getClass();
        b v10 = k0.d.v(bVar, mVar, r0Var, cVar, eVar.f4180c);
        eVar.m = v10;
        return v10.a(eVar.f4184g, j2);
    }

    public final int a(int i2, x4.m mVar) {
        int i10;
        int i11 = this.f4193q;
        int i12 = this.f4194r;
        if (i2 == i11 && i11 != -1) {
            return i12;
        }
        long a10 = x4.b.a(0, i2, 0, Preference.DEFAULT_ORDER);
        if (this.f4184g > 1) {
            a10 = f(this, a10, mVar);
        }
        u e6 = e(mVar);
        long N = ij.a.N(e6.c(), this.f4181d, a10, this.f4182e);
        boolean z10 = this.f4182e;
        int i13 = this.f4181d;
        int i14 = this.f4183f;
        if ((!z10 && (i13 == 2 || i13 == 4 || i13 == 5)) || i14 < 1) {
            i10 = 1;
        } else {
            i10 = i14;
        }
        int o5 = l0.o(new l4.b((t4.c) e6, i10, i13, N).b());
        int i15 = x4.a.i(a10);
        if (o5 < i15) {
            o5 = i15;
        }
        this.f4193q = i2;
        this.f4194r = o5;
        return o5;
    }

    public final boolean b(long j2, x4.m mVar) {
        long j10;
        int i2;
        long d4;
        u uVar;
        long d10;
        this.f4195s = (this.f4195s << 2) | 3;
        boolean z10 = true;
        if (this.f4184g > 1) {
            j10 = f(this, j2, mVar);
        } else {
            j10 = j2;
        }
        l4.b bVar = this.f4187j;
        boolean z11 = false;
        if (bVar != null && (uVar = this.f4190n) != null && !uVar.b() && mVar == this.f4191o && (x4.a.b(j10, this.f4192p) || (x4.a.h(j10) == x4.a.h(this.f4192p) && x4.a.j(j10) == x4.a.j(this.f4192p) && x4.a.g(j10) >= bVar.b() && !bVar.f8783d.f9219d))) {
            if (!x4.a.b(j10, this.f4192p)) {
                l4.b bVar2 = this.f4187j;
                bVar2.getClass();
                this.f4189l = x4.b.d(j10, (l0.o(Math.min(bVar2.f8780a.f13114c0.c(), bVar2.d())) << 32) | (l0.o(bVar2.b()) & 4294967295L));
                if (this.f4181d == 3 || (((int) (d10 >> 32)) >= bVar2.d() && ((int) (4294967295L & d10)) >= bVar2.b())) {
                    z10 = false;
                }
                this.f4188k = z10;
                this.f4192p = j10;
            }
            return false;
        }
        u e6 = e(mVar);
        long N = ij.a.N(e6.c(), this.f4181d, j10, this.f4182e);
        boolean z12 = this.f4182e;
        int i10 = this.f4181d;
        int i11 = this.f4183f;
        if ((!z12 && (i10 == 2 || i10 == 4 || i10 == 5)) || i11 < 1) {
            i2 = 1;
        } else {
            i2 = i11;
        }
        l4.b bVar3 = new l4.b((t4.c) e6, i2, i10, N);
        this.f4192p = j10;
        this.f4189l = x4.b.d(j10, (l0.o(bVar3.b()) & 4294967295L) | (l0.o(bVar3.d()) << 32));
        if (this.f4181d != 3 && (((int) (d4 >> 32)) < bVar3.d() || ((int) (d4 & 4294967295L)) < bVar3.b())) {
            z11 = true;
        }
        this.f4188k = z11;
        this.f4187j = bVar3;
        return true;
    }

    public final void c() {
        this.f4187j = null;
        this.f4190n = null;
        this.f4191o = null;
        this.f4193q = -1;
        this.f4194r = -1;
        this.f4192p = x4.b.h(0, 0, 0, 0);
        long j2 = 0;
        this.f4189l = (j2 & 4294967295L) | (j2 << 32);
        this.f4188k = false;
    }

    public final void d(x4.c cVar) {
        long j2;
        x4.c cVar2 = this.f4186i;
        if (cVar != null) {
            int i2 = a.f4151b;
            j2 = a.a(cVar.b(), cVar.j());
        } else {
            j2 = a.f4150a;
        }
        if (cVar2 == null) {
            this.f4186i = cVar;
            this.f4185h = j2;
        } else if (cVar != null && this.f4185h == j2) {
        } else {
            this.f4186i = cVar;
            this.f4185h = j2;
            this.f4195s = (this.f4195s << 2) | 1;
            c();
        }
    }

    public final u e(x4.m mVar) {
        u uVar = this.f4190n;
        if (uVar == null || mVar != this.f4191o || uVar.b()) {
            this.f4191o = mVar;
            String str = this.f4178a;
            r0 h2 = i0.h(this.f4179b, mVar);
            x4.c cVar = this.f4186i;
            cVar.getClass();
            p4.d dVar = this.f4180c;
            q qVar = q.A;
            uVar = new t4.c(str, h2, qVar, qVar, dVar, cVar);
        }
        this.f4190n = uVar;
        return uVar;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ParagraphLayoutCache(paragraph=");
        if (this.f4187j != null) {
            str = "<paragraph>";
        } else {
            str = "null";
        }
        sb2.append(str);
        sb2.append(", lastDensity=");
        sb2.append((Object) a.b(this.f4185h));
        sb2.append(", history=");
        sb2.append(this.f4195s);
        sb2.append(", constraints=$)");
        return sb2.toString();
    }
}
