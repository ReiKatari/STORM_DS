package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr6  reason: default package */
/* loaded from: classes.dex */
public final class pr6 extends di7 {
    public lc6 A;
    public lc6 B;
    public mc6 C;
    public final qr6 q;
    public final mq7 r;
    public final u63 s;
    public final u63 t;
    public m44 u;
    public s9 v;
    public qv6 w;
    public qv6 x;
    public qv6 y;
    public qv6 z;

    public pr6(eg0 eg0Var, eg0 eg0Var2, u63 u63Var, u63 u63Var2, HashSet hashSet, cj7 cj7Var) {
        super(K(hashSet));
        HashSet hashSet2;
        this.q = K(hashSet);
        this.s = u63Var;
        this.t = u63Var2;
        this.r = new mq7(eg0Var, eg0Var2, hashSet, cj7Var, new fa6(3));
        HashSet hashSet3 = ((di7) hashSet.iterator().next()).g;
        if (hashSet3 != null) {
            hashSet2 = new HashSet(hashSet3);
        } else {
            hashSet2 = null;
        }
        this.g = hashSet2;
    }

    public static qr6 K(HashSet hashSet) {
        da4 d = da4.d();
        new jd0(d, 6);
        d.m(j23.l, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            if (di7Var.h.i(zi7.T)) {
                arrayList.add(di7Var.h.x());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        d.m(qr6.B, arrayList);
        d.m(n23.r, 2);
        d.m(zi7.b0, tr6.PREVIEW_VIDEO_STILL);
        return new qr6(go4.a(d));
    }

    @Override // defpackage.di7
    public final void A() {
        G();
        mq7 mq7Var = this.r;
        Iterator it = mq7Var.A.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            lq7 lq7Var = (lq7) mq7Var.L.get(di7Var);
            Objects.requireNonNull(lq7Var);
            di7Var.D(lq7Var);
        }
    }

    public final void G() {
        mc6 mc6Var = this.C;
        if (mc6Var != null) {
            mc6Var.b();
            this.C = null;
        }
        qv6 qv6Var = this.w;
        if (qv6Var != null) {
            qv6Var.b();
            this.w = null;
        }
        qv6 qv6Var2 = this.x;
        if (qv6Var2 != null) {
            qv6Var2.b();
            this.x = null;
        }
        qv6 qv6Var3 = this.y;
        if (qv6Var3 != null) {
            qv6Var3.b();
            this.y = null;
        }
        qv6 qv6Var4 = this.z;
        if (qv6Var4 != null) {
            qv6Var4.b();
            this.z = null;
        }
        m44 m44Var = this.u;
        if (m44Var != null) {
            ((qf1) m44Var.B).release();
            nj2.D(new rk3(m44Var, 12));
            this.u = null;
        }
        s9 s9Var = this.v;
        if (s9Var != null) {
            ((xv6) s9Var.a).release();
            nj2.D(new n0(s9Var, 21));
            this.v = null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [s9, java.lang.Object] */
    public final List H(String str, String str2, zi7 zi7Var, yy yyVar, yy yyVar2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        yq1 yq1Var = yyVar.c;
        nj2.h();
        mq7 mq7Var = this.r;
        if (yyVar2 == null) {
            qv6 I = I(str, str2, zi7Var, yyVar, null);
            eg0 d = d();
            Objects.requireNonNull(d);
            m44 m44Var = new m44(d, new qf1(yq1Var));
            this.u = m44Var;
            if (this.k != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int K = ((n23) this.h).K(0);
            mq7Var.getClass();
            HashMap hashMap = new HashMap();
            Iterator it = mq7Var.A.iterator();
            while (it.hasNext()) {
                di7 di7Var = (di7) it.next();
                gl5 gl5Var = mq7Var.g0;
                eg0 eg0Var = mq7Var.Y;
                mq7 mq7Var2 = mq7Var;
                boolean z6 = z4;
                ry r = mq7Var2.r(di7Var, gl5Var, eg0Var, I, K, z6);
                int p = mq7Var2.Y.a().p(((n23) di7Var.h).K(0));
                lq7 lq7Var = (lq7) mq7Var2.L.get(di7Var);
                Objects.requireNonNull(lq7Var);
                lq7Var.B.L = p;
                hashMap.put(di7Var, r);
                mq7Var = mq7Var2;
                z4 = z6;
            }
            mq7 mq7Var3 = mq7Var;
            boolean z7 = z4;
            ArrayList arrayList = new ArrayList(hashMap.values());
            if (I != null) {
                qf1 qf1Var = (qf1) m44Var.B;
                nj2.h();
                kj2.t("SurfaceProcessorNode", "[StreamSharing] SurfaceProcessorNode Transform (Processor=" + qf1Var + "\n   inputEdge = " + I);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    kj2.t("SurfaceProcessorNode", "   outputConfig = " + ((ry) obj));
                }
                m44Var.R = new HashMap();
                int size2 = arrayList.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    int i3 = i2 + 1;
                    ry ryVar = (ry) obj2;
                    qs0 qs0Var = (qs0) m44Var.R;
                    Rect rect = ryVar.d;
                    int i4 = ryVar.f;
                    boolean z8 = ryVar.g;
                    ArrayList arrayList2 = arrayList;
                    Matrix matrix = new Matrix(I.b);
                    RectF rectF = new RectF(rect);
                    int i5 = size2;
                    Size size3 = ryVar.e;
                    matrix.postConcat(k97.a(rectF, k97.h(size3), i4, z8));
                    np2.t(k97.d(k97.g(i4, k97.f(rect)), size3));
                    HashMap hashMap2 = hashMap;
                    Rect rect2 = new Rect(0, 0, size3.getWidth(), size3.getHeight());
                    p87 b = I.g.b();
                    b.a = size3;
                    yy a = b.a();
                    int i6 = ryVar.b;
                    int i7 = ryVar.c;
                    int i8 = I.i - i4;
                    if (I.e != z8) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    qs0Var.put(ryVar, new qv6(i6, i7, a, matrix, false, rect2, i8, -1, z5));
                    arrayList = arrayList2;
                    size2 = i5;
                    i2 = i3;
                    hashMap = hashMap2;
                }
                HashMap hashMap3 = hashMap;
                qf1Var.a(I.c(true));
                for (Map.Entry entry : ((qs0) m44Var.R).entrySet()) {
                    m44Var.d(I, entry);
                    qv6 qv6Var = (qv6) entry.getValue();
                    v vVar = new v(m44Var, I, entry, 19);
                    qv6Var.getClass();
                    nj2.h();
                    qv6Var.a();
                    qv6Var.m.add(vVar);
                }
                I.o.add(new uk2((qs0) m44Var.R, 2));
                qs0 qs0Var2 = (qs0) m44Var.R;
                HashMap hashMap4 = new HashMap();
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    hashMap4.put((di7) entry2.getKey(), (qv6) qs0Var2.get(entry2.getValue()));
                }
                mq7Var3.x(hashMap4, mq7Var3.u(I, z7));
                ArrayList arrayList3 = new ArrayList(1);
                Object obj3 = new Object[]{this.A.c()}[0];
                Objects.requireNonNull(obj3);
                arrayList3.add(obj3);
                return Collections.unmodifiableList(arrayList3);
            }
            u34.x("Null surfaceEdge");
            return null;
        }
        qv6 I2 = I(str, str2, zi7Var, yyVar, yyVar2);
        Matrix matrix2 = this.l;
        eg0 j = j();
        Objects.requireNonNull(j);
        boolean o = j.o();
        Size size4 = yyVar2.a;
        Rect rect3 = this.k;
        if (rect3 != null) {
            z = false;
        } else {
            z = false;
            rect3 = new Rect(0, 0, size4.getWidth(), size4.getHeight());
        }
        eg0 j2 = j();
        Objects.requireNonNull(j2);
        int i9 = i(j2, z);
        eg0 j3 = j();
        Objects.requireNonNull(j3);
        mq7 mq7Var4 = mq7Var;
        qv6 qv6Var2 = new qv6(3, 34, yyVar2, matrix2, o, rect3, i9, -1, o(j3));
        this.x = qv6Var2;
        Objects.requireNonNull(j());
        this.z = qv6Var2;
        lc6 J = J(this.x, zi7Var, yyVar2);
        this.B = J;
        mc6 mc6Var = this.C;
        if (mc6Var != null) {
            mc6Var.b();
        }
        mc6 mc6Var2 = new mc6(new or6(this, str, str2, zi7Var, yyVar, yyVar2));
        this.C = mc6Var2;
        J.f = mc6Var2;
        qv6 qv6Var3 = this.z;
        eg0 d2 = d();
        eg0 j4 = j();
        mq1 mq1Var = new mq1(yq1Var, this.s, this.t);
        ?? obj4 = new Object();
        obj4.b = d2;
        obj4.c = j4;
        obj4.a = mq1Var;
        this.v = obj4;
        if (this.k != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        int K2 = ((n23) this.h).K(0);
        mq7Var4.getClass();
        HashMap hashMap5 = new HashMap();
        Iterator it2 = mq7Var4.A.iterator();
        while (it2.hasNext()) {
            di7 di7Var2 = (di7) it2.next();
            mq7 mq7Var5 = mq7Var4;
            ry r2 = mq7Var5.r(di7Var2, mq7Var4.g0, mq7Var4.Y, I2, K2, z2);
            gl5 gl5Var2 = mq7Var5.h0;
            Objects.requireNonNull(gl5Var2);
            eg0 eg0Var2 = mq7Var5.Z;
            Objects.requireNonNull(eg0Var2);
            qv6 qv6Var4 = qv6Var3;
            ry r3 = mq7Var5.r(di7Var2, gl5Var2, eg0Var2, qv6Var4, K2, z2);
            int p2 = mq7Var5.Y.a().p(((n23) di7Var2.h).K(0));
            lq7 lq7Var2 = (lq7) mq7Var5.L.get(di7Var2);
            Objects.requireNonNull(lq7Var2);
            lq7Var2.B.L = p2;
            hashMap5.put(di7Var2, new ay(r2, r3));
            mq7Var4 = mq7Var5;
            qv6Var3 = qv6Var4;
        }
        qv6 qv6Var5 = qv6Var3;
        mq7 mq7Var6 = mq7Var4;
        s9 s9Var = this.v;
        ArrayList arrayList4 = new ArrayList(hashMap5.values());
        cy cyVar = new cy(I2, qv6Var5, arrayList4);
        s9Var.getClass();
        nj2.h();
        StringBuilder sb = new StringBuilder("[StreamSharing] DualSurfaceProcessorNode Transform Processor = ");
        xv6 xv6Var = (xv6) s9Var.a;
        sb.append(xv6Var);
        sb.append("\n   primary input = ");
        sb.append(I2);
        sb.append("\n   secondary input = ");
        sb.append(qv6Var5);
        kj2.t("DualSurfaceProcessorNode", sb.toString());
        int size5 = arrayList4.size();
        int i10 = 0;
        while (i10 < size5) {
            Object obj5 = arrayList4.get(i10);
            i10++;
            kj2.t("SurfaceProcessorNode", "   outputConfig = " + ((ay) obj5));
        }
        s9Var.e = cyVar;
        s9Var.d = new HashMap();
        cy cyVar2 = (cy) s9Var.e;
        qv6 qv6Var6 = cyVar2.a;
        qv6 qv6Var7 = cyVar2.b;
        ArrayList arrayList5 = cyVar2.c;
        int size6 = arrayList5.size();
        int i11 = 0;
        while (i11 < size6) {
            Object obj6 = arrayList5.get(i11);
            int i12 = i11 + 1;
            ay ayVar = (ay) obj6;
            qs0 qs0Var3 = (qs0) s9Var.d;
            ry ryVar2 = ayVar.a;
            Rect rect4 = ryVar2.d;
            ArrayList arrayList6 = arrayList5;
            int i13 = ryVar2.f;
            int i14 = size6;
            boolean z9 = ryVar2.g;
            HashMap hashMap6 = hashMap5;
            Matrix matrix3 = new Matrix(qv6Var6.b);
            RectF rectF2 = new RectF(rect4);
            Size size7 = ryVar2.e;
            matrix3.postConcat(k97.a(rectF2, k97.h(size7), i13, z9));
            np2.t(k97.d(k97.g(i13, k97.f(rect4)), size7));
            Rect rect5 = new Rect(0, 0, size7.getWidth(), size7.getHeight());
            p87 b2 = qv6Var6.g.b();
            b2.a = size7;
            yy a2 = b2.a();
            int i15 = ryVar2.b;
            int i16 = ryVar2.c;
            int i17 = qv6Var6.i - i13;
            if (qv6Var6.e != z9) {
                z3 = true;
            } else {
                z3 = false;
            }
            qs0Var3.put(ayVar, new qv6(i15, i16, a2, matrix3, false, rect5, i17, -1, z3));
            size6 = i14;
            hashMap5 = hashMap6;
            i11 = i12;
            arrayList5 = arrayList6;
        }
        HashMap hashMap7 = hashMap5;
        xv6Var.a(qv6Var6.c(true));
        xv6Var.a(qv6Var7.c(false));
        eg0 eg0Var3 = (eg0) s9Var.b;
        eg0 eg0Var4 = (eg0) s9Var.c;
        for (Map.Entry entry3 : ((qs0) s9Var.d).entrySet()) {
            s9 s9Var2 = s9Var;
            qv6 qv6Var8 = qv6Var6;
            qv6 qv6Var9 = qv6Var7;
            s9Var2.r(eg0Var3, eg0Var4, qv6Var8, qv6Var9, entry3);
            qv6 qv6Var10 = (qv6) entry3.getValue();
            eg0 eg0Var5 = eg0Var4;
            eg0 eg0Var6 = eg0Var3;
            r30 r30Var = new r30(s9Var2, eg0Var6, eg0Var5, qv6Var8, qv6Var9, entry3, 1);
            eg0Var3 = eg0Var6;
            eg0Var4 = eg0Var5;
            qv6Var10.getClass();
            nj2.h();
            qv6Var10.a();
            qv6Var10.m.add(r30Var);
            s9Var = s9Var2;
            qv6Var6 = qv6Var8;
            qv6Var7 = qv6Var9;
        }
        qs0 qs0Var4 = (qs0) s9Var.d;
        HashMap hashMap8 = new HashMap();
        for (Map.Entry entry4 : hashMap7.entrySet()) {
            hashMap8.put((di7) entry4.getKey(), (qv6) qs0Var4.get(entry4.getValue()));
        }
        mq7Var6.x(hashMap8, mq7Var6.u(I2, z2));
        Object[] objArr = {this.A.c(), this.B.c()};
        ArrayList arrayList7 = new ArrayList(2);
        for (int i18 = 0; i18 < 2; i18++) {
            Object obj7 = objArr[i18];
            Objects.requireNonNull(obj7);
            arrayList7.add(obj7);
        }
        return Collections.unmodifiableList(arrayList7);
    }

    public final qv6 I(String str, String str2, zi7 zi7Var, yy yyVar, yy yyVar2) {
        Matrix matrix = this.l;
        eg0 d = d();
        Objects.requireNonNull(d);
        boolean o = d.o();
        Size size = yyVar.a;
        Rect rect = this.k;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        eg0 d2 = d();
        Objects.requireNonNull(d2);
        int i = i(d2, false);
        eg0 d3 = d();
        Objects.requireNonNull(d3);
        qv6 qv6Var = new qv6(3, 34, yyVar, matrix, o, rect, i, -1, o(d3));
        this.w = qv6Var;
        Objects.requireNonNull(d());
        this.y = qv6Var;
        lc6 J = J(this.w, zi7Var, yyVar);
        this.A = J;
        mc6 mc6Var = this.C;
        if (mc6Var != null) {
            mc6Var.b();
        }
        mc6 mc6Var2 = new mc6(new or6(this, str, str2, zi7Var, yyVar, yyVar2));
        this.C = mc6Var2;
        J.f = mc6Var2;
        return this.y;
    }

    public final lc6 J(qv6 qv6Var, zi7 zi7Var, yy yyVar) {
        lc6 d = lc6.d(zi7Var, yyVar.a);
        dk0 dk0Var = d.b;
        mq7 mq7Var = this.r;
        Iterator it = mq7Var.A.iterator();
        int i = -1;
        while (it.hasNext()) {
            int i2 = ((rc6) ((di7) it.next()).h.e(zi7.G)).g.c;
            List list = rc6.j;
            if (list.indexOf(Integer.valueOf(i)) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        if (i != -1) {
            dk0Var.L = i;
        }
        Size size = yyVar.a;
        Iterator it2 = mq7Var.A.iterator();
        while (it2.hasNext()) {
            rc6 c = lc6.d(((di7) it2.next()).h, size).c();
            ek0 ek0Var = c.g;
            dk0Var.c(ek0Var.d);
            List<be0> list2 = c.e;
            ArrayList arrayList = d.e;
            for (be0 be0Var : list2) {
                dk0Var.d(be0Var);
                if (!arrayList.contains(be0Var)) {
                    arrayList.add(be0Var);
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
            dk0Var.e(ek0Var.b);
        }
        qv6Var.getClass();
        nj2.h();
        qv6Var.a();
        np2.A("Consumer can only be linked once.", !qv6Var.j);
        qv6Var.j = true;
        d.b(qv6Var.l, yyVar.c, -1);
        dk0Var.d(mq7Var.d0);
        yy0 yy0Var = yyVar.f;
        if (yy0Var != null) {
            dk0Var.e(yy0Var);
        }
        d.h = yyVar.d;
        a(d, yyVar);
        return d;
    }

    @Override // defpackage.di7
    public final zi7 g(boolean z, cj7 cj7Var) {
        qr6 qr6Var = this.q;
        yy0 a = cj7Var.a(qr6Var.x(), 1);
        if (z) {
            a = yy0.t(a, qr6Var.A);
        }
        if (a == null) {
            return null;
        }
        return ((jd0) m(a)).h();
    }

    @Override // defpackage.di7
    public final Set k(cg0 cg0Var) {
        HashSet hashSet = this.r.A;
        HashSet hashSet2 = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Set k = ((di7) it.next()).k(cg0Var);
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

    @Override // defpackage.di7
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // defpackage.di7
    public final yi7 m(yy0 yy0Var) {
        return new jd0(da4.k(yy0Var), 6);
    }

    @Override // defpackage.di7
    public final void t() {
        mq7 mq7Var = this.r;
        Iterator it = mq7Var.A.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            lq7 lq7Var = (lq7) mq7Var.L.get(di7Var);
            Objects.requireNonNull(lq7Var);
            di7Var.b(lq7Var, null, null, di7Var.g(true, mq7Var.X));
        }
    }

    @Override // defpackage.di7
    public final void u() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((di7) it.next()).u();
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
    @Override // defpackage.di7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zi7 v(cg0 cg0Var, yi7 yi7Var) {
        zi7 zi7Var;
        zi7 zi7Var2;
        Object obj;
        da4 f = yi7Var.f();
        mq7 mq7Var = this.r;
        HashSet hashSet = mq7Var.e0;
        gl5 gl5Var = mq7Var.g0;
        List t = gl5Var.f.t(34);
        HashSet hashSet2 = gl5Var.d;
        Iterator it = hashSet2.iterator();
        while (true) {
            zi7Var = null;
            if (!it.hasNext()) {
                break;
            }
            zi7 zi7Var3 = (zi7) it.next();
            if (!((Boolean) zi7Var3.b(zi7.S, Boolean.FALSE)).booleanValue() && (zi7Var3 instanceof n23)) {
                el5 el5Var = (el5) ((n23) zi7Var3).b(n23.w, null);
            }
        }
        List list = (List) f.b(n23.v, null);
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    Pair pair = (Pair) it2.next();
                    if (((Integer) pair.first).equals(34)) {
                        t = Arrays.asList((Size[]) pair.second);
                        break;
                    }
                } else {
                    t = new ArrayList();
                    break;
                }
            }
        }
        Rational rational = gl5Var.c;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet3 = new HashSet();
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            hashSet3.addAll(gl5Var.c((zi7) it3.next()));
        }
        Iterator it4 = hashSet3.iterator();
        while (true) {
            if (it4.hasNext()) {
                if (!mv.a(rational, (Size) it4.next())) {
                    arrayList.addAll(gl5Var.g(gl5Var.b, t, false));
                    break;
                }
            } else {
                break;
            }
        }
        int size = arrayList.size();
        if (hashSet2.isEmpty()) {
            zi7Var2 = null;
        } else {
            Iterator it5 = hashSet2.iterator();
            loop9: while (true) {
                if (it5.hasNext()) {
                    Iterator it6 = gl5Var.c((zi7) it5.next()).iterator();
                    boolean z = false;
                    boolean z2 = false;
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        zi7Var2 = zi7Var;
                        boolean a = mv.a(rational, (Size) it6.next());
                        if (a) {
                            z = true;
                        }
                        if (z2 && a) {
                            break loop9;
                        }
                        if (!a) {
                            z2 = true;
                        }
                        zi7Var = zi7Var2;
                    }
                } else {
                    zi7Var2 = zi7Var;
                    size = 0;
                    break;
                }
                zi7Var = zi7Var2;
            }
        }
        arrayList.addAll(size, gl5Var.g(rational, t, false));
        arrayList.addAll(gl5Var.f(t, false));
        if (arrayList.isEmpty()) {
            kj2.f0("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(gl5Var.f(t, true));
        }
        kj2.t("ResolutionsMerger", "Parent resolutions: " + arrayList);
        f.m(n23.x, arrayList);
        xx xxVar = zi7.K;
        Iterator it7 = hashSet.iterator();
        int i = 0;
        while (it7.hasNext()) {
            i = Math.max(i, ((Integer) ((zi7) it7.next()).b(zi7.K, 0)).intValue());
        }
        f.m(xxVar, Integer.valueOf(i));
        ArrayList arrayList2 = new ArrayList();
        Iterator it8 = hashSet.iterator();
        while (it8.hasNext()) {
            yq1 yq1Var = (yq1) ((zi7) it8.next()).b(j23.n, yq1.c);
            yq1Var.getClass();
            arrayList2.add(yq1Var);
        }
        if (!arrayList2.isEmpty()) {
            yq1 yq1Var2 = (yq1) arrayList2.get(0);
            Integer valueOf = Integer.valueOf(yq1Var2.a);
            Integer valueOf2 = Integer.valueOf(yq1Var2.b);
            for (int i2 = 1; i2 < arrayList2.size(); i2++) {
                yq1 yq1Var3 = (yq1) arrayList2.get(i2);
                Integer valueOf3 = Integer.valueOf(yq1Var3.a);
                if (!valueOf.equals(0)) {
                    valueOf = valueOf;
                    if (!valueOf3.equals(0)) {
                        if (!valueOf.equals(2) || valueOf3.equals(1)) {
                            if (valueOf3.equals(2)) {
                                boolean equals = valueOf.equals(1);
                                valueOf = valueOf;
                            }
                            boolean equals2 = valueOf.equals(valueOf3);
                            valueOf = valueOf;
                            if (!equals2) {
                                valueOf = zi7Var2;
                            }
                        }
                    }
                    Integer valueOf4 = Integer.valueOf(yq1Var3.b);
                    if (!valueOf2.equals(0)) {
                        valueOf2 = valueOf4;
                    } else {
                        valueOf2 = valueOf2;
                        if (!valueOf4.equals(0)) {
                            boolean equals3 = valueOf2.equals(valueOf4);
                            valueOf2 = valueOf2;
                            if (!equals3) {
                                valueOf2 = zi7Var2;
                            }
                        }
                    }
                    if (valueOf != null && valueOf2 != null) {
                    }
                }
                valueOf = valueOf3;
                Integer valueOf42 = Integer.valueOf(yq1Var3.b);
                if (!valueOf2.equals(0)) {
                }
                if (valueOf != null) {
                }
            }
            obj = new yq1(valueOf.intValue(), valueOf2.intValue());
            if (obj == null) {
                f.m(j23.n, obj);
                xx xxVar2 = zi7.N;
                Range range = yy.h;
                Iterator it9 = hashSet.iterator();
                while (it9.hasNext()) {
                    Range range2 = (Range) ((zi7) it9.next()).b(zi7.N, range);
                    Objects.requireNonNull(range2);
                    if (yy.h.equals(range)) {
                        range = range2;
                    } else {
                        try {
                            range = range.intersect(range2);
                        } catch (IllegalArgumentException unused) {
                            kj2.t("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + range + " <<>> " + range2);
                            range = range.extend(range2);
                        }
                    }
                }
                f.m(xxVar2, range);
                Iterator it10 = mq7Var.A.iterator();
                while (it10.hasNext()) {
                    zi7 zi7Var4 = (zi7) mq7Var.f0.get((di7) it10.next());
                    Objects.requireNonNull(zi7Var4);
                    if (zi7Var4.y() != 0) {
                        f.m(zi7.V, Integer.valueOf(zi7Var4.y()));
                    }
                    if (zi7Var4.E() != 0) {
                        f.m(zi7.U, Integer.valueOf(zi7Var4.E()));
                    }
                }
                return yi7Var.h();
            }
            i.h("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
            return zi7Var2;
        }
        obj = zi7Var2;
        if (obj == null) {
        }
    }

    @Override // defpackage.di7
    public final void w() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((di7) it.next()).w();
        }
    }

    @Override // defpackage.di7
    public final void x() {
        Iterator it = this.r.A.iterator();
        while (it.hasNext()) {
            ((di7) it.next()).x();
        }
    }

    @Override // defpackage.di7
    public final yy y(yy0 yy0Var) {
        this.A.a(yy0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.A.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p87 b = this.i.b();
        b.f = yy0Var;
        return b.a();
    }

    @Override // defpackage.di7
    public final yy z(yy yyVar, yy yyVar2) {
        String d;
        kj2.t("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + yyVar + ", secondaryStreamSpec " + yyVar2);
        String f = f();
        if (j() == null) {
            d = null;
        } else {
            d = j().q().d();
        }
        E(H(f, d, this.h, yyVar, yyVar2));
        q();
        return yyVar;
    }
}
