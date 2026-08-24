package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv5  reason: default package */
/* loaded from: classes.dex */
public final class qv5 extends no5 {
    public final pn5 i;
    public final oj4 j;
    public final ck4 k;
    public final vk6 l;
    public final jf4 m;
    public final v46 n;
    public final tp6 o;
    public final de5 p;
    public final of6 q;
    public final be5 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv5(pn5 pn5Var, kd6 kd6Var, oj4 oj4Var, ck4 ck4Var, vk6 vk6Var, jf4 jf4Var, v46 v46Var) {
        super(pn5Var, kd6Var);
        pn5Var.getClass();
        kd6Var.getClass();
        oj4Var.getClass();
        ck4Var.getClass();
        vk6Var.getClass();
        jf4Var.getClass();
        v46Var.getClass();
        this.i = pn5Var;
        this.j = oj4Var;
        this.k = ck4Var;
        this.l = vk6Var;
        this.m = jf4Var;
        this.n = v46Var;
        tp6 a = up6.a(new oi4(null, null, false, false, 127));
        this.o = a;
        this.p = new de5(a);
        of6 a2 = bl2.a();
        this.q = a2;
        this.r = new be5(a2);
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(qv5 qv5Var, boolean z, s41 s41Var) {
        lv5 lv5Var;
        int i;
        boolean a;
        boolean z2;
        boolean z3;
        boolean z4;
        jb5 jb5Var;
        String a2;
        String str;
        ni4 ni4Var;
        ni4 ni4Var2;
        boolean z5;
        boolean z6;
        pj4 pj4Var;
        int i2;
        if (s41Var instanceof lv5) {
            lv5Var = (lv5) s41Var;
            int i3 = lv5Var.g0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lv5Var.g0 = i3 - Integer.MIN_VALUE;
                lv5 lv5Var2 = lv5Var;
                Object obj = lv5Var2.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = lv5Var2.g0;
                boolean z7 = true;
                Long l = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                boolean z8 = lv5Var2.X;
                                boolean z9 = lv5Var2.R;
                                ni4 ni4Var3 = lv5Var2.d0;
                                oi2.Y(obj);
                                z5 = z8;
                                z6 = z9;
                                ni4Var2 = ni4Var3;
                                pj4Var = (pj4) obj;
                                int i4 = 0;
                                if (pj4Var.a != ui4.OK) {
                                    z7 = false;
                                }
                                if (!z7) {
                                    i2 = pj4Var.b();
                                } else {
                                    i2 = 0;
                                }
                                if (z7) {
                                    i4 = pj4Var.b();
                                }
                                int i5 = i4;
                                ui4 ui4Var = pj4Var.a;
                                if (z7) {
                                    l = pj4Var.e;
                                }
                                return new oi4(ni4Var2, i2, i5, ui4Var, l, z5, z6);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        boolean z10 = lv5Var2.X;
                        boolean z11 = lv5Var2.R;
                        String str2 = lv5Var2.Z;
                        String str3 = lv5Var2.Y;
                        oi2.Y(obj);
                        z3 = z10;
                        z4 = z11;
                        str = str2;
                        a2 = str3;
                        if (((Boolean) obj).booleanValue()) {
                            ni4Var = ni4.ENABLED;
                        } else {
                            ni4Var = ni4.DISABLED_NO_CACHE;
                        }
                        ni4 ni4Var4 = ni4Var;
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        mo5 mo5Var = new mo5(qv5Var, a2, str, null, 2);
                        lv5Var2.Y = null;
                        lv5Var2.Z = null;
                        lv5Var2.d0 = ni4Var4;
                        lv5Var2.R = z4;
                        lv5Var2.X = z3;
                        lv5Var2.g0 = 3;
                        obj = hv.d0(de1Var, mo5Var, lv5Var2);
                        if (obj != x61Var) {
                            ni4Var2 = ni4Var4;
                            z5 = z3;
                            z6 = z4;
                            pj4Var = (pj4) obj;
                            int i42 = 0;
                            if (pj4Var.a != ui4.OK) {
                            }
                            if (!z7) {
                            }
                            if (z7) {
                            }
                            int i52 = i42;
                            ui4 ui4Var2 = pj4Var.a;
                            if (z7) {
                            }
                            return new oi4(ni4Var2, i2, i52, ui4Var2, l, z5, z6);
                        }
                        return x61Var;
                    }
                    a = lv5Var2.X;
                    z2 = lv5Var2.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    a = qv5Var.m.a();
                    pn5 pn5Var = qv5Var.i;
                    z2 = z;
                    lv5Var2.R = z2;
                    lv5Var2.X = a;
                    lv5Var2.g0 = 1;
                    obj = ((pl) pn5Var).c.b(lv5Var2);
                }
                z3 = a;
                z4 = z2;
                jb5Var = (jb5) obj;
                if (jb5Var != null) {
                    return new oi4(ni4.DISABLED_NOT_LOGGED_IN, ui4.EMPTY, z3, z4, 16);
                }
                a2 = jb5Var.a();
                str = qv5Var.h().i;
                xe1 xe1Var2 = xk1.a;
                de1 de1Var2 = de1.L;
                mo5 mo5Var2 = new mo5(qv5Var, a2, str, null, 1);
                lv5Var2.Y = a2;
                lv5Var2.Z = str;
                lv5Var2.R = z4;
                lv5Var2.X = z3;
                lv5Var2.g0 = 2;
                obj = hv.d0(de1Var2, mo5Var2, lv5Var2);
            }
        }
        lv5Var = new lv5(qv5Var, s41Var);
        lv5 lv5Var22 = lv5Var;
        Object obj2 = lv5Var22.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = lv5Var22.g0;
        boolean z72 = true;
        Long l2 = null;
        if (i == 0) {
        }
        z3 = a;
        z4 = z2;
        jb5Var = (jb5) obj2;
        if (jb5Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:24:0x008d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(qv5 qv5Var, List list, s41 s41Var) {
        mv5 mv5Var;
        int i;
        List list2;
        List list3;
        Iterator it;
        int i2;
        int i3;
        xv5 xv5Var;
        of6 of6Var = qv5Var.q;
        if (s41Var instanceof mv5) {
            mv5Var = (mv5) s41Var;
            int i4 = mv5Var.h0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mv5Var.h0 = i4 - Integer.MIN_VALUE;
                Object obj = mv5Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = mv5Var.h0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        i2 = mv5Var.e0;
                        i3 = mv5Var.d0;
                        zk6 zk6Var = mv5Var.Z;
                        it = mv5Var.Y;
                        list3 = mv5Var.X;
                        List list4 = mv5Var.R;
                        oi2.Y(obj);
                        Object obj2 = ((hm5) obj).A;
                        jg7 jg7Var2 = jg7Var;
                        if (obj2 instanceof em5) {
                            obj2 = null;
                        }
                        o75 o75Var = (o75) obj2;
                        if (o75Var != null || (r1 = o75Var.a()) == null) {
                            String h = lb1.h(zk6Var.a, "#");
                        }
                        int i5 = jv5.a[zk6Var.b.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    if (i5 == 4) {
                                        xv5Var = xv5.SERVER_REJECTED;
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    xv5Var = xv5.NOT_IN_PREFETCH_CACHE;
                                }
                            } else {
                                xv5Var = xv5.DEFINITION_CHANGED;
                            }
                        } else {
                            xv5Var = xv5.MISSING_FROM_CURRENT_SET;
                        }
                        of6Var.k(new wv5(h, xv5Var, zk6Var.c));
                        list2 = list4;
                        jg7Var = jg7Var2;
                        if (it.hasNext()) {
                            zk6Var = (zk6) it.next();
                            pn5 pn5Var = qv5Var.i;
                            jg7Var2 = jg7Var;
                            long j = zk6Var.a;
                            mv5Var.R = list2;
                            mv5Var.X = list3;
                            mv5Var.Y = it;
                            mv5Var.Z = zk6Var;
                            mv5Var.d0 = i3;
                            mv5Var.e0 = i2;
                            mv5Var.h0 = 1;
                            Object h2 = ((pl) pn5Var).h(j, mv5Var);
                            if (h2 == x61Var) {
                                return x61Var;
                            }
                            list4 = list2;
                            obj2 = h2;
                            if (obj2 instanceof em5) {
                            }
                            o75 o75Var2 = (o75) obj2;
                            if (o75Var2 != null) {
                            }
                            String h3 = lb1.h(zk6Var.a, "#");
                            int i52 = jv5.a[zk6Var.b.ordinal()];
                            if (i52 != 1) {
                            }
                            of6Var.k(new wv5(h3, xv5Var, zk6Var.c));
                            list2 = list4;
                            jg7Var = jg7Var2;
                            if (it.hasNext()) {
                                jg7 jg7Var3 = jg7Var;
                                int size = list2.size() - list3.size();
                                if (size > 0) {
                                    of6Var.k(new yv5(size));
                                    return jg7Var3;
                                }
                                return jg7Var3;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (list.isEmpty()) {
                        return jg7Var;
                    }
                    list2 = list;
                    List e1 = gt0.e1(list2, 3);
                    list3 = e1;
                    it = e1.iterator();
                    i2 = 0;
                    i3 = 3;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        mv5Var = new mv5(qv5Var, s41Var);
        Object obj3 = mv5Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = mv5Var.h0;
        jg7 jg7Var4 = jg7.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[LOOP:1: B:35:0x00b4->B:37:0x00ba, LOOP_END] */
    @Override // defpackage.no5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(ArrayList arrayList, Map map, s41 s41Var) {
        kv5 kv5Var;
        int i;
        if (s41Var instanceof kv5) {
            kv5Var = (kv5) s41Var;
            int i2 = kv5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kv5Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = kv5Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = kv5Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        map = kv5Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    kv5Var.R = map;
                    kv5Var.Z = 1;
                    ((pl) this.i).getClass();
                    obj = hv.d0(xk1.a, new xg(arrayList, null, 1), kv5Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (bb5 bb5Var : (Iterable) obj) {
                    g3 g3Var = (g3) map.get(Long.valueOf(bb5Var.a.a.a));
                    if (g3Var == null) {
                        if (bb5Var.a.b) {
                            g3Var = g3.Unlocked;
                        } else {
                            g3Var = g3.Locked;
                        }
                    }
                    Object obj2 = linkedHashMap.get(g3Var);
                    if (obj2 == null) {
                        linkedHashMap.containsKey(g3Var);
                    }
                    List list = (List) obj2;
                    m6 m6Var = new m6(bb5Var);
                    if (list != null) {
                        list.add(m6Var);
                    } else {
                        list = hf.d0(m6Var);
                    }
                    linkedHashMap.put(g3Var, list);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList2.add(new h3((g3) entry.getKey(), (List) entry.getValue()));
                }
                return gt0.d1(arrayList2, new tp5(1));
            }
        }
        kv5Var = new kv5(this, s41Var);
        Object obj3 = kv5Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kv5Var.Z;
        if (i == 0) {
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        while (r6.hasNext()) {
        }
        ArrayList arrayList22 = new ArrayList(linkedHashMap2.size());
        while (r5.hasNext()) {
        }
        return gt0.d1(arrayList22, new tp5(1));
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
        nv5 nv5Var;
        int i;
        jb5 jb5Var;
        if (s41Var instanceof nv5) {
            nv5Var = (nv5) s41Var;
            int i2 = nv5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nv5Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = nv5Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = nv5Var.Z;
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
                    pq5Var = nv5Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    nv5Var.R = pq5Var;
                    nv5Var.Z = 1;
                    obj = ((pl) this.i).c.b(nv5Var);
                }
                jb5Var = (jb5) obj;
                if (jb5Var != null) {
                    String a = jb5Var.a();
                    String str = pq5Var.i;
                    nv5Var.R = null;
                    nv5Var.Z = 2;
                    obj = this.j.g(a, str, nv5Var);
                }
                return du1.A;
            }
        }
        nv5Var = new nv5(this, s41Var);
        Object obj2 = nv5Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = nv5Var.Z;
        if (i == 0) {
        }
        jb5Var = (jb5) obj2;
        if (jb5Var != null) {
        }
        return du1.A;
    }

    @Override // defpackage.no5
    public final pq5 h() {
        Object a = this.n.a("rom");
        a.getClass();
        return ((wz5) a).A;
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
        ov5 ov5Var;
        int i;
        int k0;
        g3 g3Var;
        if (s41Var instanceof ov5) {
            ov5Var = (ov5) s41Var;
            int i2 = ov5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ov5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ov5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ov5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ov5Var.Y = 1;
                    pl plVar = (pl) this.i;
                    plVar.getClass();
                    obj = hv.d0(xk1.a, new zk(plVar, null, 0), ov5Var);
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
        ov5Var = new ov5(this, s41Var);
        Object obj2 = ov5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ov5Var.Y;
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
        pv5 pv5Var;
        int i;
        int k0;
        LinkedHashMap linkedHashMap;
        Iterator it;
        op1 op1Var;
        if (s41Var instanceof pv5) {
            pv5Var = (pv5) s41Var;
            int i2 = pv5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pv5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = pv5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = pv5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pv5Var.Y = 1;
                    pl plVar = (pl) this.i;
                    plVar.getClass();
                    obj = hv.d0(xk1.a, new zk(plVar, null, 1), pv5Var);
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
        pv5Var = new pv5(this, s41Var);
        Object obj2 = pv5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = pv5Var.Y;
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

    public final void p() {
        hv.L(to7.a(this), null, null, new bf4(this, null, 12), 3);
    }
}
