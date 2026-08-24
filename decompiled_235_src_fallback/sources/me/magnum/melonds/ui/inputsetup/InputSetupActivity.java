package me.magnum.melonds.ui.inputsetup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class InputSetupActivity extends defpackage.sx2 {
    public static final /* synthetic */ int D0 = 0;
    public final defpackage.uo7 B0;
    public final java.util.LinkedHashMap C0;

    public InputSetupActivity() {
            r6 = this;
            r0 = 1
            r6.<init>(r0)
            i73 r1 = new i73
            r2 = 0
            r1.<init>(r6, r2)
            uo7 r2 = new uo7
            java.lang.Class<me.magnum.melonds.ui.inputsetup.b> r3 = me.magnum.melonds.ui.inputsetup.b.class
            ar0 r3 = defpackage.gh5.a(r3)
            i73 r4 = new i73
            r4.<init>(r6, r0)
            i73 r0 = new i73
            r5 = 2
            r0.<init>(r6, r5)
            r2.<init>(r3, r4, r1, r0)
            r6.B0 = r2
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r6.C0 = r0
            return
    }

    public final me.magnum.melonds.ui.inputsetup.b B() {
            r0 = this;
            uo7 r0 = r0.B0
            java.lang.Object r0 = r0.getValue()
            me.magnum.melonds.ui.inputsetup.b r0 = (me.magnum.melonds.ui.inputsetup.b) r0
            return r0
    }

    @Override // defpackage.jq, defpackage.lv0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            r4.getClass()
            int r0 = r4.getAction()
            if (r0 != 0) goto L3f
            me.magnum.melonds.ui.inputsetup.b r0 = r3.B()
            de5 r0 = r0.j
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L3f
            int r0 = r4.getKeyCode()
            r1 = 4
            if (r0 == r1) goto L3f
            me.magnum.melonds.ui.inputsetup.b r3 = r3.B()
            int r4 = r4.getKeyCode()
            tp6 r0 = r3.i
            java.lang.Object r0 = r0.getValue()
            b63 r0 = (defpackage.b63) r0
            if (r0 != 0) goto L31
            goto L3d
        L31:
            f63 r1 = new f63
            r2 = 0
            r1.<init>(r4, r2)
            r3.g(r0, r1)
            r3.e(r0)
        L3d:
            r3 = 1
            return r3
        L3f:
            boolean r3 = super.dispatchKeyEvent(r4)
            return r3
    }

    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(android.os.Bundle r5) {
            r4 = this;
            g57 r0 = defpackage.ht.a()
            int r0 = r0.getThemeResId()
            r4.setTheme(r0)
            ix6 r0 = new ix6
            r76 r1 = new r76
            r2 = 18
            r1.<init>(r2)
            r2 = 0
            r3 = 2
            r0.<init>(r2, r2, r3, r1)
            defpackage.tr1.a(r4, r0)
            super.onCreate(r5)
            f73 r5 = new f73
            r5.<init>(r4, r2)
            zv0 r0 = new zv0
            r1 = 1790543048(0x6ab984c8, float:1.1213916E26)
            r2 = 1
            r0.<init>(r1, r2, r5)
            defpackage.nv0.a(r4, r0)
            au3 r5 = defpackage.bl2.C(r4)
            h73 r0 = new h73
            r1 = 0
            r0.<init>(r4, r1, r2)
            r4 = 3
            defpackage.hv.L(r5, r1, r1, r0, r4)
            return
    }

    @Override // android.app.Activity
    public final boolean onGenericMotionEvent(android.view.MotionEvent r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            r1.getClass()
            me.magnum.melonds.ui.inputsetup.b r2 = r0.B()
            de5 r2 = r2.j
            rp6 r2 = r2.A
            java.lang.Object r2 = r2.getValue()
            b63 r2 = (defpackage.b63) r2
            me.magnum.melonds.ui.inputsetup.b r3 = r0.B()
            de5 r3 = r3.l
            rp6 r3 = r3.A
            java.lang.Object r3 = r3.getValue()
            me.magnum.melonds.ui.inputsetup.b$a r3 = (me.magnum.melonds.ui.inputsetup.b.a) r3
            if (r2 != 0) goto L27
            if (r3 == 0) goto L1a6
        L27:
            r3 = 16
            boolean r3 = r1.isFromSource(r3)
            if (r3 != 0) goto L40
            r3 = 16777232(0x1000010, float:2.3509932E-38)
            boolean r3 = r1.isFromSource(r3)
            if (r3 != 0) goto L40
            r3 = 1025(0x401, float:1.436E-42)
            boolean r3 = r1.isFromSource(r3)
            if (r3 == 0) goto L1a6
        L40:
            int r3 = r1.getAction()
            r4 = 2
            if (r3 != r4) goto L1a6
            android.view.InputDevice r3 = r1.getDevice()
            yt1 r5 = defpackage.yt1.A
            r6 = 1
            if (r3 == 0) goto Lad
            java.util.List r3 = r3.getMotionRanges()
            if (r3 == 0) goto Lad
            ev r7 = new ev
            r7.<init>(r3, r6)
            bz1 r3 = new bz1
            r3.<init>(r0)
            pc2 r8 = new pc2
            r8.<init>(r7, r6, r3)
            bz1 r3 = new bz1
            r7 = 24
            r3.<init>(r7)
            qd2 r7 = new qd2
            r7.<init>(r8, r3, r4)
            gn5 r3 = new gn5
            r8 = 23
            r3.<init>(r8)
            ol1 r8 = new ol1
            java.util.Iterator r7 = r7.iterator()
            r8.<init>(r7, r3)
            boolean r3 = r8.hasNext()
            if (r3 != 0) goto L88
            goto Lad
        L88:
            java.lang.Object r3 = r8.next()
            boolean r5 = r8.hasNext()
            if (r5 != 0) goto L97
            java.util.List r5 = defpackage.hf.b0(r3)
            goto Lad
        L97:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r5.add(r3)
        L9f:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lad
            java.lang.Object r3 = r8.next()
            r5.add(r3)
            goto L9f
        Lad:
            java.util.Iterator r3 = r5.iterator()
        Lb1:
            boolean r5 = r3.hasNext()
            java.util.LinkedHashMap r7 = r0.C0
            r8 = 0
            r9 = 0
            if (r5 == 0) goto Lf5
            java.lang.Object r5 = r3.next()
            r10 = r5
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            int r11 = r1.getDeviceId()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            vr4 r13 = new vr4
            r13.<init>(r11, r12)
            java.lang.Object r11 = r7.get(r13)
            java.lang.Float r11 = (java.lang.Float) r11
            if (r11 == 0) goto Le4
            float r11 = r11.floatValue()
            goto Le5
        Le4:
            r11 = r9
        Le5:
            float r10 = r1.getAxisValue(r10)
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            r11 = 1056964608(0x3f000000, float:0.5)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto Lb1
            goto Lf6
        Lf5:
            r5 = r8
        Lf6:
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 == 0) goto L1a5
            int r3 = r1.getDeviceId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            vr4 r10 = new vr4
            r10.<init>(r3, r5)
            java.lang.Object r3 = r7.get(r10)
            java.lang.Float r3 = (java.lang.Float) r3
            if (r3 == 0) goto L114
            float r3 = r3.floatValue()
            goto L115
        L114:
            r3 = r9
        L115:
            int r7 = r5.intValue()
            float r7 = r1.getAxisValue(r7)
            float r7 = r7 - r3
            if (r2 == 0) goto L14b
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L127
            d63 r1 = defpackage.d63.POSITIVE
            goto L129
        L127:
            d63 r1 = defpackage.d63.NEGATIVE
        L129:
            me.magnum.melonds.ui.inputsetup.b r0 = r0.B()
            int r2 = r5.intValue()
            r1.getClass()
            tp6 r3 = r0.i
            java.lang.Object r3 = r3.getValue()
            b63 r3 = (defpackage.b63) r3
            if (r3 != 0) goto L13f
            goto L1a5
        L13f:
            e63 r4 = new e63
            r4.<init>(r8, r2, r1)
            r0.g(r3, r4)
            r0.e(r3)
            return r6
        L14b:
            me.magnum.melonds.ui.inputsetup.b r0 = r0.B()
            int r12 = r5.intValue()
            int r1 = r1.getDeviceId()
            tp6 r2 = r0.k
            java.lang.Object r3 = r2.getValue()
            me.magnum.melonds.ui.inputsetup.b$a r3 = (me.magnum.melonds.ui.inputsetup.b.a) r3
            if (r3 != 0) goto L162
            goto L1a5
        L162:
            tp6 r5 = r0.g
            java.lang.Object r5 = r5.getValue()
            r9 = r5
            kk6 r9 = (defpackage.kk6) r9
            int[] r5 = me.magnum.melonds.ui.inputsetup.c.a
            int r3 = r3.ordinal()
            r3 = r5[r3]
            if (r3 == r6) goto L18e
            if (r3 != r4) goto L189
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r16 = 0
            r17 = 118(0x76, float:1.65E-43)
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = 0
            r15 = 0
            kk6 r1 = defpackage.kk6.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            goto L19f
        L189:
            defpackage.i.d()
            r0 = 0
            return r0
        L18e:
            r13 = r12
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            r16 = 0
            r17 = 122(0x7a, float:1.71E-43)
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            kk6 r1 = defpackage.kk6.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L19f:
            r0.h(r1)
            r2.l(r8)
        L1a5:
            return r6
        L1a6:
            boolean r0 = super.onGenericMotionEvent(r19)
            return r0
    }
}
