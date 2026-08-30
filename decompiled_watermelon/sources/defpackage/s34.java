package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s34 */
/* loaded from: classes.dex */
public final class s34 {
    public final l44 a;
    public final wz b;
    public g44 c;
    public Bundle d;
    public Bundle[] e;
    public final xt f = new xt();
    public final ee6 g;
    public final ee6 h;
    public final q45 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public fn3 n;
    public t34 o;
    public final ArrayList p;
    public qm3 q;
    public final p34 r;
    public final l54 s;
    public final LinkedHashMap t;
    public mi2 u;
    public q34 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final c46 z;

    public s34(l44 l44Var, wz wzVar) {
        this.a = l44Var;
        this.b = wzVar;
        pp1 pp1Var = pp1.A;
        this.g = fe6.a(pp1Var);
        ee6 a = fe6.a(pp1Var);
        this.h = a;
        this.i = new q45(a);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = qm3.INITIALIZED;
        this.r = new p34(0, this);
        this.s = new l54();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = d46.b(1, 0, h60.DROP_OLDEST, 2);
    }

    public static b44 d(int i, b44 b44Var, b44 b44Var2, boolean z) {
        g44 g44Var;
        if (b44Var.B.a == i && (b44Var2 == null || (b44Var.equals(b44Var2) && b53.x(b44Var.L, b44Var2.L)))) {
            return b44Var;
        }
        if (b44Var instanceof g44) {
            g44Var = (g44) b44Var;
        } else {
            g44Var = null;
        }
        if (g44Var == null) {
            g44Var = b44Var.L;
            g44Var.getClass();
        }
        return g44Var.Y.l(i, g44Var, b44Var2, z);
    }

    public static /* synthetic */ void n(s34 s34Var, l34 l34Var) {
        s34Var.m(l34Var, false, new xt());
    }

    public final void a(b44 b44Var, Bundle bundle, l34 l34Var, List list) {
        b44 b44Var2;
        b44 b44Var3;
        Bundle bundle2;
        Object obj;
        Object obj2;
        fh fhVar = this.a.c;
        b44 b44Var4 = l34Var.B;
        boolean z = b44Var4 instanceof df1;
        xt xtVar = this.f;
        if (!z) {
            while (!xtVar.isEmpty() && (((l34) xtVar.last()).B instanceof df1) && l(((l34) xtVar.last()).B.B.a, true, false)) {
            }
        }
        xt xtVar2 = new xt();
        l34 l34Var2 = null;
        if (b44Var instanceof g44) {
            b44 b44Var5 = b44Var4;
            do {
                b44Var5.getClass();
                b44Var5 = b44Var5.L;
                if (b44Var5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (b53.x(((l34) obj2).B, b44Var5)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    l34 l34Var3 = (l34) obj2;
                    if (l34Var3 == null) {
                        l34Var3 = vn1.f(fhVar, b44Var5, bundle, h(), this.o);
                    }
                    xtVar2.addFirst(l34Var3);
                    if (!xtVar.isEmpty() && ((l34) xtVar.last()).B == b44Var5) {
                        n(this, (l34) xtVar.last());
                    }
                }
                if (b44Var5 == null) {
                    break;
                }
            } while (b44Var5 != b44Var);
        }
        if (xtVar2.isEmpty()) {
            b44Var2 = b44Var4;
        } else {
            b44Var2 = ((l34) xtVar2.first()).B;
        }
        while (b44Var2 != null && c(b44Var2.B.a, b44Var2) != b44Var2) {
            b44Var2 = b44Var2.L;
            if (b44Var2 != null) {
                if (bundle != null && bundle.isEmpty()) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (b53.x(((l34) obj).B, b44Var2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                l34 l34Var4 = (l34) obj;
                if (l34Var4 == null) {
                    l34Var4 = vn1.f(fhVar, b44Var2, b44Var2.b(bundle2), h(), this.o);
                }
                xtVar2.addFirst(l34Var4);
            }
        }
        if (!xtVar2.isEmpty()) {
            b44Var4 = ((l34) xtVar2.first()).B;
        }
        while (!xtVar.isEmpty() && (((l34) xtVar.last()).B instanceof g44)) {
            b44 b44Var6 = ((l34) xtVar.last()).B;
            b44Var6.getClass();
            if (((ec6) ((g44) b44Var6).Y.e).c(b44Var4.B.a) != null) {
                break;
            }
            n(this, (l34) xtVar.last());
        }
        l34 l34Var5 = (l34) xtVar.j();
        if (l34Var5 == null) {
            l34Var5 = (l34) xtVar2.j();
        }
        if (l34Var5 != null) {
            b44Var3 = l34Var5.B;
        } else {
            b44Var3 = null;
        }
        if (!b53.x(b44Var3, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                b44 b44Var7 = ((l34) previous).B;
                g44 g44Var = this.c;
                g44Var.getClass();
                if (b53.x(b44Var7, g44Var)) {
                    l34Var2 = previous;
                    break;
                }
            }
            l34 l34Var6 = l34Var2;
            if (l34Var6 == null) {
                g44 g44Var2 = this.c;
                g44Var2.getClass();
                g44 g44Var3 = this.c;
                g44Var3.getClass();
                l34Var6 = vn1.f(fhVar, g44Var2, g44Var3.b(bundle), h(), this.o);
            }
            xtVar2.addFirst(l34Var6);
        }
        Iterator it = xtVar2.iterator();
        while (it.hasNext()) {
            l34 l34Var7 = (l34) it.next();
            Object obj3 = this.t.get(this.s.b(l34Var7.B.A));
            if (obj3 != null) {
                ((o34) obj3).a(l34Var7);
            } else {
                c44.e(b31.q(new StringBuilder("NavigatorBackStack for "), b44Var.A, " should already be created"));
                return;
            }
        }
        xtVar.addAll(xtVar2);
        xtVar.addLast(l34Var);
        ArrayList Y0 = tq0.Y0(xtVar2, l34Var);
        int size = Y0.size();
        int i = 0;
        while (i < size) {
            Object obj4 = Y0.get(i);
            i++;
            l34 l34Var8 = (l34) obj4;
            g44 g44Var4 = l34Var8.B.L;
            if (g44Var4 != null) {
                j(l34Var8, e(g44Var4.B.a));
            }
        }
    }

    public final boolean b() {
        xt xtVar;
        while (true) {
            xtVar = this.f;
            if (xtVar.isEmpty() || !(((l34) xtVar.last()).B instanceof g44)) {
                break;
            }
            n(this, (l34) xtVar.last());
        }
        l34 l34Var = (l34) xtVar.l();
        ArrayList arrayList = this.y;
        if (l34Var != null) {
            arrayList.add(l34Var);
        }
        this.x++;
        r();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList p1 = tq0.p1(arrayList);
            arrayList.clear();
            int size = p1.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = p1.get(i2);
                i2++;
                l34 l34Var2 = (l34) obj;
                Iterator it = tq0.n1(this.p).iterator();
                if (!it.hasNext()) {
                    this.z.p(l34Var2);
                } else if (it.next() != null) {
                    c44.b();
                    return false;
                } else {
                    b44 b44Var = l34Var2.B;
                    l34Var2.c0.c();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(xtVar);
            ee6 ee6Var = this.g;
            ee6Var.getClass();
            ee6Var.l(null, arrayList2);
            ArrayList o = o();
            ee6 ee6Var2 = this.h;
            ee6Var2.getClass();
            ee6Var2.l(null, o);
        }
        if (l34Var != null) {
            return true;
        }
        return false;
    }

    public final b44 c(int i, b44 b44Var) {
        b44 b44Var2;
        g44 g44Var = this.c;
        if (g44Var == null) {
            return null;
        }
        if (g44Var.B.a == i) {
            if (b44Var != null) {
                if (b53.x(g44Var, b44Var) && b44Var.L == null) {
                    return this.c;
                }
            } else {
                return g44Var;
            }
        }
        l34 l34Var = (l34) this.f.l();
        if (l34Var == null || (b44Var2 = l34Var.B) == null) {
            b44Var2 = this.c;
            b44Var2.getClass();
        }
        return d(i, b44Var2, b44Var, false);
    }

    public final l34 e(int i) {
        Object obj;
        xt xtVar = this.f;
        ListIterator<E> listIterator = xtVar.listIterator(xtVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((l34) obj).B.B.a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        l34 l34Var = (l34) obj;
        if (l34Var != null) {
            return l34Var;
        }
        StringBuilder s = wh1.s("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        s.append(f());
        throw new IllegalArgumentException(s.toString().toString());
    }

    public final b44 f() {
        l34 l34Var = (l34) this.f.l();
        if (l34Var != null) {
            return l34Var.B;
        }
        return null;
    }

    public final g44 g() {
        g44 g44Var = this.c;
        if (g44Var != null) {
            g44Var.getClass();
            return g44Var;
        }
        i.n("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final qm3 h() {
        if (this.n == null) {
            return qm3.CREATED;
        }
        return this.q;
    }

    public final g44 i() {
        b44 b44Var;
        g44 g44Var;
        l34 l34Var = (l34) this.f.l();
        if (l34Var == null || (b44Var = l34Var.B) == null) {
            b44Var = this.c;
            b44Var.getClass();
        }
        if (b44Var instanceof g44) {
            g44Var = (g44) b44Var;
        } else {
            g44Var = null;
        }
        if (g44Var == null) {
            g44 g44Var2 = b44Var.L;
            g44Var2.getClass();
            return g44Var2;
        }
        return g44Var;
    }

    public final void j(l34 l34Var, l34 l34Var2) {
        this.j.put(l34Var, l34Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(l34Var2) == null) {
            linkedHashMap.put(l34Var2, new bw());
        }
        Object obj = linkedHashMap.get(l34Var2);
        obj.getClass();
        ((bw) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00fb, code lost:
        if (r13.equals(r10) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x010d, code lost:
        if (r22.B.a == r10.B.a) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x010f, code lost:
        r10 = new defpackage.xt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x011a, code lost:
        if (defpackage.l07.P(r21.f) < r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x011c, code lost:
        r12 = (defpackage.l34) defpackage.tq0.b1(r21.f);
        q(r12);
        r13 = new defpackage.l34(r12.A, r12.B, r12.B.b(r23), r12.R, r12.X, r12.Y, r12.Z);
        r4 = r13.c0;
        r5 = r12.R;
        r4.getClass();
        r5.getClass();
        r4.f = r5;
        r4 = r13.c0;
        r5 = (defpackage.qm3) r12.c0.l;
        r4.getClass();
        r5.getClass();
        r4.l = r5;
        r4.f();
        r10.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x016d, code lost:
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0175, code lost:
        if (r4.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0177, code lost:
        r5 = (defpackage.l34) r4.next();
        r6 = r5.B.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0181, code lost:
        if (r6 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0183, code lost:
        j(r5, e(r6.B.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x018e, code lost:
        r21.f.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0194, code lost:
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x019c, code lost:
        if (r4.hasNext() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x019e, code lost:
        r5 = (defpackage.l34) r4.next();
        r6 = r21.s.b(r5.B.A);
        r9 = r5.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01b0, code lost:
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01b3, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01b4, code lost:
        if (r9 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01b7, code lost:
        r6.c(r9);
        r6 = r6.b();
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01c0, code lost:
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01c1, code lost:
        r10 = defpackage.tq0.p1((java.util.Collection) r6.e.A.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01db, code lost:
        if (r11.hasPrevious() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01eb, code lost:
        if (defpackage.b53.x(((defpackage.l34) r11.previous()).Y, r5.Y) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ed, code lost:
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01f2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01f4, code lost:
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01f5, code lost:
        r10.set(r11, r5);
        r5 = r6.b;
        r5.getClass();
        r5.l(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0201, code lost:
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0204, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0205, code lost:
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x020a  */
    /* JADX WARN: Type inference failed for: r3v4, types: [j75, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.b44 r22, android.os.Bundle r23, defpackage.u44 r24) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s34.k(b44, android.os.Bundle, u44):void");
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [j75, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [j75, java.lang.Object] */
    public final boolean l(int i, boolean z, boolean z2) {
        b44 b44Var;
        boolean z3;
        String str;
        xt xtVar = this.f;
        if (xtVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = tq0.d1(xtVar).iterator();
        while (true) {
            if (it.hasNext()) {
                b44 b44Var2 = ((l34) it.next()).B;
                String str2 = b44Var2.A;
                y9 y9Var = b44Var2.B;
                k54 b = this.s.b(str2);
                if (z || y9Var.a != i) {
                    arrayList.add(b);
                }
                if (y9Var.a == i) {
                    b44Var = b44Var2;
                    break;
                }
            } else {
                b44Var = null;
                break;
            }
        }
        if (b44Var == null) {
            int i2 = b44.X;
            Log.i("NavController", "Ignoring popBackStack to destination " + jk2.y(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        ?? obj = new Object();
        xt xtVar2 = new xt();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                int i4 = i3 + 1;
                k54 k54Var = (k54) arrayList.get(i3);
                ?? obj2 = new Object();
                l34 l34Var = (l34) xtVar.last();
                z3 = z2;
                q34 q34Var = new q34((j75) obj2, (j75) obj, this, z3, xtVar2);
                k54Var.getClass();
                l34Var.getClass();
                this.v = q34Var;
                k54Var.e(l34Var, z3);
                this.v = null;
                if (!obj2.A) {
                    break;
                }
                i3 = i4;
            } else {
                z3 = z2;
                break;
            }
        }
        if (z3) {
            LinkedHashMap linkedHashMap = this.l;
            if (!z) {
                v72 v72Var = new v72(new y82(d06.x0(b44Var, new gi3(22)), new mi2(this) { // from class: r34
                    public final /* synthetic */ s34 B;

                    {
                        this.B = this;
                    }

                    @Override // defpackage.mi2
                    public final Object n(Object obj3) {
                        boolean containsKey;
                        int i5 = r2;
                        s34 s34Var = this.B;
                        b44 b44Var3 = (b44) obj3;
                        switch (i5) {
                            case 0:
                                b44Var3.getClass();
                                containsKey = s34Var.l.containsKey(Integer.valueOf(b44Var3.B.a));
                                break;
                            default:
                                b44Var3.getClass();
                                containsKey = s34Var.l.containsKey(Integer.valueOf(b44Var3.B.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 1), (byte) 0);
                while (v72Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((b44) v72Var.next()).B.a);
                    n34 n34Var = (n34) xtVar2.j();
                    if (n34Var != null) {
                        str = (String) n34Var.a.L;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!xtVar2.isEmpty()) {
                oi oiVar = ((n34) xtVar2.first()).a;
                v72 v72Var2 = new v72(new y82(d06.x0(c(oiVar.B, null), new gi3(23)), new mi2(this) { // from class: r34
                    public final /* synthetic */ s34 B;

                    {
                        this.B = this;
                    }

                    @Override // defpackage.mi2
                    public final Object n(Object obj3) {
                        boolean containsKey;
                        int i5 = r2;
                        s34 s34Var = this.B;
                        b44 b44Var3 = (b44) obj3;
                        switch (i5) {
                            case 0:
                                b44Var3.getClass();
                                containsKey = s34Var.l.containsKey(Integer.valueOf(b44Var3.B.a));
                                break;
                            default:
                                b44Var3.getClass();
                                containsKey = s34Var.l.containsKey(Integer.valueOf(b44Var3.B.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 1), (byte) 0);
                while (v72Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((b44) v72Var2.next()).B.a), (String) oiVar.L);
                }
                if (linkedHashMap.values().contains((String) oiVar.L)) {
                    this.m.put((String) oiVar.L, xtVar2);
                }
            }
        }
        this.b.c();
        return obj.A;
    }

    public final void m(l34 l34Var, boolean z, xt xtVar) {
        t34 t34Var;
        q45 q45Var;
        Set set;
        l34Var.getClass();
        xt xtVar2 = this.f;
        l34 l34Var2 = (l34) xtVar2.last();
        if (b53.x(l34Var2, l34Var)) {
            tq0.b1(xtVar2);
            o34 o34Var = (o34) this.t.get(this.s.b(l34Var2.B.A));
            boolean z2 = true;
            if ((o34Var == null || (q45Var = o34Var.f) == null || (set = (Set) q45Var.A.getValue()) == null || !set.contains(l34Var2)) && !this.k.containsKey(l34Var2)) {
                z2 = false;
            }
            qm3 qm3Var = ((in3) l34Var2.c0.k).d;
            qm3 qm3Var2 = qm3.CREATED;
            if (qm3Var.isAtLeast(qm3Var2)) {
                if (z) {
                    l34Var2.a(qm3Var2);
                    xtVar.addFirst(new n34(l34Var2));
                }
                if (!z2) {
                    l34Var2.a(qm3.DESTROYED);
                    q(l34Var2);
                } else {
                    l34Var2.a(qm3Var2);
                }
            }
            if (!z && !z2 && (t34Var = this.o) != null) {
                String str = l34Var2.Y;
                str.getClass();
                za7 za7Var = (za7) t34Var.b.remove(str);
                if (za7Var != null) {
                    za7Var.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to pop ");
        sb.append(l34Var.B);
        b44 b44Var = l34Var2.B;
        sb.append(", which is not the top of the back stack (");
        sb.append(b44Var);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (o34 o34Var : this.t.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) o34Var.f.A.getValue()) {
                l34 l34Var = (l34) obj;
                if (!arrayList.contains(l34Var) && !((qm3) l34Var.c0.l).isAtLeast(qm3.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            tq0.D0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            l34 l34Var2 = (l34) next;
            if (!arrayList.contains(l34Var2) && ((qm3) l34Var2.c0.l).isAtLeast(qm3.STARTED)) {
                arrayList3.add(next);
            }
        }
        tq0.D0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((l34) obj2).B instanceof g44)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [j75, java.lang.Object] */
    public final boolean p(int i, Bundle bundle, u44 u44Var) {
        b44 g;
        String str;
        l34 l34Var;
        b44 b44Var;
        Bundle bundle2;
        ClassLoader classLoader;
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.l;
        int i2 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (b53.x((String) it.next(), str2)) {
                it.remove();
            }
        }
        xt xtVar = (xt) l07.o(this.m).remove(str2);
        fh fhVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        l34 l34Var2 = (l34) this.f.l();
        if (l34Var2 == null || (g = l34Var2.B) == null) {
            g = g();
        }
        if (xtVar != null) {
            Iterator it2 = xtVar.iterator();
            while (it2.hasNext()) {
                n34 n34Var = (n34) it2.next();
                oi oiVar = n34Var.a;
                oi oiVar2 = n34Var.a;
                b44 d = d(oiVar.B, g, null, true);
                if (d != null) {
                    qm3 h = h();
                    t34 t34Var = this.o;
                    fhVar.getClass();
                    h.getClass();
                    Bundle bundle3 = (Bundle) oiVar2.R;
                    if (bundle3 != null) {
                        Context context = fhVar.A;
                        if (context != null) {
                            classLoader = context.getClassLoader();
                        } else {
                            classLoader = null;
                        }
                        bundle3.setClassLoader(classLoader);
                        bundle2 = bundle3;
                    } else {
                        bundle2 = null;
                    }
                    String str3 = (String) oiVar2.L;
                    str3.getClass();
                    arrayList.add(new l34(fhVar, d, bundle2, h, t34Var, str3, (Bundle) oiVar2.X));
                    g = d;
                } else {
                    int i3 = b44.X;
                    c44.k("Restore State failed: destination ", jk2.y(fhVar, oiVar2.B), " cannot be found from the current destination ", g);
                    return false;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            if (!(((l34) obj).B instanceof g44)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            l34 l34Var3 = (l34) obj2;
            List list = (List) tq0.U0(arrayList2);
            if (list != null && (l34Var = (l34) tq0.T0(list)) != null && (b44Var = l34Var.B) != null) {
                str = b44Var.A;
            } else {
                str = null;
            }
            if (b53.x(str, l34Var3.B.A)) {
                list.add(l34Var3);
            } else {
                arrayList2.add(l07.f0(l34Var3));
            }
        }
        ?? obj3 = new Object();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj4 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj4;
            k54 b = this.s.b(((l34) tq0.K0(list2)).B.A);
            ArrayList arrayList4 = arrayList;
            this.u = new e5(obj3, arrayList4, new Object(), this, bundle, 7);
            b.d(list2, u44Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return obj3.A;
    }

    public final void q(l34 l34Var) {
        Integer num;
        l34Var.getClass();
        l34 l34Var2 = (l34) this.j.remove(l34Var);
        if (l34Var2 != null) {
            LinkedHashMap linkedHashMap = this.k;
            bw bwVar = (bw) linkedHashMap.get(l34Var2);
            if (bwVar != null) {
                num = Integer.valueOf(bwVar.a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                o34 o34Var = (o34) this.t.get(this.s.b(l34Var2.B.A));
                if (o34Var != null) {
                    o34Var.c(l34Var2);
                }
                linkedHashMap.remove(l34Var2);
            }
        }
    }

    public final void r() {
        Boolean bool;
        bw bwVar;
        q45 q45Var;
        Set set;
        ArrayList p1 = tq0.p1(this.f);
        if (!p1.isEmpty()) {
            ArrayList f0 = l07.f0(((l34) tq0.T0(p1)).B);
            ArrayList arrayList = new ArrayList();
            if (tq0.T0(f0) instanceof df1) {
                for (l34 l34Var : tq0.d1(p1)) {
                    b44 b44Var = l34Var.B;
                    arrayList.add(b44Var);
                    if (!(b44Var instanceof df1) && !(b44Var instanceof g44)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (l34 l34Var2 : tq0.d1(p1)) {
                qm3 qm3Var = (qm3) l34Var2.c0.l;
                b44 b44Var2 = l34Var2.B;
                b44 b44Var3 = (b44) tq0.M0(f0);
                if (b44Var3 != null && b44Var3.B.a == b44Var2.B.a) {
                    qm3 qm3Var2 = qm3.RESUMED;
                    if (qm3Var != qm3Var2) {
                        o34 o34Var = (o34) this.t.get(this.s.b(l34Var2.B.A));
                        if (o34Var != null && (q45Var = o34Var.f) != null && (set = (Set) q45Var.A.getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(l34Var2));
                        } else {
                            bool = null;
                        }
                        if (!b53.x(bool, Boolean.TRUE) && ((bwVar = (bw) this.k.get(l34Var2)) == null || bwVar.a.get() != 0)) {
                            hashMap.put(l34Var2, qm3Var2);
                        } else {
                            hashMap.put(l34Var2, qm3.STARTED);
                        }
                    }
                    b44 b44Var4 = (b44) tq0.M0(arrayList);
                    if (b44Var4 != null && b44Var4.B.a == b44Var2.B.a) {
                        tq0.a1(arrayList);
                    }
                    tq0.a1(f0);
                    g44 g44Var = b44Var2.L;
                    if (g44Var != null) {
                        f0.add(g44Var);
                    }
                } else if (!arrayList.isEmpty() && b44Var2.B.a == ((b44) tq0.K0(arrayList)).B.a) {
                    b44 b44Var5 = (b44) tq0.a1(arrayList);
                    if (qm3Var == qm3.RESUMED) {
                        l34Var2.a(qm3.STARTED);
                    } else {
                        qm3 qm3Var3 = qm3.STARTED;
                        if (qm3Var != qm3Var3) {
                            hashMap.put(l34Var2, qm3Var3);
                        }
                    }
                    g44 g44Var2 = b44Var5.L;
                    if (g44Var2 != null && !arrayList.contains(g44Var2)) {
                        arrayList.add(g44Var2);
                    }
                } else {
                    l34Var2.a(qm3.CREATED);
                }
            }
            int size = p1.size();
            int i = 0;
            while (i < size) {
                Object obj = p1.get(i);
                i++;
                l34 l34Var3 = (l34) obj;
                qm3 qm3Var4 = (qm3) hashMap.get(l34Var3);
                if (qm3Var4 != null) {
                    l34Var3.a(qm3Var4);
                } else {
                    l34Var3.c0.f();
                }
            }
        }
    }
}
