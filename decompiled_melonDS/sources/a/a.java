package a;

import ah.b0;
import ah.u0;
import ai.m;
import ai.s0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.media.ImageReader;
import android.os.Build;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import android.widget.EdgeEffect;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import b4.r0;
import b5.j;
import b5.l;
import ed.q;
import f2.m0;
import f2.u;
import f2.v;
import f6.b;
import g2.n0;
import h.i;
import h1.n1;
import hh.o0;
import i3.p0;
import i3.z;
import j0.o1;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import jb.c;
import ji.e;
import ji.g;
import l1.r1;
import l4.i0;
import l4.q0;
import mc.p;
import me.magnum.melonds.R;
import n2.r;
import n2.s;
import n2.w0;
import nc.w;
import nd.a1;
import nd.j1;
import nd.x0;
import o3.f;
import o3.h0;
import oe.e0;
import oe.f0;
import p7.t;
import q1.a0;
import u1.l0;
import vc.h;
import vc.o;
import w.d;
import yb.y;
import zb.k;
import zc.c0;
import zc.p1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static f f0a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b5.n] */
    public static l A(j jVar) {
        ?? obj = new Object();
        obj.f2053c = new Object();
        l lVar = new l(obj);
        obj.f2052b = lVar;
        obj.f2051a = jVar.getClass();
        try {
            Object h2 = jVar.h(obj);
            if (h2 != null) {
                obj.f2051a = h2;
                return lVar;
            }
            return lVar;
        } catch (Exception e6) {
            lVar.b(e6);
            return lVar;
        }
    }

    public static float B(String[] strArr, int i2) {
        float parseFloat = Float.parseFloat(strArr[i2]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final jd.a C(jd.a aVar) {
        aVar.getClass();
        if (aVar.e().h()) {
            return aVar;
        }
        return new x0(aVar);
    }

    public static final ViewParent D(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final int E(int i2, int i10, int i11) {
        if (i11 > 0) {
            if (i2 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i2 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else if (i11 < 0) {
            if (i2 > i10) {
                int i15 = -i11;
                int i16 = i2 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        } else {
            a0.j.h("Step is zero.");
            return 0;
        }
        return i10;
    }

    public static Bitmap F(InputStream inputStream) {
        long j2;
        int i2;
        byte[] bArr;
        int i10;
        byte[] bArr2 = new byte[1024];
        long j10 = 104;
        do {
            j2 = 1024;
            int read = inputStream.read(bArr2, 0, (int) Math.min(j10, j2));
            if (read <= 0) {
                break;
            }
            j10 -= read;
        } while (j10 > 0);
        inputStream.read(new byte[4]);
        long k10 = (k(0, bArr) + 32) - 108;
        byte[] bArr3 = new byte[1024];
        do {
            int read2 = inputStream.read(bArr3, 0, (int) Math.min(k10, j2));
            if (read2 <= 0) {
                break;
            }
            k10 -= read2;
        } while (k10 > 0);
        byte[] bArr4 = new byte[512];
        inputStream.read(bArr4);
        byte[] bArr5 = new byte[32];
        inputStream.read(bArr5);
        short[] sArr = new short[16];
        for (int i11 = 0; i11 < 16; i11++) {
            int i12 = i11 * 2;
            sArr[i11] = (short) ((255 & bArr5[i12]) | ((bArr5[i12 + 1] & 255) << 8));
        }
        int[] iArr = new int[16];
        for (int i13 = 0; i13 < 16; i13++) {
            short s10 = sArr[i13];
            int x9 = x(s10, 0) & 255;
            int x10 = x(s10, 5) & 255;
            int x11 = x(s10, 10) & 255;
            if (i13 == 0) {
                i10 = 0;
            } else {
                i10 = 255;
            }
            iArr[i13] = Color.argb(i10, x9, x10, x11);
        }
        int[] iArr2 = new int[1024];
        for (int i14 = 0; i14 < 4; i14++) {
            for (int i15 = 0; i15 < 4; i15++) {
                for (int i16 = 0; i16 < 32; i16++) {
                    byte b10 = bArr4[(((i14 * 4) + i15) * 32) + i16];
                    int i17 = (((byte) (b10 & (-16))) & 255) >> 4;
                    int i18 = b10 & 15;
                    int i19 = (((i16 / 4) + (i14 * 8)) * 32) + ((i16 % 4) * 2) + (i15 * 8);
                    if (i18 == 0) {
                        iArr2[i19] = 0;
                    } else {
                        iArr2[i19] = iArr[i18];
                    }
                    if (i17 == 0) {
                        iArr2[i19 + 1] = 0;
                    } else {
                        iArr2[i19 + 1] = iArr[i17];
                    }
                }
            }
        }
        byte[] bArr6 = new byte[4096];
        for (i2 = 0; i2 < 1024; i2++) {
            int i20 = iArr2[i2];
            int i21 = i2 * 4;
            bArr6[i21] = (byte) ((i20 >> 16) & 255);
            bArr6[i21 + 1] = (byte) ((i20 >> 8) & 255);
            bArr6[i21 + 2] = (byte) (i20 & 255);
            bArr6[i21 + 3] = (byte) ((i20 >> 24) & 255);
        }
        Bitmap createBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr6));
        return createBitmap;
    }

    public static e0 G(ze.a aVar, InputStream inputStream) {
        aVar.getClass();
        int i2 = 512;
        byte[] bArr = new byte[512];
        if (inputStream.read(bArr) < 512) {
            return null;
        }
        String N = o.N(bArr, 12, 5);
        String N2 = o.N(bArr, 16, 4);
        int[] iArr = sd.a.f12865a;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int i12 = i2 - 1;
            if (i2 > 0) {
                i10 = (i10 >>> 8) ^ sd.a.f12865a[(bArr[i11] ^ i10) & 255];
                i11++;
                i2 = i12;
            } else {
                return new e0(i10, N2, N, aVar.f15053a);
            }
        }
    }

    public static f0 H(InputStream inputStream) {
        final c cVar = new c(1);
        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.L;
        ji.f fVar = new ji.f(new m(21));
        ArrayList arrayList = (ArrayList) cVar.B;
        arrayList.add(fVar);
        ud.a aVar = new ud.a(inputStream);
        ArrayList arrayList2 = new ArrayList(zb.l.l0(arrayList, new b0(8)));
        while (!arrayList2.isEmpty()) {
            g gVar = (g) arrayList2.remove(0);
            long j2 = gVar.f7910a - aVar.A;
            byte[] bArr = new byte[1024];
            do {
                int read = aVar.read(bArr, 0, (int) Math.min(j2, 1024));
                if (read <= 0) {
                    break;
                }
                j2 -= read;
            } while (j2 > 0);
            if (gVar instanceof e) {
                ((e) gVar).f7908b.j(aVar, new p() { // from class: ji.d
                    @Override // mc.p
                    public final Object j(Object obj, Object obj2) {
                        String str = (String) obj;
                        switch (r1) {
                            case 0:
                                str.getClass();
                                obj2.getClass();
                                ((LinkedHashMap) cVar.L).put(str, obj2);
                                break;
                            default:
                                str.getClass();
                                obj2.getClass();
                                ((LinkedHashMap) cVar.L).put(str, obj2);
                                break;
                        }
                        return y.f14813a;
                    }
                });
            } else if (gVar instanceof ji.f) {
                ((ji.f) gVar).f7909b.i(aVar, new m0(1, arrayList2), new p() { // from class: ji.d
                    @Override // mc.p
                    public final Object j(Object obj, Object obj2) {
                        String str = (String) obj;
                        switch (r1) {
                            case 0:
                                str.getClass();
                                obj2.getClass();
                                ((LinkedHashMap) cVar.L).put(str, obj2);
                                break;
                            default:
                                str.getClass();
                                obj2.getClass();
                                ((LinkedHashMap) cVar.L).put(str, obj2);
                                break;
                        }
                        return y.f14813a;
                    }
                });
                if (arrayList2.size() > 1) {
                    zb.o.I(arrayList2, new b0(7));
                }
            }
        }
        boolean booleanValue = ((Boolean) linkedHashMap.get("isDsiWareTitle")).booleanValue();
        byte[] bArr2 = (byte[]) linkedHashMap.get("header");
        byte[] bArr3 = (byte[]) linkedHashMap.get("arm9Bootcode");
        byte[] bArr4 = (byte[]) linkedHashMap.get("arm7Bootcode");
        byte[] bArr5 = (byte[]) linkedHashMap.get("banner");
        byte[] bArr6 = new byte[bArr2.length + bArr3.length + bArr4.length + bArr5.length];
        k.k(bArr2, bArr6, 0, 0, 0, 14);
        k.k(bArr3, bArr6, bArr2.length, 0, 0, 12);
        k.k(bArr4, bArr6, bArr2.length + bArr3.length, 0, 0, 12);
        k.k(bArr5, bArr6, bArr2.length + bArr3.length + bArr4.length, 0, 0, 12);
        String bigInteger = new BigInteger(1, MessageDigest.getInstance("MD5").digest(bArr6)).toString(16);
        bigInteger.getClass();
        return new f0((String) linkedHashMap.get("name"), (String) linkedHashMap.get("developer"), h.o0(32, bigInteger), booleanValue);
    }

    public static int I(int i2) {
        if (i2 != 1) {
            if (i2 == 2) {
                return 1;
            }
            if (i2 == 4) {
                return 2;
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 != 32) {
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 == 256) {
                                return 8;
                            }
                            if (i2 == 512) {
                                return 9;
                            }
                            a0.j.h(d.l(i2, "type needs to be >= FIRST and <= LAST, type="));
                            return 0;
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static boolean N(ah.e eVar) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            eVar.getClass();
            bool = (Boolean) ((x.j) eVar.B).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException e6) {
            if (z.a.f14847a.j(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                aj.g.o("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                aj.g.t("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e6);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            aj.g.y0("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean O(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static boolean P(int i2) {
        int type = Character.getType(i2);
        if (type != 23 && type != 20 && type != 22 && type != 30 && type != 29 && type != 24 && type != 21) {
            return false;
        }
        return true;
    }

    public static final boolean Q(a0 a0Var, float f8) {
        float q10;
        boolean z10;
        a0Var.m().getClass();
        if (a0Var.r()) {
            q10 = -f8;
        } else {
            q10 = q(a0Var);
        }
        if (q10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return false;
        }
        return true;
    }

    public static float R(EdgeEffect edgeEffect, float f8, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f6.c.c(edgeEffect, f8, f10);
        }
        b.a(edgeEffect, f8, f10);
        return f8;
    }

    public static final e.k S(i.a aVar, mc.l lVar, n2.m mVar, int i2) {
        i.a aVar2;
        s.A(aVar, mVar);
        w0 A = s.A(lVar, mVar);
        Object[] objArr = new Object[0];
        r rVar = (r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (L == eVar) {
            L = new a3.g(13);
            rVar.h0(L);
        }
        String str = (String) y2.k.c(objArr, (mc.a) L, rVar, 48);
        i iVar = (i) rVar.j(e.i.f4143a);
        if (iVar == null) {
            rVar.X(1213380307);
            Context context = (Context) rVar.j(r0.f1937b);
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof i) {
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                    break;
                }
            }
            iVar = (i) context;
        } else {
            rVar.X(1213379439);
        }
        rVar.p(false);
        if (iVar != null) {
            h.h m = iVar.m();
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new Object();
                rVar.h0(L2);
            }
            e.a aVar3 = (e.a) L2;
            Object L3 = rVar.L();
            if (L3 == eVar) {
                L3 = new e.k(aVar3);
                rVar.h0(L3);
            }
            e.k kVar = (e.k) L3;
            boolean h2 = rVar.h(aVar3) | rVar.h(m) | rVar.f(str) | rVar.h(aVar) | rVar.f(A);
            Object L4 = rVar.L();
            if (!h2 && L4 != eVar) {
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                L4 = new d2.a(aVar3, m, str, aVar2, A, 2);
                rVar.h0(L4);
            }
            mc.l lVar2 = (mc.l) L4;
            boolean f8 = rVar.f(m) | rVar.f(str) | rVar.f(aVar2);
            Object L5 = rVar.L();
            if (f8 || L5 == eVar) {
                L5 = new n2.f0(lVar2);
                rVar.h0(L5);
            }
            n2.f0 f0Var = (n2.f0) L5;
            return kVar;
        }
        a0.j.p("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        return null;
    }

    public static int T(Context context, int i2, int i10) {
        TypedValue I = k0.d.I(context, i2);
        if (I != null && I.type == 16) {
            return I.data;
        }
        return i10;
    }

    public static TimeInterpolator U(Context context, int i2, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!O(valueOf, "cubic-bezier") && !O(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (O(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return new PathInterpolator(B(split, 0), B(split, 1), B(split, 2), B(split, 3));
                }
                a0.j.d(split.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
                return null;
            } else if (O(valueOf, "path")) {
                String substring = valueOf.substring(5, valueOf.length() - 1);
                Path path = new Path();
                try {
                    q5.d.b(p7.a.m(substring), path);
                    return new PathInterpolator(path);
                } catch (RuntimeException e6) {
                    m9.o.m("Error in parsing ".concat(substring), e6);
                    return null;
                }
            } else {
                a0.j.h("Invalid motion easing type: ".concat(valueOf));
                return null;
            }
        }
        a0.j.h("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        return null;
    }

    public static final Object V(p pVar) {
        Thread.interrupted();
        return x.z(cc.h.A, new u0(pVar, (cc.c) null));
    }

    public static final Object W(q qVar, boolean z10, q qVar2, p pVar) {
        zc.o oVar;
        Object W;
        try {
            if (!(pVar instanceof ec.a)) {
                oVar = pc.a.Q(pVar, qVar2, qVar);
            } else {
                w.b(2, pVar);
                oVar = pVar.j(qVar2, qVar);
            }
        } catch (c0 e6) {
            Throwable th2 = e6.A;
            qVar.V(new zc.o(th2, false));
            throw th2;
        } catch (Throwable th3) {
            oVar = new zc.o(th3, false);
        }
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        if (oVar == aVar || (W = qVar.W(oVar)) == x.f15035e) {
            return aVar;
        }
        qVar.k0();
        if (W instanceof zc.o) {
            if (!z10) {
                Throwable th4 = ((zc.o) W).f15025a;
                if ((th4 instanceof p1) && ((p1) th4).A == qVar) {
                    if (oVar instanceof zc.o) {
                        throw ((zc.o) oVar).f15025a;
                    }
                    return oVar;
                }
            }
            throw ((zc.o) W).f15025a;
        }
        return x.D(W);
    }

    public static final c3.f a(String str) {
        return new c3.f(p7.j.E(str));
    }

    public static final void b(b3.p pVar, o0 o0Var, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        o0Var.getClass();
        r rVar = (r) mVar;
        rVar.Z(-1151379056);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(o0Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            boolean f8 = rVar.f(o0Var);
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (f8 || L == eVar) {
                L = s.w(oh.d.SHOW_ICON);
                rVar.h0(L);
            }
            w0 w0Var = (w0) L;
            boolean f10 = rVar.f(w0Var);
            Object L2 = rVar.L();
            if (f10 || L2 == eVar) {
                L2 = new oh.a(w0Var, null, 1);
                rVar.h0(L2);
            }
            s.g(o0Var, (p) L2, rVar);
            float f11 = 8;
            n0.b(r1.m(f3.g.h(l1.c.t(pVar, 16), f11, t1.e.b(f11), z.d(4294956800L), 12), 0.0f, 400, 1), t1.e.b(f11), z.d(4294956800L), v2.h.c(1353536755, new ai.r0(23, o0Var, w0Var), rVar), rVar, 1572864, 56);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r0(pVar, o0Var, i2, 24);
        }
    }

    public static final void c(mh.d dVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(1390797292);
        if (rVar.h(dVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            l0.f.a(l1.c.t(b3.m.f1770a, 8), dVar.f9679c, dVar.f9683g, v2.h.c(-2116597551, new nh.e(dVar, 0), rVar), rVar, 3078);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 19, dVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0482 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(a7.d0 r43, a7.z r44, b3.p r45, b3.d r46, final mc.l r47, final mc.l r48, final mc.l r49, mc.l r50, n2.m r51, int r52) {
        /*
            Method dump skipped, instructions count: 2770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.d(a7.d0, a7.z, b3.p, b3.d, mc.l, mc.l, mc.l, mc.l, n2.m, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(final a7.d0 r17, final java.lang.Object r18, b3.p r19, b3.d r20, java.util.Map r21, final mc.l r22, mc.l r23, final mc.l r24, final mc.l r25, final mc.l r26, n2.m r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.e(a7.d0, java.lang.Object, b3.p, b3.d, java.util.Map, mc.l, mc.l, mc.l, mc.l, mc.l, n2.m, int, int):void");
    }

    public static final long f(float f8, float f10) {
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
    }

    public static final v g(d0.c cVar, f2.w wVar) {
        boolean z10;
        f2.j j2 = cVar.j();
        f2.s sVar = (f2.s) cVar.R;
        if (j2 == f2.j.CROSSED) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new v(i(sVar, z10, true, wVar), i(sVar, z10, false, wVar), z10);
    }

    public static final u h(final d0.c cVar, final f2.s sVar, u uVar) {
        final int i2;
        final int i10;
        f2.j jVar;
        boolean z10;
        int i11 = sVar.f4790c;
        int i12 = sVar.f4789b;
        boolean z11 = cVar.B;
        if (z11) {
            i2 = i12;
        } else {
            i2 = i11;
        }
        l4.o0 o0Var = (l4.o0) sVar.f4792e;
        int i13 = sVar.f4791d;
        yb.h hVar = yb.h.NONE;
        final yb.f s10 = p7.a.s(hVar, new f2.x(i2, sVar));
        if (z11) {
            i10 = i11;
        } else {
            i10 = i12;
        }
        yb.f s11 = p7.a.s(hVar, new mc.a() { // from class: f2.y
            /* JADX WARN: Type inference failed for: r3v0, types: [yb.f, java.lang.Object] */
            @Override // mc.a
            public final Object b() {
                boolean z12;
                s sVar2 = s.this;
                l4.o0 o0Var2 = (l4.o0) sVar2.f4792e;
                int intValue = ((Number) s10.getValue()).intValue();
                d0.c cVar2 = cVar;
                boolean z13 = cVar2.B;
                if (cVar2.j() == j.CROSSED) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                int i14 = i2;
                long i15 = o0Var2.i(i14);
                l4.q qVar = o0Var2.f8866b;
                int i16 = l4.q0.f8884c;
                int i17 = (int) (i15 >> 32);
                int d4 = qVar.d(i17);
                int i18 = qVar.f8880f;
                if (d4 != intValue) {
                    if (intValue >= i18) {
                        i17 = o0Var2.f(i18 - 1);
                    } else {
                        i17 = o0Var2.f(intValue);
                    }
                }
                int i19 = (int) (i15 & 4294967295L);
                if (qVar.d(i19) != intValue) {
                    if (intValue >= i18) {
                        i19 = qVar.c(i18 - 1, false);
                    } else {
                        i19 = qVar.c(intValue, false);
                    }
                }
                int i20 = i10;
                if (i17 == i20) {
                    return sVar2.b(i19);
                }
                if (i19 == i20) {
                    return sVar2.b(i17);
                }
                if (!(z13 ^ z12) ? i14 >= i17 : i14 > i19) {
                    i17 = i19;
                }
                return sVar2.b(i17);
            }
        });
        if (1 != uVar.f4795c) {
            return (u) s11.getValue();
        }
        if (i2 == i13) {
            return uVar;
        }
        if (((Number) s10.getValue()).intValue() != o0Var.f8866b.d(i13)) {
            return (u) s11.getValue();
        }
        int i14 = uVar.f4794b;
        long i15 = o0Var.i(i14);
        if (i13 != -1) {
            if (i2 != i13) {
                if (i12 < i11) {
                    jVar = f2.j.NOT_CROSSED;
                } else if (i12 > i11) {
                    jVar = f2.j.CROSSED;
                } else {
                    jVar = f2.j.COLLAPSED;
                }
                if (jVar == f2.j.CROSSED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!(z10 ^ z11)) {
                }
            }
            return sVar.b(i2);
        }
        int i16 = q0.f8884c;
        if (i14 != ((int) (i15 >> 32)) && i14 != ((int) (4294967295L & i15))) {
            return sVar.b(i2);
        }
        return (u) s11.getValue();
    }

    public static final u i(f2.s sVar, boolean z10, boolean z11, f2.w wVar) {
        int i2;
        long b10;
        long j2;
        if (z11) {
            i2 = sVar.f4789b;
        } else {
            i2 = sVar.f4790c;
        }
        switch (wVar.f4805a) {
            case 0:
                String str = ((l4.o0) sVar.f4792e).f8865a.f8853a.B;
                b10 = i0.b(l0.s(i2, str), l0.r(i2, str));
                break;
            default:
                b10 = ((l4.o0) sVar.f4792e).i(i2);
                break;
        }
        if (z10 ^ z11) {
            int i10 = q0.f8884c;
            j2 = b10 >> 32;
        } else {
            int i11 = q0.f8884c;
            j2 = 4294967295L & b10;
        }
        return sVar.b((int) j2);
    }

    public static int k(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static final u l(u uVar, f2.s sVar, int i2) {
        return new u(((l4.o0) sVar.f4792e).a(i2), i2, uVar.f4795c);
    }

    public static final w0 m(j1.i iVar, n2.m mVar, int i2) {
        boolean z10;
        r rVar = (r) mVar;
        Object L = rVar.L();
        n2.e eVar = n2.l.f9953a;
        if (L == eVar) {
            L = s.w(Boolean.FALSE);
            rVar.h0(L);
        }
        w0 w0Var = (w0) L;
        if ((((i2 & 14) ^ 6) > 4 && rVar.f(iVar)) || (i2 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object L2 = rVar.L();
        if (z10 || L2 == eVar) {
            L2 = new di.b(iVar, w0Var, null, 16);
            rVar.h0(L2);
        }
        s.g(iVar, (p) L2, rVar);
        return w0Var;
    }

    public static d0.c n(int i2, int i10, int i11, int i12) {
        return new d0.c(ImageReader.newInstance(i2, i10, i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent p(android.content.Context r14, w.x0 r15) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.a.p(android.content.Context, w.x0):android.content.Intent");
    }

    public static final float q(a0 a0Var) {
        if (a0Var.m().f12177e == n1.Horizontal) {
            return Float.intBitsToFloat((int) (a0Var.q() >> 32));
        }
        return Float.intBitsToFloat((int) (a0Var.q() & 4294967295L));
    }

    public static final jd.a r(nd.b bVar, md.a aVar, String str) {
        bVar.getClass();
        jd.a f8 = bVar.f(aVar, str);
        if (f8 != null) {
            return f8;
        }
        a1.k(str, bVar.h());
        throw null;
    }

    public static final jd.a s(nd.b bVar, md.d dVar, Object obj) {
        bVar.getClass();
        obj.getClass();
        jd.a g10 = bVar.g(dVar, obj);
        if (g10 == null) {
            nc.e a10 = nc.u.a(obj.getClass());
            nc.e h2 = bVar.h();
            h2.getClass();
            String c4 = a10.c();
            if (c4 == null) {
                c4 = String.valueOf(a10);
            }
            a1.k(c4, h2);
            throw null;
        }
        return g10;
    }

    public static final f t() {
        f fVar = f0a;
        if (fVar != null) {
            return fVar;
        }
        o3.e eVar = new o3.e("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = h0.f10763a;
        p0 p0Var = new p0(i3.s.f6681b);
        o1 o1Var = new o1(2, false);
        o1Var.q(20.0f, 11.0f);
        o1Var.m(7.83f);
        o1Var.p(5.59f, -5.59f);
        o1Var.o(12.0f, 4.0f);
        o1Var.p(-8.0f, 8.0f);
        o1Var.p(8.0f, 8.0f);
        o1Var.p(1.41f, -1.41f);
        o1Var.o(7.83f, 13.0f);
        o1Var.m(20.0f);
        o1Var.w(-2.0f);
        o1Var.g();
        o3.e.a(eVar, o1Var.f7269a, p0Var);
        f b10 = eVar.b();
        f0a = b10;
        return b10;
    }

    public static final nc.e u(ld.e eVar) {
        eVar.getClass();
        if (eVar instanceof ld.b) {
            return ((ld.b) eVar).f9017b;
        }
        if (eVar instanceof j1) {
            return u(((j1) eVar).f10323a);
        }
        return null;
    }

    public static final long v(long j2) {
        return (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f) << 32);
    }

    public static final Rect w(TextPaint textPaint, CharSequence charSequence, int i2, int i10) {
        int i11 = i2;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i11 - 1, i10, MetricAffectingSpan.class) != i10) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i11 < i10) {
                    int nextSpanTransition = spanned.nextSpanTransition(i11, i10, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i11, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i11, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i11, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i11 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i11, i10, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i11, i10, rect3);
        return rect3;
    }

    public static byte x(short s10, int i2) {
        int i10 = ((byte) (((s10 & 65535) >> i2) & 31)) & 255;
        return (byte) (((i10 << 3) + (i10 >> 2)) & 255);
    }

    public static final String[] y(c3.o oVar) {
        oVar.getClass();
        return (String[]) ((c3.f) oVar).f2561b.toArray(new String[0]);
    }

    public static float z(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f6.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public void J(t7.a aVar, Iterable iterable) {
        aVar.getClass();
        if (iterable == null) {
            return;
        }
        t7.c T = aVar.T(o());
        try {
            for (Object obj : iterable) {
                if (obj != null) {
                    j(T, obj);
                    T.N();
                    T.reset();
                }
            }
            q8.r.q(T, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                q8.r.q(T, th2);
                throw th3;
            }
        }
    }

    public void K(t7.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return;
        }
        t7.c T = aVar.T(o());
        try {
            j(T, obj);
            T.N();
            q8.r.q(T, null);
        } finally {
        }
    }

    public long L(t7.a aVar, Object obj) {
        aVar.getClass();
        if (obj == null) {
            return -1L;
        }
        t7.c T = aVar.T(o());
        try {
            j(T, obj);
            T.N();
            q8.r.q(T, null);
            return p7.l.o(aVar);
        } finally {
        }
    }

    public List M(t7.a aVar, ArrayList arrayList) {
        aVar.getClass();
        ac.b g10 = t.g();
        t7.c T = aVar.T(o());
        try {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                if (obj != null) {
                    j(T, obj);
                    T.N();
                    T.reset();
                    g10.add(Long.valueOf(p7.l.o(aVar)));
                } else {
                    g10.add(-1L);
                }
            }
            q8.r.q(T, null);
            return t.d(g10);
        } finally {
        }
    }

    public abstract void j(t7.c cVar, Object obj);

    public abstract String o();
}
