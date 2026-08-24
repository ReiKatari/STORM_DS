package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uu3  reason: default package */
/* loaded from: classes.dex */
public final class uu3 {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        a(RecyclerView.B1);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public static void a(float f) {
        if ((RecyclerView.B1 <= f && f <= 1.0f) || f == -1.0f) {
            return;
        }
        q53.c("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f) {
        if (f == RecyclerView.B1) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (f == b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (f == c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (f == d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return "LineHeightStyle.Alignment(topPercentage = " + f + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uu3) {
            if (Float.compare(this.a, ((uu3) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
