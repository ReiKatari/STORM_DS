package v0;

import a7.v;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import d0.a0;
import d0.t1;
import d0.v1;
import d0.z;
import j0.a1;
import j0.b0;
import j0.b1;
import j0.d0;
import j0.g1;
import j0.i1;
import j0.k;
import j0.l2;
import j0.o2;
import j0.p0;
import j0.r0;
import j0.r1;
import j0.s1;
import j0.w1;
import j0.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import m9.o;
import p1.c1;
import p7.m;
import q.q3;
import r0.l;
import r0.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends v1 {
    public r1 A;
    public s1 B;

    /* renamed from: p  reason: collision with root package name */
    public final e f13591p;

    /* renamed from: q  reason: collision with root package name */
    public final g f13592q;

    /* renamed from: r  reason: collision with root package name */
    public final z f13593r;

    /* renamed from: s  reason: collision with root package name */
    public final z f13594s;

    /* renamed from: t  reason: collision with root package name */
    public c1 f13595t;

    /* renamed from: u  reason: collision with root package name */
    public v f13596u;

    /* renamed from: v  reason: collision with root package name */
    public l f13597v;

    /* renamed from: w  reason: collision with root package name */
    public l f13598w;

    /* renamed from: x  reason: collision with root package name */
    public l f13599x;

    /* renamed from: y  reason: collision with root package name */
    public l f13600y;

    /* renamed from: z  reason: collision with root package name */
    public r1 f13601z;

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, m9.o] */
    public d(d0 d0Var, d0 d0Var2, z zVar, z zVar2, HashSet hashSet, o2 o2Var) {
        super(H(hashSet));
        HashSet hashSet2;
        this.f13591p = H(hashSet);
        this.f13593r = zVar;
        this.f13594s = zVar2;
        this.f13592q = new g(d0Var, d0Var2, hashSet, o2Var, new Object());
        HashSet hashSet3 = ((v1) hashSet.iterator().next()).f3473f;
        if (hashSet3 != null) {
            hashSet2 = new HashSet(hashSet3);
        } else {
            hashSet2 = null;
        }
        this.f3473f = hashSet2;
    }

    public static ArrayList G(v1 v1Var) {
        ArrayList arrayList = new ArrayList();
        if (v1Var instanceof d) {
            Iterator it = ((d) v1Var).f13592q.A.iterator();
            while (it.hasNext()) {
                arrayList.add(((v1) it.next()).f3474g.r());
            }
            return arrayList;
        }
        arrayList.add(v1Var.f3474g.r());
        return arrayList;
    }

    public static e H(HashSet hashSet) {
        g1 b10 = g1.b();
        new c0.f(b10, 6);
        b10.o(a1.f7148n, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            if (v1Var.f3474g.e(l2.N)) {
                arrayList.add(v1Var.f3474g.r());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        b10.o(e.B, arrayList);
        b10.o(b1.f7156t, 2);
        b10.o(l2.S, z1.PREVIEW_VIDEO_STILL);
        return new e(i1.a(b10));
    }

    public final void C() {
        s1 s1Var = this.B;
        if (s1Var != null) {
            s1Var.b();
            this.B = null;
        }
        l lVar = this.f13597v;
        if (lVar != null) {
            lVar.b();
            this.f13597v = null;
        }
        l lVar2 = this.f13598w;
        if (lVar2 != null) {
            lVar2.b();
            this.f13598w = null;
        }
        l lVar3 = this.f13599x;
        if (lVar3 != null) {
            lVar3.b();
            this.f13599x = null;
        }
        l lVar4 = this.f13600y;
        if (lVar4 != null) {
            lVar4.b();
            this.f13600y = null;
        }
        c1 c1Var = this.f13595t;
        if (c1Var != null) {
            ((r0.d) c1Var.A).a();
            l0.f.B(new r0.b(2, c1Var));
            this.f13595t = null;
        }
        v vVar = this.f13596u;
        if (vVar != null) {
            ((n) vVar.A).a();
            l0.f.B(new r0.b(5, vVar));
            this.f13596u = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [a7.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, p1.c1] */
    public final List D(String str, String str2, l2 l2Var, k kVar, k kVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        a0 a0Var = kVar.f7237c;
        l0.f.e();
        g gVar = this.f13592q;
        if (kVar2 == null) {
            l E = E(str, str2, l2Var, kVar, null);
            d0 c4 = c();
            Objects.requireNonNull(c4);
            r0.d dVar = new r0.d(a0Var);
            ?? obj = new Object();
            obj.B = c4;
            obj.A = dVar;
            this.f13595t = obj;
            if (this.f3477j != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            int p10 = ((b1) this.f3474g).p();
            gVar.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = gVar.A.iterator();
            while (it.hasNext()) {
                v1 v1Var = (v1) it.next();
                b bVar = gVar.f13605e0;
                d0 d0Var = gVar.Y;
                g gVar2 = gVar;
                boolean z15 = z13;
                t0.b r5 = gVar2.r(v1Var, bVar, d0Var, E, p10, z15);
                int e6 = gVar2.Y.b().e(((b1) v1Var.f3474g).p());
                f fVar = (f) gVar2.L.get(v1Var);
                Objects.requireNonNull(fVar);
                fVar.B.f13608c = e6;
                hashMap.put(v1Var, r5);
                gVar = gVar2;
                z13 = z15;
            }
            g gVar3 = gVar;
            boolean z16 = z13;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (E != null) {
                l0.f.e();
                StringBuilder sb2 = new StringBuilder("SurfaceProcessorNode Transform (Processor=");
                r0.d dVar2 = (r0.d) obj.A;
                sb2.append(dVar2);
                sb2.append("\n   inputEdge = ");
                sb2.append(E);
                aj.g.o("SurfaceProcessorNode", sb2.toString());
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    aj.g.o("SurfaceProcessorNode", "   outputConfig = " + ((t0.b) obj2));
                }
                obj.L = new HashMap();
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj3 = arrayList.get(i10);
                    int i11 = i10 + 1;
                    t0.b bVar2 = (t0.b) obj3;
                    ij.g gVar4 = (ij.g) obj.L;
                    Rect rect = bVar2.f13048d;
                    int i12 = bVar2.f13050f;
                    boolean z17 = bVar2.f13051g;
                    ArrayList arrayList2 = arrayList;
                    Matrix matrix = new Matrix(E.f12583b);
                    RectF rectF = new RectF(rect);
                    int i13 = size2;
                    Size size3 = bVar2.f13049e;
                    matrix.postConcat(k0.h.a(rectF, k0.h.h(size3), i12, z17));
                    m.h(k0.h.d(k0.h.g(k0.h.f(rect), i12), size3));
                    HashMap hashMap2 = hashMap;
                    Rect rect2 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
                    q3 b10 = E.f12588g.b();
                    b10.f11994a = size3;
                    k c10 = b10.c();
                    int i14 = bVar2.f13046b;
                    int i15 = bVar2.f13047c;
                    int i16 = E.f12590i - i12;
                    if (E.f12586e != z17) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    gVar4.put(bVar2, new l(i14, i15, c10, matrix, false, rect2, i16, -1, z14));
                    arrayList = arrayList2;
                    size2 = i13;
                    i10 = i11;
                    hashMap = hashMap2;
                }
                HashMap hashMap3 = hashMap;
                dVar2.c(E.c(true));
                for (Map.Entry entry : ((ij.g) obj.L).entrySet()) {
                    obj.a(E, entry);
                    l lVar = (l) entry.getValue();
                    a0.i iVar = new a0.i(obj, E, entry, 12);
                    lVar.getClass();
                    l0.f.e();
                    lVar.a();
                    lVar.m.add(iVar);
                }
                E.f12595o.add(new j8.h(2, (ij.g) obj.L));
                ij.g gVar5 = (ij.g) obj.L;
                HashMap hashMap4 = new HashMap();
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    hashMap4.put((v1) entry2.getKey(), (l) gVar5.get(entry2.getValue()));
                }
                gVar3.x(hashMap4, gVar3.u(E, z16));
                ArrayList arrayList3 = new ArrayList(1);
                Object obj4 = new Object[]{this.f13601z.c()}[0];
                Objects.requireNonNull(obj4);
                arrayList3.add(obj4);
                return Collections.unmodifiableList(arrayList3);
            }
            o.i("Null surfaceEdge");
            return null;
        }
        l E2 = E(str, str2, l2Var, kVar, kVar2);
        Matrix matrix2 = this.f3478k;
        d0 i17 = i();
        Objects.requireNonNull(i17);
        boolean i18 = i17.i();
        Size size4 = kVar2.f7235a;
        Rect rect3 = this.f3477j;
        if (rect3 != null) {
            z10 = false;
        } else {
            z10 = false;
            rect3 = new Rect(0, 0, size4.getWidth(), size4.getHeight());
        }
        d0 i19 = i();
        Objects.requireNonNull(i19);
        int h2 = h(i19, z10);
        d0 i20 = i();
        Objects.requireNonNull(i20);
        l lVar2 = new l(3, 34, kVar2, matrix2, i18, rect3, h2, -1, m(i20));
        this.f13598w = lVar2;
        Objects.requireNonNull(i());
        this.f13600y = lVar2;
        r1 F = F(this.f13598w, l2Var, kVar2);
        this.A = F;
        s1 s1Var = this.B;
        if (s1Var != null) {
            s1Var.b();
        }
        s1 s1Var2 = new s1(new c(this, str, str2, l2Var, kVar, kVar2));
        this.B = s1Var2;
        F.f7286f = s1Var2;
        l lVar3 = this.f13600y;
        d0 c11 = c();
        d0 i21 = i();
        s0.e eVar = new s0.e(a0Var, this.f13593r, this.f13594s);
        ?? obj5 = new Object();
        obj5.B = c11;
        obj5.L = i21;
        obj5.A = eVar;
        this.f13596u = obj5;
        if (this.f3477j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        int p11 = ((b1) this.f3474g).p();
        gVar.getClass();
        HashMap hashMap5 = new HashMap();
        Iterator it2 = gVar.A.iterator();
        while (it2.hasNext()) {
            v1 v1Var2 = (v1) it2.next();
            t0.b r10 = gVar.r(v1Var2, gVar.f13605e0, gVar.Y, E2, p11, z11);
            b bVar3 = gVar.f13606f0;
            Objects.requireNonNull(bVar3);
            d0 d0Var2 = gVar.Z;
            Objects.requireNonNull(d0Var2);
            l lVar4 = lVar3;
            t0.b r11 = gVar.r(v1Var2, bVar3, d0Var2, lVar4, p11, z11);
            int e10 = gVar.Y.b().e(((b1) v1Var2.f3474g).p());
            f fVar2 = (f) gVar.L.get(v1Var2);
            Objects.requireNonNull(fVar2);
            fVar2.B.f13608c = e10;
            hashMap5.put(v1Var2, new s0.a(r10, r11));
            lVar3 = lVar4;
        }
        l lVar5 = lVar3;
        v vVar = this.f13596u;
        ArrayList arrayList4 = new ArrayList(hashMap5.values());
        s0.b bVar4 = new s0.b(E2, lVar5, arrayList4);
        vVar.getClass();
        l0.f.e();
        StringBuilder sb3 = new StringBuilder("DualSurfaceProcessorNode Transform Processor = ");
        n nVar = (n) vVar.A;
        sb3.append(nVar);
        sb3.append("\n   primary input = ");
        sb3.append(E2);
        sb3.append("\n   secondary input = ");
        sb3.append(lVar5);
        aj.g.o("DualSurfaceProcessorNode", sb3.toString());
        int size5 = arrayList4.size();
        int i22 = 0;
        while (i22 < size5) {
            Object obj6 = arrayList4.get(i22);
            i22++;
            aj.g.o("SurfaceProcessorNode", "   outputConfig = " + ((s0.a) obj6));
        }
        vVar.X = bVar4;
        vVar.R = new HashMap();
        s0.b bVar5 = (s0.b) vVar.X;
        l lVar6 = bVar5.f12784a;
        l lVar7 = bVar5.f12785b;
        ArrayList arrayList5 = bVar5.f12786c;
        int size6 = arrayList5.size();
        int i23 = 0;
        while (i23 < size6) {
            Object obj7 = arrayList5.get(i23);
            int i24 = i23 + 1;
            s0.a aVar = (s0.a) obj7;
            ij.g gVar6 = (ij.g) vVar.R;
            t0.b bVar6 = aVar.f12782a;
            Rect rect4 = bVar6.f13048d;
            ArrayList arrayList6 = arrayList5;
            int i25 = bVar6.f13050f;
            int i26 = size6;
            boolean z18 = bVar6.f13051g;
            HashMap hashMap6 = hashMap5;
            Matrix matrix3 = new Matrix(lVar6.f12583b);
            RectF rectF2 = new RectF(rect4);
            Size size7 = bVar6.f13049e;
            matrix3.postConcat(k0.h.a(rectF2, k0.h.h(size7), i25, z18));
            m.h(k0.h.d(k0.h.g(k0.h.f(rect4), i25), size7));
            Rect rect5 = new Rect(0, 0, size7.getWidth(), size7.getHeight());
            q3 b11 = lVar6.f12588g.b();
            b11.f11994a = size7;
            k c12 = b11.c();
            int i27 = bVar6.f13046b;
            int i28 = bVar6.f13047c;
            int i29 = lVar6.f12590i - i25;
            if (lVar6.f12586e != z18) {
                z12 = true;
            } else {
                z12 = false;
            }
            gVar6.put(aVar, new l(i27, i28, c12, matrix3, false, rect5, i29, -1, z12));
            size6 = i26;
            hashMap5 = hashMap6;
            i23 = i24;
            arrayList5 = arrayList6;
        }
        HashMap hashMap7 = hashMap5;
        nVar.c(lVar6.c(true));
        nVar.c(lVar7.c(false));
        d0 d0Var3 = (d0) vVar.B;
        d0 d0Var4 = (d0) vVar.L;
        for (Map.Entry entry3 : ((ij.g) vVar.R).entrySet()) {
            v vVar2 = vVar;
            l lVar8 = lVar6;
            l lVar9 = lVar7;
            vVar2.j(d0Var3, d0Var4, lVar8, lVar9, entry3);
            l lVar10 = (l) entry3.getValue();
            d0 d0Var5 = d0Var4;
            d0 d0Var6 = d0Var3;
            s0.f fVar3 = new s0.f(vVar2, d0Var6, d0Var5, lVar8, lVar9, entry3, 0);
            d0Var3 = d0Var6;
            d0Var4 = d0Var5;
            lVar10.getClass();
            l0.f.e();
            lVar10.a();
            lVar10.m.add(fVar3);
            vVar = vVar2;
            lVar6 = lVar8;
            lVar7 = lVar9;
        }
        ij.g gVar7 = (ij.g) vVar.R;
        HashMap hashMap8 = new HashMap();
        for (Map.Entry entry4 : hashMap7.entrySet()) {
            hashMap8.put((v1) entry4.getKey(), (l) gVar7.get(entry4.getValue()));
        }
        gVar.x(hashMap8, gVar.u(E2, z11));
        Object[] objArr = {this.f13601z.c(), this.A.c()};
        ArrayList arrayList7 = new ArrayList(2);
        for (int i30 = 0; i30 < 2; i30++) {
            Object obj8 = objArr[i30];
            Objects.requireNonNull(obj8);
            arrayList7.add(obj8);
        }
        return Collections.unmodifiableList(arrayList7);
    }

    public final l E(String str, String str2, l2 l2Var, k kVar, k kVar2) {
        Matrix matrix = this.f3478k;
        d0 c4 = c();
        Objects.requireNonNull(c4);
        boolean i2 = c4.i();
        Size size = kVar.f7235a;
        Rect rect = this.f3477j;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        d0 c10 = c();
        Objects.requireNonNull(c10);
        int h2 = h(c10, false);
        d0 c11 = c();
        Objects.requireNonNull(c11);
        l lVar = new l(3, 34, kVar, matrix, i2, rect, h2, -1, m(c11));
        this.f13597v = lVar;
        Objects.requireNonNull(c());
        this.f13599x = lVar;
        r1 F = F(this.f13597v, l2Var, kVar);
        this.f13601z = F;
        s1 s1Var = this.B;
        if (s1Var != null) {
            s1Var.b();
        }
        s1 s1Var2 = new s1(new c(this, str, str2, l2Var, kVar, kVar2));
        this.B = s1Var2;
        F.f7286f = s1Var2;
        return this.f13599x;
    }

    public final r1 F(l lVar, l2 l2Var, k kVar) {
        r1 d4 = r1.d(l2Var, kVar.f7235a);
        d0.i1 i1Var = d4.f7282b;
        g gVar = this.f13592q;
        Iterator it = gVar.A.iterator();
        int i2 = -1;
        while (it.hasNext()) {
            int i10 = ((w1) ((v1) it.next()).f3474g.g(l2.C)).f7322g.f7276c;
            List list = w1.f7315j;
            if (list.indexOf(Integer.valueOf(i2)) < list.indexOf(Integer.valueOf(i10))) {
                i2 = i10;
            }
        }
        if (i2 != -1) {
            i1Var.A = i2;
        }
        Size size = kVar.f7235a;
        Iterator it2 = gVar.A.iterator();
        while (it2.hasNext()) {
            w1 c4 = r1.d(((v1) it2.next()).f3474g, size).c();
            p0 p0Var = c4.f7322g;
            i1Var.d(p0Var.f7277d);
            List<j0.m> list2 = c4.f7320e;
            ArrayList arrayList = d4.f7285e;
            for (j0.m mVar : list2) {
                i1Var.g(mVar);
                if (!arrayList.contains(mVar)) {
                    arrayList.add(mVar);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c4.f7319d) {
                ArrayList arrayList2 = d4.f7284d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c4.f7318c) {
                ArrayList arrayList3 = d4.f7283c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            i1Var.i(p0Var.f7275b);
        }
        lVar.getClass();
        l0.f.e();
        lVar.a();
        m.o("Consumer can only be linked once.", !lVar.f12591j);
        lVar.f12591j = true;
        d4.b(lVar.f12593l, kVar.f7237c, -1);
        i1Var.g(gVar.f13602b0);
        r0 r0Var = kVar.f7240f;
        if (r0Var != null) {
            i1Var.i(r0Var);
        }
        d4.f7288h = kVar.f7238d;
        a(d4, kVar);
        return d4;
    }

    @Override // d0.v1
    public final l2 f(boolean z10, o2 o2Var) {
        e eVar = this.f13591p;
        r0 a10 = o2Var.a(eVar.r(), 1);
        if (z10) {
            a10 = r0.m(a10, eVar.A);
        }
        if (a10 == null) {
            return null;
        }
        return l(a10).d();
    }

    @Override // d0.v1
    public final Set j(b0 b0Var) {
        HashSet hashSet = this.f13592q.A;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set j2 = ((v1) it.next()).j(b0Var);
            if (j2 != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(j2);
                } else {
                    hashSet2.retainAll(j2);
                }
            }
        }
        return hashSet2;
    }

    @Override // d0.v1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // d0.v1
    public final c0.f l(r0 r0Var) {
        return new c0.f(g1.c(r0Var), 6);
    }

    @Override // d0.v1
    public final void q() {
        g gVar = this.f13592q;
        Iterator it = gVar.A.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            f fVar = (f) gVar.L.get(v1Var);
            Objects.requireNonNull(fVar);
            v1Var.b(fVar, null, null, v1Var.f(true, gVar.X));
        }
    }

    @Override // d0.v1
    public final void r() {
        Iterator it = this.f13592q.A.iterator();
        while (it.hasNext()) {
            ((v1) it.next()).r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
        if (r15 != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0210  */
    @Override // d0.v1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.l2 s(j0.b0 r19, c0.f r20) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v0.d.s(j0.b0, c0.f):j0.l2");
    }

    @Override // d0.v1
    public final void t() {
        Iterator it = this.f13592q.A.iterator();
        while (it.hasNext()) {
            ((v1) it.next()).t();
        }
    }

    @Override // d0.v1
    public final void u() {
        Iterator it = this.f13592q.A.iterator();
        while (it.hasNext()) {
            ((v1) it.next()).u();
        }
    }

    @Override // d0.v1
    public final k v(r0 r0Var) {
        this.f13601z.a(r0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.f13601z.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        q3 b10 = this.f3475h.b();
        b10.f11999f = r0Var;
        return b10.c();
    }

    @Override // d0.v1
    public final k w(k kVar, k kVar2) {
        String d4;
        aj.g.o("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + kVar + ", secondaryStreamSpec " + kVar2);
        String e6 = e();
        if (i() == null) {
            d4 = null;
        } else {
            d4 = i().k().d();
        }
        B(D(e6, d4, this.f3474g, kVar, kVar2));
        this.f3470c = t1.ACTIVE;
        p();
        return kVar;
    }

    @Override // d0.v1
    public final void x() {
        C();
        g gVar = this.f13592q;
        Iterator it = gVar.A.iterator();
        while (it.hasNext()) {
            v1 v1Var = (v1) it.next();
            f fVar = (f) gVar.L.get(v1Var);
            Objects.requireNonNull(fVar);
            v1Var.A(fVar);
        }
    }
}
