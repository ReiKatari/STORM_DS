package g2;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class w6 implements mc.p {
    public final /* synthetic */ int A;

    public /* synthetic */ w6(int i2) {
        this.A = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i2;
        boolean a10;
        switch (this.A) {
            case 0:
                return Integer.valueOf(((y3.u0) obj).b0(((Integer) obj2).intValue()));
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.b(l0.f.I(rVar, R.string.backgrounds), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case 2:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    b2.a(o3.b.d(a.a.t(), rVar2), null, null, 0L, rVar2, 56, 12);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case 3:
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue3 & 1, z12)) {
                    b2.a(k7.w.z(rVar3, R.drawable.ic_add), l0.f.I(rVar3, R.string.action_backgrounds_new), null, 0L, rVar3, 8, 12);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
            case 4:
                n2.m mVar4 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar4 = (n2.r) mVar4;
                if (!rVar4.O(intValue4 & 1, z13)) {
                    rVar4.R();
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                n2.m mVar5 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar5 = (n2.r) mVar5;
                if (rVar5.O(intValue5 & 1, z14)) {
                    b2.a(o3.b.d(a.a.t(), rVar5), null, null, 0L, rVar5, 56, 12);
                } else {
                    rVar5.R();
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                nc.e eVar = (nc.e) obj;
                List list = (List) obj2;
                eVar.getClass();
                list.getClass();
                ArrayList b02 = aj.g.b0(qd.a.f12509a, list, true);
                b02.getClass();
                return aj.g.V(eVar, b02, new jd.i(0, list));
            case 7:
                nc.e eVar2 = (nc.e) obj;
                List list2 = (List) obj2;
                eVar2.getClass();
                list2.getClass();
                ArrayList b03 = aj.g.b0(qd.a.f12509a, list2, true);
                b03.getClass();
                jd.a V = aj.g.V(eVar2, b03, new jd.i(1, list2));
                if (V != null) {
                    return a.a.C(V);
                }
                return null;
            case 8:
                InputStream inputStream = (InputStream) obj;
                mc.p pVar = (mc.p) obj2;
                inputStream.getClass();
                pVar.getClass();
                byte[] bArr = new byte[2560];
                inputStream.read(bArr);
                pVar.j("banner", bArr);
                byte[] m = zb.k.m(bArr, 832, 1088);
                Charset charset = StandardCharsets.UTF_16LE;
                charset.getClass();
                String T = vc.o.T(vc.h.C0(new String(m, charset)).toString(), "\u0000", "");
                String T2 = vc.o.T(vc.h.A0(T, '\n'), "\n", " ");
                String x02 = vc.h.x0('\n', T, T);
                pVar.j("name", T2);
                pVar.j("developer", x02);
                return yb.y.f14813a;
            case l1.c.f8508d /* 9 */:
                InputStream inputStream2 = (InputStream) obj;
                mc.p pVar2 = (mc.p) obj2;
                inputStream2.getClass();
                pVar2.getClass();
                byte[] bArr2 = new byte[4];
                inputStream2.read(bArr2);
                boolean z15 = false;
                if ((((bArr2[0 + 3] & 255) << 24) | (bArr2[0] & 255) | ((bArr2[0 + 1] & 255) << 8) | ((bArr2[0 + 2] & 255) << 16)) == 196612) {
                    z15 = true;
                }
                pVar2.j("isDsiWareTitle", Boolean.valueOf(z15));
                return yb.y.f14813a;
            case l1.c.f8510f /* 10 */:
                kg.d dVar = (kg.d) obj2;
                ((y2.c) obj).getClass();
                dVar.getClass();
                ac.b g10 = p7.t.g();
                if (dVar.equals(kg.b.f8292b)) {
                    i2 = 0;
                } else if (dVar.equals(kg.c.f8293b)) {
                    i2 = 1;
                } else if (dVar instanceof kg.a) {
                    i2 = 2;
                } else {
                    m9.o.o();
                    return null;
                }
                g10.add(Integer.valueOf(i2));
                if (dVar instanceof kg.a) {
                    Cheat cheat = ((kg.a) dVar).f8291b;
                    cheat.getClass();
                    g10.add(new fg.b(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
                }
                return p7.t.d(g10);
            case 11:
                float intValue6 = ((Integer) obj).intValue() / 2.0f;
                float f8 = -1.0f;
                if (((x4.m) obj2) != x4.m.Ltr) {
                    f8 = (-1.0f) * (-1);
                }
                return Integer.valueOf(Math.round((1 + f8) * intValue6));
            case 12:
                l4.h hVar = (l4.h) obj2;
                return p7.t.b(hVar.B, l4.h0.a(hVar.A, l4.h0.f8797b, (y2.c) obj));
            case 13:
                y2.c cVar = (y2.c) obj;
                return Integer.valueOf(((w4.l) obj2).f14146a);
            case 14:
                y2.c cVar2 = (y2.c) obj;
                w4.p pVar3 = (w4.p) obj2;
                return p7.t.b(Float.valueOf(pVar3.f14150a), Float.valueOf(pVar3.f14151b));
            case l1.c.f8512h /* 15 */:
                y2.c cVar3 = (y2.c) obj;
                w4.q qVar = (w4.q) obj2;
                x4.o oVar = new x4.o(qVar.f14153a);
                l4.f0 f0Var = l4.h0.f8818x;
                return p7.t.b(l4.h0.a(oVar, f0Var, cVar3), l4.h0.a(new x4.o(qVar.f14154b), f0Var, cVar3));
            case 16:
                y2.c cVar4 = (y2.c) obj;
                return Integer.valueOf(((p4.j) obj2).A);
            case 17:
                l4.o oVar2 = (l4.o) obj2;
                return p7.t.b(oVar2.f8863a, l4.h0.a(oVar2.f8864b, l4.h0.f8805j, (y2.c) obj));
            case 18:
                y2.c cVar5 = (y2.c) obj;
                return Float.valueOf(((w4.a) obj2).f14125a);
            case 19:
                y2.c cVar6 = (y2.c) obj;
                List list3 = (List) obj2;
                ArrayList arrayList = new ArrayList(list3.size());
                int size = list3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(l4.h0.a((l4.f) list3.get(i10), l4.h0.f8798c, cVar6));
                }
                return arrayList;
            case 20:
                y2.c cVar7 = (y2.c) obj;
                l4.q0 q0Var = (l4.q0) obj2;
                return p7.t.b(Integer.valueOf((int) (q0Var.f8885a >> 32)), Integer.valueOf((int) (q0Var.f8885a & 4294967295L)));
            case 21:
                y2.c cVar8 = (y2.c) obj;
                i3.m0 m0Var = (i3.m0) obj2;
                return p7.t.b(l4.h0.a(new i3.s(m0Var.f6660a), l4.h0.f8812r, cVar8), l4.h0.a(new h3.b(m0Var.f6661b), l4.h0.f8820z, cVar8), Float.valueOf(m0Var.f6662c));
            case 22:
                y2.c cVar9 = (y2.c) obj;
                return Integer.valueOf(((w4.k) obj2).f14142a);
            case 23:
                y2.c cVar10 = (y2.c) obj;
                return Integer.valueOf(((w4.m) obj2).f14147a);
            case 24:
                y2.c cVar11 = (y2.c) obj;
                return Integer.valueOf(((w4.d) obj2).f14129a);
            case 25:
                y2.c cVar12 = (y2.c) obj;
                return Integer.valueOf(((p4.h) obj2).f11311a);
            case 26:
                y2.c cVar13 = (y2.c) obj;
                return Integer.valueOf(((p4.i) obj2).f11312a);
            case 27:
                y2.c cVar14 = (y2.c) obj;
                x4.o oVar3 = (x4.o) obj2;
                long j2 = x4.o.f14349c;
                if (oVar3 == null) {
                    a10 = false;
                } else {
                    a10 = x4.o.a(oVar3.f14350a, j2);
                }
                if (a10) {
                    return Boolean.FALSE;
                }
                return p7.t.b(Float.valueOf(x4.o.c(oVar3.f14350a)), l4.h0.a(new x4.p(x4.o.b(oVar3.f14350a)), l4.h0.f8819y, cVar14));
            case 28:
                l4.n nVar = (l4.n) obj2;
                return p7.t.b(nVar.f8851a, l4.h0.a(nVar.f8852b, l4.h0.f8805j, (y2.c) obj));
            default:
                y2.c cVar15 = (y2.c) obj;
                long j10 = ((x4.p) obj2).f14351a;
                if (x4.p.a(j10, 8589934592L)) {
                    return 0;
                }
                if (x4.p.a(j10, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
        }
    }
}
