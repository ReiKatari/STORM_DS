package p7;

import a5.z;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Range;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.cardview.widget.CardView;
import h1.n1;
import j0.i1;
import j0.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l1.d1;
import n2.p1;
import n2.s2;
import n2.w0;
import p1.e0;
import p1.u0;
import q1.a0;
import q1.f0;
import v3.c0;
import yb.v;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11401a = 0;

    public static final List A(ArrayList arrayList) {
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableList(new ArrayList(arrayList));
            }
            return Collections.singletonList(zb.l.R(arrayList));
        }
        return zb.q.A;
    }

    public static final Map B(Map map) {
        int size = map.size();
        if (size != 0) {
            if (size != 1) {
                return Collections.unmodifiableMap(new LinkedHashMap(map));
            }
            Map.Entry entry = (Map.Entry) zb.l.Q(map.entrySet());
            return Collections.singletonMap(entry.getKey(), entry.getValue());
        }
        return zb.r.A;
    }

    public static Set C(pi.q qVar) {
        int size = qVar.size();
        TreeSet treeSet = null;
        for (int i2 = 0; i2 < size; i2++) {
            if ("Vary".equalsIgnoreCase(qVar.b(i2))) {
                String d4 = qVar.d(i2);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    comparator.getClass();
                    treeSet = new TreeSet(comparator);
                }
                for (String str : vc.h.u0(d4, new char[]{','})) {
                    treeSet.add(vc.h.C0(str).toString());
                }
            }
        }
        if (treeSet == null) {
            return zb.s.A;
        }
        return treeSet;
    }

    public static final void a(b3.p pVar, a0 a0Var, final d1 d1Var, final n1 n1Var, final i1.f fVar, final boolean z10, final f1.i iVar, final float f8, final q1.h hVar, u3.a aVar, final b3.g gVar, final i1.k kVar, final v2.c cVar, n2.m mVar, final int i2, final int i10) {
        int i11;
        int i12;
        a0 a0Var2;
        n2.r rVar;
        u3.a aVar2;
        b3.p pVar2;
        e0 rVar2;
        n2.r rVar3;
        a0 a0Var3;
        n1 n1Var2;
        int i13;
        ed.i iVar2;
        b3.p pVar3;
        b3.p f10;
        b3.f fVar2 = b3.c.f1759h0;
        n2.r rVar4 = (n2.r) mVar;
        rVar4.Z(-572816025);
        if ((i2 & 6) == 0) {
            i11 = i2 | (rVar4.f(pVar) ? 4 : 2);
        } else {
            i11 = i2;
        }
        if ((i2 & 48) == 0) {
            i11 |= rVar4.f(a0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i11 |= rVar4.f(d1Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i11 |= rVar4.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i11 |= rVar4.d(n1Var.ordinal()) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i11 |= rVar4.f(fVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i11 |= rVar4.g(z10) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= rVar4.f(iVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i11 |= rVar4.d(0) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= rVar4.c(f8) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (rVar4.f(hVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= rVar4.h(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= rVar4.h(null) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= rVar4.f(fVar2) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= rVar4.f(gVar) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= rVar4.f(kVar) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= rVar4.h(cVar) ? 1048576 : 524288;
        }
        int i14 = i12;
        if (rVar4.O(i11 & 1, ((i11 & 306783379) == 306783378 && (599187 & i14) == 599186) ? false : true)) {
            int i15 = i11 & 112;
            boolean z11 = i15 == 32;
            Object L = rVar4.L();
            n2.e eVar = n2.l.f9953a;
            if (z11 || L == eVar) {
                L = new q1.c(a0Var, 0);
                rVar4.h0(L);
            }
            mc.a aVar3 = (mc.a) L;
            int i16 = i11 >> 3;
            int i17 = i16 & 14;
            int i18 = i14 >> 15;
            int i19 = i17 | (i18 & 112) | (i14 & 896);
            w0 A = n2.s.A(cVar, rVar4);
            w0 A2 = n2.s.A(null, rVar4);
            boolean f11 = ((((i19 & 14) ^ 6) > 4 && rVar4.f(a0Var)) || (i19 & 6) == 4) | rVar4.f(A) | rVar4.f(A2) | rVar4.f(aVar3);
            Object L2 = rVar4.L();
            if (f11 || L2 == eVar) {
                n2.e eVar2 = n2.e.X;
                L2 = new ed.i(0, 3, s2.class, n2.s.r(new q1.e(0, n2.s.r(new ai.p(A, A2, aVar3), eVar2), a0Var), eVar2), "value", "getValue()Ljava/lang/Object;");
                rVar4.h0(L2);
            }
            ed.i iVar3 = (ed.i) L2;
            Object L3 = rVar4.L();
            if (L3 == eVar) {
                L3 = n2.s.o(rVar4);
                rVar4.h0(L3);
            }
            u uVar = (u) L3;
            boolean z12 = i15 == 32;
            Object L4 = rVar4.L();
            if (z12 || L4 == eVar) {
                L4 = new q1.c(a0Var, 1);
                rVar4.h0(L4);
            }
            mc.a aVar4 = (mc.a) L4;
            int i20 = i11 >> 9;
            int i21 = (i11 & 65520) | (i20 & 458752) | (i20 & 3670016) | ((i14 << 21) & 29360128);
            int i22 = i14 << 15;
            int i23 = i21 | (i22 & 234881024) | (i22 & 1879048192);
            boolean f12 = ((((i23 & 896) ^ 384) > 256 && rVar4.f(d1Var)) || (i23 & 384) == 256) | ((((i23 & 112) ^ 48) > 32 && rVar4.f(a0Var)) || (i23 & 48) == 32) | ((((i23 & 7168) ^ 3072) > 2048 && rVar4.g(false)) || (i23 & 3072) == 2048) | ((((57344 & i23) ^ 24576) > 16384 && rVar4.d(n1Var.ordinal())) || (i23 & 24576) == 16384) | ((((i23 & 234881024) ^ 100663296) > 67108864 && rVar4.f(fVar2)) || (i23 & 100663296) == 67108864) | ((((i23 & 1879048192) ^ 805306368) > 536870912 && rVar4.f(gVar)) || (i23 & 805306368) == 536870912) | ((((i23 & 3670016) ^ 1572864) > 1048576 && rVar4.c(f8)) || (i23 & 1572864) == 1048576) | ((((i23 & 29360128) ^ 12582912) > 8388608 && rVar4.f(hVar)) || (i23 & 12582912) == 8388608) | ((((i18 & 14) ^ 6) > 4 && rVar4.f(kVar)) || (i18 & 6) == 4) | rVar4.f(aVar4) | ((((i23 & 458752) ^ 196608) > 131072 && rVar4.d(0)) || (i23 & 196608) == 131072) | rVar4.f(uVar);
            Object L5 = rVar4.L();
            if (f12 || L5 == eVar) {
                rVar3 = rVar4;
                a0Var3 = a0Var;
                n1Var2 = n1Var;
                i13 = 4;
                rVar2 = new q1.r(a0Var3, n1Var2, d1Var, f8, hVar, iVar3, aVar4, gVar, kVar, uVar);
                iVar2 = iVar3;
                rVar3.h0(rVar2);
            } else {
                n1Var2 = n1Var;
                rVar2 = L5;
                i13 = 4;
                rVar3 = rVar4;
                iVar2 = iVar3;
                a0Var3 = a0Var;
            }
            e0 e0Var = rVar2;
            n1 n1Var3 = n1.Vertical;
            boolean z13 = n1Var2 == n1Var3;
            boolean g10 = (((i17 ^ 6) > i13 && rVar3.f(a0Var3)) || (i16 & 6) == i13) | rVar3.g(z13);
            Object L6 = rVar3.L();
            if (g10 || L6 == eVar) {
                L6 = new q1.f(a0Var3, z13);
                rVar3.h0(L6);
            }
            u0 u0Var = (u0) L6;
            boolean z14 = (i15 == 32) | ((i11 & 458752) == 131072);
            Object L7 = rVar3.L();
            if (z14 || L7 == eVar) {
                L7 = new f0(fVar, a0Var3);
                rVar3.h0(L7);
            }
            f0 f0Var = (f0) L7;
            h1.d dVar = (h1.d) rVar3.j(h1.f.f5891a);
            boolean f13 = (i15 == 32) | rVar3.f(dVar);
            Object L8 = rVar3.L();
            if (f13 || L8 == eVar) {
                L8 = new q1.j(a0Var3, dVar);
                rVar3.h0(L8);
            }
            q1.j jVar = (q1.j) L8;
            b3.m mVar2 = b3.m.f1770a;
            if (z10) {
                rVar3.X(-853822717);
                int i24 = i17 | ((i11 >> 21) & 112);
                boolean z15 = ((((i24 & 112) ^ 48) > 32 && rVar3.d(0)) || (i24 & 48) == 32) | ((((i24 & 14) ^ 6) > i13 && rVar3.f(a0Var3)) || (i24 & 6) == i13);
                Object L9 = rVar3.L();
                if (z15 || L9 == eVar) {
                    L9 = new q1.i(a0Var3);
                    rVar3.h0(L9);
                }
                pVar3 = p1.l.m((q1.i) L9, a0Var3.f12114w, n1Var2);
                rVar3.p(false);
            } else {
                rVar3.X(-853392933);
                rVar3.p(false);
                pVar3 = mVar2;
            }
            pVar2 = pVar;
            b3.p n10 = p1.l.n(pVar2.f(a0Var3.f12117z).f(a0Var3.f12115x), iVar2, u0Var, n1Var2, z10);
            boolean z16 = n1Var2 == n1Var3;
            if (z10) {
                f10 = n10.f(i4.n.a(mVar2, false, new b7.k(2, a0Var3, uVar, z16)));
            } else {
                f10 = n10.f(mVar2);
            }
            b3.p p10 = f1.n.p(f10.f(pVar3), a0Var3, n1Var2, iVar, z10, f0Var, a0Var3.f12109r, jVar);
            a0Var2 = a0Var3;
            b3.p f14 = p10.f(c0.a(mVar2, a0Var2, new a2.h(7, a0Var2)));
            aVar2 = aVar;
            rVar = rVar3;
            p1.l.a(iVar2, u3.e.a(f14, aVar2), a0Var2.f12112u, e0Var, rVar, 0);
        } else {
            a0Var2 = a0Var;
            rVar = rVar4;
            aVar2 = aVar;
            pVar2 = pVar;
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            final u3.a aVar5 = aVar2;
            final a0 a0Var4 = a0Var2;
            final b3.p pVar4 = pVar2;
            r5.f9983d = new mc.p() { // from class: q1.d
                @Override // mc.p
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int F = n2.s.F(i2 | 1);
                    int F2 = n2.s.F(i10);
                    p7.a.a(b3.p.this, a0Var4, d1Var, n1Var, fVar, z10, iVar, f8, hVar, aVar5, gVar, kVar, cVar, (n2.m) obj, F, F2);
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final long b(float f8, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static final ExecutorService c(boolean z10) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new p8.c(z10));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static final Object[] d(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        zb.k.l(objArr, objArr2, 0, i2, 6);
        zb.k.i(objArr, objArr2, i2 + 2, i2, objArr.length);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] e(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        zb.k.l(objArr, objArr2, 0, i2, 6);
        zb.k.i(objArr, objArr2, i2, i2 + 2, objArr.length);
        return objArr2;
    }

    public static final Object[] f(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        zb.k.l(objArr, objArr2, 0, i2, 6);
        zb.k.i(objArr, objArr2, i2, i2 + 1, objArr.length);
        return objArr2;
    }

    public static void g(p0 p0Var, CaptureRequest.Builder builder) {
        Range a10 = p0Var.a();
        if (!a10.equals(j0.k.f7234h)) {
            builder.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a10);
        }
        aj.g.o("Camera2CaptureRequestBuilder", "applyAeFpsRange: expectedFrameRateRange = " + a10);
    }

    public static void h(CaptureRequest.Builder builder, i1 i1Var) {
        a0.b b10 = c0.f.c(i1Var).b();
        for (j0.g gVar : b10.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) gVar.f7202c;
            try {
                builder.set(key, b10.g(gVar));
            } catch (IllegalArgumentException unused) {
                aj.g.s("Camera2CaptureRequestBuilder", "CaptureRequest.Key is not supported: " + key);
            }
        }
    }

    public static void i(CaptureRequest.Builder builder, int i2, a0.a aVar) {
        Map map;
        if (i2 == 3 && aVar.f1a) {
            HashMap hashMap = new HashMap();
            hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap);
        } else {
            if (i2 == 4) {
                if (aVar.f2b) {
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                    map = Collections.unmodifiableMap(hashMap2);
                }
            } else {
                aVar.getClass();
            }
            map = Collections.EMPTY_MAP;
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static CaptureRequest j(p0 p0Var, CameraDevice cameraDevice, HashMap hashMap, boolean z10, a0.a aVar) {
        CaptureRequest.Builder createCaptureRequest;
        int i2;
        Integer num = null;
        if (cameraDevice != null) {
            ArrayList arrayList = p0Var.f7274a;
            int i10 = p0Var.f7276c;
            i1 i1Var = p0Var.f7275b;
            TreeMap treeMap = i1Var.A;
            List<j0.u0> unmodifiableList = Collections.unmodifiableList(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (j0.u0 u0Var : unmodifiableList) {
                Surface surface = (Surface) hashMap.get(u0Var);
                if (surface != null) {
                    arrayList2.add(surface);
                } else {
                    a0.j.h("DeferrableSurface not in configuredSurfaceMap");
                    return null;
                }
            }
            if (!arrayList2.isEmpty()) {
                j0.u uVar = p0Var.f7280g;
                if (i10 == 5 && uVar != null && (uVar.l() instanceof TotalCaptureResult)) {
                    aj.g.o("Camera2CaptureRequestBuilder", "createReprocessCaptureRequest");
                    createCaptureRequest = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) uVar.l());
                } else {
                    aj.g.o("Camera2CaptureRequestBuilder", "createCaptureRequest");
                    if (i10 == 5) {
                        if (z10) {
                            i2 = 1;
                        } else {
                            i2 = 2;
                        }
                        createCaptureRequest = cameraDevice.createCaptureRequest(i2);
                    } else {
                        createCaptureRequest = cameraDevice.createCaptureRequest(i10);
                    }
                }
                i(createCaptureRequest, i10, aVar);
                g(p0Var, createCaptureRequest);
                int i11 = 0;
                if (p0Var.b() != 1 && p0Var.c() != 1) {
                    if (p0Var.b() == 2) {
                        num = 2;
                    } else if (p0Var.c() == 2) {
                        num = 1;
                    }
                } else {
                    num = 0;
                }
                if (num != null) {
                    createCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num);
                }
                aj.g.o("Camera2CaptureRequestBuilder", "applyVideoStabilization: mode = " + num);
                j0.g gVar = p0.f7271h;
                if (treeMap.containsKey(gVar)) {
                    createCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, (Integer) i1Var.g(gVar));
                }
                j0.g gVar2 = p0.f7272i;
                if (treeMap.containsKey(gVar2)) {
                    createCaptureRequest.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) i1Var.g(gVar2)).byteValue()));
                }
                h(createCaptureRequest, i1Var);
                int size = arrayList2.size();
                while (i11 < size) {
                    Object obj = arrayList2.get(i11);
                    i11++;
                    createCaptureRequest.addTarget((Surface) obj);
                }
                createCaptureRequest.setTag(p0Var.f7279f);
                return createCaptureRequest.build();
            }
        }
        return null;
    }

    public static CaptureRequest k(p0 p0Var, CameraDevice cameraDevice, a0.a aVar) {
        if (cameraDevice == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder("template type = ");
        int i2 = p0Var.f7276c;
        sb2.append(i2);
        aj.g.o("Camera2CaptureRequestBuilder", sb2.toString());
        CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(i2);
        i(createCaptureRequest, i2, aVar);
        g(p0Var, createCaptureRequest);
        h(createCaptureRequest, p0Var.f7275b);
        return createCaptureRequest.build();
    }

    public static float[] l(float[] fArr, int i2) {
        if (i2 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i2, length);
                float[] fArr2 = new float[i2];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        fj.j.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:44:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:44:0x0096, B:46:0x009c, B:52:0x00b1, B:53:0x00b4), top: B:68:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q5.d[] m(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.m(java.lang.String):q5.d[]");
    }

    public static final int q(int i2, int i10) {
        return (i2 >> i10) & 31;
    }

    public static String r(pi.r rVar) {
        rVar.getClass();
        fj.h hVar = fj.h.R;
        return na.f.h(rVar.f11789i).c("MD5").e();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [yb.m, yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6, types: [yb.f, java.lang.Object, yb.z] */
    public static yb.f s(yb.h hVar, mc.a aVar) {
        v vVar = v.f14812a;
        hVar.getClass();
        int i2 = yb.g.f14811a[hVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    ?? obj = new Object();
                    obj.A = aVar;
                    obj.B = vVar;
                    return obj;
                }
                m9.o.o();
                return null;
            }
            ?? obj2 = new Object();
            obj2.A = aVar;
            obj2.B = vVar;
            return obj2;
        }
        return new yb.n(aVar);
    }

    public static final String t(t7.c cVar) {
        StringBuilder sb2 = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i2 = 0;
        do {
            if (i2 == 0) {
                sb2.append("Foreign key violation(s) detected in '");
                sb2.append(cVar.n(0));
                sb2.append("'.\n");
            }
            String n10 = cVar.n(3);
            if (!linkedHashMap.containsKey(n10)) {
                linkedHashMap.put(n10, cVar.n(2));
            }
            i2++;
        } while (cVar.N());
        sb2.append("Number of different violations discovered: ");
        sb2.append(linkedHashMap.keySet().size());
        sb2.append("\nNumber of rows in violation: ");
        sb2.append(i2);
        sb2.append("\nViolation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            w.d.B(sb2, "\tParent Table = ", (String) entry.getValue(), ", Foreign Key Constraint Index = ", (String) entry.getKey());
            sb2.append("\n");
        }
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r6 == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        p7.k.f(16);
        r0 = java.lang.Integer.toString(r10, 16);
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        throw new java.lang.NumberFormatException("Expected a digit or '-' but was 0x".concat(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int u(fj.a0 r12) {
        /*
            java.lang.String r0 = "expected an int but was \""
            fj.e r1 = r12.B     // Catch: java.lang.NumberFormatException -> L80
            r2 = 1
            r12.O(r2)     // Catch: java.lang.NumberFormatException -> L80
            r4 = 0
            r6 = r4
        Lc:
            long r8 = r6 + r2
            boolean r10 = r12.s(r8)     // Catch: java.lang.NumberFormatException -> L80
            if (r10 == 0) goto L46
            byte r10 = r1.B(r6)     // Catch: java.lang.NumberFormatException -> L80
            r11 = 48
            if (r10 < r11) goto L20
            r11 = 57
            if (r10 <= r11) goto L29
        L20:
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 != 0) goto L2b
            r7 = 45
            if (r10 == r7) goto L29
            goto L2b
        L29:
            r6 = r8
            goto Lc
        L2b:
            if (r6 == 0) goto L2e
            goto L46
        L2e:
            java.lang.NumberFormatException r12 = new java.lang.NumberFormatException     // Catch: java.lang.NumberFormatException -> L80
            r0 = 16
            p7.k.f(r0)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r0 = java.lang.Integer.toString(r10, r0)     // Catch: java.lang.NumberFormatException -> L80
            r0.getClass()     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r1 = "Expected a digit or '-' but was 0x"
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.NumberFormatException -> L80
            r12.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            throw r12     // Catch: java.lang.NumberFormatException -> L80
        L46:
            long r1 = r1.J()     // Catch: java.lang.NumberFormatException -> L80
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r12 = r12.D(r6)     // Catch: java.lang.NumberFormatException -> L80
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 < 0) goto L66
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L66
            int r3 = r12.length()     // Catch: java.lang.NumberFormatException -> L80
            if (r3 > 0) goto L66
            int r12 = (int) r1     // Catch: java.lang.NumberFormatException -> L80
            return r12
        L66:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.NumberFormatException -> L80
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L80
            r4.<init>(r0)     // Catch: java.lang.NumberFormatException -> L80
            r4.append(r1)     // Catch: java.lang.NumberFormatException -> L80
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L80
            r12 = 34
            r4.append(r12)     // Catch: java.lang.NumberFormatException -> L80
            java.lang.String r12 = r4.toString()     // Catch: java.lang.NumberFormatException -> L80
            r3.<init>(r12)     // Catch: java.lang.NumberFormatException -> L80
            throw r3     // Catch: java.lang.NumberFormatException -> L80
        L80:
            r12 = move-exception
            java.lang.String r12 = r12.getMessage()
            fj.j.h(r12)
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.u(fj.a0):int");
    }

    public static Parcelable v(Parcel parcel, ClassLoader classLoader, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return z.i(parcel, classLoader, cls);
        }
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable != null && !cls.isInstance(readParcelable)) {
            StringBuilder sb2 = new StringBuilder("Parcelable ");
            sb2.append(readParcelable.getClass());
            String name = cls.getName();
            sb2.append(" is not a subclass of required class ");
            sb2.append(name);
            sb2.append(" provided in the parameter");
            throw new BadParcelableException(sb2.toString());
        }
        return readParcelable;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0078 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(int r7, java.lang.CharSequence r8) {
        /*
            int r0 = r8.length()
            r1 = -1
            if (r7 < r0) goto L8
            return r1
        L8:
            char r0 = r8.charAt(r7)
            r2 = 92
            r3 = 60
            if (r0 != r3) goto L39
        L12:
            int r7 = r7 + 1
            int r0 = r8.length()
            if (r7 >= r0) goto L38
            char r0 = r8.charAt(r7)
            r4 = 10
            if (r0 == r4) goto L38
            if (r0 == r3) goto L38
            r4 = 62
            if (r0 == r4) goto L35
            if (r0 == r2) goto L2b
            goto L12
        L2b:
            int r0 = r7 + 1
            boolean r4 = p7.j.z(r0, r8)
            if (r4 == 0) goto L12
            r7 = r0
            goto L12
        L35:
            int r7 = r7 + 1
            return r7
        L38:
            return r1
        L39:
            r0 = 0
            r3 = r7
        L3b:
            int r4 = r8.length()
            if (r3 >= r4) goto L79
            char r4 = r8.charAt(r3)
            if (r4 == 0) goto L75
            r5 = 32
            if (r4 == r5) goto L75
            if (r4 == r2) goto L69
            r6 = 40
            if (r4 == r6) goto L64
            r5 = 41
            if (r4 == r5) goto L5e
            boolean r4 = java.lang.Character.isISOControl(r4)
            if (r4 == 0) goto L72
            if (r3 == r7) goto L78
            goto L77
        L5e:
            if (r0 != 0) goto L61
            goto L77
        L61:
            int r0 = r0 + (-1)
            goto L72
        L64:
            int r0 = r0 + 1
            if (r0 <= r5) goto L72
            goto L78
        L69:
            int r4 = r3 + 1
            boolean r5 = p7.j.z(r4, r8)
            if (r5 == 0) goto L72
            r3 = r4
        L72:
            int r3 = r3 + 1
            goto L3b
        L75:
            if (r3 == r7) goto L78
        L77:
            return r3
        L78:
            return r1
        L79:
            int r7 = r8.length()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.a.w(int, java.lang.CharSequence):int");
    }

    public static int x(int i2, CharSequence charSequence) {
        while (i2 < charSequence.length()) {
            switch (charSequence.charAt(i2)) {
                case '[':
                    return -1;
                case '\\':
                    int i10 = i2 + 1;
                    if (!j.z(i10, charSequence)) {
                        break;
                    } else {
                        i2 = i10;
                        break;
                    }
                case ']':
                    return i2;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static int y(CharSequence charSequence, int i2, char c4) {
        while (i2 < charSequence.length()) {
            char charAt = charSequence.charAt(i2);
            if (charAt == '\\') {
                int i10 = i2 + 1;
                if (j.z(i10, charSequence)) {
                    i2 = i10;
                    i2++;
                }
            }
            if (charAt == c4) {
                return i2;
            }
            if (c4 == ')' && charAt == '(') {
                return -1;
            }
            i2++;
        }
        return charSequence.length();
    }

    public static void z(p1.a0 a0Var, float f8) {
        float f10;
        float f11;
        z0.a aVar = (z0.a) a0Var.B;
        CardView cardView = (CardView) a0Var.L;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f8 != aVar.f14853e || aVar.f14854f != useCompatPadding || aVar.f14855g != preventCornerOverlap) {
            aVar.f14853e = f8;
            aVar.f14854f = useCompatPadding;
            aVar.f14855g = preventCornerOverlap;
            aVar.b(null);
            aVar.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            a0Var.G(0, 0, 0, 0);
            return;
        }
        z0.a aVar2 = (z0.a) a0Var.B;
        float f12 = aVar2.f14853e;
        float f13 = aVar2.f14849a;
        if (cardView.getPreventCornerOverlap()) {
            f10 = (float) (((1.0d - z0.b.f14860a) * f13) + f12);
        } else {
            int i2 = z0.b.f14861b;
            f10 = f12;
        }
        int ceil = (int) Math.ceil(f10);
        if (cardView.getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - z0.b.f14860a) * f13) + (f12 * 1.5f));
        } else {
            f11 = f12 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f11);
        a0Var.G(ceil, ceil2, ceil, ceil2);
    }

    public abstract int n(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int o();

    public abstract ViewPropertyAnimator p(View view, int i2);
}
