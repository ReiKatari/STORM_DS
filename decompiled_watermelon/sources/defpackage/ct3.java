package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import android.os.Handler;
import android.view.KeyEvent;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ct3 */
/* loaded from: classes.dex */
public abstract class ct3 implements b91, yu0 {
    public static volatile Handler A = null;
    public static final et0 B = new et0(-1294981609, false, new ot0(7));
    public static final et0 L = new et0(-2049005898, false, new ot0(8));
    public static final et0 R = new et0(404635378, false, new ot0(9));
    public static final et0 X = new et0(2053005571, false, new ot0(10));
    public static final et0 Y = new et0(-191875025, false, new ot0(11));
    public static final et0 Z = new et0(918239687, false, new xk0(4));
    public static final et0 c0 = new et0(1643162878, false, new xk0(5));
    public static final et0 d0 = new et0(207659460, false, new ot0(12));
    public static final et0 e0 = new et0(856421348, false, new ot0(13));
    public static final et0 f0 = new et0(1772955436, false, new xk0(25));
    public static final et0 g0 = new et0(579431360, false, new ot0(28));
    public static final et0 h0 = new et0(1470176055, false, new ot0(29));
    public static final dp4 i0 = new dp4(null, new qo4());
    public static final Object j0 = new Object();
    public static final Type[] k0 = new Type[0];
    public static boolean l0 = true;
    public static ax2 m0;
    public static final /* synthetic */ int n0 = 0;

    public static final void A(boolean z, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z2;
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1700814396);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (sk2Var.h(ki2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i5 & 1, z2)) {
            String X2 = me2.X(sk2Var, R.string.none);
            qi4 J = ve2.J(sk2Var, R.drawable.ic_block);
            Object L2 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = new d5(17);
                sk2Var.h0(L2);
            }
            ki2 ki2Var2 = (ki2) L2;
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = new d5(17);
                sk2Var.h0(L3);
            }
            q(null, X2, J, z, false, null, null, ki2Var, ki2Var2, (ki2) L3, sk2Var, ((i5 << 9) & 7168) | 907764230 | ((i5 << 18) & 29360128));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new v4(z, ki2Var, i, 1);
        }
    }

    public static final void C(RewindWindow rewindWindow, mi2 mi2Var, ki2 ki2Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        wc2 wc2Var;
        wc2 wc2Var2;
        RewindWindow rewindWindow2 = rewindWindow;
        mi2Var.getClass();
        ki2Var.getClass();
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1237287984);
        if (sk2Var.h(rewindWindow2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (sk2Var.h(mi2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (sk2Var.h(ki2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            jd7 C = mj2.C(sk2Var);
            Object L2 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = new wc2();
                sk2Var.h0(L2);
            }
            wc2 wc2Var3 = (wc2) L2;
            boolean f = sk2Var.f(rewindWindow2);
            Object L3 = sk2Var.L();
            if (f || L3 == sn1Var) {
                L3 = tq0.g1(rewindWindow2.getRewindStates(), new hd2(27));
                sk2Var.h0(L3);
            }
            List list = (List) L3;
            int i8 = i7 & 896;
            if (i8 == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object L4 = sk2Var.L();
            if (z2 || L4 == sn1Var) {
                L4 = new w7(15, ki2Var);
                sk2Var.h0(L4);
            }
            b53.d(false, (ki2) L4, sk2Var, 0, 1);
            s72 s72Var = o76.c;
            long b = xq0.b(0.96f, C.b);
            is2 is2Var = iq2.g;
            zy3 m02 = mh7.m0(dk7.i(s72Var, b, is2Var), mh7.o);
            if (i8 == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object L5 = sk2Var.L();
            if (z3 || L5 == sn1Var) {
                L5 = new ox0(3, ki2Var);
                sk2Var.h0(L5);
            }
            zy3 B2 = w81.B(m02, (mi2) L5);
            lr0 a = jr0.a(rt.c, y60.j0, sk2Var, 0);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, B2);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            dn dnVar = mu0.f;
            oo2.S(sk2Var, dnVar, a);
            dn dnVar2 = mu0.e;
            oo2.S(sk2Var, dnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar3 = mu0.g;
            oo2.S(sk2Var, dnVar3, valueOf);
            yd ydVar = mu0.h;
            oo2.P(sk2Var, ydVar);
            dn dnVar4 = mu0.d;
            oo2.S(sk2Var, dnVar4, e02);
            i20 i20Var = y60.h0;
            wy3 wy3Var = wy3.a;
            zy3 a0 = b53.a0(o76.c(wy3Var, 1.0f), 20.0f, 8.0f, 12.0f, 8.0f);
            sr5 a2 = rr5.a(rt.a, i20Var, sk2Var, 48);
            int hashCode2 = Long.hashCode(sk2Var.T);
            sm4 l2 = sk2Var.l();
            zy3 e03 = l07.e0(sk2Var, a0);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, a2);
            oo2.S(sk2Var, dnVar2, l2);
            b31.x(hashCode2, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e03);
            ir6.b(me2.X(sk2Var, R.string.rewind), new xg3(1.0f, true), C.g, hi2.B(16), pe2.c0, td7.a, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1772544, 0, 130960);
            zy3 s = a53.s(a53.t(o76.h(wy3Var, 38.0f), gr5.a), false, null, ki2Var, 15);
            j20 j20Var = y60.Z;
            tv3 d = d50.d(j20Var, false);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, s);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d);
            oo2.S(sk2Var, dnVar2, l3);
            b31.x(hashCode3, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e04);
            ev2.a(i0(), me2.X(sk2Var, R.string.cancel), o76.h(wy3Var, 20.0f), C.g, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
            sk2Var.p(true);
            sk2Var.p(true);
            d50.a(dk7.i(o76.d(o76.c(wy3Var, 1.0f), 1.0f), C.f, is2Var), sk2Var, 0);
            xg3 xg3Var = new xg3(1.0f, true);
            tv3 d2 = d50.d(j20Var, false);
            int hashCode4 = Long.hashCode(sk2Var.T);
            sm4 l4 = sk2Var.l();
            zy3 e05 = l07.e0(sk2Var, xg3Var);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar, d2);
            oo2.S(sk2Var, dnVar2, l4);
            b31.x(hashCode4, sk2Var, dnVar3, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar4, e05);
            if (list.isEmpty()) {
                sk2Var.X(-1447331983);
                str = null;
                ir6.b(me2.X(sk2Var, R.string.rewind), null, C.i, hi2.B(12), null, td7.c, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var, 1575936, 0, 130994);
                sk2Var = sk2Var;
                sk2Var.p(false);
                rewindWindow2 = rewindWindow;
                wc2Var2 = wc2Var3;
            } else {
                sk2Var = sk2Var;
                str = null;
                sk2Var.X(-1447065848);
                ot otVar = new ot(12.0f, true, new i(1));
                mh4 mh4Var = new mh4(24.0f, 12.0f, 24.0f, 12.0f);
                zy3 c = o76.c(wy3Var, 1.0f);
                rewindWindow2 = rewindWindow;
                boolean h = sk2Var.h(list) | sk2Var.h(rewindWindow2);
                if ((i7 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z5 = h | z4;
                Object L6 = sk2Var.L();
                if (!z5 && L6 != sn1Var) {
                    wc2Var = wc2Var3;
                } else {
                    wc2Var = wc2Var3;
                    L6 = new qm(list, rewindWindow2, wc2Var, mi2Var);
                    sk2Var.h0(L6);
                }
                wc2Var2 = wc2Var;
                io2.c(c, null, mh4Var, otVar, i20Var, null, false, null, (mi2) L6, sk2Var, 221574, 458);
                sk2Var.p(false);
            }
            sk2Var.p(true);
            oo2.b(l07.c0(new lk2(str, me2.X(sk2Var, R.string.pause_hint_navigate)), new lk2("A", me2.X(sk2Var, R.string.load_state)), new lk2("B", me2.X(sk2Var, R.string.cancel))), null, false, sk2Var, 0, 6);
            sk2Var.p(true);
            oo2.k(wc2Var2, sk2Var, 6);
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new w3(rewindWindow2, mi2Var, ki2Var, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [kc5] */
    public static final void E(RewindWindow rewindWindow, RewindSaveState rewindSaveState, int i, wc2 wc2Var, ki2 ki2Var, tu0 tu0Var, int i2) {
        int i3;
        boolean z;
        boolean z2;
        float f;
        Bitmap kc5Var;
        im1 im1Var;
        zy3 zy3Var;
        wy3 wy3Var;
        float f2;
        float f3;
        long j;
        dn dnVar;
        boolean z3;
        dn dnVar2;
        sk2 sk2Var;
        wy3 wy3Var2;
        yd ydVar;
        long b;
        boolean z4;
        String string;
        String concat;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(2010886556);
        if ((i2 & 6) == 0) {
            if (sk2Var2.h(rewindWindow)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (sk2Var2.h(rewindSaveState)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var2.d(i)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if (sk2Var2.f(wc2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if (sk2Var2.h(ki2Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var2.O(i3 & 1, z)) {
            jd7 C = mj2.C(sk2Var2);
            Context context = (Context) sk2Var2.j(ue.b);
            Object L2 = sk2Var2.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = b31.f(sk2Var2);
            }
            l14 l14Var = (l14) L2;
            k24 a = bh7.a(l14Var, sk2Var2, 6);
            fr5 b2 = gr5.b(10.0f);
            if (i == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            float f4 = 1.0f - (i * 0.05f);
            if (f4 < 0.55f) {
                f = 0.55f;
            } else {
                f = f4;
            }
            boolean f5 = sk2Var2.f(rewindSaveState);
            Bitmap L3 = sk2Var2.L();
            if (f5 || L3 == sn1Var) {
                try {
                    kc5Var = rewindSaveState.getScreenshot();
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (kc5Var instanceof kc5) {
                    kc5Var = null;
                }
                L3 = kc5Var;
                sk2Var2.h0(L3);
            }
            Bitmap bitmap = (Bitmap) L3;
            boolean f6 = sk2Var2.f(rewindSaveState);
            Object L4 = sk2Var2.L();
            if (!f6 && L4 != sn1Var) {
                im1Var = L4;
            } else {
                im1 im1Var2 = new im1(rewindWindow.m12getDeltaFromEmulationTimeToRewindState5sfh64U(rewindSaveState));
                sk2Var2 = sk2Var2;
                sk2Var2.h0(im1Var2);
                im1Var = im1Var2;
            }
            sk2 sk2Var3 = sk2Var2;
            long j2 = ((im1) im1Var).A;
            h20 h20Var = y60.k0;
            wy3 wy3Var3 = wy3.a;
            if (wc2Var != null) {
                zy3Var = b53.I(wy3Var3, wc2Var);
                wy3Var = wy3Var3;
            } else {
                zy3Var = wy3Var3;
                wy3Var = zy3Var;
            }
            wy3 wy3Var4 = wy3Var;
            zy3 v = a53.v(zy3Var, l14Var, false, null, ki2Var, 508);
            lr0 a2 = jr0.a(rt.c, h20Var, sk2Var3, 48);
            int hashCode = Long.hashCode(sk2Var3.T);
            sm4 l = sk2Var3.l();
            zy3 e02 = l07.e0(sk2Var3, v);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            dn dnVar3 = mu0.f;
            oo2.S(sk2Var3, dnVar3, a2);
            dn dnVar4 = mu0.e;
            oo2.S(sk2Var3, dnVar4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            dn dnVar5 = mu0.g;
            oo2.S(sk2Var3, dnVar5, valueOf);
            yd ydVar2 = mu0.h;
            oo2.P(sk2Var3, ydVar2);
            dn dnVar6 = mu0.d;
            oo2.S(sk2Var3, dnVar6, e02);
            zy3 p = l07.p(o76.k(wy3Var4, 118.0f), 1.3333334f);
            if (((Boolean) a.getValue()).booleanValue()) {
                f2 = 1.0f;
            } else {
                f2 = f;
            }
            zy3 t = a53.t(l.r(p, f2), b2);
            long j3 = C.d;
            long j4 = C.j;
            is2 is2Var = iq2.g;
            zy3 i9 = dk7.i(t, j3, is2Var);
            if (((Boolean) a.getValue()).booleanValue()) {
                f3 = 3.0f;
            } else {
                f3 = 2.0f;
            }
            if (((Boolean) a.getValue()).booleanValue()) {
                j = j4;
            } else if (z2) {
                j = j4;
                j4 = xq0.b(0.75f, j4);
            } else {
                j = j4;
                j4 = C.f;
            }
            zy3 z5 = b53.z(f3, j4, i9, b2);
            j20 j20Var = y60.L;
            tv3 d = d50.d(j20Var, false);
            int hashCode2 = Long.hashCode(sk2Var3.T);
            sm4 l2 = sk2Var3.l();
            zy3 e03 = l07.e0(sk2Var3, z5);
            sk2Var3.b0();
            if (sk2Var3.S) {
                sk2Var3.k(mv0Var);
            } else {
                sk2Var3.k0();
            }
            oo2.S(sk2Var3, dnVar3, d);
            oo2.S(sk2Var3, dnVar4, l2);
            b31.x(hashCode2, sk2Var3, dnVar5, sk2Var3, ydVar2);
            oo2.S(sk2Var3, dnVar6, e03);
            y60 y60Var = y60.n0;
            if (bitmap != null) {
                sk2Var3.X(-339602527);
                dnVar = dnVar6;
                sk2Var = sk2Var3;
                wy3Var2 = wy3Var4;
                ydVar = ydVar2;
                dnVar2 = dnVar5;
                z3 = false;
                cg2.d(new nh(bitmap), o76.c, 0, sk2Var, 25008, 232);
                sk2Var.p(false);
            } else {
                dnVar = dnVar6;
                z3 = false;
                dnVar2 = dnVar5;
                sk2Var = sk2Var3;
                wy3Var2 = wy3Var4;
                ydVar = ydVar2;
                sk2Var.X(-339364726);
                sk2Var.p(false);
            }
            zy3 t2 = a53.t(b53.X(y60Var.i(wy3Var2, y60.d0), 6.0f), gr5.b(4.0f));
            if (z2) {
                b = j;
            } else {
                b = xq0.b(0.5f, xq0.b);
            }
            zy3 Y2 = b53.Y(dk7.i(t2, b, is2Var), 7.0f, 2.0f);
            tv3 d2 = d50.d(j20Var, z3);
            int hashCode3 = Long.hashCode(sk2Var.T);
            sm4 l3 = sk2Var.l();
            zy3 e04 = l07.e0(sk2Var, Y2);
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, dnVar3, d2);
            oo2.S(sk2Var, dnVar4, l3);
            b31.x(hashCode3, sk2Var, dnVar2, sk2Var, ydVar);
            oo2.S(sk2Var, dnVar, e04);
            if (z2) {
                concat = b31.o(sk2Var, 708622609, R.string.rewind_now, sk2Var, z3);
                z4 = true;
            } else {
                sk2Var.X(708710897);
                sk2Var.p(z3);
                double e = im1.e(j2) / 1000.0d;
                if (e >= 60.0d) {
                    z4 = true;
                    string = context.getString(R.string.rewind_time_minutes_seconds, Integer.valueOf((int) (e / 60.0d)), String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(e % 60.0d)}, 1)));
                    string.getClass();
                } else {
                    z4 = true;
                    string = context.getString(R.string.rewind_time_seconds, String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(e)}, 1)));
                    string.getClass();
                }
                concat = "-".concat(string);
            }
            String str = concat;
            sk2 sk2Var4 = sk2Var;
            ir6.b(str, null, xq0.d, hi2.A(8.5d), pe2.c0, td7.c, 0L, null, hi2.B(10), 0, false, 0, 0, null, null, sk2Var4, 1772928, 6, 129938);
            sk2Var2 = sk2Var4;
            sk2Var2.p(z4);
            sk2Var2.p(z4);
            sk2Var2.p(z4);
        } else {
            sk2Var2.R();
        }
        m55 r = sk2Var2.r();
        if (r != null) {
            r.d = new vf5(rewindWindow, rewindSaveState, i, wc2Var, ki2Var, i2, 0);
        }
    }

    public static zy3 E0(zy3 zy3Var, qi4 qi4Var, ub ubVar, s01 s01Var, float f, b30 b30Var, int i) {
        if ((i & 4) != 0) {
            ubVar = y60.Z;
        }
        ub ubVar2 = ubVar;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return zy3Var.f(new ri4(qi4Var, ubVar2, s01Var, f, b30Var));
    }

    public static void F(StringBuilder sb, String str, Map map) {
        String valueOf;
        String valueOf2;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                valueOf = ((CameraCharacteristics.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                valueOf = ((CaptureRequest.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                valueOf = ((CaptureResult.Key) key).getName();
                valueOf.getClass();
            } else {
                valueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                valueOf2 = nu.y0((Object[]) value, "[", "]", new nl0(19), 25);
            } else {
                valueOf2 = String.valueOf(value);
            }
            arrayList.add(new ti4(valueOf, valueOf2));
        }
        for (ti4 ti4Var : tq0.g1(arrayList, new hd2(11))) {
            sb.append("  " + zg6.G0(50, (String) ti4Var.A) + ' ' + ((String) ti4Var.B) + '\n');
        }
    }

    public static IllegalArgumentException F0(Method method, int i, String str, Object... objArr) {
        String g = eo4.b.g(method, i);
        return y0(method, null, str + " (" + g + ")", objArr);
    }

    public static final int G(int i, int i2) {
        return i << (((i2 % 10) * 3) + 1);
    }

    public static IllegalArgumentException G0(Method method, Exception exc, int i, String str, Object... objArr) {
        String g = eo4.b.g(method, i);
        return y0(method, exc, str + " (" + g + ")", objArr);
    }

    public static void H(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            c44.r();
        }
    }

    public static final et0 H0(int i, wi2 wi2Var, tu0 tu0Var) {
        sk2 sk2Var = (sk2) tu0Var;
        Object L2 = sk2Var.L();
        if (L2 == su0.a) {
            L2 = new et0(i, true, wi2Var);
            sk2Var.h0(L2);
        }
        et0 et0Var = (et0) L2;
        if (!et0Var.L.equals(wi2Var)) {
            et0Var.L = wi2Var;
            if (et0Var.B) {
                m55 m55Var = et0Var.R;
                if (m55Var != null) {
                    iv0 iv0Var = m55Var.a;
                    if (iv0Var != null) {
                        iv0Var.s(m55Var, null);
                    }
                    et0Var.R = null;
                }
                ArrayList arrayList = et0Var.X;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        m55 m55Var2 = (m55) arrayList.get(i2);
                        iv0 iv0Var2 = m55Var2.a;
                        if (iv0Var2 != null) {
                            iv0Var2.s(m55Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return et0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0042 A[LOOP:0: B:83:0x0000->B:105:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type I0(java.lang.reflect.Type r8, java.lang.Class r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct3.I0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static sc6 P0(float f, float f2, Object obj, int i) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1500.0f;
        }
        if ((i & 4) != 0) {
            obj = null;
        }
        return new sc6(f, f2, obj);
    }

    public static final long R(long j, om1 om1Var) {
        long j2;
        om1Var.getClass();
        int i = pm1.a[om1Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            j2 = 1;
                        } else {
                            f81.p(om1Var, "Wrong unit for millisMultiplier: ");
                            return 0L;
                        }
                    } else {
                        j2 = 1000;
                    }
                } else {
                    j2 = 60000;
                }
            } else {
                j2 = 3600000;
            }
        } else {
            j2 = 86400000;
        }
        if (j == 0) {
            return 0L;
        }
        if (j == 1) {
            if (j2 <= 4611686018427387903L) {
                return j2;
            }
        } else if (j2 == 1) {
            if (j <= 4611686018427387903L) {
                return j;
            }
        } else {
            int numberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(j)) - Long.numberOfLeadingZeros(j2);
            if (numberOfLeadingZeros < 63) {
                return j * j2;
            }
            if (numberOfLeadingZeros <= 63) {
                long j3 = j * j2;
                if (j3 <= 4611686018427387903L) {
                    return j3;
                }
            }
        }
        return 4611686018427387903L;
    }

    public static boolean R0() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Google")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Google")) {
                return false;
            }
        }
        String str3 = Build.MODEL;
        str3.getClass();
        String upperCase = str3.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return ExtraSupportedSurfaceCombinationsQuirk.c.contains(upperCase);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0017, code lost:
        if (r0.equalsIgnoreCase("Samsung") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean S0() {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            r0.getClass()
            java.lang.String r1 = "Samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r2 = 0
            if (r0 != 0) goto L19
            java.lang.String r0 = android.os.Build.BRAND
            r0.getClass()
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L41
        L19:
            java.lang.String r0 = android.os.Build.MODEL
            r0.getClass()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toUpperCase(r1)
            r0.getClass()
            java.util.Set r1 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.d
            java.util.Iterator r1 = r1.iterator()
        L2d:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L41
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = defpackage.gh6.n0(r0, r3, r2)
            if (r3 == 0) goto L2d
            r0 = 1
            return r0
        L41:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct3.S0():boolean");
    }

    public static final k02 T0(kx6 kx6Var, mi2 mi2Var, Object obj, tu0 tu0Var) {
        k02 k02Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.V(-422486745, kx6Var);
        boolean g = kx6Var.g();
        ku0 ku0Var = kx6Var.a;
        if (g) {
            sk2Var.X(-212166497);
            sk2Var.p(false);
            if (((Boolean) mi2Var.n(obj)).booleanValue()) {
                k02Var = k02.Visible;
            } else if (((Boolean) mi2Var.n(ku0Var.f())).booleanValue()) {
                k02Var = k02.PostExit;
            } else {
                k02Var = k02.PreEnter;
            }
        } else {
            sk2Var.X(-211892364);
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var.h0(L2);
            }
            k24 k24Var = (k24) L2;
            if (((Boolean) mi2Var.n(ku0Var.f())).booleanValue()) {
                k24Var.setValue(Boolean.TRUE);
            }
            if (((Boolean) mi2Var.n(obj)).booleanValue()) {
                k02Var = k02.Visible;
            } else if (((Boolean) k24Var.getValue()).booleanValue()) {
                k02Var = k02.PostExit;
            } else {
                k02Var = k02.PreEnter;
            }
            sk2Var.p(false);
        }
        sk2Var.p(false);
        return k02Var;
    }

    public static void U0(Throwable th) {
        if (!(th instanceof VirtualMachineError)) {
            if (!(th instanceof ThreadDeath)) {
                if (!(th instanceof LinkageError)) {
                    return;
                }
                throw ((LinkageError) th);
            }
            throw ((ThreadDeath) th);
        }
        throw ((VirtualMachineError) th);
    }

    public static xy6 V0(int i, int i2, bn1 bn1Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 300;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            bn1Var = cn1.a;
        }
        return new xy6(i, i2, bn1Var);
    }

    public static String W0(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    public static final void X0() {
        throw new UnsupportedOperationException();
    }

    public static boolean b0(Type type, Type type2) {
        boolean z;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if (ownerType != ownerType2 && (ownerType == null || !ownerType.equals(ownerType2))) {
                z = false;
            } else {
                z = true;
            }
            boolean equals = parameterizedType.getRawType().equals(parameterizedType2.getRawType());
            boolean equals2 = Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            if (z && equals && equals2) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return b0(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static final void d(kx6 kx6Var, mi2 mi2Var, zy3 zy3Var, z02 z02Var, h32 h32Var, aj2 aj2Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        jj0 jj0Var;
        h32 h32Var2;
        bz6 bz6Var;
        lx6 lx6Var;
        lx6 lx6Var2;
        jj0 jj0Var2;
        kx6 kx6Var2;
        ki2 ki2Var;
        ax6 ax6Var;
        ax6 ax6Var2;
        ax6 ax6Var3;
        boolean z6;
        boolean z7;
        boolean z8;
        ax6 ax6Var4;
        h32 h32Var3;
        z02 z02Var2;
        boolean z9;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        et0 et0Var2 = et0Var;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1912839215);
        if ((i & 6) == 0) {
            if (sk2Var.f(kx6Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(mi2Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(zy3Var)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (sk2Var.f(z02Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (sk2Var.f(h32Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (sk2Var.h(aj2Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        int i11 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            if (sk2Var.h(et0Var2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i11 |= i4;
        }
        int i12 = i11;
        if ((4793491 & i12) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i12 & 1, z)) {
            tj4 tj4Var = kx6Var.d;
            ku0 ku0Var = kx6Var.a;
            if (!((Boolean) mi2Var.n(tj4Var.getValue())).booleanValue() && !((Boolean) mi2Var.n(ku0Var.f())).booleanValue() && !kx6Var.g() && !kx6Var.d()) {
                sk2Var.X(-229362829);
                sk2Var.p(false);
            } else {
                sk2Var.X(-232386135);
                int i13 = i12 & 14;
                int i14 = i13 | 48;
                int i15 = i14 & 14;
                if (((i15 ^ 6) > 4 && sk2Var.f(kx6Var)) || (i14 & 6) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object L2 = sk2Var.L();
                sn1 sn1Var = su0.a;
                if (z2 || L2 == sn1Var) {
                    L2 = ku0Var.f();
                    sk2Var.h0(L2);
                }
                if (kx6Var.g()) {
                    L2 = ku0Var.f();
                }
                sk2Var.X(1844425648);
                k02 T0 = T0(kx6Var, mi2Var, L2, sk2Var);
                sk2Var.p(false);
                Object value = kx6Var.d.getValue();
                sk2Var.X(1844425648);
                k02 T02 = T0(kx6Var, mi2Var, value, sk2Var);
                sk2Var.p(false);
                kx6 w = a53.w(kx6Var, T0, T02, "EnterExitTransition", sk2Var, i15 | 3072);
                sk2Var = sk2Var;
                bz6 bz6Var2 = t02.a;
                boolean f = sk2Var.f(w);
                Object L3 = sk2Var.L();
                if (f || L3 == sn1Var) {
                    L3 = me2.G(z02Var);
                    sk2Var.h0(L3);
                }
                k24 k24Var = (k24) L3;
                ku0 ku0Var2 = w.a;
                ku0 ku0Var3 = w.a;
                tj4 tj4Var2 = w.d;
                if (ku0Var2.f() == tj4Var2.getValue() && ku0Var3.f() == k02.Visible) {
                    if (w.g()) {
                        k24Var.setValue(z02Var);
                    } else {
                        k24Var.setValue(z02.b);
                    }
                } else if (tj4Var2.getValue() == k02.Visible) {
                    k24Var.setValue(((z02) k24Var.getValue()).a(z02Var));
                }
                z02 z02Var3 = (z02) k24Var.getValue();
                boolean f2 = sk2Var.f(w);
                Object L4 = sk2Var.L();
                if (f2 || L4 == sn1Var) {
                    L4 = me2.G(h32Var);
                    sk2Var.h0(L4);
                }
                k24 k24Var2 = (k24) L4;
                if (ku0Var3.f() == tj4Var2.getValue() && ku0Var3.f() == k02.Visible) {
                    if (w.g()) {
                        k24Var2.setValue(h32Var);
                    } else {
                        k24Var2.setValue(h32.b);
                    }
                } else if (tj4Var2.getValue() != k02.Visible) {
                    k24Var2.setValue(((h32) k24Var2.getValue()).a(h32Var));
                }
                h32 h32Var4 = (h32) k24Var2.getValue();
                k24 L5 = me2.L(aj2Var, sk2Var);
                Object j = aj2Var.j(ku0Var3.f(), tj4Var2.getValue());
                boolean f3 = sk2Var.f(w) | sk2Var.f(L5);
                Object L6 = sk2Var.L();
                if (f3 || L6 == sn1Var) {
                    L6 = new a0(w, L5, null, 8);
                    sk2Var.h0(L6);
                }
                aj2 aj2Var2 = (aj2) L6;
                Object L7 = sk2Var.L();
                if (L7 == sn1Var) {
                    L7 = me2.G(j);
                    sk2Var.h0(L7);
                }
                k24 k24Var3 = (k24) L7;
                boolean h = sk2Var.h(aj2Var2);
                Object L8 = sk2Var.L();
                if (h || L8 == sn1Var) {
                    L8 = new va6(aj2Var2, k24Var3, null, 0);
                    sk2Var.h0(L8);
                }
                l.g(sk2Var, (aj2) L8, o27.a);
                Object f4 = ku0Var3.f();
                k02 k02Var = k02.PostExit;
                if (f4 == k02Var && tj4Var2.getValue() == k02Var && ((Boolean) k24Var3.getValue()).booleanValue()) {
                    sk2Var.X(-229368781);
                    z9 = false;
                    sk2Var.p(false);
                } else {
                    sk2Var.X(-230699766);
                    if (i13 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Object L9 = sk2Var.L();
                    if (z3 || L9 == sn1Var) {
                        L9 = new xn(w);
                        sk2Var.h0(L9);
                    }
                    xn xnVar = (xn) L9;
                    bz6 bz6Var3 = dt3.m0;
                    Object L10 = sk2Var.L();
                    if (L10 == sn1Var) {
                        L10 = mv0.e0;
                        sk2Var.h0(L10);
                    }
                    ki2 ki2Var2 = (ki2) L10;
                    sk2Var.X(-167964673);
                    sk2Var.p(false);
                    sk2Var.X(-167961890);
                    sk2Var.p(false);
                    lx6 lx6Var3 = z02Var3.a;
                    lx6 lx6Var4 = h32Var4.a;
                    jj0 jj0Var3 = lx6Var4.c;
                    a86 a86Var = lx6Var3.b;
                    jj0 jj0Var4 = lx6Var3.c;
                    if (a86Var == null && lx6Var4.b == null) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (jj0Var4 == null && jj0Var3 == null) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (z4) {
                        sk2Var.X(-911488127);
                        Object L11 = sk2Var.L();
                        if (L11 == sn1Var) {
                            L11 = "Built-in slide";
                            sk2Var.h0("Built-in slide");
                        }
                        String str = (String) L11;
                        i3 = i12;
                        jj0Var = jj0Var3;
                        lx6Var = lx6Var3;
                        lx6Var2 = lx6Var4;
                        jj0Var2 = jj0Var4;
                        ki2Var = ki2Var2;
                        h32Var2 = h32Var4;
                        kx6Var2 = w;
                        ax6 x = a53.x(kx6Var2, bz6Var3, str, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        bz6Var = bz6Var3;
                        sk2Var.p(false);
                        ax6Var = x;
                    } else {
                        i3 = i12;
                        jj0Var = jj0Var3;
                        h32Var2 = h32Var4;
                        bz6Var = bz6Var3;
                        lx6Var = lx6Var3;
                        lx6Var2 = lx6Var4;
                        jj0Var2 = jj0Var4;
                        kx6Var2 = w;
                        ki2Var = ki2Var2;
                        sk2Var.X(-911382324);
                        sk2Var.p(false);
                        ax6Var = null;
                    }
                    if (z5) {
                        sk2Var.X(-911290533);
                        bz6 bz6Var4 = dt3.n0;
                        Object L12 = sk2Var.L();
                        if (L12 == sn1Var) {
                            L12 = "Built-in shrink/expand";
                            sk2Var.h0("Built-in shrink/expand");
                        }
                        ax6 x2 = a53.x(kx6Var2, bz6Var4, (String) L12, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        sk2Var.p(false);
                        ax6Var2 = x2;
                    } else {
                        sk2Var.X(-911179709);
                        sk2Var.p(false);
                        ax6Var2 = null;
                    }
                    if (z5) {
                        sk2Var.X(-911106083);
                        Object L13 = sk2Var.L();
                        if (L13 == sn1Var) {
                            L13 = "Built-in InterruptionHandlingOffset";
                            sk2Var.h0("Built-in InterruptionHandlingOffset");
                        }
                        ax6 x3 = a53.x(kx6Var2, bz6Var, (String) L13, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        sk2Var.p(false);
                        ax6Var3 = x3;
                    } else {
                        sk2Var.X(-910935677);
                        sk2Var.p(false);
                        ax6Var3 = null;
                    }
                    if ((jj0Var2 != null && !jj0Var2.d) || ((jj0Var != null && !jj0Var.d) || !z5)) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    float[] fArr = dr0.a;
                    sk2Var.X(-910130296);
                    sk2Var.p(false);
                    bz6 bz6Var5 = dt3.g0;
                    if (lx6Var.a == null && lx6Var2.a == null) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        sk2Var.X(-703879421);
                        Object L14 = sk2Var.L();
                        if (L14 == sn1Var) {
                            L14 = "Built-in alpha";
                            sk2Var.h0("Built-in alpha");
                        }
                        ax6Var4 = a53.x(kx6Var2, bz6Var5, (String) L14, sk2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                        z8 = false;
                        sk2Var.p(false);
                    } else {
                        z8 = false;
                        sk2Var.X(-703709976);
                        sk2Var.p(false);
                        ax6Var4 = null;
                    }
                    sk2Var.X(-703472888);
                    sk2Var.p(z8);
                    sk2Var.X(-703222904);
                    sk2Var.p(z8);
                    boolean h2 = sk2Var.h(ax6Var4) | sk2Var.f(z02Var3) | sk2Var.f(h32Var2) | sk2Var.h(null) | sk2Var.f(kx6Var2) | sk2Var.h(null);
                    Object L15 = sk2Var.L();
                    if (!h2 && L15 != sn1Var) {
                        h32Var3 = h32Var2;
                        z02Var2 = z02Var3;
                    } else {
                        h32Var3 = h32Var2;
                        z02Var2 = z02Var3;
                        L15 = new m02(ax6Var4, null, kx6Var2, z02Var2, h32Var3, null);
                        sk2Var.h0(L15);
                    }
                    m02 m02Var = (m02) L15;
                    boolean g = sk2Var.g(z6) | sk2Var.f(ki2Var);
                    Object L16 = sk2Var.L();
                    if (g || L16 == sn1Var) {
                        L16 = new r02(ki2Var, z6);
                        sk2Var.h0(L16);
                    }
                    wy3 wy3Var = wy3.a;
                    zy3 f5 = tq5.q(wy3Var, (mi2) L16).f(new l02(kx6Var2, ax6Var2, ax6Var3, ax6Var, z02Var2, h32Var3, ki2Var, m02Var)).f(wy3Var);
                    sk2Var.X(-7404393);
                    sk2Var.p(false);
                    zy3 f6 = zy3Var.f(f5.f(wy3Var));
                    Object L17 = sk2Var.L();
                    if (L17 == sn1Var) {
                        L17 = new nn(xnVar);
                        sk2Var.h0(L17);
                    }
                    nn nnVar = (nn) L17;
                    int hashCode = Long.hashCode(sk2Var.T);
                    sm4 l = sk2Var.l();
                    zy3 e02 = l07.e0(sk2Var, f6);
                    nu0.i.getClass();
                    mv0 mv0Var = mu0.b;
                    sk2Var.b0();
                    if (sk2Var.S) {
                        sk2Var.k(mv0Var);
                    } else {
                        sk2Var.k0();
                    }
                    oo2.S(sk2Var, mu0.f, nnVar);
                    oo2.S(sk2Var, mu0.e, l);
                    oo2.N(sk2Var, Integer.valueOf(hashCode), mu0.g);
                    oo2.P(sk2Var, mu0.h);
                    oo2.S(sk2Var, mu0.d, e02);
                    et0Var2 = et0Var;
                    et0Var2.i(xnVar, sk2Var, Integer.valueOf((i3 >> 18) & 112));
                    sk2Var.p(true);
                    z9 = false;
                    sk2Var.p(false);
                }
                sk2Var.p(z9);
            }
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new sn(kx6Var, mi2Var, zy3Var, z02Var, h32Var, aj2Var, et0Var2, i);
        }
    }

    public static final zy3 e0(zy3 zy3Var, boolean z, l14 l14Var) {
        zy3 zy3Var2;
        if (z) {
            zy3Var2 = new id2(l14Var);
        } else {
            zy3Var2 = wy3.a;
        }
        return zy3Var.f(zy3Var2);
    }

    public static /* synthetic */ zy3 f0(zy3 zy3Var, boolean z, l14 l14Var, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            l14Var = null;
        }
        return e0(zy3Var, z, l14Var);
    }

    public static final void g(mr0 mr0Var, boolean z, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        wy3 wy3Var;
        z02 z02Var2;
        h32 h32Var2;
        String str2;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1799879339);
        if ((i & 48) == 0) {
            if (sk2Var.g(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        int i5 = i2 | 224640;
        if ((i & 1572864) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i5 |= i3;
        }
        if ((599185 & i5) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i5 & 1, z2)) {
            z02 a = t02.d(null, 3).a(t02.c(15));
            h32 a2 = t02.e(null, 3).a(t02.g(null, 15));
            int i6 = i5 >> 3;
            kx6 V = a53.V(Boolean.valueOf(z), "AnimatedVisibility", sk2Var, (i6 & 14) | ((i5 >> 12) & 112), 0);
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = yd.j0;
                sk2Var.h0(L2);
            }
            wy3 wy3Var2 = wy3.a;
            o(V, (mi2) L2, wy3Var2, a, a2, et0Var, sk2Var, (i5 & 57344) | (i5 & 896) | 48 | (i5 & 7168) | (i6 & 458752));
            wy3Var = wy3Var2;
            z02Var2 = a;
            h32Var2 = a2;
            str2 = "AnimatedVisibility";
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
            z02Var2 = z02Var;
            h32Var2 = h32Var;
            str2 = str;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new un(mr0Var, z, wy3Var, z02Var2, h32Var2, str2, et0Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.oq6 g0(defpackage.oq6 r15) {
        /*
            r15.getClass()
            long r0 = r15.b
            int r2 = defpackage.vr6.c
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            to r3 = r15.a
            java.lang.String r3 = r3.B
            r4 = 0
            r5 = r4
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
        L1b:
            int r11 = r3.length()
            if (r5 >= r11) goto L89
            char r11 = r3.charAt(r5)
            int r12 = r7 + 1
            r13 = 16
            r14 = 1
            if (r8 != r13) goto L43
            r8 = 10
            r1.append(r8)
            if (r11 == r8) goto L40
            int r8 = r0 + r9
            if (r7 > r8) goto L3d
            int r9 = r9 + 1
            r8 = r4
            r10 = r8
        L3b:
            r6 = r14
            goto L58
        L3d:
            r8 = r4
            r10 = r8
            goto L58
        L40:
            r8 = r4
            r10 = r8
            goto L85
        L43:
            r13 = 8
            if (r10 != r13) goto L58
            r1.append(r2)
            if (r11 == r2) goto L56
            int r10 = r0 + r9
            if (r7 > r10) goto L54
            int r9 = r9 + 1
            r10 = r4
            goto L3b
        L54:
            r10 = r4
            goto L58
        L56:
            r10 = r4
            goto L85
        L58:
            char r7 = java.lang.Character.toUpperCase(r11)
            r13 = 48
            if (r13 > r7) goto L65
            r13 = 58
            if (r7 >= r13) goto L65
            goto L6d
        L65:
            r13 = 65
            if (r13 > r7) goto L84
            r13 = 71
            if (r7 >= r13) goto L84
        L6d:
            char r7 = java.lang.Character.toUpperCase(r11)
            r1.append(r7)
            int r8 = r8 + 1
            int r10 = r10 + 1
            boolean r7 = java.lang.Character.isDigit(r11)
            if (r7 != 0) goto L85
            boolean r7 = java.lang.Character.isUpperCase(r11)
            if (r7 != 0) goto L85
        L84:
            r6 = r14
        L85:
            int r5 = r5 + 1
            r7 = r12
            goto L1b
        L89:
            if (r6 == 0) goto L9a
            oq6 r15 = new oq6
            java.lang.String r1 = r1.toString()
            int r0 = r0 + r9
            long r2 = defpackage.ve2.g(r0, r0)
            r0 = 4
            r15.<init>(r1, r0, r2)
        L9a:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct3.g0(oq6):oq6");
    }

    public static final qo0 h0(h06 h06Var) {
        h06Var.getClass();
        if (h06Var instanceof z01) {
            return ((z01) h06Var).b;
        }
        if (h06Var instanceof i06) {
            return h0(((i06) h06Var).a);
        }
        return null;
    }

    public static final ax2 i0() {
        ax2 ax2Var = m0;
        if (ax2Var != null) {
            return ax2Var;
        }
        zw2 zw2Var = new zw2("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = f77.a;
        mb6 mb6Var = new mb6(xq0.b);
        vq2 vq2Var = new vq2(1, (byte) 0);
        vq2Var.o(19.0f, 6.41f);
        vq2Var.m(17.59f, 5.0f);
        vq2Var.m(12.0f, 10.59f);
        vq2Var.m(6.41f, 5.0f);
        vq2Var.m(5.0f, 6.41f);
        vq2Var.m(10.59f, 12.0f);
        vq2Var.m(5.0f, 17.59f);
        vq2Var.m(6.41f, 19.0f);
        vq2Var.m(12.0f, 13.41f);
        vq2Var.m(17.59f, 19.0f);
        vq2Var.m(19.0f, 17.59f);
        vq2Var.m(13.41f, 12.0f);
        vq2Var.g();
        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
        ax2 b = zw2Var.b();
        m0 = b;
        return b;
    }

    public static final void k(n24 n24Var, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z;
        wy3 wy3Var;
        String str2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(657024243);
        if (sk2Var.f(n24Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if (sk2Var.f(z02Var)) {
            i3 = 256;
        } else {
            i3 = 128;
        }
        int i5 = i4 | i3 | 24576;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i5 & 1, z)) {
            kx6 P = a53.P(n24Var, "AnimatedVisibility", sk2Var, (i5 & 14) | 48, 0);
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = yd.k0;
                sk2Var.h0(L2);
            }
            wy3 wy3Var2 = wy3.a;
            o(P, (mi2) L2, wy3Var2, z02Var, h32Var, et0Var, sk2Var, ((i5 << 3) & 7168) | 221616);
            wy3Var = wy3Var2;
            str2 = "AnimatedVisibility";
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
            str2 = str;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new bn(n24Var, wy3Var, z02Var, h32Var, str2, et0Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [pb5, java.lang.Object] */
    public static l90 k0(j90 j90Var) {
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = j90Var.getClass();
        try {
            Object i = j90Var.i(obj);
            if (i != null) {
                obj.a = i;
                return l90Var;
            }
            return l90Var;
        } catch (Exception e) {
            l90Var.b(e);
            return l90Var;
        }
    }

    public static final void l(tr5 tr5Var, boolean z, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z2;
        wy3 wy3Var;
        z02 z02Var2;
        h32 h32Var2;
        String str2;
        j20 j20Var;
        int i3;
        int i4;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(234057107);
        if ((i & 48) == 0) {
            if (sk2Var.g(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 = i | i4;
        } else {
            i2 = i;
        }
        int i5 = i2 | 224640;
        if ((i & 1572864) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i5 |= i3;
        }
        if ((599185 & i5) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i5 & 1, z2)) {
            z02 a = t02.d(null, 3).a(t02.a(15));
            h32 e = t02.e(null, 3);
            y55 y55Var = tc7.a;
            sc6 P0 = P0(RecyclerView.A1, 400.0f, new i33(4294967297L), 1);
            h20 h20Var = y60.l0;
            yd ydVar = yd.w0;
            if (b53.x(h20Var, y60.j0)) {
                j20Var = y60.Y;
            } else if (b53.x(h20Var, h20Var)) {
                j20Var = y60.c0;
            } else {
                j20Var = y60.Z;
            }
            h32 a2 = e.a(t02.f(P0, j20Var, new s02(0, ydVar)));
            int i6 = i5 >> 3;
            kx6 V = a53.V(Boolean.valueOf(z), "AnimatedVisibility", sk2Var, (i6 & 14) | ((i5 >> 12) & 112), 0);
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = yd.i0;
                sk2Var.h0(L2);
            }
            int i7 = (i5 & 57344) | (i5 & 896) | 48 | (i5 & 7168) | (i6 & 458752);
            wy3 wy3Var2 = wy3.a;
            o(V, (mi2) L2, wy3Var2, a, a2, et0Var, sk2Var, i7);
            wy3Var = wy3Var2;
            z02Var2 = a;
            h32Var2 = a2;
            str2 = "AnimatedVisibility";
        } else {
            sk2Var.R();
            wy3Var = zy3Var;
            z02Var2 = z02Var;
            h32Var2 = h32Var;
            str2 = str;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new un(tr5Var, z, wy3Var, z02Var2, h32Var2, str2, et0Var, i, 0);
        }
    }

    public static Type l0(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return l0(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return l0(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static final void m(boolean z, zy3 zy3Var, z02 z02Var, h32 h32Var, String str, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        int i3;
        boolean z2;
        String str2;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1448730565);
        if (sk2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (sk2Var.f(zy3Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 24576;
        if ((74899 & i5) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var.O(i5 & 1, z2)) {
            kx6 V = a53.V(Boolean.valueOf(z), "AnimatedVisibility", sk2Var, (i5 & 14) | 48, 0);
            Object L2 = sk2Var.L();
            if (L2 == su0.a) {
                L2 = yd.h0;
                sk2Var.h0(L2);
            }
            o(V, (mi2) L2, zy3Var, z02Var, h32Var, et0Var, sk2Var, ((i5 << 3) & 896) | 224304);
            str2 = "AnimatedVisibility";
        } else {
            sk2Var.R();
            str2 = str;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new tn(z, zy3Var, z02Var, h32Var, str2, et0Var, i);
        }
    }

    public static Type m0(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i >= 0 && i < actualTypeArguments.length) {
            Type type = actualTypeArguments[i];
            if (type instanceof WildcardType) {
                return ((WildcardType) type).getUpperBounds()[0];
            }
            return type;
        }
        StringBuilder s = wh1.s("Index ", i, " not in range [0,");
        s.append(actualTypeArguments.length);
        s.append(") for ");
        s.append(parameterizedType);
        throw new IllegalArgumentException(s.toString());
    }

    public static Class n0(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            c44.r();
            return null;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(n0(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return n0(((WildcardType) type).getUpperBounds()[0]);
            }
            StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
            sb.append(type);
            vd6.h(sb, "> is of type ", type.getClass().getName());
            return null;
        }
    }

    public static final void o(kx6 kx6Var, mi2 mi2Var, zy3 zy3Var, z02 z02Var, h32 h32Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        z02 z02Var2;
        h32 h32Var2;
        et0 et0Var2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1706321816);
        if ((i & 6) == 0) {
            if (sk2Var.f(kx6Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.h(mi2Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.f(zy3Var)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            z02Var2 = z02Var;
            if (sk2Var.f(z02Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            z02Var2 = z02Var;
        }
        if ((i & 24576) == 0) {
            h32Var2 = h32Var;
            if (sk2Var.f(h32Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        } else {
            h32Var2 = h32Var;
        }
        if ((i & 196608) == 0) {
            et0Var2 = et0Var;
            if (sk2Var.h(et0Var2)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i2 |= i3;
        } else {
            et0Var2 = et0Var;
        }
        boolean z3 = false;
        if ((74899 & i2) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i2 & 1, z)) {
            int i9 = i2 & 112;
            if (i9 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i10 = i2 & 14;
            if (i10 == 4) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object L2 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (z4 || L2 == sn1Var) {
                L2 = new vn(mi2Var, kx6Var);
                sk2Var.h0(L2);
            }
            zy3 U = b53.U(zy3Var, (bj2) L2);
            Object L3 = sk2Var.L();
            if (L3 == sn1Var) {
                L3 = dn.R;
                sk2Var.h0(L3);
            }
            d(kx6Var, mi2Var, U, z02Var2, h32Var2, (aj2) L3, et0Var2, sk2Var, 196608 | i10 | i9 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new cn(kx6Var, mi2Var, zy3Var, z02Var, h32Var, et0Var, i);
        }
    }

    public static Type o0(Type type, Class cls) {
        if (Map.class.isAssignableFrom(cls)) {
            return I0(type, cls, l0(type, cls, Map.class));
        }
        c44.r();
        return null;
    }

    public static final void p(vy vyVar, boolean z, g56 g56Var, gn gnVar, ki2 ki2Var, ki2 ki2Var2, ki2 ki2Var3, tu0 tu0Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        sk2 sk2Var;
        String str;
        g56Var.getClass();
        gnVar.getClass();
        ki2Var.getClass();
        ki2Var2.getClass();
        ki2Var3.getClass();
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(2119961070);
        if (sk2Var2.h(vyVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (sk2Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (sk2Var2.f(g56Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (sk2Var2.h(gnVar)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (sk2Var2.h(ki2Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (sk2Var2.h(ki2Var2)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if (sk2Var2.h(ki2Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if ((599187 & i15) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (sk2Var2.O(i15 & 1, z2)) {
            UUID uuid = vyVar.a;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String str2 = str;
            String str3 = vyVar.b;
            sk2Var2.Y(236159766);
            tv c02 = mh7.c0(vyVar, hi2.t(xq3.a, sk2Var2), tv.o0, null, r01.b, 1, sk2Var2);
            sk2Var2.p(false);
            int i16 = i15 << 9;
            q(str2, str3, c02, z, true, g56Var, gnVar, ki2Var, ki2Var2, ki2Var3, sk2Var2, ((i15 << 6) & 7168) | 24576 | (458752 & i16) | (3670016 & i16) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192));
            sk2Var = sk2Var2;
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new xy(vyVar, z, g56Var, gnVar, ki2Var, ki2Var2, ki2Var3, i);
        }
    }

    public static final void q(final String str, final String str2, final qi4 qi4Var, final boolean z, final boolean z2, final g56 g56Var, final gn gnVar, final ki2 ki2Var, final ki2 ki2Var2, final ki2 ki2Var3, tu0 tu0Var, final int i) {
        int i2;
        boolean z3;
        sk2 sk2Var;
        k24 k24Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean h;
        int i10;
        int i11;
        int i12;
        sk2 sk2Var2 = (sk2) tu0Var;
        sk2Var2.Z(1538479222);
        if ((i & 6) == 0) {
            if (sk2Var2.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var2.f(str2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i & 512) == 0) {
                h = sk2Var2.f(qi4Var);
            } else {
                h = sk2Var2.h(qi4Var);
            }
            if (h) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (sk2Var2.g(z)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (sk2Var2.g(z2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (sk2Var2.f(g56Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (sk2Var2.h(gnVar)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (sk2Var2.h(ki2Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (sk2Var2.h(ki2Var2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((805306368 & i) == 0) {
            if (sk2Var2.h(ki2Var3)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        int i13 = i2;
        if ((306783379 & i13) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (sk2Var2.O(i13 & 1, z3)) {
            Object L2 = sk2Var2.L();
            if (L2 == su0.a) {
                L2 = me2.G(Boolean.FALSE);
                sk2Var2.h0(L2);
            }
            k24 k24Var2 = (k24) L2;
            zy3 zy3Var = wy3.a;
            if (z) {
                sk2Var2.X(1238955584);
                k24Var = k24Var2;
                zy3Var = b53.z(3.0f, mj2.C(sk2Var2).j, zy3Var, ((m36) sk2Var2.j(n36.a)).b);
                sk2Var2.p(false);
            } else {
                k24Var = k24Var2;
                sk2Var2.X(1239158572);
                sk2Var2.p(false);
            }
            zy3 zy3Var2 = zy3Var;
            final k24 k24Var3 = k24Var;
            et0 H0 = H0(-1422284196, new aj2() { // from class: yy
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    boolean z4;
                    dn dnVar;
                    dn dnVar2;
                    mv0 mv0Var;
                    float f;
                    wy3 wy3Var;
                    gn gnVar2;
                    tu0 tu0Var2 = (tu0) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    sk2 sk2Var3 = (sk2) tu0Var2;
                    if (sk2Var3.O(intValue & 1, z4)) {
                        wy3 wy3Var2 = wy3.a;
                        zy3 f02 = n40.f0(b53.X(wy3Var2, 4.0f), u43.Min);
                        lr0 a = jr0.a(rt.c, y60.j0, sk2Var3, 0);
                        int hashCode = Long.hashCode(sk2Var3.T);
                        sm4 l = sk2Var3.l();
                        zy3 e02 = l07.e0(sk2Var3, f02);
                        nu0.i.getClass();
                        mv0 mv0Var2 = mu0.b;
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(mv0Var2);
                        } else {
                            sk2Var3.k0();
                        }
                        dn dnVar3 = mu0.f;
                        oo2.S(sk2Var3, dnVar3, a);
                        dn dnVar4 = mu0.e;
                        oo2.S(sk2Var3, dnVar4, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        dn dnVar5 = mu0.g;
                        oo2.S(sk2Var3, dnVar5, valueOf);
                        yd ydVar = mu0.h;
                        oo2.P(sk2Var3, ydVar);
                        dn dnVar6 = mu0.d;
                        oo2.S(sk2Var3, dnVar6, e02);
                        if (((Boolean) sk2Var3.j(j23.a)).booleanValue()) {
                            sk2Var3.X(-1061882019);
                            d50.a(dk7.i(b53.b0(l07.p(o76.c(wy3Var2, 1.0f), 1.0f), 4.0f, 4.0f, 4.0f, RecyclerView.A1, 8), xq0.c, iq2.g), sk2Var3, 6);
                            sk2Var3.p(false);
                            mv0Var = mv0Var2;
                            dnVar = dnVar3;
                            dnVar2 = dnVar6;
                            f = 1.0f;
                            wy3Var = wy3Var2;
                        } else {
                            sk2Var3.X(-1061699212);
                            g56 g56Var2 = g56.this;
                            qi4 qi4Var2 = qi4Var;
                            if (g56Var2 != null && (gnVar2 = gnVar) != null) {
                                sk2Var3.X(-1061627261);
                                zy3 b0 = b53.b0(wy3Var2, 4.0f, 4.0f, 4.0f, RecyclerView.A1, 8);
                                String str3 = str;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                zy3 p = l07.p(o76.c(g56.e(g56Var2, b0, g56.d(str3, sk2Var3), gnVar2), 1.0f), 1.0f);
                                dnVar2 = dnVar6;
                                dnVar = dnVar3;
                                mv0Var = mv0Var2;
                                cg2.c(qi4Var2, p, null, null, RecyclerView.A1, sk2Var3, 56, 120);
                                sk2Var3.p(false);
                                wy3Var = wy3Var2;
                                f = 1.0f;
                            } else {
                                dnVar = dnVar3;
                                dnVar2 = dnVar6;
                                mv0Var = mv0Var2;
                                sk2Var3.X(-1060871822);
                                f = 1.0f;
                                wy3Var = wy3Var2;
                                cg2.c(qi4Var2, l07.p(o76.c(b53.b0(wy3Var2, 4.0f, 4.0f, 4.0f, RecyclerView.A1, 8), 1.0f), 1.0f), null, null, RecyclerView.A1, sk2Var3, 440, 120);
                                sk2Var3.p(false);
                            }
                            sk2Var3.p(false);
                        }
                        zy3 b02 = b53.b0(o76.c(wy3Var, f), 8.0f, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, 14);
                        sr5 a2 = rr5.a(rt.a, y60.h0, sk2Var3, 48);
                        int hashCode2 = Long.hashCode(sk2Var3.T);
                        sm4 l2 = sk2Var3.l();
                        zy3 e03 = l07.e0(sk2Var3, b02);
                        sk2Var3.b0();
                        if (sk2Var3.S) {
                            sk2Var3.k(mv0Var);
                        } else {
                            sk2Var3.k0();
                        }
                        oo2.S(sk2Var3, dnVar, a2);
                        oo2.S(sk2Var3, dnVar4, l2);
                        b31.x(hashCode2, sk2Var3, dnVar5, sk2Var3, ydVar);
                        oo2.S(sk2Var3, dnVar2, e03);
                        ir6.b(str2, new xg3(f, true), 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, null, sk2Var3, 0, 3120, 120828);
                        sk2 sk2Var4 = sk2Var3;
                        if (z2) {
                            sk2Var4.X(1139922924);
                            Object L3 = sk2Var4.L();
                            sn1 sn1Var = su0.a;
                            k24 k24Var4 = k24Var3;
                            if (L3 == sn1Var) {
                                L3 = new f4(k24Var4, 4);
                                sk2Var4.h0(L3);
                            }
                            oo2.c((ki2) L3, null, false, ct3.H0(120533037, new w3(k24Var4, ki2Var2, ki2Var3, 3), sk2Var4), sk2Var4, 24582, 14);
                            sk2Var4 = sk2Var4;
                            sk2Var4.p(false);
                        } else {
                            sk2Var4.X(1141245260);
                            sk2Var4.p(false);
                        }
                        sk2Var4.p(true);
                        sk2Var4.p(true);
                    } else {
                        sk2Var3.R();
                    }
                    return o27.a;
                }
            }, sk2Var2);
            fr5 fr5Var = ((m36) sk2Var2.j(n36.a)).b;
            long j = ((hr0) sk2Var2.j(ir0.a)).j();
            sk2Var = sk2Var2;
            mj2.g(ki2Var, zy3Var2, true, fr5Var, j, ir0.b(j, sk2Var2), 4.0f, null, H0, sk2Var, (((i13 >> 21) & 14) | 817889280) & 2147483646, 0);
        } else {
            sk2Var = sk2Var2;
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new aj2() { // from class: zy
                @Override // defpackage.aj2
                public final Object j(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ct3.q(str, str2, qi4Var, z, z2, g56Var, gnVar, ki2Var, ki2Var2, ki2Var3, (tu0) obj, ep2.I(i | 1));
                    return o27.a;
                }
            };
        }
    }

    public static final void r(zy3 zy3Var, ub ubVar, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        j20 j20Var;
        int i3;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(380139498);
        if ((i & 6) == 0) {
            if (sk2Var.f(zy3Var)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i4 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i4 & 1, z)) {
            j20 j20Var2 = y60.L;
            tv3 d = d50.d(j20Var2, false);
            boolean f = sk2Var.f(d);
            Object L2 = sk2Var.L();
            if (f || L2 == su0.a) {
                L2 = new s4(3, d, et0Var);
                sk2Var.h0(L2);
            }
            vh6.a(zy3Var, (aj2) L2, sk2Var, i4 & 14, 0);
            j20Var = j20Var2;
        } else {
            sk2Var.R();
            j20Var = ubVar;
        }
        ub ubVar2 = j20Var;
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new fl(zy3Var, ubVar2, et0Var, i, 2);
        }
    }

    public static boolean r0(Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (r0(type2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return r0(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                name = "null";
            } else {
                name = type.getClass().getName();
            }
            vd6.g("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", name);
            return false;
        }
    }

    public static final id s(nh nhVar) {
        Canvas canvas = jd.a;
        id idVar = new id();
        idVar.a = new Canvas(f34.s(nhVar));
        return idVar;
    }

    public static zy2 t0(jm1 jm1Var, ka5 ka5Var, int i) {
        if ((i & 2) != 0) {
            ka5Var = ka5.Restart;
        }
        return new zy2(jm1Var, ka5Var);
    }

    public static boolean v0(Annotation[] annotationArr, Class cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static final void w(kx6 kx6Var, zy3 zy3Var, y72 y72Var, mi2 mi2Var, et0 et0Var, tu0 tu0Var, int i) {
        int i2;
        boolean z;
        mi2 mi2Var2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        ku0 ku0Var = kx6Var.a;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-1877370462);
        if ((i & 6) == 0) {
            if (sk2Var.f(kx6Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (sk2Var.f(zy3Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (sk2Var.h(y72Var)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        int i7 = i2 | 3072;
        if ((i & 24576) == 0) {
            if (sk2Var.h(et0Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i7 |= i3;
        }
        if ((i7 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i7 & 1, z)) {
            Object L2 = sk2Var.L();
            sn1 sn1Var = su0.a;
            if (L2 == sn1Var) {
                L2 = yd.p0;
                sk2Var.h0(L2);
            }
            mi2Var2 = (mi2) L2;
            Object L3 = sk2Var.L();
            xa6 xa6Var = L3;
            if (L3 == sn1Var) {
                xa6 xa6Var2 = new xa6();
                xa6Var2.add(ku0Var.f());
                sk2Var.h0(xa6Var2);
                xa6Var = xa6Var2;
            }
            xa6 xa6Var3 = (xa6) xa6Var;
            Object L4 = sk2Var.L();
            if (L4 == sn1Var) {
                long[] jArr = wu5.a;
                L4 = new d24();
                sk2Var.h0(L4);
            }
            d24 d24Var = (d24) L4;
            tj4 tj4Var = kx6Var.d;
            if (b53.x(ku0Var.f(), tj4Var.getValue())) {
                sk2Var.X(321145192);
                if (xa6Var3.size() == 1 && b53.x(xa6Var3.get(0), tj4Var.getValue())) {
                    sk2Var.X(321469824);
                    sk2Var.p(false);
                } else {
                    sk2Var.X(321279546);
                    if ((i7 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object L5 = sk2Var.L();
                    if (z2 || L5 == sn1Var) {
                        L5 = new yb(12, kx6Var);
                        sk2Var.h0(L5);
                    }
                    tq0.Z0(xa6Var3, (mi2) L5);
                    d24Var.a();
                    sk2Var.p(false);
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(321475776);
                sk2Var.p(false);
            }
            if (!d24Var.b(tj4Var.getValue())) {
                sk2Var.X(321536443);
                ListIterator listIterator = xa6Var3.listIterator();
                int i8 = 0;
                while (true) {
                    wr2 wr2Var = (wr2) listIterator;
                    if (wr2Var.hasNext()) {
                        if (b53.x(mi2Var2.n(wr2Var.next()), mi2Var2.n(tj4Var.getValue()))) {
                            break;
                        }
                        i8++;
                    } else {
                        i8 = -1;
                        break;
                    }
                }
                if (i8 == -1) {
                    xa6Var3.add(tj4Var.getValue());
                } else {
                    xa6Var3.set(i8, tj4Var.getValue());
                }
                d24Var.a();
                int size = xa6Var3.size();
                for (int i9 = 0; i9 < size; i9++) {
                    Object obj = xa6Var3.get(i9);
                    d24Var.m(obj, H0(-934471669, new f41(kx6Var, y72Var, obj, et0Var), sk2Var));
                }
                sk2Var.p(false);
            } else {
                sk2Var.X(322279296);
                sk2Var.p(false);
            }
            tv3 d = d50.d(y60.L, false);
            int hashCode = Long.hashCode(sk2Var.T);
            sm4 l = sk2Var.l();
            zy3 e02 = l07.e0(sk2Var, zy3Var);
            nu0.i.getClass();
            mv0 mv0Var = mu0.b;
            sk2Var.b0();
            if (sk2Var.S) {
                sk2Var.k(mv0Var);
            } else {
                sk2Var.k0();
            }
            oo2.S(sk2Var, mu0.f, d);
            oo2.S(sk2Var, mu0.e, l);
            oo2.N(sk2Var, Integer.valueOf(hashCode), mu0.g);
            oo2.P(sk2Var, mu0.h);
            oo2.S(sk2Var, mu0.d, e02);
            sk2Var.X(-1312707512);
            int size2 = xa6Var3.size();
            for (int i10 = 0; i10 < size2; i10++) {
                Object obj2 = xa6Var3.get(i10);
                sk2Var.V(1171574969, mi2Var2.n(obj2));
                aj2 aj2Var = (aj2) d24Var.g(obj2);
                if (aj2Var == null) {
                    sk2Var.X(1959122128);
                } else {
                    sk2Var.X(1171576145);
                    aj2Var.j(sk2Var, 0);
                }
                sk2Var.p(false);
                sk2Var.p(false);
            }
            sk2Var.p(false);
            sk2Var.p(true);
        } else {
            sk2Var.R();
            mi2Var2 = mi2Var;
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new g41(kx6Var, zy3Var, y72Var, mi2Var2, et0Var, i);
        }
    }

    public static final kb3 w0(mi2 mi2Var) {
        jb3 jb3Var = new jb3();
        mi2Var.n(jb3Var);
        return new kb3(jb3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(java.lang.Object r14, defpackage.zy3 r15, defpackage.y72 r16, java.lang.String r17, defpackage.et0 r18, defpackage.tu0 r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct3.x(java.lang.Object, zy3, y72, java.lang.String, et0, tu0, int, int):void");
    }

    public static final zy3 x0(vi3 vi3Var, l50 l50Var, jf4 jf4Var) {
        return new qi3(vi3Var, l50Var, jf4Var);
    }

    public static IllegalArgumentException y0(Method method, Exception exc, String str, Object... objArr) {
        StringBuilder t = b31.t(String.format(str, objArr), "\n    for method ");
        t.append(method.getDeclaringClass().getSimpleName());
        t.append(".");
        t.append(method.getName());
        return new IllegalArgumentException(t.toString(), exc);
    }

    public static final sd1 z(Context context) {
        float f = context.getResources().getConfiguration().fontScale;
        float f2 = context.getResources().getDisplayMetrics().density;
        he2 a = ie2.a(f);
        if (a == null) {
            a = new yn3(f);
        }
        return new sd1(f2, f, a);
    }

    @Override // defpackage.yu0
    public char B(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return j();
    }

    public abstract boolean B0(int i, KeyEvent keyEvent);

    public boolean C0(KeyEvent keyEvent) {
        return false;
    }

    public boolean D0() {
        return false;
    }

    @Override // defpackage.yu0
    public byte J(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return Q();
    }

    public abstract void J0(boolean z);

    @Override // defpackage.yu0
    public String K(h06 h06Var, int i) {
        h06Var.getClass();
        return X();
    }

    public abstract void K0(boolean z);

    @Override // defpackage.b91
    public int L() {
        Object S = S();
        S.getClass();
        return ((Integer) S).intValue();
    }

    public abstract void L0(boolean z);

    @Override // defpackage.yu0
    public short M(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return W();
    }

    public abstract void M0(String str);

    public boolean N() {
        return false;
    }

    public abstract void N0(CharSequence charSequence);

    @Override // defpackage.yu0
    public boolean O(h06 h06Var, int i) {
        h06Var.getClass();
        return h();
    }

    public abstract void O0();

    public abstract boolean P();

    @Override // defpackage.b91
    public byte Q() {
        Object S = S();
        S.getClass();
        return ((Byte) S).byteValue();
    }

    public j8 Q0(q03 q03Var) {
        return null;
    }

    public Object S() {
        throw new IllegalArgumentException(q75.a(getClass()) + " can't retrieve untyped values");
    }

    @Override // defpackage.b91
    public b91 T(h06 h06Var) {
        h06Var.getClass();
        return this;
    }

    @Override // defpackage.yu0
    public Object U(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        return n(m93Var);
    }

    @Override // defpackage.yu0
    public int V(h06 h06Var, int i) {
        h06Var.getClass();
        return L();
    }

    @Override // defpackage.b91
    public short W() {
        Object S = S();
        S.getClass();
        return ((Short) S).shortValue();
    }

    @Override // defpackage.b91
    public String X() {
        Object S = S();
        S.getClass();
        return (String) S;
    }

    public abstract void Y(boolean z);

    @Override // defpackage.b91
    public float Z() {
        Object S = S();
        S.getClass();
        return ((Float) S).floatValue();
    }

    @Override // defpackage.yu0
    public void a(h06 h06Var) {
        h06Var.getClass();
    }

    @Override // defpackage.yu0
    public long a0(h06 h06Var, int i) {
        h06Var.getClass();
        return e();
    }

    @Override // defpackage.b91
    public yu0 c(h06 h06Var) {
        h06Var.getClass();
        return this;
    }

    @Override // defpackage.b91
    public int c0(h06 h06Var) {
        h06Var.getClass();
        Object S = S();
        S.getClass();
        return ((Integer) S).intValue();
    }

    @Override // defpackage.b91
    public double d0() {
        Object S = S();
        S.getClass();
        return ((Double) S).doubleValue();
    }

    @Override // defpackage.b91
    public long e() {
        Object S = S();
        S.getClass();
        return ((Long) S).longValue();
    }

    @Override // defpackage.yu0
    public b91 f(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return T(rt4Var.j(i));
    }

    @Override // defpackage.b91
    public boolean h() {
        Object S = S();
        S.getClass();
        return ((Boolean) S).booleanValue();
    }

    @Override // defpackage.b91
    public boolean i() {
        return true;
    }

    @Override // defpackage.b91
    public char j() {
        Object S = S();
        S.getClass();
        return ((Character) S).charValue();
    }

    public abstract int j0();

    public abstract Context p0();

    public abstract CharSequence q0();

    public abstract void s0();

    @Override // defpackage.yu0
    public float t(h06 h06Var, int i) {
        h06Var.getClass();
        return Z();
    }

    @Override // defpackage.yu0
    public Object u(h06 h06Var, int i, m93 m93Var, Object obj) {
        h06Var.getClass();
        m93Var.getClass();
        if (!m93Var.e().h() && !i()) {
            return null;
        }
        return n(m93Var);
    }

    public boolean u0() {
        return false;
    }

    @Override // defpackage.yu0
    public double y(rt4 rt4Var, int i) {
        rt4Var.getClass();
        return d0();
    }

    public abstract void z0();

    public void A0() {
    }
}
