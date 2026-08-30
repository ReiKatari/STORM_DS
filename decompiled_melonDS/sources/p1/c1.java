package p1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Size;
import android.util.TypedValue;
import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 implements fj.f0, m0.c {
    public Object A;
    public Object B;
    public Object L;

    public c1(int i2) {
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                fj.h hVar = fj.h.R;
                this.A = na.f.h(uuid);
                this.B = pi.v.f11797f;
                this.L = new ArrayList();
                return;
            case l1.c.f8509e /* 6 */:
                this.L = new Object();
                return;
            case 8:
                this.A = new WeakHashMap();
                this.B = new WeakHashMap();
                this.L = new WeakHashMap();
                return;
            case l1.c.f8510f /* 10 */:
                this.A = new AtomicReference(v2.h.f13613b);
                this.B = new Object();
                return;
            default:
                long[] jArr = a1.u0.f103a;
                this.A = new a1.m0();
                return;
        }
    }

    public static c1 o(Context context, AttributeSet attributeSet, int[] iArr, int i2) {
        return new c1(context, context.obtainStyledAttributes(attributeSet, iArr, i2, 0));
    }

    @Override // m0.c
    public void D(Object obj) {
        Void r22 = (Void) obj;
        d5.f fVar = (d5.f) this.A;
        fVar.f3843e = (d0.w) this.B;
        fVar.f3844f = k0.d.x((Context) this.L);
    }

    public void a(r0.l lVar, Map.Entry entry) {
        j0.d0 d0Var;
        r0.l lVar2 = (r0.l) entry.getValue();
        aj.g.o("SurfaceProcessorNode", "     -> outputEdge = " + lVar2);
        Size size = lVar.f12588g.f7235a;
        Rect rect = ((t0.b) entry.getKey()).f13048d;
        if (lVar.f12584c) {
            d0Var = (j0.d0) this.B;
        } else {
            d0Var = null;
        }
        d0.h hVar = new d0.h(size, rect, d0Var, ((t0.b) entry.getKey()).f13050f, ((t0.b) entry.getKey()).f13051g);
        int i2 = ((t0.b) entry.getKey()).f13047c;
        lVar2.getClass();
        l0.f.e();
        lVar2.a();
        p7.m.o("Consumer can only be linked once.", !lVar2.f12591j);
        lVar2.f12591j = true;
        r0.k kVar = lVar2.f12593l;
        m0.b g10 = m0.i.g(kVar.c(), new r0.j(lVar2, kVar, i2, hVar, null), ij.a.p0());
        g10.a(new m0.h(0, g10, new a0(this, lVar2, 7)), ij.a.p0());
    }

    public Object b() {
        Object removeLast;
        synchronized (this.B) {
            removeLast = ((ArrayDeque) this.A).removeLast();
        }
        return removeLast;
    }

    public void c(d0.y0 y0Var) {
        j0.u uVar;
        d0.t0 q10 = y0Var.q();
        Object obj = null;
        if (q10 instanceof n0.c) {
            uVar = ((n0.c) q10).f9723a;
        } else {
            uVar = null;
        }
        if (uVar == null || ((uVar.n() != j0.r.LOCKED_FOCUSED && uVar.n() != j0.r.PASSIVE_FOCUSED) || uVar.e() != j0.q.CONVERGED || uVar.h() != j0.s.CONVERGED)) {
            ((m9.o) this.L).getClass();
            y0Var.close();
            return;
        }
        synchronized (this.B) {
            try {
                if (((ArrayDeque) this.A).size() >= 3) {
                    obj = b();
                }
                ((ArrayDeque) this.A).addFirst(y0Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (((m9.o) this.L) != null && obj != null) {
            ((d0.y0) obj).close();
        }
    }

    public Object d() {
        long b10 = v2.h.b();
        if (b10 == v2.k.f13628a) {
            return this.L;
        }
        v2.j jVar = (v2.j) ((AtomicReference) this.A).get();
        int a10 = jVar.a(b10);
        if (a10 >= 0) {
            return jVar.f13627c[a10];
        }
        return null;
    }

    public ColorStateList e(int i2) {
        int resourceId;
        ColorStateList z10;
        TypedArray typedArray = (TypedArray) this.B;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0 && (z10 = aj.g.z((Context) this.A, resourceId)) != null) {
            return z10;
        }
        return typedArray.getColorStateList(i2);
    }

    public s4.b f() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((k0.g) this.L)) {
            try {
                s4.b bVar = (s4.b) this.B;
                if (bVar != null && localeList == ((LocaleList) this.A)) {
                    return bVar;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.add(new s4.a(localeList.get(i2)));
                }
                s4.b bVar2 = new s4.b(arrayList);
                this.A = localeList;
                this.B = bVar2;
                return bVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long g() {
        PackageInfo packageInfo;
        Context context = (Context) this.A;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            packageInfo = b6.c.d(packageManager, packageName, b6.c.e(0));
            packageInfo.getClass();
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            packageInfo.getClass();
        }
        if (i2 >= 28) {
            return a6.k.f(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public Drawable h(int i2) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.B;
        if (typedArray.hasValue(i2) && (resourceId = typedArray.getResourceId(i2, 0)) != 0) {
            return k7.w.p((Context) this.A, resourceId);
        }
        return typedArray.getDrawable(i2);
    }

    public Drawable i(int i2) {
        int resourceId;
        Drawable d4;
        if (((TypedArray) this.B).hasValue(i2) && (resourceId = ((TypedArray) this.B).getResourceId(i2, 0)) != 0) {
            q.r a10 = q.r.a();
            Context context = (Context) this.A;
            synchronized (a10) {
                d4 = a10.f12003a.d(context, resourceId, true);
            }
            return d4;
        }
        return null;
    }

    @Override // fj.f0
    public fj.g0 j() {
        return (fj.a0) this.B;
    }

    public Typeface k(int i2, int i10, q.r0 r0Var) {
        int resourceId = ((TypedArray) this.B).getResourceId(i2, 0);
        if (resourceId != 0) {
            if (((TypedValue) this.L) == null) {
                this.L = new TypedValue();
            }
            Context context = (Context) this.A;
            TypedValue typedValue = (TypedValue) this.L;
            ThreadLocal threadLocal = p5.k.f11352a;
            if (context.isRestricted()) {
                return null;
            }
            return p5.k.a(context, resourceId, typedValue, i10, r0Var, true, false);
        }
        return null;
    }

    public Size[] l(int i2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Size[] sizeArr;
        HashMap hashMap = (HashMap) this.L;
        Size[] sizeArr2 = null;
        if (hashMap.containsKey(Integer.valueOf(i2))) {
            if (((Size[]) hashMap.get(Integer.valueOf(i2))) == null) {
                return null;
            }
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i2))).clone();
        }
        try {
            sizeArr2 = ((StreamConfigurationMap) ((rd.k) this.A).B).getOutputSizes(i2);
        } catch (Throwable th2) {
            aj.g.z0("StreamConfigurationMapCompat", "Failed to get output sizes for " + i2, th2);
        }
        if (sizeArr2 != null && sizeArr2.length != 0) {
            a0.g gVar = (a0.g) this.B;
            gVar.getClass();
            ArrayList arrayList3 = new ArrayList(Arrays.asList(sizeArr2));
            if (((ExtraSupportedOutputSizeQuirk) gVar.B) != null) {
                if (i2 == 34 && "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL)) {
                    sizeArr = new Size[]{new Size(1440, 1080), new Size(960, 720)};
                } else {
                    sizeArr = new Size[0];
                }
                if (sizeArr.length > 0) {
                    arrayList3.addAll(Arrays.asList(sizeArr));
                }
            }
            a0.c cVar = (a0.c) gVar.L;
            cVar.getClass();
            if (((ExcludedSupportedSizesQuirk) z.a.f14847a.j(ExcludedSupportedSizesQuirk.class)) == null) {
                arrayList2 = new ArrayList();
            } else {
                String str = cVar.B;
                String str2 = Build.BRAND;
                if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i2 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if ("OnePlus".equalsIgnoreCase(str2) && "OnePlus6T".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i2 == 256) {
                        arrayList.add(new Size(4160, 3120));
                        arrayList.add(new Size(4000, 3000));
                    }
                } else if ("HUAWEI".equalsIgnoreCase(str2) && "HWANE".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(720, 720));
                        arrayList.add(new Size(400, 400));
                    }
                } else if (ExcludedSupportedSizesQuirk.e()) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i2 != 34) {
                            if (i2 == 35) {
                                arrayList.add(new Size(4128, 2322));
                                arrayList.add(new Size(3088, 3088));
                                arrayList.add(new Size(3264, 2448));
                                arrayList.add(new Size(3264, 1836));
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(3264, 2448));
                        arrayList.add(new Size(3264, 1836));
                        arrayList.add(new Size(2448, 2448));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if (ExcludedSupportedSizesQuirk.d()) {
                    arrayList = new ArrayList();
                    if (str.equals("0")) {
                        if (i2 != 34) {
                            if (i2 == 35) {
                                arrayList.add(new Size(2048, 1536));
                                arrayList.add(new Size(2048, 1152));
                                arrayList.add(new Size(1920, 1080));
                            }
                        } else {
                            arrayList.add(new Size(4128, 3096));
                            arrayList.add(new Size(4128, 2322));
                            arrayList.add(new Size(3088, 3088));
                            arrayList.add(new Size(3264, 2448));
                            arrayList.add(new Size(3264, 1836));
                            arrayList.add(new Size(2048, 1536));
                            arrayList.add(new Size(2048, 1152));
                            arrayList.add(new Size(1920, 1080));
                        }
                    } else if (str.equals("1") && (i2 == 34 || i2 == 35)) {
                        arrayList.add(new Size(2576, 1932));
                        arrayList.add(new Size(2560, 1440));
                        arrayList.add(new Size(1920, 1920));
                        arrayList.add(new Size(2048, 1536));
                        arrayList.add(new Size(2048, 1152));
                        arrayList.add(new Size(1920, 1080));
                    }
                } else if ("REDMI".equalsIgnoreCase(str2) && "joyeuse".equalsIgnoreCase(Build.DEVICE)) {
                    arrayList = new ArrayList();
                    if (str.equals("0") && i2 == 256) {
                        arrayList.add(new Size(9280, 6944));
                    }
                } else if (ExcludedSupportedSizesQuirk.c()) {
                    ArrayList arrayList4 = new ArrayList();
                    arrayList2 = arrayList4;
                    if (i2 == 35) {
                        arrayList4.add(new Size(3840, 2160));
                        arrayList4.add(new Size(3264, 2448));
                        arrayList4.add(new Size(3200, 2400));
                        arrayList4.add(new Size(2688, 1512));
                        arrayList4.add(new Size(2592, 1944));
                        arrayList4.add(new Size(2592, 1940));
                        arrayList4.add(new Size(1920, 1440));
                        arrayList2 = arrayList4;
                    }
                } else if (ExcludedSupportedSizesQuirk.b()) {
                    ArrayList arrayList5 = new ArrayList();
                    arrayList2 = arrayList5;
                    if (i2 == 35) {
                        arrayList5.add(new Size(4032, 3024));
                        arrayList5.add(new Size(4000, 3000));
                        arrayList5.add(new Size(3264, 2448));
                        arrayList5.add(new Size(3200, 2400));
                        arrayList5.add(new Size(3024, 3024));
                        arrayList5.add(new Size(2976, 2976));
                        arrayList5.add(new Size(2448, 2448));
                        arrayList2 = arrayList5;
                    }
                } else {
                    aj.g.y0("ExcludedSupportedSizesQuirk", "Cannot retrieve list of supported sizes to exclude on this device.");
                    arrayList2 = Collections.EMPTY_LIST;
                }
                arrayList2 = arrayList;
            }
            if (!arrayList2.isEmpty()) {
                arrayList3.removeAll(arrayList2);
            }
            if (arrayList3.isEmpty()) {
                aj.g.y0("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
            }
            Size[] sizeArr3 = (Size[]) arrayList3.toArray(new Size[0]);
            hashMap.put(Integer.valueOf(i2), sizeArr3);
            return (Size[]) sizeArr3.clone();
        }
        aj.g.y0("StreamConfigurationMapCompat", "Retrieved output sizes array is null or empty for format " + i2);
        return sizeArr2;
    }

    @Override // fj.f0
    public fj.e0 m() {
        return (fj.z) this.L;
    }

    public boolean n() {
        if (((s2) this.A).getValue() == this.B) {
            c1 c1Var = (c1) this.L;
            if (c1Var == null || !c1Var.n()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void p() {
        ((TypedArray) this.B).recycle();
    }

    public void q(zf.k kVar) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.L;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = arrayList.get(i2);
                i2++;
                if (((zf.k) obj).a() == kVar.a()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            arrayList.add(kVar);
            return;
        }
        throw new Exception(w.d.m("Migration from version ", kVar.a(), " already exists"));
    }

    public void r(Object obj) {
        long b10 = v2.h.b();
        if (b10 == v2.k.f13628a) {
            this.L = obj;
            return;
        }
        synchronized (this.B) {
            v2.j jVar = (v2.j) ((AtomicReference) this.A).get();
            int a10 = jVar.a(b10);
            if (a10 < 0) {
                ((AtomicReference) this.A).set(jVar.b(b10, obj));
            } else {
                jVar.f13627c[a10] = obj;
            }
        }
    }

    public void s() {
        a1.m0 m0Var = (a1.m0) this.A;
        String str = (String) this.B;
        List list = (List) m0Var.k(str);
        if (list != null) {
            list.remove((mc.a) this.L);
        }
        if (list != null && !list.isEmpty()) {
            m0Var.m(str, list);
        }
    }

    @Override // m0.c
    public void z(Throwable th2) {
        Object obj;
        d5.f fVar = (d5.f) this.A;
        r0.b bVar = new r0.b(11, fVar);
        if (l0.f.t()) {
            bVar.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            p7.m.o("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new ad.c(15, bVar, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e6) {
                throw new RuntimeException(e6);
            }
        }
        d0.w wVar = (d0.w) fVar.f3843e;
        if (wVar != null) {
            synchronized (wVar.f3485b) {
                try {
                    wVar.f3488e.removeCallbacksAndMessages("retry_token");
                    int ordinal = wVar.f3497o.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2 || ordinal == 3) {
                                wVar.f3497o = d0.v.SHUTDOWN;
                                d0.w.a(wVar.f3499q);
                                wVar.f3498p = a.a.A(new ah.e(5, wVar));
                            }
                            obj = wVar.f3498p;
                        } else {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                    } else {
                        wVar.f3497o = d0.v.SHUTDOWN;
                        obj = m0.k.L;
                    }
                } finally {
                }
            }
        } else {
            obj = m0.k.L;
        }
        obj.getClass();
        synchronized (fVar.f3839a) {
            fVar.f3840b = null;
            fVar.f3841c = obj;
            ((HashMap) fVar.f3845g).clear();
            ((HashSet) fVar.f3846h).clear();
        }
        fVar.f3843e = null;
        fVar.f3844f = null;
    }

    public c1(b9.e eVar) {
        this.A = eVar;
        this.B = ij.a.x((gj.e) eVar.R);
        this.L = ij.a.w((gj.d) eVar.X);
    }

    public c1(Context context, TypedArray typedArray) {
        this.A = context;
        this.B = typedArray;
    }

    public c1(p4.r rVar, c1 c1Var) {
        this.A = rVar;
        this.L = c1Var;
        this.B = rVar.A;
    }

    public /* synthetic */ c1(Object obj, Object obj2, Object obj3) {
        this.A = obj;
        this.B = obj2;
        this.L = obj3;
    }
}
