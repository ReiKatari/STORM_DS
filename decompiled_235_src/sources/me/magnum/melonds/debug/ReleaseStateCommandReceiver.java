package me.magnum.melonds.debug;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.github.junrar.unpack.decode.Compress;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.VideoRenderer;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ReleaseStateCommandReceiver extends BroadcastReceiver {
    public static final o41 a;

    static {
        gu6 c = oi2.c();
        xe1 xe1Var = xk1.a;
        a = g04.i(jw2.y(c, de1.L));
    }

    public static String a(Context context, String str) {
        return lb1.m(context.getPackageName(), ".", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b8, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Boolean b(Intent intent, String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                return null;
            }
            String str = strArr[i];
            if (intent.hasExtra(str)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    obj = extras.get(str);
                }
                if (obj instanceof Boolean) {
                    return (Boolean) obj;
                }
                if (obj instanceof String) {
                    String obj2 = qs6.T0((String) obj).toString();
                    Locale locale = Locale.US;
                    locale.getClass();
                    String lowerCase = obj2.toLowerCase(locale);
                    lowerCase.getClass();
                    switch (lowerCase.hashCode()) {
                        case -1609594047:
                            if (lowerCase.equals("enabled")) {
                                break;
                            } else {
                                continue;
                            }
                        case Compress.DC20 /* 48 */:
                            if (lowerCase.equals("0")) {
                                break;
                            } else {
                                continue;
                            }
                        case 49:
                            if (lowerCase.equals("1")) {
                                break;
                            } else {
                                continue;
                            }
                        case 3521:
                            if (lowerCase.equals("no")) {
                                break;
                            } else {
                                continue;
                            }
                        case 3551:
                            if (lowerCase.equals("on")) {
                                break;
                            } else {
                                continue;
                            }
                        case 109935:
                            if (lowerCase.equals("off")) {
                                break;
                            } else {
                                continue;
                            }
                        case 119527:
                            if (lowerCase.equals("yes")) {
                                break;
                            } else {
                                continue;
                            }
                        case 3569038:
                            if (lowerCase.equals("true")) {
                                break;
                            } else {
                                continue;
                            }
                        case 97196323:
                            if (lowerCase.equals("false")) {
                                break;
                            } else {
                                continue;
                            }
                        case 270940796:
                            if (lowerCase.equals("disabled")) {
                                break;
                            } else {
                                continue;
                            }
                    }
                } else if (obj instanceof Integer) {
                    return Boolean.valueOf(!obj.equals(0));
                }
            }
            i++;
        }
        return Boolean.TRUE;
    }

    public static Integer c(Intent intent, String... strArr) {
        Integer h0;
        int length = strArr.length;
        int i = 0;
        while (true) {
            Object obj = null;
            if (i >= length) {
                return null;
            }
            String str = strArr[i];
            if (intent.hasExtra(str)) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    obj = extras.get(str);
                }
                if (obj instanceof Integer) {
                    return (Integer) obj;
                }
                if ((obj instanceof String) && (h0 = xs6.h0((String) obj)) != null) {
                    return Integer.valueOf(h0.intValue());
                }
            }
            i++;
        }
    }

    public static String d(Intent intent, String... strArr) {
        String str;
        int length = strArr.length;
        int i = 0;
        while (true) {
            str = null;
            if (i < length) {
                String stringExtra = intent.getStringExtra(strArr[i]);
                if (stringExtra != null && !qs6.v0(stringExtra)) {
                    str = stringExtra;
                }
                if (str != null) {
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return str;
    }

    public static b63 o(String str) {
        String obj = qs6.T0(str).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = obj.toUpperCase(locale);
        upperCase.getClass();
        String replace = upperCase.replace('-', '_');
        replace.getClass();
        String e0 = xs6.e0(replace, ".", "_");
        if (e0.length() != 0) {
            String D0 = qs6.D0(qs6.D0(e0, "INPUT_"), "BUTTON_");
            switch (D0.hashCode()) {
                case -2048055683:
                    if (!D0.equals("AXIS_Y_POSITIVE")) {
                        return null;
                    }
                    return b63.DOWN;
                case -2037433122:
                    if (!D0.equals("AXIS_HAT_X_NEGATIVE")) {
                        return null;
                    }
                    return b63.LEFT;
                case -1874749255:
                    if (!D0.equals("AXIS_Y_NEGATIVE")) {
                        return null;
                    }
                    return b63.UP;
                case -1852692228:
                    if (D0.equals("SELECT")) {
                        return b63.SELECT;
                    }
                    return null;
                case -1851542178:
                    if (!D0.equals("AXIS_X_POSITIVE")) {
                        return null;
                    }
                    return b63.RIGHT;
                case -1721778389:
                    if (!D0.equals("DPAD_UP")) {
                        return null;
                    }
                    return b63.UP;
                case -1678235750:
                    if (!D0.equals("AXIS_X_NEGATIVE")) {
                        return null;
                    }
                    return b63.LEFT;
                case -1325501965:
                    if (!D0.equals("AXIS_HAT_X_RIGHT")) {
                        return null;
                    }
                    return b63.RIGHT;
                case -1067127502:
                    if (!D0.equals("DPAD_DOWN")) {
                        return null;
                    }
                    return b63.DOWN;
                case -1066899305:
                    if (!D0.equals("DPAD_LEFT")) {
                        return null;
                    }
                    return b63.LEFT;
                case -458582736:
                    if (!D0.equals("AXIS_HAT_X_LEFT")) {
                        return null;
                    }
                    return b63.LEFT;
                case -430181782:
                    if (!D0.equals("AXIS_HAT_Y_DOWN")) {
                        return null;
                    }
                    return b63.DOWN;
                case -103924244:
                    if (!D0.equals("AXIS_X_LEFT")) {
                        return null;
                    }
                    return b63.LEFT;
                case -75523290:
                    if (!D0.equals("AXIS_Y_DOWN")) {
                        return null;
                    }
                    return b63.DOWN;
                case 65:
                    if (D0.equals("A")) {
                        return b63.A;
                    }
                    return null;
                case 66:
                    if (D0.equals("B")) {
                        return b63.B;
                    }
                    return null;
                case 76:
                    if (!D0.equals("L")) {
                        return null;
                    }
                    return b63.L;
                case 82:
                    if (!D0.equals("R")) {
                        return null;
                    }
                    return b63.R;
                case 88:
                    if (D0.equals("X")) {
                        return b63.X;
                    }
                    return null;
                case 89:
                    if (D0.equals("Y")) {
                        return b63.Y;
                    }
                    return null;
                case 2405:
                    if (!D0.equals("L1")) {
                        return null;
                    }
                    return b63.L;
                case 2591:
                    if (!D0.equals("R1")) {
                        return null;
                    }
                    return b63.R;
                case 2715:
                    if (!D0.equals("UP")) {
                        return null;
                    }
                    return b63.UP;
                case 2104482:
                    if (!D0.equals("DOWN")) {
                        return null;
                    }
                    return b63.DOWN;
                case 2332679:
                    if (!D0.equals("LEFT")) {
                        return null;
                    }
                    return b63.LEFT;
                case 58022431:
                    if (!D0.equals("AXIS_Y_UP")) {
                        return null;
                    }
                    return b63.UP;
                case 77974012:
                    if (!D0.equals("RIGHT")) {
                        return null;
                    }
                    return b63.RIGHT;
                case 79219778:
                    if (D0.equals("START")) {
                        return b63.START;
                    }
                    return null;
                case 364460856:
                    if (!D0.equals("HAT_RIGHT")) {
                        return null;
                    }
                    return b63.RIGHT;
                case 491172451:
                    if (!D0.equals("AXIS_HAT_Y_UP")) {
                        return null;
                    }
                    return b63.UP;
                case 981177318:
                    if (!D0.equals("HAT_DOWN")) {
                        return null;
                    }
                    return b63.DOWN;
                case 981405515:
                    if (!D0.equals("HAT_LEFT")) {
                        return null;
                    }
                    return b63.LEFT;
                case 1078976695:
                    if (!D0.equals("AXIS_X_RIGHT")) {
                        return null;
                    }
                    return b63.RIGHT;
                case 1291520876:
                    if (!D0.equals("DPAD_RIGHT")) {
                        return null;
                    }
                    return b63.RIGHT;
                case 1887714241:
                    if (!D0.equals("AXIS_HAT_Y_POSITIVE")) {
                        return null;
                    }
                    return b63.DOWN;
                case 2061020669:
                    if (!D0.equals("AXIS_HAT_Y_NEGATIVE")) {
                        return null;
                    }
                    return b63.UP;
                case 2084227746:
                    if (!D0.equals("AXIS_HAT_X_POSITIVE")) {
                        return null;
                    }
                    return b63.RIGHT;
                case 2123924191:
                    if (!D0.equals("HAT_UP")) {
                        return null;
                    }
                    return b63.UP;
                default:
                    return null;
            }
        }
        return null;
    }

    public static void r(String str) {
        lc1 lc1Var = lc1.a;
        if (!lc1.c) {
            return;
        }
        boolean debugStepFrame = MelonEmulator.a.debugStepFrame();
        Log.w("DebugCommand", "action=auto_step_frame mode=release reason=" + str + " success=" + (debugStepFrame ? 1 : 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:309:0x06fc, code lost:
        if (r12.isEmpty() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x090c, code lost:
        if (r6 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x090e, code lost:
        r0 = defpackage.lc1.a;
        defpackage.lc1.e(false);
        r27.resumeEmulation();
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0916, code lost:
        return r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0b06, code lost:
        if (r11 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x0b0a, code lost:
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x070e  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x071f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x072c  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x073f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0746 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:345:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x085f A[Catch: all -> 0x084f, TryCatch #10 {all -> 0x084f, blocks: (B:358:0x0842, B:360:0x0846, B:375:0x0874, B:384:0x0896, B:365:0x0853, B:366:0x0859, B:368:0x085f, B:370:0x0869, B:373:0x086e, B:374:0x0873), top: B:475:0x0842 }] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0939 A[Catch: all -> 0x07ae, TRY_ENTER, TryCatch #9 {all -> 0x07ae, blocks: (B:432:0x0a8e, B:436:0x0aa9, B:438:0x0ab1, B:441:0x0abb, B:440:0x0ab7, B:329:0x074c, B:394:0x0939, B:408:0x09b2, B:412:0x09ed), top: B:462:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:403:0x099e  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0aa7  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0ab1 A[Catch: all -> 0x07ae, TryCatch #9 {all -> 0x07ae, blocks: (B:432:0x0a8e, B:436:0x0aa9, B:438:0x0ab1, B:441:0x0abb, B:440:0x0ab7, B:329:0x074c, B:394:0x0939, B:408:0x09b2, B:412:0x09ed), top: B:462:0x0044 }] */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x07d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:646:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0364  */
    /* JADX WARN: Type inference failed for: r0v23, types: [int] */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [int] */
    /* JADX WARN: Type inference failed for: r1v29, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r3v19, types: [hw6] */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v0, types: [me.magnum.melonds.debug.ReleaseStateCommandReceiver] */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, sb1 sb1Var, Intent intent, s41 s41Var) {
        li5 li5Var;
        int i;
        MelonEmulator melonEmulator;
        boolean z;
        yj5 yj5Var;
        boolean z2;
        sb1 sb1Var2;
        Context context2;
        boolean z3;
        Intent intent2;
        boolean z4;
        VideoRenderer e;
        String str;
        String str2;
        Integer c;
        String str3;
        int i2;
        Boolean b;
        int i3;
        String str4;
        Integer c2;
        int i4;
        Integer c3;
        String str5;
        String str6;
        long j;
        Integer c4;
        int i5;
        String str7;
        Integer c5;
        int i6;
        String str8;
        String d;
        LinkedHashSet linkedHashSet;
        String str9;
        LinkedHashSet linkedHashSet2;
        LinkedHashSet linkedHashSet3;
        x61 x61Var;
        int i7;
        long j2;
        Set set;
        String d2;
        File externalFilesDir;
        File file;
        File file2;
        boolean z5;
        yj5 yj5Var2;
        File file3;
        String str10;
        String str11;
        int i8;
        int i9;
        String str12;
        int currentFrameIndexForDebug;
        yj5 yj5Var3;
        long j3;
        boolean z6;
        int i10;
        VideoRenderer videoRenderer;
        x61 x61Var2;
        int i11;
        int i12;
        int i13;
        long j4;
        int i14;
        int i15;
        VideoRenderer videoRenderer2;
        int i16;
        File file4;
        int i17;
        int i18;
        VideoRenderer videoRenderer3;
        int i19;
        boolean z7;
        String str13;
        boolean z8;
        int i20;
        int i21;
        x61 x61Var3;
        boolean z9;
        long j5;
        LinkedHashSet linkedHashSet4;
        int i22;
        int i23;
        File file5;
        long j6;
        int i24;
        VideoRenderer videoRenderer4;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        String str14;
        boolean z10;
        x61 x61Var4;
        String hexString;
        VideoRenderer videoRenderer5;
        int i32;
        int i33;
        String str15;
        String str16;
        String str17;
        String str18;
        int i34;
        int i35;
        String str19;
        String str20;
        String str21;
        Serializable d3;
        Serializable serializable;
        VideoRenderer videoRenderer6;
        int i36;
        int i37;
        int i38;
        List<ak5> list;
        int i39;
        int i40;
        String str22;
        LinkedHashSet linkedHashSet5;
        boolean z11;
        yj5 yj5Var4;
        LinkedHashSet linkedHashSet6;
        LinkedHashSet linkedHashSet7;
        LinkedHashSet linkedHashSet8;
        boolean z12;
        int currentFrameIndexForDebug2;
        x61 x61Var5;
        int i41;
        boolean z13;
        long j7;
        int i42;
        String str23;
        VideoRenderer videoRenderer7;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        File file6;
        yj5 yj5Var5 = yj5.a;
        jg7 jg7Var = jg7.a;
        MelonEmulator melonEmulator2 = MelonEmulator.a;
        try {
            try {
                if (s41Var instanceof li5) {
                    li5Var = (li5) s41Var;
                    int i48 = li5Var.u0;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        li5Var.u0 = i48 - Integer.MIN_VALUE;
                        li5 li5Var2 = li5Var;
                        ?? r1 = li5Var2.s0;
                        x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                        i = li5Var2.u0;
                        ?? r11 = "DebugCommand";
                        switch (i) {
                            case 0:
                                oi2.Y(r1);
                                Boolean b2 = b(intent, "refresh", "refresh_settings");
                                if (b2 != null) {
                                    z = b2.booleanValue();
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    SharedPreferences.Editor edit = sb1Var.a().edit();
                                    yj5Var = yj5Var5;
                                    edit.putBoolean("video_renderer_debug_tools_enabled", true);
                                    edit.commit();
                                    lc1 lc1Var = lc1.a;
                                    z2 = lc1.c();
                                } else {
                                    yj5Var = yj5Var5;
                                    z2 = false;
                                }
                                if (z2) {
                                    li5Var2.R = context;
                                    sb1Var2 = sb1Var;
                                    li5Var2.X = sb1Var2;
                                    li5Var2.Y = intent;
                                    li5Var2.i0 = z ? 1 : 0;
                                    li5Var2.j0 = z2 ? 1 : 0;
                                    li5Var2.u0 = 1;
                                    boolean z14 = z ? 1 : 0;
                                    if (q60.t(350L, li5Var2) == x61Var6) {
                                        return x61Var6;
                                    }
                                    context2 = context;
                                    z3 = z14;
                                } else {
                                    sb1Var2 = sb1Var;
                                    boolean z15 = z ? 1 : 0;
                                    context2 = context;
                                    z3 = z;
                                }
                                intent2 = intent;
                                z4 = z3;
                                e = ((ng6) ((kd6) sb1Var2.s.get())).e();
                                str = " success=";
                                str2 = " captureId=";
                                c = c(intent2, "burst_count", "capture_count");
                                if (c == null) {
                                    str3 = " resumeFrames=";
                                    i2 = gi2.q(c.intValue(), 1, 600);
                                } else {
                                    str3 = " resumeFrames=";
                                    i2 = 1;
                                }
                                b = b(intent2, "burst_live", "live_burst");
                                if (b == null) {
                                    i3 = b.booleanValue();
                                } else if (i2 > 1) {
                                    i3 = 1;
                                } else {
                                    i3 = 0;
                                }
                                str4 = " paused=";
                                c2 = c(intent2, "burst_step_frames", "step_frames");
                                if (c2 == null) {
                                    int intValue = c2.intValue();
                                    if (intValue < 1) {
                                        i29 = 1;
                                    } else {
                                        i29 = intValue;
                                    }
                                    i4 = i29;
                                } else {
                                    i4 = 1;
                                }
                                c3 = c(intent2, "timeout_ms");
                                if (c3 != null) {
                                    str5 = " refreshed=";
                                    str6 = "DebugCommand";
                                    j = (((i4 * i2) * 1000) / 24) + 5000;
                                } else {
                                    int intValue2 = c3.intValue();
                                    str5 = " refreshed=";
                                    if (intValue2 < 1) {
                                        intValue2 = 1;
                                    }
                                    str6 = "DebugCommand";
                                    j = intValue2;
                                }
                                melonEmulator = melonEmulator2;
                                c4 = c(intent2, "resume_ms", "duration_ms");
                                if (c4 == null) {
                                    int intValue3 = c4.intValue();
                                    if (intValue3 < 0) {
                                        intValue3 = 0;
                                    }
                                    i5 = intValue3;
                                } else {
                                    i5 = 0;
                                }
                                str7 = " outputDir=";
                                c5 = c(intent2, "resume_frames", "frames");
                                if (c5 == null) {
                                    int intValue4 = c5.intValue();
                                    if (intValue4 < 0) {
                                        intValue4 = 0;
                                    }
                                    i6 = intValue4;
                                } else {
                                    i6 = 0;
                                }
                                str8 = "action=dump_renderer_capture mode=release renderer=";
                                d = d(intent2, "capture_kinds", "kinds");
                                if (i2 <= 1) {
                                    linkedHashSet = ii2.R(vj5.SCREEN_FRAME);
                                } else {
                                    linkedHashSet = zj5.a;
                                }
                                if (d == null) {
                                    str9 = qs6.T0(d).toString();
                                } else {
                                    str9 = null;
                                }
                                if (str9 == null) {
                                    str9 = "";
                                }
                                if (str9.length() != 0) {
                                    j2 = j;
                                    linkedHashSet2 = linkedHashSet;
                                    x61Var = x61Var6;
                                    i7 = i6;
                                } else {
                                    linkedHashSet2 = linkedHashSet;
                                    linkedHashSet3 = new LinkedHashSet();
                                    x61Var = x61Var6;
                                    i7 = i6;
                                    List J0 = qs6.J0(str9, new char[]{','}, 6);
                                    ArrayList arrayList = new ArrayList(ht0.v0(J0, 10));
                                    Iterator it = J0.iterator();
                                    while (it.hasNext()) {
                                        String obj = qs6.T0((String) it.next()).toString();
                                        Iterator it2 = it;
                                        Locale locale = Locale.US;
                                        locale.getClass();
                                        String lowerCase = obj.toLowerCase(locale);
                                        lowerCase.getClass();
                                        arrayList.add(lowerCase);
                                        it = it2;
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    int size = arrayList.size();
                                    j2 = j;
                                    int i49 = 0;
                                    while (i49 < size) {
                                        Object obj2 = arrayList.get(i49);
                                        i49++;
                                        if (((String) obj2).length() > 0) {
                                            arrayList2.add(obj2);
                                        }
                                    }
                                    int size2 = arrayList2.size();
                                    int i50 = 0;
                                    while (i50 < size2) {
                                        Object obj3 = arrayList2.get(i50);
                                        i50++;
                                        String str24 = (String) obj3;
                                        switch (str24.hashCode()) {
                                            case -2143177360:
                                                if (!str24.equals("comp4bottom")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    d2 = (d2 != null || qs6.v0(d2)) ? null : null;
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                        externalFilesDir = new File(context2.getCacheDir(), "renderer-debug-captures");
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                        file2 = new File(file, lb1.h(System.currentTimeMillis(), "burst_"));
                                                        file2.mkdirs();
                                                    } else {
                                                        file2 = file;
                                                    }
                                                    lc1 lc1Var2 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1 && i3 != 0) {
                                                        if (i7 <= 0 && i5 > 0) {
                                                            lc1.e(false);
                                                            melonEmulator.resumeEmulation();
                                                            li5Var2.R = null;
                                                            li5Var2.X = null;
                                                            li5Var2.Y = null;
                                                            li5Var2.Z = e;
                                                            li5Var2.d0 = linkedHashSet3;
                                                            li5Var2.e0 = d2;
                                                            li5Var2.f0 = null;
                                                            li5Var2.g0 = file2;
                                                            li5Var2.i0 = z4 ? 1 : 0;
                                                            li5Var2.j0 = z2 ? 1 : 0;
                                                            li5Var2.k0 = i2;
                                                            li5Var2.l0 = i3 == 1 ? 1 : 0;
                                                            li5Var2.m0 = i4;
                                                            int i51 = i4;
                                                            File file7 = file2;
                                                            j6 = j2;
                                                            li5Var2.q0 = j6;
                                                            li5Var2.n0 = i5;
                                                            int i52 = i7;
                                                            li5Var2.o0 = i52;
                                                            li5Var2.r0 = z5;
                                                            li5Var2.u0 = 2;
                                                            x61Var3 = x61Var;
                                                            if (q60.t(i5, li5Var2) == x61Var3) {
                                                                return x61Var3;
                                                            }
                                                            i24 = i52;
                                                            videoRenderer4 = e;
                                                            i25 = z2 ? 1 : 0;
                                                            z9 = z5;
                                                            file5 = file7;
                                                            i26 = i3 == 1 ? 1 : 0;
                                                            i27 = z4 ? 1 : 0;
                                                            i28 = i51;
                                                            int i53 = i24;
                                                            e = videoRenderer4;
                                                            i21 = i53;
                                                            long j8 = j6;
                                                            i22 = i28;
                                                            i31 = i27;
                                                            i30 = i26;
                                                            linkedHashSet4 = linkedHashSet3;
                                                            i23 = i25;
                                                            j5 = j8;
                                                            str14 = d2;
                                                            LinkedHashSet linkedHashSet9 = linkedHashSet4;
                                                            x61Var4 = x61Var3;
                                                            ?? hw6Var = new hw6(1, null);
                                                            if (str14 == null) {
                                                            }
                                                            hexString.getClass();
                                                            mi5 mi5Var = hw6Var;
                                                            if (i21 <= 0) {
                                                            }
                                                            li5Var2.R = null;
                                                            li5Var2.X = null;
                                                            li5Var2.Y = null;
                                                            li5Var2.Z = e;
                                                            li5Var2.d0 = null;
                                                            li5Var2.e0 = null;
                                                            li5Var2.f0 = null;
                                                            li5Var2.g0 = file5;
                                                            li5Var2.h0 = hexString;
                                                            li5Var2.i0 = i31;
                                                            li5Var2.j0 = i23;
                                                            li5Var2.k0 = i2;
                                                            li5Var2.l0 = i30;
                                                            li5Var2.m0 = i22;
                                                            li5Var2.q0 = j5;
                                                            li5Var2.n0 = i5;
                                                            li5Var2.o0 = i21;
                                                            li5Var2.r0 = z9;
                                                            li5Var2.u0 = 3;
                                                            videoRenderer5 = e;
                                                            i32 = i2;
                                                            i33 = i22;
                                                            long j9 = j5;
                                                            int i54 = i5;
                                                            str15 = str3;
                                                            str16 = str6;
                                                            str17 = str5;
                                                            mi5 mi5Var2 = mi5Var;
                                                            str18 = hexString;
                                                            i34 = i21;
                                                            yj5 yj5Var6 = yj5Var;
                                                            i35 = i23;
                                                            str19 = str2;
                                                            str20 = str;
                                                            z10 = z9;
                                                            str21 = str4;
                                                            d3 = yj5Var6.d(videoRenderer5, file5, str18, i32, i33, j9, linkedHashSet9, i34, mi5Var2, li5Var2);
                                                            if (d3 == x61Var4) {
                                                            }
                                                        } else {
                                                            i21 = i7;
                                                            File file8 = file2;
                                                            x61Var3 = x61Var;
                                                            z9 = z5;
                                                            j5 = j2;
                                                            linkedHashSet4 = linkedHashSet3;
                                                            i22 = i4;
                                                            i23 = z2 ? 1 : 0;
                                                            file5 = file8;
                                                            i31 = z4;
                                                            i30 = i3;
                                                            str14 = d2;
                                                            try {
                                                                LinkedHashSet linkedHashSet92 = linkedHashSet4;
                                                                x61Var4 = x61Var3;
                                                                ?? hw6Var2 = new hw6(1, null);
                                                                if (str14 == null) {
                                                                    try {
                                                                        hexString = Long.toHexString(System.currentTimeMillis());
                                                                    } catch (Throwable th) {
                                                                        th = th;
                                                                        i = z9;
                                                                        if (i == 0) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    hexString = str14;
                                                                }
                                                                hexString.getClass();
                                                                mi5 mi5Var3 = hw6Var2;
                                                                if (i21 <= 0) {
                                                                    mi5Var3 = i5 <= 0 ? hw6Var2 : null;
                                                                }
                                                                li5Var2.R = null;
                                                                li5Var2.X = null;
                                                                li5Var2.Y = null;
                                                                li5Var2.Z = e;
                                                                li5Var2.d0 = null;
                                                                li5Var2.e0 = null;
                                                                li5Var2.f0 = null;
                                                                li5Var2.g0 = file5;
                                                                li5Var2.h0 = hexString;
                                                                li5Var2.i0 = i31;
                                                                li5Var2.j0 = i23;
                                                                li5Var2.k0 = i2;
                                                                li5Var2.l0 = i30;
                                                                li5Var2.m0 = i22;
                                                                li5Var2.q0 = j5;
                                                                li5Var2.n0 = i5;
                                                                li5Var2.o0 = i21;
                                                                li5Var2.r0 = z9;
                                                                li5Var2.u0 = 3;
                                                                videoRenderer5 = e;
                                                                i32 = i2;
                                                                i33 = i22;
                                                                long j92 = j5;
                                                                int i542 = i5;
                                                                str15 = str3;
                                                                str16 = str6;
                                                                str17 = str5;
                                                                mi5 mi5Var22 = mi5Var3;
                                                                str18 = hexString;
                                                                i34 = i21;
                                                                yj5 yj5Var62 = yj5Var;
                                                                i35 = i23;
                                                                str19 = str2;
                                                                str20 = str;
                                                                z10 = z9;
                                                                str21 = str4;
                                                                try {
                                                                    d3 = yj5Var62.d(videoRenderer5, file5, str18, i32, i33, j92, linkedHashSet92, i34, mi5Var22, li5Var2);
                                                                    if (d3 == x61Var4) {
                                                                        return x61Var4;
                                                                    }
                                                                    serializable = d3;
                                                                    videoRenderer6 = videoRenderer5;
                                                                    i36 = i32;
                                                                    i37 = z10;
                                                                    i38 = i542;
                                                                    try {
                                                                        list = (List) serializable;
                                                                        if (list == null && list.isEmpty()) {
                                                                            i39 = 0;
                                                                        } else {
                                                                            i39 = 0;
                                                                            for (ak5 ak5Var : list) {
                                                                                if (ak5Var.b && (i39 = i39 + 1) < 0) {
                                                                                    hf.p0();
                                                                                    throw null;
                                                                                }
                                                                            }
                                                                        }
                                                                        String name = videoRenderer6.name();
                                                                        Locale locale2 = Locale.US;
                                                                        locale2.getClass();
                                                                        String lowerCase2 = name.toLowerCase(locale2);
                                                                        lowerCase2.getClass();
                                                                        if (i35 == 0) {
                                                                            i40 = 1;
                                                                        } else {
                                                                            i40 = 0;
                                                                        }
                                                                        if (i34 <= 0) {
                                                                            str22 = "native_callbacks";
                                                                        } else if (i38 > 0) {
                                                                            str22 = "elapsed_ms";
                                                                        } else {
                                                                            str22 = "none";
                                                                        }
                                                                        Log.w(str16, str8 + lowerCase2 + str17 + i40 + str21 + i37 + " liveBurst=1 resumeMs=" + i38 + str15 + i34 + " warmupMode=" + str22 + " burstCount=" + i36 + " burstStepFrames=" + i33 + str19 + str18 + str20 + i39 + "/" + list.size() + str7 + file5.getAbsolutePath());
                                                                        break;
                                                                    } catch (Throwable th2) {
                                                                        th = th2;
                                                                        i = i37;
                                                                        if (i == 0) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th3) {
                                                                    th = th3;
                                                                    i = z10;
                                                                    if (i == 0) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th4) {
                                                                th = th4;
                                                                z10 = z9;
                                                            }
                                                        }
                                                    } else {
                                                        yj5 yj5Var7 = yj5Var;
                                                        LinkedHashSet linkedHashSet10 = linkedHashSet3;
                                                        yj5Var2 = yj5Var7;
                                                        int i55 = i7;
                                                        int i56 = i4;
                                                        file3 = file;
                                                        str10 = str6;
                                                        str11 = str7;
                                                        x61 x61Var7 = x61Var;
                                                        long j10 = j2;
                                                        i8 = i5;
                                                        i9 = z4 ? 1 : 0;
                                                        if (z5) {
                                                            melonEmulator.pauseEmulation();
                                                            lc1.e(true);
                                                            str12 = str8;
                                                            li5Var2.R = null;
                                                            li5Var2.X = null;
                                                            li5Var2.Y = null;
                                                            li5Var2.Z = e;
                                                            li5Var2.d0 = linkedHashSet10;
                                                            li5Var2.e0 = d2;
                                                            li5Var2.f0 = file3;
                                                            li5Var2.g0 = null;
                                                            li5Var2.i0 = i9;
                                                            li5Var2.j0 = z2 ? 1 : 0;
                                                            li5Var2.k0 = i2;
                                                            li5Var2.l0 = i3 == 1 ? 1 : 0;
                                                            li5Var2.m0 = i56;
                                                            li5Var2.q0 = j10;
                                                            li5Var2.n0 = i8;
                                                            li5Var2.o0 = i55;
                                                            li5Var2.r0 = z5;
                                                            li5Var2.u0 = 4;
                                                            Object t = t(e, RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug(), 1000L, li5Var2);
                                                            videoRenderer3 = e;
                                                            if (t != x61Var7) {
                                                                t = jg7Var;
                                                            }
                                                            if (t != x61Var7) {
                                                                i19 = i55;
                                                                z7 = z2 ? 1 : 0;
                                                                str13 = d2;
                                                                z8 = z5;
                                                                i20 = i8;
                                                                file4 = file3;
                                                                linkedHashSet7 = linkedHashSet10;
                                                                i16 = i20;
                                                                z11 = z8;
                                                                z2 = z7;
                                                                videoRenderer2 = videoRenderer3;
                                                                i18 = i19;
                                                                i17 = 1;
                                                                d2 = str13;
                                                                linkedHashSet5 = linkedHashSet7;
                                                                yj5Var4 = yj5Var2;
                                                                linkedHashSet6 = linkedHashSet5;
                                                                i46 = z2;
                                                                i45 = z11;
                                                                ak5 e2 = yj5Var4.e(videoRenderer2, file4, d2, linkedHashSet6);
                                                                String name2 = videoRenderer2.name();
                                                                Locale locale3 = Locale.US;
                                                                locale3.getClass();
                                                                String lowerCase3 = name2.toLowerCase(locale3);
                                                                lowerCase3.getClass();
                                                                if (i46) {
                                                                    i47 = i17;
                                                                } else {
                                                                    i47 = 0;
                                                                }
                                                                String str25 = e2.a;
                                                                boolean z16 = e2.b;
                                                                file6 = e2.c;
                                                                if (file6 != null || (r0 = file6.getAbsolutePath()) == null) {
                                                                    String absolutePath = file4.getAbsolutePath();
                                                                }
                                                                Log.w(str10, str12 + lowerCase3 + str5 + i47 + str4 + i45 + " resumeMs=" + i16 + str3 + i18 + str2 + str25 + str + (z16 ? 1 : 0) + str11 + absolutePath);
                                                                break;
                                                            } else {
                                                                return x61Var7;
                                                            }
                                                        } else {
                                                            str12 = str8;
                                                            try {
                                                                if (i8 <= 0 && i55 <= 0) {
                                                                    videoRenderer2 = e;
                                                                    i16 = i8;
                                                                    file4 = file3;
                                                                    i17 = 1;
                                                                    i18 = i55;
                                                                    z11 = z5;
                                                                    linkedHashSet5 = linkedHashSet10;
                                                                    yj5Var4 = yj5Var2;
                                                                    linkedHashSet6 = linkedHashSet5;
                                                                    i46 = z2;
                                                                    i45 = z11;
                                                                    ak5 e22 = yj5Var4.e(videoRenderer2, file4, d2, linkedHashSet6);
                                                                    String name22 = videoRenderer2.name();
                                                                    Locale locale32 = Locale.US;
                                                                    locale32.getClass();
                                                                    String lowerCase32 = name22.toLowerCase(locale32);
                                                                    lowerCase32.getClass();
                                                                    if (i46) {
                                                                    }
                                                                    String str252 = e22.a;
                                                                    boolean z162 = e22.b;
                                                                    file6 = e22.c;
                                                                    if (file6 != null) {
                                                                    }
                                                                    String absolutePath2 = file4.getAbsolutePath();
                                                                    Log.w(str10, str12 + lowerCase32 + str5 + i47 + str4 + i45 + " resumeMs=" + i16 + str3 + i18 + str2 + str252 + str + (z162 ? 1 : 0) + str11 + absolutePath2);
                                                                }
                                                                li5Var2.R = null;
                                                                li5Var2.X = null;
                                                                li5Var2.Y = null;
                                                                li5Var2.Z = e;
                                                                li5Var2.d0 = linkedHashSet10;
                                                                li5Var2.e0 = d2;
                                                                li5Var2.f0 = file3;
                                                                li5Var2.g0 = null;
                                                                li5Var2.i0 = i9;
                                                                li5Var2.j0 = z2 ? 1 : 0;
                                                                li5Var2.k0 = i2;
                                                                li5Var2.l0 = i3 == 1 ? 1 : 0;
                                                                li5Var2.m0 = i56;
                                                                li5Var2.q0 = j10;
                                                                li5Var2.n0 = i8;
                                                                li5Var2.o0 = i55;
                                                                z6 = z5;
                                                                li5Var2.r0 = z6;
                                                                li5Var2.p0 = currentFrameIndexForDebug;
                                                                li5Var2.u0 = 5;
                                                                int i57 = i2;
                                                                i10 = i3 == 1 ? 1 : 0;
                                                                videoRenderer = e;
                                                                x61Var2 = x61Var7;
                                                                Object s = s(videoRenderer, currentFrameIndexForDebug, i55, j3, li5Var2);
                                                                li5Var2 = li5Var2;
                                                                if (s == x61Var2) {
                                                                    return x61Var2;
                                                                }
                                                                i11 = currentFrameIndexForDebug;
                                                                i12 = i55;
                                                                i13 = i56;
                                                                j4 = j10;
                                                                str = str;
                                                                i14 = z2 ? 1 : 0;
                                                                i15 = i57;
                                                                linkedHashSet8 = linkedHashSet10;
                                                                try {
                                                                    melonEmulator.pauseEmulation();
                                                                    currentFrameIndexForDebug2 = RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug();
                                                                    x61Var5 = x61Var2;
                                                                    int i58 = 1000;
                                                                    if (i8 >= 1000) {
                                                                        i58 = i8;
                                                                    }
                                                                    i41 = i12;
                                                                    z13 = z6;
                                                                    j7 = i58;
                                                                    try {
                                                                        li5Var2.R = null;
                                                                        li5Var2.X = null;
                                                                        li5Var2.Y = null;
                                                                        li5Var2.Z = videoRenderer;
                                                                        li5Var2.d0 = linkedHashSet8;
                                                                        li5Var2.e0 = d2;
                                                                        li5Var2.f0 = file3;
                                                                        li5Var2.g0 = null;
                                                                        li5Var2.i0 = i9;
                                                                        li5Var2.j0 = i14;
                                                                        li5Var2.k0 = i15;
                                                                        li5Var2.l0 = i10;
                                                                        li5Var2.m0 = i13;
                                                                        li5Var2.q0 = j4;
                                                                        li5Var2.n0 = i8;
                                                                        li5Var2.o0 = i41;
                                                                        z12 = z13;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        z12 = z13;
                                                                    }
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    z12 = z6;
                                                                }
                                                                try {
                                                                    li5Var2.r0 = z12;
                                                                    li5Var2.p0 = i11;
                                                                    li5Var2.u0 = 6;
                                                                    if (t(videoRenderer, currentFrameIndexForDebug2, j7, li5Var2) != x61Var5) {
                                                                        return x61Var5;
                                                                    }
                                                                    i42 = i41;
                                                                    str23 = d2;
                                                                    videoRenderer7 = videoRenderer;
                                                                    i43 = i8;
                                                                    i44 = i14;
                                                                    i = z12;
                                                                    try {
                                                                        lc1 lc1Var3 = lc1.a;
                                                                        i17 = 1;
                                                                        lc1.e(true);
                                                                        i45 = i;
                                                                        i16 = i43;
                                                                        videoRenderer2 = videoRenderer7;
                                                                        i46 = i44;
                                                                        file4 = file3;
                                                                        i18 = i42;
                                                                        linkedHashSet6 = linkedHashSet8;
                                                                        d2 = str23;
                                                                        yj5Var4 = yj5Var3;
                                                                        ak5 e222 = yj5Var4.e(videoRenderer2, file4, d2, linkedHashSet6);
                                                                        String name222 = videoRenderer2.name();
                                                                        Locale locale322 = Locale.US;
                                                                        locale322.getClass();
                                                                        String lowerCase322 = name222.toLowerCase(locale322);
                                                                        lowerCase322.getClass();
                                                                        if (i46) {
                                                                        }
                                                                        String str2522 = e222.a;
                                                                        boolean z1622 = e222.b;
                                                                        file6 = e222.c;
                                                                        if (file6 != null) {
                                                                        }
                                                                        String absolutePath22 = file4.getAbsolutePath();
                                                                        Log.w(str10, str12 + lowerCase322 + str5 + i47 + str4 + i45 + " resumeMs=" + i16 + str3 + i18 + str2 + str2522 + str + (z1622 ? 1 : 0) + str11 + absolutePath22);
                                                                    } catch (Throwable th7) {
                                                                        th = th7;
                                                                        if (i == 0) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                } catch (Throwable th8) {
                                                                    th = th8;
                                                                    i = z12;
                                                                    if (i == 0) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th9) {
                                                                th = th9;
                                                                r11 = z5;
                                                                i = r11;
                                                                if (i == 0) {
                                                                    lc1 lc1Var4 = lc1.a;
                                                                    lc1.e(false);
                                                                    melonEmulator.resumeEmulation();
                                                                }
                                                                throw th;
                                                            }
                                                            lc1.e(false);
                                                            currentFrameIndexForDebug = RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug();
                                                            melonEmulator.resumeEmulation();
                                                            yj5Var3 = yj5Var2;
                                                            j3 = i8;
                                                        }
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_BOTTOM_PLACEHOLDER);
                                                break;
                                            case -2087035092:
                                                if (!str24.equals("packed_top_control")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                        break;
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72 = yj5Var;
                                                    LinkedHashSet linkedHashSet102 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72;
                                                    int i552 = i7;
                                                    int i562 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72 = x61Var;
                                                    long j102 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_CONTROL);
                                                break;
                                            case -2010319127:
                                                if (!str24.equals("soft_packed_frame_meta")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722;
                                                    int i5522 = i7;
                                                    int i5622 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722 = x61Var;
                                                    long j1022 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SOFT_PACKED_FRAME_META_JSON);
                                                break;
                                            case -1937062788:
                                                if (!str24.equals("renderer3dcoverage")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222;
                                                    int i55222 = i7;
                                                    int i56222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222 = x61Var;
                                                    long j10222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_COVERAGE);
                                                break;
                                            case -1934316381:
                                                if (!str24.equals("packedbottom")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222;
                                                    int i552222 = i7;
                                                    int i562222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222 = x61Var;
                                                    long j102222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_PRIMARY);
                                                break;
                                            case -1846844805:
                                                if (!str24.equals("renderer3dcaptureframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222;
                                                    int i5522222 = i7;
                                                    int i5622222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222 = x61Var;
                                                    long j1022222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_CAPTURE_FRAME);
                                                break;
                                            case -1782551346:
                                                if (!str24.equals("fallbackmask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222;
                                                    int i55222222 = i7;
                                                    int i56222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222 = x61Var;
                                                    long j10222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_FALLBACK_MASK);
                                                break;
                                            case -1737750013:
                                                if (!str24.equals("comp4bottomplaceholder")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222;
                                                    int i552222222 = i7;
                                                    int i562222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222 = x61Var;
                                                    long j102222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_BOTTOM_PLACEHOLDER);
                                                break;
                                            case -1661451021:
                                                if (!str24.equals("softpackedframejson")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222;
                                                    int i5522222222 = i7;
                                                    int i5622222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222 = x61Var;
                                                    long j1022222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SOFT_PACKED_FRAME_META_JSON);
                                                break;
                                            case -1661374960:
                                                if (!str24.equals("softpackedframemeta")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222;
                                                    int i55222222222 = i7;
                                                    int i56222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222 = x61Var;
                                                    long j10222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SOFT_PACKED_FRAME_META_JSON);
                                                break;
                                            case -1645794965:
                                                if (!str24.equals("composited_frame")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222;
                                                    int i552222222222 = i7;
                                                    int i562222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222 = x61Var;
                                                    long j102222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMPOSITED_FRAME);
                                                break;
                                            case -1642626848:
                                                if (!str24.equals("packedtopcontrol")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222;
                                                    int i5522222222222 = i7;
                                                    int i5622222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222 = x61Var;
                                                    long j1022222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_CONTROL);
                                                break;
                                            case -1582757278:
                                                if (!str24.equals("packed_bottom_plane1")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222;
                                                    int i55222222222222 = i7;
                                                    int i56222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222 = x61Var;
                                                    long j10222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_PLANE1);
                                                break;
                                            case -1541729193:
                                                if (!str24.equals("capture3d")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222;
                                                    int i552222222222222 = i7;
                                                    int i562222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222 = x61Var;
                                                    long j102222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_CAPTURE_FRAME);
                                                break;
                                            case -1521836238:
                                                if (!str24.equals("capture3dsource")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222;
                                                    int i5522222222222222 = i7;
                                                    int i5622222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222 = x61Var;
                                                    long j1022222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE3D_SOURCE_DS_FRAME);
                                                break;
                                            case -1485088398:
                                                if (!str24.equals("packedtopplane1")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222;
                                                    int i55222222222222222 = i7;
                                                    int i56222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222 = x61Var;
                                                    long j10222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_PLANE1);
                                                break;
                                            case -1454827237:
                                                if (!str24.equals("comp4_top")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222;
                                                    int i552222222222222222 = i7;
                                                    int i562222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222 = x61Var;
                                                    long j102222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_TOP_PLACEHOLDER);
                                                break;
                                            case -1404123096:
                                                if (!str24.equals("capturefallback")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222;
                                                    int i5522222222222222222 = i7;
                                                    int i5622222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222 = x61Var;
                                                    long j1022222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_FALLBACK_MASK);
                                                break;
                                            case -1068115457:
                                                if (!str24.equals("vulkan_composited_frame")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222;
                                                    int i55222222222222222222 = i7;
                                                    int i56222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222 = x61Var;
                                                    long j10222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMPOSITED_FRAME);
                                                break;
                                            case -995865480:
                                                if (str24.equals("packed")) {
                                                    linkedHashSet3.add(vj5.PACKED_TOP_PRIMARY);
                                                    linkedHashSet3.add(vj5.PACKED_BOTTOM_PRIMARY);
                                                    break;
                                                } else {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222;
                                                    int i552222222222222222222 = i7;
                                                    int i562222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222 = x61Var;
                                                    long j102222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                break;
                                            case -975978970:
                                                if (!str24.equals("capturelinemask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222;
                                                    int i5522222222222222222222 = i7;
                                                    int i5622222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222 = x61Var;
                                                    long j1022222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_LINE_USES_3D_MASK);
                                                break;
                                            case -962217605:
                                                if (!str24.equals("capture3dsourceframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222;
                                                    int i55222222222222222222222 = i7;
                                                    int i56222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222 = x61Var;
                                                    long j10222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE3D_SOURCE_DS_FRAME);
                                                break;
                                            case -907689876:
                                                if (!str24.equals("screen")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222;
                                                    int i552222222222222222222222 = i7;
                                                    int i562222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222 = x61Var;
                                                    long j102222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SCREEN_FRAME);
                                                break;
                                            case -821431768:
                                                if (!str24.equals("vulkancomposited")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222;
                                                    int i5522222222222222222222222 = i7;
                                                    int i5622222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMPOSITED_FRAME);
                                                break;
                                            case -758324059:
                                                if (!str24.equals("comp4_bottom")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222;
                                                    int i55222222222222222222222222 = i7;
                                                    int i56222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_BOTTOM_PLACEHOLDER);
                                                break;
                                            case -636388588:
                                                if (!str24.equals("capturefallbackmask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222;
                                                    int i552222222222222222222222222 = i7;
                                                    int i562222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_FALLBACK_MASK);
                                                break;
                                            case -601099216:
                                                if (!str24.equals("comp4top")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222;
                                                    int i5522222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_TOP_PLACEHOLDER);
                                                break;
                                            case -594643969:
                                                if (!str24.equals("packedbottomprimary")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222;
                                                    int i55222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_PRIMARY);
                                                break;
                                            case -442921697:
                                                if (!str24.equals("exact-frame")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222;
                                                    int i552222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            case -442704195:
                                                if (!str24.equals("composited")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222;
                                                    int i5522222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMPOSITED_FRAME);
                                                break;
                                            case -375394832:
                                                if (!str24.equals("packed_bottom_control")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222;
                                                    int i55222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_CONTROL);
                                                break;
                                            case -351767064:
                                                if (!str24.equals("coverage")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222;
                                                    int i552222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_COVERAGE);
                                                break;
                                            case -185654247:
                                                if (!str24.equals("capture_line_uses_3d_mask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_LINE_USES_3D_MASK);
                                                break;
                                            case -170775473:
                                                if (!str24.equals("comp4_top_placeholder")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_TOP_PLACEHOLDER);
                                                break;
                                            case -93183101:
                                                if (!str24.equals("capturelineuses3dmask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_LINE_USES_3D_MASK);
                                                break;
                                            case -36680575:
                                                if (!str24.equals("screenframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SCREEN_FRAME);
                                                break;
                                            case 1681:
                                                if (!str24.equals("3d")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_FRAME);
                                                break;
                                            case 96673:
                                                if (str24.equals("all")) {
                                                    vj5.Companion.getClass();
                                                    set = vj5.allKinds;
                                                    linkedHashSet3.addAll(set);
                                                    break;
                                                } else {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                break;
                                            case 3004913:
                                                if (!str24.equals("attr")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_ATTR);
                                                break;
                                            case 95472323:
                                                if (!str24.equals("depth")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_DEPTH);
                                                break;
                                            case 140919054:
                                                if (!str24.equals("packed_top")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_PRIMARY);
                                                break;
                                            case 164552669:
                                                if (!str24.equals("vulkan-exact")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            case 196116660:
                                                if (!str24.equals("vulkanexact")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            case 224351794:
                                                if (!str24.equals("renderer3dcapture")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_CAPTURE_FRAME);
                                                break;
                                            case 405645655:
                                                if (!str24.equals("attributes")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_ATTR);
                                                break;
                                            case 440238502:
                                                if (!str24.equals("packed_top_plane1")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_PLANE1);
                                                break;
                                            case 542057647:
                                                if (!str24.equals("renderer3ddepth")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_DEPTH);
                                                break;
                                            case 544277337:
                                                if (!str24.equals("renderer3dframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_FRAME);
                                                break;
                                            case 671664986:
                                                if (!str24.equals("packedbottomcontrol")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_CONTROL);
                                                break;
                                            case 988535853:
                                                if (!str24.equals("exact_frame")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            case 1049062293:
                                                if (!str24.equals("3dcapture")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_CAPTURE_FRAME);
                                                break;
                                            case 1194599060:
                                                if (!str24.equals("renderer3d")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_FRAME);
                                                break;
                                            case 1368068931:
                                                if (!str24.equals("comp4topplaceholder")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_TOP_PLACEHOLDER);
                                                break;
                                            case 1386031493:
                                                if (!str24.equals("packedtopprimary")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_PRIMARY);
                                                break;
                                            case 1421398994:
                                                if (!str24.equals("packed_bottom")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_PRIMARY);
                                                break;
                                            case 1477736656:
                                                if (!str24.equals("compositedframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMPOSITED_FRAME);
                                                break;
                                            case 1499060152:
                                                if (!str24.equals("packedbottomplane1")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_BOTTOM_PLANE1);
                                                break;
                                            case 1596010219:
                                                if (!str24.equals("vulkan_exact")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            case 1730247920:
                                                if (!str24.equals("capture_fallback_mask")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE_FALLBACK_MASK);
                                                break;
                                            case 1805580505:
                                                if (!str24.equals("comp4_bottom_placeholder")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.COMP4_BOTTOM_PLACEHOLDER);
                                                break;
                                            case 1805681117:
                                                if (!str24.equals("packedtop")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.PACKED_TOP_PRIMARY);
                                                break;
                                            case 1917234727:
                                                if (!str24.equals("softpackedmeta")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.SOFT_PACKED_FRAME_META_JSON);
                                                break;
                                            case 1957073541:
                                                if (!str24.equals("renderer3dattr")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var722222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222222222222222;
                                                    int i5522222222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i5622222222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var722222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j1022222222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.RENDERER3D_ATTR);
                                                break;
                                            case 2099226433:
                                                if (!str24.equals("capture3dsourceds")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var2222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var7222222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222222222222222;
                                                    int i55222222222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i56222222222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var7222222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j10222222222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.add(vj5.CAPTURE3D_SOURCE_DS_FRAME);
                                                break;
                                            case 2116904398:
                                                if (!str24.equals("exactframe")) {
                                                    i.h("Unsupported capture kind=".concat(str24));
                                                    linkedHashSet3 = null;
                                                    d2 = d(intent2, "capture_id", "capture_id_base");
                                                    if (d2 != null) {
                                                    }
                                                    externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                    if (externalFilesDir == null) {
                                                    }
                                                    file = externalFilesDir;
                                                    if (i2 <= 1) {
                                                    }
                                                    lc1 lc1Var22222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                    z5 = lc1.c;
                                                    if (i2 <= 1) {
                                                    }
                                                    yj5 yj5Var72222222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                    LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                    yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222222222222222;
                                                    int i552222222222222222222222222222222222222222222222222222222222222222 = i7;
                                                    int i562222222222222222222222222222222222222222222222222222222222222222 = i4;
                                                    file3 = file;
                                                    str10 = str6;
                                                    str11 = str7;
                                                    x61 x61Var72222222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                    long j102222222222222222222222222222222222222222222222222222222222222222 = j2;
                                                    i8 = i5;
                                                    i9 = z4 ? 1 : 0;
                                                    if (z5) {
                                                    }
                                                }
                                                linkedHashSet3.addAll(zj5.a);
                                                break;
                                            default:
                                                i.h("Unsupported capture kind=".concat(str24));
                                                linkedHashSet3 = null;
                                                d2 = d(intent2, "capture_id", "capture_id_base");
                                                if (d2 != null) {
                                                }
                                                externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                                if (externalFilesDir == null) {
                                                }
                                                file = externalFilesDir;
                                                if (i2 <= 1) {
                                                }
                                                lc1 lc1Var222222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                                z5 = lc1.c;
                                                if (i2 <= 1) {
                                                }
                                                yj5 yj5Var722222222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                                LinkedHashSet linkedHashSet1022222222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                                yj5Var2 = yj5Var722222222222222222222222222222222222222222222222222222222222222222;
                                                int i5522222222222222222222222222222222222222222222222222222222222222222 = i7;
                                                int i5622222222222222222222222222222222222222222222222222222222222222222 = i4;
                                                file3 = file;
                                                str10 = str6;
                                                str11 = str7;
                                                x61 x61Var722222222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                                long j1022222222222222222222222222222222222222222222222222222222222222222 = j2;
                                                i8 = i5;
                                                i9 = z4 ? 1 : 0;
                                                if (z5) {
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                }
                                linkedHashSet3 = linkedHashSet2;
                                d2 = d(intent2, "capture_id", "capture_id_base");
                                if (d2 != null) {
                                }
                                externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                if (externalFilesDir == null) {
                                }
                                file = externalFilesDir;
                                if (i2 <= 1) {
                                }
                                lc1 lc1Var2222222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                z5 = lc1.c;
                                if (i2 <= 1) {
                                }
                                yj5 yj5Var7222222222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                LinkedHashSet linkedHashSet10222222222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                yj5Var2 = yj5Var7222222222222222222222222222222222222222222222222222222222222222222;
                                int i55222222222222222222222222222222222222222222222222222222222222222222 = i7;
                                int i56222222222222222222222222222222222222222222222222222222222222222222 = i4;
                                file3 = file;
                                str10 = str6;
                                str11 = str7;
                                x61 x61Var7222222222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                long j10222222222222222222222222222222222222222222222222222222222222222222 = j2;
                                i8 = i5;
                                i9 = z4 ? 1 : 0;
                                if (z5) {
                                }
                                break;
                            case 1:
                                ?? r0 = li5Var2.j0;
                                ?? r12 = li5Var2.i0;
                                intent2 = li5Var2.Y;
                                sb1 sb1Var3 = li5Var2.X;
                                context2 = li5Var2.R;
                                oi2.Y(r1);
                                yj5Var = yj5Var5;
                                z2 = r0;
                                sb1Var2 = sb1Var3;
                                z4 = r12;
                                e = ((ng6) ((kd6) sb1Var2.s.get())).e();
                                str = " success=";
                                str2 = " captureId=";
                                c = c(intent2, "burst_count", "capture_count");
                                if (c == null) {
                                }
                                b = b(intent2, "burst_live", "live_burst");
                                if (b == null) {
                                }
                                str4 = " paused=";
                                c2 = c(intent2, "burst_step_frames", "step_frames");
                                if (c2 == null) {
                                }
                                c3 = c(intent2, "timeout_ms");
                                if (c3 != null) {
                                }
                                melonEmulator = melonEmulator2;
                                c4 = c(intent2, "resume_ms", "duration_ms");
                                if (c4 == null) {
                                }
                                str7 = " outputDir=";
                                c5 = c(intent2, "resume_frames", "frames");
                                if (c5 == null) {
                                }
                                str8 = "action=dump_renderer_capture mode=release renderer=";
                                d = d(intent2, "capture_kinds", "kinds");
                                if (i2 <= 1) {
                                }
                                if (d == null) {
                                }
                                if (str9 == null) {
                                }
                                if (str9.length() != 0) {
                                }
                                linkedHashSet3 = linkedHashSet2;
                                d2 = d(intent2, "capture_id", "capture_id_base");
                                if (d2 != null) {
                                }
                                externalFilesDir = context2.getExternalFilesDir("renderer-debug-captures");
                                if (externalFilesDir == null) {
                                }
                                file = externalFilesDir;
                                if (i2 <= 1) {
                                }
                                lc1 lc1Var22222222222222222222222222222222222222222222222222222222222222222222 = lc1.a;
                                z5 = lc1.c;
                                if (i2 <= 1) {
                                }
                                yj5 yj5Var72222222222222222222222222222222222222222222222222222222222222222222 = yj5Var;
                                LinkedHashSet linkedHashSet102222222222222222222222222222222222222222222222222222222222222222222 = linkedHashSet3;
                                yj5Var2 = yj5Var72222222222222222222222222222222222222222222222222222222222222222222;
                                int i552222222222222222222222222222222222222222222222222222222222222222222 = i7;
                                int i562222222222222222222222222222222222222222222222222222222222222222222 = i4;
                                file3 = file;
                                str10 = str6;
                                str11 = str7;
                                x61 x61Var72222222222222222222222222222222222222222222222222222222222222222222 = x61Var;
                                long j102222222222222222222222222222222222222222222222222222222222222222222 = j2;
                                i8 = i5;
                                i9 = z4 ? 1 : 0;
                                if (z5) {
                                }
                                break;
                            case 2:
                                boolean z17 = li5Var2.r0;
                                int i59 = li5Var2.o0;
                                int i60 = li5Var2.n0;
                                i24 = i59;
                                long j11 = li5Var2.q0;
                                int i61 = li5Var2.m0;
                                int i62 = li5Var2.l0;
                                int i63 = li5Var2.k0;
                                int i64 = li5Var2.j0;
                                int i65 = li5Var2.i0;
                                File file9 = li5Var2.g0;
                                String str26 = li5Var2.e0;
                                Set set2 = li5Var2.d0;
                                videoRenderer4 = li5Var2.Z;
                                oi2.Y(r1);
                                str5 = " refreshed=";
                                i25 = i64;
                                yj5Var = yj5Var5;
                                file5 = file9;
                                str7 = " outputDir=";
                                x61Var3 = x61Var6;
                                z9 = z17;
                                d2 = str26;
                                str8 = "action=dump_renderer_capture mode=release renderer=";
                                linkedHashSet3 = set2;
                                i26 = i62;
                                i28 = i61;
                                str4 = " paused=";
                                str = " success=";
                                i2 = i63;
                                str6 = "DebugCommand";
                                str2 = " captureId=";
                                str3 = " resumeFrames=";
                                j6 = j11;
                                i27 = i65;
                                melonEmulator = melonEmulator2;
                                i5 = i60;
                                int i532 = i24;
                                e = videoRenderer4;
                                i21 = i532;
                                long j82 = j6;
                                i22 = i28;
                                i31 = i27;
                                i30 = i26;
                                linkedHashSet4 = linkedHashSet3;
                                i23 = i25;
                                j5 = j82;
                                str14 = d2;
                                LinkedHashSet linkedHashSet922 = linkedHashSet4;
                                x61Var4 = x61Var3;
                                ?? hw6Var22 = new hw6(1, null);
                                if (str14 == null) {
                                }
                                hexString.getClass();
                                mi5 mi5Var32 = hw6Var22;
                                if (i21 <= 0) {
                                }
                                li5Var2.R = null;
                                li5Var2.X = null;
                                li5Var2.Y = null;
                                li5Var2.Z = e;
                                li5Var2.d0 = null;
                                li5Var2.e0 = null;
                                li5Var2.f0 = null;
                                li5Var2.g0 = file5;
                                li5Var2.h0 = hexString;
                                li5Var2.i0 = i31;
                                li5Var2.j0 = i23;
                                li5Var2.k0 = i2;
                                li5Var2.l0 = i30;
                                li5Var2.m0 = i22;
                                li5Var2.q0 = j5;
                                li5Var2.n0 = i5;
                                li5Var2.o0 = i21;
                                li5Var2.r0 = z9;
                                li5Var2.u0 = 3;
                                videoRenderer5 = e;
                                i32 = i2;
                                i33 = i22;
                                long j922 = j5;
                                int i5422 = i5;
                                str15 = str3;
                                str16 = str6;
                                str17 = str5;
                                mi5 mi5Var222 = mi5Var32;
                                str18 = hexString;
                                i34 = i21;
                                yj5 yj5Var622 = yj5Var;
                                i35 = i23;
                                str19 = str2;
                                str20 = str;
                                z10 = z9;
                                str21 = str4;
                                d3 = yj5Var622.d(videoRenderer5, file5, str18, i32, i33, j922, linkedHashSet922, i34, mi5Var222, li5Var2);
                                if (d3 == x61Var4) {
                                }
                                break;
                            case 3:
                                ?? r3 = li5Var2.r0;
                                int i66 = li5Var2.o0;
                                int i67 = li5Var2.n0;
                                int i68 = li5Var2.m0;
                                int i69 = li5Var2.k0;
                                int i70 = li5Var2.j0;
                                String str27 = li5Var2.h0;
                                File file10 = li5Var2.g0;
                                Set set3 = li5Var2.d0;
                                videoRenderer6 = li5Var2.Z;
                                oi2.Y(r1);
                                str16 = "DebugCommand";
                                str8 = "action=dump_renderer_capture mode=release renderer=";
                                melonEmulator = melonEmulator2;
                                str7 = " outputDir=";
                                i34 = i66;
                                str19 = " captureId=";
                                str15 = " resumeFrames=";
                                str17 = " refreshed=";
                                i37 = r3;
                                i36 = i69;
                                str18 = str27;
                                i38 = i67;
                                str20 = " success=";
                                serializable = r1;
                                i33 = i68;
                                i35 = i70;
                                file5 = file10;
                                str21 = " paused=";
                                list = (List) serializable;
                                if (list == null) {
                                    break;
                                }
                                i39 = 0;
                                while (r8.hasNext()) {
                                }
                                String name3 = videoRenderer6.name();
                                Locale locale22 = Locale.US;
                                locale22.getClass();
                                String lowerCase22 = name3.toLowerCase(locale22);
                                lowerCase22.getClass();
                                if (i35 == 0) {
                                }
                                if (i34 <= 0) {
                                }
                                Log.w(str16, str8 + lowerCase22 + str17 + i40 + str21 + i37 + " liveBurst=1 resumeMs=" + i38 + str15 + i34 + " warmupMode=" + str22 + " burstCount=" + i36 + " burstStepFrames=" + i33 + str19 + str18 + str20 + i39 + "/" + list.size() + str7 + file5.getAbsolutePath());
                                break;
                            case 4:
                                z8 = li5Var2.r0;
                                int i71 = li5Var2.o0;
                                i20 = li5Var2.n0;
                                ?? r4 = li5Var2.j0;
                                file4 = li5Var2.f0;
                                i19 = i71;
                                String str28 = li5Var2.e0;
                                Set set4 = li5Var2.d0;
                                videoRenderer3 = li5Var2.Z;
                                oi2.Y(r1);
                                linkedHashSet7 = set4;
                                str2 = " captureId=";
                                str3 = " resumeFrames=";
                                str4 = " paused=";
                                str5 = " refreshed=";
                                str10 = "DebugCommand";
                                str12 = "action=dump_renderer_capture mode=release renderer=";
                                melonEmulator = melonEmulator2;
                                str11 = " outputDir=";
                                str13 = str28;
                                yj5Var2 = yj5Var5;
                                str = " success=";
                                z7 = r4;
                                i16 = i20;
                                z11 = z8;
                                z2 = z7;
                                videoRenderer2 = videoRenderer3;
                                i18 = i19;
                                i17 = 1;
                                d2 = str13;
                                linkedHashSet5 = linkedHashSet7;
                                yj5Var4 = yj5Var2;
                                linkedHashSet6 = linkedHashSet5;
                                i46 = z2;
                                i45 = z11;
                                ak5 e2222 = yj5Var4.e(videoRenderer2, file4, d2, linkedHashSet6);
                                String name2222 = videoRenderer2.name();
                                Locale locale3222 = Locale.US;
                                locale3222.getClass();
                                String lowerCase3222 = name2222.toLowerCase(locale3222);
                                lowerCase3222.getClass();
                                if (i46) {
                                }
                                String str25222 = e2222.a;
                                boolean z16222 = e2222.b;
                                file6 = e2222.c;
                                if (file6 != null) {
                                }
                                String absolutePath222 = file4.getAbsolutePath();
                                Log.w(str10, str12 + lowerCase3222 + str5 + i47 + str4 + i45 + " resumeMs=" + i16 + str3 + i18 + str2 + str25222 + str + (z16222 ? 1 : 0) + str11 + absolutePath222);
                                break;
                            case 5:
                                int i72 = li5Var2.p0;
                                boolean z18 = li5Var2.r0;
                                int i73 = li5Var2.o0;
                                int i74 = li5Var2.n0;
                                long j12 = li5Var2.q0;
                                int i75 = li5Var2.m0;
                                int i76 = li5Var2.l0;
                                int i77 = li5Var2.k0;
                                int i78 = li5Var2.j0;
                                int i79 = li5Var2.i0;
                                File file11 = li5Var2.f0;
                                String str29 = li5Var2.e0;
                                Set set5 = li5Var2.d0;
                                VideoRenderer videoRenderer8 = li5Var2.Z;
                                oi2.Y(r1);
                                str10 = "DebugCommand";
                                str11 = " outputDir=";
                                i13 = i75;
                                file3 = file11;
                                linkedHashSet8 = set5;
                                z6 = z18;
                                str3 = " resumeFrames=";
                                str12 = "action=dump_renderer_capture mode=release renderer=";
                                melonEmulator = melonEmulator2;
                                i9 = i79;
                                d2 = str29;
                                i10 = i76;
                                str5 = " refreshed=";
                                i14 = i78;
                                i12 = i73;
                                yj5Var3 = yj5Var5;
                                i15 = i77;
                                str4 = " paused=";
                                i11 = i72;
                                i8 = i74;
                                videoRenderer = videoRenderer8;
                                x61Var2 = x61Var6;
                                str = " success=";
                                str2 = " captureId=";
                                j4 = j12;
                                melonEmulator.pauseEmulation();
                                currentFrameIndexForDebug2 = RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug();
                                x61Var5 = x61Var2;
                                int i582 = 1000;
                                if (i8 >= 1000) {
                                }
                                i41 = i12;
                                z13 = z6;
                                j7 = i582;
                                li5Var2.R = null;
                                li5Var2.X = null;
                                li5Var2.Y = null;
                                li5Var2.Z = videoRenderer;
                                li5Var2.d0 = linkedHashSet8;
                                li5Var2.e0 = d2;
                                li5Var2.f0 = file3;
                                li5Var2.g0 = null;
                                li5Var2.i0 = i9;
                                li5Var2.j0 = i14;
                                li5Var2.k0 = i15;
                                li5Var2.l0 = i10;
                                li5Var2.m0 = i13;
                                li5Var2.q0 = j4;
                                li5Var2.n0 = i8;
                                li5Var2.o0 = i41;
                                z12 = z13;
                                li5Var2.r0 = z12;
                                li5Var2.p0 = i11;
                                li5Var2.u0 = 6;
                                if (t(videoRenderer, currentFrameIndexForDebug2, j7, li5Var2) != x61Var5) {
                                }
                                break;
                            case 6:
                                ?? r32 = li5Var2.r0;
                                int i80 = li5Var2.o0;
                                i43 = li5Var2.n0;
                                i44 = li5Var2.j0;
                                i42 = i80;
                                File file12 = li5Var2.f0;
                                String str30 = li5Var2.e0;
                                Set set6 = li5Var2.d0;
                                videoRenderer7 = li5Var2.Z;
                                oi2.Y(r1);
                                linkedHashSet8 = set6;
                                yj5Var3 = yj5Var5;
                                str = " success=";
                                str2 = " captureId=";
                                str3 = " resumeFrames=";
                                str4 = " paused=";
                                str5 = " refreshed=";
                                str10 = "DebugCommand";
                                str12 = "action=dump_renderer_capture mode=release renderer=";
                                melonEmulator = melonEmulator2;
                                str11 = " outputDir=";
                                file3 = file12;
                                str23 = str30;
                                i = r32;
                                lc1 lc1Var32 = lc1.a;
                                i17 = 1;
                                lc1.e(true);
                                i45 = i;
                                i16 = i43;
                                videoRenderer2 = videoRenderer7;
                                i46 = i44;
                                file4 = file3;
                                i18 = i42;
                                linkedHashSet6 = linkedHashSet8;
                                d2 = str23;
                                yj5Var4 = yj5Var3;
                                ak5 e22222 = yj5Var4.e(videoRenderer2, file4, d2, linkedHashSet6);
                                String name22222 = videoRenderer2.name();
                                Locale locale32222 = Locale.US;
                                locale32222.getClass();
                                String lowerCase32222 = name22222.toLowerCase(locale32222);
                                lowerCase32222.getClass();
                                if (i46) {
                                }
                                String str252222 = e22222.a;
                                boolean z162222 = e22222.b;
                                file6 = e22222.c;
                                if (file6 != null) {
                                }
                                String absolutePath2222 = file4.getAbsolutePath();
                                Log.w(str10, str12 + lowerCase32222 + str5 + i47 + str4 + i45 + " resumeMs=" + i16 + str3 + i18 + str2 + str252222 + str + (z162222 ? 1 : 0) + str11 + absolutePath2222);
                                break;
                            default:
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (i) {
                }
            } catch (Throwable th10) {
                th = th10;
                melonEmulator = melonEmulator2;
            }
        } catch (Throwable th11) {
            th = th11;
        }
        li5Var = new li5(this, s41Var);
        li5 li5Var22 = li5Var;
        ?? r13 = li5Var22.s0;
        x61 x61Var62 = x61.COROUTINE_SUSPENDED;
        i = li5Var22.u0;
        ?? r112 = "DebugCommand";
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sb1 sb1Var, Intent intent, s41 s41Var) {
        ni5 ni5Var;
        int i;
        String str;
        String str2;
        String str3;
        pc2 pc2Var;
        qb6 xy6Var;
        if (s41Var instanceof ni5) {
            ni5Var = (ni5) s41Var;
            int i2 = ni5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ni5Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = ni5Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ni5Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        str3 = ni5Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    String d = d(intent, "query", "value");
                    String str4 = (d == null || (str4 = qs6.T0(d).toString()) == null || str4.length() <= 0) ? null : null;
                    Uri[] r = ((ng6) ((kd6) sb1Var.s.get())).r();
                    int length = r.length;
                    if (str4 == null) {
                        str = "";
                    } else {
                        str = str4;
                    }
                    Log.w("DebugCommand", "action=dump_rom_search_state mode=release directoryCount=" + length + " query=" + str);
                    int length2 = r.length;
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < length2) {
                        Log.w("DebugCommand", "action=dump_rom_search_dir mode=release index=" + i4 + " uri=" + r[i3]);
                        i3++;
                        i4++;
                    }
                    if (str4 != null) {
                        Locale locale = Locale.US;
                        locale.getClass();
                        str2 = str4.toLowerCase(locale);
                        str2.getClass();
                    } else {
                        str2 = null;
                    }
                    g21 o = ((xb2) ((p06) sb1Var.x.get())).o();
                    ni5Var.R = str2;
                    ni5Var.Z = 1;
                    Object B = f04.B(o, ni5Var);
                    if (B == x61Var) {
                        return x61Var;
                    }
                    String str5 = str2;
                    obj = B;
                    str3 = str5;
                }
                pc2Var = new pc2(gt0.B0((Iterable) obj), true, new c70(str3, 13));
                if (!(pc2Var instanceof qp1)) {
                    xy6Var = ((qp1) pc2Var).take();
                } else {
                    xy6Var = new xy6(pc2Var);
                }
                List c0 = sb6.c0(xy6Var);
                Log.w("DebugCommand", "action=dump_rom_search_matches mode=release count=" + c0.size());
                int i5 = 0;
                for (Object obj2 : c0) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        pq5 pq5Var = (pq5) obj2;
                        Log.w("DebugCommand", "action=dump_rom_search_match mode=release index=" + i5 + " name=" + pq5Var.a + " fileName=" + pq5Var.c + " uri=" + pq5Var.d + " parentTreeUri=" + pq5Var.e);
                        i5 = i6;
                    } else {
                        hf.q0();
                        throw null;
                    }
                }
                return jg7.a;
            }
        }
        ni5Var = new ni5(this, s41Var);
        Object obj3 = ni5Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ni5Var.Z;
        if (i == 0) {
        }
        pc2Var = new pc2(gt0.B0((Iterable) obj3), true, new c70(str3, 13));
        if (!(pc2Var instanceof qp1)) {
        }
        List c02 = sb6.c0(xy6Var);
        Log.w("DebugCommand", "action=dump_rom_search_matches mode=release count=" + c02.size());
        int i52 = 0;
        while (r0.hasNext()) {
        }
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, Intent intent, s41 s41Var) {
        oi5 oi5Var;
        int i;
        int i2;
        int i3;
        Uri uri;
        int i4;
        ?? r1;
        int i5;
        int i6;
        int i7;
        boolean a2;
        if (s41Var instanceof oi5) {
            oi5Var = (oi5) s41Var;
            int i8 = oi5Var.f0;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oi5Var.f0 = i8 - Integer.MIN_VALUE;
                oi5 oi5Var2 = oi5Var;
                Object obj = oi5Var2.d0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = oi5Var2.f0;
                int i9 = 0;
                if (i == 0) {
                    if (i == 1) {
                        i5 = oi5Var2.Y;
                        boolean z = oi5Var2.Z;
                        i4 = oi5Var2.X;
                        uri = oi5Var2.R;
                        oi2.Y(obj);
                        r1 = z;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Uri data = intent.getData();
                    if (data == null) {
                        String d = d(intent, "rom_uri", "uri", "path");
                        if (d != null) {
                            data = Uri.parse(d);
                        } else {
                            data = null;
                        }
                        if (data == null) {
                            i.h("Missing ROM URI. Provide intent data or rom_uri.");
                            return null;
                        }
                    }
                    Uri uri2 = data;
                    Boolean b = b(intent, "wait_rom_ready", "wait_ready");
                    if (b != null) {
                        i2 = b.booleanValue();
                    } else {
                        i2 = 0;
                    }
                    boolean booleanExtra = intent.getBooleanExtra("pause_after", false);
                    Integer c = c(intent, "wait_timeout_ms", "timeout_ms");
                    if (c != null) {
                        i3 = c.intValue();
                        if (i3 < 1) {
                            i3 = 1;
                        }
                    } else {
                        i3 = 8000;
                    }
                    int i10 = i3;
                    if (i2 != 0) {
                        lc1 lc1Var = lc1.a;
                        lc1.d = Boolean.valueOf(booleanExtra);
                    }
                    Intent intent2 = new Intent(context, EmulatorActivity.class);
                    intent2.setAction(a(context, "LAUNCH_ROM"));
                    intent2.setData(uri2);
                    intent2.addFlags(268435456);
                    intent2.addFlags(67108864);
                    intent2.addFlags(536870912);
                    ActivityOptions makeBasic = ActivityOptions.makeBasic();
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 >= 34) {
                        if (i11 >= 36) {
                            i6 = 3;
                        } else {
                            i6 = 1;
                        }
                        makeBasic.setPendingIntentBackgroundActivityStartMode(i6);
                        makeBasic.setPendingIntentCreatorBackgroundActivityStartMode(i6);
                    }
                    PendingIntent.getActivity(context, 1, intent2, 201326592).send(context, 0, null, null, null, null, makeBasic.toBundle());
                    oi5Var2.R = uri2;
                    oi5Var2.X = i2;
                    oi5Var2.Z = booleanExtra;
                    oi5Var2.Y = i10;
                    oi5Var2.f0 = 1;
                    if (q60.t(2000L, oi5Var2) == x61Var) {
                        return x61Var;
                    }
                    uri = uri2;
                    i4 = i2;
                    r1 = booleanExtra;
                    i5 = i10;
                }
                lc1 lc1Var2 = lc1.a;
                if (lc1.b.get() == null) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                a2 = lc1.a();
                if (a2 && i4 != 0) {
                    MelonEmulator melonEmulator = MelonEmulator.a;
                    if (r1 == 0) {
                        lc1.e(true);
                        melonEmulator.pauseEmulation();
                    } else {
                        lc1.e(false);
                        melonEmulator.resumeEmulation();
                    }
                }
                if (i4 != 0) {
                    i9 = 1;
                }
                ?? sb = new StringBuilder("action=launch_rom mode=release uri=");
                sb.append(uri);
                sb.append(" waitReady=");
                sb.append(i9);
                sb.append(" activitySeen=");
                lb1.x(sb, i7, " ready=", a2 ? 1 : 0, " pauseAfter=");
                sb.append(r1);
                sb.append(" requestedTimeoutMs=");
                sb.append(i5);
                sb.append(" deferredReady=1");
                Log.w("DebugCommand", sb.toString());
                return jg7.a;
            }
        }
        oi5Var = new oi5(this, s41Var);
        oi5 oi5Var22 = oi5Var;
        Object obj2 = oi5Var22.d0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = oi5Var22.f0;
        int i92 = 0;
        if (i == 0) {
        }
        lc1 lc1Var22 = lc1.a;
        if (lc1.b.get() == null) {
        }
        a2 = lc1.a();
        if (a2) {
            MelonEmulator melonEmulator2 = MelonEmulator.a;
            if (r1 == 0) {
            }
        }
        if (i4 != 0) {
        }
        ?? sb2 = new StringBuilder("action=launch_rom mode=release uri=");
        sb2.append(uri);
        sb2.append(" waitReady=");
        sb2.append(i92);
        sb2.append(" activitySeen=");
        lb1.x(sb2, i7, " ready=", a2 ? 1 : 0, " pauseAfter=");
        sb2.append(r1);
        sb2.append(" requestedTimeoutMs=");
        sb2.append(i5);
        sb2.append(" deferredReady=1");
        Log.w("DebugCommand", sb2.toString());
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(Context context, sb1 sb1Var, Intent intent, s41 s41Var) {
        pi5 pi5Var;
        int i;
        Intent intent2;
        Comparable comparable;
        Uri uri;
        MelonEmulator melonEmulator = MelonEmulator.a;
        if (s41Var instanceof pi5) {
            pi5Var = (pi5) s41Var;
            int i2 = pi5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pi5Var.Z = i2 - Integer.MIN_VALUE;
                pi5 pi5Var2 = pi5Var;
                Object obj = pi5Var2.X;
                Comparable comparable2 = x61.COROUTINE_SUSPENDED;
                i = pi5Var2.Z;
                if (i == 0) {
                    if (i == 1) {
                        intent2 = pi5Var2.R;
                        oi2.Y(obj);
                        comparable = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    pi5Var2.R = intent;
                    pi5Var2.Z = 1;
                    Comparable q = q(context, sb1Var, intent, true, pi5Var2);
                    if (q == comparable2) {
                        return comparable2;
                    }
                    intent2 = intent;
                    comparable = q;
                }
                uri = (Uri) comparable;
                if (uri == null) {
                    boolean booleanExtra = intent2.getBooleanExtra("pause_after", false);
                    lc1 lc1Var = lc1.a;
                    long j = lc1.e;
                    melonEmulator.pauseEmulation();
                    try {
                        boolean c = melonEmulator.c(uri);
                        if (lc1.e != j) {
                            if (!lc1.c) {
                                melonEmulator.resumeEmulation();
                            }
                        } else if (booleanExtra) {
                            lc1.e(true);
                        } else {
                            lc1.e(false);
                            melonEmulator.resumeEmulation();
                        }
                        Log.w("DebugCommand", "action=load_state mode=release uri=" + uri + " success=" + (c ? 1 : 0) + " pauseAfter=" + (booleanExtra ? 1 : 0));
                        return jg7.a;
                    } catch (Throwable th) {
                        lc1 lc1Var2 = lc1.a;
                        if (lc1.e != j) {
                            if (!lc1.c) {
                                melonEmulator.resumeEmulation();
                            }
                        } else if (booleanExtra) {
                            lc1.e(true);
                        } else {
                            lc1.e(false);
                            melonEmulator.resumeEmulation();
                        }
                        throw th;
                    }
                }
                i.h("Missing load target. Provide slot or path.");
                return null;
            }
        }
        pi5Var = new pi5(this, s41Var);
        pi5 pi5Var22 = pi5Var;
        Object obj2 = pi5Var22.X;
        Comparable comparable22 = x61.COROUTINE_SUSPENDED;
        i = pi5Var22.Z;
        if (i == 0) {
        }
        uri = (Uri) comparable;
        if (uri == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e9  */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0119 -> B:40:0x0124). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0187 -> B:59:0x01cd). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01be -> B:58:0x01c3). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Intent intent, s41 s41Var) {
        qi5 qi5Var;
        int i;
        b63 b63Var;
        int i2;
        int q;
        int q2;
        int i3;
        int q3;
        ArrayList arrayList;
        int i4;
        ArrayList arrayList2;
        int i5;
        x61 x61Var;
        int i6;
        int i7;
        int i8;
        int i9;
        b63 b63Var2;
        int i10;
        Iterator it;
        int i11;
        qi5 qi5Var2;
        int i12;
        int i13;
        int i14;
        MelonEmulator melonEmulator;
        if (s41Var instanceof qi5) {
            qi5Var = (qi5) s41Var;
            int i15 = qi5Var.o0;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                qi5Var.o0 = i15 - Integer.MIN_VALUE;
                Object obj = qi5Var.m0;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = qi5Var.o0;
                MelonEmulator melonEmulator2 = MelonEmulator.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i14 = qi5Var.j0;
                            int i16 = qi5Var.i0;
                            i5 = qi5Var.h0;
                            i8 = qi5Var.g0;
                            int i17 = qi5Var.f0;
                            i7 = qi5Var.e0;
                            i6 = qi5Var.d0;
                            int i18 = qi5Var.Z;
                            Iterator it2 = qi5Var.X;
                            ?? r9 = qi5Var.R;
                            oi2.Y(obj);
                            melonEmulator = melonEmulator2;
                            i13 = i18;
                            x61Var = x61Var2;
                            qi5Var2 = qi5Var;
                            ArrayList arrayList3 = r9;
                            Iterator it3 = it2;
                            int i19 = i13;
                            Iterator it4 = it3;
                            i4 = i17;
                            arrayList2 = arrayList3;
                            int i20 = i8;
                            int i21 = i16;
                            int i22 = i6;
                            int i23 = i14;
                            q3 = i7;
                            qi5Var = qi5Var2;
                            x61Var2 = x61Var;
                            melonEmulator2 = melonEmulator;
                            b63Var = null;
                            if (!it4.hasNext()) {
                                Object next = it4.next();
                                int i24 = i23 + 1;
                                if (i23 >= 0) {
                                    b63 b63Var3 = (b63) next;
                                    melonEmulator2.d(b63Var3);
                                    x61Var = x61Var2;
                                    int i25 = i23;
                                    qi5Var.R = arrayList2;
                                    qi5Var.X = it4;
                                    qi5Var.Y = b63Var3;
                                    qi5Var.Z = i19;
                                    qi5Var.d0 = i22;
                                    qi5Var.e0 = q3;
                                    qi5Var.f0 = i4;
                                    qi5Var.g0 = i20;
                                    qi5Var.h0 = i5;
                                    qi5Var.i0 = i21;
                                    qi5Var.j0 = i24;
                                    int i26 = q3;
                                    qi5Var.k0 = i25;
                                    Iterator it5 = it4;
                                    qi5Var.l0 = 0;
                                    qi5Var.o0 = 1;
                                    if (q60.t(i19, qi5Var) != x61Var) {
                                        int i27 = i21;
                                        i8 = i20;
                                        i9 = i27;
                                        i11 = i25;
                                        qi5Var2 = qi5Var;
                                        i13 = i19;
                                        i14 = i24;
                                        i12 = 0;
                                        it = it5;
                                        i6 = i22;
                                        i10 = i4;
                                        b63Var2 = b63Var3;
                                        i7 = i26;
                                        melonEmulator2.e(b63Var2);
                                        if (i8 == i7 - 1 || i11 != hf.U(arrayList2)) {
                                            int i28 = i11;
                                            melonEmulator = melonEmulator2;
                                            qi5Var2.R = arrayList2;
                                            qi5Var2.X = it;
                                            Iterator it6 = it;
                                            qi5Var2.Y = b63Var;
                                            qi5Var2.Z = i13;
                                            qi5Var2.d0 = i6;
                                            qi5Var2.e0 = i7;
                                            qi5Var2.f0 = i10;
                                            qi5Var2.g0 = i8;
                                            qi5Var2.h0 = i5;
                                            qi5Var2.i0 = i9;
                                            qi5Var2.j0 = i14;
                                            qi5Var2.k0 = i28;
                                            qi5Var2.l0 = i12;
                                            qi5Var2.o0 = 2;
                                            if (q60.t(i6, qi5Var2) != x61Var) {
                                                i16 = i9;
                                                arrayList3 = arrayList2;
                                                it2 = it6;
                                                i17 = i10;
                                                Iterator it32 = it2;
                                                int i192 = i13;
                                                Iterator it42 = it32;
                                                i4 = i17;
                                                arrayList2 = arrayList3;
                                                int i202 = i8;
                                                int i212 = i16;
                                                int i222 = i6;
                                                int i232 = i14;
                                                q3 = i7;
                                                qi5Var = qi5Var2;
                                                x61Var2 = x61Var;
                                                melonEmulator2 = melonEmulator;
                                                b63Var = null;
                                                if (!it42.hasNext()) {
                                                    i4++;
                                                    q = i192;
                                                    q2 = i222;
                                                    arrayList = arrayList2;
                                                    b63Var = null;
                                                    if (i4 >= q3) {
                                                        it42 = arrayList.iterator();
                                                        i222 = q2;
                                                        arrayList2 = arrayList;
                                                        i5 = 0;
                                                        i212 = 0;
                                                        i192 = q;
                                                        i202 = i4;
                                                        i232 = 0;
                                                        if (!it42.hasNext()) {
                                                        }
                                                    } else {
                                                        Log.w("DebugCommand", "action=press_input mode=release inputs=" + gt0.P0(arrayList, ",", null, null, new dv4(19), 30) + " repeat=" + q3 + " durationMs=" + q + " gapMs=" + q2);
                                                        return jg7.a;
                                                    }
                                                }
                                            }
                                        } else {
                                            Iterator it7 = it;
                                            i192 = i13;
                                            it42 = it7;
                                            int i29 = i8;
                                            i212 = i9;
                                            i202 = i29;
                                            melonEmulator = melonEmulator2;
                                            i4 = i10;
                                            i232 = i14;
                                            q3 = i7;
                                            i222 = i6;
                                            qi5Var = qi5Var2;
                                            x61Var2 = x61Var;
                                            melonEmulator2 = melonEmulator;
                                            b63Var = null;
                                            if (!it42.hasNext()) {
                                            }
                                        }
                                    }
                                    return x61Var;
                                }
                                hf.q0();
                                throw null;
                            }
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        b63Var = null;
                        int i30 = qi5Var.l0;
                        i11 = qi5Var.k0;
                        int i31 = qi5Var.j0;
                        i9 = qi5Var.i0;
                        i5 = qi5Var.h0;
                        i8 = qi5Var.g0;
                        int i32 = qi5Var.f0;
                        i7 = qi5Var.e0;
                        i6 = qi5Var.d0;
                        int i33 = qi5Var.Z;
                        b63Var2 = qi5Var.Y;
                        Iterator it8 = qi5Var.X;
                        ?? r0 = qi5Var.R;
                        oi2.Y(obj);
                        arrayList2 = r0;
                        i14 = i31;
                        it = it8;
                        i10 = i32;
                        i13 = i33;
                        x61Var = x61Var2;
                        qi5Var2 = qi5Var;
                        i12 = i30;
                        melonEmulator2.e(b63Var2);
                        if (i8 == i7 - 1) {
                        }
                        int i282 = i11;
                        melonEmulator = melonEmulator2;
                        qi5Var2.R = arrayList2;
                        qi5Var2.X = it;
                        Iterator it62 = it;
                        qi5Var2.Y = b63Var;
                        qi5Var2.Z = i13;
                        qi5Var2.d0 = i6;
                        qi5Var2.e0 = i7;
                        qi5Var2.f0 = i10;
                        qi5Var2.g0 = i8;
                        qi5Var2.h0 = i5;
                        qi5Var2.i0 = i9;
                        qi5Var2.j0 = i14;
                        qi5Var2.k0 = i282;
                        qi5Var2.l0 = i12;
                        qi5Var2.o0 = 2;
                        if (q60.t(i6, qi5Var2) != x61Var) {
                        }
                        return x61Var;
                    }
                } else {
                    b63Var = null;
                    oi2.Y(obj);
                    String d = d(intent, "inputs", "input", "value");
                    if (d != null) {
                        Integer c = c(intent, "duration_ms");
                        int i34 = 80;
                        if (c != null) {
                            i2 = c.intValue();
                        } else {
                            i2 = 80;
                        }
                        q = gi2.q(i2, 0, 2000);
                        Integer c2 = c(intent, "gap_ms", "delay_ms");
                        if (c2 != null) {
                            i34 = c2.intValue();
                        }
                        q2 = gi2.q(i34, 0, 2000);
                        Integer c3 = c(intent, "repeat", "count");
                        if (c3 != null) {
                            i3 = c3.intValue();
                        } else {
                            i3 = 1;
                        }
                        q3 = gi2.q(i3, 1, 100);
                        List<String> J0 = qs6.J0(d, new char[]{',', '+', ' ', ';'}, 6);
                        ArrayList arrayList4 = new ArrayList();
                        for (String str : J0) {
                            b63 o = o(str);
                            if (o != null) {
                                arrayList4.add(o);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            arrayList = arrayList4;
                            i4 = 0;
                            if (i4 >= q3) {
                            }
                        } else {
                            i.f("No supported inputs in ".concat(d));
                            return null;
                        }
                    } else {
                        i.h("Missing input extra");
                        return null;
                    }
                }
            }
        }
        qi5Var = new qi5(this, s41Var);
        Object obj2 = qi5Var.m0;
        x61 x61Var22 = x61.COROUTINE_SUSPENDED;
        i = qi5Var.o0;
        MelonEmulator melonEmulator22 = MelonEmulator.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Context context, sb1 sb1Var, Intent intent, s41 s41Var) {
        ri5 ri5Var;
        int i;
        Intent intent2;
        Comparable comparable;
        Uri uri;
        if (s41Var instanceof ri5) {
            ri5Var = (ri5) s41Var;
            int i2 = ri5Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ri5Var.Z = i2 - Integer.MIN_VALUE;
                ri5 ri5Var2 = ri5Var;
                Object obj = ri5Var2.X;
                Comparable comparable2 = x61.COROUTINE_SUSPENDED;
                i = ri5Var2.Z;
                if (i == 0) {
                    if (i == 1) {
                        intent2 = ri5Var2.R;
                        oi2.Y(obj);
                        comparable = obj;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ri5Var2.R = intent;
                    ri5Var2.Z = 1;
                    Comparable q = q(context, sb1Var, intent, false, ri5Var2);
                    if (q == comparable2) {
                        return comparable2;
                    }
                    intent2 = intent;
                    comparable = q;
                }
                uri = (Uri) comparable;
                if (uri == null) {
                    boolean booleanExtra = intent2.getBooleanExtra("pause_after", false);
                    MelonEmulator melonEmulator = MelonEmulator.a;
                    melonEmulator.pauseEmulation();
                    try {
                        boolean f = melonEmulator.f(uri);
                        if (booleanExtra) {
                            lc1 lc1Var = lc1.a;
                            lc1.e(true);
                        } else {
                            lc1 lc1Var2 = lc1.a;
                            lc1.e(false);
                            melonEmulator.resumeEmulation();
                        }
                        Log.w("DebugCommand", "action=save_state mode=release uri=" + uri + " success=" + (f ? 1 : 0) + " pauseAfter=" + (booleanExtra ? 1 : 0));
                        return jg7.a;
                    } catch (Throwable th) {
                        if (booleanExtra) {
                            lc1 lc1Var3 = lc1.a;
                            lc1.e(true);
                        } else {
                            lc1 lc1Var4 = lc1.a;
                            lc1.e(false);
                            melonEmulator.resumeEmulation();
                        }
                        throw th;
                    }
                }
                i.h("Missing save target. Provide slot or path.");
                return null;
            }
        }
        ri5Var = new ri5(this, s41Var);
        ri5 ri5Var22 = ri5Var;
        Object obj2 = ri5Var22.X;
        Comparable comparable22 = x61.COROUTINE_SUSPENDED;
        i = ri5Var22.Z;
        if (i == 0) {
        }
        uri = (Uri) comparable;
        if (uri == null) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
        if (r1.equals("default") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
        if (r1.equals("nds") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b7, code lost:
        if (r1.equals("ds") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ba, code lost:
        r1 = defpackage.u26.DS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r1.equals("global") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r1 = defpackage.u26.DEFAULT;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(sb1 sb1Var, Intent intent, s41 s41Var) {
        si5 si5Var;
        int i;
        u26 u26Var;
        u26 u26Var2;
        Uri uri;
        pq5 pq5Var;
        sb1 sb1Var2 = sb1Var;
        if (s41Var instanceof si5) {
            si5Var = (si5) s41Var;
            int i2 = si5Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                si5Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = si5Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = si5Var.e0;
                int i3 = 1;
                if (i == 0) {
                    if (i == 1) {
                        u26 u26Var3 = si5Var.Y;
                        uri = si5Var.X;
                        sb1 sb1Var3 = si5Var.R;
                        oi2.Y(obj);
                        u26Var2 = u26Var3;
                        sb1Var2 = sb1Var3;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Uri data = intent.getData();
                    if (data == null) {
                        String d = d(intent, "rom_uri", "uri", "path");
                        if (d != null) {
                            data = Uri.parse(d);
                        } else {
                            data = null;
                        }
                        if (data == null) {
                            i.h("Missing ROM URI. Provide intent data or rom_uri.");
                            return null;
                        }
                    }
                    String d2 = d(intent, "runtime_console", "console", "value");
                    if (d2 != null) {
                        String obj2 = qs6.T0(d2).toString();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = obj2.toLowerCase(locale);
                        lowerCase.getClass();
                        switch (lowerCase.hashCode()) {
                            case -1243020381:
                                break;
                            case 3215:
                                break;
                            case 99770:
                                if (lowerCase.equals("dsi")) {
                                    u26Var = u26.DSi;
                                    break;
                                }
                                u26Var = null;
                                break;
                            case 108925:
                                break;
                            case 1544803905:
                                break;
                            default:
                                u26Var = null;
                                break;
                        }
                        if (u26Var != null) {
                            si5Var.R = sb1Var2;
                            si5Var.X = data;
                            si5Var.Y = u26Var;
                            si5Var.e0 = 1;
                            Object l = ((xb2) ((p06) sb1Var2.x.get())).l(data, si5Var);
                            if (l == x61Var) {
                                return x61Var;
                            }
                            u26Var2 = u26Var;
                            uri = data;
                            obj = l;
                        } else {
                            i.h("Unsupported runtime console");
                            return null;
                        }
                    } else {
                        i.h("Missing runtime console extra");
                        return null;
                    }
                }
                pq5Var = (pq5) obj;
                if (pq5Var == null) {
                    ((xb2) ((p06) sb1Var2.x.get())).B(pq5Var, jt5.a(pq5Var.f, u26Var2, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, 262142));
                } else {
                    i3 = 0;
                }
                Log.w("DebugCommand", "action=set_rom_runtime_console mode=release uri=" + uri + " runtimeConsole=" + u26Var2.name() + " updated=" + i3);
                return jg7.a;
            }
        }
        si5Var = new si5(this, s41Var);
        Object obj3 = si5Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = si5Var.e0;
        int i32 = 1;
        if (i == 0) {
        }
        pq5Var = (pq5) obj3;
        if (pq5Var == null) {
        }
        Log.w("DebugCommand", "action=set_rom_runtime_console mode=release uri=" + uri + " runtimeConsole=" + u26Var2.name() + " updated=" + i32);
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(sb1 sb1Var, Intent intent, s41 s41Var) {
        ti5 ti5Var;
        x61 x61Var;
        int i;
        int i2;
        int i3;
        VideoRenderer e;
        ti5 ti5Var2;
        ReleaseStateCommandReceiver releaseStateCommandReceiver;
        int i4;
        int i5;
        VideoRenderer videoRenderer;
        if (s41Var instanceof ti5) {
            ti5Var = (ti5) s41Var;
            int i6 = ti5Var.f0;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                ti5Var.f0 = i6 - Integer.MIN_VALUE;
                ti5 ti5Var3 = ti5Var;
                Object obj = ti5Var3.d0;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = ti5Var3.f0;
                MelonEmulator melonEmulator = MelonEmulator.a;
                int i7 = 0;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i4 = ti5Var3.Z;
                            i5 = ti5Var3.X;
                            videoRenderer = ti5Var3.R;
                            oi2.Y(obj);
                            lc1 lc1Var = lc1.a;
                            lc1.e(true);
                            RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
                            int currentFrameIndexForDebug = rendererDebugBridge.getCurrentFrameIndexForDebug();
                            if (videoRenderer == VideoRenderer.VULKAN || rendererDebugBridge.isCurrentFrameReadyForDebug()) {
                                i7 = 1;
                            }
                            String name = videoRenderer.name();
                            Locale locale = Locale.US;
                            locale.getClass();
                            String lowerCase = name.toLowerCase(locale);
                            lowerCase.getClass();
                            StringBuilder sb = new StringBuilder("action=step_frame mode=release renderer=");
                            sb.append(lowerCase);
                            sb.append(" frames=");
                            sb.append(i5);
                            sb.append(" startFrame=");
                            lb1.x(sb, i4, " endFrame=", currentFrameIndexForDebug, " ready=");
                            sb.append(i7);
                            Log.w("DebugCommand", sb.toString());
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i8 = ti5Var3.Z;
                    i3 = ti5Var3.Y;
                    int i9 = ti5Var3.X;
                    e = ti5Var3.R;
                    oi2.Y(obj);
                    releaseStateCommandReceiver = this;
                    i4 = i8;
                    i5 = i9;
                    ti5Var2 = ti5Var3;
                } else {
                    oi2.Y(obj);
                    Integer c = c(intent, "step_frames", "frames", "value");
                    if (c != null) {
                        int intValue = c.intValue();
                        if (intValue < 1) {
                            intValue = 1;
                        }
                        i2 = intValue;
                    } else {
                        i2 = 1;
                    }
                    Integer c2 = c(intent, "timeout_ms", "duration_ms", "resume_ms");
                    if (c2 != null) {
                        i3 = c2.intValue();
                        if (i3 < 1) {
                            i3 = 1;
                        }
                    } else {
                        i3 = 5000;
                    }
                    e = ((ng6) ((kd6) sb1Var.s.get())).e();
                    int currentFrameIndexForDebug2 = RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug();
                    lc1 lc1Var2 = lc1.a;
                    lc1.e(false);
                    melonEmulator.resumeEmulation();
                    ti5Var2 = ti5Var3;
                    ti5Var2.R = e;
                    ti5Var2.X = i2;
                    ti5Var2.Y = i3;
                    ti5Var2.Z = currentFrameIndexForDebug2;
                    ti5Var2.f0 = 1;
                    releaseStateCommandReceiver = this;
                    if (releaseStateCommandReceiver.s(e, currentFrameIndexForDebug2, i2, i3, ti5Var2) != x61Var) {
                        i4 = currentFrameIndexForDebug2;
                        i5 = i2;
                    }
                    return x61Var;
                }
                melonEmulator.pauseEmulation();
                ti5Var2.R = e;
                ti5Var2.X = i5;
                ti5Var2.Y = i3;
                ti5Var2.Z = i4;
                ti5Var2.f0 = 2;
                if (releaseStateCommandReceiver.t(e, RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug(), i3, ti5Var2) != x61Var) {
                    videoRenderer = e;
                    lc1 lc1Var3 = lc1.a;
                    lc1.e(true);
                    RendererDebugBridge rendererDebugBridge2 = RendererDebugBridge.INSTANCE;
                    int currentFrameIndexForDebug3 = rendererDebugBridge2.getCurrentFrameIndexForDebug();
                    if (videoRenderer == VideoRenderer.VULKAN) {
                    }
                    i7 = 1;
                    String name2 = videoRenderer.name();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    String lowerCase2 = name2.toLowerCase(locale2);
                    lowerCase2.getClass();
                    StringBuilder sb2 = new StringBuilder("action=step_frame mode=release renderer=");
                    sb2.append(lowerCase2);
                    sb2.append(" frames=");
                    sb2.append(i5);
                    sb2.append(" startFrame=");
                    lb1.x(sb2, i4, " endFrame=", currentFrameIndexForDebug3, " ready=");
                    sb2.append(i7);
                    Log.w("DebugCommand", sb2.toString());
                    return jg7.a;
                }
                return x61Var;
            }
        }
        ti5Var = new ti5(this, s41Var);
        ti5 ti5Var32 = ti5Var;
        Object obj2 = ti5Var32.d0;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = ti5Var32.f0;
        MelonEmulator melonEmulator2 = MelonEmulator.a;
        int i72 = 0;
        if (i == 0) {
        }
        melonEmulator2.pauseEmulation();
        ti5Var2.R = e;
        ti5Var2.X = i5;
        ti5Var2.Y = i3;
        ti5Var2.Z = i4;
        ti5Var2.f0 = 2;
        if (releaseStateCommandReceiver.t(e, RendererDebugBridge.INSTANCE.getCurrentFrameIndexForDebug(), i3, ti5Var2) != x61Var) {
        }
        return x61Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Intent intent, s41 s41Var) {
        ui5 ui5Var;
        int i;
        int i2;
        int i3;
        int i4;
        int q;
        int i5;
        int i6;
        if (s41Var instanceof ui5) {
            ui5Var = (ui5) s41Var;
            int i7 = ui5Var.e0;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ui5Var.e0 = i7 - Integer.MIN_VALUE;
                Object obj = ui5Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = ui5Var.e0;
                MelonEmulator melonEmulator = MelonEmulator.a;
                if (i == 0) {
                    if (i == 1) {
                        q = ui5Var.Y;
                        i6 = ui5Var.X;
                        i5 = ui5Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Integer c = c(intent, "x", "value_x", "value");
                    if (c != null) {
                        i2 = gi2.q(c.intValue(), 0, 255);
                    } else {
                        i2 = 128;
                    }
                    Integer c2 = c(intent, "y", "value_y");
                    if (c2 != null) {
                        i3 = gi2.q(c2.intValue(), 0, 191);
                    } else {
                        i3 = 96;
                    }
                    Integer c3 = c(intent, "duration_ms");
                    if (c3 != null) {
                        i4 = c3.intValue();
                    } else {
                        i4 = 80;
                    }
                    q = gi2.q(i4, 1, 2000);
                    melonEmulator.d(b63.TOUCHSCREEN);
                    melonEmulator.onScreenTouch(i2, i3);
                    ui5Var.R = i2;
                    ui5Var.X = i3;
                    ui5Var.Y = q;
                    ui5Var.e0 = 1;
                    if (q60.t(q, ui5Var) == x61Var) {
                        return x61Var;
                    }
                    i5 = i2;
                    i6 = i3;
                }
                melonEmulator.e(b63.TOUCHSCREEN);
                melonEmulator.onScreenRelease();
                Log.w("DebugCommand", "action=touch_screen mode=release x=" + i5 + " y=" + i6 + " durationMs=" + q);
                return jg7.a;
            }
        }
        ui5Var = new ui5(this, s41Var);
        Object obj2 = ui5Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = ui5Var.e0;
        MelonEmulator melonEmulator2 = MelonEmulator.a;
        if (i == 0) {
        }
        melonEmulator2.e(b63.TOUCHSCREEN);
        melonEmulator2.onScreenRelease();
        Log.w("DebugCommand", "action=touch_screen mode=release x=" + i5 + " y=" + i6 + " durationMs=" + q);
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007a  */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Intent intent, s41 s41Var) {
        vi5 vi5Var;
        int i;
        int i2;
        ?? r0;
        int i3;
        int i4;
        boolean booleanValue;
        if (s41Var instanceof vi5) {
            vi5Var = (vi5) s41Var;
            int i5 = vi5Var.e0;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                vi5Var.e0 = i5 - Integer.MIN_VALUE;
                Object obj = vi5Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = vi5Var.e0;
                if (i == 0) {
                    if (i == 1) {
                        i4 = vi5Var.Y;
                        i3 = vi5Var.X;
                        boolean z = vi5Var.R;
                        oi2.Y(obj);
                        r0 = z;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    boolean booleanExtra = intent.getBooleanExtra("pause_after", false);
                    Integer c = c(intent, "wait_timeout_ms", "timeout_ms");
                    int i6 = 8000;
                    if (c != null) {
                        i2 = c.intValue();
                        if (i2 < 1) {
                            i2 = 1;
                        }
                    } else {
                        i2 = 8000;
                    }
                    if (i2 <= 8000) {
                        i6 = i2;
                    }
                    vi5Var.R = booleanExtra;
                    vi5Var.X = i2;
                    vi5Var.Y = i6;
                    vi5Var.e0 = 1;
                    Object f = lc1.a.f(i6, vi5Var);
                    if (f == x61Var) {
                        return x61Var;
                    }
                    r0 = booleanExtra;
                    obj = f;
                    i3 = i2;
                    i4 = i6;
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    MelonEmulator melonEmulator = MelonEmulator.a;
                    if (r0 != 0) {
                        lc1.e(true);
                        melonEmulator.pauseEmulation();
                    } else {
                        lc1.e(false);
                        melonEmulator.resumeEmulation();
                    }
                }
                StringBuilder q = i61.q(booleanValue ? 1 : 0, r0, "action=wait_rom_ready mode=release ready=", " pauseAfter=", " timeoutMs=");
                q.append(i4);
                q.append(" requestedTimeoutMs=");
                q.append(i3);
                Log.w("DebugCommand", q.toString());
                return jg7.a;
            }
        }
        vi5Var = new vi5(this, s41Var);
        Object obj2 = vi5Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = vi5Var.e0;
        if (i == 0) {
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        if (booleanValue) {
        }
        StringBuilder q2 = i61.q(booleanValue ? 1 : 0, r0, "action=wait_rom_ready mode=release ready=", " pauseAfter=", " timeoutMs=");
        q2.append(i4);
        q2.append(" requestedTimeoutMs=");
        q2.append(i3);
        Log.w("DebugCommand", q2.toString());
        return jg7.a;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        hv.L(a, null, null, new l5(intent, goAsync(), this, context, null, 27), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:31:0x008c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable p(Context context, Intent intent, s41 s41Var) {
        wi5 wi5Var;
        int i;
        Uri parse;
        wi5 wi5Var2;
        Context context2;
        long nanoTime;
        if (s41Var instanceof wi5) {
            wi5Var = (wi5) s41Var;
            int i2 = wi5Var.d0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wi5Var.d0 = i2 - Integer.MIN_VALUE;
                Object obj = wi5Var.Y;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = wi5Var.d0;
                if (i == 0) {
                    if (i == 1) {
                        nanoTime = wi5Var.X;
                        Context context3 = wi5Var.R;
                        oi2.Y(obj);
                        wi5Var2 = wi5Var;
                        context2 = context3;
                        lc1 lc1Var = lc1.a;
                        context2.getClass();
                        String string = context2.getSharedPreferences("debug_command_state", 0).getString("last_rom_uri", null);
                        if (string != null) {
                            parse = null;
                        } else {
                            parse = Uri.parse(string);
                        }
                        if (parse != null && System.nanoTime() < nanoTime) {
                            wi5Var2.R = context2;
                            wi5Var2.X = nanoTime;
                            wi5Var2.d0 = 1;
                            if (q60.t(100L, wi5Var2) == x61Var) {
                                return x61Var;
                            }
                            lc1 lc1Var2 = lc1.a;
                            context2.getClass();
                            String string2 = context2.getSharedPreferences("debug_command_state", 0).getString("last_rom_uri", null);
                            if (string2 != null) {
                            }
                            if (parse != null) {
                            }
                            return parse;
                        }
                        return parse;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                String d = d(intent, "rom_uri");
                if (d != null) {
                    return Uri.parse(d);
                }
                lc1 lc1Var3 = lc1.a;
                context.getClass();
                String string3 = context.getSharedPreferences("debug_command_state", 0).getString("last_rom_uri", null);
                if (string3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(string3);
                }
                if (parse != null) {
                    return parse;
                }
                wi5Var2 = wi5Var;
                context2 = context;
                nanoTime = System.nanoTime() + 4000000000L;
                if (parse != null) {
                }
                return parse;
            }
        }
        wi5Var = new wi5(this, s41Var);
        Object obj2 = wi5Var.Y;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = wi5Var.d0;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Comparable q(Context context, gc1 gc1Var, Intent intent, boolean z, s41 s41Var) {
        xi5 xi5Var;
        int i;
        gc1 gc1Var2;
        int i2;
        boolean z2;
        Uri uri;
        gc1 gc1Var3;
        pq5 pq5Var;
        String path;
        Iterable k1;
        CharSequence charSequence;
        File file;
        if (s41Var instanceof xi5) {
            xi5Var = (xi5) s41Var;
            int i3 = xi5Var.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xi5Var.e0 = i3 - Integer.MIN_VALUE;
                Object obj = xi5Var.Z;
                Comparable comparable = x61.COROUTINE_SUSPENDED;
                i = xi5Var.e0;
                Uri uri2 = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = xi5Var.Y;
                            z2 = xi5Var.X;
                            gc1Var3 = xi5Var.R;
                            oi2.Y(obj);
                            pq5Var = (pq5) obj;
                            if (pq5Var != null) {
                                Uri b = ((yb2) ((sb1) gc1Var3).D.get()).b(pq5Var, new c46(i2, true, (Date) null, (String) null, 48));
                                if (z2) {
                                    String str = pq5Var.c;
                                    if (nb3.k(b.getScheme(), "file") && (path = b.getPath()) != null) {
                                        File file2 = new File(path);
                                        if ((!file2.exists() || file2.length() <= 0) && (r2 = file2.getParentFile()) != null) {
                                            File parentFile = (parentFile.exists() && parentFile.isDirectory()) ? null : null;
                                            if (parentFile != null) {
                                                String obj2 = qs6.T0(qs6.R0('.', str, str)).toString();
                                                if (obj2.length() != 0) {
                                                    String obj3 = qs6.T0(obj2).toString();
                                                    if (obj3.length() == 0) {
                                                        k1 = yt1.A;
                                                    } else {
                                                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                                                        for (String str2 : hf.c0(" Analog", " (Analog)", " [Analog]", "[Analog]")) {
                                                            if (xs6.Y(obj3, str2, true)) {
                                                                int length = str2.length();
                                                                if (length >= 0) {
                                                                    int length2 = obj3.length() - length;
                                                                    if (length2 < 0) {
                                                                        length2 = 0;
                                                                    }
                                                                    String S0 = qs6.S0(length2, obj3);
                                                                    int length3 = S0.length() - 1;
                                                                    if (length3 >= 0) {
                                                                        while (true) {
                                                                            int i4 = length3 - 1;
                                                                            if (!g04.J(S0.charAt(length3))) {
                                                                                charSequence = S0.subSequence(0, length3 + 1);
                                                                                break;
                                                                            } else if (i4 < 0) {
                                                                                break;
                                                                            } else {
                                                                                length3 = i4;
                                                                            }
                                                                        }
                                                                    }
                                                                    charSequence = "";
                                                                    String obj4 = charSequence.toString();
                                                                    if (obj4.length() > 0) {
                                                                        linkedHashSet.add(obj4);
                                                                    }
                                                                } else {
                                                                    i.f(lb1.k("Requested character count ", length, " is less than zero."));
                                                                    return null;
                                                                }
                                                            }
                                                        }
                                                        if (!xs6.Y(obj3, " Analog", true)) {
                                                            linkedHashSet.add(obj3.concat(" Analog"));
                                                        }
                                                        k1 = gt0.k1(linkedHashSet);
                                                    }
                                                    Iterator it = k1.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            String str3 = (String) it.next();
                                                            str3.getClass();
                                                            file = new File(parentFile, str3 + ".ml" + i2);
                                                            if (file.exists() && file.length() > 0) {
                                                                break;
                                                            }
                                                        } else {
                                                            file = null;
                                                            break;
                                                        }
                                                    }
                                                    if (file != null) {
                                                        uri2 = Uri.fromFile(file);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (uri2 != null) {
                                        Log.w("DebugCommand", "action=slot_fallback mode=release slot=" + i2 + " preferred=" + b + " fallback=" + uri2);
                                        return uri2;
                                    }
                                }
                                return b;
                            }
                            return null;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = xi5Var.Y;
                    z2 = xi5Var.X;
                    gc1Var2 = xi5Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    String d = d(intent, "path", "uri");
                    if (d != null) {
                        File file3 = new File(d);
                        if (file3.isAbsolute()) {
                            Uri fromFile = Uri.fromFile(file3);
                            fromFile.getClass();
                            return fromFile;
                        }
                        Uri parse = Uri.parse(d);
                        parse.getClass();
                        return parse;
                    }
                    Integer c = c(intent, "slot", "value");
                    if (c != null) {
                        int intValue = c.intValue();
                        if (intValue >= 0 && intValue < 9) {
                            gc1Var2 = gc1Var;
                            xi5Var.R = gc1Var2;
                            xi5Var.X = z;
                            xi5Var.Y = intValue;
                            xi5Var.e0 = 1;
                            Comparable p = p(context, intent, xi5Var);
                            if (p != comparable) {
                                obj = p;
                                i2 = intValue;
                                z2 = z;
                            }
                            return comparable;
                        }
                        i.f(lb1.g(intValue, "Unsupported save state slot="));
                    }
                    return null;
                }
                uri = (Uri) obj;
                if (uri != null) {
                    sb1 sb1Var = (sb1) gc1Var2;
                    xi5Var.R = sb1Var;
                    xi5Var.X = z2;
                    xi5Var.Y = i2;
                    xi5Var.e0 = 2;
                    obj = ((xb2) ((p06) sb1Var.x.get())).l(uri, xi5Var);
                    if (obj != comparable) {
                        gc1Var3 = sb1Var;
                        pq5Var = (pq5) obj;
                        if (pq5Var != null) {
                        }
                    }
                    return comparable;
                }
                return null;
            }
        }
        xi5Var = new xi5(this, s41Var);
        Object obj5 = xi5Var.Z;
        Comparable comparable2 = x61.COROUTINE_SUSPENDED;
        i = xi5Var.e0;
        Uri uri22 = null;
        if (i == 0) {
        }
        uri = (Uri) obj5;
        if (uri != null) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (defpackage.q60.t(8, r9) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e3 -> B:50:0x00e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(VideoRenderer videoRenderer, int i, int i2, long j, s41 s41Var) {
        yi5 yi5Var;
        int i3;
        long j2;
        long j3;
        int i4;
        int i5;
        yi5 yi5Var2;
        long nanoTime;
        long j4;
        int i6;
        int i7;
        VideoRenderer videoRenderer2;
        boolean z;
        if (s41Var instanceof yi5) {
            yi5Var = (yi5) s41Var;
            int i8 = yi5Var.i0;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yi5Var.i0 = i8 - Integer.MIN_VALUE;
                Object obj = yi5Var.g0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i3 = yi5Var.i0;
                jg7 jg7Var = jg7.a;
                if (i3 == 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            long j5 = yi5Var.f0;
                            int i9 = yi5Var.Z;
                            long j6 = yi5Var.e0;
                            long j7 = yi5Var.d0;
                            int i10 = yi5Var.Y;
                            int i11 = yi5Var.X;
                            VideoRenderer videoRenderer3 = yi5Var.R;
                            oi2.Y(obj);
                            i5 = i9;
                            i6 = i10;
                            j4 = j7;
                            j2 = j6;
                            yi5Var2 = yi5Var;
                            i7 = i11;
                            nanoTime = j5;
                            videoRenderer2 = videoRenderer3;
                            if (System.nanoTime() < nanoTime) {
                                RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
                                int currentFrameIndexForDebug = rendererDebugBridge.getCurrentFrameIndexForDebug();
                                if (videoRenderer2 == VideoRenderer.VULKAN && !rendererDebugBridge.isCurrentFrameReadyForDebug()) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (currentFrameIndexForDebug < i5 || !z) {
                                    yi5Var2.R = videoRenderer2;
                                    yi5Var2.X = i7;
                                    yi5Var2.Y = i6;
                                    yi5Var2.d0 = j4;
                                    yi5Var2.e0 = j2;
                                    yi5Var2.Z = i5;
                                    yi5Var2.f0 = nanoTime;
                                    yi5Var2.i0 = 2;
                                }
                            }
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oi2.Y(obj);
                    return jg7Var;
                }
                oi2.Y(obj);
                j2 = 0;
                if (j > 0) {
                    j3 = 0;
                    j2 = j;
                } else if (i2 > 0) {
                    j3 = 0;
                    j2 = 5000;
                } else {
                    j3 = 0;
                }
                if (j2 > j3) {
                    if (i2 > 0 && i >= 0) {
                        i4 = i + i2;
                    } else {
                        i4 = Integer.MIN_VALUE;
                    }
                    if (i4 == Integer.MIN_VALUE) {
                        yi5Var.R = null;
                        yi5Var.X = i;
                        yi5Var.Y = i2;
                        yi5Var.d0 = j;
                        yi5Var.e0 = j2;
                        yi5Var.Z = i4;
                        yi5Var.i0 = 1;
                        if (q60.t(j2, yi5Var) == x61Var) {
                            return x61Var;
                        }
                    } else {
                        i5 = i4;
                        yi5Var2 = yi5Var;
                        nanoTime = (1000000 * j2) + System.nanoTime();
                        j4 = j;
                        i6 = i2;
                        i7 = i;
                        videoRenderer2 = videoRenderer;
                        if (System.nanoTime() < nanoTime) {
                        }
                    }
                }
                return jg7Var;
            }
        }
        yi5Var = new yi5(this, s41Var);
        Object obj2 = yi5Var.g0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i3 = yi5Var.i0;
        jg7 jg7Var2 = jg7.a;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(VideoRenderer videoRenderer, int i, long j, s41 s41Var) {
        zi5 zi5Var;
        int i2;
        int i3;
        long j2;
        if (s41Var instanceof zi5) {
            zi5Var = (zi5) s41Var;
            int i4 = zi5Var.e0;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zi5Var.e0 = i4 - Integer.MIN_VALUE;
                Object obj = zi5Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = zi5Var.e0;
                if (i2 == 0) {
                    if (i2 == 1) {
                        j2 = zi5Var.Y;
                        j = zi5Var.X;
                        int i5 = zi5Var.R;
                        oi2.Y(obj);
                        i3 = i5;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    if (videoRenderer == VideoRenderer.VULKAN) {
                        long nanoTime = System.nanoTime();
                        long j3 = 1;
                        if (j >= 1) {
                            j3 = j;
                        }
                        long j4 = (j3 * 1000000) + nanoTime;
                        i3 = i;
                        j2 = j4;
                    }
                    return jg7.a;
                }
                while (System.nanoTime() < j2) {
                    RendererDebugBridge rendererDebugBridge = RendererDebugBridge.INSTANCE;
                    if (rendererDebugBridge.getCurrentFrameIndexForDebug() >= i3 && rendererDebugBridge.isCurrentFrameReadyForDebug()) {
                        break;
                    }
                    zi5Var.R = i3;
                    zi5Var.X = j;
                    zi5Var.Y = j2;
                    zi5Var.e0 = 1;
                    if (q60.t(8L, zi5Var) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            }
        }
        zi5Var = new zi5(this, s41Var);
        Object obj2 = zi5Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = zi5Var.e0;
        if (i2 == 0) {
        }
        while (System.nanoTime() < j2) {
        }
        return jg7.a;
    }
}
