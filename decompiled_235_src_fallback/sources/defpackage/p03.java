package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p03  reason: default package */
/* loaded from: classes.dex */
public final class p03 extends defpackage.h20 {
    public final /* synthetic */ int B;
    public final defpackage.my4 L;
    public boolean R;
    public int X;

    public p03(defpackage.s03 r3, int r4) {
            r2 = this;
            r2.B = r4
            r0 = -1
            r1 = 0
            switch(r4) {
                case 1: goto L19;
                default: goto L7;
            }
        L7:
            r3.getClass()
            r2.<init>()
            r2.A = r3
            my4 r3 = new my4
            r3.<init>(r1, r1)
            r2.L = r3
            r2.X = r0
            return
        L19:
            r3.getClass()
            r2.<init>()
            r2.A = r3
            my4 r3 = new my4
            r3.<init>(r1, r1)
            r2.L = r3
            r2.X = r0
            return
    }

    public static int b(android.view.MotionEvent r4) {
            int r0 = r4.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            int r2 = r4.getToolType(r1)
            r3 = 2
            if (r2 == r3) goto L14
            r3 = 4
            if (r2 == r3) goto L14
            int r1 = r1 + 1
            goto L5
        L14:
            int r4 = r4.getPointerId(r1)
            return r4
        L19:
            int r0 = r4.getActionIndex()
            int r4 = r4.getPointerId(r0)
            return r4
    }

    public static int c(android.view.MotionEvent r5, float r6) {
            int r0 = r5.getPointerCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L23
            float r3 = r5.getY(r2)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 < 0) goto L20
            int r3 = r5.getToolType(r2)
            r4 = 2
            if (r3 == r4) goto L1b
            r4 = 4
            if (r3 == r4) goto L1b
            goto L20
        L1b:
            int r5 = r5.getPointerId(r2)
            return r5
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            int r0 = r5.getPointerCount()
        L27:
            if (r1 >= r0) goto L39
            float r2 = r5.getY(r1)
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L36
            int r5 = r5.getPointerId(r1)
            return r5
        L36:
            int r1 = r1 + 1
            goto L27
        L39:
            r5 = -1
            return r5
    }

    public void a() {
            r2 = this;
            boolean r0 = r2.R
            if (r0 == 0) goto L16
            s03 r0 = r2.A
            b63 r1 = defpackage.b63.TOUCHSCREEN
            r0.b(r1)
            me.magnum.melonds.MelonEmulator r0 = me.magnum.melonds.MelonEmulator.a
            r0.onScreenRelease()
            r0 = 0
            r2.R = r0
            r0 = -1
            r2.X = r0
        L16:
            return
    }

    public defpackage.my4 d(android.view.MotionEvent r7, int r8, int r9) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
            r2 = r1
        L6:
            r3 = -1
            if (r2 >= r0) goto L16
            int r4 = r7.getToolType(r2)
            r5 = 2
            if (r4 == r5) goto L17
            r5 = 4
            if (r4 == r5) goto L17
            int r2 = r2 + 1
            goto L6
        L16:
            r2 = r3
        L17:
            if (r2 == r3) goto L22
            float r0 = r7.getX(r2)
            float r7 = r7.getY(r2)
            goto L43
        L22:
            int r0 = r6.X
            if (r0 == r3) goto L39
            int r0 = r7.findPointerIndex(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 < 0) goto L31
            goto L32
        L31:
            r2 = 0
        L32:
            if (r2 == 0) goto L39
            int r0 = r2.intValue()
            goto L3a
        L39:
            r0 = r1
        L3a:
            float r2 = r7.getX(r0)
            float r7 = r7.getY(r0)
            r0 = r2
        L43:
            float r8 = (float) r8
            float r0 = r0 / r8
            r8 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r8
            int r8 = (int) r0
            r0 = 255(0xff, float:3.57E-43)
            int r8 = defpackage.gi2.q(r8, r1, r0)
            my4 r6 = r6.L
            r6.a = r8
            float r8 = (float) r9
            float r7 = r7 / r8
            r8 = 1128267776(0x43400000, float:192.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            r8 = 191(0xbf, float:2.68E-43)
            int r7 = defpackage.gi2.q(r7, r1, r8)
            r6.b = r7
            return r6
    }

    public defpackage.my4 e(android.view.MotionEvent r7, int r8, int r9, float r10) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
            r2 = r1
        L6:
            r3 = -1
            if (r2 >= r0) goto L1e
            float r4 = r7.getY(r2)
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 < 0) goto L1b
            int r4 = r7.getToolType(r2)
            r5 = 2
            if (r4 == r5) goto L1f
            r5 = 4
            if (r4 == r5) goto L1f
        L1b:
            int r2 = r2 + 1
            goto L6
        L1e:
            r2 = r3
        L1f:
            if (r2 == r3) goto L2a
            float r0 = r7.getX(r2)
            float r7 = r7.getY(r2)
            goto L4b
        L2a:
            int r0 = r6.X
            if (r0 == r3) goto L41
            int r0 = r7.findPointerIndex(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            if (r0 < 0) goto L39
            goto L3a
        L39:
            r2 = 0
        L3a:
            if (r2 == 0) goto L41
            int r0 = r2.intValue()
            goto L42
        L41:
            r0 = r1
        L42:
            float r2 = r7.getX(r0)
            float r7 = r7.getY(r0)
            r0 = r2
        L4b:
            float r9 = (float) r9
            float r9 = r9 - r10
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r3 >= 0) goto L54
            r9 = r2
        L54:
            float r8 = (float) r8
            float r0 = r0 / r8
            r8 = 1132462080(0x43800000, float:256.0)
            float r0 = r0 * r8
            int r8 = (int) r0
            r0 = 255(0xff, float:3.57E-43)
            int r8 = defpackage.gi2.q(r8, r1, r0)
            my4 r6 = r6.L
            r6.a = r8
            float r7 = r7 - r10
            float r7 = r7 / r9
            r8 = 1128267776(0x43400000, float:192.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            r8 = 191(0xbf, float:2.68E-43)
            int r7 = defpackage.gi2.q(r7, r1, r8)
            r6.b = r7
            return r6
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
            r11 = this;
            int r0 = r11.B
            r1 = 4
            r2 = 6
            r3 = 5
            r4 = 3
            r5 = 1
            r6 = 2
            r7 = 0
            r8 = -1
            switch(r0) {
                case 0: goto Lfe;
                default: goto Ld;
            }
        Ld:
            s03 r0 = r11.A
            r12.getClass()
            r13.getClass()
            int r9 = r13.getActionMasked()
            if (r9 == 0) goto Le1
            me.magnum.melonds.MelonEmulator r10 = me.magnum.melonds.MelonEmulator.a
            if (r9 == r5) goto Ld0
            if (r9 == r6) goto Lbc
            if (r9 == r4) goto Ld0
            if (r9 == r3) goto L8b
            if (r9 == r2) goto L29
            goto Lfd
        L29:
            int r2 = r13.getActionIndex()
            int r3 = r13.getPointerId(r2)
            int r4 = r11.X
            if (r4 != r3) goto Lfd
            int r3 = r13.getPointerCount()
            int r3 = r3 - r5
            if (r3 <= 0) goto L79
            int r3 = r13.getPointerCount()
            r4 = r7
        L41:
            if (r4 >= r3) goto L56
            if (r4 == r2) goto L53
            int r9 = r13.getToolType(r4)
            if (r9 == r6) goto L4e
            if (r9 == r1) goto L4e
            goto L53
        L4e:
            int r8 = r13.getPointerId(r4)
            goto L66
        L53:
            int r4 = r4 + 1
            goto L41
        L56:
            int r1 = r13.getPointerCount()
        L5a:
            if (r7 >= r1) goto L66
            if (r7 == r2) goto L63
            int r8 = r13.getPointerId(r7)
            goto L66
        L63:
            int r7 = r7 + 1
            goto L5a
        L66:
            r11.X = r8
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.d(r13, r1, r12)
            r0.a(r11)
            goto Lfd
        L79:
            boolean r12 = r11.R
            if (r12 == 0) goto Lfd
            b63 r12 = defpackage.b63.TOUCHSCREEN
            r0.b(r12)
            r10.onScreenRelease()
            r11.R = r7
            r11.X = r8
            goto Lfd
        L8b:
            int r1 = b(r13)
            r11.X = r1
            boolean r1 = r11.R
            if (r1 == 0) goto La5
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.d(r13, r1, r12)
            r0.a(r11)
            goto Lfd
        La5:
            r11.R = r5
            b63 r1 = defpackage.b63.TOUCHSCREEN
            r0.c(r1)
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.d(r13, r1, r12)
            r0.a(r11)
            goto Lfd
        Lbc:
            boolean r1 = r11.R
            if (r1 == 0) goto Lfd
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.d(r13, r1, r12)
            r0.a(r11)
            goto Lfd
        Ld0:
            boolean r12 = r11.R
            if (r12 == 0) goto Lfd
            b63 r12 = defpackage.b63.TOUCHSCREEN
            r0.b(r12)
            r10.onScreenRelease()
            r11.R = r7
            r11.X = r8
            goto Lfd
        Le1:
            r11.R = r5
            int r1 = b(r13)
            r11.X = r1
            b63 r1 = defpackage.b63.TOUCHSCREEN
            r0.c(r1)
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.d(r13, r1, r12)
            r0.a(r11)
        Lfd:
            return r5
        Lfe:
            s03 r0 = r11.A
            r12.getClass()
            r13.getClass()
            int r9 = r12.getHeight()
            float r9 = (float) r9
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            int r10 = r13.getActionMasked()
            if (r10 == 0) goto L1d6
            if (r10 == r5) goto L1d2
            if (r10 == r6) goto L1be
            if (r10 == r4) goto L1d2
            if (r10 == r3) goto L18b
            if (r10 == r2) goto L120
            goto L1f4
        L120:
            int r2 = r13.getActionIndex()
            int r3 = r13.getPointerId(r2)
            int r4 = r11.X
            if (r4 != r3) goto L1f4
            int r3 = r13.getPointerCount()
            int r3 = r3 - r5
            if (r3 <= 0) goto L187
            int r3 = r13.getPointerCount()
            r4 = r7
        L138:
            if (r4 >= r3) goto L155
            if (r4 == r2) goto L152
            float r10 = r13.getY(r4)
            int r10 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
            if (r10 < 0) goto L152
            int r10 = r13.getToolType(r4)
            if (r10 == r6) goto L14d
            if (r10 == r1) goto L14d
            goto L152
        L14d:
            int r1 = r13.getPointerId(r4)
            goto L16e
        L152:
            int r4 = r4 + 1
            goto L138
        L155:
            int r1 = r13.getPointerCount()
        L159:
            if (r7 >= r1) goto L16d
            if (r7 == r2) goto L16a
            float r3 = r13.getY(r7)
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 < 0) goto L16a
            int r1 = r13.getPointerId(r7)
            goto L16e
        L16a:
            int r7 = r7 + 1
            goto L159
        L16d:
            r1 = r8
        L16e:
            r11.X = r1
            if (r1 == r8) goto L183
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.e(r13, r1, r12, r9)
            r0.a(r11)
            goto L1f4
        L183:
            r11.a()
            goto L1f4
        L187:
            r11.a()
            goto L1f4
        L18b:
            int r1 = c(r13, r9)
            if (r1 == r8) goto L1f4
            r11.X = r1
            boolean r1 = r11.R
            if (r1 == 0) goto L1a7
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.e(r13, r1, r12, r9)
            r0.a(r11)
            goto L1f4
        L1a7:
            r11.R = r5
            b63 r1 = defpackage.b63.TOUCHSCREEN
            r0.c(r1)
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.e(r13, r1, r12, r9)
            r0.a(r11)
            goto L1f4
        L1be:
            boolean r1 = r11.R
            if (r1 == 0) goto L1f4
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.e(r13, r1, r12, r9)
            r0.a(r11)
            goto L1f4
        L1d2:
            r11.a()
            goto L1f4
        L1d6:
            int r1 = c(r13, r9)
            if (r1 == r8) goto L1f4
            r11.R = r5
            r11.X = r1
            b63 r1 = defpackage.b63.TOUCHSCREEN
            r0.c(r1)
            int r1 = r12.getWidth()
            int r12 = r12.getHeight()
            my4 r11 = r11.e(r13, r1, r12, r9)
            r0.a(r11)
        L1f4:
            return r5
    }
}
