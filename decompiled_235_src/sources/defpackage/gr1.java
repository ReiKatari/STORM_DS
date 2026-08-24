package defpackage;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr1  reason: default package */
/* loaded from: classes.dex */
public class gr1 implements ph4, gt1, ru6 {
    public static final gr1 L = new gr1();
    public static final String[] R = {"standard", "accelerate", "decelerate", "linear"};
    public static final gr1 X = new gr1("NONE", 1);
    public static final gr1 Y = new gr1("FULL", 1);
    public static final gr1 Z = new gr1("VERTICAL", 2);
    public static final gr1 d0 = new gr1("HORIZONTAL", 2);
    public static final gr1 e0 = new gr1("FLAT", 3);
    public static final gr1 f0 = new gr1("HALF_OPENED", 3);
    public static final gr1 g0 = new gr1("FOLD", 4);
    public static final gr1 h0 = new gr1("HINGE", 4);
    public final /* synthetic */ int A;
    public String B;

    public gr1(String str) {
        this.A = 5;
        str.getClass();
        this.B = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0152, code lost:
        if (r19.equals("linear") == false) goto L33;
     */
    /* JADX WARN: Type inference failed for: r1v21, types: [gr1, n66] */
    /* JADX WARN: Type inference failed for: r1v22, types: [gr1, sq6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gr1 c(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new fr1(str);
        }
        char c = 3;
        if (str.startsWith("spline")) {
            ?? gr1Var = new gr1();
            gr1Var.B = str;
            double[] dArr = new double[str.length() / 2];
            int indexOf = str.indexOf(40) + 1;
            int indexOf2 = str.indexOf(44, indexOf);
            int i = 0;
            while (indexOf2 != -1) {
                dArr[i] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                indexOf = indexOf2 + 1;
                indexOf2 = str.indexOf(44, indexOf);
                i++;
            }
            dArr[i] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
            double[] copyOf = Arrays.copyOf(dArr, i + 1);
            int length = (copyOf.length * 3) - 2;
            int length2 = copyOf.length - 1;
            double d = 1.0d / length2;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
            double[] dArr3 = new double[length];
            for (int i2 = 0; i2 < copyOf.length; i2++) {
                double d2 = copyOf[i2];
                int i3 = i2 + length2;
                dArr2[i3][0] = d2;
                double d3 = i2 * d;
                dArr3[i3] = d3;
                if (i2 > 0) {
                    int i4 = (length2 * 2) + i2;
                    dArr2[i4][0] = d2 + 1.0d;
                    dArr3[i4] = d3 + 1.0d;
                    int i5 = i2 - 1;
                    dArr2[i5][0] = (d2 - 1.0d) - d;
                    dArr3[i5] = (d3 - 1.0d) - d;
                }
            }
            g74 g74Var = new g74(dArr3, dArr2);
            System.out.println(" 0 " + g74Var.Z(0.0d));
            System.out.println(" 1 " + g74Var.Z(1.0d));
            gr1Var.i0 = g74Var;
            return gr1Var;
        } else if (str.startsWith("Schlick")) {
            ?? gr1Var2 = new gr1();
            gr1Var2.B = str;
            int indexOf3 = str.indexOf(40);
            int indexOf4 = str.indexOf(44, indexOf3);
            gr1Var2.i0 = Double.parseDouble(str.substring(indexOf3 + 1, indexOf4).trim());
            int i6 = indexOf4 + 1;
            gr1Var2.j0 = Double.parseDouble(str.substring(i6, str.indexOf(44, i6)).trim());
            return gr1Var2;
        } else {
            switch (str.hashCode()) {
                case -1354466595:
                    if (str.equals("accelerate")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1263948740:
                    if (str.equals("decelerate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1197605014:
                    if (str.equals("anticipate")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1102672091:
                    break;
                case -749065269:
                    if (str.equals("overshoot")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1312628413:
                    if (str.equals("standard")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new fr1("cubic(0.4, 0.05, 0.8, 0.7)");
                case 1:
                    return new fr1("cubic(0.0, 0.0, 0.2, 0.95)");
                case 2:
                    return new fr1("cubic(0.36, 0, 0.66, -0.56)");
                case 3:
                    return new fr1("cubic(1, 1, 0, 0)");
                case 4:
                    return new fr1("cubic(0.34, 1.56, 0.64, 1)");
                case 5:
                    return new fr1("cubic(0.4, 0.0, 0.2, 1)");
                default:
                    System.err.println("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or " + Arrays.toString(R));
                    return L;
            }
        }
    }

    public double b(double d) {
        return 1.0d;
    }

    @Override // defpackage.ph4
    public Object e() {
        throw new RuntimeException(this.B);
    }

    @Override // defpackage.ru6
    public String g() {
        return this.B;
    }

    @Override // defpackage.gt1
    public boolean m(CharSequence charSequence, int i, int i2, re7 re7Var) {
        if (TextUtils.equals(charSequence.subSequence(i, i2), this.B)) {
            re7Var.c = (re7Var.c & 3) | 4;
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
            case 6:
            case 7:
            case 8:
            default:
                return super.toString();
            case 9:
                return lb1.q(new StringBuilder("<"), this.B, '>');
        }
    }

    public /* synthetic */ gr1(String str, int i) {
        this.A = i;
        this.B = str;
    }

    public gr1() {
        this.A = 0;
        this.B = "identity";
    }

    @Override // defpackage.gt1
    public Object d() {
        return this;
    }

    public double a(double d) {
        return d;
    }

    @Override // defpackage.ru6
    public void l(qu6 qu6Var) {
    }
}
