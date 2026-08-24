package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci0  reason: default package */
/* loaded from: classes.dex */
public final class ci0 implements y23 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ci0(ne1 ne1Var) {
        this.a = ne1Var;
        tp6 a = up6.a(null);
        this.b = a;
        tp6 a2 = up6.a(d83.e);
        this.c = a2;
        tp6 a3 = up6.a(null);
        this.d = a3;
        tp6 a4 = up6.a(yt1.A);
        this.e = a4;
        tp6 a5 = up6.a(null);
        this.f = a5;
        le2 z = f04.z(new wp0(6, new le2[]{a, a2, a3, a4, a5}, new if7(null)));
        jd1 jd1Var = oq1.B;
        le2 x = f04.x(z, q60.Y(n16.L(50, uq1.MILLISECONDS)));
        tp6 a6 = up6.a(null);
        this.g = a6;
        this.h = new xf2(a6, x, new kz0(this, null, 3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r10 == r0) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(ci0 ci0Var, tn5 tn5Var, s41 s41Var) {
        ao5 ao5Var;
        int i;
        Object c;
        Throwable a;
        List list;
        kw3 I;
        kw3 kw3Var;
        kw3 kw3Var2;
        s95 s95Var;
        ci0Var.getClass();
        if (s41Var instanceof ao5) {
            ao5Var = (ao5) s41Var;
            int i2 = ao5Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ao5Var.e0 = i2 - Integer.MIN_VALUE;
                ao5 ao5Var2 = ao5Var;
                Object obj = ao5Var2.Z;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = ao5Var2.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            kw3Var = ao5Var2.Y;
                            kw3Var2 = ao5Var2.X;
                            oi2.Y(obj);
                            s95Var = (s95) obj;
                            if (s95Var != null) {
                                kw3Var.add(s95Var);
                            }
                            I = kw3Var2;
                            list = hf.A(I);
                            return new xn5(list);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tn5Var = ao5Var2.R;
                    oi2.Y(obj);
                    c = ((hm5) obj).A;
                } else {
                    oi2.Y(obj);
                    o75 o75Var = tn5Var.a;
                    boolean z = tn5Var.b;
                    hb5 hb5Var = tn5Var.c;
                    ao5Var2.R = tn5Var;
                    ao5Var2.e0 = 1;
                    c = ((pl) ((pn5) ci0Var.a)).c(o75Var, z, hb5Var, ao5Var2);
                }
                a = hm5.a(c);
                list = yt1.A;
                if (a != null) {
                    o85 o85Var = (o85) c;
                    if (o85Var.a) {
                        I = hf.I();
                        I.add(new q95(tn5Var.a));
                        if (o85Var.a && o85Var.b == 0) {
                            long j = tn5Var.a.c;
                            boolean z2 = tn5Var.b;
                            String str = tn5Var.c.a;
                            ao5Var2.R = null;
                            ao5Var2.X = I;
                            ao5Var2.Y = I;
                            ao5Var2.e0 = 2;
                            obj = ci0Var.h(j, ao5Var2, str, z2);
                            if (obj != obj2) {
                                kw3Var = I;
                                kw3Var2 = kw3Var;
                                s95Var = (s95) obj;
                                if (s95Var != null) {
                                }
                                I = kw3Var2;
                            }
                            return obj2;
                        }
                        list = hf.A(I);
                    }
                    return new xn5(list);
                }
                boolean z3 = tn5Var.d;
                o75 o75Var2 = tn5Var.a;
                if (z3) {
                    list = hf.b0(new p95(o75Var2));
                }
                return new wn5(new tn5(o75Var2, tn5Var.b, tn5Var.c, false), list);
            }
        }
        ao5Var = new ao5(ci0Var, s41Var);
        ao5 ao5Var22 = ao5Var;
        Object obj3 = ao5Var22.Z;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = ao5Var22.e0;
        if (i == 0) {
        }
        a = hm5.a(c);
        list = yt1.A;
        if (a != null) {
        }
    }

    public static final qe0 d(ci0 ci0Var, mh0 mh0Var) {
        Iterator it = mh0Var.a.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            next.getClass();
            lt3 lt3Var = (lt3) next;
            ky kyVar = lt3.b;
            if (!nb3.k(kyVar, kyVar)) {
                synchronized (d82.a) {
                    pe0 pe0Var = (pe0) d82.b.get(kyVar);
                }
                ((Context) ci0Var.f).getClass();
            }
        }
        return re0.a;
    }

    public static final void e(ci0 ci0Var, int i) {
        kh0 kh0Var;
        boolean z;
        gg0 gg0Var;
        gj0 gj0Var = (gj0) ci0Var.d;
        if (gj0Var != null) {
            gj0Var.getClass();
            if0 if0Var = gj0Var.g;
            if (if0Var != null) {
                ze0 ze0Var = (ze0) if0Var.g;
                synchronized (ze0Var.b) {
                    ze0Var.e = i;
                    kh0Var = ze0Var.c;
                }
                if (kh0Var != null) {
                    if (i == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ze0Var.f = z;
                    Iterator it = kh0Var.c().iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        eg0 eg0Var = (eg0) it.next();
                        if (eg0Var instanceof gg0) {
                            gg0Var = (gg0) eg0Var;
                        } else {
                            gg0Var = null;
                        }
                        if (gg0Var != null) {
                            if (i != 1) {
                                if (i != 2) {
                                    continue;
                                } else {
                                    gj7 gj7Var = gg0Var.A;
                                    synchronized (gj7Var.k) {
                                        gj7Var.o = false;
                                    }
                                }
                            } else {
                                gj7 gj7Var2 = gg0Var.A;
                                synchronized (gj7Var2.k) {
                                    gj7Var2.o = true;
                                }
                            }
                        }
                    }
                    return;
                }
                return;
            }
            i.m("CameraX not initialized yet.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
        if (r1 != r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(ci0 ci0Var, un5 un5Var, s41 s41Var) {
        fo5 fo5Var;
        Object obj;
        int i;
        un5 un5Var2;
        Object C;
        un5 un5Var3;
        cb5 cb5Var;
        u75 u75Var;
        pn5 pn5Var = (pn5) ci0Var.a;
        if (s41Var instanceof fo5) {
            fo5Var = (fo5) s41Var;
            int i2 = fo5Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fo5Var.d0 = i2 - Integer.MIN_VALUE;
                fo5 fo5Var2 = fo5Var;
                obj = fo5Var2.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = fo5Var2.d0;
                List list = yt1.A;
                List list2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                cb5Var = fo5Var2.X;
                                un5Var3 = fo5Var2.R;
                                oi2.Y(obj);
                                u75Var = (u75) obj;
                                if (u75Var != null) {
                                    ta5 ta5Var = un5Var3.a;
                                    list2 = hf.b0(new x95(ta5Var.a, null, ta5Var.g, u75Var.e, un5Var3.c, null, cb5Var.a, cb5Var.b));
                                }
                                if (list2 != null) {
                                    list = list2;
                                }
                                return new xn5(list);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        un5Var2 = fo5Var2.R;
                        oi2.Y(obj);
                        C = ((hm5) obj).A;
                        if (hm5.a(C) == null) {
                            cb5 cb5Var2 = (cb5) C;
                            long j = un5Var2.a.c;
                            fo5Var2.R = un5Var2;
                            fo5Var2.X = cb5Var2;
                            fo5Var2.d0 = 3;
                            Object i3 = ((pl) pn5Var).i(j, fo5Var2);
                            if (i3 != x61Var) {
                                un5Var3 = un5Var2;
                                cb5Var = cb5Var2;
                                obj = i3;
                                u75Var = (u75) obj;
                                if (u75Var != null) {
                                }
                                if (list2 != null) {
                                }
                                return new xn5(list);
                            }
                            return x61Var;
                        }
                        boolean z = un5Var2.e;
                        ta5 ta5Var2 = un5Var2.a;
                        if (z) {
                            list = hf.b0(new w95(ta5Var2.a, null, true));
                        }
                        return new wn5(new un5(ta5Var2, un5Var2.b, un5Var2.c, un5Var2.d, false), list);
                    }
                    un5Var2 = fo5Var2.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    wp0 C2 = ((ng6) ((kd6) ci0Var.c)).C();
                    fo5Var2.R = un5Var;
                    fo5Var2.d0 = 1;
                    Object D = f04.D(C2, fo5Var2);
                    if (D != x61Var) {
                        obj = D;
                        un5Var2 = un5Var;
                    }
                    return x61Var;
                }
                if (nb3.k(obj, Boolean.TRUE)) {
                    long j2 = un5Var2.a.a;
                    int i4 = un5Var2.b;
                    Log.i("RASubmission", "event_type=kotlin_leaderboard_submit_start submit_path=kotlin_api leaderboard_id=" + j2 + " request_score=" + i4);
                }
                long j3 = un5Var2.a.a;
                int i5 = un5Var2.b;
                hb5 hb5Var = un5Var2.d;
                fo5Var2.R = un5Var2;
                fo5Var2.d0 = 2;
                C = ((pl) pn5Var).C(j3, i5, hb5Var, fo5Var2);
            }
        }
        fo5Var = new fo5(ci0Var, s41Var);
        fo5 fo5Var22 = fo5Var;
        obj = fo5Var22.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = fo5Var22.d0;
        List list3 = yt1.A;
        List list22 = null;
        if (i == 0) {
        }
        if (nb3.k(obj, Boolean.TRUE)) {
        }
        long j32 = un5Var2.a.a;
        int i52 = un5Var2.b;
        hb5 hb5Var2 = un5Var2.d;
        fo5Var22.R = un5Var2;
        fo5Var22.d0 = 2;
        C = ((pl) pn5Var).C(j32, i52, hb5Var2, fo5Var22);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[Catch: all -> 0x0078, TryCatch #2 {all -> 0x0182, blocks: (B:3:0x0013, B:4:0x0040, B:23:0x007c, B:24:0x0085, B:27:0x0091, B:28:0x0099, B:30:0x009f, B:31:0x00a9, B:33:0x00af, B:34:0x00ba, B:39:0x00cc, B:42:0x00d9, B:43:0x00ec, B:49:0x00f4, B:51:0x0107, B:52:0x0135, B:53:0x013c, B:54:0x013d, B:57:0x0148, B:59:0x015a, B:62:0x0175, B:63:0x017c, B:5:0x0041, B:7:0x0054, B:9:0x0060, B:11:0x0064, B:17:0x0072, B:18:0x0075, B:22:0x007b, B:36:0x00bd, B:37:0x00c9, B:25:0x0086, B:26:0x0090), top: B:72:0x0013 }] */
    /* JADX WARN: Type inference failed for: r18v1, types: [w9, eg0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static vt3 g(ci0 ci0Var, EmulatorActivity emulatorActivity, mh0 mh0Var, qi1 qi1Var) {
        vt3 vt3Var;
        Collection unmodifiableCollection;
        Object obj;
        boolean contains;
        boolean z;
        x9 x9Var;
        u63 u63Var = u63.X;
        Trace.beginSection(ln2.f0("CX:bindToLifecycle-internal"));
        try {
            nj2.h();
            gj0 gj0Var = (gj0) ci0Var.d;
            gj0Var.getClass();
            eg0 c = mh0Var.c(gj0Var.a.c());
            c.getClass();
            c.p(true);
            w9 i = ci0Var.i(mh0Var);
            Object obj2 = null;
            yf0 M = nc1.M(i, null);
            zt3 zt3Var = (zt3) ci0Var.e;
            zt3Var.getClass();
            synchronized (zt3Var.a) {
                vt3Var = (vt3) zt3Var.b.get(new my(System.identityHashCode(emulatorActivity), M));
                if (vt3Var != null) {
                    zi0 zi0Var = vt3Var.L;
                    if (!zi0Var.A.A.k() && ((x9Var = zi0Var.B) == null || !x9Var.A.k())) {
                        z = false;
                        if (z) {
                            zt3Var.k(vt3Var);
                            vt3Var = null;
                        }
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
            zt3 zt3Var2 = (zt3) ci0Var.e;
            zt3Var2.getClass();
            synchronized (zt3Var2.a) {
                unmodifiableCollection = Collections.unmodifiableCollection(zt3Var2.b.values());
            }
            for (di7 di7Var : (List) qi1Var.g) {
                for (Object obj3 : unmodifiableCollection) {
                    obj3.getClass();
                    vt3 vt3Var2 = (vt3) obj3;
                    synchronized (vt3Var2.A) {
                        obj = obj2;
                        contains = ((ArrayList) vt3Var2.L.z()).contains(di7Var);
                    }
                    if (!contains || nb3.k(vt3Var2.d(), emulatorActivity)) {
                        obj2 = obj;
                    } else {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{di7Var}, 1)));
                    }
                }
            }
            ?? r18 = obj2;
            if (vt3Var == null) {
                zt3 zt3Var3 = (zt3) ci0Var.e;
                zt3Var3.getClass();
                gj0 gj0Var2 = (gj0) ci0Var.d;
                gj0Var2.getClass();
                eb ebVar = gj0Var2.k;
                if (ebVar != null) {
                    zi0 zi0Var2 = new zi0(c, r18, i, r18, u63Var, u63Var, (ze0) ebVar.L, (rr6) ebVar.X, (cj7) ebVar.R);
                    gj0 gj0Var3 = (gj0) ci0Var.d;
                    gj0Var3.getClass();
                    vt3Var = zt3Var3.b(emulatorActivity, zi0Var2, (t16) gj0Var3.o.getValue());
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            if (!((List) qi1Var.g).isEmpty()) {
                zt3 zt3Var4 = (zt3) ci0Var.e;
                zt3Var4.getClass();
                gj0 gj0Var4 = (gj0) ci0Var.d;
                gj0Var4.getClass();
                if0 if0Var = gj0Var4.g;
                if (if0Var != null) {
                    zt3Var4.a(vt3Var, qi1Var, (ze0) if0Var.g);
                    ((HashSet) ci0Var.h).add(new my(System.identityHashCode(emulatorActivity), M));
                } else {
                    throw new IllegalStateException("CameraX not initialized yet.");
                }
            }
            return vt3Var;
        } finally {
            Trace.endSection();
        }
    }

    @Override // defpackage.y23
    public void b() {
        if (((String) this.a).equals((String) this.b)) {
            ((qa4) this.d).setValue(Boolean.TRUE);
        } else {
            ((qa4) this.e).setValue(Boolean.TRUE);
        }
        Boolean bool = Boolean.FALSE;
        ((qa4) this.f).setValue(bool);
        ((qn2) this.c).g(bool);
    }

    @Override // defpackage.y23
    public void c() {
        Boolean bool = Boolean.TRUE;
        ((qa4) this.h).setValue(bool);
        ((qn2) this.g).g(bool);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object h(long j, s41 s41Var, String str, boolean z) {
        bo5 bo5Var;
        x61 x61Var;
        int i;
        rx1 rx1Var;
        pq5 pq5Var;
        String str2;
        boolean z2;
        long j2;
        pq5 pq5Var2;
        u75 u75Var;
        Object l;
        pq5 pq5Var3;
        String str3;
        Object obj;
        boolean z3;
        long j3;
        pq5 pq5Var4;
        oq1 oq1Var;
        u75 u75Var2;
        String str4;
        oq1 oq1Var2;
        ja5 ja5Var;
        pn5 pn5Var = (pn5) this.a;
        if (s41Var instanceof bo5) {
            bo5Var = (bo5) s41Var;
            int i2 = bo5Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bo5Var.h0 = i2 - Integer.MIN_VALUE;
                Object obj2 = bo5Var.f0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = bo5Var.h0;
                String str5 = "";
                String str6 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                z3 = bo5Var.X;
                                oq1Var2 = bo5Var.e0;
                                u75Var2 = bo5Var.d0;
                                str4 = bo5Var.Y;
                                oi2.Y(obj2);
                                ja5Var = (ja5) obj2;
                                if (ja5Var != null) {
                                    str6 = ja5Var.a;
                                }
                                oq1Var = oq1Var2;
                                u75Var = u75Var2;
                                str3 = str4;
                                if (str6 != null) {
                                    str5 = str6;
                                }
                                return new s95(str5, u75Var.e, str3, oq1Var, z3);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z3 = bo5Var.X;
                        j3 = bo5Var.R;
                        u75 u75Var3 = bo5Var.d0;
                        pq5Var3 = bo5Var.Z;
                        str3 = bo5Var.Y;
                        oi2.Y(obj2);
                        obj = obj2;
                        u75Var = u75Var3;
                        pq5Var4 = (pq5) obj;
                        if (pq5Var4 == null) {
                            oq1Var = new oq1(pq5Var4.j);
                        } else {
                            oq1Var = null;
                        }
                        if (u75Var != null) {
                            if (u75Var.d == r75.Core) {
                                String str7 = pq5Var3.i;
                                bo5Var.Y = str3;
                                bo5Var.Z = null;
                                bo5Var.d0 = u75Var;
                                bo5Var.e0 = oq1Var;
                                bo5Var.R = j3;
                                bo5Var.X = z3;
                                bo5Var.h0 = 3;
                                Object l2 = ((pl) pn5Var).l(str7, bo5Var);
                                if (l2 != x61Var) {
                                    u75Var2 = u75Var;
                                    str4 = str3;
                                    obj2 = l2;
                                    oq1Var2 = oq1Var;
                                    ja5Var = (ja5) obj2;
                                    if (ja5Var != null) {
                                    }
                                    oq1Var = oq1Var2;
                                    u75Var = u75Var2;
                                    str3 = str4;
                                    if (str6 != null) {
                                    }
                                    return new s95(str5, u75Var.e, str3, oq1Var, z3);
                                }
                                return x61Var;
                            }
                            String str8 = u75Var.c;
                            if (str8 != null) {
                                str5 = str8;
                            }
                            return new s95(str5, u75Var.e, str3, oq1Var, z3);
                        }
                        return null;
                    }
                    z2 = bo5Var.X;
                    j2 = bo5Var.R;
                    pq5Var2 = bo5Var.Z;
                    str2 = bo5Var.Y;
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    lb4 lb4Var = ((sx1) this.d).e;
                    if (lb4Var instanceof rx1) {
                        rx1Var = (rx1) lb4Var;
                    } else {
                        rx1Var = null;
                    }
                    if (rx1Var != null) {
                        pq5Var = rx1Var.o;
                    } else {
                        pq5Var = null;
                    }
                    if (pq5Var != null) {
                        str2 = str;
                        bo5Var.Y = str2;
                        bo5Var.Z = pq5Var;
                        bo5Var.R = j;
                        bo5Var.X = z;
                        bo5Var.h0 = 1;
                        Object i3 = ((pl) pn5Var).i(j, bo5Var);
                        if (i3 != x61Var) {
                            z2 = z;
                            j2 = j;
                            pq5Var2 = pq5Var;
                            obj2 = i3;
                        }
                        return x61Var;
                    }
                    return null;
                }
                u75Var = (u75) obj2;
                Uri uri = pq5Var2.d;
                bo5Var.Y = str2;
                bo5Var.Z = pq5Var2;
                bo5Var.d0 = u75Var;
                bo5Var.R = j2;
                bo5Var.X = z2;
                bo5Var.h0 = 2;
                l = ((xb2) ((p06) this.b)).l(uri, bo5Var);
                if (l != x61Var) {
                    pq5Var3 = pq5Var2;
                    str3 = str2;
                    obj = l;
                    z3 = z2;
                    j3 = j2;
                    pq5Var4 = (pq5) obj;
                    if (pq5Var4 == null) {
                    }
                    if (u75Var != null) {
                    }
                    return null;
                }
                return x61Var;
            }
        }
        bo5Var = new bo5(this, s41Var);
        Object obj22 = bo5Var.f0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = bo5Var.h0;
        String str52 = "";
        String str62 = null;
        if (i == 0) {
        }
        u75Var = (u75) obj22;
        Uri uri2 = pq5Var2.d;
        bo5Var.Y = str2;
        bo5Var.Z = pq5Var2;
        bo5Var.d0 = u75Var;
        bo5Var.R = j2;
        bo5Var.X = z2;
        bo5Var.h0 = 2;
        l = ((xb2) ((p06) this.b)).l(uri2, bo5Var);
        if (l != x61Var) {
        }
        return x61Var;
    }

    public w9 i(mh0 mh0Var) {
        Object obj;
        Trace.beginSection(ln2.f0("CX:getCameraInfo"));
        try {
            gj0 gj0Var = (gj0) this.d;
            gj0Var.getClass();
            cg0 q = mh0Var.c(gj0Var.a.c()).q();
            q.getClass();
            qe0 d = d(this, mh0Var);
            String d2 = q.d();
            d2.getClass();
            yf0 J = nc1.J(d2, null, d.A);
            synchronized (this.a) {
                obj = ((HashMap) this.g).get(J);
                if (obj == null) {
                    obj = new w9(q, d);
                    ((HashMap) this.g).put(J, obj);
                }
            }
            return (w9) obj;
        } finally {
            Trace.endSection();
        }
    }

    public void j(gj0 gj0Var, Context context) {
        gh0 gh0Var;
        synchronized (this.a) {
            this.d = gj0Var;
            this.f = context;
            if (gj0Var != null && (gh0Var = gj0Var.n) != null) {
                ov2 x = u24.x();
                x.getClass();
                gh0Var.n.add(new fh0(this, x));
                x.execute(new ch0(gh0Var, this));
            }
        }
    }

    public ff7 k(ff7 ff7Var, jf7 jf7Var) {
        boolean z;
        z66 z66Var = ff7Var.b;
        z66 z66Var2 = ff7Var.a;
        List list = z66Var2.c;
        boolean z2 = true;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        List list2 = z66Var.c;
        if ((list2 != null && !list2.isEmpty()) || jf7Var.e.b == null) {
            z2 = false;
        }
        if (!z && !z2) {
            return ff7Var;
        }
        ff7 c = ((ne1) this.a).c(jf7Var);
        if (z) {
            z66Var2 = z66.a(z66Var2, null, null, c.a.c, 3);
        }
        if (z2) {
            z66Var = z66.a(z66Var, null, null, c.b.c, 3);
        }
        return new ff7(z66Var2, z66Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object l(String str, int i, long j, gd0 gd0Var, bx bxVar, s41 s41Var) {
        wh0 wh0Var;
        x61 x61Var;
        int i2;
        gd0 gd0Var2;
        bx bxVar2;
        long j2;
        int i3;
        String str2;
        Object Z;
        if (s41Var instanceof wh0) {
            wh0Var = (wh0) s41Var;
            int i4 = wh0Var.g0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                wh0Var.g0 = i4 - Integer.MIN_VALUE;
                Object obj = wh0Var.e0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i2 = wh0Var.g0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    long j3 = wh0Var.d0;
                    int i5 = wh0Var.Z;
                    bx bxVar3 = wh0Var.Y;
                    gd0 gd0Var3 = wh0Var.X;
                    String str3 = wh0Var.R;
                    oi2.Y(obj);
                    bxVar2 = bxVar3;
                    j2 = j3;
                    gd0Var2 = gd0Var3;
                    str2 = str3;
                    i3 = i5;
                } else {
                    oi2.Y(obj);
                    ld0 ld0Var = (ld0) this.b;
                    wh0Var.R = str;
                    wh0Var.X = gd0Var;
                    wh0Var.Y = bxVar;
                    wh0Var.Z = i;
                    wh0Var.d0 = j;
                    wh0Var.g0 = 1;
                    synchronized (ld0Var.f) {
                        lg0 lg0Var = (lg0) ld0Var.f.get(str);
                        if (lg0Var != null) {
                            obj = lg0Var;
                        } else {
                            obj = hv.d0(ld0Var.b.f, new m5(ld0Var, str, (r41) null, 7), wh0Var);
                        }
                    }
                    if (obj != x61Var) {
                        gd0Var2 = gd0Var;
                        bxVar2 = bxVar;
                        j2 = j;
                        i3 = i;
                        str2 = str;
                    }
                    return x61Var;
                }
                yx6 yx6Var = (yx6) this.e;
                id0 id0Var = (id0) this.c;
                nd0 nd0Var = (nd0) this.d;
                t57 t57Var = (t57) this.g;
                og0 og0Var = (og0) this.f;
                bi0 bi0Var = new bi0(this, str2, new vd(str2, (lg0) obj, i3, j2, yx6Var, id0Var, gd0Var2, nd0Var, t57Var, bxVar2, og0Var.a, og0Var.b), null);
                wh0Var.R = null;
                wh0Var.X = null;
                wh0Var.Y = null;
                wh0Var.g0 = 2;
                o66 o66Var = new o66(wh0Var, wh0Var.b());
                Z = mp2.Z(o66Var, true, o66Var, bi0Var);
                if (Z != x61Var) {
                    return x61Var;
                }
                return Z;
            }
        }
        wh0Var = new wh0(this, s41Var);
        Object obj2 = wh0Var.e0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i2 = wh0Var.g0;
        if (i2 == 0) {
        }
        yx6 yx6Var2 = (yx6) this.e;
        id0 id0Var2 = (id0) this.c;
        nd0 nd0Var2 = (nd0) this.d;
        t57 t57Var2 = (t57) this.g;
        og0 og0Var2 = (og0) this.f;
        bi0 bi0Var2 = new bi0(this, str2, new vd(str2, (lg0) obj2, i3, j2, yx6Var2, id0Var2, gd0Var2, nd0Var2, t57Var2, bxVar2, og0Var2.a, og0Var2.b), null);
        wh0Var.R = null;
        wh0Var.X = null;
        wh0Var.Y = null;
        wh0Var.g0 = 2;
        o66 o66Var2 = new o66(wh0Var, wh0Var.b());
        Z = mp2.Z(o66Var2, true, o66Var2, bi0Var2);
        if (Z != x61Var) {
        }
    }

    public void m() {
        Trace.beginSection(ln2.f0("CX:unbindAll"));
        try {
            nj2.h();
            e(this, 0);
            zt3 zt3Var = (zt3) this.e;
            zt3Var.getClass();
            zt3Var.j((HashSet) this.h);
        } finally {
            Trace.endSection();
        }
    }

    public void n(List list) {
        tp6 tp6Var = (tp6) this.e;
        tp6Var.getClass();
        tp6Var.m(null, list);
    }

    public void o(d83 d83Var) {
        tp6 tp6Var = (tp6) this.c;
        tp6Var.getClass();
        tp6Var.m(null, d83Var);
    }
}
