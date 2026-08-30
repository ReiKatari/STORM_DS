package a7;

import a7.v;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.util.Size;
import androidx.fragment.app.b1;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.s0;
import androidx.lifecycle.y0;
import b4.v1;
import cd.q1;
import j0.o1;
import j0.u0;
import java.lang.reflect.Array;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import l4.r0;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v implements yb.f, l4.u {
    public Object A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.List] */
    public v(l4.h hVar, r0 r0Var, List list, x4.c cVar, p4.d dVar) {
        List list2;
        String str;
        int i2;
        ArrayList arrayList;
        zb.q qVar;
        r0 r0Var2;
        l4.h hVar2 = hVar;
        r0 r0Var3 = r0Var;
        this.A = hVar2;
        this.B = list;
        yb.h hVar3 = yb.h.NONE;
        int i10 = 0;
        this.L = p7.a.s(hVar3, new mc.a(this) { // from class: l4.r
            public final /* synthetic */ a7.v B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                Object obj;
                float f8;
                Object obj2;
                float f10;
                switch (r2) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.B.X;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float a10 = ((t) obj3).f8898a.a();
                            int i11 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i11);
                                    float a11 = ((t) obj4).f8898a.a();
                                    if (Float.compare(a10, a11) < 0) {
                                        obj3 = obj4;
                                        a10 = a11;
                                    }
                                    if (i11 != size) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        if (tVar != null) {
                            f8 = tVar.f8898a.a();
                        } else {
                            f8 = 0.0f;
                        }
                        return Float.valueOf(f8);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.B.X;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c4 = ((t) obj5).f8898a.f13114c0.c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float c10 = ((t) obj6).f8898a.f13114c0.c();
                                    if (Float.compare(c4, c10) < 0) {
                                        obj5 = obj6;
                                        c4 = c10;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        if (tVar2 != null) {
                            f10 = tVar2.f8898a.f13114c0.c();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                }
            }
        });
        this.R = p7.a.s(hVar3, new mc.a(this) { // from class: l4.r
            public final /* synthetic */ a7.v B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                Object obj;
                float f8;
                Object obj2;
                float f10;
                switch (r2) {
                    case 0:
                        ArrayList arrayList2 = (ArrayList) this.B.X;
                        if (arrayList2.isEmpty()) {
                            obj = null;
                        } else {
                            Object obj3 = arrayList2.get(0);
                            float a10 = ((t) obj3).f8898a.a();
                            int i11 = 1;
                            int size = arrayList2.size() - 1;
                            if (1 <= size) {
                                while (true) {
                                    Object obj4 = arrayList2.get(i11);
                                    float a11 = ((t) obj4).f8898a.a();
                                    if (Float.compare(a10, a11) < 0) {
                                        obj3 = obj4;
                                        a10 = a11;
                                    }
                                    if (i11 != size) {
                                        i11++;
                                    }
                                }
                            }
                            obj = obj3;
                        }
                        t tVar = (t) obj;
                        if (tVar != null) {
                            f8 = tVar.f8898a.a();
                        } else {
                            f8 = 0.0f;
                        }
                        return Float.valueOf(f8);
                    default:
                        ArrayList arrayList3 = (ArrayList) this.B.X;
                        if (arrayList3.isEmpty()) {
                            obj2 = null;
                        } else {
                            Object obj5 = arrayList3.get(0);
                            float c4 = ((t) obj5).f8898a.f13114c0.c();
                            int i12 = 1;
                            int size2 = arrayList3.size() - 1;
                            if (1 <= size2) {
                                while (true) {
                                    Object obj6 = arrayList3.get(i12);
                                    float c10 = ((t) obj6).f8898a.f13114c0.c();
                                    if (Float.compare(c4, c10) < 0) {
                                        obj5 = obj6;
                                        c4 = c10;
                                    }
                                    if (i12 != size2) {
                                        i12++;
                                    }
                                }
                            }
                            obj2 = obj5;
                        }
                        t tVar2 = (t) obj2;
                        if (tVar2 != null) {
                            f10 = tVar2.f8898a.f13114c0.c();
                        } else {
                            f10 = 0.0f;
                        }
                        return Float.valueOf(f10);
                }
            }
        });
        l4.v vVar = r0Var3.f8888b;
        l4.h hVar4 = l4.j.f8826a;
        ArrayList arrayList2 = hVar2.R;
        String str2 = hVar2.B;
        zb.q qVar2 = zb.q.A;
        if (arrayList2 != null) {
            list2 = zb.l.l0(arrayList2, new l4.g(1));
        } else {
            list2 = qVar2;
        }
        ArrayList arrayList3 = new ArrayList();
        zb.j jVar = new zb.j();
        int size = list2.size();
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            l4.f fVar = (l4.f) list2.get(i11);
            l4.f a10 = l4.f.a(fVar, vVar.a((l4.v) fVar.f8790a), i10, 14);
            Object obj = a10.f8790a;
            int i13 = a10.f8792c;
            int i14 = a10.f8791b;
            while (i12 < i14 && !jVar.isEmpty()) {
                l4.f fVar2 = (l4.f) jVar.last();
                List list3 = list2;
                int i15 = fVar2.f8792c;
                zb.q qVar3 = qVar2;
                Object obj2 = fVar2.f8790a;
                if (i14 < i15) {
                    arrayList3.add(new l4.f(i12, i14, obj2));
                    i12 = i14;
                    list2 = list3;
                    qVar2 = qVar3;
                } else {
                    int i16 = size;
                    arrayList3.add(new l4.f(i12, i15, obj2));
                    i12 = fVar2.f8792c;
                    while (!jVar.isEmpty() && i12 == ((l4.f) jVar.last()).f8792c) {
                        jVar.removeLast();
                    }
                    list2 = list3;
                    qVar2 = qVar3;
                    size = i16;
                }
            }
            List list4 = list2;
            zb.q qVar4 = qVar2;
            int i17 = size;
            if (i12 < i14) {
                arrayList3.add(new l4.f(i12, i14, vVar));
                i12 = i14;
            }
            l4.f fVar3 = (l4.f) jVar.g();
            if (fVar3 != null) {
                int i18 = fVar3.f8792c;
                Object obj3 = fVar3.f8790a;
                int i19 = fVar3.f8791b;
                if (i19 == i14 && i18 == i13) {
                    jVar.removeLast();
                    jVar.addLast(new l4.f(i14, i13, ((l4.v) obj3).a((l4.v) obj)));
                } else if (i19 == i18) {
                    arrayList3.add(new l4.f(i19, i18, obj3));
                    jVar.removeLast();
                    jVar.addLast(new l4.f(i14, i13, obj));
                } else if (i18 >= i13) {
                    jVar.addLast(new l4.f(i14, i13, ((l4.v) obj3).a((l4.v) obj)));
                } else {
                    fj.j.b();
                    throw null;
                }
            } else {
                jVar.addLast(new l4.f(i14, i13, obj));
            }
            i11++;
            list2 = list4;
            qVar2 = qVar4;
            size = i17;
            i10 = 0;
        }
        zb.q qVar5 = qVar2;
        while (i12 <= str2.length() && !jVar.isEmpty()) {
            l4.f fVar4 = (l4.f) jVar.last();
            Object obj4 = fVar4.f8790a;
            int i20 = fVar4.f8792c;
            arrayList3.add(new l4.f(i12, i20, obj4));
            while (!jVar.isEmpty() && i20 == ((l4.f) jVar.last()).f8792c) {
                jVar.removeLast();
            }
            i12 = i20;
        }
        if (i12 < str2.length()) {
            arrayList3.add(new l4.f(i12, str2.length(), vVar));
        }
        if (arrayList3.isEmpty()) {
            arrayList3.add(new l4.f(0, 0, vVar));
        }
        ArrayList arrayList4 = new ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        int i21 = 0;
        while (i21 < size2) {
            l4.f fVar5 = (l4.f) arrayList3.get(i21);
            int i22 = fVar5.f8791b;
            int i23 = fVar5.f8792c;
            if (i22 != i23) {
                str = str2.substring(i22, i23);
            } else {
                str = "";
            }
            List a11 = l4.j.a(hVar2, i22, i23, new l4.i(0));
            l4.h hVar5 = new l4.h(str, a11 == null ? qVar5 : a11);
            l4.v vVar2 = (l4.v) fVar5.f8790a;
            if (vVar2.f8904b == 0) {
                i2 = size2;
                arrayList = arrayList3;
                vVar2 = new l4.v(vVar2.f8903a, vVar.f8904b, vVar2.f8905c, vVar2.f8906d, vVar2.f8907e, vVar2.f8908f, vVar2.f8909g, vVar2.f8910h, vVar2.f8911i);
            } else {
                i2 = size2;
                arrayList = arrayList3;
            }
            r0 r0Var4 = new r0(r0Var3.f8887a, vVar.a(vVar2));
            ?? r62 = hVar5.A;
            if (r62 == 0) {
                qVar = qVar5;
            } else {
                qVar = r62;
            }
            List list5 = (List) this.B;
            ArrayList arrayList5 = new ArrayList(list5.size());
            int size3 = list5.size();
            int i24 = 0;
            while (i24 < size3) {
                l4.f fVar6 = (l4.f) list5.get(i24);
                int i25 = fVar6.f8791b;
                l4.v vVar3 = vVar;
                int i26 = fVar6.f8792c;
                if (l4.j.b(i22, i23, i25, i26)) {
                    if (i22 > i25 || i26 > i23) {
                        r4.a.a("placeholder can not overlap with paragraph.");
                    }
                    r0Var2 = r0Var4;
                    arrayList5.add(new l4.f(i25 - i22, i26 - i22, fVar6.f8790a));
                } else {
                    r0Var2 = r0Var4;
                }
                i24++;
                r0Var4 = r0Var2;
                vVar = vVar3;
            }
            arrayList4.add(new l4.t(new t4.c(str, r0Var4, qVar, arrayList5, dVar, cVar), i22, i23));
            i21++;
            hVar2 = hVar;
            r0Var3 = r0Var;
            arrayList3 = arrayList;
            size2 = i2;
        }
        this.X = arrayList4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // l4.u
    public float a() {
        return ((Number) this.L.getValue()).floatValue();
    }

    @Override // l4.u
    public boolean b() {
        ArrayList arrayList = (ArrayList) this.X;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((l4.t) arrayList.get(i2)).f8898a.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    @Override // l4.u
    public float c() {
        return ((Number) this.R.getValue()).floatValue();
    }

    public void d(g9.f fVar, Class cls) {
        ((ArrayList) this.L).add(new yb.j(fVar, cls));
    }

    public void e(j9.a aVar, Class cls) {
        ((ArrayList) this.A).add(new yb.j(aVar, cls));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, nc.r] */
    public n2.f f(v2.b bVar, mc.a aVar) {
        int i2;
        int i10;
        boolean z10;
        int i11;
        ?? obj = new Object();
        obj.A = -1;
        synchronized (this.A) {
            Throwable th2 = (Throwable) this.B;
            if (th2 != null) {
                bVar.b(th2);
                return n2.e.B;
            }
            v2.a aVar2 = (v2.a) this.L;
            do {
                i2 = aVar2.get();
                i10 = i2 + 1;
            } while (!aVar2.compareAndSet(i2, i10));
            if ((134217727 & i10) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            obj.A = (i10 >>> 27) & 15;
            ((a1.h0) this.R).a(bVar);
            if (z10 && aVar != null) {
                try {
                    aVar.b();
                } catch (Throwable th3) {
                    synchronized (this.A) {
                        try {
                            if (((Throwable) this.B) == null) {
                                this.B = th3;
                                a1.h0 h0Var = (a1.h0) this.R;
                                Object[] objArr = h0Var.f44a;
                                int i12 = h0Var.f45b;
                                for (int i13 = 0; i13 < i12; i13++) {
                                    ((v2.b) objArr[i13]).b(th3);
                                }
                                ((a1.h0) this.R).d();
                                v2.a aVar3 = (v2.a) this.L;
                                do {
                                    i11 = aVar3.get();
                                } while (!aVar3.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            return new jb.c(new ai.p(bVar, this, (Object) obj, 14));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        if (r6.getRunCount() == 1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.text.Bidi g(int r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.A
            android.text.Layout r0 = (android.text.Layout) r0
            java.lang.Object r1 = r14.X
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r14.B
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            java.lang.Object r3 = r14.L
            boolean[] r3 = (boolean[]) r3
            boolean r4 = r3[r15]
            if (r4 == 0) goto L1b
            java.lang.Object r15 = r2.get(r15)
            java.text.Bidi r15 = (java.text.Bidi) r15
            return r15
        L1b:
            r4 = 0
            if (r15 != 0) goto L20
            r5 = r4
            goto L2c
        L20:
            int r5 = r15 + (-1)
            java.lang.Object r5 = r1.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
        L2c:
            java.lang.Object r1 = r1.get(r15)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r11 = r1 - r5
            java.lang.Object r6 = r14.R
            char[] r6 = (char[]) r6
            if (r6 == 0) goto L44
            int r7 = r6.length
            if (r7 >= r11) goto L42
            goto L44
        L42:
            r7 = r6
            goto L47
        L44:
            char[] r6 = new char[r11]
            goto L42
        L47:
            java.lang.CharSequence r6 = r0.getText()
            android.text.TextUtils.getChars(r6, r5, r1, r7, r4)
            boolean r1 = java.text.Bidi.requiresBidi(r7, r4, r11)
            r5 = 0
            r13 = 1
            if (r1 == 0) goto L76
            int r1 = r14.r(r15)
            int r1 = r0.getLineForOffset(r1)
            int r0 = r0.getParagraphDirection(r1)
            r1 = -1
            if (r0 != r1) goto L67
            r12 = r13
            goto L68
        L67:
            r12 = r4
        L68:
            java.text.Bidi r6 = new java.text.Bidi
            r9 = 0
            r10 = 0
            r8 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            int r0 = r6.getRunCount()
            if (r0 != r13) goto L77
        L76:
            r6 = r5
        L77:
            r2.set(r15, r6)
            r3[r15] = r13
            if (r6 == 0) goto L87
            java.lang.Object r15 = r14.R
            char[] r15 = (char[]) r15
            if (r7 != r15) goto L86
            r7 = r5
            goto L87
        L86:
            r7 = r15
        L87:
            r14.R = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a7.v.g(int):java.text.Bidi");
    }

    @Override // yb.f
    public Object getValue() {
        y0 y0Var = (y0) this.X;
        if (y0Var == null) {
            d1 d1Var = (d1) ((mc.a) this.B).b();
            a1 a1Var = (a1) ((mc.a) this.L).b();
            w6.c cVar = (w6.c) ((mc.a) this.R).b();
            d1Var.getClass();
            a1Var.getClass();
            cVar.getClass();
            b9.e eVar = new b9.e(d1Var, a1Var, cVar);
            nc.e eVar2 = (nc.e) this.A;
            String b10 = eVar2.b();
            if (b10 != null) {
                y0 B = eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), eVar2);
                this.X = B;
                return B;
            }
            a0.j.h("Local and anonymous classes can not be ViewModels");
            return null;
        }
        return y0Var;
    }

    public j0.i h() {
        String str;
        if (((u0) this.A) == null) {
            str = " surface";
        } else {
            str = "";
        }
        if (((List) this.B) == null) {
            str = str.concat(" sharedSurfaces");
        }
        if (((Integer) this.L) == null) {
            str = str.concat(" mirrorMode");
        }
        if (((Integer) this.R) == null) {
            str = str.concat(" surfaceGroupId");
        }
        if (((d0.a0) this.X) == null) {
            str = str.concat(" dynamicRange");
        }
        if (str.isEmpty()) {
            return new j0.i((u0) this.A, (List) this.B, ((Integer) this.L).intValue(), ((Integer) this.R).intValue(), (d0.a0) this.X);
        }
        a0.j.p("Missing required properties:".concat(str));
        return null;
    }

    public void i(pi.g gVar) {
        gVar.getClass();
        String gVar2 = gVar.toString();
        if (gVar2.length() == 0) {
            ((o1) this.L).s("Cache-Control");
        } else {
            s("Cache-Control", gVar2);
        }
    }

    public void j(j0.d0 d0Var, j0.d0 d0Var2, r0.l lVar, r0.l lVar2, Map.Entry entry) {
        j0.d0 d0Var3;
        j0.d0 d0Var4;
        r0.l lVar3 = (r0.l) entry.getValue();
        aj.g.o("DualSurfaceProcessorNode", "     -> outputEdge = " + lVar3);
        Size size = lVar.f12588g.f7235a;
        Rect rect = ((s0.a) entry.getKey()).f12782a.f13048d;
        if (lVar.f12584c) {
            d0Var3 = d0Var;
        } else {
            d0Var3 = null;
        }
        d0.h hVar = new d0.h(size, rect, d0Var3, ((s0.a) entry.getKey()).f12782a.f13050f, ((s0.a) entry.getKey()).f12782a.f13051g);
        Size size2 = lVar2.f12588g.f7235a;
        Rect rect2 = ((s0.a) entry.getKey()).f12783b.f13048d;
        if (lVar2.f12584c) {
            d0Var4 = d0Var2;
        } else {
            d0Var4 = null;
        }
        d0.h hVar2 = new d0.h(size2, rect2, d0Var4, ((s0.a) entry.getKey()).f12783b.f13050f, ((s0.a) entry.getKey()).f12783b.f13051g);
        int i2 = ((s0.a) entry.getKey()).f12782a.f13047c;
        lVar3.getClass();
        l0.f.e();
        lVar3.a();
        p7.m.o("Consumer can only be linked once.", !lVar3.f12591j);
        lVar3.f12591j = true;
        r0.k kVar = lVar3.f12593l;
        m0.b g10 = m0.i.g(kVar.c(), new r0.j(lVar3, kVar, i2, hVar, hVar2), ij.a.p0());
        g10.a(new m0.h(0, g10, new p1.a0(this, lVar3, 11)), ij.a.p0());
    }

    public m5.o k() {
        ArrayList arrayList = (ArrayList) this.X;
        Intent intent = (Intent) this.L;
        z zVar = (z) this.R;
        if (zVar != null) {
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                int size = arrayList.size();
                x xVar = null;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    u uVar = (u) obj;
                    int i10 = uVar.f630a;
                    Bundle bundle = uVar.f631b;
                    x m = m(i10);
                    if (m != null) {
                        for (int i11 : m.b(xVar)) {
                            arrayList2.add(Integer.valueOf(i11));
                            arrayList3.add(bundle);
                        }
                        xVar = m;
                    } else {
                        int i12 = x.X;
                        fj.j.s("Navigation destination ", k7.w.o((d7.c) this.B, i10), " cannot be found in the navigation graph ", zVar);
                        return null;
                    }
                }
                intent.putExtra("android-support-nav:controller:deepLinkIds", zb.l.o0(arrayList2));
                intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
                m5.o oVar = new m5.o((Context) this.A);
                Intent intent2 = new Intent(intent);
                ComponentName component = intent2.getComponent();
                if (component == null) {
                    component = intent2.resolveActivity(oVar.B.getPackageManager());
                }
                if (component != null) {
                    oVar.a(component);
                }
                ArrayList arrayList4 = oVar.A;
                arrayList4.add(intent2);
                int size2 = arrayList4.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    Intent intent3 = (Intent) arrayList4.get(i13);
                    if (intent3 != null) {
                        intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
                    }
                }
                return oVar;
            }
            a0.j.p("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        a0.j.p("You must call setGraph() before constructing the deep link");
        return null;
    }

    public int l(int i2) {
        ek.a aVar = ((dk.b) this.X).f4127n;
        short[] sArr = (short[]) this.A;
        if (aVar.a(sArr, 0) == 0) {
            return aVar.b(((short[][]) this.B)[i2]) + 2;
        }
        if (aVar.a(sArr, 1) == 0) {
            return aVar.b(((short[][]) this.L)[i2]) + 10;
        }
        return aVar.b((short[]) this.R) + 18;
    }

    public x m(int i2) {
        zb.j jVar = new zb.j();
        z zVar = (z) this.R;
        zVar.getClass();
        jVar.addLast(zVar);
        while (!jVar.isEmpty()) {
            x xVar = (x) jVar.removeFirst();
            if (xVar.B.f248a == i2) {
                return xVar;
            }
            if (xVar instanceof z) {
                Iterator it = ((z) xVar).iterator();
                while (true) {
                    d7.h hVar = (d7.h) it;
                    if (hVar.hasNext()) {
                        jVar.addLast((x) hVar.next());
                    }
                }
            }
        }
        return null;
    }

    public void n(mc.l lVar) {
        int i2;
        synchronized (this.A) {
            try {
                a1.h0 h0Var = (a1.h0) this.R;
                this.R = (a1.h0) this.X;
                this.X = h0Var;
                v2.a aVar = (v2.a) this.L;
                do {
                    i2 = aVar.get();
                } while (!aVar.compareAndSet(i2, ((((i2 >>> 27) & 15) + 1) & 15) << 27));
                int i10 = h0Var.f45b;
                for (int i11 = 0; i11 < i10; i11++) {
                    lVar.k(h0Var.f(i11));
                }
                h0Var.d();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public float o(int i2, boolean z10) {
        Layout layout = (Layout) this.A;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i2));
        if (i2 > lineEnd) {
            i2 = lineEnd;
        }
        if (z10) {
            return layout.getPrimaryHorizontal(i2);
        }
        return layout.getSecondaryHorizontal(i2);
    }

    public float p(int i2, boolean z10, boolean z11) {
        boolean z12;
        Bidi bidi;
        boolean z13;
        int i10;
        boolean z14;
        int i11;
        boolean z15;
        boolean z16;
        int i12 = i2;
        Layout layout = (Layout) this.A;
        if (!z11) {
            return o(i2, z10);
        }
        int G = q8.r.G(layout, i12, z11);
        int lineStart = layout.getLineStart(G);
        int lineEnd = layout.getLineEnd(G);
        if (i12 != lineStart && i12 != lineEnd) {
            return o(i2, z10);
        }
        if (i12 != 0 && i12 != layout.getText().length()) {
            int q10 = q(i12, z11);
            if (layout.getParagraphDirection(layout.getLineForOffset(r(q10))) == -1) {
                z12 = true;
            } else {
                z12 = false;
            }
            int t5 = t(lineEnd, lineStart);
            int r5 = r(q10);
            int i13 = lineStart - r5;
            int i14 = t5 - r5;
            Bidi g10 = g(q10);
            if (g10 != null) {
                bidi = g10.createLineBidi(i13, i14);
            } else {
                bidi = null;
            }
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                m4.e[] eVarArr = new m4.e[runCount];
                for (int i15 = 0; i15 < runCount; i15++) {
                    int runStart = bidi.getRunStart(i15) + lineStart;
                    int runLimit = bidi.getRunLimit(i15) + lineStart;
                    if (bidi.getRunLevel(i15) % 2 == 1) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    eVarArr[i15] = new m4.e(runStart, z16, runLimit);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i16 = 0; i16 < runCount2; i16++) {
                    bArr[i16] = (byte) bidi.getRunLevel(i16);
                }
                Bidi.reorderVisually(bArr, 0, eVarArr, 0, runCount);
                if (i12 == lineStart) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < runCount) {
                            if (eVarArr[i17].f9202a == i12) {
                                i11 = i17;
                                break;
                            }
                            i17++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    m4.e eVar = eVarArr[i11];
                    if (!z10 && z12 != eVar.f9204c) {
                        z15 = z12;
                    } else if (!z12) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (i11 == 0 && z15) {
                        return layout.getLineLeft(G);
                    }
                    if (i11 == runCount - 1 && !z15) {
                        return layout.getLineRight(G);
                    }
                    if (z15) {
                        return layout.getPrimaryHorizontal(eVarArr[i11 - 1].f9202a);
                    }
                    return layout.getPrimaryHorizontal(eVarArr[i11 + 1].f9202a);
                }
                if (i12 > t5) {
                    i12 = t(i12, lineStart);
                }
                int i18 = 0;
                while (true) {
                    if (i18 < runCount) {
                        if (eVarArr[i18].f9203b == i12) {
                            i10 = i18;
                            break;
                        }
                        i18++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                m4.e eVar2 = eVarArr[i10];
                if (!z10 && z12 != eVar2.f9204c) {
                    if (!z12) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                } else {
                    z14 = z12;
                }
                if (i10 == 0 && z14) {
                    return layout.getLineLeft(G);
                }
                if (i10 == runCount - 1 && !z14) {
                    return layout.getLineRight(G);
                }
                if (z14) {
                    return layout.getPrimaryHorizontal(eVarArr[i10 - 1].f9203b);
                }
                return layout.getPrimaryHorizontal(eVarArr[i10 + 1].f9203b);
            }
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || z12 == isRtlCharAt) {
                if (!z12) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (i12 == lineStart) {
                z13 = z12;
            } else if (!z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                return layout.getLineLeft(G);
            }
            return layout.getLineRight(G);
        }
        return o(i2, z10);
    }

    public int q(int i2, boolean z10) {
        int i10;
        ArrayList arrayList = (ArrayList) this.X;
        int c4 = p7.t.c(arrayList, Integer.valueOf(i2));
        if (c4 < 0) {
            i10 = -(c4 + 1);
        } else {
            i10 = c4 + 1;
        }
        if (z10 && i10 > 0) {
            int i11 = i10 - 1;
            if (i2 == ((Number) arrayList.get(i11)).intValue()) {
                return i11;
            }
        }
        return i10;
    }

    public int r(int i2) {
        if (i2 == 0) {
            return 0;
        }
        return ((Number) ((ArrayList) this.X).get(i2 - 1)).intValue();
    }

    public void s(String str, String str2) {
        str2.getClass();
        o1 o1Var = (o1) this.L;
        o1Var.getClass();
        p7.t.r(str);
        p7.t.s(str2, str);
        o1Var.s(str);
        p7.t.e(o1Var, str, str2);
    }

    public int t(int i2, int i10) {
        while (i2 > i10) {
            char charAt = ((Layout) this.A).getText().charAt(i2 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((nc.k.b(charAt, 8192) < 0 || nc.k.b(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i2;
            }
            i2--;
        }
        return i2;
    }

    public void u(String str, pi.b0 b0Var) {
        str.getClass();
        if (str.length() > 0) {
            if (b0Var == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    a0.j.e(kc.a.g("method ", str, " must have a request body."));
                    return;
                }
            } else if (!zb.k.F(str)) {
                a0.j.e(kc.a.g("method ", str, " must not have a request body."));
                return;
            }
            this.B = str;
            this.R = b0Var;
            return;
        }
        a0.j.h("method.isEmpty() == true");
    }

    public void v() {
        ek.a.e((short[]) this.A);
        int i2 = 0;
        int i10 = 0;
        while (true) {
            short[][] sArr = (short[][]) this.B;
            if (i10 >= sArr.length) {
                break;
            }
            ek.a.e(sArr[i10]);
            i10++;
        }
        while (true) {
            short[][] sArr2 = (short[][]) this.L;
            if (i2 < sArr2.length) {
                ek.a.e(sArr2[i2]);
                i2++;
            } else {
                ek.a.e((short[]) this.R);
                return;
            }
        }
    }

    public void w(Object obj, String str) {
        str.getClass();
        ((LinkedHashMap) this.A).put(str, obj);
        q1 q1Var = (q1) ((LinkedHashMap) this.L).get(str);
        if (q1Var != null) {
            q1Var.j(obj);
        }
        q1 q1Var2 = (q1) ((LinkedHashMap) this.R).get(str);
        if (q1Var2 != null) {
            q1Var2.j(obj);
        }
    }

    public void x(String str) {
        str.getClass();
        if (vc.o.V(str, "ws:", true)) {
            str = "http:".concat(str.substring(3));
        } else if (vc.o.V(str, "wss:", true)) {
            str = "https:".concat(str.substring(4));
        }
        na.a0 a0Var = new na.a0(1);
        a0Var.e(null, str);
        this.A = a0Var.b();
    }

    public void y() {
        ArrayList arrayList = (ArrayList) this.X;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i10 = ((u) obj).f630a;
            if (m(i10) == null) {
                int i11 = x.X;
                m9.o.n(w.d.u("Navigation destination ", k7.w.o((d7.c) this.B, i10), " cannot be found in the navigation graph "), (z) this.R);
                return;
            }
        }
    }

    public v(Map map) {
        map.getClass();
        this.A = new LinkedHashMap(map);
        this.B = new LinkedHashMap();
        this.L = new LinkedHashMap();
        this.R = new LinkedHashMap();
        this.X = new v1(2, this);
    }

    public v(nc.e eVar, mc.a aVar, mc.a aVar2, mc.a aVar3) {
        this.A = eVar;
        this.B = aVar;
        this.L = aVar2;
        this.R = aVar3;
    }

    public v(l.i iVar, vg.h hVar) {
        this.A = iVar;
        this.B = hVar;
        this.L = new v(nc.u.a(vg.c.class), new vg.i(iVar, 1), new vg.i(iVar, 0), new vg.i(iVar, 2));
        this.R = (h.g) iVar.s(new b1(4), new h.b(this) { // from class: vg.d
            public final /* synthetic */ v B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                h.a aVar = (h.a) obj;
                switch (r2) {
                    case 0:
                        aVar.getClass();
                        ((c) ((v) this.B.L).getValue()).e();
                        return;
                    default:
                        aVar.getClass();
                        ((c) ((v) this.B.L).getValue()).e();
                        return;
                }
            }
        });
        this.X = (h.g) iVar.s(new b1(4), new h.b(this) { // from class: vg.d
            public final /* synthetic */ v B;

            {
                this.B = this;
            }

            @Override // h.b
            public final void a(Object obj) {
                h.a aVar = (h.a) obj;
                switch (r2) {
                    case 0:
                        aVar.getClass();
                        ((c) ((v) this.B.L).getValue()).e();
                        return;
                    default:
                        aVar.getClass();
                        ((c) ((v) this.B.L).getValue()).e();
                        return;
                }
            }
        });
        zc.x.v(s0.f(iVar), null, null, new vg.g(this, null, 1), 3);
    }

    public v(d0 d0Var) {
        Intent launchIntentForPackage;
        d0Var.getClass();
        Context context = d0Var.f551a;
        context.getClass();
        this.A = context;
        this.B = new d7.c(context, false);
        jc.f fVar = new jc.f(new jc.h(1, new uc.j(uc.h.J(context, new a(3)), new a(4), 1), new h1(3)), (byte) 0);
        Activity activity = (Activity) (!fVar.hasNext() ? null : fVar.next());
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.L = launchIntentForPackage;
        this.X = new ArrayList();
        this.R = d0Var.f552b.g();
    }

    public v(dk.b bVar) {
        this.X = bVar;
        this.A = new short[2];
        Class cls = Short.TYPE;
        this.B = (short[][]) Array.newInstance(cls, 16, 8);
        this.L = (short[][]) Array.newInstance(cls, 16, 8);
        this.R = new short[256];
    }

    public v(int i2) {
        switch (i2) {
            case l1.c.f8508d /* 9 */:
                this.A = new Object();
                this.L = new AtomicInteger(0);
                this.R = new a1.h0();
                this.X = new a1.h0();
                return;
            default:
                this.X = qi.a.f12543c;
                this.B = "GET";
                this.L = new o1(3, false);
                return;
        }
    }
}
