package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft2  reason: default package */
/* loaded from: classes.dex */
public final class ft2 implements Closeable {
    public final qf0 A;
    public final Map B;
    public final Map L;
    public final ArrayList R;
    public final w61 X;
    public final o41 Y;
    public final s9 Z;
    public final Object d0;
    public volatile boolean e0;
    public dk0 f0;
    public kk5 g0;
    public final Map h0;
    public final sw i0;
    public kk5 j0;
    public Map k0;
    public Map l0;
    public Map m0;
    public final List n0;
    public dk0 o0;

    /* JADX WARN: Type inference failed for: r11v0, types: [s9, java.lang.Object] */
    public ft2(qf0 qf0Var, Map map, Map map2, ArrayList arrayList, ArrayList arrayList2, w61 w61Var, n61 n61Var) {
        map.getClass();
        map2.getClass();
        w61Var.getClass();
        this.A = qf0Var;
        this.B = map;
        this.L = map2;
        this.R = arrayList2;
        this.X = w61Var;
        o41 i = g04.i(jw2.y(n61Var, new r61("CXCP-GraphLoop")));
        this.Y = i;
        a0 a0Var = new a0(1, this, ft2.class, "finalizeUnprocessedCommands", "finalizeUnprocessedCommands(Ljava/util/List;)V", 0, 0, 16);
        h4 h4Var = new h4(2, this, ft2.class, "process", "process(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 0, 5);
        ?? obj = new Object();
        obj.a = a0Var;
        obj.b = h4Var;
        obj.c = g04.s(false);
        obj.d = nb3.c(Integer.MAX_VALUE, null, new bg2(obj, 20), 2);
        obj.e = new pu();
        if (((sw) obj.c).a()) {
            if (hv.L(i, null, null, new ns3(obj, null, 4), 3).isCancelled()) {
                obj.E(null);
            }
            this.Z = obj;
            this.d0 = new Object();
            zt1 zt1Var = zt1.A;
            this.h0 = zt1Var;
            this.i0 = g04.s(true);
            this.k0 = zt1Var;
            this.l0 = zt1Var;
            this.m0 = map2;
            this.n0 = arrayList;
            return;
        }
        i.m("ProcessingQueue cannot be re-started!");
        throw null;
    }

    public final boolean A() {
        Boolean bool;
        dk0 dk0Var = this.o0;
        if (dk0Var != null) {
            kk5 kk5Var = this.j0;
            if (kk5Var != null) {
                bool = Boolean.valueOf(dk0Var.y(true, hf.b0(kk5Var), this.B, this.k0, this.m0, this.n0));
            } else {
                bool = null;
            }
            return nb3.k(bool, Boolean.TRUE);
        }
        return false;
    }

    public final void D(boolean z) {
        this.i0.a = z ? 1 : 0;
        if (z) {
            this.Z.H(ts2.b);
        }
    }

    public final void F(dk0 dk0Var) {
        synchronized (this.d0) {
            dk0 dk0Var2 = this.f0;
            this.f0 = dk0Var;
            if (this.e0) {
                this.f0 = null;
                if (dk0Var != null) {
                    hv.L(this.X, null, null, new ct2(dk0Var, null, 1), 3);
                }
                return;
            }
            if (dk0Var2 != dk0Var) {
                this.Z.H(new ys2(dk0Var2, dk0Var));
            }
            if (dk0Var == null) {
                int size = this.R.size();
                for (int i = 0; i < size; i++) {
                    ((bt2) this.R.get(i)).a();
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.d0) {
            try {
                if (this.e0) {
                    return;
                }
                this.e0 = true;
                dk0 dk0Var = this.f0;
                if (dk0Var != null) {
                    hv.L(this.X, null, null, new ct2(dk0Var, null, 0), 3);
                }
                this.f0 = null;
                this.Z.H(ts2.c);
                int size = this.R.size();
                for (int i = 0; i < size; i++) {
                    ((bt2) this.R.get(i)).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            kk5 kk5Var = (kk5) arrayList.get(i);
            List list = this.n0;
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((jk5) list.get(i2)).N(kk5Var);
            }
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            kk5 kk5Var2 = (kk5) arrayList.get(i3);
            int size4 = kk5Var2.d.size();
            for (int i4 = 0; i4 < size4; i4++) {
                ((jk5) kk5Var2.d.get(i4)).N(kk5Var2);
            }
        }
    }

    public final boolean h(List list, Map map, boolean z) {
        Map b;
        dk0 dk0Var = this.o0;
        if (dk0Var == null) {
            return false;
        }
        Map map2 = this.k0;
        if (map.isEmpty()) {
            b = this.m0;
        } else {
            p04 p04Var = new p04();
            Map map3 = this.l0;
            map3.getClass();
            p04Var.putAll(map3);
            p04Var.putAll(map);
            Map map4 = this.L;
            map4.getClass();
            p04Var.putAll(map4);
            b = p04Var.b();
        }
        Map map5 = b;
        boolean y = dk0Var.y(z, list, this.B, map2, map5, this.n0);
        if (!y) {
            if (z) {
                Log.w("CXCP", "Failed to repeat with " + gt0.b1(list));
                return y;
            } else if (map.isEmpty()) {
                Log.w("CXCP", "Failed to submit capture with " + list);
                return y;
            } else {
                Log.w("CXCP", "Failed to trigger with " + gt0.b1(list) + " and " + map);
            }
        }
        return y;
    }

    public final kk5 k() {
        kk5 kk5Var;
        synchronized (this.d0) {
            kk5Var = this.g0;
        }
        return kk5Var;
    }

    public final void n(List list, int i, us2 us2Var, boolean z) {
        if (this.i0.b() && h(null, zt1.A, false)) {
            list.remove(i);
        } else if (z && i > 0) {
            int i2 = i - 1;
            if (((at2) list.get(i2)) instanceof xs2) {
                r(i2, list, false);
            } else {
                i.m("Check failed.");
            }
        }
    }

    public final void r(int i, List list, boolean z) {
        int i2;
        int i3 = i;
        while (true) {
            int i4 = 0;
            if (-1 < i3) {
                at2 at2Var = (at2) list.get(i3);
                if (at2Var instanceof xs2) {
                    kk5 kk5Var = ((xs2) at2Var).a;
                    if (h(hf.b0(kk5Var), zt1.A, true)) {
                        this.j0 = kk5Var;
                        list.remove(i3);
                        while (i4 < i3) {
                            if (((at2) list.get(i4)) instanceof xs2) {
                                list.remove(i4);
                                i3--;
                            } else {
                                i4++;
                            }
                        }
                        return;
                    }
                }
                i3--;
            } else if (z && (i2 = i + 1) < list.size()) {
                at2 at2Var2 = (at2) list.get(i2);
                if (at2Var2 instanceof us2) {
                    n(list, i2, (us2) at2Var2, false);
                    return;
                } else if (at2Var2 instanceof zs2) {
                    x(list, i2, (zs2) at2Var2);
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final String toString() {
        return "GraphLoop(" + this.A + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, bh5] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00be -> B:37:0x00da). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d6 -> B:36:0x00d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e7 -> B:39:0x00e8). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(List list, int i, ys2 ys2Var, r41 r41Var) {
        dt2 dt2Var;
        int i2;
        int i3;
        ys2 ys2Var2;
        bh5 bh5Var;
        dt2 dt2Var2;
        int i4;
        List list2;
        List list3;
        ys2 ys2Var3;
        at2 at2Var;
        bh5 bh5Var2;
        List list4;
        int i5;
        List list5;
        dk0 dk0Var;
        bh5 bh5Var3;
        List list6;
        at2 at2Var2;
        ys2 ys2Var4;
        bh5 bh5Var4;
        boolean z;
        if (r41Var instanceof dt2) {
            dt2Var = (dt2) r41Var;
            int i6 = dt2Var.i0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dt2Var.i0 = i6 - Integer.MIN_VALUE;
                Object obj = dt2Var.g0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = dt2Var.i0;
                jg7 jg7Var = jg7.a;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                bh5Var4 = dt2Var.Y;
                                ys2Var4 = dt2Var.X;
                                list3 = dt2Var.R;
                                oi2.Y(obj);
                                bh5Var = bh5Var4;
                                ys2Var2 = ys2Var4;
                                this.o0 = ys2Var2.b;
                                if (!A()) {
                                    kk5 kk5Var = this.j0;
                                    if (kk5Var != null) {
                                        list3.add(0, new xs2(kk5Var));
                                        if (bh5Var.A == 1) {
                                            list3.add(ts2.b);
                                        }
                                    }
                                    this.j0 = null;
                                }
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = dt2Var.f0;
                        i5 = dt2Var.e0;
                        list4 = dt2Var.Z;
                        bh5Var2 = dt2Var.Y;
                        ys2 ys2Var5 = dt2Var.X;
                        List list7 = dt2Var.R;
                        oi2.Y(obj);
                        list5 = list7;
                        ys2Var3 = ys2Var5;
                        list2 = list4;
                        bh5Var = bh5Var2;
                        i4 = i5;
                        bh5Var.A++;
                        dt2Var2 = dt2Var;
                        list3 = list5;
                        z = true;
                        ys2Var2 = ys2Var3;
                        if (z) {
                            list2.remove(i4);
                            i3--;
                        } else {
                            i4++;
                        }
                        if (i4 >= i3) {
                            at2Var = (at2) list2.get(i4);
                            if (at2Var instanceof ys2) {
                                ys2 ys2Var6 = (ys2) at2Var;
                                dk0 dk0Var2 = ys2Var6.a;
                                if (dk0Var2 != null) {
                                    dt2Var2.R = list3;
                                    dt2Var2.X = ys2Var2;
                                    dt2Var2.Y = bh5Var;
                                    dt2Var2.Z = list2;
                                    dt2Var2.d0 = ys2Var6;
                                    dt2Var2.e0 = i4;
                                    dt2Var2.f0 = i3;
                                    dt2Var2.i0 = 1;
                                    dk0Var2.w();
                                    if (jg7Var != x61Var) {
                                        bh5Var3 = bh5Var;
                                        at2Var2 = at2Var;
                                        ys2Var3 = ys2Var2;
                                        list5 = list3;
                                        dt2Var = dt2Var2;
                                        i5 = i4;
                                        list6 = list2;
                                        bh5 bh5Var5 = bh5Var3;
                                        at2Var = at2Var2;
                                        list4 = list6;
                                        bh5Var2 = bh5Var5;
                                        dk0Var = ((ys2) at2Var).b;
                                        if (dk0Var != null) {
                                            dt2Var.R = list5;
                                            dt2Var.X = ys2Var3;
                                            dt2Var.Y = bh5Var2;
                                            dt2Var.Z = list4;
                                            dt2Var.d0 = null;
                                            dt2Var.e0 = i5;
                                            dt2Var.f0 = i3;
                                            dt2Var.i0 = 2;
                                            dk0Var.w();
                                            if (jg7Var != x61Var) {
                                                ys2Var5 = ys2Var3;
                                                list7 = list5;
                                                list5 = list7;
                                                ys2Var3 = ys2Var5;
                                            }
                                        }
                                        list2 = list4;
                                        bh5Var = bh5Var2;
                                        i4 = i5;
                                        bh5Var.A++;
                                        dt2Var2 = dt2Var;
                                        list3 = list5;
                                        z = true;
                                        ys2Var2 = ys2Var3;
                                        if (z) {
                                        }
                                        if (i4 >= i3) {
                                        }
                                    }
                                } else {
                                    ys2Var3 = ys2Var2;
                                    list5 = list3;
                                    dt2Var = dt2Var2;
                                    i5 = i4;
                                    bh5Var2 = bh5Var;
                                    list4 = list2;
                                    dk0Var = ((ys2) at2Var).b;
                                    if (dk0Var != null) {
                                    }
                                    list2 = list4;
                                    bh5Var = bh5Var2;
                                    i4 = i5;
                                    bh5Var.A++;
                                    dt2Var2 = dt2Var;
                                    list3 = list5;
                                    z = true;
                                    ys2Var2 = ys2Var3;
                                    if (z) {
                                    }
                                    if (i4 >= i3) {
                                    }
                                }
                            } else {
                                z = false;
                                if (z) {
                                }
                                if (i4 >= i3) {
                                    dk0 dk0Var3 = ys2Var2.a;
                                    if (dk0Var3 != null) {
                                        dt2Var2.R = list3;
                                        dt2Var2.X = ys2Var2;
                                        dt2Var2.Y = bh5Var;
                                        dt2Var2.Z = null;
                                        dt2Var2.d0 = null;
                                        dt2Var2.i0 = 3;
                                        dk0Var3.w();
                                        if (jg7Var != x61Var) {
                                            ys2Var4 = ys2Var2;
                                            bh5Var4 = bh5Var;
                                            bh5Var = bh5Var4;
                                            ys2Var2 = ys2Var4;
                                        }
                                    }
                                    this.o0 = ys2Var2.b;
                                    if (!A()) {
                                    }
                                    return jg7Var;
                                }
                            }
                        }
                        return x61Var;
                    }
                    i3 = dt2Var.f0;
                    i5 = dt2Var.e0;
                    at2Var2 = dt2Var.d0;
                    list6 = dt2Var.Z;
                    bh5Var3 = dt2Var.Y;
                    ys2Var3 = dt2Var.X;
                    list5 = dt2Var.R;
                    oi2.Y(obj);
                    bh5 bh5Var52 = bh5Var3;
                    at2Var = at2Var2;
                    list4 = list6;
                    bh5Var2 = bh5Var52;
                    dk0Var = ((ys2) at2Var).b;
                    if (dk0Var != null) {
                    }
                    list2 = list4;
                    bh5Var = bh5Var2;
                    i4 = i5;
                    bh5Var.A++;
                    dt2Var2 = dt2Var;
                    list3 = list5;
                    z = true;
                    ys2Var2 = ys2Var3;
                    if (z) {
                    }
                    if (i4 >= i3) {
                    }
                    return x61Var;
                }
                oi2.Y(obj);
                ?? obj2 = new Object();
                obj2.A = 1;
                list.remove(i);
                i3 = i;
                ys2Var2 = ys2Var;
                bh5Var = obj2;
                dt2Var2 = dt2Var;
                i4 = 0;
                list2 = list;
                list3 = list2;
                if (i4 >= i3) {
                }
                return x61Var;
            }
        }
        dt2Var = new dt2(this, r41Var);
        Object obj3 = dt2Var.g0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = dt2Var.i0;
        jg7 jg7Var2 = jg7.a;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (r3 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c6, code lost:
        if (r3 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cd  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:48:0x00cb). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00b7 -> B:47:0x00c9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c6 -> B:47:0x00c9). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(List list, r41 r41Var) {
        et2 et2Var;
        int i;
        int i2;
        List list2;
        int size;
        at2 at2Var;
        int i3;
        List list3;
        dk0 dk0Var;
        at2 at2Var2;
        if (r41Var instanceof et2) {
            et2Var = (et2) r41Var;
            int i4 = et2Var.f0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                et2Var.f0 = i4 - Integer.MIN_VALUE;
                Object obj = et2Var.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = et2Var.f0;
                jg7 jg7Var = jg7.a;
                i2 = 0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                size = et2Var.Z;
                                i3 = et2Var.Y;
                                list3 = et2Var.R;
                                oi2.Y(obj);
                                list2 = list3;
                                i2 = i3;
                                i2++;
                                if (i2 < size) {
                                    at2Var = (at2) list2.get(i2);
                                    if (at2Var instanceof ys2) {
                                        ys2 ys2Var = (ys2) at2Var;
                                        dk0 dk0Var2 = ys2Var.a;
                                        if (dk0Var2 != null) {
                                            et2Var.R = list2;
                                            et2Var.X = ys2Var;
                                            et2Var.Y = i2;
                                            et2Var.Z = size;
                                            et2Var.f0 = 2;
                                            dk0Var2.w();
                                            if (jg7Var != x61Var) {
                                                i3 = i2;
                                                at2Var2 = at2Var;
                                                at2Var = at2Var2;
                                                list3 = list2;
                                                dk0Var = ((ys2) at2Var).b;
                                                if (dk0Var != null) {
                                                    et2Var.R = list3;
                                                    et2Var.X = null;
                                                    et2Var.Y = i3;
                                                    et2Var.Z = size;
                                                    et2Var.f0 = 3;
                                                    dk0Var.w();
                                                }
                                                list2 = list3;
                                                i2 = i3;
                                            }
                                            return x61Var;
                                        }
                                        i3 = i2;
                                        list3 = list2;
                                        dk0Var = ((ys2) at2Var).b;
                                        if (dk0Var != null) {
                                        }
                                        list2 = list3;
                                        i2 = i3;
                                    }
                                    i2++;
                                    if (i2 < size) {
                                        list2.clear();
                                        g04.x(this.Y, null);
                                        return jg7Var;
                                    }
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            size = et2Var.Z;
                            i3 = et2Var.Y;
                            at2Var2 = et2Var.X;
                            list2 = et2Var.R;
                            oi2.Y(obj);
                            at2Var = at2Var2;
                            list3 = list2;
                            dk0Var = ((ys2) at2Var).b;
                            if (dk0Var != null) {
                            }
                            list2 = list3;
                            i2 = i3;
                            i2++;
                            if (i2 < size) {
                            }
                        }
                    } else {
                        list = et2Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    this.j0 = null;
                    zt1 zt1Var = zt1.A;
                    this.k0 = zt1Var;
                    this.l0 = zt1Var;
                    int size2 = list.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        if (((at2) list.get(i5)) instanceof us2) {
                            e(null);
                        }
                    }
                    dk0 dk0Var3 = this.o0;
                    if (dk0Var3 != null) {
                        et2Var.R = list;
                        et2Var.f0 = 1;
                        dk0Var3.w();
                    }
                }
                this.o0 = null;
                list2 = list;
                size = list.size();
                if (i2 < size) {
                }
            }
        }
        et2Var = new et2(this, r41Var);
        Object obj2 = et2Var.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = et2Var.f0;
        jg7 jg7Var2 = jg7.a;
        i2 = 0;
        if (i == 0) {
        }
        this.o0 = null;
        list2 = list;
        size = list.size();
        if (i2 < size) {
        }
    }

    public final void x(List list, int i, zs2 zs2Var) {
        kk5 kk5Var = this.j0;
        if (kk5Var == null && i == 0) {
            list.remove(i);
        } else if (this.i0.b() && kk5Var != null && h(hf.b0(kk5Var), zs2Var.a, false)) {
            list.remove(i);
        } else if (i > 0) {
            int i2 = i - 1;
            if (((at2) list.get(i2)) instanceof xs2) {
                r(i2, list, false);
            } else {
                i.m("Check failed.");
            }
        }
    }
}
