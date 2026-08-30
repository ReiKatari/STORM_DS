package jg;

import ah.l0;
import cd.a0;
import cd.q1;
import cd.v;
import cd.w1;
import cd.x;
import cd.z0;
import h1.x2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.u1;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends ec.j implements mc.q {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ cd.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public /* synthetic */ Object f7874b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ u f7875c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(cc.c cVar, u uVar, int i2) {
        super(3, cVar);
        this.X = i2;
        this.f7875c0 = uVar;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        cd.i iVar = (cd.i) obj;
        cc.c cVar = (cc.c) obj3;
        switch (this.X) {
            case 0:
                n nVar = new n(cVar, this.f7875c0, 0);
                nVar.Z = iVar;
                nVar.f7874b0 = obj2;
                return nVar.v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                n nVar2 = new n(cVar, this.f7875c0, 1);
                nVar2.Z = iVar;
                nVar2.f7874b0 = obj2;
                return nVar2.v(y.f14813a);
            case 2:
                n nVar3 = new n(cVar, this.f7875c0, 2);
                nVar3.Z = iVar;
                nVar3.f7874b0 = obj2;
                return nVar3.v(y.f14813a);
            case 3:
                n nVar4 = new n(cVar, this.f7875c0, 3);
                nVar4.Z = iVar;
                nVar4.f7874b0 = obj2;
                return nVar4.v(y.f14813a);
            default:
                n nVar5 = new n(cVar, this.f7875c0, 4);
                nVar5.Z = iVar;
                nVar5.f7874b0 = obj2;
                return nVar5.v(y.f14813a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // ec.a
    public final Object v(Object obj) {
        cd.h f8;
        switch (this.X) {
            case 0:
                dc.a aVar = dc.a.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                y yVar = y.f14813a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cd.i iVar = this.Z;
                    oe.c cVar = (oe.c) this.f7874b0;
                    u1 u1Var = (u1) this.f7875c0.f7876b;
                    u1Var.getClass();
                    cVar.getClass();
                    he.e s10 = u1Var.f8271b.s();
                    Long l10 = cVar.f10916a;
                    l10.getClass();
                    m7.j r5 = q8.r.r(s10.f6462a, false, new String[]{"cheat"}, new cd.k(3, l10.longValue()));
                    this.Z = null;
                    this.f7874b0 = null;
                    this.Y = 1;
                    if (!(iVar instanceof w1)) {
                        Object c4 = r5.c(new a9.h(iVar, 18), this);
                        if (c4 != aVar) {
                            c4 = yVar;
                        }
                        if (c4 != aVar) {
                            c4 = yVar;
                        }
                        if (c4 == aVar) {
                            return aVar;
                        }
                    } else {
                        throw ((w1) iVar).A;
                    }
                }
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
                int i10 = this.Y;
                y yVar2 = y.f14813a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cd.i iVar2 = this.Z;
                    List list = (List) this.f7874b0;
                    q1 q1Var = this.f7875c0.f7879e;
                    this.Z = null;
                    this.f7874b0 = null;
                    this.Y = 1;
                    if (!(iVar2 instanceof w1)) {
                        Object c10 = q1Var.c(new a0(9, iVar2, list), this);
                        if (c10 != aVar2) {
                            c10 = yVar2;
                        }
                        if (c10 != aVar2) {
                            c10 = yVar2;
                        }
                        if (c10 == aVar2) {
                            return aVar2;
                        }
                    } else {
                        throw ((w1) iVar2).A;
                    }
                }
                return yVar2;
            case 2:
                dc.a aVar3 = dc.a.COROUTINE_SUSPENDED;
                int i11 = this.Y;
                if (i11 != 0) {
                    if (i11 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cd.i iVar3 = this.Z;
                    z0 z0Var = new z0(new x2((oe.q) this.f7874b0, this.f7875c0, null, 6));
                    this.Z = null;
                    this.f7874b0 = null;
                    this.Y = 1;
                    if (cd.q.o(iVar3, z0Var, this) == aVar3) {
                        return aVar3;
                    }
                }
                return y.f14813a;
            case 3:
                dc.a aVar4 = dc.a.COROUTINE_SUSPENDED;
                int i12 = this.Y;
                if (i12 != 0) {
                    if (i12 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cd.i iVar4 = this.Z;
                    oe.q qVar = (oe.q) this.f7874b0;
                    if (qVar == null) {
                        f8 = new a9.i(2, zb.q.A);
                    } else {
                        f8 = ((u1) this.f7875c0.f7876b).f(qVar);
                    }
                    this.Z = null;
                    this.f7874b0 = null;
                    this.Y = 1;
                    if (cd.q.o(iVar4, f8, this) == aVar4) {
                        return aVar4;
                    }
                }
                return y.f14813a;
            default:
                q1 q1Var2 = this.f7875c0.f7879e;
                dc.a aVar5 = dc.a.COROUTINE_SUSPENDED;
                int i13 = this.Y;
                if (i13 != 0) {
                    if (i13 == 1) {
                        p7.j.I(obj);
                    } else {
                        a0.j.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    p7.j.I(obj);
                    cd.i iVar5 = this.Z;
                    List<oe.c> list2 = (List) this.f7874b0;
                    ArrayList arrayList = new ArrayList();
                    for (oe.c cVar2 : list2) {
                        ArrayList arrayList2 = cVar2.f10918c;
                        ArrayList arrayList3 = new ArrayList();
                        int size = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList2.get(i14);
                            i14++;
                            if (((Cheat) obj2).getEnabled()) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(zb.m.G(arrayList3, 10));
                        int size2 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size2) {
                            Object obj3 = arrayList3.get(i15);
                            i15++;
                            arrayList4.add(new oe.f((Cheat) obj3, cVar2.f10917b));
                        }
                        zb.l.L(arrayList4, arrayList);
                    }
                    ArrayList arrayList5 = new ArrayList(arrayList);
                    Iterator it = ((Iterable) q1Var2.getValue()).iterator();
                    while (true) {
                        oe.c cVar3 = null;
                        if (it.hasNext()) {
                            Cheat cheat = (Cheat) it.next();
                            int size3 = arrayList5.size();
                            int i16 = 0;
                            int i17 = 0;
                            while (true) {
                                if (i17 < size3) {
                                    Object obj4 = arrayList5.get(i17);
                                    i17++;
                                    if (!nc.k.a(((oe.f) obj4).f10927a.getId(), cheat.getId())) {
                                        i16++;
                                    }
                                } else {
                                    i16 = -1;
                                }
                            }
                            if (i16 >= 0) {
                                if (cheat.getEnabled()) {
                                    arrayList5.set(i16, new oe.f(cheat, ((oe.f) arrayList5.get(i16)).f10928b));
                                } else {
                                    arrayList5.remove(i16);
                                }
                            } else if (cheat.getEnabled()) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ?? next = it2.next();
                                        ArrayList arrayList6 = ((oe.c) next).f10918c;
                                        if (!arrayList6.isEmpty()) {
                                            int size4 = arrayList6.size();
                                            int i18 = 0;
                                            while (i18 < size4) {
                                                Object obj5 = arrayList6.get(i18);
                                                i18++;
                                                if (nc.k.a(((Cheat) obj5).getId(), cheat.getId())) {
                                                    cVar3 = next;
                                                }
                                            }
                                            continue;
                                        }
                                    }
                                }
                                oe.c cVar4 = cVar3;
                                if (cVar4 != null) {
                                    arrayList5.add(new oe.f(cheat, cVar4.f10917b));
                                }
                            }
                        } else {
                            v vVar = new v(new di.b(18, (cc.c) null, arrayList5), new x(5, new l0(q1Var2, 5), arrayList5));
                            this.Z = null;
                            this.f7874b0 = null;
                            this.Y = 1;
                            if (cd.q.o(iVar5, vVar, this) == aVar5) {
                                return aVar5;
                            }
                        }
                    }
                }
                return y.f14813a;
        }
    }
}
