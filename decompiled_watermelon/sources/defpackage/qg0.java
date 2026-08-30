package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.recyclerview.widget.RecyclerView;
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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qg0  reason: default package */
/* loaded from: classes.dex */
public final class qg0 implements hb0 {
    public final w9 A;
    public final w9 B;
    public final e57 L;
    public final pd0 R;
    public final qc0 Z;
    public final fc0 e0;
    public f47 i0;
    public zf6 j0;
    public final q03 k0;
    public final q03 l0;
    public final ci3 n0;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public List c0 = Collections.EMPTY_LIST;
    public Range d0 = jx.h;
    public final Object f0 = new Object();
    public boolean g0 = true;
    public cw0 h0 = null;
    public final ci3 m0 = new ci3(24);

    public qg0(vd0 vd0Var, vd0 vd0Var2, v9 v9Var, v9 v9Var2, q03 q03Var, q03 q03Var2, qc0 qc0Var, ci3 ci3Var, e57 e57Var) {
        this.e0 = v9Var.L;
        this.A = new w9(vd0Var, v9Var);
        if (vd0Var2 != null && v9Var2 != null) {
            this.B = new w9(vd0Var2, v9Var2);
        } else {
            this.B = null;
        }
        this.k0 = q03Var;
        this.l0 = q03Var2;
        this.Z = qc0Var;
        this.L = e57Var;
        this.R = dk7.t(v9Var, v9Var2);
        this.n0 = ci3Var;
    }

    public static void D(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            f47 f47Var = (f47) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                f47Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            f47Var.g = hashSet;
        }
    }

    public static ArrayList E(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((f47) obj).getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw b31.m(it);
            }
        }
        return arrayList2;
    }

    public static HashMap o(LinkedHashSet linkedHashSet, qb5 qb5Var) {
        LinkedHashSet linkedHashSet2;
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            hashMap.put(f47Var, f47Var.g);
            HashSet hashSet = null;
            if (qb5Var != null) {
                linkedHashSet2 = qb5Var.b;
            } else {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            f47Var.g = hashSet;
        }
        return hashMap;
    }

    public static Matrix t(Rect rect, Size size) {
        boolean z;
        if (rect.width() > 0 && rect.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        nl2.y("Cannot compute viewport crop rects zero sized sensor rect.", z);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(RecyclerView.A1, RecyclerView.A1, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static zv2 u() {
        bb0 bb0Var = new bb0(4);
        uw uwVar = an6.z;
        x14 x14Var = bb0Var.B;
        x14Var.r(uwVar, "ImageCapture-Extra");
        Integer num = (Integer) x14Var.d(aw2.R, null);
        if (num != null) {
            x14Var.r(fw2.l, num);
        } else {
            xv2 xv2Var = zv2.z;
            uw uwVar2 = aw2.X;
            if (Objects.equals(x14Var.d(uwVar2, null), 2)) {
                x14Var.r(fw2.l, 32);
            } else if (Objects.equals(x14Var.d(uwVar2, null), 3)) {
                x14Var.r(fw2.l, 32);
                x14Var.r(fw2.m, 256);
            } else if (Objects.equals(x14Var.d(uwVar2, null), 1)) {
                x14Var.r(fw2.l, 4101);
                x14Var.r(fw2.n, sm1.c);
            } else {
                x14Var.r(fw2.l, 256);
            }
        }
        aw2 aw2Var = new aw2(ef4.b(x14Var));
        jw2.H(aw2Var);
        zv2 zv2Var = new zv2(aw2Var);
        Size size = (Size) x14Var.d(jw2.s, null);
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        nl2.C((Executor) x14Var.d(q53.y, iq2.s()), "The IO executor can't be null");
        uw uwVar3 = aw2.L;
        if (x14Var.A.containsKey(uwVar3)) {
            Integer num2 = (Integer) x14Var.g(uwVar3);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3 && x14Var.d(aw2.d0, null) == null) {
                    i.i("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            } else {
                f81.x(num2, "The flash mode is not allowed to set: ");
                return null;
            }
        }
        return zv2Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [f47, nt4] */
    public static nt4 v() {
        bb0 bb0Var = new bb0(5);
        uw uwVar = an6.z;
        x14 x14Var = bb0Var.B;
        x14Var.r(uwVar, "Preview-Extra");
        ot4 ot4Var = new ot4(ef4.b(x14Var));
        jw2.H(ot4Var);
        ?? f47Var = new f47(ot4Var);
        np2 np2Var = nt4.y;
        f47Var.r = np2Var;
        i iVar = new i(9);
        nk2.s();
        f47Var.q = iVar;
        f47Var.r = np2Var;
        if (f47Var.c() != null) {
            f47Var.H((ot4) f47Var.h, f47Var.i);
            f47Var.r();
        }
        f47Var.q();
        return f47Var;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [f47, nt4] */
    /* JADX WARN: Type inference failed for: r7v3, types: [lg0, java.lang.Object] */
    public static HashMap y(ArrayList arrayList, e57 e57Var, e57 e57Var2, Range range) {
        b57 g;
        x14 f;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            f47 f47Var = (f47) obj;
            if (f47Var instanceof zf6) {
                zf6 zf6Var = (zf6) f47Var;
                ot4 ot4Var = new ot4(ef4.b(new bb0(5).B));
                jw2.H(ot4Var);
                ?? f47Var2 = new f47(ot4Var);
                f47Var2.r = nt4.y;
                b57 g2 = f47Var2.g(false, e57Var);
                if (g2 == null) {
                    g = null;
                } else {
                    x14 j = x14.j(g2);
                    j.s(an6.C);
                    g = ((bb0) zf6Var.m(j)).d();
                }
            } else {
                g = f47Var.g(false, e57Var);
            }
            b57 g3 = f47Var.g(true, e57Var2);
            if (g3 != null) {
                f = x14.j(g3);
            } else {
                f = x14.f();
            }
            f.r(b57.K, 0);
            if (!jx.h.equals(range)) {
                f.m(b57.M, bw0.HIGH_PRIORITY_REQUIRED, range);
                f.r(b57.N, Boolean.TRUE);
            }
            b57 d = f47Var.m(f).d();
            ?? obj2 = new Object();
            obj2.a = g;
            obj2.b = d;
            hashMap.put(f47Var, obj2);
        }
        return hashMap;
    }

    public final List A() {
        ArrayList arrayList;
        synchronized (this.f0) {
            arrayList = new ArrayList(this.X);
        }
        return arrayList;
    }

    public final void B() {
        synchronized (this.f0) {
            this.e0.p();
        }
    }

    public final void C(ArrayList arrayList) {
        synchronized (this.f0) {
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((f47) obj).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
            linkedHashSet.removeAll(arrayList);
            if (this.B != null) {
                z = true;
            }
            m(s(linkedHashSet, z));
        }
    }

    @Override // defpackage.hb0
    public final qd0 b() {
        throw null;
    }

    public final void d(Collection collection, qb5 qb5Var) {
        boolean z;
        ve2.v("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + qb5Var);
        synchronized (this.f0) {
            try {
                w9 w9Var = this.A;
                fc0 fc0Var = this.e0;
                w9Var.r(fc0Var);
                w9 w9Var2 = this.B;
                if (w9Var2 != null) {
                    w9Var2.r(fc0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
                linkedHashSet.addAll(collection);
                HashMap o = o(linkedHashSet, qb5Var);
                try {
                    if (this.B != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m(s(linkedHashSet, z));
                } catch (IllegalArgumentException e) {
                    D(o);
                    throw new Exception(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(v80 v80Var) {
        int i;
        Map map = v80Var.i.a;
        ArrayList arrayList = v80Var.b;
        synchronized (this.f0) {
            try {
                int size = arrayList.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    f47 f47Var = (f47) obj;
                    Rect n = this.A.B.A.n();
                    jx jxVar = (jx) map.get(f47Var);
                    jxVar.getClass();
                    f47Var.B(t(n, jxVar.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.c0;
        ArrayList arrayList2 = v80Var.b;
        LinkedHashSet linkedHashSet = v80Var.a;
        ArrayList E = E(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList E2 = E(arrayList3, E);
        if (!E2.isEmpty()) {
            ve2.c0("CameraUseCaseAdapter", "Unused effects: " + E2);
        }
        ArrayList arrayList4 = v80Var.e;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            ((f47) obj2).D(this.A);
        }
        this.A.h(v80Var.e);
        if (this.B != null) {
            ArrayList arrayList5 = v80Var.e;
            int size3 = arrayList5.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                w9 w9Var = this.B;
                Objects.requireNonNull(w9Var);
                ((f47) obj3).D(w9Var);
            }
            w9 w9Var2 = this.B;
            Objects.requireNonNull(w9Var2);
            w9Var2.h(v80Var.e);
        }
        if (v80Var.e.isEmpty()) {
            ArrayList arrayList6 = v80Var.d;
            int size4 = arrayList6.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj4 = arrayList6.get(i5);
                i5++;
                f47 f47Var2 = (f47) obj4;
                Map map2 = v80Var.i.a;
                if (map2.containsKey(f47Var2)) {
                    jx jxVar2 = (jx) map2.get(f47Var2);
                    Objects.requireNonNull(jxVar2);
                    cw0 cw0Var = jxVar2.f;
                    if (cw0Var != null) {
                        d16 d16Var = f47Var2.o;
                        ef4 ef4Var = d16Var.g.b;
                        Objects.requireNonNull(cw0Var);
                        if (cw0Var.e().size() == d16Var.g.b.e().size()) {
                            for (uw uwVar : cw0Var.e()) {
                                if (ef4Var.A.containsKey(uwVar)) {
                                    if (!Objects.equals(ef4Var.g(uwVar), cw0Var.g(uwVar))) {
                                    }
                                }
                            }
                        }
                        f47Var2.i = f47Var2.y(cw0Var);
                        if (this.g0) {
                            this.A.q(f47Var2);
                            w9 w9Var3 = this.B;
                            if (w9Var3 != null) {
                                w9Var3.q(f47Var2);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = v80Var.c;
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj5 = arrayList7.get(i6);
            i6++;
            f47 f47Var3 = (f47) obj5;
            lg0 lg0Var = (lg0) v80Var.h.get(f47Var3);
            Objects.requireNonNull(lg0Var);
            w9 w9Var4 = this.B;
            w9 w9Var5 = this.A;
            b57 b57Var = lg0Var.a;
            if (w9Var4 != null) {
                f47Var3.b(w9Var5, w9Var4, b57Var, lg0Var.b);
                jx jxVar3 = (jx) v80Var.i.a.get(f47Var3);
                jxVar3.getClass();
                bg6 bg6Var = v80Var.j;
                bg6Var.getClass();
                f47Var3.F(jxVar3, (jx) bg6Var.a.get(f47Var3));
            } else {
                f47Var3.b(w9Var5, null, b57Var, lg0Var.b);
                jx jxVar4 = (jx) v80Var.i.a.get(f47Var3);
                jxVar4.getClass();
                f47Var3.F(jxVar4, null);
            }
        }
        if (this.g0) {
            this.A.f(v80Var.c);
            w9 w9Var6 = this.B;
            if (w9Var6 != null) {
                w9Var6.f(v80Var.c);
            }
        }
        ArrayList arrayList8 = v80Var.c;
        int size6 = arrayList8.size();
        while (i < size6) {
            Object obj6 = arrayList8.get(i);
            i++;
            ((f47) obj6).s();
        }
        this.X.clear();
        this.X.addAll(v80Var.a);
        this.Y.clear();
        this.Y.addAll(v80Var.b);
        this.i0 = v80Var.g;
        this.j0 = v80Var.f;
    }

    public final void q() {
        synchronized (this.f0) {
            try {
                if (!this.g0) {
                    if (!this.Y.isEmpty()) {
                        this.A.r(this.e0);
                        w9 w9Var = this.B;
                        if (w9Var != null) {
                            w9Var.r(this.e0);
                        }
                    }
                    this.A.f(this.Y);
                    w9 w9Var2 = this.B;
                    if (w9Var2 != null) {
                        w9Var2.f(this.Y);
                    }
                    synchronized (this.f0) {
                        cw0 cw0Var = this.h0;
                        if (cw0Var != null) {
                            this.A.L.d(cw0Var);
                        }
                    }
                    ArrayList arrayList = this.Y;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((f47) obj).s();
                    }
                    this.g0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw new java.lang.IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015d, code lost:
        if (r3 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0163, code lost:
        return s(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.v80 s(java.util.LinkedHashSet r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qg0.s(java.util.LinkedHashSet, boolean):v80");
    }

    public final void w() {
        synchronized (this.f0) {
            try {
                if (this.g0) {
                    this.A.h(new ArrayList(this.Y));
                    w9 w9Var = this.B;
                    if (w9Var != null) {
                        w9Var.h(new ArrayList(this.Y));
                    }
                    synchronized (this.f0) {
                        u9 u9Var = this.A.L;
                        this.h0 = u9Var.b.c();
                        u9Var.e();
                    }
                    this.g0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int x() {
        int i;
        synchronized (this.f0) {
            try {
                qc0 qc0Var = this.Z;
                synchronized (qc0Var.b) {
                    i = qc0Var.e;
                }
                if (i == 2) {
                    return 1;
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet z(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.f0) {
            Iterator it = this.c0.iterator();
            if (!it.hasNext()) {
                if (z) {
                    i = 3;
                } else {
                    i = 0;
                }
            } else if (it.next() == null) {
                throw null;
            } else {
                throw new ClassCastException();
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            f47 f47Var = (f47) it2.next();
            nl2.y("Only support one level of sharing for now.", !(f47Var instanceof zf6));
            Iterator it3 = f47Var.l().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i & intValue) == intValue) {
                        hashSet.add(f47Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }
}
