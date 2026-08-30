package wh;

import a2.g;
import ai.i0;
import android.content.Context;
import android.content.res.Resources;
import androidx.fragment.app.b1;
import b4.r0;
import b7.w;
import e.k;
import g2.l0;
import g2.m0;
import g2.r3;
import g2.t3;
import g2.y4;
import g3.z;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import l1.c2;
import mc.p;
import mg.m;
import n2.l;
import n2.p1;
import n2.r;
import n2.s;
import n2.w0;
import nc.i;
import p7.j;
import u1.h1;
import u1.l1;
import v2.h;
import yb.y;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final v2.c f14217a = new v2.c(633594476, false, new m(16, (byte) 0));

    /* renamed from: b  reason: collision with root package name */
    public static final v2.c f14218b = new v2.c(-1238130131, false, new m(17, (byte) 0));

    /* renamed from: c  reason: collision with root package name */
    public static final v2.c f14219c = new v2.c(1912198812, false, new m(18, (byte) 0));

    /* renamed from: d  reason: collision with root package name */
    public static final v2.c f14220d = new v2.c(-1660755403, false, new m(19, (byte) 0));

    /* renamed from: e  reason: collision with root package name */
    public static final v2.c f14221e = new v2.c(-946914359, false, new qh.a(3));

    /* renamed from: f  reason: collision with root package name */
    public static final v2.c f14222f = new v2.c(1726635264, false, new qh.a(4));

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0240, code lost:
        if (r4 == r3) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(ve.f r42, boolean r43, mc.a r44, mc.a r45, mc.a r46, n2.m r47, int r48) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh.a.a(ve.f, boolean, mc.a, mc.a, mc.a, n2.m, int):void");
    }

    public static final void b(xh.b bVar, mc.a aVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        xh.b bVar2;
        mc.a aVar2;
        r rVar;
        UUID uuid;
        k kVar;
        bVar.getClass();
        aVar.getClass();
        r rVar2 = (r) mVar;
        rVar2.Z(-1859478006);
        if (rVar2.h(bVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar2.h(aVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i13 & 1, z10)) {
            Context context = (Context) rVar2.j(r0.f1937b);
            s9.a a10 = s9.c.a(rVar2);
            w0 l10 = j.l(bVar.f14625d, rVar2);
            w0 l11 = j.l(bVar.f(), rVar2);
            b1 b1Var = new b1(4);
            Object L = rVar2.L();
            n2.e eVar = l.f9953a;
            if (L == eVar) {
                L = new h1(11);
                rVar2.h0(L);
            }
            k S = a.a.S(b1Var, (mc.l) L, rVar2, 48);
            s9.a.b(a10, ((l0) rVar2.j(m0.f5257a)).h());
            a10.a(false);
            List list = (List) l10.getValue();
            if (list == null) {
                list = q.A;
            }
            List list2 = list;
            UUID uuid2 = ((vh.b) l11.getValue()).f13835a;
            boolean h2 = rVar2.h(bVar);
            Object L2 = rVar2.L();
            if (!h2 && L2 != eVar) {
                uuid = uuid2;
                kVar = S;
            } else {
                uuid = uuid2;
                kVar = S;
                g gVar = new g(1, bVar, xh.b.class, "setSelectedLayoutId", "setSelectedLayoutId(Ljava/util/UUID;)V", 0, 0, 20);
                rVar2.h0(gVar);
                L2 = gVar;
            }
            mc.l lVar = (mc.l) ((i) L2);
            boolean h10 = rVar2.h(context) | rVar2.h(kVar);
            Object L3 = rVar2.L();
            if (h10 || L3 == eVar) {
                L3 = new b(context, kVar, 0);
                rVar2.h0(L3);
            }
            mc.a aVar3 = (mc.a) L3;
            boolean h11 = rVar2.h(context) | rVar2.h(kVar);
            Object L4 = rVar2.L();
            if (h11 || L4 == eVar) {
                L4 = new l1(3, context, kVar);
                rVar2.h0(L4);
            }
            mc.l lVar2 = (mc.l) L4;
            boolean h12 = rVar2.h(bVar);
            Object L5 = rVar2.L();
            if (h12 || L5 == eVar) {
                g gVar2 = new g(1, bVar, xh.b.class, "deleteLayout", "deleteLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 21);
                rVar2.h0(gVar2);
                L5 = gVar2;
            }
            mc.l lVar3 = (mc.l) ((i) L5);
            boolean h13 = rVar2.h(bVar);
            Object L6 = rVar2.L();
            if (!h13 && L6 != eVar) {
                bVar2 = bVar;
            } else {
                g gVar3 = new g(1, bVar, xh.b.class, "addLayout", "addLayout(Lme/magnum/melonds/domain/model/layout/LayoutConfiguration;)V", 0, 0, 22);
                bVar2 = bVar;
                rVar2.h0(gVar3);
                L6 = gVar3;
            }
            aVar2 = aVar;
            rVar = rVar2;
            c(list2, uuid, lVar, aVar3, lVar2, lVar3, (mc.l) ((i) L6), aVar2, rVar, 29360128 & (i13 << 18));
        } else {
            bVar2 = bVar;
            aVar2 = aVar;
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new qh.c(bVar2, aVar2, i2, 2);
        }
    }

    public static final void c(List list, UUID uuid, mc.l lVar, mc.a aVar, mc.l lVar2, mc.l lVar3, mc.l lVar4, mc.a aVar2, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar;
        int i11;
        y4 y4Var;
        boolean z11;
        cd.w0 w0Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        r rVar2 = (r) mVar;
        rVar2.Z(517665124);
        if ((i2 & 6) == 0) {
            if (rVar2.h(list)) {
                i19 = 4;
            } else {
                i19 = 2;
            }
            i10 = i19 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar2.h(uuid)) {
                i18 = 32;
            } else {
                i18 = 16;
            }
            i10 |= i18;
        }
        if ((i2 & 384) == 0) {
            if (rVar2.h(lVar)) {
                i17 = 256;
            } else {
                i17 = 128;
            }
            i10 |= i17;
        }
        if ((i2 & 3072) == 0) {
            if (rVar2.h(aVar)) {
                i16 = 2048;
            } else {
                i16 = 1024;
            }
            i10 |= i16;
        }
        if ((i2 & 24576) == 0) {
            if (rVar2.h(lVar2)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i10 |= i15;
        }
        if ((196608 & i2) == 0) {
            if (rVar2.h(lVar3)) {
                i14 = 131072;
            } else {
                i14 = 65536;
            }
            i10 |= i14;
        }
        if ((1572864 & i2) == 0) {
            if (rVar2.h(lVar4)) {
                i13 = 1048576;
            } else {
                i13 = 524288;
            }
            i10 |= i13;
        }
        if ((12582912 & i2) == 0) {
            if (rVar2.h(aVar2)) {
                i12 = 8388608;
            } else {
                i12 = 4194304;
            }
            i10 |= i12;
        }
        if ((4793491 & i10) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar2.O(i10 & 1, z10)) {
            Object L = rVar2.L();
            n2.e eVar = l.f9953a;
            if (L == eVar) {
                L = new y4();
                rVar2.h0(L);
            }
            y4 y4Var2 = (y4) L;
            t3 d4 = r3.d(y4Var2, rVar2, 1);
            Object L2 = rVar2.L();
            if (L2 == eVar) {
                L2 = new z();
                rVar2.h0(L2);
            }
            z zVar = (z) L2;
            Object L3 = rVar2.L();
            if (L3 == eVar) {
                i11 = i10;
                y4Var = y4Var2;
                L3 = cd.q.b(0, 10, bd.a.DROP_OLDEST, 1);
                rVar2.h0(L3);
            } else {
                i11 = i10;
                y4Var = y4Var2;
            }
            cd.w0 w0Var2 = (cd.w0) L3;
            Object L4 = rVar2.L();
            if (L4 == eVar) {
                L4 = new i0(zVar, null, 3);
                rVar2.h0(L4);
            }
            s.g(y.f14813a, (p) L4, rVar2);
            long j2 = ((l0) rVar2.j(m0.f5257a)).j();
            WeakHashMap weakHashMap = c2.f8518w;
            r3.b(l1.s.f(rVar2).f8530l, null, d4, h.c(312057130, new mg.g(aVar2, aVar, 3), rVar2), null, null, null, 0, false, null, 0.0f, 0L, 0L, 0L, j2, 0L, h.c(-725102685, new ig.l(zVar, list, uuid, lVar, lVar2, w0Var2, lVar3, 2), rVar2), rVar2, 3072, 100663296, 196594);
            rVar = rVar2;
            Resources resources = (Resources) rVar.j(r0.f1938c);
            boolean h2 = rVar.h(w0Var2) | rVar.h(resources);
            if ((i11 & 3670016) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = h2 | z11;
            Object L5 = rVar.L();
            if (!z12 && L5 != eVar) {
                w0Var = w0Var2;
            } else {
                w0Var = w0Var2;
                a9.d dVar = new a9.d(w0Var, y4Var, resources, lVar4, (cc.c) null, 23);
                rVar.h0(dVar);
                L5 = dVar;
            }
            s.g(w0Var, (p) L5, rVar);
        } else {
            rVar = rVar2;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new w(list, uuid, lVar, aVar, lVar2, lVar3, lVar4, aVar2, i2);
        }
    }
}
