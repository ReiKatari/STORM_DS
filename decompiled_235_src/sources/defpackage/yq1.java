package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yq1  reason: default package */
/* loaded from: classes.dex */
public final class yq1 {
    public static final yq1 c = new yq1(0, 0);
    public static final yq1 d = new yq1(1, 8);
    public static final yq1 e = new yq1(3, 10);
    public static final yq1 f = new yq1(4, 10);
    public static final yq1 g = new yq1(5, 10);
    public static final yq1 h = new yq1(6, 10);
    public static final yq1 i = new yq1(6, 8);
    public final int a;
    public final int b;

    public yq1(int i2, int i3) {
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
        if (obj instanceof yq1) {
            yq1 yq1Var = (yq1) obj;
            if (this.a == yq1Var.a && this.b == yq1Var.b) {
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
            case 6:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb.append(str);
        sb.append(", bitDepth=");
        return lb1.o(sb, this.b, "}");
    }
}
