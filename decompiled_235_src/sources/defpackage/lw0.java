package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.File;
import java.io.IOException;
import me.magnum.melonds.ui.settings.fragments.ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt;
import me.magnum.melonds.ui.settings.fragments.SoftInputBehaviourPreferencesFragmentKt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lw0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class lw0 implements eo2 {
    public final /* synthetic */ int A;

    public /* synthetic */ lw0(int i) {
        this.A = 26;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        hu0 hu0Var;
        int i = this.A;
        x64 x64Var = x64.a;
        jg7 jg7Var = jg7.a;
        boolean z5 = false;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (!xq2Var.S(intValue & 1, z5)) {
                    xq2Var.V();
                }
                return jg7Var;
            case 1:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (!xq2Var2.S(intValue2 & 1, z5)) {
                    xq2Var2.V();
                }
                return jg7Var;
            case 2:
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (!xq2Var3.S(intValue3 & 1, z5)) {
                    xq2Var3.V();
                }
                return jg7Var;
            case 3:
                px0 px0Var4 = (px0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var4 = (xq2) px0Var4;
                if (!xq2Var4.S(intValue4 & 1, z5)) {
                    xq2Var4.V();
                }
                return jg7Var;
            case 4:
                px0 px0Var5 = (px0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var5 = (xq2) px0Var5;
                if (!xq2Var5.S(intValue5 & 1, z5)) {
                    xq2Var5.V();
                }
                return jg7Var;
            case 5:
                px0 px0Var6 = (px0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var6 = (xq2) px0Var6;
                if (xq2Var6.S(intValue6 & 1, z)) {
                    SoftInputBehaviourPreferencesFragmentKt.b(xq2Var6, 0);
                } else {
                    xq2Var6.V();
                }
                return jg7Var;
            case 6:
                px0 px0Var7 = (px0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var7 = (xq2) px0Var7;
                if (xq2Var7.S(intValue7 & 1, z2)) {
                    bl2.e(false, ComposableSingletons$SoftInputBehaviourPreferencesFragmentKt.a, xq2Var7, 48, 1);
                } else {
                    xq2Var7.V();
                }
                return jg7Var;
            case 7:
                px0 px0Var8 = (px0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var8 = (xq2) px0Var8;
                if (xq2Var8.S(intValue8 & 1, z5)) {
                    vs0.w0.f(null, RecyclerView.B1, 0L, xq2Var8, 3072);
                } else {
                    xq2Var8.V();
                }
                return jg7Var;
            case 8:
                px0 px0Var9 = (px0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var9 = (xq2) px0Var9;
                if (xq2Var9.S(intValue9 & 1, z5)) {
                    x37.b("Движок и режим озвучки", null, bl2.F(xq2Var9).g, hi2.E(16), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var9, 199686, 0, 131026);
                } else {
                    xq2Var9.V();
                }
                return jg7Var;
            case 9:
                px0 px0Var10 = (px0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var10 = (xq2) px0Var10;
                if (xq2Var10.S(intValue10 & 1, z5)) {
                    x37.b("Язык озвучки", null, bl2.F(xq2Var10).g, hi2.E(16), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var10, 199686, 0, 131026);
                } else {
                    xq2Var10.V();
                }
                return jg7Var;
            case 10:
                px0 px0Var11 = (px0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var11 = (xq2) px0Var11;
                if (xq2Var11.S(intValue11 & 1, z5)) {
                    x37.b("🎭 Пакет нейромоделей голоса (24 голоса)", null, bl2.F(xq2Var11).g, hi2.E(16), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var11, 199686, 0, 131026);
                } else {
                    xq2Var11.V();
                }
                return jg7Var;
            case 11:
                px0 px0Var12 = (px0) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var12 = (xq2) px0Var12;
                if (xq2Var12.S(intValue12 & 1, z5)) {
                    x37.b("Драйверы Vulkan", null, ((ut0) xq2Var12.j(vt0.a)).f(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var12, 6, 0, 131066);
                } else {
                    xq2Var12.V();
                }
                return jg7Var;
            case 12:
                px0 px0Var13 = (px0) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var13 = (xq2) px0Var13;
                if (xq2Var13.S(intValue13 & 1, z5)) {
                    i13.a(nb3.x(), "Удалить", null, ((ut0) xq2Var13.j(vt0.a)).b(), xq2Var13, 48, 4);
                } else {
                    xq2Var13.V();
                }
                return jg7Var;
            case 13:
                px0 px0Var14 = (px0) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var14 = (xq2) px0Var14;
                if (xq2Var14.S(intValue14 & 1, z5)) {
                    i13.a(jw2.q(), "Назад", null, ((ut0) xq2Var14.j(vt0.a)).f(), xq2Var14, 48, 4);
                } else {
                    xq2Var14.V();
                }
                return jg7Var;
            case 14:
                px0 px0Var15 = (px0) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var15 = (xq2) px0Var15;
                if (xq2Var15.S(intValue15 & 1, z5)) {
                    i13.a(bl2.E(), "Обновить", null, ((ut0) xq2Var15.j(vt0.a)).f(), xq2Var15, 48, 4);
                } else {
                    xq2Var15.V();
                }
                return jg7Var;
            case 15:
                px0 px0Var16 = (px0) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var16 = (xq2) px0Var16;
                if (xq2Var16.S(intValue16 & 1, z5)) {
                    x37.b("Онлайн-каталог", null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var16, 6, 0, 131070);
                } else {
                    xq2Var16.V();
                }
                return jg7Var;
            case 16:
                px0 px0Var17 = (px0) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                xq2 xq2Var17 = (xq2) px0Var17;
                if (xq2Var17.S(intValue17 & 1, z3)) {
                    e33 e33Var = ak7.j;
                    if (e33Var == null) {
                        d33 d33Var = new d33("Filled.CloudDownload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = el7.a;
                        cn6 cn6Var = new cn6(kt0.b);
                        ww2 ww2Var = new ww2(1, (byte) 0);
                        ww2Var.o(19.35f, 10.04f);
                        ww2Var.h(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
                        ww2Var.h(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
                        ww2Var.h(2.34f, 8.36f, RecyclerView.B1, 10.91f, RecyclerView.B1, 14.0f);
                        ww2Var.i(RecyclerView.B1, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
                        ww2Var.l(13.0f);
                        ww2Var.i(2.76f, RecyclerView.B1, 5.0f, -2.24f, 5.0f, -5.0f);
                        ww2Var.i(RecyclerView.B1, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
                        ww2Var.g();
                        ww2Var.o(17.0f, 13.0f);
                        ww2Var.n(-5.0f, 5.0f);
                        ww2Var.n(-5.0f, -5.0f);
                        ww2Var.l(3.0f);
                        ww2Var.t(9.0f);
                        ww2Var.l(4.0f);
                        ww2Var.u(4.0f);
                        ww2Var.l(3.0f);
                        ww2Var.g();
                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                        e33Var = d33Var.b();
                        ak7.j = e33Var;
                    }
                    i13.a(e33Var, null, null, 0L, xq2Var17, 48, 12);
                } else {
                    xq2Var17.V();
                }
                return jg7Var;
            case 17:
                px0 px0Var18 = (px0) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xq2 xq2Var18 = (xq2) px0Var18;
                if (xq2Var18.S(intValue18 & 1, z4)) {
                    e33 e33Var2 = bl2.Y;
                    if (e33Var2 == null) {
                        d33 d33Var2 = new d33("Filled.Storage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = el7.a;
                        cn6 cn6Var2 = new cn6(kt0.b);
                        ww2 ww2Var2 = new ww2(1, (byte) 0);
                        ww2Var2.o(2.0f, 20.0f);
                        ww2Var2.l(20.0f);
                        ww2Var2.u(-4.0f);
                        ww2Var2.m(2.0f, 16.0f);
                        ww2Var2.u(4.0f);
                        ww2Var2.g();
                        ww2Var2.o(4.0f, 17.0f);
                        ww2Var2.l(2.0f);
                        ww2Var2.u(2.0f);
                        ww2Var2.m(4.0f, 19.0f);
                        ww2Var2.u(-2.0f);
                        ww2Var2.g();
                        ww2Var2.o(2.0f, 4.0f);
                        ww2Var2.u(4.0f);
                        ww2Var2.l(20.0f);
                        ww2Var2.m(22.0f, 4.0f);
                        ww2Var2.m(2.0f, 4.0f);
                        ww2Var2.g();
                        ww2Var2.o(6.0f, 7.0f);
                        ww2Var2.m(4.0f, 7.0f);
                        ww2Var2.m(4.0f, 5.0f);
                        ww2Var2.l(2.0f);
                        ww2Var2.u(2.0f);
                        ww2Var2.g();
                        ww2Var2.o(2.0f, 14.0f);
                        ww2Var2.l(20.0f);
                        ww2Var2.u(-4.0f);
                        ww2Var2.m(2.0f, 10.0f);
                        ww2Var2.u(4.0f);
                        ww2Var2.g();
                        ww2Var2.o(4.0f, 11.0f);
                        ww2Var2.l(2.0f);
                        ww2Var2.u(2.0f);
                        ww2Var2.m(4.0f, 13.0f);
                        ww2Var2.u(-2.0f);
                        ww2Var2.g();
                        d33.a(d33Var2, ww2Var2.b, 0, cn6Var2);
                        e33Var2 = d33Var2.b();
                        bl2.Y = e33Var2;
                    }
                    i13.a(e33Var2, null, null, 0L, xq2Var18, 48, 12);
                } else {
                    xq2Var18.V();
                }
                return jg7Var;
            case 18:
                px0 px0Var19 = (px0) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var19 = (xq2) px0Var19;
                if (xq2Var19.S(intValue19 & 1, z5)) {
                    x37.b("ТОП", ge7.P(x64Var, 4.0f, 2.0f), kt0.b, hi2.E(10), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var19, 200118, 0, 131024);
                } else {
                    xq2Var19.V();
                }
                return jg7Var;
            case 19:
                px0 px0Var20 = (px0) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z5 = true;
                }
                xq2 xq2Var20 = (xq2) px0Var20;
                if (xq2Var20.S(intValue20 & 1, z5)) {
                    a74 P = ge7.P(x64Var, 12.0f, 6.0f);
                    l26 a = k26.a(ju.a, d90.i0, xq2Var20, 48);
                    int hashCode = Long.hashCode(xq2Var20.T);
                    xv4 l = xq2Var20.l();
                    a74 E = l.E(xq2Var20, P);
                    jx0.i.getClass();
                    iy0 iy0Var = ix0.b;
                    xq2Var20.f0();
                    if (xq2Var20.S) {
                        xq2Var20.k(iy0Var);
                    } else {
                        xq2Var20.o0();
                    }
                    yh2.K(xq2Var20, ix0.f, a);
                    yh2.K(xq2Var20, ix0.e, l);
                    yh2.K(xq2Var20, ix0.g, Integer.valueOf(hashCode));
                    yh2.F(xq2Var20, ix0.h);
                    yh2.K(xq2Var20, ix0.d, E);
                    i13.a(jw2.r(), null, dj6.i(x64Var, 16.0f), hv.c(4278556265L), xq2Var20, 3504, 0);
                    gi2.h(xq2Var20, dj6.l(x64Var, 4.0f));
                    x37.b("Включен", null, hv.c(4278556265L), hi2.E(13), oj2.e0, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var20, 200070, 0, 131026);
                    xq2Var20.p(true);
                } else {
                    xq2Var20.V();
                }
                return jg7Var;
            case 20:
                l61 l61Var = (l61) obj;
                j61 j61Var = (j61) obj2;
                l61Var.getClass();
                j61Var.getClass();
                l61 D = l61Var.D(j61Var.getKey());
                vt1 vt1Var = vt1.A;
                if (D != vt1Var) {
                    d90 d90Var = d90.r0;
                    n61 n61Var = (n61) D.Z(d90Var);
                    if (n61Var == null) {
                        hu0Var = new hu0(j61Var, D);
                    } else {
                        l61 D2 = D.D(d90Var);
                        if (D2 == vt1Var) {
                            return new hu0(n61Var, j61Var);
                        }
                        hu0Var = new hu0(n61Var, new hu0(j61Var, D2));
                    }
                    return hu0Var;
                }
                return j61Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                j61 j61Var2 = (j61) obj2;
                return bool;
            case 22:
                return ((l61) obj).N((j61) obj2);
            case ConnectionResult.API_DISABLED /* 23 */:
                return ((l61) obj).N((j61) obj2);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                n46 n46Var = (n46) obj;
                ue1 ue1Var = (ue1) obj2;
                return hf.c0(Integer.valueOf(ue1Var.k()), Float.valueOf(gi2.p(ue1Var.l(), -0.5f, 0.5f)), Integer.valueOf(ue1Var.n()));
            case 25:
                n46 n46Var2 = (n46) obj;
                return (fp1) ((ep1) obj2).a.g.getValue();
            case SubAllocator.N4 /* 26 */:
                ((Integer) obj2).getClass();
                g04.m((px0) obj, ii2.a0(1));
                return jg7Var;
            case 27:
                IOException iOException = (IOException) obj2;
                ((File) obj).getClass();
                iOException.getClass();
                throw iOException;
            case 28:
                return Boolean.valueOf(nb3.k(obj, obj2));
            default:
                cp3 cp3Var = (cp3) obj;
                ((Integer) obj2).intValue();
                return new ju2(ej2.a(1));
        }
    }

    public /* synthetic */ lw0(int i, byte b) {
        this.A = i;
    }
}
