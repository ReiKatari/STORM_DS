package me.magnum.melonds.debug;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import me.magnum.melonds.MelonEmulator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ReleaseStateCommandReceiver extends BroadcastReceiver {
    public static final g11 a;

    static {
        mi6 c = hi2.c();
        bb1 bb1Var = tg1.a;
        a = iq2.c(se.O(c, ha1.L));
    }

    public static String a(Context context, String str) {
        return wh1.l(context.getPackageName(), ".", str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0098, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00b8, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean b(android.content.Intent r6, java.lang.String... r7) {
        /*
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            r3 = 0
            if (r2 >= r0) goto Lbc
            r4 = r7[r2]
            boolean r5 = r6.hasExtra(r4)
            if (r5 != 0) goto L10
            goto Lb8
        L10:
            android.os.Bundle r5 = r6.getExtras()
            if (r5 == 0) goto L1a
            java.lang.Object r3 = r5.get(r4)
        L1a:
            boolean r4 = r3 instanceof java.lang.Boolean
            if (r4 == 0) goto L21
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            return r3
        L21:
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto La5
            java.lang.String r3 = (java.lang.String) r3
            java.lang.CharSequence r3 = defpackage.zg6.Z0(r3)
            java.lang.String r3 = r3.toString()
            java.util.Locale r4 = java.util.Locale.US
            r4.getClass()
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1609594047: goto L99;
                case 48: goto L8d;
                case 49: goto L84;
                case 3521: goto L7b;
                case 3551: goto L72;
                case 109935: goto L69;
                case 119527: goto L60;
                case 3569038: goto L57;
                case 97196323: goto L4e;
                case 270940796: goto L44;
                default: goto L42;
            }
        L42:
            goto Lb8
        L44:
            java.lang.String r4 = "disabled"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto Lb8
        L4e:
            java.lang.String r4 = "false"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto Lb8
        L57:
            java.lang.String r4 = "true"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            goto Lb8
        L60:
            java.lang.String r4 = "yes"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            goto Lb8
        L69:
            java.lang.String r4 = "off"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto Lb8
        L72:
            java.lang.String r4 = "on"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Lb8
            goto La2
        L7b:
            java.lang.String r4 = "no"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto Lb8
        L84:
            java.lang.String r4 = "1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            goto Lb8
        L8d:
            java.lang.String r4 = "0"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L96
            goto Lb8
        L96:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L99:
            java.lang.String r4 = "enabled"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto La2
            goto Lb8
        La2:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La5:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto Lb8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            boolean r6 = r3.equals(r6)
            r6 = r6 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        Lb8:
            int r2 = r2 + 1
            goto L3
        Lbc:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.b(android.content.Intent, java.lang.String[]):java.lang.Boolean");
    }

    public static Integer c(Intent intent, String... strArr) {
        Integer o0;
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
                if ((obj instanceof String) && (o0 = gh6.o0((String) obj)) != null) {
                    return Integer.valueOf(o0.intValue());
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
                if (stringExtra != null && !zg6.B0(stringExtra)) {
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

    public static yz2 o(String str) {
        String obj = zg6.Z0(str).toString();
        Locale locale = Locale.US;
        locale.getClass();
        String upperCase = obj.toUpperCase(locale);
        upperCase.getClass();
        String replace = upperCase.replace('-', '_');
        replace.getClass();
        String l0 = gh6.l0(replace, ".", "_");
        if (l0.length() != 0) {
            String J0 = zg6.J0(zg6.J0(l0, "INPUT_"), "BUTTON_");
            switch (J0.hashCode()) {
                case -2048055683:
                    if (!J0.equals("AXIS_Y_POSITIVE")) {
                        return null;
                    }
                    return yz2.DOWN;
                case -2037433122:
                    if (!J0.equals("AXIS_HAT_X_NEGATIVE")) {
                        return null;
                    }
                    return yz2.LEFT;
                case -1874749255:
                    if (!J0.equals("AXIS_Y_NEGATIVE")) {
                        return null;
                    }
                    return yz2.UP;
                case -1852692228:
                    if (J0.equals("SELECT")) {
                        return yz2.SELECT;
                    }
                    return null;
                case -1851542178:
                    if (!J0.equals("AXIS_X_POSITIVE")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case -1721778389:
                    if (!J0.equals("DPAD_UP")) {
                        return null;
                    }
                    return yz2.UP;
                case -1678235750:
                    if (!J0.equals("AXIS_X_NEGATIVE")) {
                        return null;
                    }
                    return yz2.LEFT;
                case -1325501965:
                    if (!J0.equals("AXIS_HAT_X_RIGHT")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case -1067127502:
                    if (!J0.equals("DPAD_DOWN")) {
                        return null;
                    }
                    return yz2.DOWN;
                case -1066899305:
                    if (!J0.equals("DPAD_LEFT")) {
                        return null;
                    }
                    return yz2.LEFT;
                case -458582736:
                    if (!J0.equals("AXIS_HAT_X_LEFT")) {
                        return null;
                    }
                    return yz2.LEFT;
                case -430181782:
                    if (!J0.equals("AXIS_HAT_Y_DOWN")) {
                        return null;
                    }
                    return yz2.DOWN;
                case -103924244:
                    if (!J0.equals("AXIS_X_LEFT")) {
                        return null;
                    }
                    return yz2.LEFT;
                case -75523290:
                    if (!J0.equals("AXIS_Y_DOWN")) {
                        return null;
                    }
                    return yz2.DOWN;
                case 65:
                    if (J0.equals("A")) {
                        return yz2.A;
                    }
                    return null;
                case 66:
                    if (J0.equals("B")) {
                        return yz2.B;
                    }
                    return null;
                case 76:
                    if (!J0.equals("L")) {
                        return null;
                    }
                    return yz2.L;
                case 82:
                    if (!J0.equals("R")) {
                        return null;
                    }
                    return yz2.R;
                case 88:
                    if (J0.equals("X")) {
                        return yz2.X;
                    }
                    return null;
                case 89:
                    if (J0.equals("Y")) {
                        return yz2.Y;
                    }
                    return null;
                case 2405:
                    if (!J0.equals("L1")) {
                        return null;
                    }
                    return yz2.L;
                case 2591:
                    if (!J0.equals("R1")) {
                        return null;
                    }
                    return yz2.R;
                case 2715:
                    if (!J0.equals("UP")) {
                        return null;
                    }
                    return yz2.UP;
                case 2104482:
                    if (!J0.equals("DOWN")) {
                        return null;
                    }
                    return yz2.DOWN;
                case 2332679:
                    if (!J0.equals("LEFT")) {
                        return null;
                    }
                    return yz2.LEFT;
                case 58022431:
                    if (!J0.equals("AXIS_Y_UP")) {
                        return null;
                    }
                    return yz2.UP;
                case 77974012:
                    if (!J0.equals("RIGHT")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case 79219778:
                    if (J0.equals("START")) {
                        return yz2.START;
                    }
                    return null;
                case 364460856:
                    if (!J0.equals("HAT_RIGHT")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case 491172451:
                    if (!J0.equals("AXIS_HAT_Y_UP")) {
                        return null;
                    }
                    return yz2.UP;
                case 981177318:
                    if (!J0.equals("HAT_DOWN")) {
                        return null;
                    }
                    return yz2.DOWN;
                case 981405515:
                    if (!J0.equals("HAT_LEFT")) {
                        return null;
                    }
                    return yz2.LEFT;
                case 1078976695:
                    if (!J0.equals("AXIS_X_RIGHT")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case 1291520876:
                    if (!J0.equals("DPAD_RIGHT")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case 1887714241:
                    if (!J0.equals("AXIS_HAT_Y_POSITIVE")) {
                        return null;
                    }
                    return yz2.DOWN;
                case 2061020669:
                    if (!J0.equals("AXIS_HAT_Y_NEGATIVE")) {
                        return null;
                    }
                    return yz2.UP;
                case 2084227746:
                    if (!J0.equals("AXIS_HAT_X_POSITIVE")) {
                        return null;
                    }
                    return yz2.RIGHT;
                case 2123924191:
                    if (!J0.equals("HAT_UP")) {
                        return null;
                    }
                    return yz2.UP;
                default:
                    return null;
            }
        }
        return null;
    }

    public static void r(String str) {
        u81 u81Var = u81.a;
        if (!u81.c) {
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
        r0 = defpackage.u81.a;
        defpackage.u81.e(false);
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
    /* JADX WARN: Type inference failed for: r3v19, types: [nk6] */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r41v0, types: [me.magnum.melonds.debug.ReleaseStateCommandReceiver] */
    /* JADX WARN: Type inference failed for: r4v32, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(android.content.Context r42, defpackage.b81 r43, android.content.Intent r44, defpackage.k11 r45) {
        /*
            Method dump skipped, instructions count: 3136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.e(android.content.Context, b81, android.content.Intent, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.b81 r18, android.content.Intent r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.f(b81, android.content.Intent, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(android.content.Context r17, android.content.Intent r18, defpackage.k11 r19) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.g(android.content.Context, android.content.Intent, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(android.content.Context r11, defpackage.b81 r12, android.content.Intent r13, defpackage.k11 r14) {
        /*
            r10 = this;
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            boolean r0 = r14 instanceof defpackage.a95
            if (r0 == 0) goto L16
            r0 = r14
            a95 r0 = (defpackage.a95) r0
            int r2 = r0.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r0.Z = r2
        L14:
            r7 = r0
            goto L1c
        L16:
            a95 r0 = new a95
            r0.<init>(r10, r14)
            goto L14
        L1c:
            java.lang.Object r14 = r7.X
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r7.Z
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L34
            if (r2 != r9) goto L2e
            android.content.Intent r13 = r7.R
            defpackage.me2.a0(r14)
            goto L48
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            return r8
        L34:
            defpackage.me2.a0(r14)
            r7.R = r13
            r7.Z = r9
            r6 = 1
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Comparable r14 = r2.q(r3, r4, r5, r6, r7)
            if (r14 != r0) goto L47
            return r0
        L47:
            r13 = r5
        L48:
            android.net.Uri r14 = (android.net.Uri) r14
            if (r14 == 0) goto Lbd
            java.lang.String r10 = "pause_after"
            r11 = 0
            boolean r10 = r13.getBooleanExtra(r10, r11)
            u81 r12 = defpackage.u81.a
            long r12 = defpackage.u81.e
            r1.pauseEmulation()
            boolean r0 = r1.c(r14)     // Catch: java.lang.Throwable -> L9e
            long r2 = defpackage.u81.e
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 == 0) goto L6c
            boolean r11 = defpackage.u81.c
            if (r11 != 0) goto L78
            r1.resumeEmulation()
            goto L78
        L6c:
            if (r10 == 0) goto L72
            defpackage.u81.e(r9)
            goto L78
        L72:
            defpackage.u81.e(r11)
            r1.resumeEmulation()
        L78:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "action=load_state mode=release uri="
            r11.<init>(r12)
            r11.append(r14)
            java.lang.String r12 = " success="
            r11.append(r12)
            r11.append(r0)
            java.lang.String r12 = " pauseAfter="
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "DebugCommand"
            android.util.Log.w(r11, r10)
            o27 r10 = defpackage.o27.a
            return r10
        L9e:
            r0 = move-exception
            r14 = r0
            u81 r0 = defpackage.u81.a
            long r2 = defpackage.u81.e
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 == 0) goto Lb0
            boolean r10 = defpackage.u81.c
            if (r10 != 0) goto Lbc
            r1.resumeEmulation()
            goto Lbc
        Lb0:
            if (r10 == 0) goto Lb6
            defpackage.u81.e(r9)
            goto Lbc
        Lb6:
            defpackage.u81.e(r11)
            r1.resumeEmulation()
        Lbc:
            throw r14
        Lbd:
            java.lang.String r10 = "Missing load target. Provide slot or path."
            defpackage.i.i(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.h(android.content.Context, b81, android.content.Intent, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(android.content.Intent r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.i(android.content.Intent, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(android.content.Context r10, defpackage.b81 r11, android.content.Intent r12, defpackage.k11 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.c95
            if (r0 == 0) goto L14
            r0 = r13
            c95 r0 = (defpackage.c95) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            c95 r0 = new c95
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.X
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r6.Z
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L32
            if (r1 != r8) goto L2c
            android.content.Intent r12 = r6.R
            defpackage.me2.a0(r13)
            goto L46
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r9)
            return r7
        L32:
            defpackage.me2.a0(r13)
            r6.R = r12
            r6.Z = r8
            r5 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            java.lang.Comparable r13 = r1.q(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L45
            return r0
        L45:
            r12 = r4
        L46:
            android.net.Uri r13 = (android.net.Uri) r13
            if (r13 == 0) goto La3
            java.lang.String r9 = "pause_after"
            r10 = 0
            boolean r9 = r12.getBooleanExtra(r9, r10)
            me.magnum.melonds.MelonEmulator r11 = me.magnum.melonds.MelonEmulator.a
            r11.pauseEmulation()
            boolean r12 = r11.f(r13)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L62
            u81 r10 = defpackage.u81.a
            defpackage.u81.e(r8)
            goto L6a
        L62:
            u81 r0 = defpackage.u81.a
            defpackage.u81.e(r10)
            r11.resumeEmulation()
        L6a:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "action=save_state mode=release uri="
            r10.<init>(r11)
            r10.append(r13)
            java.lang.String r11 = " success="
            r10.append(r11)
            r10.append(r12)
            java.lang.String r11 = " pauseAfter="
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "DebugCommand"
            android.util.Log.w(r10, r9)
            o27 r9 = defpackage.o27.a
            return r9
        L90:
            r0 = move-exception
            r12 = r0
            if (r9 == 0) goto L9a
            u81 r9 = defpackage.u81.a
            defpackage.u81.e(r8)
            goto La2
        L9a:
            u81 r9 = defpackage.u81.a
            defpackage.u81.e(r10)
            r11.resumeEmulation()
        La2:
            throw r12
        La3:
            java.lang.String r9 = "Missing save target. Provide slot or path."
            defpackage.i.i(r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.j(android.content.Context, b81, android.content.Intent, k11):java.lang.Object");
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
        r1 = defpackage.cs5.DS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c3, code lost:
        if (r1.equals("global") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c7, code lost:
        r1 = defpackage.cs5.DEFAULT;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.b81 r26, android.content.Intent r27, defpackage.k11 r28) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.k(b81, android.content.Intent, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.b81 r13, android.content.Intent r14, defpackage.k11 r15) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.l(b81, android.content.Intent, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(android.content.Intent r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.f95
            if (r0 == 0) goto L13
            r0 = r8
            f95 r0 = (defpackage.f95) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            f95 r0 = new f95
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.Z
            p31 r8 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.d0
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L30
            int r7 = r0.Y
            int r8 = r0.X
            int r0 = r0.R
            defpackage.me2.a0(r6)
            goto La6
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            r6 = 0
            return r6
        L37:
            defpackage.me2.a0(r6)
            java.lang.String r6 = "value_x"
            java.lang.String r1 = "value"
            java.lang.String r4 = "x"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r1}
            java.lang.Integer r6 = c(r7, r6)
            r1 = 0
            if (r6 == 0) goto L56
            int r6 = r6.intValue()
            r4 = 255(0xff, float:3.57E-43)
            int r6 = defpackage.io2.m(r6, r1, r4)
            goto L58
        L56:
            r6 = 128(0x80, float:1.8E-43)
        L58:
            java.lang.String r4 = "y"
            java.lang.String r5 = "value_y"
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.Integer r4 = c(r7, r4)
            if (r4 == 0) goto L71
            int r4 = r4.intValue()
            r5 = 191(0xbf, float:2.68E-43)
            int r1 = defpackage.io2.m(r4, r1, r5)
            goto L73
        L71:
            r1 = 96
        L73:
            java.lang.String r4 = "duration_ms"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.Integer r7 = c(r7, r4)
            if (r7 == 0) goto L84
            int r7 = r7.intValue()
            goto L86
        L84:
            r7 = 80
        L86:
            r4 = 2000(0x7d0, float:2.803E-42)
            int r7 = defpackage.io2.m(r7, r3, r4)
            yz2 r4 = defpackage.yz2.TOUCHSCREEN
            r2.d(r4)
            r2.onScreenTouch(r6, r1)
            long r4 = (long) r7
            r0.R = r6
            r0.X = r1
            r0.Y = r7
            r0.d0 = r3
            java.lang.Object r0 = defpackage.dk7.q(r4, r0)
            if (r0 != r8) goto La4
            return r8
        La4:
            r0 = r6
            r8 = r1
        La6:
            yz2 r6 = defpackage.yz2.TOUCHSCREEN
            r2.e(r6)
            r2.onScreenRelease()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "action=touch_screen mode=release x="
            r6.<init>(r1)
            r6.append(r0)
            java.lang.String r0 = " y="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = " durationMs="
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "DebugCommand"
            android.util.Log.w(r7, r6)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.m(android.content.Intent, k11):java.lang.Object");
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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(android.content.Intent r8, defpackage.k11 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.g95
            if (r0 == 0) goto L13
            r0 = r9
            g95 r0 = (defpackage.g95) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            g95 r0 = new g95
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.Z
            p31 r9 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.d0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2e
            int r8 = r0.Y
            int r9 = r0.X
            boolean r0 = r0.R
            defpackage.me2.a0(r7)
            goto L72
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L35:
            defpackage.me2.a0(r7)
            java.lang.String r7 = "pause_after"
            boolean r7 = r8.getBooleanExtra(r7, r2)
            java.lang.String r1 = "wait_timeout_ms"
            java.lang.String r4 = "timeout_ms"
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            java.lang.Integer r8 = c(r8, r1)
            r1 = 8000(0x1f40, float:1.121E-41)
            if (r8 == 0) goto L56
            int r8 = r8.intValue()
            if (r8 >= r3) goto L57
            r8 = r3
            goto L57
        L56:
            r8 = r1
        L57:
            if (r8 <= r1) goto L5a
            goto L5b
        L5a:
            r1 = r8
        L5b:
            u81 r4 = defpackage.u81.a
            long r5 = (long) r1
            r0.R = r7
            r0.X = r8
            r0.Y = r1
            r0.d0 = r3
            java.lang.Object r0 = r4.f(r5, r0)
            if (r0 != r9) goto L6d
            return r9
        L6d:
            r9 = r0
            r0 = r7
            r7 = r9
            r9 = r8
            r8 = r1
        L72:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L8b
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            if (r0 == 0) goto L85
            defpackage.u81.e(r3)
            r1.pauseEmulation()
            goto L8b
        L85:
            defpackage.u81.e(r2)
            r1.resumeEmulation()
        L8b:
            java.lang.String r1 = " pauseAfter="
            java.lang.String r2 = " timeoutMs="
            java.lang.String r3 = "action=wait_rom_ready mode=release ready="
            java.lang.StringBuilder r7 = defpackage.b31.s(r7, r0, r3, r1, r2)
            r7.append(r8)
            java.lang.String r8 = " requestedTimeoutMs="
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "DebugCommand"
            android.util.Log.w(r8, r7)
            o27 r7 = defpackage.o27.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.n(android.content.Intent, k11):java.lang.Object");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        tq5.w(a, null, null, new m5(intent, goAsync(), this, context, null, 25), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0089 -> B:31:0x008c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable p(android.content.Context r13, android.content.Intent r14, defpackage.k11 r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.h95
            if (r0 == 0) goto L13
            r0 = r15
            h95 r0 = (defpackage.h95) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            h95 r0 = new h95
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r12 = r0.Y
            p31 r15 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.c0
            r2 = 0
            java.lang.String r3 = "last_rom_uri"
            r4 = 0
            java.lang.String r5 = "debug_command_state"
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 != r6) goto L34
            long r13 = r0.X
            android.content.Context r1 = r0.R
            defpackage.me2.a0(r12)
            r11 = r1
            r1 = r0
            r0 = r11
            goto L8c
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r12)
            return r2
        L3a:
            defpackage.me2.a0(r12)
            java.lang.String r12 = "rom_uri"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            java.lang.String r12 = d(r14, r12)
            if (r12 == 0) goto L4e
            android.net.Uri r12 = android.net.Uri.parse(r12)
            return r12
        L4e:
            u81 r12 = defpackage.u81.a
            r13.getClass()
            android.content.SharedPreferences r12 = r13.getSharedPreferences(r5, r4)
            java.lang.String r12 = r12.getString(r3, r2)
            if (r12 != 0) goto L5f
            r12 = r2
            goto L63
        L5f:
            android.net.Uri r12 = android.net.Uri.parse(r12)
        L63:
            if (r12 == 0) goto L66
            return r12
        L66:
            long r7 = java.lang.System.nanoTime()
            r9 = 4000000000(0xee6b2800, double:1.9762625834E-314)
            long r7 = r7 + r9
            r1 = r0
            r0 = r13
            r13 = r7
        L73:
            if (r12 != 0) goto La2
            long r7 = java.lang.System.nanoTime()
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 >= 0) goto La2
            r1.R = r0
            r1.X = r13
            r1.c0 = r6
            r7 = 100
            java.lang.Object r12 = defpackage.dk7.q(r7, r1)
            if (r12 != r15) goto L8c
            return r15
        L8c:
            u81 r12 = defpackage.u81.a
            r0.getClass()
            android.content.SharedPreferences r12 = r0.getSharedPreferences(r5, r4)
            java.lang.String r12 = r12.getString(r3, r2)
            if (r12 != 0) goto L9d
            r12 = r2
            goto L73
        L9d:
            android.net.Uri r12 = android.net.Uri.parse(r12)
            goto L73
        La2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.p(android.content.Context, android.content.Intent, k11):java.lang.Comparable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable q(android.content.Context r17, defpackage.p81 r18, android.content.Intent r19, boolean r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.q(android.content.Context, p81, android.content.Intent, boolean, k11):java.lang.Comparable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
        if (defpackage.dk7.q(8, r9) == r7) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00e3 -> B:50:0x00e6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(me.magnum.melonds.domain.model.VideoRenderer r20, int r21, int r22, long r23, defpackage.k11 r25) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.s(me.magnum.melonds.domain.model.VideoRenderer, int, int, long, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(me.magnum.melonds.domain.model.VideoRenderer r8, int r9, long r10, defpackage.k11 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.k95
            if (r0 == 0) goto L13
            r0 = r12
            k95 r0 = (defpackage.k95) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            k95 r0 = new k95
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r7 = r0.Z
            p31 r12 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r0.d0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r8 = r0.Y
            long r10 = r0.X
            int r1 = r0.R
            defpackage.me2.a0(r7)
            r7 = r1
            goto L50
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L35:
            defpackage.me2.a0(r7)
            me.magnum.melonds.domain.model.VideoRenderer r7 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r8 == r7) goto L3d
            goto L78
        L3d:
            long r7 = java.lang.System.nanoTime()
            r3 = 1
            int r1 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r1 >= 0) goto L48
            goto L49
        L48:
            r3 = r10
        L49:
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            long r3 = r3 + r7
            r7 = r9
            r8 = r3
        L50:
            long r3 = java.lang.System.nanoTime()
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 >= 0) goto L78
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r3 = r1.getCurrentFrameIndexForDebug()
            if (r3 < r7) goto L67
            boolean r1 = r1.isCurrentFrameReadyForDebug()
            if (r1 == 0) goto L67
            goto L78
        L67:
            r0.R = r7
            r0.X = r10
            r0.Y = r8
            r0.d0 = r2
            r3 = 8
            java.lang.Object r1 = defpackage.dk7.q(r3, r0)
            if (r1 != r12) goto L50
            return r12
        L78:
            o27 r7 = defpackage.o27.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: me.magnum.melonds.debug.ReleaseStateCommandReceiver.t(me.magnum.melonds.domain.model.VideoRenderer, int, long, k11):java.lang.Object");
    }
}
