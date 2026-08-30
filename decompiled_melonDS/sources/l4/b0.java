package l4;

import g2.b2;
import g2.e7;
import j0.o1;
import java.util.ArrayList;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.settings.fragments.ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements mc.p {
    public final /* synthetic */ int A;

    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        k kVar;
        Object a10;
        boolean z10;
        boolean z11;
        boolean z12;
        yb.y yVar;
        boolean z13;
        boolean z14;
        int i2 = this.A;
        yb.y yVar2 = yb.y.f14813a;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        switch (i2) {
            case 0:
                y2.c cVar = (y2.c) obj;
                h3.b bVar = (h3.b) obj2;
                if (bVar != null) {
                    z15 = h3.b.b(bVar.f6050a, 9205357640488583168L);
                }
                if (z15) {
                    return Boolean.FALSE;
                }
                return p7.t.b(Float.valueOf(Float.intBitsToFloat((int) (bVar.f6050a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f6050a & 4294967295L))));
            case DSiCameraSource.FrontCamera /* 1 */:
                y2.c cVar2 = (y2.c) obj;
                f fVar = (f) obj2;
                Object obj3 = fVar.f8790a;
                if (obj3 instanceof v) {
                    kVar = k.Paragraph;
                } else if (obj3 instanceof j0) {
                    kVar = k.Span;
                } else if (obj3 instanceof u0) {
                    kVar = k.VerbatimTts;
                } else if (obj3 instanceof t0) {
                    kVar = k.Url;
                } else if (obj3 instanceof o) {
                    kVar = k.Link;
                } else if (obj3 instanceof n) {
                    kVar = k.Clickable;
                } else if (obj3 instanceof l0) {
                    kVar = k.String;
                } else {
                    throw new UnsupportedOperationException();
                }
                switch (g0.f8795a[kVar.ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
                        obj3.getClass();
                        a10 = h0.a((v) obj3, h0.f8803h, cVar2);
                        break;
                    case 2:
                        obj3.getClass();
                        a10 = h0.a((j0) obj3, h0.f8804i, cVar2);
                        break;
                    case 3:
                        obj3.getClass();
                        a10 = h0.a((u0) obj3, h0.f8799d, cVar2);
                        break;
                    case 4:
                        obj3.getClass();
                        a10 = h0.a((t0) obj3, h0.f8800e, cVar2);
                        break;
                    case l1.c.f8511g /* 5 */:
                        obj3.getClass();
                        a10 = h0.a((o) obj3, h0.f8801f, cVar2);
                        break;
                    case l1.c.f8509e /* 6 */:
                        obj3.getClass();
                        a10 = h0.a((n) obj3, h0.f8802g, cVar2);
                        break;
                    case 7:
                        obj3.getClass();
                        a10 = ((l0) obj3).f8847a;
                        break;
                    default:
                        m9.o.o();
                        return null;
                }
                return p7.t.b(kVar, a10, Integer.valueOf(fVar.f8791b), Integer.valueOf(fVar.f8792c), fVar.f8793d);
            case 2:
                y2.c cVar3 = (y2.c) obj;
                ?? r12 = ((s4.b) obj2).A;
                ArrayList arrayList = new ArrayList(r12.size());
                int size = r12.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(h0.a((s4.a) r12.get(i10), h0.B, cVar3));
                }
                return arrayList;
            case 3:
                y2.c cVar4 = (y2.c) obj;
                return ((s4.a) obj2).f12832a.toLanguageTag();
            case 4:
                y2.c cVar5 = (y2.c) obj;
                w4.i iVar = (w4.i) obj2;
                return p7.t.b(h0.a(new w4.f(iVar.f14139a), h0.D, cVar5), h0.a(new w4.h(iVar.f14140b), h0.E, cVar5), h0.a(new w4.g(iVar.f14141c), h0.F, cVar5));
            case l1.c.f8511g /* 5 */:
                y2.c cVar6 = (y2.c) obj;
                return Float.valueOf(((w4.f) obj2).f14135a);
            case l1.c.f8509e /* 6 */:
                y2.c cVar7 = (y2.c) obj;
                return Integer.valueOf(((w4.h) obj2).f14137a);
            case 7:
                y2.c cVar8 = (y2.c) obj;
                return Integer.valueOf(((w4.g) obj2).f14136a);
            case 8:
                y2.c cVar9 = (y2.c) obj;
                return ((u0) obj2).f8902a;
            case l1.c.f8508d /* 9 */:
                y2.c cVar10 = (y2.c) obj;
                v vVar = (v) obj2;
                Object a11 = h0.a(new w4.k(vVar.f8903a), h0.f8813s, cVar10);
                Object a12 = h0.a(new w4.m(vVar.f8904b), h0.f8814t, cVar10);
                Object a13 = h0.a(new x4.o(vVar.f8905c), h0.f8818x, cVar10);
                w4.q qVar = vVar.f8906d;
                w4.q qVar2 = w4.q.f14152c;
                Object a14 = h0.a(qVar, h0.m, cVar10);
                Object a15 = h0.a(vVar.f8907e, i0.f8821a, cVar10);
                w4.i iVar2 = vVar.f8908f;
                w4.i iVar3 = w4.i.f14138d;
                return p7.t.b(a11, a12, a13, a14, a15, h0.a(iVar2, h0.C, cVar10), h0.a(new w4.e(vVar.f8909g), i0.f8823c, cVar10), h0.a(new w4.d(vVar.f8910h), h0.f8815u, cVar10), h0.a(vVar.f8911i, i0.f8824d, cVar10));
            case l1.c.f8510f /* 10 */:
                y2.c cVar11 = (y2.c) obj;
                return ((t0) obj2).f8901a;
            case 11:
                y2.c cVar12 = (y2.c) obj;
                j0 j0Var = (j0) obj2;
                i3.s sVar = new i3.s(j0Var.f8827a.b());
                f0 f0Var = h0.f8812r;
                Object a16 = h0.a(sVar, f0Var, cVar12);
                x4.o oVar = new x4.o(j0Var.f8828b);
                f0 f0Var2 = h0.f8818x;
                Object a17 = h0.a(oVar, f0Var2, cVar12);
                p4.j jVar = j0Var.f8829c;
                p4.j jVar2 = p4.j.B;
                Object a18 = h0.a(jVar, h0.f8808n, cVar12);
                Object a19 = h0.a(j0Var.f8830d, h0.f8816v, cVar12);
                Object a20 = h0.a(j0Var.f8831e, h0.f8817w, cVar12);
                String str = j0Var.f8833g;
                Object a21 = h0.a(new x4.o(j0Var.f8834h), f0Var2, cVar12);
                Object a22 = h0.a(j0Var.f8835i, h0.f8809o, cVar12);
                Object a23 = h0.a(j0Var.f8836j, h0.f8807l, cVar12);
                s4.b bVar2 = j0Var.f8837k;
                s4.b bVar3 = s4.b.L;
                Object a24 = h0.a(bVar2, h0.A, cVar12);
                Object a25 = h0.a(new i3.s(j0Var.f8838l), f0Var, cVar12);
                Object a26 = h0.a(j0Var.m, h0.f8806k, cVar12);
                i3.m0 m0Var = j0Var.f8839n;
                i3.m0 m0Var2 = i3.m0.f6659d;
                return p7.t.b(a16, a17, a18, a19, a20, -1, str, a21, a22, a23, a24, a25, a26, h0.a(m0Var, h0.f8811q, cVar12));
            case 12:
                y2.c cVar13 = (y2.c) obj;
                p0 p0Var = (p0) obj2;
                j0 j0Var2 = p0Var.f8871a;
                p1.a0 a0Var = h0.f8804i;
                return p7.t.b(h0.a(j0Var2, a0Var, cVar13), h0.a(p0Var.f8872b, a0Var, cVar13), h0.a(p0Var.f8873c, a0Var, cVar13), h0.a(p0Var.f8874d, a0Var, cVar13));
            case 13:
                y yVar3 = (y) obj2;
                Boolean valueOf = Boolean.valueOf(yVar3.f8917a);
                p1.a0 a0Var2 = h0.f8796a;
                return p7.t.b(valueOf, h0.a(new m(yVar3.f8918b), i0.f8822b, (y2.c) obj));
            case 14:
                y2.c cVar14 = (y2.c) obj;
                return Integer.valueOf(((m) obj2).f8848a);
            case l1.c.f8512h /* 15 */:
                y2.c cVar15 = (y2.c) obj;
                return Integer.valueOf(((w4.e) obj2).f14131a);
            case 16:
                w4.s sVar2 = (w4.s) obj2;
                return p7.t.b(h0.a(new w4.r(sVar2.f14158a), i0.f8825e, (y2.c) obj), Boolean.valueOf(sVar2.f14159b));
            case 17:
                y2.c cVar16 = (y2.c) obj;
                return Integer.valueOf(((w4.r) obj2).f14155a);
            case 18:
                ((Integer) obj).intValue();
                Cheat cheat = (Cheat) obj2;
                cheat.getClass();
                Long id2 = cheat.getId();
                if (id2 == null) {
                    return cheat.getCode();
                }
                return id2;
            case 19:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    o3.f fVar2 = ij.a.f7085c;
                    if (fVar2 == null) {
                        o3.e eVar = new o3.e("AutoMirrored.Filled.PlaylistAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i11 = o3.h0.f10763a;
                        i3.p0 p0Var2 = new i3.p0(i3.s.f6681b);
                        o1 o1Var = new o1(2, false);
                        o1Var.q(14.0f, 10.0f);
                        o1Var.m(3.0f);
                        o1Var.w(2.0f);
                        o1Var.n(11.0f);
                        o1Var.v(10.0f);
                        o1Var.g();
                        o1Var.q(14.0f, 6.0f);
                        o1Var.m(3.0f);
                        o1Var.w(2.0f);
                        o1Var.n(11.0f);
                        o1Var.v(6.0f);
                        o1Var.g();
                        o1Var.q(18.0f, 14.0f);
                        o1Var.w(-4.0f);
                        o1Var.n(-2.0f);
                        o1Var.w(4.0f);
                        o1Var.n(-4.0f);
                        o1Var.w(2.0f);
                        o1Var.n(4.0f);
                        o1Var.w(4.0f);
                        o1Var.n(2.0f);
                        o1Var.w(-4.0f);
                        o1Var.n(4.0f);
                        o1Var.w(-2.0f);
                        o1Var.m(18.0f);
                        o1Var.g();
                        o1Var.q(3.0f, 16.0f);
                        o1Var.n(7.0f);
                        o1Var.w(-2.0f);
                        o1Var.m(3.0f);
                        o1Var.v(16.0f);
                        o1Var.g();
                        o3.e.a(eVar, o1Var.f7269a, p0Var2);
                        fVar2 = eVar.b();
                        ij.a.f7085c = fVar2;
                    }
                    b2.a(o3.b.d(fVar2, rVar), l0.f.I(rVar, R.string.add_cheat_folder), null, 0L, rVar, 8, 12);
                } else {
                    rVar.R();
                }
                return yVar2;
            case 20:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z19 = true;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z19)) {
                    b2.a(o3.b.d(a.a.t(), rVar2), null, null, 0L, rVar2, 56, 12);
                } else {
                    rVar2.R();
                }
                return yVar2;
            case 21:
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue3 & 1, z11)) {
                    o3.f fVar3 = aj.g.f873k;
                    if (fVar3 == null) {
                        o3.e eVar2 = new o3.e("Outlined.CheckBox", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = o3.h0.f10763a;
                        i3.p0 p0Var3 = new i3.p0(i3.s.f6681b);
                        o1 o1Var2 = new o1(2, false);
                        o1Var2.q(19.0f, 3.0f);
                        o1Var2.o(5.0f, 3.0f);
                        o1Var2.i(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        o1Var2.w(14.0f);
                        o1Var2.i(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        o1Var2.n(14.0f);
                        o1Var2.i(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        o1Var2.o(21.0f, 5.0f);
                        o1Var2.i(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        o1Var2.g();
                        o1Var2.q(19.0f, 19.0f);
                        o1Var2.o(5.0f, 19.0f);
                        o1Var2.o(5.0f, 5.0f);
                        o1Var2.n(14.0f);
                        o1Var2.w(14.0f);
                        o1Var2.g();
                        o1Var2.q(17.99f, 9.0f);
                        o1Var2.p(-1.41f, -1.42f);
                        o1Var2.p(-6.59f, 6.59f);
                        o1Var2.p(-2.58f, -2.57f);
                        o1Var2.p(-1.42f, 1.41f);
                        o1Var2.p(4.0f, 3.99f);
                        o1Var2.g();
                        o3.e.a(eVar2, o1Var2.f7269a, p0Var3);
                        fVar3 = eVar2.b();
                        aj.g.f873k = fVar3;
                    }
                    b2.a(o3.b.d(fVar3, rVar3), l0.f.I(rVar3, R.string.enabled_cheats), null, 0L, rVar3, 8, 12);
                } else {
                    rVar3.R();
                }
                return yVar2;
            case 22:
                n2.m mVar4 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar4 = (n2.r) mVar4;
                if (rVar4.O(intValue4 & 1, z12)) {
                    o3.f fVar4 = k0.d.f7946d;
                    if (fVar4 != null) {
                        yVar = yVar2;
                    } else {
                        o3.e eVar3 = new o3.e("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = o3.h0.f10763a;
                        yVar = yVar2;
                        i3.p0 p0Var4 = new i3.p0(i3.s.f6681b);
                        o1 o1Var3 = new o1(2, false);
                        o1Var3.q(20.0f, 6.0f);
                        o1Var3.n(-8.0f);
                        o1Var3.p(-2.0f, -2.0f);
                        o1Var3.o(4.0f, 4.0f);
                        o1Var3.i(-1.11f, 0.0f, -1.99f, 0.89f, -1.99f, 2.0f);
                        o1Var3.o(2.0f, 18.0f);
                        o1Var3.i(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        o1Var3.n(16.0f);
                        o1Var3.i(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
                        o1Var3.o(22.0f, 8.0f);
                        o1Var3.i(0.0f, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        o1Var3.g();
                        o1Var3.q(19.0f, 14.0f);
                        o1Var3.n(-3.0f);
                        o1Var3.w(3.0f);
                        o1Var3.n(-2.0f);
                        o1Var3.w(-3.0f);
                        o1Var3.n(-3.0f);
                        o1Var3.w(-2.0f);
                        o1Var3.n(3.0f);
                        o1Var3.o(14.0f, 9.0f);
                        o1Var3.n(2.0f);
                        o1Var3.w(3.0f);
                        o1Var3.n(3.0f);
                        o1Var3.w(2.0f);
                        o1Var3.g();
                        o3.e.a(eVar3, o1Var3.f7269a, p0Var4);
                        fVar4 = eVar3.b();
                        k0.d.f7946d = fVar4;
                    }
                    b2.a(o3.b.d(fVar4, rVar4), l0.f.I(rVar4, R.string.add_cheat_folder), null, 0L, rVar4, 8, 12);
                    return yVar;
                }
                rVar4.R();
                return yVar2;
            case 23:
                n2.m mVar5 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar5 = (n2.r) mVar5;
                if (rVar5.O(intValue5 & 1, z13)) {
                    SoftInputBehaviourPreferencesFragmentKt.b(rVar5, 0);
                } else {
                    rVar5.R();
                }
                return yVar2;
            case 24:
                n2.m mVar6 = (n2.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar6 = (n2.r) mVar6;
                if (rVar6.O(intValue6 & 1, z14)) {
                    ij.a.u(false, ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.f9583a, rVar6, 48, 1);
                } else {
                    rVar6.R();
                }
                return yVar2;
            case 25:
                ((Integer) obj2).getClass();
                SoftInputBehaviourPreferencesFragmentKt.b((n2.m) obj, n2.s.F(1));
                return yVar2;
            case 26:
                y2.c cVar17 = (y2.c) obj;
                mg.l lVar = (mg.l) obj2;
                cVar17.getClass();
                lVar.getClass();
                Boolean valueOf2 = Boolean.valueOf(lVar.f9653a);
                mc.p pVar = (mc.p) q4.x.f12275d.B;
                return p7.t.y(valueOf2, pVar.j(cVar17, (q4.x) lVar.f9654b.getValue()), pVar.j(cVar17, (q4.x) lVar.f9655c.getValue()), pVar.j(cVar17, (q4.x) lVar.f9656d.getValue()));
            case 27:
                n2.m mVar7 = (n2.m) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z18 = true;
                }
                n2.r rVar7 = (n2.r) mVar7;
                if (rVar7.O(intValue7 & 1, z18)) {
                    b2.a(o3.b.d(ij.a.Q(), rVar7), l0.f.I(rVar7, R.string.cancel), null, 0L, rVar7, 8, 12);
                } else {
                    rVar7.R();
                }
                return yVar2;
            case 28:
                n2.m mVar8 = (n2.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z17 = true;
                }
                n2.r rVar8 = (n2.r) mVar8;
                if (rVar8.O(intValue8 & 1, z17)) {
                    e7.b(l0.f.I(rVar8, R.string.cheat_name), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar8, 0, 0, 131070);
                } else {
                    rVar8.R();
                }
                return yVar2;
            default:
                n2.m mVar9 = (n2.m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z16 = true;
                }
                n2.r rVar9 = (n2.r) mVar9;
                if (rVar9.O(intValue9 & 1, z16)) {
                    e7.b(l0.f.I(rVar9, R.string.error_name_cannot_be_empty), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar9, 0, 0, 131070);
                } else {
                    rVar9.R();
                }
                return yVar2;
        }
    }

    public /* synthetic */ b0(int i2, byte b10) {
        this.A = i2;
    }
}
