package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.stormds.emulator.R;
import java.io.Serializable;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz1  reason: default package */
/* loaded from: classes.dex */
public final class sz1 extends qo7 {
    public final long A;
    public final de5 A0;
    public final of6 B;
    public final tp6 B0;
    public final be5 C;
    public final de5 C0;
    public final tp6 D;
    public final of6 D0;
    public ap6 E;
    public final be5 E0;
    public ap6 F;
    public final of6 F0;
    public b G;
    public final be5 G0;
    public d H;
    public final tp6 H0;
    public boolean I;
    public final de5 I0;
    public boolean J;
    public final of6 J0;
    public boolean K;
    public final be5 K0;
    public Long L;
    public final ex6 L0;
    public qz1 M;
    public final String M0;
    public RARuntimeBridgeConfig N;
    public final of6 N0;
    public c O;
    public final be5 O0;
    public final Object P;
    public final b7 P0;
    public String Q;
    public final tp6 Q0;
    public String R;
    public final de5 R0;
    public tu0 S;
    public final tp6 S0;
    public boolean T;
    public final of6 T0;
    public boolean U;
    public final be5 U0;
    public final s35 V;
    public final tp6 V0;
    public final LinkedHashSet W;
    public final de5 W0;
    public final LinkedHashMap X;
    public final tp6 X0;
    public final LinkedHashMap Y;
    public final de5 Y0;
    public final ks3 Z;
    public final tp6 Z0;
    public final bg1 a0;
    public final de5 a1;
    public final Context b;
    public nv4 b0;
    public final tp6 b1;
    public final kd6 c;
    public ad5 c0;
    public final de5 c1;
    public final cn5 d;
    public ap6 d0;
    public final tp6 d1;
    public final p06 e;
    public v80 e0;
    public final de5 e1;
    public final hp0 f;
    public final q33 f0;
    public final tp6 f1;
    public final pn5 g;
    public final q33 g0;
    public final de5 g1;
    public final qf4 h;
    public final eb h0;
    public final tp6 h1;
    public final oj4 i;
    public final tp6 i0;
    public final de5 i1;
    public final ck4 j;
    public final AtomicInteger j0;
    public final tp6 j1;
    public final hn5 k;
    public final hb4 k0;
    public final de5 k1;
    public final vk6 l;
    public final AtomicBoolean l0;
    public final tp6 l1;
    public final xv2 m;
    public tu0 m0;
    public final de5 m1;
    public final ve4 n;
    public lz1 n0;
    public pq5 n1;
    public final jf4 o;
    public final iw2 o0;
    public Long o1;
    public final mp p;
    public final tp6 p0;
    public final wa3 q;
    public final de5 q0;
    public final ha3 r;
    public final tp6 r0;
    public final yb2 s;
    public final be5 s0;
    public final d76 t;
    public final tp6 t0;
    public final ci0 u;
    public final de5 u0;
    public final jh v;
    public final tp6 v0;
    public final sx1 w;
    public final de5 w0;
    public final ci0 x;
    public final tp6 x0;
    public final ce6 y;
    public final de5 y0;
    public final o41 z;
    public final tp6 z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sz1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CACHE = new a("CACHE", 0);
        public static final a NETWORK = new a("NETWORK", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CACHE, NETWORK};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sz1$b */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b ONLINE_LIVE = new b("ONLINE_LIVE", 0);
        public static final b OFFLINE_ACCUMULATING = new b("OFFLINE_ACCUMULATING", 1);
        public static final b RECONCILING_RA_SUBMISSIONS = new b("RECONCILING_RA_SUBMISSIONS", 2);

        private static final /* synthetic */ b[] $values() {
            return new b[]{ONLINE_LIVE, OFFLINE_ACCUMULATING, RECONCILING_RA_SUBMISSIONS};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private b(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sz1$c */
    /* loaded from: classes.dex */
    public static final class c {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c DISABLED = new c("DISABLED", 0, "disabled");
        public static final c LEGACY = new c("LEGACY", 1, "legacy");
        public static final c RC_CLIENT = new c("RC_CLIENT", 2, "rc_client");
        public static final c RC_CLIENT_OFFLINE = new c("RC_CLIENT_OFFLINE", 3, "rc_client_offline");
        private final String traceValue;

        private static final /* synthetic */ c[] $values() {
            return new c[]{DISABLED, LEGACY, RC_CLIENT, RC_CLIENT_OFFLINE};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private c(String str, int i, String str2) {
            this.traceValue = str2;
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final String getTraceValue() {
            return this.traceValue;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sz1$d */
    /* loaded from: classes.dex */
    public static final class d {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d SOFTCORE = new d("SOFTCORE", 0);
        public static final d HARDCORE = new d("HARDCORE", 1);

        private static final /* synthetic */ d[] $values() {
            return new d[]{SOFTCORE, HARDCORE};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private d(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [q33, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14, types: [q33, java.lang.Object] */
    public sz1(Context context, kd6 kd6Var, cn5 cn5Var, p06 p06Var, hp0 hp0Var, pn5 pn5Var, qf4 qf4Var, oj4 oj4Var, ck4 ck4Var, hn5 hn5Var, vk6 vk6Var, xv2 xv2Var, ve4 ve4Var, jf4 jf4Var, mp mpVar, wa3 wa3Var, ha3 ha3Var, yb2 yb2Var, d76 d76Var, ci0 ci0Var, jh jhVar, sx1 sx1Var, ci0 ci0Var2, ce6 ce6Var, v46 v46Var) {
        Uri uri;
        kd6Var.getClass();
        cn5Var.getClass();
        p06Var.getClass();
        hp0Var.getClass();
        pn5Var.getClass();
        oj4Var.getClass();
        ck4Var.getClass();
        hn5Var.getClass();
        vk6Var.getClass();
        xv2Var.getClass();
        ve4Var.getClass();
        jf4Var.getClass();
        mpVar.getClass();
        wa3Var.getClass();
        ha3Var.getClass();
        yb2Var.getClass();
        d76Var.getClass();
        jhVar.getClass();
        sx1Var.getClass();
        ce6Var.getClass();
        v46Var.getClass();
        this.b = context;
        this.c = kd6Var;
        this.d = cn5Var;
        this.e = p06Var;
        this.f = hp0Var;
        this.g = pn5Var;
        this.h = qf4Var;
        this.i = oj4Var;
        this.j = ck4Var;
        this.k = hn5Var;
        this.l = vk6Var;
        this.m = xv2Var;
        this.n = ve4Var;
        this.o = jf4Var;
        this.p = mpVar;
        this.q = wa3Var;
        this.r = ha3Var;
        this.s = yb2Var;
        this.t = d76Var;
        this.u = ci0Var;
        this.v = jhVar;
        this.w = sx1Var;
        this.x = ci0Var2;
        this.y = ce6Var;
        o41 o41Var = new o41();
        o41Var.B = vt1.A;
        this.z = o41Var;
        this.A = 60000L;
        yh2 yh2Var = null;
        of6 b2 = pf6.b(0, 1, null, 5);
        this.B = b2;
        this.C = new be5(b2);
        this.D = up6.a(Boolean.FALSE);
        this.G = b.ONLINE_LIVE;
        this.H = d.SOFTCORE;
        this.O = c.DISABLED;
        this.P = new Object();
        this.V = new s35(4);
        this.W = new LinkedHashSet();
        this.X = new LinkedHashMap();
        this.Y = new LinkedHashMap();
        this.Z = new ks3();
        this.a0 = new bg1(1);
        this.f0 = new Object();
        this.g0 = new Object();
        eb ebVar = new eb(17);
        this.h0 = ebVar;
        this.i0 = up6.a(null);
        this.j0 = new AtomicInteger(0);
        this.k0 = new hb4();
        this.l0 = new AtomicBoolean(false);
        this.o0 = new iw2(new o12(this, (r41) null, 0), new p12(0, null, this));
        tp6 a2 = up6.a(ey1.a);
        this.p0 = a2;
        this.q0 = new de5(a2);
        this.r0 = up6.a(null);
        this.s0 = f04.P((xf2) ci0Var.h, to7.a(this), dh6.b, 0);
        tp6 a3 = up6.a(null);
        this.t0 = a3;
        this.u0 = new de5(a3);
        tp6 a4 = up6.a(null);
        this.v0 = a4;
        ng6 ng6Var = (ng6) kd6Var;
        ex6 ex6Var = ng6Var.g;
        this.w0 = f04.R(new xf2((tp6) ex6Var.getValue(), a4, new m02(3, null, 0)), to7.a(this), dh6.a, (u41) ((tp6) ex6Var.getValue()).getValue());
        tp6 a5 = up6.a(null);
        this.x0 = a5;
        this.y0 = new de5(a5);
        t26 t26Var = t26.c;
        tp6 a6 = up6.a(t26Var);
        this.z0 = a6;
        this.A0 = new de5(a6);
        tp6 a7 = up6.a(t26Var);
        this.B0 = a7;
        this.C0 = new de5(a7);
        of6 b3 = pf6.b(0, 100, m80.DROP_OLDEST, 1);
        this.D0 = b3;
        this.E0 = new be5(b3);
        of6 b4 = pf6.b(0, 100, m80.SUSPEND, 1);
        this.F0 = b4;
        this.G0 = new be5(b4);
        tp6 a8 = up6.a(null);
        this.H0 = a8;
        this.I0 = new de5(a8);
        of6 a9 = bl2.a();
        this.J0 = a9;
        this.K0 = new be5(a9);
        this.L0 = new ex6(new dz1(this, 0));
        this.M0 = "melonDualDS-android/0.7.0";
        of6 a10 = bl2.a();
        this.N0 = a10;
        this.O0 = new be5(a10);
        this.P0 = new b7((tp6) ci0Var2.g, 13);
        this.Q0 = up6.a(null);
        this.R0 = (de5) ebVar.X;
        this.S0 = up6.a(ub5.ONLINE_LIVE);
        of6 a11 = bl2.a();
        this.T0 = a11;
        this.U0 = new be5(a11);
        SharedPreferences sharedPreferences = ng6Var.b;
        tp6 a12 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("external_display_keep_ratio", true)));
        this.V0 = a12;
        this.W0 = new de5(a12);
        tp6 a13 = up6.a(ng6Var.i());
        this.X0 = a13;
        this.Y0 = new de5(a13);
        tp6 a14 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_integer_scale", false)));
        this.Z0 = a14;
        this.a1 = new de5(a14);
        tp6 a15 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_internal_fill_height", false)));
        this.b1 = a15;
        this.c1 = new de5(a15);
        tp6 a16 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_internal_fill_width", false)));
        this.d1 = a16;
        this.e1 = new de5(a16);
        tp6 a17 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_external_fill_height", false)));
        this.f1 = a17;
        this.g1 = new de5(a17);
        tp6 a18 = up6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_external_fill_width", false)));
        this.h1 = a18;
        this.i1 = new de5(a18);
        tp6 a19 = up6.a(ng6Var.h());
        this.j1 = a19;
        this.k1 = new de5(a19);
        tp6 a20 = up6.a(ng6Var.g());
        this.l1 = a20;
        this.m1 = new de5(a20);
        hv.L(to7.a(this), null, null, new hz1(2, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(3, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(4, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(5, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(6, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(7, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(8, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(9, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(10, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(0, null, this), 3);
        hv.L(to7.a(this), null, null, new hz1(1, null, this), 3);
        if (nb3.k(v46Var.a("boot_firmware_only"), Boolean.TRUE)) {
            Integer num = (Integer) v46Var.a("boot_firmware_console");
            if (num != null) {
                yh2Var = new bj3((ConsoleType) ((u52) ConsoleType.getEntries()).get(num.intValue()));
            }
        } else {
            wz5 wz5Var = (wz5) v46Var.a("rom");
            if (wz5Var != null) {
                yh2Var = new cj3(wz5Var.A);
            } else {
                Object a21 = v46Var.a("uri");
                if (a21 instanceof String) {
                    uri = Uri.parse((String) a21);
                } else {
                    uri = a21 instanceof Uri ? (Uri) a21 : null;
                }
                if (uri != null) {
                    yh2Var = new ej3(uri);
                } else {
                    String str = (String) v46Var.a("PATH");
                    if (str != null) {
                        yh2Var = new dj3(str);
                    }
                }
            }
        }
        if (yh2Var != null) {
            x0(yh2Var);
        } else {
            a11.k(jy1.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r1 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
        if (r1 != 0) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object A(sz1 sz1Var, String str, String str2, mc5 mc5Var, s41 s41Var) {
        j12 j12Var;
        int i;
        String str3;
        String str4;
        mc5 mc5Var2;
        int intValue;
        String str5;
        kz1 kz1Var;
        kz1 kz1Var2;
        String str6;
        eb ebVar = sz1Var.h0;
        if (s41Var instanceof j12) {
            j12Var = (j12) s41Var;
            int i2 = j12Var.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j12Var.g0 = i2 - Integer.MIN_VALUE;
                Object obj = j12Var.e0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = j12Var.g0;
                boolean z = false;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    kz1Var2 = j12Var.Z;
                                    str5 = j12Var.X;
                                    str6 = j12Var.R;
                                    oi2.Y(obj);
                                    sz1Var.m.b(str6, str5);
                                    ebVar.n(kz1Var2.a);
                                    z = true;
                                    return Boolean.valueOf(z);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kz1Var = j12Var.Z;
                            oi2.Y(obj);
                            aw2 aw2Var = (aw2) obj;
                            of6 of6Var = sz1Var.J0;
                            int i3 = aw2Var.a;
                            int i4 = aw2Var.b;
                            of6Var.k(new x67(i3, i4));
                            ebVar.n(kz1Var.a);
                        } else {
                            int i5 = j12Var.d0;
                            str3 = j12Var.X;
                            str4 = j12Var.R;
                            oi2.Y(obj);
                            intValue = i5;
                            str5 = str3;
                            kz1 kz1Var3 = (kz1) obj;
                            int i6 = wz1.c[kz1Var3.b.ordinal()];
                            if (i6 != 1) {
                                if (i6 != 2) {
                                    if (i6 == 3) {
                                        j12Var.R = str4;
                                        j12Var.X = str5;
                                        j12Var.Y = null;
                                        j12Var.Z = kz1Var3;
                                        j12Var.d0 = intValue;
                                        j12Var.g0 = 4;
                                        if (sz1Var.l0(j12Var) != obj2) {
                                            kz1Var2 = kz1Var3;
                                            str6 = str4;
                                            sz1Var.m.b(str6, str5);
                                            ebVar.n(kz1Var2.a);
                                            z = true;
                                            return Boolean.valueOf(z);
                                        }
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    ebVar.n(kz1Var3.a);
                                    return Boolean.valueOf(z);
                                }
                            } else {
                                j12Var.R = null;
                                j12Var.X = null;
                                j12Var.Y = null;
                                j12Var.Z = kz1Var3;
                                j12Var.d0 = intValue;
                                j12Var.g0 = 3;
                                Object m0 = sz1Var.m0(j12Var);
                                if (m0 != obj2) {
                                    kz1Var = kz1Var3;
                                    obj = m0;
                                    aw2 aw2Var2 = (aw2) obj;
                                    of6 of6Var2 = sz1Var.J0;
                                    int i32 = aw2Var2.a;
                                    int i42 = aw2Var2.b;
                                    of6Var2.k(new x67(i32, i42));
                                    ebVar.n(kz1Var.a);
                                }
                            }
                            return obj2;
                        }
                    } else {
                        mc5Var2 = j12Var.Y;
                        str3 = j12Var.X;
                        str4 = j12Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    iw2 iw2Var = sz1Var.o0;
                    j12Var.R = str;
                    str3 = str2;
                    j12Var.X = str3;
                    j12Var.Y = mc5Var;
                    j12Var.g0 = 1;
                    obj = iw2Var.f(j12Var);
                    if (obj != obj2) {
                        str4 = str;
                        mc5Var2 = mc5Var;
                    }
                    return obj2;
                }
                intValue = ((Number) obj).intValue();
                if (intValue != 0) {
                    return Boolean.TRUE;
                }
                lc5 lc5Var = new lc5(intValue, intValue, 0, intValue, 0);
                j12Var.R = str4;
                j12Var.X = str3;
                j12Var.Y = null;
                j12Var.d0 = intValue;
                j12Var.g0 = 2;
                obj = sz1Var.Z(lc5Var, mc5Var2, j12Var);
            }
        }
        j12Var = new j12(sz1Var, s41Var);
        Object obj3 = j12Var.e0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = j12Var.g0;
        boolean z2 = false;
        if (i == 0) {
        }
        intValue = ((Number) obj3).intValue();
        if (intValue != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
        if (r1.u0(r0, r57, r13) == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
        if (r5 == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
        if (r14.a(r1, r13) == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017a, code lost:
        if (r5 == r15) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object B(sz1 sz1Var, long j, o75 o75Var, hb5 hb5Var, s41 s41Var) {
        Object obj;
        k12 k12Var;
        qz1 qz1Var;
        ne2 ne2Var;
        ik4 ik4Var;
        Object p0;
        String str;
        Object a2;
        Object obj2;
        x61 x61Var;
        qz1 qz1Var2;
        k12 k12Var2;
        x61 x61Var2;
        qz1 qz1Var3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        o75 o75Var2;
        Object obj7;
        long j2;
        long j3;
        Object obj8;
        Object obj9;
        k12 k12Var3;
        long j4;
        qz1 qz1Var4;
        long j5;
        o75 o75Var3;
        de1 de1Var;
        l12 l12Var;
        qz1 qz1Var5;
        long j6;
        o75 o75Var4;
        Object obj10;
        long j7;
        long j8;
        Throwable a3;
        sz1 sz1Var2 = sz1Var;
        long j9 = j;
        o75 o75Var5 = o75Var;
        ne2 ne2Var2 = sz1Var2.F0;
        jf4 jf4Var = sz1Var2.o;
        Object obj11 = jg7.a;
        Object obj12 = "pending_sync";
        if (!(s41Var instanceof k12)) {
            obj = "session_id";
        } else {
            k12Var = (k12) s41Var;
            obj = "session_id";
            int i = k12Var.f0;
            if ((i & Integer.MIN_VALUE) != 0) {
                k12Var.f0 = i - Integer.MIN_VALUE;
                Object obj13 = k12Var.d0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                switch (k12Var.f0) {
                    case 0:
                        oi2.Y(obj13);
                        if (sz1Var2.I && o75Var5 != null) {
                            if (jf4Var.a()) {
                                if (hb5Var != null) {
                                    k12Var.Y = null;
                                    k12Var.R = j9;
                                    k12Var.f0 = 1;
                                    break;
                                }
                                return obj11;
                            }
                            if (hb5Var != null) {
                                k12Var.Y = o75Var5;
                                k12Var.R = j9;
                                k12Var.f0 = 2;
                                synchronized (sz1Var2.P) {
                                    str = sz1Var2.R;
                                }
                                if (str == null) {
                                    a2 = Boolean.FALSE;
                                } else {
                                    a2 = sz1Var2.o0.a(str, o75Var5, hb5Var, k12Var);
                                }
                                obj2 = a2;
                                break;
                            }
                            sz1Var2.H0("hardcore_unlock_queue_rejected", new vr4("achievement_id", new Long(j9)), new vr4("reason", "runtime_authentication_mismatch"));
                            return obj11;
                        }
                        qz1Var = sz1Var2.M;
                        if (qz1Var == null) {
                            if (sz1Var2.J) {
                                ik4Var = ik4.OFFLINE_AFTER_START;
                            } else {
                                ik4Var = ik4.OFFLINE_FROM_START;
                            }
                            gk4 gk4Var = gk4.SOFTCORE;
                            k12Var.Y = o75Var5;
                            ne2Var = ne2Var2;
                            k12Var.Z = null;
                            k12Var.R = j9;
                            k12Var.f0 = 4;
                            p0 = sz1Var2.p0(gk4Var, ik4Var, k12Var);
                            break;
                        } else {
                            ne2Var = ne2Var2;
                            long j10 = j9;
                            qz1Var2 = qz1Var;
                            long j11 = j10;
                            o75 o75Var6 = o75Var5;
                            if (qz1Var2 == null) {
                                String str2 = qz1Var2.b;
                                k12 k12Var4 = k12Var;
                                long j12 = qz1Var2.c;
                                ik4 ik4Var2 = qz1Var2.e;
                                gk4 gk4Var2 = qz1Var2.d;
                                long currentTimeMillis = System.currentTimeMillis();
                                long j13 = currentTimeMillis - qz1Var2.g;
                                if (j13 < 0) {
                                    j13 = 0;
                                }
                                long j14 = qz1Var2.h;
                                qz1Var2.h = j14 + 1;
                                long j15 = j13;
                                sz1Var.H0("offline_ledger_append_attempt", new vr4("achievement_id", new Long(j11)), new vr4("unlock_mode", gk4Var2.name()), new vr4("offline_type", ik4Var2.name()), new vr4("order_index", new Long(j14)), new vr4("offset_ms", new Long(j13)), new vr4("game_id", new Long(j12)), new vr4("content_id", str2));
                                sz1Var.G0("offline_ledger_append_start", new vr4("achievement_id", new Long(j11)), new vr4("game_id", new Long(j12)), new vr4("game_hash", str2), new vr4(obj, qz1Var2.f), new vr4("unlock_mode", gk4Var2.name()), new vr4("offline_type", ik4Var2.name()), new vr4("order_index", new Long(j14)), new vr4("offset_ms", new Long(j15)), new vr4(obj12, Boolean.TRUE));
                                try {
                                    xe1 xe1Var = xk1.a;
                                    de1Var = de1.L;
                                    try {
                                        obj12 = obj12;
                                        obj3 = "game_hash";
                                        sz1Var2 = sz1Var;
                                        obj7 = "game_id";
                                        obj5 = "order_index";
                                        obj8 = "achievement_id";
                                        obj4 = "unlock_mode";
                                        obj6 = obj;
                                        obj9 = "offline_type";
                                        try {
                                            l12Var = new l12(sz1Var2, qz1Var2, j11, currentTimeMillis, j15, j14, null);
                                            j2 = j11;
                                            qz1Var3 = qz1Var2;
                                            j3 = j14;
                                            k12Var3 = k12Var4;
                                            o75Var2 = o75Var6;
                                        } catch (Throwable th) {
                                            th = th;
                                            j2 = j11;
                                            k12Var3 = k12Var4;
                                            o75Var2 = o75Var6;
                                            qz1Var3 = qz1Var2;
                                            j3 = j14;
                                        }
                                        try {
                                            k12Var3.Y = o75Var2;
                                            k12Var3.Z = qz1Var3;
                                            k12Var3.R = j2;
                                            k12Var3.X = j3;
                                            k12Var3.f0 = 5;
                                            x61Var = x61Var3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            x61Var = x61Var3;
                                            j4 = j2;
                                            qz1Var4 = qz1Var3;
                                            j5 = j3;
                                            o75Var3 = o75Var2;
                                            Object em5Var = new em5(th);
                                            o75Var4 = o75Var3;
                                            qz1Var5 = qz1Var4;
                                            obj10 = em5Var;
                                            j7 = j5;
                                            j8 = j4;
                                            a3 = hm5.a(obj10);
                                            if (a3 == null) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        qz1Var3 = qz1Var2;
                                        obj12 = obj12;
                                        obj3 = "game_hash";
                                        obj4 = "unlock_mode";
                                        obj5 = "order_index";
                                        sz1Var2 = sz1Var;
                                        obj6 = obj;
                                        o75Var2 = o75Var6;
                                        obj7 = "game_id";
                                        j2 = j11;
                                        j3 = j14;
                                        obj8 = "achievement_id";
                                        obj9 = "offline_type";
                                        k12Var3 = k12Var4;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    qz1Var3 = qz1Var2;
                                    obj12 = obj12;
                                    obj3 = "game_hash";
                                    obj4 = "unlock_mode";
                                    obj5 = "order_index";
                                    sz1Var2 = sz1Var;
                                    obj6 = obj;
                                    o75Var2 = o75Var6;
                                    obj7 = "game_id";
                                    j2 = j11;
                                    j3 = j14;
                                    obj8 = "achievement_id";
                                    obj9 = "offline_type";
                                    k12Var3 = k12Var4;
                                }
                                if (hv.d0(de1Var, l12Var, k12Var3) != x61Var) {
                                    qz1Var5 = qz1Var3;
                                    j6 = j3;
                                    o75Var3 = o75Var2;
                                    long j16 = j2;
                                    j7 = j6;
                                    j8 = j16;
                                    o75Var4 = o75Var3;
                                    obj10 = obj11;
                                    a3 = hm5.a(obj10);
                                    if (a3 == null) {
                                        sz1Var2.G0("offline_ledger_append_failed", new vr4(obj8, new Long(j8)), new vr4(obj7, new Long(qz1Var5.c)), new vr4(obj3, qz1Var5.b), new vr4(obj6, qz1Var5.f), new vr4("error", a3.getClass().getSimpleName()));
                                        return obj11;
                                    }
                                    x61Var2 = x61Var;
                                    k12Var2 = k12Var3;
                                    Object obj14 = obj5;
                                    sz1Var2.H0("offline_ledger_append_success", new vr4(obj8, new Long(j8)), new vr4(obj4, qz1Var5.d.name()), new vr4(obj9, qz1Var5.e.name()), new vr4(obj14, new Long(j7)));
                                    sz1Var2.G0("offline_ledger_append_success", new vr4(obj8, new Long(j8)), new vr4(obj7, new Long(qz1Var5.c)), new vr4(obj3, qz1Var5.b), new vr4(obj6, qz1Var5.f), new vr4(obj14, new Long(j7)), new vr4(obj12, Boolean.TRUE));
                                    o75Var6 = o75Var4;
                                    j11 = j8;
                                    if (o75Var6 == null) {
                                        q95 q95Var = new q95(o75Var6);
                                        k12 k12Var5 = k12Var2;
                                        k12Var5.Y = null;
                                        k12Var5.Z = null;
                                        k12Var5.R = j11;
                                        k12Var5.f0 = 6;
                                        x61Var = x61Var2;
                                        if (ne2Var.a(q95Var, k12Var5) != x61Var) {
                                            return obj11;
                                        }
                                    } else {
                                        return obj11;
                                    }
                                }
                                return x61Var;
                            }
                            k12Var2 = k12Var;
                            x61Var2 = x61Var3;
                            if (o75Var6 == null) {
                            }
                        }
                        x61Var = x61Var3;
                        return x61Var;
                    case 1:
                        oi2.Y(obj13);
                        return obj11;
                    case 2:
                        j9 = k12Var.R;
                        o75Var5 = k12Var.Y;
                        oi2.Y(obj13);
                        obj2 = obj13;
                        if (((Boolean) obj2).booleanValue()) {
                            sz1Var2.H0("hardcore_unlock_queued_in_memory", new vr4("achievement_id", new Long(j9)), new vr4("online", Boolean.valueOf(jf4Var.a())));
                            q95 q95Var2 = new q95(o75Var5);
                            k12Var.Y = null;
                            k12Var.R = j9;
                            k12Var.f0 = 3;
                            break;
                        }
                        sz1Var2.H0("hardcore_unlock_queue_rejected", new vr4("achievement_id", new Long(j9)), new vr4("reason", "runtime_authentication_mismatch"));
                        return obj11;
                    case 3:
                        oi2.Y(obj13);
                        return obj11;
                    case 4:
                        j9 = k12Var.R;
                        sz1 sz1Var3 = (sz1) k12Var.Z;
                        o75Var5 = k12Var.Y;
                        oi2.Y(obj13);
                        ne2Var = ne2Var2;
                        p0 = obj13;
                        qz1Var = (qz1) p0;
                        long j102 = j9;
                        qz1Var2 = qz1Var;
                        long j112 = j102;
                        o75 o75Var62 = o75Var5;
                        if (qz1Var2 == null) {
                        }
                        break;
                    case 5:
                        long j17 = k12Var.X;
                        j2 = k12Var.R;
                        qz1 qz1Var6 = k12Var.Z;
                        o75Var3 = k12Var.Y;
                        try {
                            oi2.Y(obj13);
                            qz1Var5 = qz1Var6;
                            obj4 = "unlock_mode";
                            obj5 = "order_index";
                            ne2Var = ne2Var2;
                            obj6 = obj;
                            j6 = j17;
                            obj8 = "achievement_id";
                            obj9 = "offline_type";
                            k12Var3 = k12Var;
                            x61Var = x61Var3;
                            obj3 = "game_hash";
                            obj7 = "game_id";
                            long j162 = j2;
                            j7 = j6;
                            j8 = j162;
                            o75Var4 = o75Var3;
                            obj10 = obj11;
                        } catch (Throwable th5) {
                            th = th5;
                            obj4 = "unlock_mode";
                            obj5 = "order_index";
                            ne2Var = ne2Var2;
                            obj6 = obj;
                            obj8 = "achievement_id";
                            obj9 = "offline_type";
                            k12Var3 = k12Var;
                            x61Var = x61Var3;
                            obj3 = "game_hash";
                            obj7 = "game_id";
                            j4 = j2;
                            qz1Var4 = qz1Var6;
                            j5 = j17;
                            Object em5Var2 = new em5(th);
                            o75Var4 = o75Var3;
                            qz1Var5 = qz1Var4;
                            obj10 = em5Var2;
                            j7 = j5;
                            j8 = j4;
                            a3 = hm5.a(obj10);
                            if (a3 == null) {
                            }
                        }
                        a3 = hm5.a(obj10);
                        if (a3 == null) {
                        }
                        break;
                    case 6:
                        oi2.Y(obj13);
                        return obj11;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        k12Var = new k12(sz1Var2, s41Var);
        Object obj132 = k12Var.d0;
        x61 x61Var32 = x61.COROUTINE_SUSPENDED;
        switch (k12Var.f0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum C(sz1 sz1Var, mc5 mc5Var, s41 s41Var) {
        m12 m12Var;
        nv4 nv4Var;
        lc5 lc5Var;
        Object Z;
        tc5 tc5Var;
        kz1 kz1Var;
        lc5 lc5Var2;
        nv4 nv4Var2;
        kz1 kz1Var2;
        mc5 mc5Var2;
        ArrayList arrayList;
        int i;
        oc5 oc5Var;
        pc5 pc5Var;
        oc5 oc5Var2;
        boolean z;
        ed5 ed5Var;
        int intValue;
        int i2;
        kz1 kz1Var3;
        mc5 mc5Var3;
        boolean booleanValue;
        int intValue2;
        oc5 oc5Var3;
        pc5 pc5Var2;
        kz1 kz1Var4;
        mc5 mc5Var4;
        boolean booleanValue2;
        mc5 mc5Var5 = mc5Var;
        if (s41Var instanceof m12) {
            m12Var = (m12) s41Var;
            int i3 = m12Var.h0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m12Var.h0 = i3 - Integer.MIN_VALUE;
                Object obj = m12Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                boolean z2 = false;
                switch (m12Var.h0) {
                    case 0:
                        oi2.Y(obj);
                        nv4Var = sz1Var.b0;
                        if (nv4Var == null) {
                            return nc5.EXIT;
                        }
                        lc5Var = ((bv4) nv4Var.i.A.getValue()).c;
                        if (lc5Var.a == 0) {
                            return nc5.EXIT;
                        }
                        m12Var.R = mc5Var5;
                        m12Var.X = nv4Var;
                        m12Var.Y = lc5Var;
                        m12Var.h0 = 1;
                        Z = sz1Var.Z(lc5Var, mc5Var5, m12Var);
                        break;
                    case 1:
                        lc5 lc5Var3 = m12Var.Y;
                        nv4Var = m12Var.X;
                        mc5 mc5Var6 = m12Var.R;
                        oi2.Y(obj);
                        lc5Var = lc5Var3;
                        mc5Var5 = mc5Var6;
                        Z = obj;
                        kz1 kz1Var5 = (kz1) Z;
                        int i4 = wz1.c[kz1Var5.b.ordinal()];
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    List<av4> list = ((bv4) nv4Var.i.A.getValue()).b;
                                    ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                                    for (av4 av4Var : list) {
                                        arrayList2.add(new Long(av4Var.a.e()));
                                    }
                                    jh jhVar = sz1Var.v;
                                    m12Var.R = mc5Var5;
                                    m12Var.X = nv4Var;
                                    m12Var.Y = lc5Var;
                                    m12Var.Z = kz1Var5;
                                    m12Var.d0 = arrayList2;
                                    m12Var.h0 = 3;
                                    jhVar.getClass();
                                    Object d0 = hv.d0(xk1.a, new xg(arrayList2, null, 0), m12Var);
                                    if (d0 != x61Var) {
                                        lc5Var2 = lc5Var;
                                        obj = d0;
                                        nv4Var2 = nv4Var;
                                        kz1Var2 = kz1Var5;
                                        mc5Var2 = mc5Var5;
                                        arrayList = arrayList2;
                                        intValue = ((Number) obj).intValue();
                                        if (intValue == arrayList.size()) {
                                            sz1Var.G0("ra_pending_discard_rejected", new vr4("expected", new Integer(arrayList.size())), new vr4("confirmed", new Integer(intValue)), new vr4("session_scope", "current"), new vr4("accepted", Boolean.FALSE));
                                            m12Var.R = mc5Var2;
                                            m12Var.X = null;
                                            m12Var.Y = null;
                                            m12Var.Z = kz1Var2;
                                            m12Var.d0 = null;
                                            m12Var.e0 = intValue;
                                            m12Var.h0 = 4;
                                            obj = sz1Var.P0(m12Var);
                                            if (obj != x61Var) {
                                                kz1Var3 = kz1Var2;
                                                mc5Var3 = mc5Var2;
                                                booleanValue = ((Boolean) obj).booleanValue();
                                                sz1Var.h0.n(kz1Var3.a);
                                                if (!booleanValue) {
                                                    sz1Var.Q0(mc5Var3);
                                                    return nc5.KEEP_SESSION_PAUSED;
                                                }
                                                sz1Var.J0.k(g77.a);
                                                if (mc5Var3 == mc5.RESUMABLE_SESSION) {
                                                    return nc5.RESUME_SESSION;
                                                }
                                                return nc5.KEEP_SESSION_PAUSED;
                                            }
                                        } else {
                                            Set p1 = gt0.p1(arrayList);
                                            gd5 gd5Var = nv4Var2.a;
                                            m12Var.R = mc5Var2;
                                            m12Var.X = nv4Var2;
                                            m12Var.Y = lc5Var2;
                                            m12Var.Z = kz1Var2;
                                            m12Var.d0 = null;
                                            m12Var.e0 = intValue;
                                            m12Var.h0 = 5;
                                            Object e = nv4Var2.e(p1, gd5Var, m12Var);
                                            if (e != x61Var) {
                                                obj = e;
                                                i2 = intValue;
                                                intValue2 = ((Number) obj).intValue();
                                                if (intValue2 == i2) {
                                                    sz1Var.G0("ra_pending_discard_mirror_mismatch", new vr4("confirmed", new Integer(i2)), new vr4("discarded", new Integer(intValue2)), new vr4("session_scope", "current"), new vr4("accepted", Boolean.FALSE));
                                                    m12Var.R = mc5Var2;
                                                    m12Var.X = null;
                                                    m12Var.Y = null;
                                                    m12Var.Z = kz1Var2;
                                                    m12Var.d0 = null;
                                                    m12Var.e0 = i2;
                                                    m12Var.h0 = 6;
                                                    obj = sz1Var.P0(m12Var);
                                                    if (obj != x61Var) {
                                                        kz1Var4 = kz1Var2;
                                                        mc5Var4 = mc5Var2;
                                                        booleanValue2 = ((Boolean) obj).booleanValue();
                                                        sz1Var.h0.n(kz1Var4.a);
                                                        if (!booleanValue2) {
                                                            sz1Var.Q0(mc5Var4);
                                                        } else {
                                                            sz1Var.J0.k(g77.a);
                                                        }
                                                        return nc5.KEEP_SESSION_PAUSED;
                                                    }
                                                } else {
                                                    lc5 lc5Var4 = ((bv4) nv4Var2.i.A.getValue()).c;
                                                    lc5Var2.getClass();
                                                    int i5 = lc5Var4.a;
                                                    if (i5 > 0) {
                                                        oc5Var3 = oc5.KEEP_SESSION_OPEN;
                                                    } else {
                                                        oc5Var3 = oc5.EXIT;
                                                    }
                                                    if (i5 > 0) {
                                                        pc5Var2 = pc5.DISCARD_INCOMPLETE;
                                                    } else {
                                                        pc5Var2 = pc5.DISCARD_COMPLETED;
                                                    }
                                                    mc5 mc5Var7 = mc5.RESUMABLE_SESSION;
                                                    oc5Var3.getClass();
                                                    pc5Var2.getClass();
                                                    mc5Var7.getClass();
                                                    sz1Var.G0("ra_pending_discarded", new vr4("discarded", new Integer(intValue2)), new vr4("remaining", new Integer(lc5Var4.a)), new vr4("session_scope", "current"), new vr4("accepted", Boolean.FALSE));
                                                    oc5 oc5Var4 = oc5.EXIT;
                                                    if (oc5Var3 == oc5Var4) {
                                                        xv2 xv2Var = sz1Var.m;
                                                        gd5 gd5Var2 = nv4Var2.a;
                                                        xv2Var.b(gd5Var2.a, gd5Var2.c);
                                                        sz1Var.h0.n(kz1Var2.a);
                                                    } else {
                                                        sz1Var.h0.n(kz1Var2.a);
                                                        sz1Var.Q0(mc5Var2);
                                                    }
                                                    if (oc5Var3 == oc5Var4) {
                                                        return nc5.EXIT;
                                                    }
                                                    if (pc5Var2 == pc5.CONTINUE_PLAYING) {
                                                        return nc5.RESUME_SESSION;
                                                    }
                                                    return nc5.KEEP_SESSION_PAUSED;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                sz1Var.h0.n(kz1Var5.a);
                                lc5Var.getClass();
                                mc5Var5.getClass();
                                oc5 oc5Var5 = oc5.KEEP_SESSION_OPEN;
                                pc5 pc5Var3 = pc5.CONTINUE_PLAYING;
                                oc5Var5.getClass();
                                pc5Var3.getClass();
                                if (oc5Var5 == oc5.EXIT) {
                                    return nc5.EXIT;
                                }
                                if (mc5Var5 == mc5.RESUMABLE_SESSION) {
                                    return nc5.RESUME_SESSION;
                                }
                                return nc5.KEEP_SESSION_PAUSED;
                            }
                        } else {
                            eb ebVar = sz1Var.h0;
                            long j = kz1Var5.a;
                            ebVar.getClass();
                            lc5Var.getClass();
                            synchronized (ebVar.B) {
                                try {
                                    Object value = ((tp6) ebVar.R).getValue();
                                    if (value instanceof tc5) {
                                        tc5Var = (tc5) value;
                                    } else {
                                        tc5Var = null;
                                    }
                                    if (tc5Var != null) {
                                        if (tc5Var.a != j) {
                                            z2 = false;
                                        } else {
                                            tp6 tp6Var = (tp6) ebVar.R;
                                            wc5 wc5Var = new wc5(j, lc5Var, np2.k(tc5Var.c));
                                            tp6Var.getClass();
                                            tp6Var.m(null, wc5Var);
                                            z2 = true;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (!z2) {
                                return nc5.KEEP_SESSION_PAUSED;
                            }
                            try {
                                fd5 fd5Var = fd5.EXIT_DIALOG;
                                m12Var.R = mc5Var5;
                                m12Var.X = null;
                                m12Var.Y = null;
                                m12Var.Z = kz1Var5;
                                m12Var.h0 = 2;
                                obj = sz1Var.d1(fd5Var, m12Var);
                                if (obj != x61Var) {
                                    kz1Var = kz1Var5;
                                    dd5 dd5Var = (dd5) obj;
                                    dd5Var.getClass();
                                    i = dd5Var.h.a;
                                    if (i <= 0) {
                                        oc5Var = oc5.KEEP_SESSION_OPEN;
                                    } else {
                                        oc5Var = oc5.EXIT;
                                    }
                                    if (i <= 0) {
                                        pc5Var = pc5.SYNC_INCOMPLETE;
                                    } else {
                                        pc5Var = pc5.SYNC_COMPLETED;
                                    }
                                    mc5 mc5Var8 = mc5.RESUMABLE_SESSION;
                                    oc5Var.getClass();
                                    pc5Var.getClass();
                                    mc5Var8.getClass();
                                    oc5Var2 = oc5.EXIT;
                                    if (oc5Var != oc5Var2) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    eb ebVar2 = sz1Var.h0;
                                    if (!z) {
                                        ebVar2.n(kz1Var.a);
                                    } else {
                                        long j2 = kz1Var.a;
                                        if (mc5Var5 == mc5.TERMINAL_STOP) {
                                            ed5Var = ed5.REOPEN_TERMINAL_EXIT;
                                        } else {
                                            ed5Var = ed5.RESUME_SESSION;
                                        }
                                        ebVar2.N(j2, dd5Var, ed5Var);
                                    }
                                    if (oc5Var != oc5Var2) {
                                        return nc5.EXIT;
                                    }
                                    if (pc5Var == pc5.CONTINUE_PLAYING) {
                                        return nc5.RESUME_SESSION;
                                    }
                                    return nc5.KEEP_SESSION_PAUSED;
                                }
                            } catch (CancellationException e2) {
                                e = e2;
                                kz1Var = kz1Var5;
                                sz1Var.h0.n(kz1Var.a);
                                throw e;
                            }
                        }
                        return x61Var;
                    case 2:
                        kz1Var = m12Var.Z;
                        mc5Var5 = m12Var.R;
                        try {
                            oi2.Y(obj);
                            dd5 dd5Var2 = (dd5) obj;
                            dd5Var2.getClass();
                            i = dd5Var2.h.a;
                            if (i <= 0) {
                            }
                            if (i <= 0) {
                            }
                            mc5 mc5Var82 = mc5.RESUMABLE_SESSION;
                            oc5Var.getClass();
                            pc5Var.getClass();
                            mc5Var82.getClass();
                            oc5Var2 = oc5.EXIT;
                            if (oc5Var != oc5Var2) {
                            }
                            eb ebVar22 = sz1Var.h0;
                            if (!z) {
                            }
                            if (oc5Var != oc5Var2) {
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            sz1Var.h0.n(kz1Var.a);
                            throw e;
                        }
                        break;
                    case 3:
                        arrayList = m12Var.d0;
                        kz1Var2 = m12Var.Z;
                        lc5Var2 = m12Var.Y;
                        nv4Var2 = m12Var.X;
                        mc5Var2 = m12Var.R;
                        oi2.Y(obj);
                        intValue = ((Number) obj).intValue();
                        if (intValue == arrayList.size()) {
                        }
                        return x61Var;
                    case 4:
                        kz1Var3 = m12Var.Z;
                        mc5Var3 = m12Var.R;
                        oi2.Y(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        sz1Var.h0.n(kz1Var3.a);
                        if (!booleanValue) {
                        }
                        break;
                    case 5:
                        i2 = m12Var.e0;
                        kz1Var2 = m12Var.Z;
                        lc5Var2 = m12Var.Y;
                        nv4Var2 = m12Var.X;
                        mc5Var2 = m12Var.R;
                        oi2.Y(obj);
                        intValue2 = ((Number) obj).intValue();
                        if (intValue2 == i2) {
                        }
                        break;
                    case 6:
                        kz1Var4 = m12Var.Z;
                        mc5Var4 = m12Var.R;
                        oi2.Y(obj);
                        booleanValue2 = ((Boolean) obj).booleanValue();
                        sz1Var.h0.n(kz1Var4.a);
                        if (!booleanValue2) {
                        }
                        return nc5.KEEP_SESSION_PAUSED;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        m12Var = new m12(sz1Var, s41Var);
        Object obj2 = m12Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        boolean z22 = false;
        switch (m12Var.h0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r11 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object D(sz1 sz1Var, s41 s41Var) {
        n12 n12Var;
        Object obj;
        int i;
        nv4 nv4Var;
        q33 q33Var = sz1Var.f0;
        jg7 jg7Var = jg7.a;
        if (s41Var instanceof n12) {
            n12Var = (n12) s41Var;
            int i2 = n12Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n12Var.Z = i2 - Integer.MIN_VALUE;
                obj = n12Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = n12Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nv4Var = n12Var.R;
                        oi2.Y(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            synchronized (q33Var) {
                                q33Var.A = true;
                            }
                            return jg7Var;
                        } else if (((bv4) nv4Var.i.A.getValue()).c.a == 0) {
                            sz1Var.G = b.ONLINE_LIVE;
                            sz1Var.w.d = false;
                            sz1Var.e1(new ob5(0), "validated_runtime_reconnect");
                            return jg7Var;
                        } else {
                            sz1Var.e1(new ob5(((bv4) nv4Var.i.A.getValue()).c.a), "validated_runtime_reconnect_with_pending");
                            fd5 fd5Var = fd5.RUNTIME_RECONNECTED;
                            n12Var.R = null;
                            n12Var.Z = 3;
                            if (sz1Var.d1(fd5Var, n12Var) == obj2) {
                                return obj2;
                            }
                            return jg7Var;
                        }
                    }
                    nv4Var = n12Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    nv4 nv4Var2 = sz1Var.b0;
                    if (nv4Var2 != null) {
                        gd5 gd5Var = nv4Var2.a;
                        n12Var.R = nv4Var2;
                        n12Var.Z = 1;
                        Object N0 = sz1Var.N0(gd5Var, n12Var);
                        if (N0 != obj2) {
                            nv4Var = nv4Var2;
                            obj = N0;
                        }
                        return obj2;
                    }
                    return jg7Var;
                }
                if (((Boolean) obj).booleanValue()) {
                    if (!sz1Var.o.b()) {
                        synchronized (q33Var) {
                            q33Var.A = true;
                        }
                        return jg7Var;
                    }
                    n12Var.R = nv4Var;
                    n12Var.Z = 2;
                    obj = sz1Var.P0(n12Var);
                }
                return jg7Var;
            }
        }
        n12Var = new n12(sz1Var, s41Var);
        obj = n12Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = n12Var.Z;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return jg7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object E(sz1 sz1Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, pq5 pq5Var, s41 s41Var) {
        q12 q12Var;
        int i;
        String username;
        String str;
        String gameHash;
        String str2;
        Long gameId;
        gd5 gd5Var;
        pq5 pq5Var2;
        q33 q33Var;
        jg7 jg7Var = jg7.a;
        if (s41Var instanceof q12) {
            q12Var = (q12) s41Var;
            int i2 = q12Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q12Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = q12Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = q12Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        gd5 gd5Var2 = q12Var.X;
                        pq5 pq5Var3 = q12Var.R;
                        oi2.Y(obj);
                        gd5Var = gd5Var2;
                        pq5Var2 = pq5Var3;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (rARuntimeBridgeConfig.getHardcoreEnabled() && rARuntimeBridgeConfig.getRuntimeMode() == RARuntimeBridgeMode.RC_CLIENT_ONLINE && (username = rARuntimeBridgeConfig.getUsername()) != null) {
                        if (!qs6.v0(username)) {
                            str = username;
                        } else {
                            str = null;
                        }
                        if (str != null && (gameHash = rARuntimeBridgeConfig.getGameHash()) != null) {
                            if (!qs6.v0(gameHash)) {
                                str2 = gameHash;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null && ((gameId = rARuntimeBridgeConfig.getGameId()) != null || (gameId = sz1Var.L) != null)) {
                                long longValue = gameId.longValue();
                                Long l = new Long(rARuntimeBridgeConfig.getSubmissionSessionId());
                                if (l.longValue() <= 0) {
                                    l = null;
                                }
                                if (l != null) {
                                    long longValue2 = l.longValue();
                                    String uuid = UUID.randomUUID().toString();
                                    uuid.getClass();
                                    gd5Var = new gd5(longValue, longValue2, str, str2, uuid);
                                    q12Var.R = pq5Var;
                                    q12Var.X = gd5Var;
                                    q12Var.d0 = 1;
                                    if (sz1Var.g0("session_reinitialized", true, q12Var) == obj2) {
                                        return obj2;
                                    }
                                    pq5Var2 = pq5Var;
                                }
                            }
                        }
                    }
                    return jg7Var;
                }
                nv4 nv4Var = new nv4(gd5Var);
                ad5 ad5Var = new ad5(nv4Var, sz1Var.z, new yc1(sz1Var, nv4Var));
                v80 c2 = nb3.c(-1, null, null, 6);
                sz1Var.b0 = nv4Var;
                sz1Var.c0 = ad5Var;
                sz1Var.e0 = c2;
                q33Var = sz1Var.f0;
                synchronized (q33Var) {
                    q33Var.A = false;
                }
                sz1Var.i0.l(null);
                sz1Var.Q0.l(nv4Var.i.A.getValue());
                sz1Var.e1(sb5.a, "hardcore_online_session_initialized");
                sz1Var.d0 = hv.L(sz1Var.z, null, null, new l5(nv4Var, sz1Var, pq5Var2, c2, null, 9), 3);
                return jg7Var;
            }
        }
        q12Var = new q12(sz1Var, s41Var);
        Object obj3 = q12Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = q12Var.d0;
        if (i == 0) {
        }
        nv4 nv4Var2 = new nv4(gd5Var);
        ad5 ad5Var2 = new ad5(nv4Var2, sz1Var.z, new yc1(sz1Var, nv4Var2));
        v80 c22 = nb3.c(-1, null, null, 6);
        sz1Var.b0 = nv4Var2;
        sz1Var.c0 = ad5Var2;
        sz1Var.e0 = c22;
        q33Var = sz1Var.f0;
        synchronized (q33Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(sz1 sz1Var, hy1 hy1Var, s41 s41Var) {
        x12 x12Var;
        int i;
        sz1Var.getClass();
        if (s41Var instanceof x12) {
            x12Var = (x12) s41Var;
            int i2 = x12Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x12Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = x12Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = x12Var.Y;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        return obj;
                    }
                } else {
                    oi2.Y(obj);
                    if (hy1Var instanceof dy1) {
                        pq5 pq5Var = ((dy1) hy1Var).a;
                        x12Var.Y = 1;
                        Object w0 = sz1Var.w0(pq5Var, x12Var);
                        if (w0 != obj2) {
                            return w0;
                        }
                    } else {
                        pn5 pn5Var = sz1Var.g;
                        x12Var.Y = 2;
                        obj = ((pl) pn5Var).s(x12Var);
                    }
                    return obj2;
                }
                return Boolean.valueOf((((Boolean) obj).booleanValue() || !((ng6) sz1Var.c).b.getBoolean("ra_enabled", true)) ? false : false);
            }
        }
        x12Var = new x12(sz1Var, s41Var);
        Object obj3 = x12Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = x12Var.Y;
        boolean z2 = true;
        if (i == 0) {
        }
        return Boolean.valueOf((((Boolean) obj3).booleanValue() || !((ng6) sz1Var.c).b.getBoolean("ra_enabled", true)) ? false : false);
    }

    public static /* synthetic */ void F0(sz1 sz1Var, String str, c cVar, ep2 ep2Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, int i) {
        if ((i & 8) != 0) {
            rARuntimeBridgeConfig = sz1Var.N;
        }
        sz1Var.E0(str, cVar, ep2Var, rARuntimeBridgeConfig, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object G(sz1 sz1Var, UUID uuid, BackgroundMode backgroundMode, s41 s41Var) {
        a22 a22Var;
        int i;
        if (s41Var instanceof a22) {
            a22Var = (a22) s41Var;
            int i2 = a22Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a22Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = a22Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = a22Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        backgroundMode = a22Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (uuid == null) {
                        return new t26(null, backgroundMode);
                    }
                    ha3 ha3Var = sz1Var.r;
                    a22Var.R = backgroundMode;
                    a22Var.Z = 1;
                    obj = ha3Var.c(uuid, a22Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new t26((n00) obj, backgroundMode);
            }
        }
        a22Var = new a22(sz1Var, s41Var);
        Object obj2 = a22Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = a22Var.Z;
        if (i == 0) {
        }
        return new t26((n00) obj2, backgroundMode);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|92|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
        r2 = new defpackage.em5(r0);
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, sz1] */
    /* JADX WARN: Type inference failed for: r3v26, types: [c46] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5, types: [c46] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(sz1 sz1Var, pq5 pq5Var, s41 s41Var) {
        d22 d22Var;
        int i;
        Throwable a2;
        boolean z;
        boolean booleanValue;
        c46 c46Var;
        pq5 pq5Var2;
        c46 c46Var2;
        pq5 pq5Var3;
        Object d0;
        Object em5Var;
        c46 c46Var3;
        pq5 pq5Var4;
        Throwable a3;
        Uri uri;
        pq5 pq5Var5 = pq5Var;
        of6 of6Var = sz1Var.J0;
        if (s41Var instanceof d22) {
            d22Var = (d22) s41Var;
            int i2 = d22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d22Var.e0 = i2 - Integer.MIN_VALUE;
                d22 d22Var2 = d22Var;
                Object obj = d22Var2.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = d22Var2.e0;
                z67 z67Var = z67.a;
                jg7 jg7Var = jg7.a;
                pq5 pq5Var6 = null;
                switch (i) {
                    case 0:
                        oi2.Y(obj);
                        if (!((ng6) sz1Var.c).b.getBoolean("auto_load_state_on_launch", false)) {
                            Log.i("AutoState", "auto-load skipped: setting disabled");
                            return jg7Var;
                        } else if (!sz1Var.w.b()) {
                            Log.i("AutoState", "auto-load skipped: save-state loads not allowed");
                            return jg7Var;
                        } else {
                            d22Var2.R = pq5Var5;
                            d22Var2.e0 = 1;
                            obj = sz1Var.t0(pq5Var5, d22Var2);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            Object obj2 = obj;
                            pq5 pq5Var7 = pq5Var5;
                            c46Var2 = (c46) obj2;
                            if (c46Var2.b) {
                                Log.i("AutoState", "auto-load skipped: quick slot missing");
                                return jg7Var;
                            }
                            try {
                                d22Var2.R = pq5Var7;
                                d22Var2.X = c46Var2;
                                d22Var2.e0 = 2;
                                xe1 xe1Var = xk1.a;
                                d0 = hv.d0(de1.L, new h12(sz1Var, pq5Var7, c46Var2, null, 0), d22Var2);
                            } catch (Throwable th) {
                                th = th;
                                pq5Var3 = pq5Var7;
                                em5Var = new em5(th);
                                c46Var3 = c46Var2;
                                pq5Var4 = pq5Var3;
                                a3 = hm5.a(em5Var);
                                if (a3 != null) {
                                }
                                if (em5Var instanceof em5) {
                                }
                                uri = (Uri) em5Var;
                                if (uri != null) {
                                }
                                of6Var.k(z67Var);
                                Log.w("AutoState", "auto-load skipped: invalid quick slot for " + pq5Var4.a);
                                return jg7Var;
                            }
                            if (d0 != x61Var) {
                                pq5Var3 = pq5Var7;
                                obj = d0;
                                em5Var = (Uri) obj;
                                c46Var3 = c46Var2;
                                pq5Var4 = pq5Var3;
                                a3 = hm5.a(em5Var);
                                if (a3 != null) {
                                    Log.w("AutoState", "auto-load skipped: failed to resolve quick slot for " + pq5Var4.a, a3);
                                }
                                if (em5Var instanceof em5) {
                                    em5Var = null;
                                }
                                uri = (Uri) em5Var;
                                if (uri != null) {
                                    d22Var2.R = pq5Var4;
                                    d22Var2.X = c46Var3;
                                    d22Var2.e0 = 3;
                                    xe1 xe1Var2 = xk1.a;
                                    obj = hv.d0(de1.L, new ag(sz1Var, uri, null, 7), d22Var2);
                                    if (obj == x61Var) {
                                        return x61Var;
                                    }
                                    if (((Boolean) obj).booleanValue()) {
                                        Log.i("AutoState", "auto-load start: slot=" + c46Var3.a + " rom=" + pq5Var4.a);
                                        jh jhVar = sz1Var.v;
                                        d22Var2.R = pq5Var4;
                                        d22Var2.X = c46Var3;
                                        d22Var2.e0 = 4;
                                        jhVar.getClass();
                                        jh.i();
                                        if (jg7Var == x61Var) {
                                            return x61Var;
                                        }
                                        pq5Var6 = pq5Var4;
                                        c46 c46Var4 = c46Var3;
                                        d22Var2.R = pq5Var6;
                                        d22Var2.X = c46Var4;
                                        d22Var2.e0 = 5;
                                        obj = sz1Var.A0(pq5Var6, c46Var4, d22Var2);
                                        i = c46Var4;
                                        if (obj == x61Var) {
                                            return x61Var;
                                        }
                                        Object em5Var2 = (Boolean) obj;
                                        em5Var2.getClass();
                                        ?? r3 = i;
                                        a2 = hm5.a(em5Var2);
                                        if (a2 != null) {
                                            Log.w("AutoState", "auto-load failed with exception: slot=" + r3.a + " rom=" + pq5Var6.a, a2);
                                        }
                                        Boolean bool = Boolean.FALSE;
                                        z = em5Var2 instanceof em5;
                                        Boolean bool2 = em5Var2;
                                        if (z) {
                                            bool2 = bool;
                                        }
                                        booleanValue = ((Boolean) bool2).booleanValue();
                                        d22Var2.R = pq5Var6;
                                        d22Var2.X = r3;
                                        d22Var2.Y = booleanValue;
                                        d22Var2.e0 = 6;
                                        sz1Var.U0();
                                        if (jg7Var != x61Var) {
                                            c46Var = r3;
                                            pq5Var2 = pq5Var6;
                                            if (!booleanValue) {
                                                of6Var.k(h77.a);
                                                Log.i("AutoState", "auto-load success: slot=" + c46Var.a + " rom=" + pq5Var2.a);
                                            } else {
                                                of6Var.k(z67Var);
                                                Log.w("AutoState", "auto-load failed: slot=" + c46Var.a + " rom=" + pq5Var2.a);
                                            }
                                            return jg7Var;
                                        }
                                        return x61Var;
                                    }
                                }
                                of6Var.k(z67Var);
                                Log.w("AutoState", "auto-load skipped: invalid quick slot for " + pq5Var4.a);
                                return jg7Var;
                            }
                            return x61Var;
                        }
                    case 1:
                        pq5Var5 = d22Var2.R;
                        oi2.Y(obj);
                        Object obj22 = obj;
                        pq5 pq5Var72 = pq5Var5;
                        c46Var2 = (c46) obj22;
                        if (c46Var2.b) {
                        }
                        break;
                    case 2:
                        c46Var2 = d22Var2.X;
                        pq5Var3 = d22Var2.R;
                        try {
                            oi2.Y(obj);
                            em5Var = (Uri) obj;
                        } catch (Throwable th2) {
                            th = th2;
                            em5Var = new em5(th);
                            c46Var3 = c46Var2;
                            pq5Var4 = pq5Var3;
                            a3 = hm5.a(em5Var);
                            if (a3 != null) {
                            }
                            if (em5Var instanceof em5) {
                            }
                            uri = (Uri) em5Var;
                            if (uri != null) {
                            }
                            of6Var.k(z67Var);
                            Log.w("AutoState", "auto-load skipped: invalid quick slot for " + pq5Var4.a);
                            return jg7Var;
                        }
                        c46Var3 = c46Var2;
                        pq5Var4 = pq5Var3;
                        a3 = hm5.a(em5Var);
                        if (a3 != null) {
                        }
                        if (em5Var instanceof em5) {
                        }
                        uri = (Uri) em5Var;
                        if (uri != null) {
                        }
                        of6Var.k(z67Var);
                        Log.w("AutoState", "auto-load skipped: invalid quick slot for " + pq5Var4.a);
                        return jg7Var;
                    case 3:
                        c46Var3 = d22Var2.X;
                        pq5Var4 = d22Var2.R;
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        of6Var.k(z67Var);
                        Log.w("AutoState", "auto-load skipped: invalid quick slot for " + pq5Var4.a);
                        return jg7Var;
                    case 4:
                        c46Var3 = d22Var2.X;
                        pq5Var4 = d22Var2.R;
                        oi2.Y(obj);
                        pq5Var6 = pq5Var4;
                        c46 c46Var42 = c46Var3;
                        d22Var2.R = pq5Var6;
                        d22Var2.X = c46Var42;
                        d22Var2.e0 = 5;
                        obj = sz1Var.A0(pq5Var6, c46Var42, d22Var2);
                        i = c46Var42;
                        if (obj == x61Var) {
                        }
                        Object em5Var22 = (Boolean) obj;
                        em5Var22.getClass();
                        ?? r32 = i;
                        a2 = hm5.a(em5Var22);
                        if (a2 != null) {
                        }
                        Boolean bool3 = Boolean.FALSE;
                        z = em5Var22 instanceof em5;
                        Boolean bool22 = em5Var22;
                        if (z) {
                        }
                        booleanValue = ((Boolean) bool22).booleanValue();
                        d22Var2.R = pq5Var6;
                        d22Var2.X = r32;
                        d22Var2.Y = booleanValue;
                        d22Var2.e0 = 6;
                        sz1Var.U0();
                        if (jg7Var != x61Var) {
                        }
                        break;
                    case 5:
                        ?? r33 = d22Var2.X;
                        pq5Var6 = d22Var2.R;
                        oi2.Y(obj);
                        i = r33;
                        Object em5Var222 = (Boolean) obj;
                        em5Var222.getClass();
                        ?? r322 = i;
                        a2 = hm5.a(em5Var222);
                        if (a2 != null) {
                        }
                        Boolean bool32 = Boolean.FALSE;
                        z = em5Var222 instanceof em5;
                        Boolean bool222 = em5Var222;
                        if (z) {
                        }
                        booleanValue = ((Boolean) bool222).booleanValue();
                        d22Var2.R = pq5Var6;
                        d22Var2.X = r322;
                        d22Var2.Y = booleanValue;
                        d22Var2.e0 = 6;
                        sz1Var.U0();
                        if (jg7Var != x61Var) {
                        }
                        break;
                    case 6:
                        booleanValue = d22Var2.Y;
                        c46Var = d22Var2.X;
                        pq5Var2 = d22Var2.R;
                        oi2.Y(obj);
                        if (!booleanValue) {
                        }
                        return jg7Var;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        d22Var = new d22(sz1Var, s41Var);
        d22 d22Var22 = d22Var;
        Object obj3 = d22Var22.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = d22Var22.e0;
        z67 z67Var2 = z67.a;
        jg7 jg7Var2 = jg7.a;
        pq5 pq5Var62 = null;
        switch (i) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object I(sz1 sz1Var, pq5 pq5Var, s41 s41Var) {
        e22 e22Var;
        int i;
        pq5 pq5Var2;
        c46 c46Var;
        boolean booleanValue;
        if (s41Var instanceof e22) {
            e22Var = (e22) s41Var;
            int i2 = e22Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e22Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = e22Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = e22Var.d0;
                Object obj3 = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                c46Var = e22Var.X;
                                pq5Var2 = e22Var.R;
                                oi2.Y(obj);
                                booleanValue = ((Boolean) obj).booleanValue();
                                of6 of6Var = sz1Var.J0;
                                if (!booleanValue) {
                                    of6Var.k(i77.a);
                                    int i3 = c46Var.a;
                                    String str = pq5Var2.a;
                                    Log.i("AutoState", "auto-save success: slot=" + i3 + " rom=" + str);
                                    return obj3;
                                }
                                of6Var.k(v77.a);
                                int i4 = c46Var.a;
                                String str2 = pq5Var2.a;
                                Log.w("AutoState", "auto-save failed: slot=" + i4 + " rom=" + str2);
                                return obj3;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pq5Var = e22Var.R;
                        oi2.Y(obj);
                        c46 c46Var2 = (c46) obj;
                        int i5 = c46Var2.a;
                        String str3 = pq5Var.a;
                        Log.i("AutoState", "auto-save start: slot=" + i5 + " rom=" + str3);
                        e22Var.R = pq5Var;
                        e22Var.X = c46Var2;
                        e22Var.d0 = 3;
                        Object X0 = sz1Var.X0(pq5Var, c46Var2, e22Var);
                        if (X0 != obj2) {
                            pq5Var2 = pq5Var;
                            c46Var = c46Var2;
                            obj = X0;
                            booleanValue = ((Boolean) obj).booleanValue();
                            of6 of6Var2 = sz1Var.J0;
                            if (!booleanValue) {
                            }
                        }
                        return obj2;
                    }
                    pq5Var = e22Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (!((ng6) sz1Var.c).b.getBoolean("auto_save_state_on_exit", false)) {
                        Log.i("AutoState", "auto-save skipped: setting disabled");
                        return obj3;
                    }
                    sz1Var.w.getClass();
                    jh jhVar = sz1Var.v;
                    e22Var.R = pq5Var;
                    e22Var.d0 = 1;
                    jhVar.getClass();
                    jh.i();
                }
                e22Var.R = pq5Var;
                e22Var.d0 = 2;
                obj = sz1Var.t0(pq5Var, e22Var);
            }
        }
        e22Var = new e22(sz1Var, s41Var);
        Object obj4 = e22Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = e22Var.d0;
        Object obj32 = jg7.a;
        if (i == 0) {
        }
        e22Var.R = pq5Var;
        e22Var.d0 = 2;
        obj4 = sz1Var.t0(pq5Var, e22Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(sz1 sz1Var, f95 f95Var, r41 r41Var) {
        j22 j22Var;
        int i;
        Object obj;
        jg7 jg7Var;
        xu4 xu4Var;
        zu4 xu4Var2;
        nv4 nv4Var;
        xu4 xu4Var3;
        Object obj2;
        boolean z;
        yu4 yu4Var;
        Object obj3;
        yu4 yu4Var2;
        Object obj4;
        yu4 yu4Var3;
        Object obj5;
        f95 f95Var2 = f95Var;
        if (r41Var instanceof j22) {
            j22Var = (j22) r41Var;
            int i2 = j22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j22Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj6 = j22Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = j22Var.e0;
                jg7 jg7Var2 = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        zu4 zu4Var = j22Var.Y;
                        nv4Var = j22Var.X;
                        f95 f95Var3 = j22Var.R;
                        oi2.Y(obj6);
                        xu4Var2 = zu4Var;
                        f95Var2 = f95Var3;
                        obj = "kotlin_submit";
                        jg7Var = jg7Var2;
                        xu4Var = null;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj6);
                    nv4 nv4Var2 = sz1Var.b0;
                    if (nv4Var2 != null) {
                        gd5 gd5Var = nv4Var2.a;
                        if (sz1Var.O == c.RC_CLIENT && sz1Var.J && sz1Var.w.a && f95Var2.j && f95Var2.a == gd5Var.e && sz1Var.O0(gd5Var)) {
                            String str = gd5Var.d + ":" + f95Var2.b;
                            int i3 = wz1.g[f95Var2.e.ordinal()];
                            if (i3 == 1) {
                                obj = "kotlin_submit";
                                jg7Var = jg7Var2;
                                xu4Var = null;
                                long j = f95Var2.f;
                                if (j <= 0) {
                                    return jg7Var;
                                }
                                xu4Var2 = new xu4(nv4Var2.a, str, f95Var2.b, f95Var2.c, f95Var2.d, j);
                            } else if (i3 == 2) {
                                long j2 = f95Var2.g;
                                if (j2 > 0) {
                                    xu4Var = null;
                                    long j3 = f95Var2.h;
                                    if (j3 > 0) {
                                        jg7Var = jg7Var2;
                                        obj = "kotlin_submit";
                                        xu4Var2 = new yu4(nv4Var2.a, str, f95Var2.b, f95Var2.c, f95Var2.d, j2, j3, f95Var2.i, f95Var2.k);
                                    }
                                }
                                return jg7Var2;
                            } else {
                                i.d();
                                return null;
                            }
                            j22Var.R = f95Var2;
                            j22Var.X = nv4Var2;
                            j22Var.Y = xu4Var2;
                            j22Var.e0 = 1;
                            Enum b2 = nv4Var2.b(xu4Var2, j22Var);
                            if (b2 == x61Var) {
                                return x61Var;
                            }
                            nv4Var = nv4Var2;
                            obj6 = b2;
                        }
                    }
                    sz1Var.G0("ra_pending_rejected", new vr4("submission_id", new Long(f95Var2.b)), new vr4("reason", "invalid_session_context"), new vr4("kotlin_submit", Boolean.FALSE));
                    return jg7Var2;
                }
                fv4 fv4Var = (fv4) obj6;
                lc5 lc5Var = ((bv4) nv4Var.i.A.getValue()).c;
                String name = xu4Var2.a().name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                vr4 vr4Var = new vr4("submission_type", lowerCase);
                vr4 vr4Var2 = new vr4("submission_id", new Long(f95Var2.b));
                if (!(xu4Var2 instanceof xu4)) {
                    xu4Var3 = (xu4) xu4Var2;
                } else {
                    xu4Var3 = xu4Var;
                }
                if (xu4Var3 == null) {
                    obj2 = new Long(xu4Var3.f);
                } else {
                    obj2 = xu4Var;
                }
                vr4 vr4Var3 = new vr4("achievement_id", obj2);
                z = xu4Var2 instanceof yu4;
                if (!z) {
                    yu4Var = (yu4) xu4Var2;
                } else {
                    yu4Var = xu4Var;
                }
                if (yu4Var == 0) {
                    obj3 = new Long(yu4Var.f);
                } else {
                    obj3 = xu4Var;
                }
                vr4 vr4Var4 = new vr4("leaderboard_id", obj3);
                if (!z) {
                    yu4Var2 = (yu4) xu4Var2;
                } else {
                    yu4Var2 = xu4Var;
                }
                if (yu4Var2 == 0) {
                    obj4 = new Long(yu4Var2.g);
                } else {
                    obj4 = xu4Var;
                }
                vr4 vr4Var5 = new vr4("attempt_id", obj4);
                if (!z) {
                    yu4Var3 = (yu4) xu4Var2;
                } else {
                    yu4Var3 = xu4Var;
                }
                if (yu4Var3 == 0) {
                    obj5 = new Integer(yu4Var3.h);
                } else {
                    obj5 = xu4Var;
                }
                vr4 vr4Var6 = new vr4("raw_score", obj5);
                vr4 vr4Var7 = new vr4("hardcore", Boolean.TRUE);
                vr4 vr4Var8 = new vr4("submit_owner", "rc_client");
                vr4 vr4Var9 = new vr4("pending_total", new Integer(lc5Var.a));
                String lowerCase2 = fv4Var.name().toLowerCase(locale);
                lowerCase2.getClass();
                sz1Var.G0("ra_pending_added", vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, vr4Var6, vr4Var7, vr4Var8, vr4Var9, new vr4("add_result", lowerCase2), new vr4(obj, Boolean.FALSE));
                return jg7Var;
            }
        }
        j22Var = new j22(sz1Var, r41Var);
        Object obj62 = j22Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = j22Var.e0;
        jg7 jg7Var22 = jg7.a;
        if (i == 0) {
        }
        fv4 fv4Var2 = (fv4) obj62;
        lc5 lc5Var2 = ((bv4) nv4Var.i.A.getValue()).c;
        String name2 = xu4Var2.a().name();
        Locale locale2 = Locale.ROOT;
        String lowerCase3 = name2.toLowerCase(locale2);
        lowerCase3.getClass();
        vr4 vr4Var10 = new vr4("submission_type", lowerCase3);
        vr4 vr4Var22 = new vr4("submission_id", new Long(f95Var2.b));
        if (!(xu4Var2 instanceof xu4)) {
        }
        if (xu4Var3 == null) {
        }
        vr4 vr4Var32 = new vr4("achievement_id", obj2);
        z = xu4Var2 instanceof yu4;
        if (!z) {
        }
        if (yu4Var == 0) {
        }
        vr4 vr4Var42 = new vr4("leaderboard_id", obj3);
        if (!z) {
        }
        if (yu4Var2 == 0) {
        }
        vr4 vr4Var52 = new vr4("attempt_id", obj4);
        if (!z) {
        }
        if (yu4Var3 == 0) {
        }
        vr4 vr4Var62 = new vr4("raw_score", obj5);
        vr4 vr4Var72 = new vr4("hardcore", Boolean.TRUE);
        vr4 vr4Var82 = new vr4("submit_owner", "rc_client");
        vr4 vr4Var92 = new vr4("pending_total", new Integer(lc5Var2.a));
        String lowerCase22 = fv4Var2.name().toLowerCase(locale2);
        lowerCase22.getClass();
        sz1Var.G0("ra_pending_added", vr4Var10, vr4Var22, vr4Var32, vr4Var42, vr4Var52, vr4Var62, vr4Var72, vr4Var82, vr4Var92, new vr4("add_result", lowerCase22), new vr4(obj, Boolean.FALSE));
        return jg7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x010f, code lost:
        if (r2.h(r14, r3) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0112, code lost:
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0124, code lost:
        if (r2.g(r14, r3) == r4) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object K(sz1 sz1Var, h95 h95Var, r41 r41Var) {
        k22 k22Var;
        int i;
        Object obj;
        av4 av4Var;
        ic5 ic5Var;
        nv4 nv4Var;
        h95 h95Var2 = h95Var;
        if (r41Var instanceof k22) {
            k22Var = (k22) r41Var;
            int i2 = k22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k22Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj2 = k22Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = k22Var.e0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2 || i == 3) {
                            av4 av4Var2 = k22Var.Y;
                            nv4Var = k22Var.X;
                            h95 h95Var3 = k22Var.R;
                            oi2.Y(obj2);
                            av4Var = av4Var2;
                            h95Var2 = h95Var3;
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        av4 av4Var3 = k22Var.Y;
                        nv4Var = k22Var.X;
                        h95 h95Var4 = k22Var.R;
                        oi2.Y(obj2);
                        av4Var = av4Var3;
                        h95Var2 = h95Var4;
                        if (((Boolean) obj2).booleanValue() && ((bv4) nv4Var.i.A.getValue()).c.a == 0) {
                            xv2 xv2Var = sz1Var.m;
                            gd5 gd5Var = nv4Var.a;
                            xv2Var.b(gd5Var.a, gd5Var.c);
                        }
                    }
                } else {
                    oi2.Y(obj2);
                    nv4 nv4Var2 = sz1Var.b0;
                    if (nv4Var2 != null) {
                        long j = h95Var2.a;
                        long j2 = h95Var2.b;
                        if (j != nv4Var2.a.e) {
                            sz1Var.G0("ra_pending_resolution_rejected", new vr4("submission_id", new Long(j2)), new vr4("reason", "submission_session_mismatch"));
                            return jg7Var;
                        }
                        Iterator it = ((bv4) nv4Var2.i.A.getValue()).b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj = it.next();
                                if (((av4) obj).a.e() == j2) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        av4Var = (av4) obj;
                        if (av4Var != null) {
                            int i3 = wz1.h[av4Var.a.a().ordinal()];
                            if (i3 != 1) {
                                if (i3 == 2) {
                                    ic5Var = ic5.LEADERBOARD;
                                } else {
                                    i.d();
                                    return null;
                                }
                            } else {
                                ic5Var = ic5.ACHIEVEMENT;
                            }
                            if (ic5Var != h95Var2.c) {
                                sz1Var.G0("ra_pending_resolution_rejected", new vr4("submission_id", new Long(j2)), new vr4("reason", "submission_type_mismatch"));
                                return jg7Var;
                            }
                            int i4 = wz1.i[h95Var2.d.ordinal()];
                            if (i4 != 1 && i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 == 4) {
                                        k22Var.R = h95Var2;
                                        k22Var.X = nv4Var2;
                                        k22Var.Y = av4Var;
                                        k22Var.e0 = 3;
                                    } else {
                                        i.d();
                                        return null;
                                    }
                                } else {
                                    k22Var.R = h95Var2;
                                    k22Var.X = nv4Var2;
                                    k22Var.Y = av4Var;
                                    k22Var.e0 = 2;
                                }
                            } else {
                                k22Var.R = h95Var2;
                                k22Var.X = nv4Var2;
                                k22Var.Y = av4Var;
                                k22Var.e0 = 1;
                                Object a2 = nv4Var2.a(j2, k22Var);
                                if (a2 != x61Var) {
                                    nv4Var = nv4Var2;
                                    obj2 = a2;
                                    if (((Boolean) obj2).booleanValue()) {
                                        xv2 xv2Var2 = sz1Var.m;
                                        gd5 gd5Var2 = nv4Var.a;
                                        xv2Var2.b(gd5Var2.a, gd5Var2.c);
                                    }
                                }
                            }
                            return x61Var;
                        }
                    }
                    return jg7Var;
                }
                String name = av4Var.a.a().name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                lowerCase.getClass();
                vr4 vr4Var = new vr4("submission_type", lowerCase);
                vr4 vr4Var2 = new vr4("submission_id", new Long(h95Var2.b));
                String lowerCase2 = h95Var2.d.name().toLowerCase(locale);
                lowerCase2.getClass();
                sz1Var.G0("ra_pending_resolved", vr4Var, vr4Var2, new vr4("resolution", lowerCase2), new vr4("result_code", new Integer(h95Var2.e)), new vr4("pending_total", new Integer(((bv4) nv4Var.i.A.getValue()).c.a)), new vr4("submit_owner", "rc_client"));
                return jg7Var;
            }
        }
        k22Var = new k22(sz1Var, r41Var);
        Object obj22 = k22Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = k22Var.e0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        String name2 = av4Var.a.a().name();
        Locale locale2 = Locale.ROOT;
        String lowerCase3 = name2.toLowerCase(locale2);
        lowerCase3.getClass();
        vr4 vr4Var3 = new vr4("submission_type", lowerCase3);
        vr4 vr4Var22 = new vr4("submission_id", new Long(h95Var2.b));
        String lowerCase22 = h95Var2.d.name().toLowerCase(locale2);
        lowerCase22.getClass();
        sz1Var.G0("ra_pending_resolved", vr4Var3, vr4Var22, new vr4("resolution", lowerCase22), new vr4("result_code", new Integer(h95Var2.e)), new vr4("pending_total", new Integer(((bv4) nv4Var.i.A.getValue()).c.a)), new vr4("submit_owner", "rc_client"));
        return jg7Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0383, code lost:
        if (r8 > r3.c) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021d, code lost:
        if (r5 == defpackage.as3.PENDING) goto L239;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0797  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:340:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:351:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:352:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object L(sz1 sz1Var, l95 l95Var, r41 r41Var) {
        l22 l22Var;
        int i;
        jg7 jg7Var;
        Context context;
        ne2 ne2Var;
        l95 l95Var2;
        Object obj;
        Object obj2;
        l22 l22Var2;
        x61 x61Var;
        Object obj3;
        bs3 bs3Var;
        js3 ds3Var;
        bs3 bs3Var2;
        bs3 bs3Var3;
        bs3 bs3Var4;
        bs3 bs3Var5;
        js3 js3Var;
        bs3 bs3Var6;
        ls3 key;
        ne2 ne2Var2;
        x61 x61Var2;
        l22 l22Var3;
        c95 c95Var;
        Context context2;
        x61 x61Var3;
        ne2 ne2Var3;
        l22 l22Var4;
        x61 x61Var4;
        ls3 ls3Var;
        a95 a95Var;
        bt3 bt3Var;
        Long l;
        Long l2;
        Long l3;
        Long l4;
        Long l5;
        ls3 ls3Var2;
        as3 as3Var;
        a95 a95Var2;
        bt3 bt3Var2;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        oz1 oz1Var;
        oz1 oz1Var2;
        y95 y95Var;
        URL url;
        ta5 ta5Var;
        oz1 oz1Var3;
        URL url2;
        String str;
        String str2;
        x95 x95Var;
        ta5 ta5Var2;
        sz1 sz1Var2 = sz1Var;
        ks3 ks3Var = sz1Var2.Z;
        Context context3 = sz1Var2.b;
        kd6 kd6Var = sz1Var2.c;
        ne2 ne2Var4 = sz1Var2.F0;
        bg1 bg1Var = sz1Var2.a0;
        if (r41Var instanceof l22) {
            l22Var = (l22) r41Var;
            int i2 = l22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l22Var.e0 = i2 - Integer.MIN_VALUE;
                l22 l22Var5 = l22Var;
                Object obj4 = l22Var5.Z;
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                i = l22Var5.e0;
                jg7 jg7Var2 = jg7.a;
                switch (i) {
                    case 0:
                        oi2.Y(obj4);
                        if (l95Var instanceof b95) {
                            bg1Var.k();
                            long j = ((b95) l95Var).a;
                            Set entrySet = ks3Var.a.entrySet();
                            entrySet.getClass();
                            Iterator it = entrySet.iterator();
                            while (it.hasNext()) {
                                Map.Entry entry = (Map.Entry) it.next();
                                entry.getClass();
                                if (((bs3) entry.getValue()).b != as3.PENDING) {
                                    it.remove();
                                }
                            }
                            ks3Var.b.clear();
                            ks3Var.c = Math.max(ks3Var.c, j);
                            ks3Var.d = Math.max(ks3Var.d, j);
                            ks3Var.e = false;
                            sz1Var2.C0("leaderboard_runtime_reset", new vr4("attempt_floor", new Long(j)));
                            l22Var5.e0 = 1;
                            if (ne2Var4.a(ba5.a, l22Var5) == x61Var5) {
                                return x61Var5;
                            }
                            return jg7Var2;
                        }
                        c cVar = sz1Var2.O;
                        jg7Var = jg7Var2;
                        context = context3;
                        ne2Var = ne2Var4;
                        if (cVar != c.RC_CLIENT && cVar != c.RC_CLIENT_OFFLINE) {
                            nz1 y0 = y0(l95Var);
                            if (l95Var instanceof a95) {
                                a95Var2 = (a95) l95Var;
                            } else {
                                a95Var2 = null;
                            }
                            if (a95Var2 != null) {
                                if (a95Var2.e) {
                                    a95Var2 = null;
                                }
                                if (a95Var2 != null) {
                                    bt3Var2 = bg1Var.h(a95Var2.a, a95Var2.b);
                                    if (bt3Var2 != null || bt3Var2.a) {
                                        if (y0 == null) {
                                            l6 = new Long(y0.a);
                                        } else {
                                            l6 = null;
                                        }
                                        vr4 vr4Var = new vr4("leaderboard_id", l6);
                                        if (y0 == null) {
                                            l7 = new Long(y0.b);
                                        } else {
                                            l7 = null;
                                        }
                                        vr4 vr4Var2 = new vr4("attempt_id", l7);
                                        if (y0 == null) {
                                            l8 = new Long(y0.c);
                                        } else {
                                            l8 = null;
                                        }
                                        vr4 vr4Var3 = new vr4("event_sequence", l8);
                                        vr4 vr4Var4 = new vr4("event", gh5.a(l95Var.getClass()).c());
                                        vr4 vr4Var5 = new vr4("reason", "runtime_not_rc_client");
                                        if (bt3Var2 == null) {
                                            l9 = new Long(bt3Var2.b);
                                        } else {
                                            l9 = null;
                                        }
                                        vr4 vr4Var6 = new vr4("tracker_update_index", l9);
                                        if (bt3Var2 == null) {
                                            l10 = new Long(bt3Var2.c);
                                        } else {
                                            l10 = null;
                                        }
                                        sz1Var.C0("leaderboard_event_ignored", vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, vr4Var6, new vr4("suppressed_updates", l10));
                                        return jg7Var;
                                    }
                                    return jg7Var;
                                }
                            }
                            bt3Var2 = null;
                            if (bt3Var2 != null) {
                            }
                            if (y0 == null) {
                            }
                            vr4 vr4Var7 = new vr4("leaderboard_id", l6);
                            if (y0 == null) {
                            }
                            vr4 vr4Var22 = new vr4("attempt_id", l7);
                            if (y0 == null) {
                            }
                            vr4 vr4Var32 = new vr4("event_sequence", l8);
                            vr4 vr4Var42 = new vr4("event", gh5.a(l95Var.getClass()).c());
                            vr4 vr4Var52 = new vr4("reason", "runtime_not_rc_client");
                            if (bt3Var2 == null) {
                            }
                            vr4 vr4Var62 = new vr4("tracker_update_index", l9);
                            if (bt3Var2 == null) {
                            }
                            sz1Var.C0("leaderboard_event_ignored", vr4Var7, vr4Var22, vr4Var32, vr4Var42, vr4Var52, vr4Var62, new vr4("suppressed_updates", l10));
                            return jg7Var;
                        }
                        LinkedHashMap linkedHashMap = ks3Var.a;
                        l95Var.getClass();
                        if (ks3Var.e) {
                            l95Var2 = l95Var;
                            if (!(l95Var2 instanceof c95)) {
                                obj = "suppressed_updates";
                                obj2 = "tracker_update_index";
                                l22Var2 = l22Var5;
                                x61Var = x61Var5;
                                if (l95Var2 instanceof d95) {
                                    d95 d95Var = (d95) l95Var2;
                                    ls3Var2 = new ls3(d95Var.a, d95Var.b);
                                }
                                obj3 = "reason";
                                js3Var = null;
                                if (js3Var != null) {
                                    nz1 y02 = y0(l95Var2);
                                    if (l95Var2 instanceof a95) {
                                        a95Var = (a95) l95Var2;
                                    } else {
                                        a95Var = null;
                                    }
                                    if (a95Var != null) {
                                        if (a95Var.e) {
                                            a95Var = null;
                                        }
                                        if (a95Var != null) {
                                            bt3Var = bg1Var.h(a95Var.a, a95Var.b);
                                            if (bt3Var != null || bt3Var.a) {
                                                if (y02 == null) {
                                                    l = new Long(y02.a);
                                                } else {
                                                    l = null;
                                                }
                                                vr4 vr4Var8 = new vr4("leaderboard_id", l);
                                                if (y02 == null) {
                                                    l2 = new Long(y02.b);
                                                } else {
                                                    l2 = null;
                                                }
                                                vr4 vr4Var9 = new vr4("attempt_id", l2);
                                                if (y02 == null) {
                                                    l3 = new Long(y02.c);
                                                } else {
                                                    l3 = null;
                                                }
                                                vr4 vr4Var10 = new vr4("event_sequence", l3);
                                                vr4 vr4Var11 = new vr4("event", gh5.a(l95Var2.getClass()).c());
                                                vr4 vr4Var12 = new vr4(obj3, "stale_duplicate_or_terminal");
                                                if (bt3Var == null) {
                                                    l4 = new Long(bt3Var.b);
                                                } else {
                                                    l4 = null;
                                                }
                                                vr4 vr4Var13 = new vr4(obj2, l4);
                                                if (bt3Var == null) {
                                                    l5 = new Long(bt3Var.c);
                                                } else {
                                                    l5 = null;
                                                }
                                                sz1Var.C0("leaderboard_event_ignored", vr4Var8, vr4Var9, vr4Var10, vr4Var11, vr4Var12, vr4Var13, new vr4(obj, l5));
                                                return jg7Var;
                                            }
                                            return jg7Var;
                                        }
                                    }
                                    bt3Var = null;
                                    if (bt3Var != null) {
                                    }
                                    if (y02 == null) {
                                    }
                                    vr4 vr4Var82 = new vr4("leaderboard_id", l);
                                    if (y02 == null) {
                                    }
                                    vr4 vr4Var92 = new vr4("attempt_id", l2);
                                    if (y02 == null) {
                                    }
                                    vr4 vr4Var102 = new vr4("event_sequence", l3);
                                    vr4 vr4Var112 = new vr4("event", gh5.a(l95Var2.getClass()).c());
                                    vr4 vr4Var122 = new vr4(obj3, "stale_duplicate_or_terminal");
                                    if (bt3Var == null) {
                                    }
                                    vr4 vr4Var132 = new vr4(obj2, l4);
                                    if (bt3Var == null) {
                                    }
                                    sz1Var.C0("leaderboard_event_ignored", vr4Var82, vr4Var92, vr4Var102, vr4Var112, vr4Var122, vr4Var132, new vr4(obj, l5));
                                    return jg7Var;
                                }
                                Object obj5 = obj2;
                                Object obj6 = obj;
                                key = js3Var.getKey();
                                if (js3Var instanceof gs3) {
                                    bg1Var.j(key.a, key.b);
                                    sz1Var.D0(key, ((gs3) js3Var).a.c, "tracking", new vr4[0]);
                                    if (((ng6) kd6Var).b.getBoolean("ra_leaderboard_indicators", true)) {
                                        long j2 = key.a;
                                        l22Var4 = l22Var2;
                                        l22Var4.R = null;
                                        l22Var4.X = key;
                                        l22Var4.e0 = 2;
                                        obj4 = sz1Var.z0(j2, l22Var4);
                                        x61Var4 = x61Var;
                                        if (obj4 != x61Var4) {
                                            ls3Var = key;
                                            oz1Var = (oz1) obj4;
                                            if (oz1Var == null) {
                                                u95 u95Var = new u95(ls3Var, oz1Var.a, oz1Var.b);
                                                l22Var4.R = null;
                                                l22Var4.X = null;
                                                l22Var4.Y = null;
                                                l22Var4.e0 = 3;
                                                if (ne2Var.a(u95Var, l22Var4) == x61Var4) {
                                                    return x61Var4;
                                                }
                                                return jg7Var;
                                            }
                                            return jg7Var;
                                        }
                                        return x61Var4;
                                    }
                                    return jg7Var;
                                }
                                ne2Var2 = ne2Var;
                                x61Var2 = x61Var;
                                l22Var3 = l22Var2;
                                if (js3Var instanceof is3) {
                                    a95 a95Var3 = ((is3) js3Var).a;
                                    boolean z = a95Var3.e;
                                    String str3 = a95Var3.d;
                                    if (z) {
                                        bg1Var.j(key.a, key.b);
                                        sz1Var.D0(key, a95Var3.c, "tracker_show", new vr4("tracker_display", str3));
                                        x61Var3 = x61Var2;
                                        ne2Var3 = ne2Var2;
                                    } else {
                                        x61Var3 = x61Var2;
                                        ne2Var3 = ne2Var2;
                                        bt3 h = bg1Var.h(key.a, key.b);
                                        if (h.a) {
                                            sz1Var.D0(key, a95Var3.c, "tracker_update", new vr4("tracker_display", str3), new vr4(obj5, new Long(h.b)), new vr4(obj6, new Long(h.c)));
                                        }
                                    }
                                    if (((ng6) kd6Var).b.getBoolean("ra_leaderboard_indicators", true)) {
                                        v95 v95Var = new v95(key, str3);
                                        l22Var3.R = null;
                                        l22Var3.X = null;
                                        l22Var3.e0 = 4;
                                        x61 x61Var6 = x61Var3;
                                        if (ne2Var3.a(v95Var, l22Var3) == x61Var6) {
                                            return x61Var6;
                                        }
                                        return jg7Var;
                                    }
                                    return jg7Var;
                                } else if (js3Var instanceof hs3) {
                                    bg1Var.j(key.a, key.b);
                                    sz1Var.D0(key, ((hs3) js3Var).a.c, "tracker_hidden", new vr4[0]);
                                    if (((ng6) kd6Var).b.getBoolean("ra_leaderboard_indicators", true)) {
                                        z95 z95Var = new z95(key);
                                        l22Var3.R = null;
                                        l22Var3.X = null;
                                        l22Var3.e0 = 5;
                                        if (ne2Var2.a(z95Var, l22Var3) == x61Var2) {
                                            return x61Var2;
                                        }
                                        return jg7Var;
                                    }
                                    return jg7Var;
                                } else if (js3Var instanceof cs3) {
                                    bg1Var.j(key.a, key.b);
                                    sz1Var.D0(key, ((cs3) js3Var).a.c, "canceled", new vr4[0]);
                                    t95 t95Var = new t95(key.a, key);
                                    l22Var3.R = null;
                                    l22Var3.X = null;
                                    l22Var3.e0 = 6;
                                    if (ne2Var2.a(t95Var, l22Var3) == x61Var2) {
                                        return x61Var2;
                                    }
                                    return jg7Var;
                                } else if (js3Var instanceof es3) {
                                    z85 z85Var = ((es3) js3Var).a;
                                    long j3 = z85Var.c;
                                    vr4[] vr4VarArr = {new vr4("tracker_display", z85Var.d), new vr4("submit_owner", "rc_client"), new vr4("kotlin_submit", Boolean.FALSE)};
                                    sz1Var2 = sz1Var;
                                    sz1Var2.D0(key, j3, "pending", vr4VarArr);
                                    long j4 = key.a;
                                    l22Var3.R = js3Var;
                                    l22Var3.X = key;
                                    l22Var3.e0 = 7;
                                    obj4 = sz1Var2.z0(j4, l22Var3);
                                    if (obj4 == x61Var2) {
                                        return x61Var2;
                                    }
                                    oz1Var2 = (oz1) obj4;
                                    if (oz1Var2 == null) {
                                        sz1Var2.D0(key, ((es3) js3Var).a.c, "pending_metadata_unavailable", new vr4[0]);
                                    }
                                    if (oz1Var2 != null || (ta5Var = oz1Var2.a) == null || (r2 = ta5Var.g) == null) {
                                        String string = context.getString(R.string.leaderboard_generic_title, new Long(key.a));
                                        string.getClass();
                                    }
                                    if (oz1Var2 == null) {
                                        url = oz1Var2.b;
                                    } else {
                                        url = null;
                                    }
                                    y95Var = new y95(key, string, url, ((es3) js3Var).a.d);
                                    l22Var3.R = null;
                                    l22Var3.X = null;
                                    l22Var3.Y = null;
                                    l22Var3.e0 = 8;
                                    if (ne2Var2.a(y95Var, l22Var3) != x61Var2) {
                                        return x61Var2;
                                    }
                                    return jg7Var;
                                } else if (js3Var instanceof fs3) {
                                    c95Var = ((fs3) js3Var).a;
                                    context2 = context;
                                    bg1Var.j(key.a, key.b);
                                    sz1Var2 = sz1Var;
                                    sz1Var2.D0(key, c95Var.c, "scoreboard_final", new vr4("submitted_score", c95Var.d), new vr4("best_score", c95Var.e), new vr4("rank", new Long(c95Var.f)), new vr4("num_entries", new Long(c95Var.g)), new vr4("submit_owner", "rc_client"), new vr4("kotlin_submit", Boolean.FALSE));
                                    long j5 = key.a;
                                    l22Var3.R = null;
                                    l22Var3.X = key;
                                    l22Var3.Y = c95Var;
                                    l22Var3.e0 = 9;
                                    obj4 = sz1Var2.z0(j5, l22Var3);
                                    if (obj4 == x61Var2) {
                                        return x61Var2;
                                    }
                                    oz1Var3 = (oz1) obj4;
                                    if (oz1Var3 == null) {
                                        sz1Var2.D0(key, c95Var.c, "scoreboard_metadata_unavailable", new vr4[0]);
                                    }
                                    if (oz1Var3 != null || (ta5Var2 = oz1Var3.a) == null || (r0 = ta5Var2.g) == null) {
                                        String string2 = context2.getString(R.string.leaderboard_generic_title, new Long(key.a));
                                        string2.getClass();
                                    }
                                    String str4 = string2;
                                    if (oz1Var3 == null) {
                                        url2 = oz1Var3.b;
                                    } else {
                                        url2 = null;
                                    }
                                    key.getClass();
                                    c95Var.getClass();
                                    long j6 = key.a;
                                    String str5 = c95Var.d;
                                    str = c95Var.e;
                                    if (str.length() <= 0) {
                                        str2 = str;
                                    } else {
                                        str2 = null;
                                    }
                                    x95Var = new x95(j6, key, str4, url2, str5, str2, c95Var.f, c95Var.g);
                                    l22Var3.R = null;
                                    l22Var3.X = null;
                                    l22Var3.Y = null;
                                    l22Var3.e0 = 10;
                                    if (ne2Var2.a(x95Var, l22Var3) != x61Var2) {
                                        return x61Var2;
                                    }
                                    return jg7Var;
                                } else if (js3Var instanceof ds3) {
                                    bg1Var.j(key.a, key.b);
                                    d95 d95Var2 = ((ds3) js3Var).a;
                                    sz1Var.D0(key, d95Var2.c, "server_error", new vr4("result_code", new Integer(d95Var2.d)), new vr4("submit_owner", "rc_client"), new vr4("kotlin_submit", Boolean.FALSE));
                                    w95 w95Var = new w95(key.a, key, false);
                                    l22Var3.R = null;
                                    l22Var3.X = null;
                                    l22Var3.e0 = 11;
                                    if (ne2Var2.a(w95Var, l22Var3) == x61Var2) {
                                        return x61Var2;
                                    }
                                    return jg7Var;
                                } else {
                                    i.d();
                                    return null;
                                }
                            }
                            c95 c95Var2 = (c95) l95Var2;
                            x61Var = x61Var5;
                            obj2 = "tracker_update_index";
                            l22Var2 = l22Var5;
                            obj = "suppressed_updates";
                            ls3Var2 = new ls3(c95Var2.a, c95Var2.b);
                            bs3 bs3Var7 = (bs3) linkedHashMap.get(ls3Var2);
                            if (bs3Var7 != null) {
                                as3Var = bs3Var7.b;
                            } else {
                                as3Var = null;
                            }
                            break;
                        } else {
                            l95Var2 = l95Var;
                            obj = "suppressed_updates";
                            obj2 = "tracker_update_index";
                            l22Var2 = l22Var5;
                            x61Var = x61Var5;
                        }
                        if (!(l95Var2 instanceof y85)) {
                            obj3 = "reason";
                            if (l95Var2 instanceof a95) {
                                a95 a95Var4 = (a95) l95Var2;
                                ls3 ls3Var3 = new ls3(a95Var4.a, a95Var4.b);
                                long j7 = a95Var4.c;
                                as3 as3Var2 = as3.TRACKING;
                                if (ks3Var.a(ls3Var3, false) && (bs3Var5 = (bs3) linkedHashMap.get(ls3Var3)) != null) {
                                    as3 as3Var3 = bs3Var5.b;
                                    if (!ks3.b(as3Var3) && j7 > bs3Var5.c) {
                                        if (as3Var2 == null) {
                                            as3Var2 = as3Var3;
                                        }
                                        linkedHashMap.put(ls3Var3, bs3.a(bs3Var5, as3Var2, j7));
                                        ds3Var = new is3(a95Var4);
                                        js3Var = ds3Var;
                                    }
                                }
                                js3Var = null;
                            } else if (l95Var2 instanceof e95) {
                                e95 e95Var = (e95) l95Var2;
                                ls3 ls3Var4 = new ls3(e95Var.a, e95Var.b);
                                long j8 = e95Var.c;
                                if (ks3Var.a(ls3Var4, false) && (bs3Var4 = (bs3) linkedHashMap.get(ls3Var4)) != null) {
                                    as3 as3Var4 = bs3Var4.b;
                                    if (!ks3.b(as3Var4) && j8 > bs3Var4.c) {
                                        linkedHashMap.put(ls3Var4, bs3.a(bs3Var4, as3Var4, j8));
                                        ds3Var = new hs3(e95Var);
                                        js3Var = ds3Var;
                                    }
                                }
                                js3Var = null;
                            } else if (l95Var2 instanceof w85) {
                                w85 w85Var = (w85) l95Var2;
                                ls3 ls3Var5 = new ls3(w85Var.a, w85Var.b);
                                long j9 = w85Var.c;
                                as3 as3Var5 = as3.CANCELED;
                                if (ks3Var.a(ls3Var5, false) && ((bs3Var3 = (bs3) linkedHashMap.get(ls3Var5)) == null || (!ks3.b(bs3Var3.b) && j9 > bs3Var3.c))) {
                                    linkedHashMap.put(ls3Var5, new bs3(ls3Var5, as3Var5, j9));
                                    ds3Var = new cs3(w85Var);
                                    js3Var = ds3Var;
                                }
                                js3Var = null;
                            } else if (l95Var2 instanceof z85) {
                                z85 z85Var2 = (z85) l95Var2;
                                ls3 ls3Var6 = new ls3(z85Var2.a, z85Var2.b);
                                long j10 = z85Var2.c;
                                if (ks3Var.a(ls3Var6, false)) {
                                    bs3 bs3Var8 = (bs3) linkedHashMap.get(ls3Var6);
                                    if (bs3Var8 != null) {
                                        as3 as3Var6 = bs3Var8.b;
                                        if (!ks3.b(as3Var6)) {
                                            if (as3Var6 != as3.PENDING) {
                                                break;
                                            }
                                        }
                                    }
                                    linkedHashMap.put(ls3Var6, new bs3(ls3Var6, as3.PENDING, j10));
                                    ds3Var = new es3(z85Var2);
                                    js3Var = ds3Var;
                                }
                                js3Var = null;
                            } else if (l95Var2 instanceof c95) {
                                c95 c95Var3 = (c95) l95Var2;
                                ls3 ls3Var7 = new ls3(c95Var3.a, c95Var3.b);
                                long j11 = c95Var3.c;
                                as3 as3Var7 = as3.SCOREBOARD;
                                if (ks3Var.a(ls3Var7, true) && ((bs3Var2 = (bs3) linkedHashMap.get(ls3Var7)) == null || (!ks3.b(bs3Var2.b) && j11 > bs3Var2.c))) {
                                    linkedHashMap.put(ls3Var7, new bs3(ls3Var7, as3Var7, j11));
                                    ds3Var = new fs3(c95Var3);
                                    js3Var = ds3Var;
                                }
                                js3Var = null;
                            } else {
                                if (l95Var2 instanceof d95) {
                                    d95 d95Var3 = (d95) l95Var2;
                                    ls3 ls3Var8 = new ls3(d95Var3.a, d95Var3.b);
                                    long j12 = d95Var3.c;
                                    as3 as3Var8 = as3.FAILED;
                                    if (ks3Var.a(ls3Var8, true) && ((bs3Var = (bs3) linkedHashMap.get(ls3Var8)) == null || (!ks3.b(bs3Var.b) && j12 > bs3Var.c))) {
                                        linkedHashMap.put(ls3Var8, new bs3(ls3Var8, as3Var8, j12));
                                        ds3Var = new ds3(d95Var3);
                                        js3Var = ds3Var;
                                    }
                                }
                                js3Var = null;
                            }
                        } else {
                            y85 y85Var = (y85) l95Var2;
                            obj3 = "reason";
                            ls3 ls3Var9 = new ls3(y85Var.a, y85Var.b);
                            long j13 = y85Var.c;
                            if (ks3Var.a(ls3Var9, false) && ((bs3Var6 = (bs3) linkedHashMap.get(ls3Var9)) == null || j13 > bs3Var6.c)) {
                                Set entrySet2 = linkedHashMap.entrySet();
                                bi2 bi2Var = new bi2(19, ls3Var9, ks3Var);
                                entrySet2.getClass();
                                gt0.F0(entrySet2, bi2Var, true);
                                linkedHashMap.put(ls3Var9, new bs3(ls3Var9, as3.TRACKING, j13));
                                ds3Var = new gs3(y85Var);
                                js3Var = ds3Var;
                            }
                            js3Var = null;
                        }
                        if (js3Var != null) {
                        }
                        break;
                    case 1:
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 2:
                        ls3Var = l22Var5.X;
                        oi2.Y(obj4);
                        ne2Var = ne2Var4;
                        x61Var4 = x61Var5;
                        jg7Var = jg7Var2;
                        l22Var4 = l22Var5;
                        oz1Var = (oz1) obj4;
                        if (oz1Var == null) {
                        }
                        break;
                    case 3:
                    case 8:
                        oz1 oz1Var4 = (oz1) l22Var5.Y;
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 4:
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 5:
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 6:
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 7:
                        key = l22Var5.X;
                        js3 js3Var2 = l22Var5.R;
                        oi2.Y(obj4);
                        context = context3;
                        ne2Var2 = ne2Var4;
                        x61Var2 = x61Var5;
                        jg7Var = jg7Var2;
                        js3Var = js3Var2;
                        l22Var3 = l22Var5;
                        oz1Var2 = (oz1) obj4;
                        if (oz1Var2 == null) {
                        }
                        if (oz1Var2 != null) {
                            break;
                        }
                        String string3 = context.getString(R.string.leaderboard_generic_title, new Long(key.a));
                        string3.getClass();
                        if (oz1Var2 == null) {
                        }
                        y95Var = new y95(key, string3, url, ((es3) js3Var).a.d);
                        l22Var3.R = null;
                        l22Var3.X = null;
                        l22Var3.Y = null;
                        l22Var3.e0 = 8;
                        if (ne2Var2.a(y95Var, l22Var3) != x61Var2) {
                        }
                        break;
                    case 9:
                        c95 c95Var4 = l22Var5.Y;
                        ls3 ls3Var10 = l22Var5.X;
                        oi2.Y(obj4);
                        context2 = context3;
                        ne2Var2 = ne2Var4;
                        x61Var2 = x61Var5;
                        jg7Var = jg7Var2;
                        c95Var = c95Var4;
                        key = ls3Var10;
                        l22Var3 = l22Var5;
                        oz1Var3 = (oz1) obj4;
                        if (oz1Var3 == null) {
                        }
                        if (oz1Var3 != null) {
                            break;
                        }
                        String string22 = context2.getString(R.string.leaderboard_generic_title, new Long(key.a));
                        string22.getClass();
                        String str42 = string22;
                        if (oz1Var3 == null) {
                        }
                        key.getClass();
                        c95Var.getClass();
                        long j62 = key.a;
                        String str52 = c95Var.d;
                        str = c95Var.e;
                        if (str.length() <= 0) {
                        }
                        x95Var = new x95(j62, key, str42, url2, str52, str2, c95Var.f, c95Var.g);
                        l22Var3.R = null;
                        l22Var3.X = null;
                        l22Var3.Y = null;
                        l22Var3.e0 = 10;
                        if (ne2Var2.a(x95Var, l22Var3) != x61Var2) {
                        }
                        break;
                    case 10:
                        oi2.Y(obj4);
                        return jg7Var2;
                    case 11:
                        oi2.Y(obj4);
                        return jg7Var2;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        l22Var = new l22(sz1Var2, r41Var);
        l22 l22Var52 = l22Var;
        Object obj42 = l22Var52.Z;
        x61 x61Var52 = x61.COROUTINE_SUSPENDED;
        i = l22Var52.e0;
        jg7 jg7Var22 = jg7.a;
        switch (i) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object N(sz1 sz1Var, o75 o75Var, s41 s41Var) {
        r22 r22Var;
        int i;
        pq5 pq5Var;
        pq5 pq5Var2;
        o75 o75Var2;
        jb5 jb5Var;
        long j;
        String uuid;
        long j2;
        r22 r22Var2;
        long j3;
        long j4;
        jg7 jg7Var;
        o75 o75Var3;
        long j5;
        sz1 sz1Var2 = sz1Var;
        jg7 jg7Var2 = jg7.a;
        if (s41Var instanceof r22) {
            r22Var = (r22) s41Var;
            int i2 = r22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r22Var.e0 = i2 - Integer.MIN_VALUE;
                r22 r22Var3 = r22Var;
                Object obj = r22Var3.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = r22Var3.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j5 = r22Var3.Y;
                            o75Var3 = r22Var3.R;
                            oi2.Y(obj);
                            jg7Var = jg7Var2;
                            sz1Var2.H0("rc_client_submit_failed_queued_softcore", new vr4("achievement_id", new Long(o75Var3.a)), new vr4("game_id", new Long(j5)));
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pq5 pq5Var3 = r22Var3.X;
                    o75 o75Var4 = r22Var3.R;
                    oi2.Y(obj);
                    pq5Var2 = pq5Var3;
                    o75Var2 = o75Var4;
                } else {
                    oi2.Y(obj);
                    if (((ng6) sz1Var2.c).D()) {
                        cn5 cn5Var = sz1Var2.d;
                        en5 en5Var = cn5Var.c;
                        if (en5Var == null) {
                            en5Var = cn5Var.a();
                        }
                        if (en5Var.h && (pq5Var = sz1Var2.n1) != null) {
                            pn5 pn5Var = sz1Var2.g;
                            r22Var3.R = o75Var;
                            r22Var3.X = pq5Var;
                            r22Var3.e0 = 1;
                            obj = ((pl) pn5Var).c.b(r22Var3);
                            if (obj == x61Var) {
                                return x61Var;
                            }
                            pq5Var2 = pq5Var;
                            o75Var2 = o75Var;
                        }
                    }
                    return jg7Var2;
                }
                jb5Var = (jb5) obj;
                if (jb5Var != null) {
                    Long l = sz1Var2.L;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = o75Var2.b;
                    }
                    qz1 qz1Var = sz1Var2.M;
                    if (qz1Var != null) {
                        uuid = qz1Var.f;
                    } else {
                        uuid = UUID.randomUUID().toString();
                        uuid.getClass();
                    }
                    long j6 = j;
                    long currentTimeMillis = System.currentTimeMillis();
                    qz1 qz1Var2 = sz1Var2.M;
                    long j7 = 0;
                    if (qz1Var2 != null) {
                        j2 = currentTimeMillis;
                        j3 = qz1Var2.h;
                        r22Var2 = r22Var3;
                        qz1Var2.h = j3 + 1;
                    } else {
                        j2 = currentTimeMillis;
                        r22Var2 = r22Var3;
                        j3 = 0;
                    }
                    if (qz1Var2 != null) {
                        j4 = qz1Var2.g;
                    } else {
                        j4 = j2;
                    }
                    long j8 = j2 - j4;
                    if (j8 >= 0) {
                        j7 = j8;
                    }
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    jg7Var = jg7Var2;
                    sz1Var2 = sz1Var;
                    r22 r22Var4 = r22Var2;
                    ik ikVar = new ik(sz1Var2, j6, o75Var2, jb5Var, pq5Var2, uuid, j2, j7, j3, null);
                    r22Var4.R = o75Var2;
                    r22Var4.X = null;
                    r22Var4.Y = j6;
                    r22Var4.e0 = 2;
                    if (hv.d0(de1Var, ikVar, r22Var4) == x61Var) {
                        return x61Var;
                    }
                    o75Var3 = o75Var2;
                    j5 = j6;
                    sz1Var2.H0("rc_client_submit_failed_queued_softcore", new vr4("achievement_id", new Long(o75Var3.a)), new vr4("game_id", new Long(j5)));
                    return jg7Var;
                }
                return jg7Var2;
            }
        }
        r22Var = new r22(sz1Var2, s41Var);
        r22 r22Var32 = r22Var;
        Object obj2 = r22Var32.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = r22Var32.e0;
        if (i == 0) {
        }
        jb5Var = (jb5) obj2;
        if (jb5Var != null) {
        }
        return jg7Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r11 == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
        if (r11 != r1) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable O(sz1 sz1Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, nv4 nv4Var, s41 s41Var) {
        s22 s22Var;
        Object obj;
        int i;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        nv4 nv4Var2;
        if (s41Var instanceof s22) {
            s22Var = (s22) s41Var;
            int i2 = s22Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s22Var.d0 = i2 - Integer.MIN_VALUE;
                obj = s22Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = s22Var.d0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                nv4Var2 = s22Var.X;
                                oi2.Y(obj);
                                if (((Boolean) obj).booleanValue()) {
                                    List<av4> list = ((bv4) nv4Var2.i.A.getValue()).b;
                                    ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                                    for (av4 av4Var : list) {
                                        arrayList.add(new Long(av4Var.a.e()));
                                    }
                                    if (!arrayList.isEmpty()) {
                                        int size = arrayList.size();
                                        int i3 = 0;
                                        while (i3 < size) {
                                            Object obj2 = arrayList.get(i3);
                                            i3++;
                                            if (((Number) obj2).longValue() <= 0) {
                                                break;
                                            }
                                        }
                                    }
                                    if (gt0.k1(gt0.o1(arrayList)).size() != arrayList.size()) {
                                        sz1Var.G0("ra_pending_discard_rejected", new vr4("reason", "invalid_submission_ids"), new vr4("discard_reason", "logout"), new vr4("accepted", Boolean.FALSE));
                                        return null;
                                    }
                                    return arrayList;
                                }
                                return null;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        nv4Var2 = s22Var.X;
                        rARuntimeBridgeConfig2 = s22Var.R;
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue() && sz1Var.N == rARuntimeBridgeConfig2 && sz1Var.b0 == nv4Var2) {
                            gd5 gd5Var = nv4Var2.a;
                            s22Var.R = null;
                            s22Var.X = nv4Var2;
                            s22Var.d0 = 3;
                            obj = sz1Var.N0(gd5Var, s22Var);
                        }
                        return null;
                    }
                    nv4Var = s22Var.X;
                    rARuntimeBridgeConfig = s22Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (sz1Var.N == rARuntimeBridgeConfig && sz1Var.b0 == nv4Var && sz1Var.v0()) {
                        gd5 gd5Var2 = nv4Var.a;
                        s22Var.R = rARuntimeBridgeConfig;
                        s22Var.X = nv4Var;
                        s22Var.d0 = 1;
                        obj = sz1Var.N0(gd5Var2, s22Var);
                    }
                    return null;
                }
                if (((Boolean) obj).booleanValue()) {
                    s22Var.R = rARuntimeBridgeConfig;
                    s22Var.X = nv4Var;
                    s22Var.d0 = 2;
                    obj = sz1Var.P0(s22Var);
                    if (obj != x61Var) {
                        nv4 nv4Var3 = nv4Var;
                        rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                        nv4Var2 = nv4Var3;
                        if (((Boolean) obj).booleanValue()) {
                            gd5 gd5Var3 = nv4Var2.a;
                            s22Var.R = null;
                            s22Var.X = nv4Var2;
                            s22Var.d0 = 3;
                            obj = sz1Var.N0(gd5Var3, s22Var);
                        }
                    }
                    return x61Var;
                }
                return null;
            }
        }
        s22Var = new s22(sz1Var, s41Var);
        obj = s22Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = s22Var.d0;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(sz1 sz1Var, pq5 pq5Var, s41 s41Var) {
        v22 v22Var;
        int i;
        pq5 pq5Var2;
        if (s41Var instanceof v22) {
            v22Var = (v22) s41Var;
            int i2 = v22Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v22Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = v22Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = v22Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        pq5Var = v22Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    p06 p06Var = sz1Var.e;
                    Uri uri = pq5Var.d;
                    v22Var.R = pq5Var;
                    v22Var.Z = 1;
                    obj = ((xb2) p06Var).l(uri, v22Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                pq5Var2 = (pq5) obj;
                if (pq5Var2 != null) {
                    return pq5Var;
                }
                return pq5Var2;
            }
        }
        v22Var = new v22(sz1Var, s41Var);
        Object obj2 = v22Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = v22Var.Z;
        if (i == 0) {
        }
        pq5Var2 = (pq5) obj2;
        if (pq5Var2 != null) {
        }
    }

    public static final void R(sz1 sz1Var, String str, String str2) {
        Boolean bool;
        String str3;
        sz1Var.Y0(str, str2);
        synchronized (sz1Var.P) {
            try {
                bool = null;
                if (nb3.k(sz1Var.Q, str)) {
                    pl plVar = (pl) sz1Var.g;
                    plVar.getClass();
                    str.getClass();
                    boolean n = plVar.h.n(str);
                    if (n) {
                        sz1Var.Q = null;
                        if (nb3.k(sz1Var.R, str)) {
                            sz1Var.R = null;
                        }
                    }
                    bool = Boolean.valueOf(n);
                }
            } finally {
            }
        }
        if (bool == null) {
            sz1Var.G0("ra_runtime_identity_lease_release_ignored", new vr4("reason", str2));
            return;
        }
        if (bool.booleanValue()) {
            str3 = "ra_runtime_identity_lease_released";
        } else {
            str3 = "ra_runtime_identity_lease_release_failed";
        }
        sz1Var.G0(str3, new vr4("reason", str2), new vr4("released", bool), new vr4("lease_retained", Boolean.valueOf(!bool.booleanValue())));
    }

    public static final void T(sz1 sz1Var, hy1 hy1Var) {
        cn5 cn5Var = sz1Var.d;
        synchronized (cn5Var) {
            cn5Var.c = null;
        }
        ap6 ap6Var = sz1Var.E;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        ap6 ap6Var2 = sz1Var.F;
        if (ap6Var2 != null) {
            ap6Var2.h(null);
        }
        sz1Var.F = null;
        sz1Var.r0();
        sz1Var.g1("session_reset");
        nv4 j0 = sz1Var.j0();
        if (j0 != null) {
            hv.L(to7.a(sz1Var), null, null, new a6(j0, null, 19), 3);
        }
        o41 o41Var = sz1Var.z;
        yh2.m(o41Var.B, null);
        gu6 c2 = oi2.c();
        xe1 xe1Var = xk1.a;
        o41Var.B = jw2.y(c2, e04.a.Y);
        sz1Var.Z.c();
        sz1Var.a0.k();
        sx1 sx1Var = sz1Var.w;
        sx1Var.b = false;
        sx1Var.a = false;
        sx1Var.c = false;
        sx1Var.d = false;
        sx1Var.e = null;
        sz1Var.H0.l(null);
        tp6 tp6Var = sz1Var.p0;
        tp6Var.getClass();
        tp6Var.m(null, hy1Var);
        tp6 tp6Var2 = sz1Var.z0;
        t26 t26Var = t26.c;
        tp6Var2.l(t26Var);
        sz1Var.B0.l(t26Var);
        sz1Var.r0.l(null);
        sz1Var.n1 = null;
        sz1Var.o1 = null;
        sz1Var.v0.l(null);
        sz1Var.L = null;
        tu0 tu0Var = sz1Var.m0;
        if (tu0Var != null) {
            tu0Var.h(null);
        }
        sz1Var.m0 = null;
        lz1 lz1Var = sz1Var.n0;
        if (lz1Var != null) {
            lz1Var.b.h(null);
        }
        sz1Var.n0 = null;
        eb ebVar = sz1Var.h0;
        synchronized (ebVar.B) {
            tp6 tp6Var3 = (tp6) ebVar.R;
            uc5 uc5Var = uc5.a;
            tp6Var3.getClass();
            tp6Var3.m(null, uc5Var);
        }
        sz1Var.G = b.ONLINE_LIVE;
        sz1Var.H = d.SOFTCORE;
        sz1Var.e1(sb5.a, "session_reset");
        sz1Var.I = false;
        sz1Var.J = false;
        sz1Var.K = false;
        sz1Var.N = null;
        sz1Var.O = c.DISABLED;
        sz1Var.T = false;
        sz1Var.U = false;
        ((AtomicBoolean) sz1Var.V.A).set(false);
        sz1Var.W.clear();
        sz1Var.X.clear();
        sz1Var.Y.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0192 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0193 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object U(sz1 sz1Var, long j, boolean z, s41 s41Var) {
        b32 b32Var;
        x61 x61Var;
        int i;
        rx1 rx1Var;
        pq5 pq5Var;
        boolean z2;
        vr4 vr4Var;
        pq5 pq5Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        String str;
        Object l;
        vr4 vr4Var2;
        u75 u75Var;
        boolean z3;
        String str2;
        long j2;
        pq5 pq5Var3;
        String str3;
        oq1 oq1Var;
        boolean z4;
        String str4;
        String str5;
        oq1 oq1Var2;
        oq1 oq1Var3;
        long j3;
        s95 s95Var;
        of6 of6Var;
        ja5 ja5Var;
        String str6;
        long j4 = j;
        pn5 pn5Var = sz1Var.g;
        LinkedHashSet linkedHashSet = sz1Var.W;
        if (s41Var instanceof b32) {
            b32Var = (b32) s41Var;
            int i2 = b32Var.i0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b32Var.i0 = i2 - Integer.MIN_VALUE;
                Object obj = b32Var.g0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = b32Var.i0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    oi2.Y(obj);
                                    return jg7Var;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            z3 = b32Var.X;
                            j3 = b32Var.R;
                            oq1Var3 = b32Var.f0;
                            str2 = b32Var.e0;
                            u75Var = b32Var.d0;
                            oi2.Y(obj);
                            str3 = "";
                            ja5Var = (ja5) obj;
                            if (ja5Var == null) {
                                str6 = ja5Var.a;
                            } else {
                                str6 = null;
                            }
                            z4 = z3;
                            oq1Var2 = oq1Var3;
                            if (str6 != null) {
                                j2 = j3;
                                str5 = str2;
                                str4 = str3;
                                s95Var = new s95(str4, u75Var.e, str5, oq1Var2, z4);
                                of6Var = sz1Var.F0;
                                b32Var.Y = null;
                                b32Var.Z = null;
                                b32Var.d0 = null;
                                b32Var.e0 = null;
                                b32Var.f0 = null;
                                b32Var.R = j2;
                                b32Var.X = z4;
                                b32Var.i0 = 4;
                                if (of6Var.a(s95Var, b32Var) != x61Var) {
                                    return x61Var;
                                }
                                return jg7Var;
                            }
                            str4 = str6;
                            j2 = j3;
                            str5 = str2;
                            s95Var = new s95(str4, u75Var.e, str5, oq1Var2, z4);
                            of6Var = sz1Var.F0;
                            b32Var.Y = null;
                            b32Var.Z = null;
                            b32Var.d0 = null;
                            b32Var.e0 = null;
                            b32Var.f0 = null;
                            b32Var.R = j2;
                            b32Var.X = z4;
                            b32Var.i0 = 4;
                            if (of6Var.a(s95Var, b32Var) != x61Var) {
                            }
                        } else {
                            z3 = b32Var.X;
                            j2 = b32Var.R;
                            String str7 = b32Var.e0;
                            u75 u75Var2 = b32Var.d0;
                            pq5Var2 = b32Var.Z;
                            vr4 vr4Var3 = b32Var.Y;
                            oi2.Y(obj);
                            str2 = str7;
                            vr4Var2 = vr4Var3;
                            u75Var = u75Var2;
                            pq5Var3 = (pq5) obj;
                            if (pq5Var3 == null) {
                                str3 = "";
                                oq1Var = new oq1(pq5Var3.j);
                            } else {
                                str3 = "";
                                oq1Var = null;
                            }
                            if (u75Var != null) {
                                linkedHashSet.remove(vr4Var2);
                                return jg7Var;
                            } else if (u75Var.d == r75.Core) {
                                String str8 = pq5Var2.i;
                                b32Var.Y = null;
                                b32Var.Z = null;
                                b32Var.d0 = u75Var;
                                b32Var.e0 = str2;
                                b32Var.f0 = oq1Var;
                                b32Var.R = j2;
                                b32Var.X = z3;
                                b32Var.i0 = 3;
                                obj = ((pl) pn5Var).l(str8, b32Var);
                                if (obj != x61Var) {
                                    oq1Var3 = oq1Var;
                                    j3 = j2;
                                    ja5Var = (ja5) obj;
                                    if (ja5Var == null) {
                                    }
                                    z4 = z3;
                                    oq1Var2 = oq1Var3;
                                    if (str6 != null) {
                                    }
                                }
                                return x61Var;
                            } else {
                                String str9 = u75Var.c;
                                z4 = z3;
                                if (str9 == null) {
                                    str5 = str2;
                                    oq1Var2 = oq1Var;
                                    str4 = str3;
                                    s95Var = new s95(str4, u75Var.e, str5, oq1Var2, z4);
                                    of6Var = sz1Var.F0;
                                    b32Var.Y = null;
                                    b32Var.Z = null;
                                    b32Var.d0 = null;
                                    b32Var.e0 = null;
                                    b32Var.f0 = null;
                                    b32Var.R = j2;
                                    b32Var.X = z4;
                                    b32Var.i0 = 4;
                                    if (of6Var.a(s95Var, b32Var) != x61Var) {
                                    }
                                } else {
                                    str4 = str9;
                                    str5 = str2;
                                    oq1Var2 = oq1Var;
                                    s95Var = new s95(str4, u75Var.e, str5, oq1Var2, z4);
                                    of6Var = sz1Var.F0;
                                    b32Var.Y = null;
                                    b32Var.Z = null;
                                    b32Var.d0 = null;
                                    b32Var.e0 = null;
                                    b32Var.f0 = null;
                                    b32Var.R = j2;
                                    b32Var.X = z4;
                                    b32Var.i0 = 4;
                                    if (of6Var.a(s95Var, b32Var) != x61Var) {
                                    }
                                }
                            }
                        }
                    } else {
                        boolean z5 = b32Var.X;
                        long j5 = b32Var.R;
                        pq5 pq5Var4 = b32Var.Z;
                        vr4 vr4Var4 = b32Var.Y;
                        oi2.Y(obj);
                        vr4Var = vr4Var4;
                        z2 = z5;
                        pq5Var2 = pq5Var4;
                        j4 = j5;
                    }
                } else {
                    oi2.Y(obj);
                    vr4 vr4Var5 = new vr4(new Long(j4), Boolean.valueOf(z));
                    if (linkedHashSet.add(vr4Var5)) {
                        lb4 lb4Var = sz1Var.w.e;
                        if (lb4Var instanceof rx1) {
                            rx1Var = (rx1) lb4Var;
                        } else {
                            rx1Var = null;
                        }
                        if (rx1Var != null) {
                            pq5Var = rx1Var.o;
                        } else {
                            pq5Var = null;
                        }
                        if (pq5Var == null) {
                            linkedHashSet.remove(vr4Var5);
                            return jg7Var;
                        }
                        b32Var.Y = vr4Var5;
                        b32Var.Z = pq5Var;
                        b32Var.R = j4;
                        z2 = z;
                        b32Var.X = z2;
                        b32Var.i0 = 1;
                        Object i3 = ((pl) pn5Var).i(j4, b32Var);
                        if (i3 != x61Var) {
                            vr4Var = vr4Var5;
                            pq5Var2 = pq5Var;
                            obj = i3;
                        }
                        return x61Var;
                    }
                    return jg7Var;
                }
                vr4 vr4Var6 = vr4Var;
                u75 u75Var3 = (u75) obj;
                rARuntimeBridgeConfig = sz1Var.N;
                if (rARuntimeBridgeConfig == null) {
                    str = rARuntimeBridgeConfig.getUsername();
                } else {
                    str = null;
                }
                p06 p06Var = sz1Var.e;
                Uri uri = pq5Var2.d;
                b32Var.Y = vr4Var6;
                b32Var.Z = pq5Var2;
                b32Var.d0 = u75Var3;
                b32Var.e0 = str;
                b32Var.R = j4;
                b32Var.X = z2;
                long j6 = j4;
                b32Var.i0 = 2;
                l = ((xb2) p06Var).l(uri, b32Var);
                if (l != x61Var) {
                    vr4Var2 = vr4Var6;
                    u75Var = u75Var3;
                    obj = l;
                    z3 = z2;
                    str2 = str;
                    j2 = j6;
                    pq5Var3 = (pq5) obj;
                    if (pq5Var3 == null) {
                    }
                    if (u75Var != null) {
                    }
                }
                return x61Var;
            }
        }
        b32Var = new b32(sz1Var, s41Var);
        Object obj2 = b32Var.g0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = b32Var.i0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        vr4 vr4Var62 = vr4Var;
        u75 u75Var32 = (u75) obj2;
        rARuntimeBridgeConfig = sz1Var.N;
        if (rARuntimeBridgeConfig == null) {
        }
        p06 p06Var2 = sz1Var.e;
        Uri uri2 = pq5Var2.d;
        b32Var.Y = vr4Var62;
        b32Var.Z = pq5Var2;
        b32Var.d0 = u75Var32;
        b32Var.e0 = str;
        b32Var.R = j4;
        b32Var.X = z2;
        long j62 = j4;
        b32Var.i0 = 2;
        l = ((xb2) p06Var2).l(uri2, b32Var);
        if (l != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
        if (r17.f1(r6) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0199, code lost:
        if (r17.Y(r6) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01ad, code lost:
        if (r2 != r7) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object V(sz1 sz1Var, x85 x85Var, vs3 vs3Var, s41 s41Var) {
        p32 p32Var;
        int i;
        vs3 vs3Var2;
        x85 x85Var2;
        vs3 vs3Var3;
        Object value;
        x85 x85Var3 = x85Var;
        jf4 jf4Var = sz1Var.o;
        sx1 sx1Var = sz1Var.w;
        of6 of6Var = sz1Var.F0;
        if (s41Var instanceof p32) {
            p32Var = (p32) s41Var;
            int i2 = p32Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p32Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = p32Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = p32Var.d0;
                jg7 jg7Var = jg7.a;
                switch (i) {
                    case 0:
                        oi2.Y(obj);
                        sz1Var.H0("leaderboard_complete_received", new vr4("leaderboard_id", new Long(x85Var3.a)), new vr4("value", new Integer(x85Var3.b)), new vr4("network_mode", sz1Var.G.name()), new vr4("session_mode", sz1Var.H.name()), new vr4("online", Boolean.valueOf(jf4Var.b())));
                        if (sz1Var.G == b.ONLINE_LIVE && !jf4Var.a()) {
                            p32Var.R = x85Var3;
                            vs3Var2 = vs3Var;
                            p32Var.X = vs3Var2;
                            p32Var.d0 = 1;
                            break;
                        } else {
                            vs3Var2 = vs3Var;
                        }
                        if (sz1Var.G != b.OFFLINE_ACCUMULATING) {
                            long j = x85Var3.a;
                            long j2 = x85Var3.a;
                            sz1Var.H0("leaderboard_submit_skipped_offline", new vr4("leaderboard_id", new Long(j)));
                            sz1Var.i0(j2, "offline_skipped");
                            t95 t95Var = new t95(j2, null);
                            p32Var.R = null;
                            p32Var.X = null;
                            p32Var.d0 = 2;
                            if (of6Var.a(t95Var, p32Var) == obj2) {
                                return obj2;
                            }
                            return jg7Var;
                        }
                        if (!sx1Var.a) {
                            long j3 = x85Var3.a;
                            long j4 = x85Var3.a;
                            sz1Var.H0("leaderboard_submit_skipped_mode", new vr4("leaderboard_id", new Long(j3)), new vr4("hardcore_enabled", Boolean.valueOf(sx1Var.a)));
                            sz1Var.i0(j4, "mode_skipped");
                            t95 t95Var2 = new t95(j4, null);
                            p32Var.R = null;
                            p32Var.X = null;
                            p32Var.d0 = 3;
                            if (of6Var.a(t95Var2, p32Var) == obj2) {
                            }
                        } else {
                            long j5 = x85Var3.a;
                            p32Var.R = x85Var3;
                            p32Var.X = vs3Var2;
                            p32Var.d0 = 4;
                            Object o0 = sz1Var.o0(j5, p32Var);
                            if (o0 != obj2) {
                                x85Var2 = x85Var3;
                                vs3Var3 = vs3Var2;
                                obj = o0;
                                if (((Boolean) obj).booleanValue()) {
                                    sz1Var.i0(x85Var2.a, "context_mismatch");
                                    t95 t95Var3 = new t95(x85Var2.a, null);
                                    p32Var.R = null;
                                    p32Var.X = null;
                                    p32Var.d0 = 5;
                                    if (of6Var.a(t95Var3, p32Var) == obj2) {
                                    }
                                } else {
                                    if (sx1Var.a) {
                                        p32Var.R = x85Var2;
                                        p32Var.X = vs3Var3;
                                        p32Var.d0 = 6;
                                        break;
                                    }
                                    pn5 pn5Var = sz1Var.g;
                                    long j6 = x85Var2.a;
                                    p32Var.R = x85Var2;
                                    p32Var.X = vs3Var3;
                                    p32Var.d0 = 7;
                                    obj = ((pl) pn5Var).n(j6, p32Var);
                                    break;
                                }
                            }
                        }
                        return obj2;
                    case 1:
                        vs3 vs3Var4 = p32Var.X;
                        x85 x85Var4 = p32Var.R;
                        oi2.Y(obj);
                        vs3Var2 = vs3Var4;
                        x85Var3 = x85Var4;
                        if (sz1Var.G != b.OFFLINE_ACCUMULATING) {
                        }
                        break;
                    case 2:
                        oi2.Y(obj);
                        return jg7Var;
                    case 3:
                        oi2.Y(obj);
                        return jg7Var;
                    case 4:
                        vs3Var3 = p32Var.X;
                        x85Var2 = p32Var.R;
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                        return obj2;
                    case 5:
                        oi2.Y(obj);
                        return jg7Var;
                    case 6:
                        vs3Var3 = p32Var.X;
                        x85Var2 = p32Var.R;
                        oi2.Y(obj);
                        pn5 pn5Var2 = sz1Var.g;
                        long j62 = x85Var2.a;
                        p32Var.R = x85Var2;
                        p32Var.X = vs3Var3;
                        p32Var.d0 = 7;
                        obj = ((pl) pn5Var2).n(j62, p32Var);
                        break;
                    case 7:
                        vs3Var3 = p32Var.X;
                        x85Var2 = p32Var.R;
                        oi2.Y(obj);
                        ta5 ta5Var = (ta5) obj;
                        if (ta5Var != null) {
                            hb5 W0 = W0(sz1Var.N);
                            if (W0 == null) {
                                sz1Var.i0(x85Var2.a, "missing_runtime_authentication");
                                return jg7Var;
                            }
                            ci0 ci0Var = sz1Var.x;
                            int i3 = vs3Var3.b;
                            String str = vs3Var3.c;
                            ci0Var.getClass();
                            tp6 tp6Var = (tp6) ci0Var.g;
                            do {
                                value = tp6Var.getValue();
                            } while (!tp6Var.j(value, gt0.U0(new un5(ta5Var, i3, str, W0, true), (List) value)));
                            v80 v80Var = (v80) ci0Var.f;
                            if (v80Var != null) {
                                v80Var.c(jg7Var);
                            }
                        }
                        return jg7Var;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        p32Var = new p32(sz1Var, s41Var);
        Object obj3 = p32Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = p32Var.d0;
        jg7 jg7Var2 = jg7.a;
        switch (i) {
        }
    }

    public static hb5 W0(RARuntimeBridgeConfig rARuntimeBridgeConfig) {
        String username;
        String apiToken;
        if (rARuntimeBridgeConfig == null || (username = rARuntimeBridgeConfig.getUsername()) == null) {
            return null;
        }
        if (qs6.v0(username)) {
            username = null;
        }
        if (username == null || (apiToken = rARuntimeBridgeConfig.getApiToken()) == null) {
            return null;
        }
        if (qs6.v0(apiToken)) {
            apiToken = null;
        }
        if (apiToken == null) {
            return null;
        }
        return new hb5(username, apiToken);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00eb, code lost:
        if (r8 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ee, code lost:
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fb, code lost:
        if (r8 < 0) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static z66 X(z66 z66Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, p66 p66Var) {
        vr4 vr4Var;
        int E;
        List<j05> list = z66Var.c;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((j05) obj).b.isScreen()) {
                    arrayList.add(obj);
                }
            }
            int i3 = 1;
            if (arrayList.size() == 1 && i > 0 && i2 > 0) {
                j05 j05Var = (j05) gt0.b1(arrayList);
                if (z) {
                    int min = Math.min(i / 256, i2 / 192);
                    float min2 = min <= 0 ? Math.min(i / 256.0f, i2 / 192.0f) : min;
                    int E2 = u24.E(256.0f * min2);
                    if (E2 < 1) {
                        E2 = 1;
                    }
                    if (E2 > i) {
                        E2 = i;
                    }
                    int E3 = u24.E(192.0f * min2);
                    if (E3 < 1) {
                        E3 = 1;
                    }
                    if (E3 > i2) {
                        E3 = i2;
                    }
                    vr4Var = new vr4(Integer.valueOf(E2), Integer.valueOf(E3));
                } else if (z2) {
                    float min3 = Math.min(i / 256.0f, i2 / 192.0f);
                    int E4 = u24.E(256.0f * min3);
                    if (E4 < 1) {
                        E4 = 1;
                    }
                    if (E4 > i) {
                        E4 = i;
                    }
                    int E5 = u24.E(192.0f * min3);
                    if (E5 < 1) {
                        E5 = 1;
                    }
                    if (E5 > i2) {
                        E5 = i2;
                    }
                    vr4Var = new vr4(Integer.valueOf(E4), Integer.valueOf(E5));
                } else {
                    vr4Var = new vr4(Integer.valueOf(i), Integer.valueOf(i2));
                }
                int intValue = ((Number) vr4Var.A).intValue();
                int intValue2 = ((Number) vr4Var.B).intValue();
                if (z4) {
                    intValue = i;
                }
                if (z3) {
                    intValue2 = i2;
                }
                int E6 = u24.E((i - intValue) / 2.0f);
                int i4 = 0;
                if (E6 < 0) {
                    E6 = 0;
                }
                int i5 = wz1.f[p66Var.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            E = i2 - intValue2;
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        E = u24.E((i2 - intValue2) / 2.0f);
                    }
                }
                if (intValue < 1) {
                    intValue = 1;
                }
                if (intValue2 >= 1) {
                    i3 = intValue2;
                }
                Rect rect = new Rect(E6, i4, intValue, i3);
                ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                for (j05 j05Var2 : list) {
                    if (nb3.k(j05Var2, j05Var)) {
                        j05Var2 = j05.a(j05Var2, rect);
                    }
                    arrayList2.add(j05Var2);
                }
                return z66.a(z66Var, null, null, arrayList2, 3);
            }
            return z66Var;
        }
        return z66Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r7 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(sz1 sz1Var, s41 s41Var) {
        xz1 xz1Var;
        Object obj;
        int i;
        boolean z;
        hb5 hb5Var;
        String str;
        if (s41Var instanceof xz1) {
            xz1Var = (xz1) s41Var;
            int i2 = xz1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xz1Var.Z = i2 - Integer.MIN_VALUE;
                obj = xz1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = xz1Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            str = xz1Var.R;
                            oi2.Y(obj);
                            if (((Boolean) obj).booleanValue()) {
                                synchronized (sz1Var.P) {
                                    sz1Var.Q = str;
                                }
                                sz1Var.G0("ra_runtime_identity_lease_acquired", new vr4("runtime_path", sz1Var.O.getTraceValue()));
                                return str;
                            }
                            return null;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    synchronized (sz1Var.P) {
                        if (sz1Var.Q != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                    }
                    if (!z) {
                        pn5 pn5Var = sz1Var.g;
                        xz1Var.Z = 1;
                        obj = ((pl) pn5Var).c.b(xz1Var);
                    }
                    return null;
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    pn5 pn5Var2 = sz1Var.g;
                    xz1Var.R = uuid;
                    xz1Var.Z = 2;
                    obj = ((pl) pn5Var2).a(uuid, hb5Var, xz1Var);
                    if (obj != x61Var) {
                        str = uuid;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    return x61Var;
                }
                return null;
            }
        }
        xz1Var = new xz1(sz1Var, s41Var);
        obj = xz1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = xz1Var.Z;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0048 -> B:25:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(sz1 sz1Var, s41 s41Var) {
        b02 b02Var;
        int i;
        boolean z;
        if (s41Var instanceof b02) {
            b02Var = (b02) s41Var;
            int i2 = b02Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b02Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = b02Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = b02Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        tu0 tu0Var = b02Var.R;
                        oi2.Y(obj);
                        synchronized (sz1Var.P) {
                            if (sz1Var.S == tu0Var) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (z) {
                            return jg7.a;
                        }
                        synchronized (sz1Var.P) {
                            tu0Var = sz1Var.S;
                        }
                        if (tu0Var == null) {
                            return jg7.a;
                        }
                        b02Var.R = tu0Var;
                        b02Var.Z = 1;
                        Object q = tu0Var.q(b02Var);
                        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                        if (q == x61Var) {
                            return x61Var;
                        }
                        synchronized (sz1Var.P) {
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    synchronized (sz1Var.P) {
                    }
                }
            }
        }
        b02Var = new b02(sz1Var, s41Var);
        Object obj2 = b02Var.X;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        i = b02Var.Z;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x033b  */
    /* JADX WARN: Type inference failed for: r1v18, types: [qn2] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [qn2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(sz1 sz1Var, pq5 pq5Var, s41 s41Var) {
        g02 g02Var;
        String[] stringArray;
        String[] stringArray2;
        String[] strArr;
        Object D;
        pq5 pq5Var2;
        VideoFiltering videoFiltering;
        String[] strArr2;
        String[] strArr3;
        EmulatorConfiguration emulatorConfiguration;
        Object D2;
        pq5 pq5Var3;
        String[] strArr4;
        String[] strArr5;
        EmulatorConfiguration emulatorConfiguration2;
        String str;
        Object d2;
        VideoFiltering videoFiltering2;
        String str2;
        String[] strArr6;
        EmulatorConfiguration emulatorConfiguration3;
        fk3 fk3Var;
        int i;
        String string;
        kd6 kd6Var;
        Iterator it;
        a36 a36Var;
        a36 a36Var2;
        wa3 wa3Var;
        Context context;
        Object D3;
        x61 x61Var;
        a36 a36Var3;
        VideoFiltering videoFiltering3;
        String str3;
        String[] strArr7;
        String[] strArr8;
        String str4;
        k0 k0Var;
        Iterator it2;
        String str5;
        int i2;
        jq1 jq1Var;
        int i3;
        Context context2;
        String string2;
        nx5 nx5Var;
        String str6;
        UUID uuid;
        boolean z;
        String str7;
        String str8;
        String str9;
        pq5 pq5Var4;
        VideoFiltering videoFiltering4;
        String[] strArr9;
        boolean z2;
        int i4;
        String str10;
        String str11;
        pq5 pq5Var5;
        k0 k0Var2;
        String name;
        String str12;
        String str13;
        a36 a36Var4;
        String str14;
        int i5;
        boolean z3;
        String name2;
        k0 k0Var3;
        fk3 fk3Var2;
        pq5 pq5Var6 = pq5Var;
        wa3 wa3Var2 = sz1Var.q;
        kd6 kd6Var2 = sz1Var.c;
        Context context3 = sz1Var.b;
        if (s41Var instanceof g02) {
            g02Var = (g02) s41Var;
            int i6 = g02Var.s0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                g02Var.s0 = i6 - Integer.MIN_VALUE;
                Object obj = g02Var.q0;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                switch (g02Var.s0) {
                    case 0:
                        oi2.Y(obj);
                        stringArray = context3.getResources().getStringArray(R.array.rom_input_mode_options);
                        stringArray.getClass();
                        String[] stringArray3 = context3.getResources().getStringArray(R.array.video_filtering_options);
                        stringArray3.getClass();
                        stringArray2 = context3.getResources().getStringArray(R.array.game_runtime_mic_source_options);
                        stringArray2.getClass();
                        jt5 jt5Var = pq5Var6.f;
                        g02Var.R = pq5Var6;
                        g02Var.X = stringArray;
                        g02Var.Y = stringArray3;
                        g02Var.Z = stringArray2;
                        g02Var.s0 = 1;
                        Object l = ((ng6) kd6Var2).l(jt5Var, g02Var);
                        if (l != x61Var2) {
                            strArr = stringArray3;
                            obj = l;
                            EmulatorConfiguration emulatorConfiguration4 = (EmulatorConfiguration) obj;
                            VideoFiltering videoFiltering5 = emulatorConfiguration4.getRendererConfiguration().getVideoFiltering();
                            wp0 F = ((ng6) kd6Var2).F();
                            g02Var.R = pq5Var6;
                            g02Var.X = stringArray;
                            g02Var.Y = strArr;
                            g02Var.Z = stringArray2;
                            g02Var.d0 = emulatorConfiguration4;
                            g02Var.e0 = videoFiltering5;
                            g02Var.s0 = 2;
                            D = f04.D(F, g02Var);
                            if (D != x61Var2) {
                                pq5Var2 = pq5Var6;
                                videoFiltering = videoFiltering5;
                                strArr2 = stringArray;
                                strArr3 = stringArray2;
                                emulatorConfiguration = emulatorConfiguration4;
                                obj = D;
                                String str15 = (String) obj;
                                wp0 E = ((ng6) kd6Var2).E();
                                g02Var.R = pq5Var2;
                                g02Var.X = strArr2;
                                g02Var.Y = strArr;
                                g02Var.Z = strArr3;
                                g02Var.d0 = emulatorConfiguration;
                                g02Var.e0 = videoFiltering;
                                g02Var.f0 = str15;
                                g02Var.s0 = 3;
                                D2 = f04.D(E, g02Var);
                                if (D2 != x61Var2) {
                                    pq5Var3 = pq5Var2;
                                    strArr4 = strArr2;
                                    strArr5 = strArr3;
                                    emulatorConfiguration2 = emulatorConfiguration;
                                    str = str15;
                                    obj = D2;
                                    String str16 = (String) obj;
                                    UUID v = ((ng6) kd6Var2).v();
                                    g02Var.R = pq5Var3;
                                    g02Var.X = strArr4;
                                    g02Var.Y = strArr;
                                    g02Var.Z = strArr5;
                                    g02Var.d0 = emulatorConfiguration2;
                                    g02Var.e0 = videoFiltering;
                                    g02Var.f0 = str;
                                    g02Var.g0 = str16;
                                    g02Var.s0 = 4;
                                    d2 = wa3Var2.d(v, g02Var);
                                    if (d2 != x61Var2) {
                                        EmulatorConfiguration emulatorConfiguration5 = emulatorConfiguration2;
                                        videoFiltering2 = videoFiltering;
                                        str2 = str16;
                                        obj = d2;
                                        strArr6 = strArr4;
                                        emulatorConfiguration3 = emulatorConfiguration5;
                                        fk3Var = (fk3) obj;
                                        if (fk3Var != null || (str5 = fk3Var.b) == null) {
                                            i = R.string.not_set;
                                            string = context3.getString(R.string.not_set);
                                            string.getClass();
                                        } else {
                                            string = str5;
                                            i = R.string.not_set;
                                        }
                                        if (str == null) {
                                            str = context3.getString(i);
                                            str.getClass();
                                        }
                                        if (str2 == null) {
                                            str2 = context3.getString(i);
                                            str2.getClass();
                                        }
                                        kd6Var = kd6Var2;
                                        k0 k0Var4 = new k0(sz1Var, 29);
                                        it = a36.getEntries().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                ?? next = it.next();
                                                it2 = it;
                                                if (((a36) next).getMicSource() == emulatorConfiguration3.getMicSource()) {
                                                    a36Var = next;
                                                } else {
                                                    it = it2;
                                                }
                                            } else {
                                                a36Var = null;
                                            }
                                        }
                                        a36Var2 = a36Var;
                                        if (a36Var2 == null) {
                                            a36Var2 = a36.DEFAULT;
                                        }
                                        ng6 ng6Var = (ng6) kd6Var;
                                        wa3Var = wa3Var2;
                                        context = context3;
                                        wp0 wp0Var = new wp0(9, ng6Var.G(), ng6Var);
                                        g02Var.R = pq5Var3;
                                        g02Var.X = strArr6;
                                        g02Var.Y = strArr;
                                        g02Var.Z = strArr5;
                                        g02Var.d0 = emulatorConfiguration3;
                                        g02Var.e0 = videoFiltering2;
                                        g02Var.f0 = null;
                                        g02Var.g0 = null;
                                        g02Var.h0 = string;
                                        g02Var.i0 = str;
                                        g02Var.j0 = str2;
                                        g02Var.k0 = k0Var4;
                                        g02Var.l0 = a36Var2;
                                        g02Var.s0 = 5;
                                        D3 = f04.D(wp0Var, g02Var);
                                        x61Var = x61Var2;
                                        if (D3 != x61Var) {
                                            return x61Var;
                                        }
                                        a36Var3 = a36Var2;
                                        videoFiltering3 = videoFiltering2;
                                        str3 = str2;
                                        strArr7 = strArr5;
                                        strArr8 = strArr;
                                        str4 = str;
                                        k0Var = k0Var4;
                                        obj = D3;
                                        boolean k = nb3.k(obj, Boolean.TRUE);
                                        if (emulatorConfiguration3.getRendererConfiguration().getRenderer() != VideoRenderer.VULKAN && videoFiltering3 == VideoFiltering.RETROARCH && k) {
                                            i2 = 1;
                                        } else {
                                            i2 = 0;
                                        }
                                        jq1Var = pq5Var3.f.p;
                                        if (jq1Var == null) {
                                            jq1Var = ((ng6) kd6Var).i();
                                        }
                                        i3 = wz1.l[jq1Var.ordinal()];
                                        if (i3 == 1) {
                                            if (i3 != 2) {
                                                if (i3 == 3) {
                                                    context2 = context;
                                                    string2 = context2.getString(R.string.dual_screen_preset_internal_bottom_external_top);
                                                } else {
                                                    i.d();
                                                    return null;
                                                }
                                            } else {
                                                context2 = context;
                                                string2 = context2.getString(R.string.dual_screen_preset_internal_top_external_bottom);
                                            }
                                        } else {
                                            context2 = context;
                                            string2 = context2.getString(R.string.dual_screen_preset_off);
                                        }
                                        string2.getClass();
                                        String[] strArr10 = strArr6;
                                        nx5Var = pq5Var3.f.g;
                                        x61 x61Var3 = x61Var;
                                        if (nx5Var != nx5.GLOBAL) {
                                            String string3 = context2.getString(R.string.global_controller_mapping);
                                            string3.getClass();
                                            str6 = (String) k0Var.g(string3);
                                        } else {
                                            str6 = strArr10[nx5Var.ordinal()];
                                        }
                                        str6.getClass();
                                        uuid = pq5Var3.f.c;
                                        if (uuid == null) {
                                            g02Var.R = pq5Var3;
                                            pq5 pq5Var7 = pq5Var3;
                                            g02Var.X = null;
                                            g02Var.Y = strArr8;
                                            g02Var.Z = strArr7;
                                            g02Var.d0 = null;
                                            g02Var.e0 = videoFiltering3;
                                            g02Var.f0 = null;
                                            g02Var.g0 = null;
                                            g02Var.h0 = string;
                                            g02Var.i0 = str4;
                                            g02Var.j0 = str3;
                                            g02Var.k0 = k0Var;
                                            g02Var.l0 = a36Var3;
                                            g02Var.m0 = string2;
                                            g02Var.n0 = str6;
                                            g02Var.o0 = k;
                                            g02Var.p0 = i2;
                                            g02Var.s0 = 6;
                                            Object d3 = wa3Var.d(uuid, g02Var);
                                            if (d3 == x61Var3) {
                                                return x61Var3;
                                            }
                                            videoFiltering4 = videoFiltering3;
                                            strArr9 = strArr7;
                                            z2 = k;
                                            i4 = i2;
                                            str10 = str6;
                                            str11 = string2;
                                            obj = d3;
                                            pq5Var5 = pq5Var7;
                                            k0Var3 = k0Var;
                                            fk3Var2 = (fk3) obj;
                                            if (fk3Var2 != null || (r2 = fk3Var2.b) == null) {
                                                String string4 = context2.getString(R.string.not_set);
                                                string4.getClass();
                                            }
                                            string2 = str11;
                                            str8 = string4;
                                            str7 = str10;
                                            i2 = i4;
                                            videoFiltering3 = videoFiltering4;
                                            pq5Var4 = pq5Var5;
                                            str9 = str3;
                                            z = z2;
                                            strArr7 = strArr9;
                                            k0Var2 = k0Var3;
                                            if (pq5Var4.f.l == null) {
                                                int ordinal = videoFiltering3.ordinal();
                                                if (ordinal >= 0 && ordinal < strArr8.length) {
                                                    name2 = strArr8[ordinal];
                                                } else {
                                                    name2 = videoFiltering3.name();
                                                }
                                                name2.getClass();
                                                name = (String) k0Var2.g(name2);
                                            } else {
                                                int ordinal2 = videoFiltering3.ordinal();
                                                if (ordinal2 >= 0 && ordinal2 < strArr8.length) {
                                                    name = strArr8[ordinal2];
                                                } else {
                                                    name = videoFiltering3.name();
                                                }
                                            }
                                            name.getClass();
                                            str12 = pq5Var4.f.m;
                                            if (str12 == null) {
                                                Object g = k0Var2.g(str4);
                                                g.getClass();
                                                str12 = (String) g;
                                            }
                                            str13 = pq5Var4.f.n;
                                            if (str13 == null) {
                                                Object g2 = k0Var2.g(str9);
                                                g2.getClass();
                                                str13 = (String) g2;
                                            }
                                            a36Var4 = pq5Var4.f.b;
                                            if (a36Var4 == a36.DEFAULT) {
                                                String str17 = strArr7[a36Var3.ordinal()];
                                                str17.getClass();
                                                str14 = (String) k0Var2.g(str17);
                                            } else {
                                                str14 = strArr7[a36Var4.ordinal()];
                                            }
                                            str14.getClass();
                                            if (pq5Var4.f.p == null) {
                                                string2 = (String) k0Var2.g(string2);
                                            }
                                            string2.getClass();
                                            i5 = i2;
                                            String str18 = str7;
                                            if (i5 != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            return new z33(str18, str8, name, z3, str12, str13, z, str14, string2);
                                        }
                                        pq5 pq5Var8 = pq5Var3;
                                        Object g3 = k0Var.g(string);
                                        g3.getClass();
                                        String str19 = str3;
                                        z = k;
                                        str7 = str6;
                                        str8 = (String) g3;
                                        str9 = str19;
                                        pq5Var4 = pq5Var8;
                                        k0Var2 = k0Var;
                                        if (pq5Var4.f.l == null) {
                                        }
                                        name.getClass();
                                        str12 = pq5Var4.f.m;
                                        if (str12 == null) {
                                        }
                                        str13 = pq5Var4.f.n;
                                        if (str13 == null) {
                                        }
                                        a36Var4 = pq5Var4.f.b;
                                        if (a36Var4 == a36.DEFAULT) {
                                        }
                                        str14.getClass();
                                        if (pq5Var4.f.p == null) {
                                        }
                                        string2.getClass();
                                        i5 = i2;
                                        String str182 = str7;
                                        if (i5 != 0) {
                                        }
                                        return new z33(str182, str8, name, z3, str12, str13, z, str14, string2);
                                    }
                                }
                            }
                        }
                        return x61Var2;
                    case 1:
                        String[] strArr11 = g02Var.Z;
                        String[] strArr12 = g02Var.Y;
                        stringArray = g02Var.X;
                        pq5 pq5Var9 = g02Var.R;
                        oi2.Y(obj);
                        stringArray2 = strArr11;
                        pq5Var6 = pq5Var9;
                        strArr = strArr12;
                        EmulatorConfiguration emulatorConfiguration42 = (EmulatorConfiguration) obj;
                        VideoFiltering videoFiltering52 = emulatorConfiguration42.getRendererConfiguration().getVideoFiltering();
                        wp0 F2 = ((ng6) kd6Var2).F();
                        g02Var.R = pq5Var6;
                        g02Var.X = stringArray;
                        g02Var.Y = strArr;
                        g02Var.Z = stringArray2;
                        g02Var.d0 = emulatorConfiguration42;
                        g02Var.e0 = videoFiltering52;
                        g02Var.s0 = 2;
                        D = f04.D(F2, g02Var);
                        if (D != x61Var2) {
                        }
                        return x61Var2;
                    case 2:
                        videoFiltering = g02Var.e0;
                        emulatorConfiguration = g02Var.d0;
                        strArr3 = g02Var.Z;
                        strArr = g02Var.Y;
                        strArr2 = g02Var.X;
                        pq5Var2 = g02Var.R;
                        oi2.Y(obj);
                        String str152 = (String) obj;
                        wp0 E2 = ((ng6) kd6Var2).E();
                        g02Var.R = pq5Var2;
                        g02Var.X = strArr2;
                        g02Var.Y = strArr;
                        g02Var.Z = strArr3;
                        g02Var.d0 = emulatorConfiguration;
                        g02Var.e0 = videoFiltering;
                        g02Var.f0 = str152;
                        g02Var.s0 = 3;
                        D2 = f04.D(E2, g02Var);
                        if (D2 != x61Var2) {
                        }
                        return x61Var2;
                    case 3:
                        String str20 = g02Var.f0;
                        VideoFiltering videoFiltering6 = g02Var.e0;
                        emulatorConfiguration2 = g02Var.d0;
                        String[] strArr13 = g02Var.Z;
                        String[] strArr14 = g02Var.Y;
                        strArr4 = g02Var.X;
                        pq5 pq5Var10 = g02Var.R;
                        oi2.Y(obj);
                        str = str20;
                        videoFiltering = videoFiltering6;
                        strArr5 = strArr13;
                        strArr = strArr14;
                        pq5Var3 = pq5Var10;
                        String str162 = (String) obj;
                        UUID v2 = ((ng6) kd6Var2).v();
                        g02Var.R = pq5Var3;
                        g02Var.X = strArr4;
                        g02Var.Y = strArr;
                        g02Var.Z = strArr5;
                        g02Var.d0 = emulatorConfiguration2;
                        g02Var.e0 = videoFiltering;
                        g02Var.f0 = str;
                        g02Var.g0 = str162;
                        g02Var.s0 = 4;
                        d2 = wa3Var2.d(v2, g02Var);
                        if (d2 != x61Var2) {
                        }
                        return x61Var2;
                    case 4:
                        str2 = g02Var.g0;
                        str = g02Var.f0;
                        videoFiltering2 = g02Var.e0;
                        EmulatorConfiguration emulatorConfiguration6 = g02Var.d0;
                        strArr5 = g02Var.Z;
                        String[] strArr15 = g02Var.Y;
                        strArr6 = g02Var.X;
                        pq5Var3 = g02Var.R;
                        oi2.Y(obj);
                        emulatorConfiguration3 = emulatorConfiguration6;
                        strArr = strArr15;
                        fk3Var = (fk3) obj;
                        if (fk3Var != null) {
                            break;
                        }
                        i = R.string.not_set;
                        string = context3.getString(R.string.not_set);
                        string.getClass();
                        if (str == null) {
                        }
                        if (str2 == null) {
                        }
                        kd6Var = kd6Var2;
                        k0 k0Var42 = new k0(sz1Var, 29);
                        it = a36.getEntries().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                            it = it2;
                        }
                        a36Var2 = a36Var;
                        if (a36Var2 == null) {
                        }
                        ng6 ng6Var2 = (ng6) kd6Var;
                        wa3Var = wa3Var2;
                        context = context3;
                        wp0 wp0Var2 = new wp0(9, ng6Var2.G(), ng6Var2);
                        g02Var.R = pq5Var3;
                        g02Var.X = strArr6;
                        g02Var.Y = strArr;
                        g02Var.Z = strArr5;
                        g02Var.d0 = emulatorConfiguration3;
                        g02Var.e0 = videoFiltering2;
                        g02Var.f0 = null;
                        g02Var.g0 = null;
                        g02Var.h0 = string;
                        g02Var.i0 = str;
                        g02Var.j0 = str2;
                        g02Var.k0 = k0Var42;
                        g02Var.l0 = a36Var2;
                        g02Var.s0 = 5;
                        D3 = f04.D(wp0Var2, g02Var);
                        x61Var = x61Var2;
                        if (D3 != x61Var) {
                        }
                        break;
                    case 5:
                        a36 a36Var5 = g02Var.l0;
                        ?? r1 = g02Var.k0;
                        String str21 = g02Var.j0;
                        String str22 = g02Var.i0;
                        string = g02Var.h0;
                        VideoFiltering videoFiltering7 = g02Var.e0;
                        emulatorConfiguration3 = g02Var.d0;
                        String[] strArr16 = g02Var.Z;
                        String[] strArr17 = g02Var.Y;
                        strArr6 = g02Var.X;
                        pq5 pq5Var11 = g02Var.R;
                        oi2.Y(obj);
                        pq5Var3 = pq5Var11;
                        videoFiltering3 = videoFiltering7;
                        k0Var = r1;
                        strArr7 = strArr16;
                        str3 = str21;
                        strArr8 = strArr17;
                        str4 = str22;
                        wa3Var = wa3Var2;
                        kd6Var = kd6Var2;
                        context = context3;
                        x61Var = x61Var2;
                        a36Var3 = a36Var5;
                        boolean k2 = nb3.k(obj, Boolean.TRUE);
                        if (emulatorConfiguration3.getRendererConfiguration().getRenderer() != VideoRenderer.VULKAN) {
                            break;
                        }
                        i2 = 0;
                        jq1Var = pq5Var3.f.p;
                        if (jq1Var == null) {
                        }
                        i3 = wz1.l[jq1Var.ordinal()];
                        if (i3 == 1) {
                        }
                        string2.getClass();
                        String[] strArr102 = strArr6;
                        nx5Var = pq5Var3.f.g;
                        x61 x61Var32 = x61Var;
                        if (nx5Var != nx5.GLOBAL) {
                        }
                        str6.getClass();
                        uuid = pq5Var3.f.c;
                        if (uuid == null) {
                        }
                        break;
                    case 6:
                        i4 = g02Var.p0;
                        z2 = g02Var.o0;
                        str10 = g02Var.n0;
                        str11 = g02Var.m0;
                        a36Var3 = g02Var.l0;
                        ?? r8 = g02Var.k0;
                        str3 = g02Var.j0;
                        str4 = g02Var.i0;
                        videoFiltering4 = g02Var.e0;
                        strArr9 = g02Var.Z;
                        strArr8 = g02Var.Y;
                        pq5Var5 = g02Var.R;
                        oi2.Y(obj);
                        context2 = context3;
                        k0Var3 = r8;
                        fk3Var2 = (fk3) obj;
                        if (fk3Var2 != null) {
                            break;
                        }
                        String string42 = context2.getString(R.string.not_set);
                        string42.getClass();
                        string2 = str11;
                        str8 = string42;
                        str7 = str10;
                        i2 = i4;
                        videoFiltering3 = videoFiltering4;
                        pq5Var4 = pq5Var5;
                        str9 = str3;
                        z = z2;
                        strArr7 = strArr9;
                        k0Var2 = k0Var3;
                        if (pq5Var4.f.l == null) {
                        }
                        name.getClass();
                        str12 = pq5Var4.f.m;
                        if (str12 == null) {
                        }
                        str13 = pq5Var4.f.n;
                        if (str13 == null) {
                        }
                        a36Var4 = pq5Var4.f.b;
                        if (a36Var4 == a36.DEFAULT) {
                        }
                        str14.getClass();
                        if (pq5Var4.f.p == null) {
                        }
                        string2.getClass();
                        i5 = i2;
                        String str1822 = str7;
                        if (i5 != 0) {
                        }
                        return new z33(str1822, str8, name, z3, str12, str13, z, str14, string2);
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        g02Var = new g02(sz1Var, s41Var);
        Object obj2 = g02Var.q0;
        x61 x61Var22 = x61.COROUTINE_SUSPENDED;
        switch (g02Var.s0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object h(sz1 sz1Var, pq5 pq5Var, uz1 uz1Var, s41 s41Var) {
        j02 j02Var;
        Object obj;
        int i;
        pq5 pq5Var2;
        uz1 uz1Var2;
        hb5 hb5Var;
        boolean z;
        String str;
        boolean z2;
        kd6 kd6Var = sz1Var.c;
        if (s41Var instanceof j02) {
            j02Var = (j02) s41Var;
            int i2 = j02Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j02Var.d0 = i2 - Integer.MIN_VALUE;
                obj = j02Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = j02Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        uz1Var2 = j02Var.X;
                        pq5Var2 = j02Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    j02Var.R = pq5Var;
                    j02Var.X = uz1Var;
                    j02Var.d0 = 1;
                    obj = ((pl) pn5Var).c.b(j02Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    pq5Var2 = pq5Var;
                    uz1Var2 = uz1Var;
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    return null;
                }
                String str2 = sz1Var.M0;
                String packageName = sz1Var.b.getPackageName();
                String str3 = (String) sz1Var.L0.getValue();
                Object obj2 = sz1Var.L;
                if (obj2 == null) {
                    obj2 = "none";
                }
                d dVar = uz1Var2.b;
                d dVar2 = d.HARDCORE;
                if (dVar == dVar2) {
                    z = true;
                } else {
                    z = false;
                }
                ng6 ng6Var = (ng6) kd6Var;
                SharedPreferences sharedPreferences = ng6Var.b;
                SharedPreferences sharedPreferences2 = ng6Var.b;
                boolean z3 = sharedPreferences.getBoolean("ra_unofficial_enabled", false);
                boolean z4 = sharedPreferences2.getBoolean("ra_encore_enabled", false);
                if (uz1Var2.g) {
                    str = "raofflineproxy";
                } else {
                    str = "official";
                }
                pq5 pq5Var3 = pq5Var2;
                long j = uz1Var2.i;
                uz1 uz1Var3 = uz1Var2;
                StringBuilder u = i61.u("source=runtime_config runtime=rc_client user_agent=", str2, " package=", packageName, " version=");
                u.append(str3);
                u.append(" game_id=");
                u.append(obj2);
                u.append(" game_hash=redacted hardcore=");
                u.append(z);
                u.append(" unofficial=");
                u.append(z3);
                u.append(" encore=");
                u.append(z4);
                u.append(" host_source=");
                u.append(str);
                u.append(" native_client_host_configured=");
                u.append(!qs6.v0(uz1Var2.h));
                u.append(" endpoint_generation=");
                u.append(j);
                Log.i("RAIdentity", u.toString());
                RARuntimeBridgeMode rARuntimeBridgeMode = RARuntimeBridgeMode.RC_CLIENT_ONLINE;
                String str4 = sz1Var.M0;
                String str5 = hb5Var.a;
                String str6 = hb5Var.b;
                String str7 = pq5Var3.i;
                Long l = sz1Var.L;
                long andIncrement = hd5.a.getAndIncrement();
                if (andIncrement > 0) {
                    if (uz1Var3.b == dVar2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    return new RARuntimeBridgeConfig(rARuntimeBridgeMode, str4, str5, str6, str7, l, andIncrement, z2, sharedPreferences2.getBoolean("ra_unofficial_enabled", false), sharedPreferences2.getBoolean("ra_encore_enabled", false), uz1Var3.h, uz1Var3.g, uz1Var3.i);
                }
                i.m("RetroAchievements submission session ID space exhausted");
                return null;
            }
        }
        j02Var = new j02(sz1Var, s41Var);
        obj = j02Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = j02Var.d0;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|(1:(1:(1:(5:12|13|(1:18)|15|16)(2:19|20))(8:21|22|23|(1:25)|26|(3:32|(1:34)|(9:36|(1:38)(1:59)|39|(1:57)|41|(1:43)(1:56)|44|45|(4:47|(1:49)(1:55)|50|(4:52|(1:54)|13|(0)))))|15|16))(8:63|64|23|(0)|26|(5:28|30|32|(0)|(0))|15|16))(2:65|(1:67)(2:68|(9:70|(2:72|73)|64|23|(0)|26|(0)|15|16)(12:74|75|76|77|(2:79|80)|22|23|(0)|26|(0)|15|16)))))|83|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0046, code lost:
        r21 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010f, code lost:
        if (r6 > 0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(sz1 sz1Var, jt5 jt5Var, s41 s41Var) {
        l02 l02Var;
        int i;
        boolean z;
        Object em5Var;
        RendererConfiguration rendererConfiguration;
        String str;
        be6 be6Var;
        Long valueOf;
        po5 retroArchShader;
        long j;
        boolean z2;
        tp6 tp6Var = sz1Var.D;
        if (s41Var instanceof l02) {
            l02Var = (l02) s41Var;
            int i2 = l02Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l02Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = l02Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = l02Var.Y;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                if (!((Boolean) obj).booleanValue()) {
                                    Boolean bool = Boolean.TRUE;
                                    tp6Var.getClass();
                                    tp6Var.m(null, bool);
                                }
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        z = false;
                        em5Var = (RendererConfiguration) obj;
                        if (em5Var instanceof em5) {
                            em5Var = null;
                        }
                        rendererConfiguration = (RendererConfiguration) em5Var;
                        if (rendererConfiguration != null && rendererConfiguration.getVideoFiltering() == VideoFiltering.RETROARCH && (str = rendererConfiguration.getRetroArchShader().a) != null) {
                            if (qs6.v0(str)) {
                                str = null;
                            }
                            if (str != null) {
                                if (rendererConfiguration.getRenderer() == VideoRenderer.VULKAN) {
                                    be6Var = be6.VULKAN;
                                } else {
                                    be6Var = be6.OPEN_GL;
                                }
                                ce6 ce6Var = sz1Var.y;
                                ce6Var.getClass();
                                be6Var.getClass();
                                if (!qs6.v0(str)) {
                                    long j2 = ce6Var.a.getLong(lb1.m(be6Var.name(), "|", str), 0L);
                                    valueOf = Long.valueOf(j2);
                                }
                                valueOf = null;
                                if (valueOf != null) {
                                    j = valueOf.longValue();
                                } else {
                                    j = ((retroArchShader.c * 40) + ((rendererConfiguration.getRetroArchShader().d * 15) / 100)) * 2;
                                }
                                long j3 = j;
                                if (j3 >= sz1Var.A) {
                                    tu0 tu0Var = new tu0();
                                    String O0 = qs6.O0('/', str, str);
                                    if (valueOf != null) {
                                        z2 = true;
                                    } else {
                                        z2 = z;
                                    }
                                    if (sz1Var.B.k(new mz1(O0, j3, z2, tu0Var))) {
                                        l02Var.Y = 3;
                                        obj = tu0Var.q(l02Var);
                                        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                                        if (obj == x61Var) {
                                            return x61Var;
                                        }
                                        if (!((Boolean) obj).booleanValue()) {
                                        }
                                    }
                                }
                            }
                        }
                        return jg7Var;
                    }
                    oi2.Y(obj);
                    em5Var = (RendererConfiguration) obj;
                    z = false;
                    if (em5Var instanceof em5) {
                    }
                    rendererConfiguration = (RendererConfiguration) em5Var;
                    if (rendererConfiguration != null) {
                        if (qs6.v0(str)) {
                        }
                        if (str != null) {
                        }
                    }
                    return jg7Var;
                }
                oi2.Y(obj);
                if (((Boolean) tp6Var.getValue()).booleanValue()) {
                    return jg7Var;
                }
                kd6 kd6Var = sz1Var.c;
                if (jt5Var == null) {
                    be5 be5Var = ((ng6) kd6Var).i;
                    l02Var.Y = 1;
                    obj = f04.B(be5Var, l02Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    em5Var = (RendererConfiguration) obj;
                    z = false;
                    if (em5Var instanceof em5) {
                    }
                    rendererConfiguration = (RendererConfiguration) em5Var;
                    if (rendererConfiguration != null) {
                    }
                    return jg7Var;
                }
                ng6 ng6Var = (ng6) kd6Var;
                ng6Var.getClass();
                z = false;
                try {
                    wp0 wp0Var = new wp0(5, new le2[]{ng6Var.i, ng6Var.G(), ng6Var.F(), ng6Var.E()}, new jg6(ng6Var, jt5Var, null));
                    l02Var.Y = 2;
                    obj = f04.B(wp0Var, l02Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                    em5Var = (RendererConfiguration) obj;
                } catch (Throwable th) {
                    th = th;
                    em5Var = new em5(th);
                    if (em5Var instanceof em5) {
                    }
                    rendererConfiguration = (RendererConfiguration) em5Var;
                    if (rendererConfiguration != null) {
                    }
                    return jg7Var;
                }
                if (em5Var instanceof em5) {
                }
                rendererConfiguration = (RendererConfiguration) em5Var;
                if (rendererConfiguration != null) {
                }
                return jg7Var;
            }
        }
        l02Var = new l02(sz1Var, s41Var);
        Object obj2 = l02Var.R;
        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
        i = l02Var.Y;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0161, code lost:
        if (r0 == r8) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e7  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v3, types: [pq5, en5, r41] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [pq5, pj4, en5, r41] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object j(sz1 sz1Var, pq5 pq5Var, en5 en5Var, s41 s41Var) {
        n02 n02Var;
        n02 n02Var2;
        boolean z;
        boolean D;
        pq5 pq5Var2;
        en5 en5Var2;
        boolean z2;
        boolean z3;
        ln5 ln5Var;
        boolean z4;
        String a2;
        String str;
        Object obj;
        boolean z5;
        ?? r4;
        pj4 pj4Var;
        String str2;
        boolean z6;
        boolean z7;
        String str3;
        int i;
        boolean z8;
        int i2;
        ?? r42;
        String str4;
        boolean z9;
        ui4 ui4Var;
        ui4 ui4Var2;
        int i3;
        x61 x61Var;
        d dVar;
        x61 x61Var2;
        boolean z10;
        pj4 pj4Var2;
        String str5;
        String str6;
        boolean z11;
        int i4;
        d dVar2;
        int i5;
        boolean z12;
        d dVar3;
        sz1 sz1Var2 = sz1Var;
        kd6 kd6Var = sz1Var2.c;
        of6 of6Var = sz1Var2.J0;
        if (s41Var instanceof n02) {
            n02Var = (n02) s41Var;
            int i6 = n02Var.k0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                n02Var.k0 = i6 - Integer.MIN_VALUE;
                n02Var2 = n02Var;
                Object obj2 = n02Var2.i0;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                switch (n02Var2.k0) {
                    case 0:
                        oi2.Y(obj2);
                        boolean b2 = sz1Var2.o.b();
                        ng6 ng6Var = (ng6) kd6Var;
                        z = ng6Var.b.getBoolean("ra_hardcore_enabled", false);
                        D = ng6Var.D();
                        pn5 pn5Var = sz1Var2.g;
                        pq5Var2 = pq5Var;
                        n02Var2.R = pq5Var2;
                        en5Var2 = en5Var;
                        n02Var2.X = en5Var2;
                        n02Var2.e0 = b2;
                        n02Var2.f0 = z;
                        n02Var2.g0 = D;
                        n02Var2.k0 = 1;
                        Object b3 = ((pl) pn5Var).c.b(n02Var2);
                        if (b3 != x61Var3) {
                            z2 = b2;
                            obj2 = b3;
                            z3 = D;
                            boolean z13 = z;
                            jb5 jb5Var = (jb5) obj2;
                            ln5Var = en5Var2.b;
                            String str7 = en5Var2.e;
                            if (ln5Var != ln5.RA_OFFLINE_PROXY) {
                                fn5.a(en5Var2, "session_frozen");
                                if (en5Var2.d == null || str7 == null) {
                                    of6Var.k(j77.a);
                                }
                                b bVar = b.ONLINE_LIVE;
                                d dVar4 = d.SOFTCORE;
                                if (str7 == null) {
                                    str7 = "";
                                }
                                return new uz1(bVar, dVar4, null, false, false, z13, true, str7, en5Var2.f);
                            }
                            z4 = z13;
                            if (jb5Var == null) {
                                return new uz1(b.ONLINE_LIVE, d.SOFTCORE, null, false, false, false);
                            }
                            a2 = jb5Var.a();
                            str = pq5Var2.i;
                            xe1 xe1Var = xk1.a;
                            de1 de1Var = de1.L;
                            obj = null;
                            z5 = z2;
                            r4 = 0;
                            i02 i02Var = new i02(sz1Var2, a2, str, null, 2);
                            n02Var2.R = null;
                            n02Var2.X = null;
                            n02Var2.Y = a2;
                            n02Var2.Z = str;
                            n02Var2.e0 = z5;
                            n02Var2.f0 = z4;
                            n02Var2.g0 = z3;
                            n02Var2.k0 = 2;
                            obj2 = hv.d0(de1Var, i02Var, n02Var2);
                            break;
                        }
                        return x61Var3;
                    case 1:
                        D = n02Var2.g0;
                        z = n02Var2.f0;
                        z2 = n02Var2.e0;
                        en5 en5Var3 = n02Var2.X;
                        pq5 pq5Var3 = n02Var2.R;
                        oi2.Y(obj2);
                        en5Var2 = en5Var3;
                        pq5Var2 = pq5Var3;
                        z3 = D;
                        boolean z132 = z;
                        jb5 jb5Var2 = (jb5) obj2;
                        ln5Var = en5Var2.b;
                        String str72 = en5Var2.e;
                        if (ln5Var != ln5.RA_OFFLINE_PROXY) {
                        }
                        break;
                    case 2:
                        boolean z14 = n02Var2.g0;
                        boolean z15 = n02Var2.f0;
                        boolean z16 = n02Var2.e0;
                        String str8 = n02Var2.Z;
                        String str9 = n02Var2.Y;
                        oi2.Y(obj2);
                        z3 = z14;
                        obj = null;
                        a2 = str9;
                        r4 = 0;
                        z4 = z15;
                        z5 = z16;
                        str = str8;
                        pj4Var = (pj4) obj2;
                        ui4 ui4Var3 = pj4Var.a;
                        if (ui4Var3 != ui4.OK && ui4Var3 != ui4.EMPTY) {
                            of6Var.k(c77.a);
                            xe1 xe1Var2 = xk1.a;
                            de1 de1Var2 = de1.L;
                            sz1Var2 = sz1Var;
                            i02 i02Var2 = new i02(sz1Var2, a2, str, r4, 3);
                            n02Var2.R = r4;
                            n02Var2.X = r4;
                            n02Var2.Y = a2;
                            n02Var2.Z = str;
                            n02Var2.d0 = pj4Var;
                            n02Var2.e0 = z5;
                            n02Var2.f0 = z4;
                            n02Var2.g0 = z3;
                            n02Var2.h0 = 0;
                            n02Var2.k0 = 3;
                            obj2 = hv.d0(de1Var2, i02Var2, n02Var2);
                            if (obj2 != x61Var3) {
                                z8 = z5;
                                i2 = 0;
                                r42 = r4;
                                if (((hm5) obj2).A instanceof em5) {
                                    sz1Var2.m.b(a2, str);
                                    xe1 xe1Var3 = xk1.a;
                                    de1 de1Var3 = de1.L;
                                    i02 i02Var3 = new i02(sz1Var2, a2, str, r42, 1);
                                    n02Var2.R = r42;
                                    n02Var2.X = r42;
                                    n02Var2.Y = a2;
                                    n02Var2.Z = str;
                                    n02Var2.d0 = r42;
                                    n02Var2.e0 = z8;
                                    n02Var2.f0 = z4;
                                    n02Var2.g0 = z3;
                                    n02Var2.h0 = i2;
                                    n02Var2.k0 = 4;
                                    obj2 = hv.d0(de1Var3, i02Var3, n02Var2);
                                    if (obj2 != x61Var3) {
                                        str4 = str;
                                        z9 = z4;
                                        z7 = z3;
                                        str3 = a2;
                                        i = i2;
                                        String str10 = str4;
                                        pj4Var = (pj4) obj2;
                                        str2 = str10;
                                        z6 = z9;
                                        ui4Var = pj4Var.a;
                                        Long l = pj4Var.e;
                                        ui4Var2 = ui4.OK;
                                        if (ui4Var != ui4Var2) {
                                        }
                                        i3 = i;
                                        x61Var = x61Var3;
                                        if (z8) {
                                        }
                                    }
                                } else {
                                    str2 = str;
                                    z6 = z4;
                                    z7 = z3;
                                    str3 = a2;
                                    i = 1;
                                    ui4Var = pj4Var.a;
                                    Long l2 = pj4Var.e;
                                    ui4Var2 = ui4.OK;
                                    if (ui4Var != ui4Var2) {
                                    }
                                    i3 = i;
                                    x61Var = x61Var3;
                                    if (z8) {
                                    }
                                }
                            }
                            return x61Var3;
                        }
                        sz1Var2 = sz1Var;
                        str2 = str;
                        z6 = z4;
                        z7 = z3;
                        str3 = a2;
                        i = 0;
                        z8 = z5;
                        ui4Var = pj4Var.a;
                        Long l22 = pj4Var.e;
                        ui4Var2 = ui4.OK;
                        if (ui4Var != ui4Var2 && pj4Var.a() > 0) {
                            of6Var.k(new w67(pj4Var.a()));
                            x61Var = x61Var3;
                            i3 = i;
                            sz1Var2.H0("hardcore_ledger_legacy_preserved", new vr4("content_id", str2), new vr4("pending", new Integer(pj4Var.a())), new vr4("same_session_sync_available", Boolean.FALSE));
                        } else {
                            i3 = i;
                            x61Var = x61Var3;
                        }
                        if (z8) {
                            if (z7 && ui4Var == ui4Var2 && pj4Var.b() > 0) {
                                of6Var.k(new f77(pj4Var.b(), l22));
                            }
                            return new uz1(b.OFFLINE_ACCUMULATING, d.SOFTCORE, ik4.OFFLINE_FROM_START, false, true, z6);
                        } else if (l22 != null && l22.longValue() <= 0) {
                            of6Var.k(new f77(pj4Var.b(), l22));
                            b bVar2 = b.ONLINE_LIVE;
                            if (z6) {
                                dVar2 = d.HARDCORE;
                            } else {
                                dVar2 = d.SOFTCORE;
                            }
                            return new uz1(bVar2, dVar2, null, z6, false, false);
                        } else {
                            boolean z17 = z6;
                            if (z7 && i3 == 0 && ui4Var == ui4Var2 && pj4Var.b() > 0) {
                                int b4 = pj4Var.b();
                                n02Var2.R = null;
                                n02Var2.X = null;
                                n02Var2.Y = str3;
                                n02Var2.Z = str2;
                                n02Var2.d0 = pj4Var;
                                n02Var2.e0 = z8;
                                n02Var2.f0 = z17;
                                n02Var2.g0 = z7;
                                int i7 = i3;
                                n02Var2.h0 = i7;
                                n02Var2.k0 = 5;
                                Object a0 = sz1Var2.a0(b4, l22, n02Var2);
                                x61Var2 = x61Var;
                                if (a0 != x61Var2) {
                                    z10 = z8;
                                    pj4Var2 = pj4Var;
                                    str5 = str2;
                                    obj2 = a0;
                                    str6 = str3;
                                    z11 = z17;
                                    i4 = i7;
                                    i5 = wz1.a[((mi4) obj2).ordinal()];
                                    if (i5 == 1) {
                                        if (i5 == 2) {
                                            int b5 = pj4Var2.b();
                                            n02Var2.R = null;
                                            n02Var2.X = null;
                                            n02Var2.Y = null;
                                            n02Var2.Z = null;
                                            n02Var2.d0 = null;
                                            n02Var2.e0 = z10;
                                            n02Var2.f0 = z11;
                                            n02Var2.g0 = z7;
                                            n02Var2.h0 = i4;
                                            n02Var2.k0 = 6;
                                            obj2 = sz1Var2.c1(str6, str5, b5, n02Var2);
                                            if (obj2 == x61Var2) {
                                                return x61Var2;
                                            }
                                            z12 = z11;
                                            if (!((Boolean) obj2).booleanValue()) {
                                                b bVar3 = b.ONLINE_LIVE;
                                                if (z12) {
                                                    dVar3 = d.HARDCORE;
                                                } else {
                                                    dVar3 = d.SOFTCORE;
                                                }
                                                return new uz1(bVar3, dVar3, null, z12, false, false);
                                            }
                                            return new uz1(b.OFFLINE_ACCUMULATING, d.SOFTCORE, ik4.OFFLINE_FROM_START, false, false, z12);
                                        }
                                        i.d();
                                        return obj;
                                    }
                                    return new uz1(b.OFFLINE_ACCUMULATING, d.SOFTCORE, ik4.OFFLINE_FROM_START, false, false, z11);
                                }
                                return x61Var2;
                            }
                            b bVar4 = b.ONLINE_LIVE;
                            if (z17) {
                                dVar = d.HARDCORE;
                            } else {
                                dVar = d.SOFTCORE;
                            }
                            return new uz1(bVar4, dVar, null, z17, false, false);
                        }
                    case 3:
                        int i8 = n02Var2.h0;
                        boolean z18 = n02Var2.g0;
                        boolean z19 = n02Var2.f0;
                        boolean z20 = n02Var2.e0;
                        pj4Var = n02Var2.d0;
                        String str11 = n02Var2.Z;
                        String str12 = n02Var2.Y;
                        oi2.Y(obj2);
                        z3 = z18;
                        a2 = str12;
                        z4 = z19;
                        str = str11;
                        obj = null;
                        i2 = i8;
                        r42 = 0;
                        z8 = z20;
                        if (((hm5) obj2).A instanceof em5) {
                        }
                        break;
                    case 4:
                        i = n02Var2.h0;
                        z7 = n02Var2.g0;
                        z9 = n02Var2.f0;
                        z8 = n02Var2.e0;
                        str4 = n02Var2.Z;
                        str3 = n02Var2.Y;
                        oi2.Y(obj2);
                        obj = null;
                        String str102 = str4;
                        pj4Var = (pj4) obj2;
                        str2 = str102;
                        z6 = z9;
                        ui4Var = pj4Var.a;
                        Long l222 = pj4Var.e;
                        ui4Var2 = ui4.OK;
                        if (ui4Var != ui4Var2) {
                        }
                        i3 = i;
                        x61Var = x61Var3;
                        if (z8) {
                        }
                        break;
                    case 5:
                        i4 = n02Var2.h0;
                        z7 = n02Var2.g0;
                        boolean z21 = n02Var2.f0;
                        z10 = n02Var2.e0;
                        pj4Var2 = n02Var2.d0;
                        str5 = n02Var2.Z;
                        String str13 = n02Var2.Y;
                        oi2.Y(obj2);
                        obj = null;
                        str6 = str13;
                        z11 = z21;
                        x61Var2 = x61Var3;
                        i5 = wz1.a[((mi4) obj2).ordinal()];
                        if (i5 == 1) {
                        }
                        break;
                    case 6:
                        boolean z22 = n02Var2.f0;
                        oi2.Y(obj2);
                        z12 = z22;
                        if (!((Boolean) obj2).booleanValue()) {
                        }
                        break;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        n02Var = new n02(sz1Var2, s41Var);
        n02Var2 = n02Var;
        Object obj22 = n02Var2.i0;
        x61 x61Var32 = x61.COROUTINE_SUSPENDED;
        switch (n02Var2.k0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
        if (r14 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k(sz1 sz1Var, nv4 nv4Var, List list, s41 s41Var) {
        o02 o02Var;
        int i;
        int intValue;
        nv4 nv4Var2;
        int i2;
        String str;
        int intValue2;
        if (s41Var instanceof o02) {
            o02Var = (o02) s41Var;
            int i3 = o02Var.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                o02Var.e0 = i3 - Integer.MIN_VALUE;
                Object obj = o02Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = o02Var.e0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = o02Var.Y;
                            list = o02Var.X;
                            nv4Var2 = o02Var.R;
                            oi2.Y(obj);
                            intValue2 = ((Number) obj).intValue();
                            if (intValue2 != i2) {
                                xv2 xv2Var = sz1Var.m;
                                gd5 gd5Var = nv4Var2.a;
                                xv2Var.b(gd5Var.a, gd5Var.c);
                            } else {
                                sz1Var.G0("ra_pending_discard_mirror_mismatch", new vr4("confirmed", new Integer(i2)), new vr4("discarded", new Integer(intValue2)), new vr4("discard_reason", "logout"), new vr4("accepted", Boolean.FALSE));
                            }
                            intValue = i2;
                            nv4Var = nv4Var2;
                            if (intValue == list.size()) {
                                str = "ra_pending_discarded";
                            } else {
                                str = "ra_pending_discard_rejected";
                            }
                            sz1Var.G0(str, new vr4("expected", new Integer(list.size())), new vr4("confirmed", new Integer(intValue)), new vr4("remaining", new Integer(((bv4) nv4Var.i.A.getValue()).c.a)), new vr4("discard_reason", "logout"), new vr4("accepted", Boolean.FALSE));
                            return new Integer(intValue);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = o02Var.X;
                    nv4Var = o02Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    jh jhVar = sz1Var.v;
                    o02Var.R = nv4Var;
                    o02Var.X = list;
                    o02Var.e0 = 1;
                    jhVar.getClass();
                    obj = hv.d0(xk1.a, new xg(list, null, 0), o02Var);
                }
                intValue = ((Number) obj).intValue();
                if (intValue == list.size()) {
                    Set p1 = gt0.p1(list);
                    gd5 gd5Var2 = nv4Var.a;
                    o02Var.R = nv4Var;
                    o02Var.X = list;
                    o02Var.Y = intValue;
                    o02Var.e0 = 2;
                    Object e = nv4Var.e(p1, gd5Var2, o02Var);
                    if (e != x61Var) {
                        nv4Var2 = nv4Var;
                        i2 = intValue;
                        obj = e;
                        intValue2 = ((Number) obj).intValue();
                        if (intValue2 != i2) {
                        }
                        intValue = i2;
                        nv4Var = nv4Var2;
                    }
                    return x61Var;
                }
                if (intValue == list.size()) {
                }
                sz1Var.G0(str, new vr4("expected", new Integer(list.size())), new vr4("confirmed", new Integer(intValue)), new vr4("remaining", new Integer(((bv4) nv4Var.i.A.getValue()).c.a)), new vr4("discard_reason", "logout"), new vr4("accepted", Boolean.FALSE));
                return new Integer(intValue);
            }
        }
        o02Var = new o02(sz1Var, s41Var);
        Object obj2 = o02Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = o02Var.e0;
        if (i == 0) {
        }
        intValue = ((Number) obj2).intValue();
        if (intValue == list.size()) {
        }
        if (intValue == list.size()) {
        }
        sz1Var.G0(str, new vr4("expected", new Integer(list.size())), new vr4("confirmed", new Integer(intValue)), new vr4("remaining", new Integer(((bv4) nv4Var.i.A.getValue()).c.a)), new vr4("discard_reason", "logout"), new vr4("accepted", Boolean.FALSE));
        return new Integer(intValue);
    }

    public static final void l(sz1 sz1Var, List list) {
        rx1 rx1Var;
        pq5 pq5Var;
        boolean z;
        sz1Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wx1 wx1Var = (wx1) it.next();
            if (nb3.k(wx1Var, tx1.a)) {
                sz1Var.k0("runtime_disabled");
            } else if (nb3.k(wx1Var, ux1.a)) {
                lb4 lb4Var = sz1Var.w.e;
                ik4 ik4Var = null;
                if (lb4Var instanceof rx1) {
                    rx1Var = (rx1) lb4Var;
                } else {
                    rx1Var = null;
                }
                if (rx1Var != null && (pq5Var = rx1Var.o) != null) {
                    b bVar = sz1Var.G;
                    d dVar = sz1Var.H;
                    b bVar2 = b.OFFLINE_ACCUMULATING;
                    if (bVar == bVar2) {
                        if (sz1Var.J) {
                            ik4Var = ik4.OFFLINE_AFTER_START;
                        } else {
                            ik4Var = ik4.OFFLINE_FROM_START;
                        }
                    }
                    ik4 ik4Var2 = ik4Var;
                    boolean z2 = sz1Var.I;
                    if (!sz1Var.J && bVar == bVar2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sz1Var.Z0(pq5Var, new uz1(bVar, dVar, ik4Var2, z2, z, false));
                }
            } else if (nb3.k(wx1Var, vx1.a)) {
                sz1Var.J0.k(s67.a);
            } else {
                i.d();
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|7|(1:(1:(6:11|12|13|(1:15)(1:19)|16|17)(2:20|21))(2:22|23))(3:50|51|(2:53|54))|24|(1:26)(1:49)|27|(1:29)|30|(1:47)|(6:35|36|37|(1:39)|40|(1:43)(2:42|12))|13|(0)(0)|16|17))|57|6|7|(0)(0)|24|(0)(0)|27|(0)|30|(1:32)|47|(0)|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        r8 = new defpackage.em5(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:16:0x003c, B:24:0x0059, B:26:0x005d, B:21:0x0045), top: B:59:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m(sz1 sz1Var, ep2 ep2Var, boolean z, s41 s41Var) {
        t02 t02Var;
        int i;
        Object em5Var;
        String str;
        Object em5Var2;
        ep2 ep2Var2;
        int i2;
        jb5 jb5Var;
        of6 of6Var = sz1Var.N0;
        if (s41Var instanceof t02) {
            t02Var = (t02) s41Var;
            int i3 = t02Var.d0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t02Var.d0 = i3 - Integer.MIN_VALUE;
                Object obj = t02Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = t02Var.d0;
                Object obj2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ep2Var2 = t02Var.R;
                            oi2.Y(obj);
                            ep2Var = ep2Var2;
                            i2 = ep2Var.d;
                            URL url = ep2Var.f;
                            if (i2 > 0) {
                                of6Var.k(new ma5(url, i2 - ep2Var.b.size(), ep2Var.d));
                            } else {
                                of6Var.k(new na5(url));
                            }
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = t02Var.X;
                    ep2Var = t02Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    pn5 pn5Var = sz1Var.g;
                    t02Var.R = ep2Var;
                    t02Var.X = z;
                    t02Var.d0 = 1;
                    obj = ((pl) pn5Var).c.b(t02Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                jb5Var = (jb5) obj;
                if (jb5Var == null) {
                    em5Var = jb5Var.a();
                } else {
                    em5Var = null;
                }
                if (em5Var instanceof em5) {
                    em5Var = null;
                }
                str = (String) em5Var;
                if (str != null || qs6.v0(str)) {
                    str = null;
                }
                if (str != null) {
                    try {
                        em5Var2 = new URL("https://media.retroachievements.org/UserPic/" + str + ".png");
                    } catch (Throwable th) {
                        em5Var2 = new em5(th);
                    }
                    if (!(em5Var2 instanceof em5)) {
                        obj2 = em5Var2;
                    }
                    of6Var.k(new qa5((URL) obj2, str, z));
                    t02Var.R = ep2Var;
                    t02Var.X = z;
                    t02Var.d0 = 2;
                    if (q60.t(250L, t02Var) != x61Var) {
                        ep2Var2 = ep2Var;
                        ep2Var = ep2Var2;
                    } else {
                        return x61Var;
                    }
                }
                i2 = ep2Var.d;
                URL url2 = ep2Var.f;
                if (i2 > 0) {
                }
                return jg7.a;
            }
        }
        t02Var = new t02(sz1Var, s41Var);
        Object obj3 = t02Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = t02Var.d0;
        Object obj22 = null;
        if (i == 0) {
        }
        jb5Var = (jb5) obj3;
        if (jb5Var == null) {
        }
        if (em5Var instanceof em5) {
        }
        str = (String) em5Var;
        if (str != null) {
        }
        str = null;
        if (str != null) {
        }
        i2 = ep2Var.d;
        URL url22 = ep2Var.f;
        if (i2 > 0) {
        }
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
        if (r15 == r1) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(sz1 sz1Var, o75 o75Var, s41 s41Var) {
        u02 u02Var;
        Object obj;
        int i;
        sz1 sz1Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        o75 o75Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        String gameHash;
        Long gameId;
        if (s41Var instanceof u02) {
            u02Var = (u02) s41Var;
            int i2 = u02Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u02Var.d0 = i2 - Integer.MIN_VALUE;
                obj = u02Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = u02Var.d0;
                String str = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            rARuntimeBridgeConfig2 = u02Var.X;
                            o75Var2 = u02Var.R;
                            oi2.Y(obj);
                            sz1Var2 = sz1Var;
                            if (((Boolean) obj).booleanValue()) {
                                sz1Var2.B0("achievement", o75Var2.a, "runtime_authentication_mismatch", new vr4("achievement_game_id", new Long(o75Var2.b)));
                                return Boolean.FALSE;
                            }
                            pq5 pq5Var = sz1Var2.n1;
                            if (pq5Var != null) {
                                str = pq5Var.i;
                            }
                            if (str == null || qs6.v0(str) || (gameHash = rARuntimeBridgeConfig2.getGameHash()) == null || qs6.v0(gameHash) || !str.equals(rARuntimeBridgeConfig2.getGameHash())) {
                                sz1Var2.B0("achievement", o75Var2.a, "game_hash_mismatch", new vr4("achievement_game_id", new Long(o75Var2.b)), new vr4("runtime_game_hash", rARuntimeBridgeConfig2.getGameHash()), new vr4("current_game_hash", str));
                                return Boolean.FALSE;
                            }
                            Long l = sz1Var2.L;
                            if (l == null) {
                                l = rARuntimeBridgeConfig2.getGameId();
                            }
                            if (l != null) {
                                long j = o75Var2.b;
                                if (l.longValue() == j && (rARuntimeBridgeConfig2.getGameId() == null || ((gameId = rARuntimeBridgeConfig2.getGameId()) != null && gameId.longValue() == j))) {
                                    boolean z = sz1Var2.w.a;
                                    if (rARuntimeBridgeConfig2.getHardcoreEnabled() != z) {
                                        sz1Var2.B0("achievement", o75Var2.a, "hardcore_mismatch", new vr4("achievement_game_id", new Long(j)), new vr4("runtime_hardcore", Boolean.valueOf(rARuntimeBridgeConfig2.getHardcoreEnabled())), new vr4("session_hardcore", Boolean.valueOf(z)));
                                        return Boolean.FALSE;
                                    } else if (!rARuntimeBridgeConfig2.getUnofficialEnabled() && o75Var2.m == n75.UNOFFICIAL) {
                                        sz1Var2.B0("achievement", o75Var2.a, "unofficial_disabled", new vr4("achievement_game_id", new Long(j)), new vr4("encore_enabled", Boolean.valueOf(rARuntimeBridgeConfig2.getEncoreEnabled())));
                                        return Boolean.FALSE;
                                    } else {
                                        return Boolean.TRUE;
                                    }
                                }
                            }
                            sz1Var2.B0("achievement", o75Var2.a, "game_id_mismatch", new vr4("achievement_game_id", new Long(o75Var2.b)), new vr4("runtime_game_id", rARuntimeBridgeConfig2.getGameId()), new vr4("current_game_id", sz1Var2.L));
                            return Boolean.FALSE;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o75Var = u02Var.R;
                    oi2.Y(obj);
                    sz1Var2 = sz1Var;
                } else {
                    oi2.Y(obj);
                    if (sz1Var.G != b.ONLINE_LIVE) {
                        sz1Var.B0("achievement", o75Var.a, "network_mode_offline", new vr4("achievement_game_id", new Long(o75Var.b)));
                        return Boolean.FALSE;
                    }
                    sz1Var2 = sz1Var;
                    u02Var.R = o75Var;
                    u02Var.d0 = 1;
                    obj = sz1Var2.b0(30000L, u02Var);
                }
                if (!((Boolean) obj).booleanValue()) {
                    sz1Var2.H0("runtime_session_not_started_proceeding", new vr4("entity_type", "achievement"), new vr4("achievement_id", new Long(o75Var.a)), new vr4("achievement_game_id", new Long(o75Var.b)));
                }
                rARuntimeBridgeConfig = sz1Var2.N;
                if (rARuntimeBridgeConfig != null) {
                    sz1Var2.B0("achievement", o75Var.a, "missing_runtime_config", new vr4("achievement_game_id", new Long(o75Var.b)));
                    return Boolean.FALSE;
                }
                u02Var.R = o75Var;
                u02Var.X = rARuntimeBridgeConfig;
                u02Var.d0 = 2;
                obj = sz1Var2.W(rARuntimeBridgeConfig, u02Var);
                if (obj != x61Var) {
                    o75Var2 = o75Var;
                    rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return x61Var;
            }
        }
        u02Var = new u02(sz1Var, s41Var);
        obj = u02Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = u02Var.d0;
        String str2 = null;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        rARuntimeBridgeConfig = sz1Var2.N;
        if (rARuntimeBridgeConfig != null) {
        }
    }

    public static final g21 o(sz1 sz1Var) {
        return new g21(new g21(new b7(sz1Var.p0, 8), 5), 2);
    }

    public static final cm0 s(sz1 sz1Var) {
        ng6 ng6Var = (ng6) sz1Var.c;
        ng6Var.getClass();
        return f04.V(ng6Var.p("input_layout_id", new tf6(ng6Var, 21)), new b12(0, null, sz1Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x02bb, code lost:
        if (r0 == r7) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r0 == r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e5 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:109:0x025a, B:111:0x0262, B:113:0x0269, B:115:0x0270, B:117:0x0274, B:120:0x0287, B:121:0x028c, B:19:0x004e, B:94:0x01d6, B:98:0x01e1, B:100:0x01e5, B:103:0x0217, B:105:0x0228, B:106:0x0230, B:22:0x0057, B:128:0x02be, B:25:0x005e, B:72:0x0162, B:28:0x0069, B:62:0x0116, B:66:0x0121, B:68:0x0125, B:75:0x0171, B:78:0x017b, B:81:0x0181, B:90:0x01bd, B:122:0x028d, B:124:0x0298, B:125:0x02a0, B:58:0x00f3), top: B:133:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0217 A[Catch: all -> 0x0043, TRY_ENTER, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:109:0x025a, B:111:0x0262, B:113:0x0269, B:115:0x0270, B:117:0x0274, B:120:0x0287, B:121:0x028c, B:19:0x004e, B:94:0x01d6, B:98:0x01e1, B:100:0x01e5, B:103:0x0217, B:105:0x0228, B:106:0x0230, B:22:0x0057, B:128:0x02be, B:25:0x005e, B:72:0x0162, B:28:0x0069, B:62:0x0116, B:66:0x0121, B:68:0x0125, B:75:0x0171, B:78:0x017b, B:81:0x0181, B:90:0x01bd, B:122:0x028d, B:124:0x0298, B:125:0x02a0, B:58:0x00f3), top: B:133:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0262 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:109:0x025a, B:111:0x0262, B:113:0x0269, B:115:0x0270, B:117:0x0274, B:120:0x0287, B:121:0x028c, B:19:0x004e, B:94:0x01d6, B:98:0x01e1, B:100:0x01e5, B:103:0x0217, B:105:0x0228, B:106:0x0230, B:22:0x0057, B:128:0x02be, B:25:0x005e, B:72:0x0162, B:28:0x0069, B:62:0x0116, B:66:0x0121, B:68:0x0125, B:75:0x0171, B:78:0x017b, B:81:0x0181, B:90:0x01bd, B:122:0x028d, B:124:0x0298, B:125:0x02a0, B:58:0x00f3), top: B:133:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125 A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:109:0x025a, B:111:0x0262, B:113:0x0269, B:115:0x0270, B:117:0x0274, B:120:0x0287, B:121:0x028c, B:19:0x004e, B:94:0x01d6, B:98:0x01e1, B:100:0x01e5, B:103:0x0217, B:105:0x0228, B:106:0x0230, B:22:0x0057, B:128:0x02be, B:25:0x005e, B:72:0x0162, B:28:0x0069, B:62:0x0116, B:66:0x0121, B:68:0x0125, B:75:0x0171, B:78:0x017b, B:81:0x0181, B:90:0x01bd, B:122:0x028d, B:124:0x0298, B:125:0x02a0, B:58:0x00f3), top: B:133:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0171 A[Catch: all -> 0x0043, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:14:0x003e, B:109:0x025a, B:111:0x0262, B:113:0x0269, B:115:0x0270, B:117:0x0274, B:120:0x0287, B:121:0x028c, B:19:0x004e, B:94:0x01d6, B:98:0x01e1, B:100:0x01e5, B:103:0x0217, B:105:0x0228, B:106:0x0230, B:22:0x0057, B:128:0x02be, B:25:0x005e, B:72:0x0162, B:28:0x0069, B:62:0x0116, B:66:0x0121, B:68:0x0125, B:75:0x0171, B:78:0x017b, B:81:0x0181, B:90:0x01bd, B:122:0x028d, B:124:0x0298, B:125:0x02a0, B:58:0x00f3), top: B:133:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [in5, java.lang.Long, pq5, hb5, r41, kb5] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v(sz1 sz1Var, pq5 pq5Var, s41 s41Var) {
        d12 d12Var;
        int i;
        pq5 pq5Var2;
        boolean z;
        hb5 hb5Var;
        pq5 pq5Var3;
        Object obj;
        Object obj2;
        kb5 kb5Var;
        String str;
        boolean z2;
        pq5 pq5Var4;
        kb5 kb5Var2;
        Object obj3;
        Object obj4;
        kb5 kb5Var3;
        ja5 ja5Var;
        dp2 dp2Var;
        URL url;
        try {
            if (s41Var instanceof d12) {
                d12Var = (d12) s41Var;
                int i2 = d12Var.f0;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    d12Var.f0 = i2 - Integer.MIN_VALUE;
                    d12 d12Var2 = d12Var;
                    Object obj5 = d12Var2.d0;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = d12Var2.f0;
                    String str2 = "none";
                    yt1 yt1Var = yt1.A;
                    in5 in5Var = null;
                    in5 in5Var2 = null;
                    ?? r4 = 0;
                    switch (i) {
                        case 0:
                            oi2.Y(obj5);
                            pn5 pn5Var = sz1Var.g;
                            pq5Var2 = pq5Var;
                            d12Var2.R = pq5Var2;
                            d12Var2.f0 = 1;
                            obj5 = ((pl) pn5Var).c.b(d12Var2);
                            break;
                        case 1:
                            pq5Var2 = d12Var2.R;
                            oi2.Y(obj5);
                            jb5 jb5Var = (jb5) obj5;
                            if (!(jb5Var instanceof hb5)) {
                                if (jb5Var instanceof ib5) {
                                    dp2 dp2Var2 = dp2.DISABLED_LOGIN_EXPIRED;
                                    dp2Var2.getClass();
                                    if (dp2Var2 != dp2.ENABLED_FULL && dp2Var2 != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                        return new rz1(new ep2(dp2Var2, yt1Var, yt1Var, 0, null, null), a.NETWORK);
                                    }
                                    i.h("Failed requirement.");
                                    return null;
                                } else if (jb5Var == null) {
                                    dp2 dp2Var3 = dp2.DISABLED_NOT_LOGGED_IN;
                                    dp2Var3.getClass();
                                    if (dp2Var3 != dp2.ENABLED_FULL && dp2Var3 != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                        return new rz1(new ep2(dp2Var3, yt1Var, yt1Var, 0, null, null), a.NETWORK);
                                    }
                                    i.h("Failed requirement.");
                                    return null;
                                } else {
                                    i.d();
                                    return null;
                                }
                            }
                            z = sz1Var.w.a;
                            sz1Var.I0(in5.FETCHING_LATEST_DATA);
                            xe1 xe1Var = xk1.a;
                            de1 de1Var = de1.L;
                            f12 f12Var = new f12(sz1Var, pq5Var2, z, (r41) null);
                            d12Var2.R = pq5Var2;
                            d12Var2.X = (hb5) jb5Var;
                            d12Var2.Z = z;
                            d12Var2.f0 = 2;
                            Object d0 = hv.d0(de1Var, f12Var, d12Var2);
                            if (d0 != x61Var) {
                                pq5 pq5Var5 = pq5Var2;
                                hb5Var = jb5Var;
                                obj5 = d0;
                                pq5Var3 = pq5Var5;
                                obj = ((hm5) obj5).A;
                                if (!(obj instanceof em5)) {
                                    obj2 = null;
                                } else {
                                    obj2 = obj;
                                }
                                kb5Var = (kb5) obj2;
                                if (kb5Var == null) {
                                    long j = kb5Var.a;
                                    sz1Var.H0("ra_bootstrap_network_hit", new vr4("content_id", pq5Var3.i), new vr4("game_id", new Long(j)));
                                    sz1Var.L = new Long(j);
                                    String str3 = ((hb5) hb5Var).a;
                                    String str4 = pq5Var3.i;
                                    d12Var2.R = null;
                                    d12Var2.X = null;
                                    d12Var2.Y = kb5Var;
                                    d12Var2.Z = z;
                                    d12Var2.f0 = 3;
                                    if (sz1Var.J0(str3, str4, kb5Var, d12Var2) != x61Var) {
                                        kb5Var2 = kb5Var;
                                        rz1 rz1Var = new rz1(sz1Var.c0(kb5Var2), a.NETWORK);
                                        sz1Var.I0(null);
                                        return rz1Var;
                                    }
                                } else {
                                    Throwable a2 = hm5.a(obj);
                                    if ((obj instanceof em5) && !(a2 instanceof ha5)) {
                                        try {
                                            vr4 vr4Var = new vr4("content_id", pq5Var3.i);
                                            if (a2 != null) {
                                                str = a2.getClass().getSimpleName();
                                            } else {
                                                str = "Unknown";
                                            }
                                            sz1Var.H0("ra_bootstrap_network_failed", vr4Var, new vr4("error", str), new vr4("timed_out", Boolean.valueOf(a2 instanceof c67)));
                                            xe1 xe1Var2 = xk1.a;
                                            de1 de1Var2 = de1.L;
                                            pq5 pq5Var6 = pq5Var3;
                                            r4 = 0;
                                            e12 e12Var = new e12(sz1Var, pq5Var6, z, null, 0);
                                            d12Var2.R = pq5Var6;
                                            d12Var2.X = null;
                                            d12Var2.Y = null;
                                            d12Var2.Z = z;
                                            d12Var2.f0 = 5;
                                            obj5 = hv.d0(de1Var2, e12Var, d12Var2);
                                            if (obj5 != x61Var) {
                                                z2 = z;
                                                pq5Var4 = pq5Var6;
                                                obj3 = ((hm5) obj5).A;
                                                if (!(obj3 instanceof em5)) {
                                                    obj4 = r4;
                                                } else {
                                                    obj4 = obj3;
                                                }
                                                kb5Var3 = (kb5) obj4;
                                                if (kb5Var3 == null) {
                                                    long j2 = kb5Var3.a;
                                                    sz1Var.H0("ra_bootstrap_cache_fallback_hit", new vr4("content_id", pq5Var4.i), new vr4("game_id", new Long(j2)));
                                                    sz1Var.L = new Long(j2);
                                                    rz1 rz1Var2 = new rz1(sz1Var.c0(kb5Var3), a.CACHE);
                                                    sz1Var.I0(r4);
                                                    return rz1Var2;
                                                }
                                                vr4 vr4Var2 = new vr4("content_id", pq5Var4.i);
                                                Throwable a3 = hm5.a(obj3);
                                                if (a3 != null) {
                                                    str2 = a3.getClass().getSimpleName();
                                                }
                                                sz1Var.H0("ra_bootstrap_no_cache_no_network", vr4Var2, new vr4("cache_error", str2));
                                                sz1Var.L = r4;
                                                xe1 xe1Var3 = xk1.a;
                                                de1 de1Var3 = de1.L;
                                                f02 f02Var = new f02(sz1Var, pq5Var4, r4, 1);
                                                d12Var2.R = r4;
                                                d12Var2.X = r4;
                                                d12Var2.Y = r4;
                                                d12Var2.Z = z2;
                                                d12Var2.f0 = 6;
                                                obj5 = hv.d0(de1Var3, f02Var, d12Var2);
                                                in5Var2 = r4;
                                                if (obj5 == x61Var) {
                                                }
                                                ja5Var = (ja5) obj5;
                                                dp2Var = dp2.DISABLED_LOAD_ERROR;
                                                if (ja5Var == null) {
                                                    url = ja5Var.b;
                                                } else {
                                                    url = in5Var2;
                                                }
                                                dp2Var.getClass();
                                                if (dp2Var == dp2.ENABLED_FULL && dp2Var != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                                    rz1 rz1Var3 = new rz1(new ep2(dp2Var, yt1Var, yt1Var, 0, null, url), a.NETWORK);
                                                    sz1Var.I0(in5Var2);
                                                    return rz1Var3;
                                                }
                                                throw new IllegalArgumentException("Failed requirement.");
                                            }
                                        } catch (Throwable th) {
                                            th = th;
                                            in5Var = null;
                                            sz1Var.I0(in5Var);
                                            throw th;
                                        }
                                    }
                                    vr4 vr4Var3 = new vr4("content_id", pq5Var3.i);
                                    if (a2 != null) {
                                        str2 = a2.getClass().getSimpleName();
                                    }
                                    sz1Var.H0("ra_bootstrap_game_not_found", vr4Var3, new vr4("error", str2));
                                    d12Var2.R = null;
                                    d12Var2.X = null;
                                    d12Var2.Y = null;
                                    d12Var2.Z = z;
                                    d12Var2.f0 = 4;
                                    obj5 = sz1Var.d0(pq5Var3, d12Var2);
                                    break;
                                }
                                return x61Var;
                            }
                            return x61Var;
                        case 2:
                            boolean z3 = d12Var2.Z;
                            hb5 hb5Var2 = d12Var2.X;
                            pq5Var3 = d12Var2.R;
                            oi2.Y(obj5);
                            z = z3;
                            hb5Var = hb5Var2;
                            obj = ((hm5) obj5).A;
                            if (!(obj instanceof em5)) {
                            }
                            kb5Var = (kb5) obj2;
                            if (kb5Var == null) {
                            }
                            return x61Var;
                        case 3:
                            kb5Var2 = d12Var2.Y;
                            oi2.Y(obj5);
                            rz1 rz1Var4 = new rz1(sz1Var.c0(kb5Var2), a.NETWORK);
                            sz1Var.I0(null);
                            return rz1Var4;
                        case 4:
                            Throwable th2 = (Throwable) d12Var2.Y;
                            oi2.Y(obj5);
                            rz1 rz1Var5 = new rz1((ep2) obj5, a.NETWORK);
                            sz1Var.I0(null);
                            return rz1Var5;
                        case 5:
                            z2 = d12Var2.Z;
                            Throwable th3 = (Throwable) d12Var2.Y;
                            pq5Var4 = d12Var2.R;
                            oi2.Y(obj5);
                            obj3 = ((hm5) obj5).A;
                            if (!(obj3 instanceof em5)) {
                            }
                            kb5Var3 = (kb5) obj4;
                            if (kb5Var3 == null) {
                            }
                            break;
                        case 6:
                            Throwable th4 = (Throwable) d12Var2.Y;
                            oi2.Y(obj5);
                            ja5Var = (ja5) obj5;
                            dp2Var = dp2.DISABLED_LOAD_ERROR;
                            if (ja5Var == null) {
                            }
                            dp2Var.getClass();
                            if (dp2Var == dp2.ENABLED_FULL) {
                                break;
                            }
                            throw new IllegalArgumentException("Failed requirement.");
                        default:
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                }
            }
            switch (i) {
            }
        } catch (Throwable th5) {
            th = th5;
        }
        d12Var = new d12(sz1Var, s41Var);
        d12 d12Var22 = d12Var;
        Object obj52 = d12Var22.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = d12Var22.f0;
        String str22 = "none";
        yt1 yt1Var2 = yt1.A;
        in5 in5Var3 = null;
        in5 in5Var22 = null;
        ?? r42 = 0;
    }

    public static final Serializable w(sz1 sz1Var, lx5 lx5Var, hw6 hw6Var) {
        if (((ng6) sz1Var.c).b.getBoolean("cheats_enabled", false)) {
            sx1 sx1Var = sz1Var.w;
            if (!sx1Var.a || !sx1Var.b) {
                return ((h16) sz1Var.f).k(lx5Var, hw6Var);
            }
        }
        return yt1.A;
    }

    public static final VideoRenderer x(sz1 sz1Var) {
        Object obj;
        sz1Var.getClass();
        int currentRenderer = MelonEmulator.a.getCurrentRenderer();
        Iterator<E> it = VideoRenderer.getEntries().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((VideoRenderer) obj).getRenderer() == currentRenderer) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (VideoRenderer) obj;
    }

    public static nz1 y0(l95 l95Var) {
        if (l95Var instanceof y85) {
            y85 y85Var = (y85) l95Var;
            return new nz1(y85Var.a, y85Var.b, y85Var.c);
        } else if (l95Var instanceof a95) {
            a95 a95Var = (a95) l95Var;
            return new nz1(a95Var.a, a95Var.b, a95Var.c);
        } else if (l95Var instanceof z85) {
            z85 z85Var = (z85) l95Var;
            return new nz1(z85Var.a, z85Var.b, z85Var.c);
        } else if (l95Var instanceof c95) {
            c95 c95Var = (c95) l95Var;
            return new nz1(c95Var.a, c95Var.b, c95Var.c);
        } else if (l95Var instanceof d95) {
            d95 d95Var = (d95) l95Var;
            return new nz1(d95Var.a, d95Var.b, d95Var.c);
        } else if (l95Var instanceof w85) {
            w85 w85Var = (w85) l95Var;
            return new nz1(w85Var.a, w85Var.b, w85Var.c);
        } else if (l95Var instanceof e95) {
            e95 e95Var = (e95) l95Var;
            return new nz1(e95Var.a, e95Var.b, e95Var.c);
        } else {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r7.F0.a(defpackage.ba5.a, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0091, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A0(pq5 pq5Var, c46 c46Var, s41 s41Var) {
        c22 c22Var;
        int i;
        sz1 sz1Var;
        boolean booleanValue;
        if (s41Var instanceof c22) {
            c22Var = (c22) s41Var;
            int i2 = c22Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = c22Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = c22Var.Z;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                booleanValue = c22Var.R;
                                oi2.Y(obj);
                                return Boolean.valueOf(booleanValue);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        sz1Var = this;
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                            c22Var.R = booleanValue;
                            c22Var.Z = 3;
                        }
                        return Boolean.valueOf(booleanValue);
                    }
                    oi2.Y(obj);
                    sz1Var = this;
                } else {
                    oi2.Y(obj);
                    if (!c46Var.b) {
                        return Boolean.FALSE;
                    }
                    c22Var.Z = 1;
                    xe1 xe1Var = xk1.a;
                    sz1Var = this;
                    obj = hv.d0(de1.L, new h12(sz1Var, pq5Var, c46Var, null, 0), c22Var);
                }
                c22Var.Z = 2;
                sz1Var.v.getClass();
                xe1 xe1Var2 = xk1.a;
                obj = hv.d0(de1.L, new eh((Uri) obj, null, 0), c22Var);
            }
        }
        c22Var = new c22(this, s41Var);
        Object obj2 = c22Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = c22Var.Z;
        if (i == 0) {
        }
        c22Var.Z = 2;
        sz1Var.v.getClass();
        xe1 xe1Var22 = xk1.a;
        obj2 = hv.d0(de1.L, new eh((Uri) obj2, null, 0), c22Var);
    }

    public final void B0(String str, long j, String str2, vr4... vr4VarArr) {
        ww2 ww2Var = new ww2(5);
        ww2Var.a(new vr4("entity_type", str));
        ww2Var.a(new vr4("entity_id", Long.valueOf(j)));
        ww2Var.a(new vr4("reason", str2));
        ww2Var.a(new vr4("submit_path", "kotlin_api"));
        ww2Var.d(vr4VarArr);
        ArrayList arrayList = ww2Var.b;
        H0("context_mismatch", (vr4[]) arrayList.toArray(new vr4[arrayList.size()]));
    }

    public final void C0(String str, vr4... vr4VarArr) {
        if (!this.T) {
            return;
        }
        G0(str, (vr4[]) Arrays.copyOf(vr4VarArr, vr4VarArr.length));
    }

    public final void D0(ls3 ls3Var, long j, String str, vr4... vr4VarArr) {
        ww2 ww2Var = new ww2(5);
        ww2Var.a(new vr4("leaderboard_id", Long.valueOf(ls3Var.a)));
        ww2Var.a(new vr4("attempt_id", Long.valueOf(ls3Var.b)));
        ww2Var.a(new vr4("event_sequence", Long.valueOf(j)));
        ww2Var.a(new vr4("ui_state", str));
        ww2Var.d(vr4VarArr);
        ArrayList arrayList = ww2Var.b;
        C0("leaderboard_ui_transition", (vr4[]) arrayList.toArray(new vr4[arrayList.size()]));
    }

    public final void E0(String str, c cVar, ep2 ep2Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, Throwable th) {
        Object obj;
        boolean z;
        StringBuilder t = i61.t("source=runtime_setup stage=", str, " runtime=");
        t.append(cVar.getTraceValue());
        t.append(" game_id=");
        if ((rARuntimeBridgeConfig == null || (obj = rARuntimeBridgeConfig.getGameId()) == null) && (obj = this.L) == null) {
            obj = "none";
        }
        t.append(obj);
        t.append(" game_hash=redacted achievements=");
        t.append(ep2Var.b.size());
        t.append(" leaderboards=");
        t.append(ep2Var.c.size());
        t.append(" has_rich_presence=");
        if (ep2Var.e != null) {
            z = true;
        } else {
            z = false;
        }
        t.append(z);
        t.append(" status=");
        t.append(ep2Var.a.name());
        if (th != null) {
            t.append(" error=");
            t.append(th.getClass().getSimpleName());
        }
        String sb = t.toString();
        if (th == null) {
            Log.i("RAIdentity", sb);
        } else {
            Log.w("RAIdentity", sb);
        }
    }

    public final void G0(String str, vr4... vr4VarArr) {
        StringBuilder t = i61.t("event_type=", str, " network_mode=");
        t.append(this.G.name());
        t.append(" session_mode=");
        t.append(this.H.name());
        t.append(" runtime_path=");
        t.append(this.O.getTraceValue());
        t.append(" current_game_id=");
        Object obj = this.L;
        if (obj == null) {
            obj = "none";
        }
        t.append(obj);
        for (vr4 vr4Var : vr4VarArr) {
            String str2 = (String) vr4Var.A;
            Object obj2 = vr4Var.B;
            if (obj2 != null) {
                t.append(' ');
                t.append(str2);
                t.append('=');
                t.append(xs6.d0(obj2.toString(), ' ', '_'));
            }
        }
        Log.i("RASubmission", t.toString());
    }

    public final void H0(String str, vr4... vr4VarArr) {
        boolean z;
        if ((this.b.getApplicationInfo().flags & 2) != 0) {
            StringBuilder t = i61.t("event_type=", str, " network_mode=");
            t.append(this.G.name());
            t.append(" session_mode=");
            t.append(this.H.name());
            t.append(" game_id=");
            Object obj = this.L;
            if (obj == null) {
                obj = "none";
            }
            t.append(obj);
            t.append(" runtime_path=");
            t.append(this.O.getTraceValue());
            t.append(" session_active=");
            if (!this.K && this.M == null) {
                z = false;
            } else {
                z = true;
            }
            t.append(z);
            for (vr4 vr4Var : vr4VarArr) {
                String str2 = (String) vr4Var.A;
                Object obj2 = vr4Var.B;
                if (obj2 != null) {
                    t.append(' ');
                    t.append(str2);
                    t.append('=');
                    t.append(xs6.d0(obj2.toString(), ' ', '_'));
                }
            }
            Log.i("RATrace", t.toString());
        }
    }

    public final void I0(in5 in5Var) {
        tp6 tp6Var;
        Object value;
        hy1 hy1Var;
        do {
            tp6Var = this.p0;
            value = tp6Var.getValue();
            hy1Var = (hy1) value;
            if (hy1Var instanceof zx1) {
                hy1Var = new zx1(((zx1) hy1Var).a, in5Var);
            }
        } while (!tp6Var.j(value, hy1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8, types: [yt1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J0(String str, String str2, kb5 kb5Var, s41 s41Var) {
        f22 f22Var;
        int i;
        ArrayList arrayList;
        kb5 kb5Var2;
        kb5 kb5Var3 = kb5Var;
        if (s41Var instanceof f22) {
            f22Var = (f22) s41Var;
            int i2 = f22Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f22Var.Z = i2 - Integer.MIN_VALUE;
                f22 f22Var2 = f22Var;
                Object obj = f22Var2.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = f22Var2.Z;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        kb5Var2 = f22Var2.R;
                        try {
                            oi2.Y(obj);
                        } catch (Exception unused) {
                            kb5Var3 = kb5Var2;
                        }
                        as0 a2 = to7.a(this);
                        xe1 xe1Var = xk1.a;
                        hv.L(a2, de1.L, null, new xd1(this, kb5Var2, null, 11), 2);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (!this.o.a()) {
                    return jg7Var;
                }
                ev evVar = new ev(kb5Var3.e, 1);
                vn0 vn0Var = new vn0(26);
                tb6 tb6Var = tb6.d0;
                qd2 qd2Var = new qd2(new qd2(evVar, vn0Var), new vn0(27), 2);
                ol1 ol1Var = new ol1(qd2Var.iterator(), new vn0(28));
                boolean hasNext = ol1Var.hasNext();
                ?? r2 = yt1.A;
                if (!hasNext) {
                    arrayList = r2;
                } else {
                    Object next = ol1Var.next();
                    if (!ol1Var.hasNext()) {
                        arrayList = hf.b0(next);
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(next);
                        while (ol1Var.hasNext()) {
                            arrayList2.add(ol1Var.next());
                        }
                        arrayList = arrayList2;
                    }
                }
                qd2 qd2Var2 = new qd2(new qd2(new ev(kb5Var3.e, 1), new vn0(29)), new bz1(0), 2);
                ol1 ol1Var2 = new ol1(qd2Var2.iterator(), new bz1(1));
                if (ol1Var2.hasNext()) {
                    Object next2 = ol1Var2.next();
                    if (!ol1Var2.hasNext()) {
                        r2 = hf.b0(next2);
                    } else {
                        r2 = new ArrayList();
                        r2.add(next2);
                        while (ol1Var2.hasNext()) {
                            r2.add(ol1Var2.next());
                        }
                    }
                }
                List list = r2;
                long j = kb5Var3.a;
                String str3 = kb5Var3.d;
                String url = kb5Var3.c.toString();
                url.getClass();
                vj4 vj4Var = new vj4(str2, j, arrayList, list, str3, url, System.currentTimeMillis());
                try {
                    xe1 xe1Var2 = xk1.a;
                    de1 de1Var = de1.L;
                    l5 l5Var = new l5(this, str, str2, vj4Var, null, 10);
                    f22Var2.R = kb5Var3;
                    f22Var2.Z = 1;
                    if (hv.d0(de1Var, l5Var, f22Var2) == x61Var) {
                        return x61Var;
                    }
                } catch (Exception unused2) {
                }
                kb5Var2 = kb5Var3;
                as0 a22 = to7.a(this);
                xe1 xe1Var3 = xk1.a;
                hv.L(a22, de1.L, null, new xd1(this, kb5Var2, null, 11), 2);
                return jg7Var;
            }
        }
        f22Var = new f22(this, s41Var);
        f22 f22Var22 = f22Var;
        Object obj2 = f22Var22.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = f22Var22.Z;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        kb5Var2 = kb5Var3;
        as0 a222 = to7.a(this);
        xe1 xe1Var32 = xk1.a;
        hv.L(a222, de1.L, null, new xd1(this, kb5Var2, null, 11), 2);
        return jg7Var2;
    }

    public final void K0(nu4 nu4Var) {
        a43 a43Var;
        pq5 pq5Var;
        boolean z;
        boolean z2;
        boolean z3;
        dy1 dy1Var;
        pq5 pq5Var2;
        dy1 dy1Var2;
        dy1 dy1Var3;
        dy1 dy1Var4;
        nu4Var.getClass();
        boolean z4 = nu4Var instanceof xz5;
        boolean z5 = true;
        of6 of6Var = this.T0;
        if (z4) {
            int i = wz1.d[((xz5) nu4Var).ordinal()];
            o41 o41Var = this.z;
            kd6 kd6Var = this.c;
            of6 of6Var2 = this.J0;
            sx1 sx1Var = this.w;
            tp6 tp6Var = this.p0;
            dy1 dy1Var5 = null;
            lx5 lx5Var = null;
            switch (i) {
                case 1:
                    Object value = tp6Var.getValue();
                    if (value instanceof dy1) {
                        dy1Var5 = (dy1) value;
                    }
                    if (dy1Var5 != null && (pq5Var = dy1Var5.a) != null) {
                        UUID v = ((ng6) kd6Var).v();
                        jt5 jt5Var = pq5Var.f;
                        if (jt5Var.g != nx5.GLOBAL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        UUID uuid = jt5Var.c;
                        if (uuid != null && !uuid.equals(v)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (pq5Var.f.l != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        a43Var = new a43(z, z2, z3);
                    } else {
                        a43Var = new a43(false, false, false);
                    }
                    if (this.O == c.DISABLED && !sx1Var.b) {
                        z5 = false;
                    }
                    of6Var.k(new my1(a43Var, z5, v0()));
                    return;
                case 2:
                    Object value2 = tp6Var.getValue();
                    if (value2 instanceof dy1) {
                        dy1Var = (dy1) value2;
                    } else {
                        dy1Var = null;
                    }
                    if (dy1Var != null && (pq5Var2 = dy1Var.a) != null) {
                        hv.L(o41Var, null, null, new ji(this, pq5Var2, (r41) null, 6), 3);
                        return;
                    }
                    return;
                case 3:
                    sx1Var.getClass();
                    Object value3 = tp6Var.getValue();
                    if (value3 instanceof dy1) {
                        dy1Var2 = (dy1) value3;
                    } else {
                        dy1Var2 = null;
                    }
                    if (dy1Var2 != null) {
                        hv.L(o41Var, null, null, new p02(this, dy1Var2, null, 3), 3);
                        return;
                    }
                    return;
                case 4:
                    if (sx1Var.b()) {
                        Object value4 = tp6Var.getValue();
                        if (value4 instanceof dy1) {
                            dy1Var3 = (dy1) value4;
                        } else {
                            dy1Var3 = null;
                        }
                        if (dy1Var3 != null) {
                            hv.L(o41Var, null, null, new p02(this, dy1Var3, null, 4), 3);
                            return;
                        }
                        return;
                    }
                    of6Var2.k(p67.a);
                    return;
                case 5:
                    if (!((ng6) kd6Var).b.getBoolean("enable_rewind", false)) {
                        of6Var2.k(t77.a);
                        return;
                    } else if (!sx1Var.b()) {
                        of6Var2.k(s77.a);
                        return;
                    } else {
                        hv.L(o41Var, null, null, new hz1(15, null, this), 3);
                        return;
                    }
                case 6:
                    Object value5 = tp6Var.getValue();
                    if (value5 instanceof dy1) {
                        dy1Var4 = (dy1) value5;
                    } else {
                        dy1Var4 = null;
                    }
                    if (dy1Var4 != null) {
                        pq5 pq5Var3 = dy1Var4.a;
                        pw5 b2 = this.p.b(pq5Var3.d);
                        if (b2 != null) {
                            lx5Var = b2.a(pq5Var3);
                        }
                        if (lx5Var != null) {
                            of6Var.k(new ly1(lx5Var));
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    of6Var.k(oy1.a);
                    return;
                case 8:
                    hv.L(o41Var, null, null, new h22(this, null), 3);
                    return;
                case 9:
                    of6Var.k(py1.a);
                    return;
                case 10:
                    of6Var.k(vy1.a);
                    return;
                case 11:
                    S0();
                    return;
                case 12:
                    q0(false);
                    return;
                default:
                    i.d();
                    return;
            }
        } else if (nu4Var instanceof cd2) {
            int i2 = wz1.e[((cd2) nu4Var).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        a1();
                        of6Var.k(jy1.a);
                        return;
                    }
                    i.d();
                    return;
                }
                S0();
                return;
            }
            of6Var.k(new my1(new a43(false, false, false), false, false));
        }
    }

    public final void L0(boolean z) {
        if (z) {
            this.l0.set(true);
        }
        this.j0.incrementAndGet();
        hv.L(this.z, null, a71.UNDISPATCHED, new p22(this, null), 1);
    }

    public final void M0(boolean z) {
        hv.L(this.z, null, null, new r02(this, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object N0(gd5 gd5Var, s41 s41Var) {
        q22 q22Var;
        Object obj;
        int i;
        if (s41Var instanceof q22) {
            q22Var = (q22) s41Var;
            int i2 = q22Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q22Var.Z = i2 - Integer.MIN_VALUE;
                obj = q22Var.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = q22Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        gd5Var = q22Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
                    if (rARuntimeBridgeConfig == null) {
                        return Boolean.FALSE;
                    }
                    q22Var.R = gd5Var;
                    q22Var.Z = 1;
                    obj = W(rARuntimeBridgeConfig, q22Var);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                if (((Boolean) obj).booleanValue()) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(O0(gd5Var));
            }
        }
        q22Var = new q22(this, s41Var);
        obj = q22Var.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = q22Var.Z;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final boolean O0(gd5 gd5Var) {
        boolean z;
        boolean z2;
        String str;
        RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
        if (rARuntimeBridgeConfig == null) {
            return false;
        }
        if (this.O == c.RC_CLIENT && rARuntimeBridgeConfig.getRuntimeMode() == RARuntimeBridgeMode.RC_CLIENT_ONLINE) {
            z = true;
        } else {
            z = false;
        }
        boolean hardcoreEnabled = rARuntimeBridgeConfig.getHardcoreEnabled();
        boolean z3 = this.w.a;
        String username = rARuntimeBridgeConfig.getUsername();
        String apiToken = rARuntimeBridgeConfig.getApiToken();
        if (apiToken != null && !qs6.v0(apiToken)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String username2 = rARuntimeBridgeConfig.getUsername();
        Long gameId = rARuntimeBridgeConfig.getGameId();
        Long l = this.L;
        String gameHash = rARuntimeBridgeConfig.getGameHash();
        pq5 pq5Var = this.n1;
        if (pq5Var != null) {
            str = pq5Var.i;
        } else {
            str = null;
        }
        long submissionSessionId = rARuntimeBridgeConfig.getSubmissionSessionId();
        gd5Var.getClass();
        String str2 = gd5Var.c;
        boolean z4 = z;
        long j = gd5Var.b;
        String str3 = gd5Var.a;
        if (!z4 || !hardcoreEnabled || !z3 || !nb3.k(username, str3) || z2 || !nb3.k(username2, str3) || gameId == null || gameId.longValue() != j || l == null || l.longValue() != j || !nb3.k(gameHash, str2) || !nb3.k(str, str2) || submissionSessionId != gd5Var.e) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0081, code lost:
        if (r0 == r8) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0127 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object P0(s41 s41Var) {
        t22 t22Var;
        int i;
        nv4 nv4Var;
        nv4 nv4Var2;
        long longValue;
        boolean z;
        long j;
        wk0 wk0Var;
        boolean z2;
        boolean z3;
        String str;
        boolean z4;
        if (s41Var instanceof t22) {
            t22Var = (t22) s41Var;
            int i2 = t22Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t22Var.d0 = i2 - Integer.MIN_VALUE;
                t22 t22Var2 = t22Var;
                Object obj = t22Var2.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = t22Var2.d0;
                String str2 = "ra_pending_refresh_failed";
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            j = t22Var2.X;
                            nv4 nv4Var3 = t22Var2.R;
                            try {
                                oi2.Y(obj);
                                nv4Var2 = nv4Var3;
                                z = true;
                                z2 = z;
                            } catch (c67 unused) {
                                nv4Var2 = nv4Var3;
                                z = true;
                                z2 = false;
                                if (this.b0 != nv4Var2) {
                                }
                                z3 = false;
                                if (z2) {
                                }
                                vr4 vr4Var = new vr4("barrier_id", new Long(j));
                                vr4 vr4Var2 = new vr4("pending_total", new Integer(((bv4) nv4Var2.i.A.getValue()).c.a));
                                if (z2) {
                                }
                                G0(str2, vr4Var, vr4Var2, new vr4("reason", str), new vr4("submit_owner", "rc_client"));
                                if (!z2) {
                                }
                                z4 = false;
                                return Boolean.valueOf(z4);
                            }
                            if (this.b0 != nv4Var2 && O0(nv4Var2.a)) {
                                z3 = z;
                            } else {
                                z3 = false;
                            }
                            if (z2 && z3) {
                                str2 = "ra_pending_refresh_completed";
                            }
                            vr4 vr4Var3 = new vr4("barrier_id", new Long(j));
                            vr4 vr4Var22 = new vr4("pending_total", new Integer(((bv4) nv4Var2.i.A.getValue()).c.a));
                            if (z2) {
                                str = "barrier_timeout";
                            } else if (!z3) {
                                str = "context_changed";
                            } else {
                                str = null;
                            }
                            G0(str2, vr4Var3, vr4Var22, new vr4("reason", str), new vr4("submit_owner", "rc_client"));
                            if (!z2 && z3) {
                                z4 = z;
                            } else {
                                z4 = false;
                            }
                            return Boolean.valueOf(z4);
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    nv4Var = t22Var2.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    nv4Var = this.b0;
                    if (nv4Var == null) {
                        return Boolean.TRUE;
                    }
                    if (this.O == c.RC_CLIENT && O0(nv4Var.a)) {
                        t22Var2.R = nv4Var;
                        t22Var2.d0 = 1;
                        this.v.getClass();
                        obj = hv.d0(xk1.a, new wg(2, null, 1), t22Var2);
                    } else {
                        return Boolean.FALSE;
                    }
                }
                nv4Var2 = nv4Var;
                longValue = ((Number) obj).longValue();
                if (longValue > 0) {
                    G0("ra_pending_refresh_failed", new vr4("reason", "native_refresh_rejected"), new vr4("submit_owner", "rc_client"));
                    return Boolean.FALSE;
                }
                try {
                    z = true;
                    try {
                        wk0Var = new wk0(2, longValue, null, this, nv4Var2);
                        t22Var2.R = nv4Var2;
                        t22Var2.X = longValue;
                        t22Var2.d0 = 2;
                    } catch (c67 unused2) {
                        j = longValue;
                        z2 = false;
                        if (this.b0 != nv4Var2) {
                        }
                        z3 = false;
                        if (z2) {
                        }
                        vr4 vr4Var32 = new vr4("barrier_id", new Long(j));
                        vr4 vr4Var222 = new vr4("pending_total", new Integer(((bv4) nv4Var2.i.A.getValue()).c.a));
                        if (z2) {
                        }
                        G0(str2, vr4Var32, vr4Var222, new vr4("reason", str), new vr4("submit_owner", "rc_client"));
                        if (!z2) {
                        }
                        z4 = false;
                        return Boolean.valueOf(z4);
                    }
                } catch (c67 unused3) {
                    z = true;
                }
                if (xk2.M(3000L, wk0Var, t22Var2) != x61Var) {
                    j = longValue;
                    z2 = z;
                    if (this.b0 != nv4Var2) {
                    }
                    z3 = false;
                    if (z2) {
                        str2 = "ra_pending_refresh_completed";
                    }
                    vr4 vr4Var322 = new vr4("barrier_id", new Long(j));
                    vr4 vr4Var2222 = new vr4("pending_total", new Integer(((bv4) nv4Var2.i.A.getValue()).c.a));
                    if (z2) {
                    }
                    G0(str2, vr4Var322, vr4Var2222, new vr4("reason", str), new vr4("submit_owner", "rc_client"));
                    if (!z2) {
                    }
                    z4 = false;
                    return Boolean.valueOf(z4);
                }
                return x61Var;
            }
        }
        t22Var = new t22(this, s41Var);
        t22 t22Var22 = t22Var;
        Object obj2 = t22Var22.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = t22Var22.d0;
        String str22 = "ra_pending_refresh_failed";
        if (i == 0) {
        }
        nv4Var2 = nv4Var;
        longValue = ((Number) obj2).longValue();
        if (longValue > 0) {
        }
    }

    public final void Q0(mc5 mc5Var) {
        s35 s35Var = this.V;
        s35Var.getClass();
        mc5Var.getClass();
        if (((AtomicBoolean) s35Var.A).get()) {
            mc5Var = mc5.TERMINAL_STOP;
        }
        hv.L(this.z, null, null, new hn(this, mc5Var, (r41) null, 5), 3);
    }

    public final void R0() {
        v80 v80Var = this.e0;
        if (v80Var == null) {
            return;
        }
        q33 q33Var = this.f0;
        synchronized (q33Var) {
            if (!q33Var.A) {
                return;
            }
            q33Var.A = false;
            v80Var.c(jg7.a);
        }
    }

    public final void S0() {
        if (((hy1) this.p0.getValue()).a()) {
            hv.L(this.z, null, null, new hz1(16, null, this), 3);
        }
    }

    public final void T0() {
        if (((hy1) this.p0.getValue()).a() && !((AtomicBoolean) this.V.A).get()) {
            hv.L(this.z, null, null, new hz1(17, null, this), 3);
        }
    }

    public final jg7 U0() {
        boolean a2 = ((hy1) this.p0.getValue()).a();
        jg7 jg7Var = jg7.a;
        if (a2 && this.j0.get() == 0 && !((AtomicBoolean) this.V.A).get() && nb3.k(((tp6) this.h0.R).getValue(), uc5.a)) {
            this.v.getClass();
            MelonEmulator.a.resumeEmulation();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
        }
        return jg7Var;
    }

    public final void V0(RewindSaveState rewindSaveState) {
        rewindSaveState.getClass();
        if (!this.w.b()) {
            this.J0.k(s77.a);
            return;
        }
        hv.L(this.z, null, null, new xd1(this, rewindSaveState, null, 13), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object W(RARuntimeBridgeConfig rARuntimeBridgeConfig, s41 s41Var) {
        yz1 yz1Var;
        Object obj;
        int i;
        hb5 hb5Var;
        String str;
        if (s41Var instanceof yz1) {
            yz1Var = (yz1) s41Var;
            int i2 = yz1Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yz1Var.Z = i2 - Integer.MIN_VALUE;
                obj = yz1Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = yz1Var.Z;
                String str2 = null;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        rARuntimeBridgeConfig = yz1Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (rARuntimeBridgeConfig == null) {
                        return Boolean.FALSE;
                    }
                    yz1Var.R = rARuntimeBridgeConfig;
                    yz1Var.Z = 1;
                    obj = ((pl) this.g).c.b(yz1Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                String username = rARuntimeBridgeConfig.getUsername();
                String apiToken = rARuntimeBridgeConfig.getApiToken();
                if (hb5Var == null) {
                    str = hb5Var.a;
                } else {
                    str = null;
                }
                if (hb5Var != null) {
                    str2 = hb5Var.b;
                }
                return Boolean.valueOf((username != null || qs6.v0(username) || apiToken == null || qs6.v0(apiToken) || !username.equals(str) || !apiToken.equals(str2)) ? false : false);
            }
        }
        yz1Var = new yz1(this, s41Var);
        obj = yz1Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = yz1Var.Z;
        String str22 = null;
        boolean z2 = true;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        String username2 = rARuntimeBridgeConfig.getUsername();
        String apiToken2 = rARuntimeBridgeConfig.getApiToken();
        if (hb5Var == null) {
        }
        if (hb5Var != null) {
        }
        return Boolean.valueOf((username2 != null || qs6.v0(username2) || apiToken2 == null || qs6.v0(apiToken2) || !username2.equals(str) || !apiToken2.equals(str22)) ? false : false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        if (defpackage.hv.d0(r0, r9, r1) == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object X0(pq5 pq5Var, c46 c46Var, s41 s41Var) {
        y22 y22Var;
        x61 x61Var;
        int i;
        pq5 pq5Var2;
        c46 c46Var2;
        c46 c46Var3;
        Uri uri;
        c46 c46Var4;
        pq5 pq5Var3;
        if (s41Var instanceof y22) {
            y22Var = (y22) s41Var;
            int i2 = y22Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y22Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = y22Var.Z;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = y22Var.e0;
                jh jhVar = this.v;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    oi2.Y(obj);
                                    return Boolean.TRUE;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            c46 c46Var5 = y22Var.X;
                            pq5 pq5Var4 = y22Var.R;
                            oi2.Y(obj);
                            c46Var4 = c46Var5;
                            pq5Var3 = pq5Var4;
                            if (((Boolean) obj).booleanValue()) {
                                return Boolean.FALSE;
                            }
                            xe1 xe1Var = xk1.a;
                            de1 de1Var = de1.L;
                            h12 h12Var = new h12(this, pq5Var3, c46Var4, null, 1);
                            y22Var.R = null;
                            y22Var.X = null;
                            y22Var.Y = null;
                            y22Var.e0 = 4;
                        } else {
                            uri = y22Var.Y;
                            c46Var3 = y22Var.X;
                            pq5Var2 = y22Var.R;
                            oi2.Y(obj);
                            y22Var.R = pq5Var2;
                            y22Var.X = c46Var3;
                            y22Var.Y = null;
                            y22Var.e0 = 3;
                            jhVar.getClass();
                            xe1 xe1Var2 = xk1.a;
                            obj = hv.d0(de1.L, new eh(uri, null, 1), y22Var);
                            if (obj != x61Var) {
                                c46Var4 = c46Var3;
                                pq5Var3 = pq5Var2;
                                if (((Boolean) obj).booleanValue()) {
                                }
                            }
                            return x61Var;
                        }
                    } else {
                        c46Var2 = y22Var.X;
                        pq5Var2 = y22Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    y22Var.R = pq5Var;
                    y22Var.X = c46Var;
                    y22Var.e0 = 1;
                    xe1 xe1Var3 = xk1.a;
                    obj = hv.d0(de1.L, new h12(this, pq5Var, c46Var, null, 0), y22Var);
                    if (obj != x61Var) {
                        pq5Var2 = pq5Var;
                        c46Var2 = c46Var;
                    }
                    return x61Var;
                }
                Uri uri2 = (Uri) obj;
                y22Var.R = pq5Var2;
                y22Var.X = c46Var2;
                y22Var.Y = uri2;
                y22Var.e0 = 2;
                jhVar.getClass();
                xe1 xe1Var4 = xk1.a;
                if (hv.d0(de1.L, new wg(2, null, 3), y22Var) != x61Var) {
                    c46Var3 = c46Var2;
                    uri = uri2;
                    y22Var.R = pq5Var2;
                    y22Var.X = c46Var3;
                    y22Var.Y = null;
                    y22Var.e0 = 3;
                    jhVar.getClass();
                    xe1 xe1Var22 = xk1.a;
                    obj = hv.d0(de1.L, new eh(uri, null, 1), y22Var);
                    if (obj != x61Var) {
                    }
                }
                return x61Var;
            }
        }
        y22Var = new y22(this, s41Var);
        Object obj2 = y22Var.Z;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = y22Var.e0;
        jh jhVar2 = this.v;
        if (i == 0) {
        }
        Uri uri22 = (Uri) obj2;
        y22Var.R = pq5Var2;
        y22Var.X = c46Var2;
        y22Var.Y = uri22;
        y22Var.e0 = 2;
        jhVar2.getClass();
        xe1 xe1Var42 = xk1.a;
        if (hv.d0(de1.L, new wg(2, null, 3), y22Var) != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Y(s41 s41Var) {
        zz1 zz1Var;
        Object obj;
        int i;
        if (s41Var instanceof zz1) {
            zz1Var = (zz1) s41Var;
            int i2 = zz1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zz1Var.Y = i2 - Integer.MIN_VALUE;
                obj = zz1Var.R;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = zz1Var.Y;
                String str = null;
                iw2 iw2Var = this.o0;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                aw2 aw2Var = (aw2) obj;
                                int i3 = aw2Var.b;
                                int i4 = aw2Var.a;
                                if (i3 == 0) {
                                    H0("hardcore_silent_replay_complete", new vr4("submitted", new Integer(i4)));
                                    return jg7Var;
                                }
                                H0("hardcore_silent_replay_partial", new vr4("submitted", new Integer(i4)), new vr4("remaining", new Integer(aw2Var.b)));
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        vr4 vr4Var = new vr4("pending_hardcore", new Integer(((Number) obj).intValue()));
                        pq5 pq5Var = this.n1;
                        if (pq5Var != null) {
                            str = pq5Var.i;
                        }
                        H0("hardcore_silent_replay_attempt", vr4Var, new vr4("content_id", str));
                        zz1Var.Y = 3;
                        obj = m0(zz1Var);
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    if (this.o.a()) {
                        zz1Var.Y = 1;
                        obj = iw2Var.f(zz1Var);
                    }
                    return jg7Var;
                }
                if (((Number) obj).intValue() != 0) {
                    zz1Var.Y = 2;
                    obj = iw2Var.f(zz1Var);
                }
                return jg7Var;
            }
        }
        zz1Var = new zz1(this, s41Var);
        obj = zz1Var.R;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = zz1Var.Y;
        String str2 = null;
        iw2 iw2Var2 = this.o0;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        if (((Number) obj).intValue() != 0) {
        }
        return jg7Var2;
    }

    public final void Y0(String str, String str2) {
        synchronized (this.P) {
            if (!nb3.k(this.R, str)) {
                return;
            }
            this.R = null;
            tu0 tu0Var = this.S;
            tu0 tu0Var2 = new tu0();
            this.S = tu0Var2;
            hv.L(to7.a(this), null, a71.UNDISPATCHED, new a32(new vr4(tu0Var, tu0Var2), this, str, str2, null, 1), 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(lc5 lc5Var, mc5 mc5Var, s41 s41Var) {
        a02 a02Var;
        int i;
        Long valueOf;
        long longValue;
        lz1 lz1Var;
        if (s41Var instanceof a02) {
            a02Var = (a02) s41Var;
            int i2 = a02Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a02Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = a02Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = a02Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        longValue = a02Var.X;
                        lz1Var = a02Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    eb ebVar = this.h0;
                    ebVar.getClass();
                    lc5Var.getClass();
                    mc5Var.getClass();
                    sc5 k = np2.k(mc5Var);
                    synchronized (ebVar.B) {
                        try {
                            sc5 t = ebVar.t();
                            if (t != null && t.ordinal() >= k.ordinal()) {
                                valueOf = null;
                            } else {
                                long I = ebVar.I();
                                valueOf = Long.valueOf(I);
                                tp6 tp6Var = (tp6) ebVar.R;
                                tc5 tc5Var = new tc5(I, lc5Var, mc5Var);
                                tp6Var.getClass();
                                tp6Var.m(null, tc5Var);
                            }
                        } finally {
                        }
                    }
                    if (valueOf != null) {
                        longValue = valueOf.longValue();
                        lz1 lz1Var2 = this.n0;
                        if (lz1Var2 != null) {
                            lz1Var2.b.h(null);
                        }
                        tu0 tu0Var = new tu0();
                        lz1 lz1Var3 = new lz1(longValue, tu0Var);
                        this.n0 = lz1Var3;
                        a02Var.R = lz1Var3;
                        a02Var.X = longValue;
                        a02Var.d0 = 1;
                        obj = tu0Var.q(a02Var);
                        if (obj == x61Var) {
                            return x61Var;
                        }
                        lz1Var = lz1Var3;
                    } else {
                        throw new CancellationException("A higher-priority pending submission dialog is active");
                    }
                }
                kz1 kz1Var = new kz1(longValue, (yv2) obj);
                if (this.n0 == lz1Var) {
                    this.n0 = null;
                }
                return kz1Var;
            }
        }
        a02Var = new a02(this, s41Var);
        Object obj2 = a02Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = a02Var.d0;
        if (i == 0) {
        }
        kz1 kz1Var2 = new kz1(longValue, (yv2) obj2);
        if (this.n0 == lz1Var) {
        }
        return kz1Var2;
    }

    public final tu0 Z0(pq5 pq5Var, uz1 uz1Var) {
        tu0 tu0Var = new tu0();
        ap6 ap6Var = this.E;
        ap6 L = hv.L(this.z, null, a71.LAZY, new o32(ap6Var, this, tu0Var, uz1Var, pq5Var, null), 1);
        this.E = L;
        L.a0(new cz1(0, tu0Var));
        L.start();
        return tu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r10 != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(int i, Long l, s41 s41Var) {
        c02 c02Var;
        int i2;
        int i3;
        tu0 tu0Var;
        if (s41Var instanceof c02) {
            c02Var = (c02) s41Var;
            int i4 = c02Var.d0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c02Var.d0 = i4 - Integer.MIN_VALUE;
                Object obj = c02Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = c02Var.d0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            tu0Var = c02Var.X;
                            oi2.Y(obj);
                            mi4 mi4Var = (mi4) obj;
                            if (this.m0 == tu0Var) {
                                this.m0 = null;
                            }
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = c02Var.R;
                    tu0 tu0Var2 = c02Var.X;
                    oi2.Y(obj);
                    i3 = i5;
                    tu0Var = tu0Var2;
                } else {
                    oi2.Y(obj);
                    tu0 tu0Var3 = this.m0;
                    if (tu0Var3 != null) {
                        tu0Var3.h(null);
                    }
                    tu0 tu0Var4 = new tu0();
                    this.m0 = tu0Var4;
                    qy1 qy1Var = new qy1(i, l);
                    c02Var.X = tu0Var4;
                    c02Var.R = i;
                    c02Var.d0 = 1;
                    if (this.T0.a(qy1Var, c02Var) != x61Var) {
                        i3 = i;
                        tu0Var = tu0Var4;
                    }
                    return x61Var;
                }
                c02Var.X = tu0Var;
                c02Var.R = i3;
                c02Var.d0 = 2;
                obj = tu0Var.q(c02Var);
            }
        }
        c02Var = new c02(this, s41Var);
        Object obj2 = c02Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = c02Var.d0;
        if (i2 == 0) {
        }
        c02Var.X = tu0Var;
        c02Var.R = i3;
        c02Var.d0 = 2;
        obj2 = tu0Var.q(c02Var);
    }

    public final void a1() {
        ap6 ap6Var = this.E;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        ap6 ap6Var2 = this.F;
        if (ap6Var2 != null) {
            ap6Var2.h(null);
        }
        this.F = null;
        this.Z.c();
        this.a0.k();
        hv.L(to7.a(this), null, null, new hz1(27, null, this), 3);
        r0();
        g1("emulator_stopped");
        this.N = null;
        this.O = c.DISABLED;
        jh jhVar = this.v;
        jhVar.getClass();
        MelonEmulator.a.stopEmulation();
        jhVar.o.r();
        jhVar.g.a();
        jhVar.r.d();
        ByteBuffer byteBuffer = this.t.a;
        if (byteBuffer != null) {
            byteBuffer.position(0);
            int capacity = byteBuffer.capacity() / 4;
            for (int i = 0; i < capacity; i++) {
                byteBuffer.putInt(-16777216);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b0(long j, s41 s41Var) {
        d02 d02Var;
        x61 x61Var;
        int i;
        long j2;
        long currentTimeMillis;
        long L;
        if (s41Var instanceof d02) {
            d02Var = (d02) s41Var;
            int i2 = d02Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d02Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = d02Var.Y;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = d02Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        currentTimeMillis = d02Var.X;
                        j2 = d02Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    j2 = j;
                    currentTimeMillis = System.currentTimeMillis() + j;
                }
                while (!this.K && System.currentTimeMillis() < currentTimeMillis) {
                    jd1 jd1Var = oq1.B;
                    L = n16.L(250, uq1.MILLISECONDS);
                    d02Var.R = j2;
                    d02Var.X = currentTimeMillis;
                    d02Var.d0 = 1;
                    if (q60.u(L, d02Var) == x61Var) {
                        return x61Var;
                    }
                }
                return Boolean.valueOf(this.K);
            }
        }
        d02Var = new d02(this, s41Var);
        Object obj2 = d02Var.Y;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = d02Var.d0;
        if (i == 0) {
        }
        while (!this.K) {
            jd1 jd1Var2 = oq1.B;
            L = n16.L(250, uq1.MILLISECONDS);
            d02Var.R = j2;
            d02Var.X = currentTimeMillis;
            d02Var.d0 = 1;
            if (q60.u(L, d02Var) == x61Var) {
            }
        }
        return Boolean.valueOf(this.K);
    }

    public final void b1(long j, yv2 yv2Var) {
        tc5 tc5Var;
        boolean z;
        yv2Var.getClass();
        lz1 lz1Var = this.n0;
        if (lz1Var != null && lz1Var.a == j) {
            eb ebVar = this.h0;
            synchronized (ebVar.B) {
                try {
                    Object value = ((tp6) ebVar.R).getValue();
                    if (value instanceof tc5) {
                        tc5Var = (tc5) value;
                    } else {
                        tc5Var = null;
                    }
                    z = false;
                    if (tc5Var != null) {
                        if (tc5Var.a == j) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                lz1Var.b.b0(yv2Var);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, yt1] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final ep2 c0(kb5 kb5Var) {
        boolean z;
        ArrayList arrayList = kb5Var.e;
        URL url = kb5Var.c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gt0.A0(arrayList2, ((gb5) obj).f);
        }
        ArrayList arrayList3 = kb5Var.e;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            gt0.A0(arrayList4, ((gb5) obj2).g);
        }
        if (!arrayList4.isEmpty() && this.w.a) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = arrayList2.isEmpty();
        int i3 = 0;
        ?? r3 = yt1.A;
        if (isEmpty && !z) {
            return new ep2(dp2.ENABLED_NO_ACHIEVEMENTS, r3, r3, 0, kb5Var.d, url);
        }
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            if (!((eb5) obj3).b) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(ht0.v0(arrayList5, 10));
        int size4 = arrayList5.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList5.get(i5);
            i5++;
            o75 o75Var = ((eb5) obj4).a;
            arrayList6.add(new RASimpleAchievement(o75Var.a, o75Var.l));
        }
        if (z) {
            r3 = new ArrayList(ht0.v0(arrayList4, 10));
            int size5 = arrayList4.size();
            while (i3 < size5) {
                Object obj5 = arrayList4.get(i3);
                i3++;
                ta5 ta5Var = (ta5) obj5;
                r3.add(new RASimpleLeaderboard(ta5Var.a, ta5Var.d, ta5Var.e));
            }
        }
        return new ep2(dp2.ENABLED_FULL, arrayList6, r3, arrayList2.size(), kb5Var.d, url);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r3.a(r14, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r3.a(defpackage.ky1.a, r0) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (n0(r12, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c1(String str, String str2, int i, s41 s41Var) {
        q32 q32Var;
        Object obj;
        int i2;
        Object e;
        Object obj2;
        int i3;
        String str3;
        String str4;
        List list;
        if (s41Var instanceof q32) {
            q32Var = (q32) s41Var;
            int i4 = q32Var.f0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                q32Var.f0 = i4 - Integer.MIN_VALUE;
                Object obj3 = q32Var.d0;
                obj = x61.COROUTINE_SUSPENDED;
                i2 = q32Var.f0;
                of6 of6Var = this.T0;
                if (i2 == 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                if (i2 == 4) {
                                    oi2.Y(obj3);
                                    return Boolean.TRUE;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i3 = q32Var.Z;
                            obj2 = q32Var.Y;
                            str3 = q32Var.X;
                            oi2.Y(obj3);
                            boolean z = obj2 instanceof em5;
                            if (!z) {
                                if (z) {
                                    obj2 = null;
                                }
                                xk6 xk6Var = (xk6) obj2;
                                if (xk6Var != null) {
                                    list = xk6Var.b;
                                } else {
                                    list = null;
                                }
                                if (list == null) {
                                    list = yt1.A;
                                }
                                q32Var.R = null;
                                q32Var.X = null;
                                q32Var.Y = null;
                                q32Var.Z = i3;
                                q32Var.f0 = 4;
                            } else {
                                Throwable a2 = hm5.a(obj2);
                                if (a2 instanceof qi4) {
                                    this.J0.k(new f77(i3, new Long(0L)));
                                }
                                vr4 vr4Var = new vr4("pending", new Integer(i3));
                                vr4 vr4Var2 = new vr4("content_id", str3);
                                if (a2 != null) {
                                    str4 = a2.getClass().getSimpleName();
                                } else {
                                    str4 = "unknown";
                                }
                                H0("offline_sync_now_failed", vr4Var, vr4Var2, new vr4("error", str4));
                                return Boolean.FALSE;
                            }
                        } else {
                            i3 = q32Var.Z;
                            String str5 = q32Var.X;
                            oi2.Y(obj3);
                            str3 = str5;
                            obj2 = ((hm5) obj3).A;
                            q32Var.R = null;
                            q32Var.X = str3;
                            q32Var.Y = obj2;
                            q32Var.Z = i3;
                            q32Var.f0 = 3;
                        }
                    } else {
                        i = q32Var.Z;
                        str2 = q32Var.X;
                        str = q32Var.R;
                        oi2.Y(obj3);
                    }
                } else {
                    oi2.Y(obj3);
                    if (!this.o.a()) {
                        return Boolean.FALSE;
                    }
                    ry1 ry1Var = new ry1(i);
                    q32Var.R = str;
                    q32Var.X = str2;
                    q32Var.Z = i;
                    q32Var.f0 = 1;
                }
                q32Var.R = null;
                q32Var.X = str2;
                q32Var.Z = i;
                q32Var.f0 = 2;
                e = this.l.e(str, str2, q32Var);
                if (e != obj) {
                    String str6 = str2;
                    obj2 = e;
                    i3 = i;
                    str3 = str6;
                    q32Var.R = null;
                    q32Var.X = str3;
                    q32Var.Y = obj2;
                    q32Var.Z = i3;
                    q32Var.f0 = 3;
                }
                return obj;
            }
        }
        q32Var = new q32(this, s41Var);
        Object obj32 = q32Var.d0;
        obj = x61.COROUTINE_SUSPENDED;
        i2 = q32Var.f0;
        of6 of6Var2 = this.T0;
        if (i2 == 0) {
        }
        q32Var.R = null;
        q32Var.X = str2;
        q32Var.Z = i;
        q32Var.f0 = 2;
        e = this.l.e(str, str2, q32Var);
        if (e != obj) {
        }
        return obj;
    }

    @Override // defpackage.qo7
    public final void d() {
        j0();
        ap6 ap6Var = this.E;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        ap6 ap6Var2 = this.F;
        if (ap6Var2 != null) {
            ap6Var2.h(null);
        }
        this.F = null;
        yh2.m(this.z.B, null);
        g1("view_model_cleared");
        cn5 cn5Var = this.d;
        synchronized (cn5Var) {
            cn5Var.c = null;
        }
        jh jhVar = this.v;
        jhVar.g.dispose();
        EmulatorMessageQueue emulatorMessageQueue = jhVar.r;
        HandlerThread handlerThread = emulatorMessageQueue.b;
        Looper myLooper = Looper.myLooper();
        Handler handler = emulatorMessageQueue.c;
        if (nb3.k(myLooper, handler.getLooper())) {
            emulatorMessageQueue.e();
            handlerThread.quitSafely();
            return;
        }
        if (handlerThread.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new mf(22, emulatorMessageQueue, countDownLatch));
            countDownLatch.await(1L, TimeUnit.SECONDS);
        }
        handlerThread.quitSafely();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(pq5 pq5Var, s41 s41Var) {
        e02 e02Var;
        int i;
        ja5 ja5Var;
        dp2 dp2Var;
        URL url;
        if (s41Var instanceof e02) {
            e02Var = (e02) s41Var;
            int i2 = e02Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e02Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = e02Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = e02Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    this.L = null;
                    xe1 xe1Var = xk1.a;
                    de1 de1Var = de1.L;
                    f02 f02Var = new f02(this, pq5Var, null, 0);
                    e02Var.Y = 1;
                    obj = hv.d0(de1Var, f02Var, e02Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                ja5Var = (ja5) obj;
                Log.i("RAIdentity", "source=bootstrap stage=game_not_found runtime=disabled game_hash=redacted");
                dp2Var = dp2.DISABLED_GAME_NOT_FOUND;
                if (ja5Var == null) {
                    url = ja5Var.b;
                } else {
                    url = null;
                }
                dp2Var.getClass();
                if (dp2Var == dp2.ENABLED_FULL && dp2Var != dp2.ENABLED_NO_ACHIEVEMENTS) {
                    yt1 yt1Var = yt1.A;
                    return new ep2(dp2Var, yt1Var, yt1Var, 0, null, url);
                }
                i.h("Failed requirement.");
                return null;
            }
        }
        e02Var = new e02(this, s41Var);
        Object obj2 = e02Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e02Var.Y;
        if (i == 0) {
        }
        ja5Var = (ja5) obj2;
        Log.i("RAIdentity", "source=bootstrap stage=game_not_found runtime=disabled game_hash=redacted");
        dp2Var = dp2.DISABLED_GAME_NOT_FOUND;
        if (ja5Var == null) {
        }
        dp2Var.getClass();
        if (dp2Var == dp2.ENABLED_FULL) {
        }
        i.h("Failed requirement.");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cf, code lost:
        if (r0 == r3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d1(fd5 fd5Var, s41 s41Var) {
        r32 r32Var;
        Object obj;
        int i;
        lc5 lc5Var;
        fd5 fd5Var2;
        lc5 lc5Var2;
        ad5 ad5Var;
        nv4 nv4Var;
        lc5 lc5Var3;
        de5 de5Var;
        bv4 bv4Var;
        jf4 jf4Var;
        Object obj2;
        Object obj3;
        nv4 nv4Var2;
        fd5 fd5Var3;
        boolean a2;
        b bVar;
        boolean b2;
        String str;
        if (s41Var instanceof r32) {
            r32Var = (r32) s41Var;
            int i2 = r32Var.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r32Var.f0 = i2 - Integer.MIN_VALUE;
                obj = r32Var.d0;
                Object obj4 = x61.COROUTINE_SUSPENDED;
                i = r32Var.f0;
                sx1 sx1Var = this.w;
                jf4 jf4Var2 = this.o;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                nv4Var2 = r32Var.X;
                                fd5Var3 = r32Var.R;
                                try {
                                    oi2.Y(obj);
                                    obj2 = "remaining_leaderboards";
                                    jf4Var = jf4Var2;
                                } catch (CancellationException e) {
                                    e = e;
                                    obj3 = "remaining_leaderboards";
                                    jf4Var = jf4Var2;
                                    a2 = jf4Var.a();
                                    lc5 lc5Var4 = ((bv4) nv4Var2.i.A.getValue()).c;
                                    if (a2) {
                                    }
                                    this.G = bVar;
                                    sx1Var.e(!a2);
                                    tb5 qb5Var = new qb5(lc5Var4.a, a2);
                                    String name = fd5Var3.name();
                                    Locale locale = Locale.ROOT;
                                    String lowerCase = name.toLowerCase(locale);
                                    lowerCase.getClass();
                                    e1(qb5Var, "sync_" + lowerCase + "_cancelled");
                                    String lowerCase2 = fd5Var3.name().toLowerCase(locale);
                                    lowerCase2.getClass();
                                    G0("ra_sync_cancelled", new vr4("source", lowerCase2), new vr4("remaining_achievements", new Integer(lc5Var4.b)), new vr4(obj3, new Integer(lc5Var4.c)));
                                    throw e;
                                }
                                try {
                                    dd5 dd5Var = (dd5) obj;
                                    b2 = jf4Var.b();
                                    if (!b2) {
                                        this.G = b.ONLINE_LIVE;
                                        sx1Var.d = false;
                                        if (dd5Var.h.a == 0) {
                                            gd5 gd5Var = nv4Var2.a;
                                            this.m.b(gd5Var.a, gd5Var.c);
                                        }
                                    } else {
                                        this.G = b.OFFLINE_ACCUMULATING;
                                        sx1Var.e(true);
                                    }
                                    lc5 lc5Var5 = dd5Var.h;
                                    tb5 qb5Var2 = new qb5(lc5Var5.a, b2);
                                    String name2 = fd5Var3.name();
                                    Locale locale2 = Locale.ROOT;
                                    String lowerCase3 = name2.toLowerCase(locale2);
                                    lowerCase3.getClass();
                                    e1(qb5Var2, "sync_" + lowerCase3 + "_finished");
                                    String lowerCase4 = fd5Var3.name().toLowerCase(locale2);
                                    lowerCase4.getClass();
                                    vr4 vr4Var = new vr4("source", lowerCase4);
                                    vr4 vr4Var2 = new vr4("submitted_achievements", new Integer(dd5Var.c));
                                    vr4 vr4Var3 = new vr4("submitted_leaderboards", new Integer(dd5Var.d));
                                    vr4 vr4Var4 = new vr4("already_accepted", new Integer(dd5Var.e));
                                    vr4 vr4Var5 = new vr4("failed_achievements", new Integer(dd5Var.f));
                                    vr4 vr4Var6 = new vr4("failed_leaderboards", new Integer(dd5Var.g));
                                    vr4 vr4Var7 = new vr4("remaining_achievements", new Integer(lc5Var5.b));
                                    vr4 vr4Var8 = new vr4(obj2, new Integer(lc5Var5.c));
                                    vr4 vr4Var9 = new vr4("remaining_permanent", new Integer(lc5Var5.e));
                                    if (!b2 && lc5Var5.a == 0) {
                                        str = "reconciling_to_online_live";
                                    } else if (!b2) {
                                        str = "reconciling_to_pending_online";
                                    } else {
                                        str = "reconciling_to_pending_offline";
                                    }
                                    G0("ra_sync_completed", vr4Var, vr4Var2, vr4Var3, vr4Var4, vr4Var5, vr4Var6, vr4Var7, vr4Var8, vr4Var9, new vr4("transition", str));
                                    return dd5Var;
                                } catch (CancellationException e2) {
                                    e = e2;
                                    obj3 = obj2;
                                    a2 = jf4Var.a();
                                    lc5 lc5Var42 = ((bv4) nv4Var2.i.A.getValue()).c;
                                    if (a2) {
                                    }
                                    this.G = bVar;
                                    sx1Var.e(!a2);
                                    tb5 qb5Var3 = new qb5(lc5Var42.a, a2);
                                    String name3 = fd5Var3.name();
                                    Locale locale3 = Locale.ROOT;
                                    String lowerCase5 = name3.toLowerCase(locale3);
                                    lowerCase5.getClass();
                                    e1(qb5Var3, "sync_" + lowerCase5 + "_cancelled");
                                    String lowerCase22 = fd5Var3.name().toLowerCase(locale3);
                                    lowerCase22.getClass();
                                    G0("ra_sync_cancelled", new vr4("source", lowerCase22), new vr4("remaining_achievements", new Integer(lc5Var42.b)), new vr4(obj3, new Integer(lc5Var42.c)));
                                    throw e;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ad5Var = r32Var.Y;
                        nv4Var = r32Var.X;
                        fd5Var2 = r32Var.R;
                        oi2.Y(obj);
                        fd5 fd5Var4 = fd5Var2;
                        if (!((Boolean) obj).booleanValue()) {
                            lc5 lc5Var6 = ((bv4) nv4Var.i.A.getValue()).c;
                            return new dd5(fd5Var4, lc5Var6, 0, 0, 0, lc5Var6.b, lc5Var6.c, lc5Var6, true);
                        }
                        lc5 lc5Var7 = ((bv4) nv4Var.i.A.getValue()).c;
                        this.G = b.RECONCILING_RA_SUBMISSIONS;
                        tb5 rb5Var = new rb5(lc5Var7.a);
                        String name4 = fd5Var4.name();
                        Locale locale4 = Locale.ROOT;
                        String lowerCase6 = name4.toLowerCase(locale4);
                        lowerCase6.getClass();
                        jf4Var = jf4Var2;
                        e1(rb5Var, "sync_" + lowerCase6 + "_started");
                        String lowerCase7 = fd5Var4.name().toLowerCase(locale4);
                        lowerCase7.getClass();
                        obj2 = "remaining_leaderboards";
                        G0("ra_sync_requested", new vr4("source", lowerCase7), new vr4("pending_achievements", new Integer(lc5Var7.b)), new vr4("pending_leaderboards", new Integer(lc5Var7.c)), new vr4("submit_owner", "rc_client"));
                        try {
                            r32Var.R = fd5Var4;
                            r32Var.X = nv4Var;
                            r32Var.Y = null;
                            r32Var.Z = null;
                            r32Var.f0 = 3;
                            obj = ad5Var.b(fd5Var4, r32Var);
                            if (obj != obj4) {
                                nv4Var2 = nv4Var;
                                fd5Var3 = fd5Var4;
                                dd5 dd5Var2 = (dd5) obj;
                                b2 = jf4Var.b();
                                if (!b2) {
                                }
                                lc5 lc5Var52 = dd5Var2.h;
                                tb5 qb5Var22 = new qb5(lc5Var52.a, b2);
                                String name22 = fd5Var3.name();
                                Locale locale22 = Locale.ROOT;
                                String lowerCase32 = name22.toLowerCase(locale22);
                                lowerCase32.getClass();
                                e1(qb5Var22, "sync_" + lowerCase32 + "_finished");
                                String lowerCase42 = fd5Var3.name().toLowerCase(locale22);
                                lowerCase42.getClass();
                                vr4 vr4Var10 = new vr4("source", lowerCase42);
                                vr4 vr4Var22 = new vr4("submitted_achievements", new Integer(dd5Var2.c));
                                vr4 vr4Var32 = new vr4("submitted_leaderboards", new Integer(dd5Var2.d));
                                vr4 vr4Var42 = new vr4("already_accepted", new Integer(dd5Var2.e));
                                vr4 vr4Var52 = new vr4("failed_achievements", new Integer(dd5Var2.f));
                                vr4 vr4Var62 = new vr4("failed_leaderboards", new Integer(dd5Var2.g));
                                vr4 vr4Var72 = new vr4("remaining_achievements", new Integer(lc5Var52.b));
                                vr4 vr4Var82 = new vr4(obj2, new Integer(lc5Var52.c));
                                vr4 vr4Var92 = new vr4("remaining_permanent", new Integer(lc5Var52.e));
                                if (!b2) {
                                }
                                if (!b2) {
                                }
                                G0("ra_sync_completed", vr4Var10, vr4Var22, vr4Var32, vr4Var42, vr4Var52, vr4Var62, vr4Var72, vr4Var82, vr4Var92, new vr4("transition", str));
                                return dd5Var2;
                            }
                            return obj4;
                        } catch (CancellationException e3) {
                            e = e3;
                            obj3 = obj2;
                            nv4Var2 = nv4Var;
                            fd5Var3 = fd5Var4;
                            a2 = jf4Var.a();
                            lc5 lc5Var422 = ((bv4) nv4Var2.i.A.getValue()).c;
                            if (a2) {
                                bVar = b.ONLINE_LIVE;
                            } else {
                                bVar = b.OFFLINE_ACCUMULATING;
                            }
                            this.G = bVar;
                            sx1Var.e(!a2);
                            tb5 qb5Var32 = new qb5(lc5Var422.a, a2);
                            String name32 = fd5Var3.name();
                            Locale locale32 = Locale.ROOT;
                            String lowerCase52 = name32.toLowerCase(locale32);
                            lowerCase52.getClass();
                            e1(qb5Var32, "sync_" + lowerCase52 + "_cancelled");
                            String lowerCase222 = fd5Var3.name().toLowerCase(locale32);
                            lowerCase222.getClass();
                            G0("ra_sync_cancelled", new vr4("source", lowerCase222), new vr4("remaining_achievements", new Integer(lc5Var422.b)), new vr4(obj3, new Integer(lc5Var422.c)));
                            throw e;
                        }
                    }
                    lc5 lc5Var8 = r32Var.Z;
                    ad5 ad5Var2 = r32Var.Y;
                    nv4 nv4Var3 = r32Var.X;
                    fd5 fd5Var5 = r32Var.R;
                    oi2.Y(obj);
                    lc5Var3 = lc5Var8;
                    ad5Var = ad5Var2;
                    fd5Var2 = fd5Var5;
                    nv4Var = nv4Var3;
                } else {
                    oi2.Y(obj);
                    nv4 nv4Var4 = this.b0;
                    ad5 ad5Var3 = this.c0;
                    if (nv4Var4 != null && (de5Var = nv4Var4.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                        lc5Var = bv4Var.c;
                    } else {
                        lc5Var = lc5.f;
                    }
                    if (nv4Var4 != null && ad5Var3 != null) {
                        gd5 gd5Var2 = nv4Var4.a;
                        fd5Var2 = fd5Var;
                        r32Var.R = fd5Var2;
                        r32Var.X = nv4Var4;
                        r32Var.Y = ad5Var3;
                        r32Var.Z = lc5Var;
                        r32Var.f0 = 1;
                        Object N0 = N0(gd5Var2, r32Var);
                        if (N0 != obj4) {
                            lc5 lc5Var9 = lc5Var;
                            ad5Var = ad5Var3;
                            obj = N0;
                            nv4Var = nv4Var4;
                            lc5Var3 = lc5Var9;
                        }
                        return obj4;
                    }
                    fd5Var2 = fd5Var;
                    lc5Var2 = lc5Var;
                    return new dd5(fd5Var2, lc5Var2, 0, 0, 0, lc5Var2.b, lc5Var2.c, lc5Var2, true);
                }
                if (!((Boolean) obj).booleanValue() && jf4Var2.b()) {
                    r32Var.R = fd5Var2;
                    r32Var.X = nv4Var;
                    r32Var.Y = ad5Var;
                    r32Var.Z = null;
                    r32Var.f0 = 2;
                    obj = P0(r32Var);
                } else {
                    lc5Var2 = lc5Var3;
                    return new dd5(fd5Var2, lc5Var2, 0, 0, 0, lc5Var2.b, lc5Var2.c, lc5Var2, true);
                }
            }
        }
        r32Var = new r32(this, s41Var);
        obj = r32Var.d0;
        Object obj42 = x61.COROUTINE_SUSPENDED;
        i = r32Var.f0;
        sx1 sx1Var2 = this.w;
        jf4 jf4Var22 = this.o;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        lc5Var2 = lc5Var3;
        return new dd5(fd5Var2, lc5Var2, 0, 0, 0, lc5Var2.b, lc5Var2.c, lc5Var2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e0(pq5 pq5Var, s41 s41Var) {
        h02 h02Var;
        Object obj;
        int i;
        pq5 pq5Var2;
        hb5 hb5Var;
        String str;
        String str2;
        pq5 pq5Var3;
        String str3;
        String str4;
        vj4 vj4Var;
        Object l;
        vj4 vj4Var2;
        String str5;
        ja5 ja5Var;
        Object d0;
        Set set;
        List list;
        yt1 yt1Var;
        ep2 ep2Var;
        if (s41Var instanceof h02) {
            h02Var = (h02) s41Var;
            int i2 = h02Var.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h02Var.g0 = i2 - Integer.MIN_VALUE;
                h02 h02Var2 = h02Var;
                obj = h02Var2.e0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = h02Var2.g0;
                sx1 sx1Var = this.w;
                pn5 pn5Var = this.g;
                yt1 yt1Var2 = yt1.A;
                URL url = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    ja5Var = h02Var2.d0;
                                    vj4Var2 = h02Var2.Z;
                                    str3 = h02Var2.Y;
                                    str5 = h02Var2.X;
                                    try {
                                        oi2.Y(obj);
                                        set = (Set) obj;
                                    } catch (Exception unused) {
                                        set = du1.A;
                                        list = vj4Var2.c;
                                        List c0 = sb6.c0(new qd2(new pc2(gt0.B0(list), false, new ez1(set, 0)), new bz1(2), 2));
                                        if (!sx1Var.a) {
                                        }
                                        if (!list.isEmpty()) {
                                        }
                                        int size = list.size();
                                        String str6 = vj4Var2.e;
                                        if (ja5Var != null) {
                                        }
                                        ep2Var = new ep2(dp2.ENABLED_FULL, c0, yt1Var, size, str6, url);
                                        return new pz1(str5, str3, vj4Var2, ep2Var, false);
                                    }
                                    list = vj4Var2.c;
                                    List c02 = sb6.c0(new qd2(new pc2(gt0.B0(list), false, new ez1(set, 0)), new bz1(2), 2));
                                    if (!sx1Var.a) {
                                        List<yj4> list2 = vj4Var2.d;
                                        ArrayList arrayList = new ArrayList(ht0.v0(list2, 10));
                                        for (yj4 yj4Var : list2) {
                                            arrayList.add(new RASimpleLeaderboard(yj4Var.a, yj4Var.b, yj4Var.c));
                                        }
                                        yt1Var = arrayList;
                                    } else {
                                        yt1Var = yt1Var2;
                                    }
                                    if (!list.isEmpty() && yt1Var.isEmpty()) {
                                        String str7 = vj4Var2.e;
                                        if (ja5Var != null) {
                                            url = ja5Var.b;
                                        }
                                        ep2Var = new ep2(dp2.ENABLED_NO_ACHIEVEMENTS, yt1Var2, yt1Var2, 0, str7, url);
                                    } else {
                                        int size2 = list.size();
                                        String str62 = vj4Var2.e;
                                        if (ja5Var != null) {
                                            url = ja5Var.b;
                                        }
                                        ep2Var = new ep2(dp2.ENABLED_FULL, c02, yt1Var, size2, str62, url);
                                    }
                                    return new pz1(str5, str3, vj4Var2, ep2Var, false);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            vj4Var2 = h02Var2.Z;
                            str3 = h02Var2.Y;
                            str5 = h02Var2.X;
                            oi2.Y(obj);
                            ja5 ja5Var2 = (ja5) obj;
                            if (vj4Var2 != null) {
                                vj4 vj4Var3 = new vj4("", 0L, yt1Var2, yt1Var2, null, "", 0L);
                                dp2 dp2Var = dp2.DISABLED_LOAD_ERROR;
                                if (ja5Var2 != null) {
                                    url = ja5Var2.b;
                                }
                                URL url2 = url;
                                dp2Var.getClass();
                                if (dp2Var != dp2.ENABLED_FULL && dp2Var != dp2.ENABLED_NO_ACHIEVEMENTS) {
                                    return new pz1(str5, str3, vj4Var3, new ep2(dp2Var, yt1Var2, yt1Var2, 0, null, url2), true);
                                }
                                i.h("Failed requirement.");
                                return null;
                            }
                            boolean z = sx1Var.a;
                            try {
                                xe1 xe1Var = xk1.a;
                                de1 de1Var = de1.L;
                                pg1 pg1Var = new pg1(this, vj4Var2, z, (r41) null);
                                h02Var2.R = null;
                                h02Var2.X = str5;
                                h02Var2.Y = str3;
                                h02Var2.Z = vj4Var2;
                                h02Var2.d0 = ja5Var2;
                                h02Var2.g0 = 4;
                                d0 = hv.d0(de1Var, pg1Var, h02Var2);
                            } catch (Exception unused2) {
                                ja5Var = ja5Var2;
                                set = du1.A;
                                list = vj4Var2.c;
                                List c022 = sb6.c0(new qd2(new pc2(gt0.B0(list), false, new ez1(set, 0)), new bz1(2), 2));
                                if (!sx1Var.a) {
                                }
                                if (!list.isEmpty()) {
                                }
                                int size22 = list.size();
                                String str622 = vj4Var2.e;
                                if (ja5Var != null) {
                                }
                                ep2Var = new ep2(dp2.ENABLED_FULL, c022, yt1Var, size22, str622, url);
                                return new pz1(str5, str3, vj4Var2, ep2Var, false);
                            }
                            if (d0 != x61Var) {
                                ja5Var = ja5Var2;
                                obj = d0;
                                set = (Set) obj;
                                list = vj4Var2.c;
                                List c0222 = sb6.c0(new qd2(new pc2(gt0.B0(list), false, new ez1(set, 0)), new bz1(2), 2));
                                if (!sx1Var.a) {
                                }
                                if (!list.isEmpty()) {
                                }
                                int size222 = list.size();
                                String str6222 = vj4Var2.e;
                                if (ja5Var != null) {
                                }
                                ep2Var = new ep2(dp2.ENABLED_FULL, c0222, yt1Var, size222, str6222, url);
                                return new pz1(str5, str3, vj4Var2, ep2Var, false);
                            }
                            return x61Var;
                        }
                        str2 = h02Var2.Y;
                        str = h02Var2.X;
                        pq5Var3 = h02Var2.R;
                        try {
                            oi2.Y(obj);
                            vj4Var = (vj4) obj;
                            String str8 = str;
                            str3 = str2;
                            str4 = str8;
                        } catch (Exception unused3) {
                            String str9 = str;
                            str3 = str2;
                            str4 = str9;
                            vj4Var = null;
                            String str10 = pq5Var3.i;
                            h02Var2.R = null;
                            h02Var2.X = str4;
                            h02Var2.Y = str3;
                            h02Var2.Z = vj4Var;
                            h02Var2.g0 = 3;
                            l = ((pl) pn5Var).l(str10, h02Var2);
                            if (l != x61Var) {
                            }
                            return x61Var;
                        }
                        String str102 = pq5Var3.i;
                        h02Var2.R = null;
                        h02Var2.X = str4;
                        h02Var2.Y = str3;
                        h02Var2.Z = vj4Var;
                        h02Var2.g0 = 3;
                        l = ((pl) pn5Var).l(str102, h02Var2);
                        if (l != x61Var) {
                            String str11 = str4;
                            vj4Var2 = vj4Var;
                            obj = l;
                            str5 = str11;
                            ja5 ja5Var22 = (ja5) obj;
                            if (vj4Var2 != null) {
                            }
                        }
                        return x61Var;
                    }
                    pq5 pq5Var4 = h02Var2.R;
                    oi2.Y(obj);
                    pq5Var2 = pq5Var4;
                } else {
                    oi2.Y(obj);
                    if (((ng6) this.c).D()) {
                        h02Var2.R = pq5Var;
                        h02Var2.g0 = 1;
                        Object b2 = ((pl) pn5Var).c.b(h02Var2);
                        if (b2 != x61Var) {
                            pq5Var2 = pq5Var;
                            obj = b2;
                        }
                        return x61Var;
                    }
                    return null;
                }
                if (!(obj instanceof hb5)) {
                    hb5Var = (hb5) obj;
                } else {
                    hb5Var = null;
                }
                if (hb5Var != null) {
                    String str12 = hb5Var.a;
                    String str13 = pq5Var2.i;
                    try {
                        xe1 xe1Var2 = xk1.a;
                        de1 de1Var2 = de1.L;
                        i02 i02Var = new i02(this, str12, str13, null, 0);
                        h02Var2.R = pq5Var2;
                        h02Var2.X = str12;
                        h02Var2.Y = str13;
                        h02Var2.g0 = 2;
                        obj = hv.d0(de1Var2, i02Var, h02Var2);
                    } catch (Exception unused4) {
                        str = str12;
                        str2 = str13;
                        pq5Var3 = pq5Var2;
                        String str92 = str;
                        str3 = str2;
                        str4 = str92;
                        vj4Var = null;
                        String str1022 = pq5Var3.i;
                        h02Var2.R = null;
                        h02Var2.X = str4;
                        h02Var2.Y = str3;
                        h02Var2.Z = vj4Var;
                        h02Var2.g0 = 3;
                        l = ((pl) pn5Var).l(str1022, h02Var2);
                        if (l != x61Var) {
                        }
                        return x61Var;
                    }
                    if (obj != x61Var) {
                        str = str12;
                        str2 = str13;
                        pq5Var3 = pq5Var2;
                        vj4Var = (vj4) obj;
                        String str82 = str;
                        str3 = str2;
                        str4 = str82;
                        String str10222 = pq5Var3.i;
                        h02Var2.R = null;
                        h02Var2.X = str4;
                        h02Var2.Y = str3;
                        h02Var2.Z = vj4Var;
                        h02Var2.g0 = 3;
                        l = ((pl) pn5Var).l(str10222, h02Var2);
                        if (l != x61Var) {
                        }
                    }
                    return x61Var;
                }
                return null;
            }
        }
        h02Var = new h02(this, s41Var);
        h02 h02Var22 = h02Var;
        obj = h02Var22.e0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = h02Var22.g0;
        sx1 sx1Var2 = this.w;
        pn5 pn5Var2 = this.g;
        yt1 yt1Var22 = yt1.A;
        URL url3 = null;
        if (i == 0) {
        }
        if (!(obj instanceof hb5)) {
        }
        if (hb5Var != null) {
        }
        return null;
    }

    public final void e1(tb5 tb5Var, String str) {
        ub5 ub5Var;
        tp6 tp6Var = this.S0;
        ub5 ub5Var2 = (ub5) tp6Var.getValue();
        ub5Var2.getClass();
        if (tb5Var instanceof nb5) {
            int i = ((nb5) tb5Var).a;
            if (i >= 0) {
                if (i > 0) {
                    ub5Var = ub5.PENDING_RA_SUBMISSIONS;
                } else {
                    ub5Var = ub5.OFFLINE_ACCUMULATING;
                }
            } else {
                i.h("pending submission count must not be negative");
                return;
            }
        } else if (tb5Var instanceof ob5) {
            int i2 = ((ob5) tb5Var).a;
            if (i2 >= 0) {
                if (i2 > 0) {
                    ub5Var = ub5.PENDING_RA_SUBMISSIONS;
                } else {
                    ub5Var = ub5.ONLINE_LIVE;
                }
            } else {
                i.h("pending submission count must not be negative");
                return;
            }
        } else if (tb5Var instanceof pb5) {
            pb5 pb5Var = (pb5) tb5Var;
            int i3 = pb5Var.a;
            if (i3 >= 0) {
                if (ub5Var2 != ub5.RECONCILING_RA_SUBMISSIONS) {
                    if (i3 > 0) {
                        ub5Var = ub5.PENDING_RA_SUBMISSIONS;
                    } else if (pb5Var.b) {
                        ub5Var = ub5.ONLINE_LIVE;
                    } else {
                        ub5Var = ub5.OFFLINE_ACCUMULATING;
                    }
                }
                ub5Var = ub5Var2;
            } else {
                i.h("pending submission count must not be negative");
                return;
            }
        } else if (tb5Var instanceof rb5) {
            int i4 = ((rb5) tb5Var).a;
            if (i4 >= 0) {
                if (i4 > 0) {
                    ub5Var = ub5.RECONCILING_RA_SUBMISSIONS;
                }
                ub5Var = ub5Var2;
            } else {
                i.h("pending submission count must not be negative");
                return;
            }
        } else if (tb5Var instanceof qb5) {
            qb5 qb5Var = (qb5) tb5Var;
            int i5 = qb5Var.a;
            if (i5 >= 0) {
                if (i5 > 0) {
                    ub5Var = ub5.PENDING_RA_SUBMISSIONS;
                } else if (qb5Var.b) {
                    ub5Var = ub5.ONLINE_LIVE;
                } else {
                    ub5Var = ub5.OFFLINE_ACCUMULATING;
                }
            } else {
                i.h("pending submission count must not be negative");
                return;
            }
        } else if (tb5Var.equals(sb5.a)) {
            ub5Var = ub5.ONLINE_LIVE;
        } else {
            i.d();
            return;
        }
        if (ub5Var == ub5Var2) {
            return;
        }
        tp6Var.l(ub5Var);
        String name = ub5Var2.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        vr4 vr4Var = new vr4("from", lowerCase);
        String lowerCase2 = ub5Var.name().toLowerCase(locale);
        lowerCase2.getClass();
        G0("ra_hardcore_continuity_transition", vr4Var, new vr4("to", lowerCase2), new vr4("reason", str), new vr4("hardcore", Boolean.valueOf(this.w.a)));
    }

    public final cd5 f0() {
        yc5 yc5Var;
        boolean z;
        lc5 lc5Var;
        de5 de5Var;
        bv4 bv4Var;
        boolean z2 = this.p0.getValue() instanceof dy1;
        sx1 sx1Var = this.w;
        boolean a2 = sx1Var.a();
        boolean z3 = this.J;
        boolean z4 = sx1Var.a;
        int i = wz1.j[this.O.ordinal()];
        String str = null;
        boolean z5 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.d();
                        return null;
                    }
                } else {
                    yc5Var = yc5.LEGACY_KOTLIN;
                }
            }
            yc5Var = yc5.NONE;
        } else {
            yc5Var = yc5.RC_CLIENT;
        }
        if (this.O == c.RC_CLIENT_OFFLINE) {
            z = true;
        } else {
            z = false;
        }
        nv4 nv4Var = this.b0;
        if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
            lc5Var = bv4Var.c;
        } else {
            lc5Var = lc5.f;
        }
        int i2 = lc5Var.a;
        yc5Var.getClass();
        if (!z2 || !a2 || !z3 || !z4 || yc5Var != yc5.RC_CLIENT || z || i2 <= 0) {
            z5 = false;
        }
        if (z5) {
            str = this.b.getString(R.string.ra_pending_sync_menu_count, Integer.valueOf(i2));
            str.getClass();
        }
        return new cd5(str, i2, z5);
    }

    public final Object f1(r41 r41Var) {
        de5 de5Var;
        bv4 bv4Var;
        int i;
        de5 de5Var2;
        bv4 bv4Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
        jg7 jg7Var = jg7.a;
        if (rARuntimeBridgeConfig != null && rARuntimeBridgeConfig.getUsesProxyHost()) {
            Boolean bool = Boolean.FALSE;
            H0("network_transition_owned_by_raofflineproxy", new vr4("built_in_ledger", bool), new vr4("built_in_sync", bool));
            return jg7Var;
        }
        b bVar = this.G;
        b bVar2 = b.OFFLINE_ACCUMULATING;
        if (bVar != bVar2 && bVar != b.RECONCILING_RA_SUBMISSIONS) {
            String str = null;
            if (!this.I && !((ng6) this.c).D()) {
                vr4 vr4Var = new vr4("started_online", Boolean.valueOf(this.J));
                vr4 vr4Var2 = new vr4("game_id", this.L);
                pq5 pq5Var = this.n1;
                if (pq5Var != null) {
                    str = pq5Var.i;
                }
                H0("network_transition_offline_softcore_disabled", vr4Var, vr4Var2, new vr4("content_id", str));
                return jg7Var;
            }
            this.G = bVar2;
            this.w.e(true);
            int i2 = 0;
            if (this.I && this.J && this.O == c.RC_CLIENT) {
                nv4 nv4Var = this.b0;
                if (nv4Var != null && (de5Var2 = nv4Var.i) != null && (bv4Var2 = (bv4) de5Var2.A.getValue()) != null) {
                    i = bv4Var2.c.a;
                } else {
                    i = 0;
                }
                e1(new nb5(i), "network_lost");
            }
            vr4 vr4Var3 = new vr4("hardcore_eligible", Boolean.valueOf(this.I));
            vr4 vr4Var4 = new vr4("started_online", Boolean.valueOf(this.J));
            vr4 vr4Var5 = new vr4("game_id", this.L);
            pq5 pq5Var2 = this.n1;
            if (pq5Var2 != null) {
                str = pq5Var2.i;
            }
            H0("network_transition_offline", vr4Var3, vr4Var4, vr4Var5, new vr4("content_id", str));
            if (!this.I) {
                Object p0 = p0(gk4.SOFTCORE, ik4.OFFLINE_AFTER_START, r41Var);
                if (p0 == x61.COROUTINE_SUSPENDED) {
                    return p0;
                }
            } else {
                nv4 nv4Var2 = this.b0;
                if (nv4Var2 != null && (de5Var = nv4Var2.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
                    i2 = bv4Var.c.a;
                }
                if (i2 > 0) {
                    this.J0.k(new w67(i2));
                }
            }
        }
        return jg7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g0(String str, boolean z, s41 s41Var) {
        k02 k02Var;
        int i;
        nv4 nv4Var;
        int i2;
        String str2;
        nv4 nv4Var2;
        if (s41Var instanceof k02) {
            k02Var = (k02) s41Var;
            int i3 = k02Var.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                k02Var.e0 = i3 - Integer.MIN_VALUE;
                Object obj = k02Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = k02Var.e0;
                if (i == 0) {
                    if (i == 1) {
                        z = k02Var.Y;
                        nv4Var2 = k02Var.X;
                        str2 = k02Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    nv4 j0 = j0();
                    if (j0 != null) {
                        k02Var.R = str;
                        k02Var.X = j0;
                        k02Var.Y = z;
                        k02Var.e0 = 1;
                        Object d2 = j0.d(k02Var);
                        if (d2 == x61Var) {
                            return x61Var;
                        }
                        str2 = str;
                        nv4Var2 = j0;
                        obj = d2;
                    } else {
                        nv4Var = j0;
                        i2 = 0;
                        if (nv4Var != null && z) {
                            gd5 gd5Var = nv4Var.a;
                            this.m.b(gd5Var.a, gd5Var.c);
                        }
                        if (nv4Var != null) {
                            G0("ra_pending_session_cleared", new vr4("reason", str), new vr4("discarded", new Integer(i2)), new vr4("accepted", Boolean.FALSE));
                        }
                        return jg7.a;
                    }
                }
                i2 = ((Number) obj).intValue();
                String str3 = str2;
                nv4Var = nv4Var2;
                str = str3;
                if (nv4Var != null) {
                    gd5 gd5Var2 = nv4Var.a;
                    this.m.b(gd5Var2.a, gd5Var2.c);
                }
                if (nv4Var != null) {
                }
                return jg7.a;
            }
        }
        k02Var = new k02(this, s41Var);
        Object obj2 = k02Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = k02Var.e0;
        if (i == 0) {
        }
        i2 = ((Number) obj2).intValue();
        String str32 = str2;
        nv4Var = nv4Var2;
        str = str32;
        if (nv4Var != null) {
        }
        if (nv4Var != null) {
        }
        return jg7.a;
    }

    public final void g1(String str) {
        String str2;
        synchronized (this.P) {
            str2 = this.Q;
        }
        if (str2 == null) {
            return;
        }
        h1(str2, str, new c5(17));
    }

    public final void h0(long j, String str) {
        String str2;
        if (this.O == c.RC_CLIENT) {
            str2 = "rc_client_http";
        } else {
            str2 = "kotlin_api";
        }
        Long l = (Long) this.X.remove(Long.valueOf(j));
        if (l == null) {
            H0("runtime_submit_orphan", new vr4("entity_type", "achievement"), new vr4("entity_id", Long.valueOf(j)), new vr4("result", str), new vr4("submit_path", str2));
            return;
        }
        vr4 vr4Var = new vr4("entity_type", "achievement");
        vr4 vr4Var2 = new vr4("entity_id", Long.valueOf(j));
        vr4 vr4Var3 = new vr4("result", str);
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        H0("runtime_submit_resolved", vr4Var, vr4Var2, vr4Var3, new vr4("latency_ms", Long.valueOf(currentTimeMillis)), new vr4("submit_path", str2));
    }

    public final boolean h1(String str, String str2, on2 on2Var) {
        String str3;
        boolean z;
        boolean n;
        boolean z2;
        Y0(str, str2);
        synchronized (this.P) {
            str3 = null;
            if (!nb3.k(this.Q, str)) {
                z2 = false;
                n = false;
                z = false;
                th = null;
            } else {
                try {
                    jh jhVar = this.v;
                    jhVar.p = false;
                    jhVar.q.k();
                    MelonEmulator.a.unloadRetroAchievementsData();
                    z = true;
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                if (z) {
                    try {
                        on2Var.c();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    pl plVar = (pl) this.g;
                    plVar.getClass();
                    str.getClass();
                    n = plVar.h.n(str);
                    if (n) {
                        this.Q = null;
                        if (nb3.k(this.R, str)) {
                            this.R = null;
                        }
                    }
                } else {
                    n = false;
                }
                z2 = true;
            }
        }
        if (!z2) {
            G0("ra_runtime_identity_teardown_ignored", new vr4("reason", str2));
            return false;
        } else if (!z) {
            vr4 vr4Var = new vr4("reason", str2);
            if (th != null) {
                str3 = th.getClass().getSimpleName();
            }
            G0("ra_runtime_identity_teardown_failed", vr4Var, new vr4("error", str3), new vr4("lease_retained", Boolean.TRUE));
            return false;
        } else if (!n) {
            G0("ra_runtime_identity_teardown_failed", new vr4("reason", str2), new vr4("error", "LeaseReleaseRejected"), new vr4("lease_retained", Boolean.TRUE));
            return false;
        } else {
            vr4 vr4Var2 = new vr4("reason", str2);
            vr4 vr4Var3 = new vr4("released", Boolean.valueOf(n));
            if (th != null) {
                str3 = th.getClass().getSimpleName();
            }
            G0("ra_runtime_identity_lease_released", vr4Var2, vr4Var3, new vr4("teardown_error", str3));
            return true;
        }
    }

    public final void i0(long j, String str) {
        Long l = (Long) this.Y.remove(Long.valueOf(j));
        if (l == null) {
            H0("runtime_submit_orphan", new vr4("entity_type", "leaderboard"), new vr4("entity_id", Long.valueOf(j)), new vr4("result", str), new vr4("submit_path", "kotlin_api"));
            return;
        }
        vr4 vr4Var = new vr4("entity_type", "leaderboard");
        vr4 vr4Var2 = new vr4("entity_id", Long.valueOf(j));
        vr4 vr4Var3 = new vr4("result", str);
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        H0("runtime_submit_resolved", vr4Var, vr4Var2, vr4Var3, new vr4("latency_ms", Long.valueOf(currentTimeMillis)), new vr4("submit_path", "kotlin_api"));
    }

    public final void i1(pq5 pq5Var) {
        tp6 tp6Var;
        Object value;
        Object obj;
        this.n1 = pq5Var;
        tp6 tp6Var2 = this.v0;
        tp6Var2.getClass();
        tp6Var2.m(null, pq5Var);
        do {
            tp6Var = this.p0;
            value = tp6Var.getValue();
            obj = (hy1) value;
            if (obj instanceof dy1) {
                obj = new dy1(pq5Var);
            }
        } while (!tp6Var.j(value, obj));
    }

    public final nv4 j0() {
        ap6 ap6Var = this.d0;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.d0 = null;
        v80 v80Var = this.e0;
        if (v80Var != null) {
            v80Var.i(null);
        }
        this.e0 = null;
        q33 q33Var = this.f0;
        synchronized (q33Var) {
            q33Var.A = false;
        }
        ad5 ad5Var = this.c0;
        if (ad5Var != null) {
            synchronized (ad5Var.d) {
                if (!ad5Var.g) {
                    ad5Var.g = true;
                    tu0 tu0Var = ad5Var.e;
                    ap6 ap6Var2 = ad5Var.f;
                    ad5Var.e = null;
                    ad5Var.f = null;
                    CancellationException cancellationException = new CancellationException("Pending submission coordinator closed");
                    if (tu0Var != null) {
                        tu0Var.s(cancellationException);
                    }
                    if (ap6Var2 != null) {
                        ap6Var2.h(cancellationException);
                    }
                }
            }
        }
        this.c0 = null;
        nv4 nv4Var = this.b0;
        this.b0 = null;
        this.Q0.l(null);
        this.i0.l(null);
        q33 q33Var2 = this.g0;
        synchronized (q33Var2) {
            q33Var2.A = false;
        }
        return nv4Var;
    }

    public final void j1(qn2 qn2Var) {
        dy1 dy1Var;
        pq5 pq5Var;
        Object value = this.p0.getValue();
        if (value instanceof dy1) {
            dy1Var = (dy1) value;
        } else {
            dy1Var = null;
        }
        if (dy1Var != null && (pq5Var = dy1Var.a) != null) {
            pq5 a2 = pq5.a(pq5Var, null, null, (jt5) qn2Var.g(pq5Var.f), null, false, null, 0L, false, null, 8159);
            ((xb2) this.e).B(pq5Var, a2.f);
            i1(a2);
            hv.L(this.z, null, null, new f02(this, a2, null, 4), 3);
        }
    }

    public final void k0(String str) {
        nv4 j0 = j0();
        ap6 ap6Var = this.E;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        ap6 ap6Var2 = this.F;
        if (ap6Var2 != null) {
            ap6Var2.h(null);
        }
        this.F = null;
        this.Z.c();
        this.a0.k();
        this.F0.k(ba5.a);
        g1(str);
        this.N = null;
        this.O = c.DISABLED;
        this.w.d = false;
        this.W.clear();
        this.X.clear();
        this.Y.clear();
        if (j0 != null) {
            hv.L(to7.a(this), null, null, new b0(j0, this, str, (r41) null, 27), 3);
        }
    }

    public final Object l0(s41 s41Var) {
        String str;
        synchronized (this.P) {
            str = this.R;
        }
        if (str == null) {
            return new Integer(0);
        }
        return this.o0.d(str, s41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m0(s41 s41Var) {
        q02 q02Var;
        int i;
        String str;
        if (s41Var instanceof q02) {
            q02Var = (q02) s41Var;
            int i2 = q02Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q02Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = q02Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = q02Var.Y;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            return obj;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    synchronized (this.P) {
                        str = this.R;
                    }
                    iw2 iw2Var = this.o0;
                    if (str == null) {
                        q02Var.Y = 1;
                        obj = iw2Var.f(q02Var);
                    } else {
                        q02Var.Y = 2;
                        Object e = iw2Var.e(str, q02Var);
                        if (e != x61Var) {
                            return e;
                        }
                    }
                    return x61Var;
                }
                return new aw2(0, ((Number) obj).intValue());
            }
        }
        q02Var = new q02(this, s41Var);
        Object obj2 = q02Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = q02Var.Y;
        if (i == 0) {
        }
        return new aw2(0, ((Number) obj2).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008d -> B:24:0x008f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(List list, s41 s41Var) {
        s02 s02Var;
        int i;
        List list2;
        List list3;
        Iterator it;
        int i2;
        int i3;
        jg7 jg7Var;
        char c2;
        b77 b77Var;
        if (s41Var instanceof s02) {
            s02Var = (s02) s41Var;
            int i4 = s02Var.h0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                s02Var.h0 = i4 - Integer.MIN_VALUE;
                Object obj = s02Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = s02Var.h0;
                of6 of6Var = this.J0;
                jg7 jg7Var2 = jg7.a;
                Object obj2 = null;
                if (i == 0) {
                    if (i == 1) {
                        i2 = s02Var.e0;
                        i3 = s02Var.d0;
                        zk6 zk6Var = s02Var.Z;
                        it = s02Var.Y;
                        list3 = s02Var.X;
                        List list4 = s02Var.R;
                        oi2.Y(obj);
                        Object obj3 = ((hm5) obj).A;
                        Object obj4 = null;
                        if (obj3 instanceof em5) {
                            obj3 = obj4;
                        }
                        o75 o75Var = (o75) obj3;
                        if (o75Var != null || (r1 = o75Var.a()) == null) {
                            jg7Var = jg7Var2;
                            String h = lb1.h(zk6Var.a, "#");
                        } else {
                            jg7Var = jg7Var2;
                        }
                        int i5 = wz1.b[zk6Var.b.ordinal()];
                        if (i5 != 1) {
                            if (i5 != 2) {
                                c2 = 3;
                                if (i5 != 3) {
                                    if (i5 == 4) {
                                        b77Var = b77.SERVER_REJECTED;
                                    } else {
                                        i.d();
                                        return obj4;
                                    }
                                } else {
                                    b77Var = b77.NOT_IN_PREFETCH_CACHE;
                                }
                            } else {
                                c2 = 3;
                                b77Var = b77.DEFINITION_CHANGED;
                            }
                        } else {
                            c2 = 3;
                            b77Var = b77.MISSING_FROM_CURRENT_SET;
                        }
                        of6Var.k(new a77(h, b77Var, zk6Var.c));
                        list2 = list4;
                        jg7Var2 = jg7Var;
                        obj2 = obj4;
                        if (it.hasNext()) {
                            zk6Var = (zk6) it.next();
                            long j = zk6Var.a;
                            s02Var.R = list2;
                            s02Var.X = list3;
                            s02Var.Y = it;
                            s02Var.Z = zk6Var;
                            s02Var.d0 = i3;
                            s02Var.e0 = i2;
                            s02Var.h0 = 1;
                            obj4 = obj2;
                            Object h2 = ((pl) this.g).h(j, s02Var);
                            if (h2 == x61Var) {
                                return x61Var;
                            }
                            list4 = list2;
                            obj3 = h2;
                            if (obj3 instanceof em5) {
                            }
                            o75 o75Var2 = (o75) obj3;
                            if (o75Var2 != null) {
                            }
                            jg7Var = jg7Var2;
                            String h3 = lb1.h(zk6Var.a, "#");
                            int i52 = wz1.b[zk6Var.b.ordinal()];
                            if (i52 != 1) {
                            }
                            of6Var.k(new a77(h3, b77Var, zk6Var.c));
                            list2 = list4;
                            jg7Var2 = jg7Var;
                            obj2 = obj4;
                            if (it.hasNext()) {
                                jg7 jg7Var3 = jg7Var2;
                                int size = list2.size() - list3.size();
                                if (size > 0) {
                                    of6Var.k(new d77(size));
                                    return jg7Var3;
                                }
                                return jg7Var3;
                            }
                        }
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (list.isEmpty()) {
                        return jg7Var2;
                    }
                    list2 = list;
                    List e1 = gt0.e1(list2, 3);
                    list3 = e1;
                    it = e1.iterator();
                    i2 = 0;
                    i3 = 3;
                    if (it.hasNext()) {
                    }
                }
            }
        }
        s02Var = new s02(this, s41Var);
        Object obj5 = s02Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = s02Var.h0;
        of6 of6Var2 = this.J0;
        jg7 jg7Var22 = jg7.a;
        Object obj22 = null;
        if (i == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
        if (r1 == r3) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o0(long j, s41 s41Var) {
        x02 x02Var;
        Object obj;
        int i;
        long j2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig;
        RARuntimeBridgeConfig rARuntimeBridgeConfig2;
        long j3;
        RARuntimeBridgeConfig rARuntimeBridgeConfig3;
        long j4;
        ta5 ta5Var;
        String gameHash;
        Long gameId;
        if (s41Var instanceof x02) {
            x02Var = (x02) s41Var;
            int i2 = x02Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x02Var.d0 = i2 - Integer.MIN_VALUE;
                obj = x02Var.Y;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = x02Var.d0;
                String str = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                j4 = x02Var.R;
                                rARuntimeBridgeConfig3 = x02Var.X;
                                oi2.Y(obj);
                                ta5Var = (ta5) obj;
                                if (ta5Var != null) {
                                    B0("leaderboard", j4, "missing_leaderboard", new vr4[0]);
                                    return Boolean.FALSE;
                                }
                                long j5 = j4;
                                RARuntimeBridgeConfig rARuntimeBridgeConfig4 = rARuntimeBridgeConfig3;
                                long j6 = ta5Var.b;
                                pq5 pq5Var = this.n1;
                                if (pq5Var != null) {
                                    str = pq5Var.i;
                                }
                                if (str != null && !qs6.v0(str) && (gameHash = rARuntimeBridgeConfig4.getGameHash()) != null && !qs6.v0(gameHash) && str.equals(rARuntimeBridgeConfig4.getGameHash())) {
                                    Long l = this.L;
                                    if (l == null) {
                                        l = rARuntimeBridgeConfig4.getGameId();
                                    }
                                    if (l != null && l.longValue() == j6 && (rARuntimeBridgeConfig4.getGameId() == null || ((gameId = rARuntimeBridgeConfig4.getGameId()) != null && gameId.longValue() == j6))) {
                                        boolean hardcoreEnabled = rARuntimeBridgeConfig4.getHardcoreEnabled();
                                        sx1 sx1Var = this.w;
                                        if (hardcoreEnabled != sx1Var.a) {
                                            B0("leaderboard", j5, "hardcore_mismatch", new vr4("runtime_hardcore", Boolean.valueOf(rARuntimeBridgeConfig4.getHardcoreEnabled())), new vr4("session_hardcore", Boolean.valueOf(sx1Var.a)));
                                            return Boolean.FALSE;
                                        }
                                        return Boolean.TRUE;
                                    }
                                    B0("leaderboard", j5, "game_id_mismatch", new vr4("leaderboard_game_id", new Long(j6)), new vr4("runtime_game_id", rARuntimeBridgeConfig4.getGameId()), new vr4("current_game_id", this.L));
                                    return Boolean.FALSE;
                                }
                                B0("leaderboard", j5, "game_hash_mismatch", new vr4("runtime_game_hash", rARuntimeBridgeConfig4.getGameHash()), new vr4("current_game_hash", str), new vr4("leaderboard_game_id", new Long(j6)));
                                return Boolean.FALSE;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = x02Var.R;
                        rARuntimeBridgeConfig2 = x02Var.X;
                        oi2.Y(obj);
                        if (((Boolean) obj).booleanValue()) {
                            B0("leaderboard", j3, "runtime_authentication_mismatch", new vr4[0]);
                            return Boolean.FALSE;
                        }
                        x02Var.X = rARuntimeBridgeConfig2;
                        x02Var.R = j3;
                        x02Var.d0 = 3;
                        obj = ((pl) this.g).n(j3, x02Var);
                        if (obj != obj2) {
                            rARuntimeBridgeConfig3 = rARuntimeBridgeConfig2;
                            j4 = j3;
                            ta5Var = (ta5) obj;
                            if (ta5Var != null) {
                            }
                        }
                        return obj2;
                    }
                    j2 = x02Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    if (this.G != b.ONLINE_LIVE) {
                        B0("leaderboard", j, "network_mode_offline", new vr4[0]);
                        return Boolean.FALSE;
                    }
                    j2 = j;
                    x02Var.R = j2;
                    x02Var.d0 = 1;
                    obj = b0(30000L, x02Var);
                }
                if (!((Boolean) obj).booleanValue()) {
                    H0("runtime_session_not_started_proceeding", new vr4("entity_type", "leaderboard"), new vr4("leaderboard_id", new Long(j2)));
                }
                rARuntimeBridgeConfig = this.N;
                if (rARuntimeBridgeConfig != null) {
                    B0("leaderboard", j2, "missing_runtime_config", new vr4[0]);
                    return Boolean.FALSE;
                }
                x02Var.X = rARuntimeBridgeConfig;
                x02Var.R = j2;
                x02Var.d0 = 2;
                Object W = W(rARuntimeBridgeConfig, x02Var);
                if (W != obj2) {
                    rARuntimeBridgeConfig2 = rARuntimeBridgeConfig;
                    obj = W;
                    j3 = j2;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return obj2;
            }
        }
        x02Var = new x02(this, s41Var);
        obj = x02Var.Y;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = x02Var.d0;
        String str2 = null;
        if (i == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        rARuntimeBridgeConfig = this.N;
        if (rARuntimeBridgeConfig != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (r3 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p0(gk4 gk4Var, ik4 ik4Var, r41 r41Var) {
        y02 y02Var;
        int i;
        ik4 ik4Var2;
        Object b2;
        jb5 jb5Var;
        pq5 pq5Var;
        Long l;
        gk4 gk4Var2;
        pq5 pq5Var2;
        ik4 ik4Var3;
        gk4 gk4Var3;
        ik4 ik4Var4;
        long longValue;
        qz1 qz1Var;
        pz1 pz1Var;
        Long l2;
        gk4 gk4Var4 = gk4Var;
        if (r41Var instanceof y02) {
            y02Var = (y02) r41Var;
            int i2 = y02Var.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y02Var.g0 = i2 - Integer.MIN_VALUE;
                y02 y02Var2 = y02Var;
                Object obj = y02Var2.e0;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i = y02Var2.g0;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qz1Var = y02Var2.d0;
                                oi2.Y(obj);
                                if (!(((hm5) obj).A instanceof em5)) {
                                    this.M = qz1Var;
                                    return qz1Var;
                                }
                                return null;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pq5Var2 = y02Var2.Z;
                        jb5Var = y02Var2.Y;
                        ik4Var3 = y02Var2.X;
                        gk4Var2 = y02Var2.R;
                        oi2.Y(obj);
                        pz1Var = (pz1) obj;
                        if (pz1Var != null || !pz1Var.e) {
                            if (pz1Var == null) {
                                l2 = new Long(pz1Var.c.b);
                            } else {
                                l2 = null;
                            }
                            if (l2 != null) {
                                ik4Var4 = ik4Var3;
                                gk4Var3 = gk4Var2;
                                longValue = l2.longValue();
                                pq5Var = pq5Var2;
                                long currentTimeMillis = System.currentTimeMillis();
                                String uuid = UUID.randomUUID().toString();
                                uuid.getClass();
                                qz1 qz1Var2 = new qz1(jb5Var.a(), pq5Var.i, longValue, gk4Var3, ik4Var4, uuid, currentTimeMillis);
                                xe1 xe1Var = xk1.a;
                                de1 de1Var = de1.L;
                                o31 o31Var = new o31(this, qz1Var2, currentTimeMillis, gk4Var3, ik4Var4, null);
                                y02Var2.R = null;
                                y02Var2.X = null;
                                y02Var2.Y = null;
                                y02Var2.Z = null;
                                y02Var2.d0 = qz1Var2;
                                y02Var2.g0 = 3;
                                obj = hv.d0(de1Var, o31Var, y02Var2);
                                if (obj != obj2) {
                                    qz1Var = qz1Var2;
                                    if (!(((hm5) obj).A instanceof em5)) {
                                    }
                                }
                                return obj2;
                            }
                        }
                        return null;
                    }
                    ik4 ik4Var5 = y02Var2.X;
                    gk4 gk4Var5 = y02Var2.R;
                    oi2.Y(obj);
                    ik4Var2 = ik4Var5;
                    gk4Var4 = gk4Var5;
                    b2 = obj;
                } else {
                    oi2.Y(obj);
                    if (gk4Var4 != gk4.SOFTCORE || ((ng6) this.c).D()) {
                        qz1 qz1Var3 = this.M;
                        if (qz1Var3 != null) {
                            return qz1Var3;
                        }
                        y02Var2.R = gk4Var4;
                        ik4Var2 = ik4Var;
                        y02Var2.X = ik4Var2;
                        y02Var2.g0 = 1;
                        b2 = ((pl) this.g).c.b(y02Var2);
                    }
                    return null;
                }
                jb5Var = (jb5) b2;
                if (jb5Var != null && (pq5Var = this.n1) != null) {
                    l = this.L;
                    if (l == null) {
                        gk4Var3 = gk4Var4;
                        ik4Var4 = ik4Var2;
                        longValue = l.longValue();
                        long currentTimeMillis2 = System.currentTimeMillis();
                        String uuid2 = UUID.randomUUID().toString();
                        uuid2.getClass();
                        qz1 qz1Var22 = new qz1(jb5Var.a(), pq5Var.i, longValue, gk4Var3, ik4Var4, uuid2, currentTimeMillis2);
                        xe1 xe1Var2 = xk1.a;
                        de1 de1Var2 = de1.L;
                        o31 o31Var2 = new o31(this, qz1Var22, currentTimeMillis2, gk4Var3, ik4Var4, null);
                        y02Var2.R = null;
                        y02Var2.X = null;
                        y02Var2.Y = null;
                        y02Var2.Z = null;
                        y02Var2.d0 = qz1Var22;
                        y02Var2.g0 = 3;
                        obj = hv.d0(de1Var2, o31Var2, y02Var2);
                        if (obj != obj2) {
                        }
                        return obj2;
                    }
                    y02Var2.R = gk4Var4;
                    y02Var2.X = ik4Var2;
                    y02Var2.Y = jb5Var;
                    y02Var2.Z = pq5Var;
                    y02Var2.g0 = 2;
                    Object e0 = e0(pq5Var, y02Var2);
                    if (e0 != obj2) {
                        gk4Var2 = gk4Var4;
                        pq5Var2 = pq5Var;
                        ik4Var3 = ik4Var2;
                        obj = e0;
                        pz1Var = (pz1) obj;
                        if (pz1Var != null) {
                        }
                        if (pz1Var == null) {
                        }
                        if (l2 != null) {
                        }
                    }
                    return obj2;
                }
                return null;
            }
        }
        y02Var = new y02(this, r41Var);
        y02 y02Var22 = y02Var;
        Object obj3 = y02Var22.e0;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i = y02Var22.g0;
        if (i == 0) {
        }
        jb5Var = (jb5) b2;
        if (jb5Var != null) {
            l = this.L;
            if (l == null) {
            }
        }
        return null;
    }

    public final void q0(boolean z) {
        int i;
        de5 de5Var;
        bv4 bv4Var;
        nv4 nv4Var = this.b0;
        if (nv4Var != null && (de5Var = nv4Var.i) != null && (bv4Var = (bv4) de5Var.A.getValue()) != null) {
            i = bv4Var.c.a;
        } else {
            i = 0;
        }
        if (i > 0) {
            Q0(mc5.RESUMABLE_SESSION);
            return;
        }
        if (!z) {
            ci0 ci0Var = this.x;
            if (!((Collection) ((tp6) ci0Var.g).getValue()).isEmpty()) {
                this.T0.k(ty1.a);
                ((v80) ci0Var.h).c(jg7.a);
                return;
            }
        }
        Q0(mc5.RESUMABLE_SESSION);
    }

    public final void r0() {
        qz1 qz1Var = this.M;
        if (qz1Var == null) {
            return;
        }
        this.M = null;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - qz1Var.g;
        long j2 = 0;
        if (j >= 0) {
            j2 = j;
        }
        hv.L(to7.a(this), null, null, new z02(this, qz1Var, currentTimeMillis, j2, null, 1), 3);
    }

    public final mk2 s0() {
        Object em5Var;
        ng6 ng6Var = (ng6) this.c;
        ng6Var.getClass();
        Enum r0 = mk2.HIDDEN;
        SharedPreferences sharedPreferences = ng6Var.b;
        String lowerCase = r0.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = sharedPreferences.getString("fps_counter_position", lowerCase);
        if (string != null) {
            try {
                em5Var = jw2.o(string, mk2.values());
            } catch (Throwable th) {
                em5Var = new em5(th);
            }
            if (hm5.a(em5Var) != null) {
                lb1.w("Invalid enum preference fps_counter_position=", string, "; using ", r0.name(), "SPSettingsRepository");
            }
            Enum r02 = r0;
            if (!(em5Var instanceof em5)) {
                r02 = em5Var;
            }
            r0 = r02;
        }
        return (mk2) r0;
    }

    public final Object t0(pq5 pq5Var, s41 s41Var) {
        xe1 xe1Var = xk1.a;
        return hv.d0(de1.L, new g12(this, pq5Var, null, 0), s41Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (m0(r4) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r1.a(r15, r4) != r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
        if (r1.a(r14, r4) != r5) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u0(o75 o75Var, hb5 hb5Var, s41 s41Var) {
        i12 i12Var;
        Object c2;
        o75 o75Var2;
        Object obj;
        String str;
        String str2;
        Object a2;
        o75 o75Var3;
        boolean z;
        jg7 jg7Var = jg7.a;
        of6 of6Var = this.F0;
        jf4 jf4Var = this.o;
        if (s41Var instanceof i12) {
            i12Var = (i12) s41Var;
            int i = i12Var.e0;
            if ((i & Integer.MIN_VALUE) != 0) {
                i12Var.e0 = i - Integer.MIN_VALUE;
                Object obj2 = i12Var.Z;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                switch (i12Var.e0) {
                    case 0:
                        oi2.Y(obj2);
                        if (jf4Var.a()) {
                            i12Var.R = o75Var;
                            i12Var.X = hb5Var;
                            i12Var.e0 = 1;
                            break;
                        }
                        H0("hardcore_award_attempt", new vr4("achievement_id", new Long(o75Var.a)), new vr4("game_id", this.L), new vr4("online", Boolean.valueOf(jf4Var.a())));
                        pn5 pn5Var = this.g;
                        i12Var.R = o75Var;
                        i12Var.X = hb5Var;
                        i12Var.e0 = 2;
                        c2 = ((pl) pn5Var).c(o75Var, true, hb5Var, i12Var);
                        if (c2 != obj3) {
                            o75Var2 = o75Var;
                            obj = c2;
                            q95 q95Var = new q95(o75Var2);
                            i12Var.R = o75Var2;
                            i12Var.X = hb5Var;
                            i12Var.Y = obj;
                            i12Var.e0 = 3;
                            break;
                        }
                        return obj3;
                    case 1:
                        hb5Var = i12Var.X;
                        o75Var = i12Var.R;
                        oi2.Y(obj2);
                        H0("hardcore_award_attempt", new vr4("achievement_id", new Long(o75Var.a)), new vr4("game_id", this.L), new vr4("online", Boolean.valueOf(jf4Var.a())));
                        pn5 pn5Var2 = this.g;
                        i12Var.R = o75Var;
                        i12Var.X = hb5Var;
                        i12Var.e0 = 2;
                        c2 = ((pl) pn5Var2).c(o75Var, true, hb5Var, i12Var);
                        if (c2 != obj3) {
                        }
                        return obj3;
                    case 2:
                        hb5 hb5Var2 = i12Var.X;
                        o75 o75Var4 = i12Var.R;
                        oi2.Y(obj2);
                        c2 = ((hm5) obj2).A;
                        o75Var2 = o75Var4;
                        hb5Var = hb5Var2;
                        obj = c2;
                        q95 q95Var2 = new q95(o75Var2);
                        i12Var.R = o75Var2;
                        i12Var.X = hb5Var;
                        i12Var.Y = obj;
                        i12Var.e0 = 3;
                        break;
                    case 3:
                        obj = i12Var.Y;
                        hb5Var = i12Var.X;
                        o75Var2 = i12Var.R;
                        oi2.Y(obj2);
                        boolean z2 = obj instanceof em5;
                        if (!z2) {
                            vr4 vr4Var = new vr4("achievement_id", new Long(o75Var2.a));
                            if (z2) {
                                obj = null;
                            }
                            o85 o85Var = (o85) obj;
                            if (o85Var != null) {
                                z = o85Var.a;
                            } else {
                                z = false;
                            }
                            H0("hardcore_award_success", vr4Var, new vr4("awarded", Boolean.valueOf(z)));
                            h0(o75Var2.a, "submit_success");
                            i12Var.R = null;
                            i12Var.X = null;
                            i12Var.Y = null;
                            i12Var.e0 = 4;
                            if (m0(i12Var) != obj3) {
                                return jg7Var;
                            }
                        } else {
                            vr4 vr4Var2 = new vr4("achievement_id", new Long(o75Var2.a));
                            Throwable a3 = hm5.a(obj);
                            if (a3 != null) {
                                str = a3.getClass().getSimpleName();
                            } else {
                                str = "unknown";
                            }
                            H0("hardcore_award_failed", vr4Var2, new vr4("error", str));
                            i12Var.R = o75Var2;
                            i12Var.X = null;
                            i12Var.Y = null;
                            i12Var.e0 = 5;
                            synchronized (this.P) {
                                str2 = this.R;
                            }
                            if (str2 == null) {
                                a2 = Boolean.FALSE;
                            } else {
                                a2 = this.o0.a(str2, o75Var2, hb5Var, i12Var);
                            }
                            if (a2 != obj3) {
                                o75Var3 = o75Var2;
                                p95 p95Var = new p95(o75Var3);
                                i12Var.R = o75Var3;
                                i12Var.X = null;
                                i12Var.Y = null;
                                i12Var.e0 = 6;
                                break;
                            }
                        }
                        return obj3;
                    case 4:
                        oi2.Y(obj2);
                        return jg7Var;
                    case 5:
                        o75Var3 = i12Var.R;
                        oi2.Y(obj2);
                        p95 p95Var2 = new p95(o75Var3);
                        i12Var.R = o75Var3;
                        i12Var.X = null;
                        i12Var.Y = null;
                        i12Var.e0 = 6;
                        break;
                    case 6:
                        o75Var3 = i12Var.R;
                        oi2.Y(obj2);
                        h0(o75Var3.a, "submit_failed_queued");
                        return jg7Var;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        i12Var = new i12(this, s41Var);
        Object obj22 = i12Var.Z;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        switch (i12Var.e0) {
        }
    }

    public final boolean v0() {
        nv4 nv4Var;
        RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
        if (rARuntimeBridgeConfig != null && (nv4Var = this.b0) != null && this.O == c.RC_CLIENT && rARuntimeBridgeConfig.getRuntimeMode() == RARuntimeBridgeMode.RC_CLIENT_ONLINE && rARuntimeBridgeConfig.getHardcoreEnabled() && this.w.a && this.J && !((bv4) nv4Var.i.A.getValue()).d && O0(nv4Var.a)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object w0(pq5 pq5Var, s41 s41Var) {
        w12 w12Var;
        Object obj;
        int i;
        Boolean bool;
        boolean z;
        if (s41Var instanceof w12) {
            w12Var = (w12) s41Var;
            int i2 = w12Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w12Var.Z = i2 - Integer.MIN_VALUE;
                obj = w12Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = w12Var.Z;
                boolean z2 = true;
                if (i == 0) {
                    if (i == 1) {
                        pq5Var = w12Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    w12Var.R = pq5Var;
                    w12Var.Z = 1;
                    obj = ((pl) this.g).s(w12Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                if (((Boolean) obj).booleanValue() && ((ng6) this.c).b.getBoolean("ra_enabled", true)) {
                    bool = pq5Var.f.o;
                    if (bool == null) {
                        z = bool.booleanValue();
                    } else {
                        z = true;
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            }
        }
        w12Var = new w12(this, s41Var);
        obj = w12Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = w12Var.Z;
        boolean z22 = true;
        if (i == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
            bool = pq5Var.f.o;
            if (bool == null) {
            }
        }
        z22 = false;
        return Boolean.valueOf(z22);
    }

    public final void x0(yh2 yh2Var) {
        if (yh2Var instanceof cj3) {
            hv.L(to7.a(this), null, null, new g12(this, ((cj3) yh2Var).d, null, 2), 3);
        } else if (yh2Var instanceof ej3) {
            hv.L(to7.a(this), null, null, new m5(this, ((ej3) yh2Var).d, (r41) null, 11), 3);
        } else if (yh2Var instanceof dj3) {
            hv.L(to7.a(this), null, null, new m5(this, ((dj3) yh2Var).d, (r41) null, 12), 3);
        } else if (yh2Var instanceof bj3) {
            fy1 fy1Var = new fy1(((bj3) yh2Var).d);
            tp6 tp6Var = this.p0;
            tp6Var.getClass();
            tp6Var.m(null, fy1Var);
        } else {
            i.d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z0(long j, s41 s41Var) {
        b22 b22Var;
        int i;
        ta5 ta5Var;
        ta5 ta5Var2;
        u75 u75Var;
        if (s41Var instanceof b22) {
            b22Var = (b22) s41Var;
            int i2 = b22Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b22Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = b22Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = b22Var.d0;
                pn5 pn5Var = this.g;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            ta5Var2 = b22Var.X;
                            oi2.Y(obj);
                            u75Var = (u75) obj;
                            if (u75Var != null) {
                                return new oz1(ta5Var2, u75Var.e);
                            }
                            return null;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = b22Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    b22Var.R = j;
                    b22Var.d0 = 1;
                    obj = ((pl) pn5Var).n(j, b22Var);
                }
                ta5Var = (ta5) obj;
                if (ta5Var != null) {
                    long j2 = ta5Var.c;
                    b22Var.X = ta5Var;
                    b22Var.R = j;
                    b22Var.d0 = 2;
                    Object i3 = ((pl) pn5Var).i(j2, b22Var);
                    if (i3 != x61Var) {
                        obj = i3;
                        ta5Var2 = ta5Var;
                        u75Var = (u75) obj;
                        if (u75Var != null) {
                        }
                    }
                    return x61Var;
                }
                return null;
            }
        }
        b22Var = new b22(this, s41Var);
        Object obj2 = b22Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = b22Var.d0;
        pn5 pn5Var2 = this.g;
        if (i == 0) {
        }
        ta5Var = (ta5) obj2;
        if (ta5Var != null) {
        }
        return null;
    }
}
