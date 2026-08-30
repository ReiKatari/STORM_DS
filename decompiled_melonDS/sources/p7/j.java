package p7;

import ai.o0;
import ai.v0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import androidx.lifecycle.a1;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.x;
import androidx.lifecycle.y0;
import androidx.preference.Preference;
import b4.q1;
import c1.q2;
import cd.o1;
import d1.h2;
import f1.m1;
import g2.r4;
import h1.n1;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import l1.h1;
import me.magnum.melonds.R;
import n2.n2;
import n2.p1;
import n2.r0;
import n2.w0;
import nc.u;
import q1.a0;
import w.i0;
import zb.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11418a = 0;

    public j() {
        new ConcurrentHashMap();
    }

    public static Set A(Set set, Iterable iterable) {
        Collection<?> p0;
        if (iterable instanceof Collection) {
            p0 = (Collection) iterable;
        } else {
            p0 = zb.l.p0(iterable);
        }
        if (p0.isEmpty()) {
            return zb.l.s0(set);
        }
        if (p0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object obj : set) {
                if (!((Set) p0).contains(obj)) {
                    linkedHashSet.add(obj);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(p0);
        return linkedHashSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static pi.g B(pi.q r26) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.B(pi.q):pi.g");
    }

    public static LinkedHashSet C(Set set, a7.i iVar) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(v.E(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(iVar);
        return linkedHashSet;
    }

    public static LinkedHashSet D(Set set, Iterable iterable) {
        Integer num;
        int size;
        set.getClass();
        iterable.getClass();
        if (iterable instanceof Collection) {
            num = Integer.valueOf(((Collection) iterable).size());
        } else {
            num = null;
        }
        if (num != null) {
            size = set.size() + num.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(v.E(size));
        linkedHashSet.addAll(set);
        zb.l.L(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set E(Object obj) {
        Set singleton = Collections.singleton(obj);
        singleton.getClass();
        return singleton;
    }

    public static int F(char c4, int i2, int i10, CharSequence charSequence) {
        while (i2 < i10) {
            if (charSequence.charAt(i2) != c4) {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static int G(CharSequence charSequence, int i2, int i10) {
        while (i2 < i10) {
            char charAt = charSequence.charAt(i2);
            if (charAt != '\t' && charAt != ' ') {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static sc.b H(sc.d dVar, int i2) {
        boolean z10;
        dVar.getClass();
        if (i2 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Integer valueOf = Integer.valueOf(i2);
        if (z10) {
            int i10 = dVar.A;
            int i11 = dVar.B;
            if (dVar.L <= 0) {
                i2 = -i2;
            }
            return new sc.b(i10, i11, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + valueOf + '.');
    }

    public static final void I(Object obj) {
        if (!(obj instanceof yb.k)) {
            return;
        }
        throw ((yb.k) obj).A;
    }

    public static byte[] J(p8.h hVar) {
        hVar.getClass();
        HashMap hashMap = hVar.f11494a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(hashMap.size());
            for (Map.Entry entry : hashMap.entrySet()) {
                K(dataOutputStream, (String) entry.getKey(), entry.getValue());
            }
            dataOutputStream.flush();
            if (dataOutputStream.size() <= 10240) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            }
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        } catch (IOException e6) {
            p8.v.e().d(p8.i.f11495a, "Error in Data#toByteArray: ", e6);
            return new byte[0];
        }
    }

    public static final void K(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        double d4;
        float f8;
        long j2;
        int i10;
        byte b10;
        boolean z10;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            nc.e a10 = u.a(objArr.getClass());
            if (a10.equals(u.a(Boolean[].class))) {
                i2 = 8;
            } else if (a10.equals(u.a(Byte[].class))) {
                i2 = 9;
            } else if (a10.equals(u.a(Integer[].class))) {
                i2 = 10;
            } else if (a10.equals(u.a(Long[].class))) {
                i2 = 11;
            } else if (a10.equals(u.a(Float[].class))) {
                i2 = 12;
            } else if (a10.equals(u.a(Double[].class))) {
                i2 = 13;
            } else if (a10.equals(u.a(String[].class))) {
                i2 = 14;
            } else {
                m9.o.q(u.a(objArr.getClass()).b(), "Unsupported value type ");
                return;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                String str2 = null;
                Boolean bool = null;
                Byte b11 = null;
                Integer num = null;
                Long l10 = null;
                Float f10 = null;
                Double d10 = null;
                if (i2 == 8) {
                    if (obj2 instanceof Boolean) {
                        bool = (Boolean) obj2;
                    }
                    if (bool != null) {
                        z10 = bool.booleanValue();
                    } else {
                        z10 = false;
                    }
                    dataOutputStream.writeBoolean(z10);
                } else if (i2 == 9) {
                    if (obj2 instanceof Byte) {
                        b11 = (Byte) obj2;
                    }
                    if (b11 != null) {
                        b10 = b11.byteValue();
                    } else {
                        b10 = 0;
                    }
                    dataOutputStream.writeByte(b10);
                } else if (i2 == 10) {
                    if (obj2 instanceof Integer) {
                        num = (Integer) obj2;
                    }
                    if (num != null) {
                        i10 = num.intValue();
                    } else {
                        i10 = 0;
                    }
                    dataOutputStream.writeInt(i10);
                } else if (i2 == 11) {
                    if (obj2 instanceof Long) {
                        l10 = (Long) obj2;
                    }
                    if (l10 != null) {
                        j2 = l10.longValue();
                    } else {
                        j2 = 0;
                    }
                    dataOutputStream.writeLong(j2);
                } else if (i2 == 12) {
                    if (obj2 instanceof Float) {
                        f10 = (Float) obj2;
                    }
                    if (f10 != null) {
                        f8 = f10.floatValue();
                    } else {
                        f8 = 0.0f;
                    }
                    dataOutputStream.writeFloat(f8);
                } else if (i2 == 13) {
                    if (obj2 instanceof Double) {
                        d10 = (Double) obj2;
                    }
                    if (d10 != null) {
                        d4 = d10.doubleValue();
                    } else {
                        d4 = 0.0d;
                    }
                    dataOutputStream.writeDouble(d4);
                } else if (i2 == 14) {
                    if (obj2 instanceof String) {
                        str2 = (String) obj2;
                    }
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        } else {
            m9.o.q(u.a(obj.getClass()).c(), "Unsupported value type ");
            return;
        }
        dataOutputStream.writeUTF(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [sc.b, sc.d] */
    public static sc.d L(int i2, int i10) {
        if (i10 <= Integer.MIN_VALUE) {
            sc.d dVar = sc.d.R;
            return sc.d.R;
        }
        return new sc.b(i2, i10 - 1, 1);
    }

    public static final y0 M(nc.e eVar, e1 e1Var, jb.e eVar2, w6.c cVar, n2.m mVar) {
        c1 j2;
        if (eVar2 != null) {
            d1 viewModelStore = e1Var.getViewModelStore();
            viewModelStore.getClass();
            cVar.getClass();
            j2 = new c1(viewModelStore, eVar2, cVar);
        } else if (e1Var instanceof androidx.lifecycle.k) {
            d1 viewModelStore2 = e1Var.getViewModelStore();
            a1 defaultViewModelProviderFactory = ((androidx.lifecycle.k) e1Var).getDefaultViewModelProviderFactory();
            viewModelStore2.getClass();
            defaultViewModelProviderFactory.getClass();
            cVar.getClass();
            j2 = new c1(viewModelStore2, defaultViewModelProviderFactory, cVar);
        } else {
            j2 = x8.e.j(e1Var, null, 6);
        }
        return j2.a(eVar);
    }

    public static final x4.e a(Context context) {
        float f8 = context.getResources().getConfiguration().fontScale;
        float f10 = context.getResources().getDisplayMetrics().density;
        y4.a a10 = y4.b.a(f8);
        if (a10 == null) {
            a10 = new x4.n(f8);
        }
        return new x4.e(f10, f8, a10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object, q1.v] */
    public static final void b(final a0 a0Var, final b3.p pVar, l1.d1 d1Var, q1.h hVar, float f8, b3.g gVar, i1.f fVar, boolean z10, u3.a aVar, i1.k kVar, f1.i iVar, final v2.c cVar, n2.m mVar, final int i2) {
        int i10;
        boolean z11;
        final l1.d1 d1Var2;
        final q1.h hVar2;
        final float f10;
        final b3.g gVar2;
        final i1.f fVar2;
        final boolean z12;
        final q1.a aVar2;
        final i1.k kVar2;
        final f1.i iVar2;
        boolean z13;
        i1.f fVar3;
        int i11;
        i1.k kVar3;
        b3.g gVar3;
        q1.h hVar3;
        f1.i iVar3;
        h1 h1Var;
        float f11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1860873769);
        if (rVar.f(a0Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i2 | i10 | 911961472;
        boolean z14 = true;
        boolean z15 = false;
        if ((306783379 & i12) == 306783378) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (rVar.O(i12 & 1, z11)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i11 = i12 & (-29360129);
                h1Var = d1Var;
                hVar3 = hVar;
                f11 = f8;
                gVar3 = gVar;
                fVar3 = fVar;
                z14 = z10;
                aVar2 = aVar;
                kVar3 = kVar;
                iVar3 = iVar;
            } else {
                float f12 = 0;
                h1 h1Var2 = new h1(f12, f12, f12, f12);
                float f13 = 0;
                b3.g gVar4 = b3.c.f1756e0;
                int i13 = (i12 & 14) | 196608;
                ?? obj = new Object();
                d1.t a10 = q2.a(rVar);
                h3.c cVar2 = h2.f3584a;
                d1.a1 q10 = d1.d.q(1, Float.valueOf(1));
                x4.c cVar3 = (x4.c) rVar.j(q1.f1919h);
                x4.m mVar2 = (x4.m) rVar.j(q1.f1924n);
                if ((((i13 & 14) ^ 6) > 4 && rVar.f(a0Var)) || (i13 & 6) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean f14 = z13 | rVar.f(a10) | rVar.f(q10) | rVar.f(obj) | rVar.f(cVar3) | rVar.d(mVar2.ordinal());
                Object L = rVar.L();
                Object obj2 = n2.l.f9953a;
                if (f14 || L == obj2) {
                    a0.g gVar5 = new a0.g(a0Var, new v0(9, a0Var, mVar2), (q1.v) obj);
                    float f15 = i1.j.f6612a;
                    Object fVar4 = new i1.f(gVar5, a10, q10);
                    rVar.h0(fVar4);
                    L = fVar4;
                }
                fVar3 = (i1.f) L;
                int i14 = i12 & (-29360129);
                n1 n1Var = n1.Horizontal;
                int i15 = (i12 & 14) | 432;
                if ((((i15 & 14) ^ 6) > 4 && rVar.f(a0Var)) || (i15 & 6) == 4) {
                    z15 = true;
                }
                Object L2 = rVar.L();
                if (z15 || L2 == obj2) {
                    L2 = new q1.a(a0Var, n1Var);
                    rVar.h0(L2);
                }
                f1.i a11 = m1.a(rVar);
                q1.h hVar4 = q1.h.f12144a;
                aVar2 = (q1.a) L2;
                i11 = i14;
                kVar3 = i1.k.f6613a;
                gVar3 = gVar4;
                hVar3 = hVar4;
                iVar3 = a11;
                h1Var = h1Var2;
                f11 = f13;
            }
            rVar.q();
            a.a(pVar, a0Var, h1Var, n1.Horizontal, fVar3, z14, iVar3, f11, hVar3, aVar2, gVar3, kVar3, cVar, rVar, ((i11 << 3) & 112) | 907570566, 1797510);
            float f16 = f11;
            fVar2 = fVar3;
            hVar2 = hVar3;
            z12 = z14;
            f10 = f16;
            i1.k kVar4 = kVar3;
            iVar2 = iVar3;
            gVar2 = gVar3;
            kVar2 = kVar4;
            d1Var2 = h1Var;
        } else {
            rVar.R();
            d1Var2 = d1Var;
            hVar2 = hVar;
            f10 = f8;
            gVar2 = gVar;
            fVar2 = fVar;
            z12 = z10;
            aVar2 = aVar;
            kVar2 = kVar;
            iVar2 = iVar;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new mc.p(pVar, d1Var2, hVar2, f10, gVar2, fVar2, z12, aVar2, kVar2, iVar2, cVar, i2) { // from class: q1.m
                public final /* synthetic */ b3.p B;
                public final /* synthetic */ l1.d1 L;
                public final /* synthetic */ h R;
                public final /* synthetic */ float X;
                public final /* synthetic */ b3.g Y;
                public final /* synthetic */ i1.f Z;

                /* renamed from: b0  reason: collision with root package name */
                public final /* synthetic */ boolean f12154b0;

                /* renamed from: c0  reason: collision with root package name */
                public final /* synthetic */ u3.a f12155c0;

                /* renamed from: d0  reason: collision with root package name */
                public final /* synthetic */ i1.k f12156d0;

                /* renamed from: e0  reason: collision with root package name */
                public final /* synthetic */ f1.i f12157e0;

                /* renamed from: f0  reason: collision with root package name */
                public final /* synthetic */ v2.c f12158f0;

                @Override // mc.p
                public final Object j(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    p7.j.b(a0.this, this.B, this.L, this.R, this.X, this.Y, this.Z, this.f12154b0, this.f12155c0, this.f12156d0, this.f12157e0, this.f12158f0, (n2.m) obj3, n2.s.F(49));
                    return yb.y.f14813a;
                }
            };
        }
    }

    public static final void c(UUID uuid, ve.a aVar, mc.p pVar, mc.a aVar2, mc.l lVar, mc.a aVar3, mc.a aVar4, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        aVar.getClass();
        pVar.getClass();
        aVar2.getClass();
        lVar.getClass();
        aVar3.getClass();
        aVar4.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-1099541442);
        if (rVar.h(uuid)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i17 = i2 | i10;
        if (rVar.d(aVar.ordinal())) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i18 = i17 | i11;
        if (rVar.h(pVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i19 = i18 | i12;
        if (rVar.h(aVar2)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i20 = i19 | i13;
        if (rVar.h(lVar)) {
            i14 = 16384;
        } else {
            i14 = 8192;
        }
        int i21 = i20 | i14;
        if (rVar.h(aVar3)) {
            i15 = 131072;
        } else {
            i15 = 65536;
        }
        int i22 = i21 | i15;
        if (rVar.h(aVar4)) {
            i16 = 1048576;
        } else {
            i16 = 524288;
        }
        int i23 = i22 | i16;
        if ((599187 & i23) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i23 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.w(null);
                rVar.h0(L);
            }
            w0 w0Var = (w0) L;
            w0 A = n2.s.A(pVar, rVar);
            boolean h2 = rVar.h(uuid) | rVar.f(A);
            Object L2 = rVar.L();
            if (h2 || L2 == eVar) {
                a9.d dVar = new a9.d(uuid, A, w0Var, (cc.c) null, 20);
                rVar.h0(dVar);
                L2 = dVar;
            }
            n2.s.g(uuid, (mc.p) L2, rVar);
            l.a(l0.f.I(rVar, R.string.layout_background_title), aVar3, v2.h.c(62324307, new r4(aVar2, l0.f.G(rVar, R.array.background_portrait_mode_options), aVar, lVar, w0Var, 2), rVar), v2.h.c(882420181, new mg.g(aVar3, aVar4, 2), rVar), false, rVar, ((i23 >> 12) & 112) | 3456, 16);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new o0(uuid, aVar, pVar, aVar2, lVar, aVar3, aVar4, i2);
        }
    }

    public static ac.h d(ac.h hVar) {
        ac.e eVar = hVar.A;
        eVar.b();
        if (eVar.f700c0 > 0) {
            return hVar;
        }
        return ac.h.B;
    }

    public static double e(double d4, double d10, double d11) {
        if (d10 <= d11) {
            if (d4 < d10) {
                return d10;
            }
            if (d4 > d11) {
                return d11;
            }
            return d4;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d11 + " is less than minimum " + d10 + '.');
    }

    public static float f(float f8, float f10, float f11) {
        if (f10 <= f11) {
            if (f8 < f10) {
                return f10;
            }
            if (f8 > f11) {
                return f11;
            }
            return f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int g(int i2, int i10, int i11) {
        if (i10 <= i11) {
            if (i2 < i10) {
                return i10;
            }
            if (i2 > i11) {
                return i11;
            }
            return i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long h(long j2, long j10, long j11) {
        if (j10 <= j11) {
            if (j2 < j10) {
                return j10;
            }
            if (j2 > j11) {
                return j11;
            }
            return j2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static Comparable i(Float f8, sc.a aVar) {
        aVar.getClass();
        float f10 = aVar.f12864b;
        float f11 = aVar.f12863a;
        if (f11 <= f10) {
            if (sc.a.a(f8, Float.valueOf(f11)) && !sc.a.a(Float.valueOf(f11), f8)) {
                return Float.valueOf(f11);
            }
            if (sc.a.a(Float.valueOf(f10), f8) && !sc.a.a(f8, Float.valueOf(f10))) {
                return Float.valueOf(f10);
            }
            return f8;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + aVar + '.');
    }

    public static final w0 j(cd.h hVar, Object obj, androidx.lifecycle.r rVar, androidx.lifecycle.q qVar, n2.m mVar, int i2) {
        boolean z10;
        cc.h hVar2 = cc.h.A;
        Object[] objArr = {hVar, rVar, qVar, hVar2};
        n2.r rVar2 = (n2.r) mVar;
        boolean h2 = rVar2.h(rVar);
        if ((((i2 & 7168) ^ 3072) > 2048 && rVar2.d(qVar.ordinal())) || (i2 & 3072) == 2048) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h10 = z10 | h2 | rVar2.h(hVar2) | rVar2.h(hVar);
        Object L = rVar2.L();
        n2.e eVar = n2.l.f9953a;
        if (h10 || L == eVar) {
            a9.d dVar = new a9.d(rVar, qVar, hVar, (cc.c) null, 22);
            rVar2.h0(dVar);
            L = dVar;
        }
        mc.p pVar = (mc.p) L;
        Object L2 = rVar2.L();
        if (L2 == eVar) {
            L2 = n2.s.w(obj);
            rVar2.h0(L2);
        }
        w0 w0Var = (w0) L2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h11 = rVar2.h(pVar);
        Object L3 = rVar2.L();
        if (h11 || L3 == eVar) {
            L3 = new n2(pVar, w0Var, null, 2);
            rVar2.h0(L3);
        }
        mc.p pVar2 = (mc.p) L3;
        cc.g gVar = rVar2.R;
        boolean z11 = false;
        for (Object obj2 : Arrays.copyOf(copyOf, copyOf.length)) {
            z11 |= rVar2.f(obj2);
        }
        Object L4 = rVar2.L();
        if (!z11 && L4 != eVar) {
            return w0Var;
        }
        rVar2.h0(new r0(gVar, pVar2));
        return w0Var;
    }

    public static final w0 k(cd.h hVar, kg.f fVar, n2.m mVar, int i2) {
        n2.r rVar = (n2.r) mVar;
        return j(hVar, fVar, ((x) rVar.j(u6.d.f13496a)).getLifecycle(), androidx.lifecycle.q.STARTED, mVar, i2 & 112);
    }

    public static final w0 l(o1 o1Var, n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        return j(o1Var, o1Var.getValue(), ((x) rVar.j(u6.d.f13496a)).getLifecycle(), androidx.lifecycle.q.STARTED, mVar, 0);
    }

    public static CameraDevice.StateCallback n(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return new CameraDevice.StateCallback();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new i0(arrayList);
    }

    public static final yb.k o(Throwable th2) {
        th2.getClass();
        return new yb.k(th2);
    }

    public static final void t(fj.k kVar, fj.x xVar) {
        try {
            IOException iOException = null;
            for (fj.x xVar2 : kVar.B(xVar)) {
                try {
                    if (kVar.F(xVar2).f4856c) {
                        t(kVar, xVar2);
                    }
                    kVar.v(xVar2);
                } catch (IOException e6) {
                    if (iOException == null) {
                        iOException = e6;
                    }
                }
            }
            if (iOException == null) {
                return;
            }
            throw iOException;
        } catch (FileNotFoundException unused) {
        }
    }

    public static v5.g u(v5.g[] gVarArr, int i2) {
        int i10;
        boolean z10;
        int i11;
        if ((i2 & 1) == 0) {
            i10 = 400;
        } else {
            i10 = 700;
        }
        if ((i2 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        v5.g gVar = null;
        int i12 = Preference.DEFAULT_ORDER;
        for (v5.g gVar2 : gVarArr) {
            int abs = Math.abs(gVar2.f13747c - i10) * 2;
            if (gVar2.f13748d == z10) {
                i11 = 0;
            } else {
                i11 = 1;
            }
            int i13 = abs + i11;
            if (gVar == null || i12 > i13) {
                gVar = gVar2;
                i12 = i13;
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038 A[Catch: ClassNotFoundException -> 0x0057, IOException -> 0x0059, TRY_LEAVE, TryCatch #6 {IOException -> 0x0059, ClassNotFoundException -> 0x0057, blocks: (B:9:0x0015, B:11:0x002c, B:15:0x0033, B:17:0x0038, B:24:0x0053, B:32:0x005d, B:33:0x0060, B:34:0x0061, B:48:0x00a3, B:52:0x00a9, B:53:0x00ac), top: B:68:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[Catch: ClassNotFoundException -> 0x0057, IOException -> 0x0059, TRY_LEAVE, TryCatch #6 {IOException -> 0x0059, ClassNotFoundException -> 0x0057, blocks: (B:9:0x0015, B:11:0x002c, B:15:0x0033, B:17:0x0038, B:24:0x0053, B:32:0x005d, B:33:0x0060, B:34:0x0061, B:48:0x00a3, B:52:0x00a9, B:53:0x00ac), top: B:68:0x0015 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p8.h v(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            r7.getClass()
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto Lc6
            int r1 = r7.length
            if (r1 != 0) goto L10
            p8.h r7 = p8.h.f11493b
            return r7
        L10:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r2.<init>(r7)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r7 = 2
            byte[] r7 = new byte[r7]     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r2.read(r7)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r3 = -21267(0xffffffffffffaced, float:NaN)
            byte r3 = (byte) r3     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r4 = 16777132(0xffffac, float:2.350977E-38)
            byte r4 = (byte) r4     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r5 = 0
            r6 = r7[r5]     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            if (r6 != r4) goto L32
            r4 = 1
            r7 = r7[r4]     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            if (r7 != r3) goto L32
            goto L33
        L32:
            r4 = r5
        L33:
            r2.reset()     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            if (r4 == 0) goto L61
            java.io.ObjectInputStream r7 = new java.io.ObjectInputStream     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r7.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            int r2 = r7.readInt()     // Catch: java.lang.Throwable -> L51
        L41:
            if (r5 >= r2) goto L53
            java.lang.String r3 = r7.readUTF()     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r7.readObject()     // Catch: java.lang.Throwable -> L51
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L51
            int r5 = r5 + 1
            goto L41
        L51:
            r2 = move-exception
            goto L5b
        L53:
            r7.close()     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            goto Lc0
        L57:
            r7 = move-exception
            goto Lad
        L59:
            r7 = move-exception
            goto Lb7
        L5b:
            throw r2     // Catch: java.lang.Throwable -> L5c
        L5c:
            r3 = move-exception
            l0.f.f(r7, r2)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            throw r3     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
        L61:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            r7.<init>(r2)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            short r2 = r7.readShort()     // Catch: java.lang.Throwable -> La1
            r3 = -21521(0xffffffffffffabef, float:NaN)
            if (r2 != r3) goto L80
            short r2 = r7.readShort()     // Catch: java.lang.Throwable -> La1
            r3 = 1
            if (r2 != r3) goto L76
            goto L89
        L76:
            java.lang.String r3 = "Unsupported version number: "
            java.lang.String r2 = w.d.l(r2, r3)     // Catch: java.lang.Throwable -> La1
            m9.o.g(r2)     // Catch: java.lang.Throwable -> La1
            goto L89
        L80:
            java.lang.String r3 = "Magic number doesn't match: "
            java.lang.String r2 = w.d.l(r2, r3)     // Catch: java.lang.Throwable -> La1
            m9.o.g(r2)     // Catch: java.lang.Throwable -> La1
        L89:
            int r2 = r7.readInt()     // Catch: java.lang.Throwable -> La1
        L8d:
            if (r5 >= r2) goto La3
            byte r3 = r7.readByte()     // Catch: java.lang.Throwable -> La1
            java.io.Serializable r3 = w(r7, r3)     // Catch: java.lang.Throwable -> La1
            java.lang.String r4 = r7.readUTF()     // Catch: java.lang.Throwable -> La1
            r1.put(r4, r3)     // Catch: java.lang.Throwable -> La1
            int r5 = r5 + 1
            goto L8d
        La1:
            r2 = move-exception
            goto La7
        La3:
            r7.close()     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            goto Lc0
        La7:
            throw r2     // Catch: java.lang.Throwable -> La8
        La8:
            r3 = move-exception
            l0.f.f(r7, r2)     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
            throw r3     // Catch: java.lang.ClassNotFoundException -> L57 java.io.IOException -> L59
        Lad:
            java.lang.String r2 = p8.i.f11495a
            p8.v r3 = p8.v.e()
            r3.d(r2, r0, r7)
            goto Lc0
        Lb7:
            java.lang.String r2 = p8.i.f11495a
            p8.v r3 = p8.v.e()
            r3.d(r2, r0, r7)
        Lc0:
            p8.h r7 = new p8.h
            r7.<init>(r1)
            return r7
        Lc6:
            java.lang.String r7 = "Data cannot occupy more than 10240 bytes when serialized"
            a0.j.p(r7)
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.j.v(byte[]):p8.h");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Long[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Integer[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Boolean[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.String[], java.io.Serializable] */
    public static final Serializable w(DataInputStream dataInputStream, byte b10) {
        if (b10 == 0) {
            return null;
        }
        if (b10 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b10 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b10 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b10 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b10 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b10 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b10 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b10 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r02 = new Boolean[readInt];
            while (i2 < readInt) {
                r02[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r02;
        } else if (b10 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r03 = new Byte[readInt2];
            while (i2 < readInt2) {
                r03[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r03;
        } else if (b10 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r04 = new Integer[readInt3];
            while (i2 < readInt3) {
                r04[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r04;
        } else if (b10 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r05 = new Long[readInt4];
            while (i2 < readInt4) {
                r05[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r05;
        } else if (b10 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r06 = new Float[readInt5];
            while (i2 < readInt5) {
                r06[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r06;
        } else if (b10 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r07 = new Double[readInt6];
            while (i2 < readInt6) {
                r07[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r07;
        } else if (b10 == 14) {
            int readInt7 = dataInputStream.readInt();
            ?? r12 = new String[readInt7];
            while (i2 < readInt7) {
                String readUTF = dataInputStream.readUTF();
                if (nc.k.a(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                    readUTF = null;
                }
                r12[i2] = readUTF;
                i2++;
            }
            return r12;
        } else {
            a0.j.p(w.d.l(b10, "Unsupported type "));
            return null;
        }
    }

    public static String y(int i2) {
        ArrayList arrayList = new ArrayList();
        if ((i2 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i2 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        StringBuilder sb2 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb2.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb2.append((CharSequence) "|");
            }
        }
        return sb2.toString();
    }

    public static boolean z(int i2, CharSequence charSequence) {
        if (i2 < charSequence.length()) {
            char charAt = charSequence.charAt(i2);
            switch (charAt) {
                case '!':
                case '\"':
                case '#':
                case '$':
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public abstract boolean m(rd.k kVar);

    public abstract Typeface p(Context context, p5.e eVar, Resources resources, int i2);

    public abstract Typeface q(Context context, v5.g[] gVarArr, int i2);

    public Typeface r(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface s(Context context, Resources resources, int i2, String str, int i10) {
        File p10 = k.p(context);
        if (p10 == null) {
            return null;
        }
        try {
            if (!k.g(p10, resources, i2)) {
                return null;
            }
            return Typeface.createFromFile(p10.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            p10.delete();
        }
    }

    public abstract Object x(rd.k kVar);
}
