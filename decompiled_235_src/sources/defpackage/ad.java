package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.debug.ReleaseStateCommandReceiver;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.domain.model.retroachievements.RARuntimeBridgeConfig;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ad  reason: default package */
/* loaded from: classes.dex */
public final class ad extends hw6 implements qn2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ad(Object obj, Object obj2, Object obj3, r41 r41Var, int i) {
        super(1, r41Var);
        this.X = i;
        this.Z = obj;
        this.d0 = obj2;
        this.e0 = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.X;
        Object obj2 = this.d0;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.e0;
        Object obj4 = this.Z;
        switch (i) {
            case 0:
                go2 go2Var = (go2) obj3;
                return new ad((dd) obj4, this.d0, go2Var, (r41) obj, 0).s(jg7Var);
            case 1:
                return new ad((sz1) obj4, (RARuntimeBridgeConfig) obj2, (nv4) obj3, (r41) obj, 1).s(jg7Var);
            case 2:
                return new ad((ft4) obj4, (c97) obj2, (eo2) obj3, (r41) obj, 2).s(jg7Var);
            case 3:
                return new ad((ReleaseStateCommandReceiver) obj4, (Context) obj2, (Intent) obj3, (r41) obj, 3).s(jg7Var);
            case 4:
                return new ad((ri7) obj4, (ki7) obj2, (List) obj3, (r41) obj, 4).s(jg7Var);
            default:
                return new ad((ri7) obj4, (kd0) obj2, (Map) obj3, (r41) obj, 5).s(jg7Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0398, code lost:
        if (r2.equals("software") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x03ad, code lost:
        if (r2.equals("soft") != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x03af, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.SOFTWARE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x03b8, code lost:
        if (r2.equals("vk") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x03c1, code lost:
        if (r2.equals("gl") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x03ca, code lost:
        if (r2.equals("vulkan") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03cd, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x03d6, code lost:
        if (r2.equals("opengl") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x03da, code lost:
        r2 = me.magnum.melonds.domain.model.VideoRenderer.OPENGL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0575, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x09cb, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x09e1, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0a3b, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0a51, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0a67, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0a7d, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0a93, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0b66, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0b7c, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:456:0x0b92, code lost:
        if (r0 == defpackage.x61.COROUTINE_SUSPENDED) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01e6, code lost:
        if (r0.equals("enabled") == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0be8  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0200  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        int i;
        int i2;
        int i3;
        boolean z;
        jg7 jg7Var;
        x61 x61Var;
        Intent intent;
        String str;
        Object obj2;
        x61 x61Var2;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Float f;
        Object obj3;
        Float U;
        Integer num;
        Integer num2;
        Integer num3;
        VideoRenderer videoRenderer;
        Process start;
        InputStream inputStream;
        String lowerCase;
        int hashCode;
        int i17 = this.X;
        jg7 jg7Var2 = jg7.a;
        Object obj4 = this.e0;
        Object obj5 = this.d0;
        Object obj6 = this.Z;
        switch (i17) {
            case 0:
                dd ddVar = (dd) obj6;
                x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                int i18 = this.Y;
                if (i18 != 0) {
                    if (i18 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ddVar.l.setValue(obj5);
                    wc wcVar = new wc(ddVar, 4);
                    b0 b0Var = new b0((go2) obj4, ddVar, null, 5);
                    this.Y = 1;
                    if (mb3.p(wcVar, b0Var, this) == x61Var3) {
                        return x61Var3;
                    }
                }
                return jg7Var2;
            case 1:
                x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                int i19 = this.Y;
                if (i19 != 0) {
                    if (i19 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Serializable O = sz1.O((sz1) obj6, (RARuntimeBridgeConfig) obj5, (nv4) obj4, this);
                if (O != x61Var4) {
                    return O;
                }
                return x61Var4;
            case 2:
                x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                int i20 = this.Y;
                if (i20 != 0) {
                    if (i20 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                this.Y = 1;
                Object e = ((ft4) obj6).e((c97) obj5, (eo2) obj4, this);
                if (e != x61Var5) {
                    return e;
                }
                return x61Var5;
            case 3:
                x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                int i21 = this.Y;
                if (i21 != 0) {
                    if (i21 == 1) {
                        oi2.Y(obj);
                        return jg7Var2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ReleaseStateCommandReceiver releaseStateCommandReceiver = (ReleaseStateCommandReceiver) obj6;
                Context applicationContext = ((Context) obj5).getApplicationContext();
                applicationContext.getClass();
                Intent intent2 = (Intent) obj4;
                this.Y = 1;
                o41 o41Var = ReleaseStateCommandReceiver.a;
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    sb1 sb1Var = (sb1) ((gc1) hv.D(applicationContext2, gc1.class));
                    boolean z2 = sb1Var.a().getBoolean("video_renderer_debug_tools_enabled", false);
                    try {
                        start = new ProcessBuilder("/system/bin/getprop", "debug.melonds.release_state_commands").redirectErrorStream(true).start();
                        inputStream = start.getInputStream();
                        inputStream.getClass();
                        i = 4;
                    } catch (Exception e2) {
                        e = e2;
                        i = 4;
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, qm0.a), 8192);
                        String obj7 = qs6.T0(yh2.E(bufferedReader)).toString();
                        bufferedReader.close();
                        start.waitFor();
                        Locale locale = Locale.US;
                        locale.getClass();
                        lowerCase = obj7.toLowerCase(locale);
                        lowerCase.getClass();
                        hashCode = lowerCase.hashCode();
                    } catch (Exception e3) {
                        e = e3;
                        Log.w("DebugCommand", "Failed to read system property key=debug.melonds.release_state_commands", e);
                        i2 = 0;
                        if (i2 != 0) {
                        }
                        Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                        obj2 = jg7Var;
                        x61Var2 = x61Var;
                        if (obj2 != x61Var2) {
                        }
                    }
                    if (hashCode == -1609594047) {
                        break;
                    } else if (hashCode != 49) {
                        if (hashCode != 3551) {
                            if (hashCode != 119527) {
                                if (hashCode == 3569038) {
                                    if (!lowerCase.equals("true")) {
                                    }
                                    i2 = 1;
                                    if (i2 != 0) {
                                        jg7Var = jg7Var2;
                                        x61Var = x61Var6;
                                        i3 = i2;
                                        z = z2;
                                        if (z) {
                                            str2 = "WAIT_ROM_READY";
                                            str3 = "LAUNCH_ROM";
                                            str4 = "DUMP_RENDERER_CAPTURE";
                                            str5 = "STEP_FRAMES";
                                            str6 = "STEP_FRAME";
                                            str7 = "SET_DEBUG_PAUSE";
                                        } else {
                                            String action = intent2.getAction();
                                            if (nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_DEBUG_TOOLS")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_IR")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_ROM_RUNTIME_CONSOLE")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_RETROACHIEVEMENTS")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_FAST_FORWARD")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_FRAME_LIMIT_SPEED")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_JIT")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "GET_FPS")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_BGOBJ_LOG")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_2D_DEBUG_CONTROLS")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_3D_DEBUG_CONTROLS")) || nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "LAUNCH_ROM"))) {
                                                str4 = "DUMP_RENDERER_CAPTURE";
                                                str5 = "STEP_FRAMES";
                                                str6 = "STEP_FRAME";
                                                str7 = "SET_DEBUG_PAUSE";
                                                str2 = "WAIT_ROM_READY";
                                                str3 = "LAUNCH_ROM";
                                            } else {
                                                str3 = "LAUNCH_ROM";
                                                if (!nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "WAIT_ROM_READY"))) {
                                                    str2 = "WAIT_ROM_READY";
                                                    if (nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "SET_DEBUG_PAUSE"))) {
                                                        str4 = "DUMP_RENDERER_CAPTURE";
                                                        str5 = "STEP_FRAMES";
                                                        str6 = "STEP_FRAME";
                                                        str7 = "SET_DEBUG_PAUSE";
                                                    } else {
                                                        str7 = "SET_DEBUG_PAUSE";
                                                        if (!nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "STEP_FRAME"))) {
                                                            str6 = "STEP_FRAME";
                                                            if (!nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, "STEP_FRAMES"))) {
                                                                str4 = "DUMP_RENDERER_CAPTURE";
                                                                str5 = "STEP_FRAMES";
                                                                if (!nb3.k(action, ReleaseStateCommandReceiver.a(applicationContext, str4))) {
                                                                    str = "DebugCommand";
                                                                    intent = intent2;
                                                                }
                                                            } else {
                                                                str4 = "DUMP_RENDERER_CAPTURE";
                                                                str5 = "STEP_FRAMES";
                                                            }
                                                        } else {
                                                            str6 = "STEP_FRAME";
                                                            str4 = "DUMP_RENDERER_CAPTURE";
                                                            str5 = "STEP_FRAMES";
                                                        }
                                                    }
                                                } else {
                                                    str2 = "WAIT_ROM_READY";
                                                    str4 = "DUMP_RENDERER_CAPTURE";
                                                    str5 = "STEP_FRAMES";
                                                    str6 = "STEP_FRAME";
                                                    str7 = "SET_DEBUG_PAUSE";
                                                }
                                            }
                                        }
                                        String action2 = intent2.getAction();
                                        Object obj8 = "unchanged";
                                        if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER"))) {
                                            String d = ReleaseStateCommandReceiver.d(intent2, "renderer", "value");
                                            if (d != null) {
                                                String obj9 = qs6.T0(d).toString();
                                                Locale locale2 = Locale.US;
                                                locale2.getClass();
                                                String lowerCase2 = obj9.toLowerCase(locale2);
                                                lowerCase2.getClass();
                                                switch (lowerCase2.hashCode()) {
                                                    case -1010579281:
                                                        break;
                                                    case -805352149:
                                                        break;
                                                    case 3301:
                                                        break;
                                                    case 3765:
                                                        break;
                                                    case 3535914:
                                                        break;
                                                    case 950503479:
                                                        if (lowerCase2.equals("compute")) {
                                                            videoRenderer = VideoRenderer.COMPUTE;
                                                            break;
                                                        }
                                                        videoRenderer = null;
                                                        break;
                                                    case 1319330215:
                                                        break;
                                                    default:
                                                        videoRenderer = null;
                                                        break;
                                                }
                                                if (videoRenderer != null) {
                                                    String str8 = "fastpath";
                                                    Boolean b = ReleaseStateCommandReceiver.b(intent2, "fastpath_enabled", "fastpath");
                                                    SharedPreferences.Editor edit = sb1Var.a().edit();
                                                    String lowerCase3 = videoRenderer.name().toLowerCase(locale2);
                                                    lowerCase3.getClass();
                                                    edit.putString("video_renderer", lowerCase3);
                                                    if (b != null) {
                                                        edit.putBoolean("video_vulkan_fastpath_enabled", b.booleanValue());
                                                    }
                                                    edit.commit();
                                                    lc1 lc1Var = lc1.a;
                                                    boolean c = lc1.c();
                                                    if (b == null) {
                                                        str8 = "unchanged";
                                                    } else if (!b.booleanValue()) {
                                                        str8 = "compatibility";
                                                    }
                                                    String lowerCase4 = videoRenderer.name().toLowerCase(locale2);
                                                    lowerCase4.getClass();
                                                    if (b != null) {
                                                        obj8 = Integer.valueOf(b.booleanValue() ? 1 : 0);
                                                    }
                                                    StringBuilder u = i61.u("action=set_renderer mode=release renderer=", lowerCase4, " profile=", str8, " fastPath=");
                                                    u.append(obj8);
                                                    u.append(" applies=next_session refreshed=");
                                                    u.append(c ? 1 : 0);
                                                    Log.w("DebugCommand", u.toString());
                                                    obj2 = jg7Var;
                                                } else {
                                                    i.h("Unsupported renderer=".concat(d));
                                                }
                                            } else {
                                                i.h("Missing renderer extra");
                                            }
                                        } else {
                                            String str9 = str4;
                                            if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_DEBUG_TOOLS"))) {
                                                Boolean b2 = ReleaseStateCommandReceiver.b(intent2, "enabled", "value");
                                                if (b2 != null) {
                                                    boolean booleanValue = b2.booleanValue();
                                                    Boolean b3 = ReleaseStateCommandReceiver.b(intent2, "latch_trace_enabled");
                                                    SharedPreferences.Editor edit2 = sb1Var.a().edit();
                                                    edit2.putBoolean("video_renderer_debug_tools_enabled", booleanValue);
                                                    if (b3 != null) {
                                                        edit2.putBoolean("video_renderer_debug_latch_trace_enabled", b3.booleanValue());
                                                    }
                                                    edit2.commit();
                                                    lc1 lc1Var2 = lc1.a;
                                                    boolean c2 = lc1.c();
                                                    if (b3 == null) {
                                                        num3 = "unchanged";
                                                    } else {
                                                        num3 = Integer.valueOf(b3.booleanValue() ? 1 : 0);
                                                    }
                                                    Log.w("DebugCommand", "action=set_renderer_debug_tools mode=release enabled=" + (booleanValue ? 1 : 0) + " latchTrace=" + num3 + " refreshed=" + (c2 ? 1 : 0));
                                                    obj2 = jg7Var;
                                                } else {
                                                    i.h("Missing enabled extra");
                                                }
                                            } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_IR"))) {
                                                Integer c3 = ReleaseStateCommandReceiver.c(intent2, "scale", "ir", "value");
                                                if (c3 != null) {
                                                    int intValue = c3.intValue();
                                                    if (1 <= intValue && intValue < 9) {
                                                        SharedPreferences.Editor edit3 = sb1Var.a().edit();
                                                        edit3.putString("video_internal_resolution", String.valueOf(intValue));
                                                        edit3.commit();
                                                        lc1 lc1Var3 = lc1.a;
                                                        Log.w("DebugCommand", "action=set_ir mode=release scale=" + intValue + " refreshed=" + (lc1.c() ? 1 : 0));
                                                        obj2 = jg7Var;
                                                    } else {
                                                        i.f(lb1.g(intValue, "Unsupported internal resolution="));
                                                    }
                                                } else {
                                                    i.h("Missing internal resolution extra");
                                                }
                                            } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_ROM_RUNTIME_CONSOLE"))) {
                                                obj2 = releaseStateCommandReceiver.k(sb1Var, intent2, this);
                                                break;
                                            } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_RETROACHIEVEMENTS"))) {
                                                Boolean b4 = ReleaseStateCommandReceiver.b(intent2, "ra_enabled", "enabled");
                                                Boolean b5 = ReleaseStateCommandReceiver.b(intent2, "ra_hardcore_enabled", "hardcore_enabled", "hardcore");
                                                if (b4 == null && b5 == null) {
                                                    i.h("Missing RetroAchievements setting extra");
                                                } else {
                                                    SharedPreferences.Editor edit4 = sb1Var.a().edit();
                                                    if (b4 != null) {
                                                        edit4.putBoolean("ra_enabled", b4.booleanValue());
                                                    }
                                                    if (b5 != null) {
                                                        edit4.putBoolean("ra_hardcore_enabled", b5.booleanValue());
                                                    }
                                                    edit4.commit();
                                                    lc1 lc1Var4 = lc1.a;
                                                    boolean c4 = lc1.c();
                                                    if (b4 == null) {
                                                        num = "unchanged";
                                                    } else {
                                                        num = Integer.valueOf(b4.booleanValue() ? 1 : 0);
                                                    }
                                                    if (b5 == null) {
                                                        num2 = "unchanged";
                                                    } else {
                                                        num2 = Integer.valueOf(b5.booleanValue() ? 1 : 0);
                                                    }
                                                    Log.w("DebugCommand", "action=set_retroachievements mode=release enabled=" + num + " hardcore=" + num2 + " refreshed=" + (c4 ? 1 : 0));
                                                    obj2 = jg7Var;
                                                }
                                            } else {
                                                boolean k = nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_FAST_FORWARD"));
                                                MelonEmulator melonEmulator = MelonEmulator.a;
                                                if (k) {
                                                    Boolean b6 = ReleaseStateCommandReceiver.b(intent2, "enabled", "value");
                                                    if (b6 != null) {
                                                        boolean booleanValue2 = b6.booleanValue();
                                                        melonEmulator.setFastForwardEnabled(booleanValue2);
                                                        Log.w("DebugCommand", "action=set_fast_forward mode=release enabled=" + (booleanValue2 ? 1 : 0));
                                                        obj2 = jg7Var;
                                                    } else {
                                                        i.h("Missing enabled extra");
                                                    }
                                                } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_FRAME_LIMIT_SPEED"))) {
                                                    String[] strArr = {"multiplier", "speed", "value"};
                                                    int i22 = 0;
                                                    while (true) {
                                                        if (i22 < 3) {
                                                            String str10 = strArr[i22];
                                                            if (intent2.hasExtra(str10)) {
                                                                Bundle extras = intent2.getExtras();
                                                                if (extras != null) {
                                                                    obj3 = extras.get(str10);
                                                                } else {
                                                                    obj3 = null;
                                                                }
                                                                if (obj3 instanceof Float) {
                                                                    f = (Float) obj3;
                                                                } else if (obj3 instanceof Double) {
                                                                    f = Float.valueOf((float) ((Number) obj3).doubleValue());
                                                                } else if (obj3 instanceof Integer) {
                                                                    f = Float.valueOf(((Number) obj3).intValue());
                                                                } else if ((obj3 instanceof String) && (U = ws6.U((String) obj3)) != null) {
                                                                    f = Float.valueOf(U.floatValue());
                                                                }
                                                            }
                                                            i22++;
                                                        } else {
                                                            f = null;
                                                        }
                                                    }
                                                    if (f != null) {
                                                        float floatValue = f.floatValue();
                                                        if (0.25f <= floatValue && floatValue <= 1.0f) {
                                                            SharedPreferences.Editor edit5 = sb1Var.a().edit();
                                                            edit5.putString("frame_limit_speed_multiplier", String.valueOf(floatValue));
                                                            edit5.commit();
                                                            melonEmulator.setFrameLimitSpeedMultiplier(floatValue);
                                                            lc1 lc1Var5 = lc1.a;
                                                            Log.w("DebugCommand", "action=set_frame_limit_speed mode=release multiplier=" + floatValue + " refreshed=" + (lc1.c() ? 1 : 0));
                                                            obj2 = jg7Var;
                                                        } else {
                                                            throw new IllegalArgumentException(("Unsupported frame limit speed=" + floatValue).toString());
                                                        }
                                                    } else {
                                                        i.h("Missing frame limit speed extra");
                                                    }
                                                } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_JIT"))) {
                                                    Boolean b7 = ReleaseStateCommandReceiver.b(intent2, "enabled", "value");
                                                    if (b7 != null) {
                                                        boolean booleanValue3 = b7.booleanValue();
                                                        SharedPreferences.Editor edit6 = sb1Var.a().edit();
                                                        edit6.putBoolean("enable_jit", booleanValue3);
                                                        edit6.commit();
                                                        lc1 lc1Var6 = lc1.a;
                                                        Log.w("DebugCommand", "action=set_jit mode=release enabled=" + (booleanValue3 ? 1 : 0) + " refreshed=" + (lc1.c() ? 1 : 0));
                                                        obj2 = jg7Var;
                                                    } else {
                                                        i.h("Missing enabled extra");
                                                    }
                                                } else {
                                                    if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "GET_FPS"))) {
                                                        Log.w("DebugCommand", "action=get_fps mode=release fps=" + melonEmulator.getFPS());
                                                    } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_BGOBJ_LOG"))) {
                                                        Boolean b8 = ReleaseStateCommandReceiver.b(intent2, "enabled", "value");
                                                        if (b8 != null) {
                                                            boolean booleanValue4 = b8.booleanValue();
                                                            SharedPreferences.Editor edit7 = sb1Var.a().edit();
                                                            edit7.putBoolean("video_renderer_debug_bgobj_enabled", booleanValue4);
                                                            edit7.commit();
                                                            lc1 lc1Var7 = lc1.a;
                                                            Log.w("DebugCommand", "action=set_bgobj_log mode=release enabled=" + (booleanValue4 ? 1 : 0) + " refreshed=" + (lc1.c() ? 1 : 0));
                                                        } else {
                                                            i.h("Missing enabled extra");
                                                        }
                                                    } else {
                                                        int i23 = 524287;
                                                        if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_2D_DEBUG_CONTROLS"))) {
                                                            RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
                                                            int[] renderer2DDebugControls = rendererDebugBridge.getRenderer2DDebugControls();
                                                            if (renderer2DDebugControls == null || renderer2DDebugControls.length < 13) {
                                                                renderer2DDebugControls = new int[13];
                                                                renderer2DDebugControls[0] = -1;
                                                                renderer2DDebugControls[1] = -1;
                                                                renderer2DDebugControls[2] = -1;
                                                                renderer2DDebugControls[3] = -1;
                                                                renderer2DDebugControls[i] = 0;
                                                                renderer2DDebugControls[5] = 0;
                                                                renderer2DDebugControls[6] = 0;
                                                                renderer2DDebugControls[7] = 0;
                                                                renderer2DDebugControls[8] = 0;
                                                                renderer2DDebugControls[9] = 0;
                                                                renderer2DDebugControls[10] = 0;
                                                                renderer2DDebugControls[11] = 0;
                                                                renderer2DDebugControls[12] = 524287;
                                                            }
                                                            Integer c5 = ReleaseStateCommandReceiver.c(intent2, "feature_mask");
                                                            if (c5 != null) {
                                                                i4 = c5.intValue();
                                                            } else {
                                                                i4 = renderer2DDebugControls[12];
                                                            }
                                                            int i24 = i4;
                                                            Integer c6 = ReleaseStateCommandReceiver.c(intent2, "main_forced_mode");
                                                            if (c6 != null) {
                                                                i5 = c6.intValue();
                                                            } else {
                                                                i5 = renderer2DDebugControls[0];
                                                            }
                                                            int i25 = i5;
                                                            Integer c7 = ReleaseStateCommandReceiver.c(intent2, "sub_forced_mode");
                                                            if (c7 != null) {
                                                                i6 = c7.intValue();
                                                            } else {
                                                                i6 = renderer2DDebugControls[1];
                                                            }
                                                            int i26 = i6;
                                                            Integer c8 = ReleaseStateCommandReceiver.c(intent2, "top_forced_comp_mode");
                                                            if (c8 != null) {
                                                                i7 = c8.intValue();
                                                            } else {
                                                                i7 = renderer2DDebugControls[2];
                                                            }
                                                            int i27 = i7;
                                                            Integer c9 = ReleaseStateCommandReceiver.c(intent2, "bottom_forced_comp_mode");
                                                            if (c9 != null) {
                                                                i8 = c9.intValue();
                                                            } else {
                                                                i8 = renderer2DDebugControls[3];
                                                            }
                                                            int i28 = i8;
                                                            Integer c10 = ReleaseStateCommandReceiver.c(intent2, "disabled_main_bg_mask");
                                                            if (c10 != null) {
                                                                i9 = c10.intValue();
                                                            } else {
                                                                i9 = renderer2DDebugControls[i];
                                                            }
                                                            int i29 = i9;
                                                            Integer c11 = ReleaseStateCommandReceiver.c(intent2, "disabled_sub_bg_mask");
                                                            if (c11 != null) {
                                                                i10 = c11.intValue();
                                                            } else {
                                                                i10 = renderer2DDebugControls[5];
                                                            }
                                                            int i30 = i10;
                                                            Integer c12 = ReleaseStateCommandReceiver.c(intent2, "disabled_main_bg_priority_mask");
                                                            if (c12 != null) {
                                                                i11 = c12.intValue();
                                                            } else {
                                                                i11 = renderer2DDebugControls[6];
                                                            }
                                                            int i31 = i11;
                                                            Integer c13 = ReleaseStateCommandReceiver.c(intent2, "disabled_sub_bg_priority_mask");
                                                            if (c13 != null) {
                                                                i12 = c13.intValue();
                                                            } else {
                                                                i12 = renderer2DDebugControls[7];
                                                            }
                                                            int i32 = i12;
                                                            Integer c14 = ReleaseStateCommandReceiver.c(intent2, "disabled_main_obj_priority_mask");
                                                            if (c14 != null) {
                                                                i13 = c14.intValue();
                                                            } else {
                                                                i13 = renderer2DDebugControls[8];
                                                            }
                                                            int i33 = i13;
                                                            Integer c15 = ReleaseStateCommandReceiver.c(intent2, "disabled_sub_obj_priority_mask");
                                                            if (c15 != null) {
                                                                i14 = c15.intValue();
                                                            } else {
                                                                i14 = renderer2DDebugControls[9];
                                                            }
                                                            int i34 = i14;
                                                            Integer c16 = ReleaseStateCommandReceiver.c(intent2, "disabled_main_obj_order_mask");
                                                            if (c16 != null) {
                                                                i15 = c16.intValue();
                                                            } else {
                                                                i15 = renderer2DDebugControls[10];
                                                            }
                                                            int i35 = i15;
                                                            Integer c17 = ReleaseStateCommandReceiver.c(intent2, "disabled_sub_obj_order_mask");
                                                            if (c17 != null) {
                                                                i16 = c17.intValue();
                                                            } else {
                                                                i16 = renderer2DDebugControls[11];
                                                            }
                                                            rendererDebugBridge.setRenderer2DDebugControls(i25, i26, i27, i28, i29, i30, i31, i32, i33, i34, i35, i16, i24);
                                                            StringBuilder q = i61.q(i24, i25, "action=set_renderer_2d_debug_controls mode=release featureMask=", " mainForcedMode=", " subForcedMode=");
                                                            lb1.x(q, i26, " topComp=", i27, " bottomComp=");
                                                            lb1.x(q, i28, " disabledMainBg=", i29, " disabledSubBg=");
                                                            q.append(i30);
                                                            Log.w("DebugCommand", q.toString());
                                                            ReleaseStateCommandReceiver.r("renderer_2d_debug_controls");
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_RENDERER_3D_DEBUG_CONTROLS"))) {
                                                            RendererDebugBridge rendererDebugBridge2 = RendererDebugBridge.INSTANCE;
                                                            int[] renderer3DDebugControls = rendererDebugBridge2.getRenderer3DDebugControls();
                                                            if (renderer3DDebugControls != null && renderer3DDebugControls.length != 0) {
                                                                i23 = renderer3DDebugControls[0];
                                                            }
                                                            Integer c18 = ReleaseStateCommandReceiver.c(intent2, "feature_mask");
                                                            if (c18 != null) {
                                                                i23 = c18.intValue();
                                                            }
                                                            rendererDebugBridge2.setRenderer3DDebugControls(i23);
                                                            Log.w("DebugCommand", "action=set_renderer_3d_debug_controls mode=release featureMask=" + i23);
                                                            ReleaseStateCommandReceiver.r("renderer_3d_debug_controls");
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str3))) {
                                                            obj2 = releaseStateCommandReceiver.g(applicationContext, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str2))) {
                                                            obj2 = releaseStateCommandReceiver.n(intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str7))) {
                                                            Boolean b9 = ReleaseStateCommandReceiver.b(intent2, "paused", "enabled", "value");
                                                            if (b9 != null) {
                                                                boolean booleanValue5 = b9.booleanValue();
                                                                lc1 lc1Var8 = lc1.a;
                                                                lc1.e(booleanValue5);
                                                                if (booleanValue5) {
                                                                    melonEmulator.pauseEmulation();
                                                                } else {
                                                                    melonEmulator.resumeEmulation();
                                                                }
                                                                Log.w("DebugCommand", "action=set_debug_pause mode=release paused=" + (booleanValue5 ? 1 : 0));
                                                            } else {
                                                                i.h("Missing paused/enabled extra");
                                                            }
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str6))) {
                                                            obj2 = releaseStateCommandReceiver.l(sb1Var, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str5))) {
                                                            obj2 = releaseStateCommandReceiver.l(sb1Var, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, str9))) {
                                                            obj2 = releaseStateCommandReceiver.e(applicationContext, sb1Var, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "TOUCH_SCREEN"))) {
                                                            obj2 = releaseStateCommandReceiver.m(intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "PRESS_INPUT"))) {
                                                            obj2 = releaseStateCommandReceiver.i(intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SET_INPUT_HELD"))) {
                                                            String d2 = ReleaseStateCommandReceiver.d(intent2, "inputs", "input", "value");
                                                            if (d2 != null) {
                                                                Boolean b10 = ReleaseStateCommandReceiver.b(intent2, "held", "down", "pressed", "enabled", "value");
                                                                if (b10 != null) {
                                                                    boolean booleanValue6 = b10.booleanValue();
                                                                    char[] cArr = new char[i];
                                                                    // fill-array-data instruction
                                                                    cArr[0] = ',';
                                                                    cArr[1] = '+';
                                                                    cArr[2] = ' ';
                                                                    cArr[3] = ';';
                                                                    List<String> J0 = qs6.J0(d2, cArr, 6);
                                                                    ArrayList arrayList = new ArrayList();
                                                                    for (String str11 : J0) {
                                                                        b63 o = ReleaseStateCommandReceiver.o(str11);
                                                                        if (o != null) {
                                                                            arrayList.add(o);
                                                                        }
                                                                    }
                                                                    if (!arrayList.isEmpty()) {
                                                                        int size = arrayList.size();
                                                                        int i36 = 0;
                                                                        while (i36 < size) {
                                                                            Object obj10 = arrayList.get(i36);
                                                                            i36++;
                                                                            b63 b63Var = (b63) obj10;
                                                                            if (booleanValue6) {
                                                                                melonEmulator.d(b63Var);
                                                                            } else {
                                                                                melonEmulator.e(b63Var);
                                                                            }
                                                                        }
                                                                        Log.w("DebugCommand", "action=set_input_held mode=release inputs=" + gt0.P0(arrayList, ",", null, null, new dv4(18), 30) + " held=" + (booleanValue6 ? 1 : 0));
                                                                    } else {
                                                                        i.f("No supported inputs in ".concat(d2));
                                                                    }
                                                                } else {
                                                                    i.h("Missing held/down/enabled extra");
                                                                }
                                                            } else {
                                                                i.h("Missing input extra");
                                                            }
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "SAVE_STATE"))) {
                                                            obj2 = releaseStateCommandReceiver.j(applicationContext, sb1Var, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "LOAD_STATE"))) {
                                                            obj2 = releaseStateCommandReceiver.h(applicationContext, sb1Var, intent2, this);
                                                            break;
                                                        } else if (nb3.k(action2, ReleaseStateCommandReceiver.a(applicationContext, "DUMP_ROM_SEARCH_STATE"))) {
                                                            obj2 = releaseStateCommandReceiver.f(sb1Var, intent2, this);
                                                            break;
                                                        } else {
                                                            vy7.P(Log.w("DebugCommand", "Ignored unknown action=" + intent2.getAction()));
                                                        }
                                                    }
                                                    obj2 = jg7Var;
                                                }
                                            }
                                        }
                                        x61Var2 = x61Var;
                                        if (obj2 != x61Var2) {
                                            return x61Var2;
                                        }
                                        return jg7Var;
                                    }
                                    i3 = i2;
                                    z = z2;
                                    jg7Var = jg7Var2;
                                    x61Var = x61Var6;
                                    intent = intent2;
                                    str = "DebugCommand";
                                    Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                                    obj2 = jg7Var;
                                    x61Var2 = x61Var;
                                    if (obj2 != x61Var2) {
                                    }
                                }
                                i2 = 0;
                                if (i2 != 0) {
                                }
                                Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                                obj2 = jg7Var;
                                x61Var2 = x61Var;
                                if (obj2 != x61Var2) {
                                }
                            } else {
                                if (!lowerCase.equals("yes")) {
                                    i2 = 0;
                                    if (i2 != 0) {
                                    }
                                    Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                                    obj2 = jg7Var;
                                    x61Var2 = x61Var;
                                    if (obj2 != x61Var2) {
                                    }
                                }
                                i2 = 1;
                                if (i2 != 0) {
                                }
                                Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                                obj2 = jg7Var;
                                x61Var2 = x61Var;
                                if (obj2 != x61Var2) {
                                }
                            }
                        } else {
                            if (lowerCase.equals("on")) {
                                i2 = 1;
                                if (i2 != 0) {
                                }
                                Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                                obj2 = jg7Var;
                                x61Var2 = x61Var;
                                if (obj2 != x61Var2) {
                                }
                            }
                            i2 = 0;
                            if (i2 != 0) {
                            }
                            Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                            obj2 = jg7Var;
                            x61Var2 = x61Var;
                            if (obj2 != x61Var2) {
                            }
                        }
                    } else {
                        if (!lowerCase.equals("1")) {
                            i2 = 0;
                            if (i2 != 0) {
                            }
                            Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                            obj2 = jg7Var;
                            x61Var2 = x61Var;
                            if (obj2 != x61Var2) {
                            }
                        }
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        Log.w(str, "action=ignored_release_state_command actionName=" + intent.getAction() + " toolsEnabled=" + (z ? 1 : 0) + " propertyEnabled=" + i3);
                        obj2 = jg7Var;
                        x61Var2 = x61Var;
                        if (obj2 != x61Var2) {
                        }
                    }
                } else {
                    e41.m();
                }
                return null;
            case 4:
                ri7 ri7Var = (ri7) obj6;
                LinkedHashMap linkedHashMap = ri7Var.k;
                List<CaptureRequest.Key> list = (List) obj4;
                ki7 ki7Var = (ki7) obj5;
                x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                int i37 = this.Y;
                if (i37 != 0) {
                    if (i37 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + ki7Var + "] keys = " + list);
                }
                Object obj11 = linkedHashMap.get(ki7Var);
                ni7 ni7Var = obj11;
                if (obj11 == null) {
                    ni7 ni7Var2 = new ni7((jd0) null, (LinkedHashMap) null, (bl5) null, 15);
                    linkedHashMap.put(ki7Var, ni7Var2);
                    ni7Var = ni7Var2;
                }
                ni7 ni7Var3 = (ni7) ni7Var;
                jd0 jd0Var = new jd0(0);
                jd0Var.b(ni7Var3.a.B);
                for (CaptureRequest.Key key : list) {
                    jd0Var.B.n(nw7.T(key));
                }
                linkedHashMap.put(ki7Var, new ni7(jd0Var, c14.t0(ni7Var3.b), gt0.o1(ni7Var3.c), ni7Var3.d));
                ni7 l = ri7.l(ri7Var.k);
                this.Y = 1;
                Object n = ri7Var.n(l, null, this);
                if (n == x61Var7) {
                    return x61Var7;
                }
                return n;
            default:
                ri7 ri7Var2 = (ri7) obj6;
                x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                int i38 = this.Y;
                if (i38 != 0) {
                    if (i38 == 1) {
                        oi2.Y(obj);
                        return obj;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (kj2.F("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#updateCamera2ConfigAsync");
                }
                LinkedHashMap linkedHashMap2 = ri7Var2.k;
                ki7 ki7Var2 = ki7.CAMERA2_CAMERA_CONTROL;
                tu0 tu0Var = ri7.l;
                jd0 jd0Var2 = new jd0(0);
                jd0Var2.b((kd0) obj5);
                linkedHashMap2.put(ki7Var2, new ni7(jd0Var2, new LinkedHashMap((Map) obj4), (bl5) null, 12));
                ni7 l2 = ri7.l(ri7Var2.k);
                this.Y = 1;
                Object n2 = ri7Var2.n(l2, null, this);
                if (n2 != x61Var8) {
                    return n2;
                }
                return x61Var8;
        }
    }
}
