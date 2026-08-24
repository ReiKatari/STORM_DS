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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb4 */
/* loaded from: classes.dex */
public final class zb4 {
    public final rc4 a;
    public final n10 b;
    public mc4 c;
    public Bundle d;
    public Bundle[] e;
    public final pu f = new pu();
    public final tp6 g;
    public final tp6 h;
    public final de5 i;
    public final LinkedHashMap j;
    public final LinkedHashMap k;
    public final LinkedHashMap l;
    public final LinkedHashMap m;
    public hu3 n;
    public ac4 o;
    public final ArrayList p;
    public tt3 q;
    public final wb4 r;
    public final rd4 s;
    public final LinkedHashMap t;
    public qn2 u;
    public xb4 v;
    public final LinkedHashMap w;
    public int x;
    public final ArrayList y;
    public final of6 z;

    public zb4(rc4 rc4Var, n10 n10Var) {
        this.a = rc4Var;
        this.b = n10Var;
        yt1 yt1Var = yt1.A;
        this.g = up6.a(yt1Var);
        tp6 a = up6.a(yt1Var);
        this.h = a;
        this.i = new de5(a);
        this.j = new LinkedHashMap();
        this.k = new LinkedHashMap();
        this.l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.p = new ArrayList();
        this.q = tt3.INITIALIZED;
        this.r = new wb4(this, 0);
        this.s = new rd4();
        this.t = new LinkedHashMap();
        this.w = new LinkedHashMap();
        this.y = new ArrayList();
        this.z = pf6.b(1, 0, m80.DROP_OLDEST, 2);
    }

    public static ic4 d(int i, ic4 ic4Var, ic4 ic4Var2, boolean z) {
        mc4 mc4Var;
        if (ic4Var.B.a == i && (ic4Var2 == null || (ic4Var.equals(ic4Var2) && nb3.k(ic4Var.L, ic4Var2.L)))) {
            return ic4Var;
        }
        if (ic4Var instanceof mc4) {
            mc4Var = (mc4) ic4Var;
        } else {
            mc4Var = null;
        }
        if (mc4Var == null) {
            mc4Var = ic4Var.L;
            mc4Var.getClass();
        }
        return mc4Var.Y.o(i, mc4Var, ic4Var2, z);
    }

    public static /* synthetic */ void n(zb4 zb4Var, sb4 sb4Var) {
        zb4Var.m(sb4Var, false, new pu());
    }

    public final void a(ic4 ic4Var, Bundle bundle, sb4 sb4Var, List list) {
        ic4 ic4Var2;
        ic4 ic4Var3;
        Bundle bundle2;
        Object obj;
        Object obj2;
        rh rhVar = this.a.c;
        ic4 ic4Var4 = sb4Var.B;
        boolean z = ic4Var4 instanceof hj1;
        pu puVar = this.f;
        if (!z) {
            while (!puVar.isEmpty() && (((sb4) puVar.last()).B instanceof hj1) && l(((sb4) puVar.last()).B.B.a, true, false)) {
            }
        }
        pu puVar2 = new pu();
        sb4 sb4Var2 = null;
        if (ic4Var instanceof mc4) {
            ic4 ic4Var5 = ic4Var4;
            do {
                ic4Var5.getClass();
                ic4Var5 = ic4Var5.L;
                if (ic4Var5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (nb3.k(((sb4) obj2).B, ic4Var5)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    sb4 sb4Var3 = (sb4) obj2;
                    if (sb4Var3 == null) {
                        sb4Var3 = x31.r(rhVar, ic4Var5, bundle, h(), this.o);
                    }
                    puVar2.addFirst(sb4Var3);
                    if (!puVar.isEmpty() && ((sb4) puVar.last()).B == ic4Var5) {
                        n(this, (sb4) puVar.last());
                    }
                }
                if (ic4Var5 == null) {
                    break;
                }
            } while (ic4Var5 != ic4Var);
        }
        if (puVar2.isEmpty()) {
            ic4Var2 = ic4Var4;
        } else {
            ic4Var2 = ((sb4) puVar2.first()).B;
        }
        while (ic4Var2 != null && c(ic4Var2.B.a, ic4Var2) != ic4Var2) {
            ic4Var2 = ic4Var2.L;
            if (ic4Var2 != null) {
                if (bundle != null && bundle.isEmpty()) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (nb3.k(((sb4) obj).B, ic4Var2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                sb4 sb4Var4 = (sb4) obj;
                if (sb4Var4 == null) {
                    sb4Var4 = x31.r(rhVar, ic4Var2, ic4Var2.a(bundle2), h(), this.o);
                }
                puVar2.addFirst(sb4Var4);
            }
        }
        if (!puVar2.isEmpty()) {
            ic4Var4 = ((sb4) puVar2.first()).B;
        }
        while (!puVar.isEmpty() && (((sb4) puVar.last()).B instanceof mc4)) {
            ic4 ic4Var6 = ((sb4) puVar.last()).B;
            ic4Var6.getClass();
            if (((un6) ((mc4) ic4Var6).Y.X).c(ic4Var4.B.a) != null) {
                break;
            }
            n(this, (sb4) puVar.last());
        }
        sb4 sb4Var5 = (sb4) puVar.f();
        if (sb4Var5 == null) {
            sb4Var5 = (sb4) puVar2.f();
        }
        if (sb4Var5 != null) {
            ic4Var3 = sb4Var5.B;
        } else {
            ic4Var3 = null;
        }
        if (!nb3.k(ic4Var3, this.c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                ic4 ic4Var7 = ((sb4) previous).B;
                mc4 mc4Var = this.c;
                mc4Var.getClass();
                if (nb3.k(ic4Var7, mc4Var)) {
                    sb4Var2 = previous;
                    break;
                }
            }
            sb4 sb4Var6 = sb4Var2;
            if (sb4Var6 == null) {
                mc4 mc4Var2 = this.c;
                mc4Var2.getClass();
                mc4 mc4Var3 = this.c;
                mc4Var3.getClass();
                sb4Var6 = x31.r(rhVar, mc4Var2, mc4Var3.a(bundle), h(), this.o);
            }
            puVar2.addFirst(sb4Var6);
        }
        Iterator it = puVar2.iterator();
        while (it.hasNext()) {
            sb4 sb4Var7 = (sb4) it.next();
            Object obj3 = this.t.get(this.s.b(sb4Var7.B.A));
            if (obj3 != null) {
                ((vb4) obj3).a(sb4Var7);
            } else {
                u34.f(i61.n(new StringBuilder("NavigatorBackStack for "), ic4Var.A, " should already be created"));
                return;
            }
        }
        puVar.addAll(puVar2);
        puVar.addLast(sb4Var);
        ArrayList U0 = gt0.U0(sb4Var, puVar2);
        int size = U0.size();
        int i = 0;
        while (i < size) {
            Object obj4 = U0.get(i);
            i++;
            sb4 sb4Var8 = (sb4) obj4;
            mc4 mc4Var4 = sb4Var8.B.L;
            if (mc4Var4 != null) {
                j(sb4Var8, e(mc4Var4.B.a));
            }
        }
    }

    public final boolean b() {
        pu puVar;
        while (true) {
            puVar = this.f;
            if (puVar.isEmpty() || !(((sb4) puVar.last()).B instanceof mc4)) {
                break;
            }
            n(this, (sb4) puVar.last());
        }
        sb4 sb4Var = (sb4) puVar.h();
        ArrayList arrayList = this.y;
        if (sb4Var != null) {
            arrayList.add(sb4Var);
        }
        this.x++;
        r();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            ArrayList m1 = gt0.m1(arrayList);
            arrayList.clear();
            int size = m1.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = m1.get(i2);
                i2++;
                sb4 sb4Var2 = (sb4) obj;
                Iterator it = gt0.k1(this.p).iterator();
                if (!it.hasNext()) {
                    this.z.k(sb4Var2);
                } else if (it.next() != null) {
                    u34.a();
                    return false;
                } else {
                    ic4 ic4Var = sb4Var2.B;
                    sb4Var2.d0.c();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(puVar);
            tp6 tp6Var = this.g;
            tp6Var.getClass();
            tp6Var.m(null, arrayList2);
            ArrayList o = o();
            tp6 tp6Var2 = this.h;
            tp6Var2.getClass();
            tp6Var2.m(null, o);
        }
        if (sb4Var != null) {
            return true;
        }
        return false;
    }

    public final ic4 c(int i, ic4 ic4Var) {
        ic4 ic4Var2;
        mc4 mc4Var = this.c;
        if (mc4Var == null) {
            return null;
        }
        if (mc4Var.B.a == i) {
            if (ic4Var != null) {
                if (nb3.k(mc4Var, ic4Var) && ic4Var.L == null) {
                    return this.c;
                }
            } else {
                return mc4Var;
            }
        }
        sb4 sb4Var = (sb4) this.f.h();
        if (sb4Var == null || (ic4Var2 = sb4Var.B) == null) {
            ic4Var2 = this.c;
            ic4Var2.getClass();
        }
        return d(i, ic4Var2, ic4Var, false);
    }

    public final sb4 e(int i) {
        Object obj;
        pu puVar = this.f;
        ListIterator<E> listIterator = puVar.listIterator(puVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((sb4) obj).B.B.a == i) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        sb4 sb4Var = (sb4) obj;
        if (sb4Var != null) {
            return sb4Var;
        }
        StringBuilder t = xg6.t("No destination with ID ", i, " is on the NavController's back stack. The current destination is ");
        t.append(f());
        throw new IllegalArgumentException(t.toString().toString());
    }

    public final ic4 f() {
        sb4 sb4Var = (sb4) this.f.h();
        if (sb4Var != null) {
            return sb4Var.B;
        }
        return null;
    }

    public final mc4 g() {
        mc4 mc4Var = this.c;
        if (mc4Var != null) {
            mc4Var.getClass();
            return mc4Var;
        }
        i.m("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final tt3 h() {
        if (this.n == null) {
            return tt3.CREATED;
        }
        return this.q;
    }

    public final mc4 i() {
        ic4 ic4Var;
        mc4 mc4Var;
        sb4 sb4Var = (sb4) this.f.h();
        if (sb4Var == null || (ic4Var = sb4Var.B) == null) {
            ic4Var = this.c;
            ic4Var.getClass();
        }
        if (ic4Var instanceof mc4) {
            mc4Var = (mc4) ic4Var;
        } else {
            mc4Var = null;
        }
        if (mc4Var == null) {
            mc4 mc4Var2 = ic4Var.L;
            mc4Var2.getClass();
            return mc4Var2;
        }
        return mc4Var;
    }

    public final void j(sb4 sb4Var, sb4 sb4Var2) {
        this.j.put(sb4Var, sb4Var2);
        LinkedHashMap linkedHashMap = this.k;
        if (linkedHashMap.get(sb4Var2) == null) {
            linkedHashMap.put(sb4Var2, new tw());
        }
        Object obj = linkedHashMap.get(sb4Var2);
        obj.getClass();
        ((tw) obj).a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00fa, code lost:
        if (r13.equals(r10) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x010c, code lost:
        if (r22.B.a == r10.B.a) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x010e, code lost:
        r10 = new defpackage.pu();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0119, code lost:
        if (defpackage.hf.U(r21.f) < r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x011b, code lost:
        r12 = (defpackage.sb4) defpackage.gt0.Y0(r21.f);
        q(r12);
        r13 = new defpackage.sb4(r12.A, r12.B, r12.B.a(r23), r12.R, r12.X, r12.Y, r12.Z);
        r4 = r13.d0;
        r5 = r12.R;
        r4.getClass();
        r5.getClass();
        r4.f = r5;
        r4 = r13.d0;
        r5 = (defpackage.tt3) r12.d0.l;
        r4.getClass();
        r5.getClass();
        r4.l = r5;
        r4.f();
        r10.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x016c, code lost:
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0174, code lost:
        if (r4.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0176, code lost:
        r5 = (defpackage.sb4) r4.next();
        r6 = r5.B.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0180, code lost:
        if (r6 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0182, code lost:
        j(r5, e(r6.B.a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x018d, code lost:
        r21.f.addLast(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0193, code lost:
        r4 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x019b, code lost:
        if (r4.hasNext() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x019d, code lost:
        r5 = (defpackage.sb4) r4.next();
        r6 = r21.s.b(r5.B.A);
        r9 = r5.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01af, code lost:
        if (r9 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x01b2, code lost:
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x01b3, code lost:
        if (r9 != null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x01b6, code lost:
        r6.c(r9);
        r6 = r6.b();
        r9 = r6.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01bf, code lost:
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01c0, code lost:
        r10 = defpackage.gt0.m1((java.util.Collection) r6.e.A.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01da, code lost:
        if (r11.hasPrevious() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01ea, code lost:
        if (defpackage.nb3.k(((defpackage.sb4) r11.previous()).Y, r5.Y) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x01ec, code lost:
        r11 = r11.nextIndex();
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x01f1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01f3, code lost:
        r11 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x01f4, code lost:
        r10.set(r11, r5);
        r5 = r6.b;
        r5.getClass();
        r5.m(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0200, code lost:
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0203, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0204, code lost:
        r5 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0209  */
    /* JADX WARN: Type inference failed for: r3v4, types: [zg5, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(ic4 ic4Var, Bundle bundle, ad4 ad4Var) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        ic4Var.getClass();
        for (vb4 vb4Var : this.t.values()) {
            vb4Var.d = true;
        }
        ?? obj = new Object();
        if (ad4Var != null && (i2 = ad4Var.c) != -1) {
            z = l(i2, ad4Var.d, ad4Var.e);
        } else {
            z = false;
        }
        Bundle a = ic4Var.a(bundle);
        if (ad4Var != null && ad4Var.b && this.l.containsKey(Integer.valueOf(ic4Var.B.a))) {
            obj.A = p(ic4Var.B.a, a, ad4Var);
            z2 = false;
        } else {
            if (ad4Var != null && ad4Var.a) {
                sb4 sb4Var = (sb4) this.f.h();
                pu puVar = this.f;
                ListIterator listIterator = puVar.listIterator(puVar.a());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((sb4) listIterator.previous()).B == ic4Var) {
                            i = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                if (i != -1) {
                    if (ic4Var instanceof mc4) {
                        int i3 = mc4.Z;
                        List c0 = sb6.c0(new qd2(sb6.Z((mc4) ic4Var, new x84(11)), new x84(6), 2));
                        if (this.f.L - i == c0.size()) {
                            pu puVar2 = this.f;
                            List<sb4> subList = puVar2.subList(i, puVar2.L);
                            ArrayList arrayList = new ArrayList(ht0.v0(subList, 10));
                            for (sb4 sb4Var2 : subList) {
                                arrayList.add(Integer.valueOf(sb4Var2.B.B.a));
                            }
                        }
                    } else if (sb4Var != null) {
                        ic4 ic4Var2 = sb4Var.B;
                        if (ic4Var2 != null) {
                        }
                    }
                    if (!z2) {
                        sb4 r = x31.r(this.a.c, ic4Var, a, h(), this.o);
                        qd4 b = this.s.b(ic4Var.A);
                        List b0 = hf.b0(r);
                        this.u = new cn((zg5) obj, this, ic4Var, a);
                        b.d(b0, ad4Var);
                        this.u = null;
                    }
                }
            }
            z2 = false;
            if (!z2) {
            }
        }
        this.b.c();
        for (vb4 vb4Var2 : this.t.values()) {
            vb4Var2.d = false;
        }
        if (!z && !obj.A && !z2) {
            r();
        } else {
            b();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [zg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [zg5, java.lang.Object] */
    public final boolean l(int i, boolean z, boolean z2) {
        ic4 ic4Var;
        boolean z3;
        String str;
        pu puVar = this.f;
        if (puVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = gt0.a1(puVar).iterator();
        while (true) {
            if (it.hasNext()) {
                ic4 ic4Var2 = ((sb4) it.next()).B;
                String str2 = ic4Var2.A;
                z9 z9Var = ic4Var2.B;
                qd4 b = this.s.b(str2);
                if (z || z9Var.a != i) {
                    arrayList.add(b);
                }
                if (z9Var.a == i) {
                    ic4Var = ic4Var2;
                    break;
                }
            } else {
                ic4Var = null;
                break;
            }
        }
        if (ic4Var == null) {
            int i2 = ic4.X;
            Log.i("NavController", "Ignoring popBackStack to destination " + mp2.C(this.a.c, i) + " as it was not found on the current back stack");
            return false;
        }
        ?? obj = new Object();
        pu puVar2 = new pu();
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                int i4 = i3 + 1;
                qd4 qd4Var = (qd4) arrayList.get(i3);
                ?? obj2 = new Object();
                sb4 sb4Var = (sb4) puVar.last();
                z3 = z2;
                xb4 xb4Var = new xb4((zg5) obj2, (zg5) obj, this, z3, puVar2);
                qd4Var.getClass();
                sb4Var.getClass();
                this.v = xb4Var;
                qd4Var.e(sb4Var, z3);
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
                oc2 oc2Var = new oc2(new qd2(sb6.Z(ic4Var, new x84(4)), new qn2(this) { // from class: yb4
                    public final /* synthetic */ zb4 B;

                    {
                        this.B = this;
                    }

                    @Override // defpackage.qn2
                    public final Object g(Object obj3) {
                        boolean containsKey;
                        int i5 = r2;
                        zb4 zb4Var = this.B;
                        ic4 ic4Var3 = (ic4) obj3;
                        switch (i5) {
                            case 0:
                                ic4Var3.getClass();
                                containsKey = zb4Var.l.containsKey(Integer.valueOf(ic4Var3.B.a));
                                break;
                            default:
                                ic4Var3.getClass();
                                containsKey = zb4Var.l.containsKey(Integer.valueOf(ic4Var3.B.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 1), (byte) 0);
                while (oc2Var.hasNext()) {
                    Integer valueOf = Integer.valueOf(((ic4) oc2Var.next()).B.a);
                    ub4 ub4Var = (ub4) puVar2.f();
                    if (ub4Var != null) {
                        str = (String) ub4Var.a.L;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!puVar2.isEmpty()) {
                aj ajVar = ((ub4) puVar2.first()).a;
                oc2 oc2Var2 = new oc2(new qd2(sb6.Z(c(ajVar.B, null), new x84(5)), new qn2(this) { // from class: yb4
                    public final /* synthetic */ zb4 B;

                    {
                        this.B = this;
                    }

                    @Override // defpackage.qn2
                    public final Object g(Object obj3) {
                        boolean containsKey;
                        int i5 = r2;
                        zb4 zb4Var = this.B;
                        ic4 ic4Var3 = (ic4) obj3;
                        switch (i5) {
                            case 0:
                                ic4Var3.getClass();
                                containsKey = zb4Var.l.containsKey(Integer.valueOf(ic4Var3.B.a));
                                break;
                            default:
                                ic4Var3.getClass();
                                containsKey = zb4Var.l.containsKey(Integer.valueOf(ic4Var3.B.a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 1), (byte) 0);
                while (oc2Var2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((ic4) oc2Var2.next()).B.a), (String) ajVar.L);
                }
                if (linkedHashMap.values().contains((String) ajVar.L)) {
                    this.m.put((String) ajVar.L, puVar2);
                }
            }
        }
        this.b.c();
        return obj.A;
    }

    public final void m(sb4 sb4Var, boolean z, pu puVar) {
        ac4 ac4Var;
        de5 de5Var;
        Set set;
        sb4Var.getClass();
        pu puVar2 = this.f;
        sb4 sb4Var2 = (sb4) puVar2.last();
        if (nb3.k(sb4Var2, sb4Var)) {
            gt0.Y0(puVar2);
            vb4 vb4Var = (vb4) this.t.get(this.s.b(sb4Var2.B.A));
            boolean z2 = true;
            if ((vb4Var == null || (de5Var = vb4Var.f) == null || (set = (Set) de5Var.A.getValue()) == null || !set.contains(sb4Var2)) && !this.k.containsKey(sb4Var2)) {
                z2 = false;
            }
            tt3 tt3Var = ((ku3) sb4Var2.d0.k).d;
            tt3 tt3Var2 = tt3.CREATED;
            if (tt3Var.isAtLeast(tt3Var2)) {
                if (z) {
                    sb4Var2.a(tt3Var2);
                    puVar.addFirst(new ub4(sb4Var2));
                }
                if (!z2) {
                    sb4Var2.a(tt3.DESTROYED);
                    q(sb4Var2);
                } else {
                    sb4Var2.a(tt3Var2);
                }
            }
            if (!z && !z2 && (ac4Var = this.o) != null) {
                String str = sb4Var2.Y;
                str.getClass();
                ap7 ap7Var = (ap7) ac4Var.b.remove(str);
                if (ap7Var != null) {
                    ap7Var.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Attempted to pop ");
        sb.append(sb4Var.B);
        ic4 ic4Var = sb4Var2.B;
        sb.append(", which is not the top of the back stack (");
        sb.append(ic4Var);
        sb.append(')');
        throw new IllegalStateException(sb.toString().toString());
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (vb4 vb4Var : this.t.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) vb4Var.f.A.getValue()) {
                sb4 sb4Var = (sb4) obj;
                if (!arrayList.contains(sb4Var) && !((tt3) sb4Var.d0.l).isAtLeast(tt3.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            gt0.A0(arrayList, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            sb4 sb4Var2 = (sb4) next;
            if (!arrayList.contains(sb4Var2) && ((tt3) sb4Var2.d0.l).isAtLeast(tt3.STARTED)) {
                arrayList3.add(next);
            }
        }
        gt0.A0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (!(((sb4) obj2).B instanceof mc4)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [zg5, java.lang.Object] */
    public final boolean p(int i, Bundle bundle, ad4 ad4Var) {
        ic4 g;
        String str;
        sb4 sb4Var;
        ic4 ic4Var;
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
            if (nb3.k((String) it.next(), str2)) {
                it.remove();
            }
        }
        pu puVar = (pu) ge7.n(this.m).remove(str2);
        rh rhVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        sb4 sb4Var2 = (sb4) this.f.h();
        if (sb4Var2 == null || (g = sb4Var2.B) == null) {
            g = g();
        }
        if (puVar != null) {
            Iterator it2 = puVar.iterator();
            while (it2.hasNext()) {
                ub4 ub4Var = (ub4) it2.next();
                aj ajVar = ub4Var.a;
                aj ajVar2 = ub4Var.a;
                ic4 d = d(ajVar.B, g, null, true);
                if (d != null) {
                    tt3 h = h();
                    ac4 ac4Var = this.o;
                    rhVar.getClass();
                    h.getClass();
                    Bundle bundle3 = (Bundle) ajVar2.R;
                    if (bundle3 != null) {
                        Context context = rhVar.a;
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
                    String str3 = (String) ajVar2.L;
                    str3.getClass();
                    arrayList.add(new sb4(rhVar, d, bundle2, h, ac4Var, str3, (Bundle) ajVar2.X));
                    g = d;
                } else {
                    int i3 = ic4.X;
                    u34.l("Restore State failed: destination ", mp2.C(rhVar, ajVar2.B), " cannot be found from the current destination ", g);
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
            if (!(((sb4) obj).B instanceof mc4)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList3.get(i5);
            i5++;
            sb4 sb4Var3 = (sb4) obj2;
            List list = (List) gt0.R0(arrayList2);
            if (list != null && (sb4Var = (sb4) gt0.Q0(list)) != null && (ic4Var = sb4Var.B) != null) {
                str = ic4Var.A;
            } else {
                str = null;
            }
            if (nb3.k(str, sb4Var3.B.A)) {
                list.add(sb4Var3);
            } else {
                arrayList2.add(hf.d0(sb4Var3));
            }
        }
        ?? obj3 = new Object();
        int size3 = arrayList2.size();
        while (i2 < size3) {
            Object obj4 = arrayList2.get(i2);
            i2++;
            List list2 = (List) obj4;
            qd4 b = this.s.b(((sb4) gt0.H0(list2)).B.A);
            ArrayList arrayList4 = arrayList;
            this.u = new d5(obj3, arrayList4, new Object(), this, bundle, 6);
            b.d(list2, ad4Var);
            this.u = null;
            arrayList = arrayList4;
        }
        return obj3.A;
    }

    public final void q(sb4 sb4Var) {
        Integer num;
        sb4Var.getClass();
        sb4 sb4Var2 = (sb4) this.j.remove(sb4Var);
        if (sb4Var2 != null) {
            LinkedHashMap linkedHashMap = this.k;
            tw twVar = (tw) linkedHashMap.get(sb4Var2);
            if (twVar != null) {
                num = Integer.valueOf(twVar.a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                vb4 vb4Var = (vb4) this.t.get(this.s.b(sb4Var2.B.A));
                if (vb4Var != null) {
                    vb4Var.c(sb4Var2);
                }
                linkedHashMap.remove(sb4Var2);
            }
        }
    }

    public final void r() {
        Boolean bool;
        tw twVar;
        de5 de5Var;
        Set set;
        ArrayList m1 = gt0.m1(this.f);
        if (!m1.isEmpty()) {
            ArrayList d0 = hf.d0(((sb4) gt0.Q0(m1)).B);
            ArrayList arrayList = new ArrayList();
            if (gt0.Q0(d0) instanceof hj1) {
                for (sb4 sb4Var : gt0.a1(m1)) {
                    ic4 ic4Var = sb4Var.B;
                    arrayList.add(ic4Var);
                    if (!(ic4Var instanceof hj1) && !(ic4Var instanceof mc4)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (sb4 sb4Var2 : gt0.a1(m1)) {
                tt3 tt3Var = (tt3) sb4Var2.d0.l;
                ic4 ic4Var2 = sb4Var2.B;
                ic4 ic4Var3 = (ic4) gt0.J0(d0);
                if (ic4Var3 != null && ic4Var3.B.a == ic4Var2.B.a) {
                    tt3 tt3Var2 = tt3.RESUMED;
                    if (tt3Var != tt3Var2) {
                        vb4 vb4Var = (vb4) this.t.get(this.s.b(sb4Var2.B.A));
                        if (vb4Var != null && (de5Var = vb4Var.f) != null && (set = (Set) de5Var.A.getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(sb4Var2));
                        } else {
                            bool = null;
                        }
                        if (!nb3.k(bool, Boolean.TRUE) && ((twVar = (tw) this.k.get(sb4Var2)) == null || twVar.a.get() != 0)) {
                            hashMap.put(sb4Var2, tt3Var2);
                        } else {
                            hashMap.put(sb4Var2, tt3.STARTED);
                        }
                    }
                    ic4 ic4Var4 = (ic4) gt0.J0(arrayList);
                    if (ic4Var4 != null && ic4Var4.B.a == ic4Var2.B.a) {
                        gt0.X0(arrayList);
                    }
                    gt0.X0(d0);
                    mc4 mc4Var = ic4Var2.L;
                    if (mc4Var != null) {
                        d0.add(mc4Var);
                    }
                } else if (!arrayList.isEmpty() && ic4Var2.B.a == ((ic4) gt0.H0(arrayList)).B.a) {
                    ic4 ic4Var5 = (ic4) gt0.X0(arrayList);
                    if (tt3Var == tt3.RESUMED) {
                        sb4Var2.a(tt3.STARTED);
                    } else {
                        tt3 tt3Var3 = tt3.STARTED;
                        if (tt3Var != tt3Var3) {
                            hashMap.put(sb4Var2, tt3Var3);
                        }
                    }
                    mc4 mc4Var2 = ic4Var5.L;
                    if (mc4Var2 != null && !arrayList.contains(mc4Var2)) {
                        arrayList.add(mc4Var2);
                    }
                } else {
                    sb4Var2.a(tt3.CREATED);
                }
            }
            int size = m1.size();
            int i = 0;
            while (i < size) {
                Object obj = m1.get(i);
                i++;
                sb4 sb4Var3 = (sb4) obj;
                tt3 tt3Var4 = (tt3) hashMap.get(sb4Var3);
                if (tt3Var4 != null) {
                    sb4Var3.a(tt3Var4);
                } else {
                    sb4Var3.d0.f();
                }
            }
        }
    }
}
