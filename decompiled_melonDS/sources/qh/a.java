package qh;

import b3.p;
import cd.k;
import f2.i1;
import f2.j1;
import f3.g;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.l0;
import g2.m0;
import java.util.Locale;
import l0.f;
import l1.p1;
import mc.q;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.l;
import n2.m;
import n2.r;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int A;

    public /* synthetic */ a(int i2) {
        this.A = i2;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        switch (this.A) {
            case 0:
                m mVar = (m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    e7.b(f.I(rVar, 17039360), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar, 0, 0, 131070);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                p pVar = (p) obj;
                ((Integer) obj3).getClass();
                r rVar2 = (r) ((m) obj2);
                rVar2.X(-2126899193);
                long j2 = ((i1) rVar2.j(j1.f4748a)).f4746a;
                boolean e6 = rVar2.e(j2);
                Object L = rVar2.L();
                if (e6 || L == l.f9953a) {
                    L = new k(14, j2);
                    rVar2.h0(L);
                }
                p f8 = pVar.f(g.e(b3.m.f1770a, (mc.l) L));
                rVar2.p(false);
                return f8;
            case 2:
                m mVar2 = (m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar3 = (r) mVar2;
                if (rVar3.O(intValue2 & 1, z11)) {
                    String upperCase = f.I(rVar3, R.string.cancel).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    e7.b(upperCase, null, ((l0) rVar3.j(m0.f5257a)).i(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar3.j(g7.f5161b)).f5152k, rVar3, 0, 0, 65530);
                } else {
                    rVar3.R();
                }
                return y.f14813a;
            case 3:
                m mVar3 = (m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r rVar4 = (r) mVar3;
                if (rVar4.O(intValue3 & 1, z12)) {
                    e7.b(f.I(rVar4, R.string.edit), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar4, 0, 0, 131070);
                } else {
                    rVar4.R();
                }
                return y.f14813a;
            case 4:
                m mVar4 = (m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                r rVar5 = (r) mVar4;
                if (rVar5.O(intValue4 & 1, z13)) {
                    e7.b(f.I(rVar5, R.string.delete), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar5, 0, 0, 131070);
                } else {
                    rVar5.R();
                }
                return y.f14813a;
            case l1.c.f8511g /* 5 */:
                m mVar5 = (m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                r rVar6 = (r) mVar5;
                if (rVar6.O(intValue5 & 1, z14)) {
                    e7.b(f.I(rVar6, R.string.dsiware_manager_import_data), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar6, 0, 0, 131070);
                } else {
                    rVar6.R();
                }
                return y.f14813a;
            case l1.c.f8509e /* 6 */:
                m mVar6 = (m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                r rVar7 = (r) mVar6;
                if (rVar7.O(intValue6 & 1, z15)) {
                    e7.b(f.I(rVar7, R.string.dsiware_manager_export_data), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar7, 0, 0, 131070);
                } else {
                    rVar7.R();
                }
                return y.f14813a;
            case 7:
                m mVar7 = (m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                r rVar8 = (r) mVar7;
                if (rVar8.O(intValue7 & 1, z16)) {
                    e7.b(f.I(rVar8, R.string.delete), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar8, 0, 0, 131070);
                } else {
                    rVar8.R();
                }
                return y.f14813a;
            case 8:
                m mVar8 = (m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                r rVar9 = (r) mVar8;
                if (rVar9.O(intValue8 & 1, z17)) {
                    String upperCase2 = f.I(rVar9, R.string.dsiware_manager_setup).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    e7.b(upperCase2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar9, 0, 0, 131070);
                } else {
                    rVar9.R();
                }
                return y.f14813a;
            default:
                m mVar9 = (m) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                r rVar10 = (r) mVar9;
                if (rVar10.O(intValue9 & 1, z18)) {
                    String upperCase3 = f.I(rVar10, R.string.dsiware_manager_fix_setup).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    e7.b(upperCase3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar10, 0, 0, 131070);
                } else {
                    rVar10.R();
                }
                return y.f14813a;
        }
    }
}
