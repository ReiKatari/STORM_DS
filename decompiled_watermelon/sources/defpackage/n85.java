package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.util.TypedValue;
import android.view.Surface;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n85  reason: default package */
/* loaded from: classes.dex */
public final class n85 implements t11, oj2 {
    public static n85 X;
    public final /* synthetic */ int A;
    public final Object B;
    public final Object L;
    public Object R;

    public n85(td0 td0Var, Size size) {
        Rational rational;
        this.A = 10;
        this.B = td0Var;
        td0Var.b();
        td0Var.c();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List m = td0Var.m(256);
            if (m.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(m, new es0(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.L = rational;
        this.R = new l30(td0Var, rational);
    }

    public static ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(uu.a);
        arrayList2.add(uu.c);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Size size2 = (Size) obj;
            Rational rational = new Rational(size2.getWidth(), size2.getHeight());
            if (!arrayList2.contains(rational)) {
                int size3 = arrayList2.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size3) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        if (uu.a((Rational) obj2, size2)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational n(int i, boolean z) {
        if (i != -1 && i != 0) {
            if (i != 1) {
                ve2.w("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i);
                return null;
            } else if (z) {
                return uu.c;
            } else {
                return uu.d;
            }
        } else if (z) {
            return uu.a;
        } else {
            return uu.b;
        }
    }

    public static HashMap o(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        ArrayList j = j(arrayList);
        int size = j.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = j.get(i2);
            i2++;
            hashMap.put((Rational) obj, new ArrayList());
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            Size size3 = (Size) obj2;
            for (Rational rational : hashMap.keySet()) {
                if (uu.a(rational, size3)) {
                    ((List) hashMap.get(rational)).add(size3);
                }
            }
        }
        return hashMap;
    }

    public static n85 q(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new n85(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public static void v(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void w(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public void a(a1 a1Var) {
        HashSet hashSet = (HashSet) this.R;
        ArrayList arrayList = (ArrayList) this.L;
        if (!arrayList.contains(a1Var)) {
            if (!hashSet.contains(a1Var)) {
                hashSet.add(a1Var);
                a1Var.a(this);
                hashSet.remove(a1Var);
                if (!arrayList.contains(a1Var)) {
                    if (e21.class.isAssignableFrom(a1Var.getClass())) {
                        arrayList.add(0, a1Var);
                        return;
                    } else {
                        arrayList.add(a1Var);
                        return;
                    }
                }
                return;
            }
            f81.z(hashSet, "Cyclic dependency chain found: ");
        }
    }

    public void b(wj6 wj6Var, Map.Entry entry) {
        vd0 vd0Var;
        wj6 wj6Var2 = (wj6) entry.getValue();
        ve2.v("SurfaceProcessorNode", "     -> outputEdge = " + wj6Var2);
        Size size = wj6Var.g.a;
        Rect rect = ((fx) entry.getKey()).d;
        if (wj6Var.c) {
            vd0Var = (vd0) this.L;
        } else {
            vd0Var = null;
        }
        kx kxVar = new kx(size, rect, vd0Var, ((fx) entry.getKey()).f, ((fx) entry.getKey()).g);
        int i = ((fx) entry.getKey()).c;
        wj6Var2.getClass();
        nk2.s();
        wj6Var2.a();
        nl2.D("Consumer can only be linked once.", !wj6Var2.j);
        wj6Var2.j = true;
        vj6 vj6Var = wj6Var2.l;
        cj0 f0 = jv3.f0(vj6Var.c(), new uj6(wj6Var2, vj6Var, i, kxVar, null), iq2.x());
        f0.a(new qj2(0, f0, new ci3(26, this, wj6Var2, false)), iq2.x());
    }

    public Object c() {
        Object removeLast;
        synchronized (this.L) {
            removeLast = ((ArrayDeque) this.B).removeLast();
        }
        return removeLast;
    }

    public Object d() {
        long s = jk2.s();
        if (s == bt6.a) {
            return this.R;
        }
        xs6 xs6Var = (xs6) ((AtomicReference) this.B).get();
        int a = xs6Var.a(s);
        if (a >= 0) {
            return xs6Var.c[a];
        }
        return null;
    }

    public ColorStateList e(int i) {
        int resourceId;
        ColorStateList x;
        TypedArray typedArray = (TypedArray) this.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (x = jv3.x((Context) this.B, resourceId)) != null) {
            return x;
        }
        return typedArray.getColorStateList(i);
    }

    public Drawable f(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.L;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return l07.M((Context) this.B, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public Drawable g(int i) {
        int resourceId;
        Drawable d;
        if (((TypedArray) this.L).hasValue(i) && (resourceId = ((TypedArray) this.L).getResourceId(i, 0)) != 0) {
            vq a = vq.a();
            Context context = (Context) this.B;
            synchronized (a) {
                d = a.a.d(context, resourceId, true);
            }
            return d;
        }
        return null;
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
        boolean z = th instanceof CancellationException;
        i90 i90Var = (i90) this.L;
        if (z) {
            nl2.D(null, i90Var.c(new RuntimeException(((String) this.R).concat(" cancelled."), th)));
        } else {
            i90Var.a(null);
        }
    }

    public Typeface i(int i, int i2, ur urVar) {
        int resourceId = ((TypedArray) this.L).getResourceId(i, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.R) == null) {
                this.R = new TypedValue();
            }
            Context context = (Context) this.B;
            TypedValue typedValue = (TypedValue) this.R;
            ThreadLocal threadLocal = ac5.a;
            if (context.isRestricted()) {
                return null;
            }
            return ac5.b(context, resourceId, typedValue, i2, urVar, true, false);
        }
        return null;
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        String b = ((t63) ((dz4) this.R).A).b((m93) this.L, obj);
        int i = ua5.a;
        return ln2.z(b, (cw3) this.B);
    }

    @Override // defpackage.oj2
    public void l(Object obj) {
        Surface surface = (Surface) obj;
        jv3.R(true, (fq3) this.B, (i90) this.L, iq2.l());
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ce, code lost:
        if (defpackage.x76.a(r5) < (r2.getHeight() * r2.getWidth())) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList m(defpackage.b57 r15) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n85.m(b57):java.util.ArrayList");
    }

    public boolean p() {
        if (((ae6) this.B).getValue() == this.R) {
            n85 n85Var = (n85) this.L;
            if (n85Var == null || !n85Var.p()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void r(Activity activity, kg7 kg7Var) {
        WeakHashMap weakHashMap = (WeakHashMap) this.R;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.L;
        reentrantLock.lock();
        try {
            if (kg7Var.equals((kg7) weakHashMap.get(activity))) {
                return;
            }
            kg7 kg7Var2 = (kg7) weakHashMap.put(activity, kg7Var);
            reentrantLock.unlock();
            Iterator it = ((l66) ((dz4) this.B).A).b.iterator();
            it.getClass();
            while (it.hasNext()) {
                k66 k66Var = (k66) it.next();
                if (k66Var.a.equals(activity)) {
                    k66Var.d = kg7Var;
                    k66Var.b.execute(new xc4(4, k66Var, kg7Var));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void s(pm3 pm3Var) {
        v06 v06Var = (v06) this.R;
        if (v06Var != null) {
            v06Var.run();
        }
        v06 v06Var2 = new v06((in3) this.B, pm3Var);
        this.R = v06Var2;
        ((Handler) this.L).postAtFrontOfQueue(v06Var2);
    }

    public void t() {
        ((TypedArray) this.L).recycle();
    }

    public String toString() {
        switch (this.A) {
            case 1:
                List list = (List) this.L;
                StringBuilder sb = new StringBuilder("Request{");
                sb.append((Uri) this.B);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            c44.b();
                            return null;
                        }
                        sb.append(' ');
                        throw null;
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(Object obj) {
        long s = jk2.s();
        if (s == bt6.a) {
            this.R = obj;
            return;
        }
        synchronized (this.L) {
            xs6 xs6Var = (xs6) ((AtomicReference) this.B).get();
            int a = xs6Var.a(s);
            if (a < 0) {
                ((AtomicReference) this.B).set(xs6Var.b(s, obj));
            } else {
                xs6Var.c[a] = obj;
            }
        }
    }

    public void x() {
        d24 d24Var = (d24) this.B;
        String str = (String) this.L;
        List list = (List) d24Var.k(str);
        if (list != null) {
            list.remove((ki2) this.R);
        }
        if (list != null && !list.isEmpty()) {
            d24Var.m(str, list);
        }
    }

    public n85(ArrayList arrayList) {
        this.A = 0;
        this.B = arrayList;
        this.L = new ArrayList(arrayList.size());
        this.R = new HashSet(3);
    }

    public n85(SystemForegroundService systemForegroundService) {
        this.A = 5;
        this.B = new in3(systemForegroundService, true);
        this.L = new Handler(Looper.getMainLooper());
    }

    public n85(int i, byte b) {
        this.A = i;
        switch (i) {
            case 16:
                this.B = new WeakHashMap();
                this.L = new WeakHashMap();
                this.R = new WeakHashMap();
                return;
            default:
                this.B = new AtomicReference(dt3.f0);
                this.L = new Object();
                return;
        }
    }

    public n85(eg4 eg4Var) {
        this.A = 6;
        this.B = eg4Var;
        this.L = w81.f(1);
        this.R = w81.g(tp0.a);
    }

    public n85(int i) {
        this.A = 9;
        this.B = new long[i];
        this.L = new BitSet(i);
        this.R = new long[i];
    }

    public n85(vd6 vd6Var) {
        this.A = 17;
        this.L = new Object();
        this.B = new ArrayDeque(3);
        this.R = vd6Var;
    }

    public n85(Context context, TypedArray typedArray) {
        this.A = 13;
        this.B = context;
        this.L = typedArray;
    }

    public n85(Context context, LocationManager locationManager) {
        this.A = 14;
        this.R = new Object();
        this.B = context;
        this.L = locationManager;
    }

    public /* synthetic */ n85(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public n85(vd0 vd0Var, sb1 sb1Var) {
        this.A = 11;
        this.L = vd0Var;
        this.B = sb1Var;
    }

    public n85(Uri uri, mn4 mn4Var) {
        this.A = 1;
        this.B = uri;
        this.L = null;
        this.R = mn4Var;
    }

    public n85(p63 p63Var, bj2 bj2Var) {
        this.A = 3;
        this.B = p63Var;
        this.L = bj2Var;
        this.R = lt0.L;
    }

    public n85(b17 b17Var, n85 n85Var) {
        this.A = 15;
        this.B = b17Var;
        this.L = n85Var;
        this.R = b17Var.getValue();
    }

    public n85(dz4 dz4Var) {
        this.A = 7;
        this.B = dz4Var;
        this.L = new ReentrantLock();
        this.R = new WeakHashMap();
    }
}
