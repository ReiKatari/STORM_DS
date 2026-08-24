package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp0  reason: default package */
/* loaded from: classes.dex */
public final class sp0 extends hw6 implements fo2 {
    public final /* synthetic */ int X;
    public int Y;
    public /* synthetic */ ne2 Z;
    public /* synthetic */ Object d0;
    public final /* synthetic */ aq0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sp0(r41 r41Var, aq0 aq0Var, int i) {
        super(3, r41Var);
        this.X = i;
        this.e0 = aq0Var;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        aq0 aq0Var = this.e0;
        ne2 ne2Var = (ne2) obj;
        r41 r41Var = (r41) obj3;
        switch (i) {
            case 0:
                sp0 sp0Var = new sp0(r41Var, aq0Var, 0);
                sp0Var.Z = ne2Var;
                sp0Var.d0 = obj2;
                return sp0Var.s(jg7Var);
            case 1:
                sp0 sp0Var2 = new sp0(r41Var, aq0Var, 1);
                sp0Var2.Z = ne2Var;
                sp0Var2.d0 = obj2;
                return sp0Var2.s(jg7Var);
            case 2:
                sp0 sp0Var3 = new sp0(r41Var, aq0Var, 2);
                sp0Var3.Z = ne2Var;
                sp0Var3.d0 = obj2;
                return sp0Var3.s(jg7Var);
            case 3:
                sp0 sp0Var4 = new sp0(r41Var, aq0Var, 3);
                sp0Var4.Z = ne2Var;
                sp0Var4.d0 = obj2;
                return sp0Var4.s(jg7Var);
            default:
                sp0 sp0Var5 = new sp0(r41Var, aq0Var, 4);
                sp0Var5.Z = ne2Var;
                sp0Var5.d0 = obj2;
                return sp0Var5.s(jg7Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4 */
    @Override // defpackage.d20
    public final Object s(Object obj) {
        le2 i;
        Object obj2;
        int i2 = this.X;
        jg7 jg7Var = jg7.a;
        aq0 aq0Var = this.e0;
        switch (i2) {
            case 0:
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i3 = this.Y;
                if (i3 != 0) {
                    if (i3 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var = this.Z;
                an0 an0Var = (an0) this.d0;
                h16 h16Var = (h16) aq0Var.b;
                h16Var.getClass();
                an0Var.getClass();
                vm0 s = h16Var.b.s();
                Long l = an0Var.a;
                l.getClass();
                ng2 a = yv7.a(s.a, false, new String[]{"cheat"}, new t4(5, l.longValue()));
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (!(ne2Var instanceof w57)) {
                    Object b = a.b(new a7(ne2Var, 28), this);
                    if (b != x61Var) {
                        b = jg7Var;
                    }
                    if (b != x61Var) {
                        b = jg7Var;
                    }
                    if (b == x61Var) {
                        return x61Var;
                    }
                    return jg7Var;
                }
                throw ((w57) ne2Var).A;
            case 1:
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var2 = this.Z;
                List list = (List) this.d0;
                tp6 tp6Var = aq0Var.e;
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (!(ne2Var2 instanceof w57)) {
                    Object b2 = tp6Var.b(new zb0(2, ne2Var2, list), this);
                    if (b2 != x61Var2) {
                        b2 = jg7Var;
                    }
                    if (b2 != x61Var2) {
                        b2 = jg7Var;
                    }
                    if (b2 == x61Var2) {
                        return x61Var2;
                    }
                    return jg7Var;
                }
                throw ((w57) ne2Var2).A;
            case 2:
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i5 = this.Y;
                if (i5 != 0) {
                    if (i5 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var3 = this.Z;
                g21 g21Var = new g21(new b0((cp2) this.d0, aq0Var, null, 16), 7);
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var3, g21Var, this) == x61Var3) {
                    return x61Var3;
                }
                return jg7Var;
            case 3:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i6 = this.Y;
                if (i6 != 0) {
                    if (i6 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var4 = this.Z;
                cp2 cp2Var = (cp2) this.d0;
                if (cp2Var == null) {
                    i = new g21(yt1.A, 4);
                } else {
                    i = ((h16) aq0Var.b).i(cp2Var);
                }
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var4, i, this) == x61Var4) {
                    return x61Var4;
                }
                return jg7Var;
            default:
                tp6 tp6Var2 = aq0Var.e;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i7 = this.Y;
                if (i7 != 0) {
                    if (i7 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ne2 ne2Var5 = this.Z;
                List<an0> list2 = (List) this.d0;
                ArrayList arrayList = new ArrayList();
                for (an0 an0Var2 : list2) {
                    ArrayList arrayList2 = an0Var2.c;
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
                    ArrayList arrayList4 = new ArrayList(ht0.v0(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size2) {
                        Object obj4 = arrayList3.get(i9);
                        i9++;
                        arrayList4.add(new co0((Cheat) obj4, an0Var2.b));
                    }
                    gt0.A0(arrayList, arrayList4);
                }
                ArrayList arrayList5 = new ArrayList(arrayList);
                for (Cheat cheat : (Iterable) tp6Var2.getValue()) {
                    int size3 = arrayList5.size();
                    int i10 = 0;
                    int i11 = 0;
                    while (true) {
                        if (i11 < size3) {
                            Object obj5 = arrayList5.get(i11);
                            i11++;
                            if (!nb3.k(((co0) obj5).a.getId(), cheat.getId())) {
                                i10++;
                            }
                        } else {
                            i10 = -1;
                        }
                    }
                    if (i10 >= 0) {
                        if (cheat.getEnabled()) {
                            arrayList5.set(i10, new co0(cheat, ((co0) arrayList5.get(i10)).b));
                        } else {
                            arrayList5.remove(i10);
                        }
                    } else if (cheat.getEnabled()) {
                        Iterator it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                ArrayList arrayList6 = ((an0) obj2).c;
                                if (!arrayList6.isEmpty()) {
                                    int size4 = arrayList6.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj6 = arrayList6.get(i12);
                                        i12++;
                                        if (nb3.k(((Cheat) obj6).getId(), cheat.getId())) {
                                        }
                                    }
                                    continue;
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        an0 an0Var3 = (an0) obj2;
                        if (an0Var3 != null) {
                            arrayList5.add(new co0(cheat, an0Var3.b));
                        }
                    }
                }
                cf2 cf2Var = new cf2(new z(arrayList5, (r41) null, 19), new wp0(0, new b7(tp6Var2, 9), arrayList5));
                this.Z = null;
                this.d0 = null;
                this.Y = 1;
                if (f04.A(ne2Var5, cf2Var, this) == x61Var5) {
                    return x61Var5;
                }
                return jg7Var;
        }
    }
}
