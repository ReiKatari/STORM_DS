package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh  reason: default package */
/* loaded from: classes.dex */
public final class qh implements rw2 {
    public final /* synthetic */ int A;
    public boolean B;
    public Object L;
    public final Object R;

    public qh(ce0 ce0Var) {
        boolean z;
        this.A = 2;
        ce0Var.getClass();
        this.L = ce0Var;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((ia0) ce0Var).c(key);
        if (iArr != null) {
            z = nu.Y(iArr, 18);
        } else {
            z = false;
        }
        this.B = z;
        this.R = dt3.i0(ce0Var);
    }

    public static boolean e(sm1 sm1Var, sm1 sm1Var2) {
        int i;
        boolean b = sm1Var2.b();
        int i2 = sm1Var2.a;
        if (b) {
            int i3 = sm1Var.a;
            if ((i3 == 2 && i2 == 1) || ((i3 != 2 && i3 != 0 && i3 != i2) || ((i = sm1Var.b) != 0 && i != sm1Var2.b))) {
                return false;
            }
            return true;
        }
        i.m(sm1Var2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static boolean h(sm1 sm1Var, sm1 sm1Var2, Set set) {
        if (!set.contains(sm1Var2)) {
            if (ve2.D("CXCP")) {
                Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + sm1Var + "\nCandidate dynamic range:\n  " + sm1Var2);
                return false;
            }
            return false;
        }
        return e(sm1Var, sm1Var2);
    }

    public static String i(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static sm1 j(sm1 sm1Var, LinkedHashSet linkedHashSet, Set set) {
        if (sm1Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sm1 sm1Var2 = (sm1) it.next();
                int i = sm1Var2.a;
                if (sm1Var2.b()) {
                    if (i != 1 && h(sm1Var, sm1Var2, set)) {
                        return sm1Var2;
                    }
                } else {
                    i.n("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
            }
        }
        return null;
    }

    public static void q(Set set, sm1 sm1Var, t71 t71Var) {
        Set set2 = set;
        nl2.D("Cannot update already-empty constraints.", !set2.isEmpty());
        t71Var.getClass();
        sm1Var.getClass();
        Set b = ((vm1) t71Var.B).b(sm1Var);
        Set set3 = b;
        if (!set3.isEmpty()) {
            Set s1 = tq0.s1(set);
            set.retainAll(set3);
            if (set2.isEmpty()) {
                c44.m("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", sm1Var, "\nConstraints:\n  ", b, "\nExisting constraints:\n  ", s1);
            }
        }
    }

    @Override // defpackage.rw2
    public int a() {
        int height;
        synchronized (this.R) {
            height = ((ImageReader) this.L).getHeight();
        }
        return height;
    }

    @Override // defpackage.rw2
    public ow2 b() {
        Image image;
        synchronized (this.R) {
            try {
                image = ((ImageReader) this.L).acquireLatestImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new oh(image);
        }
    }

    @Override // defpackage.rw2
    public int c() {
        int width;
        synchronized (this.R) {
            width = ((ImageReader) this.L).getWidth();
        }
        return width;
    }

    @Override // defpackage.rw2
    public void close() {
        synchronized (this.R) {
            ((ImageReader) this.L).close();
        }
    }

    @Override // defpackage.rw2
    public int d() {
        int imageFormat;
        synchronized (this.R) {
            imageFormat = ((ImageReader) this.L).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.rw2
    public void f() {
        synchronized (this.R) {
            this.B = true;
            ((ImageReader) this.L).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.rw2
    public void g(final qw2 qw2Var, final Executor executor) {
        Handler handler;
        synchronized (this.R) {
            this.B = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: ph
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    qh qhVar = qh.this;
                    Executor executor2 = executor;
                    qw2 qw2Var2 = qw2Var;
                    synchronized (qhVar.R) {
                        try {
                            if (!qhVar.B) {
                                executor2.execute(new we(1, qhVar, qw2Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.L;
            if (ct3.A != null) {
                handler = ct3.A;
            } else {
                synchronized (ct3.class) {
                    if (ct3.A == null) {
                        ct3.A = me2.n(Looper.getMainLooper());
                    }
                }
                handler = ct3.A;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // defpackage.rw2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.R) {
            surface = ((ImageReader) this.L).getSurface();
        }
        return surface;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0134, code lost:
        if (defpackage.l07.S(r0[0]) != java.lang.String.class) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.y84 k(defpackage.n07 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qh.k(n07, boolean):y84");
    }

    public c41 l() {
        yp0 yp0Var = (yp0) this.R;
        int i = yp0Var.b;
        int i2 = yp0Var.c;
        if (i < i2) {
            return c41.NOT_CROSSED;
        }
        if (i > i2) {
            return c41.CROSSED;
        }
        return c41.COLLAPSED;
    }

    public void m() {
        if (this.B) {
            bq6.b((bq6) this.R, (vr6) this.L);
        }
    }

    @Override // defpackage.rw2
    public int n() {
        int maxImages;
        synchronized (this.R) {
            maxImages = ((ImageReader) this.L).getMaxImages();
        }
        return maxImages;
    }

    public LinkedHashMap o(ArrayList arrayList, List list, List list2) {
        sm1 sm1Var;
        int i;
        int i2;
        sm1 sm1Var2;
        ArrayList arrayList2;
        Set set;
        sm1 sm1Var3;
        String str;
        t71 t71Var = (t71) this.R;
        LinkedHashSet<sm1> linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            sm1 sm1Var4 = ((pw) obj).d;
            sm1Var4.getClass();
            linkedHashSet.add(sm1Var4);
        }
        Set a = ((vm1) t71Var.B).a();
        Set<sm1> r1 = tq0.r1(a);
        for (sm1 sm1Var5 : linkedHashSet) {
            q(r1, sm1Var5, t71Var);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            sm1Var = sm1.c;
            if (!hasNext) {
                break;
            }
            b57 b57Var = (b57) list.get(((Number) it.next()).intValue());
            sm1 sm1Var6 = (sm1) b57Var.d(fw2.n, sm1Var);
            sm1Var6.getClass();
            if (sm1Var6.equals(sm1Var)) {
                arrayList5.add(b57Var);
            } else {
                int i5 = sm1Var6.a;
                int i6 = sm1Var6.b;
                if (i5 != 2 && ((i5 == 0 || i6 != 0) && (i5 != 0 || i6 == 0))) {
                    arrayList3.add(b57Var);
                } else {
                    arrayList4.add(b57Var);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList arrayList6 = new ArrayList();
        arrayList6.addAll(arrayList3);
        arrayList6.addAll(arrayList4);
        arrayList6.addAll(arrayList5);
        int size2 = arrayList6.size();
        while (i3 < size2) {
            Object obj2 = arrayList6.get(i3);
            int i7 = i3 + 1;
            b57 b57Var2 = (b57) obj2;
            sm1 sm1Var7 = (sm1) b57Var2.d(fw2.n, sm1Var);
            sm1Var7.getClass();
            String str2 = (String) b57Var2.g(an6.z);
            str2.getClass();
            if (sm1Var7.b()) {
                set = a;
                i = i7;
                i2 = size2;
                if (r1.contains(sm1Var7)) {
                    r12 = sm1Var7;
                    sm1Var2 = sm1Var;
                    arrayList2 = arrayList6;
                }
                sm1Var2 = sm1Var;
                arrayList2 = arrayList6;
                r12 = null;
            } else {
                int i8 = sm1Var7.a;
                int i9 = sm1Var7.b;
                i = i7;
                i2 = size2;
                sm1 sm1Var8 = sm1.d;
                if (i8 == 1 && i9 == 0) {
                    set = a;
                    if (r1.contains(sm1Var8)) {
                        r12 = sm1Var8;
                        sm1Var2 = sm1Var;
                        arrayList2 = arrayList6;
                    }
                    sm1Var2 = sm1Var;
                    arrayList2 = arrayList6;
                    r12 = null;
                } else {
                    sm1 j = j(sm1Var7, linkedHashSet, r1);
                    sm1Var2 = sm1Var;
                    arrayList2 = arrayList6;
                    set = a;
                    if (j != null) {
                        if (ve2.D("CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from existing attached surface.\n" + sm1Var7 + "\n->\n" + j);
                        }
                    } else {
                        j = j(sm1Var7, linkedHashSet2, r1);
                        if (j != null) {
                            if (ve2.D("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from concurrently bound use case.\n" + sm1Var7 + "\n->\n" + j);
                            }
                        } else if (h(sm1Var7, sm1Var8, r1)) {
                            if (ve2.D("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " to no compatible HDR dynamic ranges.\n" + sm1Var7 + "\n->\n" + sm1Var8);
                            }
                            r12 = sm1Var8;
                        } else {
                            if (i8 == 2 && (i9 == 10 || i9 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    sm1Var3 = p2.f((ce0) this.L);
                                    if (sm1Var3 != null) {
                                        linkedHashSet3.add(sm1Var3);
                                    }
                                } else {
                                    sm1Var3 = null;
                                }
                                linkedHashSet3.add(sm1.e);
                                r12 = j(sm1Var7, linkedHashSet3, r1);
                                if (r12 != null) {
                                    if (ve2.D("CXCP")) {
                                        StringBuilder u = b31.u("DynamicRangeResolver: Resolved dynamic range for use case ", str2, "from ");
                                        if (r12.equals(sm1Var3)) {
                                            str = "recommended";
                                        } else {
                                            str = "required";
                                        }
                                        u.append(str);
                                        u.append(" 10-bit supported dynamic range.\n");
                                        u.append(sm1Var7);
                                        u.append("\n->\n");
                                        u.append(r12);
                                        Log.d("CXCP", u.toString());
                                    }
                                }
                            }
                            for (sm1 sm1Var9 : r1) {
                                if (sm1Var9.b()) {
                                    if (!sm1Var9.equals(sm1Var8) && e(sm1Var7, sm1Var9)) {
                                        if (ve2.D("CXCP")) {
                                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + sm1Var7 + "\n->\n" + sm1Var9);
                                        }
                                    }
                                } else {
                                    i.n("Candidate dynamic range must be fully specified.");
                                    return null;
                                }
                            }
                            sm1Var9 = null;
                        }
                    }
                    sm1Var9 = j;
                }
            }
            if (sm1Var9 != null) {
                q(r1, sm1Var9, t71Var);
                linkedHashMap.put(b57Var2, sm1Var9);
                if (!linkedHashSet.contains(sm1Var9)) {
                    linkedHashSet2.add(sm1Var9);
                }
                i3 = i;
                size2 = i2;
                sm1Var = sm1Var2;
                arrayList6 = arrayList2;
                a = set;
            } else {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) b57Var2.g(an6.z)) + "\nRequested dynamic range:\n  " + sm1Var7 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + r1);
            }
        }
        return linkedHashMap;
    }

    @Override // defpackage.rw2
    public ow2 p() {
        Image image;
        synchronized (this.R) {
            try {
                image = ((ImageReader) this.L).acquireNextImage();
            } catch (RuntimeException e) {
                if ("ImageReaderContext is not initialized".equals(e.getMessage())) {
                    image = null;
                } else {
                    throw e;
                }
            }
            if (image == null) {
                return null;
            }
            return new oh(image);
        }
    }

    public long r(oq6 oq6Var, long j, boolean z, c44 c44Var) {
        gp2 gp2Var;
        bq6 bq6Var = (bq6) this.R;
        long c = bq6.c(bq6Var, oq6Var, j, z, false, c44Var, false, null);
        if (!vr6.a(c, (vr6) this.L)) {
            this.B = false;
        }
        if (vr6.c(c)) {
            gp2Var = gp2.Cursor;
        } else {
            gp2Var = gp2.Selection;
        }
        bq6Var.q(gp2Var);
        return c;
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return ((Map) this.L).toString();
            case 4:
                return "SingleSelectionLayout(isStartHandle=" + this.B + ", crossed=" + l() + ", info=\n\t" + ((yp0) this.R) + ')';
            default:
                return super.toString();
        }
    }

    public qh(ImageReader imageReader) {
        this.A = 0;
        this.R = new Object();
        this.B = true;
        this.L = imageReader;
    }

    public qh(List list, Map map, boolean z) {
        this.A = 1;
        this.L = map;
        this.B = z;
        this.R = list;
    }

    public qh(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.A = 3;
        ox4 ox4Var = ne1.a;
        if (ne1.a.b(LowMemoryQuirk.class) != null) {
            this.L = new g06(executor);
        } else {
            this.L = executor;
        }
        this.R = ox4Var;
        this.B = ox4Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public qh(boolean z, ry5 ry5Var, yp0 yp0Var) {
        this.A = 4;
        this.B = z;
        this.L = ry5Var;
        this.R = yp0Var;
    }

    public qh(bq6 bq6Var) {
        this.A = 5;
        this.R = bq6Var;
        this.B = true;
    }
}
