package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hn0  reason: default package */
/* loaded from: classes.dex */
public final class hn0 extends nk6 implements bj2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ w92 Z;
    public /* synthetic */ Object c0;
    public final /* synthetic */ pn0 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn0(j11 j11Var, pn0 pn0Var, int i) {
        super(3, j11Var);
        this.X = i;
        this.d0 = pn0Var;
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        o27 o27Var = o27.a;
        pn0 pn0Var = this.d0;
        w92 w92Var = (w92) obj;
        j11 j11Var = (j11) obj3;
        switch (i) {
            case 0:
                hn0 hn0Var = new hn0(j11Var, pn0Var, 0);
                hn0Var.Z = w92Var;
                hn0Var.c0 = obj2;
                return hn0Var.v(o27Var);
            case 1:
                hn0 hn0Var2 = new hn0(j11Var, pn0Var, 1);
                hn0Var2.Z = w92Var;
                hn0Var2.c0 = obj2;
                return hn0Var2.v(o27Var);
            case 2:
                hn0 hn0Var3 = new hn0(j11Var, pn0Var, 2);
                hn0Var3.Z = w92Var;
                hn0Var3.c0 = obj2;
                return hn0Var3.v(o27Var);
            case 3:
                hn0 hn0Var4 = new hn0(j11Var, pn0Var, 3);
                hn0Var4.Z = w92Var;
                hn0Var4.c0 = obj2;
                return hn0Var4.v(o27Var);
            default:
                hn0 hn0Var5 = new hn0(j11Var, pn0Var, 4);
                hn0Var5.Z = w92Var;
                hn0Var5.c0 = obj2;
                return hn0Var5.v(o27Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.m00
    public final Object v(Object obj) {
        u92 i;
        Object obj2;
        int i2 = this.X;
        o27 o27Var = o27.a;
        pn0 pn0Var = this.d0;
        switch (i2) {
            case 0:
                p31 p31Var = p31.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var = this.Z;
                sk0 sk0Var = (sk0) this.c0;
                nq5 nq5Var = (nq5) pn0Var.b;
                nq5Var.getClass();
                sk0Var.getClass();
                mk0 s = nq5Var.b.s();
                Long l = sk0Var.a;
                l.getClass();
                wb2 a = yg7.a(s.a, false, new String[]{"cheat"}, new u4(5, l.longValue()));
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (!(w92Var instanceof ft6)) {
                    Object a2 = a.a(new z6(w92Var, 28), this);
                    if (a2 != p31Var) {
                        a2 = o27Var;
                    }
                    if (a2 != p31Var) {
                        a2 = o27Var;
                    }
                    if (a2 == p31Var) {
                        return p31Var;
                    }
                    return o27Var;
                }
                throw ((ft6) w92Var).A;
            case 1:
                p31 p31Var2 = p31.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var2 = this.Z;
                List list = (List) this.c0;
                ee6 ee6Var = pn0Var.e;
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (!(w92Var2 instanceof ft6)) {
                    Object a3 = ee6Var.a(new r90(2, w92Var2, list), this);
                    if (a3 != p31Var2) {
                        a3 = o27Var;
                    }
                    if (a3 != p31Var2) {
                        a3 = o27Var;
                    }
                    if (a3 == p31Var2) {
                        return p31Var2;
                    }
                    return o27Var;
                }
                throw ((ft6) w92Var2).A;
            case 2:
                p31 p31Var3 = p31.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var3 = this.Z;
                bz0 bz0Var = new bz0(6, new a0((yj2) this.c0, pn0Var, null, 17));
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var3, bz0Var, this) == p31Var3) {
                    return p31Var3;
                }
                return o27Var;
            case 3:
                p31 p31Var4 = p31.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var4 = this.Z;
                yj2 yj2Var = (yj2) this.c0;
                if (yj2Var == null) {
                    i = new bz0(4, pp1.A);
                } else {
                    i = ((nq5) pn0Var.b).i(yj2Var);
                }
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var4, i, this) == p31Var4) {
                    return p31Var4;
                }
                return o27Var;
            default:
                ee6 ee6Var2 = pn0Var.e;
                p31 p31Var5 = p31.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        me2.a0(obj);
                        return o27Var;
                    }
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                me2.a0(obj);
                w92 w92Var5 = this.Z;
                List<sk0> list2 = (List) this.c0;
                ArrayList arrayList = new ArrayList();
                for (sk0 sk0Var2 : list2) {
                    ArrayList arrayList2 = sk0Var2.c;
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size) {
                        Object obj3 = arrayList2.get(i8);
                        i8++;
                        if (((Cheat) obj3).getEnabled()) {
                            arrayList3.add(obj3);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(uq0.y0(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj4 = arrayList3.get(i9);
                        i9++;
                        arrayList4.add(new ul0((Cheat) obj4, sk0Var2.b));
                    }
                    tq0.D0(arrayList, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(arrayList);
                for (Cheat cheat : (Iterable) ee6Var2.getValue()) {
                    int size3 = arrayList5.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < size3) {
                            Object obj5 = arrayList5.get(i11);
                            i11++;
                            if (!b53.x(((ul0) obj5).a.getId(), cheat.getId())) {
                                i10++;
                            }
                        } else {
                            i10 = -1;
                        }
                    }
                    if (i10 >= 0) {
                        if (cheat.getEnabled()) {
                            arrayList5.set(i10, new ul0(cheat, ((ul0) arrayList5.get(i10)).b));
                        } else {
                            arrayList5.remove(i10);
                        }
                    } else if (cheat.getEnabled()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                ArrayList arrayList6 = ((sk0) obj2).c;
                                if (!arrayList6.isEmpty()) {
                                    int size4 = arrayList6.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj6 = arrayList6.get(i12);
                                        i12++;
                                        if (b53.x(((Cheat) obj6).getId(), cheat.getId())) {
                                        }
                                    }
                                    continue;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        sk0 sk0Var3 = (sk0) obj2;
                        if (sk0Var3 != null) {
                            arrayList5.add(new ul0(cheat, sk0Var3.b));
                        }
                    }
                }
                la2 la2Var = new la2(new y(arrayList5, (j11) null, 19), new ln0(0, new a7(ee6Var2, 9), arrayList5));
                this.Z = null;
                this.c0 = null;
                this.Y = 1;
                if (se.s(w92Var5, la2Var, this) == p31Var5) {
                    return p31Var5;
                }
                return o27Var;
        }
    }
}
