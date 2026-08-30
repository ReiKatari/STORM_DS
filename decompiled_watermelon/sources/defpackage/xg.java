package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.preference.Preference;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;
import me.magnum.melonds.MelonDSAndroidInterface;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.domain.model.RendererConfiguration;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xg  reason: default package */
/* loaded from: classes.dex */
public final class xg implements rs1 {
    public final Context a;
    public final w16 b;
    public final bd6 c;
    public final qv5 d;
    public final ap e;
    public final pm4 f;
    public final s51 g;
    public final ht1 h;
    public final qf i;
    public final q26 j;
    public final c46 k;
    public final o45 l;
    public final c46 m;
    public final cw6 n;
    public gg o;
    public volatile boolean p;
    public final ac1 q;
    public final EmulatorMessageQueue r;

    /* JADX WARN: Type inference failed for: r3v5, types: [cw6, java.lang.Object] */
    public xg(Context context, w16 w16Var, bd6 bd6Var, qv5 qv5Var, ap apVar, pm4 pm4Var, s51 s51Var, ht1 ht1Var, qf qfVar, q26 q26Var) {
        this.a = context;
        this.b = w16Var;
        this.c = bd6Var;
        this.d = qv5Var;
        this.e = apVar;
        this.f = pm4Var;
        this.g = s51Var;
        this.h = ht1Var;
        this.i = qfVar;
        this.j = q26Var;
        c46 b = d46.b(0, Preference.DEFAULT_ORDER, null, 5);
        this.k = b;
        this.l = new o45(b);
        this.m = d46.b(0, Preference.DEFAULT_ORDER, null, 4);
        ?? obj = new Object();
        obj.a = context;
        obj.b = w16Var;
        File file = new File(context.getFilesDir(), "dldi");
        obj.d = file;
        obj.e = new File(file, "sync");
        obj.f = new File(file, "dldi_sd.img");
        obj.g = new File(file, "dldi_sync_state.json");
        this.n = obj;
        this.q = new ac1(1);
        this.r = new EmulatorMessageQueue(new a31(1, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0291 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0250 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x027e A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b1 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ee A[Catch: all -> 0x006f, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x032f A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:19:0x0060, B:83:0x0327, B:85:0x032f, B:26:0x0090, B:77:0x02e2, B:79:0x02ee, B:90:0x0353, B:92:0x0360, B:29:0x00be, B:61:0x0272, B:62:0x0278, B:64:0x027e, B:68:0x0293, B:70:0x0299, B:73:0x02b1, B:57:0x0250, B:91:0x035d), top: B:121:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.xg r56, defpackage.rg5 r57, java.util.List r58, defpackage.k11 r59) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.a(xg, rg5, java.util.List, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r1 != r3) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(me.magnum.melonds.domain.model.ConsoleType r40, defpackage.k11 r41) {
        /*
            r39 = this;
            r0 = r39
            r1 = r41
            boolean r2 = r1 instanceof defpackage.lg
            if (r2 == 0) goto L17
            r2 = r1
            lg r2 = (defpackage.lg) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            lg r2 = new lg
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            p31 r3 = defpackage.p31.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L3d
            if (r4 == r7) goto L35
            if (r4 != r6) goto L2f
            defpackage.me2.a0(r1)
            goto L99
        L2f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r5
        L35:
            me.magnum.melonds.domain.model.ConsoleType r4 = r2.R
            defpackage.me2.a0(r1)
            r25 = r4
            goto L54
        L3d:
            defpackage.me2.a0(r1)
            r1 = r40
            r2.R = r1
            r2.Z = r7
            w16 r4 = r0.b
            b56 r4 = (defpackage.b56) r4
            java.lang.Object r4 = r4.j(r2)
            if (r4 != r3) goto L51
            goto L98
        L51:
            r25 = r1
            r1 = r4
        L54:
            r7 = r1
            me.magnum.melonds.domain.model.EmulatorConfiguration r7 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r7
            r37 = 134086652(0x7fdfffc, float:3.8217663E-34)
            r38 = 0
            r8 = 1
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38)
            r2.R = r5
            r2.Z = r6
            java.lang.Object r1 = r0.c(r1, r2)
            if (r1 != r3) goto L99
        L98:
            return r3
        L99:
            me.magnum.melonds.domain.model.EmulatorConfiguration r1 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.b(me.magnum.melonds.domain.model.ConsoleType, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(me.magnum.melonds.domain.model.EmulatorConfiguration r38, defpackage.k11 r39) {
        /*
            r37 = this;
            r0 = r37
            r1 = r38
            r2 = r39
            boolean r3 = r2 instanceof defpackage.mg
            if (r3 == 0) goto L19
            r3 = r2
            mg r3 = (defpackage.mg) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Z = r4
            goto L1e
        L19:
            mg r3 = new mg
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.X
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L30
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = r3.R
            defpackage.me2.a0(r2)
            r5 = r0
            goto L52
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            r0 = 0
            return r0
        L37:
            defpackage.me2.a0(r2)
            me.magnum.melonds.domain.model.MicSource r2 = r1.getMicSource()
            me.magnum.melonds.domain.model.MicSource r5 = me.magnum.melonds.domain.model.MicSource.DEVICE
            if (r2 != r5) goto L93
            r3.R = r1
            r3.Z = r6
            pm4 r0 = r0.f
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            java.lang.Object r2 = r0.a(r2, r3)
            if (r2 != r4) goto L51
            return r4
        L51:
            r5 = r1
        L52:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            if (r0 != 0) goto L92
            me.magnum.melonds.domain.model.MicSource r29 = me.magnum.melonds.domain.model.MicSource.NONE
            r35 = 260046847(0xf7fffff, float:1.2621774E-29)
            r36 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            me.magnum.melonds.domain.model.EmulatorConfiguration r0 = me.magnum.melonds.domain.model.EmulatorConfiguration.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r35, r36)
            return r0
        L92:
            return r5
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.c(me.magnum.melonds.domain.model.EmulatorConfiguration, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x011d, code lost:
        if (r2 == r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011f, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.rg5 r42, defpackage.k11 r43) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.d(rg5, k11):java.lang.Object");
    }

    public final void e(String str, long j, long j2, long j3, String str2) {
        if (!this.p) {
            return;
        }
        String obj = zg6.Z0(str2).toString();
        StringBuilder sb = new StringBuilder("event_type=jni_event_received jni_event=");
        sb.append(str);
        sb.append(" leaderboard_id=");
        sb.append(j);
        ej6.k(sb, " attempt_id=", j2, " event_sequence=");
        sb.append(j3);
        sb.append(" ");
        sb.append(obj);
        Log.i("RASubmission", sb.toString());
    }

    public final void f() {
        MelonEmulator.a.pauseEmulation();
    }

    public final boolean g(EmulatorConfiguration emulatorConfiguration) {
        RendererConfiguration rendererConfiguration = emulatorConfiguration.getRendererConfiguration();
        ue5 retroArchShader = rendererConfiguration.getRetroArchShader();
        VideoRenderer renderer = rendererConfiguration.getRenderer();
        VideoFiltering videoFiltering = rendererConfiguration.getVideoFiltering();
        String str = retroArchShader.a;
        if (str == null) {
            str = "<none>";
        }
        lf5 lf5Var = retroArchShader.b;
        int i = retroArchShader.c;
        long j = retroArchShader.d;
        boolean z = retroArchShader.f;
        Log.i("AndroidEmulatorManager", "RetroArchShaderLaunch: renderer=" + renderer + " filter=" + videoFiltering + " preset=" + str + " source=" + lf5Var + " passes=" + i + " sourceBytes=" + j + " clearHistory=" + z);
        if (emulatorConfiguration.getRendererConfiguration().getRenderer() != VideoRenderer.VULKAN) {
            return true;
        }
        ue5 retroArchShader2 = emulatorConfiguration.getRendererConfiguration().getRetroArchShader();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int ordinal = emulatorConfiguration.getRendererConfiguration().getVideoFiltering().ordinal();
        String str2 = retroArchShader2.a;
        String lowerCase = retroArchShader2.b.name().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        boolean precompileVulkanPipelines = MelonEmulator.a.precompileVulkanPipelines(ordinal, str2, lowerCase, retroArchShader2.c, retroArchShader2.e);
        String str3 = retroArchShader2.a;
        if (precompileVulkanPipelines && str3 != null) {
            this.j.a(str3, p26.VULKAN, SystemClock.elapsedRealtime() - elapsedRealtime);
        }
        return precompileVulkanPipelines;
    }

    public final Object h(boolean z, nk6 nk6Var) {
        Object G = tq5.G(tg1.a, new sg(z, null), nk6Var);
        if (G == p31.COROUTINE_SUSPENDED) {
            return G;
        }
        return o27.a;
    }

    public final void i(EmulatorConfiguration emulatorConfiguration) {
        if (emulatorConfiguration.getRendererConfiguration().getRenderer() == VideoRenderer.VULKAN) {
            String str = this.a.getApplicationInfo().nativeLibraryDir;
            str.getClass();
            MelonDSAndroidInterface.a.b(((b56) this.b).x(str));
        }
        qv5 qv5Var = this.d;
        ByteBuffer byteBuffer = qv5Var.a;
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocateDirect(393216).order(ByteOrder.nativeOrder());
            qv5Var.a = byteBuffer;
            byteBuffer.getClass();
        }
        MelonEmulator.a.setupEmulator(emulatorConfiguration, this.g, byteBuffer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (defpackage.tq5.G(r11, r5, r0) != r1) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.ak2 r12, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r13, defpackage.k11 r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.tg
            if (r0 == 0) goto L13
            r0 = r14
            tg r0 = (defpackage.tg) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            tg r0 = new tg
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2f
            xg r11 = r0.Y
            java.lang.String r11 = (java.lang.String) r11
            defpackage.me2.a0(r14)
            goto L97
        L2f:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r11)
            r11 = 0
            return r11
        L36:
            xg r12 = r0.Y
            me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig r13 = r0.X
            ak2 r2 = r0.R
            defpackage.me2.a0(r14)
            r6 = r2
        L40:
            r8 = r13
            goto L64
        L42:
            defpackage.me2.a0(r14)
            ac1 r14 = r11.q
            r14.k()
            w16 r14 = r11.b
            b56 r14 = (defpackage.b56) r14
            ln0 r14 = r14.A()
            r0.R = r12
            r0.X = r13
            r0.Y = r11
            r0.d0 = r4
            java.lang.Object r14 = defpackage.se.w(r14, r0)
            if (r14 != r1) goto L61
            goto L96
        L61:
            r6 = r12
            r12 = r11
            goto L40
        L64:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            boolean r13 = defpackage.b53.x(r14, r13)
            r12.p = r13
            w16 r11 = r11.b
            b56 r11 = (defpackage.b56) r11
            android.content.SharedPreferences r11 = r11.b
            java.lang.String r12 = "ra_rich_presence"
            boolean r11 = r11.getBoolean(r12, r4)
            r9 = 0
            if (r11 == 0) goto L7f
            java.lang.String r11 = r6.e
            r7 = r11
            goto L80
        L7f:
            r7 = r9
        L80:
            bb1 r11 = defpackage.tg1.a
            ug r5 = new ug
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r0.R = r9
            r0.X = r9
            r0.Y = r9
            r0.d0 = r3
            java.lang.Object r11 = defpackage.tq5.G(r11, r5, r0)
            if (r11 != r1) goto L97
        L96:
            return r1
        L97:
            o27 r11 = defpackage.o27.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.j(ak2, me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(me.magnum.melonds.domain.model.ConsoleType r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.vg
            if (r0 == 0) goto L13
            r0 = r6
            vg r0 = (defpackage.vg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            vg r0 = new vg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r6)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.b(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r4 = me.magnum.melonds.MelonEmulator.a
            r4.updateEmulatorConfiguration(r6)
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.k(me.magnum.melonds.domain.model.ConsoleType, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.rg5 r5, defpackage.k11 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.wg
            if (r0 == 0) goto L13
            r0 = r6
            wg r0 = (defpackage.wg) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            wg r0 = new wg
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r6)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r6)
            r0.Y = r3
            java.lang.Object r6 = r4.d(r5, r0)
            if (r6 != r1) goto L3a
            return r1
        L3a:
            me.magnum.melonds.domain.model.EmulatorConfiguration r6 = (me.magnum.melonds.domain.model.EmulatorConfiguration) r6
            me.magnum.melonds.MelonEmulator r4 = me.magnum.melonds.MelonEmulator.a
            r4.updateEmulatorConfiguration(r6)
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.l(rg5, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x013d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final me.magnum.melonds.domain.model.EmulatorConfiguration m(me.magnum.melonds.domain.model.EmulatorConfiguration r48) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg.m(me.magnum.melonds.domain.model.EmulatorConfiguration):me.magnum.melonds.domain.model.EmulatorConfiguration");
    }
}
