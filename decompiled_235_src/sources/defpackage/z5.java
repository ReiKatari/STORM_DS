package defpackage;

import android.content.DialogInterface;
import android.graphics.RectF;
import android.net.Uri;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class z5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ z5(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        if (r3 == null) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        boolean g;
        boolean z;
        char c;
        char c2;
        boolean z2;
        String str;
        char c3 = 7;
        qj0 qj0Var = null;
        boolean z3 = false;
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                lb4.a((l3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 1:
                ((Integer) obj2).getClass();
                n16.b((sz1) this.B, (px0) obj, ii2.a0(9));
                return jg7.a;
            case 2:
                of5 b0 = ej2.b0((RectF) obj);
                of5 b02 = ej2.b0((RectF) obj2);
                switch (((fa6) this.B).A) {
                    case 5:
                        g = b0.g(b02);
                        break;
                    default:
                        g = b02.a(b0.b());
                        break;
                }
                return Boolean.valueOf(g);
            case 3:
                j04 j04Var = (j04) this.B;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    x64 x64Var = x64.a;
                    a74 g2 = u24.g(dj6.i(x64Var, 38.0f), z16.a);
                    boolean h = xq2Var.h(j04Var);
                    Object P = xq2Var.P();
                    if (h || P == ox0.a) {
                        P = new x00(j04Var, 0);
                        xq2Var.l0(P);
                    }
                    a74 u = mb3.u(g2, false, null, (on2) P, 15);
                    e34 d = h70.d(d90.Z, false);
                    int hashCode = Long.hashCode(xq2Var.T);
                    xv4 l = xq2Var.l();
                    a74 E = l.E(xq2Var, u);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var.f0();
                    if (xq2Var.S) {
                        xq2Var.k(iy0Var);
                    } else {
                        xq2Var.o0();
                    }
                    yh2.K(xq2Var, ix0.f, d);
                    yh2.K(xq2Var, ix0.e, l);
                    yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var, ix0.h);
                    yh2.K(xq2Var, ix0.d, E);
                    i13.b(kj2.R(xq2Var, R.drawable.ic_add), yh2.O(xq2Var, R.string.action_backgrounds_new), dj6.i(x64Var, 24.0f), bl2.F(xq2Var).g, xq2Var, 392, 0);
                    xq2Var.p(true);
                } else {
                    xq2Var.V();
                }
                return jg7.a;
            case 4:
                ((Integer) obj2).getClass();
                jw2.c((m3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 5:
                jb1 jb1Var = (jb1) this.B;
                ((Integer) obj).getClass();
                if (obj2 instanceof ww0) {
                    ww0 ww0Var = (ww0) obj2;
                    ka4 ka4Var = (ka4) jb1Var.h;
                    if (ka4Var == null) {
                        ka4 ka4Var2 = c66.a;
                        ka4Var = new ka4();
                        jb1Var.h = ka4Var;
                    }
                    ka4Var.k(ww0Var);
                    ((ua4) jb1Var.f).b(ww0Var);
                }
                if (obj2 instanceof br2) {
                    jb1Var.e((br2) obj2);
                }
                if (obj2 instanceof cf5) {
                    ((cf5) obj2).c();
                }
                return jg7.a;
            case 6:
                ((Integer) obj2).getClass();
                hf.t((p27) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 7:
                ((Integer) obj2).getClass();
                xq2 xq2Var2 = (xq2) ((px0) obj);
                xq2Var2.b0(666084174);
                String str2 = ((s07) this.B).b;
                xq2Var2.p(false);
                return str2;
            case 8:
                ((Integer) obj2).getClass();
                ((oi1) this.B).a((px0) obj, ii2.a0(1));
                return jg7.a;
            case 9:
                ((Integer) obj2).getClass();
                n16.e((ij1) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 10:
                float floatValue = ((Float) obj2).floatValue();
                ((vy4) obj).a();
                ((ah5) this.B).A = floatValue;
                return jg7.a;
            case 11:
                ((Integer) obj2).getClass();
                ((mn2) this.B).a((px0) obj, ii2.a0(1));
                return jg7.a;
            case 12:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var2;
                if (!xq2Var3.S(intValue2 & 1, z3)) {
                    xq2Var3.V();
                    return jg7.a;
                }
                throw null;
            case 13:
                ((Integer) obj2).getClass();
                ((g53) this.B).a((px0) obj, ii2.a0(1));
                return jg7.a;
            case 14:
                ((Integer) obj2).getClass();
                hi2.d((p3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 15:
                ((Integer) obj2).getClass();
                ii2.j((o3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 16:
                ((Integer) obj2).getClass();
                oi2.b((q3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 17:
                ((Integer) obj2).getClass();
                kj2.a((r3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 18:
                vy4 vy4Var = (vy4) obj;
                ((g17) this.B).e(((jk4) obj2).a);
                return jg7.a;
            case 19:
                f94 f94Var = (f94) this.B;
                Set set = (Set) obj;
                vl6 vl6Var = (vl6) obj2;
                synchronized (f94Var.a) {
                    try {
                        ja4 ja4Var = f94Var.b;
                        bi2 bi2Var = new bi2(24, set, f94Var);
                        ge7.p(1, bi2Var);
                        Object[] objArr = ja4Var.b;
                        long[] jArr = ja4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((j & 255) < 128) {
                                            bi2Var.g(objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                    }
                                }
                                if (i != length) {
                                    i++;
                                }
                            }
                        }
                        ka4 ka4Var3 = f94Var.d;
                        Object[] objArr2 = ka4Var3.b;
                        long[] jArr2 = ka4Var3.a;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i4 = 0;
                            while (true) {
                                long j2 = jArr2[i4];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i5 = 8 - ((~(i4 - length2)) >>> 31);
                                    for (int i6 = 0; i6 < i5; i6++) {
                                        if ((j2 & 255) < 128) {
                                            ((ob6) objArr2[(i4 << 3) + i6]).c(jg7.a);
                                        }
                                        j2 >>= 8;
                                    }
                                    if (i5 != 8) {
                                    }
                                }
                                if (i4 != length2) {
                                    i4++;
                                }
                            }
                        }
                        f94Var.d.b();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jg7.a;
            case 20:
                ((Integer) obj2).getClass();
                hi2.i((k3) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                float floatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                ((n65) this.B).e.i(floatValue2);
                return jg7.a;
            case 22:
                if5 if5Var = (if5) this.B;
                Set set2 = (Set) obj;
                vl6 vl6Var2 = (vl6) obj2;
                synchronized (if5Var.c) {
                    try {
                        if (((ff5) if5Var.u.getValue()).compareTo(ff5.Idle) >= 0) {
                            ka4 ka4Var4 = if5Var.h;
                            if (set2 instanceof d66) {
                                ka4 ka4Var5 = ((d66) set2).A;
                                Object[] objArr3 = ka4Var5.b;
                                long[] jArr3 = ka4Var5.a;
                                int length3 = jArr3.length - 2;
                                if (length3 >= 0) {
                                    int i7 = 0;
                                    while (true) {
                                        long j3 = jArr3[i7];
                                        if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i8 = 8 - ((~(i7 - length3)) >>> 31);
                                            int i9 = 0;
                                            while (i9 < i8) {
                                                if ((j3 & 255) < 128) {
                                                    Object obj3 = objArr3[(i7 << 3) + i9];
                                                    c2 = c3;
                                                    if (!(obj3 instanceof fq6) || ((fq6) obj3).e(1)) {
                                                        ka4Var4.a(obj3);
                                                    }
                                                } else {
                                                    c2 = c3;
                                                }
                                                j3 >>= 8;
                                                i9++;
                                                c3 = c2;
                                            }
                                            c = c3;
                                            if (i8 == 8) {
                                            }
                                        } else {
                                            c = c3;
                                        }
                                        if (i7 != length3) {
                                            i7++;
                                            c3 = c;
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set2) {
                                    if (!(obj4 instanceof fq6) || ((fq6) obj4).e(1)) {
                                        ka4Var4.a(obj4);
                                    }
                                }
                            }
                            qj0Var = if5Var.y();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (qj0Var != null) {
                    ((rj0) qj0Var).i(jg7.a);
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                j56 j56Var = (j56) this.B;
                n46 n46Var = (n46) obj;
                qa4 qa4Var = (qa4) obj2;
                if (qa4Var instanceof gm6) {
                    gm6 gm6Var = (gm6) qa4Var;
                    Object e = j56Var.e(n46Var, gm6Var.getValue());
                    if (e == null) {
                        return null;
                    }
                    im6 d2 = gm6Var.d();
                    d2.getClass();
                    return new vs4(e, d2);
                }
                i.h("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                return null;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((Integer) obj2).getClass();
                nj2.d((lb5) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case 25:
                ((Integer) obj2).getClass();
                nw7.r((qw5) this.B, (px0) obj, ii2.a0(1));
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                RomListActivity romListActivity = (RomListActivity) this.B;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i10 = RomListActivity.K0;
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var4 = (xq2) px0Var3;
                if (xq2Var4.S(intValue3 & 1, z2)) {
                    pq5 pq5Var = (pq5) np2.C(romListActivity.I0, xq2Var4).getValue();
                    if (pq5Var != null) {
                        xq2Var4.b0(-2090481127);
                        Map map = (Map) np2.C(romListActivity.C().w, xq2Var4).getValue();
                        String str3 = (String) ((Map) np2.C(romListActivity.C().m, xq2Var4).getValue()).get(pq5Var.d.toString());
                        if (str3 != null && str3.length() > 0) {
                            str = str3;
                        } else {
                            str = null;
                        }
                        g04.n(pq5Var, str, (String) map.get(pq5Var.i), xq2Var4, 0, 0);
                        xq2Var4.p(false);
                    } else {
                        xq2Var4.b0(-2090027814);
                        g04.m(xq2Var4, 0);
                        xq2Var4.p(false);
                    }
                } else {
                    xq2Var4.V();
                }
                return jg7.a;
            case 27:
                xh5 xh5Var = tz5.L;
                return Integer.valueOf(((Comparator) this.B).compare(((kz5) obj).a, ((kz5) obj2).a));
            case 28:
                final RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) this.B;
                final Uri uri = (Uri) obj;
                final on2 on2Var = (on2) obj2;
                uri.getClass();
                on2Var.getClass();
                if (!romsPreferencesFragment.k().b.getBoolean("save_internal_config_as_file", false)) {
                    on2Var.c();
                } else if (!romsPreferencesFragment.k().f(uri)) {
                    romsPreferencesFragment.k().h(uri);
                    on2Var.c();
                    romsPreferencesFragment.k().i();
                } else {
                    zb zbVar = new zb(romsPreferencesFragment.requireContext());
                    zbVar.z(R.string.settings_mirror_detected_title);
                    zbVar.w(R.string.settings_mirror_detected_message);
                    zbVar.y(R.string.settings_mirror_restore, new DialogInterface.OnClickListener() { // from class: o06
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = r4;
                            on2 on2Var2 = on2Var;
                            Uri uri2 = uri;
                            RomsPreferencesFragment romsPreferencesFragment2 = romsPreferencesFragment;
                            switch (i12) {
                                case 0:
                                    romsPreferencesFragment2.k().h(uri2);
                                    romsPreferencesFragment2.k().m(uri2);
                                    on2Var2.c();
                                    romsPreferencesFragment2.k().i();
                                    return;
                                default:
                                    romsPreferencesFragment2.k().h(uri2);
                                    on2Var2.c();
                                    jd6 k = romsPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri2, jSONObject);
                                    romsPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    zbVar.x(R.string.settings_mirror_ignore, new DialogInterface.OnClickListener() { // from class: o06
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i11) {
                            int i12 = r4;
                            on2 on2Var2 = on2Var;
                            Uri uri2 = uri;
                            RomsPreferencesFragment romsPreferencesFragment2 = romsPreferencesFragment;
                            switch (i12) {
                                case 0:
                                    romsPreferencesFragment2.k().h(uri2);
                                    romsPreferencesFragment2.k().m(uri2);
                                    on2Var2.c();
                                    romsPreferencesFragment2.k().i();
                                    return;
                                default:
                                    romsPreferencesFragment2.k().h(uri2);
                                    on2Var2.c();
                                    jd6 k = romsPreferencesFragment2.k();
                                    String jSONObject = k.d().toString();
                                    jSONObject.getClass();
                                    k.p(uri2, jSONObject);
                                    romsPreferencesFragment2.k().i();
                                    return;
                            }
                        }
                    });
                    zbVar.B();
                }
                return jg7.a;
            default:
                int intValue4 = ((Integer) obj).intValue();
                j61 j61Var = (j61) obj2;
                k61 key = j61Var.getKey();
                j61 Z = ((k36) this.B).X.Z(key);
                if (key != vs0.h0) {
                    if (j61Var != Z) {
                        intValue4 = Integer.MIN_VALUE;
                    }
                    intValue4++;
                } else {
                    rc3 rc3Var = (rc3) Z;
                    rc3 rc3Var2 = (rc3) j61Var;
                    while (rc3Var2 != null) {
                        if (rc3Var2 == rc3Var || !(rc3Var2 instanceof o66)) {
                            qj0Var = rc3Var2;
                            if (qj0Var == rc3Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + qj0Var + ", expected child of " + rc3Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                        } else {
                            hq0 P2 = ((o66) rc3Var2).P();
                            if (P2 != null) {
                                rc3Var2 = P2.getParent();
                            } else {
                                rc3Var2 = null;
                            }
                        }
                    }
                    if (qj0Var == rc3Var) {
                    }
                }
                return Integer.valueOf(intValue4);
        }
    }

    public /* synthetic */ z5(Object obj, int i, int i2) {
        this.A = i2;
        this.B = obj;
    }
}
