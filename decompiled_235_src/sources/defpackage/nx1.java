package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx1  reason: default package */
/* loaded from: classes.dex */
public final class nx1 extends no5 {
    public final pn5 i;
    public final oj4 j;
    public final sx1 k;
    public final jh l;
    public final jf4 m;
    public final ci0 n;
    public List o;
    public List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx1(kd6 kd6Var, pn5 pn5Var, oj4 oj4Var, sx1 sx1Var, jh jhVar, jf4 jf4Var, ci0 ci0Var) {
        super(pn5Var, kd6Var);
        kd6Var.getClass();
        pn5Var.getClass();
        oj4Var.getClass();
        sx1Var.getClass();
        jhVar.getClass();
        jf4Var.getClass();
        this.i = pn5Var;
        this.j = oj4Var;
        this.k = sx1Var;
        this.l = jhVar;
        this.m = jf4Var;
        this.n = ci0Var;
        yt1 yt1Var = yt1.A;
        this.o = yt1Var;
        this.p = yt1Var;
        hv.L(to7.a(this), null, null, new a6(this, null, 16), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ArrayList arrayList, Map map, s41 s41Var) {
        hx1 hx1Var;
        x61 x61Var;
        int i;
        ArrayList arrayList2;
        s83 s83Var;
        Map map2;
        List list;
        Object d0;
        List list2;
        Map map3;
        s83 s83Var2;
        List list3;
        g3 g3Var;
        float f;
        Object obj;
        if (s41Var instanceof hx1) {
            hx1Var = (hx1) s41Var;
            int i2 = hx1Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hx1Var.f0 = i2 - Integer.MIN_VALUE;
                Object obj2 = hx1Var.d0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = hx1Var.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            list2 = hx1Var.Z;
                            s83Var2 = hx1Var.Y;
                            map3 = hx1Var.X;
                            oi2.Y(obj2);
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (bb5 bb5Var : (Iterable) obj2) {
                                if (list2 == null || !list2.isEmpty()) {
                                    Iterator it = list2.iterator();
                                    while (it.hasNext()) {
                                        if (((o75) it.next()).a == bb5Var.a.a.a) {
                                            g3Var = g3.PendingSubmissions;
                                            break;
                                        }
                                    }
                                }
                                eb5 eb5Var = bb5Var.a;
                                o75 o75Var = eb5Var.a;
                                o75 o75Var2 = eb5Var.a;
                                if (map3.containsKey(Long.valueOf(o75Var.a))) {
                                    g3Var = (g3) c14.j0(map3, Long.valueOf(o75Var2.a));
                                } else {
                                    boolean z = eb5Var.b;
                                    long j = o75Var2.a;
                                    if (z) {
                                        Iterator it2 = this.p.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj = it2.next();
                                                if (((gx1) obj).a == j) {
                                                    break;
                                                }
                                            } else {
                                                obj = null;
                                                break;
                                            }
                                        }
                                        gx1 gx1Var = (gx1) obj;
                                        if (gx1Var != null) {
                                            long a = s83Var2.a(gx1Var.b);
                                            jd1 jd1Var = oq1.B;
                                            if (oq1.c(a, n16.L(10, uq1.MINUTES)) < 0) {
                                                g3Var = g3.RecentlyUnlocked;
                                            }
                                        }
                                        g3Var = g3.Unlocked;
                                    } else {
                                        List list4 = this.o;
                                        if (list4 == null || !list4.isEmpty()) {
                                            Iterator it3 = list4.iterator();
                                            while (it3.hasNext()) {
                                                if (((Number) it3.next()).longValue() == j) {
                                                    g3Var = g3.ActiveChallenges;
                                                    break;
                                                }
                                            }
                                        }
                                        int i3 = bb5Var.c;
                                        if (i3 == 0) {
                                            f = RecyclerView.B1;
                                        } else {
                                            f = bb5Var.b / i3;
                                        }
                                        if (f >= 0.8f) {
                                            g3Var = g3.AlmostThere;
                                        } else {
                                            g3Var = g3.Locked;
                                        }
                                    }
                                }
                                Object obj3 = linkedHashMap.get(g3Var);
                                if (obj3 == null) {
                                    linkedHashMap.containsKey(g3Var);
                                }
                                List list5 = (List) obj3;
                                m6 m6Var = new m6(bb5Var);
                                if (list5 != null) {
                                    list5.add(m6Var);
                                } else {
                                    list5 = hf.d0(m6Var);
                                }
                                linkedHashMap.put(g3Var, list5);
                            }
                            ArrayList arrayList3 = new ArrayList(linkedHashMap.size());
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (entry.getKey() == g3.RecentlyUnlocked) {
                                    list3 = gt0.d1((Iterable) entry.getValue(), new ix1(this, 0));
                                } else {
                                    list3 = (List) entry.getValue();
                                }
                                arrayList3.add(new h3((g3) entry.getKey(), list3));
                            }
                            return gt0.d1(arrayList3, new zh2(13));
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s83 s83Var3 = hx1Var.Y;
                    map2 = hx1Var.X;
                    ArrayList arrayList4 = hx1Var.R;
                    oi2.Y(obj2);
                    s83Var = s83Var3;
                    arrayList2 = arrayList4;
                } else {
                    oi2.Y(obj2);
                    s83 b = u83.a.b();
                    b7 b7Var = new b7((tp6) this.n.g, 12);
                    arrayList2 = arrayList;
                    hx1Var.R = arrayList2;
                    hx1Var.X = map;
                    hx1Var.Y = b;
                    hx1Var.f0 = 1;
                    Object D = f04.D(b7Var, hx1Var);
                    if (D != x61Var) {
                        s83Var = b;
                        obj2 = D;
                        map2 = map;
                    }
                    return x61Var;
                }
                list = (List) obj2;
                if (list == null) {
                    list = yt1.A;
                }
                hx1Var.R = null;
                hx1Var.X = map2;
                hx1Var.Y = s83Var;
                hx1Var.Z = list;
                hx1Var.f0 = 2;
                ((pl) this.i).getClass();
                d0 = hv.d0(xk1.a, new xg(arrayList2, null, 1), hx1Var);
                if (d0 != x61Var) {
                    list2 = list;
                    obj2 = d0;
                    map3 = map2;
                    s83Var2 = s83Var;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    while (r1.hasNext()) {
                    }
                    ArrayList arrayList32 = new ArrayList(linkedHashMap2.size());
                    while (r2.hasNext()) {
                    }
                    return gt0.d1(arrayList32, new zh2(13));
                }
                return x61Var;
            }
        }
        hx1Var = new hx1(this, s41Var);
        Object obj22 = hx1Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = hx1Var.f0;
        if (i == 0) {
        }
        list = (List) obj22;
        if (list == null) {
        }
        hx1Var.R = null;
        hx1Var.X = map2;
        hx1Var.Y = s83Var;
        hx1Var.Z = list;
        hx1Var.f0 = 2;
        ((pl) this.i).getClass();
        d0 = hv.d0(xk1.a, new xg(arrayList2, null, 1), hx1Var);
        if (d0 != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(pq5 pq5Var, s41 s41Var) {
        jx1 jx1Var;
        int i;
        jb5 jb5Var;
        if (s41Var instanceof jx1) {
            jx1Var = (jx1) s41Var;
            int i2 = jx1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jx1Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = jx1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = jx1Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            pj4 pj4Var = (pj4) obj;
                            if (pj4Var.a == ui4.OK) {
                                List<ek4> list = pj4Var.b;
                                ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                                for (ek4 ek4Var : list) {
                                    arrayList.add(new Long(ek4Var.e));
                                }
                                return gt0.p1(arrayList);
                            }
                            return du1.A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq5Var = jx1Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jx1Var.R = pq5Var;
                    jx1Var.Z = 1;
                    obj = ((pl) this.i).c.b(jx1Var);
                }
                jb5Var = (jb5) obj;
                if (jb5Var != null) {
                    String a = jb5Var.a();
                    String str = pq5Var.i;
                    jx1Var.R = null;
                    jx1Var.Z = 2;
                    obj = this.j.g(a, str, jx1Var);
                }
                return du1.A;
            }
        }
        jx1Var = new jx1(this, s41Var);
        Object obj2 = jx1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = jx1Var.Z;
        if (i == 0) {
        }
        jb5Var = (jb5) obj2;
        if (jb5Var != null) {
        }
        return du1.A;
    }

    @Override // defpackage.no5
    public final pq5 h() {
        rx1 rx1Var;
        lb4 lb4Var = this.k.e;
        if (lb4Var instanceof rx1) {
            rx1Var = (rx1) lb4Var;
        } else {
            rx1Var = null;
        }
        if (rx1Var != null) {
            return rx1Var.o;
        }
        i.m("Emulator must be running a ROM session");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable i(s41 s41Var) {
        kx1 kx1Var;
        int i;
        int k0;
        g3 g3Var;
        if (s41Var instanceof kx1) {
            kx1Var = (kx1) s41Var;
            int i2 = kx1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kx1Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = kx1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = kx1Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    kx1Var.Y = 1;
                    pl plVar = (pl) this.i;
                    plVar.getClass();
                    obj = hv.d0(xk1.a, new zk(plVar, null, 0), kx1Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                Iterable<RASimpleRuntimeAchievementBucketEntry> iterable = (Iterable) obj;
                k0 = c14.k0(ht0.v0(iterable, 10));
                if (k0 < 16) {
                    k0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                for (RASimpleRuntimeAchievementBucketEntry rASimpleRuntimeAchievementBucketEntry : iterable) {
                    Long l = new Long(rASimpleRuntimeAchievementBucketEntry.getAchievementId());
                    switch (rASimpleRuntimeAchievementBucketEntry.getBucketType()) {
                        case 1:
                            g3Var = g3.Locked;
                            break;
                        case 2:
                            g3Var = g3.Unlocked;
                            break;
                        case 3:
                            g3Var = g3.Unsupported;
                            break;
                        case 4:
                            g3Var = g3.Unofficial;
                            break;
                        case 5:
                            g3Var = g3.RecentlyUnlocked;
                            break;
                        case 6:
                            g3Var = g3.ActiveChallenges;
                            break;
                        case 7:
                            g3Var = g3.AlmostThere;
                            break;
                        case 8:
                            g3Var = g3.Unsynced;
                            break;
                        default:
                            g3Var = g3.Locked;
                            break;
                    }
                    linkedHashMap.put(l, g3Var);
                }
                return linkedHashMap;
            }
        }
        kx1Var = new kx1(this, s41Var);
        Object obj2 = kx1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kx1Var.Y;
        if (i == 0) {
        }
        Iterable<RASimpleRuntimeAchievementBucketEntry> iterable2 = (Iterable) obj2;
        k0 = c14.k0(ht0.v0(iterable2, 10));
        if (k0 < 16) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(k0);
        while (r5.hasNext()) {
        }
        return linkedHashMap2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[LOOP:0: B:22:0x0071->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[SYNTHETIC] */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(s41 s41Var) {
        lx1 lx1Var;
        int i;
        int k0;
        LinkedHashMap linkedHashMap;
        Iterator it;
        op1 op1Var;
        if (s41Var instanceof lx1) {
            lx1Var = (lx1) s41Var;
            int i2 = lx1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lx1Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = lx1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = lx1Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    lx1Var.Y = 1;
                    pl plVar = (pl) this.i;
                    plVar.getClass();
                    obj = hv.d0(xk1.a, new zk(plVar, null, 1), lx1Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                Iterable iterable = (Iterable) obj;
                iterable.getClass();
                int i3 = 16;
                dv dvVar = new dv(new a5(iterable, 16), 2);
                k0 = c14.k0(ht0.v0(dvVar, 10));
                if (k0 >= 16) {
                    i3 = k0;
                }
                linkedHashMap = new LinkedHashMap(i3);
                it = dvVar.iterator();
                while (true) {
                    op1Var = (op1) it;
                    if (!op1Var.B.hasNext()) {
                        j43 j43Var = (j43) op1Var.next();
                        linkedHashMap.put(j43Var.b, new Integer(j43Var.a));
                    } else {
                        return linkedHashMap;
                    }
                }
            }
        }
        lx1Var = new lx1(this, s41Var);
        Object obj2 = lx1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = lx1Var.Y;
        if (i == 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        iterable2.getClass();
        int i32 = 16;
        dv dvVar2 = new dv(new a5(iterable2, 16), 2);
        k0 = c14.k0(ht0.v0(dvVar2, 10));
        if (k0 >= 16) {
        }
        linkedHashMap = new LinkedHashMap(i32);
        it = dvVar2.iterator();
        while (true) {
            op1Var = (op1) it;
            if (!op1Var.B.hasNext()) {
            }
            j43 j43Var2 = (j43) op1Var.next();
            linkedHashMap.put(j43Var2.b, new Integer(j43Var2.a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(pq5 pq5Var, boolean z, r41 r41Var) {
        mx1 mx1Var;
        int i;
        if (r41Var instanceof mx1) {
            mx1Var = (mx1) r41Var;
            int i2 = mx1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mx1Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = mx1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mx1Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return ((hm5) obj).A;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    return ((hm5) obj).A;
                }
                oi2.Y(obj);
                sx1 sx1Var = this.k;
                if ((sx1Var.a() && sx1Var.d) || !this.m.a()) {
                    String str = pq5Var.i;
                    mx1Var.Y = 1;
                    Object j = ((pl) this.i).j(str, z, mx1Var);
                    if (j != x61Var) {
                        return j;
                    }
                } else {
                    mx1Var.Y = 2;
                    Object l = no5.l(this, pq5Var, z, mx1Var);
                    if (l != x61Var) {
                        return l;
                    }
                }
                return x61Var;
            }
        }
        mx1Var = new mx1(this, (s41) r41Var);
        Object obj2 = mx1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mx1Var.Y;
        if (i == 0) {
        }
    }
}
