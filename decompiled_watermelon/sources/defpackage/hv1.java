package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import java.io.File;
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
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeMode;
import me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement;
import me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.ui.emulator.rewind.model.RewindSaveState;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hv1  reason: default package */
/* loaded from: classes.dex */
public final class hv1 extends ra7 {
    public final long A;
    public final q45 A0;
    public final c46 B;
    public final ee6 B0;
    public final o45 C;
    public final q45 C0;
    public final ee6 D;
    public final c46 D0;
    public kd6 E;
    public final o45 E0;
    public kd6 F;
    public final c46 F0;
    public b G;
    public final o45 G0;
    public d H;
    public final ee6 H0;
    public boolean I;
    public final q45 I0;
    public boolean J;
    public final c46 J0;
    public boolean K;
    public final o45 K0;
    public Long L;
    public final il6 L0;
    public fv1 M;
    public final String M0;
    public RARuntimeBridgeConfig N;
    public final c46 N0;
    public c O;
    public final o45 O0;
    public final Object P;
    public final a7 P0;
    public String Q;
    public final ee6 Q0;
    public String R;
    public final q45 R0;
    public gs0 S;
    public final ee6 S0;
    public boolean T;
    public final c46 T0;
    public boolean U;
    public final o45 U0;
    public final dz4 V;
    public final ee6 V0;
    public final LinkedHashSet W;
    public final q45 W0;
    public final LinkedHashMap X;
    public final ee6 X0;
    public final LinkedHashMap Y;
    public final q45 Y0;
    public final jl3 Z;
    public final ee6 Z0;
    public final ac1 a0;
    public final q45 a1;
    public final Context b;
    public jm4 b0;
    public final ee6 b1;
    public final w16 c;
    public q35 c0;
    public final q45 c1;
    public final id5 d;
    public kd6 d0;
    public final ee6 d1;
    public final vp5 e;
    public q60 e0;
    public final q45 e1;
    public final xm0 f;
    public final mx2 f0;
    public final ee6 f1;
    public final ud5 g;
    public final mx2 g0;
    public final q45 g1;
    public final b74 h;
    public final q9 h0;
    public final ee6 h1;
    public final ra4 i;
    public final ee6 i0;
    public final q45 i1;
    public final fb4 j;
    public final AtomicInteger j0;
    public final ee6 j1;
    public final md5 k;
    public final b34 k0;
    public final q45 k1;
    public final g96 l;
    public final AtomicBoolean l0;
    public final ee6 l1;
    public final wp2 m;
    public gs0 m0;
    public final q45 m1;
    public final h64 n;
    public av1 n0;
    public rg5 n1;
    public final u64 o;
    public final hq2 o0;
    public Long o1;
    public final ap p;
    public final ee6 p0;
    public final k43 q;
    public final q45 q0;
    public final z33 r;
    public final ee6 r0;
    public final e72 s;
    public final o45 s0;
    public final qv5 t;
    public final ee6 t0;
    public final tf0 u;
    public final q45 u0;
    public final rs1 v;
    public final ee6 v0;
    public final ht1 w;
    public final q45 w0;
    public final tf0 x;
    public final ee6 x0;
    public final q26 y;
    public final q45 y0;
    public final g11 z;
    public final ee6 z0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hv1$a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CACHE = new a("CACHE", 0);
        public static final a NETWORK = new a("NETWORK", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CACHE, NETWORK};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
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
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hv1$b */
    /* loaded from: classes.dex */
    public static final class b {
        private static final /* synthetic */ e12 $ENTRIES;
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
            $ENTRIES = l.C($values);
        }

        private b(String str, int i) {
        }

        public static e12 getEntries() {
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
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hv1$c */
    /* loaded from: classes.dex */
    public static final class c {
        private static final /* synthetic */ e12 $ENTRIES;
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
            $ENTRIES = l.C($values);
        }

        private c(String str, int i, String str2) {
            this.traceValue = str2;
        }

        public static e12 getEntries() {
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
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hv1$d */
    /* loaded from: classes.dex */
    public static final class d {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d SOFTCORE = new d("SOFTCORE", 0);
        public static final d HARDCORE = new d("HARDCORE", 1);

        private static final /* synthetic */ d[] $values() {
            return new d[]{SOFTCORE, HARDCORE};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private d(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Type inference failed for: r8v13, types: [mx2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [mx2, java.lang.Object] */
    public hv1(Context context, w16 w16Var, id5 id5Var, vp5 vp5Var, xm0 xm0Var, ud5 ud5Var, b74 b74Var, ra4 ra4Var, fb4 fb4Var, md5 md5Var, g96 g96Var, wp2 wp2Var, h64 h64Var, u64 u64Var, ap apVar, k43 k43Var, z33 z33Var, e72 e72Var, qv5 qv5Var, tf0 tf0Var, rs1 rs1Var, ht1 ht1Var, tf0 tf0Var2, q26 q26Var, pt5 pt5Var) {
        Uri uri;
        w16Var.getClass();
        id5Var.getClass();
        vp5Var.getClass();
        xm0Var.getClass();
        ud5Var.getClass();
        ra4Var.getClass();
        fb4Var.getClass();
        md5Var.getClass();
        g96Var.getClass();
        wp2Var.getClass();
        h64Var.getClass();
        u64Var.getClass();
        apVar.getClass();
        k43Var.getClass();
        z33Var.getClass();
        e72Var.getClass();
        qv5Var.getClass();
        rs1Var.getClass();
        ht1Var.getClass();
        q26Var.getClass();
        pt5Var.getClass();
        this.b = context;
        this.c = w16Var;
        this.d = id5Var;
        this.e = vp5Var;
        this.f = xm0Var;
        this.g = ud5Var;
        this.h = b74Var;
        this.i = ra4Var;
        this.j = fb4Var;
        this.k = md5Var;
        this.l = g96Var;
        this.m = wp2Var;
        this.n = h64Var;
        this.o = u64Var;
        this.p = apVar;
        this.q = k43Var;
        this.r = z33Var;
        this.s = e72Var;
        this.t = qv5Var;
        this.u = tf0Var;
        this.v = rs1Var;
        this.w = ht1Var;
        this.x = tf0Var2;
        this.y = q26Var;
        g11 g11Var = new g11();
        g11Var.B = mp1.A;
        this.z = g11Var;
        this.A = 60000L;
        ln2 ln2Var = null;
        c46 b2 = d46.b(0, 1, null, 5);
        this.B = b2;
        this.C = new o45(b2);
        this.D = fe6.a(Boolean.FALSE);
        this.G = b.ONLINE_LIVE;
        this.H = d.SOFTCORE;
        this.O = c.DISABLED;
        this.P = new Object();
        this.V = new dz4(1);
        this.W = new LinkedHashSet();
        this.X = new LinkedHashMap();
        this.Y = new LinkedHashMap();
        this.Z = new jl3();
        this.a0 = new ac1(1);
        this.f0 = new Object();
        this.g0 = new Object();
        q9 q9Var = new q9(17);
        this.h0 = q9Var;
        this.i0 = fe6.a(null);
        this.j0 = new AtomicInteger(0);
        this.k0 = new b34();
        this.l0 = new AtomicBoolean(false);
        this.o0 = new hq2(new dx1(this, (j11) null, 0), new ex1(0, null, this));
        ee6 a2 = fe6.a(tt1.a);
        this.p0 = a2;
        this.q0 = new q45(a2);
        this.r0 = fe6.a(null);
        this.s0 = se.U((gb2) tf0Var.c0, ua7.a(this), q56.b, 0);
        ee6 a3 = fe6.a(null);
        this.t0 = a3;
        this.u0 = new q45(a3);
        ee6 a4 = fe6.a(null);
        this.v0 = a4;
        b56 b56Var = (b56) w16Var;
        il6 il6Var = b56Var.g;
        this.w0 = se.V(new gb2((ee6) il6Var.getValue(), a4, new bw1(3, 0, null)), ua7.a(this), q56.a, (m11) ((ee6) il6Var.getValue()).getValue());
        ee6 a5 = fe6.a(null);
        this.x0 = a5;
        this.y0 = new q45(a5);
        bs5 bs5Var = bs5.c;
        ee6 a6 = fe6.a(bs5Var);
        this.z0 = a6;
        this.A0 = new q45(a6);
        ee6 a7 = fe6.a(bs5Var);
        this.B0 = a7;
        this.C0 = new q45(a7);
        c46 b3 = d46.b(0, 100, h60.DROP_OLDEST, 1);
        this.D0 = b3;
        this.E0 = new o45(b3);
        c46 b4 = d46.b(0, 100, h60.SUSPEND, 1);
        this.F0 = b4;
        this.G0 = new o45(b4);
        ee6 a8 = fe6.a(null);
        this.H0 = a8;
        this.I0 = new q45(a8);
        c46 f = ln2.f();
        this.J0 = f;
        this.K0 = new o45(f);
        this.L0 = new il6(new su1(this, 0));
        this.M0 = "melonDualDS-android/0.7.0";
        c46 f2 = ln2.f();
        this.N0 = f2;
        this.O0 = new o45(f2);
        this.P0 = new a7((ee6) tf0Var2.Z, 13);
        this.Q0 = fe6.a(null);
        this.R0 = (q45) q9Var.X;
        this.S0 = fe6.a(k25.ONLINE_LIVE);
        c46 f3 = ln2.f();
        this.T0 = f3;
        this.U0 = new o45(f3);
        SharedPreferences sharedPreferences = b56Var.b;
        ee6 a9 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("external_display_keep_ratio", true)));
        this.V0 = a9;
        this.W0 = new q45(a9);
        ee6 a10 = fe6.a(b56Var.i());
        this.X0 = a10;
        this.Y0 = new q45(a10);
        ee6 a11 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_integer_scale", false)));
        this.Z0 = a11;
        this.a1 = new q45(a11);
        ee6 a12 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_internal_fill_height", false)));
        this.b1 = a12;
        this.c1 = new q45(a12);
        ee6 a13 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_internal_fill_width", false)));
        this.d1 = a13;
        this.e1 = new q45(a13);
        ee6 a14 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_external_fill_height", false)));
        this.f1 = a14;
        this.g1 = new q45(a14);
        ee6 a15 = fe6.a(Boolean.valueOf(sharedPreferences.getBoolean("dual_screen_external_fill_width", false)));
        this.h1 = a15;
        this.i1 = new q45(a15);
        ee6 a16 = fe6.a(b56Var.h());
        this.j1 = a16;
        this.k1 = new q45(a16);
        ee6 a17 = fe6.a(b56Var.g());
        this.l1 = a17;
        this.m1 = new q45(a17);
        tq5.w(ua7.a(this), null, null, new wu1(2, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(3, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(4, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(5, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(6, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(7, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(8, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(9, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(10, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(0, null, this), 3);
        tq5.w(ua7.a(this), null, null, new wu1(1, null, this), 3);
        if (b53.x(pt5Var.a("boot_firmware_only"), Boolean.TRUE)) {
            Integer num = (Integer) pt5Var.a("boot_firmware_console");
            if (num != null) {
                ln2Var = new jc3((ConsoleType) ((f12) ConsoleType.getEntries()).get(num.intValue()));
            }
        } else {
            bp5 bp5Var = (bp5) pt5Var.a("rom");
            if (bp5Var != null) {
                ln2Var = new kc3(bp5Var.A);
            } else {
                Object a18 = pt5Var.a("uri");
                if (a18 instanceof String) {
                    uri = Uri.parse((String) a18);
                } else {
                    uri = a18 instanceof Uri ? (Uri) a18 : null;
                }
                if (uri != null) {
                    ln2Var = new mc3(uri);
                } else {
                    String str = (String) pt5Var.a("PATH");
                    if (str != null) {
                        ln2Var = new lc3(str);
                    }
                }
            }
        }
        if (ln2Var != null) {
            z0(ln2Var);
        } else {
            f3.p(yt1.a);
        }
    }

    public static cv1 A0(b05 b05Var) {
        if (b05Var instanceof oz4) {
            oz4 oz4Var = (oz4) b05Var;
            return new cv1(oz4Var.a, oz4Var.b, oz4Var.c);
        } else if (b05Var instanceof qz4) {
            qz4 qz4Var = (qz4) b05Var;
            return new cv1(qz4Var.a, qz4Var.b, qz4Var.c);
        } else if (b05Var instanceof pz4) {
            pz4 pz4Var = (pz4) b05Var;
            return new cv1(pz4Var.a, pz4Var.b, pz4Var.c);
        } else if (b05Var instanceof sz4) {
            sz4 sz4Var = (sz4) b05Var;
            return new cv1(sz4Var.a, sz4Var.b, sz4Var.c);
        } else if (b05Var instanceof tz4) {
            tz4 tz4Var = (tz4) b05Var;
            return new cv1(tz4Var.a, tz4Var.b, tz4Var.c);
        } else if (b05Var instanceof mz4) {
            mz4 mz4Var = (mz4) b05Var;
            return new cv1(mz4Var.a, mz4Var.b, mz4Var.c);
        } else if (b05Var instanceof uz4) {
            uz4 uz4Var = (uz4) b05Var;
            return new cv1(uz4Var.a, uz4Var.b, uz4Var.c);
        } else {
            return null;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object D(defpackage.hv1 r21, java.lang.String r22, java.lang.String r23, defpackage.c35 r24, defpackage.k11 r25) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.D(hv1, java.lang.String, java.lang.String, c35, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
        if (r1.w0(r0, r57, r13) == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
        if (r5 == r15) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
        if (r14.b(r1, r13) == r15) goto L76;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object E(defpackage.hv1 r53, long r54, defpackage.dy4 r56, defpackage.x15 r57, defpackage.k11 r58) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.E(hv1, long, dy4, x15, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9 == r4) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Enum F(defpackage.hv1 r17, defpackage.c35 r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.F(hv1, c35, k11):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
        if (r11 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object G(defpackage.hv1 r10, defpackage.k11 r11) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.G(hv1, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object H(defpackage.hv1 r18, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r19, defpackage.rg5 r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.H(hv1, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig, rg5, k11):java.lang.Object");
    }

    public static /* synthetic */ void H0(hv1 hv1Var, String str, c cVar, ak2 ak2Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, int i) {
        if ((i & 8) != 0) {
            rARuntimeBridgeConfig = hv1Var.N;
        }
        hv1Var.G0(str, cVar, ak2Var, rARuntimeBridgeConfig, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I(defpackage.hv1 r5, defpackage.wt1 r6, defpackage.k11 r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof defpackage.lx1
            if (r0 == 0) goto L16
            r0 = r7
            lx1 r0 = (defpackage.lx1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            lx1 r0 = new lx1
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2d
            defpackage.me2.a0(r7)
            goto L5a
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.me2.a0(r7)
            return r7
        L38:
            defpackage.me2.a0(r7)
            boolean r7 = r6 instanceof defpackage.st1
            if (r7 == 0) goto L4d
            st1 r6 = (defpackage.st1) r6
            rg5 r6 = r6.a
            r0.Y = r4
            java.lang.Object r5 = r5.y0(r6, r0)
            if (r5 != r1) goto L4c
            goto L59
        L4c:
            return r5
        L4d:
            ud5 r6 = r5.g
            r0.Y = r3
            dl r6 = (defpackage.dl) r6
            java.lang.Object r7 = r6.s(r0)
            if (r7 != r1) goto L5a
        L59:
            return r1
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            if (r6 == 0) goto L71
            w16 r5 = r5.c
            b56 r5 = (defpackage.b56) r5
            android.content.SharedPreferences r5 = r5.b
            java.lang.String r6 = "ra_enabled"
            boolean r5 = r5.getBoolean(r6, r4)
            if (r5 == 0) goto L71
            goto L72
        L71:
            r4 = 0
        L72:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.I(hv1, wt1, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J(defpackage.hv1 r5, java.util.UUID r6, me.magnum.melonds.domain.model.layout.BackgroundMode r7, defpackage.k11 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.ox1
            if (r0 == 0) goto L13
            r0 = r8
            ox1 r0 = (defpackage.ox1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ox1 r0 = new ox1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            me.magnum.melonds.domain.model.layout.BackgroundMode r7 = r0.R
            defpackage.me2.a0(r8)
            goto L48
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r8)
            if (r6 != 0) goto L3b
            bs5 r5 = new bs5
            r5.<init>(r3, r7)
            return r5
        L3b:
            z33 r5 = r5.r
            r0.R = r7
            r0.Z = r4
            java.lang.Object r8 = r5.c(r6, r0)
            if (r8 != r1) goto L48
            return r1
        L48:
            vy r8 = (defpackage.vy) r8
            bs5 r5 = new bs5
            r5.<init>(r8, r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.J(hv1, java.util.UUID, me.magnum.melonds.domain.model.layout.BackgroundMode, k11):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|7|8|9))|93|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016f, code lost:
        r2 = new defpackage.kc5(r0);
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [hv1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v26, types: [ft5] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v5, types: [ft5] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K(defpackage.hv1 r17, defpackage.rg5 r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.K(hv1, rg5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (r13 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L(defpackage.hv1 r11, defpackage.rg5 r12, defpackage.k11 r13) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.L(hv1, rg5, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M(defpackage.hv1 r31, defpackage.vz4 r32, defpackage.j11 r33) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.M(hv1, vz4, j11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N(defpackage.hv1 r19, defpackage.xz4 r20, defpackage.j11 r21) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.N(hv1, xz4, j11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0383, code lost:
        if (r8 > r3.c) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x021d, code lost:
        if (r5 == defpackage.zk3.PENDING) goto L239;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object O(defpackage.hv1 r34, defpackage.b05 r35, defpackage.j11 r36) {
        /*
            Method dump skipped, instructions count: 2120
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.O(hv1, b05, j11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Q(defpackage.hv1 r25, defpackage.dy4 r26, defpackage.k11 r27) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.Q(hv1, dy4, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable R(defpackage.hv1 r8, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r9, defpackage.jm4 r10, defpackage.k11 r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.R(hv1, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig, jm4, k11):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object T(defpackage.hv1 r4, defpackage.rg5 r5, defpackage.k11 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ky1
            if (r0 == 0) goto L13
            r0 = r6
            ky1 r0 = (defpackage.ky1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ky1 r0 = new ky1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            rg5 r5 = r0.R
            defpackage.me2.a0(r6)
            goto L44
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r6)
            vp5 r4 = r4.e
            android.net.Uri r6 = r5.d
            r0.R = r5
            r0.Z = r3
            d72 r4 = (defpackage.d72) r4
            java.lang.Object r6 = r4.j(r6, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            rg5 r6 = (defpackage.rg5) r6
            if (r6 != 0) goto L49
            return r5
        L49:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.T(hv1, rg5, k11):java.lang.Object");
    }

    public static final void U(hv1 hv1Var, String str, String str2) {
        Boolean bool;
        String str3;
        hv1Var.a1(str, str2);
        synchronized (hv1Var.P) {
            try {
                bool = null;
                if (b53.x(hv1Var.Q, str)) {
                    dl dlVar = (dl) hv1Var.g;
                    dlVar.getClass();
                    str.getClass();
                    boolean n = dlVar.h.n(str);
                    if (n) {
                        hv1Var.Q = null;
                        if (b53.x(hv1Var.R, str)) {
                            hv1Var.R = null;
                        }
                    }
                    bool = Boolean.valueOf(n);
                }
            } finally {
            }
        }
        if (bool == null) {
            hv1Var.I0("ra_runtime_identity_lease_release_ignored", new ti4("reason", str2));
            return;
        }
        if (bool.booleanValue()) {
            str3 = "ra_runtime_identity_lease_released";
        } else {
            str3 = "ra_runtime_identity_lease_release_failed";
        }
        hv1Var.I0(str3, new ti4("reason", str2), new ti4("released", bool), new ti4("lease_retained", Boolean.valueOf(!bool.booleanValue())));
    }

    public static final void W(hv1 hv1Var, wt1 wt1Var) {
        id5 id5Var = hv1Var.d;
        synchronized (id5Var) {
            id5Var.c = null;
        }
        kd6 kd6Var = hv1Var.E;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        kd6 kd6Var2 = hv1Var.F;
        if (kd6Var2 != null) {
            kd6Var2.i(null);
        }
        hv1Var.F = null;
        hv1Var.u0();
        hv1Var.i1("session_reset");
        jm4 m0 = hv1Var.m0();
        if (m0 != null) {
            tq5.w(ua7.a(hv1Var), null, null, new a6(m0, null, 18), 3);
        }
        g11 g11Var = hv1Var.z;
        ln2.t(g11Var.B, null);
        mi6 c2 = hi2.c();
        bb1 bb1Var = tg1.a;
        g11Var.B = se.O(c2, bt3.a.Y);
        hv1Var.Z.c();
        hv1Var.a0.k();
        ht1 ht1Var = hv1Var.w;
        ht1Var.b = false;
        ht1Var.a = false;
        ht1Var.c = false;
        ht1Var.d = false;
        ht1Var.e = null;
        hv1Var.H0.k(null);
        ee6 ee6Var = hv1Var.p0;
        ee6Var.getClass();
        ee6Var.l(null, wt1Var);
        ee6 ee6Var2 = hv1Var.z0;
        bs5 bs5Var = bs5.c;
        ee6Var2.k(bs5Var);
        hv1Var.B0.k(bs5Var);
        hv1Var.r0.k(null);
        hv1Var.n1 = null;
        hv1Var.o1 = null;
        hv1Var.v0.k(null);
        hv1Var.L = null;
        gs0 gs0Var = hv1Var.m0;
        if (gs0Var != null) {
            gs0Var.i(null);
        }
        hv1Var.m0 = null;
        av1 av1Var = hv1Var.n0;
        if (av1Var != null) {
            av1Var.b.i(null);
        }
        hv1Var.n0 = null;
        q9 q9Var = hv1Var.h0;
        synchronized (q9Var.B) {
            ee6 ee6Var3 = (ee6) q9Var.R;
            k35 k35Var = k35.a;
            ee6Var3.getClass();
            ee6Var3.l(null, k35Var);
        }
        hv1Var.G = b.ONLINE_LIVE;
        hv1Var.H = d.SOFTCORE;
        hv1Var.g1(i25.a, "session_reset");
        hv1Var.I = false;
        hv1Var.J = false;
        hv1Var.K = false;
        hv1Var.N = null;
        hv1Var.O = c.DISABLED;
        hv1Var.T = false;
        hv1Var.U = false;
        ((AtomicBoolean) hv1Var.V.A).set(false);
        hv1Var.W.clear();
        hv1Var.X.clear();
        hv1Var.Y.clear();
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object X(defpackage.hv1 r26, long r27, boolean r29, defpackage.k11 r30) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.X(hv1, long, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d1, code lost:
        if (r17.h1(r6) == r7) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0199, code lost:
        if (r17.b0(r6) == r7) goto L29;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(defpackage.hv1 r17, defpackage.nz4 r18, defpackage.tl3 r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.Y(hv1, nz4, tl3, k11):java.lang.Object");
    }

    public static x15 Y0(RARuntimeBridgeConfig rARuntimeBridgeConfig) {
        String username;
        String apiToken;
        if (rARuntimeBridgeConfig == null || (username = rARuntimeBridgeConfig.getUsername()) == null) {
            return null;
        }
        if (zg6.B0(username)) {
            username = null;
        }
        if (username == null || (apiToken = rARuntimeBridgeConfig.getApiToken()) == null) {
            return null;
        }
        if (zg6.B0(apiToken)) {
            apiToken = null;
        }
        if (apiToken == null) {
            return null;
        }
        return new x15(username, apiToken);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.mv5 a0(defpackage.mv5 r6, int r7, int r8, boolean r9, boolean r10, boolean r11, boolean r12, defpackage.gv5 r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.a0(mv5, int, int, boolean, boolean, boolean, boolean, gv5):mv5");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.hv1 r6, defpackage.k11 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.mv1
            if (r0 == 0) goto L13
            r0 = r7
            mv1 r0 = (defpackage.mv1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            mv1 r0 = new mv1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            java.lang.String r0 = r0.R
            defpackage.me2.a0(r7)
            goto L7d
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r5
        L33:
            defpackage.me2.a0(r7)
            goto L57
        L37:
            defpackage.me2.a0(r7)
            java.lang.Object r7 = r6.P
            monitor-enter(r7)
            java.lang.String r2 = r6.Q     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L43
            r2 = r4
            goto L44
        L43:
            r2 = 0
        L44:
            monitor-exit(r7)
            if (r2 == 0) goto L48
            goto L85
        L48:
            ud5 r7 = r6.g
            r0.Z = r4
            dl r7 = (defpackage.dl) r7
            vj r7 = r7.c
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r1) goto L57
            goto L7b
        L57:
            boolean r2 = r7 instanceof defpackage.x15
            if (r2 == 0) goto L5e
            x15 r7 = (defpackage.x15) r7
            goto L5f
        L5e:
            r7 = r5
        L5f:
            if (r7 != 0) goto L62
            goto L85
        L62:
            java.util.UUID r2 = java.util.UUID.randomUUID()
            java.lang.String r2 = r2.toString()
            r2.getClass()
            ud5 r4 = r6.g
            r0.R = r2
            r0.Z = r3
            dl r4 = (defpackage.dl) r4
            java.lang.Object r7 = r4.a(r2, r7, r0)
            if (r7 != r1) goto L7c
        L7b:
            return r1
        L7c:
            r0 = r2
        L7d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L86
        L85:
            return r5
        L86:
            java.lang.Object r7 = r6.P
            monitor-enter(r7)
            r6.Q = r0     // Catch: java.lang.Throwable -> La3
            monitor-exit(r7)
            java.lang.String r7 = "ra_runtime_identity_lease_acquired"
            java.lang.String r1 = "runtime_path"
            hv1$c r2 = r6.O
            java.lang.String r2 = r2.getTraceValue()
            ti4 r3 = new ti4
            r3.<init>(r1, r2)
            ti4[] r1 = new defpackage.ti4[]{r3}
            r6.I0(r7, r1)
            return r0
        La3:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        La6:
            r6 = move-exception
            monitor-exit(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.e(hv1, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0048 -> B:25:0x004b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.hv1 r5, defpackage.k11 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.qv1
            if (r0 == 0) goto L13
            r0 = r6
            qv1 r0 = (defpackage.qv1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qv1 r0 = new qv1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            gs0 r2 = r0.R
            defpackage.me2.a0(r6)
            goto L4b
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L30:
            defpackage.me2.a0(r6)
        L33:
            java.lang.Object r6 = r5.P
            monitor-enter(r6)
            gs0 r2 = r5.S     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r6)
            if (r2 != 0) goto L3e
            o27 r5 = defpackage.o27.a
            return r5
        L3e:
            r0.R = r2
            r0.Z = r3
            java.lang.Object r6 = r2.h(r0)
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            if (r6 != r1) goto L4b
            return r1
        L4b:
            java.lang.Object r6 = r5.P
            monitor-enter(r6)
            gs0 r4 = r5.S     // Catch: java.lang.Throwable -> L5b
            if (r4 != r2) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            monitor-exit(r6)
            if (r2 == 0) goto L33
            o27 r5 = defpackage.o27.a
            return r5
        L5b:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L5e:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.f(hv1, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034d  */
    /* JADX WARN: Type inference failed for: r1v24, types: [mi2] */
    /* JADX WARN: Type inference failed for: r7v8, types: [mi2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.hv1 r20, defpackage.rg5 r21, defpackage.k11 r22) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.g(hv1, rg5, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(defpackage.hv1 r38, defpackage.rg5 r39, defpackage.jv1 r40, defpackage.k11 r41) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.h(hv1, rg5, jv1, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(defpackage.hv1 r19, defpackage.ti5 r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.i(hv1, ti5, k11):java.lang.Object");
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
    /* JADX WARN: Type inference failed for: r4v3, types: [rg5, j11, kd5] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [rg5, sa4, j11, kd5] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.hv1 r28, defpackage.rg5 r29, defpackage.kd5 r30, defpackage.k11 r31) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.j(hv1, rg5, kd5, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
        if (r14 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.hv1 r11, defpackage.jm4 r12, java.util.List r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.k(hv1, jm4, java.util.List, k11):java.lang.Object");
    }

    public static final void l(hv1 hv1Var, List list) {
        gt1 gt1Var;
        rg5 rg5Var;
        boolean z;
        hv1Var.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lt1 lt1Var = (lt1) it.next();
            if (b53.x(lt1Var, it1.a)) {
                hv1Var.n0("runtime_disabled");
            } else if (b53.x(lt1Var, jt1.a)) {
                a53 a53Var = hv1Var.w.e;
                lb4 lb4Var = null;
                if (a53Var instanceof gt1) {
                    gt1Var = (gt1) a53Var;
                } else {
                    gt1Var = null;
                }
                if (gt1Var != null && (rg5Var = gt1Var.r) != null) {
                    b bVar = hv1Var.G;
                    d dVar = hv1Var.H;
                    b bVar2 = b.OFFLINE_ACCUMULATING;
                    if (bVar == bVar2) {
                        if (hv1Var.J) {
                            lb4Var = lb4.OFFLINE_AFTER_START;
                        } else {
                            lb4Var = lb4.OFFLINE_FROM_START;
                        }
                    }
                    lb4 lb4Var2 = lb4Var;
                    boolean z2 = hv1Var.I;
                    if (!hv1Var.J && bVar == bVar2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    hv1Var.b1(rg5Var, new jv1(bVar, dVar, lb4Var2, z2, z, false));
                }
            } else if (b53.x(lt1Var, kt1.a)) {
                hv1Var.J0.p(bu6.a);
            } else {
                i.c();
                return;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:1|(2:3|(15:5|6|7|(1:(1:(6:11|12|13|(1:15)(1:19)|16|17)(2:20|21))(2:22|23))(3:50|51|(2:53|54))|24|(1:26)(1:49)|27|(1:29)|30|(1:47)|(6:35|36|37|(1:39)|40|(1:43)(2:42|12))|13|(0)(0)|16|17))|57|6|7|(0)(0)|24|(0)(0)|27|(0)|30|(1:32)|47|(0)|13|(0)(0)|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0040, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        r8 = new defpackage.kc5(r8);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.hv1 r8, defpackage.ak2 r9, boolean r10, defpackage.k11 r11) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.m(hv1, ak2, boolean, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.hv1 r13, defpackage.dy4 r14, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.n(hv1, dy4, k11):java.lang.Object");
    }

    public static final bz0 o(hv1 hv1Var) {
        return new bz0(2, new bz0(5, new a7(hv1Var.p0, 8)));
    }

    public static final tj0 t(hv1 hv1Var) {
        b56 b56Var = (b56) hv1Var.c;
        b56Var.getClass();
        return se.X(b56Var.p("input_layout_id", new h46(b56Var, 21)), new qw1(0, null, hv1Var));
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
    /* JADX WARN: Type inference failed for: r4v5, types: [rg5, java.lang.Long, a25, j11, x15, nd5] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.hv1 r20, defpackage.rg5 r21, defpackage.k11 r22) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.w(hv1, rg5, k11):java.lang.Object");
    }

    public static final Serializable x(hv1 hv1Var, wm5 wm5Var, nk6 nk6Var) {
        if (((b56) hv1Var.c).b.getBoolean("cheats_enabled", false)) {
            ht1 ht1Var = hv1Var.w;
            if (!ht1Var.a || !ht1Var.b) {
                return ((nq5) hv1Var.f).k(wm5Var, nk6Var);
            }
        }
        return pp1.A;
    }

    public static final VideoRenderer y(hv1 hv1Var) {
        Object obj;
        hv1Var.getClass();
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

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
        if (r11 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(long r9, defpackage.k11 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.px1
            if (r0 == 0) goto L13
            r0 = r11
            px1 r0 = (defpackage.px1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            px1 r0 = new px1
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            ud5 r8 = r8.g
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            j15 r8 = r0.X
            defpackage.me2.a0(r11)
            goto L65
        L2f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r8)
            return r3
        L35:
            long r9 = r0.R
            defpackage.me2.a0(r11)
            goto L4c
        L3b:
            defpackage.me2.a0(r11)
            r0.R = r9
            r0.c0 = r5
            r11 = r8
            dl r11 = (defpackage.dl) r11
            java.lang.Object r11 = r11.n(r9, r0)
            if (r11 != r1) goto L4c
            goto L61
        L4c:
            j15 r11 = (defpackage.j15) r11
            if (r11 != 0) goto L51
            goto L69
        L51:
            long r5 = r11.c
            r0.X = r11
            r0.R = r9
            r0.c0 = r4
            dl r8 = (defpackage.dl) r8
            java.lang.Object r8 = r8.i(r5, r0)
            if (r8 != r1) goto L62
        L61:
            return r1
        L62:
            r7 = r11
            r11 = r8
            r8 = r7
        L65:
            jy4 r11 = (defpackage.jy4) r11
            if (r11 != 0) goto L6a
        L69:
            return r3
        L6a:
            dv1 r9 = new dv1
            java.net.URL r10 = r11.e
            r9.<init>(r8, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.B0(long, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        if (r15 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r15 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        if (r7.F0.b(defpackage.r05.a, r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(defpackage.rg5 r13, defpackage.ft5 r14, defpackage.k11 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.qx1
            if (r0 == 0) goto L13
            r0 = r15
            qx1 r0 = (defpackage.qx1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qx1 r0 = new qx1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            boolean r12 = r0.R
            defpackage.me2.a0(r15)
            goto L94
        L30:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            r12 = 0
            return r12
        L37:
            defpackage.me2.a0(r15)
            r7 = r12
            goto L7d
        L3c:
            defpackage.me2.a0(r15)
            r7 = r12
            goto L61
        L41:
            defpackage.me2.a0(r15)
            boolean r15 = r14.b
            if (r15 != 0) goto L4b
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L4b:
            r0.Z = r5
            bb1 r15 = defpackage.tg1.a
            ha1 r15 = defpackage.ha1.L
            ww1 r6 = new ww1
            r11 = 0
            r7 = r12
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r15 = defpackage.tq5.G(r15, r6, r0)
            if (r15 != r1) goto L61
            goto L93
        L61:
            android.net.Uri r15 = (android.net.Uri) r15
            r0.Z = r4
            rs1 r12 = r7.v
            xg r12 = (defpackage.xg) r12
            r12.getClass()
            bb1 r12 = defpackage.tg1.a
            ha1 r12 = defpackage.ha1.L
            rg r13 = new rg
            r14 = 0
            r13.<init>(r15, r10, r14)
            java.lang.Object r15 = defpackage.tq5.G(r12, r13, r0)
            if (r15 != r1) goto L7d
            goto L93
        L7d:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            if (r12 == 0) goto L94
            r0.R = r12
            r0.Z = r3
            c46 r13 = r7.F0
            r05 r14 = defpackage.r05.a
            java.lang.Object r13 = r13.b(r14, r0)
            if (r13 != r1) goto L94
        L93:
            return r1
        L94:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.C0(rg5, ft5, k11):java.lang.Object");
    }

    public final void D0(String str, long j, String str2, ti4... ti4VarArr) {
        vq2 vq2Var = new vq2(5);
        vq2Var.a(new ti4("entity_type", str));
        vq2Var.a(new ti4("entity_id", Long.valueOf(j)));
        vq2Var.a(new ti4("reason", str2));
        vq2Var.a(new ti4("submit_path", "kotlin_api"));
        vq2Var.d(ti4VarArr);
        ArrayList arrayList = vq2Var.b;
        J0("context_mismatch", (ti4[]) arrayList.toArray(new ti4[arrayList.size()]));
    }

    public final void E0(String str, ti4... ti4VarArr) {
        if (!this.T) {
            return;
        }
        I0(str, (ti4[]) Arrays.copyOf(ti4VarArr, ti4VarArr.length));
    }

    public final void F0(kl3 kl3Var, long j, String str, ti4... ti4VarArr) {
        vq2 vq2Var = new vq2(5);
        vq2Var.a(new ti4("leaderboard_id", Long.valueOf(kl3Var.a)));
        vq2Var.a(new ti4("attempt_id", Long.valueOf(kl3Var.b)));
        vq2Var.a(new ti4("event_sequence", Long.valueOf(j)));
        vq2Var.a(new ti4("ui_state", str));
        vq2Var.d(ti4VarArr);
        ArrayList arrayList = vq2Var.b;
        E0("leaderboard_ui_transition", (ti4[]) arrayList.toArray(new ti4[arrayList.size()]));
    }

    public final void G0(String str, c cVar, ak2 ak2Var, RARuntimeBridgeConfig rARuntimeBridgeConfig, Throwable th) {
        Object obj;
        boolean z;
        StringBuilder u = b31.u("source=runtime_setup stage=", str, " runtime=");
        u.append(cVar.getTraceValue());
        u.append(" game_id=");
        if ((rARuntimeBridgeConfig == null || (obj = rARuntimeBridgeConfig.getGameId()) == null) && (obj = this.L) == null) {
            obj = "none";
        }
        u.append(obj);
        u.append(" game_hash=redacted achievements=");
        u.append(ak2Var.b.size());
        u.append(" leaderboards=");
        u.append(ak2Var.c.size());
        u.append(" has_rich_presence=");
        if (ak2Var.e != null) {
            z = true;
        } else {
            z = false;
        }
        u.append(z);
        u.append(" status=");
        u.append(ak2Var.a.name());
        if (th != null) {
            u.append(" error=");
            u.append(th.getClass().getSimpleName());
        }
        String sb = u.toString();
        if (th == null) {
            Log.i("RAIdentity", sb);
        } else {
            Log.w("RAIdentity", sb);
        }
    }

    public final void I0(String str, ti4... ti4VarArr) {
        StringBuilder u = b31.u("event_type=", str, " network_mode=");
        u.append(this.G.name());
        u.append(" session_mode=");
        u.append(this.H.name());
        u.append(" runtime_path=");
        u.append(this.O.getTraceValue());
        u.append(" current_game_id=");
        Object obj = this.L;
        if (obj == null) {
            obj = "none";
        }
        u.append(obj);
        for (ti4 ti4Var : ti4VarArr) {
            String str2 = (String) ti4Var.A;
            Object obj2 = ti4Var.B;
            if (obj2 != null) {
                u.append(' ');
                u.append(str2);
                u.append('=');
                u.append(gh6.k0(obj2.toString(), ' ', '_'));
            }
        }
        Log.i("RASubmission", u.toString());
    }

    public final void J0(String str, ti4... ti4VarArr) {
        boolean z;
        if ((this.b.getApplicationInfo().flags & 2) != 0) {
            StringBuilder u = b31.u("event_type=", str, " network_mode=");
            u.append(this.G.name());
            u.append(" session_mode=");
            u.append(this.H.name());
            u.append(" game_id=");
            Object obj = this.L;
            if (obj == null) {
                obj = "none";
            }
            u.append(obj);
            u.append(" runtime_path=");
            u.append(this.O.getTraceValue());
            u.append(" session_active=");
            if (!this.K && this.M == null) {
                z = false;
            } else {
                z = true;
            }
            u.append(z);
            for (ti4 ti4Var : ti4VarArr) {
                String str2 = (String) ti4Var.A;
                Object obj2 = ti4Var.B;
                if (obj2 != null) {
                    u.append(' ');
                    u.append(str2);
                    u.append('=');
                    u.append(gh6.k0(obj2.toString(), ' ', '_'));
                }
            }
            Log.i("RATrace", u.toString());
        }
    }

    public final void K0(nd5 nd5Var) {
        ee6 ee6Var;
        Object value;
        wt1 wt1Var;
        do {
            ee6Var = this.p0;
            value = ee6Var.getValue();
            wt1Var = (wt1) value;
            if (wt1Var instanceof ot1) {
                wt1Var = new ot1(((ot1) wt1Var).a, nd5Var);
            }
        } while (!ee6Var.j(value, wt1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v8, types: [pp1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L0(java.lang.String r25, java.lang.String r26, defpackage.a25 r27, defpackage.k11 r28) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.L0(java.lang.String, java.lang.String, a25, k11):java.lang.Object");
    }

    public final void M0(ll4 ll4Var) {
        wx2 wx2Var;
        rg5 rg5Var;
        boolean z;
        boolean z2;
        boolean z3;
        st1 st1Var;
        rg5 rg5Var2;
        st1 st1Var2;
        st1 st1Var3;
        st1 st1Var4;
        ll4Var.getClass();
        boolean z4 = ll4Var instanceof cp5;
        boolean z5 = true;
        c46 c46Var = this.T0;
        if (z4) {
            int i = lv1.d[((cp5) ll4Var).ordinal()];
            g11 g11Var = this.z;
            w16 w16Var = this.c;
            c46 c46Var2 = this.J0;
            ee6 ee6Var = this.p0;
            ht1 ht1Var = this.w;
            st1 st1Var5 = null;
            wm5 wm5Var = null;
            switch (i) {
                case 1:
                    Object value = ee6Var.getValue();
                    if (value instanceof st1) {
                        st1Var5 = (st1) value;
                    }
                    if (st1Var5 != null && (rg5Var = st1Var5.a) != null) {
                        UUID v = ((b56) w16Var).v();
                        ti5 ti5Var = rg5Var.f;
                        if (ti5Var.g != ym5.GLOBAL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        UUID uuid = ti5Var.c;
                        if (uuid != null && !uuid.equals(v)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (rg5Var.f.l != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        wx2Var = new wx2(z, z2, z3);
                    } else {
                        wx2Var = new wx2(false, false, false);
                    }
                    if (this.O == c.DISABLED && !ht1Var.b) {
                        z5 = false;
                    }
                    c46Var.p(new bu1(wx2Var, z5, x0()));
                    return;
                case 2:
                    Object value2 = ee6Var.getValue();
                    if (value2 instanceof st1) {
                        st1Var = (st1) value2;
                    } else {
                        st1Var = null;
                    }
                    if (st1Var != null && (rg5Var2 = st1Var.a) != null) {
                        tq5.w(g11Var, null, null, new xh(this, rg5Var2, (j11) null, 6), 3);
                        return;
                    }
                    return;
                case 3:
                    ht1Var.getClass();
                    Object value3 = ee6Var.getValue();
                    if (value3 instanceof st1) {
                        st1Var2 = (st1) value3;
                    } else {
                        st1Var2 = null;
                    }
                    if (st1Var2 != null) {
                        tq5.w(g11Var, null, null, new ew1(this, st1Var2, null, 3), 3);
                        return;
                    }
                    return;
                case 4:
                    if (ht1Var.b()) {
                        Object value4 = ee6Var.getValue();
                        if (value4 instanceof st1) {
                            st1Var3 = (st1) value4;
                        } else {
                            st1Var3 = null;
                        }
                        if (st1Var3 != null) {
                            tq5.w(g11Var, null, null, new ew1(this, st1Var3, null, 4), 3);
                            return;
                        }
                        return;
                    }
                    c46Var2.p(yt6.a);
                    return;
                case 5:
                    if (!((b56) w16Var).b.getBoolean("enable_rewind", false)) {
                        c46Var2.p(cv6.a);
                        return;
                    } else if (!ht1Var.b()) {
                        c46Var2.p(bv6.a);
                        return;
                    } else {
                        tq5.w(g11Var, null, null, new wu1(14, null, this), 3);
                        return;
                    }
                case ig7.b /* 6 */:
                    if (ht1Var.a && ht1Var.b) {
                        c46Var2.p(cu6.a);
                        return;
                    }
                    Object value5 = ee6Var.getValue();
                    if (value5 instanceof st1) {
                        st1Var4 = (st1) value5;
                    } else {
                        st1Var4 = null;
                    }
                    if (st1Var4 != null) {
                        rg5 rg5Var3 = st1Var4.a;
                        Uri uri = rg5Var3.d;
                        ap apVar = this.p;
                        apVar.getClass();
                        uri.getClass();
                        am5 a2 = apVar.a(uh1.g(apVar.a, uri));
                        if (a2 != null) {
                            wm5Var = a2.b(rg5Var3);
                        }
                        if (wm5Var != null) {
                            c46Var.p(new au1(wm5Var));
                            return;
                        }
                        return;
                    }
                    return;
                case 7:
                    c46Var.p(du1.a);
                    return;
                case 8:
                    tq5.w(g11Var, null, null, new vx1(this, null), 3);
                    return;
                case 9:
                    c46Var.p(eu1.a);
                    return;
                case 10:
                    c46Var.p(ku1.a);
                    return;
                case 11:
                    U0();
                    return;
                case mj2.L /* 12 */:
                    t0(false);
                    return;
                default:
                    i.c();
                    return;
            }
        } else if (ll4Var instanceof k82) {
            int i2 = lv1.e[((k82) ll4Var).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        c1();
                        c46Var.p(yt1.a);
                        return;
                    }
                    i.c();
                    return;
                }
                U0();
                return;
            }
            c46Var.p(new bu1(new wx2(false, false, false), false, false));
        }
    }

    public final void N0(boolean z) {
        if (z) {
            this.l0.set(true);
        }
        this.j0.incrementAndGet();
        tq5.w(this.z, null, s31.UNDISPATCHED, new ey1(this, null), 1);
    }

    public final void O0(boolean z) {
        tq5.w(this.z, null, null, new gw1(this, z, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P0(defpackage.w35 r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.fy1
            if (r0 == 0) goto L13
            r0 = r6
            fy1 r0 = (defpackage.fy1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            fy1 r0 = new fy1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            w35 r5 = r0.R
            defpackage.me2.a0(r6)
            goto L45
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r6)
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r6 = r4.N
            if (r6 != 0) goto L3a
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3a:
            r0.R = r5
            r0.Z = r3
            java.lang.Object r6 = r4.Z(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L50
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L50:
            boolean r4 = r4.Q0(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.P0(w35, k11):java.lang.Object");
    }

    public final boolean Q0(w35 w35Var) {
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
        if (apiToken != null && !zg6.B0(apiToken)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String username2 = rARuntimeBridgeConfig.getUsername();
        Long gameId = rARuntimeBridgeConfig.getGameId();
        Long l = this.L;
        String gameHash = rARuntimeBridgeConfig.getGameHash();
        rg5 rg5Var = this.n1;
        if (rg5Var != null) {
            str = rg5Var.i;
        } else {
            str = null;
        }
        long submissionSessionId = rARuntimeBridgeConfig.getSubmissionSessionId();
        w35Var.getClass();
        String str2 = w35Var.c;
        boolean z4 = z;
        long j = w35Var.b;
        String str3 = w35Var.a;
        if (!z4 || !hardcoreEnabled || !z3 || !b53.x(username, str3) || z2 || !b53.x(username2, str3) || gameId == null || gameId.longValue() != j || l == null || l.longValue() != j || !b53.x(gameHash, str2) || !b53.x(str, str2) || submissionSessionId != w35Var.e) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0083, code lost:
        if (r0 == r8) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0129 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R0(defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.R0(k11):java.lang.Object");
    }

    public final void S0(c35 c35Var) {
        dz4 dz4Var = this.V;
        dz4Var.getClass();
        c35Var.getClass();
        if (((AtomicBoolean) dz4Var.A).get()) {
            c35Var = c35.TERMINAL_STOP;
        }
        tq5.w(this.z, null, null, new vm(this, c35Var, (j11) null, 3), 3);
    }

    public final void T0() {
        q60 q60Var = this.e0;
        if (q60Var == null) {
            return;
        }
        mx2 mx2Var = this.f0;
        synchronized (mx2Var) {
            if (!mx2Var.A) {
                return;
            }
            mx2Var.A = false;
            q60Var.c(o27.a);
        }
    }

    public final void U0() {
        if (((wt1) this.p0.getValue()).a()) {
            tq5.w(this.z, null, null, new wu1(15, null, this), 3);
        }
    }

    public final void V0() {
        if (((wt1) this.p0.getValue()).a() && !((AtomicBoolean) this.V.A).get()) {
            tq5.w(this.z, null, null, new wu1(16, null, this), 3);
        }
    }

    public final o27 W0() {
        boolean a2 = ((wt1) this.p0.getValue()).a();
        o27 o27Var = o27.a;
        if (a2 && this.j0.get() == 0 && !((AtomicBoolean) this.V.A).get() && b53.x(((ee6) this.h0.R).getValue(), k35.a)) {
            ((xg) this.v).getClass();
            MelonEmulator.a.resumeEmulation();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
        }
        return o27Var;
    }

    public final void X0(RewindSaveState rewindSaveState) {
        rewindSaveState.getClass();
        if (!this.w.b()) {
            this.J0.p(bv6.a);
            return;
        }
        tq5.w(this.z, null, null, new ba1(this, rewindSaveState, null, 13), 3);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z(me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r6, defpackage.k11 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.nv1
            if (r0 == 0) goto L13
            r0 = r7
            nv1 r0 = (defpackage.nv1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            nv1 r0 = new nv1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r6 = r0.R
            defpackage.me2.a0(r7)
            goto L49
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r7)
            if (r6 != 0) goto L38
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L38:
            r0.R = r6
            r0.Z = r4
            ud5 r5 = r5.g
            dl r5 = (defpackage.dl) r5
            vj r5 = r5.c
            java.lang.Object r7 = r5.b(r0)
            if (r7 != r1) goto L49
            return r1
        L49:
            boolean r5 = r7 instanceof defpackage.x15
            if (r5 == 0) goto L50
            x15 r7 = (defpackage.x15) r7
            goto L51
        L50:
            r7 = r3
        L51:
            java.lang.String r5 = r6.getUsername()
            java.lang.String r6 = r6.getApiToken()
            if (r7 == 0) goto L5e
            java.lang.String r0 = r7.a
            goto L5f
        L5e:
            r0 = r3
        L5f:
            if (r7 == 0) goto L63
            java.lang.String r3 = r7.b
        L63:
            if (r5 == 0) goto L82
            boolean r7 = defpackage.zg6.B0(r5)
            if (r7 == 0) goto L6c
            goto L82
        L6c:
            if (r6 == 0) goto L82
            boolean r7 = defpackage.zg6.B0(r6)
            if (r7 == 0) goto L75
            goto L82
        L75:
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L82
            boolean r5 = r6.equals(r3)
            if (r5 == 0) goto L82
            goto L83
        L82:
            r4 = 0
        L83:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.Z(me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
        if (defpackage.tq5.G(r12, r6, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z0(defpackage.rg5 r13, defpackage.ft5 r14, defpackage.k11 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.oy1
            if (r0 == 0) goto L13
            r0 = r15
            oy1 r0 = (defpackage.oy1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            oy1 r0 = new oy1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 3
            r4 = 2
            r5 = 1
            r10 = 0
            if (r2 == 0) goto L4a
            if (r2 == r5) goto L41
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            defpackage.me2.a0(r15)
            goto Lac
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            r12 = 0
            return r12
        L36:
            ft5 r13 = r0.X
            rg5 r14 = r0.R
            defpackage.me2.a0(r15)
            r7 = r12
            r9 = r13
            r8 = r14
            goto L8a
        L41:
            ft5 r14 = r0.X
            rg5 r13 = r0.R
            defpackage.me2.a0(r15)
            r7 = r12
            goto L69
        L4a:
            defpackage.me2.a0(r15)
            r0.R = r13
            r0.X = r14
            r0.c0 = r5
            bb1 r15 = defpackage.tg1.a
            ha1 r15 = defpackage.ha1.L
            ww1 r6 = new ww1
            r11 = 0
            r7 = r12
            r8 = r13
            r9 = r14
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r15 = defpackage.tq5.G(r15, r6, r0)
            if (r15 != r1) goto L67
            goto Lab
        L67:
            r13 = r8
            r14 = r9
        L69:
            android.net.Uri r15 = (android.net.Uri) r15
            r0.R = r13
            r0.X = r14
            r0.c0 = r4
            rs1 r12 = r7.v
            xg r12 = (defpackage.xg) r12
            r12.getClass()
            bb1 r12 = defpackage.tg1.a
            ha1 r12 = defpackage.ha1.L
            rg r2 = new rg
            r2.<init>(r15, r10, r5)
            java.lang.Object r15 = defpackage.tq5.G(r12, r2, r0)
            if (r15 != r1) goto L88
            goto Lab
        L88:
            r8 = r13
            r9 = r14
        L8a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            if (r12 != 0) goto L95
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        L95:
            bb1 r12 = defpackage.tg1.a
            ha1 r12 = defpackage.ha1.L
            ww1 r6 = new ww1
            r11 = 1
            r6.<init>(r7, r8, r9, r10, r11)
            r0.R = r10
            r0.X = r10
            r0.c0 = r3
            java.lang.Object r12 = defpackage.tq5.G(r12, r6, r0)
            if (r12 != r1) goto Lac
        Lab:
            return r1
        Lac:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.Z0(rg5, ft5, k11):java.lang.Object");
    }

    public final void a1(String str, String str2) {
        synchronized (this.P) {
            if (!b53.x(this.R, str)) {
                return;
            }
            this.R = null;
            gs0 gs0Var = this.S;
            gs0 gs0Var2 = new gs0();
            this.S = gs0Var2;
            tq5.w(ua7.a(this), null, s31.UNDISPATCHED, new qy1(new ti4(gs0Var, gs0Var2), this, str, str2, null, 1), 1);
        }
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b0(defpackage.k11 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof defpackage.ov1
            if (r0 == 0) goto L13
            r0 = r10
            ov1 r0 = (defpackage.ov1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ov1 r0 = new ov1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            hq2 r4 = r9.o0
            r5 = 3
            r6 = 2
            r7 = 1
            o27 r8 = defpackage.o27.a
            if (r2 == 0) goto L40
            if (r2 == r7) goto L3c
            if (r2 == r6) goto L38
            if (r2 != r5) goto L32
            defpackage.me2.a0(r10)
            goto L98
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r3
        L38:
            defpackage.me2.a0(r10)
            goto L67
        L3c:
            defpackage.me2.a0(r10)
            goto L55
        L40:
            defpackage.me2.a0(r10)
            u64 r10 = r9.o
            boolean r10 = r10.a()
            if (r10 != 0) goto L4c
            goto L5d
        L4c:
            r0.Y = r7
            java.lang.Object r10 = r4.f(r0)
            if (r10 != r1) goto L55
            goto L97
        L55:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != 0) goto L5e
        L5d:
            return r8
        L5e:
            r0.Y = r6
            java.lang.Object r10 = r4.f(r0)
            if (r10 != r1) goto L67
            goto L97
        L67:
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r10)
            ti4 r10 = new ti4
            java.lang.String r4 = "pending_hardcore"
            r10.<init>(r4, r2)
            rg5 r2 = r9.n1
            if (r2 == 0) goto L7f
            java.lang.String r3 = r2.i
        L7f:
            ti4 r2 = new ti4
            java.lang.String r4 = "content_id"
            r2.<init>(r4, r3)
            ti4[] r10 = new defpackage.ti4[]{r10, r2}
            java.lang.String r2 = "hardcore_silent_replay_attempt"
            r9.J0(r2, r10)
            r0.Y = r5
            java.lang.Object r10 = r9.p0(r0)
            if (r10 != r1) goto L98
        L97:
            return r1
        L98:
            zp2 r10 = (defpackage.zp2) r10
            int r0 = r10.b
            int r1 = r10.a
            java.lang.String r2 = "submitted"
            if (r0 != 0) goto Lb6
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            ti4 r0 = new ti4
            r0.<init>(r2, r10)
            ti4[] r10 = new defpackage.ti4[]{r0}
            java.lang.String r0 = "hardcore_silent_replay_complete"
            r9.J0(r0, r10)
            return r8
        Lb6:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            ti4 r1 = new ti4
            r1.<init>(r2, r0)
            int r10 = r10.b
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r10)
            ti4 r10 = new ti4
            java.lang.String r2 = "remaining"
            r10.<init>(r2, r0)
            ti4[] r10 = new defpackage.ti4[]{r1, r10}
            java.lang.String r0 = "hardcore_silent_replay_partial"
            r9.J0(r0, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.b0(k11):java.lang.Object");
    }

    public final gs0 b1(rg5 rg5Var, jv1 jv1Var) {
        gs0 gs0Var = new gs0();
        kd6 kd6Var = this.E;
        kd6 w = tq5.w(this.z, null, s31.LAZY, new ez1(kd6Var, this, gs0Var, jv1Var, rg5Var, null), 1);
        this.E = w;
        w.R(new ru1(0, gs0Var));
        w.start();
        return gs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c0(defpackage.b35 r10, defpackage.c35 r11, defpackage.k11 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.pv1
            if (r0 == 0) goto L13
            r0 = r12
            pv1 r0 = (defpackage.pv1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            pv1 r0 = new pv1
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2d
            long r10 = r0.X
            av1 r0 = r0.R
            defpackage.me2.a0(r12)
            goto L9d
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r4
        L33:
            defpackage.me2.a0(r12)
            q9 r12 = r9.h0
            r12.getClass()
            r10.getClass()
            r11.getClass()
            i35 r2 = defpackage.nl2.r(r11)
            java.lang.Object r5 = r12.B
            monitor-enter(r5)
            i35 r6 = r12.t()     // Catch: java.lang.Throwable -> L5a
            if (r6 == 0) goto L5c
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L5a
            int r2 = r2.ordinal()     // Catch: java.lang.Throwable -> L5a
            if (r6 < r2) goto L5c
            r2 = r4
            goto L73
        L5a:
            r9 = move-exception
            goto Lb3
        L5c:
            long r6 = r12.H()     // Catch: java.lang.Throwable -> L5a
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r12 = r12.R     // Catch: java.lang.Throwable -> L5a
            ee6 r12 = (defpackage.ee6) r12     // Catch: java.lang.Throwable -> L5a
            j35 r8 = new j35     // Catch: java.lang.Throwable -> L5a
            r8.<init>(r6, r10, r11)     // Catch: java.lang.Throwable -> L5a
            r12.getClass()     // Catch: java.lang.Throwable -> L5a
            r12.l(r4, r8)     // Catch: java.lang.Throwable -> L5a
        L73:
            monitor-exit(r5)
            if (r2 == 0) goto Lab
            long r10 = r2.longValue()
            av1 r12 = r9.n0
            if (r12 == 0) goto L83
            gs0 r12 = r12.b
            r12.i(r4)
        L83:
            gs0 r12 = new gs0
            r12.<init>()
            av1 r2 = new av1
            r2.<init>(r10, r12)
            r9.n0 = r2
            r0.R = r2
            r0.X = r10
            r0.c0 = r3
            java.lang.Object r12 = r12.h(r0)
            if (r12 != r1) goto L9c
            return r1
        L9c:
            r0 = r2
        L9d:
            xp2 r12 = (defpackage.xp2) r12
            zu1 r1 = new zu1
            r1.<init>(r10, r12)
            av1 r10 = r9.n0
            if (r10 != r0) goto Laa
            r9.n0 = r4
        Laa:
            return r1
        Lab:
            java.util.concurrent.CancellationException r9 = new java.util.concurrent.CancellationException
            java.lang.String r10 = "A higher-priority pending submission dialog is active"
            r9.<init>(r10)
            throw r9
        Lb3:
            monitor-exit(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.c0(b35, c35, k11):java.lang.Object");
    }

    public final void c1() {
        kd6 kd6Var = this.E;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        kd6 kd6Var2 = this.F;
        if (kd6Var2 != null) {
            kd6Var2.i(null);
        }
        this.F = null;
        this.Z.c();
        this.a0.k();
        tq5.w(ua7.a(this), null, null, new wu1(26, null, this), 3);
        u0();
        i1("emulator_stopped");
        this.N = null;
        this.O = c.DISABLED;
        xg xgVar = (xg) this.v;
        xgVar.getClass();
        MelonEmulator.a.stopEmulation();
        gg ggVar = xgVar.o;
        if (ggVar != null) {
            xgVar.o = null;
            File file = ggVar.c;
            if (file != null) {
                if (!file.exists()) {
                    String str = ggVar.b;
                    Log.w("AndroidEmulatorManager", "DSiWareShortcut: public save missing during sync title=" + str);
                } else {
                    bb1 bb1Var = tg1.a;
                    tq5.A(ha1.L, new a0(xgVar, ggVar, file, (j11) null, 6));
                }
            }
        }
        xgVar.n.q();
        xgVar.g.a();
        xgVar.r.d();
        ByteBuffer byteBuffer = this.t.a;
        if (byteBuffer != null) {
            byteBuffer.position(0);
            int capacity = byteBuffer.capacity() / 4;
            for (int i = 0; i < capacity; i++) {
                byteBuffer.putInt(-16777216);
            }
        }
    }

    @Override // defpackage.ra7
    public final void d() {
        m0();
        kd6 kd6Var = this.E;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        kd6 kd6Var2 = this.F;
        if (kd6Var2 != null) {
            kd6Var2.i(null);
        }
        this.F = null;
        ln2.t(this.z.B, null);
        i1("view_model_cleared");
        id5 id5Var = this.d;
        synchronized (id5Var) {
            id5Var.c = null;
        }
        xg xgVar = (xg) this.v;
        xgVar.g.dispose();
        EmulatorMessageQueue emulatorMessageQueue = xgVar.r;
        HandlerThread handlerThread = emulatorMessageQueue.b;
        Looper myLooper = Looper.myLooper();
        Handler handler = emulatorMessageQueue.c;
        if (b53.x(myLooper, handler.getLooper())) {
            emulatorMessageQueue.e();
            handlerThread.quitSafely();
            return;
        }
        if (handlerThread.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            handler.post(new we(22, emulatorMessageQueue, countDownLatch));
            countDownLatch.await(1L, TimeUnit.SECONDS);
        }
        handlerThread.quitSafely();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
        if (r10 != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(int r8, java.lang.Long r9, defpackage.k11 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.rv1
            if (r0 == 0) goto L13
            r0 = r10
            rv1 r0 = (defpackage.rv1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            rv1 r0 = new rv1
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            gs0 r8 = r0.X
            defpackage.me2.a0(r10)
            goto L72
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            return r5
        L33:
            int r8 = r0.R
            gs0 r9 = r0.X
            defpackage.me2.a0(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L65
        L3e:
            defpackage.me2.a0(r10)
            gs0 r10 = r7.m0
            if (r10 == 0) goto L48
            r10.i(r5)
        L48:
            gs0 r10 = new gs0
            r10.<init>()
            r7.m0 = r10
            fu1 r2 = new fu1
            r2.<init>(r8, r9)
            r0.X = r10
            r0.R = r8
            r0.c0 = r4
            c46 r9 = r7.T0
            java.lang.Object r9 = r9.b(r2, r0)
            if (r9 != r1) goto L63
            goto L71
        L63:
            r9 = r8
            r8 = r10
        L65:
            r0.X = r8
            r0.R = r9
            r0.c0 = r3
            java.lang.Object r10 = r8.h(r0)
            if (r10 != r1) goto L72
        L71:
            return r1
        L72:
            r9 = r10
            p94 r9 = (defpackage.p94) r9
            gs0 r9 = r7.m0
            if (r9 != r8) goto L7b
            r7.m0 = r5
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.d0(int, java.lang.Long, k11):java.lang.Object");
    }

    public final void d1(long j, xp2 xp2Var) {
        j35 j35Var;
        boolean z;
        xp2Var.getClass();
        av1 av1Var = this.n0;
        if (av1Var != null && av1Var.a == j) {
            q9 q9Var = this.h0;
            synchronized (q9Var.B) {
                try {
                    Object value = ((ee6) q9Var.R).getValue();
                    if (value instanceof j35) {
                        j35Var = (j35) value;
                    } else {
                        j35Var = null;
                    }
                    z = false;
                    if (j35Var != null) {
                        if (j35Var.a == j) {
                            z = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                av1Var.b.c0(xp2Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(long r11, defpackage.k11 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.sv1
            if (r0 == 0) goto L13
            r0 = r13
            sv1 r0 = (defpackage.sv1) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            sv1 r0 = new sv1
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            long r11 = r0.X
            long r4 = r0.R
            defpackage.me2.a0(r13)
            goto L3d
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L32:
            defpackage.me2.a0(r13)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 + r11
            r8 = r4
            r4 = r11
            r11 = r8
        L3d:
            boolean r13 = r10.K
            if (r13 != 0) goto L60
            long r6 = java.lang.System.currentTimeMillis()
            int r13 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r13 >= 0) goto L60
            hm1 r13 = defpackage.im1.B
            r13 = 250(0xfa, float:3.5E-43)
            om1 r2 = defpackage.om1.MILLISECONDS
            long r6 = defpackage.b53.k0(r13, r2)
            r0.R = r4
            r0.X = r11
            r0.c0 = r3
            java.lang.Object r13 = defpackage.dk7.r(r6, r0)
            if (r13 != r1) goto L3d
            return r1
        L60:
            boolean r10 = r10.K
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.e0(long, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (r3.b(r14, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r3.b(defpackage.zt1.a, r0) != r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c9, code lost:
        if (q0(r12, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e1(java.lang.String r11, java.lang.String r12, int r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.e1(java.lang.String, java.lang.String, int, k11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [pp1, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    public final ak2 f0(a25 a25Var) {
        boolean z;
        ArrayList arrayList = a25Var.e;
        URL url = a25Var.c;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tq0.D0(arrayList2, ((w15) obj).f);
        }
        ArrayList arrayList3 = a25Var.e;
        ArrayList arrayList4 = new ArrayList();
        int size2 = arrayList3.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            tq0.D0(arrayList4, ((w15) obj2).g);
        }
        if (!arrayList4.isEmpty() && this.w.a) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = arrayList2.isEmpty();
        int i3 = 0;
        ?? r3 = pp1.A;
        if (isEmpty && !z) {
            return new ak2(zj2.ENABLED_NO_ACHIEVEMENTS, r3, r3, 0, a25Var.d, url);
        }
        ArrayList arrayList5 = new ArrayList();
        int size3 = arrayList2.size();
        int i4 = 0;
        while (i4 < size3) {
            Object obj3 = arrayList2.get(i4);
            i4++;
            if (!((u15) obj3).b) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(uq0.y0(arrayList5, 10));
        int size4 = arrayList5.size();
        int i5 = 0;
        while (i5 < size4) {
            Object obj4 = arrayList5.get(i5);
            i5++;
            dy4 dy4Var = ((u15) obj4).a;
            arrayList6.add(new RASimpleAchievement(dy4Var.a, dy4Var.l));
        }
        if (z) {
            r3 = new ArrayList(uq0.y0(arrayList4, 10));
            int size5 = arrayList4.size();
            while (i3 < size5) {
                Object obj5 = arrayList4.get(i3);
                i3++;
                j15 j15Var = (j15) obj5;
                r3.add(new RASimpleLeaderboard(j15Var.a, j15Var.d, j15Var.e));
            }
        }
        return new ak2(zj2.ENABLED_FULL, arrayList6, r3, arrayList2.size(), a25Var.d, url);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f1(defpackage.v35 r32, defpackage.k11 r33) {
        /*
            Method dump skipped, instructions count: 815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.f1(v35, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g0(defpackage.rg5 r13, defpackage.k11 r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.tv1
            if (r0 == 0) goto L13
            r0 = r14
            tv1 r0 = (defpackage.tv1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            tv1 r0 = new tv1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.me2.a0(r14)
            goto L46
        L28:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r4
        L2e:
            defpackage.me2.a0(r14)
            r12.L = r4
            bb1 r14 = defpackage.tg1.a
            ha1 r14 = defpackage.ha1.L
            uv1 r2 = new uv1
            r5 = 0
            r2.<init>(r12, r13, r4, r5)
            r0.Y = r3
            java.lang.Object r14 = defpackage.tq5.G(r14, r2, r0)
            if (r14 != r1) goto L46
            return r1
        L46:
            z05 r14 = (defpackage.z05) r14
            java.lang.String r12 = "RAIdentity"
            java.lang.String r13 = "source=bootstrap stage=game_not_found runtime=disabled game_hash=redacted"
            android.util.Log.i(r12, r13)
            zj2 r6 = defpackage.zj2.DISABLED_GAME_NOT_FOUND
            if (r14 == 0) goto L57
            java.net.URL r12 = r14.b
            r11 = r12
            goto L58
        L57:
            r11 = r4
        L58:
            r6.getClass()
            zj2 r12 = defpackage.zj2.ENABLED_FULL
            if (r6 == r12) goto L6e
            zj2 r12 = defpackage.zj2.ENABLED_NO_ACHIEVEMENTS
            if (r6 == r12) goto L6e
            ak2 r5 = new ak2
            r9 = 0
            r10 = 0
            pp1 r7 = defpackage.pp1.A
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        L6e:
            java.lang.String r12 = "Failed requirement."
            defpackage.i.i(r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.g0(rg5, k11):java.lang.Object");
    }

    public final void g1(j25 j25Var, String str) {
        k25 k25Var;
        ee6 ee6Var = this.S0;
        k25 k25Var2 = (k25) ee6Var.getValue();
        k25Var2.getClass();
        if (j25Var instanceof d25) {
            int i = ((d25) j25Var).a;
            if (i >= 0) {
                if (i > 0) {
                    k25Var = k25.PENDING_RA_SUBMISSIONS;
                } else {
                    k25Var = k25.OFFLINE_ACCUMULATING;
                }
            } else {
                i.i("pending submission count must not be negative");
                return;
            }
        } else if (j25Var instanceof e25) {
            int i2 = ((e25) j25Var).a;
            if (i2 >= 0) {
                if (i2 > 0) {
                    k25Var = k25.PENDING_RA_SUBMISSIONS;
                } else {
                    k25Var = k25.ONLINE_LIVE;
                }
            } else {
                i.i("pending submission count must not be negative");
                return;
            }
        } else if (j25Var instanceof f25) {
            f25 f25Var = (f25) j25Var;
            int i3 = f25Var.a;
            if (i3 >= 0) {
                if (k25Var2 != k25.RECONCILING_RA_SUBMISSIONS) {
                    if (i3 > 0) {
                        k25Var = k25.PENDING_RA_SUBMISSIONS;
                    } else if (f25Var.b) {
                        k25Var = k25.ONLINE_LIVE;
                    } else {
                        k25Var = k25.OFFLINE_ACCUMULATING;
                    }
                }
                k25Var = k25Var2;
            } else {
                i.i("pending submission count must not be negative");
                return;
            }
        } else if (j25Var instanceof h25) {
            int i4 = ((h25) j25Var).a;
            if (i4 >= 0) {
                if (i4 > 0) {
                    k25Var = k25.RECONCILING_RA_SUBMISSIONS;
                }
                k25Var = k25Var2;
            } else {
                i.i("pending submission count must not be negative");
                return;
            }
        } else if (j25Var instanceof g25) {
            g25 g25Var = (g25) j25Var;
            int i5 = g25Var.a;
            if (i5 >= 0) {
                if (i5 > 0) {
                    k25Var = k25.PENDING_RA_SUBMISSIONS;
                } else if (g25Var.b) {
                    k25Var = k25.ONLINE_LIVE;
                } else {
                    k25Var = k25.OFFLINE_ACCUMULATING;
                }
            } else {
                i.i("pending submission count must not be negative");
                return;
            }
        } else if (j25Var.equals(i25.a)) {
            k25Var = k25.ONLINE_LIVE;
        } else {
            i.c();
            return;
        }
        if (k25Var == k25Var2) {
            return;
        }
        ee6Var.k(k25Var);
        String name = k25Var2.name();
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        ti4 ti4Var = new ti4("from", lowerCase);
        String lowerCase2 = k25Var.name().toLowerCase(locale);
        lowerCase2.getClass();
        I0("ra_hardcore_continuity_transition", ti4Var, new ti4("to", lowerCase2), new ti4("reason", str), new ti4("hardcore", Boolean.valueOf(this.w.a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h0(defpackage.rg5 r27, defpackage.k11 r28) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.h0(rg5, k11):java.lang.Object");
    }

    public final Object h1(j11 j11Var) {
        q45 q45Var;
        yl4 yl4Var;
        int i;
        q45 q45Var2;
        yl4 yl4Var2;
        RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
        o27 o27Var = o27.a;
        if (rARuntimeBridgeConfig != null && rARuntimeBridgeConfig.getUsesProxyHost()) {
            Boolean bool = Boolean.FALSE;
            J0("network_transition_owned_by_raofflineproxy", new ti4("built_in_ledger", bool), new ti4("built_in_sync", bool));
            return o27Var;
        }
        b bVar = this.G;
        b bVar2 = b.OFFLINE_ACCUMULATING;
        if (bVar != bVar2 && bVar != b.RECONCILING_RA_SUBMISSIONS) {
            String str = null;
            if (!this.I && !((b56) this.c).B()) {
                ti4 ti4Var = new ti4("started_online", Boolean.valueOf(this.J));
                ti4 ti4Var2 = new ti4("game_id", this.L);
                rg5 rg5Var = this.n1;
                if (rg5Var != null) {
                    str = rg5Var.i;
                }
                J0("network_transition_offline_softcore_disabled", ti4Var, ti4Var2, new ti4("content_id", str));
                return o27Var;
            }
            this.G = bVar2;
            this.w.e(true);
            int i2 = 0;
            if (this.I && this.J && this.O == c.RC_CLIENT) {
                jm4 jm4Var = this.b0;
                if (jm4Var != null && (q45Var2 = jm4Var.i) != null && (yl4Var2 = (yl4) q45Var2.A.getValue()) != null) {
                    i = yl4Var2.c.a;
                } else {
                    i = 0;
                }
                g1(new d25(i), "network_lost");
            }
            ti4 ti4Var3 = new ti4("hardcore_eligible", Boolean.valueOf(this.I));
            ti4 ti4Var4 = new ti4("started_online", Boolean.valueOf(this.J));
            ti4 ti4Var5 = new ti4("game_id", this.L);
            rg5 rg5Var2 = this.n1;
            if (rg5Var2 != null) {
                str = rg5Var2.i;
            }
            J0("network_transition_offline", ti4Var3, ti4Var4, ti4Var5, new ti4("content_id", str));
            if (!this.I) {
                Object s0 = s0(jb4.SOFTCORE, lb4.OFFLINE_AFTER_START, j11Var);
                if (s0 == p31.COROUTINE_SUSPENDED) {
                    return s0;
                }
            } else {
                jm4 jm4Var2 = this.b0;
                if (jm4Var2 != null && (q45Var = jm4Var2.i) != null && (yl4Var = (yl4) q45Var.A.getValue()) != null) {
                    i2 = yl4Var.c.a;
                }
                if (i2 > 0) {
                    this.J0.p(new fu6(i2));
                }
            }
        }
        return o27Var;
    }

    public final s35 i0() {
        o35 o35Var;
        boolean z;
        b35 b35Var;
        q45 q45Var;
        yl4 yl4Var;
        boolean z2 = this.p0.getValue() instanceof st1;
        ht1 ht1Var = this.w;
        boolean a2 = ht1Var.a();
        boolean z3 = this.J;
        boolean z4 = ht1Var.a;
        int i = lv1.j[this.O.ordinal()];
        String str = null;
        boolean z5 = true;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.c();
                        return null;
                    }
                } else {
                    o35Var = o35.LEGACY_KOTLIN;
                }
            }
            o35Var = o35.NONE;
        } else {
            o35Var = o35.RC_CLIENT;
        }
        if (this.O == c.RC_CLIENT_OFFLINE) {
            z = true;
        } else {
            z = false;
        }
        jm4 jm4Var = this.b0;
        if (jm4Var != null && (q45Var = jm4Var.i) != null && (yl4Var = (yl4) q45Var.A.getValue()) != null) {
            b35Var = yl4Var.c;
        } else {
            b35Var = b35.f;
        }
        int i2 = b35Var.a;
        o35Var.getClass();
        if (!z2 || !a2 || !z3 || !z4 || o35Var != o35.RC_CLIENT || z || i2 <= 0) {
            z5 = false;
        }
        if (z5) {
            str = this.b.getString(R.string.ra_pending_sync_menu_count, Integer.valueOf(i2));
            str.getClass();
        }
        return new s35(str, i2, z5);
    }

    public final void i1(String str) {
        String str2;
        synchronized (this.P) {
            str2 = this.Q;
        }
        if (str2 == null) {
            return;
        }
        j1(str2, str, new d5(17));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j0(java.lang.String r6, boolean r7, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.zv1
            if (r0 == 0) goto L13
            r0 = r8
            zv1 r0 = (defpackage.zv1) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            zv1 r0 = new zv1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            boolean r7 = r0.Y
            jm4 r6 = r0.X
            java.lang.String r0 = r0.R
            defpackage.me2.a0(r8)
            goto L50
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L34:
            defpackage.me2.a0(r8)
            jm4 r8 = r5.m0()
            if (r8 == 0) goto L5a
            r0.R = r6
            r0.X = r8
            r0.Y = r7
            r0.d0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r4 = r0
            r0 = r6
            r6 = r8
            r8 = r4
        L50:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r4 = r0
            r0 = r6
            r6 = r4
            goto L5e
        L5a:
            r0 = 0
            r4 = r0
            r0 = r8
            r8 = r4
        L5e:
            if (r0 == 0) goto L6d
            if (r7 == 0) goto L6d
            w35 r7 = r0.a
            java.lang.String r1 = r7.a
            java.lang.String r7 = r7.c
            wp2 r2 = r5.m
            r2.b(r1, r7)
        L6d:
            if (r0 == 0) goto L94
            ti4 r7 = new ti4
            java.lang.String r0 = "reason"
            r7.<init>(r0, r6)
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r8)
            ti4 r8 = new ti4
            java.lang.String r0 = "discarded"
            r8.<init>(r0, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            ti4 r0 = new ti4
            java.lang.String r1 = "accepted"
            r0.<init>(r1, r6)
            ti4[] r6 = new defpackage.ti4[]{r7, r8, r0}
            java.lang.String r7 = "ra_pending_session_cleared"
            r5.I0(r7, r6)
        L94:
            o27 r5 = defpackage.o27.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.j0(java.lang.String, boolean, k11):java.lang.Object");
    }

    public final boolean j1(String str, String str2, ki2 ki2Var) {
        String str3;
        boolean z;
        boolean n;
        boolean z2;
        a1(str, str2);
        synchronized (this.P) {
            str3 = null;
            if (!b53.x(this.Q, str)) {
                z2 = false;
                n = false;
                z = false;
                th = null;
            } else {
                try {
                    xg xgVar = (xg) this.v;
                    xgVar.p = false;
                    xgVar.q.k();
                    MelonEmulator.a.unloadRetroAchievementsData();
                    z = true;
                    th = null;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                }
                if (z) {
                    try {
                        ki2Var.c();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    dl dlVar = (dl) this.g;
                    dlVar.getClass();
                    str.getClass();
                    n = dlVar.h.n(str);
                    if (n) {
                        this.Q = null;
                        if (b53.x(this.R, str)) {
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
            I0("ra_runtime_identity_teardown_ignored", new ti4("reason", str2));
            return false;
        } else if (!z) {
            ti4 ti4Var = new ti4("reason", str2);
            if (th != null) {
                str3 = th.getClass().getSimpleName();
            }
            I0("ra_runtime_identity_teardown_failed", ti4Var, new ti4("error", str3), new ti4("lease_retained", Boolean.TRUE));
            return false;
        } else if (!n) {
            I0("ra_runtime_identity_teardown_failed", new ti4("reason", str2), new ti4("error", "LeaseReleaseRejected"), new ti4("lease_retained", Boolean.TRUE));
            return false;
        } else {
            ti4 ti4Var2 = new ti4("reason", str2);
            ti4 ti4Var3 = new ti4("released", Boolean.valueOf(n));
            if (th != null) {
                str3 = th.getClass().getSimpleName();
            }
            I0("ra_runtime_identity_lease_released", ti4Var2, ti4Var3, new ti4("teardown_error", str3));
            return true;
        }
    }

    public final void k0(long j, String str) {
        String str2;
        if (this.O == c.RC_CLIENT) {
            str2 = "rc_client_http";
        } else {
            str2 = "kotlin_api";
        }
        Long l = (Long) this.X.remove(Long.valueOf(j));
        if (l == null) {
            J0("runtime_submit_orphan", new ti4("entity_type", "achievement"), new ti4("entity_id", Long.valueOf(j)), new ti4("result", str), new ti4("submit_path", str2));
            return;
        }
        ti4 ti4Var = new ti4("entity_type", "achievement");
        ti4 ti4Var2 = new ti4("entity_id", Long.valueOf(j));
        ti4 ti4Var3 = new ti4("result", str);
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        J0("runtime_submit_resolved", ti4Var, ti4Var2, ti4Var3, new ti4("latency_ms", Long.valueOf(currentTimeMillis)), new ti4("submit_path", str2));
    }

    public final void k1(rg5 rg5Var) {
        ee6 ee6Var;
        Object value;
        Object obj;
        this.n1 = rg5Var;
        ee6 ee6Var2 = this.v0;
        ee6Var2.getClass();
        ee6Var2.l(null, rg5Var);
        do {
            ee6Var = this.p0;
            value = ee6Var.getValue();
            obj = (wt1) value;
            if (obj instanceof st1) {
                obj = new st1(rg5Var);
            }
        } while (!ee6Var.j(value, obj));
    }

    public final void l0(long j, String str) {
        Long l = (Long) this.Y.remove(Long.valueOf(j));
        if (l == null) {
            J0("runtime_submit_orphan", new ti4("entity_type", "leaderboard"), new ti4("entity_id", Long.valueOf(j)), new ti4("result", str), new ti4("submit_path", "kotlin_api"));
            return;
        }
        ti4 ti4Var = new ti4("entity_type", "leaderboard");
        ti4 ti4Var2 = new ti4("entity_id", Long.valueOf(j));
        ti4 ti4Var3 = new ti4("result", str);
        long currentTimeMillis = System.currentTimeMillis() - l.longValue();
        if (currentTimeMillis < 0) {
            currentTimeMillis = 0;
        }
        J0("runtime_submit_resolved", ti4Var, ti4Var2, ti4Var3, new ti4("latency_ms", Long.valueOf(currentTimeMillis)), new ti4("submit_path", "kotlin_api"));
    }

    public final void l1(mi2 mi2Var) {
        st1 st1Var;
        rg5 rg5Var;
        Object value = this.p0.getValue();
        if (value instanceof st1) {
            st1Var = (st1) value;
        } else {
            st1Var = null;
        }
        if (st1Var != null && (rg5Var = st1Var.a) != null) {
            rg5 a2 = rg5.a(rg5Var, null, null, (ti5) mi2Var.n(rg5Var.f), null, false, null, 0L, false, 8159);
            ((d72) this.e).y(rg5Var, a2.f);
            k1(a2);
            tq5.w(this.z, null, null, new uv1(this, a2, null, 4), 3);
        }
    }

    public final jm4 m0() {
        kd6 kd6Var = this.d0;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.d0 = null;
        q60 q60Var = this.e0;
        if (q60Var != null) {
            q60Var.h(null);
        }
        this.e0 = null;
        mx2 mx2Var = this.f0;
        synchronized (mx2Var) {
            mx2Var.A = false;
        }
        q35 q35Var = this.c0;
        if (q35Var != null) {
            synchronized (q35Var.d) {
                if (!q35Var.g) {
                    q35Var.g = true;
                    gs0 gs0Var = q35Var.e;
                    kd6 kd6Var2 = q35Var.f;
                    q35Var.e = null;
                    q35Var.f = null;
                    CancellationException cancellationException = new CancellationException("Pending submission coordinator closed");
                    if (gs0Var != null) {
                        gs0Var.t(cancellationException);
                    }
                    if (kd6Var2 != null) {
                        kd6Var2.i(cancellationException);
                    }
                }
            }
        }
        this.c0 = null;
        jm4 jm4Var = this.b0;
        this.b0 = null;
        this.Q0.k(null);
        this.i0.k(null);
        mx2 mx2Var2 = this.g0;
        synchronized (mx2Var2) {
            mx2Var2.A = false;
        }
        return jm4Var;
    }

    public final void n0(String str) {
        jm4 m0 = m0();
        kd6 kd6Var = this.E;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        kd6 kd6Var2 = this.F;
        if (kd6Var2 != null) {
            kd6Var2.i(null);
        }
        this.F = null;
        this.Z.c();
        this.a0.k();
        this.F0.p(r05.a);
        i1(str);
        this.N = null;
        this.O = c.DISABLED;
        this.w.d = false;
        this.W.clear();
        this.X.clear();
        this.Y.clear();
        if (m0 != null) {
            tq5.w(ua7.a(this), null, null, new a0(m0, this, str, (j11) null, 26), 3);
        }
    }

    public final Object o0(k11 k11Var) {
        String str;
        synchronized (this.P) {
            str = this.R;
        }
        if (str == null) {
            return new Integer(0);
        }
        return this.o0.d(str, k11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r6 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.fw1
            if (r0 == 0) goto L13
            r0 = r6
            fw1 r0 = (defpackage.fw1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            fw1 r0 = new fw1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.me2.a0(r6)
            return r6
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L31:
            defpackage.me2.a0(r6)
            goto L4b
        L35:
            defpackage.me2.a0(r6)
            java.lang.Object r6 = r5.P
            monitor-enter(r6)
            java.lang.String r2 = r5.R     // Catch: java.lang.Throwable -> L62
            monitor-exit(r6)
            hq2 r5 = r5.o0
            if (r2 != 0) goto L58
            r0.Y = r4
            java.lang.Object r6 = r5.f(r0)
            if (r6 != r1) goto L4b
            goto L60
        L4b:
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r6.intValue()
            zp2 r6 = new zp2
            r0 = 0
            r6.<init>(r0, r5)
            return r6
        L58:
            r0.Y = r3
            java.lang.Object r5 = r5.e(r2, r0)
            if (r5 != r1) goto L61
        L60:
            return r1
        L61:
            return r5
        L62:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.p0(k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q0(java.util.List r17, defpackage.k11 r18) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.q0(java.util.List, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r0(long r17, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.r0(long, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s0(defpackage.jb4 r26, defpackage.lb4 r27, defpackage.j11 r28) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.s0(jb4, lb4, j11):java.lang.Object");
    }

    public final void t0(boolean z) {
        int i;
        q45 q45Var;
        yl4 yl4Var;
        jm4 jm4Var = this.b0;
        if (jm4Var != null && (q45Var = jm4Var.i) != null && (yl4Var = (yl4) q45Var.A.getValue()) != null) {
            i = yl4Var.c.a;
        } else {
            i = 0;
        }
        if (i > 0) {
            S0(c35.RESUMABLE_SESSION);
            return;
        }
        if (!z) {
            tf0 tf0Var = this.x;
            if (!((Collection) ((ee6) tf0Var.Z).getValue()).isEmpty()) {
                this.T0.p(iu1.a);
                ((q60) tf0Var.c0).c(o27.a);
                return;
            }
        }
        S0(c35.RESUMABLE_SESSION);
    }

    public final void u0() {
        fv1 fv1Var = this.M;
        if (fv1Var == null) {
            return;
        }
        this.M = null;
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis - fv1Var.g;
        long j2 = 0;
        if (j >= 0) {
            j2 = j;
        }
        tq5.w(ua7.a(this), null, null, new ow1(this, fv1Var, currentTimeMillis, j2, null, 1), 3);
    }

    public final Object v0(rg5 rg5Var, k11 k11Var) {
        bb1 bb1Var = tg1.a;
        return tq5.G(ha1.L, new vw1(this, rg5Var, null, 0), k11Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        if (p0(r4) == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
        if (r1.b(r15, r4) != r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0178, code lost:
        if (r1.b(r14, r4) != r5) goto L12;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w0(defpackage.dy4 r13, defpackage.x15 r14, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.w0(dy4, x15, k11):java.lang.Object");
    }

    public final boolean x0() {
        jm4 jm4Var;
        RARuntimeBridgeConfig rARuntimeBridgeConfig = this.N;
        if (rARuntimeBridgeConfig != null && (jm4Var = this.b0) != null && this.O == c.RC_CLIENT && rARuntimeBridgeConfig.getRuntimeMode() == RARuntimeBridgeMode.RC_CLIENT_ONLINE && rARuntimeBridgeConfig.getHardcoreEnabled() && this.w.a && this.J && !((yl4) jm4Var.i.A.getValue()).d && Q0(jm4Var.a)) {
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(defpackage.rg5 r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.kx1
            if (r0 == 0) goto L13
            r0 = r6
            kx1 r0 = (defpackage.kx1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kx1 r0 = new kx1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            rg5 r5 = r0.R
            defpackage.me2.a0(r6)
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r6)
            r0.R = r5
            r0.Z = r3
            ud5 r6 = r4.g
            dl r6 = (defpackage.dl) r6
            java.lang.Object r6 = r6.s(r0)
            if (r6 != r1) goto L42
            return r1
        L42:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L67
            w16 r4 = r4.c
            b56 r4 = (defpackage.b56) r4
            android.content.SharedPreferences r4 = r4.b
            java.lang.String r6 = "ra_enabled"
            boolean r4 = r4.getBoolean(r6, r3)
            if (r4 == 0) goto L67
            ti5 r4 = r5.f
            java.lang.Boolean r4 = r4.o
            if (r4 == 0) goto L63
            boolean r4 = r4.booleanValue()
            goto L64
        L63:
            r4 = r3
        L64:
            if (r4 == 0) goto L67
            goto L68
        L67:
            r3 = 0
        L68:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv1.y0(rg5, k11):java.lang.Object");
    }

    public final void z0(ln2 ln2Var) {
        if (ln2Var instanceof kc3) {
            tq5.w(ua7.a(this), null, null, new vw1(this, ((kc3) ln2Var).L, null, 2), 3);
        } else if (ln2Var instanceof mc3) {
            tq5.w(ua7.a(this), null, null, new n5(this, ((mc3) ln2Var).L, (j11) null, 10), 3);
        } else if (ln2Var instanceof lc3) {
            tq5.w(ua7.a(this), null, null, new n5(this, ((lc3) ln2Var).L, (j11) null, 11), 3);
        } else if (ln2Var instanceof jc3) {
            ut1 ut1Var = new ut1(((jc3) ln2Var).L);
            ee6 ee6Var = this.p0;
            ee6Var.getClass();
            ee6Var.l(null, ut1Var);
        } else {
            i.c();
        }
    }
}
