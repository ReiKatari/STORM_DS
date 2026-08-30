package b9;

import a1.w0;
import a4.m0;
import a4.n;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Handler;
import android.os.StatFs;
import android.util.Size;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Surface;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.lifecycle.c1;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.preference.Preference;
import c1.f1;
import c1.g1;
import cd.q1;
import d0.d1;
import d0.i1;
import d0.j1;
import d0.p1;
import d1.b2;
import d1.p;
import d2.t;
import fj.e0;
import fj.f0;
import fj.j;
import fj.x;
import j0.a1;
import j0.j0;
import j0.l2;
import j0.o1;
import j0.z0;
import java.io.File;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import l.i0;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n0.k;
import ob.i;
import oe.u;
import oe.y;
import p.a0;
import p.s;
import p7.m;
import pi.r;
import w.b0;
import zb.l;
import zb.q;
import zb.v;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e implements c3.h, b2, f0 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;
    public Object X;

    /* JADX WARN: Multi-variable type inference failed */
    public e(z0 z0Var, Size size, CameraCharacteristics cameraCharacteristics, boolean z10) {
        int i2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        j1 j1Var;
        d1 d1Var;
        t tVar;
        boolean z14;
        boolean z15;
        int i11;
        t tVar2;
        this.A = 13;
        l0.f.e();
        this.B = z0Var;
        b0 b0Var = (b0) z0Var.h(l2.F, null);
        if (b0Var != null) {
            i1 i1Var = new i1();
            b0Var.a(z0Var, i1Var);
            i1Var.j();
            n nVar = new n(13, (byte) 0);
            this.L = nVar;
            Executor executor = (Executor) z0Var.h(n0.g.T, ij.a.l0());
            Objects.requireNonNull(executor);
            d0.c cVar = new d0.c(executor, cameraCharacteristics);
            this.R = cVar;
            ArrayList arrayList = new ArrayList();
            if (((Integer) z0Var.h(a1.f7149o, 0)).intValue() != 0) {
                arrayList.add(32);
                arrayList.add(256);
            } else {
                Integer num = (Integer) z0Var.h(z0.R, null);
                if (num != null) {
                    i2 = num.intValue();
                } else {
                    Integer num2 = (Integer) z0Var.h(a1.f7148n, null);
                    if (num2 != null && num2.intValue() == 4101) {
                        i2 = 4101;
                    } else if (num2 != null && num2.intValue() == 32) {
                        i2 = 32;
                    } else {
                        i2 = 256;
                    }
                }
                arrayList.add(Integer.valueOf(i2));
            }
            int y10 = z0Var.y();
            if (z0Var.h(z0.Y, null) == null) {
                r0.e eVar = new r0.e();
                r0.e eVar2 = new r0.e();
                i0.a aVar = new i0.a(size, y10, arrayList, z10, eVar, eVar2);
                this.X = aVar;
                if (((i0.a) nVar.R) == null && ((i1) nVar.B) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                m.o("CaptureNode does not support recreation yet.", z11);
                nVar.R = aVar;
                Object obj = new Object();
                if (arrayList.size() > 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z10) {
                    if (z12) {
                        z13 = false;
                        i11 = 1;
                        d1 d1Var2 = new d1(size.getWidth(), size.getHeight(), 256, 4);
                        k0.d.s(obj, d1Var2.B);
                        d1 d1Var3 = new d1(size.getWidth(), size.getHeight(), 32, 4);
                        k0.d.s(obj, d1Var3.B);
                        d1Var = d1Var3;
                        tVar2 = d1Var2;
                    } else {
                        z13 = false;
                        i11 = 1;
                        d1 d1Var4 = new d1(size.getWidth(), size.getHeight(), y10, 4);
                        k0.d.s(obj, d1Var4.B);
                        d1Var = null;
                        tVar2 = d1Var4;
                    }
                    i10 = i11;
                    j1Var = new j1(nVar, i10);
                    tVar = tVar2;
                } else {
                    z13 = false;
                    i10 = 1;
                    t tVar3 = new t(15, a.a.n(size.getWidth(), size.getHeight(), y10, 4));
                    j1Var = new j1(nVar, 2);
                    d1Var = null;
                    tVar = tVar3;
                }
                Surface surface = tVar.getSurface();
                Objects.requireNonNull(surface);
                if (aVar.f6594a == null) {
                    z14 = i10;
                } else {
                    z14 = z13;
                }
                m.o("The surface is already set.", z14);
                aVar.f6594a = new p1(surface, size, y10);
                nVar.B = new i1(tVar);
                tVar.b(new j(nVar), ij.a.p0());
                if (z12 && d1Var != null) {
                    Surface surface2 = d1Var.getSurface();
                    if (aVar.f6595b == null) {
                        z15 = i10;
                    } else {
                        z15 = z13;
                    }
                    m.o("The secondary surface is already set.", z15);
                    aVar.f6595b = new p1(surface2, size, y10);
                    nVar.L = new i1(d1Var);
                    d1Var.b(new j(nVar), ij.a.p0());
                }
                eVar.f12577b = j1Var;
                eVar2.f12577b = new j1(nVar, 3);
                IncorrectJpegMetadataQuirk incorrectJpegMetadataQuirk = (IncorrectJpegMetadataQuirk) ((o1) cVar.R).j(IncorrectJpegMetadataQuirk.class);
                return;
            }
            o.b();
            throw null;
        }
        a0.j.g((String) z0Var.h(k.U, z0Var.toString()), "Implementation is missing option unpacker for ");
        throw null;
    }

    public static void H(e eVar, ti.k kVar, ti.n nVar, ti.k kVar2, int i2) {
        i0 i0Var;
        if ((i2 & 1) != 0) {
            kVar = null;
        }
        if ((i2 & 2) != 0) {
            nVar = null;
        }
        if ((i2 & 4) != 0) {
            kVar2 = null;
        }
        eVar.getClass();
        TimeZone timeZone = qi.g.f12552a;
        boolean isShutdown = ((ThreadPoolExecutor) eVar.u()).isShutdown();
        synchronized (eVar) {
            if (nVar != null) {
                try {
                    if (!((ArrayDeque) eVar.X).remove(nVar)) {
                        throw new IllegalStateException("Call wasn't in-flight!");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (kVar2 != null) {
                kVar2.B.decrementAndGet();
                if (!((ArrayDeque) eVar.R).remove(kVar2)) {
                    throw new IllegalStateException("Call wasn't in-flight!");
                }
            }
            if (kVar != null) {
                ((ArrayDeque) eVar.L).add(kVar);
                ti.k v10 = eVar.v(((r) kVar.L.B.f14089b).f11784d);
                if (v10 != null) {
                    kVar.B = v10.B;
                }
            }
            if ((nVar != null || kVar2 != null) && (isShutdown || ((ArrayDeque) eVar.R).isEmpty())) {
                ((ArrayDeque) eVar.X).isEmpty();
            }
            if (isShutdown) {
                List p0 = l.p0((ArrayDeque) eVar.L);
                ((ArrayDeque) eVar.L).clear();
                i0Var = new i0(23, p0);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayDeque) eVar.L).iterator();
                it.getClass();
                while (it.hasNext()) {
                    ti.k kVar3 = (ti.k) it.next();
                    if (((ArrayDeque) eVar.R).size() >= 64) {
                        break;
                    } else if (kVar3.B.get() < 5) {
                        it.remove();
                        kVar3.B.incrementAndGet();
                        arrayList.add(kVar3);
                        ((ArrayDeque) eVar.R).add(kVar3);
                    }
                }
                i0Var = new i0(23, arrayList);
            }
        }
        int size = ((List) i0Var.B).size();
        for (int i10 = 0; i10 < size; i10++) {
            ti.k kVar4 = (ti.k) ((List) i0Var.B).get(i10);
            if (kVar4 != kVar) {
                ti.n nVar2 = kVar4.L;
            }
            if (isShutdown) {
                kVar4.getClass();
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(null);
                ti.n nVar3 = kVar4.L;
                nVar3.k(interruptedIOException);
                kVar4.A.m(nVar3, interruptedIOException);
            } else {
                ExecutorService u4 = eVar.u();
                kVar4.getClass();
                ti.n nVar4 = kVar4.L;
                nVar4.A.f11827a.getClass();
                try {
                    try {
                        ((ThreadPoolExecutor) u4).execute(kVar4);
                    } catch (Throwable th3) {
                        e eVar2 = nVar4.A.f11827a;
                        eVar2.getClass();
                        H(eVar2, null, null, kVar4, 3);
                        throw th3;
                    }
                } catch (RejectedExecutionException e6) {
                    InterruptedIOException interruptedIOException2 = new InterruptedIOException("executor rejected");
                    interruptedIOException2.initCause(e6);
                    ti.n nVar5 = kVar4.L;
                    nVar5.k(interruptedIOException2);
                    kVar4.A.m(nVar5, interruptedIOException2);
                    e eVar3 = nVar4.A.f11827a;
                    eVar3.getClass();
                    H(eVar3, null, null, kVar4, 3);
                }
            }
        }
    }

    public static void b(e eVar, f7.d dVar) {
        eVar.getClass();
        dVar.getClass();
        if (((LinkedHashSet) eVar.R).add(dVar)) {
            f7.g gVar = (f7.g) eVar.L;
            gVar.getClass();
            if (dVar.f4933c == null) {
                gVar.f4942e.addFirst(dVar);
                dVar.f4933c = eVar;
                gVar.b();
                return;
            }
            j.m(dVar, "' is already registered with a dispatcher", "Handler '");
        }
    }

    public y0 B(String str, nc.e eVar) {
        y0 y0Var;
        y0 a10;
        synchronized (((y6.c) this.X)) {
            try {
                androidx.lifecycle.d1 d1Var = (androidx.lifecycle.d1) this.B;
                d1Var.getClass();
                y0Var = (y0) d1Var.f1470a.get(str);
                if (eVar.d(y0Var)) {
                    androidx.lifecycle.a1 a1Var = (androidx.lifecycle.a1) this.L;
                    if (a1Var instanceof v0) {
                        v0 v0Var = (v0) a1Var;
                        y0Var.getClass();
                        androidx.lifecycle.r rVar = v0Var.f1495d;
                        if (rVar != null) {
                            q7.d dVar = v0Var.f1496e;
                            dVar.getClass();
                            s0.a(y0Var, dVar, rVar);
                        }
                    }
                    y0Var.getClass();
                } else {
                    w6.d dVar2 = new w6.d((w6.c) this.R);
                    dVar2.f14161a.put(c1.f1454b, str);
                    androidx.lifecycle.a1 a1Var2 = (androidx.lifecycle.a1) this.L;
                    a1Var2.getClass();
                    try {
                        try {
                            a10 = a1Var2.c(eVar, dVar2);
                        } catch (AbstractMethodError unused) {
                            Class cls = eVar.f10259a;
                            cls.getClass();
                            a10 = a1Var2.b(cls, dVar2);
                        }
                    } catch (AbstractMethodError unused2) {
                        Class cls2 = eVar.f10259a;
                        cls2.getClass();
                        a10 = a1Var2.a(cls2);
                    }
                    y0Var = a10;
                    androidx.lifecycle.d1 d1Var2 = (androidx.lifecycle.d1) this.B;
                    d1Var2.getClass();
                    y0Var.getClass();
                    y0 y0Var2 = (y0) d1Var2.f1470a.put(str, y0Var);
                    if (y0Var2 != null) {
                        y0Var2.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return y0Var;
    }

    public int C() {
        return ((i) this.R).A.length();
    }

    public e D() {
        int i2;
        CharSequence charSequence = (CharSequence) this.L;
        Matcher matcher = (Matcher) this.B;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i10 = end + i2;
        if (i10 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            matcher2.getClass();
            return p7.l.f(matcher2, i10, charSequence);
        }
        return null;
    }

    public boolean E(o.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.L).onActionItemClicked(w(aVar), new s((Context) this.B, (s5.a) menuItem));
    }

    @Override // d1.y1
    public p F(long j2, p pVar, p pVar2, p pVar3) {
        if (((p) this.L) == null) {
            this.L = pVar.c();
        }
        p pVar4 = (p) this.L;
        if (pVar4 != null) {
            int b10 = pVar4.b();
            int i2 = 0;
            while (true) {
                p pVar5 = (p) this.L;
                if (i2 < b10) {
                    if (pVar5 != null) {
                        pVar5.e(i2, ((a0.b) this.B).R(i2).b(j2, pVar.a(i2), pVar2.a(i2), pVar3.a(i2)));
                        i2++;
                    } else {
                        nc.k.f("valueVector");
                        throw null;
                    }
                } else if (pVar5 != null) {
                    return pVar5;
                } else {
                    nc.k.f("valueVector");
                    throw null;
                }
            }
        } else {
            nc.k.f("valueVector");
            throw null;
        }
    }

    public boolean G(o.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.L;
        o.e w10 = w(aVar);
        w0 w0Var = (w0) this.X;
        Menu menu2 = (Menu) w0Var.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.B, (p.l) menu);
            w0Var.put(menu, menu2);
        }
        return callback.onCreateActionMode(w10, menu2);
    }

    public void I(v8.e eVar, int i2) {
        Class<?> cls = eVar.getClass();
        ob.b bVar = (ob.b) this.B;
        qb.a aVar = (qb.a) ((Map) bVar.f10869g.B).get(cls);
        if (aVar != null) {
            Object a10 = aVar.a(bVar, (ob.d) this.L);
            i iVar = (i) this.R;
            StringBuilder sb2 = iVar.A;
            int length = sb2.length();
            int length2 = sb2.length();
            if (length > i2 && i2 >= 0 && length <= length2) {
                i.c(iVar, a10, i2, length);
            }
        }
    }

    public void K(q8.j jVar) {
        jVar.getClass();
        ad.c cVar = new ad.c(24, this, jVar);
        synchronized (this.R) {
            Runnable runnable = (Runnable) ((LinkedHashMap) this.X).put(jVar, cVar);
        }
        ((Handler) ((i0) this.B).B).postDelayed(cVar, 5400000L);
    }

    @Override // d1.y1
    public p L(long j2, p pVar, p pVar2, p pVar3) {
        if (((p) this.R) == null) {
            this.R = pVar3.c();
        }
        p pVar4 = (p) this.R;
        if (pVar4 != null) {
            int b10 = pVar4.b();
            int i2 = 0;
            while (true) {
                p pVar5 = (p) this.R;
                if (i2 < b10) {
                    if (pVar5 != null) {
                        pVar5.e(i2, ((a0.b) this.B).R(i2).c(j2, pVar.a(i2), pVar2.a(i2), pVar3.a(i2)));
                        i2++;
                    } else {
                        nc.k.f("velocityVector");
                        throw null;
                    }
                } else if (pVar5 != null) {
                    return pVar5;
                } else {
                    nc.k.f("velocityVector");
                    throw null;
                }
            }
        } else {
            nc.k.f("velocityVector");
            throw null;
        }
    }

    public void M(v8.e eVar) {
        ob.e eVar2 = (ob.e) ((Map) this.X).get(eVar.getClass());
        if (eVar2 != null) {
            eVar2.a(this, eVar);
        } else {
            N(eVar);
        }
    }

    public void N(v8.e eVar) {
        for (v8.e eVar2 = (v8.e) eVar.f13764c; eVar2 != null; eVar2 = (v8.e) eVar2.f13767f) {
            eVar2.a(this);
        }
    }

    @Override // d1.y1
    public long c(p pVar, p pVar2, p pVar3) {
        int b10 = pVar.b();
        long j2 = 0;
        for (int i2 = 0; i2 < b10; i2++) {
            j2 = Math.max(j2, ((a0.b) this.B).R(i2).d(pVar.a(i2), pVar2.a(i2), pVar3.a(i2)));
        }
        return j2;
    }

    public void d(f7.f fVar) {
        if (((LinkedHashSet) this.X).add(fVar)) {
            ((f7.g) this.L).a(this, fVar, -1);
        }
    }

    public void e(f7.j jVar, int i2) {
        if (i2 != 1 && i2 != 0) {
            a0.j.e(w.d.l(i2, "Unsupported priority value: "));
        } else if (((LinkedHashSet) this.X).add(jVar)) {
            ((f7.g) this.L).a(this, jVar, i2);
        }
    }

    public void f(String str, String str2) {
        String str3;
        if (((String) this.X).length() == 0) {
            str3 = "?";
        } else {
            str3 = "&";
        }
        this.X = ((String) this.X) + str3 + str + '=' + str2;
    }

    public void g(v8.e eVar) {
        if (((v8.e) eVar.f13767f) != null) {
            s();
            ((i) this.R).a('\n');
        }
    }

    public h h() {
        Context context = (Context) this.B;
        m9.c cVar = (m9.c) this.L;
        yb.n nVar = new yb.n(new mc.a(this) { // from class: b9.d
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                k9.g tVar;
                int i2;
                e9.h hVar;
                switch (r2) {
                    case 0:
                        Context context2 = (Context) this.B.B;
                        Bitmap.Config[] configArr = q9.g.f12393a;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService(ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i10 = 0;
                        bk.a aVar = new bk.a(4, (byte) 0);
                        if (d4 > 0.0d) {
                            Bitmap.Config[] configArr2 = q9.g.f12393a;
                            try {
                                Object systemService2 = context2.getSystemService(ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i2 = activityManager.getLargeMemoryClass();
                                } else {
                                    i2 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i2 = 256;
                            }
                            double d10 = d4 * i2;
                            double d11 = 1024;
                            i10 = (int) (d10 * d11 * d11);
                        }
                        if (i10 > 0) {
                            tVar = new jb.c(i10, aVar);
                        } else {
                            tVar = new t(28, aVar);
                        }
                        return new k9.c(tVar, aVar);
                    default:
                        e eVar = this.B;
                        q9.k kVar = q9.k.f12406a;
                        Context context3 = (Context) eVar.B;
                        synchronized (kVar) {
                            try {
                                hVar = q9.k.f12407b;
                                if (hVar == null) {
                                    fj.t tVar2 = fj.k.A;
                                    gd.f fVar = g0.f15015a;
                                    gd.e eVar2 = gd.e.L;
                                    Bitmap.Config[] configArr3 = q9.g.f12393a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File T = jc.j.T(cacheDir);
                                        String str = x.B;
                                        x n10 = x8.e.n(T);
                                        long j2 = 10485760;
                                        try {
                                            File file = n10.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            j2 = p7.j.h((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        e9.h hVar2 = new e9.h(j2, tVar2, n10, eVar2);
                                        q9.k.f12407b = hVar2;
                                        hVar = hVar2;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return hVar;
                }
            }
        });
        yb.n nVar2 = new yb.n(new mc.a(this) { // from class: b9.d
            public final /* synthetic */ e B;

            {
                this.B = this;
            }

            @Override // mc.a
            public final Object b() {
                k9.g tVar;
                int i2;
                e9.h hVar;
                switch (r2) {
                    case 0:
                        Context context2 = (Context) this.B.B;
                        Bitmap.Config[] configArr = q9.g.f12393a;
                        double d4 = 0.2d;
                        try {
                            Object systemService = context2.getSystemService(ActivityManager.class);
                            systemService.getClass();
                            if (((ActivityManager) systemService).isLowRamDevice()) {
                                d4 = 0.15d;
                            }
                        } catch (Exception unused) {
                        }
                        int i10 = 0;
                        bk.a aVar = new bk.a(4, (byte) 0);
                        if (d4 > 0.0d) {
                            Bitmap.Config[] configArr2 = q9.g.f12393a;
                            try {
                                Object systemService2 = context2.getSystemService(ActivityManager.class);
                                systemService2.getClass();
                                ActivityManager activityManager = (ActivityManager) systemService2;
                                if ((context2.getApplicationInfo().flags & 1048576) != 0) {
                                    i2 = activityManager.getLargeMemoryClass();
                                } else {
                                    i2 = activityManager.getMemoryClass();
                                }
                            } catch (Exception unused2) {
                                i2 = 256;
                            }
                            double d10 = d4 * i2;
                            double d11 = 1024;
                            i10 = (int) (d10 * d11 * d11);
                        }
                        if (i10 > 0) {
                            tVar = new jb.c(i10, aVar);
                        } else {
                            tVar = new t(28, aVar);
                        }
                        return new k9.c(tVar, aVar);
                    default:
                        e eVar = this.B;
                        q9.k kVar = q9.k.f12406a;
                        Context context3 = (Context) eVar.B;
                        synchronized (kVar) {
                            try {
                                hVar = q9.k.f12407b;
                                if (hVar == null) {
                                    fj.t tVar2 = fj.k.A;
                                    gd.f fVar = g0.f15015a;
                                    gd.e eVar2 = gd.e.L;
                                    Bitmap.Config[] configArr3 = q9.g.f12393a;
                                    File cacheDir = context3.getCacheDir();
                                    if (cacheDir != null) {
                                        cacheDir.mkdirs();
                                        File T = jc.j.T(cacheDir);
                                        String str = x.B;
                                        x n10 = x8.e.n(T);
                                        long j2 = 10485760;
                                        try {
                                            File file = n10.toFile();
                                            file.mkdir();
                                            StatFs statFs = new StatFs(file.getAbsolutePath());
                                            j2 = p7.j.h((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        } catch (Exception unused3) {
                                        }
                                        e9.h hVar2 = new e9.h(j2, tVar2, n10, eVar2);
                                        q9.k.f12407b = hVar2;
                                        hVar = hVar2;
                                    } else {
                                        throw new IllegalStateException("cacheDir == null");
                                    }
                                }
                            } finally {
                            }
                        }
                        return hVar;
                }
            }
        });
        yb.n nVar3 = new yb.n(new a3.g(6));
        b bVar = (b) this.R;
        if (bVar == null) {
            q qVar = q.A;
            bVar = new b(qVar, qVar, qVar, qVar, qVar);
        }
        return new h(context, cVar, nVar, nVar2, nVar3, bVar, (q9.j) this.X);
    }

    public void i(q8.j jVar) {
        Runnable runnable;
        jVar.getClass();
        synchronized (this.R) {
            runnable = (Runnable) ((LinkedHashMap) this.X).remove(jVar);
        }
        if (runnable != null) {
            ((Handler) ((i0) this.B).B).removeCallbacks(runnable);
        }
    }

    @Override // fj.f0
    public fj.g0 j() {
        return (gj.e) this.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(ze.a r11, ec.c r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.k(ze.a, ec.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(ze.a r5, ec.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof df.c
            if (r0 == 0) goto L13
            r0 = r6
            df.c r0 = (df.c) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            df.c r0 = new df.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ze.a r5 = r0.R
            p7.j.I(r6)
            goto L42
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r5)
            r5 = 0
            return r5
        L30:
            p7.j.I(r6)
            boolean r6 = r5.f15060h
            if (r6 == 0) goto L49
            r0.R = r5
            r0.Z = r3
            java.lang.Object r6 = r4.k(r5, r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            te.g r6 = (te.g) r6
            boolean r0 = r6 instanceof te.f
            if (r0 != 0) goto L49
            return r6
        L49:
            java.lang.Object r6 = r4.X
            cf.d r6 = (cf.d) r6
            kf.d2 r6 = (kf.d2) r6
            android.content.SharedPreferences r6 = r6.f8181b
            java.lang.String r0 = "use_custom_bios"
            r1 = 0
            boolean r0 = r6.getBoolean(r0, r1)
            if (r0 != 0) goto L70
            af.a r0 = r5.f15058f
            af.f r0 = r0.f707a
            af.f r2 = af.f.DEFAULT
            if (r0 != r2) goto L70
            oe.i r6 = new oe.i
            me.magnum.melonds.domain.model.ConsoleType r0 = me.magnum.melonds.domain.model.ConsoleType.DS
            oe.h r2 = oe.h.VALID
            java.lang.String[] r3 = new java.lang.String[r1]
            yb.j[] r1 = new yb.j[r1]
            r6.<init>(r0, r2, r3, r1)
            goto L98
        L70:
            af.a r0 = r5.f15058f
            af.f r0 = r0.f707a
            me.magnum.melonds.domain.model.ConsoleType r0 = r0.getTargetConsoleType()
            if (r0 != 0) goto L90
            java.lang.String r0 = "console_type"
            java.lang.String r1 = "ds"
            java.lang.String r6 = r6.getString(r0, r1)
            r6.getClass()
            me.magnum.melonds.domain.model.ConsoleType[] r0 = me.magnum.melonds.domain.model.ConsoleType.values()
            java.lang.Enum r6 = pc.a.t(r6, r0)
            r0 = r6
            me.magnum.melonds.domain.model.ConsoleType r0 = (me.magnum.melonds.domain.model.ConsoleType) r0
        L90:
            java.lang.Object r6 = r4.B
            kf.c0 r6 = (kf.c0) r6
            oe.i r6 = r6.b(r0)
        L98:
            oe.h r0 = r6.f10937b
            oe.h r1 = oe.h.VALID
            if (r0 == r1) goto La4
            te.c r5 = new te.c
            r5.<init>(r6)
            return r5
        La4:
            te.f r6 = new te.f
            r6.<init>(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.l(ze.a, ec.c):java.lang.Object");
    }

    @Override // fj.f0
    public e0 m() {
        return (gj.d) this.X;
    }

    public void n() {
        p1 p1Var;
        l0.f.e();
        n nVar = (n) this.L;
        nVar.getClass();
        l0.f.e();
        i0.a aVar = (i0.a) nVar.R;
        Objects.requireNonNull(aVar);
        final i1 i1Var = (i1) nVar.B;
        Objects.requireNonNull(i1Var);
        final i1 i1Var2 = (i1) nVar.L;
        p1 p1Var2 = aVar.f6594a;
        Objects.requireNonNull(p1Var2);
        p1Var2.a();
        p1 p1Var3 = aVar.f6594a;
        Objects.requireNonNull(p1Var3);
        m0.i.d(p1Var3.f7299e).a(new Runnable() { // from class: i0.c
            @Override // java.lang.Runnable
            public final void run() {
                switch (r2) {
                    case 0:
                        i1Var.o();
                        return;
                    case DSiCameraSource.FrontCamera /* 1 */:
                        i1 i1Var3 = i1Var;
                        if (i1Var3 != null) {
                            i1Var3.o();
                            return;
                        }
                        return;
                    default:
                        i1 i1Var4 = i1Var;
                        if (i1Var4 != null) {
                            i1Var4.o();
                            return;
                        }
                        return;
                }
            }
        }, ij.a.p0());
        p1 p1Var4 = aVar.f6596c;
        if (p1Var4 != null) {
            p1Var4.a();
            m0.i.d(aVar.f6596c.f7299e).a(new Runnable() { // from class: i0.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (r2) {
                        case 0:
                            i1Var.o();
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            i1 i1Var3 = i1Var;
                            if (i1Var3 != null) {
                                i1Var3.o();
                                return;
                            }
                            return;
                        default:
                            i1 i1Var4 = i1Var;
                            if (i1Var4 != null) {
                                i1Var4.o();
                                return;
                            }
                            return;
                    }
                }
            }, ij.a.p0());
        }
        if (aVar.f6599f.size() > 1 && (p1Var = aVar.f6595b) != null) {
            p1Var.a();
            m0.i.d(aVar.f6595b.f7299e).a(new Runnable() { // from class: i0.c
                @Override // java.lang.Runnable
                public final void run() {
                    switch (r2) {
                        case 0:
                            i1Var2.o();
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            i1 i1Var3 = i1Var2;
                            if (i1Var3 != null) {
                                i1Var3.o();
                                return;
                            }
                            return;
                        default:
                            i1 i1Var4 = i1Var2;
                            if (i1Var4 != null) {
                                i1Var4.o();
                                return;
                            }
                            return;
                    }
                }
            }, ij.a.p0());
        }
        ((d0.c) this.R).getClass();
    }

    public void o(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((w0) this.L).get(obj);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    o(arrayList2.get(i2), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        o.r("This graph contains cyclic dependencies");
    }

    public void p(f7.f fVar, f7.b bVar) {
        f7.g gVar = (f7.g) this.L;
        gVar.getClass();
        if (gVar.f4944g == 0) {
            f7.d c4 = gVar.c(-1);
            gVar.f4943f = c4;
            gVar.f4944g = -1;
            gVar.f4945h = fVar;
            if (bVar != null) {
                if (c4 != null) {
                    c4.d(bVar);
                }
                q1 q1Var = gVar.f4938a;
                f7.i iVar = new f7.i(bVar);
                q1Var.getClass();
                q1Var.k(null, iVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c9, code lost:
        if (r1 == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01cb, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x010c, code lost:
        if (r1 == r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(long r17, long r19, ec.c r21) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.q(long, long, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(long r13, ec.c r15) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b9.e.r(long, ec.c):java.lang.Object");
    }

    public void s() {
        i iVar = (i) this.R;
        StringBuilder sb2 = iVar.A;
        if (sb2.length() > 0 && '\n' != sb2.charAt(sb2.length() - 1)) {
            iVar.a('\n');
        }
    }

    @Override // d1.y1
    public p t(p pVar, p pVar2, p pVar3) {
        if (((p) this.X) == null) {
            this.X = pVar3.c();
        }
        p pVar4 = (p) this.X;
        if (pVar4 != null) {
            int b10 = pVar4.b();
            int i2 = 0;
            while (true) {
                p pVar5 = (p) this.X;
                if (i2 < b10) {
                    if (pVar5 != null) {
                        pVar5.e(i2, ((a0.b) this.B).R(i2).e(pVar.a(i2), pVar2.a(i2), pVar3.a(i2)));
                        i2++;
                    } else {
                        nc.k.f("endVelocityVector");
                        throw null;
                    }
                } else if (pVar5 != null) {
                    return pVar5;
                } else {
                    nc.k.f("endVelocityVector");
                    throw null;
                }
            }
        } else {
            nc.k.f("endVelocityVector");
            throw null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 12:
                String socket = ((Socket) this.B).toString();
                socket.getClass();
                return socket;
            case 13:
            default:
                return super.toString();
            case 14:
                StringBuilder sb2 = new StringBuilder("StreamMap with indices of ");
                sb2.append(((int[]) this.B).length);
                sb2.append(" folders, offsets of ");
                sb2.append(((long[]) this.L).length);
                sb2.append(" packed streams, first files of ");
                sb2.append(((int[]) this.R).length);
                sb2.append(" folders and folder indices for ");
                return w.d.q(sb2, ((int[]) this.X).length, " files");
        }
    }

    public synchronized ExecutorService u() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.B) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                this.B = new ThreadPoolExecutor(0, (int) Preference.DEFAULT_ORDER, 60L, timeUnit, synchronousQueue, new qi.f(qi.g.f12553b + " Dispatcher", false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.B;
            threadPoolExecutor.getClass();
        } catch (Throwable th2) {
            throw th2;
        }
        return threadPoolExecutor;
    }

    public ti.k v(String str) {
        Iterator it = ((ArrayDeque) this.R).iterator();
        it.getClass();
        while (it.hasNext()) {
            ti.k kVar = (ti.k) it.next();
            if (nc.k.a(((r) kVar.L.B.f14089b).f11784d, str)) {
                return kVar;
            }
        }
        Iterator it2 = ((ArrayDeque) this.L).iterator();
        it2.getClass();
        while (it2.hasNext()) {
            ti.k kVar2 = (ti.k) it2.next();
            if (nc.k.a(((r) kVar2.L.B.f14089b).f11784d, str)) {
                return kVar2;
            }
        }
        return null;
    }

    public o.e w(o.a aVar) {
        ArrayList arrayList = (ArrayList) this.R;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o.e eVar = (o.e) arrayList.get(i2);
            if (eVar != null && eVar.f10453b == aVar) {
                return eVar;
            }
        }
        o.e eVar2 = new o.e((Context) this.B, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public sc.d x() {
        Matcher matcher = (Matcher) this.B;
        return p7.j.L(matcher.start(), matcher.end());
    }

    public p y(p pVar, p pVar2) {
        e eVar = this;
        if (((p) eVar.X) == null) {
            eVar.X = pVar.c();
        }
        p pVar3 = (p) eVar.X;
        if (pVar3 != null) {
            int b10 = pVar3.b();
            int i2 = 0;
            while (true) {
                p pVar4 = (p) eVar.X;
                if (i2 < b10) {
                    if (pVar4 != null) {
                        float a10 = pVar.a(i2);
                        float a11 = pVar2.a(i2);
                        aa.f fVar = (aa.f) ((a0.b) eVar.B).B;
                        double b11 = fVar.b(a11);
                        double d4 = g1.f2425a;
                        float f8 = fVar.f685a * fVar.f686b;
                        pVar4.e(i2, (Math.signum(a11) * ((float) (Math.exp((d4 / (d4 - 1.0d)) * b11) * f8))) + a10);
                        i2++;
                        eVar = this;
                        b10 = b10;
                    } else {
                        nc.k.f("targetVector");
                        throw null;
                    }
                } else if (pVar4 != null) {
                    return pVar4;
                } else {
                    nc.k.f("targetVector");
                    throw null;
                }
            }
        } else {
            nc.k.f("targetVector");
            throw null;
        }
    }

    public p z(long j2, p pVar, p pVar2) {
        float f8;
        if (((p) this.R) == null) {
            this.R = pVar.c();
        }
        p pVar3 = (p) this.R;
        if (pVar3 != null) {
            int b10 = pVar3.b();
            int i2 = 0;
            while (true) {
                p pVar4 = (p) this.R;
                if (i2 < b10) {
                    if (pVar4 != null) {
                        pVar.getClass();
                        long j10 = j2 / 1000000;
                        f1 a10 = ((aa.f) ((a0.b) this.B).B).a(pVar2.a(i2));
                        long j11 = a10.f2422c;
                        if (j11 > 0) {
                            f8 = ((float) j10) / ((float) j11);
                        } else {
                            f8 = 1.0f;
                        }
                        pVar4.e(i2, (((Math.signum(a10.f2420a) * c1.d.a(f8).f2395b) * a10.f2421b) / ((float) j11)) * 1000.0f);
                        i2++;
                    } else {
                        nc.k.f("velocityVector");
                        throw null;
                    }
                } else if (pVar4 != null) {
                    return pVar4;
                } else {
                    nc.k.f("velocityVector");
                    throw null;
                }
            }
        } else {
            nc.k.f("velocityVector");
            throw null;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }

    public e(i0 i0Var, p1.a0 a0Var) {
        this.A = 21;
        i0Var.getClass();
        this.B = i0Var;
        this.L = a0Var;
        this.R = new Object();
        this.X = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, eh.m] */
    public e(oe.j jVar, eh.k kVar, eh.k kVar2) {
        this.A = 10;
        jVar.getClass();
        kVar.getClass();
        kVar2.getClass();
        this.B = jVar;
        this.L = kVar;
        this.R = kVar2;
        ArrayList arrayList = jVar.f10941a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            y yVar = (y) obj;
            l.L(p7.t.y(yVar.f10963b, yVar.f10964c), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            oe.x xVar = (oe.x) obj2;
            u uVar = xVar instanceof u ? (u) xVar : null;
            eh.l lVar = uVar != null ? new eh.l(uVar.f10956a, uVar.f10957b, uVar.f10958c) : null;
            if (lVar != null) {
                arrayList3.add(lVar);
            }
        }
        int E = v.E(zb.m.G(arrayList3, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(E < 16 ? 16 : E);
        int size3 = arrayList3.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList3.get(i11);
            i11++;
            eh.l lVar2 = (eh.l) obj3;
            ?? obj4 = new Object();
            obj4.f4495a = 0.0f;
            obj4.f4496b = false;
            linkedHashMap.put(obj3, obj4);
        }
        this.X = linkedHashMap;
    }

    public e(int i2) {
        this.A = i2;
        switch (i2) {
            case l1.c.f8512h /* 15 */:
                this.B = new c5.d(10);
                this.L = new w0(0);
                this.R = new ArrayList();
                this.X = new HashSet();
                return;
            case 20:
                this.L = new ArrayDeque();
                this.R = new ArrayDeque();
                this.X = new ArrayDeque();
                return;
            case 22:
                return;
            case 23:
                this.R = new m0(15, this);
                return;
            case 25:
                this.B = new ArrayList();
                this.L = new ArrayList();
                this.R = new ArrayList();
                this.X = sj.g.f12969p;
                return;
            default:
                this.B = new w0(0);
                this.L = new SparseArray();
                this.R = new a1.q((Object) null);
                this.X = new w0(0);
                return;
        }
    }

    public e(androidx.lifecycle.d1 d1Var, androidx.lifecycle.a1 a1Var, w6.c cVar) {
        this.A = 27;
        d1Var.getClass();
        a1Var.getClass();
        cVar.getClass();
        this.B = d1Var;
        this.L = a1Var;
        this.R = cVar;
        this.X = new Object();
    }

    public e(e eVar) {
        this.A = 26;
        LinkedHashSet linkedHashSet = sj.g.f12969p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) eVar.B);
        for (Class cls : (LinkedHashSet) eVar.X) {
            arrayList.add(sj.g.f12970q.get(cls));
        }
        this.B = arrayList;
        this.R = new Object();
        this.X = (ArrayList) eVar.R;
        ArrayList arrayList2 = (ArrayList) eVar.L;
        this.L = arrayList2;
        new sj.l(new p1.a0(12, arrayList2, Collections.EMPTY_MAP));
    }

    public e(Socket socket) {
        this.A = 12;
        this.B = socket;
        this.L = new AtomicInteger();
        this.R = new gj.e(this);
        this.X = new gj.d(this);
    }

    public e(b4.x xVar, c3.l lVar) {
        this.A = 2;
        this.B = xVar;
        this.L = lVar;
        AutofillManager d4 = a0.e.d(xVar.getContext().getSystemService(a0.e.i()));
        if (d4 != null) {
            this.R = d4;
            xVar.setImportantForAutofill(1);
            b6.f B = q8.r.B(xVar);
            AutofillId i2 = B != null ? c3.p.i(B.f2075b) : null;
            if (i2 != null) {
                this.X = i2;
                return;
            }
            throw w.d.g("Required value was null.");
        }
        a0.j.p("Autofill service could not be located.");
        throw null;
    }

    public e(jd.a aVar) {
        this.A = 9;
        this.R = "";
        this.X = "";
        this.B = aVar;
        this.L = aVar.e().b();
    }

    public e(ob.b bVar, ob.d dVar, i iVar, Map map, l7.a aVar) {
        this.A = 19;
        this.B = bVar;
        this.L = dVar;
        this.R = iVar;
        this.X = map;
    }

    public e(ah.e eVar) {
        this.A = 11;
        this.B = eVar;
        this.L = new f7.g();
        new LinkedHashSet();
        this.R = new LinkedHashSet();
        this.X = new LinkedHashSet();
    }

    public e(j0 j0Var, b0.a aVar, w.f0 f0Var, jb.c cVar) {
        this.A = 4;
        j0Var.getClass();
        aVar.getClass();
        f0Var.getClass();
        cVar.getClass();
        this.B = j0Var;
        this.L = aVar;
        this.R = f0Var;
        this.X = cVar;
    }

    public e(Typeface typeface, n6.b bVar) {
        int i2;
        int i10;
        int i11;
        int i12;
        this.A = 17;
        this.X = typeface;
        this.B = bVar;
        this.R = new m6.r(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.A;
            i2 = ((ByteBuffer) bVar.R).getInt(((ByteBuffer) bVar.R).getInt(i13) + i13);
        } else {
            i2 = 0;
        }
        this.L = new char[i2 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.A;
            i10 = ((ByteBuffer) bVar.R).getInt(((ByteBuffer) bVar.R).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            m6.u uVar = new m6.u(this, i15);
            n6.a b10 = uVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.R).getInt(a12 + b10.A) : 0, (char[]) this.L, i15 * 2);
            n6.a b11 = uVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.A;
                i11 = ((ByteBuffer) b11.R).getInt(((ByteBuffer) b11.R).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            m.g("invalid metadata codepoint length", i11 > 0);
            m6.r rVar = (m6.r) this.R;
            n6.a b12 = uVar.b();
            int a14 = b12.a(16);
            if (a14 != 0) {
                int i17 = a14 + b12.A;
                i12 = ((ByteBuffer) b12.R).getInt(((ByteBuffer) b12.R).getInt(i17) + i17);
            } else {
                i12 = 0;
            }
            rVar.a(uVar, 0, i12 - 1);
        }
    }

    public /* synthetic */ e(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    public e(Context context) {
        this.A = 0;
        this.B = context.getApplicationContext();
        this.L = q9.e.f12391a;
        this.R = null;
        this.X = new q9.j();
    }

    public e(Context context, ActionMode.Callback callback) {
        this.A = 18;
        this.B = context;
        this.L = callback;
        this.R = new ArrayList();
        this.X = new w0(0);
    }

    public e(Matcher matcher, CharSequence charSequence) {
        this.A = 24;
        charSequence.getClass();
        this.B = matcher;
        this.L = charSequence;
        this.R = new s2.j(1, this);
    }

    public e(long j2, long j10, long j11) {
        this.A = 1;
        this.B = n2.s.w(new h3.e(j2));
        this.L = n2.s.w(new h3.b(j10));
        this.R = n2.s.w(new h3.b(j11));
        this.X = n2.s.w(new h3.b(j10));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(d1.y yVar) {
        this(5, new a0.b(28, yVar));
        this.A = 5;
    }
}
