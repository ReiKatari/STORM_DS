package n0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import d0.a0;
import d0.f1;
import d0.q;
import d0.q0;
import d0.s0;
import d0.t1;
import d0.v1;
import d0.z;
import j0.a1;
import j0.b0;
import j0.b1;
import j0.d0;
import j0.g1;
import j0.i1;
import j0.j1;
import j0.l2;
import j0.n2;
import j0.o2;
import j0.r0;
import j0.v;
import j0.w1;
import j0.x;
import j0.z0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import p7.m;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements d0.l {
    public final j0.d A;
    public final j0.d B;
    public final o2 L;
    public final q R;
    public final b0.a Z;

    /* renamed from: d0  reason: collision with root package name */
    public final v f9728d0;

    /* renamed from: h0  reason: collision with root package name */
    public v1 f9732h0;

    /* renamed from: i0  reason: collision with root package name */
    public v0.d f9733i0;

    /* renamed from: j0  reason: collision with root package name */
    public final z f9734j0;

    /* renamed from: k0  reason: collision with root package name */
    public final z f9735k0;

    /* renamed from: m0  reason: collision with root package name */
    public final jb.c f9737m0;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();

    /* renamed from: b0  reason: collision with root package name */
    public List f9726b0 = Collections.EMPTY_LIST;

    /* renamed from: c0  reason: collision with root package name */
    public Range f9727c0 = j0.k.f7234h;

    /* renamed from: e0  reason: collision with root package name */
    public final Object f9729e0 = new Object();

    /* renamed from: f0  reason: collision with root package name */
    public boolean f9730f0 = true;

    /* renamed from: g0  reason: collision with root package name */
    public r0 f9731g0 = null;

    /* renamed from: l0  reason: collision with root package name */
    public final jb.c f9736l0 = new jb.c(29);

    public f(d0 d0Var, d0 d0Var2, j0.c cVar, j0.c cVar2, z zVar, z zVar2, b0.a aVar, jb.c cVar3, o2 o2Var) {
        v vVar = cVar.f7165c;
        this.f9728d0 = vVar;
        this.A = new j0.d(d0Var, cVar);
        if (d0Var2 != null && cVar2 != null) {
            this.B = new j0.d(d0Var2, cVar2);
        } else {
            this.B = null;
        }
        this.f9734j0 = zVar;
        this.f9735k0 = zVar2;
        this.Z = aVar;
        this.L = o2Var;
        String d4 = cVar2 != null ? cVar2.f7325a.d() : null;
        j0.h hVar = ((x) vVar).A;
        hVar.getClass();
        String d10 = cVar.f7325a.d();
        d10.getClass();
        ArrayList A = t.A(d10);
        if (d4 != null) {
            A.add(d4);
        }
        this.R = new q(A, hVar);
        this.f9737m0 = cVar3;
    }

    public static boolean B(v1 v1Var) {
        if (v1Var != null) {
            if (v1Var.f3474g.e(l2.N)) {
                if (v1Var.f3474g.r() != n2.VIDEO_CAPTURE) {
                    return false;
                }
                return true;
            }
            Log.e("CameraUseCaseAdapter", v1Var + " UseCase does not have capture type.");
        }
        return false;
    }

    public static void D(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            v1 v1Var = (v1) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                v1Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            v1Var.f3473f = hashSet;
        }
    }

    public static ArrayList E(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((v1) obj).getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw w.d.k(it);
            }
        }
        return arrayList2;
    }

    public static HashMap n(LinkedHashSet linkedHashSet, f0.c cVar) {
        LinkedHashSet linkedHashSet2;
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            hashMap.put(v1Var, v1Var.f3473f);
            HashSet hashSet = null;
            if (cVar != null) {
                linkedHashSet2 = cVar.f4515a;
            } else {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            v1Var.f3473f = hashSet;
        }
        return hashMap;
    }

    public static Matrix s(Rect rect, Size size) {
        boolean z10;
        if (rect.width() > 0 && rect.height() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        m.g("Cannot compute viewport crop rects zero sized sensor rect.", z10);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static s0 t() {
        c0.f fVar = new c0.f(3);
        j0.g gVar = k.U;
        g1 g1Var = fVar.f2374b;
        g1Var.o(gVar, "ImageCapture-Extra");
        Integer num = (Integer) g1Var.h(z0.R, null);
        if (num != null) {
            g1Var.o(a1.f7148n, num);
        } else {
            q0 q0Var = s0.f3457y;
            j0.g gVar2 = z0.X;
            if (Objects.equals(g1Var.h(gVar2, null), 2)) {
                g1Var.o(a1.f7148n, 32);
            } else if (Objects.equals(g1Var.h(gVar2, null), 3)) {
                g1Var.o(a1.f7148n, 32);
                g1Var.o(a1.f7149o, 256);
            } else if (Objects.equals(g1Var.h(gVar2, null), 1)) {
                g1Var.o(a1.f7148n, 4101);
                g1Var.o(a1.f7150p, a0.f3319c);
            } else {
                g1Var.o(a1.f7148n, 256);
            }
        }
        z0 z0Var = new z0(i1.a(g1Var));
        b1.C(z0Var);
        s0 s0Var = new s0(z0Var);
        Size size = (Size) g1Var.h(b1.f7157u, null);
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        m.l((Executor) g1Var.h(g.T, ij.a.l0()), "The IO executor can't be null");
        j0.g gVar3 = z0.L;
        if (g1Var.A.containsKey(gVar3)) {
            Integer num2 = (Integer) g1Var.g(gVar3);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3 && g1Var.h(z0.f7329c0, null) == null) {
                    a0.j.h("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            } else {
                fj.j.r(num2, "The flash mode is not allowed to set: ");
                return null;
            }
        }
        return s0Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [d0.v1, d0.f1] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, m9.o] */
    public static f1 u() {
        Size size;
        c0.f fVar = new c0.f(4);
        j0.g gVar = k.U;
        g1 g1Var = fVar.f2374b;
        g1Var.o(gVar, "Preview-Extra");
        j1 j1Var = new j1(i1.a(g1Var));
        b1.C(j1Var);
        ?? v1Var = new v1(j1Var);
        l0.d dVar = f1.f3368x;
        v1Var.f3370q = dVar;
        ?? obj = new Object();
        l0.f.e();
        v1Var.f3369p = obj;
        v1Var.f3370q = dVar;
        j0.k kVar = v1Var.f3475h;
        if (kVar != null) {
            size = kVar.f7235a;
        } else {
            size = null;
        }
        if (size != null) {
            v1Var.D((j1) v1Var.f3474g, kVar);
            v1Var.o();
        }
        v1Var.f3470c = t1.ACTIVE;
        v1Var.p();
        return v1Var;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [d0.v1, d0.f1] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, n0.e] */
    public static HashMap x(ArrayList arrayList, o2 o2Var, o2 o2Var2, Range range) {
        l2 f8;
        g1 b10;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            v1 v1Var = (v1) obj;
            if (v1Var instanceof v0.d) {
                v0.d dVar = (v0.d) v1Var;
                j1 j1Var = new j1(i1.a(new c0.f(4).f2374b));
                b1.C(j1Var);
                ?? v1Var2 = new v1(j1Var);
                v1Var2.f3370q = f1.f3368x;
                l2 f10 = v1Var2.f(false, o2Var);
                if (f10 == null) {
                    f8 = null;
                } else {
                    g1 c4 = g1.c(f10);
                    c4.A.remove(k.V);
                    f8 = dVar.l(c4).d();
                }
            } else {
                f8 = v1Var.f(false, o2Var);
            }
            l2 f11 = v1Var.f(true, o2Var2);
            if (f11 != null) {
                b10 = g1.c(f11);
            } else {
                b10 = g1.b();
            }
            b10.o(l2.H, 0);
            if (!j0.k.f7234h.equals(range)) {
                b10.j(l2.I, j0.q0.HIGH_PRIORITY_REQUIRED, range);
                b10.o(l2.J, Boolean.TRUE);
            }
            l2 d4 = v1Var.l(b10).d();
            ?? obj2 = new Object();
            obj2.f9724a = f8;
            obj2.f9725b = d4;
            hashMap.put(v1Var, obj2);
        }
        return hashMap;
    }

    public final void A() {
        synchronized (this.f9729e0) {
            this.f9728d0.s();
        }
    }

    public final void C(ArrayList arrayList) {
        synchronized (this.f9729e0) {
            int size = arrayList.size();
            boolean z10 = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((v1) obj).f3473f = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
            linkedHashSet.removeAll(arrayList);
            if (this.B != null) {
                z10 = true;
            }
            l(r(linkedHashSet, z10));
        }
    }

    @Override // d0.l
    public final b0 b() {
        return this.A.B;
    }

    public final void d(Collection collection, f0.c cVar) {
        boolean z10;
        aj.g.o("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + cVar);
        synchronized (this.f9729e0) {
            try {
                j0.d dVar = this.A;
                v vVar = this.f9728d0;
                dVar.m(vVar);
                j0.d dVar2 = this.B;
                if (dVar2 != null) {
                    dVar2.m(vVar);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
                linkedHashSet.addAll(collection);
                HashMap n10 = n(linkedHashSet, cVar);
                try {
                    if (this.B != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    l(r(linkedHashSet, z10));
                } catch (IllegalArgumentException e6) {
                    D(n10);
                    throw new Exception(e6);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(b bVar) {
        int i2;
        Map map = bVar.f9721i.f9741a;
        ArrayList arrayList = bVar.f9714b;
        synchronized (this.f9729e0) {
            try {
                int size = arrayList.size();
                i2 = 0;
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    v1 v1Var = (v1) obj;
                    Rect k10 = this.A.B.f7325a.k();
                    j0.k kVar = (j0.k) map.get(v1Var);
                    kVar.getClass();
                    v1Var.y(s(k10, kVar.f7235a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        List list = this.f9726b0;
        ArrayList arrayList2 = bVar.f9714b;
        LinkedHashSet linkedHashSet = bVar.f9713a;
        ArrayList E = E(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList E2 = E(arrayList3, E);
        if (!E2.isEmpty()) {
            aj.g.y0("CameraUseCaseAdapter", "Unused effects: " + E2);
        }
        ArrayList arrayList4 = bVar.f9717e;
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            ((v1) obj2).A(this.A);
        }
        this.A.g(bVar.f9717e);
        if (this.B != null) {
            ArrayList arrayList5 = bVar.f9717e;
            int size3 = arrayList5.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = arrayList5.get(i12);
                i12++;
                j0.d dVar = this.B;
                Objects.requireNonNull(dVar);
                ((v1) obj3).A(dVar);
            }
            j0.d dVar2 = this.B;
            Objects.requireNonNull(dVar2);
            dVar2.g(bVar.f9717e);
        }
        if (bVar.f9717e.isEmpty()) {
            ArrayList arrayList6 = bVar.f9716d;
            int size4 = arrayList6.size();
            int i13 = 0;
            while (i13 < size4) {
                Object obj4 = arrayList6.get(i13);
                i13++;
                v1 v1Var2 = (v1) obj4;
                Map map2 = bVar.f9721i.f9741a;
                if (map2.containsKey(v1Var2)) {
                    j0.k kVar2 = (j0.k) map2.get(v1Var2);
                    Objects.requireNonNull(kVar2);
                    r0 r0Var = kVar2.f7240f;
                    if (r0Var != null) {
                        w1 w1Var = v1Var2.f3480n;
                        i1 i1Var = w1Var.f7322g.f7275b;
                        Objects.requireNonNull(r0Var);
                        if (r0Var.f().size() == w1Var.f7322g.f7275b.f().size()) {
                            for (j0.g gVar : r0Var.f()) {
                                if (i1Var.A.containsKey(gVar)) {
                                    if (!Objects.equals(i1Var.g(gVar), r0Var.g(gVar))) {
                                    }
                                }
                            }
                        }
                        v1Var2.f3475h = v1Var2.v(r0Var);
                        if (this.f9730f0) {
                            this.A.n(v1Var2);
                            j0.d dVar3 = this.B;
                            if (dVar3 != null) {
                                dVar3.n(v1Var2);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = bVar.f9715c;
        int size5 = arrayList7.size();
        int i14 = 0;
        while (i14 < size5) {
            Object obj5 = arrayList7.get(i14);
            i14++;
            v1 v1Var3 = (v1) obj5;
            e eVar = (e) bVar.f9720h.get(v1Var3);
            Objects.requireNonNull(eVar);
            j0.d dVar4 = this.B;
            j0.d dVar5 = this.A;
            l2 l2Var = eVar.f9724a;
            if (dVar4 != null) {
                v1Var3.b(dVar5, dVar4, l2Var, eVar.f9725b);
                j0.k kVar3 = (j0.k) bVar.f9721i.f9741a.get(v1Var3);
                kVar3.getClass();
                i iVar = bVar.f9722j;
                iVar.getClass();
                v1Var3.f3475h = v1Var3.w(kVar3, (j0.k) iVar.f9741a.get(v1Var3));
            } else {
                v1Var3.b(dVar5, null, l2Var, eVar.f9725b);
                j0.k kVar4 = (j0.k) bVar.f9721i.f9741a.get(v1Var3);
                kVar4.getClass();
                v1Var3.f3475h = v1Var3.w(kVar4, null);
            }
        }
        if (this.f9730f0) {
            this.A.e(bVar.f9715c);
            j0.d dVar6 = this.B;
            if (dVar6 != null) {
                dVar6.e(bVar.f9715c);
            }
        }
        ArrayList arrayList8 = bVar.f9715c;
        int size6 = arrayList8.size();
        while (i2 < size6) {
            Object obj6 = arrayList8.get(i2);
            i2++;
            ((v1) obj6).p();
        }
        this.X.clear();
        this.X.addAll(bVar.f9713a);
        this.Y.clear();
        this.Y.addAll(bVar.f9714b);
        this.f9732h0 = bVar.f9719g;
        this.f9733i0 = bVar.f9718f;
    }

    public final void q() {
        synchronized (this.f9729e0) {
            try {
                if (!this.f9730f0) {
                    if (!this.Y.isEmpty()) {
                        this.A.m(this.f9728d0);
                        j0.d dVar = this.B;
                        if (dVar != null) {
                            dVar.m(this.f9728d0);
                        }
                    }
                    this.A.e(this.Y);
                    j0.d dVar2 = this.B;
                    if (dVar2 != null) {
                        dVar2.e(this.Y);
                    }
                    synchronized (this.f9729e0) {
                        r0 r0Var = this.f9731g0;
                        if (r0Var != null) {
                            this.A.L.b(r0Var);
                        }
                    }
                    ArrayList arrayList = this.Y;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((v1) obj).p();
                    }
                    this.f9730f0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r2 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
        return r(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final n0.b r(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.f.r(java.util.LinkedHashSet, boolean):n0.b");
    }

    public final void v() {
        synchronized (this.f9729e0) {
            try {
                if (this.f9730f0) {
                    this.A.g(new ArrayList(this.Y));
                    j0.d dVar = this.B;
                    if (dVar != null) {
                        dVar.g(new ArrayList(this.Y));
                    }
                    synchronized (this.f9729e0) {
                        j0.b bVar = this.A.L;
                        this.f9731g0 = bVar.f7152b.a();
                        bVar.c();
                    }
                    this.f9730f0 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int w() {
        synchronized (this.f9729e0) {
            try {
                if (this.Z.b() == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final HashSet y(LinkedHashSet linkedHashSet, boolean z10) {
        int i2;
        HashSet hashSet = new HashSet();
        synchronized (this.f9729e0) {
            Iterator it = this.f9726b0.iterator();
            if (!it.hasNext()) {
                if (z10) {
                    i2 = 3;
                } else {
                    i2 = 0;
                }
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            v1 v1Var = (v1) it2.next();
            m.g("Only support one level of sharing for now.", !(v1Var instanceof v0.d));
            Iterator it3 = v1Var.k().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i2 & intValue) == intValue) {
                        hashSet.add(v1Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List z() {
        ArrayList arrayList;
        synchronized (this.f9729e0) {
            arrayList = new ArrayList(this.X);
        }
        return arrayList;
    }
}
