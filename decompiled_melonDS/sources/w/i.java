package w;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Looper;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import d0.p1;
import j0.h2;
import j0.j2;
import j0.l2;
import j0.o1;
import j0.q1;
import j0.r1;
import j0.w1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements j0.a0 {

    /* renamed from: b  reason: collision with root package name */
    public final a0.k f13949b;

    /* renamed from: c  reason: collision with root package name */
    public final l0.h f13950c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f13951d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final x.j f13952e;

    /* renamed from: f  reason: collision with root package name */
    public final s f13953f;

    /* renamed from: g  reason: collision with root package name */
    public final r1 f13954g;

    /* renamed from: h  reason: collision with root package name */
    public final r0 f13955h;

    /* renamed from: i  reason: collision with root package name */
    public final q1.u f13956i;

    /* renamed from: j  reason: collision with root package name */
    public final j1 f13957j;

    /* renamed from: k  reason: collision with root package name */
    public final a0.l f13958k;

    /* renamed from: l  reason: collision with root package name */
    public final a0.l f13959l;
    public final m1 m;

    /* renamed from: n  reason: collision with root package name */
    public final c0.c f13960n;

    /* renamed from: o  reason: collision with root package name */
    public final k0.g f13961o;

    /* renamed from: p  reason: collision with root package name */
    public final rd.k f13962p;

    /* renamed from: q  reason: collision with root package name */
    public int f13963q;

    /* renamed from: r  reason: collision with root package name */
    public volatile int f13964r;

    /* renamed from: s  reason: collision with root package name */
    public volatile int f13965s;

    /* renamed from: t  reason: collision with root package name */
    public volatile int f13966t;

    /* renamed from: u  reason: collision with root package name */
    public final a0.a f13967u;

    /* renamed from: v  reason: collision with root package name */
    public final AtomicLong f13968v;

    /* renamed from: w  reason: collision with root package name */
    public int f13969w;

    /* renamed from: x  reason: collision with root package name */
    public long f13970x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [j0.m, java.lang.Object, w.f] */
    /* JADX WARN: Type inference failed for: r0v8, types: [w.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, k0.g] */
    /* JADX WARN: Type inference failed for: r5v2, types: [j0.q1, j0.r1] */
    /* JADX WARN: Type inference failed for: r5v4, types: [a0.l, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [a0.l, java.lang.Object] */
    public i(x.j jVar, l0.d dVar, l0.h hVar, s sVar, o1 o1Var) {
        ?? q1Var = new q1();
        this.f13954g = q1Var;
        this.f13963q = 0;
        this.f13964r = 0;
        this.f13966t = 2;
        this.f13968v = new AtomicLong(0L);
        this.f13969w = 1;
        this.f13970x = 0L;
        ?? obj = new Object();
        obj.f13921a = new HashSet();
        obj.f13922b = new ArrayMap();
        this.f13952e = jVar;
        this.f13953f = sVar;
        this.f13950c = hVar;
        this.f13962p = new rd.k(hVar);
        a0.k kVar = new a0.k(hVar);
        this.f13949b = kVar;
        q1Var.f7282b.A = this.f13969w;
        q1Var.f7282b.g(new l0(kVar));
        q1Var.f7282b.g(obj);
        ?? obj2 = new Object();
        obj2.A = false;
        obj2.B = new b6.f(5);
        this.f13959l = obj2;
        this.f13955h = new r0(this, hVar);
        this.f13956i = new q1.u(this, jVar, hVar);
        this.f13957j = new j1(this, jVar, hVar);
        this.f13965s = jVar.b();
        ?? obj3 = new Object();
        new AtomicInteger(-1);
        obj3.B = new Object();
        boolean c4 = a0.l.c(jVar);
        new androidx.lifecycle.d0(-1);
        ?? obj4 = new Object();
        if (c4) {
            h(obj4);
        }
        this.f13958k = obj3;
        this.m = new m1(jVar, hVar);
        this.f13967u = new a0.a(o1Var, 0);
        this.f13960n = new c0.c(this, hVar);
        ?? obj5 = new Object();
        Integer num = (Integer) jVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        if (num != null) {
            num.intValue();
        }
        o1Var.h(UseTorchAsFlashQuirk.class);
        a.a.N(new ah.e(15, jVar));
        this.f13961o = obj5;
    }

    public static int k(x.j jVar, int i2) {
        int[] iArr = (int[]) jVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (l(iArr, i2)) {
            return i2;
        }
        if (!l(iArr, 1)) {
            return 0;
        }
        return 1;
    }

    public static boolean l(int[] iArr, int i2) {
        for (int i10 : iArr) {
            if (i2 == i10) {
                return true;
            }
        }
        return false;
    }

    @Override // j0.a0
    public final j0.r0 a() {
        a0.b bVar;
        c0.c cVar = this.f13960n;
        synchronized (cVar.f2369e) {
            c0.f fVar = cVar.f2370f;
            fVar.getClass();
            bVar = new a0.b(13, j0.i1.a(fVar.f2374b));
        }
        return bVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r9v4, types: [b5.i, java.lang.Object] */
    @Override // j0.a0
    public final void b(j0.r0 r0Var) {
        c0.c cVar = this.f13960n;
        a0.b b10 = c0.f.c(r0Var).b();
        synchronized (cVar.f2369e) {
            c0.f fVar = cVar.f2370f;
            fVar.getClass();
            j0.q0 q0Var = j0.q0.OPTIONAL;
            for (j0.g gVar : b10.f()) {
                fVar.f2374b.j(gVar, q0Var, b10.g(gVar));
            }
        }
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = d.class;
        try {
            cVar.f2368d.execute(new c0.b(cVar, obj, 1));
            obj.f2051a = "addCaptureRequestOptions";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        m0.i.d(lVar).a(new b4.l(2), ij.a.D());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, b5.n] */
    @Override // j0.a0
    public final void c() {
        c0.c cVar = this.f13960n;
        synchronized (cVar.f2369e) {
            cVar.f2370f = new c0.f(5);
        }
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = d.class;
        try {
            cVar.f2368d.execute(new c0.b(cVar, obj, 0));
            obj.f2051a = "clearCaptureRequestOptions";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        m0.i.d(lVar).a(new b4.l(2), ij.a.D());
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, b5.n] */
    @Override // j0.a0
    public final void d(int i2) {
        int i10;
        boolean z10;
        synchronized (this.f13951d) {
            i10 = this.f13963q;
        }
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            aj.g.y0("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f13966t = i2;
        aj.g.o("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f13966t);
        m1 m1Var = this.m;
        if (this.f13966t != 1) {
            int i11 = this.f13966t;
        }
        m1Var.getClass();
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = d.class;
        try {
            this.f13950c.execute(new ad.c(29, this, obj));
            obj.f2051a = "updateSessionConfigAsync";
        } catch (Exception e6) {
            lVar.b(e6);
        }
        m0.i.d(lVar);
    }

    @Override // j0.a0
    public final void e() {
        this.m.a();
    }

    @Override // j0.a0
    public final void g(r1 r1Var) {
        StreamConfigurationMap streamConfigurationMap;
        int i2;
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap2;
        int[] validOutputFormatsForInput;
        int[] inputFormats;
        d0.i1 i1Var = r1Var.f7282b;
        m1 m1Var = this.m;
        l0.h hVar = m1Var.f13997b;
        x.j jVar = m1Var.f13996a;
        m1Var.a();
        if (m1Var.f13999d) {
            i1Var.A = 1;
        } else if (m1Var.f14001f) {
            i1Var.A = 1;
        } else {
            try {
                streamConfigurationMap = (StreamConfigurationMap) jVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e6) {
                aj.g.s("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e6.getMessage());
                streamConfigurationMap = null;
            }
            if (streamConfigurationMap == null || streamConfigurationMap.getInputFormats() == null) {
                i2 = 0;
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap();
                for (int i10 : streamConfigurationMap.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap.getInputSizes(i10);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new k0.c(true));
                        hashMap.put(Integer.valueOf(i10), inputSizes[0]);
                    }
                }
                i2 = 0;
            }
            if (m1Var.f14000e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap2 = (StreamConfigurationMap) jVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap2.getValidOutputFormatsForInput(34)) != null) {
                int length = validOutputFormatsForInput.length;
                for (int i11 = i2; i11 < length; i11++) {
                    if (validOutputFormatsForInput[i11] == 256) {
                        Size size = (Size) hashMap.get(34);
                        d0.d1 d1Var = new d0.d1(size.getWidth(), size.getHeight(), 34, 9);
                        d0.i1 i1Var2 = new d0.i1(d1Var);
                        Surface surface = i1Var2.getSurface();
                        Objects.requireNonNull(surface);
                        p1 p1Var = new p1(surface, new Size(i1Var2.c(), i1Var2.a()), 34);
                        p1.a0 a0Var = new p1.a0(hVar);
                        m1Var.f14002g = i1Var2;
                        m1Var.f14003h = p1Var;
                        m1Var.f14004i = a0Var;
                        i1Var2.b(new ah.e(17, m1Var), ij.a.l0());
                        m0.i.d(p1Var.f7299e).a(new g(5, i1Var2, a0Var), hVar);
                        r1Var.b(p1Var, d0.a0.f3320d, -1);
                        d0.c1 c1Var = d1Var.B;
                        i1Var.g(c1Var);
                        ArrayList arrayList = r1Var.f7285e;
                        if (!arrayList.contains(c1Var)) {
                            arrayList.add(c1Var);
                        }
                        g0 g0Var = new g0(2, a0Var);
                        ArrayList arrayList2 = r1Var.f7284d;
                        if (!arrayList2.contains(g0Var)) {
                            arrayList2.add(g0Var);
                        }
                        r1Var.f7287g = new InputConfiguration(i1Var2.c(), i1Var2.a(), i1Var2.f());
                        return;
                    }
                }
            }
            i1Var.A = 1;
        }
    }

    public final void h(h hVar) {
        ((HashSet) this.f13949b.f9b).add(hVar);
    }

    public final void i() {
        synchronized (this.f13951d) {
            try {
                int i2 = this.f13963q;
                if (i2 != 0) {
                    this.f13963q = i2 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (l(r8, 1) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c9, code lost:
        if (r4 != 2) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x011d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.w1 j() {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w.i.j():j0.w1");
    }

    public final void m(boolean z10) {
        n0.a aVar;
        aj.g.o("Camera2CameraControlImp", "setActive: isActive = " + z10);
        r0 r0Var = this.f13955h;
        if (z10 != r0Var.f14042b) {
            r0Var.f14042b = z10;
            if (!r0Var.f14042b) {
                i iVar = r0Var.f14041a;
                ((HashSet) iVar.f13949b.f9b).remove(null);
                ((HashSet) iVar.f13949b.f9b).remove(null);
                if (r0Var.f14044d.length > 0 && r0Var.f14042b) {
                    d0.i1 i1Var = new d0.i1();
                    i1Var.B = true;
                    i1Var.A = r0Var.f14043c;
                    j0.g1 b10 = j0.g1.b();
                    b10.o(v.a.Z(CaptureRequest.CONTROL_AF_TRIGGER), 2);
                    i1Var.i(new a0.b(13, j0.i1.a(b10)));
                    r0Var.f14041a.o(Collections.singletonList(i1Var.j()));
                }
                MeteringRectangle[] meteringRectangleArr = r0.f14040h;
                r0Var.f14044d = meteringRectangleArr;
                r0Var.f14045e = meteringRectangleArr;
                r0Var.f14046f = meteringRectangleArr;
                iVar.p();
            }
        }
        q1.u uVar = this.f13956i;
        if (uVar.f12194a != z10) {
            uVar.f12194a = z10;
            if (!z10) {
                synchronized (((h3.a) uVar.f12196c)) {
                    ((h3.a) uVar.f12196c).g();
                    h3.a aVar2 = (h3.a) uVar.f12196c;
                    aVar = new n0.a(aVar2.d(), aVar2.b(), aVar2.c(), aVar2.a());
                }
                Looper myLooper = Looper.myLooper();
                Looper mainLooper = Looper.getMainLooper();
                androidx.lifecycle.f0 f0Var = (androidx.lifecycle.f0) uVar.f12197d;
                if (myLooper == mainLooper) {
                    f0Var.h(aVar);
                } else {
                    f0Var.i(aVar);
                }
                ((l1) uVar.f12198e).m();
                ((i) uVar.f12195b).p();
            }
        }
        a0.l lVar = this.f13958k;
        if (lVar.A != z10) {
            lVar.A = z10;
        }
        j1 j1Var = this.f13957j;
        int i2 = j1Var.f13990e;
        if (j1Var.f13989d != z10) {
            j1Var.f13989d = z10;
            if (!z10) {
                if (j1Var.f13992g) {
                    j1Var.f13992g = false;
                    i iVar2 = j1Var.f13986a;
                    iVar2.f13964r = 0;
                    d0.i1 i1Var2 = new d0.i1();
                    i1Var2.A = iVar2.f13969w;
                    i1Var2.B = true;
                    j0.g1 b11 = j0.g1.b();
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                    b11.o(v.a.Z(key), Integer.valueOf(k(iVar2.f13952e, 1)));
                    b11.o(v.a.Z(CaptureRequest.FLASH_MODE), 0);
                    i1Var2.i(new a0.b(13, j0.i1.a(b11)));
                    iVar2.o(Collections.singletonList(i1Var2.j()));
                    iVar2.p();
                    j1Var.getClass();
                    androidx.lifecycle.f0 f0Var2 = j1Var.f13987b;
                    Integer valueOf = Integer.valueOf(1 ^ 1);
                    if (l0.f.t()) {
                        f0Var2.h(valueOf);
                    } else {
                        f0Var2.i(valueOf);
                    }
                    androidx.lifecycle.f0 f0Var3 = j1Var.f13988c;
                    Integer valueOf2 = Integer.valueOf(i2);
                    if (l0.f.t()) {
                        f0Var3.h(valueOf2);
                    } else {
                        f0Var3.i(valueOf2);
                    }
                }
                b5.i iVar3 = j1Var.f13991f;
                if (iVar3 != null) {
                    iVar3.c(new Exception("Camera is not active."));
                    j1Var.f13991f = null;
                }
            }
        }
        a0.l lVar2 = this.f13959l;
        if (z10 != lVar2.A) {
            lVar2.A = z10;
            if (!z10) {
                synchronized (((b6.f) lVar2.B).f2075b) {
                }
            }
        }
        c0.c cVar = this.f13960n;
        cVar.f2368d.execute(new c0.a(cVar, z10, 0));
        if (!z10) {
            ((AtomicInteger) this.f13962p.B).set(0);
            aj.g.o("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
        }
    }

    public final void n(boolean z10) {
        synchronized (this.f13958k.B) {
            try {
                if (!z10) {
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void o(List list) {
        j0.u uVar;
        int c4;
        int b10;
        j0.u uVar2;
        x xVar = this.f13953f.f14048a;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0.p0 p0Var = (j0.p0) it.next();
            HashSet hashSet = new HashSet();
            j0.g1.b();
            ArrayList arrayList2 = new ArrayList();
            j0.h1.a();
            hashSet.addAll(p0Var.f7274a);
            j0.g1 c10 = j0.g1.c(p0Var.f7275b);
            int i2 = p0Var.f7276c;
            arrayList2.addAll(p0Var.f7277d);
            boolean z10 = p0Var.f7278e;
            h2 h2Var = p0Var.f7279f;
            ArrayMap arrayMap = new ArrayMap();
            for (String str : h2Var.f7212a.keySet()) {
                arrayMap.put(str, h2Var.f7212a.get(str));
            }
            h2 h2Var2 = new h2(arrayMap);
            if (p0Var.f7276c == 5 && (uVar2 = p0Var.f7280g) != null) {
                uVar = uVar2;
            } else {
                uVar = null;
            }
            if (Collections.unmodifiableList(p0Var.f7274a).isEmpty() && p0Var.f7278e) {
                if (!hashSet.isEmpty()) {
                    aj.g.y0("Camera2CameraImpl", "The capture config builder already has surface inside.");
                } else {
                    a0.g gVar = xVar.A;
                    gVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) gVar.L).entrySet()) {
                        j2 j2Var = (j2) entry.getValue();
                        if (j2Var.f7233f && j2Var.f7232e) {
                            arrayList3.add(((j2) entry.getValue()).f7228a);
                        }
                    }
                    for (w1 w1Var : Collections.unmodifiableCollection(arrayList3)) {
                        j0.p0 p0Var2 = w1Var.f7322g;
                        List<j0.u0> unmodifiableList = Collections.unmodifiableList(p0Var2.f7274a);
                        if (!unmodifiableList.isEmpty()) {
                            if (p0Var2.b() != 0 && (b10 = p0Var2.b()) != 0) {
                                c10.o(l2.O, Integer.valueOf(b10));
                            }
                            if (p0Var2.c() != 0 && (c4 = p0Var2.c()) != 0) {
                                c10.o(l2.P, Integer.valueOf(c4));
                            }
                            for (j0.u0 u0Var : unmodifiableList) {
                                hashSet.add(u0Var);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        aj.g.y0("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            j0.i1 a10 = j0.i1.a(c10);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            h2 h2Var3 = h2.f7211b;
            ArrayMap arrayMap2 = new ArrayMap();
            ArrayMap arrayMap3 = h2Var2.f7212a;
            for (String str2 : arrayMap3.keySet()) {
                arrayMap2.put(str2, arrayMap3.get(str2));
            }
            arrayList.add(new j0.p0(arrayList4, a10, i2, arrayList5, z10, new h2(arrayMap2), uVar));
        }
        xVar.v("Issue capture request", null);
        xVar.f14069g0.j(arrayList);
    }

    public final long p() {
        this.f13970x = this.f13968v.getAndIncrement();
        this.f13953f.f14048a.L();
        return this.f13970x;
    }

    @Override // j0.a0
    public final void f(n0.h hVar) {
    }
}
