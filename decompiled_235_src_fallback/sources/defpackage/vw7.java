package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vw7  reason: default package */
/* loaded from: classes.dex */
public abstract class vw7 {
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
            boolean r0 = b(r9, r10, r11)
            boolean r1 = b(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            defpackage.i.h(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = e(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            defpackage.i.h(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
    }

    public static boolean b(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            r0 = 17
            r1 = 0
            if (r2 == r0) goto L25
            r0 = 33
            if (r2 == r0) goto L18
            r0 = 66
            if (r2 == r0) goto L25
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L12
            goto L18
        L12:
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.i.h(r2)
            return r1
        L18:
            int r2 = r4.right
            int r0 = r3.left
            if (r2 < r0) goto L33
            int r2 = r4.left
            int r3 = r3.right
            if (r2 > r3) goto L33
            goto L31
        L25:
            int r2 = r4.bottom
            int r0 = r3.top
            if (r2 < r0) goto L33
            int r2 = r4.top
            int r3 = r3.bottom
            if (r2 > r3) goto L33
        L31:
            r2 = 1
            return r2
        L33:
            return r1
    }

    public static long c(boolean r3, int r4, defpackage.w10 r5, long r6, long r8, int r10, boolean r11, long r12, long r14, long r16, long r18) {
            r5.getClass()
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 == 0) goto L1b
            if (r11 == 0) goto L1b
            if (r10 != 0) goto L11
            goto L1a
        L11:
            r3 = 900000(0xdbba0, double:4.44659E-318)
            long r8 = r8 + r3
            int r3 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            if (r3 >= 0) goto L1a
            return r8
        L1a:
            return r18
        L1b:
            if (r3 == 0) goto L36
            w10 r3 = defpackage.w10.LINEAR
            if (r5 != r3) goto L24
            long r3 = (long) r4
            long r6 = r6 * r3
            goto L2c
        L24:
            float r3 = (float) r6
            int r4 = r4 + (-1)
            float r3 = java.lang.Math.scalb(r3, r4)
            long r6 = (long) r3
        L2c:
            r3 = 18000000(0x112a880, double:8.8931816E-317)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L34
            r6 = r3
        L34:
            long r8 = r8 + r6
            return r8
        L36:
            if (r11 == 0) goto L49
            if (r10 != 0) goto L3c
            long r8 = r8 + r12
            goto L3e
        L3c:
            long r8 = r8 + r16
        L3e:
            int r3 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r3 == 0) goto L48
            if (r10 != 0) goto L48
            long r3 = r16 - r14
            long r3 = r3 + r8
            return r3
        L48:
            return r8
        L49:
            r3 = -1
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 != 0) goto L50
            return r0
        L50:
            long r8 = r8 + r12
            return r8
    }

    public static boolean d(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            r0 = 17
            r1 = 0
            if (r2 == r0) goto L4a
            r0 = 33
            if (r2 == r0) goto L39
            r0 = 66
            if (r2 == r0) goto L28
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L22
            int r2 = r3.top
            int r0 = r4.top
            if (r2 < r0) goto L1b
            int r2 = r3.bottom
            if (r2 > r0) goto L5c
        L1b:
            int r2 = r3.bottom
            int r3 = r4.bottom
            if (r2 >= r3) goto L5c
            goto L5a
        L22:
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.i.h(r2)
            return r1
        L28:
            int r2 = r3.left
            int r0 = r4.left
            if (r2 < r0) goto L32
            int r2 = r3.right
            if (r2 > r0) goto L5c
        L32:
            int r2 = r3.right
            int r3 = r4.right
            if (r2 >= r3) goto L5c
            goto L5a
        L39:
            int r2 = r3.bottom
            int r0 = r4.bottom
            if (r2 > r0) goto L43
            int r2 = r3.top
            if (r2 < r0) goto L5c
        L43:
            int r2 = r3.top
            int r3 = r4.top
            if (r2 <= r3) goto L5c
            goto L5a
        L4a:
            int r2 = r3.right
            int r0 = r4.right
            if (r2 > r0) goto L54
            int r2 = r3.left
            if (r2 < r0) goto L5c
        L54:
            int r2 = r3.left
            int r3 = r4.left
            if (r2 <= r3) goto L5c
        L5a:
            r2 = 1
            return r2
        L5c:
            return r1
    }

    public static int e(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
            r0 = 17
            r1 = 0
            if (r2 == r0) goto L27
            r0 = 33
            if (r2 == r0) goto L22
            r0 = 66
            if (r2 == r0) goto L1d
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L17
            int r2 = r4.top
            int r3 = r3.bottom
        L15:
            int r2 = r2 - r3
            goto L2c
        L17:
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.i.h(r2)
            return r1
        L1d:
            int r2 = r4.left
            int r3 = r3.right
            goto L15
        L22:
            int r2 = r3.top
            int r3 = r4.bottom
            goto L15
        L27:
            int r2 = r3.left
            int r3 = r4.right
            goto L15
        L2c:
            int r2 = java.lang.Math.max(r1, r2)
            return r2
    }

    public static int f(int r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = 17
            if (r1 == r0) goto L30
            r0 = 33
            if (r1 == r0) goto L18
            r0 = 66
            if (r1 == r0) goto L30
            r0 = 130(0x82, float:1.82E-43)
            if (r1 != r0) goto L11
            goto L18
        L11:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L18:
            int r1 = r2.left
            int r2 = r2.width()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.left
            int r3 = r3.width()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
        L30:
            int r1 = r2.top
            int r2 = r2.height()
            int r2 = r2 / 2
            int r2 = r2 + r1
            int r1 = r3.top
            int r3 = r3.height()
            int r3 = r3 / 2
            int r3 = r3 + r1
            int r2 = r2 - r3
            int r1 = java.lang.Math.abs(r2)
            return r1
    }
}
