package defpackage;

import java.io.File;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oj4  reason: default package */
/* loaded from: classes.dex */
public final class oj4 {
    public final vi a;
    public final fi b;
    public final vr0 c;
    public final on2 d;
    public final hb4 e;

    public oj4(vi viVar, fi fiVar, v34 v34Var) {
        vs0 vs0Var = vs0.d0;
        this.a = viVar;
        this.b = fiVar;
        this.c = vs0Var;
        this.d = v34Var;
        this.e = new hb4();
    }

    public static LinkedHashMap f(List list) {
        long j;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        long j2;
        Long l5;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            yi4 yi4Var = ((bj4) it.next()).a;
            String str = yi4Var.h;
            long j3 = yi4Var.i;
            if (!qs6.v0(str)) {
                int i = fj4.a[yi4Var.a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        dk4 dk4Var = (dk4) linkedHashMap.get(str);
                        if (dk4Var != null) {
                            j = dk4Var.a;
                        } else {
                            j = yi4Var.b;
                        }
                        if (dk4Var != null) {
                            l = dk4Var.c;
                            l2 = null;
                        } else {
                            l = null;
                            l2 = null;
                        }
                        Long valueOf = Long.valueOf(j3);
                        long j4 = yi4Var.m;
                        Long valueOf2 = Long.valueOf(j4);
                        if (j4 <= 0) {
                            valueOf2 = l2;
                        }
                        if (valueOf2 == null) {
                            if (dk4Var != null) {
                                l3 = dk4Var.e;
                            } else {
                                l3 = l2;
                            }
                        } else {
                            l3 = valueOf2;
                        }
                        linkedHashMap.put(str, new dk4(j, str, l, valueOf, l3));
                    }
                } else {
                    dk4 dk4Var2 = (dk4) linkedHashMap.get(str);
                    long j5 = yi4Var.b;
                    Long valueOf3 = Long.valueOf(j3);
                    if (dk4Var2 != null) {
                        l4 = dk4Var2.d;
                    } else {
                        l4 = null;
                    }
                    if (dk4Var2 != null) {
                        j2 = j5;
                        l5 = dk4Var2.e;
                    } else {
                        j2 = j5;
                        l5 = null;
                    }
                    linkedHashMap.put(str, new dk4(j2, str, valueOf3, l4, l5));
                }
            }
        }
        return linkedHashMap;
    }

    public static Long h(ti4 ti4Var, ArrayList arrayList) {
        Comparable comparable;
        if (ti4Var.b > 0) {
            oc2 oc2Var = new oc2(new pc2(new qd2(new ev(arrayList, 1), new x84(21), 2), true, new x84(22)));
            if (!oc2Var.hasNext()) {
                comparable = null;
            } else {
                comparable = (Comparable) oc2Var.next();
                while (oc2Var.hasNext()) {
                    Comparable comparable2 = (Comparable) oc2Var.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
            }
            Long l = (Long) comparable;
            if (l != null) {
                return Long.valueOf(l.longValue() + 1209600000);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, long j, long j2, boolean z, long j3, gk4 gk4Var, ik4 ik4Var, s41 s41Var) {
        gj4 gj4Var;
        int i;
        if (s41Var instanceof gj4) {
            gj4Var = (gj4) s41Var;
            int i2 = gj4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gj4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = gj4Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = gj4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                yi4 yi4Var = new yi4(dj4.ACHIEVEMENT_ACK, str, str2, j, j2, z, null, this.c.b().b(), 0L, 0L, j3, 0L, gk4Var, ik4Var, false, 13954);
                gj4Var.Y = 1;
                Object c = c(str, str2, yi4Var, gj4Var);
                if (c == obj2) {
                    return obj2;
                }
                return c;
            }
        }
        gj4Var = new gj4(this, s41Var);
        Object obj3 = gj4Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = gj4Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, long j, long j2, String str3, long j3, long j4, long j5, gk4 gk4Var, ik4 ik4Var, s41 s41Var) {
        hj4 hj4Var;
        int i;
        if (s41Var instanceof hj4) {
            hj4Var = (hj4) s41Var;
            int i2 = hj4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hj4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = hj4Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = hj4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                yi4 yi4Var = new yi4(dj4.ACHIEVEMENT_UNLOCK, str, str2, j, j2, false, str3, j3, j4, j5, 0L, 0L, gk4Var, ik4Var, true, 14338);
                hj4Var.Y = 1;
                Object c = c(str, str2, yi4Var, hj4Var);
                if (c == obj2) {
                    return obj2;
                }
                return c;
            }
        }
        hj4Var = new hj4(this, s41Var);
        Object obj3 = hj4Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = hj4Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, yi4 yi4Var, s41 s41Var) {
        ij4 ij4Var;
        Object obj;
        x61 x61Var;
        int i;
        String str3;
        String str4;
        yi4 yi4Var2;
        fb4 fb4Var;
        int i2;
        Throwable th;
        fb4 fb4Var2;
        try {
            try {
                if (s41Var instanceof ij4) {
                    ij4Var = (ij4) s41Var;
                    int i3 = ij4Var.g0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ij4Var.g0 = i3 - Integer.MIN_VALUE;
                        obj = ij4Var.e0;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = ij4Var.g0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    fb4Var2 = ij4Var.Z;
                                    try {
                                        oi2.Y(obj);
                                        Object obj2 = ((hm5) obj).A;
                                        fb4Var2.h(null);
                                        return obj2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fb4Var2.h(null);
                                        throw th;
                                    }
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = ij4Var.d0;
                            fb4Var = ij4Var.Z;
                            yi4 yi4Var3 = ij4Var.Y;
                            String str5 = ij4Var.X;
                            String str6 = ij4Var.R;
                            oi2.Y(obj);
                            yi4Var2 = yi4Var3;
                            str4 = str5;
                            str3 = str6;
                        } else {
                            oi2.Y(obj);
                            if (!((Boolean) this.d.c()).booleanValue()) {
                                return new em5(new IllegalStateException("Built-in offline ledger is disabled for the effective RA backend"));
                            }
                            ij4Var.R = str;
                            ij4Var.X = str2;
                            ij4Var.Y = yi4Var;
                            hb4 hb4Var = this.e;
                            ij4Var.Z = hb4Var;
                            ij4Var.d0 = 0;
                            ij4Var.g0 = 1;
                            if (hb4Var.e(ij4Var) != x61Var) {
                                str3 = str;
                                str4 = str2;
                                yi4Var2 = yi4Var;
                                fb4Var = hb4Var;
                                i2 = 0;
                            }
                            return x61Var;
                        }
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        l5 l5Var = new l5(this, str3, str4, yi4Var2, null, 23);
                        ij4Var.R = null;
                        ij4Var.X = null;
                        ij4Var.Y = null;
                        ij4Var.Z = fb4Var;
                        ij4Var.d0 = i2;
                        ij4Var.g0 = 2;
                        obj = hv.d0(de1Var, l5Var, ij4Var);
                        if (obj != x61Var) {
                            fb4Var2 = fb4Var;
                            Object obj22 = ((hm5) obj).A;
                            fb4Var2.h(null);
                            return obj22;
                        }
                        return x61Var;
                    }
                }
                l5 l5Var2 = new l5(this, str3, str4, yi4Var2, null, 23);
                ij4Var.R = null;
                ij4Var.X = null;
                ij4Var.Y = null;
                ij4Var.Z = fb4Var;
                ij4Var.d0 = i2;
                ij4Var.g0 = 2;
                obj = hv.d0(de1Var, l5Var2, ij4Var);
                if (obj != x61Var) {
                }
                return x61Var;
            } catch (Throwable th3) {
                th = th3;
                fb4Var2 = fb4Var;
                fb4Var2.h(null);
                throw th;
            }
            xe1 xe1Var2 = xk1.a;
            de1 de1Var2 = de1.L;
        } catch (Throwable th4) {
            th = th4;
        }
        ij4Var = new ij4(this, s41Var);
        obj = ij4Var.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = ij4Var.g0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, String str2, long j, String str3, long j2, long j3, boolean z, gk4 gk4Var, ik4 ik4Var, s41 s41Var) {
        kj4 kj4Var;
        int i;
        if (s41Var instanceof kj4) {
            kj4Var = (kj4) s41Var;
            int i2 = kj4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kj4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = kj4Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = kj4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                yi4 yi4Var = new yi4(dj4.SESSION_END, str, str2, j, 0L, z, str3, j2, 0L, 0L, 0L, j3, gk4Var, ik4Var, false, 11810);
                kj4Var.Y = 1;
                Object c = c(str, str2, yi4Var, kj4Var);
                if (c == obj2) {
                    return obj2;
                }
                return c;
            }
        }
        kj4Var = new kj4(this, s41Var);
        Object obj3 = kj4Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = kj4Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, long j, String str3, long j2, boolean z, gk4 gk4Var, ik4 ik4Var, s41 s41Var) {
        lj4 lj4Var;
        int i;
        if (s41Var instanceof lj4) {
            lj4Var = (lj4) s41Var;
            int i2 = lj4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lj4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = lj4Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = lj4Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                        return ((hm5) obj).A;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                yi4 yi4Var = new yi4(dj4.SESSION_START, str, str2, j, 0L, z, str3, j2, 0L, 0L, 0L, 0L, gk4Var, ik4Var, false, 15906);
                lj4Var.Y = 1;
                Object c = c(str, str2, yi4Var, lj4Var);
                if (c == obj2) {
                    return obj2;
                }
                return c;
            }
        }
        lj4Var = new lj4(this, s41Var);
        Object obj3 = lj4Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = lj4Var.Y;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|(1:(1:(7:10|11|12|13|(1:15)(4:19|20|21|(1:23)(8:24|(1:26)(2:43|(1:45)(4:46|(2:49|47)|50|51))|27|(4:30|(3:32|33|34)(1:36)|35|28)|37|38|(1:40)(1:42)|41))|16|17)(2:61|62))(1:63))(3:74|(1:76)|67)|64|65|(5:68|13|(0)(0)|16|17)|67))|77|6|(0)(0)|64|65|(0)|67|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x018c, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x018e, code lost:
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0190, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0191, code lost:
        r13 = r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a A[Catch: all -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x002f, blocks: (B:13:0x002b, B:28:0x0086, B:30:0x008a, B:32:0x0093, B:33:0x00a3, B:35:0x00af, B:36:0x00b6, B:38:0x010a, B:47:0x0133, B:48:0x013c, B:50:0x0142, B:52:0x0156, B:53:0x015a, B:55:0x0170, B:57:0x017d, B:39:0x010d, B:41:0x0117, B:42:0x011c, B:43:0x0124, B:45:0x012a, B:58:0x0184, B:63:0x0193), top: B:71:0x002b, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, String str2, s41 s41Var) {
        mj4 mj4Var;
        Object obj;
        x61 x61Var;
        int i;
        fb4 fb4Var;
        int i2;
        String str3;
        fb4 fb4Var2;
        pj4 pj4Var;
        byte[] bArr;
        Set set;
        Long l;
        if (s41Var instanceof mj4) {
            mj4Var = (mj4) s41Var;
            int i3 = mj4Var.f0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mj4Var.f0 = i3 - Integer.MIN_VALUE;
                obj = mj4Var.d0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = mj4Var.f0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            fb4Var2 = mj4Var.Y;
                            try {
                                try {
                                    oi2.Y(obj);
                                    bArr = (byte[]) obj;
                                    if (bArr != null) {
                                        pj4Var = new pj4(ui4.EMPTY);
                                    } else {
                                        try {
                                            ti4 ti4Var = (ti4) pi4.a.a(ti4.Companion.serializer(), bArr);
                                            List list = ti4Var.a;
                                            ui4 ui4Var = j(list).a;
                                            if (ui4Var != ui4.OK) {
                                                pj4Var = new pj4(ui4Var);
                                            } else {
                                                List c0 = sb6.c0(new qd2(new pc2(gt0.B0(list), true, new x84(17)), new bg2(this, 16), 2));
                                                oc2 oc2Var = new oc2(new pc2(new qd2(new pc2(new ev(list, 1), true, new x84(18)), new x84(19), 2), true, new x84(20)));
                                                if (!oc2Var.hasNext()) {
                                                    set = du1.A;
                                                } else {
                                                    Object next = oc2Var.next();
                                                    if (!oc2Var.hasNext()) {
                                                        set = ii2.R(next);
                                                    } else {
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        linkedHashSet.add(next);
                                                        while (oc2Var.hasNext()) {
                                                            linkedHashSet.add(oc2Var.next());
                                                        }
                                                        set = linkedHashSet;
                                                    }
                                                }
                                                ArrayList arrayList = new ArrayList();
                                                for (Object obj2 : c0) {
                                                    if (!set.contains(new Long(((ek4) obj2).a))) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                                LinkedHashMap f = f(list);
                                                Long h = h(ti4Var, arrayList);
                                                long b = this.c.b().b();
                                                ui4 ui4Var2 = ui4.OK;
                                                if (h != null) {
                                                    l = new Long(h.longValue() - b);
                                                } else {
                                                    l = null;
                                                }
                                                pj4Var = new pj4(ui4Var2, arrayList, f, h, l);
                                            }
                                        } catch (Exception unused) {
                                            pj4Var = new pj4(ui4.TAMPERED);
                                        }
                                    }
                                } catch (Exception unused2) {
                                    pj4Var = new pj4(ui4.IO_ERROR);
                                    fb4Var2.h(null);
                                    return pj4Var;
                                }
                                fb4Var2.h(null);
                                return pj4Var;
                            } catch (Throwable th) {
                                Throwable th2 = th;
                                fb4Var2.h(null);
                                throw th2;
                            }
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i4 = mj4Var.Z;
                    fb4Var = mj4Var.Y;
                    String str4 = mj4Var.X;
                    String str5 = mj4Var.R;
                    oi2.Y(obj);
                    str3 = str4;
                    i2 = i4;
                    str = str5;
                } else {
                    oi2.Y(obj);
                    mj4Var.R = str;
                    mj4Var.X = str2;
                    fb4Var = this.e;
                    mj4Var.Y = fb4Var;
                    i2 = 0;
                    mj4Var.Z = 0;
                    mj4Var.f0 = 1;
                    if (fb4Var.e(mj4Var) != x61Var) {
                        str3 = str2;
                    }
                    return x61Var;
                }
                vi viVar = this.a;
                mj4Var.R = null;
                mj4Var.X = null;
                mj4Var.Y = fb4Var;
                mj4Var.Z = i2;
                mj4Var.f0 = 2;
                kh khVar = viVar.a;
                File a = viVar.a(str, str3);
                khVar.getClass();
                xe1 xe1Var = xk1.a;
                obj = hv.d0(de1.L, new m5(a, khVar, (r41) null, 1), mj4Var);
                if (obj != x61Var) {
                    fb4Var2 = fb4Var;
                    bArr = (byte[]) obj;
                    if (bArr != null) {
                    }
                    fb4Var2.h(null);
                    return pj4Var;
                }
                return x61Var;
            }
        }
        mj4Var = new mj4(this, s41Var);
        obj = mj4Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = mj4Var.f0;
        if (i == 0) {
        }
        vi viVar2 = this.a;
        mj4Var.R = null;
        mj4Var.X = null;
        mj4Var.Y = fb4Var;
        mj4Var.Z = i2;
        mj4Var.f0 = 2;
        kh khVar2 = viVar2.a;
        File a2 = viVar2.a(str, str3);
        khVar2.getClass();
        xe1 xe1Var2 = xk1.a;
        obj = hv.d0(de1.L, new m5(a2, khVar2, (r41) null, 1), mj4Var);
        if (obj != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(String str, String str2, s41 s41Var) {
        nj4 nj4Var;
        Object obj;
        x61 x61Var;
        int i;
        String str3;
        String str4;
        fb4 fb4Var;
        int i2;
        Throwable th;
        fb4 fb4Var2;
        try {
            try {
                if (s41Var instanceof nj4) {
                    nj4Var = (nj4) s41Var;
                    int i3 = nj4Var.f0;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nj4Var.f0 = i3 - Integer.MIN_VALUE;
                        obj = nj4Var.d0;
                        x61Var = x61.COROUTINE_SUSPENDED;
                        i = nj4Var.f0;
                        if (i == 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    fb4Var2 = nj4Var.Y;
                                    try {
                                        oi2.Y(obj);
                                        Object obj2 = ((hm5) obj).A;
                                        fb4Var2.h(null);
                                        return obj2;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fb4Var2.h(null);
                                        throw th;
                                    }
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = nj4Var.Z;
                            fb4Var = nj4Var.Y;
                            String str5 = nj4Var.X;
                            String str6 = nj4Var.R;
                            oi2.Y(obj);
                            str4 = str5;
                            str3 = str6;
                        } else {
                            oi2.Y(obj);
                            nj4Var.R = str;
                            nj4Var.X = str2;
                            hb4 hb4Var = this.e;
                            nj4Var.Y = hb4Var;
                            nj4Var.Z = 0;
                            nj4Var.f0 = 1;
                            if (hb4Var.e(nj4Var) != x61Var) {
                                str3 = str;
                                str4 = str2;
                                fb4Var = hb4Var;
                                i2 = 0;
                            }
                            return x61Var;
                        }
                        xe1 xe1Var = xk1.a;
                        de1 de1Var = de1.L;
                        u12 u12Var = new u12(this, str3, str4, (r41) null, 19);
                        nj4Var.R = null;
                        nj4Var.X = null;
                        nj4Var.Y = fb4Var;
                        nj4Var.Z = i2;
                        nj4Var.f0 = 2;
                        obj = hv.d0(de1Var, u12Var, nj4Var);
                        if (obj != x61Var) {
                            fb4Var2 = fb4Var;
                            Object obj22 = ((hm5) obj).A;
                            fb4Var2.h(null);
                            return obj22;
                        }
                        return x61Var;
                    }
                }
                u12 u12Var2 = new u12(this, str3, str4, (r41) null, 19);
                nj4Var.R = null;
                nj4Var.X = null;
                nj4Var.Y = fb4Var;
                nj4Var.Z = i2;
                nj4Var.f0 = 2;
                obj = hv.d0(de1Var, u12Var2, nj4Var);
                if (obj != x61Var) {
                }
                return x61Var;
            } catch (Throwable th3) {
                th = th3;
                fb4Var2 = fb4Var;
                fb4Var2.h(null);
                throw th;
            }
            xe1 xe1Var2 = xk1.a;
            de1 de1Var2 = de1.L;
        } catch (Throwable th4) {
            th = th4;
        }
        nj4Var = new nj4(this, s41Var);
        obj = nj4Var.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = nj4Var.f0;
        if (i == 0) {
        }
    }

    public final ej4 j(List list) {
        boolean z;
        if (list.isEmpty()) {
            return new ej4(ui4.EMPTY, null, null);
        }
        byte[] bArr = new byte[0];
        long j = ((bj4) gt0.H0(list)).a.b;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                bj4 bj4Var = (bj4) obj;
                yi4 yi4Var = bj4Var.a;
                byte[] bArr2 = bj4Var.b;
                p45 p45Var = pi4.a;
                yi4Var.getClass();
                byte[] b = pi4.a.b(yi4.Companion.serializer(), yi4Var);
                long j2 = yi4Var.b;
                byte[] digest = MessageDigest.getInstance("SHA-256").digest(b);
                digest.getClass();
                if (!Arrays.equals(digest, bArr2)) {
                    return new ej4(ui4.TAMPERED, null, null);
                }
                if (!Arrays.equals(yi4Var.n, bArr)) {
                    return new ej4(ui4.TAMPERED, null, null);
                }
                if (i > 0 && j2 != j) {
                    return new ej4(ui4.TAMPERED, null, null);
                }
                try {
                    fi fiVar = this.b;
                    byte[] bArr3 = bj4Var.c;
                    bArr2.getClass();
                    bArr3.getClass();
                    PublicKey publicKey = fiVar.a().getPublic();
                    Signature signature = Signature.getInstance("SHA256withECDSA");
                    signature.initVerify(publicKey);
                    signature.update(bArr2);
                    z = signature.verify(bArr3);
                } catch (Exception unused) {
                    z = false;
                }
                if (!z) {
                    return new ej4(ui4.SIGNING_KEY_INVALID, null, null);
                }
                j = j2 + 1;
                i = i2;
                bArr = bArr2;
            } else {
                hf.q0();
                throw null;
            }
        }
        bj4 bj4Var2 = (bj4) gt0.Q0(list);
        return new ej4(ui4.OK, Long.valueOf(bj4Var2.a.b), bj4Var2.b);
    }
}
