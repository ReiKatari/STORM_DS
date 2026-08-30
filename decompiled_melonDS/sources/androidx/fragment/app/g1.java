package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g1 {
    public final z0 A;
    public final na.f B;
    public h.g C;
    public h.g D;
    public h.g E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public k1 O;
    public final r P;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1311b;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1314e;

    /* renamed from: g  reason: collision with root package name */
    public d.a0 f1316g;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList f1322n;

    /* renamed from: o  reason: collision with root package name */
    public final p0 f1323o;

    /* renamed from: p  reason: collision with root package name */
    public final CopyOnWriteArrayList f1324p;

    /* renamed from: q  reason: collision with root package name */
    public final v0 f1325q;

    /* renamed from: r  reason: collision with root package name */
    public final v0 f1326r;

    /* renamed from: s  reason: collision with root package name */
    public final v0 f1327s;

    /* renamed from: t  reason: collision with root package name */
    public final v0 f1328t;

    /* renamed from: u  reason: collision with root package name */
    public final y0 f1329u;

    /* renamed from: v  reason: collision with root package name */
    public int f1330v;

    /* renamed from: w  reason: collision with root package name */
    public s0 f1331w;

    /* renamed from: x  reason: collision with root package name */
    public r0 f1332x;

    /* renamed from: y  reason: collision with root package name */
    public j0 f1333y;

    /* renamed from: z  reason: collision with root package name */
    public j0 f1334z;

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f1310a = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final q1 f1312c = new q1();

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f1313d = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final u0 f1315f = new u0(this);

    /* renamed from: h  reason: collision with root package name */
    public a f1317h = null;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1318i = false;

    /* renamed from: j  reason: collision with root package name */
    public final x0 f1319j = new x0(this);

    /* renamed from: k  reason: collision with root package name */
    public final AtomicInteger f1320k = new AtomicInteger();

    /* renamed from: l  reason: collision with root package name */
    public final Map f1321l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.v0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.v0] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.v0] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.v0] */
    /* JADX WARN: Type inference failed for: r0v23, types: [na.f, java.lang.Object] */
    public g1() {
        Collections.synchronizedMap(new HashMap());
        this.f1322n = new ArrayList();
        this.f1323o = new p0(this);
        this.f1324p = new CopyOnWriteArrayList();
        this.f1325q = new z5.a(this) { // from class: androidx.fragment.app.v0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g1 f1422b;

            {
                this.f1422b = this;
            }

            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f1422b;
                        if (g1Var.M()) {
                            g1Var.i(false, configuration);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f1422b;
                        if (g1Var2.M() && num.intValue() == 80) {
                            g1Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        m5.f fVar = (m5.f) obj;
                        g1 g1Var3 = this.f1422b;
                        if (g1Var3.M()) {
                            g1Var3.n(fVar.f9248a, false);
                            return;
                        }
                        return;
                    default:
                        m5.m mVar = (m5.m) obj;
                        g1 g1Var4 = this.f1422b;
                        if (g1Var4.M()) {
                            g1Var4.s(mVar.f9266a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1326r = new z5.a(this) { // from class: androidx.fragment.app.v0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g1 f1422b;

            {
                this.f1422b = this;
            }

            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f1422b;
                        if (g1Var.M()) {
                            g1Var.i(false, configuration);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f1422b;
                        if (g1Var2.M() && num.intValue() == 80) {
                            g1Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        m5.f fVar = (m5.f) obj;
                        g1 g1Var3 = this.f1422b;
                        if (g1Var3.M()) {
                            g1Var3.n(fVar.f9248a, false);
                            return;
                        }
                        return;
                    default:
                        m5.m mVar = (m5.m) obj;
                        g1 g1Var4 = this.f1422b;
                        if (g1Var4.M()) {
                            g1Var4.s(mVar.f9266a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1327s = new z5.a(this) { // from class: androidx.fragment.app.v0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g1 f1422b;

            {
                this.f1422b = this;
            }

            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f1422b;
                        if (g1Var.M()) {
                            g1Var.i(false, configuration);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f1422b;
                        if (g1Var2.M() && num.intValue() == 80) {
                            g1Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        m5.f fVar = (m5.f) obj;
                        g1 g1Var3 = this.f1422b;
                        if (g1Var3.M()) {
                            g1Var3.n(fVar.f9248a, false);
                            return;
                        }
                        return;
                    default:
                        m5.m mVar = (m5.m) obj;
                        g1 g1Var4 = this.f1422b;
                        if (g1Var4.M()) {
                            g1Var4.s(mVar.f9266a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1328t = new z5.a(this) { // from class: androidx.fragment.app.v0

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ g1 f1422b;

            {
                this.f1422b = this;
            }

            @Override // z5.a
            public final void accept(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        g1 g1Var = this.f1422b;
                        if (g1Var.M()) {
                            g1Var.i(false, configuration);
                            return;
                        }
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        Integer num = (Integer) obj;
                        g1 g1Var2 = this.f1422b;
                        if (g1Var2.M() && num.intValue() == 80) {
                            g1Var2.m(false);
                            return;
                        }
                        return;
                    case 2:
                        m5.f fVar = (m5.f) obj;
                        g1 g1Var3 = this.f1422b;
                        if (g1Var3.M()) {
                            g1Var3.n(fVar.f9248a, false);
                            return;
                        }
                        return;
                    default:
                        m5.m mVar = (m5.m) obj;
                        g1 g1Var4 = this.f1422b;
                        if (g1Var4.M()) {
                            g1Var4.s(mVar.f9266a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.f1329u = new y0(this);
        this.f1330v = -1;
        this.A = new z0(this);
        this.B = new Object();
        this.F = new ArrayDeque();
        this.P = new r(2, this);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.f1229c.size(); i2++) {
            j0 j0Var = ((r1) aVar.f1229c.get(i2)).f1406b;
            if (j0Var != null && aVar.f1235i) {
                hashSet.add(j0Var);
            }
        }
        return hashSet;
    }

    public static boolean K(int i2) {
        if (Log.isLoggable("FragmentManager", i2)) {
            return true;
        }
        return false;
    }

    public static boolean L(j0 j0Var) {
        if (!j0Var.mHasMenu || !j0Var.mMenuVisible) {
            ArrayList e6 = j0Var.mChildFragmentManager.f1312c.e();
            int size = e6.size();
            boolean z10 = false;
            int i2 = 0;
            while (i2 < size) {
                Object obj = e6.get(i2);
                i2++;
                j0 j0Var2 = (j0) obj;
                if (j0Var2 != null) {
                    z10 = L(j0Var2);
                    continue;
                }
                if (z10) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean N(j0 j0Var) {
        if (j0Var != null) {
            g1 g1Var = j0Var.mFragmentManager;
            if (j0Var.equals(g1Var.f1334z) && N(g1Var.f1333y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void c0(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + j0Var);
        }
        if (j0Var.mHidden) {
            j0Var.mHidden = false;
            j0Var.mHiddenChanged = !j0Var.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z10) {
        if (z10 && (this.f1331w == null || this.J)) {
            return;
        }
        y(z10);
        a aVar2 = this.f1317h;
        if (aVar2 != null) {
            aVar2.f1246u = false;
            aVar2.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1317h + " as part of execSingleAction for action " + aVar);
            }
            this.f1317h.f(false, false);
            this.f1317h.a(this.L, this.M);
            ArrayList arrayList = this.f1317h.f1229c;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                j0 j0Var = ((r1) obj).f1406b;
                if (j0Var != null) {
                    j0Var.mTransitioning = false;
                }
            }
            this.f1317h = null;
        }
        aVar.a(this.L, this.M);
        this.f1311b = true;
        try {
            U(this.L, this.M);
            d();
            e0();
            boolean z11 = this.K;
            q1 q1Var = this.f1312c;
            if (z11) {
                this.K = false;
                ArrayList d4 = q1Var.d();
                int size2 = d4.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = d4.get(i10);
                    i10++;
                    p1 p1Var = (p1) obj2;
                    j0 j0Var2 = p1Var.f1392c;
                    if (j0Var2.mDeferStart) {
                        if (this.f1311b) {
                            this.K = true;
                        } else {
                            j0Var2.mDeferStart = false;
                            p1Var.k();
                        }
                    }
                }
            }
            q1Var.f1402b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th2) {
            d();
            throw th2;
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i2, int i10) {
        int i11;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17 = i2;
        boolean z13 = ((a) arrayList.get(i17)).f1243r;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        q1 q1Var = this.f1312c;
        arrayList4.addAll(q1Var.f());
        j0 j0Var = this.f1334z;
        int i18 = i17;
        boolean z14 = false;
        while (true) {
            int i19 = 1;
            if (i18 < i10) {
                a aVar = (a) arrayList.get(i18);
                boolean booleanValue = ((Boolean) arrayList2.get(i18)).booleanValue();
                ArrayList arrayList5 = this.N;
                if (!booleanValue) {
                    ArrayList arrayList6 = aVar.f1229c;
                    int i20 = 0;
                    while (i20 < arrayList6.size()) {
                        r1 r1Var = (r1) arrayList6.get(i20);
                        boolean z15 = z13;
                        int i21 = r1Var.f1405a;
                        if (i21 != i19) {
                            i13 = i18;
                            if (i21 != 2) {
                                if (i21 != 3 && i21 != 6) {
                                    if (i21 != 7) {
                                        if (i21 == 8) {
                                            arrayList6.add(i20, new r1(9, j0Var, 0));
                                            r1Var.f1407c = true;
                                            i20++;
                                            j0Var = r1Var.f1406b;
                                        }
                                    } else {
                                        i14 = 1;
                                    }
                                } else {
                                    arrayList5.remove(r1Var.f1406b);
                                    j0 j0Var2 = r1Var.f1406b;
                                    if (j0Var2 == j0Var) {
                                        arrayList6.add(i20, new r1(j0Var2, 9));
                                        i20++;
                                        z12 = z14;
                                        j0Var = null;
                                        i14 = 1;
                                    }
                                }
                                z12 = z14;
                                i14 = 1;
                            } else {
                                j0 j0Var3 = r1Var.f1406b;
                                int i22 = j0Var3.mContainerId;
                                int size = arrayList5.size() - 1;
                                boolean z16 = false;
                                while (size >= 0) {
                                    int i23 = size;
                                    j0 j0Var4 = (j0) arrayList5.get(size);
                                    boolean z17 = z14;
                                    if (j0Var4.mContainerId == i22) {
                                        if (j0Var4 == j0Var3) {
                                            i15 = i22;
                                            z16 = true;
                                        } else {
                                            if (j0Var4 == j0Var) {
                                                i15 = i22;
                                                i16 = 0;
                                                arrayList6.add(i20, new r1(9, j0Var4, 0));
                                                i20++;
                                                j0Var = null;
                                            } else {
                                                i15 = i22;
                                                i16 = 0;
                                            }
                                            r1 r1Var2 = new r1(3, j0Var4, i16);
                                            r1Var2.f1408d = r1Var.f1408d;
                                            r1Var2.f1410f = r1Var.f1410f;
                                            r1Var2.f1409e = r1Var.f1409e;
                                            r1Var2.f1411g = r1Var.f1411g;
                                            arrayList6.add(i20, r1Var2);
                                            arrayList5.remove(j0Var4);
                                            i20++;
                                            j0Var = j0Var;
                                        }
                                    } else {
                                        i15 = i22;
                                    }
                                    size = i23 - 1;
                                    i22 = i15;
                                    z14 = z17;
                                }
                                z12 = z14;
                                i14 = 1;
                                if (z16) {
                                    arrayList6.remove(i20);
                                    i20--;
                                } else {
                                    r1Var.f1405a = 1;
                                    r1Var.f1407c = true;
                                    arrayList5.add(j0Var3);
                                }
                            }
                            i20 += i14;
                            i19 = i14;
                            z13 = z15;
                            i18 = i13;
                            z14 = z12;
                        } else {
                            i13 = i18;
                            i14 = i19;
                        }
                        z12 = z14;
                        arrayList5.add(r1Var.f1406b);
                        i20 += i14;
                        i19 = i14;
                        z13 = z15;
                        i18 = i13;
                        z14 = z12;
                    }
                    z10 = z13;
                    i12 = i18;
                    z11 = z14;
                } else {
                    z10 = z13;
                    i12 = i18;
                    z11 = z14;
                    int i24 = 1;
                    ArrayList arrayList7 = aVar.f1229c;
                    int size2 = arrayList7.size() - 1;
                    while (size2 >= 0) {
                        r1 r1Var3 = (r1) arrayList7.get(size2);
                        int i25 = r1Var3.f1405a;
                        if (i25 != i24) {
                            if (i25 != 3) {
                                switch (i25) {
                                    case 8:
                                        j0Var = null;
                                        break;
                                    case l1.c.f8508d /* 9 */:
                                        j0Var = r1Var3.f1406b;
                                        break;
                                    case l1.c.f8510f /* 10 */:
                                        r1Var3.f1413i = r1Var3.f1412h;
                                        break;
                                }
                                size2--;
                                i24 = 1;
                            }
                            arrayList5.add(r1Var3.f1406b);
                            size2--;
                            i24 = 1;
                        }
                        arrayList5.remove(r1Var3.f1406b);
                        size2--;
                        i24 = 1;
                    }
                }
                if (!z11 && !aVar.f1235i) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                i18 = i12 + 1;
                z13 = z10;
            } else {
                boolean z18 = z13;
                boolean z19 = z14;
                this.N.clear();
                if (!z18 && this.f1330v >= 1) {
                    for (int i26 = i17; i26 < i10; i26++) {
                        ArrayList arrayList8 = ((a) arrayList.get(i26)).f1229c;
                        int size3 = arrayList8.size();
                        int i27 = 0;
                        while (i27 < size3) {
                            Object obj = arrayList8.get(i27);
                            i27++;
                            j0 j0Var5 = ((r1) obj).f1406b;
                            if (j0Var5 != null && j0Var5.mFragmentManager != null) {
                                q1Var.g(g(j0Var5));
                            }
                        }
                    }
                }
                int i28 = i17;
                while (i28 < i10) {
                    a aVar2 = (a) arrayList.get(i28);
                    if (((Boolean) arrayList2.get(i28)).booleanValue()) {
                        aVar2.c(-1);
                        g1 g1Var = aVar2.f1245t;
                        ArrayList arrayList9 = aVar2.f1229c;
                        boolean z20 = true;
                        for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                            r1 r1Var4 = (r1) arrayList9.get(size4);
                            j0 j0Var6 = r1Var4.f1406b;
                            if (j0Var6 != null) {
                                j0Var6.mBeingSaved = false;
                                j0Var6.setPopDirection(z20);
                                int i29 = aVar2.f1234h;
                                int i30 = 8194;
                                int i31 = 4097;
                                if (i29 != 4097) {
                                    if (i29 != 8194) {
                                        i30 = 4100;
                                        if (i29 != 8197) {
                                            i31 = 4099;
                                            if (i29 != 4099) {
                                                if (i29 != 4100) {
                                                    i30 = 0;
                                                } else {
                                                    i30 = 8197;
                                                }
                                            }
                                        }
                                    }
                                    i30 = i31;
                                }
                                j0Var6.setNextTransition(i30);
                                j0Var6.setSharedElementNames(aVar2.f1242q, aVar2.f1241p);
                            }
                            switch (r1Var4.f1405a) {
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    z20 = true;
                                    g1Var.Y(j0Var6, true);
                                    g1Var.T(j0Var6);
                                    break;
                                case 2:
                                default:
                                    a0.j.d(r1Var4.f1405a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    g1Var.a(j0Var6);
                                    z20 = true;
                                    break;
                                case 4:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    g1Var.getClass();
                                    c0(j0Var6);
                                    z20 = true;
                                    break;
                                case l1.c.f8511g /* 5 */:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    g1Var.Y(j0Var6, true);
                                    g1Var.J(j0Var6);
                                    z20 = true;
                                    break;
                                case l1.c.f8509e /* 6 */:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    g1Var.c(j0Var6);
                                    z20 = true;
                                    break;
                                case 7:
                                    j0Var6.setAnimations(r1Var4.f1408d, r1Var4.f1409e, r1Var4.f1410f, r1Var4.f1411g);
                                    g1Var.Y(j0Var6, true);
                                    g1Var.h(j0Var6);
                                    z20 = true;
                                    break;
                                case 8:
                                    g1Var.a0(null);
                                    z20 = true;
                                    break;
                                case l1.c.f8508d /* 9 */:
                                    g1Var.a0(j0Var6);
                                    z20 = true;
                                    break;
                                case l1.c.f8510f /* 10 */:
                                    r1Var4.f1413i = j0Var6.mMaxState;
                                    g1Var.Z(j0Var6, r1Var4.f1412h);
                                    z20 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar2.c(1);
                        g1 g1Var2 = aVar2.f1245t;
                        ArrayList arrayList10 = aVar2.f1229c;
                        int size5 = arrayList10.size();
                        int i32 = 0;
                        while (i32 < size5) {
                            r1 r1Var5 = (r1) arrayList10.get(i32);
                            j0 j0Var7 = r1Var5.f1406b;
                            if (j0Var7 != null) {
                                j0Var7.mBeingSaved = false;
                                j0Var7.setPopDirection(false);
                                j0Var7.setNextTransition(aVar2.f1234h);
                                j0Var7.setSharedElementNames(aVar2.f1241p, aVar2.f1242q);
                            }
                            switch (r1Var5.f1405a) {
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.Y(j0Var7, false);
                                    g1Var2.a(j0Var7);
                                    break;
                                case 2:
                                default:
                                    a0.j.d(r1Var5.f1405a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.T(j0Var7);
                                    break;
                                case 4:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.J(j0Var7);
                                    break;
                                case l1.c.f8511g /* 5 */:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.Y(j0Var7, false);
                                    c0(j0Var7);
                                    break;
                                case l1.c.f8509e /* 6 */:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.h(j0Var7);
                                    break;
                                case 7:
                                    i11 = i28;
                                    j0Var7.setAnimations(r1Var5.f1408d, r1Var5.f1409e, r1Var5.f1410f, r1Var5.f1411g);
                                    g1Var2.Y(j0Var7, false);
                                    g1Var2.c(j0Var7);
                                    break;
                                case 8:
                                    g1Var2.a0(j0Var7);
                                    i11 = i28;
                                    break;
                                case l1.c.f8508d /* 9 */:
                                    g1Var2.a0(null);
                                    i11 = i28;
                                    break;
                                case l1.c.f8510f /* 10 */:
                                    r1Var5.f1412h = j0Var7.mMaxState;
                                    g1Var2.Z(j0Var7, r1Var5.f1413i);
                                    i11 = i28;
                                    break;
                            }
                            i32++;
                            i28 = i11;
                        }
                    }
                    i28++;
                }
                boolean booleanValue2 = ((Boolean) arrayList2.get(i10 - 1)).booleanValue();
                ArrayList arrayList11 = this.f1322n;
                if (z19 && !arrayList11.isEmpty()) {
                    LinkedHashSet<j0> linkedHashSet = new LinkedHashSet();
                    int size6 = arrayList.size();
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj2 = arrayList.get(i33);
                        i33++;
                        linkedHashSet.addAll(F((a) obj2));
                    }
                    if (this.f1317h == null) {
                        int size7 = arrayList11.size();
                        int i34 = 0;
                        while (i34 < size7) {
                            Object obj3 = arrayList11.get(i34);
                            i34++;
                            ci.m mVar = (ci.m) obj3;
                            for (j0 j0Var8 : linkedHashSet) {
                                mVar.getClass();
                            }
                        }
                        int size8 = arrayList11.size();
                        int i35 = 0;
                        while (i35 < size8) {
                            Object obj4 = arrayList11.get(i35);
                            i35++;
                            ci.m mVar2 = (ci.m) obj4;
                            for (j0 j0Var9 : linkedHashSet) {
                                mVar2.getClass();
                            }
                        }
                    }
                }
                for (int i36 = i17; i36 < i10; i36++) {
                    a aVar3 = (a) arrayList.get(i36);
                    if (booleanValue2) {
                        for (int size9 = aVar3.f1229c.size() - 1; size9 >= 0; size9--) {
                            j0 j0Var10 = ((r1) aVar3.f1229c.get(size9)).f1406b;
                            if (j0Var10 != null) {
                                g(j0Var10).k();
                            }
                        }
                    } else {
                        ArrayList arrayList12 = aVar3.f1229c;
                        int size10 = arrayList12.size();
                        int i37 = 0;
                        while (i37 < size10) {
                            Object obj5 = arrayList12.get(i37);
                            i37++;
                            j0 j0Var11 = ((r1) obj5).f1406b;
                            if (j0Var11 != null) {
                                g(j0Var11).k();
                            }
                        }
                    }
                }
                O(this.f1330v, true);
                Iterator it = f(arrayList, i17, i10).iterator();
                while (it.hasNext()) {
                    q qVar = (q) it.next();
                    qVar.f1399e = booleanValue2;
                    qVar.l();
                    qVar.e();
                }
                while (i17 < i10) {
                    a aVar4 = (a) arrayList.get(i17);
                    if (((Boolean) arrayList2.get(i17)).booleanValue() && aVar4.f1247v >= 0) {
                        aVar4.f1247v = -1;
                    }
                    if (aVar4.f1244s != null) {
                        for (int i38 = 0; i38 < aVar4.f1244s.size(); i38++) {
                            ((Runnable) aVar4.f1244s.get(i38)).run();
                        }
                        aVar4.f1244s = null;
                    }
                    i17++;
                }
                if (z19) {
                    for (int i39 = 0; i39 < arrayList11.size(); i39++) {
                        SettingsActivity settingsActivity = ((ci.m) arrayList11.get(i39)).f2897a;
                        int i40 = SettingsActivity.f9577y0;
                        settingsActivity.C();
                    }
                    return;
                }
                return;
            }
        }
    }

    public final j0 C(int i2) {
        q1 q1Var = this.f1312c;
        ArrayList arrayList = q1Var.f1401a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && j0Var.mFragmentId == i2) {
                return j0Var;
            }
        }
        for (p1 p1Var : q1Var.f1402b.values()) {
            if (p1Var != null) {
                j0 j0Var2 = p1Var.f1392c;
                if (j0Var2.mFragmentId == i2) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    public final j0 D(String str) {
        q1 q1Var = this.f1312c;
        ArrayList arrayList = q1Var.f1401a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            j0 j0Var = (j0) arrayList.get(size);
            if (j0Var != null && str.equals(j0Var.mTag)) {
                return j0Var;
            }
        }
        for (p1 p1Var : q1Var.f1402b.values()) {
            if (p1Var != null) {
                j0 j0Var2 = p1Var.f1392c;
                if (str.equals(j0Var2.mTag)) {
                    return j0Var2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            if (qVar.f1400f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                qVar.f1400f = false;
                qVar.e();
            }
        }
    }

    public final ViewGroup G(j0 j0Var) {
        ViewGroup viewGroup = j0Var.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (j0Var.mContainerId > 0 && this.f1332x.e()) {
            View d4 = this.f1332x.d(j0Var.mContainerId);
            if (d4 instanceof ViewGroup) {
                return (ViewGroup) d4;
            }
            return null;
        }
        return null;
    }

    public final z0 H() {
        j0 j0Var = this.f1333y;
        if (j0Var != null) {
            return j0Var.mFragmentManager.H();
        }
        return this.A;
    }

    public final na.f I() {
        j0 j0Var = this.f1333y;
        if (j0Var != null) {
            return j0Var.mFragmentManager.I();
        }
        return this.B;
    }

    public final void J(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + j0Var);
        }
        if (!j0Var.mHidden) {
            j0Var.mHidden = true;
            j0Var.mHiddenChanged = true ^ j0Var.mHiddenChanged;
            b0(j0Var);
        }
    }

    public final boolean M() {
        j0 j0Var = this.f1333y;
        if (j0Var == null) {
            return true;
        }
        if (j0Var.isAdded() && this.f1333y.getParentFragmentManager().M()) {
            return true;
        }
        return false;
    }

    public final void O(int i2, boolean z10) {
        s0 s0Var;
        if (this.f1331w == null && i2 != -1) {
            a0.j.p("No activity");
        } else if (z10 || i2 != this.f1330v) {
            this.f1330v = i2;
            q1 q1Var = this.f1312c;
            HashMap hashMap = q1Var.f1402b;
            ArrayList arrayList = q1Var.f1401a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                p1 p1Var = (p1) hashMap.get(((j0) obj).mWho);
                if (p1Var != null) {
                    p1Var.k();
                }
            }
            for (p1 p1Var2 : hashMap.values()) {
                if (p1Var2 != null) {
                    p1Var2.k();
                    j0 j0Var = p1Var2.f1392c;
                    if (j0Var.mRemoving && !j0Var.isInBackStack()) {
                        if (j0Var.mBeingSaved && !q1Var.f1403c.containsKey(j0Var.mWho)) {
                            q1Var.i(p1Var2.n(), j0Var.mWho);
                        }
                        q1Var.h(p1Var2);
                    }
                }
            }
            ArrayList d4 = q1Var.d();
            int size2 = d4.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = d4.get(i11);
                i11++;
                p1 p1Var3 = (p1) obj2;
                j0 j0Var2 = p1Var3.f1392c;
                if (j0Var2.mDeferStart) {
                    if (this.f1311b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        p1Var3.k();
                    }
                }
            }
            if (this.G && (s0Var = this.f1331w) != null && this.f1330v == 7) {
                ((n0) s0Var).X.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void P() {
        if (this.f1331w != null) {
            this.H = false;
            this.I = false;
            this.O.f1352g = false;
            for (j0 j0Var : this.f1312c.f()) {
                if (j0Var != null) {
                    j0Var.noteStateNotSaved();
                }
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i2, int i10) {
        z(false);
        y(true);
        j0 j0Var = this.f1334z;
        if (j0Var != null && i2 < 0 && j0Var.getChildFragmentManager().Q()) {
            return true;
        }
        boolean S = S(this.L, this.M, i2, i10);
        if (S) {
            this.f1311b = true;
            try {
                U(this.L, this.M);
            } finally {
                d();
            }
        }
        e0();
        boolean z10 = this.K;
        q1 q1Var = this.f1312c;
        if (z10) {
            this.K = false;
            ArrayList d4 = q1Var.d();
            int size = d4.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = d4.get(i11);
                i11++;
                p1 p1Var = (p1) obj;
                j0 j0Var2 = p1Var.f1392c;
                if (j0Var2.mDeferStart) {
                    if (this.f1311b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        p1Var.k();
                    }
                }
            }
        }
        q1Var.f1402b.values().removeAll(Collections.singleton(null));
        return S;
    }

    public final boolean S(ArrayList arrayList, ArrayList arrayList2, int i2, int i10) {
        boolean z10;
        if ((i10 & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = -1;
        if (!this.f1313d.isEmpty()) {
            if (i2 < 0) {
                i11 = z10 ? 0 : this.f1313d.size() - 1;
            } else {
                int size = this.f1313d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.f1313d.get(size);
                    if (i2 >= 0 && i2 == aVar.f1247v) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i11 = size;
                } else if (z10) {
                    i11 = size;
                    while (i11 > 0) {
                        a aVar2 = (a) this.f1313d.get(i11 - 1);
                        if (i2 < 0 || i2 != aVar2.f1247v) {
                            break;
                        }
                        i11--;
                    }
                } else if (size != this.f1313d.size() - 1) {
                    i11 = size + 1;
                }
            }
        }
        if (i11 < 0) {
            return false;
        }
        for (int size2 = this.f1313d.size() - 1; size2 >= i11; size2--) {
            arrayList.add((a) this.f1313d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + j0Var + " nesting=" + j0Var.mBackStackNesting);
        }
        boolean isInBackStack = j0Var.isInBackStack();
        if (j0Var.mDetached && isInBackStack) {
            return;
        }
        q1 q1Var = this.f1312c;
        synchronized (q1Var.f1401a) {
            q1Var.f1401a.remove(j0Var);
        }
        j0Var.mAdded = false;
        if (L(j0Var)) {
            this.G = true;
        }
        j0Var.mRemoving = true;
        b0(j0Var);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i2 = 0;
                int i10 = 0;
                while (i2 < size) {
                    if (!((a) arrayList.get(i2)).f1243r) {
                        if (i10 != i2) {
                            B(arrayList, arrayList2, i10, i2);
                        }
                        i10 = i2 + 1;
                        if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                            while (i10 < size && ((Boolean) arrayList2.get(i10)).booleanValue() && !((a) arrayList.get(i10)).f1243r) {
                                i10++;
                            }
                        }
                        B(arrayList, arrayList2, i2, i10);
                        i2 = i10 - 1;
                    }
                    i2++;
                }
                if (i10 != size) {
                    B(arrayList, arrayList2, i10, size);
                    return;
                }
                return;
            }
            a0.j.p("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [androidx.fragment.app.r1, java.lang.Object] */
    public final void V(Bundle bundle) {
        p0 p0Var;
        int i2;
        boolean z10;
        int i10;
        Bundle bundle2;
        p1 p1Var;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.f1331w.B.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.f1331w.B.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        q1 q1Var = this.f1312c;
        HashMap hashMap2 = q1Var.f1403c;
        HashMap hashMap3 = q1Var.f1402b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        i1 i1Var = (i1) bundle.getParcelable("state");
        if (i1Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = i1Var.A;
        int size = arrayList.size();
        int i11 = 0;
        while (true) {
            p0Var = this.f1323o;
            if (i11 >= size) {
                break;
            }
            Object obj = arrayList.get(i11);
            i11++;
            Bundle i12 = q1Var.i(null, (String) obj);
            if (i12 != null) {
                j0 j0Var = (j0) this.O.f1347b.get(((m1) i12.getParcelable("state")).B);
                if (j0Var != null) {
                    if (K(2)) {
                        i10 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + j0Var);
                    } else {
                        i10 = 2;
                    }
                    p1Var = new p1(p0Var, q1Var, j0Var, i12);
                    bundle2 = i12;
                } else {
                    i10 = 2;
                    bundle2 = i12;
                    p1Var = new p1(this.f1323o, this.f1312c, this.f1331w.B.getClassLoader(), H(), i12);
                }
                j0 j0Var2 = p1Var.f1392c;
                j0Var2.mSavedFragmentState = bundle2;
                j0Var2.mFragmentManager = this;
                if (K(i10)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + j0Var2.mWho + "): " + j0Var2);
                }
                p1Var.l(this.f1331w.B.getClassLoader());
                q1Var.g(p1Var);
                p1Var.f1394e = this.f1330v;
            }
        }
        k1 k1Var = this.O;
        k1Var.getClass();
        ArrayList arrayList2 = new ArrayList(k1Var.f1347b.values());
        int size2 = arrayList2.size();
        int i13 = 0;
        while (i13 < size2) {
            Object obj2 = arrayList2.get(i13);
            i13++;
            j0 j0Var3 = (j0) obj2;
            if (hashMap3.get(j0Var3.mWho) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + j0Var3 + " that was not found in the set of active Fragments " + i1Var.A);
                }
                this.O.i(j0Var3);
                j0Var3.mFragmentManager = this;
                p1 p1Var2 = new p1(p0Var, q1Var, j0Var3);
                p1Var2.f1394e = 1;
                p1Var2.k();
                j0Var3.mRemoving = true;
                p1Var2.k();
            }
        }
        ArrayList arrayList3 = i1Var.B;
        q1Var.f1401a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i14 = 0;
            while (i14 < size3) {
                Object obj3 = arrayList3.get(i14);
                i14++;
                String str3 = (String) obj3;
                j0 b10 = q1Var.b(str3);
                if (b10 != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b10);
                    }
                    q1Var.a(b10);
                } else {
                    a0.j.p(kc.a.g("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (i1Var.L != null) {
            this.f1313d = new ArrayList(i1Var.L.length);
            int i15 = 0;
            while (true) {
                b[] bVarArr = i1Var.L;
                if (i15 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i15];
                ArrayList arrayList4 = bVar.B;
                a aVar = new a(this);
                int[] iArr = bVar.A;
                int i16 = 0;
                int i17 = 0;
                while (i16 < iArr.length) {
                    ?? obj4 = new Object();
                    int i18 = i16 + 1;
                    obj4.f1405a = iArr[i16];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i17 + " base fragment #" + iArr[i18]);
                    }
                    obj4.f1412h = androidx.lifecycle.q.values()[bVar.L[i17]];
                    obj4.f1413i = androidx.lifecycle.q.values()[bVar.R[i17]];
                    int i19 = i16 + 2;
                    if (iArr[i18] != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    obj4.f1407c = z10;
                    int i20 = iArr[i19];
                    obj4.f1408d = i20;
                    int i21 = iArr[i16 + 3];
                    obj4.f1409e = i21;
                    int i22 = i16 + 5;
                    int i23 = iArr[i16 + 4];
                    obj4.f1410f = i23;
                    i16 += 6;
                    int[] iArr2 = iArr;
                    int i24 = iArr2[i22];
                    obj4.f1411g = i24;
                    aVar.f1230d = i20;
                    aVar.f1231e = i21;
                    aVar.f1232f = i23;
                    aVar.f1233g = i24;
                    aVar.b(obj4);
                    i17++;
                    iArr = iArr2;
                }
                aVar.f1234h = bVar.X;
                aVar.f1237k = bVar.Y;
                aVar.f1235i = true;
                aVar.f1238l = bVar.f1249b0;
                aVar.m = bVar.f1250c0;
                aVar.f1239n = bVar.f1251d0;
                aVar.f1240o = bVar.f1252e0;
                aVar.f1241p = bVar.f1253f0;
                aVar.f1242q = bVar.f1254g0;
                aVar.f1243r = bVar.f1255h0;
                aVar.f1247v = bVar.Z;
                for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                    String str4 = (String) arrayList4.get(i25);
                    if (str4 != null) {
                        ((r1) aVar.f1229c.get(i25)).f1406b = q1Var.b(str4);
                    }
                }
                aVar.c(1);
                if (K(2)) {
                    StringBuilder i26 = kc.a.i("restoreAllState: back stack #", i15, " (index ");
                    i26.append(aVar.f1247v);
                    i26.append("): ");
                    i26.append(aVar);
                    Log.v("FragmentManager", i26.toString());
                    PrintWriter printWriter = new PrintWriter(new b2());
                    aVar.h("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1313d.add(aVar);
                i15++;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f1313d = new ArrayList();
        }
        this.f1320k.set(i1Var.R);
        String str5 = i1Var.X;
        if (str5 != null) {
            j0 b11 = q1Var.b(str5);
            this.f1334z = b11;
            r(b11);
        }
        ArrayList arrayList5 = i1Var.Y;
        if (arrayList5 != null) {
            for (int i27 = i2; i27 < arrayList5.size(); i27++) {
                this.f1321l.put((String) arrayList5.get(i27), (c) i1Var.Z.get(i27));
            }
        }
        this.F = new ArrayDeque(i1Var.f1339b0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.fragment.app.i1, android.os.Parcelable, java.lang.Object] */
    public final Bundle W() {
        int i2;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.H = true;
        this.O.f1352g = true;
        q1 q1Var = this.f1312c;
        q1Var.getClass();
        HashMap hashMap = q1Var.f1402b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (p1 p1Var : hashMap.values()) {
            if (p1Var != null) {
                j0 j0Var = p1Var.f1392c;
                q1Var.i(p1Var.n(), j0Var.mWho);
                arrayList2.add(j0Var.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + j0Var + ": " + j0Var.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.f1312c.f1403c;
        if (hashMap2.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            q1 q1Var2 = this.f1312c;
            synchronized (q1Var2.f1401a) {
                try {
                    if (q1Var2.f1401a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(q1Var2.f1401a.size());
                        ArrayList arrayList3 = q1Var2.f1401a;
                        int size = arrayList3.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList3.get(i10);
                            i10++;
                            j0 j0Var2 = (j0) obj;
                            arrayList.add(j0Var2.mWho);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + j0Var2.mWho + "): " + j0Var2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.f1313d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i2 = 0; i2 < size2; i2++) {
                    bVarArr[i2] = new b((a) this.f1313d.get(i2));
                    if (K(2)) {
                        StringBuilder i11 = kc.a.i("saveAllState: adding back stack #", i2, ": ");
                        i11.append(this.f1313d.get(i2));
                        Log.v("FragmentManager", i11.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            ?? obj2 = new Object();
            obj2.X = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.Y = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.Z = arrayList5;
            obj2.A = arrayList2;
            obj2.B = arrayList;
            obj2.L = bVarArr;
            obj2.R = this.f1320k.get();
            j0 j0Var3 = this.f1334z;
            if (j0Var3 != null) {
                obj2.X = j0Var3.mWho;
            }
            arrayList4.addAll(this.f1321l.keySet());
            arrayList5.addAll(this.f1321l.values());
            obj2.f1339b0 = new ArrayList(this.F);
            bundle.putParcelable("state", obj2);
            for (String str : this.m.keySet()) {
                bundle.putBundle("result_" + str, (Bundle) this.m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle("fragment_" + str2, (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.f1310a) {
            try {
                if (this.f1310a.size() == 1) {
                    this.f1331w.L.removeCallbacks(this.P);
                    this.f1331w.L.post(this.P);
                    e0();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void Y(j0 j0Var, boolean z10) {
        ViewGroup G = G(j0Var);
        if (G != null && (G instanceof FragmentContainerView)) {
            ((FragmentContainerView) G).setDrawDisappearingViewsLast(!z10);
        }
    }

    public final void Z(j0 j0Var, androidx.lifecycle.q qVar) {
        if (j0Var.equals(this.f1312c.b(j0Var.mWho)) && (j0Var.mHost == null || j0Var.mFragmentManager == this)) {
            j0Var.mMaxState = qVar;
        } else {
            fj.j.s("Fragment ", j0Var, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final p1 a(j0 j0Var) {
        String str = j0Var.mPreviousWho;
        if (str != null) {
            r6.d.c(j0Var, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + j0Var);
        }
        p1 g10 = g(j0Var);
        j0Var.mFragmentManager = this;
        q1 q1Var = this.f1312c;
        q1Var.g(g10);
        if (!j0Var.mDetached) {
            q1Var.a(j0Var);
            j0Var.mRemoving = false;
            if (j0Var.mView == null) {
                j0Var.mHiddenChanged = false;
            }
            if (L(j0Var)) {
                this.G = true;
            }
        }
        return g10;
    }

    public final void a0(j0 j0Var) {
        if (j0Var != null) {
            if (!j0Var.equals(this.f1312c.b(j0Var.mWho)) || (j0Var.mHost != null && j0Var.mFragmentManager != this)) {
                fj.j.s("Fragment ", j0Var, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        j0 j0Var2 = this.f1334z;
        this.f1334z = j0Var;
        r(j0Var2);
        r(this.f1334z);
    }

    public final void b(s0 s0Var, r0 r0Var, j0 j0Var) {
        String str;
        if (this.f1331w == null) {
            this.f1331w = s0Var;
            this.f1332x = r0Var;
            this.f1333y = j0Var;
            CopyOnWriteArrayList copyOnWriteArrayList = this.f1324p;
            if (j0Var != null) {
                copyOnWriteArrayList.add(new a1(j0Var));
            } else if (s0Var instanceof l1) {
                copyOnWriteArrayList.add((l1) s0Var);
            }
            if (this.f1333y != null) {
                e0();
            }
            if (s0Var instanceof d.b0) {
                d.b0 b0Var = (d.b0) s0Var;
                d.a0 a10 = b0Var.a();
                this.f1316g = a10;
                androidx.lifecycle.x xVar = b0Var;
                if (j0Var != null) {
                    xVar = j0Var;
                }
                a10.a(xVar, this.f1319j);
            }
            boolean z10 = false;
            if (j0Var != null) {
                k1 k1Var = j0Var.mFragmentManager.O;
                HashMap hashMap = k1Var.f1348c;
                k1 k1Var2 = (k1) hashMap.get(j0Var.mWho);
                if (k1Var2 == null) {
                    k1Var2 = new k1(k1Var.f1350e);
                    hashMap.put(j0Var.mWho, k1Var2);
                }
                this.O = k1Var2;
            } else if (s0Var instanceof androidx.lifecycle.e1) {
                androidx.lifecycle.d1 viewModelStore = ((androidx.lifecycle.e1) s0Var).getViewModelStore();
                viewModelStore.getClass();
                w6.a aVar = w6.a.f14160b;
                aVar.getClass();
                b9.e eVar = new b9.e(viewModelStore, k1.f1346h, aVar);
                nc.e a11 = nc.u.a(k1.class);
                String b10 = a11.b();
                if (b10 != null) {
                    this.O = (k1) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a11);
                } else {
                    a0.j.h("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.O = new k1(false);
            }
            k1 k1Var3 = this.O;
            k1Var3.f1352g = (this.H || this.I) ? true : true;
            this.f1312c.f1404d = k1Var3;
            s0 s0Var2 = this.f1331w;
            if ((s0Var2 instanceof q7.f) && j0Var == null) {
                q7.d savedStateRegistry = ((q7.f) s0Var2).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new k0(1, this));
                Bundle a12 = savedStateRegistry.a("android:support:fragments");
                if (a12 != null) {
                    V(a12);
                }
            }
            s0 s0Var3 = this.f1331w;
            if (s0Var3 instanceof h.i) {
                h.h m = ((h.i) s0Var3).m();
                if (j0Var != null) {
                    str = w.d.s(new StringBuilder(), j0Var.mWho, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = m.d(concat.concat("StartActivityForResult"), new b1(4), new w0(this, 1));
                this.D = m.d(concat.concat("StartIntentSenderForResult"), new b1(0), new w0(this, 2));
                this.E = m.d(concat.concat("RequestPermissions"), new b1(2), new w0(this, 0));
            }
            s0 s0Var4 = this.f1331w;
            if (s0Var4 instanceof n5.a) {
                ((n5.a) s0Var4).g(this.f1325q);
            }
            s0 s0Var5 = this.f1331w;
            if (s0Var5 instanceof n5.b) {
                ((n5.b) s0Var5).h(this.f1326r);
            }
            s0 s0Var6 = this.f1331w;
            if (s0Var6 instanceof m5.k) {
                ((m5.k) s0Var6).l(this.f1327s);
            }
            s0 s0Var7 = this.f1331w;
            if (s0Var7 instanceof m5.l) {
                ((m5.l) s0Var7).k(this.f1328t);
            }
            s0 s0Var8 = this.f1331w;
            if ((s0Var8 instanceof a6.p) && j0Var == null) {
                ((a6.p) s0Var8).c(this.f1329u);
                return;
            }
            return;
        }
        a0.j.p("Already attached");
    }

    public final void b0(j0 j0Var) {
        ViewGroup G = G(j0Var);
        if (G != null) {
            if (j0Var.getPopExitAnim() + j0Var.getPopEnterAnim() + j0Var.getExitAnim() + j0Var.getEnterAnim() > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, j0Var);
                }
                ((j0) G.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(j0Var.getPopDirection());
            }
        }
    }

    public final void c(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + j0Var);
        }
        if (j0Var.mDetached) {
            j0Var.mDetached = false;
            if (!j0Var.mAdded) {
                this.f1312c.a(j0Var);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + j0Var);
                }
                if (L(j0Var)) {
                    this.G = true;
                }
            }
        }
    }

    public final void d() {
        this.f1311b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new b2());
        s0 s0Var = this.f1331w;
        if (s0Var != null) {
            try {
                ((n0) s0Var).X.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e6) {
                Log.e("FragmentManager", "Failed dumping state", e6);
            }
        } else {
            try {
                v("  ", null, printWriter, new String[0]);
            } catch (Exception e10) {
                Log.e("FragmentManager", "Failed dumping state", e10);
            }
        }
        throw illegalStateException;
    }

    public final HashSet e() {
        q qVar;
        HashSet hashSet = new HashSet();
        ArrayList d4 = this.f1312c.d();
        int size = d4.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = d4.get(i2);
            i2++;
            ViewGroup viewGroup = ((p1) obj).f1392c.mContainer;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof q) {
                    qVar = (q) tag;
                } else {
                    qVar = new q(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, qVar);
                }
                hashSet.add(qVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        int i2;
        synchronized (this.f1310a) {
            try {
                boolean z10 = true;
                if (!this.f1310a.isEmpty()) {
                    this.f1319j.f(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.f1313d.size();
                if (this.f1317h != null) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                if (size + i2 <= 0 || !N(this.f1333y)) {
                    z10 = false;
                }
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z10);
                }
                this.f1319j.f(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i2, int i10) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i10) {
            ArrayList arrayList2 = ((a) arrayList.get(i2)).f1229c;
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                j0 j0Var = ((r1) obj).f1406b;
                if (j0Var != null && (viewGroup = j0Var.mContainer) != null) {
                    hashSet.add(q.j(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    public final p1 g(j0 j0Var) {
        String str = j0Var.mWho;
        q1 q1Var = this.f1312c;
        p1 p1Var = (p1) q1Var.f1402b.get(str);
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = new p1(this.f1323o, q1Var, j0Var);
        p1Var2.l(this.f1331w.B.getClassLoader());
        p1Var2.f1394e = this.f1330v;
        return p1Var2;
    }

    public final void h(j0 j0Var) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + j0Var);
        }
        if (!j0Var.mDetached) {
            j0Var.mDetached = true;
            if (j0Var.mAdded) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + j0Var);
                }
                q1 q1Var = this.f1312c;
                synchronized (q1Var.f1401a) {
                    q1Var.f1401a.remove(j0Var);
                }
                j0Var.mAdded = false;
                if (L(j0Var)) {
                    this.G = true;
                }
                b0(j0Var);
            }
        }
    }

    public final void i(boolean z10, Configuration configuration) {
        if (z10 && (this.f1331w instanceof n5.a)) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null) {
                j0Var.performConfigurationChanged(configuration);
                if (z10) {
                    j0Var.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.f1330v < 1) {
            return false;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null && j0Var.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.f1330v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z10 = false;
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j0Var);
                z10 = true;
            }
        }
        if (this.f1314e != null) {
            for (int i2 = 0; i2 < this.f1314e.size(); i2++) {
                j0 j0Var2 = (j0) this.f1314e.get(i2);
                if (arrayList == null || !arrayList.contains(j0Var2)) {
                    j0Var2.onDestroyOptionsMenu();
                }
            }
        }
        this.f1314e = arrayList;
        return z10;
    }

    public final void l() {
        boolean z10 = true;
        this.J = true;
        z(true);
        w();
        s0 s0Var = this.f1331w;
        boolean z11 = s0Var instanceof androidx.lifecycle.e1;
        q1 q1Var = this.f1312c;
        if (z11) {
            z10 = q1Var.f1404d.f1351f;
        } else {
            l.i iVar = s0Var.B;
            if (iVar != null) {
                z10 = true ^ iVar.isChangingConfigurations();
            }
        }
        if (z10) {
            for (c cVar : this.f1321l.values()) {
                ArrayList arrayList = cVar.A;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    q1Var.f1404d.g((String) obj, false);
                }
            }
        }
        u(-1);
        s0 s0Var2 = this.f1331w;
        if (s0Var2 instanceof n5.b) {
            ((n5.b) s0Var2).i(this.f1326r);
        }
        s0 s0Var3 = this.f1331w;
        if (s0Var3 instanceof n5.a) {
            ((n5.a) s0Var3).o(this.f1325q);
        }
        s0 s0Var4 = this.f1331w;
        if (s0Var4 instanceof m5.k) {
            ((m5.k) s0Var4).n(this.f1327s);
        }
        s0 s0Var5 = this.f1331w;
        if (s0Var5 instanceof m5.l) {
            ((m5.l) s0Var5).f(this.f1328t);
        }
        s0 s0Var6 = this.f1331w;
        if ((s0Var6 instanceof a6.p) && this.f1333y == null) {
            ((a6.p) s0Var6).j(this.f1329u);
        }
        this.f1331w = null;
        this.f1332x = null;
        this.f1333y = null;
        if (this.f1316g != null) {
            this.f1319j.e();
            this.f1316g = null;
        }
        h.g gVar = this.C;
        if (gVar != null) {
            gVar.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z10) {
        if (z10 && (this.f1331w instanceof n5.b)) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null) {
                j0Var.performLowMemory();
                if (z10) {
                    j0Var.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z10, boolean z11) {
        if (z11 && (this.f1331w instanceof m5.k)) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null) {
                j0Var.performMultiWindowModeChanged(z10);
                if (z11) {
                    j0Var.mChildFragmentManager.n(z10, true);
                }
            }
        }
    }

    public final void o() {
        ArrayList e6 = this.f1312c.e();
        int size = e6.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = e6.get(i2);
            i2++;
            j0 j0Var = (j0) obj;
            if (j0Var != null) {
                j0Var.onHiddenChanged(j0Var.isHidden());
                j0Var.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.f1330v < 1) {
            return false;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null && j0Var.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.f1330v >= 1) {
            for (j0 j0Var : this.f1312c.f()) {
                if (j0Var != null) {
                    j0Var.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void r(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.equals(this.f1312c.b(j0Var.mWho))) {
                j0Var.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z10, boolean z11) {
        if (z11 && (this.f1331w instanceof m5.l)) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null) {
                j0Var.performPictureInPictureModeChanged(z10);
                if (z11) {
                    j0Var.mChildFragmentManager.s(z10, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z10 = false;
        if (this.f1330v < 1) {
            return false;
        }
        for (j0 j0Var : this.f1312c.f()) {
            if (j0Var != null && j0Var.isMenuVisible() && j0Var.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        j0 j0Var = this.f1333y;
        if (j0Var != null) {
            sb2.append(j0Var.getClass().getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(this.f1333y)));
            sb2.append("}");
        } else {
            s0 s0Var = this.f1331w;
            if (s0Var != null) {
                sb2.append(s0Var.getClass().getSimpleName());
                sb2.append("{");
                sb2.append(Integer.toHexString(System.identityHashCode(this.f1331w)));
                sb2.append("}");
            } else {
                sb2.append("null");
            }
        }
        sb2.append("}}");
        return sb2.toString();
    }

    public final void u(int i2) {
        try {
            this.f1311b = true;
            for (p1 p1Var : this.f1312c.f1402b.values()) {
                if (p1Var != null) {
                    p1Var.f1394e = i2;
                }
            }
            O(i2, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((q) it.next()).i();
            }
            this.f1311b = false;
            z(true);
        } catch (Throwable th2) {
            this.f1311b = false;
            throw th2;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        q1 q1Var = this.f1312c;
        ArrayList arrayList = q1Var.f1401a;
        String str3 = str + "    ";
        HashMap hashMap = q1Var.f1402b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (p1 p1Var : hashMap.values()) {
                printWriter.print(str);
                if (p1Var != null) {
                    j0 j0Var = p1Var.f1392c;
                    printWriter.println(j0Var);
                    j0Var.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i2 = 0; i2 < size2; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((j0) arrayList.get(i2)).toString());
            }
        }
        ArrayList arrayList2 = this.f1314e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(((j0) this.f1314e.get(i10)).toString());
            }
        }
        int size3 = this.f1313d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i11 = 0; i11 < size3; i11++) {
                a aVar = (a) this.f1313d.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.h(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1320k.get());
        synchronized (this.f1310a) {
            try {
                int size4 = this.f1310a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i12 = 0; i12 < size4; i12++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i12);
                        printWriter.print(": ");
                        printWriter.println((d1) this.f1310a.get(i12));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1331w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1332x);
        if (this.f1333y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1333y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1330v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((q) it.next()).i();
        }
    }

    public final void x(d1 d1Var, boolean z10) {
        if (!z10) {
            if (this.f1331w == null) {
                if (this.J) {
                    a0.j.p("FragmentManager has been destroyed");
                    return;
                } else {
                    a0.j.p("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (this.H || this.I) {
                a0.j.p("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.f1310a) {
            try {
                if (this.f1331w == null) {
                    if (z10) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f1310a.add(d1Var);
                X();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void y(boolean z10) {
        if (!this.f1311b) {
            if (this.f1331w == null) {
                if (this.J) {
                    a0.j.p("FragmentManager has been destroyed");
                    return;
                } else {
                    a0.j.p("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Looper.myLooper() == this.f1331w.L.getLooper()) {
                if (!z10 && (this.H || this.I)) {
                    a0.j.p("Can not perform this action after onSaveInstanceState");
                    return;
                } else if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                } else {
                    return;
                }
            } else {
                a0.j.p("Must be called from main thread of fragment host");
                return;
            }
        }
        a0.j.p("FragmentManager is already executing transactions");
    }

    public final boolean z(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        a aVar;
        y(z10);
        if (!this.f1318i && (aVar = this.f1317h) != null) {
            aVar.f1246u = false;
            aVar.d();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1317h + " as part of execPendingActions for actions " + this.f1310a);
            }
            this.f1317h.f(false, false);
            this.f1310a.add(0, this.f1317h);
            ArrayList arrayList2 = this.f1317h.f1229c;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                j0 j0Var = ((r1) obj).f1406b;
                if (j0Var != null) {
                    j0Var.mTransitioning = false;
                }
            }
            this.f1317h = null;
        }
        boolean z12 = false;
        while (true) {
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.M;
            synchronized (this.f1310a) {
                if (this.f1310a.isEmpty()) {
                    z11 = false;
                } else {
                    int size2 = this.f1310a.size();
                    int i10 = 0;
                    z11 = false;
                    while (true) {
                        arrayList = this.f1310a;
                        if (i10 >= size2) {
                            break;
                        }
                        z11 |= ((d1) arrayList.get(i10)).a(arrayList3, arrayList4);
                        i10++;
                    }
                    arrayList.clear();
                    this.f1331w.L.removeCallbacks(this.P);
                }
            }
            if (!z11) {
                break;
            }
            this.f1311b = true;
            try {
                U(this.L, this.M);
                d();
                z12 = true;
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        e0();
        if (this.K) {
            this.K = false;
            ArrayList d4 = this.f1312c.d();
            int size3 = d4.size();
            int i11 = 0;
            while (i11 < size3) {
                Object obj2 = d4.get(i11);
                i11++;
                p1 p1Var = (p1) obj2;
                j0 j0Var2 = p1Var.f1392c;
                if (j0Var2.mDeferStart) {
                    if (this.f1311b) {
                        this.K = true;
                    } else {
                        j0Var2.mDeferStart = false;
                        p1Var.k();
                    }
                }
            }
        }
        this.f1312c.f1402b.values().removeAll(Collections.singleton(null));
        return z12;
    }
}
