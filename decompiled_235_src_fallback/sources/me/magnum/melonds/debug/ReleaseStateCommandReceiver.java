package me.magnum.melonds.debug;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ReleaseStateCommandReceiver extends android.content.BroadcastReceiver {
    public static final defpackage.o41 a = null;

    static {
            gu6 r0 = defpackage.oi2.c()
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            l61 r0 = defpackage.jw2.y(r0, r1)
            o41 r0 = defpackage.g04.i(r0)
            me.magnum.melonds.debug.ReleaseStateCommandReceiver.a = r0
            return
    }

    public ReleaseStateCommandReceiver() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(android.content.Context r1, java.lang.String r2) {
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "."
            java.lang.String r1 = defpackage.lb1.m(r1, r0, r2)
            return r1
    }

    public static java.lang.Boolean b(android.content.Intent r6, java.lang.String... r7) {
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
            java.lang.CharSequence r3 = defpackage.qs6.T0(r3)
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
    }

    public static java.lang.Integer c(android.content.Intent r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 >= r0) goto L37
            r3 = r6[r1]
            boolean r4 = r5.hasExtra(r3)
            if (r4 != 0) goto Le
            goto L34
        Le:
            android.os.Bundle r4 = r5.getExtras()
            if (r4 == 0) goto L18
            java.lang.Object r2 = r4.get(r3)
        L18:
            boolean r3 = r2 instanceof java.lang.Integer
            if (r3 == 0) goto L1f
            java.lang.Integer r2 = (java.lang.Integer) r2
            return r2
        L1f:
            boolean r3 = r2 instanceof java.lang.String
            if (r3 == 0) goto L34
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r2 = defpackage.xs6.h0(r2)
            if (r2 == 0) goto L34
            int r5 = r2.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            return r5
        L34:
            int r1 = r1 + 1
            goto L2
        L37:
            return r2
    }

    public static java.lang.String d(android.content.Intent r5, java.lang.String... r6) {
            int r0 = r6.length
            r1 = 0
        L2:
            r2 = 0
            if (r1 >= r0) goto L19
            r3 = r6[r1]
            java.lang.String r3 = r5.getStringExtra(r3)
            if (r3 == 0) goto L14
            boolean r4 = defpackage.qs6.v0(r3)
            if (r4 != 0) goto L14
            r2 = r3
        L14:
            if (r2 != 0) goto L19
            int r1 = r1 + 1
            goto L2
        L19:
            return r2
    }

    public static defpackage.b63 o(java.lang.String r2) {
            java.lang.CharSequence r2 = defpackage.qs6.T0(r2)
            java.lang.String r2 = r2.toString()
            java.util.Locale r0 = java.util.Locale.US
            r0.getClass()
            java.lang.String r2 = r2.toUpperCase(r0)
            r2.getClass()
            r0 = 45
            r1 = 95
            java.lang.String r2 = r2.replace(r0, r1)
            r2.getClass()
            java.lang.String r0 = "."
            java.lang.String r1 = "_"
            java.lang.String r2 = defpackage.xs6.e0(r2, r0, r1)
            int r0 = r2.length()
            if (r0 != 0) goto L2f
            goto L1d6
        L2f:
            java.lang.String r0 = "INPUT_"
            java.lang.String r2 = defpackage.qs6.D0(r2, r0)
            java.lang.String r0 = "BUTTON_"
            java.lang.String r2 = defpackage.qs6.D0(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2048055683: goto L1ce;
                case -2037433122: goto L1c2;
                case -1874749255: goto L1b6;
                case -1852692228: goto L1aa;
                case -1851542178: goto L19e;
                case -1721778389: goto L195;
                case -1678235750: goto L18c;
                case -1325501965: goto L183;
                case -1067127502: goto L17a;
                case -1066899305: goto L171;
                case -458582736: goto L167;
                case -430181782: goto L15d;
                case -103924244: goto L153;
                case -75523290: goto L149;
                case 65: goto L13c;
                case 66: goto L12f;
                case 76: goto L122;
                case 82: goto L115;
                case 88: goto L108;
                case 89: goto Lfb;
                case 2405: goto Lf1;
                case 2591: goto Le7;
                case 2715: goto Ldd;
                case 2104482: goto Ld3;
                case 2332679: goto Lc9;
                case 58022431: goto Lbf;
                case 77974012: goto Lb5;
                case 79219778: goto La8;
                case 364460856: goto L9e;
                case 491172451: goto L94;
                case 981177318: goto L8a;
                case 981405515: goto L80;
                case 1078976695: goto L76;
                case 1291520876: goto L6c;
                case 1887714241: goto L62;
                case 2061020669: goto L58;
                case 2084227746: goto L4e;
                case 2123924191: goto L44;
                default: goto L42;
            }
        L42:
            goto L1d6
        L44:
            java.lang.String r0 = "HAT_UP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        L4e:
            java.lang.String r0 = "AXIS_HAT_X_POSITIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        L58:
            java.lang.String r0 = "AXIS_HAT_Y_NEGATIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        L62:
            java.lang.String r0 = "AXIS_HAT_Y_POSITIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        L6c:
            java.lang.String r0 = "DPAD_RIGHT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        L76:
            java.lang.String r0 = "AXIS_X_RIGHT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        L80:
            java.lang.String r0 = "HAT_LEFT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L8a:
            java.lang.String r0 = "HAT_DOWN"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        L94:
            java.lang.String r0 = "AXIS_HAT_Y_UP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        L9e:
            java.lang.String r0 = "HAT_RIGHT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        La8:
            java.lang.String r0 = "START"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto Lb2
            goto L1d6
        Lb2:
            b63 r2 = defpackage.b63.START
            return r2
        Lb5:
            java.lang.String r0 = "RIGHT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        Lbf:
            java.lang.String r0 = "AXIS_Y_UP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        Lc9:
            java.lang.String r0 = "LEFT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        Ld3:
            java.lang.String r0 = "DOWN"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        Ldd:
            java.lang.String r0 = "UP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        Le7:
            java.lang.String r0 = "R1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11f
            goto L1d6
        Lf1:
            java.lang.String r0 = "L1"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L12c
            goto L1d6
        Lfb:
            java.lang.String r0 = "Y"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L105
            goto L1d6
        L105:
            b63 r2 = defpackage.b63.Y
            return r2
        L108:
            java.lang.String r0 = "X"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L112
            goto L1d6
        L112:
            b63 r2 = defpackage.b63.X
            return r2
        L115:
            java.lang.String r0 = "R"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L11f
            goto L1d6
        L11f:
            b63 r2 = defpackage.b63.R
            return r2
        L122:
            java.lang.String r0 = "L"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L12c
            goto L1d6
        L12c:
            b63 r2 = defpackage.b63.L
            return r2
        L12f:
            java.lang.String r0 = "B"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L139
            goto L1d6
        L139:
            b63 r2 = defpackage.b63.B
            return r2
        L13c:
            java.lang.String r0 = "A"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L146
            goto L1d6
        L146:
            b63 r2 = defpackage.b63.A
            return r2
        L149:
            java.lang.String r0 = "AXIS_Y_DOWN"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        L153:
            java.lang.String r0 = "AXIS_X_LEFT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L15d:
            java.lang.String r0 = "AXIS_HAT_Y_DOWN"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        L167:
            java.lang.String r0 = "AXIS_HAT_X_LEFT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L171:
            java.lang.String r0 = "DPAD_LEFT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L17a:
            java.lang.String r0 = "DPAD_DOWN"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
            goto L1d6
        L183:
            java.lang.String r0 = "AXIS_HAT_X_RIGHT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        L18c:
            java.lang.String r0 = "AXIS_X_NEGATIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L195:
            java.lang.String r0 = "DPAD_UP"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        L19e:
            java.lang.String r0 = "AXIS_X_POSITIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1a7
            goto L1d6
        L1a7:
            b63 r2 = defpackage.b63.RIGHT
            return r2
        L1aa:
            java.lang.String r0 = "SELECT"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1b3
            goto L1d6
        L1b3:
            b63 r2 = defpackage.b63.SELECT
            return r2
        L1b6:
            java.lang.String r0 = "AXIS_Y_NEGATIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1bf
            goto L1d6
        L1bf:
            b63 r2 = defpackage.b63.UP
            return r2
        L1c2:
            java.lang.String r0 = "AXIS_HAT_X_NEGATIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1cb
            goto L1d6
        L1cb:
            b63 r2 = defpackage.b63.LEFT
            return r2
        L1ce:
            java.lang.String r0 = "AXIS_Y_POSITIVE"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L1d8
        L1d6:
            r2 = 0
            return r2
        L1d8:
            b63 r2 = defpackage.b63.DOWN
            return r2
    }

    public static void r(java.lang.String r3) {
            lc1 r0 = defpackage.lc1.a
            boolean r0 = defpackage.lc1.c
            if (r0 != 0) goto L7
            return
        L7:
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            boolean r0 = r0.debugStepFrame()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=auto_step_frame mode=release reason="
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = " success="
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            java.lang.String r0 = "DebugCommand"
            android.util.Log.w(r0, r3)
            return
    }

    public final java.lang.Object e(android.content.Context r42, defpackage.sb1 r43, android.content.Intent r44, defpackage.s41 r45) {
            r41 = this;
            r0 = r44
            r1 = r45
            yj5 r2 = defpackage.yj5.a
            jg7 r12 = defpackage.jg7.a
            me.magnum.melonds.MelonEmulator r13 = me.magnum.melonds.MelonEmulator.a
            boolean r3 = r1 instanceof defpackage.li5
            if (r3 == 0) goto L20
            r3 = r1
            li5 r3 = (defpackage.li5) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L20
            int r4 = r4 - r5
            r3.u0 = r4
            r4 = r41
        L1e:
            r9 = r3
            goto L28
        L20:
            li5 r3 = new li5
            r4 = r41
            r3.<init>(r4, r1)
            goto L1e
        L28:
            java.lang.Object r1 = r9.s0
            x61 r14 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r9.u0
            java.lang.String r15 = " outputDir="
            java.lang.String r5 = " success="
            java.lang.String r6 = " captureId="
            java.lang.String r7 = " resumeFrames="
            java.lang.String r8 = " paused="
            java.lang.String r10 = " refreshed="
            java.lang.String r11 = "DebugCommand"
            r16 = 0
            r17 = r12
            r19 = 0
            java.lang.String r12 = "action=dump_renderer_capture mode=release renderer="
            switch(r3) {
                case 0: goto L1ee;
                case 1: goto L1d3;
                case 2: goto L16c;
                case 3: goto L12d;
                case 4: goto Lf9;
                case 5: goto L89;
                case 6: goto L4d;
                default: goto L47;
            }
        L47:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r19
        L4d:
            boolean r3 = r9.r0
            int r0 = r9.o0
            int r4 = r9.n0
            int r14 = r9.j0
            r19 = r0
            java.io.File r0 = r9.f0
            r41 = r0
            java.lang.String r0 = r9.e0
            r42 = r0
            java.util.Set r0 = r9.d0
            java.util.Set r0 = (java.util.Set) r0
            me.magnum.melonds.domain.model.VideoRenderer r9 = r9.Z
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L84
            r20 = r0
            r25 = r2
            r21 = r5
            r22 = r6
            r23 = r7
            r24 = r8
            r26 = r10
            r36 = r11
            r29 = r12
            r27 = r13
            r35 = r15
            r15 = r41
            r0 = r42
            goto La7b
        L84:
            r0 = move-exception
            r27 = r13
            goto Lb1c
        L89:
            int r0 = r9.p0
            boolean r3 = r9.r0
            r42 = r0
            int r0 = r9.o0
            r43 = r0
            int r0 = r9.n0
            r44 = r0
            r20 = r1
            long r0 = r9.q0
            r21 = r0
            int r0 = r9.m0
            int r1 = r9.l0
            r23 = r0
            int r0 = r9.k0
            r24 = r0
            int r0 = r9.j0
            r25 = r0
            int r0 = r9.i0
            r26 = r0
            java.io.File r0 = r9.f0
            r27 = r0
            java.lang.String r0 = r9.e0
            r28 = r0
            java.util.Set r0 = r9.d0
            java.util.Set r0 = (java.util.Set) r0
            r29 = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = r9.Z
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L84
            r36 = r11
            r35 = r15
            r4 = r23
            r15 = r27
            r20 = r29
            r11 = r3
            r23 = r7
            r29 = r12
            r27 = r13
            r13 = r26
            r3 = r28
            r12 = r1
            r26 = r10
            r1 = r25
            r10 = r43
            r25 = r2
            r2 = r24
            r24 = r8
            r8 = r42
            r37 = r14
            r14 = r44
            r38 = r5
            r5 = r0
            r0 = r37
            r39 = r21
            r21 = r38
            r22 = r6
            r6 = r39
            goto La1e
        Lf9:
            r20 = r1
            boolean r3 = r9.r0
            int r0 = r9.o0
            int r1 = r9.n0
            int r4 = r9.j0
            java.io.File r14 = r9.f0
            r19 = r0
            java.lang.String r0 = r9.e0
            r21 = r0
            java.util.Set r0 = r9.d0
            java.util.Set r0 = (java.util.Set) r0
            me.magnum.melonds.domain.model.VideoRenderer r9 = r9.Z
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L84
            r20 = r0
            r22 = r6
            r23 = r7
            r24 = r8
            r26 = r10
            r36 = r11
            r29 = r12
            r27 = r13
            r35 = r15
            r0 = r21
            r12 = r2
            r21 = r5
            goto L990
        L12d:
            r20 = r1
            boolean r3 = r9.r0
            int r0 = r9.o0
            int r1 = r9.n0
            int r2 = r9.m0
            int r4 = r9.k0
            int r14 = r9.j0
            r21 = r0
            java.lang.String r0 = r9.h0
            r22 = r0
            java.io.File r0 = r9.g0
            r23 = r0
            java.util.Set r0 = r9.d0
            java.util.Set r0 = (java.util.Set) r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = r9.Z
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L84
            r34 = r11
            r29 = r12
            r27 = r13
            r28 = r15
            r9 = r21
            r12 = r6
            r13 = r7
            r15 = r10
            r6 = r3
            r7 = r4
            r3 = r22
            r4 = r1
            r22 = r5
            r1 = r20
            r5 = r2
            r20 = r14
            r2 = r23
            r14 = r8
            goto L842
        L16c:
            r20 = r1
            boolean r3 = r9.r0
            int r0 = r9.o0
            int r1 = r9.n0
            r4 = r0
            r21 = r1
            long r0 = r9.q0
            r22 = r0
            int r0 = r9.m0
            int r1 = r9.l0
            r24 = r0
            int r0 = r9.k0
            r25 = r0
            int r0 = r9.j0
            r26 = r0
            int r0 = r9.i0
            r27 = r0
            java.io.File r0 = r9.g0
            r28 = r0
            java.lang.String r0 = r9.e0
            r29 = r0
            java.util.Set r0 = r9.d0
            java.util.Set r0 = (java.util.Set) r0
            r41 = r0
            me.magnum.melonds.domain.model.VideoRenderer r0 = r9.Z
            defpackage.oi2.Y(r20)     // Catch: java.lang.Throwable -> L84
            r20 = r26
            r26 = r10
            r10 = r20
            r20 = r2
            r2 = r28
            r28 = r15
            r15 = r14
            r14 = r3
            r3 = r29
            r29 = r12
            r12 = r41
            r37 = r11
            r11 = r1
            r1 = r24
            r24 = r8
            r38 = r21
            r21 = r5
            r5 = r25
            r25 = r37
            r39 = r22
            r22 = r6
            r23 = r7
            r7 = r39
            r6 = r27
            r27 = r13
            r13 = r38
            goto L79d
        L1d3:
            r20 = r1
            int r0 = r9.j0
            int r1 = r9.i0
            android.content.Intent r3 = r9.Y
            r21 = r0
            sb1 r0 = r9.X
            r22 = r0
            android.content.Context r0 = r9.R
            defpackage.oi2.Y(r20)
            r20 = r2
            r2 = r21
            r4 = r22
            goto L252
        L1ee:
            r20 = r1
            defpackage.oi2.Y(r20)
            java.lang.String r1 = "refresh"
            java.lang.String r3 = "refresh_settings"
            java.lang.String[] r1 = new java.lang.String[]{r1, r3}
            java.lang.Boolean r1 = b(r0, r1)
            if (r1 == 0) goto L206
            boolean r1 = r1.booleanValue()
            goto L207
        L206:
            r1 = 1
        L207:
            if (r1 == 0) goto L223
            android.content.SharedPreferences r3 = r43.a()
            android.content.SharedPreferences$Editor r3 = r3.edit()
            r20 = r2
            java.lang.String r2 = "video_renderer_debug_tools_enabled"
            r4 = 1
            r3.putBoolean(r2, r4)
            r3.commit()
            lc1 r2 = defpackage.lc1.a
            boolean r2 = defpackage.lc1.c()
            goto L227
        L223:
            r20 = r2
            r2 = r16
        L227:
            r3 = r42
            if (r2 == 0) goto L24b
            r9.R = r3
            r4 = r43
            r9.X = r4
            r9.Y = r0
            r9.i0 = r1
            r9.j0 = r2
            r0 = 1
            r9.u0 = r0
            r21 = r1
            r0 = 350(0x15e, double:1.73E-321)
            java.lang.Object r0 = defpackage.q60.t(r0, r9)
            if (r0 != r14) goto L247
            r10 = r14
            goto La73
        L247:
            r0 = r3
            r1 = r21
            goto L250
        L24b:
            r4 = r43
            r21 = r1
            r0 = r3
        L250:
            r3 = r44
        L252:
            m55 r4 = r4.s
            java.lang.Object r4 = r4.get()
            kd6 r4 = (defpackage.kd6) r4
            ng6 r4 = (defpackage.ng6) r4
            me.magnum.melonds.domain.model.VideoRenderer r4 = r4.e()
            r21 = r5
            java.lang.String r5 = "burst_count"
            r22 = r6
            java.lang.String r6 = "capture_count"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}
            java.lang.Integer r5 = c(r3, r5)
            if (r5 == 0) goto L282
            int r5 = r5.intValue()
            r6 = 600(0x258, float:8.41E-43)
            r23 = r7
            r7 = 1
            int r18 = defpackage.gi2.q(r5, r7, r6)
            r5 = r18
            goto L286
        L282:
            r23 = r7
            r7 = 1
            r5 = r7
        L286:
            java.lang.String r6 = "burst_live"
            java.lang.String r7 = "live_burst"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7}
            java.lang.Boolean r6 = b(r3, r6)
            if (r6 == 0) goto L299
            boolean r6 = r6.booleanValue()
            goto L2a0
        L299:
            r7 = 1
            if (r5 <= r7) goto L29e
            r6 = r7
            goto L2a0
        L29e:
            r6 = r16
        L2a0:
            java.lang.String r7 = "burst_step_frames"
            r24 = r8
            java.lang.String r8 = "step_frames"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            java.lang.Integer r7 = c(r3, r7)
            if (r7 == 0) goto L2bf
            int r7 = r7.intValue()
            r8 = 1
            if (r7 >= r8) goto L2ba
            r18 = r8
            goto L2bc
        L2ba:
            r18 = r7
        L2bc:
            r7 = r18
            goto L2c1
        L2bf:
            r8 = 1
            r7 = r8
        L2c1:
            java.lang.String r18 = "timeout_ms"
            java.lang.String[] r8 = new java.lang.String[]{r18}
            java.lang.Integer r8 = c(r3, r8)
            if (r8 == 0) goto L2db
            int r8 = r8.intValue()
            r26 = r10
            r10 = 1
            if (r8 >= r10) goto L2d7
            r8 = 1
        L2d7:
            r25 = r11
            long r10 = (long) r8
            goto L2f1
        L2db:
            r26 = r10
            r25 = r11
            long r10 = (long) r5
            r27 = r10
            long r10 = (long) r7
            long r10 = r10 * r27
            r27 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r27
            r27 = 24
            long r10 = r10 / r27
            r27 = 5000(0x1388, double:2.4703E-320)
            long r10 = r10 + r27
        L2f1:
            java.lang.String r8 = "resume_ms"
            r27 = r13
            java.lang.String r13 = "duration_ms"
            java.lang.String[] r8 = new java.lang.String[]{r8, r13}
            java.lang.Integer r8 = c(r3, r8)
            if (r8 == 0) goto L30b
            int r8 = r8.intValue()
            if (r8 >= 0) goto L309
            r8 = r16
        L309:
            r13 = r8
            goto L30d
        L30b:
            r13 = r16
        L30d:
            java.lang.String r8 = "resume_frames"
            r28 = r15
            java.lang.String r15 = "frames"
            java.lang.String[] r8 = new java.lang.String[]{r8, r15}
            java.lang.Integer r8 = c(r3, r8)
            if (r8 == 0) goto L327
            int r8 = r8.intValue()
            if (r8 >= 0) goto L325
            r8 = r16
        L325:
            r15 = r8
            goto L329
        L327:
            r15 = r16
        L329:
            java.lang.String r8 = "capture_kinds"
            r29 = r12
            java.lang.String r12 = "kinds"
            java.lang.String[] r8 = new java.lang.String[]{r8, r12}
            java.lang.String r8 = d(r3, r8)
            r12 = 1
            if (r5 <= r12) goto L341
            vj5 r12 = defpackage.vj5.SCREEN_FRAME
            java.util.Set r12 = defpackage.ii2.R(r12)
            goto L343
        L341:
            java.util.LinkedHashSet r12 = defpackage.zj5.a
        L343:
            if (r8 == 0) goto L34e
            java.lang.CharSequence r8 = defpackage.qs6.T0(r8)
            java.lang.String r8 = r8.toString()
            goto L350
        L34e:
            r8 = r19
        L350:
            if (r8 != 0) goto L354
            java.lang.String r8 = ""
        L354:
            int r30 = r8.length()
            if (r30 != 0) goto L364
            r31 = r10
            r42 = r12
            r30 = r14
            r43 = r15
            goto L6fe
        L364:
            r42 = r12
            java.util.LinkedHashSet r12 = new java.util.LinkedHashSet
            r12.<init>()
            r30 = r14
            r43 = r15
            r14 = 1
            char[] r15 = new char[r14]
            r14 = 44
            r15[r16] = r14
            r14 = 6
            java.util.List r8 = defpackage.qs6.J0(r8, r15, r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = 10
            int r15 = defpackage.ht0.v0(r8, r15)
            r14.<init>(r15)
            java.util.Iterator r8 = r8.iterator()
        L38a:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L3b2
            java.lang.Object r15 = r8.next()
            java.lang.String r15 = (java.lang.String) r15
            java.lang.CharSequence r15 = defpackage.qs6.T0(r15)
            java.lang.String r15 = r15.toString()
            r44 = r8
            java.util.Locale r8 = java.util.Locale.US
            r8.getClass()
            java.lang.String r8 = r15.toLowerCase(r8)
            r8.getClass()
            r14.add(r8)
            r8 = r44
            goto L38a
        L3b2:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r15 = r14.size()
            r31 = r10
            r10 = r16
        L3bf:
            if (r10 >= r15) goto L3d5
            java.lang.Object r11 = r14.get(r10)
            int r10 = r10 + 1
            r33 = r11
            java.lang.String r33 = (java.lang.String) r33
            int r33 = r33.length()
            if (r33 <= 0) goto L3bf
            r8.add(r11)
            goto L3bf
        L3d5:
            int r10 = r8.size()
            r11 = r16
        L3db:
            if (r11 >= r10) goto L6f8
            java.lang.Object r14 = r8.get(r11)
            int r11 = r11 + 1
            java.lang.String r14 = (java.lang.String) r14
            int r15 = r14.hashCode()
            switch(r15) {
                case -2143177360: goto L6dd;
                case -2087035092: goto L6ce;
                case -2010319127: goto L6bf;
                case -1937062788: goto L6b0;
                case -1934316381: goto L6a1;
                case -1846844805: goto L692;
                case -1782551346: goto L683;
                case -1737750013: goto L67a;
                case -1661451021: goto L671;
                case -1661374960: goto L668;
                case -1645794965: goto L659;
                case -1642626848: goto L64f;
                case -1582757278: goto L640;
                case -1541729193: goto L637;
                case -1521836238: goto L628;
                case -1485088398: goto L619;
                case -1454827237: goto L60a;
                case -1404123096: goto L600;
                case -1068115457: goto L5f7;
                case -995865480: goto L5e3;
                case -975978970: goto L5d4;
                case -962217605: goto L5cb;
                case -907689876: goto L5bc;
                case -821431768: goto L5b2;
                case -758324059: goto L5a8;
                case -636388588: goto L59e;
                case -601099216: goto L594;
                case -594643969: goto L58a;
                case -442921697: goto L57b;
                case -442704195: goto L571;
                case -375394832: goto L562;
                case -351767064: goto L558;
                case -185654247: goto L54e;
                case -170775473: goto L544;
                case -93183101: goto L53a;
                case -36680575: goto L530;
                case 1681: goto L521;
                case 96673: goto L509;
                case 3004913: goto L4fa;
                case 95472323: goto L4eb;
                case 140919054: goto L4dc;
                case 164552669: goto L4d2;
                case 196116660: goto L4c8;
                case 224351794: goto L4be;
                case 405645655: goto L4b5;
                case 440238502: goto L4ab;
                case 542057647: goto L4a2;
                case 544277337: goto L498;
                case 671664986: goto L48e;
                case 988535853: goto L484;
                case 1049062293: goto L47a;
                case 1194599060: goto L470;
                case 1368068931: goto L466;
                case 1386031493: goto L45c;
                case 1421398994: goto L452;
                case 1477736656: goto L448;
                case 1499060152: goto L43e;
                case 1596010219: goto L434;
                case 1730247920: goto L42a;
                case 1805580505: goto L420;
                case 1805681117: goto L416;
                case 1917234727: goto L40c;
                case 1957073541: goto L402;
                case 2099226433: goto L3f8;
                case 2116904398: goto L3ee;
                default: goto L3ec;
            }
        L3ec:
            goto L6ec
        L3ee:
            java.lang.String r15 = "exactframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L583
        L3f8:
            java.lang.String r15 = "capture3dsourceds"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L630
        L402:
            java.lang.String r15 = "renderer3dattr"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L502
        L40c:
            java.lang.String r15 = "softpackedmeta"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6c7
        L416:
            java.lang.String r15 = "packedtop"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L4e4
        L420:
            java.lang.String r15 = "comp4_bottom_placeholder"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6e5
        L42a:
            java.lang.String r15 = "capture_fallback_mask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L68b
        L434:
            java.lang.String r15 = "vulkan_exact"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L583
        L43e:
            java.lang.String r15 = "packedbottomplane1"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L648
        L448:
            java.lang.String r15 = "compositedframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L661
        L452:
            java.lang.String r15 = "packed_bottom"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6a9
        L45c:
            java.lang.String r15 = "packedtopprimary"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L4e4
        L466:
            java.lang.String r15 = "comp4topplaceholder"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L612
        L470:
            java.lang.String r15 = "renderer3d"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L529
        L47a:
            java.lang.String r15 = "3dcapture"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L69a
        L484:
            java.lang.String r15 = "exact_frame"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L583
        L48e:
            java.lang.String r15 = "packedbottomcontrol"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L56a
        L498:
            java.lang.String r15 = "renderer3dframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L529
        L4a2:
            java.lang.String r15 = "renderer3ddepth"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L4f3
        L4ab:
            java.lang.String r15 = "packed_top_plane1"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L621
        L4b5:
            java.lang.String r15 = "attributes"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L502
        L4be:
            java.lang.String r15 = "renderer3dcapture"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L69a
        L4c8:
            java.lang.String r15 = "vulkanexact"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L583
        L4d2:
            java.lang.String r15 = "vulkan-exact"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L583
        L4dc:
            java.lang.String r15 = "packed_top"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L4e4:
            vj5 r14 = defpackage.vj5.PACKED_TOP_PRIMARY
            r12.add(r14)
            goto L3db
        L4eb:
            java.lang.String r15 = "depth"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L4f3:
            vj5 r14 = defpackage.vj5.RENDERER3D_DEPTH
            r12.add(r14)
            goto L3db
        L4fa:
            java.lang.String r15 = "attr"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L502:
            vj5 r14 = defpackage.vj5.RENDERER3D_ATTR
            r12.add(r14)
            goto L3db
        L509:
            java.lang.String r15 = "all"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            uj5 r14 = defpackage.vj5.Companion
            r14.getClass()
            java.util.Set r14 = defpackage.vj5.access$getAllKinds$cp()
            java.util.Collection r14 = (java.util.Collection) r14
            r12.addAll(r14)
            goto L3db
        L521:
            java.lang.String r15 = "3d"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L529:
            vj5 r14 = defpackage.vj5.RENDERER3D_FRAME
            r12.add(r14)
            goto L3db
        L530:
            java.lang.String r15 = "screenframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L5c4
        L53a:
            java.lang.String r15 = "capturelineuses3dmask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L5dc
        L544:
            java.lang.String r15 = "comp4_top_placeholder"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L612
        L54e:
            java.lang.String r15 = "capture_line_uses_3d_mask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L5dc
        L558:
            java.lang.String r15 = "coverage"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6b8
        L562:
            java.lang.String r15 = "packed_bottom_control"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L56a:
            vj5 r14 = defpackage.vj5.PACKED_BOTTOM_CONTROL
            r12.add(r14)
            goto L3db
        L571:
            java.lang.String r15 = "composited"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L661
        L57b:
            java.lang.String r15 = "exact-frame"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L583:
            java.util.LinkedHashSet r14 = defpackage.zj5.a
            r12.addAll(r14)
            goto L3db
        L58a:
            java.lang.String r15 = "packedbottomprimary"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6a9
        L594:
            java.lang.String r15 = "comp4top"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L612
        L59e:
            java.lang.String r15 = "capturefallbackmask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L68b
        L5a8:
            java.lang.String r15 = "comp4_bottom"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6e5
        L5b2:
            java.lang.String r15 = "vulkancomposited"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L661
        L5bc:
            java.lang.String r15 = "screen"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L5c4:
            vj5 r14 = defpackage.vj5.SCREEN_FRAME
            r12.add(r14)
            goto L3db
        L5cb:
            java.lang.String r15 = "capture3dsourceframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L630
        L5d4:
            java.lang.String r15 = "capturelinemask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L5dc:
            vj5 r14 = defpackage.vj5.CAPTURE_LINE_USES_3D_MASK
            r12.add(r14)
            goto L3db
        L5e3:
            java.lang.String r15 = "packed"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            vj5 r14 = defpackage.vj5.PACKED_TOP_PRIMARY
            r12.add(r14)
            vj5 r14 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            r12.add(r14)
            goto L3db
        L5f7:
            java.lang.String r15 = "vulkan_composited_frame"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L661
        L600:
            java.lang.String r15 = "capturefallback"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L68b
        L60a:
            java.lang.String r15 = "comp4_top"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L612:
            vj5 r14 = defpackage.vj5.COMP4_TOP_PLACEHOLDER
            r12.add(r14)
            goto L3db
        L619:
            java.lang.String r15 = "packedtopplane1"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L621:
            vj5 r14 = defpackage.vj5.PACKED_TOP_PLANE1
            r12.add(r14)
            goto L3db
        L628:
            java.lang.String r15 = "capture3dsource"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L630:
            vj5 r14 = defpackage.vj5.CAPTURE3D_SOURCE_DS_FRAME
            r12.add(r14)
            goto L3db
        L637:
            java.lang.String r15 = "capture3d"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L69a
        L640:
            java.lang.String r15 = "packed_bottom_plane1"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L648:
            vj5 r14 = defpackage.vj5.PACKED_BOTTOM_PLANE1
            r12.add(r14)
            goto L3db
        L64f:
            java.lang.String r15 = "packedtopcontrol"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6d6
        L659:
            java.lang.String r15 = "composited_frame"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L661:
            vj5 r14 = defpackage.vj5.COMPOSITED_FRAME
            r12.add(r14)
            goto L3db
        L668:
            java.lang.String r15 = "softpackedframemeta"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6c7
        L671:
            java.lang.String r15 = "softpackedframejson"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6c7
        L67a:
            java.lang.String r15 = "comp4bottomplaceholder"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
            goto L6e5
        L683:
            java.lang.String r15 = "fallbackmask"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L68b:
            vj5 r14 = defpackage.vj5.CAPTURE_FALLBACK_MASK
            r12.add(r14)
            goto L3db
        L692:
            java.lang.String r15 = "renderer3dcaptureframe"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L69a:
            vj5 r14 = defpackage.vj5.RENDERER3D_CAPTURE_FRAME
            r12.add(r14)
            goto L3db
        L6a1:
            java.lang.String r15 = "packedbottom"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L6a9:
            vj5 r14 = defpackage.vj5.PACKED_BOTTOM_PRIMARY
            r12.add(r14)
            goto L3db
        L6b0:
            java.lang.String r15 = "renderer3dcoverage"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L6b8:
            vj5 r14 = defpackage.vj5.RENDERER3D_COVERAGE
            r12.add(r14)
            goto L3db
        L6bf:
            java.lang.String r15 = "soft_packed_frame_meta"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L6c7:
            vj5 r14 = defpackage.vj5.SOFT_PACKED_FRAME_META_JSON
            r12.add(r14)
            goto L3db
        L6ce:
            java.lang.String r15 = "packed_top_control"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L6d6:
            vj5 r14 = defpackage.vj5.PACKED_TOP_CONTROL
            r12.add(r14)
            goto L3db
        L6dd:
            java.lang.String r15 = "comp4bottom"
            boolean r15 = r14.equals(r15)
            if (r15 == 0) goto L6ec
        L6e5:
            vj5 r14 = defpackage.vj5.COMP4_BOTTOM_PLACEHOLDER
            r12.add(r14)
            goto L3db
        L6ec:
            java.lang.String r8 = "Unsupported capture kind="
            java.lang.String r8 = r8.concat(r14)
            defpackage.i.h(r8)
            r12 = r19
            goto L700
        L6f8:
            boolean r8 = r12.isEmpty()
            if (r8 == 0) goto L700
        L6fe:
            r12 = r42
        L700:
            java.lang.String r8 = "capture_id"
            java.lang.String r10 = "capture_id_base"
            java.lang.String[] r8 = new java.lang.String[]{r8, r10}
            java.lang.String r3 = d(r3, r8)
            if (r3 == 0) goto L715
            boolean r8 = defpackage.qs6.v0(r3)
            if (r8 != 0) goto L715
            goto L717
        L715:
            r3 = r19
        L717:
            java.lang.String r8 = "renderer-debug-captures"
            java.io.File r10 = r0.getExternalFilesDir(r8)
            if (r10 != 0) goto L728
            java.io.File r10 = new java.io.File
            java.io.File r0 = r0.getCacheDir()
            r10.<init>(r0, r8)
        L728:
            r14 = r10
            r0 = 1
            if (r5 <= r0) goto L73f
            java.io.File r8 = new java.io.File
            long r10 = java.lang.System.currentTimeMillis()
            java.lang.String r15 = "burst_"
            java.lang.String r10 = defpackage.lb1.h(r10, r15)
            r8.<init>(r14, r10)
            r8.mkdirs()
            goto L740
        L73f:
            r8 = r14
        L740:
            lc1 r10 = defpackage.lc1.a
            boolean r11 = defpackage.lc1.c
            if (r5 <= r0) goto L920
            if (r6 == 0) goto L920
            if (r43 > 0) goto L7b2
            if (r13 <= 0) goto L7b2
            defpackage.lc1.e(r16)     // Catch: java.lang.Throwable -> L7ae
            r27.resumeEmulation()     // Catch: java.lang.Throwable -> L7ae
            long r14 = (long) r13     // Catch: java.lang.Throwable -> L7ae
            r0 = r19
            r9.R = r0     // Catch: java.lang.Throwable -> L7ae
            r9.X = r0     // Catch: java.lang.Throwable -> L7ae
            r9.Y = r0     // Catch: java.lang.Throwable -> L7ae
            r9.Z = r4     // Catch: java.lang.Throwable -> L7ae
            r10 = r12
            java.util.Set r10 = (java.util.Set) r10     // Catch: java.lang.Throwable -> L7ae
            r9.d0 = r10     // Catch: java.lang.Throwable -> L7ae
            r9.e0 = r3     // Catch: java.lang.Throwable -> L7ae
            r9.f0 = r0     // Catch: java.lang.Throwable -> L7ae
            r9.g0 = r8     // Catch: java.lang.Throwable -> L7ae
            r9.i0 = r1     // Catch: java.lang.Throwable -> L7ae
            r9.j0 = r2     // Catch: java.lang.Throwable -> L7ae
            r9.k0 = r5     // Catch: java.lang.Throwable -> L7ae
            r9.l0 = r6     // Catch: java.lang.Throwable -> L7ae
            r9.m0 = r7     // Catch: java.lang.Throwable -> L7ae
            r0 = r7
            r10 = r8
            r7 = r31
            r9.q0 = r7     // Catch: java.lang.Throwable -> L7ae
            r9.n0 = r13     // Catch: java.lang.Throwable -> L7ae
            r42 = r0
            r0 = r43
            r9.o0 = r0     // Catch: java.lang.Throwable -> L7ae
            r9.r0 = r11     // Catch: java.lang.Throwable -> L7ae
            r41 = r10
            r10 = 2
            r9.u0 = r10     // Catch: java.lang.Throwable -> L7ae
            java.lang.Object r10 = defpackage.q60.t(r14, r9)     // Catch: java.lang.Throwable -> L7ae
            r15 = r30
            if (r10 != r15) goto L792
            r10 = r15
            goto La73
        L792:
            r10 = r4
            r4 = r0
            r0 = r10
            r10 = r2
            r14 = r11
            r2 = r41
            r11 = r6
            r6 = r1
            r1 = r42
        L79d:
            r41 = r4
            r4 = r0
            r0 = r41
            r37 = r7
            r7 = r1
            r1 = r6
            r6 = r11
            r8 = r12
            r12 = r10
            r10 = r37
        L7ab:
            r41 = r3
            goto L7c5
        L7ae:
            r0 = move-exception
        L7af:
            r3 = r11
            goto Lb1c
        L7b2:
            r0 = r43
            r42 = r7
            r41 = r8
            r15 = r30
            r7 = r31
            r14 = r11
            r10 = r7
            r8 = r12
            r7 = r42
            r12 = r2
            r2 = r41
            goto L7ab
        L7c5:
            mi5 r3 = new mi5     // Catch: java.lang.Throwable -> L91c
            r42 = r8
            r30 = r15
            r8 = 1
            r15 = 0
            r3.<init>(r8, r15)     // Catch: java.lang.Throwable -> L91c
            if (r41 != 0) goto L7df
            long r31 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L7db
            java.lang.String r8 = java.lang.Long.toHexString(r31)     // Catch: java.lang.Throwable -> L7db
            goto L7e1
        L7db:
            r0 = move-exception
            r3 = r14
            goto Lb1c
        L7df:
            r8 = r41
        L7e1:
            r8.getClass()     // Catch: java.lang.Throwable -> L91c
            if (r0 > 0) goto L7ea
            if (r13 > 0) goto L7e9
            goto L7ea
        L7e9:
            r3 = 0
        L7ea:
            r15 = 0
            r9.R = r15     // Catch: java.lang.Throwable -> L91c
            r9.X = r15     // Catch: java.lang.Throwable -> L91c
            r9.Y = r15     // Catch: java.lang.Throwable -> L91c
            r9.Z = r4     // Catch: java.lang.Throwable -> L91c
            r9.d0 = r15     // Catch: java.lang.Throwable -> L91c
            r9.e0 = r15     // Catch: java.lang.Throwable -> L91c
            r9.f0 = r15     // Catch: java.lang.Throwable -> L91c
            r9.g0 = r2     // Catch: java.lang.Throwable -> L91c
            r9.h0 = r8     // Catch: java.lang.Throwable -> L91c
            r9.i0 = r1     // Catch: java.lang.Throwable -> L91c
            r9.j0 = r12     // Catch: java.lang.Throwable -> L91c
            r9.k0 = r5     // Catch: java.lang.Throwable -> L91c
            r9.l0 = r6     // Catch: java.lang.Throwable -> L91c
            r9.m0 = r7     // Catch: java.lang.Throwable -> L91c
            r9.q0 = r10     // Catch: java.lang.Throwable -> L91c
            r9.n0 = r13     // Catch: java.lang.Throwable -> L91c
            r9.o0 = r0     // Catch: java.lang.Throwable -> L91c
            r9.r0 = r14     // Catch: java.lang.Throwable -> L91c
            r1 = 3
            r9.u0 = r1     // Catch: java.lang.Throwable -> L91c
            r1 = r4
            r4 = r5
            r5 = r7
            r6 = r10
            r41 = r13
            r13 = r23
            r34 = r25
            r15 = r26
            r10 = r3
            r3 = r8
            r11 = r9
            r8 = r42
            r9 = r0
            r0 = r20
            r20 = r12
            r12 = r22
            r22 = r21
            r21 = r14
            r14 = r24
            java.io.Serializable r0 = r0.d(r1, r2, r3, r4, r5, r6, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L917
            r10 = r30
            if (r0 != r10) goto L83a
            goto La73
        L83a:
            r6 = r1
            r1 = r0
            r0 = r6
            r7 = r4
            r6 = r21
            r4 = r41
        L842:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L84f
            if (r1 == 0) goto L853
            boolean r8 = r1.isEmpty()     // Catch: java.lang.Throwable -> L84f
            if (r8 == 0) goto L853
            r10 = r16
            goto L874
        L84f:
            r0 = move-exception
            r3 = r6
            goto Lb1c
        L853:
            java.util.Iterator r8 = r1.iterator()     // Catch: java.lang.Throwable -> L84f
            r10 = r16
        L859:
            boolean r11 = r8.hasNext()     // Catch: java.lang.Throwable -> L84f
            if (r11 == 0) goto L874
            java.lang.Object r11 = r8.next()     // Catch: java.lang.Throwable -> L84f
            ak5 r11 = (defpackage.ak5) r11     // Catch: java.lang.Throwable -> L84f
            boolean r11 = r11.b     // Catch: java.lang.Throwable -> L84f
            if (r11 == 0) goto L859
            int r10 = r10 + 1
            if (r10 < 0) goto L86e
            goto L859
        L86e:
            defpackage.hf.p0()     // Catch: java.lang.Throwable -> L84f
            r19 = 0
            throw r19     // Catch: java.lang.Throwable -> L84f
        L874:
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> L84f
            java.util.Locale r8 = java.util.Locale.US     // Catch: java.lang.Throwable -> L84f
            r8.getClass()     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = r0.toLowerCase(r8)     // Catch: java.lang.Throwable -> L84f
            r0.getClass()     // Catch: java.lang.Throwable -> L84f
            if (r20 == 0) goto L888
            r8 = 1
            goto L88a
        L888:
            r8 = r16
        L88a:
            if (r9 <= 0) goto L88f
            java.lang.String r11 = "native_callbacks"
            goto L896
        L88f:
            if (r4 <= 0) goto L894
            java.lang.String r11 = "elapsed_ms"
            goto L896
        L894:
            java.lang.String r11 = "none"
        L896:
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L84f
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L84f
            r41 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84f
            r2.<init>()     // Catch: java.lang.Throwable -> L84f
            r42 = r1
            r1 = r29
            r2.append(r1)     // Catch: java.lang.Throwable -> L84f
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r2.append(r15)     // Catch: java.lang.Throwable -> L84f
            r2.append(r8)     // Catch: java.lang.Throwable -> L84f
            r2.append(r14)     // Catch: java.lang.Throwable -> L84f
            r2.append(r6)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = " liveBurst=1 resumeMs="
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r2.append(r4)     // Catch: java.lang.Throwable -> L84f
            r2.append(r13)     // Catch: java.lang.Throwable -> L84f
            r2.append(r9)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = " warmupMode="
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r2.append(r11)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = " burstCount="
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r2.append(r7)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = " burstStepFrames="
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r2.append(r5)     // Catch: java.lang.Throwable -> L84f
            r2.append(r12)     // Catch: java.lang.Throwable -> L84f
            r2.append(r3)     // Catch: java.lang.Throwable -> L84f
            r9 = r22
            r2.append(r9)     // Catch: java.lang.Throwable -> L84f
            r2.append(r10)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = "/"
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r0 = r42
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r0 = r28
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            r0 = r41
            r2.append(r0)     // Catch: java.lang.Throwable -> L84f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L84f
            r1 = r34
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L84f
            if (r6 != 0) goto Lb0a
        L90e:
            lc1 r0 = defpackage.lc1.a
            defpackage.lc1.e(r16)
            r27.resumeEmulation()
            return r17
        L917:
            r0 = move-exception
        L918:
            r3 = r21
            goto Lb1c
        L91c:
            r0 = move-exception
            r21 = r14
            goto L918
        L920:
            r42 = r20
            r20 = r12
            r12 = r42
            r0 = r43
            r42 = r7
            r15 = r14
            r36 = r25
            r35 = r28
            r10 = r30
            r7 = r31
            r14 = r13
            r13 = r1
            r1 = r29
            if (r11 != 0) goto L99e
            r27.pauseEmulation()     // Catch: java.lang.Throwable -> L7ae
            r18 = 1
            defpackage.lc1.e(r18)     // Catch: java.lang.Throwable -> L7ae
            r29 = r1
            r1 = 0
            r9.R = r1     // Catch: java.lang.Throwable -> L7ae
            r9.X = r1     // Catch: java.lang.Throwable -> L7ae
            r9.Y = r1     // Catch: java.lang.Throwable -> L7ae
            r9.Z = r4     // Catch: java.lang.Throwable -> L7ae
            r1 = r20
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L7ae
            r9.d0 = r1     // Catch: java.lang.Throwable -> L7ae
            r9.e0 = r3     // Catch: java.lang.Throwable -> L7ae
            r9.f0 = r15     // Catch: java.lang.Throwable -> L7ae
            r1 = 0
            r9.g0 = r1     // Catch: java.lang.Throwable -> L7ae
            r9.i0 = r13     // Catch: java.lang.Throwable -> L7ae
            r9.j0 = r2     // Catch: java.lang.Throwable -> L7ae
            r9.k0 = r5     // Catch: java.lang.Throwable -> L7ae
            r9.l0 = r6     // Catch: java.lang.Throwable -> L7ae
            r1 = r42
            r9.m0 = r1     // Catch: java.lang.Throwable -> L7ae
            r9.q0 = r7     // Catch: java.lang.Throwable -> L7ae
            r9.n0 = r14     // Catch: java.lang.Throwable -> L7ae
            r9.o0 = r0     // Catch: java.lang.Throwable -> L7ae
            r9.r0 = r11     // Catch: java.lang.Throwable -> L7ae
            r1 = 4
            r9.u0 = r1     // Catch: java.lang.Throwable -> L7ae
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r1 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE     // Catch: java.lang.Throwable -> L7ae
            int r6 = r1.getCurrentFrameIndexForDebug()     // Catch: java.lang.Throwable -> L7ae
            r7 = 1000(0x3e8, double:4.94E-321)
            r5 = r4
            r4 = r41
            java.lang.Object r1 = r4.t(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> L7ae
            r9 = r5
            if (r1 != r10) goto L983
            goto L985
        L983:
            r1 = r17
        L985:
            if (r1 != r10) goto L989
            goto La73
        L989:
            r19 = r0
            r4 = r2
            r0 = r3
            r3 = r11
            r1 = r14
            r14 = r15
        L990:
            r13 = r1
            r11 = r3
            r2 = r4
            r4 = r9
            r15 = r19
            r18 = 1
            r3 = r0
        L999:
            r0 = r12
            r12 = r20
            goto La8e
        L99e:
            r29 = r1
            r30 = r10
            r1 = r42
            r10 = r9
            r9 = r4
            if (r14 > 0) goto L9b2
            if (r0 <= 0) goto L9ab
            goto L9b2
        L9ab:
            r4 = r9
            r13 = r14
            r14 = r15
            r18 = 1
            r15 = r0
            goto L999
        L9b2:
            defpackage.lc1.e(r16)     // Catch: java.lang.Throwable -> L7ae
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r4 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE     // Catch: java.lang.Throwable -> L7ae
            int r4 = r4.getCurrentFrameIndexForDebug()     // Catch: java.lang.Throwable -> L7ae
            r27.resumeEmulation()     // Catch: java.lang.Throwable -> L7ae
            r42 = r11
            r25 = r12
            long r11 = (long) r14
            r31 = r11
            r11 = 0
            r10.R = r11     // Catch: java.lang.Throwable -> Lb17
            r10.X = r11     // Catch: java.lang.Throwable -> Lb17
            r10.Y = r11     // Catch: java.lang.Throwable -> Lb17
            r10.Z = r9     // Catch: java.lang.Throwable -> Lb17
            r12 = r20
            java.util.Set r12 = (java.util.Set) r12     // Catch: java.lang.Throwable -> Lb17
            r10.d0 = r12     // Catch: java.lang.Throwable -> Lb17
            r10.e0 = r3     // Catch: java.lang.Throwable -> Lb17
            r10.f0 = r15     // Catch: java.lang.Throwable -> Lb17
            r11 = 0
            r10.g0 = r11     // Catch: java.lang.Throwable -> Lb17
            r10.i0 = r13     // Catch: java.lang.Throwable -> Lb17
            r10.j0 = r2     // Catch: java.lang.Throwable -> Lb17
            r10.k0 = r5     // Catch: java.lang.Throwable -> Lb17
            r10.l0 = r6     // Catch: java.lang.Throwable -> Lb17
            r10.m0 = r1     // Catch: java.lang.Throwable -> Lb17
            r10.q0 = r7     // Catch: java.lang.Throwable -> Lb17
            r10.n0 = r14     // Catch: java.lang.Throwable -> Lb17
            r10.o0 = r0     // Catch: java.lang.Throwable -> Lb17
            r11 = r42
            r10.r0 = r11     // Catch: java.lang.Throwable -> L7ae
            r10.p0 = r4     // Catch: java.lang.Throwable -> L7ae
            r12 = 5
            r10.u0 = r12     // Catch: java.lang.Throwable -> L7ae
            r42 = r21
            r21 = r1
            r1 = r42
            r42 = r5
            r12 = r6
            r5 = r9
            r6 = r4
            r4 = r41
            r37 = r7
            r7 = r0
            r0 = r30
            r8 = r31
            r31 = r37
            java.lang.Object r8 = r4.s(r5, r6, r7, r8, r10)     // Catch: java.lang.Throwable -> L7ae
            r9 = r10
            if (r8 != r0) goto La13
            r10 = r0
            goto La73
        La13:
            r8 = r6
            r10 = r7
            r4 = r21
            r6 = r31
            r21 = r1
            r1 = r2
            r2 = r42
        La1e:
            r27.pauseEmulation()     // Catch: java.lang.Throwable -> Lb14
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r28 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE     // Catch: java.lang.Throwable -> Lb14
            int r28 = r28.getCurrentFrameIndexForDebug()     // Catch: java.lang.Throwable -> Lb14
            r30 = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r14 >= r0) goto La32
        La2d:
            r31 = r10
            r32 = r11
            goto La34
        La32:
            r0 = r14
            goto La2d
        La34:
            long r10 = (long) r0
            r0 = 0
            r9.R = r0     // Catch: java.lang.Throwable -> Lb10
            r9.X = r0     // Catch: java.lang.Throwable -> Lb10
            r9.Y = r0     // Catch: java.lang.Throwable -> Lb10
            r9.Z = r5     // Catch: java.lang.Throwable -> Lb10
            r0 = r20
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> Lb10
            r9.d0 = r0     // Catch: java.lang.Throwable -> Lb10
            r9.e0 = r3     // Catch: java.lang.Throwable -> Lb10
            r9.f0 = r15     // Catch: java.lang.Throwable -> Lb10
            r0 = 0
            r9.g0 = r0     // Catch: java.lang.Throwable -> Lb10
            r9.i0 = r13     // Catch: java.lang.Throwable -> Lb10
            r9.j0 = r1     // Catch: java.lang.Throwable -> Lb10
            r9.k0 = r2     // Catch: java.lang.Throwable -> Lb10
            r9.l0 = r12     // Catch: java.lang.Throwable -> Lb10
            r9.m0 = r4     // Catch: java.lang.Throwable -> Lb10
            r9.q0 = r6     // Catch: java.lang.Throwable -> Lb10
            r9.n0 = r14     // Catch: java.lang.Throwable -> Lb10
            r0 = r31
            r9.o0 = r0     // Catch: java.lang.Throwable -> Lb10
            r2 = r32
            r9.r0 = r2     // Catch: java.lang.Throwable -> Lb0d
            r9.p0 = r8     // Catch: java.lang.Throwable -> Lb0d
            r4 = 6
            r9.u0 = r4     // Catch: java.lang.Throwable -> Lb0d
            r4 = r41
            r7 = r10
            r6 = r28
            java.lang.Object r4 = r4.t(r5, r6, r7, r9)     // Catch: java.lang.Throwable -> Lb0d
            r10 = r30
            if (r4 != r10) goto La74
        La73:
            return r10
        La74:
            r19 = r0
            r0 = r3
            r9 = r5
            r4 = r14
            r14 = r1
            r3 = r2
        La7b:
            lc1 r1 = defpackage.lc1.a     // Catch: java.lang.Throwable -> Lb0b
            r18 = 1
            defpackage.lc1.e(r18)     // Catch: java.lang.Throwable -> Lb0b
            r11 = r3
            r13 = r4
            r4 = r9
            r2 = r14
            r14 = r15
            r15 = r19
            r12 = r20
            r3 = r0
            r0 = r25
        La8e:
            ak5 r0 = r0.e(r4, r14, r3, r12)     // Catch: java.lang.Throwable -> L7ae
            java.lang.String r1 = r4.name()     // Catch: java.lang.Throwable -> L7ae
            java.util.Locale r3 = java.util.Locale.US     // Catch: java.lang.Throwable -> L7ae
            r3.getClass()     // Catch: java.lang.Throwable -> L7ae
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch: java.lang.Throwable -> L7ae
            r1.getClass()     // Catch: java.lang.Throwable -> L7ae
            if (r2 == 0) goto Laa7
            r12 = r18
            goto Laa9
        Laa7:
            r12 = r16
        Laa9:
            java.lang.String r2 = r0.a     // Catch: java.lang.Throwable -> L7ae
            boolean r3 = r0.b     // Catch: java.lang.Throwable -> L7ae
            java.io.File r0 = r0.c     // Catch: java.lang.Throwable -> L7ae
            if (r0 == 0) goto Lab7
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L7ae
            if (r0 != 0) goto Labb
        Lab7:
            java.lang.String r0 = r14.getAbsolutePath()     // Catch: java.lang.Throwable -> L7ae
        Labb:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7ae
            r5 = r29
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r1)     // Catch: java.lang.Throwable -> L7ae
            r1 = r26
            r4.append(r1)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r12)     // Catch: java.lang.Throwable -> L7ae
            r14 = r24
            r4.append(r14)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r11)     // Catch: java.lang.Throwable -> L7ae
            java.lang.String r1 = " resumeMs="
            r4.append(r1)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r13)     // Catch: java.lang.Throwable -> L7ae
            r13 = r23
            r4.append(r13)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r15)     // Catch: java.lang.Throwable -> L7ae
            r12 = r22
            r4.append(r12)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r2)     // Catch: java.lang.Throwable -> L7ae
            r1 = r21
            r4.append(r1)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r3)     // Catch: java.lang.Throwable -> L7ae
            r1 = r35
            r4.append(r1)     // Catch: java.lang.Throwable -> L7ae
            r4.append(r0)     // Catch: java.lang.Throwable -> L7ae
            java.lang.String r0 = r4.toString()     // Catch: java.lang.Throwable -> L7ae
            r1 = r36
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L7ae
            if (r11 != 0) goto Lb0a
            goto L90e
        Lb0a:
            return r17
        Lb0b:
            r0 = move-exception
            goto Lb1c
        Lb0d:
            r0 = move-exception
        Lb0e:
            r3 = r2
            goto Lb1c
        Lb10:
            r0 = move-exception
            r2 = r32
            goto Lb0e
        Lb14:
            r0 = move-exception
            r2 = r11
            goto Lb0e
        Lb17:
            r0 = move-exception
            r11 = r42
            goto L7af
        Lb1c:
            if (r3 != 0) goto Lb26
            lc1 r1 = defpackage.lc1.a
            defpackage.lc1.e(r16)
            r27.resumeEmulation()
        Lb26:
            throw r0
    }

    public final java.lang.Object f(defpackage.sb1 r18, android.content.Intent r19, defpackage.s41 r20) {
            r17 = this;
            r0 = r18
            r1 = r20
            boolean r2 = r1 instanceof defpackage.ni5
            if (r2 == 0) goto L17
            r2 = r1
            ni5 r2 = (defpackage.ni5) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1e
        L17:
            ni5 r2 = new ni5
            r3 = r17
            r2.<init>(r3, r1)
        L1e:
            java.lang.Object r1 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            java.lang.String r5 = " uri="
            java.lang.String r7 = "DebugCommand"
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L3b
            if (r4 != r8) goto L35
            java.lang.String r0 = r2.R
            defpackage.oi2.Y(r1)
            goto Le0
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L3b:
            defpackage.oi2.Y(r1)
            java.lang.String r1 = "query"
            java.lang.String r4 = "value"
            java.lang.String[] r1 = new java.lang.String[]{r1, r4}
            r4 = r19
            java.lang.String r1 = d(r4, r1)
            if (r1 == 0) goto L5f
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L5f
            int r4 = r1.length()
            if (r4 <= 0) goto L5f
            goto L60
        L5f:
            r1 = r9
        L60:
            m55 r4 = r0.s
            java.lang.Object r4 = r4.get()
            kd6 r4 = (defpackage.kd6) r4
            ng6 r4 = (defpackage.ng6) r4
            android.net.Uri[] r4 = r4.r()
            int r10 = r4.length
            if (r1 != 0) goto L74
            java.lang.String r11 = ""
            goto L75
        L74:
            r11 = r1
        L75:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "action=dump_rom_search_state mode=release directoryCount="
            r12.<init>(r13)
            r12.append(r10)
            java.lang.String r10 = " query="
            r12.append(r10)
            r12.append(r11)
            java.lang.String r10 = r12.toString()
            android.util.Log.w(r7, r10)
            int r10 = r4.length
            r11 = 0
            r12 = 0
        L91:
            if (r11 >= r10) goto Lb2
            r13 = r4[r11]
            int r14 = r12 + 1
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r6 = "action=dump_rom_search_dir mode=release index="
            r15.<init>(r6)
            r15.append(r12)
            r15.append(r5)
            r15.append(r13)
            java.lang.String r6 = r15.toString()
            android.util.Log.w(r7, r6)
            int r11 = r11 + 1
            r12 = r14
            goto L91
        Lb2:
            if (r1 == 0) goto Lc1
            java.util.Locale r4 = java.util.Locale.US
            r4.getClass()
            java.lang.String r1 = r1.toLowerCase(r4)
            r1.getClass()
            goto Lc2
        Lc1:
            r1 = r9
        Lc2:
            m55 r0 = r0.x
            java.lang.Object r0 = r0.get()
            p06 r0 = (defpackage.p06) r0
            xb2 r0 = (defpackage.xb2) r0
            g21 r0 = r0.o()
            r2.R = r1
            r2.Z = r8
            java.lang.Object r0 = defpackage.f04.B(r0, r2)
            if (r0 != r3) goto Ldb
            return r3
        Ldb:
            r16 = r1
            r1 = r0
            r0 = r16
        Le0:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            ev r1 = defpackage.gt0.B0(r1)
            c70 r2 = new c70
            r3 = 13
            r2.<init>(r0, r3)
            pc2 r0 = new pc2
            r0.<init>(r1, r8, r2)
            boolean r1 = r0 instanceof defpackage.qp1
            if (r1 == 0) goto Lfd
            qp1 r0 = (defpackage.qp1) r0
            qb6 r0 = r0.take()
            goto L103
        Lfd:
            xy6 r1 = new xy6
            r1.<init>(r0)
            r0 = r1
        L103:
            java.util.List r0 = defpackage.sb6.c0(r0)
            int r1 = r0.size()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "action=dump_rom_search_matches mode=release count="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.util.Log.w(r7, r1)
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
        L121:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16e
            java.lang.Object r1 = r0.next()
            int r2 = r6 + 1
            if (r6 < 0) goto L16a
            pq5 r1 = (defpackage.pq5) r1
            java.lang.String r3 = r1.a
            java.lang.String r4 = r1.c
            android.net.Uri r8 = r1.d
            android.net.Uri r1 = r1.e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "action=dump_rom_search_match mode=release index="
            r10.<init>(r11)
            r10.append(r6)
            java.lang.String r6 = " name="
            r10.append(r6)
            r10.append(r3)
            java.lang.String r3 = " fileName="
            r10.append(r3)
            r10.append(r4)
            r10.append(r5)
            r10.append(r8)
            java.lang.String r3 = " parentTreeUri="
            r10.append(r3)
            r10.append(r1)
            java.lang.String r1 = r10.toString()
            android.util.Log.w(r7, r1)
            r6 = r2
            goto L121
        L16a:
            defpackage.hf.q0()
            throw r9
        L16e:
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public final java.lang.Object g(android.content.Context r17, android.content.Intent r18, defpackage.s41 r19) {
            r16 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.oi5
            if (r3 == 0) goto L1a
            r3 = r2
            oi5 r3 = (defpackage.oi5) r3
            int r4 = r3.f0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1a
            int r4 = r4 - r5
            r3.f0 = r4
        L18:
            r8 = r3
            goto L22
        L1a:
            oi5 r3 = new oi5
            r4 = r16
            r3.<init>(r4, r2)
            goto L18
        L22:
            java.lang.Object r2 = r8.d0
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r8.f0
            r4 = 0
            r10 = 0
            r11 = 1
            if (r3 == 0) goto L42
            if (r3 != r11) goto L3c
            int r0 = r8.Y
            boolean r1 = r8.Z
            int r3 = r8.X
            android.net.Uri r4 = r8.R
            defpackage.oi2.Y(r2)
            goto L10c
        L3c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r4
        L42:
            defpackage.oi2.Y(r2)
            android.net.Uri r2 = r0.getData()
            if (r2 != 0) goto L63
            java.lang.String r2 = "uri"
            java.lang.String r3 = "path"
            java.lang.String r5 = "rom_uri"
            java.lang.String[] r2 = new java.lang.String[]{r5, r2, r3}
            java.lang.String r2 = d(r0, r2)
            if (r2 == 0) goto L60
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L61
        L60:
            r2 = r4
        L61:
            if (r2 == 0) goto L65
        L63:
            r12 = r2
            goto L6b
        L65:
            java.lang.String r0 = "Missing ROM URI. Provide intent data or rom_uri."
            defpackage.i.h(r0)
            return r4
        L6b:
            java.lang.String r2 = "wait_rom_ready"
            java.lang.String r3 = "wait_ready"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.Boolean r2 = b(r0, r2)
            if (r2 == 0) goto L7f
            boolean r2 = r2.booleanValue()
            r13 = r2
            goto L80
        L7f:
            r13 = r10
        L80:
            java.lang.String r2 = "pause_after"
            boolean r14 = r0.getBooleanExtra(r2, r10)
            java.lang.String r2 = "wait_timeout_ms"
            java.lang.String r3 = "timeout_ms"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            java.lang.Integer r0 = c(r0, r2)
            if (r0 == 0) goto L9d
            int r0 = r0.intValue()
            if (r0 >= r11) goto L9b
            r0 = r11
        L9b:
            r15 = r0
            goto La0
        L9d:
            r0 = 8000(0x1f40, float:1.121E-41)
            goto L9b
        La0:
            if (r13 == 0) goto Laa
            lc1 r0 = defpackage.lc1.a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            defpackage.lc1.d = r0
        Laa:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<me.magnum.melonds.ui.emulator.EmulatorActivity> r2 = me.magnum.melonds.ui.emulator.EmulatorActivity.class
            r0.<init>(r1, r2)
            java.lang.String r2 = "LAUNCH_ROM"
            java.lang.String r2 = a(r1, r2)
            r0.setAction(r2)
            r0.setData(r12)
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r0.addFlags(r2)
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r0.addFlags(r2)
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r0.addFlags(r2)
            android.app.ActivityOptions r2 = android.app.ActivityOptions.makeBasic()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 34
            if (r3 < r4) goto Le3
            r4 = 36
            if (r3 < r4) goto Ldc
            r3 = 3
            goto Ldd
        Ldc:
            r3 = r11
        Ldd:
            defpackage.rv2.k(r2, r3)
            defpackage.rv2.p(r2, r3)
        Le3:
            r3 = 201326592(0xc000000, float:9.8607613E-32)
            android.app.PendingIntent r0 = android.app.PendingIntent.getActivity(r1, r11, r0, r3)
            r6 = 0
            android.os.Bundle r7 = r2.toBundle()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.send(r1, r2, r3, r4, r5, r6, r7)
            r8.R = r12
            r8.X = r13
            r8.Z = r14
            r8.Y = r15
            r8.f0 = r11
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = defpackage.q60.t(r0, r8)
            if (r0 != r9) goto L108
            return r9
        L108:
            r4 = r12
            r3 = r13
            r1 = r14
            r0 = r15
        L10c:
            lc1 r2 = defpackage.lc1.a
            java.lang.ref.WeakReference r2 = defpackage.lc1.b
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L118
            r2 = r11
            goto L119
        L118:
            r2 = r10
        L119:
            boolean r5 = defpackage.lc1.a()
            if (r5 == 0) goto L132
            if (r3 == 0) goto L132
            me.magnum.melonds.MelonEmulator r6 = me.magnum.melonds.MelonEmulator.a
            if (r1 == 0) goto L12c
            defpackage.lc1.e(r11)
            r6.pauseEmulation()
            goto L132
        L12c:
            defpackage.lc1.e(r10)
            r6.resumeEmulation()
        L132:
            if (r3 == 0) goto L135
            r10 = r11
        L135:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r6 = "action=launch_rom mode=release uri="
            r3.<init>(r6)
            r3.append(r4)
            java.lang.String r4 = " waitReady="
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " activitySeen="
            r3.append(r4)
            java.lang.String r4 = " ready="
            java.lang.String r6 = " pauseAfter="
            defpackage.lb1.x(r3, r2, r4, r5, r6)
            r3.append(r1)
            java.lang.String r1 = " requestedTimeoutMs="
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = " deferredReady=1"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r1 = "DebugCommand"
            android.util.Log.w(r1, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public final java.lang.Object h(android.content.Context r11, defpackage.sb1 r12, android.content.Intent r13, defpackage.s41 r14) {
            r10 = this;
            me.magnum.melonds.MelonEmulator r1 = me.magnum.melonds.MelonEmulator.a
            boolean r0 = r14 instanceof defpackage.pi5
            if (r0 == 0) goto L16
            r0 = r14
            pi5 r0 = (defpackage.pi5) r0
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
            pi5 r0 = new pi5
            r0.<init>(r10, r14)
            goto L14
        L1c:
            java.lang.Object r14 = r7.X
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r7.Z
            r8 = 0
            r9 = 1
            if (r2 == 0) goto L34
            if (r2 != r9) goto L2e
            android.content.Intent r13 = r7.R
            defpackage.oi2.Y(r14)
            goto L48
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r8
        L34:
            defpackage.oi2.Y(r14)
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
            lc1 r12 = defpackage.lc1.a
            long r12 = defpackage.lc1.e
            r1.pauseEmulation()
            boolean r0 = r1.c(r14)     // Catch: java.lang.Throwable -> L9e
            long r2 = defpackage.lc1.e
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 == 0) goto L6c
            boolean r11 = defpackage.lc1.c
            if (r11 != 0) goto L78
            r1.resumeEmulation()
            goto L78
        L6c:
            if (r10 == 0) goto L72
            defpackage.lc1.e(r9)
            goto L78
        L72:
            defpackage.lc1.e(r11)
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
            jg7 r10 = defpackage.jg7.a
            return r10
        L9e:
            r0 = move-exception
            r14 = r0
            lc1 r0 = defpackage.lc1.a
            long r2 = defpackage.lc1.e
            int r12 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r12 == 0) goto Lb0
            boolean r10 = defpackage.lc1.c
            if (r10 != 0) goto Lbc
            r1.resumeEmulation()
            goto Lbc
        Lb0:
            if (r10 == 0) goto Lb6
            defpackage.lc1.e(r9)
            goto Lbc
        Lb6:
            defpackage.lc1.e(r11)
            r1.resumeEmulation()
        Lbc:
            throw r14
        Lbd:
            java.lang.String r10 = "Missing load target. Provide slot or path."
            defpackage.i.h(r10)
            return r8
    }

    public final java.lang.Object i(android.content.Intent r19, defpackage.s41 r20) {
            r18 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r1 instanceof defpackage.qi5
            if (r2 == 0) goto L17
            r2 = r1
            qi5 r2 = (defpackage.qi5) r2
            int r3 = r2.o0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.o0 = r3
            goto L1e
        L17:
            qi5 r2 = new qi5
            r3 = r18
            r2.<init>(r3, r1)
        L1e:
            java.lang.Object r1 = r2.m0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.o0
            me.magnum.melonds.MelonEmulator r5 = me.magnum.melonds.MelonEmulator.a
            r6 = 2
            r8 = 1
            if (r4 == 0) goto L84
            if (r4 == r8) goto L57
            if (r4 != r6) goto L4f
            int r0 = r2.j0
            int r4 = r2.i0
            int r10 = r2.h0
            int r11 = r2.g0
            int r12 = r2.f0
            int r13 = r2.e0
            int r14 = r2.d0
            int r15 = r2.Z
            java.util.Iterator r6 = r2.X
            r20 = 0
            java.util.List r9 = r2.R
            defpackage.oi2.Y(r1)
            r17 = r5
            r1 = r15
            r15 = r3
            r3 = r2
            r2 = 2
            goto L1c3
        L4f:
            r20 = 0
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r20
        L57:
            r20 = 0
            int r0 = r2.l0
            int r4 = r2.k0
            int r6 = r2.j0
            int r9 = r2.i0
            int r10 = r2.h0
            int r11 = r2.g0
            int r12 = r2.f0
            int r13 = r2.e0
            int r14 = r2.d0
            int r15 = r2.Z
            b63 r8 = r2.Y
            java.util.Iterator r7 = r2.X
            r19 = r0
            java.util.List r0 = r2.R
            defpackage.oi2.Y(r1)
            r1 = r12
            r12 = r0
            r0 = r6
            r6 = r7
            r7 = r1
            r1 = r15
            r15 = r3
            r3 = r2
            r2 = r19
            goto L176
        L84:
            r20 = 0
            defpackage.oi2.Y(r1)
            java.lang.String r1 = "input"
            java.lang.String r4 = "value"
            java.lang.String r6 = "inputs"
            java.lang.String[] r1 = new java.lang.String[]{r6, r1, r4}
            java.lang.String r1 = d(r0, r1)
            if (r1 == 0) goto L233
            java.lang.String r4 = "duration_ms"
            java.lang.String[] r4 = new java.lang.String[]{r4}
            java.lang.Integer r4 = c(r0, r4)
            r6 = 80
            if (r4 == 0) goto Lac
            int r4 = r4.intValue()
            goto Lad
        Lac:
            r4 = r6
        Lad:
            r7 = 2000(0x7d0, float:2.803E-42)
            r8 = 0
            int r4 = defpackage.gi2.q(r4, r8, r7)
            java.lang.String r9 = "gap_ms"
            java.lang.String r10 = "delay_ms"
            java.lang.String[] r9 = new java.lang.String[]{r9, r10}
            java.lang.Integer r9 = c(r0, r9)
            if (r9 == 0) goto Lc6
            int r6 = r9.intValue()
        Lc6:
            int r6 = defpackage.gi2.q(r6, r8, r7)
            java.lang.String r7 = "repeat"
            java.lang.String r8 = "count"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8}
            java.lang.Integer r0 = c(r0, r7)
            if (r0 == 0) goto Ldd
            int r0 = r0.intValue()
            goto Lde
        Ldd:
            r0 = 1
        Lde:
            r7 = 100
            r8 = 1
            int r0 = defpackage.gi2.q(r0, r8, r7)
            r7 = 4
            char[] r7 = new char[r7]
            r7 = {x023c: FILL_ARRAY_DATA  , data: [44, 43, 32, 59} // fill-array
            r8 = 6
            java.util.List r7 = defpackage.qs6.J0(r1, r7, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        Lf9:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L10f
            java.lang.Object r9 = r7.next()
            java.lang.String r9 = (java.lang.String) r9
            b63 r9 = o(r9)
            if (r9 == 0) goto Lf9
            r8.add(r9)
            goto Lf9
        L10f:
            boolean r7 = r8.isEmpty()
            if (r7 != 0) goto L228
            r9 = r8
            r8 = 0
        L117:
            if (r8 >= r0) goto L1e9
            java.util.Iterator r1 = r9.iterator()
            r7 = r6
            r12 = r9
            r10 = 0
            r11 = 0
            r6 = r4
            r9 = r8
            r4 = 0
        L124:
            boolean r13 = r1.hasNext()
            if (r13 == 0) goto L1da
            java.lang.Object r13 = r1.next()
            int r14 = r4 + 1
            if (r4 < 0) goto L1d5
            b63 r13 = (defpackage.b63) r13
            r5.d(r13)
            r15 = r3
            r19 = r4
            long r3 = (long) r6
            r2.R = r12
            r2.X = r1
            r2.Y = r13
            r2.Z = r6
            r2.d0 = r7
            r2.e0 = r0
            r2.f0 = r8
            r2.g0 = r9
            r2.h0 = r10
            r2.i0 = r11
            r2.j0 = r14
            r16 = r0
            r0 = r19
            r2.k0 = r0
            r19 = r1
            r1 = 0
            r2.l0 = r1
            r1 = 1
            r2.o0 = r1
            java.lang.Object r3 = defpackage.q60.t(r3, r2)
            if (r3 != r15) goto L167
            goto L1bd
        L167:
            r1 = r11
            r11 = r9
            r9 = r1
            r4 = r0
            r3 = r2
            r1 = r6
            r0 = r14
            r2 = 0
            r6 = r19
            r14 = r7
            r7 = r8
            r8 = r13
            r13 = r16
        L176:
            r5.e(r8)
            int r8 = r13 + (-1)
            if (r11 != r8) goto L183
            int r8 = defpackage.hf.U(r12)
            if (r4 == r8) goto L187
        L183:
            r8 = r4
            r17 = r5
            goto L195
        L187:
            r2 = r6
            r6 = r1
            r1 = r2
            r2 = r11
            r11 = r9
            r9 = r2
            r17 = r5
            r8 = r7
            r2 = 2
            r4 = r0
            r0 = r13
            r7 = r14
            goto L1cd
        L195:
            long r4 = (long) r14
            r3.R = r12
            r3.X = r6
            r16 = r6
            r6 = r20
            r3.Y = r6
            r3.Z = r1
            r3.d0 = r14
            r3.e0 = r13
            r3.f0 = r7
            r3.g0 = r11
            r3.h0 = r10
            r3.i0 = r9
            r3.j0 = r0
            r3.k0 = r8
            r3.l0 = r2
            r2 = 2
            r3.o0 = r2
            java.lang.Object r4 = defpackage.q60.t(r4, r3)
            if (r4 != r15) goto L1be
        L1bd:
            return r15
        L1be:
            r4 = r9
            r9 = r12
            r6 = r16
            r12 = r7
        L1c3:
            r7 = r6
            r6 = r1
            r1 = r7
            r8 = r12
            r12 = r9
            r9 = r11
            r11 = r4
            r7 = r14
            r4 = r0
            r0 = r13
        L1cd:
            r2 = r3
            r3 = r15
            r5 = r17
            r20 = 0
            goto L124
        L1d5:
            defpackage.hf.q0()
            r6 = 0
            throw r6
        L1da:
            r16 = r0
            r15 = r3
            r17 = r5
            r1 = 2
            int r8 = r8 + 1
            r4 = r6
            r6 = r7
            r9 = r12
            r20 = 0
            goto L117
        L1e9:
            dv4 r13 = new dv4
            r1 = 19
            r13.<init>(r1)
            r14 = 30
            java.lang.String r10 = ","
            r11 = 0
            r12 = 0
            java.lang.String r1 = defpackage.gt0.P0(r9, r10, r11, r12, r13, r14)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "action=press_input mode=release inputs="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " repeat="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " durationMs="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = " gapMs="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "DebugCommand"
            android.util.Log.w(r1, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L228:
            java.lang.String r0 = "No supported inputs in "
            java.lang.String r0 = r0.concat(r1)
            defpackage.i.f(r0)
            r6 = 0
            return r6
        L233:
            r6 = r20
            java.lang.String r0 = "Missing input extra"
            defpackage.i.h(r0)
            return r6
    }

    public final java.lang.Object j(android.content.Context r10, defpackage.sb1 r11, android.content.Intent r12, defpackage.s41 r13) {
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ri5
            if (r0 == 0) goto L14
            r0 = r13
            ri5 r0 = (defpackage.ri5) r0
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
            ri5 r0 = new ri5
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.X
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Z
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L32
            if (r1 != r8) goto L2c
            android.content.Intent r12 = r6.R
            defpackage.oi2.Y(r13)
            goto L46
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r7
        L32:
            defpackage.oi2.Y(r13)
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
            lc1 r10 = defpackage.lc1.a
            defpackage.lc1.e(r8)
            goto L6a
        L62:
            lc1 r0 = defpackage.lc1.a
            defpackage.lc1.e(r10)
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
            jg7 r9 = defpackage.jg7.a
            return r9
        L90:
            r0 = move-exception
            r12 = r0
            if (r9 == 0) goto L9a
            lc1 r9 = defpackage.lc1.a
            defpackage.lc1.e(r8)
            goto La2
        L9a:
            lc1 r9 = defpackage.lc1.a
            defpackage.lc1.e(r10)
            r11.resumeEmulation()
        La2:
            throw r12
        La3:
            java.lang.String r9 = "Missing save target. Provide slot or path."
            defpackage.i.h(r9)
            return r7
    }

    public final java.lang.Object k(defpackage.sb1 r29, android.content.Intent r30, defpackage.s41 r31) {
            r28 = this;
            r0 = r29
            r1 = r30
            r2 = r31
            boolean r3 = r2 instanceof defpackage.si5
            if (r3 == 0) goto L19
            r3 = r2
            si5 r3 = (defpackage.si5) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e0 = r4
            goto L20
        L19:
            si5 r3 = new si5
            r4 = r28
            r3.<init>(r4, r2)
        L20:
            java.lang.Object r2 = r3.Z
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.e0
            r6 = 0
            r7 = 1
            if (r5 == 0) goto L3f
            if (r5 != r7) goto L39
            u26 r0 = r3.Y
            android.net.Uri r1 = r3.X
            sb1 r3 = r3.R
            defpackage.oi2.Y(r2)
            r9 = r0
            r0 = r3
            goto Le7
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r6
        L3f:
            defpackage.oi2.Y(r2)
            android.net.Uri r2 = r1.getData()
            if (r2 != 0) goto L67
            java.lang.String r2 = "uri"
            java.lang.String r5 = "path"
            java.lang.String r8 = "rom_uri"
            java.lang.String[] r2 = new java.lang.String[]{r8, r2, r5}
            java.lang.String r2 = d(r1, r2)
            if (r2 == 0) goto L5d
            android.net.Uri r2 = android.net.Uri.parse(r2)
            goto L5e
        L5d:
            r2 = r6
        L5e:
            if (r2 == 0) goto L61
            goto L67
        L61:
            java.lang.String r0 = "Missing ROM URI. Provide intent data or rom_uri."
            defpackage.i.h(r0)
            return r6
        L67:
            java.lang.String r5 = "console"
            java.lang.String r8 = "value"
            java.lang.String r9 = "runtime_console"
            java.lang.String[] r5 = new java.lang.String[]{r9, r5, r8}
            java.lang.String r1 = d(r1, r5)
            if (r1 == 0) goto L14f
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            java.util.Locale r5 = java.util.Locale.US
            r5.getClass()
            java.lang.String r1 = r1.toLowerCase(r5)
            r1.getClass()
            int r5 = r1.hashCode()
            switch(r5) {
                case -1243020381: goto Lbd;
                case 3215: goto Lb1;
                case 99770: goto La5;
                case 108925: goto L9c;
                case 1544803905: goto L93;
                default: goto L92;
            }
        L92:
            goto Lc5
        L93:
            java.lang.String r5 = "default"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lc7
            goto Lc5
        L9c:
            java.lang.String r5 = "nds"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lba
            goto Lc5
        La5:
            java.lang.String r5 = "dsi"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lae
            goto Lc5
        Lae:
            u26 r1 = defpackage.u26.DSi
            goto Lc9
        Lb1:
            java.lang.String r5 = "ds"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lba
            goto Lc5
        Lba:
            u26 r1 = defpackage.u26.DS
            goto Lc9
        Lbd:
            java.lang.String r5 = "global"
            boolean r1 = r1.equals(r5)
            if (r1 != 0) goto Lc7
        Lc5:
            r1 = r6
            goto Lc9
        Lc7:
            u26 r1 = defpackage.u26.DEFAULT
        Lc9:
            if (r1 == 0) goto L149
            m55 r5 = r0.x
            java.lang.Object r5 = r5.get()
            p06 r5 = (defpackage.p06) r5
            r3.R = r0
            r3.X = r2
            r3.Y = r1
            r3.e0 = r7
            xb2 r5 = (defpackage.xb2) r5
            java.lang.Object r3 = r5.l(r2, r3)
            if (r3 != r4) goto Le4
            return r4
        Le4:
            r9 = r1
            r1 = r2
            r2 = r3
        Le7:
            pq5 r2 = (defpackage.pq5) r2
            if (r2 == 0) goto L11e
            m55 r0 = r0.x
            java.lang.Object r0 = r0.get()
            p06 r0 = (defpackage.p06) r0
            jt5 r8 = r2.f
            r26 = 0
            r27 = 262142(0x3fffe, float:3.67339E-40)
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
            jt5 r3 = defpackage.jt5.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            xb2 r0 = (defpackage.xb2) r0
            r0.B(r2, r3)
            goto L11f
        L11e:
            r7 = 0
        L11f:
            java.lang.String r0 = r9.name()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "action=set_rom_runtime_console mode=release uri="
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " runtimeConsole="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = " updated="
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "DebugCommand"
            android.util.Log.w(r1, r0)
            jg7 r0 = defpackage.jg7.a
            return r0
        L149:
            java.lang.String r0 = "Unsupported runtime console"
            defpackage.i.h(r0)
            return r6
        L14f:
            java.lang.String r0 = "Missing runtime console extra"
            defpackage.i.h(r0)
            return r6
    }

    public final java.lang.Object l(defpackage.sb1 r13, android.content.Intent r14, defpackage.s41 r15) {
            r12 = this;
            boolean r0 = r15 instanceof defpackage.ti5
            if (r0 == 0) goto L14
            r0 = r15
            ti5 r0 = (defpackage.ti5) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ti5 r0 = new ti5
            r0.<init>(r12, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.d0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.f0
            me.magnum.melonds.MelonEmulator r8 = me.magnum.melonds.MelonEmulator.a
            r9 = 0
            r10 = 2
            r11 = 1
            if (r1 == 0) goto L4f
            if (r1 == r11) goto L3d
            if (r1 != r10) goto L36
            int r12 = r6.Z
            int r13 = r6.X
            me.magnum.melonds.domain.model.VideoRenderer r14 = r6.R
            defpackage.oi2.Y(r15)
            goto Ld5
        L36:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L3d:
            int r13 = r6.Z
            int r14 = r6.Y
            int r1 = r6.X
            me.magnum.melonds.domain.model.VideoRenderer r2 = r6.R
            defpackage.oi2.Y(r15)
            r7 = r1
            r1 = r12
            r12 = r13
            r13 = r7
            r7 = r6
            goto Lb8
        L4f:
            defpackage.oi2.Y(r15)
            java.lang.String r15 = "frames"
            java.lang.String r1 = "value"
            java.lang.String r2 = "step_frames"
            java.lang.String[] r15 = new java.lang.String[]{r2, r15, r1}
            java.lang.Integer r15 = c(r14, r15)
            if (r15 == 0) goto L6b
            int r15 = r15.intValue()
            if (r15 >= r11) goto L69
            r15 = r11
        L69:
            r4 = r15
            goto L6c
        L6b:
            r4 = r11
        L6c:
            java.lang.String r15 = "duration_ms"
            java.lang.String r1 = "resume_ms"
            java.lang.String r2 = "timeout_ms"
            java.lang.String[] r15 = new java.lang.String[]{r2, r15, r1}
            java.lang.Integer r14 = c(r14, r15)
            if (r14 == 0) goto L84
            int r14 = r14.intValue()
            if (r14 >= r11) goto L86
            r14 = r11
            goto L86
        L84:
            r14 = 5000(0x1388, float:7.006E-42)
        L86:
            m55 r13 = r13.s
            java.lang.Object r13 = r13.get()
            kd6 r13 = (defpackage.kd6) r13
            ng6 r13 = (defpackage.ng6) r13
            me.magnum.melonds.domain.model.VideoRenderer r2 = r13.e()
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r13 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r3 = r13.getCurrentFrameIndexForDebug()
            lc1 r13 = defpackage.lc1.a
            defpackage.lc1.e(r9)
            r8.resumeEmulation()
            r7 = r6
            long r5 = (long) r14
            r7.R = r2
            r7.X = r4
            r7.Y = r14
            r7.Z = r3
            r7.f0 = r11
            r1 = r12
            java.lang.Object r12 = r1.s(r2, r3, r4, r5, r7)
            if (r12 != r0) goto Lb6
            goto Ld3
        Lb6:
            r12 = r3
            r13 = r4
        Lb8:
            r8.pauseEmulation()
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r15 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r3 = r15.getCurrentFrameIndexForDebug()
            long r4 = (long) r14
            r7.R = r2
            r7.X = r13
            r7.Y = r14
            r7.Z = r12
            r7.f0 = r10
            r6 = r7
            java.lang.Object r14 = r1.t(r2, r3, r4, r6)
            if (r14 != r0) goto Ld4
        Ld3:
            return r0
        Ld4:
            r14 = r2
        Ld5:
            lc1 r15 = defpackage.lc1.a
            defpackage.lc1.e(r11)
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r15 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r0 = r15.getCurrentFrameIndexForDebug()
            me.magnum.melonds.domain.model.VideoRenderer r1 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r14 != r1) goto Lea
            boolean r15 = r15.isCurrentFrameReadyForDebug()
            if (r15 == 0) goto Leb
        Lea:
            r9 = r11
        Leb:
            java.lang.String r14 = r14.name()
            java.util.Locale r15 = java.util.Locale.US
            r15.getClass()
            java.lang.String r14 = r14.toLowerCase(r15)
            r14.getClass()
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r1 = "action=step_frame mode=release renderer="
            r15.<init>(r1)
            r15.append(r14)
            java.lang.String r14 = " frames="
            r15.append(r14)
            r15.append(r13)
            java.lang.String r13 = " startFrame="
            r15.append(r13)
            java.lang.String r13 = " endFrame="
            java.lang.String r14 = " ready="
            defpackage.lb1.x(r15, r12, r13, r0, r14)
            r15.append(r9)
            java.lang.String r12 = r15.toString()
            java.lang.String r13 = "DebugCommand"
            android.util.Log.w(r13, r12)
            jg7 r12 = defpackage.jg7.a
            return r12
    }

    public final java.lang.Object m(android.content.Intent r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ui5
            if (r0 == 0) goto L13
            r0 = r8
            ui5 r0 = (defpackage.ui5) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            ui5 r0 = new ui5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.Z
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.e0
            me.magnum.melonds.MelonEmulator r2 = me.magnum.melonds.MelonEmulator.a
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L30
            int r7 = r0.Y
            int r8 = r0.X
            int r0 = r0.R
            defpackage.oi2.Y(r6)
            goto La6
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            r6 = 0
            return r6
        L37:
            defpackage.oi2.Y(r6)
            java.lang.String r6 = "value_x"
            java.lang.String r1 = "value"
            java.lang.String r4 = "x"
            java.lang.String[] r6 = new java.lang.String[]{r4, r6, r1}
            java.lang.Integer r6 = c(r7, r6)
            r1 = 0
            if (r6 == 0) goto L56
            int r6 = r6.intValue()
            r4 = 255(0xff, float:3.57E-43)
            int r6 = defpackage.gi2.q(r6, r1, r4)
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
            int r1 = defpackage.gi2.q(r4, r1, r5)
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
            int r7 = defpackage.gi2.q(r7, r3, r4)
            b63 r4 = defpackage.b63.TOUCHSCREEN
            r2.d(r4)
            r2.onScreenTouch(r6, r1)
            long r4 = (long) r7
            r0.R = r6
            r0.X = r1
            r0.Y = r7
            r0.e0 = r3
            java.lang.Object r0 = defpackage.q60.t(r4, r0)
            if (r0 != r8) goto La4
            return r8
        La4:
            r0 = r6
            r8 = r1
        La6:
            b63 r6 = defpackage.b63.TOUCHSCREEN
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
            jg7 r6 = defpackage.jg7.a
            return r6
    }

    public final java.lang.Object n(android.content.Intent r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vi5
            if (r0 == 0) goto L13
            r0 = r9
            vi5 r0 = (defpackage.vi5) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            vi5 r0 = new vi5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.Z
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.e0
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2e
            int r8 = r0.Y
            int r9 = r0.X
            boolean r0 = r0.R
            defpackage.oi2.Y(r7)
            goto L72
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L35:
            defpackage.oi2.Y(r7)
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
            lc1 r4 = defpackage.lc1.a
            long r5 = (long) r1
            r0.R = r7
            r0.X = r8
            r0.Y = r1
            r0.e0 = r3
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
            defpackage.lc1.e(r3)
            r1.pauseEmulation()
            goto L8b
        L85:
            defpackage.lc1.e(r2)
            r1.resumeEmulation()
        L8b:
            java.lang.String r1 = " pauseAfter="
            java.lang.String r2 = " timeoutMs="
            java.lang.String r3 = "action=wait_rom_ready mode=release ready="
            java.lang.StringBuilder r7 = defpackage.i61.q(r7, r0, r3, r1, r2)
            r7.append(r8)
            java.lang.String r8 = " requestedTimeoutMs="
            r7.append(r8)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "DebugCommand"
            android.util.Log.w(r8, r7)
            jg7 r7 = defpackage.jg7.a
            return r7
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context r8, android.content.Intent r9) {
            r7 = this;
            r8.getClass()
            r9.getClass()
            android.content.BroadcastReceiver$PendingResult r2 = r7.goAsync()
            l5 r0 = new l5
            r5 = 0
            r6 = 27
            r3 = r7
            r4 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7 = 3
            o41 r8 = me.magnum.melonds.debug.ReleaseStateCommandReceiver.a
            r9 = 0
            defpackage.hv.L(r8, r9, r9, r0, r7)
            return
    }

    public final java.lang.Comparable p(android.content.Context r13, android.content.Intent r14, defpackage.s41 r15) {
            r12 = this;
            boolean r0 = r15 instanceof defpackage.wi5
            if (r0 == 0) goto L13
            r0 = r15
            wi5 r0 = (defpackage.wi5) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            wi5 r0 = new wi5
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r12 = r0.Y
            x61 r15 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.d0
            r2 = 0
            java.lang.String r3 = "last_rom_uri"
            r4 = 0
            java.lang.String r5 = "debug_command_state"
            r6 = 1
            if (r1 == 0) goto L3a
            if (r1 != r6) goto L34
            long r13 = r0.X
            android.content.Context r1 = r0.R
            defpackage.oi2.Y(r12)
            r11 = r1
            r1 = r0
            r0 = r11
            goto L8c
        L34:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r2
        L3a:
            defpackage.oi2.Y(r12)
            java.lang.String r12 = "rom_uri"
            java.lang.String[] r12 = new java.lang.String[]{r12}
            java.lang.String r12 = d(r14, r12)
            if (r12 == 0) goto L4e
            android.net.Uri r12 = android.net.Uri.parse(r12)
            return r12
        L4e:
            lc1 r12 = defpackage.lc1.a
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
            r1.d0 = r6
            r7 = 100
            java.lang.Object r12 = defpackage.q60.t(r7, r1)
            if (r12 != r15) goto L8c
            return r15
        L8c:
            lc1 r12 = defpackage.lc1.a
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
    }

    public final java.lang.Comparable q(android.content.Context r17, defpackage.gc1 r18, android.content.Intent r19, boolean r20, defpackage.s41 r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = r21
            boolean r3 = r2 instanceof defpackage.xi5
            if (r3 == 0) goto L19
            r3 = r2
            xi5 r3 = (defpackage.xi5) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e0 = r4
            goto L1e
        L19:
            xi5 r3 = new xi5
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.Z
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.e0
            r6 = 2
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L48
            if (r5 == r7) goto L3e
            if (r5 != r6) goto L38
            int r0 = r3.Y
            boolean r1 = r3.X
            gc1 r3 = r3.R
            defpackage.oi2.Y(r2)
            goto Lc7
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L3e:
            int r0 = r3.Y
            boolean r1 = r3.X
            gc1 r5 = r3.R
            defpackage.oi2.Y(r2)
            goto La5
        L48:
            defpackage.oi2.Y(r2)
            java.lang.String r2 = "path"
            java.lang.String r5 = "uri"
            java.lang.String[] r2 = new java.lang.String[]{r2, r5}
            java.lang.String r2 = d(r1, r2)
            if (r2 == 0) goto L74
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L6c
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r0.getClass()
            return r0
        L6c:
            android.net.Uri r0 = android.net.Uri.parse(r2)
            r0.getClass()
            return r0
        L74:
            java.lang.String r2 = "slot"
            java.lang.String r5 = "value"
            java.lang.String[] r2 = new java.lang.String[]{r2, r5}
            java.lang.Integer r2 = c(r1, r2)
            if (r2 == 0) goto L260
            int r2 = r2.intValue()
            if (r2 < 0) goto L257
            r5 = 9
            if (r2 >= r5) goto L257
            r5 = r18
            r3.R = r5
            r9 = r20
            r3.X = r9
            r3.Y = r2
            r3.e0 = r7
            r10 = r17
            java.lang.Comparable r0 = r0.p(r10, r1, r3)
            if (r0 != r4) goto La1
            goto Lc5
        La1:
            r1 = r2
            r2 = r0
            r0 = r1
            r1 = r9
        La5:
            android.net.Uri r2 = (android.net.Uri) r2
            if (r2 != 0) goto Lab
            goto L260
        Lab:
            sb1 r5 = (defpackage.sb1) r5
            m55 r9 = r5.x
            java.lang.Object r9 = r9.get()
            p06 r9 = (defpackage.p06) r9
            r3.R = r5
            r3.X = r1
            r3.Y = r0
            r3.e0 = r6
            xb2 r9 = (defpackage.xb2) r9
            java.lang.Object r2 = r9.l(r2, r3)
            if (r2 != r4) goto Lc6
        Lc5:
            return r4
        Lc6:
            r3 = r5
        Lc7:
            pq5 r2 = (defpackage.pq5) r2
            if (r2 != 0) goto Lcd
            goto L260
        Lcd:
            sb1 r3 = (defpackage.sb1) r3
            m55 r3 = r3.D
            java.lang.Object r3 = r3.get()
            yb2 r3 = (defpackage.yb2) r3
            c46 r4 = new c46
            r5 = 0
            r6 = 48
            r9 = 1
            r10 = 0
            r17 = r0
            r16 = r4
            r20 = r5
            r21 = r6
            r18 = r9
            r19 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            android.net.Uri r3 = r3.b(r2, r4)
            if (r1 != 0) goto Lf5
            goto L232
        Lf5:
            java.lang.String r1 = r2.c
            java.lang.String r2 = r3.getScheme()
            java.lang.String r4 = "file"
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 != 0) goto L105
            goto L230
        L105:
            java.lang.String r2 = r3.getPath()
            if (r2 != 0) goto L10d
            goto L230
        L10d:
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            boolean r2 = r4.exists()
            r5 = 0
            if (r2 == 0) goto L124
            long r9 = r4.length()
            int r2 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r2 <= 0) goto L124
            goto L230
        L124:
            java.io.File r2 = r4.getParentFile()
            if (r2 == 0) goto L230
            boolean r4 = r2.exists()
            if (r4 == 0) goto L137
            boolean r4 = r2.isDirectory()
            if (r4 == 0) goto L137
            goto L138
        L137:
            r2 = r8
        L138:
            if (r2 == 0) goto L230
            r4 = 46
            java.lang.String r1 = defpackage.qs6.R0(r4, r1, r1)
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 != 0) goto L150
            goto L230
        L150:
            java.lang.CharSequence r1 = defpackage.qs6.T0(r1)
            java.lang.String r1 = r1.toString()
            int r4 = r1.length()
            if (r4 != 0) goto L162
            yt1 r1 = defpackage.yt1.A
            goto L1ed
        L162:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            java.lang.String r9 = " [Analog]"
            java.lang.String r10 = "[Analog]"
            java.lang.String r11 = " Analog"
            java.lang.String r12 = " (Analog)"
            java.lang.String[] r9 = new java.lang.String[]{r11, r12, r9, r10}
            java.util.List r9 = defpackage.hf.c0(r9)
            java.util.Iterator r9 = r9.iterator()
        L17b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L1dc
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            boolean r12 = defpackage.xs6.Y(r1, r10, r7)
            if (r12 == 0) goto L17b
            int r10 = r10.length()
            if (r10 < 0) goto L1d0
            int r12 = r1.length()
            int r12 = r12 - r10
            r10 = 0
            if (r12 >= 0) goto L19c
            r12 = r10
        L19c:
            java.lang.String r12 = defpackage.qs6.S0(r12, r1)
            int r13 = r12.length()
            int r13 = r13 + (-1)
            if (r13 < 0) goto L1c0
        L1a8:
            int r14 = r13 + (-1)
            char r15 = r12.charAt(r13)
            boolean r15 = defpackage.g04.J(r15)
            if (r15 != 0) goto L1bb
            int r13 = r13 + 1
            java.lang.CharSequence r10 = r12.subSequence(r10, r13)
            goto L1c2
        L1bb:
            if (r14 >= 0) goto L1be
            goto L1c0
        L1be:
            r13 = r14
            goto L1a8
        L1c0:
            java.lang.String r10 = ""
        L1c2:
            java.lang.String r10 = r10.toString()
            int r12 = r10.length()
            if (r12 <= 0) goto L17b
            r4.add(r10)
            goto L17b
        L1d0:
            java.lang.String r0 = "Requested character count "
            java.lang.String r1 = " is less than zero."
            java.lang.String r0 = defpackage.lb1.k(r0, r10, r1)
            defpackage.i.f(r0)
            return r8
        L1dc:
            boolean r7 = defpackage.xs6.Y(r1, r11, r7)
            if (r7 != 0) goto L1e9
            java.lang.String r1 = r1.concat(r11)
            r4.add(r1)
        L1e9:
            java.util.List r1 = defpackage.gt0.k1(r4)
        L1ed:
            java.util.Iterator r1 = r1.iterator()
        L1f1:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L228
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            r4.getClass()
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r4)
            java.lang.String r4 = ".ml"
            r9.append(r4)
            r9.append(r0)
            java.lang.String r4 = r9.toString()
            r7.<init>(r2, r4)
            boolean r4 = r7.exists()
            if (r4 == 0) goto L1f1
            long r9 = r7.length()
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L1f1
            goto L229
        L228:
            r7 = r8
        L229:
            if (r7 != 0) goto L22c
            goto L230
        L22c:
            android.net.Uri r8 = android.net.Uri.fromFile(r7)
        L230:
            if (r8 != 0) goto L233
        L232:
            return r3
        L233:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "action=slot_fallback mode=release slot="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " preferred="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " fallback="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "DebugCommand"
            android.util.Log.w(r1, r0)
            return r8
        L257:
            java.lang.String r0 = "Unsupported save state slot="
            java.lang.String r0 = defpackage.lb1.g(r2, r0)
            defpackage.i.f(r0)
        L260:
            return r8
    }

    public final java.lang.Object s(me.magnum.melonds.domain.model.VideoRenderer r20, int r21, int r22, long r23, defpackage.s41 r25) {
            r19 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            r4 = r25
            boolean r5 = r4 instanceof defpackage.yi5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == 0) goto L1b
            r5 = r4
            yi5 r5 = (defpackage.yi5) r5
            int r7 = r5.i0
            r8 = r7 & r6
            if (r8 == 0) goto L1b
            int r7 = r7 - r6
            r5.i0 = r7
            goto L22
        L1b:
            yi5 r5 = new yi5
            r7 = r19
            r5.<init>(r7, r4)
        L22:
            java.lang.Object r4 = r5.g0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r8 = r5.i0
            r9 = 0
            r10 = 2
            r11 = 1
            jg7 r12 = defpackage.jg7.a
            if (r8 == 0) goto L5e
            if (r8 == r11) goto L5a
            if (r8 != r10) goto L54
            long r0 = r5.f0
            int r2 = r5.Z
            long r8 = r5.e0
            long r13 = r5.d0
            int r3 = r5.Y
            int r6 = r5.X
            me.magnum.melonds.domain.model.VideoRenderer r15 = r5.R
            defpackage.oi2.Y(r4)
            r17 = r8
            r8 = r2
            r2 = r3
            r3 = r13
            r13 = r17
            r9 = r5
            r17 = r0
            r1 = r6
            r5 = r17
            r0 = r15
            goto Le6
        L54:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L5a:
            defpackage.oi2.Y(r4)
            return r12
        L5e:
            defpackage.oi2.Y(r4)
            r13 = 0
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 <= 0) goto L6a
            r15 = r13
            r13 = r2
            goto L75
        L6a:
            if (r1 <= 0) goto L74
            r15 = 5000(0x1388, double:2.4703E-320)
            r17 = r15
            r15 = r13
            r13 = r17
            goto L75
        L74:
            r15 = r13
        L75:
            int r4 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r4 > 0) goto L7b
            goto Le9
        L7b:
            if (r1 <= 0) goto L82
            if (r0 < 0) goto L82
            int r4 = r0 + r1
            goto L83
        L82:
            r4 = r6
        L83:
            if (r4 != r6) goto L9a
            r5.R = r9
            r5.X = r0
            r5.Y = r1
            r5.d0 = r2
            r5.e0 = r13
            r5.Z = r4
            r5.i0 = r11
            java.lang.Object r0 = defpackage.q60.t(r13, r5)
            if (r0 != r7) goto Le9
            goto Le5
        L9a:
            long r8 = java.lang.System.nanoTime()
            r15 = 1000000(0xf4240, double:4.940656E-318)
            long r15 = r15 * r13
            long r15 = r15 + r8
            r8 = r4
            r9 = r5
            r5 = r15
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r20
        Lab:
            long r15 = java.lang.System.nanoTime()
            int r15 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r15 >= 0) goto Le9
            me.magnum.melonds.impl.emulator.debug.RendererDebugBridge r15 = me.magnum.melonds.impl.emulator.debug.RendererDebugBridge.INSTANCE
            int r11 = r15.getCurrentFrameIndexForDebug()
            me.magnum.melonds.domain.model.VideoRenderer r10 = me.magnum.melonds.domain.model.VideoRenderer.VULKAN
            if (r0 != r10) goto Lc6
            boolean r10 = r15.isCurrentFrameReadyForDebug()
            if (r10 == 0) goto Lc4
            goto Lc6
        Lc4:
            r10 = 0
            goto Lc7
        Lc6:
            r10 = 1
        Lc7:
            if (r11 < r8) goto Lcc
            if (r10 == 0) goto Lcc
            goto Le9
        Lcc:
            r9.R = r0
            r9.X = r1
            r9.Y = r2
            r9.d0 = r3
            r9.e0 = r13
            r9.Z = r8
            r9.f0 = r5
            r10 = 2
            r9.i0 = r10
            r10 = 8
            java.lang.Object r10 = defpackage.q60.t(r10, r9)
            if (r10 != r7) goto Le6
        Le5:
            return r7
        Le6:
            r10 = 2
            r11 = 1
            goto Lab
        Le9:
            return r12
    }

    public final java.lang.Object t(me.magnum.melonds.domain.model.VideoRenderer r8, int r9, long r10, defpackage.s41 r12) {
            r7 = this;
            boolean r0 = r12 instanceof defpackage.zi5
            if (r0 == 0) goto L13
            r0 = r12
            zi5 r0 = (defpackage.zi5) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            zi5 r0 = new zi5
            r0.<init>(r7, r12)
        L18:
            java.lang.Object r7 = r0.Z
            x61 r12 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r0.e0
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2e
            long r8 = r0.Y
            long r10 = r0.X
            int r1 = r0.R
            defpackage.oi2.Y(r7)
            r7 = r1
            goto L50
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L35:
            defpackage.oi2.Y(r7)
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
            r0.e0 = r2
            r3 = 8
            java.lang.Object r1 = defpackage.q60.t(r3, r0)
            if (r1 != r12) goto L50
            return r12
        L78:
            jg7 r7 = defpackage.jg7.a
            return r7
    }
}
