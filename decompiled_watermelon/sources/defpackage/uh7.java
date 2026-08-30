package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uh7  reason: default package */
/* loaded from: classes.dex */
public abstract class uh7 {
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (r10.right <= r12.left) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
        if (r10.top >= r12.bottom) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        if (r10.left >= r12.right) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        if (r9 == 17) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r9 != 66) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
        r11 = e(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (r9 == 17) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (r9 == 33) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
        if (r9 == 66) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0050, code lost:
        if (r9 != 130) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        defpackage.i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005c, code lost:
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006f, code lost:
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0071, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
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
            defpackage.i.i(r0)
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
            defpackage.i.i(r0)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh7.a(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
        /*
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
            defpackage.i.i(r2)
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh7.b(int, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static long c(boolean z, int i, f00 f00Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        long j7;
        long scalb;
        f00Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j8 = j2 + 900000;
                if (j6 < j8) {
                    return j8;
                }
            }
            return j6;
        } else if (z) {
            if (f00Var == f00.LINEAR) {
                scalb = j * i;
            } else {
                scalb = Math.scalb((float) j, i - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j2 + scalb;
        } else if (z2) {
            if (i2 == 0) {
                j7 = j2 + j3;
            } else {
                j7 = j2 + j5;
            }
            if (j4 != j5 && i2 == 0) {
                return (j5 - j4) + j7;
            }
            return j7;
        } else if (j2 == -1) {
            return Long.MAX_VALUE;
        } else {
            return j2 + j3;
        }
    }

    public static boolean d(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        int i2 = rect.top;
                        int i3 = rect2.top;
                        if ((i2 < i3 || rect.bottom <= i3) && rect.bottom < rect2.bottom) {
                            return true;
                        }
                    } else {
                        i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else {
                    int i4 = rect.left;
                    int i5 = rect2.left;
                    if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
                        return true;
                    }
                }
            } else {
                int i6 = rect.bottom;
                int i7 = rect2.bottom;
                if ((i6 > i7 || rect.top >= i7) && rect.top > rect2.top) {
                    return true;
                }
            }
        } else {
            int i8 = rect.right;
            int i9 = rect2.right;
            if ((i8 > i9 || rect.left >= i9) && rect.left > rect2.left) {
                return true;
            }
        }
        return false;
    }

    public static int e(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i == 130) {
                        i2 = rect2.top;
                        i3 = rect.bottom;
                    } else {
                        i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                } else {
                    i2 = rect2.left;
                    i3 = rect.right;
                }
            } else {
                i2 = rect.top;
                i3 = rect2.bottom;
            }
        } else {
            i2 = rect.left;
            i3 = rect2.right;
        }
        return Math.max(0, i2 - i3);
    }

    public static int f(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        i.i("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
