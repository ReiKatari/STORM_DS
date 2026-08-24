package defpackage;

import android.util.Range;
import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy  reason: default package */
/* loaded from: classes.dex */
public final class yy {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final yq1 c;
    public final int d;
    public final Range e;
    public final yy0 f;
    public final boolean g;

    public yy(Size size, Size size2, yq1 yq1Var, int i, Range range, yy0 yy0Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = yq1Var;
        this.d = i;
        this.e = range;
        this.f = yy0Var;
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p87] */
    public static p87 a(Size size) {
        ?? obj = new Object();
        if (size != null) {
            obj.a = size;
            obj.b = size;
            obj.d = 0;
            Range range = h;
            if (range != null) {
                obj.e = range;
                obj.c = yq1.d;
                obj.g = Boolean.FALSE;
                return obj;
            }
            u34.x("Null expectedFrameRateRange");
            return null;
        }
        u34.x("Null resolution");
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p87] */
    public final p87 b() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = Integer.valueOf(this.d);
        obj.e = this.e;
        obj.f = this.f;
        obj.g = Boolean.valueOf(this.g);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yy) {
            yy yyVar = (yy) obj;
            if (this.a.equals(yyVar.a) && this.b.equals(yyVar.b) && this.c.equals(yyVar.c) && this.d == yyVar.d && this.e.equals(yyVar.e)) {
                yy0 yy0Var = yyVar.f;
                yy0 yy0Var2 = this.f;
                if (yy0Var2 != null ? yy0Var2.equals(yy0Var) : yy0Var == null) {
                    if (this.g == yyVar.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i;
        int hashCode2 = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        yy0 yy0Var = this.f;
        if (yy0Var == null) {
            hashCode = 0;
        } else {
            hashCode = yy0Var.hashCode();
        }
        int i2 = (hashCode2 ^ hashCode) * 1000003;
        if (this.g) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return i61.o(sb, this.g, "}");
    }
}
