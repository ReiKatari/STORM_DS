package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.camera2.params.InputConfiguration;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.unpack.decode.Compress;
import com.stormds.emulator.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy7 */
/* loaded from: classes.dex */
public abstract class vy7 implements x32, vx0 {
    public static final zv0 A = new zv0(-1645084827, false, new fn0(15));
    public static final zv0 B = new zv0(1173343644, false, new fn0(16));
    public static final zv0 L;
    public static final zv0 R;
    public static final zv0 X;
    public static final zh2 Y;
    public static final StackTraceElement[] Z;
    public static final Object d0;
    public static e33 e0;
    public static final /* synthetic */ int f0 = 0;
    public static e33 g0;

    static {
        new zv0(1531239371, false, new fn0(17));
        L = new zv0(-190515198, false, new iw0(15));
        new zv0(-1750040617, false, new iw0(16));
        new zv0(1713201062, false, new kw0(4));
        R = new zv0(-2057829735, false, new iw0(17));
        X = new zv0(-149522822, false, new iw0(18));
        Y = new zh2(12);
        Z = new StackTraceElement[0];
        d0 = new Object();
    }

    public static final void A(Cheat cheat, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        Cheat cheat2;
        qn2 qn2Var2;
        long j;
        xq2 xq2Var;
        long j2;
        boolean z2;
        boolean z3;
        int i4;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-286503154);
        if (xq2Var2.f(cheat)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (xq2Var2.h(qn2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i6 & 1, z)) {
            es7 F = bl2.F(xq2Var2);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            x64 x64Var = x64.a;
            a74 g = u24.g(dj6.c(x64Var, 1.0f), z16.b(12.0f));
            long j3 = F.c;
            long j4 = F.g;
            a74 L2 = L(g, j3, u24.m);
            if (cheat.getEnabled()) {
                j = kt0.c(0.4f, hv.c(4294901845L));
            } else {
                j = kt0.g;
            }
            a74 I = ak7.I(L2, 1.0f, j, z16.b(12.0f));
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = new oe4(qa4Var, 6);
                xq2Var = xq2Var2;
                xq2Var.l0(P2);
            } else {
                xq2Var = xq2Var2;
            }
            a74 O = ge7.O(mb3.u(I, false, null, (on2) P2, 15), 14.0f);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, d);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            c40 c40Var = d90.k0;
            eu euVar = ju.c;
            yt0 a = wt0.a(euVar, c40Var, xq2Var, 0);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, x64Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            a74 c = dj6.c(x64Var, 1.0f);
            l26 a2 = k26.a(ju.e, d90.i0, xq2Var, 54);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, c);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            xq2 xq2Var3 = xq2Var;
            a74 S = ge7.S(new vn3(1.0f, true), RecyclerView.B1, RecyclerView.B1, 12.0f, RecyclerView.B1, 11);
            yt0 a3 = wt0.a(euVar, c40Var, xq2Var3, 0);
            int hashCode4 = Long.hashCode(xq2Var3.T);
            xv4 l4 = xq2Var3.l();
            a74 E4 = l.E(xq2Var3, S);
            xq2Var3.f0();
            if (xq2Var3.S) {
                xq2Var3.k(iy0Var);
            } else {
                xq2Var3.o0();
            }
            yh2.K(xq2Var3, pnVar, a3);
            yh2.K(xq2Var3, pnVar2, l4);
            i61.w(hashCode4, xq2Var3, pnVar3, xq2Var3, neVar);
            yh2.K(xq2Var3, pnVar4, E4);
            String name = cheat.getName();
            pi2 pi2Var = qs7.a;
            oj2 oj2Var = oj2.e0;
            long D = hi2.D(12.5d);
            if (cheat.getEnabled()) {
                j2 = hv.c(4294901845L);
            } else {
                j2 = j4;
            }
            x37.b(name, null, j2, D, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772544, 0, 130962);
            xq2 xq2Var4 = xq2Var3;
            String description = cheat.getDescription();
            if (description == null || qs6.v0(description)) {
                z2 = false;
                xq2Var4.b0(-880420034);
                xq2Var4.p(false);
            } else {
                xq2Var4.b0(-880815005);
                gi2.h(xq2Var4, dj6.e(x64Var, 2.0f));
                sr2 sr2Var = qs7.c;
                long E5 = hi2.E(9);
                long c2 = kt0.c(0.65f, j4);
                if (((Boolean) qa4Var.getValue()).booleanValue()) {
                    i4 = 10;
                } else {
                    i4 = 2;
                }
                x37.b(description, null, c2, E5, null, sr2Var, 0L, null, 0L, 0, false, i4, 0, null, null, xq2Var4, 1575936, 0, 122802);
                xq2Var4 = xq2Var4;
                z2 = false;
                xq2Var4.p(false);
            }
            xq2Var4.p(true);
            boolean enabled = cheat.getEnabled();
            if ((i6 & 112) == 32) {
                z3 = true;
            } else {
                z3 = z2;
            }
            Object P3 = xq2Var4.P();
            if (!z3 && P3 != vs0Var) {
                qn2Var2 = qn2Var;
            } else {
                qn2Var2 = qn2Var;
                P3 = new y00(6, qn2Var2);
                xq2Var4.l0(P3);
            }
            xq2 xq2Var5 = xq2Var4;
            bx6.a(enabled, (qn2) P3, null, false, nj2.i(kt0.d, hv.c(4294901845L), kt0.c(0.6f, j4), F.b, xq2Var5, 996), xq2Var5, 0, 28);
            xq2Var5.p(true);
            cheat2 = cheat;
            g04.c(zt0.a, ((Boolean) qa4Var.getValue()).booleanValue(), null, null, null, null, n16.I(581503458, new ov4(cheat2, 11), xq2Var5), xq2Var5, 1572870);
            xq2Var2 = xq2Var5;
            xq2Var2.p(true);
            xq2Var2.p(true);
        } else {
            cheat2 = cheat;
            qn2Var2 = qn2Var;
            xq2Var2.V();
        }
        cf5 t = xq2Var2.t();
        if (t != null) {
            t.d = new sa5(cheat2, i, 2, qn2Var2);
        }
    }

    public static final void B(hm4 hm4Var, boolean z, int i, boolean z2, boolean z3, on2 on2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        xq2 xq2Var;
        long j;
        hm4Var.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(833902715);
        if (xq2Var2.h(hm4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (xq2Var2.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i11 = i10 | i5;
        if (xq2Var2.g(z2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i12 = i11 | i6;
        if (xq2Var2.g(z3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i12 | i7;
        if (xq2Var2.h(on2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i14 = i13 | i8;
        if ((74899 & i14) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var2.S(i14 & 1, z4)) {
            a74 P = ge7.P(dj6.c(x64.a, 1.0f), 16.0f, 4.0f);
            y16 b = z16.b(12.0f);
            if (z3) {
                xq2Var2.b0(-1778361586);
                xq2Var2.p(false);
                j = kt0.c(0.15f, hv.c(4278556265L));
            } else if (z2) {
                xq2Var2.b0(-1778358930);
                j = kt0.c(0.15f, ((ut0) xq2Var2.j(vt0.a)).g());
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(-1778357086);
                j = ((ut0) xq2Var2.j(vt0.a)).j();
                xq2Var2.p(false);
            }
            xq2Var = xq2Var2;
            hf.b(P, b, j, 2.0f, n16.I(-24970376, new ir7(hm4Var, z, z3, z2, i, on2Var), xq2Var2), xq2Var, 1769478, 24);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ir7(hm4Var, z, i, z2, z3, on2Var, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x021e, code lost:
        if (r16 == null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void C(pq5 pq5Var, a74 a74Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var;
        pq5 pq5Var2;
        vs0 vs0Var;
        w61 w61Var;
        eo2 zs5Var;
        final es7 es7Var;
        MelonDatabase melonDatabase;
        qa4 qa4Var;
        hp0 hp0Var;
        qa4 qa4Var2;
        final qa4 qa4Var3;
        gu guVar;
        String str;
        final pq5 pq5Var3 = pq5Var;
        pq5Var3.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(629663300);
        if (xq2Var2.h(pq5Var3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (xq2Var2.f(a74Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i5 & 1, z)) {
            final Context context = (Context) xq2Var2.j(kf.b);
            Object P = xq2Var2.P();
            vs0 vs0Var2 = ox0.a;
            if (P == vs0Var2) {
                P = mb3.w(xq2Var2);
                xq2Var2.l0(P);
            }
            w61 w61Var2 = (w61) P;
            es7 F = bl2.F(xq2Var2);
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var2) {
                context.getClass();
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    P2 = (po0) hv.D(applicationContext, po0.class);
                    xq2Var2.l0(P2);
                } else {
                    e41.m();
                    return;
                }
            }
            po0 po0Var = (po0) P2;
            Object P3 = xq2Var2.P();
            if (P3 == vs0Var2) {
                P3 = (hp0) ((sb1) po0Var).f.get();
                xq2Var2.l0(P3);
            }
            hp0 hp0Var2 = (hp0) P3;
            Object P4 = xq2Var2.P();
            if (P4 == vs0Var2) {
                P4 = (MelonDatabase) ((sb1) po0Var).c.get();
                xq2Var2.l0(P4);
            }
            MelonDatabase melonDatabase2 = (MelonDatabase) P4;
            boolean f = xq2Var2.f(pq5Var3);
            Object P5 = xq2Var2.P();
            String str2 = null;
            if (f || P5 == vs0Var2) {
                P5 = np2.Y(null);
                xq2Var2.l0(P5);
            }
            qa4 qa4Var4 = (qa4) P5;
            boolean f2 = xq2Var2.f(pq5Var3);
            Object P6 = xq2Var2.P();
            if (f2 || P6 == vs0Var2) {
                P6 = np2.Y(null);
                xq2Var2.l0(P6);
            }
            final qa4 qa4Var5 = (qa4) P6;
            boolean f3 = xq2Var2.f(pq5Var3);
            Object P7 = xq2Var2.P();
            if (f3 || P7 == vs0Var2) {
                P7 = np2.Y(yt1.A);
                xq2Var2.l0(P7);
            }
            qa4 qa4Var6 = (qa4) P7;
            boolean f4 = xq2Var2.f(pq5Var3);
            Object P8 = xq2Var2.P();
            if (f4 || P8 == vs0Var2) {
                P8 = np2.Y(Boolean.TRUE);
                xq2Var2.l0(P8);
            }
            qa4 qa4Var7 = (qa4) P8;
            Object P9 = xq2Var2.P();
            if (P9 == vs0Var2) {
                P9 = np2.Y(Boolean.FALSE);
                xq2Var2.l0(P9);
            }
            final qa4 qa4Var8 = (qa4) P9;
            boolean f5 = xq2Var2.f(pq5Var3);
            Object P10 = xq2Var2.P();
            if (f5 || P10 == vs0Var2) {
                P10 = new om6();
                xq2Var2.l0(P10);
            }
            final om6 om6Var = (om6) P10;
            boolean h = xq2Var2.h(w61Var2) | xq2Var2.f(qa4Var7) | xq2Var2.h(context) | xq2Var2.h(pq5Var3) | xq2Var2.f(qa4Var5) | xq2Var2.h(melonDatabase2) | xq2Var2.h(hp0Var2) | xq2Var2.f(qa4Var4) | xq2Var2.f(qa4Var6) | xq2Var2.f(om6Var);
            Object P11 = xq2Var2.P();
            if (h || P11 == vs0Var2) {
                vs0Var = vs0Var2;
                w61Var = w61Var2;
                es7Var = F;
                melonDatabase = melonDatabase2;
                qa4Var = qa4Var4;
                hp0Var = hp0Var2;
                zs5Var = new zs5(w61Var, context, pq5Var3, melonDatabase, hp0Var, qa4Var7, qa4Var5, qa4Var, qa4Var6, om6Var, null);
                qa4Var2 = qa4Var7;
                qa4Var3 = qa4Var6;
                xq2Var2.l0(zs5Var);
            } else {
                qa4Var = qa4Var4;
                hp0Var = hp0Var2;
                vs0Var = vs0Var2;
                w61Var = w61Var2;
                zs5Var = P11;
                es7Var = F;
                melonDatabase = melonDatabase2;
                qa4Var3 = qa4Var6;
                qa4Var2 = qa4Var7;
            }
            mb3.i(xq2Var2, zs5Var, pq5Var3);
            c9 c9Var = new c9(1);
            boolean h2 = xq2Var2.h(w61Var) | xq2Var2.h(hp0Var) | xq2Var2.h(context) | xq2Var2.f(qa4Var2) | xq2Var2.h(pq5Var3) | xq2Var2.f(qa4Var5) | xq2Var2.h(melonDatabase) | xq2Var2.f(qa4Var) | xq2Var2.f(qa4Var3) | xq2Var2.f(om6Var);
            Object P12 = xq2Var2.P();
            if (h2 || P12 == vs0Var) {
                final w61 w61Var3 = w61Var;
                final hp0 hp0Var3 = hp0Var;
                final qa4 qa4Var9 = qa4Var;
                final MelonDatabase melonDatabase3 = melonDatabase;
                final qa4 qa4Var10 = qa4Var2;
                P12 = new qn2() { // from class: ts5
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            xe1 xe1Var = xk1.a;
                            de1 de1Var = de1.L;
                            hp0 hp0Var4 = hp0Var3;
                            Context context2 = context;
                            w61 w61Var4 = w61Var3;
                            hv.L(w61Var4, de1Var, null, new ct5(hp0Var4, uri, context2, w61Var4, pq5Var3, melonDatabase3, qa4Var10, qa4Var5, qa4Var9, qa4Var3, om6Var, (r41) null), 2);
                        }
                        return jg7.a;
                    }
                };
                hp0Var = hp0Var3;
                w61Var = w61Var3;
                context = context;
                qa4Var2 = qa4Var10;
                pq5Var3 = pq5Var3;
                qa4Var5 = qa4Var5;
                melonDatabase = melonDatabase3;
                om6Var = om6Var;
                qa4Var = qa4Var9;
                xq2Var2.l0(P12);
            }
            vs0 vs0Var3 = vs0Var;
            final j04 K = l.K(c9Var, (qn2) P12, xq2Var2, 0);
            lx5 lx5Var = (lx5) qa4Var5.getValue();
            if (lx5Var != null && (str = lx5Var.a) != null) {
                if (!qs6.v0(str)) {
                    str2 = str;
                }
            }
            str2 = c0(pq5Var3);
            final String str3 = str2;
            final qa4 qa4Var11 = qa4Var;
            final qa4 qa4Var12 = qa4Var2;
            a74 P13 = ge7.P(L(a74Var.d(dj6.c), es7Var.b, u24.m), 16.0f, 8.0f);
            gu guVar2 = new gu(8.0f, true, new i(1));
            boolean f6 = xq2Var2.f(str3) | xq2Var2.h(K) | xq2Var2.h(w61Var) | xq2Var2.f(qa4Var5) | xq2Var2.h(pq5Var3) | xq2Var2.h(melonDatabase) | xq2Var2.h(context) | xq2Var2.h(hp0Var) | xq2Var2.f(qa4Var12) | xq2Var2.f(qa4Var11) | xq2Var2.f(qa4Var3) | xq2Var2.f(om6Var) | xq2Var2.f(es7Var);
            Object P14 = xq2Var2.P();
            if (!f6 && P14 != vs0Var3) {
                guVar = guVar2;
                xq2Var = xq2Var2;
                pq5Var2 = pq5Var3;
            } else {
                final om6 om6Var2 = om6Var;
                xq2Var = xq2Var2;
                guVar = guVar2;
                final hp0 hp0Var4 = hp0Var;
                final pq5 pq5Var4 = pq5Var3;
                final w61 w61Var4 = w61Var;
                final qa4 qa4Var13 = qa4Var3;
                final MelonDatabase melonDatabase4 = melonDatabase;
                final qa4 qa4Var14 = qa4Var5;
                final Context context2 = context;
                P14 = new qn2() { // from class: ws5
                    @Override // defpackage.qn2
                    public final Object g(Object obj) {
                        int i6;
                        String str4;
                        List<an0> list;
                        es7 es7Var2;
                        Iterator it;
                        w61 w61Var5;
                        qa4 qa4Var15;
                        long j;
                        final boolean z2;
                        er3 er3Var = (er3) obj;
                        er3Var.getClass();
                        final String str5 = str3;
                        final j04 j04Var = K;
                        final w61 w61Var6 = w61Var4;
                        final qa4 qa4Var16 = qa4Var14;
                        final pq5 pq5Var5 = pq5Var4;
                        final MelonDatabase melonDatabase5 = melonDatabase4;
                        final Context context3 = context2;
                        final hp0 hp0Var5 = hp0Var4;
                        final qa4 qa4Var17 = qa4Var12;
                        qa4 qa4Var18 = qa4Var11;
                        qa4 qa4Var19 = qa4Var13;
                        final qa4 qa4Var20 = qa4Var18;
                        final om6 om6Var3 = om6Var2;
                        final qa4 qa4Var21 = qa4Var19;
                        final qa4 qa4Var22 = qa4Var8;
                        fo2 fo2Var = new fo2() { // from class: xs5
                            @Override // defpackage.fo2
                            public final Object e(Object obj2, Object obj3, Object obj4) {
                                boolean z3;
                                String str6;
                                float f7;
                                pn pnVar;
                                float f8;
                                final qa4 qa4Var23;
                                x64 x64Var;
                                long j2;
                                String str7;
                                px0 px0Var2 = (px0) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                ((lp3) obj2).getClass();
                                if ((intValue & 17) != 16) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                xq2 xq2Var3 = (xq2) px0Var2;
                                if (xq2Var3.S(intValue & 1, z3)) {
                                    x64 x64Var2 = x64.a;
                                    a74 O = ge7.O(vy7.J(u24.g(dj6.c(x64Var2, 1.0f), z16.b(14.0f)), d90.k(hf.c0(new kt0(hv.c(4286781507L)), new kt0(hv.c(4283172121L))), RecyclerView.B1, RecyclerView.B1, 14)), 16.0f);
                                    e34 d = h70.d(d90.L, false);
                                    int hashCode = Long.hashCode(xq2Var3.T);
                                    xv4 l = xq2Var3.l();
                                    a74 E = l.E(xq2Var3, O);
                                    jx0.i.getClass();
                                    iy0 iy0Var = ix0.b;
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    pn pnVar2 = ix0.f;
                                    yh2.K(xq2Var3, pnVar2, d);
                                    pn pnVar3 = ix0.e;
                                    yh2.K(xq2Var3, pnVar3, l);
                                    Integer valueOf = Integer.valueOf(hashCode);
                                    pn pnVar4 = ix0.g;
                                    yh2.K(xq2Var3, pnVar4, valueOf);
                                    ne neVar = ix0.h;
                                    yh2.F(xq2Var3, neVar);
                                    pn pnVar5 = ix0.d;
                                    yh2.K(xq2Var3, pnVar5, E);
                                    yt0 a = wt0.a(ju.c, d90.k0, xq2Var3, 0);
                                    int hashCode2 = Long.hashCode(xq2Var3.T);
                                    xv4 l2 = xq2Var3.l();
                                    a74 E2 = l.E(xq2Var3, x64Var2);
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, pnVar2, a);
                                    yh2.K(xq2Var3, pnVar3, l2);
                                    i61.w(hashCode2, xq2Var3, pnVar4, xq2Var3, neVar);
                                    yh2.K(xq2Var3, pnVar5, E2);
                                    d40 d40Var = d90.i0;
                                    du duVar = ju.a;
                                    l26 a2 = k26.a(duVar, d40Var, xq2Var3, 48);
                                    int hashCode3 = Long.hashCode(xq2Var3.T);
                                    xv4 l3 = xq2Var3.l();
                                    a74 E3 = l.E(xq2Var3, x64Var2);
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, pnVar2, a2);
                                    yh2.K(xq2Var3, pnVar3, l3);
                                    i61.w(hashCode3, xq2Var3, pnVar4, xq2Var3, neVar);
                                    yh2.K(xq2Var3, pnVar5, E3);
                                    i13.a(ge7.z(), null, ge7.S(dj6.i(x64Var2, 26.0f), RecyclerView.B1, RecyclerView.B1, 8.0f, RecyclerView.B1, 11), hv.c(4294901845L), xq2Var3, 3504, 0);
                                    String str8 = str5;
                                    if (!qs6.v0(str8)) {
                                        str6 = lb1.A("ACTION REPLAY ЧИТЫ (", str8, ")");
                                    } else {
                                        str6 = "ACTION REPLAY ЧИТЫ";
                                    }
                                    pi2 pi2Var = qs7.a;
                                    oj2 oj2Var = oj2.e0;
                                    long E4 = hi2.E(13);
                                    long j3 = kt0.d;
                                    x37.b(str6, null, j3, E4, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772928, 0, 130962);
                                    xq2Var3.p(true);
                                    gi2.h(xq2Var3, dj6.e(x64Var2, 4.0f));
                                    x37.b("Официальные чит-коды для выбранной игры. Включение читов применяется мгновенно при запуске эмулятора.", null, kt0.c(0.75f, j3), hi2.D(9.5d), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1576326, 0, 130994);
                                    gi2.h(xq2Var3, dj6.e(x64Var2, 10.0f));
                                    gu guVar3 = new gu(8.0f, true, new i(1));
                                    a74 c = dj6.c(x64Var2, 1.0f);
                                    l26 a3 = k26.a(guVar3, d90.h0, xq2Var3, 6);
                                    int hashCode4 = Long.hashCode(xq2Var3.T);
                                    xv4 l4 = xq2Var3.l();
                                    a74 E5 = l.E(xq2Var3, c);
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, pnVar2, a3);
                                    yh2.K(xq2Var3, pnVar3, l4);
                                    i61.w(hashCode4, xq2Var3, pnVar4, xq2Var3, neVar);
                                    yh2.K(xq2Var3, pnVar5, E5);
                                    if (1.0f <= 0.0d) {
                                        n53.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f7 = Float.MAX_VALUE;
                                    } else {
                                        f7 = 1.0f;
                                    }
                                    a74 g = u24.g(new vn3(f7, true), z16.b(8.0f));
                                    long c2 = kt0.c(0.15f, j3);
                                    jy2 jy2Var = u24.m;
                                    a74 L2 = vy7.L(g, c2, jy2Var);
                                    j04 j04Var2 = j04Var;
                                    boolean h3 = xq2Var3.h(j04Var2);
                                    Object P15 = xq2Var3.P();
                                    vs0 vs0Var4 = ox0.a;
                                    if (h3 || P15 == vs0Var4) {
                                        P15 = new x00(j04Var2, 2);
                                        xq2Var3.l0(P15);
                                    }
                                    a74 P16 = ge7.P(mb3.u(L2, false, null, (on2) P15, 15), 10.0f, 8.0f);
                                    e40 e40Var = d90.Z;
                                    e34 d2 = h70.d(e40Var, false);
                                    int hashCode5 = Long.hashCode(xq2Var3.T);
                                    xv4 l5 = xq2Var3.l();
                                    a74 E6 = l.E(xq2Var3, P16);
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, pnVar2, d2);
                                    yh2.K(xq2Var3, pnVar3, l5);
                                    i61.w(hashCode5, xq2Var3, pnVar4, xq2Var3, neVar);
                                    yh2.K(xq2Var3, pnVar5, E6);
                                    l26 a4 = k26.a(duVar, d40Var, xq2Var3, 48);
                                    int hashCode6 = Long.hashCode(xq2Var3.T);
                                    xv4 l6 = xq2Var3.l();
                                    a74 E7 = l.E(xq2Var3, x64Var2);
                                    xq2Var3.f0();
                                    if (xq2Var3.S) {
                                        xq2Var3.k(iy0Var);
                                    } else {
                                        xq2Var3.o0();
                                    }
                                    yh2.K(xq2Var3, pnVar2, a4);
                                    yh2.K(xq2Var3, pnVar3, l6);
                                    i61.w(hashCode6, xq2Var3, pnVar4, xq2Var3, neVar);
                                    yh2.K(xq2Var3, pnVar5, E7);
                                    e33 e33Var = ii2.L;
                                    if (e33Var != null) {
                                        pnVar = pnVar3;
                                        f8 = 16.0f;
                                    } else {
                                        d33 d33Var = new d33("Filled.UploadFile", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                        int i7 = el7.a;
                                        pnVar = pnVar3;
                                        cn6 cn6Var = new cn6(kt0.b);
                                        ww2 ww2Var = new ww2(1, (byte) 0);
                                        ww2Var.o(14.0f, 2.0f);
                                        ww2Var.m(6.0f, 2.0f);
                                        ww2Var.i(-1.1f, RecyclerView.B1, -1.99f, 0.9f, -1.99f, 2.0f);
                                        ww2Var.m(4.0f, 20.0f);
                                        ww2Var.i(RecyclerView.B1, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
                                        ww2Var.m(18.0f, 22.0f);
                                        ww2Var.i(1.1f, RecyclerView.B1, 2.0f, -0.9f, 2.0f, -2.0f);
                                        ww2Var.m(20.0f, 8.0f);
                                        ww2Var.n(-6.0f, -6.0f);
                                        ww2Var.g();
                                        ww2Var.o(18.0f, 20.0f);
                                        ww2Var.m(6.0f, 20.0f);
                                        ww2Var.m(6.0f, 4.0f);
                                        ww2Var.l(7.0f);
                                        ww2Var.u(5.0f);
                                        ww2Var.l(5.0f);
                                        ww2Var.u(11.0f);
                                        ww2Var.g();
                                        ww2Var.o(8.0f, 15.01f);
                                        ww2Var.n(1.41f, 1.41f);
                                        ww2Var.m(11.0f, 14.84f);
                                        ww2Var.m(11.0f, 19.0f);
                                        ww2Var.l(2.0f);
                                        ww2Var.u(-4.16f);
                                        ww2Var.n(1.59f, 1.59f);
                                        f8 = 16.0f;
                                        ww2Var.m(16.0f, 15.01f);
                                        ww2Var.m(12.01f, 11.0f);
                                        ww2Var.g();
                                        d33.a(d33Var, ww2Var.b, 0, cn6Var);
                                        e33Var = d33Var.b();
                                        ii2.L = e33Var;
                                    }
                                    i13.a(e33Var, null, dj6.i(x64Var2, f8), j3, xq2Var3, 3504, 0);
                                    gi2.h(xq2Var3, dj6.i(x64Var2, 6.0f));
                                    long E8 = hi2.E(11);
                                    oj2 oj2Var2 = oj2.d0;
                                    x37.b("Импорт usrcheat.dat", null, j3, E8, oj2Var2, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772934, 0, 130962);
                                    xq2 xq2Var4 = xq2Var3;
                                    xq2Var4.p(true);
                                    xq2Var4.p(true);
                                    float f9 = 1.0f;
                                    if (1.0f <= 0.0d) {
                                        n53.a("invalid weight; must be greater than zero");
                                    }
                                    if (1.0f > Float.MAX_VALUE) {
                                        f9 = Float.MAX_VALUE;
                                    }
                                    a74 L3 = vy7.L(u24.g(new vn3(f9, true), z16.b(8.0f)), kt0.c(0.35f, hv.c(4294901845L)), jy2Var);
                                    final w61 w61Var7 = w61Var6;
                                    boolean h4 = xq2Var4.h(w61Var7);
                                    final qa4 qa4Var24 = qa4Var16;
                                    boolean f10 = h4 | xq2Var4.f(qa4Var24);
                                    final pq5 pq5Var6 = pq5Var5;
                                    boolean h5 = f10 | xq2Var4.h(pq5Var6);
                                    final MelonDatabase melonDatabase6 = melonDatabase5;
                                    final Context context4 = context3;
                                    final hp0 hp0Var6 = hp0Var5;
                                    final qa4 qa4Var25 = qa4Var17;
                                    final qa4 qa4Var26 = qa4Var20;
                                    final qa4 qa4Var27 = qa4Var21;
                                    final om6 om6Var4 = om6Var3;
                                    boolean h6 = h5 | xq2Var4.h(melonDatabase6) | xq2Var4.h(context4) | xq2Var4.h(hp0Var6) | xq2Var4.f(qa4Var25) | xq2Var4.f(qa4Var26) | xq2Var4.f(qa4Var27) | xq2Var4.f(om6Var4);
                                    Object P17 = xq2Var4.P();
                                    qa4 qa4Var28 = qa4Var22;
                                    if (!h6 && P17 != vs0Var4) {
                                        qa4Var23 = qa4Var28;
                                    } else {
                                        qa4Var23 = qa4Var28;
                                        P17 = new on2() { // from class: us5
                                            @Override // defpackage.on2
                                            public final Object c() {
                                                qa4 qa4Var29 = qa4Var23;
                                                if (!((Boolean) qa4Var29.getValue()).booleanValue()) {
                                                    qa4Var29.setValue(Boolean.TRUE);
                                                    xe1 xe1Var = xk1.a;
                                                    de1 de1Var = de1.L;
                                                    pq5 pq5Var7 = pq5Var6;
                                                    MelonDatabase melonDatabase7 = melonDatabase6;
                                                    Context context5 = context4;
                                                    hp0 hp0Var7 = hp0Var6;
                                                    qa4 qa4Var30 = qa4Var24;
                                                    w61 w61Var8 = w61.this;
                                                    hv.L(w61Var8, de1Var, null, new ct5(pq5Var7, melonDatabase7, context5, hp0Var7, qa4Var30, qa4Var29, w61Var8, qa4Var25, qa4Var26, qa4Var27, om6Var4, (r41) null), 2);
                                                }
                                                return jg7.a;
                                            }
                                        };
                                        xq2Var4.l0(P17);
                                    }
                                    a74 P18 = ge7.P(mb3.u(L3, false, null, (on2) P17, 15), 10.0f, 8.0f);
                                    e34 d3 = h70.d(e40Var, false);
                                    int hashCode7 = Long.hashCode(xq2Var4.T);
                                    xv4 l7 = xq2Var4.l();
                                    a74 E9 = l.E(xq2Var4, P18);
                                    xq2Var4.f0();
                                    if (xq2Var4.S) {
                                        xq2Var4.k(iy0Var);
                                    } else {
                                        xq2Var4.o0();
                                    }
                                    yh2.K(xq2Var4, pnVar2, d3);
                                    pn pnVar6 = pnVar;
                                    yh2.K(xq2Var4, pnVar6, l7);
                                    i61.w(hashCode7, xq2Var4, pnVar4, xq2Var4, neVar);
                                    yh2.K(xq2Var4, pnVar5, E9);
                                    l26 a5 = k26.a(duVar, d40Var, xq2Var4, 48);
                                    int hashCode8 = Long.hashCode(xq2Var4.T);
                                    xv4 l8 = xq2Var4.l();
                                    a74 E10 = l.E(xq2Var4, x64Var2);
                                    xq2Var4.f0();
                                    if (xq2Var4.S) {
                                        xq2Var4.k(iy0Var);
                                    } else {
                                        xq2Var4.o0();
                                    }
                                    yh2.K(xq2Var4, pnVar2, a5);
                                    yh2.K(xq2Var4, pnVar6, l8);
                                    i61.w(hashCode8, xq2Var4, pnVar4, xq2Var4, neVar);
                                    yh2.K(xq2Var4, pnVar5, E10);
                                    if (((Boolean) qa4Var23.getValue()).booleanValue()) {
                                        xq2Var4.b0(-1542242584);
                                        x64Var = x64Var2;
                                        e45.a(dj6.i(x64Var2, 14.0f), j3, 2.0f, 0L, 0, xq2Var4, 438, 24);
                                        j2 = j3;
                                        xq2Var4 = xq2Var4;
                                        xq2Var4.p(false);
                                    } else {
                                        x64Var = x64Var2;
                                        xq2Var4.b0(-1542066752);
                                        i13.a(q60.E(), null, dj6.i(x64Var, 16.0f), j3, xq2Var4, 3504, 0);
                                        j2 = j3;
                                        xq2Var4.p(false);
                                    }
                                    gi2.h(xq2Var4, dj6.i(x64Var, 6.0f));
                                    if (((Boolean) qa4Var23.getValue()).booleanValue()) {
                                        str7 = "Обновление...";
                                    } else {
                                        str7 = "Обновить базу читов";
                                    }
                                    xq2 xq2Var5 = xq2Var4;
                                    x37.b(str7, null, j2, hi2.E(11), oj2Var2, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var5, 1772928, 0, 130962);
                                    xq2Var5.p(true);
                                    xq2Var5.p(true);
                                    xq2Var5.p(true);
                                    xq2Var5.p(true);
                                    xq2Var5.p(true);
                                } else {
                                    xq2Var3.V();
                                }
                                return jg7.a;
                            }
                        };
                        boolean z3 = true;
                        zv0 zv0Var = new zv0(-1231570225, true, fo2Var);
                        String str6 = null;
                        er3.g0(er3Var, null, null, zv0Var, 3);
                        if (((Boolean) qa4Var17.getValue()).booleanValue()) {
                            er3.g0(er3Var, null, null, ak7.e, 3);
                            str4 = null;
                            i6 = 3;
                        } else {
                            boolean isEmpty = ((List) qa4Var21.getValue()).isEmpty();
                            es7 es7Var3 = es7Var;
                            if (!isEmpty && ((list = (List) qa4Var21.getValue()) == null || !list.isEmpty())) {
                                for (an0 an0Var : list) {
                                    if (!an0Var.c.isEmpty()) {
                                        Iterator it2 = ((List) qa4Var21.getValue()).iterator();
                                        while (it2.hasNext()) {
                                            final an0 an0Var2 = (an0) it2.next();
                                            if (!an0Var2.c.isEmpty()) {
                                                Long l = an0Var2.a;
                                                if (l != null) {
                                                    j = l.longValue();
                                                } else {
                                                    j = 0;
                                                }
                                                final long j2 = j;
                                                Boolean bool = (Boolean) om6Var3.get(Long.valueOf(j2));
                                                if (bool != null) {
                                                    z2 = bool.booleanValue();
                                                } else {
                                                    z2 = z3;
                                                }
                                                it = it2;
                                                String h3 = lb1.h(j2, "folder_");
                                                final es7 es7Var4 = es7Var3;
                                                final om6 om6Var4 = om6Var3;
                                                fo2 fo2Var2 = new fo2() { // from class: ys5
                                                    @Override // defpackage.fo2
                                                    public final Object e(Object obj2, Object obj3, Object obj4) {
                                                        boolean z4;
                                                        e33 A2;
                                                        e33 e33Var;
                                                        es7 es7Var5 = es7.this;
                                                        long j3 = es7Var5.g;
                                                        px0 px0Var2 = (px0) obj3;
                                                        int intValue = ((Integer) obj4).intValue();
                                                        ((lp3) obj2).getClass();
                                                        if ((intValue & 17) != 16) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        xq2 xq2Var3 = (xq2) px0Var2;
                                                        if (xq2Var3.S(intValue & 1, z4)) {
                                                            x64 x64Var = x64.a;
                                                            a74 L2 = vy7.L(u24.g(dj6.c(x64Var, 1.0f), z16.b(10.0f)), es7Var5.c, u24.m);
                                                            final om6 om6Var5 = om6Var4;
                                                            boolean f7 = xq2Var3.f(om6Var5);
                                                            final long j4 = j2;
                                                            boolean e = f7 | xq2Var3.e(j4);
                                                            final boolean z5 = z2;
                                                            boolean g = e | xq2Var3.g(z5);
                                                            Object P15 = xq2Var3.P();
                                                            if (g || P15 == ox0.a) {
                                                                P15 = new on2() { // from class: vs5
                                                                    @Override // defpackage.on2
                                                                    public final Object c() {
                                                                        om6.this.put(Long.valueOf(j4), Boolean.valueOf(!z5));
                                                                        return jg7.a;
                                                                    }
                                                                };
                                                                xq2Var3.l0(P15);
                                                            }
                                                            a74 P16 = ge7.P(mb3.u(L2, false, null, (on2) P15, 15), 14.0f, 10.0f);
                                                            e34 d = h70.d(d90.L, false);
                                                            int hashCode = Long.hashCode(xq2Var3.T);
                                                            xv4 l2 = xq2Var3.l();
                                                            a74 E = l.E(xq2Var3, P16);
                                                            jx0.i.getClass();
                                                            iy0 iy0Var = ix0.b;
                                                            xq2Var3.f0();
                                                            if (xq2Var3.S) {
                                                                xq2Var3.k(iy0Var);
                                                            } else {
                                                                xq2Var3.o0();
                                                            }
                                                            pn pnVar = ix0.f;
                                                            yh2.K(xq2Var3, pnVar, d);
                                                            pn pnVar2 = ix0.e;
                                                            yh2.K(xq2Var3, pnVar2, l2);
                                                            Integer valueOf = Integer.valueOf(hashCode);
                                                            pn pnVar3 = ix0.g;
                                                            yh2.K(xq2Var3, pnVar3, valueOf);
                                                            ne neVar = ix0.h;
                                                            yh2.F(xq2Var3, neVar);
                                                            pn pnVar4 = ix0.d;
                                                            yh2.K(xq2Var3, pnVar4, E);
                                                            a74 c = dj6.c(x64Var, 1.0f);
                                                            d40 d40Var = d90.i0;
                                                            l26 a = k26.a(ju.e, d40Var, xq2Var3, 54);
                                                            int hashCode2 = Long.hashCode(xq2Var3.T);
                                                            xv4 l3 = xq2Var3.l();
                                                            a74 E2 = l.E(xq2Var3, c);
                                                            xq2Var3.f0();
                                                            if (xq2Var3.S) {
                                                                xq2Var3.k(iy0Var);
                                                            } else {
                                                                xq2Var3.o0();
                                                            }
                                                            yh2.K(xq2Var3, pnVar, a);
                                                            yh2.K(xq2Var3, pnVar2, l3);
                                                            i61.w(hashCode2, xq2Var3, pnVar3, xq2Var3, neVar);
                                                            yh2.K(xq2Var3, pnVar4, E2);
                                                            l26 a2 = k26.a(ju.a, d40Var, xq2Var3, 48);
                                                            int hashCode3 = Long.hashCode(xq2Var3.T);
                                                            xv4 l4 = xq2Var3.l();
                                                            a74 E3 = l.E(xq2Var3, x64Var);
                                                            xq2Var3.f0();
                                                            if (xq2Var3.S) {
                                                                xq2Var3.k(iy0Var);
                                                            } else {
                                                                xq2Var3.o0();
                                                            }
                                                            yh2.K(xq2Var3, pnVar, a2);
                                                            yh2.K(xq2Var3, pnVar2, l4);
                                                            i61.w(hashCode3, xq2Var3, pnVar3, xq2Var3, neVar);
                                                            yh2.K(xq2Var3, pnVar4, E3);
                                                            if (z5) {
                                                                A2 = ii2.w();
                                                            } else {
                                                                A2 = hi2.A();
                                                            }
                                                            i13.a(A2, null, dj6.i(x64Var, 20.0f), hv.c(4294901845L), xq2Var3, 3504, 0);
                                                            gi2.h(xq2Var3, dj6.i(x64Var, 8.0f));
                                                            an0 an0Var3 = an0Var2;
                                                            String str7 = an0Var3.b;
                                                            pi2 pi2Var = qs7.a;
                                                            x37.b(str7, null, es7Var5.g, hi2.E(13), oj2.e0, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1772544, 0, 130962);
                                                            gi2.h(xq2Var3, dj6.i(x64Var, 6.0f));
                                                            x37.b(lb1.k("(", an0Var3.c.size(), ")"), null, kt0.c(0.5f, j3), hi2.E(11), null, qs7.c, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var3, 1575936, 0, 130994);
                                                            xq2Var3.p(true);
                                                            if (z5) {
                                                                e33Var = u24.s;
                                                                if (e33Var == null) {
                                                                    d33 d33Var = new d33("Filled.ExpandMore", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                                    int i7 = el7.a;
                                                                    cn6 cn6Var = new cn6(kt0.b);
                                                                    ArrayList arrayList = new ArrayList(32);
                                                                    arrayList.add(new tt4(16.59f, 8.59f));
                                                                    arrayList.add(new st4(12.0f, 13.17f));
                                                                    arrayList.add(new st4(7.41f, 8.59f));
                                                                    arrayList.add(new st4(6.0f, 10.0f));
                                                                    arrayList.add(new au4(6.0f, 6.0f));
                                                                    arrayList.add(new au4(6.0f, -6.0f));
                                                                    arrayList.add(pt4.c);
                                                                    d33.a(d33Var, arrayList, 0, cn6Var);
                                                                    e33Var = d33Var.b();
                                                                    u24.s = e33Var;
                                                                }
                                                            } else {
                                                                e33Var = nb3.u;
                                                                if (e33Var == null) {
                                                                    d33 d33Var2 = new d33("Filled.ChevronRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                                                                    int i8 = el7.a;
                                                                    cn6 cn6Var2 = new cn6(kt0.b);
                                                                    ArrayList arrayList2 = new ArrayList(32);
                                                                    arrayList2.add(new tt4(10.0f, 6.0f));
                                                                    arrayList2.add(new st4(8.59f, 7.41f));
                                                                    arrayList2.add(new st4(13.17f, 12.0f));
                                                                    arrayList2.add(new au4(-4.58f, 4.59f));
                                                                    arrayList2.add(new st4(10.0f, 18.0f));
                                                                    arrayList2.add(new au4(6.0f, -6.0f));
                                                                    arrayList2.add(pt4.c);
                                                                    d33.a(d33Var2, arrayList2, 0, cn6Var2);
                                                                    e33 b = d33Var2.b();
                                                                    nb3.u = b;
                                                                    e33Var = b;
                                                                }
                                                            }
                                                            i13.a(e33Var, null, dj6.i(x64Var, 20.0f), kt0.c(0.6f, j3), xq2Var3, 432, 0);
                                                            xq2Var3.p(true);
                                                            xq2Var3.p(true);
                                                        } else {
                                                            xq2Var3.V();
                                                        }
                                                        return jg7.a;
                                                    }
                                                };
                                                w61Var5 = w61Var6;
                                                qa4Var15 = qa4Var16;
                                                er3.g0(er3Var, h3, null, new zv0(285573734, true, fo2Var2), 2);
                                                if (z2) {
                                                    ArrayList arrayList = an0Var2.c;
                                                    gn5 gn5Var = new gn5(15);
                                                    int size = arrayList.size();
                                                    r5 r5Var = new r5(24, gn5Var, arrayList);
                                                    fs5 fs5Var = new fs5(1, arrayList);
                                                    es7Var2 = es7Var4;
                                                    qa4 qa4Var23 = qa4Var21;
                                                    om6 om6Var5 = om6Var3;
                                                    MelonDatabase melonDatabase6 = melonDatabase5;
                                                    hp0 hp0Var6 = hp0Var5;
                                                    qa4 qa4Var24 = qa4Var20;
                                                    Context context4 = context3;
                                                    qa4 qa4Var25 = qa4Var17;
                                                    pq5 pq5Var6 = pq5Var5;
                                                    dt5 dt5Var = new dt5(arrayList, w61Var5, hp0Var6, qa4Var25, context4, pq5Var6, qa4Var15, melonDatabase6, qa4Var24, qa4Var23, om6Var5);
                                                    pq5Var5 = pq5Var6;
                                                    qa4Var20 = qa4Var24;
                                                    om6Var3 = om6Var5;
                                                    qa4Var17 = qa4Var25;
                                                    context3 = context4;
                                                    hp0Var5 = hp0Var6;
                                                    melonDatabase5 = melonDatabase6;
                                                    qa4Var21 = qa4Var23;
                                                    qa4Var15 = qa4Var15;
                                                    er3Var.h0(size, r5Var, fs5Var, new zv0(802480018, true, dt5Var));
                                                } else {
                                                    es7Var2 = es7Var4;
                                                }
                                            } else {
                                                es7Var2 = es7Var3;
                                                it = it2;
                                                w61Var5 = w61Var6;
                                                qa4Var15 = qa4Var16;
                                            }
                                            it2 = it;
                                            w61Var6 = w61Var5;
                                            qa4Var16 = qa4Var15;
                                            es7Var3 = es7Var2;
                                            str6 = null;
                                            z3 = true;
                                        }
                                        str4 = str6;
                                        i6 = 3;
                                    }
                                }
                            }
                            zv0 zv0Var2 = new zv0(1015585611, true, new m4(es7Var3, pq5Var5, str5, 7));
                            i6 = 3;
                            str4 = null;
                            er3.g0(er3Var, null, null, zv0Var2, 3);
                        }
                        er3.g0(er3Var, str4, str4, ak7.f, i6);
                        return jg7.a;
                    }
                };
                pq5Var2 = pq5Var4;
                xq2Var.l0(P14);
            }
            gi2.e(P13, null, null, guVar, null, null, false, null, (qn2) P14, xq2Var, 24576, 494);
        } else {
            xq2Var = xq2Var2;
            pq5Var2 = pq5Var3;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sa5(pq5Var2, a74Var, i, 3);
        }
    }

    public static final void F(qr7 qr7Var, on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var;
        gl6 gl6Var;
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1290950703);
        if (xq2Var2.h(qr7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var2.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i5 & 1, z)) {
            qa4 C = np2.C(qr7Var.f, xq2Var2);
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new ss4(0);
                xq2Var2.l0(P);
            }
            ss4 ss4Var = (ss4) P;
            Object P2 = xq2Var2.P();
            if (P2 == vs0Var) {
                P2 = new gl6();
                xq2Var2.l0(P2);
            }
            gl6 gl6Var2 = (gl6) P2;
            c9 c9Var = new c9(1);
            boolean h = xq2Var2.h(qr7Var);
            Object P3 = xq2Var2.P();
            if (h || P3 == vs0Var) {
                P3 = new dr7(qr7Var, 0);
                xq2Var2.l0(P3);
            }
            j04 K = l.K(c9Var, (qn2) P3, xq2Var2, 0);
            String str = ((pr7) C.getValue()).k;
            boolean f = xq2Var2.f(C) | xq2Var2.h(qr7Var);
            Object P4 = xq2Var2.P();
            if (f || P4 == vs0Var) {
                gl6Var = gl6Var2;
                kp5 kp5Var = new kp5(C, gl6Var, qr7Var, null, 10);
                xq2Var2.l0(kp5Var);
                P4 = kp5Var;
            } else {
                gl6Var = gl6Var2;
            }
            mb3.i(xq2Var2, (eo2) P4, str);
            xq2Var = xq2Var2;
            v56.a(nc1.j0(nc1.j0(dj6.c, nc1.q), nc1.r), null, n16.I(-1006519124, new gr7(on2Var, qr7Var), xq2Var2), null, n16.I(-1167247304, new ov4(gl6Var, 17), xq2Var2), null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, ((ut0) xq2Var2.j(vt0.a)).a(), 0L, n16.I(-1275575085, new dq3(qr7Var, K, C, ss4Var), xq2Var2), xq2Var, 24960, 12582912, 98282);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new gr7(qr7Var, on2Var, i);
        }
    }

    public static float G(EdgeEffect edgeEffect, float f, float f2, qh1 qh1Var) {
        float f3;
        float f4 = lr1.a;
        double a = lr1.a * qh1Var.a() * 386.0878f * 160.0f * 0.84f;
        float exp = (float) (Math.exp((lr1.b / lr1.c) * Math.log((Math.abs(f) * 0.35f) / a)) * a);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            f3 = up.e(edgeEffect);
        } else {
            f3 = 0.0f;
        }
        if (exp > f3 * f2) {
            return RecyclerView.B1;
        }
        int E = u24.E(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(E);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(E);
        }
        return f;
    }

    public static final void H(hp0 hp0Var, w61 w61Var, qa4 qa4Var, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, pq5 pq5Var, om6 om6Var, Context context, MelonDatabase melonDatabase) {
        xe1 xe1Var = xk1.a;
        hv.L(w61Var, de1.L, null, new gt5(context, pq5Var, melonDatabase, hp0Var, qa4Var, qa4Var2, qa4Var3, qa4Var4, om6Var, null), 2);
    }

    public static final void I(un6 un6Var) {
        int i = un6Var.R;
        int[] iArr = un6Var.B;
        Object[] objArr = un6Var.L;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != d0) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        un6Var.A = false;
        un6Var.R = i2;
    }

    public static a74 J(a74 a74Var, bv3 bv3Var) {
        return a74Var.d(new o00(0L, bv3Var, u24.m, 1));
    }

    public static final a74 L(a74 a74Var, long j, ke6 ke6Var) {
        return a74Var.d(new o00(j, null, ke6Var, 2));
    }

    public static final Integer P(int i) {
        return new Integer(i);
    }

    public static final void S(WorkDatabase workDatabase, az0 az0Var, aw7 aw7Var) {
        int i;
        workDatabase.getClass();
        az0Var.getClass();
        ArrayList d02 = hf.d0(aw7Var);
        int i2 = 0;
        while (!d02.isEmpty()) {
            List<gm4> list = ((aw7) gt0.Y0(d02)).d;
            if (list.isEmpty()) {
                i = 0;
            } else {
                i = 0;
                for (gm4 gm4Var : list) {
                    if (!gm4Var.b.j.i.isEmpty() && (i = i + 1) < 0) {
                        hf.p0();
                        throw null;
                    }
                }
                continue;
            }
            i2 += i;
        }
        if (i2 != 0) {
            int intValue = ((Number) hv.Q(workDatabase.w().a, true, false, new rk7(18))).intValue();
            int i3 = az0Var.j;
            if (intValue + i2 <= i3) {
                return;
            }
            i.h(lb1.o(i61.q(i3, intValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
        }
    }

    public static final int U(long j, long j2) {
        boolean o0 = o0(j);
        if (o0 != o0(j2)) {
            if (!o0) {
                return 1;
            }
            return -1;
        }
        int signum = (int) Math.signum(m0(j) - m0(j2));
        if (Math.min(m0(j), m0(j2)) >= RecyclerView.B1 && n0(j) != n0(j2)) {
            if (!n0(j)) {
                return 1;
            }
            return -1;
        }
        return signum;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v1, types: [wi2, ts1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static wi2 W(Context context) {
        w31 w31Var;
        ProviderInfo providerInfo;
        ui2 ui2Var;
        ApplicationInfo applicationInfo;
        if (Build.VERSION.SDK_INT >= 28) {
            w31Var = new w31(1);
        } else {
            w31Var = new w31(1);
        }
        PackageManager packageManager = context.getPackageManager();
        np2.x(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (it.hasNext()) {
                providerInfo = it.next().providerInfo;
                if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                    break;
                }
            } else {
                providerInfo = null;
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] r = w31Var.r(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : r) {
                    arrayList.add(signature.toByteArray());
                }
                ui2Var = new ui2(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList), null, null);
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (ui2Var != null) {
                return null;
            }
            return new ts1(new vi2(context, ui2Var));
        }
        ui2Var = null;
        if (ui2Var != null) {
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, be0] */
    public static be0 Y(be0... be0VarArr) {
        List asList = Arrays.asList(be0VarArr);
        if (asList.isEmpty()) {
            return new Object();
        }
        if (asList.size() == 1) {
            return (be0) asList.get(0);
        }
        return new ce0(asList);
    }

    public static final String c0(pq5 pq5Var) {
        long longValue;
        Long l = pq5Var.l;
        int i = 0;
        if (l != null) {
            long longValue2 = 4294967295L & l.longValue();
            char c = (char) ((longValue2 >> 24) & 255);
            char c2 = (char) ((longValue2 >> 16) & 255);
            char c3 = (char) ((longValue2 >> 8) & 255);
            char c4 = (char) (longValue & 255);
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(c2);
            sb.append(c3);
            sb.append(c4);
            String sb2 = sb.toString();
            for (int i2 = 0; i2 < sb2.length(); i2++) {
                if (!Character.isLetterOrDigit(sb2.charAt(i2))) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(c4);
                    sb3.append(c3);
                    sb3.append(c2);
                    sb3.append(c);
                    String sb4 = sb3.toString();
                    while (i < sb4.length()) {
                        if (!Character.isLetterOrDigit(sb4.charAt(i))) {
                            g04.y(16);
                            String l2 = Long.toString(longValue2, 16);
                            l2.getClass();
                            String upperCase = qs6.S0(4, qs6.B0(8, l2)).toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            return upperCase;
                        }
                        i++;
                    }
                    String upperCase2 = sb4.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    return upperCase2;
                }
            }
            String upperCase3 = sb2.toUpperCase(Locale.ROOT);
            upperCase3.getClass();
            return upperCase3;
        }
        String str = pq5Var.a;
        String str2 = pq5Var.i;
        Pattern compile = Pattern.compile("([A-Za-z0-9]{4})");
        compile.getClass();
        str.getClass();
        Matcher matcher = compile.matcher(str);
        matcher.getClass();
        n14 k = kn2.k(matcher, 0, str);
        if (k != null) {
            String group = k.a.group();
            group.getClass();
            String upperCase4 = group.toUpperCase(Locale.ROOT);
            upperCase4.getClass();
            return upperCase4;
        } else if (!qs6.v0(str2)) {
            String upperCase5 = qs6.S0(4, str2).toUpperCase(Locale.ROOT);
            upperCase5.getClass();
            return upperCase5;
        } else {
            StringBuilder sb5 = new StringBuilder();
            int length = str.length();
            while (i < length) {
                char charAt = str.charAt(i);
                if (Character.isLetterOrDigit(charAt)) {
                    sb5.append(charAt);
                }
                i++;
            }
            String sb6 = sb5.toString();
            Locale locale = Locale.ROOT;
            String upperCase6 = sb6.toUpperCase(locale);
            upperCase6.getClass();
            if (upperCase6.length() >= 4) {
                return qs6.S0(4, upperCase6);
            }
            int abs = Math.abs(str.hashCode());
            g04.y(16);
            String num = Integer.toString(abs, 16);
            num.getClass();
            String upperCase7 = qs6.S0(4, qs6.B0(4, num)).toUpperCase(locale);
            upperCase7.getClass();
            return qs6.S0(4, "DS".concat(upperCase7));
        }
    }

    public static final void e(on2 on2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(584970726);
        if (xq2Var.h(on2Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            kt0 kt0Var = new kt0(kt0.b);
            long j = kt0.g;
            gq.c(lb4.b, J(x64.a, d90.m(hf.c0(kt0Var, new kt0(j)), RecyclerView.B1, RecyclerView.B1, 14)), n16.I(-1286564128, new j10(on2Var, 0, (byte) 0), xq2Var), null, j, kt0.d, RecyclerView.B1, xq2Var, 1794486, 8);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new j10(i, on2Var);
        }
    }

    public static final int e0(View view, int i) {
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        Object obj = null;
        while (view != null) {
            Object tag = view.getTag(i);
            if (tag != null) {
                if (obj == null) {
                    obj = tag;
                } else if (!tag.equals(obj)) {
                    break;
                }
                i3 = i2;
            }
            i2++;
            ViewParent s = xk2.s(view);
            if (s instanceof View) {
                view = (View) s;
            } else {
                view = null;
            }
        }
        return i3;
    }

    public static final void g(n00 n00Var, sg6 sg6Var, sn snVar, on2 on2Var, px0 px0Var, int i) {
        n00 n00Var2;
        int i2;
        boolean z;
        xq2 xq2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        sg6Var.getClass();
        snVar.getClass();
        on2Var.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(149535180);
        if ((i & 6) == 0) {
            n00Var2 = n00Var;
            if (xq2Var2.h(n00Var2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            n00Var2 = n00Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.f(sg6Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.h(snVar)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (xq2Var2.h(on2Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i2 & 1, z)) {
            Object P = xq2Var2.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(Boolean.TRUE);
                xq2Var2.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            Context context = (Context) xq2Var2.j(kf.b);
            View view = (View) xq2Var2.j(kf.f);
            boolean f = xq2Var2.f(context) | xq2Var2.f(view);
            Object P2 = xq2Var2.P();
            if (f || P2 == vs0Var) {
                context.getClass();
                P2 = new cv7(((Activity) context).getWindow(), view);
                xq2Var2.l0(P2);
            }
            cv7 cv7Var = (cv7) P2;
            cv7Var.getClass();
            Boolean bool = (Boolean) qa4Var.getValue();
            bool.booleanValue();
            boolean h = xq2Var2.h(cv7Var);
            Object P3 = xq2Var2.P();
            if (h || P3 == vs0Var) {
                P3 = new m5(cv7Var, qa4Var, (r41) null, 4);
                xq2Var2.l0(P3);
            }
            mb3.i(xq2Var2, (eo2) P3, bool);
            boolean h2 = xq2Var2.h(cv7Var);
            Object P4 = xq2Var2.P();
            if (h2 || P4 == vs0Var) {
                P4 = new k0(cv7Var, 12);
                xq2Var2.l0(P4);
            }
            mb3.d(cv7Var, (qn2) P4, xq2Var2);
            xq2Var = xq2Var2;
            v56.a(null, null, null, null, null, null, 0, false, null, RecyclerView.B1, 0L, 0L, 0L, kt0.b, 0L, n16.I(1815374670, new h10(sg6Var, n00Var2, snVar, context, qa4Var, on2Var, 0), xq2Var2), xq2Var, 0, 12779520, 98303);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new i10(n00Var, sg6Var, snVar, on2Var, i, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final String str, a74 a74Var, long j, long j2, long j3, long j4, final int i, boolean z, final int i2, int i3, qn2 qn2Var, s47 s47Var, px0 px0Var, int i4, int i5) {
        int i6;
        s47 s47Var2;
        char c;
        boolean z2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final boolean z3;
        final int i7;
        final qn2 qn2Var2;
        final s47 s47Var3;
        final x64 x64Var;
        cf5 t;
        str.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-296448425);
        if (xq2Var.f(str)) {
            i6 = 4;
        } else {
            i6 = 2;
        }
        int i8 = i4 | i6 | 920350128;
        if ((i5 & 65536) == 0) {
            s47Var2 = s47Var;
            if (xq2Var.f(s47Var2)) {
                c = 0;
                int i9 = c | 28086;
                if ((306783379 & i8) != 306783378 && (i9 & 599187) == 599186) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!xq2Var.S(i8 & 1, z2)) {
                    xq2Var.X();
                    if ((i4 & 1) != 0 && !xq2Var.B()) {
                        xq2Var.V();
                        j5 = j;
                        j6 = j2;
                        j7 = j3;
                        j8 = j4;
                        z3 = z;
                        i7 = i3;
                        qn2Var2 = qn2Var;
                        s47Var3 = s47Var2;
                        x64Var = a74Var;
                    } else {
                        j5 = kt0.h;
                        j7 = x47.c;
                        Object P = xq2Var.P();
                        if (P == ox0.a) {
                            P = new k4(26);
                            xq2Var.l0(P);
                        }
                        qn2 qn2Var3 = (qn2) P;
                        int i10 = i5 & 65536;
                        x64 x64Var2 = x64.a;
                        if (i10 != 0) {
                            qn2Var2 = qn2Var3;
                            s47Var3 = ((xe7) xq2Var.j(ye7.b)).l;
                        } else {
                            qn2Var2 = qn2Var3;
                            s47Var3 = s47Var2;
                        }
                        x64Var = x64Var2;
                        z3 = true;
                        i7 = 1;
                        j6 = j7;
                        j8 = j6;
                    }
                    xq2Var.q();
                    hv.d(j31.a.a(new kt0(((ut0) xq2Var.j(vt0.a)).c())), n16.I(1514500503, new eo2() { // from class: bk0
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            boolean z4;
                            px0 px0Var2 = (px0) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            xq2 xq2Var2 = (xq2) px0Var2;
                            if (xq2Var2.S(intValue & 1, z4)) {
                                x37.b(str, x64Var, j5, j6, null, null, j7, null, j8, i, z3, i2, i7, qn2Var2, s47Var3, xq2Var2, 0, 0, 0);
                            } else {
                                xq2Var2.V();
                            }
                            return jg7.a;
                        }
                    }, xq2Var), xq2Var, 56);
                } else {
                    xq2Var.V();
                    j5 = j;
                    j6 = j2;
                    j7 = j3;
                    j8 = j4;
                    z3 = z;
                    i7 = i3;
                    qn2Var2 = qn2Var;
                    s47Var3 = s47Var2;
                    x64Var = a74Var;
                }
                t = xq2Var.t();
                if (t == null) {
                    t.d = new eo2(str, x64Var, j5, j6, j7, j8, i, z3, i2, i7, qn2Var2, s47Var3, i4, i5) { // from class: ck0
                        public final /* synthetic */ String A;
                        public final /* synthetic */ a74 B;
                        public final /* synthetic */ long L;
                        public final /* synthetic */ long R;
                        public final /* synthetic */ long X;
                        public final /* synthetic */ long Y;
                        public final /* synthetic */ int Z;
                        public final /* synthetic */ boolean d0;
                        public final /* synthetic */ int e0;
                        public final /* synthetic */ int f0;
                        public final /* synthetic */ qn2 g0;
                        public final /* synthetic */ s47 h0;
                        public final /* synthetic */ int i0;

                        {
                            this.i0 = i5;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1);
                            vy7.h(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, this.f0, this.g0, this.h0, (px0) obj, a0, this.i0);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
        } else {
            s47Var2 = s47Var;
        }
        c = 0;
        int i92 = c | 28086;
        if ((306783379 & i8) != 306783378) {
        }
        z2 = true;
        if (!xq2Var.S(i8 & 1, z2)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final zq7 h0(hm4 hm4Var, List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                zq7 zq7Var = (zq7) obj;
                String str = zq7Var.a;
                String str2 = zq7Var.b;
                String str3 = hm4Var.a;
                String str4 = hm4Var.b;
                String str5 = hm4Var.c;
                if (!str.equals(str3) && !xs6.Z(str2, str4, true)) {
                    if (xs6.Z(str2, str4 + " (" + str5 + ")", true) || (str5.length() >= 6 && qs6.j0(str2, str5, true))) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (zq7) obj;
    }

    public static final View i0(View view) {
        View view2;
        if (view.isAttachedToWindow()) {
            int min = Math.min(e0(view, R.id.view_tree_lifecycle_owner), e0(view, R.id.view_tree_saved_state_registry_owner));
            View view3 = view;
            int i = 0;
            View view4 = view3;
            while (view != null) {
                if (i == min) {
                    if (!(view.getParent() instanceof ViewGroup)) {
                        return view3;
                    }
                } else if (l0(view) == null) {
                    i++;
                    ViewParent s = xk2.s(view);
                    if (s instanceof View) {
                        view2 = (View) s;
                    } else {
                        view2 = null;
                    }
                    View view5 = view3;
                    view3 = view;
                    view = view2;
                    view4 = view5;
                }
                return view;
            }
            return view4;
        }
        return view;
    }

    public static final int j0(int i, oj2 oj2Var) {
        boolean z;
        boolean z2;
        if (oj2Var.compareTo(oj2.R) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    public static final void k(gp1 gp1Var, a74 a74Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        oc7 oc7Var;
        gp1Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1739055271);
        if (xq2Var.d(gp1Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            int i4 = or7.a[gp1Var.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        oc7Var = new oc7(new kt0(hv.c(4284773515L)), new kt0(kt0.d), "Отсутствует");
                    } else {
                        i.d();
                        return;
                    }
                } else {
                    oc7Var = new oc7(new kt0(hv.c(4278355143L)), new kt0(kt0.d), "Установлен");
                }
            } else {
                oc7Var = new oc7(new kt0(hv.c(4278556265L)), new kt0(kt0.d), "Включен");
            }
            long j = ((kt0) oc7Var.A).a;
            long j2 = ((kt0) oc7Var.B).a;
            y16 b = z16.b(6.0f);
            zv0 I = n16.I(-1940765469, new tf((String) oc7Var.L, j2), xq2Var);
            x64 x64Var = x64.a;
            ej2.c(x64Var, b, j, 0L, RecyclerView.B1, I, xq2Var, 1572870, 56);
            a74Var = x64Var;
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new sa5(gp1Var, a74Var, i, 13);
        }
    }

    public static Application k0(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        e41.y(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static final mx0 l0(View view) {
        WeakReference weakReference;
        Object tag = view.getTag(R.id.androidx_compose_ui_view_compose_view_context);
        if (tag instanceof WeakReference) {
            weakReference = (WeakReference) tag;
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            return null;
        }
        return (mx0) weakReference.get();
    }

    public static final float m0(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean n0(long j) {
        if ((j & 2) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean o0(long j) {
        if ((j & 1) != 0) {
            return true;
        }
        return false;
    }

    public static final void p(a74 a74Var, lq4 lq4Var, rp0 rp0Var, qn2 qn2Var, qn2 qn2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        lq4 lq4Var2;
        qn2 qn2Var3;
        a74 a74Var2;
        qn2 qn2Var4;
        a74Var.getClass();
        lq4Var.getClass();
        rp0Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1156545762);
        if (xq2Var.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i6 = i2 | i;
        if (xq2Var.f(rp0Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i7 = i6 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (xq2Var.h(qn2Var2)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i9 & 1, z)) {
            if (rp0Var instanceof pp0) {
                xq2Var.b0(-956043439);
                hi2.e(ge7.N(a74Var, lq4Var), xq2Var, 0);
                xq2Var.p(false);
                lq4Var2 = lq4Var;
                qn2Var3 = qn2Var2;
                a74Var2 = a74Var;
                qn2Var4 = qn2Var;
            } else if (rp0Var instanceof qp0) {
                xq2Var.b0(-956040459);
                lq4Var2 = lq4Var;
                v(a74Var, lq4Var2, (List) ((qp0) rp0Var).a, qn2Var, qn2Var2, xq2Var, i9 & 64638);
                a74Var2 = a74Var;
                qn2Var4 = qn2Var;
                qn2Var3 = qn2Var2;
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, -956045010, false);
            }
        } else {
            lq4Var2 = lq4Var;
            qn2Var3 = qn2Var2;
            a74Var2 = a74Var;
            qn2Var4 = qn2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ne4(a74Var2, lq4Var2, rp0Var, qn2Var4, qn2Var3, i);
        }
    }

    public static final a74 p0(a74 a74Var, qo3 qo3Var, tq3 tq3Var, lo4 lo4Var, boolean z) {
        return a74Var.d(new wq3(qo3Var, tq3Var, lo4Var, z));
    }

    public static final void q(String str, String str2, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        str2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1785549176);
        if (xq2Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            hf.b(ge7.P(dj6.c(x64.a, 1.0f), 16.0f, 8.0f), z16.b(12.0f), ((ut0) xq2Var.j(vt0.a)).j(), 2.0f, n16.I(194237291, new y7(str, 2, str2), xq2Var), xq2Var, 1769478, 24);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new y7(str, i, 3, str2);
        }
    }

    public static final InputConfiguration q0(String str, List list) {
        list.getClass();
        str.getClass();
        if (!list.isEmpty()) {
            if (list.size() == 1) {
                j63 j63Var = (j63) gt0.H0(list);
                return new InputConfiguration(j63Var.a, j63Var.b, j63Var.c);
            }
            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j63 j63Var2 = (j63) it.next();
                ma.C();
                arrayList.add(ma.h(j63Var2.a, j63Var2.b, str));
            }
            return ma.g(((j63) gt0.H0(list)).c, arrayList);
        }
        i.m("Call to create InputConfiguration but list of InputConfigData is empty.");
        return null;
    }

    public static final void r0(Activity activity, ck3 ck3Var) {
        int i;
        ck3Var.getClass();
        int i2 = t8.a[ck3Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = 6;
                } else {
                    i.d();
                    return;
                }
            } else {
                i = 7;
            }
        } else {
            i = -1;
        }
        if (activity.getRequestedOrientation() != i) {
            activity.setRequestedOrientation(i);
        }
    }

    public static final void t(sr7 sr7Var, String str, List list, on2 on2Var, qn2 qn2Var, qn2 qn2Var2, on2 on2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        sr7Var.getClass();
        list.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        on2Var2.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1215817205);
        if (xq2Var.d(sr7Var.ordinal())) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (xq2Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (xq2Var.h(list)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (xq2Var.h(on2Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (xq2Var.h(qn2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (xq2Var.h(qn2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (xq2Var.h(on2Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        boolean z7 = false;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i15 & 1, z)) {
            lc2 lc2Var = dj6.c;
            pq4 pq4Var = new pq4(16.0f, 16.0f, 16.0f, 16.0f);
            gu guVar = new gu(10.0f, true, new i(1));
            if ((i15 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i15 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h = z2 | z3 | xq2Var.h(list);
            if ((i15 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = h | z4;
            if ((57344 & i15) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((458752 & i15) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            if ((i15 & 3670016) == 1048576) {
                z7 = true;
            }
            boolean z11 = z10 | z7;
            Object P = xq2Var.P();
            if (z11 || P == ox0.a) {
                z00 z00Var = new z00(list, sr7Var, on2Var, str, qn2Var, qn2Var2, on2Var2);
                xq2Var.l0(z00Var);
                P = z00Var;
            }
            gi2.e(lc2Var, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var, 24966, 490);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new fo0(sr7Var, str, list, on2Var, qn2Var, qn2Var2, on2Var2, i, 6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x019a, code lost:
        if (r8 == r6) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(a74 a74Var, lq4 lq4Var, List list, qn2 qn2Var, qn2 qn2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        vs0 vs0Var;
        Resources resources;
        x64 x64Var;
        boolean z2;
        boolean z3;
        Object obj;
        int i6;
        Object obj2;
        boolean z4;
        qn2 qn2Var3 = qn2Var2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1961175383);
        if (xq2Var.f(lq4Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i7 = i | i2;
        if (xq2Var.h(list)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i8 = i7 | i3;
        if (xq2Var.h(qn2Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (xq2Var.h(qn2Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i10 & 1, z)) {
            j37 T = mp2.T(xq2Var);
            Resources resources2 = (Resources) xq2Var.j(kf.c);
            e34 d = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
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
            vs0 vs0Var2 = vs0.Y;
            boolean isEmpty = list.isEmpty();
            x64 x64Var2 = x64.a;
            Object obj3 = ox0.a;
            if (isEmpty) {
                xq2Var.b0(1890208383);
                resources = resources2;
                vs0Var = vs0Var2;
                z2 = false;
                x64Var = x64Var2;
                x37.b(yh2.O(xq2Var, R.string.no_cheats_found), vs0Var2.n(ge7.O(ge7.N(x64Var2, lq4Var), 24.0f), d90.Z), 0L, 0L, null, null, 0L, new wz6(3), 0L, 0, false, 0, 0, null, null, xq2Var, 0, 0, 130556);
                xq2Var = xq2Var;
                xq2Var.p(false);
                i6 = i10;
                obj2 = obj3;
            } else {
                vs0Var = vs0Var2;
                resources = resources2;
                x64Var = x64Var2;
                z2 = false;
                xq2Var.b0(1890488809);
                a74 s = q60.s(dj6.c, lq4Var);
                gu guVar = new gu(8.0f, true, new i(1));
                nq6 nq6Var = ky0.n;
                pq4 pq4Var = new pq4(ge7.r(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.d() + 12.0f, ge7.q(lq4Var, (kk3) xq2Var.j(nq6Var)) + 16.0f, lq4Var.a() + 16.0f + 56.0f + 16.0f);
                boolean h = xq2Var.h(list);
                if ((i10 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z5 = z3 | h;
                Object P = xq2Var.P();
                if (!z5) {
                    obj = obj3;
                } else {
                    obj = obj3;
                }
                P = new t32(list, qn2Var, 1);
                xq2Var.l0(P);
                i6 = i10;
                obj2 = obj;
                gi2.e(s, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var, 24576, 490);
                xq2Var.p(false);
            }
            a74 S = ge7.S(vs0Var.n(x64Var, d90.g0), RecyclerView.B1, RecyclerView.B1, ge7.q(lq4Var, (kk3) xq2Var.j(ky0.n)) + 16.0f, lq4Var.a() + 16.0f, 3);
            Resources resources3 = resources;
            boolean f = xq2Var.f(T) | xq2Var.h(resources3);
            if ((i6 & 57344) == 16384) {
                z4 = true;
            } else {
                z4 = z2;
            }
            boolean z6 = f | z4;
            Object P2 = xq2Var.P();
            if (!z6 && P2 != obj2) {
                qn2Var3 = qn2Var2;
            } else {
                qn2Var3 = qn2Var2;
                P2 = new u6(T, resources3, qn2Var3, 8);
                xq2Var.l0(P2);
            }
            mb3.g((on2) P2, S, null, 0L, 0L, null, mb3.e, xq2Var, 12582912);
            xq2Var.p(true);
            mp2.e(yh2.O(xq2Var, R.string.add_cheat_folder), T, null, null, xq2Var, 0, 12);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ne4(a74Var, lq4Var, list, qn2Var, qn2Var3, i);
        }
    }

    public static final void y(hm4 hm4Var, boolean z, int i, boolean z2, boolean z3, on2 on2Var, on2 on2Var2, px0 px0Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        xq2 xq2Var;
        long j;
        on2Var.getClass();
        on2Var2.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(157573967);
        if (xq2Var2.h(hm4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (xq2Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (xq2Var2.d(i)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i12 = i11 | i5;
        if (xq2Var2.g(z2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i13 = i12 | i6;
        if (xq2Var2.g(z3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i14 = i13 | i7;
        if (xq2Var2.h(on2Var)) {
            i8 = 131072;
        } else {
            i8 = 65536;
        }
        int i15 = i14 | i8;
        if (xq2Var2.h(on2Var2)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i16 = i15 | i9;
        if ((599187 & i16) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (xq2Var2.S(i16 & 1, z4)) {
            a74 c = dj6.c(x64.a, 1.0f);
            y16 b = z16.b(12.0f);
            if (z3) {
                xq2Var2.b0(1104739138);
                xq2Var2.p(false);
                j = kt0.c(0.12f, hv.c(4278556265L));
            } else {
                xq2Var2.b0(1104740854);
                j = ((ut0) xq2Var2.j(vt0.a)).j();
                xq2Var2.p(false);
            }
            xq2Var = xq2Var2;
            hf.b(c, b, j, 2.0f, n16.I(-1410497742, new kr7(hm4Var, z, z3, z2, i, on2Var2, on2Var), xq2Var2), xq2Var, 1769478, 24);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new kr7(hm4Var, z, i, z2, z3, on2Var, on2Var2, i2);
        }
    }

    public static final void z(List list, String str, Map map, List list2, String str2, boolean z, qn2 qn2Var, qn2 qn2Var2, px0 px0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        xq2 xq2Var;
        cf5 t;
        eo2 eo2Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        list.getClass();
        map.getClass();
        list2.getClass();
        qn2Var.getClass();
        qn2Var2.getClass();
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-1625261981);
        if (xq2Var2.h(list)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (xq2Var2.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (xq2Var2.h(map)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (xq2Var2.h(list2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (xq2Var2.f(str2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (xq2Var2.g(z)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i14 | i7;
        if (xq2Var2.h(qn2Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i16 = i15 | i8;
        if (xq2Var2.h(qn2Var2)) {
            i9 = 8388608;
        } else {
            i9 = Compress.MAXWINSIZE;
        }
        int i17 = i16 | i9;
        if ((4793491 & i17) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var2.S(i17 & 1, z2)) {
            if (list.isEmpty()) {
                xq2Var2.b0(-1012972410);
                a74 O = ge7.O(dj6.c, 32.0f);
                e34 d = h70.d(d90.Z, false);
                int hashCode = Long.hashCode(xq2Var2.T);
                xv4 l = xq2Var2.l();
                a74 E = l.E(xq2Var2, O);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var2.f0();
                if (xq2Var2.S) {
                    xq2Var2.k(iy0Var);
                } else {
                    xq2Var2.o0();
                }
                yh2.K(xq2Var2, ix0.f, d);
                yh2.K(xq2Var2, ix0.e, l);
                yh2.K(xq2Var2, ix0.g, Integer.valueOf(hashCode));
                yh2.F(xq2Var2, ix0.h);
                yh2.K(xq2Var2, ix0.d, E);
                x37.b("Для вашего GPU нет подходящих кастомных драйверов в каталоге. Рекомендуется использовать системный драйвер.", null, kt0.c(0.7f, ((ut0) xq2Var2.j(vt0.a)).f()), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var2, 6, 0, 131066);
                xq2Var2.p(true);
                xq2Var2.p(false);
                t = xq2Var2.t();
                if (t != null) {
                    eo2Var = new eo2(list, str, map, list2, str2, z, qn2Var, qn2Var2, i, 0) { // from class: hr7
                        public final /* synthetic */ int A;
                        public final /* synthetic */ List B;
                        public final /* synthetic */ String L;
                        public final /* synthetic */ Map R;
                        public final /* synthetic */ List X;
                        public final /* synthetic */ String Y;
                        public final /* synthetic */ boolean Z;
                        public final /* synthetic */ qn2 d0;
                        public final /* synthetic */ qn2 e0;

                        {
                            this.A = r10;
                        }

                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            int i18 = this.A;
                            jg7 jg7Var = jg7.a;
                            switch (i18) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int a0 = ii2.a0(1);
                                    vy7.z(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                                    return jg7Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int a02 = ii2.a0(1);
                                    vy7.z(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a02);
                                    return jg7Var;
                            }
                        }
                    };
                    t.d = eo2Var;
                }
                return;
            }
            boolean z7 = true;
            xq2Var2.b0(-1012548609);
            xq2Var2.p(false);
            lc2 lc2Var = dj6.c;
            pq4 pq4Var = new pq4(16.0f, 16.0f, 16.0f, 16.0f);
            gu guVar = new gu(12.0f, true, new i(1));
            boolean h = xq2Var2.h(list);
            if ((i17 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = h | z3 | xq2Var2.h(map) | xq2Var2.h(list2);
            if ((458752 & i17) == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = h2 | z4;
            if ((57344 & i17) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            if ((3670016 & i17) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            if ((i17 & 29360128) != 8388608) {
                z7 = false;
            }
            boolean z11 = z7 | z10;
            Object P = xq2Var2.P();
            if (z11 || P == ox0.a) {
                i46 i46Var = new i46(list, str, map, list2, z, str2, qn2Var, qn2Var2);
                xq2Var2.l0(i46Var);
                P = i46Var;
            }
            gi2.e(lc2Var, null, pq4Var, guVar, null, null, false, null, (qn2) P, xq2Var2, 24966, 490);
            xq2Var = xq2Var2;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        t = xq2Var.t();
        if (t != null) {
            eo2Var = new eo2(list, str, map, list2, str2, z, qn2Var, qn2Var2, i, 1) { // from class: hr7
                public final /* synthetic */ int A;
                public final /* synthetic */ List B;
                public final /* synthetic */ String L;
                public final /* synthetic */ Map R;
                public final /* synthetic */ List X;
                public final /* synthetic */ String Y;
                public final /* synthetic */ boolean Z;
                public final /* synthetic */ qn2 d0;
                public final /* synthetic */ qn2 e0;

                {
                    this.A = r10;
                }

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    int i18 = this.A;
                    jg7 jg7Var = jg7.a;
                    switch (i18) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(1);
                            vy7.z(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a0);
                            return jg7Var;
                        default:
                            ((Integer) obj2).getClass();
                            int a02 = ii2.a0(1);
                            vy7.z(this.B, this.L, this.R, this.X, this.Y, this.Z, this.d0, this.e0, (px0) obj, a02);
                            return jg7Var;
                    }
                }
            };
            t.d = eo2Var;
        }
    }

    @Override // defpackage.vx0
    public void D(t25 t25Var, int i, byte b) {
        t25Var.getClass();
        Z(t25Var, i);
        o(b);
    }

    @Override // defpackage.x32
    public void E(char c) {
        b0(Character.valueOf(c));
    }

    @Override // defpackage.x32
    public void K(wb6 wb6Var, int i) {
        wb6Var.getClass();
        b0(Integer.valueOf(i));
    }

    @Override // defpackage.vx0
    public void N(t25 t25Var, int i, short s) {
        t25Var.getClass();
        Z(t25Var, i);
        m(s);
    }

    @Override // defpackage.vx0
    public void O(int i, int i2, wb6 wb6Var) {
        wb6Var.getClass();
        Z(wb6Var, i);
        T(i2);
    }

    @Override // defpackage.vx0
    public void Q(wb6 wb6Var, int i, String str) {
        wb6Var.getClass();
        str.getClass();
        Z(wb6Var, i);
        d0(str);
    }

    @Override // defpackage.vx0
    public void R(t25 t25Var, int i, char c) {
        t25Var.getClass();
        Z(t25Var, i);
        E(c);
    }

    @Override // defpackage.x32
    public void T(int i) {
        b0(Integer.valueOf(i));
    }

    public void V(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        Z(wb6Var, i);
        if (gg3Var.e().c()) {
            j(gg3Var, obj);
        } else if (obj == null) {
            f();
        } else {
            j(gg3Var, obj);
        }
    }

    @Override // defpackage.x32
    public void X(long j) {
        b0(Long.valueOf(j));
    }

    public abstract void Z(wb6 wb6Var, int i);

    public void a(wb6 wb6Var) {
        wb6Var.getClass();
    }

    @Override // defpackage.vx0
    public x32 a0(t25 t25Var, int i) {
        t25Var.getClass();
        Z(t25Var, i);
        return s(t25Var.j(i));
    }

    public void b0(Object obj) {
        obj.getClass();
        throw new IllegalArgumentException("Non-serializable " + gh5.a(obj.getClass()) + " is not supported by " + gh5.a(getClass()) + " encoder");
    }

    @Override // defpackage.x32
    public vx0 c(wb6 wb6Var) {
        wb6Var.getClass();
        return this;
    }

    @Override // defpackage.vx0
    public void d(t25 t25Var, int i, double d) {
        t25Var.getClass();
        Z(t25Var, i);
        l(d);
    }

    @Override // defpackage.x32
    public void d0(String str) {
        str.getClass();
        b0(str);
    }

    @Override // defpackage.vx0
    public void f0(wb6 wb6Var, int i, float f) {
        wb6Var.getClass();
        Z(wb6Var, i);
        x(f);
    }

    @Override // defpackage.x32
    public void l(double d) {
        b0(Double.valueOf(d));
    }

    @Override // defpackage.x32
    public void m(short s) {
        b0(Short.valueOf(s));
    }

    @Override // defpackage.vx0
    public void n(wb6 wb6Var, int i, long j) {
        wb6Var.getClass();
        Z(wb6Var, i);
        X(j);
    }

    @Override // defpackage.x32
    public void o(byte b) {
        b0(Byte.valueOf(b));
    }

    @Override // defpackage.x32
    public void r(boolean z) {
        b0(Boolean.valueOf(z));
    }

    @Override // defpackage.x32
    public abstract x32 s(wb6 wb6Var);

    @Override // defpackage.vx0
    public void u(wb6 wb6Var, int i, boolean z) {
        wb6Var.getClass();
        Z(wb6Var, i);
        r(z);
    }

    @Override // defpackage.vx0
    public void w(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        wb6Var.getClass();
        gg3Var.getClass();
        Z(wb6Var, i);
        j(gg3Var, obj);
    }

    @Override // defpackage.x32
    public void x(float f) {
        b0(Float.valueOf(f));
    }
}
