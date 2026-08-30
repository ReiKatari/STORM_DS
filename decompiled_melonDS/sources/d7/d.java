package d7;

import a7.i;
import b4.r2;
import b4.s1;
import f2.b1;
import g3.z;
import l4.i0;
import mc.l;
import nc.p;
import p1.a0;
import q4.q;
import q4.x;
import u1.d0;
import u1.k1;
import u1.p0;
import u1.s;
import yb.y;
import zb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ d(p pVar, p pVar2, f fVar, boolean z10, j jVar) {
        this.L = pVar;
        this.R = pVar2;
        this.X = fVar;
        this.B = z10;
        this.Y = jVar;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        switch (this.A) {
            case 0:
                i iVar = (i) obj;
                iVar.getClass();
                ((p) this.L).A = true;
                ((p) this.R).A = true;
                ((f) this.X).m(iVar, this.B, (j) this.Y);
                return y.f14813a;
            default:
                p0 p0Var = (p0) this.L;
                z zVar = (z) this.R;
                b1 b1Var = (b1) this.X;
                q qVar = (q) this.Y;
                h3.b bVar = (h3.b) obj;
                if (!p0Var.b()) {
                    z.a(zVar);
                } else {
                    r2 r2Var = p0Var.f13381c;
                    if (r2Var != null) {
                        ((s1) r2Var).b();
                    }
                }
                if (p0Var.b() && this.B) {
                    if (p0Var.a() != d0.Selection) {
                        k1 d4 = p0Var.d();
                        if (d4 != null) {
                            long j2 = bVar.f6050a;
                            a0 a0Var = p0Var.f13382d;
                            s sVar = p0Var.f13399v;
                            int l10 = qVar.l(d4.b(j2, true));
                            sVar.k(x.a((x) a0Var.B, null, i0.b(l10, l10), 5));
                            if (p0Var.f13379a.f13443a.B.length() > 0) {
                                p0Var.f13389k.setValue(d0.Cursor);
                            }
                        }
                    } else {
                        b1Var.g(bVar);
                    }
                }
                return y.f14813a;
        }
    }

    public /* synthetic */ d(p0 p0Var, z zVar, boolean z10, b1 b1Var, q qVar) {
        this.L = p0Var;
        this.R = zVar;
        this.B = z10;
        this.X = b1Var;
        this.Y = qVar;
    }
}
