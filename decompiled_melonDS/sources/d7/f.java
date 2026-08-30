package d7;

import a1.x0;
import a4.k2;
import a7.d0;
import a7.f0;
import a7.i;
import a7.k;
import a7.m;
import a7.m0;
import a7.n0;
import a7.o;
import a7.z;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.d1;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import b4.y2;
import cd.e1;
import cd.h1;
import cd.q1;
import cd.y0;
import d1.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import k7.w;
import mc.l;
import nc.p;
import p7.t;
import zb.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    public final d0 f3921a;

    /* renamed from: b */
    public final k f3922b;

    /* renamed from: c */
    public z f3923c;

    /* renamed from: d */
    public Bundle f3924d;

    /* renamed from: e */
    public Bundle[] f3925e;

    /* renamed from: f */
    public final j f3926f = new j();

    /* renamed from: g */
    public final q1 f3927g;

    /* renamed from: h */
    public final q1 f3928h;

    /* renamed from: i */
    public final y0 f3929i;

    /* renamed from: j */
    public final LinkedHashMap f3930j;

    /* renamed from: k */
    public final LinkedHashMap f3931k;

    /* renamed from: l */
    public final LinkedHashMap f3932l;
    public final LinkedHashMap m;

    /* renamed from: n */
    public x f3933n;

    /* renamed from: o */
    public o f3934o;

    /* renamed from: p */
    public final ArrayList f3935p;

    /* renamed from: q */
    public q f3936q;

    /* renamed from: r */
    public final y2 f3937r;

    /* renamed from: s */
    public final n0 f3938s;

    /* renamed from: t */
    public final LinkedHashMap f3939t;

    /* renamed from: u */
    public l f3940u;

    /* renamed from: v */
    public d f3941v;

    /* renamed from: w */
    public final LinkedHashMap f3942w;

    /* renamed from: x */
    public int f3943x;

    /* renamed from: y */
    public final ArrayList f3944y;

    /* renamed from: z */
    public final e1 f3945z;

    public f(d0 d0Var, k kVar) {
        this.f3921a = d0Var;
        this.f3922b = kVar;
        zb.q qVar = zb.q.A;
        this.f3927g = cd.q.c(qVar);
        q1 c4 = cd.q.c(qVar);
        this.f3928h = c4;
        this.f3929i = new y0(c4);
        this.f3930j = new LinkedHashMap();
        this.f3931k = new LinkedHashMap();
        this.f3932l = new LinkedHashMap();
        this.m = new LinkedHashMap();
        this.f3935p = new ArrayList();
        this.f3936q = q.INITIALIZED;
        this.f3937r = new y2(1, this);
        this.f3938s = new n0();
        this.f3939t = new LinkedHashMap();
        this.f3942w = new LinkedHashMap();
        this.f3944y = new ArrayList();
        this.f3945z = cd.q.b(1, 0, bd.a.DROP_OLDEST, 2);
    }

    public static a7.x d(int i2, a7.x xVar, a7.x xVar2, boolean z10) {
        z zVar;
        if (xVar.B.f248a == i2 && (xVar2 == null || (xVar.equals(xVar2) && nc.k.a(xVar.L, xVar2.L)))) {
            return xVar;
        }
        if (xVar instanceof z) {
            zVar = (z) xVar;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            zVar = xVar.L;
            zVar.getClass();
        }
        return zVar.Y.g(i2, zVar, xVar2, z10);
    }

    public static /* synthetic */ void n(f fVar, i iVar) {
        fVar.m(iVar, false, new j());
    }

    public final void a(a7.x xVar, Bundle bundle, i iVar, List list) {
        a7.x xVar2;
        a7.x xVar3;
        Bundle bundle2;
        Object obj;
        Object obj2;
        c cVar = this.f3921a.f553c;
        a7.x xVar4 = iVar.B;
        boolean z10 = xVar4 instanceof b7.q;
        j jVar = this.f3926f;
        if (!z10) {
            while (!jVar.isEmpty() && (((i) jVar.last()).B instanceof b7.q) && l(((i) jVar.last()).B.B.f248a, true, false)) {
            }
        }
        j jVar2 = new j();
        i iVar2 = null;
        if (xVar instanceof z) {
            a7.x xVar5 = xVar4;
            do {
                xVar5.getClass();
                xVar5 = xVar5.L;
                if (xVar5 != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj2 = listIterator.previous();
                            if (nc.k.a(((i) obj2).B, xVar5)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    i iVar3 = (i) obj2;
                    if (iVar3 == null) {
                        iVar3 = x8.e.i(cVar, xVar5, bundle, h(), this.f3934o);
                    }
                    jVar2.addFirst(iVar3);
                    if (!jVar.isEmpty() && ((i) jVar.last()).B == xVar5) {
                        n(this, (i) jVar.last());
                    }
                }
                if (xVar5 == null) {
                    break;
                }
            } while (xVar5 != xVar);
        }
        if (jVar2.isEmpty()) {
            xVar2 = xVar4;
        } else {
            xVar2 = ((i) jVar2.first()).B;
        }
        while (xVar2 != null && c(xVar2.B.f248a, xVar2) != xVar2) {
            xVar2 = xVar2.L;
            if (xVar2 != null) {
                if (bundle != null && bundle.isEmpty()) {
                    bundle2 = null;
                } else {
                    bundle2 = bundle;
                }
                ListIterator listIterator2 = list.listIterator(list.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj = listIterator2.previous();
                        if (nc.k.a(((i) obj).B, xVar2)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                i iVar4 = (i) obj;
                if (iVar4 == null) {
                    iVar4 = x8.e.i(cVar, xVar2, xVar2.a(bundle2), h(), this.f3934o);
                }
                jVar2.addFirst(iVar4);
            }
        }
        if (!jVar2.isEmpty()) {
            xVar4 = ((i) jVar2.first()).B;
        }
        while (!jVar.isEmpty() && (((i) jVar.last()).B instanceof z)) {
            a7.x xVar6 = ((i) jVar.last()).B;
            xVar6.getClass();
            if (((x0) ((z) xVar6).Y.f3862d).c(xVar4.B.f248a) != null) {
                break;
            }
            n(this, (i) jVar.last());
        }
        i iVar5 = (i) jVar.e();
        if (iVar5 == null) {
            iVar5 = (i) jVar2.e();
        }
        if (iVar5 != null) {
            xVar3 = iVar5.B;
        } else {
            xVar3 = null;
        }
        if (!nc.k.a(xVar3, this.f3923c)) {
            ListIterator listIterator3 = list.listIterator(list.size());
            while (true) {
                if (!listIterator3.hasPrevious()) {
                    break;
                }
                Object previous = listIterator3.previous();
                a7.x xVar7 = ((i) previous).B;
                z zVar = this.f3923c;
                zVar.getClass();
                if (nc.k.a(xVar7, zVar)) {
                    iVar2 = previous;
                    break;
                }
            }
            i iVar6 = iVar2;
            if (iVar6 == null) {
                z zVar2 = this.f3923c;
                zVar2.getClass();
                z zVar3 = this.f3923c;
                zVar3.getClass();
                iVar6 = x8.e.i(cVar, zVar2, zVar3.a(bundle), h(), this.f3934o);
            }
            jVar2.addFirst(iVar6);
        }
        Iterator it = jVar2.iterator();
        while (it.hasNext()) {
            i iVar7 = (i) it.next();
            Object obj3 = this.f3939t.get(this.f3938s.b(iVar7.B.A));
            if (obj3 != null) {
                ((m) obj3).a(iVar7);
            } else {
                m9.o.g(w.d.s(new StringBuilder("NavigatorBackStack for "), xVar.A, " should already be created"));
                return;
            }
        }
        jVar.addAll(jVar2);
        jVar.addLast(iVar);
        ArrayList d02 = zb.l.d0(jVar2, iVar);
        int size = d02.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj4 = d02.get(i2);
            i2++;
            i iVar8 = (i) obj4;
            z zVar4 = iVar8.B.L;
            if (zVar4 != null) {
                j(iVar8, e(zVar4.B.f248a));
            }
        }
    }

    public final boolean b() {
        j jVar;
        while (true) {
            jVar = this.f3926f;
            if (jVar.isEmpty() || !(((i) jVar.last()).B instanceof z)) {
                break;
            }
            n(this, (i) jVar.last());
        }
        i iVar = (i) jVar.g();
        ArrayList arrayList = this.f3944y;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        this.f3943x++;
        r();
        int i2 = this.f3943x - 1;
        this.f3943x = i2;
        if (i2 == 0) {
            ArrayList q02 = zb.l.q0(arrayList);
            arrayList.clear();
            int size = q02.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = q02.get(i10);
                i10++;
                i iVar2 = (i) obj;
                Iterator it = zb.l.p0(this.f3935p).iterator();
                if (!it.hasNext()) {
                    this.f3945z.p(iVar2);
                } else if (it.next() != null) {
                    m9.o.b();
                    return false;
                } else {
                    a7.x xVar = iVar2.B;
                    iVar2.f576b0.c();
                    throw null;
                }
            }
            ArrayList arrayList2 = new ArrayList(jVar);
            q1 q1Var = this.f3927g;
            q1Var.getClass();
            q1Var.k(null, arrayList2);
            ArrayList o5 = o();
            q1 q1Var2 = this.f3928h;
            q1Var2.getClass();
            q1Var2.k(null, o5);
        }
        if (iVar != null) {
            return true;
        }
        return false;
    }

    public final a7.x c(int i2, a7.x xVar) {
        a7.x xVar2;
        z zVar = this.f3923c;
        if (zVar == null) {
            return null;
        }
        if (zVar.B.f248a == i2) {
            if (xVar != null) {
                if (nc.k.a(zVar, xVar) && xVar.L == null) {
                    return this.f3923c;
                }
            } else {
                return zVar;
            }
        }
        i iVar = (i) this.f3926f.g();
        if (iVar == null || (xVar2 = iVar.B) == null) {
            xVar2 = this.f3923c;
            xVar2.getClass();
        }
        return d(i2, xVar2, xVar, false);
    }

    public final i e(int i2) {
        Object obj;
        j jVar = this.f3926f;
        ListIterator<E> listIterator = jVar.listIterator(jVar.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((i) obj).B.B.f248a == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        i iVar = (i) obj;
        if (iVar != null) {
            return iVar;
        }
        StringBuilder i10 = kc.a.i("No destination with ID ", i2, " is on the NavController's back stack. The current destination is ");
        i10.append(f());
        throw new IllegalArgumentException(i10.toString().toString());
    }

    public final a7.x f() {
        i iVar = (i) this.f3926f.g();
        if (iVar != null) {
            return iVar.B;
        }
        return null;
    }

    public final z g() {
        z zVar = this.f3923c;
        if (zVar != null) {
            zVar.getClass();
            return zVar;
        }
        a0.j.p("You must call setGraph() before calling getGraph()");
        return null;
    }

    public final q h() {
        if (this.f3933n == null) {
            return q.CREATED;
        }
        return this.f3936q;
    }

    public final z i() {
        a7.x xVar;
        z zVar;
        i iVar = (i) this.f3926f.g();
        if (iVar == null || (xVar = iVar.B) == null) {
            xVar = this.f3923c;
            xVar.getClass();
        }
        if (xVar instanceof z) {
            zVar = (z) xVar;
        } else {
            zVar = null;
        }
        if (zVar == null) {
            z zVar2 = xVar.L;
            zVar2.getClass();
            return zVar2;
        }
        return zVar;
    }

    public final void j(i iVar, i iVar2) {
        this.f3930j.put(iVar, iVar2);
        LinkedHashMap linkedHashMap = this.f3931k;
        if (linkedHashMap.get(iVar2) == null) {
            linkedHashMap.put(iVar2, new a());
        }
        Object obj = linkedHashMap.get(iVar2);
        obj.getClass();
        ((a) obj).f3918a.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x00fb, code lost:
        if (r13.equals(r10) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x010d, code lost:
        if (r23.B.f248a == r10.B.f248a) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x010f, code lost:
        r10 = new zb.j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x011a, code lost:
        if (p7.t.l(r22.f3926f) < r11) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x011c, code lost:
        r12 = (a7.i) zb.l.h0(r22.f3926f);
        q(r12);
        r13 = new a7.i(r12.A, r12.B, r12.B.a(r24), r12.R, r12.X, r12.Y, r12.Z);
        r0 = r13.f576b0;
        r4 = r12.R;
        r0.getClass();
        r4.getClass();
        r0.f3257f = r4;
        r0 = r13.f576b0;
        r4 = (androidx.lifecycle.q) r12.f576b0.f3263l;
        r0.getClass();
        r4.getClass();
        r0.f3263l = r4;
        r0.f();
        r10.addFirst(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x016d, code lost:
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0175, code lost:
        if (r0.hasNext() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0177, code lost:
        r4 = (a7.i) r0.next();
        r7 = r4.B.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0181, code lost:
        if (r7 == null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0183, code lost:
        j(r4, e(r7.B.f248a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x018e, code lost:
        r22.f3926f.addLast(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0194, code lost:
        r0 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x019c, code lost:
        if (r0.hasNext() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x019e, code lost:
        r4 = (a7.i) r0.next();
        r7 = r22.f3938s.b(r4.B.A);
        r9 = r4.B;
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
        r7.c(r9);
        r7 = r7.b();
        r9 = r7.f595a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x01c0, code lost:
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x01c1, code lost:
        r10 = zb.l.q0((java.util.Collection) r7.f599e.A.getValue());
        r11 = r10.listIterator(r10.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01db, code lost:
        if (r11.hasPrevious() == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x01eb, code lost:
        if (nc.k.a(((a7.i) r11.previous()).Y, r4.Y) == false) goto L81;
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
        r10.set(r11, r4);
        r4 = r7.f596b;
        r4.getClass();
        r4.k(null, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0201, code lost:
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0204, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0205, code lost:
        r21 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:206:0x020c  */
    /* JADX WARN: Type inference failed for: r1v1, types: [nc.p, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(a7.x r23, android.os.Bundle r24, a7.f0 r25) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.f.k(a7.x, android.os.Bundle, a7.f0):void");
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [nc.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [nc.p, java.lang.Object] */
    public final boolean l(int i2, boolean z10, boolean z11) {
        a7.x xVar;
        boolean z12;
        String str;
        j jVar = this.f3926f;
        if (jVar.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = zb.l.j0(jVar).iterator();
        while (true) {
            if (it.hasNext()) {
                a7.x xVar2 = ((i) it.next()).B;
                String str2 = xVar2.A;
                k2 k2Var = xVar2.B;
                m0 b10 = this.f3938s.b(str2);
                if (z10 || k2Var.f248a != i2) {
                    arrayList.add(b10);
                }
                if (k2Var.f248a == i2) {
                    xVar = xVar2;
                    break;
                }
            } else {
                xVar = null;
                break;
            }
        }
        if (xVar == null) {
            int i10 = a7.x.X;
            Log.i("NavController", "Ignoring popBackStack to destination " + w.o(this.f3921a.f553c, i2) + " as it was not found on the current back stack");
            return false;
        }
        ?? obj = new Object();
        j jVar2 = new j();
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                int i12 = i11 + 1;
                m0 m0Var = (m0) arrayList.get(i11);
                ?? obj2 = new Object();
                i iVar = (i) jVar.last();
                z12 = z11;
                d dVar = new d((p) obj2, (p) obj, this, z12, jVar2);
                m0Var.getClass();
                iVar.getClass();
                this.f3941v = dVar;
                m0Var.e(iVar, z12);
                this.f3941v = null;
                if (!obj2.A) {
                    break;
                }
                i11 = i12;
            } else {
                z12 = z11;
                break;
            }
        }
        if (z12) {
            LinkedHashMap linkedHashMap = this.f3932l;
            if (!z10) {
                jc.f fVar = new jc.f(new uc.j(uc.h.J(xVar, new x1(9)), new l(this) { // from class: d7.e
                    public final /* synthetic */ f B;

                    {
                        this.B = this;
                    }

                    @Override // mc.l
                    public final Object k(Object obj3) {
                        boolean containsKey;
                        a7.x xVar3 = (a7.x) obj3;
                        switch (r2) {
                            case 0:
                                xVar3.getClass();
                                containsKey = this.B.f3932l.containsKey(Integer.valueOf(xVar3.B.f248a));
                                break;
                            default:
                                xVar3.getClass();
                                containsKey = this.B.f3932l.containsKey(Integer.valueOf(xVar3.B.f248a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (fVar.hasNext()) {
                    Integer valueOf = Integer.valueOf(((a7.x) fVar.next()).B.f248a);
                    a7.j jVar3 = (a7.j) jVar2.e();
                    if (jVar3 != null) {
                        str = (String) jVar3.f578a.B;
                    } else {
                        str = null;
                    }
                    linkedHashMap.put(valueOf, str);
                }
            }
            if (!jVar2.isEmpty()) {
                h1 h1Var = ((a7.j) jVar2.first()).f578a;
                jc.f fVar2 = new jc.f(new uc.j(uc.h.J(c(h1Var.A, null), new x1(10)), new l(this) { // from class: d7.e
                    public final /* synthetic */ f B;

                    {
                        this.B = this;
                    }

                    @Override // mc.l
                    public final Object k(Object obj3) {
                        boolean containsKey;
                        a7.x xVar3 = (a7.x) obj3;
                        switch (r2) {
                            case 0:
                                xVar3.getClass();
                                containsKey = this.B.f3932l.containsKey(Integer.valueOf(xVar3.B.f248a));
                                break;
                            default:
                                xVar3.getClass();
                                containsKey = this.B.f3932l.containsKey(Integer.valueOf(xVar3.B.f248a));
                                break;
                        }
                        return Boolean.valueOf(!containsKey);
                    }
                }, 0));
                while (fVar2.hasNext()) {
                    linkedHashMap.put(Integer.valueOf(((a7.x) fVar2.next()).B.f248a), (String) h1Var.B);
                }
                if (linkedHashMap.values().contains((String) h1Var.B)) {
                    this.m.put((String) h1Var.B, jVar2);
                }
            }
        }
        this.f3922b.b();
        return obj.A;
    }

    public final void m(i iVar, boolean z10, j jVar) {
        o oVar;
        y0 y0Var;
        Set set;
        iVar.getClass();
        j jVar2 = this.f3926f;
        i iVar2 = (i) jVar2.last();
        if (nc.k.a(iVar2, iVar)) {
            zb.l.h0(jVar2);
            m mVar = (m) this.f3939t.get(this.f3938s.b(iVar2.B.A));
            boolean z11 = true;
            if ((mVar == null || (y0Var = mVar.f600f) == null || (set = (Set) y0Var.A.getValue()) == null || !set.contains(iVar2)) && !this.f3931k.containsKey(iVar2)) {
                z11 = false;
            }
            q qVar = ((androidx.lifecycle.z) iVar2.f576b0.f3262k).f1504d;
            q qVar2 = q.CREATED;
            if (qVar.isAtLeast(qVar2)) {
                if (z10) {
                    iVar2.b(qVar2);
                    jVar.addFirst(new a7.j(iVar2));
                }
                if (!z11) {
                    iVar2.b(q.DESTROYED);
                    q(iVar2);
                } else {
                    iVar2.b(qVar2);
                }
            }
            if (!z10 && !z11 && (oVar = this.f3934o) != null) {
                String str = iVar2.Y;
                str.getClass();
                d1 d1Var = (d1) oVar.f609b.remove(str);
                if (d1Var != null) {
                    d1Var.a();
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Attempted to pop ");
        sb2.append(iVar.B);
        a7.x xVar = iVar2.B;
        sb2.append(", which is not the top of the back stack (");
        sb2.append(xVar);
        sb2.append(')');
        throw new IllegalStateException(sb2.toString().toString());
    }

    public final ArrayList o() {
        ArrayList arrayList = new ArrayList();
        for (m mVar : this.f3939t.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : (Iterable) mVar.f600f.A.getValue()) {
                i iVar = (i) obj;
                if (!arrayList.contains(iVar) && !((q) iVar.f576b0.f3263l).isAtLeast(q.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            zb.l.L(arrayList2, arrayList);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = this.f3926f.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            i iVar2 = (i) next;
            if (!arrayList.contains(iVar2) && ((q) iVar2.f576b0.f3263l).isAtLeast(q.STARTED)) {
                arrayList3.add(next);
            }
        }
        zb.l.L(arrayList3, arrayList);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            if (!(((i) obj2).B instanceof z)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [nc.p, java.lang.Object] */
    public final boolean p(int i2, Bundle bundle, f0 f0Var) {
        a7.x g10;
        String str;
        i iVar;
        a7.x xVar;
        Bundle bundle2;
        ClassLoader classLoader;
        Integer valueOf = Integer.valueOf(i2);
        LinkedHashMap linkedHashMap = this.f3932l;
        int i10 = 0;
        if (!linkedHashMap.containsKey(valueOf)) {
            return false;
        }
        String str2 = (String) linkedHashMap.get(Integer.valueOf(i2));
        Collection values = linkedHashMap.values();
        values.getClass();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            if (nc.k.a((String) it.next(), str2)) {
                it.remove();
            }
        }
        j jVar = (j) nc.w.a(this.m).remove(str2);
        c cVar = this.f3921a.f553c;
        ArrayList arrayList = new ArrayList();
        i iVar2 = (i) this.f3926f.g();
        if (iVar2 == null || (g10 = iVar2.B) == null) {
            g10 = g();
        }
        if (jVar != null) {
            Iterator it2 = jVar.iterator();
            while (it2.hasNext()) {
                a7.j jVar2 = (a7.j) it2.next();
                h1 h1Var = jVar2.f578a;
                h1 h1Var2 = jVar2.f578a;
                a7.x d4 = d(h1Var.A, g10, null, true);
                if (d4 != null) {
                    q h2 = h();
                    o oVar = this.f3934o;
                    cVar.getClass();
                    h2.getClass();
                    Bundle bundle3 = (Bundle) h1Var2.L;
                    if (bundle3 != null) {
                        Context context = cVar.f3920a;
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
                    String str3 = (String) h1Var2.B;
                    str3.getClass();
                    arrayList.add(new i(cVar, d4, bundle2, h2, oVar, str3, (Bundle) h1Var2.R));
                    g10 = d4;
                } else {
                    int i11 = a7.x.X;
                    a0.j.j("Restore State failed: destination ", w.o(cVar, h1Var2.A), " cannot be found from the current destination ", g10);
                    return false;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            if (!(((i) obj).B instanceof z)) {
                arrayList3.add(obj);
            }
        }
        int size2 = arrayList3.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList3.get(i13);
            i13++;
            i iVar3 = (i) obj2;
            List list = (List) zb.l.a0(arrayList2);
            if (list != null && (iVar = (i) zb.l.Z(list)) != null && (xVar = iVar.B) != null) {
                str = xVar.A;
            } else {
                str = null;
            }
            if (nc.k.a(str, iVar3.B.A)) {
                list.add(iVar3);
            } else {
                arrayList2.add(t.A(iVar3));
            }
        }
        ?? obj3 = new Object();
        int size3 = arrayList2.size();
        while (i10 < size3) {
            Object obj4 = arrayList2.get(i10);
            i10++;
            List list2 = (List) obj4;
            m0 b10 = this.f3938s.b(((i) zb.l.R(list2)).B.A);
            ArrayList arrayList4 = arrayList;
            this.f3940u = new d2.a(obj3, arrayList4, new Object(), this, bundle, 1);
            b10.d(list2, f0Var);
            this.f3940u = null;
            arrayList = arrayList4;
        }
        return obj3.A;
    }

    public final void q(i iVar) {
        Integer num;
        iVar.getClass();
        i iVar2 = (i) this.f3930j.remove(iVar);
        if (iVar2 != null) {
            LinkedHashMap linkedHashMap = this.f3931k;
            a aVar = (a) linkedHashMap.get(iVar2);
            if (aVar != null) {
                num = Integer.valueOf(aVar.f3918a.decrementAndGet());
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 0) {
                m mVar = (m) this.f3939t.get(this.f3938s.b(iVar2.B.A));
                if (mVar != null) {
                    mVar.c(iVar2);
                }
                linkedHashMap.remove(iVar2);
            }
        }
    }

    public final void r() {
        Boolean bool;
        a aVar;
        y0 y0Var;
        Set set;
        ArrayList q02 = zb.l.q0(this.f3926f);
        if (!q02.isEmpty()) {
            ArrayList A = t.A(((i) zb.l.Z(q02)).B);
            ArrayList arrayList = new ArrayList();
            if (zb.l.Z(A) instanceof b7.q) {
                for (i iVar : zb.l.j0(q02)) {
                    a7.x xVar = iVar.B;
                    arrayList.add(xVar);
                    if (!(xVar instanceof b7.q) && !(xVar instanceof z)) {
                        break;
                    }
                }
            }
            HashMap hashMap = new HashMap();
            for (i iVar2 : zb.l.j0(q02)) {
                q qVar = (q) iVar2.f576b0.f3263l;
                a7.x xVar2 = iVar2.B;
                a7.x xVar3 = (a7.x) zb.l.T(A);
                if (xVar3 != null && xVar3.B.f248a == xVar2.B.f248a) {
                    q qVar2 = q.RESUMED;
                    if (qVar != qVar2) {
                        m mVar = (m) this.f3939t.get(this.f3938s.b(iVar2.B.A));
                        if (mVar != null && (y0Var = mVar.f600f) != null && (set = (Set) y0Var.A.getValue()) != null) {
                            bool = Boolean.valueOf(set.contains(iVar2));
                        } else {
                            bool = null;
                        }
                        if (!nc.k.a(bool, Boolean.TRUE) && ((aVar = (a) this.f3931k.get(iVar2)) == null || aVar.f3918a.get() != 0)) {
                            hashMap.put(iVar2, qVar2);
                        } else {
                            hashMap.put(iVar2, q.STARTED);
                        }
                    }
                    a7.x xVar4 = (a7.x) zb.l.T(arrayList);
                    if (xVar4 != null && xVar4.B.f248a == xVar2.B.f248a) {
                        zb.l.g0(arrayList);
                    }
                    zb.l.g0(A);
                    z zVar = xVar2.L;
                    if (zVar != null) {
                        A.add(zVar);
                    }
                } else if (!arrayList.isEmpty() && xVar2.B.f248a == ((a7.x) zb.l.R(arrayList)).B.f248a) {
                    a7.x xVar5 = (a7.x) zb.l.g0(arrayList);
                    if (qVar == q.RESUMED) {
                        iVar2.b(q.STARTED);
                    } else {
                        q qVar3 = q.STARTED;
                        if (qVar != qVar3) {
                            hashMap.put(iVar2, qVar3);
                        }
                    }
                    z zVar2 = xVar5.L;
                    if (zVar2 != null && !arrayList.contains(zVar2)) {
                        arrayList.add(zVar2);
                    }
                } else {
                    iVar2.b(q.CREATED);
                }
            }
            int size = q02.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = q02.get(i2);
                i2++;
                i iVar3 = (i) obj;
                q qVar4 = (q) hashMap.get(iVar3);
                if (qVar4 != null) {
                    iVar3.b(qVar4);
                } else {
                    iVar3.f576b0.f();
                }
            }
        }
    }
}
