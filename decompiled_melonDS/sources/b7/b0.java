package b7;

import d1.x0;
import java.util.List;
import java.util.ListIterator;
import l1.r1;
import me.magnum.melonds.domain.model.DSiWareTitle;
import n2.s2;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 implements mc.r {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;

    public /* synthetic */ b0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [n2.m, n2.r] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    @Override // mc.r
    public final Object r(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r5;
        int i2;
        boolean z10;
        int i10;
        int i11;
        switch (this.A) {
            case 0:
                c1.p pVar = (c1.p) obj;
                a7.i iVar = (a7.i) obj2;
                n2.m mVar = (n2.m) obj3;
                ((Number) obj4).intValue();
                boolean a10 = nc.k.a(((x0) this.B).f3695c.getValue(), (a7.i) this.L);
                if (!((Boolean) ((w0) this.X).getValue()).booleanValue() && !a10) {
                    List list = (List) ((s2) this.Y).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            r5 = listIterator.previous();
                            if (nc.k.a(iVar, (a7.i) r5)) {
                            }
                        } else {
                            r5 = 0;
                        }
                    }
                    iVar = r5;
                }
                n2.r rVar = (n2.r) mVar;
                if (iVar == null) {
                    rVar.X(105930796);
                } else {
                    rVar.X(-1520603531);
                    k7.w.c(iVar, (y2.d) this.R, v2.h.c(-1263531443, new m(iVar, pVar), rVar), rVar, 384);
                }
                rVar.p(false);
                return yb.y.f14813a;
            default:
                n1.c cVar = (n1.c) obj;
                int intValue = ((Number) obj2).intValue();
                n2.m mVar2 = (n2.m) obj3;
                int intValue2 = ((Number) obj4).intValue();
                mc.l lVar = (mc.l) this.Y;
                mc.p pVar2 = (mc.p) this.X;
                mc.p pVar3 = (mc.p) this.R;
                mc.l lVar2 = (mc.l) this.L;
                if ((intValue2 & 6) == 0) {
                    if (((n2.r) mVar2).f(cVar)) {
                        i11 = 4;
                    } else {
                        i11 = 2;
                    }
                    i2 = i11 | intValue2;
                } else {
                    i2 = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (((n2.r) mVar2).d(intValue)) {
                        i10 = 32;
                    } else {
                        i10 = 16;
                    }
                    i2 |= i10;
                }
                if ((i2 & 147) != 146) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ?? r32 = (n2.r) mVar2;
                if (r32.O(i2 & 1, z10)) {
                    DSiWareTitle dSiWareTitle = (DSiWareTitle) ((List) this.B).get(intValue);
                    r32.X(-532459994);
                    b3.p b10 = r1.b(b3.m.f1770a, 1.0f);
                    boolean f8 = r32.f(lVar2) | r32.h(dSiWareTitle);
                    Object L = r32.L();
                    Object obj5 = n2.l.f9953a;
                    if (f8 || L == obj5) {
                        L = new zg.j(0, lVar2, dSiWareTitle);
                        r32.h0(L);
                    }
                    mc.a aVar = (mc.a) L;
                    boolean f10 = r32.f(pVar3) | r32.h(dSiWareTitle);
                    Object L2 = r32.L();
                    if (f10 || L2 == obj5) {
                        L2 = new zg.k(pVar3, dSiWareTitle, 0);
                        r32.h0(L2);
                    }
                    mc.l lVar3 = (mc.l) L2;
                    boolean f11 = r32.f(pVar2) | r32.h(dSiWareTitle);
                    Object L3 = r32.L();
                    if (f11 || L3 == obj5) {
                        L3 = new zg.k(pVar2, dSiWareTitle, 1);
                        r32.h0(L3);
                    }
                    mc.l lVar4 = (mc.l) L3;
                    boolean f12 = r32.f(lVar) | r32.h(dSiWareTitle);
                    Object L4 = r32.L();
                    if (f12 || L4 == obj5) {
                        L4 = new zg.j(1, lVar, dSiWareTitle);
                        r32.h0(L4);
                    }
                    zg.a.a(b10, dSiWareTitle, aVar, lVar3, lVar4, (mc.a) L4, r32, 6);
                    r32.p(false);
                } else {
                    r32.R();
                }
                return yb.y.f14813a;
        }
    }
}
