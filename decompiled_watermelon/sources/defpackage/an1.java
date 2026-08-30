package defpackage;

import android.text.TextUtils;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: an1  reason: default package */
/* loaded from: classes.dex */
public class an1 implements y84, xo1, xi6 {
    public static final an1 L = new an1();
    public static final String[] R = {"standard", "accelerate", "decelerate", "linear"};
    public static final an1 X = new an1("NONE", 1);
    public static final an1 Y = new an1("FULL", 1);
    public static final an1 Z = new an1("VERTICAL", 2);
    public static final an1 c0 = new an1("HORIZONTAL", 2);
    public static final an1 d0 = new an1("FLAT", 3);
    public static final an1 e0 = new an1("HALF_OPENED", 3);
    public static final an1 f0 = new an1("FOLD", 4);
    public static final an1 g0 = new an1("HINGE", 4);
    public final /* synthetic */ int A;
    public String B;

    public an1(String str) {
        this.A = 5;
        str.getClass();
        this.B = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
        if (r19.equals("linear") == false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r1v21, types: [an1, ev5] */
    /* JADX WARN: Type inference failed for: r1v22, types: [an1, df6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.an1 e(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an1.e(java.lang.String):an1");
    }

    public double c(double d) {
        return 1.0d;
    }

    @Override // defpackage.y84
    public Object d() {
        throw new RuntimeException(this.B);
    }

    @Override // defpackage.xi6
    public String f() {
        return this.B;
    }

    @Override // defpackage.xo1
    public boolean m(CharSequence charSequence, int i, int i2, w07 w07Var) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.B)) {
            w07Var.c = (w07Var.c & 3) | 4;
            return false;
        }
        return true;
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return this.B;
            case 1:
                return this.B;
            case 2:
                return this.B;
            case 3:
                return this.B;
            case 4:
                return this.B;
            case 5:
            case ig7.b /* 6 */:
            case 7:
            case 8:
            default:
                return super.toString();
            case 9:
                return wh1.o(new StringBuilder("<"), this.B, '>');
        }
    }

    public /* synthetic */ an1(String str, int i) {
        this.A = i;
        this.B = str;
    }

    public an1() {
        this.A = 0;
        this.B = "identity";
    }

    @Override // defpackage.xo1
    public Object a() {
        return this;
    }

    public double b(double d) {
        return d;
    }

    @Override // defpackage.xi6
    public void i(wi6 wi6Var) {
    }
}
