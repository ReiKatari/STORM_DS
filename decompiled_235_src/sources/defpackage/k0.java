package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ k0(ds1 ds1Var, yc1 yc1Var) {
        this.A = 24;
        this.B = ds1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0393  */
    /* JADX WARN: Type inference failed for: r3v14, types: [dh5, java.lang.Object] */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        String valueOf;
        l3 l3Var;
        boolean z;
        q3 q3Var;
        boolean z2;
        boolean z3;
        k3 k3Var;
        boolean z4;
        float ceil;
        boolean z5;
        final oo1 ys6Var;
        int i;
        z40 z40Var;
        z13 z13Var;
        z13 z13Var2;
        boolean z6;
        zh d;
        wd c;
        zj0 zj0Var;
        bt btVar;
        float f;
        float f2;
        float intBitsToFloat;
        Bitmap bitmap;
        String str;
        String concat;
        StringBuilder sb;
        int i2;
        int i3 = this.A;
        boolean z7 = false;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.B;
        switch (i3) {
            case 0:
                if (obj == ((l0) obj2)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
            case 1:
                yv4 yv4Var = (yv4) obj2;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                String str2 = "(this Map)";
                if (key == yv4Var) {
                    valueOf = "(this Map)";
                } else {
                    valueOf = String.valueOf(key);
                }
                sb2.append(valueOf);
                sb2.append('=');
                Object value = entry.getValue();
                if (value != yv4Var) {
                    str2 = String.valueOf(value);
                }
                sb2.append(str2);
                return sb2.toString();
            case 2:
                ((gl1) obj).getClass();
                return new z3((bt) obj2, 0);
            case 3:
                za5 za5Var = (za5) obj;
                za5Var.getClass();
                return ((ta5) obj2).a + "-" + za5Var.b + "-" + za5Var.a;
            case 4:
                ((ts4) obj2).i(((Long) obj).longValue());
                return jg7Var;
            case 5:
                o95 o95Var = (o95) obj2;
                v3 v3Var = (v3) obj;
                v3Var.getClass();
                if (v3Var instanceof l3) {
                    l3Var = (l3) v3Var;
                } else {
                    l3Var = null;
                }
                if (l3Var != null && l3Var.a.a == o95Var.a.a) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 6:
                x95 x95Var = (x95) obj2;
                v3 v3Var2 = (v3) obj;
                v3Var2.getClass();
                if (v3Var2 instanceof q3) {
                    q3Var = (q3) v3Var2;
                } else {
                    q3Var = null;
                }
                if (q3Var != null) {
                    ls3 ls3Var = q3Var.b;
                    long j = q3Var.a;
                    ls3 ls3Var2 = x95Var.b;
                    if (ls3Var2 != null) {
                        z3 = ls3Var2.equals(ls3Var);
                    } else if (x95Var.a == j) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        z2 = true;
                        return Boolean.valueOf(z2);
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 7:
                m95 m95Var = (m95) obj2;
                v3 v3Var3 = (v3) obj;
                v3Var3.getClass();
                if (v3Var3 instanceof k3) {
                    k3Var = (k3) v3Var3;
                } else {
                    k3Var = null;
                }
                if (k3Var != null && k3Var.a.a == m95Var.a.a) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            case 8:
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                mm6 mm6Var = ((w6) obj2).a;
                er3Var.h0(mm6Var.size(), new r5(5, new k4(7), mm6Var), new j5(1, mm6Var), new zv0(802480018, true, new u5(1, mm6Var)));
                return jg7Var;
            case 9:
                ca caVar = (ca) obj2;
                caVar.m0.o((j07) obj, hf.K(caVar, kf.b));
                return jg7Var;
            case 10:
                ((gb6) obj).a(pa6.a, new oa6(fv2.Cursor, ((ok4) obj2).a(), na6.Middle, true));
                return jg7Var;
            case 11:
                Throwable th = (Throwable) obj;
                ((Process) obj2).destroy();
                return jg7Var;
            case 12:
                cv7 cv7Var = (cv7) obj2;
                ((gl1) obj).getClass();
                cv7Var.a.a(1);
                return new z3(cv7Var, 5);
            case 13:
                n00 n00Var = (n00) obj;
                int i4 = BackgroundsActivity.B0;
                n00Var.getClass();
                g10.Companion.getClass();
                String valueOf2 = String.valueOf(n00Var.a);
                String str3 = n00Var.b;
                String uri = n00Var.c.toString();
                uri.getClass();
                rc4.b((rc4) obj2, new t10(new g10(valueOf2, str3, uri)));
                return jg7Var;
            case 14:
                gl1 gl1Var = (gl1) obj;
                return new z3((h30) obj2, 6);
            case 15:
                a60 a60Var = (a60) obj2;
                oa0 oa0Var = (oa0) obj;
                if (oa0Var.a() * a60Var.n0 >= RecyclerView.B1 && xi6.d(oa0Var.A.e()) > RecyclerView.B1) {
                    if (om1.b(a60Var.n0, RecyclerView.B1)) {
                        ceil = 1.0f;
                    } else {
                        ceil = (float) Math.ceil(oa0Var.a() * a60Var.n0);
                    }
                    final float min = Math.min(ceil, (float) Math.ceil(xi6.d(oa0Var.A.e()) / 2.0f));
                    final float f3 = min / 2.0f;
                    final long floatToRawIntBits = (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L);
                    final long floatToRawIntBits2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oa0Var.A.e() >> 32)) - min) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (oa0Var.A.e() & 4294967295L)) - min) & 4294967295L);
                    float f4 = min * 2.0f;
                    if (f4 > xi6.d(oa0Var.A.e())) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    mp2 a = a60Var.p0.a(oa0Var.A.e(), oa0Var.A.getLayoutDirection(), oa0Var);
                    if (a instanceof po4) {
                        cn6 cn6Var = a60Var.o0;
                        po4 po4Var = (po4) a;
                        hj hjVar = po4Var.f;
                        if (z5) {
                            return oa0Var.b(new y(8, po4Var, cn6Var));
                        }
                        if (cn6Var != null) {
                            z40Var = new z40(5, kt0.c(1.0f, cn6Var.a));
                            i = 1;
                        } else {
                            i = 0;
                            z40Var = null;
                        }
                        of5 d2 = hjVar.d();
                        float f5 = d2.b;
                        float f6 = d2.a;
                        if (a60Var.m0 == null) {
                            a60Var.m0 = new w50();
                        }
                        w50 w50Var = a60Var.m0;
                        w50Var.getClass();
                        hj hjVar2 = w50Var.d;
                        if (hjVar2 == null) {
                            hjVar2 = lj.a();
                            w50Var.d = hjVar2;
                        }
                        hjVar2.g();
                        hj.b(hjVar2, d2);
                        hjVar2.f(hjVar2, hjVar, 0);
                        ?? obj3 = new Object();
                        hj hjVar3 = hjVar2;
                        long ceil2 = (((int) Math.ceil(d2.c - f6)) << 32) | (((int) Math.ceil(d2.d - f5)) & 4294967295L);
                        w50 w50Var2 = a60Var.m0;
                        w50Var2.getClass();
                        zh zhVar = w50Var2.a;
                        wd wdVar = w50Var2.b;
                        if (zhVar != null) {
                            z13Var = new z13(zhVar.a());
                        } else {
                            z13Var = null;
                        }
                        try {
                            if (z13Var == null || z13Var.a != 0) {
                                if (zhVar != null) {
                                    z13Var2 = new z13(zhVar.a());
                                } else {
                                    z13Var2 = null;
                                }
                                if (z13Var2 == null || i != z13Var2.a) {
                                    z6 = false;
                                    if (zhVar != null && wdVar != null) {
                                        intBitsToFloat = Float.intBitsToFloat((int) (oa0Var.A.e() >> 32));
                                        bitmap = zhVar.a;
                                        if (intBitsToFloat <= bitmap.getWidth() && Float.intBitsToFloat((int) (oa0Var.A.e() & 4294967295L)) <= bitmap.getHeight() && z6) {
                                            d = zhVar;
                                            c = wdVar;
                                            zj0Var = w50Var2.c;
                                            if (zj0Var == null) {
                                                zj0Var = new zj0();
                                                w50Var2.c = zj0Var;
                                            }
                                            btVar = zj0Var.B;
                                            yj0 yj0Var = zj0Var.A;
                                            long S = qo2.S(ceil2);
                                            kk3 layoutDirection = oa0Var.A.getLayoutDirection();
                                            qh1 qh1Var = yj0Var.a;
                                            zj0 zj0Var2 = zj0Var;
                                            kk3 kk3Var = yj0Var.b;
                                            xj0 xj0Var = yj0Var.c;
                                            long j2 = yj0Var.d;
                                            yj0Var.a = oa0Var;
                                            yj0Var.b = layoutDirection;
                                            yj0Var.c = c;
                                            yj0Var.d = S;
                                            c.h();
                                            no1.F(zj0Var2, kt0.b, 0L, S, RecyclerView.B1, null, 58);
                                            f = -f6;
                                            f2 = -f5;
                                            ((os0) btVar.B).g0(f, f2);
                                            no1.b0(zj0Var2, po4Var.f, cn6Var, RecyclerView.B1, new ys6(f4, RecyclerView.B1, 0, 0, null, 30), 52);
                                            float intBitsToFloat2 = (Float.intBitsToFloat((int) (zj0Var2.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var2.e() >> 32));
                                            float intBitsToFloat3 = (Float.intBitsToFloat((int) (zj0Var2.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var2.e() & 4294967295L));
                                            long t0 = zj0Var2.t0();
                                            zh zhVar2 = d;
                                            wd wdVar2 = c;
                                            long L = btVar.L();
                                            btVar.G().h();
                                            ((os0) btVar.B).f0(intBitsToFloat2, intBitsToFloat3, t0);
                                            no1.b0(zj0Var2, hjVar3, cn6Var, RecyclerView.B1, null, 28);
                                            btVar.G().p();
                                            btVar.Y(L);
                                            ((os0) btVar.B).g0(-f, -f2);
                                            wdVar2.p();
                                            yj0Var.a = qh1Var;
                                            yj0Var.b = kk3Var;
                                            yj0Var.c = xj0Var;
                                            yj0Var.d = j2;
                                            zhVar2.a.prepareToDraw();
                                            obj3.A = zhVar2;
                                            return oa0Var.b(new z50(d2, obj3, ceil2, z40Var, 0));
                                        }
                                    }
                                    d = uj2.d((int) (ceil2 >> 32), (int) (ceil2 & 4294967295L), i, 24);
                                    w50Var2.a = d;
                                    c = ge7.c(d);
                                    w50Var2.b = c;
                                    zj0Var = w50Var2.c;
                                    if (zj0Var == null) {
                                    }
                                    btVar = zj0Var.B;
                                    yj0 yj0Var2 = zj0Var.A;
                                    long S2 = qo2.S(ceil2);
                                    kk3 layoutDirection2 = oa0Var.A.getLayoutDirection();
                                    qh1 qh1Var2 = yj0Var2.a;
                                    zj0 zj0Var22 = zj0Var;
                                    kk3 kk3Var2 = yj0Var2.b;
                                    xj0 xj0Var2 = yj0Var2.c;
                                    long j22 = yj0Var2.d;
                                    yj0Var2.a = oa0Var;
                                    yj0Var2.b = layoutDirection2;
                                    yj0Var2.c = c;
                                    yj0Var2.d = S2;
                                    c.h();
                                    no1.F(zj0Var22, kt0.b, 0L, S2, RecyclerView.B1, null, 58);
                                    f = -f6;
                                    f2 = -f5;
                                    ((os0) btVar.B).g0(f, f2);
                                    no1.b0(zj0Var22, po4Var.f, cn6Var, RecyclerView.B1, new ys6(f4, RecyclerView.B1, 0, 0, null, 30), 52);
                                    float intBitsToFloat22 = (Float.intBitsToFloat((int) (zj0Var22.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var22.e() >> 32));
                                    float intBitsToFloat32 = (Float.intBitsToFloat((int) (zj0Var22.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var22.e() & 4294967295L));
                                    long t02 = zj0Var22.t0();
                                    zh zhVar22 = d;
                                    wd wdVar22 = c;
                                    long L2 = btVar.L();
                                    btVar.G().h();
                                    ((os0) btVar.B).f0(intBitsToFloat22, intBitsToFloat32, t02);
                                    no1.b0(zj0Var22, hjVar3, cn6Var, RecyclerView.B1, null, 28);
                                    btVar.G().p();
                                    btVar.Y(L2);
                                    ((os0) btVar.B).g0(-f, -f2);
                                    wdVar22.p();
                                    yj0Var2.a = qh1Var2;
                                    yj0Var2.b = kk3Var2;
                                    yj0Var2.c = xj0Var2;
                                    yj0Var2.d = j22;
                                    zhVar22.a.prepareToDraw();
                                    obj3.A = zhVar22;
                                    return oa0Var.b(new z50(d2, obj3, ceil2, z40Var, 0));
                                }
                            }
                            if (zhVar != null) {
                                intBitsToFloat = Float.intBitsToFloat((int) (oa0Var.A.e() >> 32));
                                bitmap = zhVar.a;
                                if (intBitsToFloat <= bitmap.getWidth()) {
                                    d = zhVar;
                                    c = wdVar;
                                    zj0Var = w50Var2.c;
                                    if (zj0Var == null) {
                                    }
                                    btVar = zj0Var.B;
                                    yj0 yj0Var22 = zj0Var.A;
                                    long S22 = qo2.S(ceil2);
                                    kk3 layoutDirection22 = oa0Var.A.getLayoutDirection();
                                    qh1 qh1Var22 = yj0Var22.a;
                                    zj0 zj0Var222 = zj0Var;
                                    kk3 kk3Var22 = yj0Var22.b;
                                    xj0 xj0Var22 = yj0Var22.c;
                                    long j222 = yj0Var22.d;
                                    yj0Var22.a = oa0Var;
                                    yj0Var22.b = layoutDirection22;
                                    yj0Var22.c = c;
                                    yj0Var22.d = S22;
                                    c.h();
                                    no1.F(zj0Var222, kt0.b, 0L, S22, RecyclerView.B1, null, 58);
                                    f = -f6;
                                    f2 = -f5;
                                    ((os0) btVar.B).g0(f, f2);
                                    no1.b0(zj0Var222, po4Var.f, cn6Var, RecyclerView.B1, new ys6(f4, RecyclerView.B1, 0, 0, null, 30), 52);
                                    float intBitsToFloat222 = (Float.intBitsToFloat((int) (zj0Var222.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var222.e() >> 32));
                                    float intBitsToFloat322 = (Float.intBitsToFloat((int) (zj0Var222.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var222.e() & 4294967295L));
                                    long t022 = zj0Var222.t0();
                                    zh zhVar222 = d;
                                    wd wdVar222 = c;
                                    long L22 = btVar.L();
                                    btVar.G().h();
                                    ((os0) btVar.B).f0(intBitsToFloat222, intBitsToFloat322, t022);
                                    no1.b0(zj0Var222, hjVar3, cn6Var, RecyclerView.B1, null, 28);
                                    btVar.G().p();
                                    btVar.Y(L22);
                                    ((os0) btVar.B).g0(-f, -f2);
                                    wdVar222.p();
                                    yj0Var22.a = qh1Var22;
                                    yj0Var22.b = kk3Var22;
                                    yj0Var22.c = xj0Var22;
                                    yj0Var22.d = j222;
                                    zhVar222.a.prepareToDraw();
                                    obj3.A = zhVar222;
                                    return oa0Var.b(new z50(d2, obj3, ceil2, z40Var, 0));
                                }
                            }
                            no1.b0(zj0Var222, po4Var.f, cn6Var, RecyclerView.B1, new ys6(f4, RecyclerView.B1, 0, 0, null, 30), 52);
                            float intBitsToFloat2222 = (Float.intBitsToFloat((int) (zj0Var222.e() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var222.e() >> 32));
                            float intBitsToFloat3222 = (Float.intBitsToFloat((int) (zj0Var222.e() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (zj0Var222.e() & 4294967295L));
                            long t0222 = zj0Var222.t0();
                            zh zhVar2222 = d;
                            wd wdVar2222 = c;
                            long L222 = btVar.L();
                            btVar.G().h();
                            ((os0) btVar.B).f0(intBitsToFloat2222, intBitsToFloat3222, t0222);
                            no1.b0(zj0Var222, hjVar3, cn6Var, RecyclerView.B1, null, 28);
                            btVar.G().p();
                            btVar.Y(L222);
                            ((os0) btVar.B).g0(-f, -f2);
                            wdVar2222.p();
                            yj0Var22.a = qh1Var22;
                            yj0Var22.b = kk3Var22;
                            yj0Var22.c = xj0Var22;
                            yj0Var22.d = j222;
                            zhVar2222.a.prepareToDraw();
                            obj3.A = zhVar2222;
                            return oa0Var.b(new z50(d2, obj3, ceil2, z40Var, 0));
                        } catch (Throwable th2) {
                            ((os0) btVar.B).g0(-f, -f2);
                            throw th2;
                        }
                        z6 = true;
                        d = uj2.d((int) (ceil2 >> 32), (int) (ceil2 & 4294967295L), i, 24);
                        w50Var2.a = d;
                        c = ge7.c(d);
                        w50Var2.b = c;
                        zj0Var = w50Var2.c;
                        if (zj0Var == null) {
                        }
                        btVar = zj0Var.B;
                        yj0 yj0Var222 = zj0Var.A;
                        long S222 = qo2.S(ceil2);
                        kk3 layoutDirection222 = oa0Var.A.getLayoutDirection();
                        qh1 qh1Var222 = yj0Var222.a;
                        zj0 zj0Var2222 = zj0Var;
                        kk3 kk3Var222 = yj0Var222.b;
                        xj0 xj0Var222 = yj0Var222.c;
                        long j2222 = yj0Var222.d;
                        yj0Var222.a = oa0Var;
                        yj0Var222.b = layoutDirection222;
                        yj0Var222.c = c;
                        yj0Var222.d = S222;
                        c.h();
                        no1.F(zj0Var2222, kt0.b, 0L, S222, RecyclerView.B1, null, 58);
                        f = -f6;
                        f2 = -f5;
                        ((os0) btVar.B).g0(f, f2);
                    } else if (a instanceof ro4) {
                        final cn6 cn6Var2 = a60Var.o0;
                        u16 u16Var = ((ro4) a).f;
                        if (mp2.P(u16Var)) {
                            final long j3 = u16Var.e;
                            final ys6 ys6Var2 = new ys6(min, RecyclerView.B1, 0, 0, null, 30);
                            final boolean z8 = z5;
                            return oa0Var.b(new qn2() { // from class: y50
                                @Override // defpackage.qn2
                                public final Object g(Object obj4) {
                                    long j4;
                                    um3 um3Var = (um3) obj4;
                                    um3Var.b();
                                    zj0 zj0Var3 = um3Var.A;
                                    boolean z9 = z8;
                                    f80 f80Var = cn6Var2;
                                    long j5 = j3;
                                    if (z9) {
                                        no1.E0(um3Var, f80Var, 0L, 0L, j5, null, 246);
                                    } else {
                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (j5 >> 32));
                                        float f7 = f3;
                                        if (intBitsToFloat4 < f7) {
                                            float intBitsToFloat5 = Float.intBitsToFloat((int) (zj0Var3.e() >> 32));
                                            float f8 = min;
                                            float f9 = intBitsToFloat5 - f8;
                                            float intBitsToFloat6 = Float.intBitsToFloat((int) (zj0Var3.e() & 4294967295L)) - f8;
                                            bt btVar2 = zj0Var3.B;
                                            long L3 = btVar2.L();
                                            btVar2.G().h();
                                            try {
                                                ((os0) btVar2.B).Q(f8, f8, f9, intBitsToFloat6, 0);
                                                j4 = L3;
                                                try {
                                                    no1.E0(um3Var, f80Var, 0L, 0L, j5, null, 246);
                                                    xg6.v(btVar2, j4);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    xg6.v(btVar2, j4);
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                                j4 = L3;
                                            }
                                        } else {
                                            no1.E0(um3Var, f80Var, floatToRawIntBits, floatToRawIntBits2, ak7.F0(f7, j5), ys6Var2, 208);
                                        }
                                    }
                                    return jg7.a;
                                }
                            });
                        }
                        boolean z9 = z5;
                        if (a60Var.m0 == null) {
                            a60Var.m0 = new w50();
                        }
                        w50 w50Var3 = a60Var.m0;
                        w50Var3.getClass();
                        hj hjVar4 = w50Var3.d;
                        if (hjVar4 == null) {
                            hjVar4 = lj.a();
                            w50Var3.d = hjVar4;
                        }
                        hjVar4.g();
                        hj.c(hjVar4, u16Var);
                        if (!z9) {
                            hj a2 = lj.a();
                            hj.c(a2, new u16(min, min, (u16Var.c - u16Var.a) - min, (u16Var.d - u16Var.b) - min, ak7.F0(min, u16Var.e), ak7.F0(min, u16Var.f), ak7.F0(min, u16Var.g), ak7.F0(min, u16Var.h)));
                            hjVar4.f(hjVar4, a2, 0);
                        }
                        return oa0Var.b(new y(7, hjVar4, cn6Var2));
                    } else {
                        boolean z10 = z5;
                        if (a instanceof qo4) {
                            final cn6 cn6Var3 = a60Var.o0;
                            if (z10) {
                                floatToRawIntBits = 0;
                            }
                            final long j4 = floatToRawIntBits;
                            if (z10) {
                                floatToRawIntBits2 = oa0Var.A.e();
                            }
                            final long j5 = floatToRawIntBits2;
                            if (z10) {
                                ys6Var = kc2.a;
                            } else {
                                ys6Var = new ys6(min, RecyclerView.B1, 0, 0, null, 30);
                            }
                            return oa0Var.b(new qn2() { // from class: x50
                                @Override // defpackage.qn2
                                public final Object g(Object obj4) {
                                    um3 um3Var = (um3) obj4;
                                    um3Var.b();
                                    no1.D0(um3Var, cn6Var3, j4, j5, RecyclerView.B1, ys6Var, 104);
                                    return jg7.a;
                                }
                            });
                        }
                        i.d();
                        return null;
                    }
                } else {
                    return oa0Var.b(new k4(20));
                }
                break;
            case 16:
                if (((fh0) obj).a == ((ci0) obj2)) {
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 17:
                qb0 qb0Var = (qb0) obj2;
                Throwable th3 = (Throwable) obj;
                if (th3 != null) {
                    if (th3 instanceof CancellationException) {
                        qb0Var.b();
                    } else {
                        qb0Var.c(th3);
                    }
                } else {
                    qb0Var.a(null);
                }
                return jg7Var;
            case 18:
                la1 la1Var = (la1) obj2;
                Uri uri2 = (Uri) obj;
                if (uri2 != null) {
                    la1Var.e(uri2);
                }
                return jg7Var;
            case 19:
                ((IOException) obj).getClass();
                TimeZone timeZone = az7.a;
                ((kk1) obj2).g0 = true;
                return jg7Var;
            case 20:
                IOException iOException = (IOException) obj;
                ((lk1) obj2).g0 = true;
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                vy4 vy4Var = (vy4) obj;
                ((dz3) obj2).c();
                return jg7Var;
            case 22:
                vy4 vy4Var2 = (vy4) obj;
                ((dr5) obj2).o(vy4Var2, Float.valueOf(Float.intBitsToFloat((int) (ej2.R(vy4Var2, false) & 4294967295L))));
                vy4Var2.a();
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((Float) obj).getClass();
                qh1 a3 = ((ep1) obj2).a();
                sc7 sc7Var = dp1.a;
                return Float.valueOf(a3.e0(56.0f));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ds1 ds1Var = (ds1) obj;
                if (((ds1) obj2) == ds1Var) {
                    str = " > ";
                } else {
                    str = "   ";
                }
                if (ds1Var instanceof pu0) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    pu0 pu0Var = (pu0) ds1Var;
                    sb.append(pu0Var.a.B.length());
                    sb.append(", newCursorPosition=");
                    i2 = pu0Var.b;
                } else if (ds1Var instanceof cd6) {
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    cd6 cd6Var = (cd6) ds1Var;
                    sb.append(cd6Var.a.B.length());
                    sb.append(", newCursorPosition=");
                    i2 = cd6Var.b;
                } else {
                    if (ds1Var instanceof bd6) {
                        concat = ((bd6) ds1Var).toString();
                    } else if (ds1Var instanceof hh1) {
                        concat = ((hh1) ds1Var).toString();
                    } else if (ds1Var instanceof ih1) {
                        concat = ((ih1) ds1Var).toString();
                    } else if (ds1Var instanceof dd6) {
                        concat = ((dd6) ds1Var).toString();
                    } else if (ds1Var instanceof qc2) {
                        concat = "FinishComposingTextCommand()";
                    } else if (ds1Var instanceof gh1) {
                        concat = "DeleteAllCommand()";
                    } else {
                        String c2 = gh5.a(ds1Var.getClass()).c();
                        if (c2 == null) {
                            c2 = "{anonymous EditCommand}";
                        }
                        concat = "Unknown EditCommand: ".concat(c2);
                    }
                    return str.concat(concat);
                }
                concat = xg6.q(sb, i2, ')');
                return str.concat(concat);
            case 25:
                int intValue = ((Integer) obj).intValue();
                int i5 = EmulatorActivity.Z1;
                ((on2) ((vr4) ((nv1) ((ov1) obj2)).b.get(intValue)).B).c();
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                jt5 jt5Var = (jt5) obj;
                jt5Var.getClass();
                return jt5.a(jt5Var, null, null, (UUID) obj2, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262139);
            case 27:
                jt5 jt5Var2 = (jt5) obj;
                jt5Var2.getClass();
                return jt5.a(jt5Var2, null, null, null, null, null, false, null, null, null, null, null, (VideoFiltering) obj2, null, null, null, null, null, null, 260095);
            case 28:
                jt5 jt5Var3 = (jt5) obj;
                jt5Var3.getClass();
                return jt5.a(jt5Var3, null, (a36) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262141);
            default:
                String str4 = (String) obj;
                str4.getClass();
                return ((sz1) obj2).b.getString(R.string.use_global_preference_with_value, str4);
        }
    }

    public /* synthetic */ k0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
