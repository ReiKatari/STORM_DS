package w;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import d0.v1;
import j0.c2;
import j0.f2;
import j0.j2;
import j0.l2;
import j0.n2;
import j0.o1;
import j0.w1;
import j0.z1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements j0.d0 {
    public final a0.g A;
    public final Object A0;
    public final x.p B;
    public boolean B0;
    public final q0 C0;
    public final rd.k D0;
    public final b1 E0;
    public final p1.a0 F0;
    public final l0.h L;
    public final l0.d R;
    public volatile u X = u.INITIALIZED;
    public final d2.t Y;
    public final p1.a0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final i f14064b0;

    /* renamed from: c0  reason: collision with root package name */
    public final w f14065c0;

    /* renamed from: d0  reason: collision with root package name */
    public final y f14066d0;

    /* renamed from: e0  reason: collision with root package name */
    public CameraDevice f14067e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f14068f0;

    /* renamed from: g0  reason: collision with root package name */
    public p0 f14069g0;

    /* renamed from: h0  reason: collision with root package name */
    public final AtomicInteger f14070h0;

    /* renamed from: i0  reason: collision with root package name */
    public ta.a f14071i0;

    /* renamed from: j0  reason: collision with root package name */
    public b5.i f14072j0;

    /* renamed from: k0  reason: collision with root package name */
    public final LinkedHashMap f14073k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f14074l0;

    /* renamed from: m0  reason: collision with root package name */
    public final r f14075m0;

    /* renamed from: n0  reason: collision with root package name */
    public final b0.a f14076n0;

    /* renamed from: o0  reason: collision with root package name */
    public final j0.l0 f14077o0;
    public final d0.y p0;

    /* renamed from: q0  reason: collision with root package name */
    public final boolean f14078q0;

    /* renamed from: r0  reason: collision with root package name */
    public final boolean f14079r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f14080s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f14081t0;

    /* renamed from: u0  reason: collision with root package name */
    public boolean f14082u0;

    /* renamed from: v0  reason: collision with root package name */
    public x0 f14083v0;

    /* renamed from: w0  reason: collision with root package name */
    public final x0 f14084w0;

    /* renamed from: x0  reason: collision with root package name */
    public final x0 f14085x0;

    /* renamed from: y0  reason: collision with root package name */
    public final HashSet f14086y0;

    /* renamed from: z0  reason: collision with root package name */
    public j0.v f14087z0;

    public x(Context context, x.p pVar, String str, y yVar, b0.a aVar, j0.l0 l0Var, Executor executor, Handler handler, q0 q0Var, long j2, d0.y yVar2) {
        androidx.lifecycle.e0 e0Var;
        d2.t tVar = new d2.t(21, (byte) 0);
        this.Y = tVar;
        boolean z10 = false;
        this.f14068f0 = 0;
        this.f14070h0 = new AtomicInteger(0);
        this.f14073k0 = new LinkedHashMap();
        this.f14074l0 = 0;
        this.f14080s0 = false;
        this.f14081t0 = false;
        this.f14082u0 = true;
        this.f14086y0 = new HashSet();
        this.f14087z0 = j0.y.f7326a;
        this.A0 = new Object();
        this.B0 = false;
        this.F0 = new p1.a0(this);
        this.B = pVar;
        this.f14076n0 = aVar;
        this.f14077o0 = l0Var;
        l0.d dVar = new l0.d(handler);
        this.R = dVar;
        l0.h hVar = new l0.h(executor);
        this.L = hVar;
        this.f14065c0 = new w(this, hVar, dVar, j2);
        this.A = new a0.g(str, 25);
        ((androidx.lifecycle.f0) tVar.B).i(new b6.f(2, j0.c0.CLOSED));
        p1.a0 a0Var = new p1.a0(l0Var);
        this.Z = a0Var;
        x0 x0Var = new x0(hVar);
        this.f14084w0 = x0Var;
        this.C0 = q0Var;
        this.p0 = yVar2;
        try {
            x.j b10 = pVar.b(str);
            i iVar = new i(b10, dVar, hVar, new s(this), yVar.f14100f);
            this.f14064b0 = iVar;
            this.f14066d0 = yVar;
            yVar.o(iVar);
            androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) a0Var.L;
            k0.f fVar = yVar.f14099e;
            fVar.getClass();
            f0Var.getClass();
            androidx.lifecycle.d0 d0Var = fVar.f7950o;
            if (d0Var != null && (e0Var = (androidx.lifecycle.e0) fVar.f7948l.b(d0Var)) != null) {
                e0Var.f1471a.g(e0Var);
            }
            fVar.f7950o = f0Var;
            l0.f.B(new ad.c(14, fVar, f0Var));
            this.D0 = rd.k.n(b10);
            this.f14069g0 = B();
            this.f14085x0 = new x0(hVar, dVar, handler, x0Var, yVar.f14100f, z.a.f14847a, 10);
            o1 o1Var = yVar.f14100f;
            this.f14078q0 = (o1Var.h(LegacyCameraOutputConfigNullPointerQuirk.class) || o1Var.h(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class)) ? true : z10;
            this.f14079r0 = yVar.f14100f.h(LegacyCameraSurfaceCleanupQuirk.class);
            r rVar = new r(this, str);
            this.f14075m0 = rVar;
            s sVar = new s(this);
            synchronized (l0Var.f7256b) {
                p7.m.o("Camera is already registered: " + this, !l0Var.f7259e.containsKey(this));
                l0Var.f7259e.put(this, new j0.k0(hVar, sVar, rVar));
            }
            pVar.f14306a.C(hVar, rVar);
            this.E0 = new b1(context, str, pVar, new l7.a(18), f0.b.f4514h);
        } catch (x.a e6) {
            throw new Exception(e6);
        }
    }

    public static String x(int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    public static String y(x0 x0Var) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        x0Var.getClass();
        sb2.append(x0Var.hashCode());
        return sb2.toString();
    }

    public static String z(v1 v1Var) {
        return v1Var.g() + v1Var.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A(x0 x0Var) {
        int i2;
        int i10;
        boolean z10;
        d0.y yVar;
        x0Var.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.A0) {
            try {
                i2 = 0;
                if (this.f14076n0.b() == 2) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
            } finally {
            }
        }
        a0.g gVar = this.A;
        gVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) gVar.L).entrySet()) {
            if (((j2) entry.getValue()).f7232e) {
                arrayList2.add((j2) entry.getValue());
            }
        }
        for (j2 j2Var : Collections.unmodifiableCollection(arrayList2)) {
            List list = j2Var.f7231d;
            if (list == null || list.get(i2) != n2.METERING_REPEATING) {
                if (j2Var.f7230c == null || j2Var.f7231d == null) {
                    z10 = true;
                    aj.g.y0("Camera2CameraImpl", "Invalid stream spec or capture types in " + j2Var);
                    break;
                }
                w1 w1Var = j2Var.f7228a;
                l2 l2Var = j2Var.f7229b;
                for (j0.u0 u0Var : w1Var.b()) {
                    b1 b1Var = this.E0;
                    int y10 = l2Var.y();
                    Size size = u0Var.f7302h;
                    z1 n10 = l2Var.n();
                    j0.l l10 = b1Var.l(y10);
                    c2 c2Var = c2.CAPTURE_SESSION_TABLES;
                    z1 z1Var = f2.f7192e;
                    f2 P = pc.a.P(y10, size, l10, i10, c2Var, n10);
                    int y11 = l2Var.y();
                    Size size2 = u0Var.f7302h;
                    j0.k kVar = j2Var.f7230c;
                    d0.a0 a0Var = kVar.f7237c;
                    List list2 = j2Var.f7231d;
                    j0.r0 r0Var = kVar.f7240f;
                    int i11 = kVar.f7238d;
                    Range range = kVar.f7239e;
                    Boolean bool = (Boolean) l2Var.h(l2.J, Boolean.FALSE);
                    Objects.requireNonNull(bool);
                    arrayList.add(new j0.e(P, y11, size2, a0Var, list2, r0Var, i11, range, bool.booleanValue()));
                    i2 = i2;
                }
            }
        }
        boolean z11 = i2;
        z10 = true;
        HashMap hashMap = new HashMap();
        hashMap.put((w0) x0Var.f14091d, Collections.singletonList((Size) x0Var.f14092e));
        try {
            this.E0.j(i10, arrayList, hashMap, false, false, false);
            v("Surface combination with metering repeating supported!", null);
            yVar = this.p0;
        } catch (IllegalArgumentException e6) {
            v("Surface combination with metering repeating  not supported!", e6);
        }
        if (yVar == null || ((Boolean) yVar.A.h(d0.y.f3505g0, Boolean.TRUE)).booleanValue()) {
            return z11;
        }
        return z10;
    }

    public final p0 B() {
        p0 p0Var;
        synchronized (this.A0) {
            try {
                d0.y yVar = this.p0;
                if (yVar != null) {
                    j0.g gVar = c0.e.f2372a;
                    if (yVar.A.h(c0.e.f2372a, null) != null) {
                        throw new ClassCastException();
                    }
                }
                p0Var = new p0(this.D0, this.f14066d0.f14100f, false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return p0Var;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, p1.c1] */
    public final void C(boolean z10) {
        if (!z10) {
            this.f14065c0.f14062e.f14056b = -1L;
        }
        this.f14065c0.a();
        this.F0.r();
        v("Opening camera.", null);
        F(u.OPENING);
        try {
            x.p pVar = this.B;
            pVar.f14306a.B(this.f14066d0.f14095a, this.L, u());
        } catch (SecurityException e6) {
            v("Unable to open camera due to " + e6.getMessage(), null);
            F(u.REOPENING);
            this.f14065c0.b();
        } catch (RuntimeException e10) {
            v("Unexpected error occurred when opening camera.", e10);
            G(u.OPENING_WITH_ERROR, new d0.f(6, null), true);
        } catch (x.a e11) {
            v("Unable to open camera due to " + e11.getMessage(), null);
            if (e11.A != 10001) {
                p1.a0 a0Var = this.F0;
                u uVar = ((x) a0Var.L).X;
                u uVar2 = u.OPENING;
                x xVar = (x) a0Var.L;
                if (uVar != uVar2) {
                    xVar.v("Don't need the onError timeout handler.", null);
                    return;
                }
                xVar.v("Camera waiting for onError.", null);
                a0Var.r();
                ?? obj = new Object();
                obj.L = a0Var;
                obj.B = new AtomicBoolean(false);
                obj.A = ((x) a0Var.L).R.schedule(new t(obj, 0), 2000L, TimeUnit.MILLISECONDS);
                a0Var.B = obj;
                return;
            }
            G(u.INITIALIZED, new d0.f(7, e11), true);
        }
    }

    public final void D() {
        boolean z10;
        List b10;
        if (this.X == u.OPENED) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o(null, z10);
        j0.v1 o5 = this.A.o();
        if (!o5.c()) {
            v("Unable to create capture session due to conflicting configurations", null);
        } else if (!this.f14077o0.e(this.f14067e0.getId(), this.f14076n0.c(this.f14067e0.getId()))) {
            v("Unable to create capture session in camera operating mode = " + this.f14076n0.b(), null);
        } else {
            HashMap hashMap = new HashMap();
            Collection<w1> p10 = this.A.p();
            Collection q10 = this.A.q();
            j0.g gVar = z0.f14105a;
            p10.getClass();
            q10.getClass();
            ArrayList arrayList = new ArrayList(q10);
            Iterator it = p10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                w1 w1Var = (w1) it.next();
                if (w1Var.f7322g.f7275b.A.containsKey(gVar) && w1Var.b().size() != 1) {
                    aj.g.s("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(w1Var.b().size())}, 1)));
                    break;
                } else if (w1Var.f7322g.f7275b.A.containsKey(gVar)) {
                    int i2 = 0;
                    for (w1 w1Var2 : p10) {
                        if (((l2) arrayList.get(i2)).r() == n2.METERING_REPEATING) {
                            w1Var2.b().getClass();
                            p7.m.o("MeteringRepeating should contain a surface", !b10.isEmpty());
                            hashMap.put(w1Var2.b().get(0), 1L);
                        } else if (w1Var2.f7322g.f7275b.A.containsKey(gVar)) {
                            List b11 = w1Var2.b();
                            b11.getClass();
                            if (!b11.isEmpty()) {
                                Object obj = w1Var2.b().get(0);
                                Object g10 = w1Var2.f7322g.f7275b.g(gVar);
                                g10.getClass();
                                hashMap.put(obj, g10);
                            }
                        }
                        i2++;
                    }
                }
            }
            aj.g.o("StreamUseCaseUtil", "populateSurfaceToStreamUseCaseMapping() - streamUseCaseMap = " + hashMap);
            p0 p0Var = this.f14069g0;
            synchronized (p0Var.f14010a) {
                p0Var.m = hashMap;
            }
            p0 p0Var2 = this.f14069g0;
            w1 b12 = o5.b();
            CameraDevice cameraDevice = this.f14067e0;
            cameraDevice.getClass();
            x0 x0Var = this.f14085x0;
            ta.a l10 = p0Var2.l(b12, cameraDevice, new g1((o1) x0Var.f14093f, (o1) x0Var.f14094g, (x0) x0Var.f14092e, (l0.h) x0Var.f14089b, (l0.d) x0Var.f14090c, (Handler) x0Var.f14091d));
            l10.a(new m0.h(0, l10, new q(this, p0Var2, 1)), this.L);
        }
    }

    public final void E() {
        boolean z10;
        w1 w1Var;
        List unmodifiableList;
        if (this.f14069g0 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        p7.m.o(null, z10);
        v("Resetting Capture Session", null);
        p0 p0Var = this.f14069g0;
        synchronized (p0Var.f14010a) {
            w1Var = p0Var.f14015f;
        }
        synchronized (p0Var.f14010a) {
            unmodifiableList = Collections.unmodifiableList(p0Var.f14011b);
        }
        p0 B = B();
        this.f14069g0 = B;
        B.n(w1Var);
        this.f14069g0.j(unmodifiableList);
        if (this.X.ordinal() != 9) {
            v("Skipping Capture Session state check due to current camera state: " + this.X + " and previous session status: " + p0Var.h(), null);
        } else if (this.f14078q0 && p0Var.h()) {
            v("Close camera before creating new session", null);
            F(u.REOPENING_QUIRK);
        }
        if (this.f14079r0 && p0Var.h()) {
            v("ConfigAndClose is required when close the camera.", null);
            this.f14080s0 = true;
        }
        p0Var.b();
        ta.a m = p0Var.m();
        v("Releasing session in state " + this.X.name(), null);
        this.f14073k0.put(p0Var, m);
        m.a(new m0.h(0, m, new q(this, p0Var, 0)), ij.a.D());
    }

    public final void F(u uVar) {
        G(uVar, null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0192 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(w.u r10, d0.f r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.x.G(w.u, d0.f, boolean):void");
    }

    public final ArrayList H(ArrayList arrayList) {
        w1 w1Var;
        Size size;
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            v1 v1Var = (v1) obj;
            boolean z10 = this.f14082u0;
            String z11 = z(v1Var);
            Class<?> cls = v1Var.getClass();
            if (z10) {
                w1Var = v1Var.f3480n;
            } else {
                w1Var = v1Var.f3481o;
            }
            w1 w1Var2 = w1Var;
            l2 l2Var = v1Var.f3474g;
            j0.k kVar = v1Var.f3475h;
            ArrayList arrayList3 = null;
            if (kVar != null) {
                size = kVar.f7235a;
            } else {
                size = null;
            }
            if (v1Var.c() != null) {
                arrayList3 = v0.d.G(v1Var);
            }
            arrayList2.add(new a(z11, cls, w1Var2, l2Var, size, kVar, arrayList3));
        }
        return arrayList2;
    }

    public final void I(ArrayList arrayList) {
        boolean z10;
        boolean z11;
        j2 j2Var;
        Size size;
        boolean isEmpty = this.A.p().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        Rational rational = null;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            a aVar = (a) obj;
            if (!this.A.v(aVar.f13864a)) {
                a0.g gVar = this.A;
                String str = aVar.f13864a;
                w1 w1Var = aVar.f13866c;
                l2 l2Var = aVar.f13867d;
                j0.k kVar = aVar.f13869f;
                List list = aVar.f13870g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) gVar.L;
                j2 j2Var2 = (j2) linkedHashMap.get(str);
                if (j2Var2 == null) {
                    j2Var = new j2(w1Var, l2Var, kVar, list);
                    linkedHashMap.put(str, j2Var);
                } else {
                    j2Var = j2Var2;
                }
                j2Var.f7232e = true;
                gVar.B(str, w1Var, l2Var, kVar, list);
                arrayList2.add(aVar.f13864a);
                if (aVar.f13865b == d0.f1.class && (size = aVar.f13868e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            v("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
            if (isEmpty) {
                z10 = true;
                this.f14064b0.m(true);
                i iVar = this.f14064b0;
                synchronized (iVar.f13951d) {
                    iVar.f13963q++;
                }
            } else {
                z10 = true;
            }
            r();
            N();
            M();
            L();
            E();
            u uVar = this.X;
            u uVar2 = u.OPENED;
            if (uVar == uVar2) {
                D();
            } else {
                int ordinal = this.X.ordinal();
                if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        v("open() ignored due to being in state: " + this.X, null);
                    } else {
                        F(u.REOPENING);
                        if (!this.f14073k0.isEmpty() && !this.f14081t0 && this.f14068f0 == 0) {
                            if (this.f14067e0 != null) {
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            p7.m.o("Camera Device should be open if session close is not complete", z11);
                            F(uVar2);
                            D();
                        }
                    }
                } else {
                    J(false);
                }
            }
            if (rational != null) {
                this.f14064b0.f13955h.getClass();
            }
        }
    }

    public final void J(boolean z10) {
        v("Attempting to force open the camera.", null);
        if (!this.f14077o0.d(this)) {
            v("No cameras available. Waiting for available camera before opening camera.", null);
            F(u.PENDING_OPEN);
            return;
        }
        C(z10);
    }

    public final void K(boolean z10) {
        v("Attempting to open the camera.", null);
        if (this.f14075m0.f14038b && this.f14077o0.d(this)) {
            C(z10);
            return;
        }
        v("No cameras available. Waiting for available camera before opening camera.", null);
        F(u.PENDING_OPEN);
    }

    public final void L() {
        j0.v1 n10 = this.A.n();
        boolean c4 = n10.c();
        i iVar = this.f14064b0;
        if (c4) {
            int i2 = n10.b().f7322g.f7276c;
            iVar.f13969w = i2;
            iVar.f13955h.f14043c = i2;
            iVar.f13961o.getClass();
            n10.a(iVar.j());
            this.f14069g0.n(n10.b());
            return;
        }
        iVar.f13969w = 1;
        iVar.f13955h.f14043c = 1;
        iVar.f13961o.getClass();
        this.f14069g0.n(iVar.j());
    }

    public final void M() {
        if (a0.l.c(this.f14066d0.f14096b)) {
            j0.v1 n10 = this.A.n();
            if (n10.c()) {
                int intValue = ((Integer) n10.b().f7322g.a().getUpper()).intValue();
                i iVar = this.f14064b0;
                if (intValue > 30) {
                    iVar.n(true);
                } else {
                    iVar.n(false);
                }
            }
        }
    }

    public final void N() {
        boolean z10 = false;
        for (l2 l2Var : this.A.q()) {
            z10 |= ((Boolean) l2Var.h(l2.K, Boolean.FALSE)).booleanValue();
        }
        m1 m1Var = this.f14064b0.m;
        if (m1Var.f13999d != z10 && z10) {
            m1Var.b();
        }
        m1Var.f13999d = z10;
    }

    @Override // j0.d0
    public final ta.a a() {
        return a.a.A(new l(this, 4));
    }

    @Override // j0.d0
    public final void c(boolean z10) {
        this.L.execute(new c0.a(this, z10, 1));
    }

    @Override // d0.u1
    public final void d(v1 v1Var) {
        w1 w1Var;
        ArrayList G;
        String z10 = z(v1Var);
        if (this.f14082u0) {
            w1Var = v1Var.f3480n;
        } else {
            w1Var = v1Var.f3481o;
        }
        w1 w1Var2 = w1Var;
        l2 l2Var = v1Var.f3474g;
        j0.k kVar = v1Var.f3475h;
        if (v1Var.c() == null) {
            G = null;
        } else {
            G = v0.d.G(v1Var);
        }
        this.L.execute(new m(this, z10, w1Var2, l2Var, kVar, G, 2));
    }

    @Override // j0.d0
    public final void e(Collection collection) {
        i iVar = this.f14064b0;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (iVar.f13951d) {
            iVar.f13963q++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.f14086y0;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            v1 v1Var = (v1) obj;
            String z10 = z(v1Var);
            if (!hashSet.contains(z10)) {
                hashSet.add(z10);
                v1Var.t();
                v1Var.r();
            }
        }
        try {
            this.L.execute(new o(this, new ArrayList(H(arrayList)), 0));
        } catch (RejectedExecutionException e6) {
            v("Unable to attach use cases.", e6);
            iVar.i();
        }
    }

    @Override // j0.d0
    public final void g(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(H(arrayList2));
        ArrayList arrayList4 = new ArrayList(arrayList2);
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList4.get(i2);
            i2++;
            v1 v1Var = (v1) obj;
            String z10 = z(v1Var);
            HashSet hashSet = this.f14086y0;
            if (hashSet.contains(z10)) {
                v1Var.u();
                hashSet.remove(z10);
            }
        }
        this.L.execute(new o(this, arrayList3, 1));
    }

    @Override // j0.d0
    public final void h() {
        this.L.execute(new k(this, 1));
    }

    @Override // j0.d0
    public final void j(boolean z10) {
        this.f14082u0 = z10;
    }

    @Override // j0.d0
    public final j0.b0 k() {
        return this.f14066d0;
    }

    @Override // d0.u1
    public final void l(v1 v1Var) {
        w1 w1Var;
        ArrayList G;
        if (this.f14082u0) {
            w1Var = v1Var.f3480n;
        } else {
            w1Var = v1Var.f3481o;
        }
        w1 w1Var2 = w1Var;
        l2 l2Var = v1Var.f3474g;
        j0.k kVar = v1Var.f3475h;
        if (v1Var.c() == null) {
            G = null;
        } else {
            G = v0.d.G(v1Var);
        }
        this.L.execute(new m(this, z(v1Var), w1Var2, l2Var, kVar, G, 0));
    }

    @Override // j0.d0
    public final void m(j0.v vVar) {
        if (vVar == null) {
            vVar = j0.y.f7326a;
        }
        vVar.s();
        this.f14087z0 = vVar;
        synchronized (this.A0) {
        }
    }

    @Override // d0.u1
    public final void n(v1 v1Var) {
        w1 w1Var;
        ArrayList G;
        String z10 = z(v1Var);
        if (this.f14082u0) {
            w1Var = v1Var.f3480n;
        } else {
            w1Var = v1Var.f3481o;
        }
        w1 w1Var2 = w1Var;
        l2 l2Var = v1Var.f3474g;
        j0.k kVar = v1Var.f3475h;
        if (v1Var.c() == null) {
            G = null;
        } else {
            G = v0.d.G(v1Var);
        }
        this.L.execute(new m(this, z10, w1Var2, l2Var, kVar, G, 1));
    }

    @Override // j0.d0
    public final j0.a0 o() {
        return this.f14064b0;
    }

    @Override // j0.d0
    public final j0.v p() {
        return this.f14087z0;
    }

    @Override // d0.u1
    public final void q(v1 v1Var) {
        this.L.execute(new g(2, this, z(v1Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00be, code lost:
        if (r0 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.x.r():void");
    }

    public final void s() {
        boolean z10;
        ArrayList arrayList;
        int intValue;
        int i2 = 0;
        if (this.X != u.CLOSING && this.X != u.RELEASING && (this.X != u.REOPENING || this.f14068f0 == 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        p7.m.o("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.X + " (error: " + x(this.f14068f0) + ")", z10);
        E();
        p0 p0Var = this.f14069g0;
        synchronized (p0Var.f14010a) {
            try {
                if (!p0Var.f14011b.isEmpty()) {
                    arrayList = new ArrayList(p0Var.f14011b);
                    p0Var.f14011b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                j0.p0 p0Var2 = (j0.p0) obj;
                for (j0.m mVar : p0Var2.f7277d) {
                    Object obj2 = p0Var2.f7279f.f7212a.get("CAPTURE_CONFIG_ID_KEY");
                    if (obj2 == null) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) obj2).intValue();
                    }
                    mVar.a(intValue);
                }
            }
        }
    }

    public final void t() {
        boolean z10;
        if (this.X != u.RELEASING && this.X != u.CLOSING) {
            z10 = false;
        } else {
            z10 = true;
        }
        p7.m.o(null, z10);
        p7.m.o(null, this.f14073k0.isEmpty());
        if (!this.f14080s0) {
            w();
        } else if (this.f14081t0) {
            v("Ignored since configAndClose is processing", null);
        } else if (!this.f14075m0.f14038b) {
            this.f14080s0 = false;
            w();
            v("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            v("Open camera to configAndClose", null);
            b5.l A = a.a.A(new l(this, 0));
            this.f14081t0 = true;
            A.B.a(new k(this, 0), this.L);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f14066d0.f14095a);
    }

    public final CameraDevice.StateCallback u() {
        ArrayList arrayList = new ArrayList(this.A.o().b().f7318c);
        arrayList.add((i0) this.f14084w0.f14094g);
        arrayList.add(this.f14065c0);
        return p7.j.n(arrayList);
    }

    public final void v(String str, Throwable th2) {
        String xVar = toString();
        aj.g.p("Camera2CameraImpl", "{" + xVar + "} " + str, th2);
    }

    public final void w() {
        boolean z10;
        if (this.X != u.RELEASING && this.X != u.CLOSING) {
            z10 = false;
        } else {
            z10 = true;
        }
        p7.m.o(null, z10);
        p7.m.o(null, this.f14073k0.isEmpty());
        this.f14067e0 = null;
        if (this.X == u.CLOSING) {
            F(u.INITIALIZED);
            return;
        }
        x.p pVar = this.B;
        pVar.f14306a.L(this.f14075m0);
        F(u.RELEASED);
        b5.i iVar = this.f14072j0;
        if (iVar != null) {
            iVar.b(null);
            this.f14072j0 = null;
        }
    }
}
