package e9;

import a0.j;
import fj.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import nc.k;
import p1.a0;
import p8.c0;
import p8.e0;
import p8.y;
import ti.n;
import ti.o;
import x8.p;
import zb.l;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f4414a;

    /* renamed from: b  reason: collision with root package name */
    public Object f4415b;

    /* renamed from: c  reason: collision with root package name */
    public Object f4416c;

    /* renamed from: d  reason: collision with root package name */
    public Object f4417d;

    public a(Class cls) {
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f4415b = randomUUID;
        String uuid = ((UUID) this.f4415b).toString();
        uuid.getClass();
        this.f4416c = new p(uuid, (e0) null, cls.getName(), (String) null, (p8.h) null, (p8.h) null, 0L, 0L, 0L, (p8.e) null, 0, (p8.a) null, 0L, 0L, 0L, 0L, false, (c0) null, 0, 0L, 0, 0, (String) null, (Boolean) null, 33554426);
        LinkedHashSet linkedHashSet = new LinkedHashSet(v.E(1));
        linkedHashSet.add(new String[]{cls.getName()}[0]);
        this.f4417d = linkedHashSet;
    }

    public static IOException b(a aVar, boolean z10, IOException iOException, int i2) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        if ((i2 & 4) != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if ((i2 & 8) != 0) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (iOException != null) {
            aVar.k(iOException);
        }
        n nVar = (n) aVar.f4415b;
        if (z12 && !z10) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z11 && !z10) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z12 && z10) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z11 && z10) {
            z16 = true;
        } else {
            z16 = false;
        }
        return nVar.j(aVar, z13, z14, z16, z15, iOException);
    }

    public void a() {
        ri.h hVar = (ri.h) this.f4417d;
        synchronized (hVar) {
            try {
                if (!this.f4414a) {
                    if (k.a(((ri.d) this.f4415b).f12755g, this)) {
                        hVar.i(this, false);
                    }
                    this.f4414a = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public y c() {
        boolean z10;
        String str;
        if (this.f4414a && ((p) this.f4416c).f14429j.f11474d) {
            j.h("Cannot set backoff criteria on an idle mode job");
            return null;
        }
        y yVar = new y((UUID) this.f4415b, (p) this.f4416c, (LinkedHashSet) this.f4417d);
        p8.e eVar = ((p) this.f4416c).f14429j;
        if (eVar.f11479i.isEmpty() && !eVar.f11475e && !eVar.f11473c && !eVar.f11474d) {
            z10 = false;
        } else {
            z10 = true;
        }
        p pVar = (p) this.f4416c;
        if (pVar.f14435q) {
            if (!z10) {
                if (pVar.f14426g > 0) {
                    j.h("Expedited jobs cannot be delayed");
                    return null;
                }
            } else {
                j.h("Expedited jobs only support network and storage constraints");
                return null;
            }
        }
        String str2 = pVar.f14442x;
        if (str2 == null) {
            List v02 = vc.h.v0(pVar.f14422c, new String[]{"."});
            if (v02.size() == 1) {
                str = (String) v02.get(0);
            } else {
                str = (String) l.Z(v02);
            }
            if (str.length() > 127) {
                str = vc.h.B0(127, str);
            }
            pVar.f14442x = str;
        } else if (str2.length() > 127) {
            ((p) this.f4416c).f14442x = vc.h.B0(127, str2);
        }
        UUID randomUUID = UUID.randomUUID();
        randomUUID.getClass();
        this.f4415b = randomUUID;
        String uuid = randomUUID.toString();
        uuid.getClass();
        p pVar2 = (p) this.f4416c;
        pVar2.getClass();
        this.f4416c = new p(uuid, pVar2.f14421b, pVar2.f14422c, pVar2.f14423d, new p8.h(pVar2.f14424e), new p8.h(pVar2.f14425f), pVar2.f14426g, pVar2.f14427h, pVar2.f14428i, new p8.e(pVar2.f14429j), pVar2.f14430k, pVar2.f14431l, pVar2.m, pVar2.f14432n, pVar2.f14433o, pVar2.f14434p, pVar2.f14435q, pVar2.f14436r, pVar2.f14437s, pVar2.f14439u, pVar2.f14440v, pVar2.f14441w, pVar2.f14442x, pVar2.f14443y, 524288);
        return yVar;
    }

    public void d() {
        ri.h hVar = (ri.h) this.f4417d;
        synchronized (hVar) {
            try {
                if (!this.f4414a) {
                    if (k.a(((ri.d) this.f4415b).f12755g, this)) {
                        hVar.i(this, true);
                    }
                    this.f4414a = true;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(boolean z10) {
        e eVar = (e) this.f4417d;
        synchronized (eVar) {
            try {
                if (!this.f4414a) {
                    if (k.a(((b) this.f4415b).f4424g, this)) {
                        e.d(eVar, this, z10);
                    }
                    this.f4414a = true;
                } else {
                    throw new IllegalStateException("editor is closed");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f() {
        ri.d dVar = (ri.d) this.f4415b;
        if (k.a(dVar.f12755g, this)) {
            ri.h hVar = (ri.h) this.f4417d;
            if (hVar.f12769f0) {
                hVar.i(this, false);
            } else {
                dVar.f12754f = true;
            }
        }
    }

    public x g(int i2) {
        x xVar;
        e eVar = (e) this.f4417d;
        synchronized (eVar) {
            if (!this.f4414a) {
                ((boolean[]) this.f4416c)[i2] = true;
                Object obj = ((b) this.f4415b).f4421d.get(i2);
                d dVar = eVar.f4436j0;
                x xVar2 = (x) obj;
                if (!dVar.z(xVar2)) {
                    q9.g.a(dVar.I(xVar2));
                }
                xVar = (x) obj;
            } else {
                throw new IllegalStateException("editor is closed");
            }
        }
        return xVar;
    }

    public o h() {
        o oVar;
        ui.d h2 = ((ui.e) this.f4417d).h();
        if (h2 instanceof o) {
            oVar = (o) h2;
        } else {
            oVar = null;
        }
        if (oVar != null) {
            return oVar;
        }
        j.p("no connection for CONNECT tunnels");
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, fj.e0] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, fj.e0] */
    public fj.e0 i(int i2) {
        ri.h hVar = (ri.h) this.f4417d;
        synchronized (hVar) {
            try {
                if (!this.f4414a) {
                    if (!k.a(((ri.d) this.f4415b).f12755g, this)) {
                        return new Object();
                    }
                    if (!((ri.d) this.f4415b).f12753e) {
                        boolean[] zArr = (boolean[]) this.f4416c;
                        zArr.getClass();
                        zArr[i2] = true;
                    }
                    x xVar = (x) ((ri.d) this.f4415b).f12752d.get(i2);
                    try {
                        ri.g gVar = hVar.B;
                        gVar.getClass();
                        xVar.getClass();
                        return new f(gVar.I(xVar), new he.g(24, hVar, this));
                    } catch (FileNotFoundException unused) {
                        return new Object();
                    }
                }
                throw new IllegalStateException("Check failed.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public pi.c0 j(boolean z10) {
        try {
            pi.c0 j2 = ((ui.e) this.f4417d).j(z10);
            if (j2 != null) {
                j2.f11687n = this;
                return j2;
            }
            return j2;
        } catch (IOException e6) {
            k(e6);
            throw e6;
        }
    }

    public void k(IOException iOException) {
        this.f4414a = true;
        ((ui.e) this.f4417d).h().g((n) this.f4415b, iOException);
    }

    public a0 l() {
        n nVar = (n) this.f4415b;
        if (!nVar.f13219c0) {
            nVar.f13219c0 = true;
            nVar.R.i();
            synchronized (nVar) {
                if (nVar.f13227k0 != null) {
                    if (!nVar.f13223g0 && !nVar.f13224h0) {
                        if (!nVar.f13221e0) {
                            if (nVar.f13222f0) {
                                nVar.f13222f0 = false;
                                nVar.f13223g0 = true;
                                nVar.f13224h0 = true;
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new IllegalStateException("Check failed.");
                        }
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            }
            ui.d h2 = ((ui.e) this.f4417d).h();
            h2.getClass();
            o oVar = (o) h2;
            oVar.f13232e.setSoTimeout(0);
            oVar.h();
            return new a0(this);
        }
        j.p("Check failed.");
        return null;
    }

    public a(e eVar, b bVar) {
        this.f4417d = eVar;
        this.f4415b = bVar;
        this.f4416c = new boolean[2];
    }

    public a(ri.h hVar, ri.d dVar) {
        boolean[] zArr;
        this.f4417d = hVar;
        this.f4415b = dVar;
        if (dVar.f12753e) {
            zArr = null;
        } else {
            hVar.getClass();
            zArr = new boolean[2];
        }
        this.f4416c = zArr;
    }
}
