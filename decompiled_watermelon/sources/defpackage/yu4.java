package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yu4  reason: default package */
/* loaded from: classes.dex */
public abstract class yu4 {
    public static final l41 a = new l41(0.2f, 0.8f);
    public static final l41 b = new l41(0.4f, 1.0f);
    public static final l41 c = new l41(RecyclerView.A1, 0.65f);
    public static final l41 d = new l41(0.1f, 0.45f);
    public static final l41 e = new l41(0.4f, 0.2f);

    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.zy3 r30, long r31, float r33, long r34, int r36, defpackage.tu0 r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu4.a(zy3, long, float, long, int, tu0, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        if ((r30 & 4) != 0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.zy3 r23, final long r24, long r26, defpackage.tu0 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yu4.b(zy3, long, long, tu0, int, int):void");
    }

    public static final void c(hk1 hk1Var, float f, float f2, long j, hh6 hh6Var) {
        float f3 = hh6Var.a / 2.0f;
        float intBitsToFloat = Float.intBitsToFloat((int) (hk1Var.d() >> 32)) - (2.0f * f3);
        hk1.h0(hk1Var, j, f, f2, (Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L), RecyclerView.A1, hh6Var, 832);
    }

    public static final void d(hk1 hk1Var, float f, float f2, long j, float f3) {
        boolean z;
        float f4;
        float f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (hk1Var.d() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hk1Var.d() & 4294967295L)) / 2.0f;
        if (hk1Var.getLayoutDirection() == sd3.Ltr) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f4 = f;
        } else {
            f4 = 1.0f - f2;
        }
        float f6 = f4 * intBitsToFloat;
        if (z) {
            f5 = f2;
        } else {
            f5 = 1.0f - f;
        }
        hk1.W(hk1Var, j, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), (Float.floatToRawIntBits(f5 * intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), f3, 0, 496);
    }
}
