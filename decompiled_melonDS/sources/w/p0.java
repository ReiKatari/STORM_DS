package w;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.CaptureNoResponseQuirk;
import androidx.camera.core.impl.utils.SurfaceUtil;
import j0.o1;
import j0.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: c  reason: collision with root package name */
    public final o0 f14012c;

    /* renamed from: d  reason: collision with root package name */
    public g1 f14013d;

    /* renamed from: e  reason: collision with root package name */
    public g1 f14014e;

    /* renamed from: f  reason: collision with root package name */
    public w1 f14015f;

    /* renamed from: i  reason: collision with root package name */
    public n0 f14018i;

    /* renamed from: j  reason: collision with root package name */
    public n0 f14019j;

    /* renamed from: k  reason: collision with root package name */
    public b5.l f14020k;

    /* renamed from: l  reason: collision with root package name */
    public b5.i f14021l;
    public HashMap m;

    /* renamed from: n  reason: collision with root package name */
    public final a0.m f14022n;

    /* renamed from: o  reason: collision with root package name */
    public final a0.m f14023o;

    /* renamed from: p  reason: collision with root package name */
    public final a0.l f14024p;

    /* renamed from: q  reason: collision with root package name */
    public final rd.k f14025q;

    /* renamed from: r  reason: collision with root package name */
    public final a0.a f14026r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f14027s;

    /* renamed from: a  reason: collision with root package name */
    public final Object f14010a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f14011b = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final HashMap f14016g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    public List f14017h = Collections.EMPTY_LIST;

    public p0(rd.k kVar, o1 o1Var, boolean z10) {
        n0 n0Var = n0.UNINITIALIZED;
        this.f14018i = n0Var;
        this.f14019j = n0Var;
        this.m = new HashMap();
        this.f14022n = new a0.m(1);
        this.f14023o = new a0.m(2);
        o(n0.INITIALIZED);
        this.f14025q = kVar;
        this.f14012c = new o0(this);
        this.f14024p = new a0.l(o1Var.h(CaptureNoResponseQuirk.class));
        this.f14026r = new a0.a(o1Var, 1);
        this.f14027s = z10;
    }

    public static z c(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        CameraCaptureSession.CaptureCallback zVar;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j0.m mVar = (j0.m) it.next();
            if (mVar == null) {
                zVar = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                p7.m.G(mVar, arrayList2);
                if (arrayList2.size() == 1) {
                    zVar = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    zVar = new z(arrayList2);
                }
            }
            arrayList.add(zVar);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new z(arrayList);
    }

    public static HashMap d(HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) hashMap.get(num)).iterator();
            if (!it.hasNext()) {
                aj.g.s("CaptureSession", "Skips to create instances for multi-resolution output. imageFormat: 0, streamInfos size: " + arrayList.size());
            } else {
                SurfaceUtil.a((Surface) hashMap2.get(((j0.i) it.next()).f7213a));
                m4.b.k();
                throw null;
            }
        }
        return hashMap3;
    }

    public static HashMap g(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            j0.i iVar = (j0.i) obj;
            int i10 = iVar.f7216d;
            if (i10 > 0 && iVar.f7214b.isEmpty()) {
                List list = (List) hashMap.get(Integer.valueOf(i10));
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(Integer.valueOf(i10), list);
                }
                list.add(iVar);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (Integer num : hashMap.keySet()) {
            num.getClass();
            if (((List) hashMap.get(num)).size() >= 2) {
                hashMap2.put(num, (List) hashMap.get(num));
            }
        }
        return hashMap2;
    }

    public final int a(ArrayList arrayList, a0.k kVar) {
        List<CaptureRequest> list;
        a0.k kVar2 = new a0.k(2);
        int size = arrayList.size();
        int i2 = -1;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            CaptureRequest captureRequest = (CaptureRequest) obj;
            g1 g1Var = this.f14014e;
            Objects.requireNonNull(g1Var);
            rd.k kVar3 = g1Var.f13932g;
            kVar3.getClass();
            CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((p1.a0) kVar3.B).B;
            if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
                list = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest);
            } else {
                list = Collections.EMPTY_LIST;
            }
            for (CaptureRequest captureRequest2 : list) {
                kVar2.a(captureRequest2, Collections.singletonList(new y0(captureRequest, kVar)));
            }
            g1 g1Var2 = this.f14014e;
            CameraCaptureSession.CaptureCallback d4 = g1Var2.f13945u.d(kVar2);
            p7.m.l(g1Var2.f13932g, "Need to call openCaptureSession before using this API.");
            rd.k kVar4 = g1Var2.f13932g;
            i2 = ((p1.a0) kVar4.B).s(list, g1Var2.f13929d, d4);
        }
        return i2;
    }

    public final void b() {
        synchronized (this.f14010a) {
            try {
                int ordinal = this.f14019j.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 6 || ordinal == 7) {
                                g1 g1Var = this.f14013d;
                                p7.m.l(g1Var, "The Opener shouldn't null in state:" + this.f14019j);
                                this.f14013d.p();
                                o(n0.CLOSED);
                                this.f14024p.u();
                                this.f14015f = null;
                            }
                        } else {
                            g1 g1Var2 = this.f14013d;
                            p7.m.l(g1Var2, "The Opener shouldn't null in state:" + this.f14019j);
                            this.f14013d.p();
                        }
                    }
                    o(n0.RELEASED);
                } else {
                    throw new IllegalStateException("close() should not be possible in state: " + this.f14019j);
                }
            } finally {
            }
        }
    }

    public final void e() {
        n0 n0Var = this.f14019j;
        n0 n0Var2 = n0.RELEASED;
        if (n0Var == n0Var2) {
            aj.g.o("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        o(n0Var2);
        this.f14014e = null;
        b5.i iVar = this.f14021l;
        if (iVar != null) {
            iVar.b(null);
            this.f14021l = null;
        }
    }

    public final y.h f(j0.i iVar, HashMap hashMap, String str) {
        long j2;
        j0.u0 u0Var = iVar.f7213a;
        List<j0.u0> list = iVar.f7214b;
        Surface surface = (Surface) hashMap.get(u0Var);
        p7.m.l(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        y.h hVar = new y.h(iVar.f7216d, surface);
        y.j jVar = hVar.f14638a;
        if (str != null) {
            jVar.h(str);
        } else {
            jVar.h(null);
        }
        int i2 = iVar.f7215c;
        boolean z10 = true;
        if (i2 == 0) {
            jVar.g(1);
        } else if (i2 == 1) {
            jVar.g(2);
        }
        if (!list.isEmpty()) {
            jVar.b();
            for (j0.u0 u0Var2 : list) {
                Surface surface2 = (Surface) hashMap.get(u0Var2);
                p7.m.l(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                jVar.a(surface2);
            }
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            rd.k kVar = this.f14025q;
            kVar.getClass();
            if (i10 < 33) {
                z10 = false;
            }
            p7.m.o("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
            DynamicRangeProfiles c4 = ((y.b) kVar.B).c();
            if (c4 != null) {
                d0.a0 a0Var = iVar.f7217e;
                Long a10 = y.a.a(a0Var, c4);
                if (a10 == null) {
                    aj.g.s("CaptureSession", "Requested dynamic range is not supported. Defaulting to STANDARD dynamic range profile.\nRequested dynamic range:\n  " + a0Var);
                } else {
                    j2 = a10.longValue();
                    jVar.f(j2);
                    return hVar;
                }
            }
        }
        j2 = 1;
        jVar.f(j2);
        return hVar;
    }

    public final boolean h() {
        boolean z10;
        synchronized (this.f14010a) {
            try {
                n0 n0Var = this.f14019j;
                if (n0Var != n0.OPENED && n0Var != n0.OPENING) {
                    z10 = false;
                }
                z10 = true;
            } finally {
            }
        }
        return z10;
    }

    public final void i(ArrayList arrayList) {
        a0.k kVar;
        ArrayList arrayList2;
        boolean z10;
        j0.u uVar;
        synchronized (this.f14010a) {
            try {
                if (this.f14019j != n0.OPENED) {
                    aj.g.o("CaptureSession", "Skipping issueBurstCaptureRequest due to session closed");
                } else if (!arrayList.isEmpty()) {
                    try {
                        kVar = new a0.k(2);
                        arrayList2 = new ArrayList();
                        aj.g.o("CaptureSession", "Issuing capture request.");
                        int size = arrayList.size();
                        z10 = false;
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            j0.p0 p0Var = (j0.p0) obj;
                            if (Collections.unmodifiableList(p0Var.f7274a).isEmpty()) {
                                aj.g.o("CaptureSession", "Skipping issuing empty capture request.");
                            } else {
                                Iterator it = Collections.unmodifiableList(p0Var.f7274a).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        j0.u0 u0Var = (j0.u0) it.next();
                                        if (!this.f14016g.containsKey(u0Var)) {
                                            aj.g.o("CaptureSession", "Skipping capture request with invalid surface: " + u0Var);
                                            break;
                                        }
                                    } else {
                                        if (p0Var.f7276c == 2) {
                                            z10 = true;
                                        }
                                        d0.i1 i1Var = new d0.i1(p0Var);
                                        if (p0Var.f7276c == 5 && (uVar = p0Var.f7280g) != null) {
                                            i1Var.Z = uVar;
                                        }
                                        w1 w1Var = this.f14015f;
                                        if (w1Var != null) {
                                            i1Var.i(w1Var.f7322g.f7275b);
                                        }
                                        i1Var.i(p0Var.f7275b);
                                        j0.p0 j2 = i1Var.j();
                                        g1 g1Var = this.f14014e;
                                        g1Var.f13932g.getClass();
                                        CaptureRequest j10 = p7.a.j(j2, ((CameraCaptureSession) ((p1.a0) g1Var.f13932g.B).B).getDevice(), this.f14016g, false, this.f14026r);
                                        if (j10 == null) {
                                            aj.g.o("CaptureSession", "Skipping issuing request without surface.");
                                            return;
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        for (j0.m mVar : p0Var.f7277d) {
                                            p7.m.G(mVar, arrayList3);
                                        }
                                        kVar.a(j10, arrayList3);
                                        arrayList2.add(j10);
                                    }
                                }
                            }
                        }
                    } catch (CameraAccessException e6) {
                        aj.g.s("CaptureSession", "Unable to access camera: " + e6.getMessage());
                        Thread.dumpStack();
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f14022n.h(arrayList2, z10)) {
                            g1 g1Var2 = this.f14014e;
                            p7.m.l(g1Var2.f13932g, "Need to call openCaptureSession before using this API.");
                            ((CameraCaptureSession) ((p1.a0) g1Var2.f13932g.B).B).stopRepeating();
                            kVar.f10c = new m0(this);
                        }
                        if (this.f14023o.g(arrayList2, z10)) {
                            kVar.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new z(this)));
                        }
                        w1 w1Var2 = this.f14015f;
                        if (w1Var2 != null && w1Var2.f7323h == 1) {
                            a(arrayList2, kVar);
                            return;
                        }
                        g1 g1Var3 = this.f14014e;
                        CameraCaptureSession.CaptureCallback d4 = g1Var3.f13945u.d(kVar);
                        p7.m.l(g1Var3.f13932g, "Need to call openCaptureSession before using this API.");
                        ((p1.a0) g1Var3.f13932g.B).s(arrayList2, g1Var3.f13929d, d4);
                        return;
                    }
                    aj.g.o("CaptureSession", "Skipping issuing burst request due to no valid request elements");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j(List list) {
        synchronized (this.f14010a) {
            try {
                switch (this.f14019j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f14019j);
                    case DSiCameraSource.FrontCamera /* 1 */:
                    case 4:
                    case l1.c.f8511g /* 5 */:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                    case 2:
                    case 3:
                    case l1.c.f8509e /* 6 */:
                        this.f14011b.addAll(list);
                        break;
                    case 7:
                        this.f14011b.addAll(list);
                        this.f14024p.g().a(new r0.b(8, this), ij.a.D());
                        break;
                }
            } finally {
            }
        }
    }

    public final void k(w1 w1Var) {
        List<CaptureRequest> list;
        synchronized (this.f14010a) {
            try {
            } catch (Throwable th2) {
                throw th2;
            }
            if (w1Var == null) {
                aj.g.o("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
            } else if (this.f14019j != n0.OPENED) {
                aj.g.o("CaptureSession", "Skipping issueRepeatingCaptureRequests due to session closed");
            } else {
                j0.p0 p0Var = w1Var.f7322g;
                if (Collections.unmodifiableList(p0Var.f7274a).isEmpty()) {
                    aj.g.o("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                    try {
                        g1 g1Var = this.f14014e;
                        p7.m.l(g1Var.f13932g, "Need to call openCaptureSession before using this API.");
                        ((CameraCaptureSession) ((p1.a0) g1Var.f13932g.B).B).stopRepeating();
                    } catch (CameraAccessException e6) {
                        aj.g.s("CaptureSession", "Unable to access camera: " + e6.getMessage());
                        Thread.dumpStack();
                    }
                    return;
                }
                try {
                    aj.g.o("CaptureSession", "Issuing request for session.");
                    g1 g1Var2 = this.f14014e;
                    g1Var2.f13932g.getClass();
                    CaptureRequest j2 = p7.a.j(p0Var, ((CameraCaptureSession) ((p1.a0) g1Var2.f13932g.B).B).getDevice(), this.f14016g, true, this.f14026r);
                    if (j2 == null) {
                        aj.g.o("CaptureSession", "Skipping issuing empty request for session.");
                        return;
                    }
                    CameraCaptureSession.CaptureCallback d4 = this.f14024p.d(c(p0Var.f7277d, new CameraCaptureSession.CaptureCallback[0]));
                    int i2 = w1Var.f7323h;
                    g1 g1Var3 = this.f14014e;
                    if (i2 == 1) {
                        rd.k kVar = g1Var3.f13932g;
                        kVar.getClass();
                        CameraCaptureSession cameraCaptureSession = (CameraCaptureSession) ((p1.a0) kVar.B).B;
                        if (cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession) {
                            list = ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(j2);
                        } else {
                            list = Collections.EMPTY_LIST;
                        }
                        g1 g1Var4 = this.f14014e;
                        p7.m.l(g1Var4.f13932g, "Need to call openCaptureSession before using this API.");
                        rd.k kVar2 = g1Var4.f13932g;
                        ((p1.a0) kVar2.B).F(list, g1Var4.f13929d, d4);
                        return;
                    }
                    g1Var3.n(j2, d4);
                    return;
                } catch (CameraAccessException e10) {
                    aj.g.s("CaptureSession", "Unable to access camera: " + e10.getMessage());
                    Thread.dumpStack();
                    return;
                }
                throw th2;
            }
        }
    }

    public final ta.a l(w1 w1Var, CameraDevice cameraDevice, g1 g1Var) {
        ta.a o5;
        synchronized (this.f14010a) {
            try {
                if (this.f14019j.ordinal() != 2) {
                    aj.g.s("CaptureSession", "Open not allowed in state: " + this.f14019j);
                    return new m0.k(1, new IllegalStateException("open() should not allow the state: " + this.f14019j));
                }
                o(n0.GET_SURFACE);
                ArrayList arrayList = new ArrayList(w1Var.b());
                this.f14017h = arrayList;
                this.f14013d = g1Var;
                synchronized (g1Var.f13940p) {
                    g1Var.f13941q = arrayList;
                    o5 = g1Var.o(arrayList);
                }
                m0.b g10 = m0.i.g(m0.d.b(o5), new c8.i(this, w1Var, cameraDevice, 4), this.f14013d.f13929d);
                rd.k kVar = new rd.k(11, this);
                g10.a(new m0.h(0, g10, kVar), this.f14013d.f13929d);
                return m0.i.d(g10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007c, B:28:0x008f), top: B:31:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:4:0x0009, B:6:0x0011, B:24:0x0078, B:8:0x0015, B:10:0x0019, B:13:0x001f, B:15:0x0044, B:16:0x0048, B:18:0x004c, B:19:0x0057, B:20:0x0059, B:22:0x005b, B:23:0x0073, B:27:0x007c, B:28:0x008f), top: B:31:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ta.a m() {
        /*
            r5 = this;
            java.lang.String r0 = "release() should not be possible in state: "
            java.lang.String r1 = "The Opener shouldn't null in state:"
            java.lang.String r2 = "The Opener shouldn't null in state:"
            java.lang.Object r3 = r5.f14010a
            monitor-enter(r3)
            w.n0 r4 = r5.f14019j     // Catch: java.lang.Throwable -> L1d
            int r4 = r4.ordinal()     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto L7c
            switch(r4) {
                case 2: goto L73;
                case 3: goto L5b;
                case 4: goto L48;
                case 5: goto L15;
                case 6: goto L1f;
                case 7: goto L15;
                default: goto L14;
            }     // Catch: java.lang.Throwable -> L1d
        L14:
            goto L78
        L15:
            w.g1 r0 = r5.f14014e     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1f
            r0.i()     // Catch: java.lang.Throwable -> L1d
            goto L1f
        L1d:
            r0 = move-exception
            goto L90
        L1f:
            w.n0 r0 = w.n0.RELEASING     // Catch: java.lang.Throwable -> L1d
            r5.o(r0)     // Catch: java.lang.Throwable -> L1d
            a0.l r0 = r5.f14024p     // Catch: java.lang.Throwable -> L1d
            r0.u()     // Catch: java.lang.Throwable -> L1d
            w.g1 r0 = r5.f14013d     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1d
            w.n0 r2 = r5.f14019j     // Catch: java.lang.Throwable -> L1d
            r1.append(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            p7.m.l(r0, r1)     // Catch: java.lang.Throwable -> L1d
            w.g1 r0 = r5.f14013d     // Catch: java.lang.Throwable -> L1d
            boolean r0 = r0.p()     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L48
            r5.e()     // Catch: java.lang.Throwable -> L1d
            goto L78
        L48:
            b5.l r0 = r5.f14020k     // Catch: java.lang.Throwable -> L1d
            if (r0 != 0) goto L57
            w.m0 r0 = new w.m0     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L1d
            b5.l r0 = a.a.A(r0)     // Catch: java.lang.Throwable -> L1d
            r5.f14020k = r0     // Catch: java.lang.Throwable -> L1d
        L57:
            b5.l r0 = r5.f14020k     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            return r0
        L5b:
            w.g1 r0 = r5.f14013d     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            w.n0 r1 = r5.f14019j     // Catch: java.lang.Throwable -> L1d
            r2.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            p7.m.l(r0, r1)     // Catch: java.lang.Throwable -> L1d
            w.g1 r0 = r5.f14013d     // Catch: java.lang.Throwable -> L1d
            r0.p()     // Catch: java.lang.Throwable -> L1d
        L73:
            w.n0 r0 = w.n0.RELEASED     // Catch: java.lang.Throwable -> L1d
            r5.o(r0)     // Catch: java.lang.Throwable -> L1d
        L78:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            m0.k r0 = m0.k.L
            return r0
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            w.n0 r0 = r5.f14019j     // Catch: java.lang.Throwable -> L1d
            r2.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w.p0.m():ta.a");
    }

    public final void n(w1 w1Var) {
        synchronized (this.f14010a) {
            try {
                switch (this.f14019j.ordinal()) {
                    case 0:
                        throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f14019j);
                    case DSiCameraSource.FrontCamera /* 1 */:
                    case 4:
                    case l1.c.f8511g /* 5 */:
                        throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
                    case 2:
                    case 3:
                    case l1.c.f8509e /* 6 */:
                        this.f14015f = w1Var;
                        break;
                    case 7:
                        this.f14015f = w1Var;
                        if (w1Var == null) {
                            return;
                        }
                        if (!this.f14016g.keySet().containsAll(w1Var.b())) {
                            aj.g.s("CaptureSession", "Does not have the proper configured lists");
                            return;
                        }
                        aj.g.o("CaptureSession", "Attempting to submit CaptureRequest after setting");
                        k(this.f14015f);
                        break;
                }
            } finally {
            }
        }
    }

    public final void o(n0 n0Var) {
        if (n0Var.ordinal() > this.f14018i.ordinal()) {
            this.f14018i = n0Var;
        }
        this.f14019j = n0Var;
        if (aj.g.N() && this.f14018i.ordinal() >= n0.GET_SURFACE.ordinal()) {
            aj.g.f0(n0Var.ordinal(), "CX:C2State[" + String.format("CaptureSession@%x", Integer.valueOf(hashCode())) + "]");
        }
    }
}
