package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc7  reason: default package */
/* loaded from: classes.dex */
public final class nc7 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};
    public final m16 a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final boolean d;
    public final a0 e;
    public final String[] g;
    public final di4 h;
    public final s63 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public on2 k = new kt5(16);
    public final LinkedHashMap f = new LinkedHashMap();

    public nc7(m16 m16Var, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, String[] strArr, boolean z, a0 a0Var) {
        String str;
        this.a = m16Var;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = z;
        this.e = a0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap3 = this.f;
                linkedHashMap3.put(lowerCase3, c14.j0(linkedHashMap3, lowerCase2));
            }
        }
        this.h = new di4(this.g.length);
        this.i = new s63(this.g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (r4 == r6) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(nc7 nc7Var, jz4 jz4Var, s41 s41Var) {
        ec7 ec7Var;
        int i;
        Set set;
        if (s41Var instanceof ec7) {
            ec7Var = (ec7) s41Var;
            int i2 = ec7Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ec7Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ec7Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ec7Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            Set set2 = (Set) ec7Var.R;
                            oi2.Y(obj);
                            return set2;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jz4Var = (jz4) ec7Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    h37 h37Var = new h37(10);
                    ec7Var.R = jz4Var;
                    ec7Var.Z = 1;
                    obj = jz4Var.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", h37Var, ec7Var);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    ec7Var.R = set;
                    ec7Var.Z = 2;
                    if (qo2.v(jz4Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", ec7Var) == x61Var) {
                        return x61Var;
                    }
                }
                return set;
            }
        }
        ec7Var = new ec7(nc7Var, s41Var);
        Object obj2 = ec7Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ec7Var.Z;
        if (i == 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f A[Catch: all -> 0x002d, TryCatch #1 {all -> 0x002d, blocks: (B:12:0x0029, B:32:0x0074, B:34:0x007f, B:47:0x00ba, B:37:0x008e, B:38:0x0092, B:40:0x009f, B:42:0x00a9, B:44:0x00af, B:43:0x00ad, B:45:0x00b4), top: B:57:0x0029 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(nc7 nc7Var, s41 s41Var) {
        gc7 gc7Var;
        int i;
        u63 u63Var;
        Set set;
        Object value;
        int[] iArr;
        int i2;
        m16 m16Var = nc7Var.a;
        if (s41Var instanceof gc7) {
            gc7Var = (gc7) s41Var;
            int i3 = gc7Var.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gc7Var.Z = i3 - Integer.MIN_VALUE;
                Object obj = gc7Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = gc7Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        u63Var = gc7Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th) {
                            th = th;
                            u63Var.I();
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    u63 u63Var2 = m16Var.g;
                    boolean g = u63Var2.g();
                    du1 du1Var = du1.A;
                    if (g) {
                        try {
                            if (!nc7Var.j.compareAndSet(true, false)) {
                                u63Var2.I();
                                return du1Var;
                            } else if (!((Boolean) nc7Var.k.c()).booleanValue()) {
                                u63Var2.I();
                                return du1Var;
                            } else {
                                hc7 hc7Var = new hc7(nc7Var, null, 1);
                                gc7Var.R = u63Var2;
                                gc7Var.Z = 1;
                                Object q = m16Var.q(false, hc7Var, gc7Var);
                                if (q == x61Var) {
                                    return x61Var;
                                }
                                u63Var = u63Var2;
                                obj = q;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            u63Var = u63Var2;
                            u63Var.I();
                            throw th;
                        }
                    } else {
                        return du1Var;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    s63 s63Var = nc7Var.i;
                    s63Var.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        tp6 tp6Var = (tp6) s63Var.B;
                        do {
                            value = tp6Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                if (set.contains(Integer.valueOf(i4))) {
                                    i2 = iArr2[i4] + 1;
                                } else {
                                    i2 = iArr2[i4];
                                }
                                iArr[i4] = i2;
                            }
                        } while (!tp6Var.j(value, iArr));
                    }
                    nc7Var.e.g(set);
                }
                u63Var.I();
                return set;
            }
        }
        gc7Var = new gc7(nc7Var, s41Var);
        Object obj2 = gc7Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gc7Var.Z;
        if (i == 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        u63Var.I();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
        if (defpackage.qo2.v(r1, r3, r4) == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d8, code lost:
        if (r3 == r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
        return r5;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Type inference failed for: r11v4, types: [jz4] */
    /* JADX WARN: Type inference failed for: r2v6, types: [jz4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00d8 -> B:28:0x00db). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(nc7 nc7Var, d97 d97Var, int i, s41 s41Var) {
        ic7 ic7Var;
        int i2;
        int i3;
        int i4;
        String[] strArr;
        d97 d97Var2;
        int i5;
        String str;
        String str2;
        d97 d97Var3 = d97Var;
        int i6 = i;
        nc7Var.getClass();
        if (s41Var instanceof ic7) {
            ic7Var = (ic7) s41Var;
            int i7 = ic7Var.h0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ic7Var.h0 = i7 - Integer.MIN_VALUE;
                Object obj = ic7Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = ic7Var.h0;
                boolean z = true;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i5 = ic7Var.e0;
                            i4 = ic7Var.d0;
                            i3 = ic7Var.Z;
                            strArr = ic7Var.Y;
                            str = ic7Var.X;
                            ?? r11 = ic7Var.R;
                            oi2.Y(obj);
                            boolean z2 = true;
                            d97 d97Var4 = r11;
                            i4++;
                            z = z2;
                            d97Var2 = d97Var4;
                            if (i4 < i5) {
                                String str3 = strArr[i4];
                                if (nc7Var.d) {
                                    str2 = "TEMP";
                                } else {
                                    str2 = "";
                                }
                                z2 = z;
                                StringBuilder u = i61.u("CREATE ", str2, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                                i61.B(u, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                                String o = lb1.o(u, i3, " AND invalidated = 0; END");
                                ic7Var.R = d97Var2;
                                ic7Var.X = str;
                                ic7Var.Y = strArr;
                                ic7Var.Z = i3;
                                ic7Var.d0 = i4;
                                ic7Var.e0 = i5;
                                ic7Var.h0 = 2;
                                Object v = qo2.v(d97Var2, o, ic7Var);
                                d97Var4 = d97Var2;
                            } else {
                                return jg7.a;
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        int i8 = ic7Var.Z;
                        ?? r2 = ic7Var.R;
                        oi2.Y(obj);
                        i6 = i8;
                        d97Var3 = r2;
                    }
                } else {
                    oi2.Y(obj);
                    String str4 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i6 + ", 0)";
                    ic7Var.R = d97Var3;
                    ic7Var.Z = i6;
                    ic7Var.h0 = 1;
                }
                String str5 = nc7Var.g[i6];
                i3 = i6;
                i4 = 0;
                strArr = l;
                d97Var2 = d97Var3;
                i5 = 3;
                str = str5;
                if (i4 < i5) {
                }
            }
        }
        ic7Var = new ic7(nc7Var, s41Var);
        Object obj2 = ic7Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = ic7Var.h0;
        boolean z3 = true;
        if (i2 == 0) {
        }
        String str52 = nc7Var.g[i6];
        i3 = i6;
        i4 = 0;
        strArr = l;
        d97Var2 = d97Var3;
        i5 = 3;
        str = str52;
        if (i4 < i5) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARN: Type inference failed for: r4v4, types: [jz4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0081 -> B:19:0x0084). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(nc7 nc7Var, d97 d97Var, int i, s41 s41Var) {
        jc7 jc7Var;
        int i2;
        String str;
        int i3;
        d97 d97Var2;
        int i4;
        String[] strArr;
        nc7Var.getClass();
        if (s41Var instanceof jc7) {
            jc7Var = (jc7) s41Var;
            int i5 = jc7Var.g0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                jc7Var.g0 = i5 - Integer.MIN_VALUE;
                Object obj = jc7Var.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = jc7Var.g0;
                if (i2 == 0) {
                    if (i2 == 1) {
                        i3 = jc7Var.d0;
                        i4 = jc7Var.Z;
                        String[] strArr2 = jc7Var.Y;
                        str = jc7Var.X;
                        ?? r4 = jc7Var.R;
                        oi2.Y(obj);
                        strArr = strArr2;
                        d97Var2 = r4;
                        i4++;
                        if (i4 < i3) {
                            String k = i61.k('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i4]);
                            jc7Var.R = d97Var2;
                            jc7Var.X = str;
                            jc7Var.Y = strArr;
                            jc7Var.Z = i4;
                            jc7Var.d0 = i3;
                            jc7Var.g0 = 1;
                            if (qo2.v(d97Var2, k, jc7Var) == x61Var) {
                                return x61Var;
                            }
                            i4++;
                            if (i4 < i3) {
                                return jg7.a;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    str = nc7Var.g[i];
                    i3 = 3;
                    d97Var2 = d97Var;
                    i4 = 0;
                    strArr = l;
                    if (i4 < i3) {
                    }
                }
            }
        }
        jc7Var = new jc7(nc7Var, s41Var);
        Object obj2 = jc7Var.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = jc7Var.g0;
        if (i2 == 0) {
        }
    }

    public final void e(on2 on2Var, on2 on2Var2) {
        on2Var.getClass();
        on2Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            on2Var.c();
            o41 o41Var = this.a.a;
            if (o41Var != null) {
                hv.L(o41Var, new r61("Room Invalidation Tracker Refresh"), null, new bf4(this, on2Var2, null, 23), 2);
            } else {
                nb3.a0("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(s41 s41Var) {
        kc7 kc7Var;
        int i;
        u63 u63Var;
        if (s41Var instanceof kc7) {
            kc7Var = (kc7) s41Var;
            int i2 = kc7Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kc7Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = kc7Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = kc7Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        u63Var = kc7Var.R;
                        try {
                            oi2.Y(obj);
                        } catch (Throwable th) {
                            th = th;
                            u63Var.I();
                            throw th;
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    m16 m16Var = this.a;
                    u63 u63Var2 = m16Var.g;
                    if (u63Var2.g()) {
                        try {
                            vy5 vy5Var = new vy5(this, null, 16);
                            kc7Var.R = u63Var2;
                            kc7Var.Z = 1;
                            if (m16Var.q(false, vy5Var, kc7Var) == x61Var) {
                                return x61Var;
                            }
                            u63Var = u63Var2;
                        } catch (Throwable th2) {
                            th = th2;
                            u63Var = u63Var2;
                            u63Var.I();
                            throw th;
                        }
                    }
                    return jg7.a;
                }
                u63Var.I();
                return jg7.a;
            }
        }
        kc7Var = new kc7(this, s41Var);
        Object obj2 = kc7Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = kc7Var.Z;
        if (i == 0) {
        }
        u63Var.I();
        return jg7.a;
    }
}
