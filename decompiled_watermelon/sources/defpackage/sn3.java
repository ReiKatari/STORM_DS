package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn3  reason: default package */
/* loaded from: classes.dex */
public final class sn3 {
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a;

    static {
        a(RecyclerView.A1);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }

    public static void a(float f) {
        if ((RecyclerView.A1 <= f && f <= 1.0f) || f == -1.0f) {
            return;
        }
        nz2.c("topRatio should be in [0..1] range or -1");
    }

    public static String b(float f) {
        if (f == RecyclerView.A1) {
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
        if (obj instanceof sn3) {
            if (Float.compare(this.a, ((sn3) obj).a) != 0) {
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
