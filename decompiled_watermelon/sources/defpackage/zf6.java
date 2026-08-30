package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zf6  reason: default package */
/* loaded from: classes.dex */
public final class zf6 extends f47 {
    public x06 A;
    public x06 B;
    public y06 C;
    public final ag6 q;
    public final kc7 r;
    public final q03 s;
    public final q03 t;
    public n85 u;
    public r9 v;
    public wj6 w;
    public wj6 x;
    public wj6 y;
    public wj6 z;

    public zf6(vd0 vd0Var, vd0 vd0Var2, q03 q03Var, q03 q03Var2, HashSet hashSet, e57 e57Var) {
        super(K(hashSet));
        HashSet hashSet2;
        this.q = K(hashSet);
        this.s = q03Var;
        this.t = q03Var2;
        this.r = new kc7(vd0Var, vd0Var2, hashSet, e57Var, new vd6(1));
        HashSet hashSet3 = ((f47) hashSet.iterator().next()).g;
        if (hashSet3 != null) {
            hashSet2 = new HashSet(hashSet3);
        } else {
            hashSet2 = null;
        }
        this.g = hashSet2;
    }

    public static ag6 K(HashSet hashSet) {
        x14 f = x14.f();
        new bb0(f, 6);
        f.r(fw2.l, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            if (f47Var.h.a(b57.S)) {
                arrayList.add(f47Var.h.n());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        f.r(ag6.B, arrayList);
        f.r(jw2.r, 2);
        f.r(b57.a0, cg6.PREVIEW_VIDEO_STILL);
        return new ag6(ef4.b(f));
    }

    @Override // defpackage.f47
    public final void A() {
        G();
        kc7 kc7Var = this.r;
        Iterator it = kc7Var.A.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            jc7 jc7Var = (jc7) kc7Var.L.get(f47Var);
            Objects.requireNonNull(jc7Var);
            f47Var.D(jc7Var);
        }
    }

    public final void G() {
        y06 y06Var = this.C;
        if (y06Var != null) {
            y06Var.b();
            this.C = null;
        }
        wj6 wj6Var = this.w;
        if (wj6Var != null) {
            wj6Var.b();
            this.w = null;
        }
        wj6 wj6Var2 = this.x;
        if (wj6Var2 != null) {
            wj6Var2.b();
            this.x = null;
        }
        wj6 wj6Var3 = this.y;
        if (wj6Var3 != null) {
            wj6Var3.b();
            this.y = null;
        }
        wj6 wj6Var4 = this.z;
        if (wj6Var4 != null) {
            wj6Var4.b();
            this.z = null;
        }
        n85 n85Var = this.u;
        if (n85Var != null) {
            ((sb1) n85Var.B).a();
            nk2.V(new tm3(10, n85Var));
            this.u = null;
        }
        r9 r9Var = this.v;
        if (r9Var != null) {
            ((dk6) r9Var.a).a();
            nk2.V(new m0(21, r9Var));
            this.v = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [r9, java.lang.Object] */
    public final List H(String str, String str2, b57 b57Var, jx jxVar, jx jxVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        sm1 sm1Var = jxVar.c;
        nk2.s();
        kc7 kc7Var = this.r;
        if (jxVar2 == null) {
            wj6 I = I(str, str2, b57Var, jxVar, null);
            vd0 d = d();
            Objects.requireNonNull(d);
            n85 n85Var = new n85(d, new sb1(sm1Var));
            this.u = n85Var;
            if (this.k != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int I2 = ((jw2) this.h).I(0);
            kc7Var.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = kc7Var.A.iterator();
            while (it.hasNext()) {
                f47 f47Var = (f47) it.next();
                ob5 ob5Var = kc7Var.f0;
                vd0 vd0Var = kc7Var.Y;
                kc7 kc7Var2 = kc7Var;
                boolean z6 = z4;
                fx s = kc7Var2.s(f47Var, ob5Var, vd0Var, I, I2, z6);
                int g = kc7Var2.Y.b().g(((jw2) f47Var.h).I(0));
                jc7 jc7Var = (jc7) kc7Var2.L.get(f47Var);
                Objects.requireNonNull(jc7Var);
                jc7Var.B.L = g;
                hashMap.put(f47Var, s);
                kc7Var = kc7Var2;
                z4 = z6;
            }
            kc7 kc7Var3 = kc7Var;
            boolean z7 = z4;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (I != null) {
                sb1 sb1Var = (sb1) n85Var.B;
                nk2.s();
                ve2.v("SurfaceProcessorNode", "[StreamSharing] SurfaceProcessorNode Transform (Processor=" + sb1Var + "\n   inputEdge = " + I);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ve2.v("SurfaceProcessorNode", "   outputConfig = " + ((fx) obj));
                }
                n85Var.R = new HashMap();
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    int i3 = i2 + 1;
                    fx fxVar = (fx) obj2;
                    dq0 dq0Var = (dq0) n85Var.R;
                    Rect rect = fxVar.d;
                    int i4 = fxVar.f;
                    boolean z8 = fxVar.g;
                    ArrayList arrayList2 = arrayList;
                    Matrix matrix = new Matrix(I.b);
                    RectF rectF = new RectF(rect);
                    int i5 = size2;
                    Size size3 = fxVar.e;
                    matrix.postConcat(tw6.a(rectF, tw6.h(size3), i4, z8));
                    nl2.z(tw6.d(tw6.g(i4, tw6.f(rect)), size3));
                    HashMap hashMap2 = hashMap;
                    Rect rect2 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
                    cw6 b = I.g.b();
                    b.a = size3;
                    jx a = b.a();
                    int i6 = fxVar.b;
                    int i7 = fxVar.c;
                    int i8 = I.i - i4;
                    if (I.e != z8) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    dq0Var.put(fxVar, new wj6(i6, i7, a, matrix, false, rect2, i8, -1, z5));
                    arrayList = arrayList2;
                    size2 = i5;
                    i2 = i3;
                    hashMap = hashMap2;
                }
                HashMap hashMap3 = hashMap;
                sb1Var.c(I.c(true));
                for (Map.Entry entry : ((dq0) n85Var.R).entrySet()) {
                    n85Var.b(I, entry);
                    wj6 wj6Var = (wj6) entry.getValue();
                    u uVar = new u(n85Var, I, entry, 18);
                    wj6Var.getClass();
                    nk2.s();
                    wj6Var.a();
                    wj6Var.m.add(uVar);
                }
                I.o.add(new vf2(2, (dq0) n85Var.R));
                dq0 dq0Var2 = (dq0) n85Var.R;
                HashMap hashMap4 = new HashMap();
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    hashMap4.put((f47) entry2.getKey(), (wj6) dq0Var2.get(entry2.getValue()));
                }
                kc7Var3.y(hashMap4, kc7Var3.v(I, z7));
                ArrayList arrayList3 = new ArrayList(1);
                Object obj3 = new Object[]{this.A.c()}[0];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
                return Collections.unmodifiableList(arrayList3);
            }
            c44.i("Null surfaceEdge");
            return null;
        }
        wj6 I3 = I(str, str2, b57Var, jxVar, jxVar2);
        Matrix matrix2 = this.l;
        vd0 j = j();
        Objects.requireNonNull(j);
        boolean j2 = j.j();
        Size size4 = jxVar2.a;
        Rect rect3 = this.k;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size4.getWidth(), size4.getHeight());
        }
        vd0 j3 = j();
        Objects.requireNonNull(j3);
        int i9 = i(j3, z);
        vd0 j4 = j();
        Objects.requireNonNull(j4);
        kc7 kc7Var4 = kc7Var;
        wj6 wj6Var2 = new wj6(3, 34, jxVar2, matrix2, j2, rect3, i9, -1, o(j4));
        this.x = wj6Var2;
        Objects.requireNonNull(j());
        this.z = wj6Var2;
        x06 J = J(this.x, b57Var, jxVar2);
        this.B = J;
        y06 y06Var = this.C;
        if (y06Var != null) {
            y06Var.b();
        }
        y06 y06Var2 = new y06(new yf6(this, str, str2, b57Var, jxVar, jxVar2));
        this.C = y06Var2;
        J.f = y06Var2;
        wj6 wj6Var3 = this.z;
        vd0 d2 = d();
        vd0 j5 = j();
        fm1 fm1Var = new fm1(sm1Var, this.s, this.t);
        ?? obj4 = new Object();
        obj4.b = d2;
        obj4.c = j5;
        obj4.a = fm1Var;
        this.v = obj4;
        if (this.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int I4 = ((jw2) this.h).I(0);
        kc7Var4.getClass();
        HashMap hashMap5 = new HashMap();
        Iterator it2 = kc7Var4.A.iterator();
        while (it2.hasNext()) {
            f47 f47Var2 = (f47) it2.next();
            kc7 kc7Var5 = kc7Var4;
            fx s2 = kc7Var5.s(f47Var2, kc7Var4.f0, kc7Var4.Y, I3, I4, z2);
            ob5 ob5Var2 = kc7Var5.g0;
            Objects.requireNonNull(ob5Var2);
            vd0 vd0Var2 = kc7Var5.Z;
            Objects.requireNonNull(vd0Var2);
            wj6 wj6Var4 = wj6Var3;
            fx s3 = kc7Var5.s(f47Var2, ob5Var2, vd0Var2, wj6Var4, I4, z2);
            int g2 = kc7Var5.Y.b().g(((jw2) f47Var2.h).I(0));
            jc7 jc7Var2 = (jc7) kc7Var5.L.get(f47Var2);
            Objects.requireNonNull(jc7Var2);
            jc7Var2.B.L = g2;
            hashMap5.put(f47Var2, new ww(s2, s3));
            kc7Var4 = kc7Var5;
            wj6Var3 = wj6Var4;
        }
        wj6 wj6Var5 = wj6Var3;
        kc7 kc7Var6 = kc7Var4;
        r9 r9Var = this.v;
        ArrayList arrayList4 = new ArrayList(hashMap5.values());
        xw xwVar = new xw(I3, wj6Var5, arrayList4);
        r9Var.getClass();
        nk2.s();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        dk6 dk6Var = (dk6) r9Var.a;
        sb.append(dk6Var);
        sb.append("\n   primary input = ");
        sb.append(I3);
        sb.append("\n   secondary input = ");
        sb.append(wj6Var5);
        ve2.v("DualSurfaceProcessorNode", sb.toString());
        int size5 = arrayList4.size();
        int i10 = 0;
        while (i10 < size5) {
            Object obj5 = arrayList4.get(i10);
            i10++;
            ve2.v("SurfaceProcessorNode", "   outputConfig = " + ((ww) obj5));
        }
        r9Var.e = xwVar;
        r9Var.d = new HashMap();
        xw xwVar2 = (xw) r9Var.e;
        wj6 wj6Var6 = xwVar2.a;
        wj6 wj6Var7 = xwVar2.b;
        ArrayList arrayList5 = xwVar2.c;
        int size6 = arrayList5.size();
        int i11 = 0;
        while (i11 < size6) {
            Object obj6 = arrayList5.get(i11);
            int i12 = i11 + 1;
            ww wwVar = (ww) obj6;
            dq0 dq0Var3 = (dq0) r9Var.d;
            fx fxVar2 = wwVar.a;
            Rect rect4 = fxVar2.d;
            ArrayList arrayList6 = arrayList5;
            int i13 = fxVar2.f;
            int i14 = size6;
            boolean z9 = fxVar2.g;
            HashMap hashMap6 = hashMap5;
            Matrix matrix3 = new Matrix(wj6Var6.b);
            RectF rectF2 = new RectF(rect4);
            Size size7 = fxVar2.e;
            matrix3.postConcat(tw6.a(rectF2, tw6.h(size7), i13, z9));
            nl2.z(tw6.d(tw6.g(i13, tw6.f(rect4)), size7));
            Rect rect5 = new Rect(0, 0, size7.getWidth(), size7.getHeight());
            cw6 b2 = wj6Var6.g.b();
            b2.a = size7;
            jx a2 = b2.a();
            int i15 = fxVar2.b;
            int i16 = fxVar2.c;
            int i17 = wj6Var6.i - i13;
            if (wj6Var6.e != z9) {
                z3 = true;
            } else {
                z3 = false;
            }
            dq0Var3.put(wwVar, new wj6(i15, i16, a2, matrix3, false, rect5, i17, -1, z3));
            size6 = i14;
            hashMap5 = hashMap6;
            i11 = i12;
            arrayList5 = arrayList6;
        }
        HashMap hashMap7 = hashMap5;
        dk6Var.c(wj6Var6.c(true));
        dk6Var.c(wj6Var7.c(false));
        vd0 vd0Var3 = (vd0) r9Var.b;
        vd0 vd0Var4 = (vd0) r9Var.c;
        for (Map.Entry entry3 : ((dq0) r9Var.d).entrySet()) {
            r9 r9Var2 = r9Var;
            wj6 wj6Var8 = wj6Var6;
            wj6 wj6Var9 = wj6Var7;
            r9Var2.r(vd0Var3, vd0Var4, wj6Var8, wj6Var9, entry3);
            wj6 wj6Var10 = (wj6) entry3.getValue();
            vd0 vd0Var5 = vd0Var4;
            vd0 vd0Var6 = vd0Var3;
            x10 x10Var = new x10(r9Var2, vd0Var6, vd0Var5, wj6Var8, wj6Var9, entry3, 1);
            vd0Var3 = vd0Var6;
            vd0Var4 = vd0Var5;
            wj6Var10.getClass();
            nk2.s();
            wj6Var10.a();
            wj6Var10.m.add(x10Var);
            r9Var = r9Var2;
            wj6Var6 = wj6Var8;
            wj6Var7 = wj6Var9;
        }
        dq0 dq0Var4 = (dq0) r9Var.d;
        HashMap hashMap8 = new HashMap();
        for (Map.Entry entry4 : hashMap7.entrySet()) {
            hashMap8.put((f47) entry4.getKey(), (wj6) dq0Var4.get(entry4.getValue()));
        }
        kc7Var6.y(hashMap8, kc7Var6.v(I3, z2));
        Object[] objArr = {this.A.c(), this.B.c()};
        ArrayList arrayList7 = new ArrayList(2);
        for (int i18 = 0; i18 < 2; i18++) {
            Object obj7 = objArr[i18];
            Objects.requireNonNull(obj7);
            arrayList7.add(obj7);
        }
        return Collections.unmodifiableList(arrayList7);
    }

    public final wj6 I(String str, String str2, b57 b57Var, jx jxVar, jx jxVar2) {
        Matrix matrix = this.l;
        vd0 d = d();
        Objects.requireNonNull(d);
        boolean j = d.j();
        Size size = jxVar.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        vd0 d2 = d();
        Objects.requireNonNull(d2);
        int i = i(d2, false);
        vd0 d3 = d();
        Objects.requireNonNull(d3);
        wj6 wj6Var = new wj6(3, 34, jxVar, matrix, j, rect, i, -1, o(d3));
        this.w = wj6Var;
        Objects.requireNonNull(d());
        this.y = wj6Var;
        x06 J = J(this.w, b57Var, jxVar);
        this.A = J;
        y06 y06Var = this.C;
        if (y06Var != null) {
            y06Var.b();
        }
        y06 y06Var2 = new y06(new yf6(this, str, str2, b57Var, jxVar, jxVar2));
        this.C = y06Var2;
        J.f = y06Var2;
        return this.y;
    }

    public final x06 J(wj6 wj6Var, b57 b57Var, jx jxVar) {
        x06 d = x06.d(b57Var, jxVar.a);
        vh0 vh0Var = d.b;
        kc7 kc7Var = this.r;
        Iterator it = kc7Var.A.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((d16) ((f47) it.next()).h.g(b57.F)).g.c;
            List list = d16.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            vh0Var.c = i;
        }
        Size size = jxVar.a;
        Iterator it2 = kc7Var.A.iterator();
        while (it2.hasNext()) {
            d16 c = x06.d(((f47) it2.next()).h, size).c();
            wh0 wh0Var = c.g;
            vh0Var.b(wh0Var.d);
            List<sb0> list2 = c.e;
            ArrayList arrayList = d.e;
            for (sb0 sb0Var : list2) {
                vh0Var.c(sb0Var);
                if (!arrayList.contains(sb0Var)) {
                    arrayList.add(sb0Var);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c.d) {
                ArrayList arrayList2 = d.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c.c) {
                ArrayList arrayList3 = d.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            vh0Var.d(wh0Var.b);
        }
        wj6Var.getClass();
        nk2.s();
        wj6Var.a();
        nl2.D("Consumer can only be linked once.", !wj6Var.j);
        wj6Var.j = true;
        d.b(wj6Var.l, jxVar.c, -1);
        vh0Var.c(kc7Var.c0);
        cw0 cw0Var = jxVar.f;
        if (cw0Var != null) {
            vh0Var.d(cw0Var);
        }
        d.h = jxVar.d;
        a(d, jxVar);
        return d;
    }

    @Override // defpackage.f47
    public final b57 g(boolean z, e57 e57Var) {
        ag6 ag6Var = this.q;
        cw0 a = e57Var.a(ag6Var.n(), 1);
        if (z) {
            a = cw0.J(a, ag6Var.A);
        }
        if (a == null) {
            return null;
        }
        return ((bb0) m(a)).d();
    }

    @Override // defpackage.f47
    public final Set k(td0 td0Var) {
        HashSet hashSet = this.r.A;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set k = ((f47) it.next()).k(td0Var);
            if (k != null) {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet(k);
                } else {
                    hashSet2.retainAll(k);
                }
            }
        }
        return hashSet2;
    }

    @Override // defpackage.f47
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.f47
    public final a57 m(cw0 cw0Var) {
        return new bb0(x14.j(cw0Var), 6);
    }

    @Override // defpackage.f47
    public final void t() {
        kc7 kc7Var = this.r;
        Iterator it = kc7Var.A.iterator();
        while (it.hasNext()) {
            f47 f47Var = (f47) it.next();
            jc7 jc7Var = (jc7) kc7Var.L.get(f47Var);
            Objects.requireNonNull(jc7Var);
            f47Var.b(jc7Var, null, null, f47Var.g(true, kc7Var.X));
        }
    }

    @Override // defpackage.f47
    public final void u() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((f47) it.next()).u();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010f, code lost:
        r17 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0111, code lost:
        if (r14 != false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01ff, code lost:
        if (r10 == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0219  */
    @Override // defpackage.f47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.b57 v(defpackage.td0 r18, defpackage.a57 r19) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zf6.v(td0, a57):b57");
    }

    @Override // defpackage.f47
    public final void w() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((f47) it.next()).w();
        }
    }

    @Override // defpackage.f47
    public final void x() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((f47) it.next()).x();
        }
    }

    @Override // defpackage.f47
    public final jx y(cw0 cw0Var) {
        this.A.a(cw0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.A.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        cw6 b = this.i.b();
        b.f = cw0Var;
        return b.a();
    }

    @Override // defpackage.f47
    public final jx z(jx jxVar, jx jxVar2) {
        String f;
        ve2.v("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + jxVar + ", secondaryStreamSpec " + jxVar2);
        String f2 = f();
        if (j() == null) {
            f = null;
        } else {
            f = j().l().f();
        }
        E(H(f2, f, this.h, jxVar, jxVar2));
        q();
        return jxVar;
    }
}
