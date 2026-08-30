package d0;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import android.view.ViewConfiguration;
import androidx.preference.Preference;
import h1.e2;
import h1.g3;
import h1.j2;
import h1.n2;
import h1.p2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3331a;

    /* renamed from: b  reason: collision with root package name */
    public Object f3332b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f3333c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f3334d;

    /* renamed from: e  reason: collision with root package name */
    public Object f3335e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3336f;

    /* renamed from: g  reason: collision with root package name */
    public Object f3337g;

    /* renamed from: h  reason: collision with root package name */
    public Object f3338h;

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01f4, code lost:
        if (r13 == 1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f6, code lost:
        if (r13 == 2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f8, code lost:
        if (r13 == 3) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
        if (r13 != 4) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fc, code lost:
        r13 = "JPEG_R output format";
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
        m9.o.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0204, code lost:
        r13 = "stabilization";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0207, code lost:
        r13 = "60 FPS";
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x020a, code lost:
        r13 = "HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x020c, code lost:
        r12.append(r13);
        r12.append(" is required, instead set ");
        r13 = r0[r4.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x021a, code lost:
        if (r13 == 1) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021c, code lost:
        if (r13 == 2) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x021e, code lost:
        if (r13 == 3) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0220, code lost:
        if (r13 == 4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0222, code lost:
        m9.o.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0227, code lost:
        r13 = "GroupableFeature.IMAGE_ULTRA_HDR";
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022a, code lost:
        r13 = "GroupableFeature.PREVIEW_STABILIZATION";
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x022d, code lost:
        r13 = "GroupableFeature.FPS_60";
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0230, code lost:
        r13 = "GroupableFeature.HDR_HLG10";
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0232, code lost:
        a0.j.e(w.d.s(r12, r13, " as either a required or preferred feature."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x023c, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0195, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0190, code lost:
        r4 = (g0.b) r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0192, code lost:
        if (r4 != null) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0194, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0195, code lost:
        if (r6 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0197, code lost:
        r12 = new java.lang.StringBuilder("A ");
        r4.getClass();
        r12.append(r4.name());
        r12.append(" value is set to ");
        r12.append(r0);
        r12.append(" despite using feature groups. Do not use APIs like ");
        r12.append(r0);
        r12.append(".Builder.");
        r0 = d0.k1.f3428a;
        r2 = r0[r4.ordinal()];
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c5, code lost:
        if (r2 == 1) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c7, code lost:
        if (r2 == 2) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c9, code lost:
        if (r2 == 3) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cb, code lost:
        if (r2 != 4) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01cd, code lost:
        r13 = "setOutputFormat";
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
        m9.o.o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d9, code lost:
        if (n0.f.B(r13) == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01db, code lost:
        r13 = "setVideoStabilizationEnabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01de, code lost:
        r13 = "setPreviewStabilizationEnabled";
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e1, code lost:
        r13 = "setTargetFrameRateRange";
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e4, code lost:
        r13 = "setDynamicRange";
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e6, code lost:
        r12.append(r13);
        r12.append(" while using feature groups. If ");
        r13 = r0[r4.ordinal()];
     */
    /* JADX WARN: Type inference failed for: r13v41, types: [j0.p1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [j0.p1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b1(java.util.ArrayList r12, java.util.List r13) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b1.<init>(java.util.ArrayList, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0142 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v20, types: [nc.l, mc.a] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, nc.q] */
    /* JADX WARN: Type inference failed for: r2v4, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(d0.b1 r16, h1.p2 r17, h1.h1 r18, float r19, float r20, ec.c r21) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b1.a(d0.b1, h1.p2, h1.h1, float, float, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(d0.b1 r14, nc.t r15, nc.q r16, h1.p2 r17, nc.t r18, long r19, ec.c r21) {
        /*
            r0 = r19
            r2 = r21
            boolean r3 = r2 instanceof h1.l1
            if (r3 == 0) goto L17
            r3 = r2
            h1.l1 r3 = (h1.l1) r3
            int r4 = r3.f5968d0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L17
            int r4 = r4 - r5
            r3.f5968d0 = r4
            goto L1c
        L17:
            h1.l1 r3 = new h1.l1
            r3.<init>(r2)
        L1c:
            java.lang.Object r2 = r3.f5967c0
            dc.a r4 = dc.a.COROUTINE_SUSPENDED
            int r5 = r3.f5968d0
            r6 = 1
            if (r5 == 0) goto L3f
            if (r5 != r6) goto L38
            nc.t r14 = r3.f5966b0
            h1.p2 r0 = r3.Z
            nc.q r1 = r3.Y
            nc.t r4 = r3.X
            d0.b1 r3 = r3.R
            p7.j.I(r2)
            r9 = r14
            r8 = r0
            r14 = r3
            goto L6e
        L38:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r14)
            r14 = 0
            return r14
        L3f:
            p7.j.I(r2)
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4b
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L4b:
            a9.b r2 = new a9.b
            r5 = 0
            r7 = 15
            r2.<init>(r7, r5, r14)
            r3.R = r14
            r3.X = r15
            r7 = r16
            r3.Y = r7
            r8 = r17
            r3.Z = r8
            r9 = r18
            r3.f5966b0 = r9
            r3.f5968d0 = r6
            java.lang.Object r2 = zc.x.G(r0, r2, r3)
            if (r2 != r4) goto L6c
            return r4
        L6c:
            r4 = r15
            r1 = r7
        L6e:
            h1.h1 r2 = (h1.h1) r2
            if (r2 == 0) goto La9
            java.lang.Object r0 = r4.A
            h1.h1 r0 = (h1.h1) r0
            boolean r0 = r0.f5909c
            long r10 = r2.f5907a
            long r12 = r2.f5908b
            h1.h1 r3 = new h1.h1
            r20 = r0
            r15 = r3
            r16 = r10
            r18 = r12
            r15.<init>(r16, r18, r20)
            r0 = r15
            r4.A = r0
            long r3 = r8.e(r10)
            float r0 = r8.i(r3)
            r1.A = r0
            r0 = 30
            r3 = 0
            d1.k r0 = d1.d.b(r3, r3, r0)
            r9.A = r0
            r14.k(r2)
            float r14 = r1.A
            boolean r14 = h1.g1.a(r14)
            r14 = r14 ^ r6
            goto Laa
        La9:
            r14 = 0
        Laa:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b1.b(d0.b1, nc.t, nc.q, h1.p2, nc.t, long, ec.c):java.lang.Object");
    }

    public static h1.h1 j(bd.h hVar) {
        h1.h1 h1Var = null;
        uc.g y10 = p7.m.y(new h1.s0(1, (cc.c) null, new a2.n(21, hVar)));
        while (y10.hasNext()) {
            h1.h1 h1Var2 = (h1.h1) y10.next();
            if (h1Var != null) {
                h1Var2 = h1Var.a(h1Var2);
            }
            h1Var = h1Var2;
        }
        return h1Var;
    }

    public float c(n2 n2Var, float f8) {
        p2 p2Var = (p2) this.f3332b;
        long h2 = p2Var.h(p2Var.d(f8));
        p2 p2Var2 = n2Var.f5985a;
        return p2Var.g(p2Var.e(p2Var2.c(p2Var2.f5999k, h2, 1)));
    }

    public ta.a d() {
        return a.a.A(new ah.e(16, this));
    }

    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.lang.Object] */
    public boolean e(v3.k kVar) {
        float v10;
        float v11;
        long j2;
        x4.c cVar = (x4.c) this.f3335e;
        ViewConfiguration viewConfiguration = (ViewConfiguration) ((d2.t) this.f3333c).B;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 26) {
            v10 = g3.b(viewConfiguration);
        } else {
            v10 = cVar.v(64);
        }
        float f8 = -v10;
        if (i2 > 26) {
            v11 = g3.a(viewConfiguration);
        } else {
            v11 = cVar.v(64);
        }
        float f10 = -v11;
        ?? r12 = kVar.f13678a;
        h3.b bVar = new h3.b(0L);
        int size = r12.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            j2 = bVar.f6050a;
            if (i10 >= size) {
                break;
            }
            bVar = new h3.b(h3.b.e(j2, ((v3.t) r12.get(i10)).f13700j));
            i10++;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) * f10) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * f8) & 4294967295L);
        p2 p2Var = (p2) this.f3332b;
        float i11 = p2Var.i(p2Var.e(floatToRawIntBits));
        if (i11 != 0.0f) {
            int i12 = (i11 > 0.0f ? 1 : (i11 == 0.0f ? 0 : -1));
            j2 j2Var = p2Var.f5989a;
            if (i12 > 0) {
                z10 = j2Var.d();
            } else {
                z10 = j2Var.a();
            }
        }
        if (z10) {
            return !(((bd.h) this.f3336f).a(new h1.h1(floatToRawIntBits, ((v3.t) zb.l.R(kVar.f13678a)).f13692b, false)) instanceof bd.n);
        }
        return this.f3331a;
    }

    public FileInputStream f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e6) {
            String message = e6.getMessage();
            if (message != null && message.contains("compressed")) {
                ((h7.d) this.f3333c).k();
                return null;
            }
            return null;
        }
    }

    public void g(int i2, Serializable serializable) {
        ((Executor) this.f3332b).execute(new d.i(this, i2, serializable, 2));
    }

    public void h() {
        if (((w.d0) this.f3338h) != null) {
            Log.w("Camera2PresenceSrc", "Monitoring already started. Unregistering existing callback.");
            i();
        }
        Log.i("Camera2PresenceSrc", "Starting system availability monitoring.");
        w.d0 d0Var = new w.d0(this);
        this.f3338h = d0Var;
        ((x.p) this.f3336f).f14306a.C((Executor) this.f3337g, d0Var);
        a.a.A(new m0.e(d(), 0));
    }

    public void i() {
        Log.i("Camera2PresenceSrc", "Stopping system availability monitoring.");
        w.d0 d0Var = (w.d0) this.f3338h;
        if (d0Var != null) {
            try {
                ((x.p) this.f3336f).f14306a.L(d0Var);
            } catch (Exception e6) {
                Log.w("Camera2PresenceSrc", "Failed to unregister system availability callback.", e6);
            } finally {
                this.f3338h = null;
            }
        }
    }

    public void k(h1.h1 h1Var) {
        a0.g gVar = (a0.g) this.f3338h;
        long j2 = h1Var.f5908b;
        long j10 = h1Var.f5907a;
        ((w3.d) gVar.B).a(j2, Float.intBitsToFloat((int) (j10 >> 32)));
        ((w3.d) gVar.L).a(j2, Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public void l(ArrayList arrayList, t tVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List unmodifiableList;
        Throwable th2;
        synchronized (this.f3333c) {
            z10 = true;
            try {
                if (tVar != null) {
                    if (((Throwable) this.f3335e) != null && ((List) this.f3332b).isEmpty()) {
                        z12 = false;
                        this.f3335e = tVar;
                        this.f3332b = Collections.EMPTY_LIST;
                    }
                    z12 = true;
                    this.f3335e = tVar;
                    this.f3332b = Collections.EMPTY_LIST;
                } else {
                    arrayList.getClass();
                    if (((Throwable) this.f3335e) == null && ((List) this.f3332b).equals(arrayList)) {
                        z11 = false;
                        this.f3335e = null;
                        this.f3332b = arrayList;
                        z12 = z11;
                    }
                    z11 = true;
                    this.f3335e = null;
                    this.f3332b = arrayList;
                    z12 = z11;
                }
                unmodifiableList = Collections.unmodifiableList((List) this.f3332b);
                th2 = (Throwable) this.f3335e;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z12) {
            StringBuilder sb2 = new StringBuilder("Data changed. Notifying ");
            sb2.append(((CopyOnWriteArrayList) this.f3334d).size());
            sb2.append(" observers. Error: ");
            if (th2 == null) {
                z10 = false;
            }
            sb2.append(z10);
            Log.d("CameraPresenceSrc", sb2.toString());
            Iterator it = ((CopyOnWriteArrayList) this.f3334d).iterator();
            while (it.hasNext()) {
                j0.a aVar = (j0.a) it.next();
                aVar.f7145a.execute(new a0.i(th2, aVar, unmodifiableList, 5));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(h1.p2 r6, h1.k1 r7, ec.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof h1.m1
            if (r0 == 0) goto L13
            r0 = r8
            h1.m1 r0 = (h1.m1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h1.m1 r0 = new h1.m1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            p7.j.I(r8)
            goto L4f
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L2e:
            p7.j.I(r8)
            r5.f3331a = r3
            di.b r8 = new di.b
            r2 = 0
            r4 = 12
            r8.<init>(r6, r7, r2, r4)
            r0.Y = r3
            dd.r r6 = new dd.r
            cc.g r7 = r0.B
            r7.getClass()
            r2 = 1
            r6.<init>(r7, r0, r2)
            java.lang.Object r6 = a.a.W(r6, r3, r6, r8)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r6 = 0
            r5.f3331a = r6
            yb.y r6 = yb.y.f14813a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.b1.m(h1.p2, h1.k1, ec.c):java.lang.Object");
    }

    public b1(List list, x.p pVar, Executor executor) {
        list.getClass();
        executor.getClass();
        this.f3333c = new Object();
        this.f3334d = new CopyOnWriteArrayList();
        this.f3335e = null;
        this.f3331a = false;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            str.getClass();
            arrayList.add(new q(p7.t.A(str), null));
        }
        this.f3332b = arrayList;
        this.f3336f = pVar;
        this.f3337g = executor;
    }

    public b1(p2 p2Var, d2.t tVar, e2 e2Var, x4.c cVar) {
        this.f3332b = p2Var;
        this.f3333c = tVar;
        this.f3334d = e2Var;
        this.f3335e = cVar;
        this.f3336f = ij.a.s(Preference.DEFAULT_ORDER, 6, null);
        this.f3338h = new a0.g(19);
    }

    public b1(AssetManager assetManager, Executor executor, h7.d dVar, String str, File file) {
        byte[] bArr;
        this.f3331a = false;
        this.f3332b = executor;
        this.f3333c = dVar;
        this.f3336f = str;
        this.f3335e = file;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31) {
            bArr = h7.e.f6302d;
        } else {
            switch (i2) {
                case 24:
                case 25:
                    bArr = h7.e.f6306h;
                    break;
                case 26:
                    bArr = h7.e.f6305g;
                    break;
                case 27:
                    bArr = h7.e.f6304f;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = h7.e.f6303e;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.f3334d = bArr;
    }
}
