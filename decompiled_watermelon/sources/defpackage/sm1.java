package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sm1  reason: default package */
/* loaded from: classes.dex */
public final class sm1 {
    public static final sm1 c = new sm1(0, 0);
    public static final sm1 d = new sm1(1, 8);
    public static final sm1 e = new sm1(3, 10);
    public static final sm1 f = new sm1(4, 10);
    public static final sm1 g = new sm1(5, 10);
    public static final sm1 h = new sm1(6, 10);
    public static final sm1 i = new sm1(6, 8);
    public final int a;
    public final int b;

    public sm1(int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public final boolean a() {
        if (b() && this.a != 1 && this.b == 10) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i2 = this.a;
        if (i2 != 0 && i2 != 2 && this.b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sm1) {
            sm1 sm1Var = (sm1) obj;
            if (this.a == sm1Var.a && this.b == sm1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicRange@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("{encoding=");
        switch (this.a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case 1:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case 5:
                str = "HDR10_PLUS";
                break;
            case ig7.b /* 6 */:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return wh1.m(sb, this.b, "}");
    }
}
