package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi0  reason: default package */
/* loaded from: classes.dex */
public final class zi0 implements pd0 {
    public final x9 A;
    public final x9 B;
    public final cj7 L;
    public final yf0 R;
    public final ze0 Z;
    public final oe0 f0;
    public di7 j0;
    public pr6 k0;
    public final u63 l0;
    public final u63 m0;
    public final rr6 o0;
    public final ArrayList X = new ArrayList();
    public final ArrayList Y = new ArrayList();
    public List d0 = Collections.EMPTY_LIST;
    public Range e0 = yy.h;
    public final Object g0 = new Object();
    public boolean h0 = true;
    public yy0 i0 = null;
    public final rr6 n0 = new rr6(0);

    public zi0(eg0 eg0Var, eg0 eg0Var2, w9 w9Var, w9 w9Var2, u63 u63Var, u63 u63Var2, ze0 ze0Var, rr6 rr6Var, cj7 cj7Var) {
        this.f0 = w9Var.L;
        this.A = new x9(eg0Var, w9Var);
        if (eg0Var2 != null && w9Var2 != null) {
            this.B = new x9(eg0Var2, w9Var2);
        } else {
            this.B = null;
        }
        this.l0 = u63Var;
        this.m0 = u63Var2;
        this.Z = ze0Var;
        this.L = cj7Var;
        this.R = nc1.M(w9Var, w9Var2);
        this.o0 = rr6Var;
    }

    public static void C(HashMap hashMap) {
        HashSet hashSet;
        for (Map.Entry entry : hashMap.entrySet()) {
            di7 di7Var = (di7) entry.getKey();
            Set set = (Set) entry.getValue();
            if (set != null) {
                di7Var.getClass();
                hashSet = new HashSet(set);
            } else {
                hashSet = null;
            }
            di7Var.g = hashSet;
        }
    }

    public static ArrayList D(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((di7) obj).getClass();
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw i61.j(it);
            }
        }
        return arrayList2;
    }

    public static HashMap g(LinkedHashSet linkedHashSet, il5 il5Var) {
        LinkedHashSet linkedHashSet2;
        HashMap hashMap = new HashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            di7 di7Var = (di7) it.next();
            hashMap.put(di7Var, di7Var.g);
            HashSet hashSet = null;
            if (il5Var != null) {
                linkedHashSet2 = il5Var.b;
            } else {
                linkedHashSet2 = null;
            }
            if (linkedHashSet2 != null) {
                hashSet = new HashSet(linkedHashSet2);
            }
            di7Var.g = hashSet;
        }
        return hashMap;
    }

    public static Matrix s(Rect rect, Size size) {
        boolean z;
        if (rect.width() > 0 && rect.height() > 0) {
            z = true;
        } else {
            z = false;
        }
        np2.s("Cannot compute viewport crop rects zero sized sensor rect.", z);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(RecyclerView.B1, RecyclerView.B1, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static d23 t() {
        jd0 jd0Var = new jd0(4);
        xx xxVar = kz6.C;
        da4 da4Var = jd0Var.B;
        da4Var.m(xxVar, "ImageCapture-Extra");
        Integer num = (Integer) da4Var.b(e23.R, null);
        if (num != null) {
            da4Var.m(j23.l, num);
        } else {
            b23 b23Var = d23.z;
            xx xxVar2 = e23.X;
            if (Objects.equals(da4Var.b(xxVar2, null), 2)) {
                da4Var.m(j23.l, 32);
            } else if (Objects.equals(da4Var.b(xxVar2, null), 3)) {
                da4Var.m(j23.l, 32);
                da4Var.m(j23.m, 256);
            } else if (Objects.equals(da4Var.b(xxVar2, null), 1)) {
                da4Var.m(j23.l, 4101);
                da4Var.m(j23.n, yq1.c);
            } else {
                da4Var.m(j23.l, 256);
            }
        }
        e23 e23Var = new e23(go4.a(da4Var));
        n23.J(e23Var);
        d23 d23Var = new d23(e23Var);
        Size size = (Size) da4Var.b(n23.s, null);
        if (size != null) {
            new Rational(size.getWidth(), size.getHeight());
        }
        np2.x((Executor) da4Var.b(dc3.y, u24.u()), "The IO executor can't be null");
        xx xxVar3 = e23.L;
        if (da4Var.A.containsKey(xxVar3)) {
            Integer num2 = (Integer) da4Var.e(xxVar3);
            if (num2 != null && (num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                if (num2.intValue() == 3 && da4Var.b(e23.e0, null) == null) {
                    i.h("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                    return null;
                }
            } else {
                e41.w(num2, "The flash mode is not allowed to set: ");
                return null;
            }
        }
        return d23Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [p25, di7] */
    public static p25 u() {
        jd0 jd0Var = new jd0(5);
        xx xxVar = kz6.C;
        da4 da4Var = jd0Var.B;
        da4Var.m(xxVar, "Preview-Extra");
        q25 q25Var = new q25(go4.a(da4Var));
        n23.J(q25Var);
        ?? di7Var = new di7(q25Var);
        ov2 ov2Var = p25.y;
        di7Var.r = ov2Var;
        i iVar = new i(10);
        nj2.h();
        di7Var.q = iVar;
        di7Var.r = ov2Var;
        if (di7Var.c() != null) {
            di7Var.H((q25) di7Var.h, di7Var.i);
            di7Var.r();
        }
        di7Var.q();
        return di7Var;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [p25, di7] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, ui0] */
    public static HashMap x(ArrayList arrayList, cj7 cj7Var, cj7 cj7Var2, Range range) {
        zi7 g;
        da4 d;
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            di7 di7Var = (di7) obj;
            if (di7Var instanceof pr6) {
                pr6 pr6Var = (pr6) di7Var;
                q25 q25Var = new q25(go4.a(new jd0(5).B));
                n23.J(q25Var);
                ?? di7Var2 = new di7(q25Var);
                di7Var2.r = p25.y;
                zi7 g2 = di7Var2.g(false, cj7Var);
                if (g2 == null) {
                    g = null;
                } else {
                    da4 k = da4.k(g2);
                    k.n(kz6.D);
                    g = ((jd0) pr6Var.m(k)).h();
                }
            } else {
                g = di7Var.g(false, cj7Var);
            }
            zi7 g3 = di7Var.g(true, cj7Var2);
            if (g3 != null) {
                d = da4.k(g3);
            } else {
                d = da4.d();
            }
            d.m(zi7.M, 0);
            if (!yy.h.equals(range)) {
                d.l(zi7.N, xy0.HIGH_PRIORITY_REQUIRED, range);
                d.m(zi7.O, Boolean.TRUE);
            }
            zi7 h = di7Var.m(d).h();
            ?? obj2 = new Object();
            obj2.a = g;
            obj2.b = h;
            hashMap.put(di7Var, obj2);
        }
        return hashMap;
    }

    public final void A() {
        synchronized (this.g0) {
            this.f0.z();
        }
    }

    public final void B(ArrayList arrayList) {
        synchronized (this.g0) {
            int size = arrayList.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((di7) obj).g = null;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
            linkedHashSet.removeAll(arrayList);
            if (this.B != null) {
                z = true;
            }
            d(r(linkedHashSet, z));
        }
    }

    @Override // defpackage.pd0
    public final zf0 a() {
        throw null;
    }

    public final void b(Collection collection, il5 il5Var) {
        boolean z;
        kj2.t("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + il5Var);
        synchronized (this.g0) {
            try {
                x9 x9Var = this.A;
                oe0 oe0Var = this.f0;
                x9Var.i(oe0Var);
                x9 x9Var2 = this.B;
                if (x9Var2 != null) {
                    x9Var2.i(oe0Var);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.X);
                linkedHashSet.addAll(collection);
                HashMap g = g(linkedHashSet, il5Var);
                try {
                    if (this.B != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d(r(linkedHashSet, z));
                } catch (IllegalArgumentException e) {
                    C(g);
                    throw new Exception(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(db0 db0Var) {
        int i;
        Map map = db0Var.i.a;
        ArrayList arrayList = db0Var.b;
        synchronized (this.g0) {
            try {
                int size = arrayList.size();
                i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    di7 di7Var = (di7) obj;
                    Rect j = this.A.B.A.j();
                    yy yyVar = (yy) map.get(di7Var);
                    yyVar.getClass();
                    di7Var.B(s(j, yyVar.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        List list = this.d0;
        ArrayList arrayList2 = db0Var.b;
        LinkedHashSet linkedHashSet = db0Var.a;
        ArrayList D = D(arrayList2, list);
        ArrayList arrayList3 = new ArrayList(linkedHashSet);
        arrayList3.removeAll(arrayList2);
        ArrayList D2 = D(arrayList3, D);
        if (!D2.isEmpty()) {
            kj2.f0("CameraUseCaseAdapter", "Unused effects: " + D2);
        }
        ArrayList arrayList4 = db0Var.e;
        int size2 = arrayList4.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList4.get(i3);
            i3++;
            ((di7) obj2).D(this.A);
        }
        this.A.m(db0Var.e);
        if (this.B != null) {
            ArrayList arrayList5 = db0Var.e;
            int size3 = arrayList5.size();
            int i4 = 0;
            while (i4 < size3) {
                Object obj3 = arrayList5.get(i4);
                i4++;
                x9 x9Var = this.B;
                Objects.requireNonNull(x9Var);
                ((di7) obj3).D(x9Var);
            }
            x9 x9Var2 = this.B;
            Objects.requireNonNull(x9Var2);
            x9Var2.m(db0Var.e);
        }
        if (db0Var.e.isEmpty()) {
            ArrayList arrayList6 = db0Var.d;
            int size4 = arrayList6.size();
            int i5 = 0;
            while (i5 < size4) {
                Object obj4 = arrayList6.get(i5);
                i5++;
                di7 di7Var2 = (di7) obj4;
                Map map2 = db0Var.i.a;
                if (map2.containsKey(di7Var2)) {
                    yy yyVar2 = (yy) map2.get(di7Var2);
                    Objects.requireNonNull(yyVar2);
                    yy0 yy0Var = yyVar2.f;
                    if (yy0Var != null) {
                        rc6 rc6Var = di7Var2.o;
                        go4 go4Var = rc6Var.g.b;
                        Objects.requireNonNull(yy0Var);
                        if (yy0Var.c().size() == rc6Var.g.b.c().size()) {
                            for (xx xxVar : yy0Var.c()) {
                                if (go4Var.A.containsKey(xxVar)) {
                                    if (!Objects.equals(go4Var.e(xxVar), yy0Var.e(xxVar))) {
                                    }
                                }
                            }
                        }
                        di7Var2.i = di7Var2.y(yy0Var);
                        if (this.h0) {
                            this.A.g(di7Var2);
                            x9 x9Var3 = this.B;
                            if (x9Var3 != null) {
                                x9Var3.g(di7Var2);
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList7 = db0Var.c;
        int size5 = arrayList7.size();
        int i6 = 0;
        while (i6 < size5) {
            Object obj5 = arrayList7.get(i6);
            i6++;
            di7 di7Var3 = (di7) obj5;
            ui0 ui0Var = (ui0) db0Var.h.get(di7Var3);
            Objects.requireNonNull(ui0Var);
            x9 x9Var4 = this.B;
            x9 x9Var5 = this.A;
            zi7 zi7Var = ui0Var.a;
            if (x9Var4 != null) {
                di7Var3.b(x9Var5, x9Var4, zi7Var, ui0Var.b);
                yy yyVar3 = (yy) db0Var.i.a.get(di7Var3);
                yyVar3.getClass();
                sr6 sr6Var = db0Var.j;
                sr6Var.getClass();
                di7Var3.F(yyVar3, (yy) sr6Var.a.get(di7Var3));
            } else {
                di7Var3.b(x9Var5, null, zi7Var, ui0Var.b);
                yy yyVar4 = (yy) db0Var.i.a.get(di7Var3);
                yyVar4.getClass();
                di7Var3.F(yyVar4, null);
            }
        }
        if (this.h0) {
            this.A.l(db0Var.c);
            x9 x9Var6 = this.B;
            if (x9Var6 != null) {
                x9Var6.l(db0Var.c);
            }
        }
        ArrayList arrayList8 = db0Var.c;
        int size6 = arrayList8.size();
        while (i < size6) {
            Object obj6 = arrayList8.get(i);
            i++;
            ((di7) obj6).s();
        }
        this.X.clear();
        this.X.addAll(db0Var.a);
        this.Y.clear();
        this.Y.addAll(db0Var.b);
        this.j0 = db0Var.g;
        this.k0 = db0Var.f;
    }

    public final void h() {
        synchronized (this.g0) {
            try {
                if (!this.h0) {
                    if (!this.Y.isEmpty()) {
                        this.A.i(this.f0);
                        x9 x9Var = this.B;
                        if (x9Var != null) {
                            x9Var.i(this.f0);
                        }
                    }
                    this.A.l(this.Y);
                    x9 x9Var2 = this.B;
                    if (x9Var2 != null) {
                        x9Var2.l(this.Y);
                    }
                    synchronized (this.g0) {
                        yy0 yy0Var = this.i0;
                        if (yy0Var != null) {
                            this.A.L.c(yy0Var);
                        }
                    }
                    ArrayList arrayList = this.Y;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((di7) obj).s();
                    }
                    this.h0 = true;
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
        return r(r25, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final db0 r(LinkedHashSet linkedHashSet, boolean z) {
        pr6 pr6Var;
        boolean z2;
        HashSet hashSet;
        boolean z3;
        di7 di7Var;
        sr6 sr6Var;
        boolean z4;
        boolean z5;
        boolean z6;
        A();
        synchronized (this.g0) {
            try {
                if (!this.d0.isEmpty()) {
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            di7 di7Var2 = (di7) it.next();
                            if (di7Var2 instanceof d23) {
                                zi7 zi7Var = di7Var2.h;
                                xx xxVar = e23.X;
                                if (zi7Var.i(xxVar)) {
                                    Integer num = (Integer) zi7Var.e(xxVar);
                                    num.getClass();
                                    if (num.intValue() == 1) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        } else {
                            Iterator it2 = linkedHashSet.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    di7 di7Var3 = (di7) it2.next();
                                    if (di7Var3 instanceof d23) {
                                        zi7 zi7Var2 = di7Var3.h;
                                        xx xxVar2 = e23.X;
                                        if (zi7Var2.i(xxVar2)) {
                                            Integer num2 = (Integer) zi7Var2.e(xxVar2);
                                            num2.getClass();
                                            if (num2.intValue() == 2) {
                                                z6 = true;
                                                break;
                                            }
                                        } else {
                                            continue;
                                        }
                                    }
                                } else {
                                    z6 = false;
                                    break;
                                }
                            }
                            if (!z6) {
                            }
                        }
                    }
                }
            } finally {
            }
        }
        if (!z) {
            A();
            rr6 rr6Var = this.n0;
            String d = this.A.B.A.d();
            if (((ImageCaptureFailedForSpecificCombinationQuirk) rr6Var.B) != null) {
                HashSet hashSet2 = ImageCaptureFailedForSpecificCombinationQuirk.a;
                String str = Build.BRAND;
                if ("oneplus".equalsIgnoreCase(str)) {
                }
            } else if (((PreviewGreenTintQuirk) rr6Var.L) != null) {
                d.getClass();
                if ("motorola".equalsIgnoreCase(Build.BRAND) && "moto e20".equalsIgnoreCase(Build.MODEL) && d.equals("0") && linkedHashSet.size() == 2) {
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it3 = linkedHashSet.iterator();
                        while (it3.hasNext()) {
                            if (((di7) it3.next()) instanceof p25) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                    z4 = false;
                    if (!linkedHashSet.isEmpty()) {
                        Iterator it4 = linkedHashSet.iterator();
                        while (it4.hasNext()) {
                            di7 di7Var4 = (di7) it4.next();
                            if (di7Var4.h.i(zi7.T) && di7Var4.h.x() == bj7.VIDEO_CAPTURE) {
                                z5 = true;
                                break;
                            }
                        }
                    }
                    z5 = false;
                    if (z4) {
                    }
                }
            }
        }
        synchronized (this.g0) {
            try {
                HashSet y = y(linkedHashSet, z);
                if (y.size() < 2) {
                    A();
                } else {
                    pr6 pr6Var2 = this.k0;
                    if (pr6Var2 != null && pr6Var2.r.A.equals(y)) {
                        pr6 pr6Var3 = this.k0;
                        pr6Var3.getClass();
                        HashSet hashSet3 = ((di7) y.iterator().next()).g;
                        if (hashSet3 != null) {
                            hashSet = new HashSet(hashSet3);
                        } else {
                            hashSet = null;
                        }
                        pr6Var3.g = hashSet;
                        pr6Var = this.k0;
                        Objects.requireNonNull(pr6Var);
                    } else {
                        int[] iArr = {1, 2, 4};
                        HashSet hashSet4 = new HashSet();
                        Iterator it5 = y.iterator();
                        loop8: while (it5.hasNext()) {
                            di7 di7Var5 = (di7) it5.next();
                            for (int i = 0; i < 3; i++) {
                                int i2 = iArr[i];
                                Iterator it6 = di7Var5.l().iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        int intValue = ((Integer) it6.next()).intValue();
                                        if ((i2 & intValue) == intValue) {
                                            z2 = true;
                                            break;
                                        }
                                    } else {
                                        z2 = false;
                                        break;
                                    }
                                }
                                if (z2) {
                                    if (!hashSet4.contains(Integer.valueOf(i2))) {
                                        hashSet4.add(Integer.valueOf(i2));
                                    }
                                }
                            }
                        }
                        pr6Var = new pr6(this.A, this.B, this.l0, this.m0, y, this.L);
                    }
                }
                pr6Var = null;
                break loop8;
            } finally {
            }
        }
        synchronized (this.g0) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (pr6Var != null) {
                    arrayList.add(pr6Var);
                    arrayList.removeAll(pr6Var.r.A);
                }
                synchronized (this.g0) {
                    if (((Integer) this.f0.b(oe0.c, 0)).intValue() == 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    int size = arrayList.size();
                    boolean z7 = false;
                    boolean z8 = false;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        di7 di7Var6 = (di7) obj;
                        if (!(di7Var6 instanceof p25) && !(di7Var6 instanceof pr6)) {
                            if (di7Var6 instanceof d23) {
                                z7 = true;
                            }
                        }
                        z8 = true;
                    }
                    if (z7 && !z8) {
                        di7Var = this.j0;
                        if (!(di7Var instanceof p25)) {
                            di7Var = u();
                        }
                    } else {
                        int size2 = arrayList.size();
                        boolean z9 = false;
                        boolean z10 = false;
                        int i4 = 0;
                        while (i4 < size2) {
                            Object obj2 = arrayList.get(i4);
                            i4++;
                            di7 di7Var7 = (di7) obj2;
                            if (!(di7Var7 instanceof p25) && !(di7Var7 instanceof pr6)) {
                                if (di7Var7 instanceof d23) {
                                    z10 = true;
                                }
                            }
                            z9 = true;
                        }
                        if (z9 && !z10) {
                            di7Var = this.j0;
                            if (!(di7Var instanceof d23)) {
                                di7Var = t();
                            }
                        }
                    }
                }
                di7Var = null;
            } finally {
            }
        }
        ArrayList arrayList2 = new ArrayList(linkedHashSet);
        if (di7Var != null) {
            arrayList2.add(di7Var);
        }
        if (pr6Var != null) {
            arrayList2.add(pr6Var);
            arrayList2.removeAll(pr6Var.r.A);
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        arrayList3.removeAll(this.Y);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        arrayList4.retainAll(this.Y);
        ArrayList arrayList5 = new ArrayList(this.Y);
        arrayList5.removeAll(arrayList2);
        HashMap x = x(arrayList3, (cj7) this.f0.b(oe0.b, cj7.a), this.L, this.e0);
        List[] listArr = {arrayList3, arrayList4};
        boolean z11 = false;
        for (int i5 = 0; i5 < 2; i5++) {
            Iterator it7 = listArr[i5].iterator();
            while (true) {
                if (it7.hasNext()) {
                    if (((di7) it7.next()).g != null) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (z11) {
                break;
            }
        }
        boolean z12 = z11;
        try {
            sr6 f = this.o0.f(w(), this.A.B, arrayList3, arrayList4, this.f0, this.e0, z12);
            if (this.B != null) {
                rr6 rr6Var2 = this.o0;
                int w = w();
                x9 x9Var = this.B;
                Objects.requireNonNull(x9Var);
                sr6Var = rr6Var2.f(w, x9Var.B, arrayList3, arrayList4, this.f0, this.e0, z12);
            } else {
                sr6Var = null;
            }
            return new db0(linkedHashSet, arrayList2, arrayList3, arrayList4, arrayList5, pr6Var, di7Var, x, f, sr6Var);
        } catch (IllegalArgumentException e) {
            if (!z) {
                A();
                if (this.B == null) {
                    return r(linkedHashSet, true);
                }
            }
            throw e;
        }
    }

    public final void v() {
        synchronized (this.g0) {
            try {
                if (this.h0) {
                    this.A.m(new ArrayList(this.Y));
                    x9 x9Var = this.B;
                    if (x9Var != null) {
                        x9Var.m(new ArrayList(this.Y));
                    }
                    synchronized (this.g0) {
                        v9 v9Var = this.A.L;
                        this.i0 = v9Var.b.f();
                        v9Var.g();
                    }
                    this.h0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int w() {
        int i;
        synchronized (this.g0) {
            try {
                ze0 ze0Var = this.Z;
                synchronized (ze0Var.b) {
                    i = ze0Var.e;
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

    public final HashSet y(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.g0) {
            Iterator it = this.d0.iterator();
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
            di7 di7Var = (di7) it2.next();
            np2.s("Only support one level of sharing for now.", !(di7Var instanceof pr6));
            Iterator it3 = di7Var.l().iterator();
            while (true) {
                if (it3.hasNext()) {
                    int intValue = ((Integer) it3.next()).intValue();
                    if ((i & intValue) == intValue) {
                        hashSet.add(di7Var);
                        break;
                    }
                }
            }
        }
        return hashSet;
    }

    public final List z() {
        ArrayList arrayList;
        synchronized (this.g0) {
            arrayList = new ArrayList(this.X);
        }
        return arrayList;
    }
}
