package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vg7  reason: default package */
/* loaded from: classes.dex */
public final class vg7 {
    public static final /* synthetic */ int c = 0;
    public final int a;
    public final int b;

    static {
        jo1 jo1Var = new jo1(29);
        List c0 = l07.c0(0, 600, 840);
        ArrayList X0 = tq0.X0(c0, l07.c0(1200, 1600));
        List c02 = l07.c0(0, 480, 900);
        jo1.m(jo1Var, c0, c02);
        jo1.m(jo1Var, X0, c02);
    }

    public vg7(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i >= 0) {
            if (i2 >= 0) {
                return;
            }
            i.g(ej6.e("Expected minHeightDp to be at least 0, minHeightDp: ", i2, '.'));
            throw null;
        }
        i.g(ej6.e("Expected minWidthDp to be at least 0, minWidthDp: ", i, '.'));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vg7.class != obj.getClass()) {
            return false;
        }
        vg7 vg7Var = (vg7) obj;
        if (this.a == vg7Var.a && this.b == vg7Var.b) {
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
        return ej6.g(sb, this.b, ')');
    }
}
