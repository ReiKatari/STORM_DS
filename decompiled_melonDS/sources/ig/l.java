package ig;

import a4.f0;
import ai.o;
import android.content.Context;
import b4.q1;
import c1.c1;
import c1.e0;
import c1.p;
import c1.y1;
import f1.n;
import g2.h0;
import g2.l5;
import g3.z;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import l1.c2;
import l1.d1;
import l1.r1;
import l1.s;
import mc.q;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
import n2.r;
import n2.t2;
import n2.w0;
import y3.v0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f7075b0;

    public /* synthetic */ l(rg.d dVar, w0 w0Var, String str, String[] strArr, w0 w0Var2, w0 w0Var3, b1 b1Var) {
        this.A = 1;
        this.L = dVar;
        this.B = w0Var;
        this.R = str;
        this.X = strArr;
        this.Y = w0Var2;
        this.Z = w0Var3;
        this.f7075b0 = b1Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        String str;
        String str2;
        boolean z11;
        int i2;
        boolean z12;
        boolean z13;
        int i10;
        int i11 = this.A;
        String str3 = "";
        y yVar = y.f14813a;
        n2.e eVar = n2.l.f9953a;
        Object obj4 = this.f7075b0;
        Object obj5 = this.Z;
        Object obj6 = this.B;
        Object obj7 = this.Y;
        Object obj8 = this.X;
        Object obj9 = this.R;
        Object obj10 = this.L;
        switch (i11) {
            case 0:
                y1 y1Var = (y1) obj10;
                oe.a aVar = (oe.a) obj9;
                p pVar = (p) obj8;
                Context context = (Context) obj7;
                w0 w0Var = (w0) obj6;
                s9.a aVar2 = (s9.a) obj5;
                mc.a aVar3 = (mc.a) obj4;
                n2.m mVar = (n2.m) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((d1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    WeakHashMap weakHashMap = c2.f8518w;
                    l1.y1 y1Var2 = s.f(rVar).f8532o;
                    b3.m mVar2 = b3.m.f1770a;
                    b3.p C = l1.c.C(mVar2, y1Var2);
                    v0 d4 = l1.p.d(b3.c.A, false);
                    int hashCode = Long.hashCode(rVar.T);
                    v2.g l10 = rVar.l();
                    b3.p c4 = b3.a.c(C, rVar);
                    a4.h.f220a.getClass();
                    f0 f0Var = a4.g.f212b;
                    rVar.b0();
                    if (rVar.S) {
                        rVar.k(f0Var);
                    } else {
                        rVar.k0();
                    }
                    n2.s.C(d4, a4.g.f215e, rVar);
                    n2.s.C(l10, a4.g.f214d, rVar);
                    n2.s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
                    n2.s.y(rVar, a4.g.f217g);
                    n2.s.C(c4, a4.g.f213c, rVar);
                    rVar.X(-1052246202);
                    UUID uuid = aVar.f10905a;
                    if (uuid != null) {
                        str = uuid.toString();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    y1Var.getClass();
                    b3.p f8 = y1.e(y1Var, mVar2, y1.c(str2, rVar), pVar).f(r1.f8615c);
                    Object L = rVar.L();
                    if (L == eVar) {
                        L = new ai.s(w0Var, 8);
                        rVar.h0(L);
                    }
                    b3.p h2 = n.h(f8, null, null, false, null, (mc.a) L, 28);
                    m9.h hVar = new m9.h(context);
                    hVar.f9388c = aVar.f10907c;
                    hVar.f9390e = new d7.c(context, false);
                    c9.m.b(hVar.a(), h2, rVar, 48, 4088);
                    rVar.p(false);
                    b3.p e6 = s.f8618b.e(mVar2, b3.c.B);
                    boolean booleanValue = ((Boolean) w0Var.getValue()).booleanValue();
                    Object L2 = rVar.L();
                    if (L2 == eVar) {
                        L2 = new l5(16);
                        rVar.h0(L2);
                    }
                    c1 a10 = c1.w0.i((mc.l) L2, 1).a(c1.w0.d(null, 3));
                    Object L3 = rVar.L();
                    if (L3 == eVar) {
                        L3 = new l5(17);
                        rVar.h0(L3);
                    }
                    e0.d(booleanValue, e6, a10, c1.w0.k((mc.l) L3).a(c1.w0.e(null, 3)), null, v2.h.c(1323152816, new ai.v0(4, aVar2, aVar3), rVar), rVar, 200064);
                    rVar.p(true);
                } else {
                    rVar.R();
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                rg.d dVar = (rg.d) obj10;
                w0 w0Var2 = (w0) obj6;
                String str4 = (String) obj9;
                String[] strArr = (String[]) obj8;
                w0 w0Var3 = (w0) obj7;
                w0 w0Var4 = (w0) obj5;
                b1 b1Var = (b1) obj4;
                d1 d1Var = (d1) obj;
                n2.m mVar3 = (n2.m) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                d1Var.getClass();
                if ((intValue2 & 6) == 0) {
                    if (((r) mVar3).f(d1Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar3;
                if (rVar2.O(intValue2 & 1, z11)) {
                    String I = l0.f.I(rVar2, R.string.layout_name);
                    String str5 = (String) w0Var2.getValue();
                    if (str5 == null) {
                        str5 = kc.a.h(rVar2, 1779153475, R.string.not_set, rVar2, false);
                    } else {
                        rVar2.X(1779153227);
                        rVar2.p(false);
                    }
                    String str6 = str5;
                    boolean f10 = rVar2.f(dVar) | rVar2.f(w0Var2) | rVar2.f(str4);
                    Object L4 = rVar2.L();
                    if (f10 || L4 == eVar) {
                        L4 = new ai.p(dVar, str4, w0Var2);
                        rVar2.h0(L4);
                    }
                    t2 t2Var = q1.f1924n;
                    ug.b.a(I, str6, false, (mc.a) L4, l1.c.j(d1Var, (x4.m) rVar2.j(t2Var)), rVar2, 0, 4);
                    String I2 = l0.f.I(rVar2, R.string.layout_orientation);
                    int ordinal = ((ve.d) w0Var3.getValue()).ordinal();
                    if (ordinal >= 0 && ordinal < strArr.length) {
                        str3 = strArr[ordinal];
                    }
                    String str7 = str3;
                    List Q = zb.k.Q(strArr);
                    int ordinal2 = ((ve.d) w0Var3.getValue()).ordinal();
                    boolean f11 = rVar2.f(w0Var3);
                    Object L5 = rVar2.L();
                    if (f11 || L5 == eVar) {
                        L5 = new o(w0Var3, 6);
                        rVar2.h0(L5);
                    }
                    ug.b.d(I2, str7, Q, ordinal2, (mc.l) L5, false, l1.c.j(d1Var, (x4.m) rVar2.j(t2Var)), rVar2, 0, 32);
                    String I3 = l0.f.I(rVar2, R.string.layout_use_default_opacity);
                    boolean z14 = !((Boolean) w0Var4.getValue()).booleanValue();
                    boolean f12 = rVar2.f(w0Var4);
                    Object L6 = rVar2.L();
                    if (f12 || L6 == eVar) {
                        L6 = new o(w0Var4, 7);
                        rVar2.h0(L6);
                    }
                    ug.b.e(I3, z14, (mc.l) L6, l1.c.j(d1Var, (x4.m) rVar2.j(t2Var)), rVar2, 0);
                    String I4 = l0.f.I(rVar2, R.string.layout_opacity);
                    float g10 = b1Var.g();
                    sc.a aVar4 = new sc.a(0.0f, 100.0f);
                    boolean booleanValue2 = ((Boolean) w0Var4.getValue()).booleanValue();
                    boolean f13 = rVar2.f(b1Var);
                    Object L7 = rVar2.L();
                    if (f13 || L7 == eVar) {
                        L7 = new mh.r(b1Var, 1);
                        rVar2.h0(L7);
                    }
                    ug.b.b(I4, g10, aVar4, booleanValue2, (mc.l) L7, l1.c.j(d1Var, (x4.m) rVar2.j(t2Var)), rVar2, 0);
                } else {
                    rVar2.R();
                }
                return yVar;
            default:
                z zVar = (z) obj10;
                List list = (List) obj9;
                UUID uuid2 = (UUID) obj8;
                mc.l lVar = (mc.l) obj7;
                mc.l lVar2 = (mc.l) obj6;
                cd.w0 w0Var5 = (cd.w0) obj5;
                mc.l lVar3 = (mc.l) obj4;
                d1 d1Var2 = (d1) obj;
                n2.m mVar4 = (n2.m) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                d1Var2.getClass();
                if ((intValue3 & 6) == 0) {
                    z12 = true;
                    if (((r) mVar4).f(d1Var2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue3 |= i10;
                } else {
                    z12 = true;
                }
                int i12 = intValue3;
                if ((i12 & 19) != 18) {
                    z13 = z12;
                } else {
                    z13 = false;
                }
                r rVar3 = (r) mVar4;
                if (rVar3.O(i12 & 1, z13)) {
                    b3.p k10 = l1.c.k(g3.d.k(r1.f8615c, zVar), d1Var2);
                    boolean h10 = rVar3.h(list) | rVar3.h(uuid2) | rVar3.f(lVar) | rVar3.f(lVar2) | rVar3.h(w0Var5) | rVar3.f(lVar3);
                    Object L8 = rVar3.L();
                    if (h10 || L8 == eVar) {
                        L8 = new h0(list, uuid2, lVar, lVar2, w0Var5, lVar3, 3);
                        rVar3.h0(L8);
                    }
                    k0.d.c(k10, null, d1Var2, null, null, null, false, null, (mc.l) L8, rVar3, (i12 << 6) & 896, 506);
                } else {
                    rVar3.R();
                }
                return yVar;
        }
    }

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, yb.d dVar, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = obj4;
        this.B = obj5;
        this.Z = obj6;
        this.f7075b0 = dVar;
    }
}
