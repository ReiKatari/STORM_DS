package u3;

import a0.j;
import a4.l;
import a4.m0;
import a4.n1;
import a4.o0;
import a4.q2;
import b3.o;
import b4.p;
import nc.k;
import zc.u;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends o implements q2, a {

    /* renamed from: i0  reason: collision with root package name */
    public a f13482i0;

    /* renamed from: j0  reason: collision with root package name */
    public b9.e f13483j0;

    /* renamed from: k0  reason: collision with root package name */
    public h f13484k0;

    /* renamed from: l0  reason: collision with root package name */
    public final String f13485l0;

    public h(a aVar, b9.e eVar) {
        this.f13482i0 = aVar;
        this.f13483j0 = eVar == null ? new b9.e(23) : eVar;
        this.f13485l0 = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
        if (r3 == r5) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010c  */
    @Override // u3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(long r17, cc.c r19) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.h.F(long, cc.c):java.lang.Object");
    }

    @Override // b3.o
    public final void G0() {
        b9.e eVar = this.f13483j0;
        eVar.B = this;
        eVar.L = null;
        this.f13484k0 = null;
        eVar.R = new m0(16, this);
        eVar.X = C0();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [nc.t, java.lang.Object] */
    @Override // b3.o
    public final void H0() {
        ?? obj = new Object();
        l.x(this, new p(obj, 1));
        h hVar = (h) ((q2) obj.A);
        this.f13484k0 = hVar;
        b9.e eVar = this.f13483j0;
        eVar.L = hVar;
        if (((h) eVar.B) == this) {
            eVar.B = null;
        }
    }

    public final u O0() {
        h hVar;
        q2 q2Var;
        n1 n1Var;
        u uVar = null;
        if (this.f1777h0) {
            if (!this.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            o oVar = this.A.X;
            o0 t5 = l.t(this);
            loop0: while (true) {
                if (t5 != null) {
                    if ((t5.A0.f268f.R & 262144) != 0) {
                        while (oVar != null) {
                            if ((oVar.L & 262144) != 0) {
                                o oVar2 = oVar;
                                p2.b bVar = null;
                                while (oVar2 != null) {
                                    if (oVar2 instanceof q2) {
                                        q2Var = (q2) oVar2;
                                        if (k.a(k(), q2Var.k()) && h.class == q2Var.getClass()) {
                                            break loop0;
                                        }
                                    } else if ((oVar2.L & 262144) != 0 && (oVar2 instanceof a4.k)) {
                                        int i2 = 0;
                                        for (o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                            if ((oVar3.L & 262144) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    oVar2 = oVar3;
                                                } else {
                                                    if (bVar == null) {
                                                        bVar = new p2.b(new o[16]);
                                                    }
                                                    if (oVar2 != null) {
                                                        bVar.b(oVar2);
                                                        oVar2 = null;
                                                    }
                                                    bVar.b(oVar3);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    oVar2 = l.e(bVar);
                                }
                                continue;
                            }
                            oVar = oVar.X;
                        }
                    }
                    t5 = t5.u();
                    if (t5 != null && (n1Var = t5.A0) != null) {
                        oVar = n1Var.f267e;
                    } else {
                        oVar = null;
                    }
                } else {
                    q2Var = null;
                    break;
                }
            }
            hVar = (h) q2Var;
        } else {
            hVar = null;
        }
        if (hVar != null) {
            uVar = hVar.O0();
        }
        if (uVar != null && x.t(uVar)) {
            return uVar;
        }
        u uVar2 = (u) this.f13483j0.X;
        if (uVar2 != null) {
            return uVar2;
        }
        j.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014e  */
    @Override // u3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object V(long r20, long r22, cc.c r24) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.h.V(long, long, cc.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u3.a
    public final long Z(long j2, long j10, int i2) {
        long j11;
        n1 n1Var;
        long Z = this.f13482i0.Z(j2, j10, i2);
        boolean z10 = this.f1777h0;
        h hVar = null;
        if (z10 && z10) {
            if (!this.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            o oVar = this.A.X;
            o0 t5 = l.t(this);
            loop0: while (true) {
                if (t5 == null) {
                    break;
                }
                if ((t5.A0.f268f.R & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 262144) != 0) {
                            o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof q2) {
                                    q2 q2Var = (q2) oVar2;
                                    if (k.a(k(), q2Var.k()) && h.class == q2Var.getClass()) {
                                        hVar = q2Var;
                                        break loop0;
                                    }
                                } else if ((oVar2.L & 262144) != 0 && (oVar2 instanceof a4.k)) {
                                    int i10 = 0;
                                    for (o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar2 = l.e(bVar);
                            }
                            continue;
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar = n1Var.f267e;
                } else {
                    oVar = null;
                }
            }
            hVar = hVar;
        }
        h hVar2 = hVar;
        if (hVar2 != null) {
            j11 = hVar2.Z(h3.b.e(j2, Z), h3.b.d(j10, Z), i2);
        } else {
            j11 = 0;
        }
        return h3.b.e(Z, j11);
    }

    @Override // a4.q2
    public final Object k() {
        return this.f13485l0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // u3.a
    public final long n0(int i2, long j2) {
        long j10;
        n1 n1Var;
        boolean z10 = this.f1777h0;
        h hVar = null;
        if (z10 && z10) {
            if (!this.A.f1777h0) {
                x3.a.c("visitAncestors called on an unattached node");
            }
            o oVar = this.A.X;
            o0 t5 = l.t(this);
            loop0: while (true) {
                if (t5 == null) {
                    break;
                }
                if ((t5.A0.f268f.R & 262144) != 0) {
                    while (oVar != null) {
                        if ((oVar.L & 262144) != 0) {
                            o oVar2 = oVar;
                            p2.b bVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof q2) {
                                    q2 q2Var = (q2) oVar2;
                                    if (k.a(k(), q2Var.k()) && h.class == q2Var.getClass()) {
                                        hVar = q2Var;
                                        break loop0;
                                    }
                                } else if ((oVar2.L & 262144) != 0 && (oVar2 instanceof a4.k)) {
                                    int i10 = 0;
                                    for (o oVar3 = ((a4.k) oVar2).f247j0; oVar3 != null; oVar3 = oVar3.Y) {
                                        if ((oVar3.L & 262144) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    bVar.b(oVar2);
                                                    oVar2 = null;
                                                }
                                                bVar.b(oVar3);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                oVar2 = l.e(bVar);
                            }
                            continue;
                        }
                        oVar = oVar.X;
                    }
                }
                t5 = t5.u();
                if (t5 != null && (n1Var = t5.A0) != null) {
                    oVar = n1Var.f267e;
                } else {
                    oVar = null;
                }
            }
            hVar = hVar;
        }
        if (hVar != null) {
            j10 = hVar.n0(i2, j2);
        } else {
            j10 = 0;
        }
        return h3.b.e(j10, this.f13482i0.n0(i2, h3.b.d(j2, j10)));
    }
}
