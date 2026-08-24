package defpackage;

import android.app.ActivityManager;
import android.content.ClipDescription;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s63  reason: default package */
/* loaded from: classes.dex */
public final class s63 implements jl3, so2, mm5, rb0, x14, oj1, v23, b51 {
    public final /* synthetic */ int A;
    public final Object B;

    public s63(int i, byte b) {
        Object x31Var;
        this.A = i;
        switch (i) {
            case 14:
                this.B = new qx3();
                new HashMap();
                return;
            case 27:
                if (Build.VERSION.SDK_INT >= 28) {
                    x31Var = new w31(19);
                } else {
                    x31Var = new x31(19);
                }
                this.B = x31Var;
                return;
            case 28:
                this.B = new hz3((Object) null);
                return;
            default:
                k04 k04Var = new k04();
                this.B = k04Var;
                if (!k04Var.B) {
                    if (k04Var.L) {
                        s05.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    k04Var.a();
                    k04Var.L = true;
                    return;
                }
                return;
        }
    }

    public static final s63 A(s35 s35Var, os0 os0Var) {
        byte[] bArr;
        j42 q = j42.q(s35Var.A(), g82.a());
        if (q.o().size() != 0) {
            try {
                ea0 o = q.o();
                int size = o.size();
                if (size == 0) {
                    bArr = aa3.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    o.d(bArr2, size);
                    bArr = bArr2;
                }
                ii3 t = ii3.t(os0Var.T(bArr, new byte[0]), g82.a());
                if (t.p() > 0) {
                    return new s63(t, 5);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (ub3 unused) {
                e41.v("invalid keyset, corrupted key material");
                return null;
            }
        }
        e41.v("empty keyset");
        return null;
    }

    public static oq3 C(s63 s63Var, int i) {
        qn2 qn2Var;
        pr3 pr3Var = (pr3) s63Var.B;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        qn2 qn2Var2 = qn2Var;
        vl6 N = ln2.N(t);
        try {
            jr3 jr3Var = (jr3) pr3Var.f.getValue();
            ln2.V(t, N, qn2Var2);
            return pr3Var.q.a(i, jr3Var.j, pr3Var.d, new v83(i, jr3Var));
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var2);
            throw th;
        }
    }

    public static ed6 m(s23 s23Var) {
        if (s23Var == null) {
            return null;
        }
        return new ed6(s23Var, new Size(s23Var.getWidth(), s23Var.getHeight()), new ke0(new bg1(null, sy6.b, s23Var.S().c())));
    }

    public static bu6 u(re5 re5Var, z23 z23Var, c44 c44Var, d44 d44Var) {
        String str;
        boolean z;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(z23Var.a.getResources(), d44Var.a);
        zb1 zb1Var = zb1.MEMORY_CACHE;
        Map map = d44Var.b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Bitmap.Config[] configArr = k.a;
        if (re5Var != null && re5Var.A) {
            z2 = true;
        }
        return new bu6(bitmapDrawable, z23Var, zb1Var, c44Var, str, z, z2);
    }

    public static int z() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, bh5] */
    public ArrayList B(int i) {
        qn2 qn2Var;
        wo3 wo3Var;
        ArrayList arrayList = new ArrayList();
        ip3 ip3Var = (ip3) this.B;
        vl6 t = ln2.t();
        if (t != null) {
            qn2Var = t.e();
        } else {
            qn2Var = null;
        }
        vl6 N = ln2.N(t);
        try {
            if (ip3Var.b) {
                wo3Var = ip3Var.c;
            } else {
                wo3Var = (wo3) ip3Var.e.getValue();
            }
            wo3 wo3Var2 = wo3Var;
            if (wo3Var2 != null) {
                ?? obj = new Object();
                obj.A = 1;
                List list = (List) wo3Var2.k.g(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                bh5 bh5Var = obj;
                while (i2 < size) {
                    vr4 vr4Var = (vr4) list.get(i2);
                    pq3 pq3Var = ip3Var.o;
                    int intValue = ((Number) vr4Var.A).intValue();
                    long j = ((q21) vr4Var.B).a;
                    ap3 ap3Var = ip3.w;
                    bh5 bh5Var2 = bh5Var;
                    arrayList.add(pq3Var.a(intValue, j, false, new cn((ArrayList) null, bh5Var2, list, i, wo3Var2)));
                    i2++;
                    bh5Var = bh5Var2;
                }
            }
            ln2.V(t, N, qn2Var);
            return arrayList;
        } catch (Throwable th) {
            ln2.V(t, N, qn2Var);
            throw th;
        }
    }

    @Override // defpackage.v23
    public s23 a() {
        return m(((ci) this.B).a());
    }

    @Override // defpackage.v23
    public int b() {
        return ((ci) this.B).b();
    }

    @Override // defpackage.oj1
    public boolean c(float f) {
        if (f == RecyclerView.B1) {
            return false;
        }
        k();
        ((NestedScrollView) this.B).j((int) f);
        return true;
    }

    @Override // defpackage.v23
    public void close() {
        ((ci) this.B).close();
    }

    @Override // defpackage.v23
    public void d() {
        ((ci) this.B).d();
    }

    @Override // defpackage.v23
    public void e(u23 u23Var, Executor executor) {
        ((ci) this.B).e(new pk0(2, this, u23Var), executor);
    }

    @Override // defpackage.v23
    public int f() {
        return ((ci) this.B).f();
    }

    @Override // defpackage.oj1
    public float g() {
        return -((NestedScrollView) this.B).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.v23
    public int getHeight() {
        return ((ci) this.B).getHeight();
    }

    @Override // defpackage.v23
    public Surface getSurface() {
        return ((ci) this.B).getSurface();
    }

    @Override // defpackage.v23
    public int getWidth() {
        return ((ci) this.B).getWidth();
    }

    @Override // defpackage.b51
    public Object h(Object obj) {
        return Optional.ofNullable(((b51) this.B).h((yl5) obj));
    }

    @Override // defpackage.so2
    public void i(Throwable th) {
        Object obj;
        ci0 ci0Var = (ci0) this.B;
        rk3 rk3Var = new rk3(ci0Var, 1);
        if (nj2.x()) {
            rk3Var.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            np2.A("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new q64(9, rk3Var, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        gj0 gj0Var = (gj0) ci0Var.d;
        if (gj0Var != null) {
            gj0Var.getClass();
            gh0 gh0Var = gj0Var.n;
            gh0Var.getClass();
            gt0.W0(gh0Var.n, new k0(ci0Var, 16));
            gj0 gj0Var2 = (gj0) ci0Var.d;
            gj0Var2.getClass();
            synchronized (gj0Var2.b) {
                try {
                    gj0Var2.e.removeCallbacksAndMessages("retry_token");
                    int ordinal = gj0Var2.p.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2 || ordinal == 3) {
                                gj0Var2.p = fj0.SHUTDOWN;
                                gj0.a(gj0Var2.r);
                                gj0Var2.q = ak7.W(new h61(gj0Var2, 4));
                            }
                            obj = gj0Var2.q;
                        } else {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                    } else {
                        gj0Var2.p = fj0.SHUTDOWN;
                        obj = n33.L;
                    }
                } finally {
                }
            }
        } else {
            obj = n33.L;
        }
        obj.getClass();
        synchronized (ci0Var.a) {
            ci0Var.b = null;
            ci0Var.c = obj;
            ((HashMap) ci0Var.g).clear();
            ((HashSet) ci0Var.h).clear();
        }
        ci0Var.j(null, null);
    }

    @Override // defpackage.v23
    public s23 j() {
        return m(((ci) this.B).j());
    }

    @Override // defpackage.oj1
    public void k() {
        ((NestedScrollView) this.B).R.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x61 l(bm0 bm0Var, s41 s41Var) {
        ei4 ei4Var;
        int i;
        if (s41Var instanceof ei4) {
            ei4Var = (ei4) s41Var;
            int i2 = ei4Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ei4Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = ei4Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ei4Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    ei4Var.Y = 1;
                    if (((tp6) this.B).b(bm0Var, ei4Var) == x61Var) {
                        return x61Var;
                    }
                }
                e41.c();
                return null;
            }
        }
        ei4Var = new ei4(this, s41Var);
        Object obj2 = ei4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ei4Var.Y;
        if (i == 0) {
        }
        e41.c();
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r6 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (java.lang.Math.abs(r2 - (r10 * r3)) > 1.0d) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
        if (java.lang.Math.abs(r8 - r1) > 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
        if (java.lang.Math.abs(r2 - r3) > 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
        if (r12 != 1.0d) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
        if (r12 <= 1.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r6 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0114, code lost:
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d44 n(z23 z23Var, c44 c44Var, wi6 wi6Var, y56 y56Var) {
        d44 d44Var;
        Boolean bool;
        boolean z;
        int i;
        int i2;
        d44 d44Var2;
        d44 d44Var3;
        double d;
        boolean equals;
        if (z23Var.p.getReadEnabled()) {
            se5 se5Var = (se5) ((pe5) this.B).c.getValue();
            if (se5Var != null) {
                d44Var = se5Var.a.a(c44Var);
                if (d44Var == null) {
                    d44Var = se5Var.b.a(c44Var);
                }
            } else {
                d44Var = null;
            }
            if (d44Var != null) {
                Bitmap bitmap = d44Var.a;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (nb3.B(config) && !z23Var.m) {
                    d44Var2 = d44Var;
                    equals = false;
                } else {
                    Object obj = d44Var.b.get("coil#is_sampled");
                    if (obj instanceof Boolean) {
                        bool = (Boolean) obj;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        z = bool.booleanValue();
                    } else {
                        z = false;
                    }
                    if (nb3.k(wi6Var, wi6.c)) {
                        d44Var2 = d44Var;
                        d44Var3 = null;
                    } else {
                        String str = (String) c44Var.B.get("coil#transformation_size");
                        if (str != null) {
                            equals = str.equals(wi6Var.toString());
                            d44Var2 = d44Var;
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            ge7 ge7Var = wi6Var.a;
                            if (ge7Var instanceof pj1) {
                                i = ((pj1) ge7Var).m;
                            } else {
                                i = Integer.MAX_VALUE;
                            }
                            ge7 ge7Var2 = wi6Var.b;
                            if (ge7Var2 instanceof pj1) {
                                i2 = ((pj1) ge7Var2).m;
                            } else {
                                i2 = Integer.MAX_VALUE;
                            }
                            double N = ak7.N(width, height, i, i2, y56Var);
                            boolean a = h.a(z23Var);
                            if (a) {
                                if (N > 1.0d) {
                                    d = 1.0d;
                                } else {
                                    d = N;
                                }
                                d44Var2 = d44Var;
                                d44Var3 = null;
                                if (Math.abs(i - (width * d)) > 1.0d) {
                                }
                                equals = true;
                            } else {
                                d44Var2 = d44Var;
                                d44Var3 = null;
                                if (i != Integer.MIN_VALUE) {
                                    if (i != Integer.MAX_VALUE) {
                                    }
                                }
                                if (i2 != Integer.MIN_VALUE) {
                                    if (i2 != Integer.MAX_VALUE) {
                                    }
                                }
                                equals = true;
                            }
                        }
                    }
                    if (!equals) {
                        return d44Var2;
                    }
                    return d44Var3;
                }
                d44Var3 = null;
                if (!equals) {
                }
            }
        }
        return null;
    }

    public synchronized s63 o() {
        ii3 ii3Var;
        ii3Var = (ii3) ((fi3) this.B).a();
        if (ii3Var.p() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new s63(ii3Var, 5);
    }

    @Override // defpackage.so2, com.google.android.gms.tasks.OnSuccessListener
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void r1 = (Void) obj;
    }

    public synchronized boolean p(int i) {
        for (hi3 hi3Var : Collections.unmodifiableList(((ii3) ((fi3) this.B).B).q())) {
            if (hi3Var.r() == i) {
                return true;
            }
        }
        return false;
    }

    public c44 q(z23 z23Var, Object obj, fo4 fo4Var, k62 k62Var) {
        String str;
        Map map;
        c44 c44Var = z23Var.e;
        List list = z23Var.h;
        if (c44Var != null) {
            return c44Var;
        }
        List list2 = ((pe5) this.B).g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                vr4 vr4Var = (vr4) list2.get(i);
                zh3 zh3Var = (zh3) vr4Var.A;
                if (((Class) vr4Var.B).isAssignableFrom(obj.getClass())) {
                    zh3Var.getClass();
                    str = zh3Var.a(obj, fo4Var);
                    if (str != null) {
                        break;
                    }
                }
                i++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map2 = z23Var.z.A;
        if (map2.isEmpty()) {
            map = zt1.A;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (!it.hasNext()) {
                map = linkedHashMap;
            } else {
                ((Map.Entry) it.next()).getValue().getClass();
                u34.a();
                return null;
            }
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new c44(str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            if (list.size() <= 0) {
                linkedHashMap2.put("coil#transformation_size", fo4Var.d.toString());
            } else {
                list.get(0).getClass();
                u34.a();
                return null;
            }
        }
        return new c44(str, linkedHashMap2);
    }

    public synchronized hi3 r(mh3 mh3Var) {
        vg3 c;
        int z;
        try {
            c = ai5.c(mh3Var);
            synchronized (this) {
                z = z();
                while (p(z)) {
                    z = z();
                }
            }
            return (hi3) r2.a();
        } catch (Throwable th) {
            throw th;
        }
        jp4 p = mh3Var.p();
        if (p == jp4.UNKNOWN_PREFIX) {
            p = jp4.TINK;
        }
        gi3 v = hi3.v();
        v.c();
        hi3.m((hi3) v.B, c);
        v.c();
        hi3.p((hi3) v.B, z);
        hh3 hh3Var = hh3.ENABLED;
        v.c();
        hi3.o((hi3) v.B, hh3Var);
        v.c();
        hi3.n((hi3) v.B, p);
        return (hi3) v.a();
    }

    @Override // defpackage.rb0
    public Object s(qb0 qb0Var) {
        boolean z;
        pw3 pw3Var = (pw3) this.B;
        if (pw3Var.Y == null) {
            z = true;
        } else {
            z = false;
        }
        np2.A("The result can only set once!", z);
        pw3Var.Y = qb0Var;
        return "ListFuture[" + this + "]";
    }

    public vg3 t(ea0 ea0Var) {
        za zaVar;
        ug3 ug3Var;
        bb bbVar = (bb) this.B;
        try {
            switch (bbVar.d) {
                case 0:
                    zaVar = new za(bbVar, 0);
                    break;
                default:
                    zaVar = new za(bbVar, 1);
                    break;
            }
            c1 S = zaVar.S(ea0Var);
            zaVar.i0(S);
            c1 c1Var = (c1) zaVar.m(S);
            tg3 t = vg3.t();
            String a = bbVar.a();
            t.c();
            vg3.m((vg3) t.B, a);
            try {
                int a2 = c1Var.a();
                byte[] bArr = new byte[a2];
                ms0 ms0Var = new ms0(bArr, a2);
                c1Var.d(ms0Var);
                if (ms0Var.c - ms0Var.d == 0) {
                    ca0 ca0Var = new ca0(bArr);
                    t.c();
                    vg3.n((vg3) t.B, ca0Var);
                    switch (bbVar.d) {
                        case 0:
                            ug3Var = ug3.SYMMETRIC;
                            break;
                        default:
                            ug3Var = ug3.SYMMETRIC;
                            break;
                    }
                    t.c();
                    vg3.o((vg3) t.B, ug3Var);
                    return (vg3) t.a();
                }
                throw new IllegalStateException("Did not write as much data as expected.");
            } catch (IOException e) {
                throw new RuntimeException(c1Var.b("ByteString"), e);
            }
        } catch (ub3 e2) {
            throw new GeneralSecurityException("Unexpected proto", e2);
        }
    }

    public String toString() {
        switch (this.A) {
            case 5:
                return bk7.a((ii3) this.B).toString();
            default:
                return super.toString();
        }
    }

    public void v(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.B).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void w() {
        LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
        int i = LayoutEditorActivity.N0;
        layoutEditorActivity.B();
        yl3 C = layoutEditorActivity.C();
        fk3 fk3Var = (fk3) C.i.getValue();
        if (fk3Var != null) {
            hv.L(to7.a(C), null, null, new wl3(C, fk3Var, null, 0), 3);
        }
        layoutEditorActivity.finish();
    }

    public void x() {
        int i = LayoutEditorActivity.N0;
        ((LayoutEditorActivity) this.B).D();
    }

    public yc1 y(ap3 ap3Var, te teVar) {
        long j;
        boolean z;
        long D;
        hz3 hz3Var = (hz3) this.B;
        List list = (List) ap3Var.B;
        hz3 hz3Var2 = new hz3(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            xy4 xy4Var = (xy4) list.get(i);
            long j2 = xy4Var.a;
            wy4 wy4Var = (wy4) hz3Var.b(j2);
            if (wy4Var == null) {
                j = xy4Var.b;
                D = xy4Var.d;
                z = false;
            } else {
                long j3 = wy4Var.a;
                j = j3;
                z = wy4Var.c;
                D = teVar.D(wy4Var.b);
            }
            long j4 = xy4Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            hz3Var2.f(j4, new vy4(j4, xy4Var.b, xy4Var.d, xy4Var.e, xy4Var.f, j, D, z, xy4Var.g, xy4Var.i, xy4Var.j, xy4Var.k, xy4Var.l, xy4Var.m));
            boolean z2 = xy4Var.e;
            if (z2) {
                hz3Var.f(j2, new wy4(xy4Var.b, xy4Var.c, z2));
            } else {
                hz3Var.g(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new yc1(hz3Var2, ap3Var);
    }

    public s63(pe5 pe5Var, ap3 ap3Var) {
        this.A = 18;
        this.B = pe5Var;
    }

    public s63(Context context) {
        this.A = 15;
        StringBuilder sb = ck7.a;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.B = new nr1((int) ((((context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7), 1);
    }

    public s63(bb bbVar, Class cls) {
        this.A = 3;
        if (!bbVar.b.keySet().contains(cls) && !Void.class.equals(cls)) {
            e41.k("Given internalKeyMananger ", bbVar.toString(), " does not support primitive class ", cls.getName());
            throw null;
        } else {
            this.B = bbVar;
        }
    }

    public /* synthetic */ s63(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public s63(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.A = 0;
        if (Build.VERSION.SDK_INT >= 25) {
            this.B = new q63(uri, clipDescription, uri2);
        } else {
            this.B = new bt(uri, clipDescription, uri2, 25);
        }
    }

    public s63(FileInputStream fileInputStream) {
        this.A = 1;
        this.B = new pm0(fileInputStream, qm0.a);
    }

    public s63(int i) {
        this.A = 22;
        this.B = up6.a(new int[i]);
    }
}
