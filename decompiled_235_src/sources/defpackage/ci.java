package defpackage;

import android.app.Activity;
import android.hardware.camera2.CameraCharacteristics;
import android.media.Image;
import android.media.ImageReader;
import android.media.projection.MediaProjectionManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Surface;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci implements v23, ILoggerFactory {
    public final /* synthetic */ int A;
    public boolean B;
    public Object L;
    public final Object R;

    public ci(lg0 lg0Var) {
        boolean z;
        this.A = 2;
        lg0Var.getClass();
        this.L = lg0Var;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((qc0) lg0Var).c(key);
        if (iArr != null) {
            z = fv.m0(iArr, 18);
        } else {
            z = false;
        }
        this.B = z;
        this.R = ak7.T(lg0Var);
    }

    public static boolean c(yq1 yq1Var, yq1 yq1Var2) {
        int i;
        boolean b = yq1Var2.b();
        int i2 = yq1Var2.a;
        if (b) {
            int i3 = yq1Var.a;
            if ((i3 == 2 && i2 == 1) || ((i3 != 2 && i3 != 0 && i3 != i2) || ((i = yq1Var.b) != 0 && i != yq1Var2.b))) {
                return false;
            }
            return true;
        }
        e41.g(yq1Var2, " not actually fully specified.", "Fully specified range ");
        return false;
    }

    public static boolean h(yq1 yq1Var, yq1 yq1Var2, Set set) {
        if (!set.contains(yq1Var2)) {
            if (kj2.F("CXCP")) {
                Log.d("CXCP", "DynamicRangeResolver: Candidate Dynamic range is not within constraints.\nDynamic range to resolve:\n  " + yq1Var + "\nCandidate dynamic range:\n  " + yq1Var2);
                return false;
            }
            return false;
        }
        return c(yq1Var, yq1Var2);
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

    public static yq1 k(yq1 yq1Var, LinkedHashSet linkedHashSet, Set set) {
        if (yq1Var.a != 1) {
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                yq1 yq1Var2 = (yq1) it.next();
                int i = yq1Var2.a;
                if (yq1Var2.b()) {
                    if (i != 1 && h(yq1Var, yq1Var2, set)) {
                        return yq1Var2;
                    }
                } else {
                    i.m("Fully specified DynamicRange must have fully defined encoding.");
                    break;
                }
            }
        }
        return null;
    }

    public static void p(Set set, yq1 yq1Var, d51 d51Var) {
        Set set2 = set;
        np2.A("Cannot update already-empty constraints.", !set2.isEmpty());
        d51Var.getClass();
        yq1Var.getClass();
        Set c = ((br1) d51Var.B).c(yq1Var);
        Set set3 = c;
        if (!set3.isEmpty()) {
            Set p1 = gt0.p1(set);
            set.retainAll(set3);
            if (set2.isEmpty()) {
                u34.n("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  ", yq1Var, "\nConstraints:\n  ", c, "\nExisting constraints:\n  ", p1);
            }
        }
    }

    @Override // defpackage.v23
    public s23 a() {
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
            return new ai(image);
        }
    }

    @Override // defpackage.v23
    public int b() {
        int imageFormat;
        synchronized (this.R) {
            imageFormat = ((ImageReader) this.L).getImageFormat();
        }
        return imageFormat;
    }

    @Override // defpackage.v23
    public void close() {
        synchronized (this.R) {
            ((ImageReader) this.L).close();
        }
    }

    @Override // defpackage.v23
    public void d() {
        synchronized (this.R) {
            this.B = true;
            ((ImageReader) this.L).setOnImageAvailableListener(null, null);
        }
    }

    @Override // defpackage.v23
    public void e(final u23 u23Var, final Executor executor) {
        Handler handler;
        synchronized (this.R) {
            this.B = false;
            ImageReader.OnImageAvailableListener onImageAvailableListener = new ImageReader.OnImageAvailableListener() { // from class: bi
                @Override // android.media.ImageReader.OnImageAvailableListener
                public final void onImageAvailable(ImageReader imageReader) {
                    ci ciVar = ci.this;
                    Executor executor2 = executor;
                    u23 u23Var2 = u23Var;
                    synchronized (ciVar.R) {
                        try {
                            if (!ciVar.B) {
                                executor2.execute(new mf(1, ciVar, u23Var2));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            };
            ImageReader imageReader = (ImageReader) this.L;
            if (f04.a != null) {
                handler = f04.a;
            } else {
                synchronized (f04.class) {
                    if (f04.a == null) {
                        f04.a = uj2.u(Looper.getMainLooper());
                    }
                }
                handler = f04.a;
            }
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
        }
    }

    @Override // defpackage.v23
    public int f() {
        int maxImages;
        synchronized (this.R) {
            maxImages = ((ImageReader) this.L).getMaxImages();
        }
        return maxImages;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized ry3 g(String str) {
        zt6 zt6Var;
        zt6Var = (zt6) ((HashMap) this.L).get(str);
        if (zt6Var == null) {
            zt6Var = new zt6(str, (LinkedBlockingQueue) this.R, this.B);
            ((HashMap) this.L).put(str, zt6Var);
        }
        return zt6Var;
    }

    @Override // defpackage.v23
    public int getHeight() {
        int height;
        synchronized (this.R) {
            height = ((ImageReader) this.L).getHeight();
        }
        return height;
    }

    @Override // defpackage.v23
    public Surface getSurface() {
        Surface surface;
        synchronized (this.R) {
            surface = ((ImageReader) this.L).getSurface();
        }
        return surface;
    }

    @Override // defpackage.v23
    public int getWidth() {
        int width;
        synchronized (this.R) {
            width = ((ImageReader) this.L).getWidth();
        }
        return width;
    }

    @Override // defpackage.v23
    public s23 j() {
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
            return new ai(image);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0135, code lost:
        if (defpackage.q60.J(r0[0]) != java.lang.String.class) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ph4 l(ie7 ie7Var, boolean z) {
        ph4 ph4Var;
        ph4 h61Var;
        String str;
        final Type type = ie7Var.b;
        Class cls = ie7Var.a;
        Map map = (Map) this.L;
        i iVar = null;
        if (map.get(type) == null) {
            if (map.get(cls) == null) {
                if (EnumSet.class.isAssignableFrom(cls)) {
                    ph4Var = new ph4() { // from class: y21
                        @Override // defpackage.ph4
                        public final Object e() {
                            int i = r1;
                            Type type2 = type;
                            switch (i) {
                                case 0:
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        throw new RuntimeException("Invalid EnumSet type: " + type2);
                                    }
                                    throw new RuntimeException("Invalid EnumSet type: " + type2);
                                default:
                                    if (type2 instanceof ParameterizedType) {
                                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type4 instanceof Class) {
                                            return new EnumMap((Class) type4);
                                        }
                                        throw new RuntimeException("Invalid EnumMap type: " + type2);
                                    }
                                    throw new RuntimeException("Invalid EnumMap type: " + type2);
                            }
                        }
                    };
                } else if (cls == EnumMap.class) {
                    ph4Var = new ph4() { // from class: y21
                        @Override // defpackage.ph4
                        public final Object e() {
                            int i = r1;
                            Type type2 = type;
                            switch (i) {
                                case 0:
                                    if (type2 instanceof ParameterizedType) {
                                        Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type3 instanceof Class) {
                                            return EnumSet.noneOf((Class) type3);
                                        }
                                        throw new RuntimeException("Invalid EnumSet type: " + type2);
                                    }
                                    throw new RuntimeException("Invalid EnumSet type: " + type2);
                                default:
                                    if (type2 instanceof ParameterizedType) {
                                        Type type4 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                                        if (type4 instanceof Class) {
                                            return new EnumMap((Class) type4);
                                        }
                                        throw new RuntimeException("Invalid EnumMap type: " + type2);
                                    }
                                    throw new RuntimeException("Invalid EnumMap type: " + type2);
                            }
                        }
                    };
                } else {
                    ph4Var = null;
                }
                if (ph4Var != null) {
                    return ph4Var;
                }
                hh5 q = nj2.q((List) this.R);
                if (!Modifier.isAbstract(cls.getModifiers())) {
                    try {
                        Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        hh5 hh5Var = hh5.ALLOW;
                        if (q != hh5Var && (!kh5.a.a(null, declaredConstructor) || (q == hh5.BLOCK_ALL && !Modifier.isPublic(declaredConstructor.getModifiers())))) {
                            h61Var = new gr1("Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.", 6);
                        } else {
                            if (q == hh5Var) {
                                uj2 uj2Var = oh5.a;
                                try {
                                    declaredConstructor.setAccessible(true);
                                    str = null;
                                } catch (Exception e) {
                                    str = "Failed making constructor '" + oh5.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage() + oh5.e(e);
                                }
                                if (str != null) {
                                    h61Var = new gr1(str, 6);
                                }
                            }
                            h61Var = new h61(declaredConstructor, 5);
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (h61Var == null) {
                        return h61Var;
                    }
                    if (Collection.class.isAssignableFrom(cls)) {
                        if (cls.isAssignableFrom(ArrayList.class)) {
                            iVar = new i(21);
                        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            iVar = new i(24);
                        } else if (cls.isAssignableFrom(TreeSet.class)) {
                            iVar = new i(25);
                        } else if (cls.isAssignableFrom(ArrayDeque.class)) {
                            iVar = new i(26);
                        }
                    } else if (Map.class.isAssignableFrom(cls)) {
                        if (cls.isAssignableFrom(aw3.class)) {
                            if (type instanceof ParameterizedType) {
                                Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
                                if (actualTypeArguments.length != 0) {
                                }
                            }
                            iVar = new i(27);
                        }
                        if (cls.isAssignableFrom(LinkedHashMap.class)) {
                            iVar = new i(28);
                        } else if (cls.isAssignableFrom(TreeMap.class)) {
                            iVar = new i(29);
                        } else if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
                            iVar = new i(22);
                        } else if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
                            iVar = new i(23);
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    String i = i(cls);
                    if (i != null) {
                        return new gr1(i, 6);
                    }
                    if (!z) {
                        return new gr1("Unable to create instance of " + cls + "; Register an InstanceCreator or a TypeAdapter for this type.", 6);
                    } else if (q != hh5.ALLOW) {
                        return new gr1("Unable to create instance of " + cls + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.", 6);
                    } else if (this.B) {
                        return new h61(cls, 6);
                    } else {
                        String str2 = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
                        if (cls.getDeclaredConstructors().length == 0) {
                            str2 = str2.concat(" Or adjust your R8 configuration to keep the no-args constructor of the class.");
                        }
                        return new gr1(str2, 6);
                    }
                }
                h61Var = null;
                if (h61Var == null) {
                }
            } else {
                u34.a();
                return null;
            }
        } else {
            u34.a();
            return null;
        }
    }

    public m71 m() {
        ls0 ls0Var = (ls0) this.R;
        int i = ls0Var.b;
        int i2 = ls0Var.c;
        if (i < i2) {
            return m71.NOT_CROSSED;
        }
        if (i > i2) {
            return m71.CROSSED;
        }
        return m71.COLLAPSED;
    }

    public void n() {
        if (this.B) {
            p27.b((p27) this.R, (k47) this.L);
        }
    }

    public LinkedHashMap o(ArrayList arrayList, List list, List list2) {
        yq1 yq1Var;
        int i;
        int i2;
        yq1 yq1Var2;
        ArrayList arrayList2;
        Set set;
        yq1 yq1Var3;
        String str;
        d51 d51Var = (d51) this.R;
        LinkedHashSet<yq1> linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        int i3 = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            yq1 yq1Var4 = ((px) obj).d;
            yq1Var4.getClass();
            linkedHashSet.add(yq1Var4);
        }
        Set a = ((br1) d51Var.B).a();
        Set<yq1> o1 = gt0.o1(a);
        for (yq1 yq1Var5 : linkedHashSet) {
            p(o1, yq1Var5, d51Var);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator it = list2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            yq1Var = yq1.c;
            if (!hasNext) {
                break;
            }
            zi7 zi7Var = (zi7) list.get(((Number) it.next()).intValue());
            yq1 yq1Var6 = (yq1) zi7Var.b(j23.n, yq1Var);
            yq1Var6.getClass();
            if (yq1Var6.equals(yq1Var)) {
                arrayList5.add(zi7Var);
            } else {
                int i5 = yq1Var6.a;
                int i6 = yq1Var6.b;
                if (i5 != 2 && ((i5 == 0 || i6 != 0) && (i5 != 0 || i6 == 0))) {
                    arrayList3.add(zi7Var);
                } else {
                    arrayList4.add(zi7Var);
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
            zi7 zi7Var2 = (zi7) obj2;
            yq1 yq1Var7 = (yq1) zi7Var2.b(j23.n, yq1Var);
            yq1Var7.getClass();
            String str2 = (String) zi7Var2.e(kz6.C);
            str2.getClass();
            if (yq1Var7.b()) {
                set = a;
                i = i7;
                i2 = size2;
                if (o1.contains(yq1Var7)) {
                    r12 = yq1Var7;
                    yq1Var2 = yq1Var;
                    arrayList2 = arrayList6;
                }
                yq1Var2 = yq1Var;
                arrayList2 = arrayList6;
                r12 = null;
            } else {
                int i8 = yq1Var7.a;
                int i9 = yq1Var7.b;
                i = i7;
                i2 = size2;
                yq1 yq1Var8 = yq1.d;
                if (i8 == 1 && i9 == 0) {
                    set = a;
                    if (o1.contains(yq1Var8)) {
                        r12 = yq1Var8;
                        yq1Var2 = yq1Var;
                        arrayList2 = arrayList6;
                    }
                    yq1Var2 = yq1Var;
                    arrayList2 = arrayList6;
                    r12 = null;
                } else {
                    yq1 k = k(yq1Var7, linkedHashSet, o1);
                    yq1Var2 = yq1Var;
                    arrayList2 = arrayList6;
                    set = a;
                    if (k != null) {
                        if (kj2.F("CXCP")) {
                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from existing attached surface.\n" + yq1Var7 + "\n->\n" + k);
                        }
                    } else {
                        k = k(yq1Var7, linkedHashSet2, o1);
                        if (k != null) {
                            if (kj2.F("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from concurrently bound use case.\n" + yq1Var7 + "\n->\n" + k);
                            }
                        } else if (h(yq1Var7, yq1Var8, o1)) {
                            if (kj2.F("CXCP")) {
                                Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " to no compatible HDR dynamic ranges.\n" + yq1Var7 + "\n->\n" + yq1Var8);
                            }
                            r12 = yq1Var8;
                        } else {
                            if (i8 == 2 && (i9 == 10 || i9 == 0)) {
                                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                                if (Build.VERSION.SDK_INT >= 33) {
                                    yq1Var3 = r2.f((lg0) this.L);
                                    if (yq1Var3 != null) {
                                        linkedHashSet3.add(yq1Var3);
                                    }
                                } else {
                                    yq1Var3 = null;
                                }
                                linkedHashSet3.add(yq1.e);
                                r12 = k(yq1Var7, linkedHashSet3, o1);
                                if (r12 != null) {
                                    if (kj2.F("CXCP")) {
                                        StringBuilder t = i61.t("DynamicRangeResolver: Resolved dynamic range for use case ", str2, "from ");
                                        if (r12.equals(yq1Var3)) {
                                            str = "recommended";
                                        } else {
                                            str = "required";
                                        }
                                        t.append(str);
                                        t.append(" 10-bit supported dynamic range.\n");
                                        t.append(yq1Var7);
                                        t.append("\n->\n");
                                        t.append(r12);
                                        Log.d("CXCP", t.toString());
                                    }
                                }
                            }
                            for (yq1 yq1Var9 : o1) {
                                if (yq1Var9.b()) {
                                    if (!yq1Var9.equals(yq1Var8) && c(yq1Var7, yq1Var9)) {
                                        if (kj2.F("CXCP")) {
                                            Log.d("CXCP", "DynamicRangeResolver: Resolved dynamic range for use case " + str2 + " from validated dynamic range constraints or supported HDR dynamic ranges.\n" + yq1Var7 + "\n->\n" + yq1Var9);
                                        }
                                    }
                                } else {
                                    i.m("Candidate dynamic range must be fully specified.");
                                    return null;
                                }
                            }
                            yq1Var9 = null;
                        }
                    }
                    yq1Var9 = k;
                }
            }
            if (yq1Var9 != null) {
                p(o1, yq1Var9, d51Var);
                linkedHashMap.put(zi7Var2, yq1Var9);
                if (!linkedHashSet.contains(yq1Var9)) {
                    linkedHashSet2.add(yq1Var9);
                }
                i3 = i;
                size2 = i2;
                yq1Var = yq1Var2;
                arrayList6 = arrayList2;
                a = set;
            } else {
                throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + ((String) zi7Var2.e(kz6.C)) + "\nRequested dynamic range:\n  " + yq1Var7 + "\nSupported dynamic ranges:\n  " + set + "\nConstrained set of concurrent dynamic ranges:\n  " + o1);
            }
        }
        return linkedHashMap;
    }

    public long q(c37 c37Var, long j, boolean z, ga6 ga6Var) {
        hv2 hv2Var;
        p27 p27Var = (p27) this.R;
        long c = p27.c(p27Var, c37Var, j, z, false, ga6Var, false, null);
        if (!k47.a(c, (k47) this.L)) {
            this.B = false;
        }
        if (k47.c(c)) {
            hv2Var = hv2.Cursor;
        } else {
            hv2Var = hv2.Selection;
        }
        p27Var.q(hv2Var);
        return c;
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return ((Map) this.L).toString();
            case 5:
                return "SingleSelectionLayout(isStartHandle=" + this.B + ", crossed=" + m() + ", info=\n\t" + ((ls0) this.R) + ')';
            default:
                return super.toString();
        }
    }

    public ci(Activity activity) {
        this.A = 3;
        this.L = activity;
        Object systemService = activity.getSystemService("media_projection");
        systemService.getClass();
        this.R = (MediaProjectionManager) systemService;
    }

    public ci() {
        this.A = 6;
        this.B = false;
        this.L = new HashMap();
        this.R = new LinkedBlockingQueue();
    }

    public ci(ImageReader imageReader) {
        this.A = 0;
        this.R = new Object();
        this.B = true;
        this.L = imageReader;
    }

    public ci(List list, Map map, boolean z) {
        this.A = 1;
        this.L = map;
        this.B = z;
        this.R = list;
    }

    public ci(Executor executor, CameraCharacteristics cameraCharacteristics) {
        this.A = 4;
        y65 y65Var = ri1.a;
        if (ri1.a.b(LowMemoryQuirk.class) != null) {
            this.L = new vb6(executor);
        } else {
            this.L = executor;
        }
        this.R = y65Var;
        this.B = y65Var.a(IncorrectJpegMetadataQuirk.class);
    }

    public ci(boolean z, ea6 ea6Var, ls0 ls0Var) {
        this.A = 5;
        this.B = z;
        this.L = ea6Var;
        this.R = ls0Var;
    }

    public ci(p27 p27Var) {
        this.A = 7;
        this.R = p27Var;
        this.B = true;
    }
}
