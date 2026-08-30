package d2;

import a4.r0;
import a7.a0;
import ai.c0;
import ai.x0;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Bundle;
import androidx.lifecycle.s0;
import b4.q1;
import b4.z2;
import b7.b0;
import b7.z;
import c1.p;
import cd.a1;
import f1.k0;
import f2.b1;
import g2.t3;
import g2.y4;
import h1.g1;
import h1.h1;
import h1.p2;
import java.util.ArrayList;
import java.util.List;
import jg.u;
import l1.d1;
import l1.e0;
import l1.r1;
import l4.q0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h0;
import n2.r;
import n2.w0;
import q4.x;
import u1.k1;
import u1.p0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ a(i iVar, q4.q qVar, x xVar, p0 p0Var, i3.p0 p0Var2) {
        this.A = 6;
        this.L = iVar;
        this.R = qVar;
        this.B = xVar;
        this.X = p0Var;
        this.Y = p0Var2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        p0 p0Var;
        b1 b1Var;
        List list;
        boolean z10;
        float i2;
        h3.c cVar;
        float rint;
        int i10;
        int i11 = this.A;
        z2 z2Var = null;
        y yVar = y.f14813a;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        Object obj5 = this.Y;
        Object obj6 = this.B;
        switch (i11) {
            case 0:
                u uVar = (u) obj;
                o oVar = ((c) obj4).f3719a;
                uVar.f3780h = (x) obj6;
                uVar.f3781i = (q4.j) obj3;
                uVar.f3775c = (c0) obj2;
                uVar.f3776d = (mc.l) obj5;
                if (oVar != null) {
                    p0Var = oVar.f3752j0;
                } else {
                    p0Var = null;
                }
                uVar.f3777e = p0Var;
                if (oVar != null) {
                    b1Var = oVar.f3753k0;
                } else {
                    b1Var = null;
                }
                uVar.f3778f = b1Var;
                if (oVar != null) {
                    z2Var = (z2) a4.l.h(oVar, q1.f1929s);
                }
                uVar.f3779g = z2Var;
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ArrayList arrayList = (ArrayList) obj4;
                nc.r rVar = (nc.r) obj3;
                d7.f fVar = (d7.f) obj2;
                Bundle bundle = (Bundle) obj5;
                a7.i iVar = (a7.i) obj;
                iVar.getClass();
                ((nc.p) obj6).A = true;
                int indexOf = arrayList.indexOf(iVar);
                if (indexOf != -1) {
                    int i12 = indexOf + 1;
                    list = arrayList.subList(rVar.A, i12);
                    rVar.A = i12;
                } else {
                    list = zb.q.A;
                }
                fVar.a(iVar.B, bundle, iVar, list);
                return yVar;
            case 2:
                e.a aVar = (e.a) obj6;
                h0 h0Var = (h0) obj;
                aVar.f4131a = ((h.h) obj4).d((String) obj3, (i.a) obj2, new bi.c(1, (w0) obj5));
                return new a5.a(4, aVar);
            case 3:
                d0.b1 b1Var2 = (d0.b1) obj6;
                nc.t tVar = (nc.t) obj4;
                nc.q qVar = (nc.q) obj3;
                p2 p2Var = (p2) obj2;
                nc.p pVar = (nc.p) obj5;
                float floatValue = ((Float) obj).floatValue();
                h1 j2 = d0.b1.j((bd.h) b1Var2.f3336f);
                if (j2 != null) {
                    b1Var2.k(j2);
                    h1 a10 = ((h1) tVar.A).a(j2);
                    tVar.A = a10;
                    qVar.A = p2Var.i(p2Var.e(a10.f5907a));
                    pVar.A = !g1.a(i2 - floatValue);
                }
                if (j2 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 4:
                hg.l lVar = (hg.l) obj6;
                zc.u uVar2 = (zc.u) obj4;
                oe.a aVar2 = (oe.a) obj;
                aVar2.getClass();
                zc.x.v(s0.h(lVar), null, null, new hg.k(lVar, aVar2, null, 1), 3);
                zc.x.v(uVar2, null, null, new z((t3) obj3, (String) obj2, (String) obj5, lVar, aVar2, null, 5), 3);
                return yVar;
            case l1.c.f8511g /* 5 */:
                final jg.u uVar3 = (jg.u) obj6;
                final d1 d1Var = (d1) obj4;
                final zc.u uVar4 = (zc.u) obj3;
                final Resources resources = (Resources) obj2;
                final y4 y4Var = (y4) obj5;
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                v2.c cVar2 = new v2.c(355313283, true, new lg.c(0, uVar3, d1Var));
                nc.e a11 = nc.u.a(jg.l.class);
                zb.r rVar2 = zb.r.A;
                l0.f.g(a0Var, a11, rVar2, cVar2);
                l0.f.g(a0Var, nc.u.a(jg.k.class), rVar2, new v2.c(-198237268, true, new lg.c(1, uVar3, d1Var)));
                l0.f.g(a0Var, nc.u.a(jg.h.class), rVar2, new v2.c(247300043, true, new mc.r() { // from class: lg.d
                    /* JADX WARN: Type inference failed for: r2v2, types: [kg.f, java.lang.Object] */
                    @Override // mc.r
                    public final Object r(Object obj7, Object obj8, Object obj9, Object obj10) {
                        n2.m mVar = (n2.m) obj9;
                        ((Integer) obj10).getClass();
                        ((p) obj7).getClass();
                        ((a7.i) obj8).getClass();
                        u uVar5 = u.this;
                        w0 k10 = p7.j.k((a1) uVar5.f7885k.getValue(), new Object(), mVar, 0);
                        e0 e0Var = r1.f8615c;
                        kg.h hVar = (kg.h) k10.getValue();
                        r rVar3 = (r) mVar;
                        boolean h2 = rVar3.h(uVar5);
                        Object L = rVar3.L();
                        n2.e eVar = n2.l.f9953a;
                        if (h2 || L == eVar) {
                            L = new f(uVar5, 0);
                            rVar3.h0(L);
                        }
                        mc.l lVar2 = (mc.l) L;
                        boolean h10 = rVar3.h(uVar5);
                        Object L2 = rVar3.L();
                        if (h10 || L2 == eVar) {
                            L2 = new a2.g(1, uVar5, u.class, "addNewCheat", "addNewCheat(Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 15);
                            rVar3.h0(L2);
                        }
                        mc.l lVar3 = (mc.l) ((nc.i) L2);
                        boolean h11 = rVar3.h(uVar5);
                        Object L3 = rVar3.L();
                        if (h11 || L3 == eVar) {
                            k0 k0Var = new k0(2, uVar5, u.class, "updateCheat", "updateCheat(Lme/magnum/melonds/domain/model/Cheat;Lme/magnum/melonds/ui/cheats/model/CheatSubmissionForm;)V", 0, 0, 3);
                            rVar3.h0(k0Var);
                            L3 = k0Var;
                        }
                        mc.p pVar2 = (mc.p) ((nc.i) L3);
                        zc.u uVar6 = uVar4;
                        boolean h12 = rVar3.h(uVar6);
                        Resources resources2 = resources;
                        boolean h13 = h12 | rVar3.h(resources2) | rVar3.h(uVar5);
                        Object L4 = rVar3.L();
                        if (h13 || L4 == eVar) {
                            x0 x0Var = new x0(uVar6, uVar5, y4Var, resources2, 6);
                            rVar3.h0(x0Var);
                            L4 = x0Var;
                        }
                        j.a(e0Var, d1Var, hVar, lVar2, lVar3, pVar2, (mc.l) L4, rVar3, 6);
                        return y.f14813a;
                    }
                }));
                l0.f.g(a0Var, nc.u.a(jg.e.class), rVar2, new v2.c(692837354, true, new lg.c(2, uVar3, d1Var)));
                return yVar;
            case l1.c.f8509e /* 6 */:
                q4.q qVar2 = (q4.q) obj3;
                x xVar = (x) obj6;
                p0 p0Var2 = (p0) obj2;
                i3.p0 p0Var3 = (i3.p0) obj5;
                r0 r0Var = (r0) obj;
                r0Var.a();
                k3.b bVar = r0Var.A;
                float g10 = ((i) obj4).f3742c.g();
                if (g10 == 0.0f) {
                    return yVar;
                }
                long j10 = xVar.f12277b;
                int i13 = q0.f8884c;
                int m = qVar2.m((int) (j10 >> 32));
                k1 d4 = p0Var2.d();
                if (d4 != null) {
                    cVar = d4.f13358a.c(m);
                } else {
                    cVar = new h3.c(0.0f, 0.0f, 0.0f, 0.0f);
                }
                float floor = (float) Math.floor(r0Var.v(u1.w0.f13460a));
                if (floor < 1.0f) {
                    floor = 1.0f;
                }
                float f8 = floor / 2;
                float f10 = cVar.f6052a + f8;
                float intBitsToFloat = Float.intBitsToFloat((int) (bVar.c() >> 32)) - f8;
                if (f10 > intBitsToFloat) {
                    f10 = intBitsToFloat;
                }
                if (f10 >= f8) {
                    f8 = f10;
                }
                if (((int) floor) % 2 == 1) {
                    rint = ((float) Math.floor(f8)) + 0.5f;
                } else {
                    rint = (float) Math.rint(f8);
                }
                long floatToRawIntBits = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(cVar.f6053b) & 4294967295L);
                float f11 = cVar.f6055d;
                long floatToRawIntBits2 = (Float.floatToRawIntBits(rint) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L);
                i3.q qVar3 = bVar.A.f7957c;
                cd.h1 h1Var = bVar.R;
                if (h1Var == null) {
                    h1Var = i3.z.f();
                    h1Var.q(1);
                    bVar.R = h1Var;
                }
                Paint paint = (Paint) h1Var.B;
                p0Var3.a(g10, bVar.c(), h1Var);
                if (!nc.k.a((i3.l) h1Var.R, null)) {
                    h1Var.k(null);
                }
                if (h1Var.A != 3) {
                    h1Var.i(3);
                }
                if (paint.getStrokeWidth() != floor) {
                    h1Var.p(floor);
                }
                if (paint.getStrokeMiter() != 4.0f) {
                    paint.setStrokeMiter(4.0f);
                }
                if (h1Var.f() == 0) {
                    i10 = 0;
                } else {
                    i10 = 0;
                    h1Var.n(0);
                }
                if (h1Var.g() != 0) {
                    h1Var.o(i10);
                }
                if (!paint.isFilterBitmap()) {
                    h1Var.l(1);
                }
                qVar3.b(floatToRawIntBits, floatToRawIntBits2, h1Var);
                return yVar;
            default:
                List list2 = (List) obj6;
                n1.i iVar2 = (n1.i) obj;
                iVar2.getClass();
                iVar2.q(list2.size(), new ai.b1(13, new zf.f(4), list2), new ai.j(10, list2), new v2.c(802480018, true, new b0(list2, (mc.l) obj5, (mc.p) obj4, (mc.p) obj3, (mc.l) obj2, 1)));
                return yVar;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    public /* synthetic */ a(List list, mc.l lVar, mc.p pVar, mc.p pVar2, mc.l lVar2) {
        this.A = 7;
        this.B = list;
        this.Y = lVar;
        this.L = pVar;
        this.R = pVar2;
        this.X = lVar2;
    }
}
