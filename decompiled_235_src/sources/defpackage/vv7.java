package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv7  reason: default package */
/* loaded from: classes.dex */
public final class vv7 {
    public static final List c;
    public static final List d;
    public static final List e;
    public final int a;
    public final int b;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vo7] */
    static {
        ?? obj = new Object();
        List c0 = hf.c0(0, 600, 840);
        c = c0;
        ArrayList V0 = gt0.V0(c0, hf.c0(1200, 1600));
        List c02 = hf.c0(0, 480, 900);
        d = c02;
        e = c02;
        vo7.b(obj, c0, c02);
        vo7.b(obj, V0, c02);
    }

    public vv7(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            }
            i.f(xg6.o("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
            throw null;
        }
        i.f(xg6.o("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vv7.class != obj.getClass()) {
            return false;
        }
        vv7 vv7Var = (vv7) obj;
        if (this.a == vv7Var.a && this.b == vv7Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return xg6.q(sb, this.b, ')');
    }
}
