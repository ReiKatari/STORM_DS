package d1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3663a;

    /* renamed from: b  reason: collision with root package name */
    public long f3664b;

    /* renamed from: c  reason: collision with root package name */
    public Object f3665c;

    /* renamed from: d  reason: collision with root package name */
    public Object f3666d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3667e;

    /* renamed from: f  reason: collision with root package name */
    public Object f3668f;

    /* renamed from: g  reason: collision with root package name */
    public Object f3669g;

    /* renamed from: h  reason: collision with root package name */
    public Object f3670h;

    /* renamed from: i  reason: collision with root package name */
    public Object f3671i;

    public s(t tVar, w1 w1Var, Object obj, p pVar) {
        this.f3663a = 0;
        b9.e eVar = new b9.e(6, tVar.f3672a);
        this.f3665c = eVar;
        this.f3666d = w1Var;
        this.f3667e = obj;
        p pVar2 = (p) w1Var.f3690a.k(obj);
        this.f3669g = pVar2;
        this.f3670h = d.k(pVar);
        this.f3668f = w1Var.f3691b.k(eVar.y(pVar2, pVar));
        if (((p) eVar.R) == null) {
            eVar.R = pVar2.c();
        }
        p pVar3 = (p) eVar.R;
        if (pVar3 != null) {
            int b10 = pVar3.b();
            long j2 = 0;
            for (int i2 = 0; i2 < b10; i2++) {
                pVar2.getClass();
                j2 = Math.max(j2, ((long) (Math.exp(((aa.f) ((a0.b) eVar.B).B).b(pVar.a(i2)) / (c1.g1.f2425a - 1.0d)) * 1000.0d)) * 1000000);
            }
            this.f3664b = j2;
            p k10 = d.k(((b9.e) this.f3665c).z(j2, (p) this.f3669g, pVar));
            this.f3671i = k10;
            int b11 = k10.b();
            for (int i10 = 0; i10 < b11; i10++) {
                p pVar4 = (p) this.f3671i;
                float a10 = pVar4.a(i10);
                ((b9.e) this.f3665c).getClass();
                ((b9.e) this.f3665c).getClass();
                pVar4.e(i10, p7.j.f(a10, -0.0f, 0.0f));
            }
            return;
        }
        nc.k.f("velocityVector");
        throw null;
    }

    @Override // d1.f
    public boolean a() {
        return false;
    }

    @Override // d1.f
    public Object b(long j2) {
        float f8;
        if (!g(j2)) {
            mc.l lVar = ((w1) this.f3666d).f3691b;
            b9.e eVar = (b9.e) this.f3665c;
            p pVar = (p) this.f3669g;
            p pVar2 = (p) this.f3670h;
            if (((p) eVar.L) == null) {
                eVar.L = pVar.c();
            }
            p pVar3 = (p) eVar.L;
            String str = "valueVector";
            if (pVar3 != null) {
                int b10 = pVar3.b();
                int i2 = 0;
                while (true) {
                    p pVar4 = (p) eVar.L;
                    if (i2 < b10) {
                        if (pVar4 != null) {
                            float a10 = pVar.a(i2);
                            long j10 = j2 / 1000000;
                            c1.f1 a11 = ((aa.f) ((a0.b) eVar.B).B).a(pVar2.a(i2));
                            String str2 = str;
                            long j11 = a11.f2422c;
                            if (j11 > 0) {
                                f8 = ((float) j10) / ((float) j11);
                            } else {
                                f8 = 1.0f;
                            }
                            pVar4.e(i2, (Math.signum(a11.f2420a) * a11.f2421b * c1.d.a(f8).f2394a) + a10);
                            i2++;
                            str = str2;
                        } else {
                            nc.k.f(str);
                            throw null;
                        }
                    } else {
                        String str3 = str;
                        if (pVar4 != null) {
                            return lVar.k(pVar4);
                        }
                        nc.k.f(str3);
                        throw null;
                    }
                }
            } else {
                nc.k.f("valueVector");
                throw null;
            }
        } else {
            return this.f3668f;
        }
    }

    @Override // d1.f
    public long c() {
        return this.f3664b;
    }

    @Override // d1.f
    public w1 d() {
        return (w1) this.f3666d;
    }

    @Override // d1.f
    public Object e() {
        return this.f3668f;
    }

    @Override // d1.f
    public p f(long j2) {
        if (!g(j2)) {
            return ((b9.e) this.f3665c).z(j2, (p) this.f3669g, (p) this.f3670h);
        }
        return (p) this.f3671i;
    }

    public String toString() {
        String num;
        switch (this.f3663a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                StringBuilder sb2 = new StringBuilder("Archive with packed streams starting at offset ");
                sb2.append(this.f3664b);
                sb2.append(", ");
                sb2.append(Integer.toString(((long[]) this.f3665c).length));
                sb2.append(" pack sizes, ");
                long[] jArr = (long[]) this.f3667e;
                String str = "(null)";
                if (jArr == null) {
                    num = "(null)";
                } else {
                    num = Integer.toString(jArr.length);
                }
                sb2.append(num);
                sb2.append(" CRCs, ");
                sb2.append(Integer.toString(((ij.l[]) this.f3668f).length));
                sb2.append(" folders, ");
                ij.n[] nVarArr = (ij.n[]) this.f3670h;
                if (nVarArr != null) {
                    str = Integer.toString(nVarArr.length);
                }
                sb2.append(str);
                sb2.append(" files and ");
                sb2.append((b9.e) this.f3671i);
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public s() {
        this.f3663a = 1;
        this.f3665c = new long[0];
        this.f3668f = ij.l.f7097j;
        this.f3670h = ij.n.f7108q;
    }
}
