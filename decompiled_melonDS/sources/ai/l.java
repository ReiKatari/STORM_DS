package ai;

import android.os.Bundle;
import android.os.Parcelable;
import cd.h1;
import f1.w1;
import g2.b2;
import g2.c6;
import g2.e7;
import g2.k1;
import g2.l1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements mc.p {
    public final /* synthetic */ int A;

    public /* synthetic */ l(int i2) {
        this.A = i2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Bundle bundle;
        cc.b bVar;
        Integer num;
        int i2;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        switch (this.A) {
            case 0:
                n2.m mVar = (n2.m) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar = (n2.r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.b(l0.f.I(rVar, R.string.username), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                } else {
                    rVar.R();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar2 = (n2.m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar2 = (n2.r) mVar2;
                if (rVar2.O(intValue2 & 1, z11)) {
                    e7.b(l0.f.I(rVar2, R.string.password), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar2, 0, 0, 131070);
                } else {
                    rVar2.R();
                }
                return yb.y.f14813a;
            case 2:
                n2.m mVar3 = (n2.m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar3 = (n2.r) mVar3;
                if (rVar3.O(intValue3 & 1, z12)) {
                    String upperCase = l0.f.I(rVar3, R.string.rom_details_configuration_tab).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    e7.b(upperCase, null, ((g2.l0) rVar3.j(g2.m0.f5257a)).f(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar3, 0, 0, 131066);
                } else {
                    rVar3.R();
                }
                return yb.y.f14813a;
            case 3:
                n2.m mVar4 = (n2.m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar4 = (n2.r) mVar4;
                if (rVar4.O(intValue4 & 1, z13)) {
                    String upperCase2 = l0.f.I(rVar4, R.string.retro_achievements_tab).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    e7.b(upperCase2, null, ((g2.l0) rVar4.j(g2.m0.f5257a)).f(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 131066);
                } else {
                    rVar4.R();
                }
                return yb.y.f14813a;
            case 4:
                n2.m mVar5 = (n2.m) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                n2.r rVar5 = (n2.r) mVar5;
                if (rVar5.O(intValue5 & 1, z14)) {
                    b2.b(a.a.t(), null, null, 0L, rVar5, 48, 12);
                } else {
                    rVar5.R();
                }
                return yb.y.f14813a;
            case l1.c.f8511g /* 5 */:
                n2.m mVar6 = (n2.m) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                n2.r rVar6 = (n2.r) mVar6;
                if (rVar6.O(intValue6 & 1, z15)) {
                    b2.b(a.a.t(), null, null, 0L, rVar6, 48, 12);
                } else {
                    rVar6.R();
                }
                return yb.y.f14813a;
            case l1.c.f8509e /* 6 */:
                y2.c cVar = (y2.c) obj;
                a7.d0 d0Var = (a7.d0) obj2;
                d7.f fVar = d0Var.f552b;
                LinkedHashMap linkedHashMap = fVar.m;
                zb.j jVar = fVar.f3926f;
                LinkedHashMap linkedHashMap2 = fVar.f3932l;
                ArrayList arrayList = new ArrayList();
                Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                for (Map.Entry entry : zb.v.I(fVar.f3938s.f608a).entrySet()) {
                    String str = (String) entry.getKey();
                    ((a7.m0) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                    p7.n.q(b10, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", b10);
                } else {
                    bundle = null;
                }
                if (!jVar.isEmpty()) {
                    if (bundle == null) {
                        bundle = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator<E> it = jVar.iterator();
                    while (it.hasNext()) {
                        a7.i iVar = (a7.i) it.next();
                        iVar.getClass();
                        int i10 = iVar.B.B.f248a;
                        String str2 = iVar.Y;
                        com.squareup.picasso.m mVar7 = iVar.f576b0;
                        Bundle c4 = mVar7.c();
                        Bundle b11 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        ((q7.e) mVar7.f3261j).c(b11);
                        Bundle b12 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        str2.getClass();
                        b12.putString("nav-entry-state:id", str2);
                        b12.putInt("nav-entry-state:destination-id", i10);
                        if (c4 == null) {
                            c4 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        }
                        b12.putBundle("nav-entry-state:args", c4);
                        b12.putBundle("nav-entry-state:saved-state", b11);
                        arrayList2.add(b12);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i11 = 0;
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue7 = ((Number) entry2.getKey()).intValue();
                        String str3 = (String) entry2.getValue();
                        int i12 = i11 + 1;
                        iArr[i11] = intValue7;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i11 = i12;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    p7.n.q(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        arrayList4.add(str4);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it2 = ((zb.j) entry3.getValue()).iterator();
                        while (it2.hasNext()) {
                            h1 h1Var = ((a7.j) it2.next()).f578a;
                            h1Var.getClass();
                            Bundle b13 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                            String str5 = (String) h1Var.B;
                            str5.getClass();
                            b13.putString("nav-entry-state:id", str5);
                            b13.putInt("nav-entry-state:destination-id", h1Var.A);
                            Bundle bundle2 = (Bundle) h1Var.L;
                            if (bundle2 == null) {
                                bundle2 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                            }
                            b13.putBundle("nav-entry-state:args", bundle2);
                            Bundle bundle3 = (Bundle) h1Var.R;
                            bundle3.getClass();
                            b13.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(b13);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    p7.n.q(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (d0Var.f555e) {
                    if (bundle == null) {
                        bundle = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", d0Var.f555e);
                }
                return bundle;
            case 7:
                String str6 = (String) obj;
                cc.e eVar = (cc.e) obj2;
                str6.getClass();
                eVar.getClass();
                if (str6.length() == 0) {
                    return eVar.toString();
                }
                return str6 + ", " + eVar;
            case 8:
                cc.g gVar = (cc.g) obj;
                cc.e eVar2 = (cc.e) obj2;
                gVar.getClass();
                eVar2.getClass();
                cc.g m = gVar.m(eVar2.getKey());
                cc.h hVar = cc.h.A;
                if (m != hVar) {
                    cc.d dVar = cc.d.A;
                    zc.q qVar = (zc.q) m.t(dVar);
                    if (qVar == null) {
                        bVar = new cc.b(eVar2, m);
                    } else {
                        cc.g m10 = m.m(dVar);
                        if (m10 == hVar) {
                            return new cc.b(qVar, eVar2);
                        }
                        bVar = new cc.b(qVar, new cc.b(eVar2, m10));
                    }
                    return bVar;
                }
                return eVar2;
            case l1.c.f8508d /* 9 */:
                return Boolean.valueOf(nc.k.a(obj, obj2));
            case l1.c.f8510f /* 10 */:
                cc.e eVar3 = (cc.e) obj2;
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                cc.e eVar4 = (cc.e) obj2;
                if (!(eVar4 instanceof ed.u)) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    i2 = 1;
                }
                if (i2 == 0) {
                    return eVar4;
                }
                return Integer.valueOf(i2 + 1);
            case 12:
                ed.u uVar = (ed.u) obj;
                cc.e eVar5 = (cc.e) obj2;
                if (uVar == null) {
                    if (eVar5 instanceof ed.u) {
                        return (ed.u) eVar5;
                    }
                    return null;
                }
                return uVar;
            case 13:
                ed.x xVar = (ed.x) obj;
                cc.e eVar6 = (cc.e) obj2;
                if (eVar6 instanceof ed.u) {
                    ed.u uVar2 = (ed.u) eVar6;
                    cc.g gVar2 = xVar.f4471a;
                    ThreadLocal threadLocal = uVar2.B;
                    Object obj3 = threadLocal.get();
                    threadLocal.set(uVar2.A);
                    Object[] objArr = xVar.f4472b;
                    int i13 = xVar.f4474d;
                    objArr[i13] = obj3;
                    ed.u[] uVarArr = xVar.f4473c;
                    xVar.f4474d = i13 + 1;
                    uVarArr[i13] = uVar2;
                }
                return xVar;
            case 14:
                y2.c cVar2 = (y2.c) obj;
                return Integer.valueOf(((w1) obj2).f4669a.g());
            case l1.c.f8512h /* 15 */:
                n2.m mVar8 = (n2.m) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                n2.r rVar7 = (n2.r) mVar8;
                if (!rVar7.O(intValue8 & 1, z16)) {
                    rVar7.R();
                }
                return yb.y.f14813a;
            case 16:
                n2.m mVar9 = (n2.m) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                n2.r rVar8 = (n2.r) mVar9;
                if (!rVar8.O(intValue9 & 1, z17)) {
                    rVar8.R();
                }
                return yb.y.f14813a;
            case 17:
                n2.m mVar10 = (n2.m) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                n2.r rVar9 = (n2.r) mVar10;
                if (!rVar9.O(intValue10 & 1, z18)) {
                    rVar9.R();
                }
                return yb.y.f14813a;
            case 18:
                n2.m mVar11 = (n2.m) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                n2.r rVar10 = (n2.r) mVar11;
                if (!rVar10.O(intValue11 & 1, z19)) {
                    rVar10.R();
                }
                return yb.y.f14813a;
            case 19:
                n2.m mVar12 = (n2.m) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                n2.r rVar11 = (n2.r) mVar12;
                if (!rVar11.O(intValue12 & 1, z20)) {
                    rVar11.R();
                }
                return yb.y.f14813a;
            case 20:
                n2.m mVar13 = (n2.m) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z21 = true;
                } else {
                    z21 = false;
                }
                n2.r rVar12 = (n2.r) mVar13;
                if (!rVar12.O(intValue13 & 1, z21)) {
                    rVar12.R();
                }
                return yb.y.f14813a;
            case 21:
                n2.m mVar14 = (n2.m) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z22 = true;
                } else {
                    z22 = false;
                }
                n2.r rVar13 = (n2.r) mVar14;
                if (rVar13.O(intValue14 & 1, z22)) {
                    c6.f5073a.a(null, 0.0f, 0L, rVar13, 3072);
                } else {
                    rVar13.R();
                }
                return yb.y.f14813a;
            case 22:
                y2.c cVar3 = (y2.c) obj;
                return (l1) ((k1) obj2).f5215a.f5269g.getValue();
            case 23:
                return Integer.valueOf(((y3.u0) obj).h0(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((y3.u0) obj).g0(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((y3.u0) obj).b0(((Integer) obj2).intValue()));
            case 26:
                return Integer.valueOf(((y3.u0) obj).g(((Integer) obj2).intValue()));
            case 27:
                return Integer.valueOf(((y3.u0) obj).g0(((Integer) obj2).intValue()));
            default:
                return Integer.valueOf(((y3.u0) obj).h0(((Integer) obj2).intValue()));
        }
    }
}
