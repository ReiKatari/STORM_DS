package ai;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import d1.l1;
import d1.v1;
import g2.b2;
import g2.c2;
import g2.e5;
import g2.e7;
import g2.f7;
import g2.g7;
import g2.w4;
import g2.w6;
import g2.y4;
import j0.o1;
import java.io.InputStream;
import java.util.Locale;
import l1.p1;
import l1.r1;
import mc.p;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import org.xmlpull.v1.XmlPullParserException;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class m implements mc.q {
    public final /* synthetic */ int A;

    public /* synthetic */ m(int i2) {
        this.A = i2;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean h2;
        Object v1Var;
        boolean z13;
        int i2 = this.A;
        b3.m mVar = b3.m.f1770a;
        int i10 = 4;
        yb.y yVar = yb.y.f14813a;
        boolean z14 = false;
        switch (i2) {
            case 0:
                n2.m mVar2 = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar = (n2.r) mVar2;
                if (rVar.O(1 & intValue, z14)) {
                    String upperCase = l0.f.I(rVar, R.string.cancel).toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    e7.b(upperCase, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar.j(g7.f5161b)).f5152k, rVar, 0, 0, 65534);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.m mVar3 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar2 = (n2.r) mVar3;
                if (rVar2.O(1 & intValue2, z14)) {
                    String upperCase2 = l0.f.I(rVar2, R.string.login).toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    e7.b(upperCase2, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar2.j(g7.f5161b)).f5152k, rVar2, 0, 0, 65534);
                } else {
                    rVar2.R();
                }
                return yVar;
            case 2:
                n2.m mVar4 = (n2.m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar3 = (n2.r) mVar4;
                if (rVar3.O(1 & intValue3, z14)) {
                    b2.a(k7.w.z(rVar3, R.drawable.ic_status_warn), null, r1.f8615c, ((f7) rVar3.j(g7.f5161b)).f5150i.b(), rVar3, 440, 0);
                } else {
                    rVar3.R();
                }
                return yVar;
            case 3:
                n2.m mVar5 = (n2.m) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar4 = (n2.r) mVar5;
                if (rVar4.O(1 & intValue4, z14)) {
                    f1.n.b(k7.w.z(rVar4, R.drawable.ic_points), r1.f8615c, null, null, 0.0f, rVar4, 440, 120);
                } else {
                    rVar4.R();
                }
                return yVar;
            case 4:
                n2.m mVar6 = (n2.m) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar5 = (n2.r) mVar6;
                if (rVar5.O(1 & intValue5, z14)) {
                    b2.a(k7.w.z(rVar5, R.drawable.ic_status_warn), null, r1.f8615c, ((f7) rVar5.j(g7.f5161b)).f5153l.b(), rVar5, 440, 0);
                } else {
                    rVar5.R();
                }
                return yVar;
            case l1.c.f8511g /* 5 */:
                n2.m mVar7 = (n2.m) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar6 = (n2.r) mVar7;
                if (rVar6.O(intValue6 & 1, z14)) {
                    b3.p i11 = r1.i(mVar, 18);
                    Resources resources = (Resources) rVar6.j(b4.r0.f1938c);
                    Resources.Theme theme = ((Context) rVar6.j(b4.r0.f1937b)).getTheme();
                    boolean f8 = rVar6.f(resources.getConfiguration()) | rVar6.d(R.drawable.ic_link) | rVar6.f(resources) | rVar6.f(theme);
                    Object L = rVar6.L();
                    if (f8 || L == n2.l.f9953a) {
                        TypedValue typedValue = new TypedValue();
                        resources.getValue(R.drawable.ic_link, typedValue, true);
                        XmlResourceParser xml = resources.getXml(R.drawable.ic_link);
                        int next = xml.next();
                        while (next != 2 && next != 1) {
                            next = xml.next();
                        }
                        if (next == 2) {
                            L = pc.a.D(theme, resources, xml, typedValue.changingConfigurations).f5555a;
                            rVar6.h0(L);
                        } else {
                            throw new XmlPullParserException("No start tag found");
                        }
                    }
                    b2.b((o3.f) L, null, i11, 0L, rVar6, 432, 8);
                    l1.c.d(r1.l(mVar, 4), rVar6);
                    String upperCase3 = l0.f.I(rVar6, R.string.view_achievement).toUpperCase(Locale.ROOT);
                    upperCase3.getClass();
                    e7.b(upperCase3, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, ((f7) rVar6.j(g7.f5161b)).f5152k, rVar6, 0, 0, 65534);
                } else {
                    rVar6.R();
                }
                return yVar;
            case l1.c.f8509e /* 6 */:
                n2.m mVar8 = (n2.m) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar7 = (n2.r) mVar8;
                if (rVar7.O(1 & intValue7, z14)) {
                    String upperCase4 = l0.f.I(rVar7, R.string.play).toUpperCase(Locale.ROOT);
                    upperCase4.getClass();
                    e7.b(upperCase4, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar7, 0, 0, 131070);
                } else {
                    rVar7.R();
                }
                return yVar;
            case 7:
                n2.m mVar9 = (n2.m) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar8 = (n2.r) mVar9;
                if (rVar8.O(1 & intValue8, z14)) {
                    String upperCase5 = l0.f.I(rVar8, R.string.login_with_retro_achievements).toUpperCase(Locale.ROOT);
                    upperCase5.getClass();
                    e7.b(upperCase5, null, 0L, 0L, null, 0L, new w4.k(3), 0L, 0, false, 0, 0, null, null, rVar8, 0, 0, 130558);
                } else {
                    rVar8.R();
                }
                return yVar;
            case 8:
                n2.m mVar10 = (n2.m) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar9 = (n2.r) mVar10;
                if (rVar9.O(1 & intValue9, z14)) {
                    f1.n.b(k7.w.z(rVar9, R.drawable.ic_points), r1.f8615c, null, null, 0.0f, rVar9, 440, 120);
                } else {
                    rVar9.R();
                }
                return yVar;
            case l1.c.f8508d /* 9 */:
                n2.m mVar11 = (n2.m) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar10 = (n2.r) mVar11;
                if (rVar10.O(1 & intValue10, z14)) {
                    f1.n.b(k7.w.z(rVar10, R.drawable.ic_completed), r1.f8615c, null, null, 0.0f, rVar10, 440, 120);
                } else {
                    rVar10.R();
                }
                return yVar;
            case l1.c.f8510f /* 10 */:
                n2.m mVar12 = (n2.m) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar11 = (n2.r) mVar12;
                if (rVar11.O(1 & intValue11, z14)) {
                    String upperCase6 = l0.f.I(rVar11, R.string.login_with_retro_achievements).toUpperCase(Locale.ROOT);
                    upperCase6.getClass();
                    e7.b(upperCase6, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar11, 0, 0, 131070);
                } else {
                    rVar11.R();
                }
                return yVar;
            case 11:
                n2.m mVar13 = (n2.m) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar12 = (n2.r) mVar13;
                if (rVar12.O(1 & intValue12, z14)) {
                    String upperCase7 = l0.f.I(rVar12, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase7.getClass();
                    e7.b(upperCase7, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar12, 0, 0, 131070);
                } else {
                    rVar12.R();
                }
                return yVar;
            case 12:
                g1.c cVar = (g1.c) obj;
                n2.m mVar14 = (n2.m) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                if ((intValue13 & 6) == 0) {
                    if (!((n2.r) mVar14).f(cVar)) {
                        i10 = 2;
                    }
                    intValue13 |= i10;
                }
                if ((intValue13 & 19) != 18) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n2.r rVar13 = (n2.r) mVar14;
                if (rVar13.O(intValue13 & 1, z10)) {
                    l1.p.a(f1.n.f(r1.c(r1.b(l1.c.v(mVar, 0.0f, g1.f.f5031l, 1), 1.0f), g1.f.f5030k), cVar.f5016c, i3.z.f6703b), rVar13, 0);
                } else {
                    rVar13.R();
                }
                return yVar;
            case 13:
                p1 p1Var = (p1) obj;
                n2.m mVar15 = (n2.m) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar14 = (n2.r) mVar15;
                if (!rVar14.O(1 & intValue14, z14)) {
                    rVar14.R();
                }
                return yVar;
            case 14:
                p1 p1Var2 = (p1) obj;
                n2.m mVar16 = (n2.m) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar15 = (n2.r) mVar16;
                if (!rVar15.O(1 & intValue15, z14)) {
                    rVar15.R();
                }
                return yVar;
            case l1.c.f8512h /* 15 */:
                y4 y4Var = (y4) obj;
                n2.m mVar17 = (n2.m) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                if ((intValue16 & 6) == 0) {
                    if (!((n2.r) mVar17).f(y4Var)) {
                        i10 = 2;
                    }
                    intValue16 |= i10;
                }
                if ((intValue16 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                n2.r rVar16 = (n2.r) mVar17;
                if (rVar16.O(intValue16 & 1, z11)) {
                    g2.n0.g(y4Var, null, null, rVar16, intValue16 & 14);
                } else {
                    rVar16.R();
                }
                return yVar;
            case 16:
                y4 y4Var2 = (y4) obj;
                n2.m mVar18 = (n2.m) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                if ((intValue17 & 6) == 0) {
                    if (!((n2.r) mVar18).f(y4Var2)) {
                        i10 = 2;
                    }
                    intValue17 |= i10;
                }
                if ((intValue17 & 19) != 18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                n2.r rVar17 = (n2.r) mVar18;
                if (rVar17.O(intValue17 & 1, z12)) {
                    g2.n0.g(y4Var2, null, null, rVar17, intValue17 & 14);
                } else {
                    rVar17.R();
                }
                return yVar;
            case 17:
                boolean z15 = true;
                w4 w4Var = (w4) obj;
                n2.m mVar19 = (n2.m) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                if ((intValue18 & 6) == 0) {
                    if ((intValue18 & 8) == 0) {
                        h2 = ((n2.r) mVar19).f(w4Var);
                    } else {
                        h2 = ((n2.r) mVar19).h(w4Var);
                    }
                    if (!h2) {
                        i10 = 2;
                    }
                    intValue18 |= i10;
                }
                if ((intValue18 & 19) == 18) {
                    z15 = false;
                }
                n2.r rVar18 = (n2.r) mVar19;
                if (rVar18.O(intValue18 & 1, z15)) {
                    e5.c(w4Var, null, null, 0L, 0L, 0L, 0.0f, rVar18, intValue18 & 14);
                } else {
                    rVar18.R();
                }
                return yVar;
            case 18:
                l1 l1Var = (l1) obj;
                ((Integer) obj3).getClass();
                n2.r rVar19 = (n2.r) ((n2.m) obj2);
                rVar19.X(1849239065);
                c2 c2Var = c2.Focused;
                c2 c2Var2 = c2.UnfocusedEmpty;
                if (l1Var.b(c2Var, c2Var2)) {
                    v1Var = d1.d.r(67, 0, d1.w.f3689c, 2);
                } else if (!l1Var.b(c2Var2, c2Var) && !l1Var.b(c2.UnfocusedNotEmpty, c2Var2)) {
                    v1Var = d1.d.q(7, null);
                } else {
                    v1Var = new v1(83, 67, d1.w.f3689c);
                }
                rVar19.p(false);
                return v1Var;
            case 19:
                n2.m mVar20 = (n2.m) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue19 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar20 = (n2.r) mVar20;
                if (rVar20.O(intValue19 & 1, z14)) {
                    e7.b(l0.f.I(rVar20, R.string.preview), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar20, 0, 0, 131070);
                } else {
                    rVar20.R();
                }
                return yVar;
            case 20:
                n2.m mVar21 = (n2.m) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue20 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar21 = (n2.r) mVar21;
                if (rVar21.O(intValue20 & 1, z14)) {
                    e7.b(l0.f.I(rVar21, R.string.delete), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar21, 0, 0, 131070);
                } else {
                    rVar21.R();
                }
                return yVar;
            case 21:
                InputStream inputStream = (InputStream) obj;
                mc.l lVar = (mc.l) obj2;
                mc.p pVar = (mc.p) obj3;
                inputStream.getClass();
                lVar.getClass();
                pVar.getClass();
                byte[] bArr = new byte[352];
                inputStream.read(bArr);
                pVar.j("header", bArr);
                String str = new String(bArr, 12, 4, vc.a.f13781a);
                int k10 = a.a.k(32, bArr);
                final int k11 = a.a.k(44, bArr);
                int k12 = a.a.k(48, bArr);
                final int k13 = a.a.k(60, bArr);
                int k14 = a.a.k(104, bArr);
                ji.e eVar = new ji.e(k10, new mc.p() { // from class: ji.c
                    @Override // mc.p
                    public final Object j(Object obj4, Object obj5) {
                        InputStream inputStream2 = (InputStream) obj4;
                        p pVar2 = (p) obj5;
                        switch (r2) {
                            case 0:
                                inputStream2.getClass();
                                pVar2.getClass();
                                byte[] bArr2 = new byte[k11];
                                inputStream2.read(bArr2);
                                pVar2.j("arm9Bootcode", bArr2);
                                break;
                            default:
                                inputStream2.getClass();
                                pVar2.getClass();
                                byte[] bArr3 = new byte[k11];
                                inputStream2.read(bArr3);
                                pVar2.j("arm7Bootcode", bArr3);
                                break;
                        }
                        return y.f14813a;
                    }
                });
                ji.e eVar2 = new ji.e(k12, new mc.p() { // from class: ji.c
                    @Override // mc.p
                    public final Object j(Object obj4, Object obj5) {
                        InputStream inputStream2 = (InputStream) obj4;
                        p pVar2 = (p) obj5;
                        switch (r2) {
                            case 0:
                                inputStream2.getClass();
                                pVar2.getClass();
                                byte[] bArr2 = new byte[k13];
                                inputStream2.read(bArr2);
                                pVar2.j("arm9Bootcode", bArr2);
                                break;
                            default:
                                inputStream2.getClass();
                                pVar2.getClass();
                                byte[] bArr3 = new byte[k13];
                                inputStream2.read(bArr3);
                                pVar2.j("arm7Bootcode", bArr3);
                                break;
                        }
                        return y.f14813a;
                    }
                });
                ji.e eVar3 = new ji.e(k14, new w6(8));
                char charAt = str.charAt(0);
                if (charAt != 'H' && charAt != 'K') {
                    pVar.j("isDsiWareTitle", Boolean.FALSE);
                } else {
                    lVar.k(new ji.e(564L, new w6(9)));
                }
                lVar.k(eVar);
                lVar.k(eVar2);
                lVar.k(eVar3);
                return yVar;
            case 22:
                n2.m mVar22 = (n2.m) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue21 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar22 = (n2.r) mVar22;
                if (rVar22.O(intValue21 & 1, z14)) {
                    String upperCase8 = l0.f.I(rVar22, R.string.save).toUpperCase(Locale.ROOT);
                    upperCase8.getClass();
                    e7.b(upperCase8, null, ((g2.l0) rVar22.j(g2.m0.f5257a)).i(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar22, 0, 0, 131066);
                } else {
                    rVar22.R();
                }
                return yVar;
            case 23:
                n2.m mVar23 = (n2.m) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue22 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar23 = (n2.r) mVar23;
                if (rVar23.O(intValue22 & 1, z14)) {
                    String upperCase9 = l0.f.I(rVar23, R.string.retry).toUpperCase(Locale.ROOT);
                    upperCase9.getClass();
                    e7.b(upperCase9, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar23, 0, 0, 131070);
                } else {
                    rVar23.R();
                }
                return yVar;
            case 24:
                n2.m mVar24 = (n2.m) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue23 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar24 = (n2.r) mVar24;
                if (rVar24.O(intValue23 & 1, z14)) {
                    b2.a(k7.w.z(rVar24, R.drawable.ic_trophy), null, r1.f8615c, ((g2.l0) rVar24.j(g2.m0.f5257a)).i(), rVar24, 440, 0);
                } else {
                    rVar24.R();
                }
                return yVar;
            case 25:
                n2.m mVar25 = (n2.m) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue24 & 17) != 16) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                n2.r rVar25 = (n2.r) mVar25;
                if (rVar25.O(intValue24 & 1, z13)) {
                    l1.e0 e0Var = r1.f8615c;
                    o3.f fVar = l0.f.Z;
                    if (fVar == null) {
                        o3.e eVar4 = new o3.e("Filled.Leaderboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = o3.h0.f10763a;
                        i3.p0 p0Var = new i3.p0(i3.s.f6681b);
                        o1 o1Var = new o1(2, false);
                        o1Var.q(7.5f, 21.0f);
                        o1Var.m(2.0f);
                        o1Var.v(9.0f);
                        o1Var.n(5.5f);
                        o1Var.v(21.0f);
                        o1Var.g();
                        o1Var.q(14.75f, 3.0f);
                        o1Var.n(-5.5f);
                        o1Var.w(18.0f);
                        o1Var.n(5.5f);
                        o1Var.v(3.0f);
                        o1Var.g();
                        o1Var.q(22.0f, 11.0f);
                        o1Var.n(-5.5f);
                        o1Var.w(10.0f);
                        o1Var.m(22.0f);
                        o1Var.v(11.0f);
                        o1Var.g();
                        o3.e.a(eVar4, o1Var.f7269a, p0Var);
                        fVar = eVar4.b();
                        l0.f.Z = fVar;
                    }
                    b2.b(fVar, null, e0Var, ((g2.l0) rVar25.j(g2.m0.f5257a)).i(), rVar25, 432, 0);
                } else {
                    rVar25.R();
                }
                return yVar;
            case 26:
                n2.m mVar26 = (n2.m) obj2;
                int intValue25 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue25 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar26 = (n2.r) mVar26;
                if (rVar26.O(intValue25 & 1, z14)) {
                    f1.n.b(k7.w.z(rVar26, R.drawable.ic_completed), r1.f8615c, null, null, 0.0f, rVar26, 440, 120);
                } else {
                    rVar26.R();
                }
                return yVar;
            case 27:
                n2.m mVar27 = (n2.m) obj2;
                int intValue26 = ((Integer) obj3).intValue();
                ((String) obj).getClass();
                if ((intValue26 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar27 = (n2.r) mVar27;
                if (rVar27.O(intValue26 & 1, z14)) {
                    f1.n.b(k7.w.z(rVar27, R.drawable.ic_completed), r1.f8615c, null, null, 0.0f, rVar27, 440, 120);
                } else {
                    rVar27.R();
                }
                return yVar;
            case 28:
                n2.m mVar28 = (n2.m) obj2;
                int intValue27 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue27 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar28 = (n2.r) mVar28;
                if (rVar28.O(intValue27 & 1, z14)) {
                    e7.b(l0.f.I(rVar28, R.string.edit), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar28, 0, 0, 131070);
                } else {
                    rVar28.R();
                }
                return yVar;
            default:
                n2.m mVar29 = (n2.m) obj2;
                int intValue28 = ((Integer) obj3).intValue();
                ((p1) obj).getClass();
                if ((intValue28 & 17) != 16) {
                    z14 = true;
                }
                n2.r rVar29 = (n2.r) mVar29;
                if (rVar29.O(intValue28 & 1, z14)) {
                    e7.b(l0.f.I(rVar29, R.string.delete), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, rVar29, 0, 0, 131070);
                } else {
                    rVar29.R();
                }
                return yVar;
        }
    }
}
