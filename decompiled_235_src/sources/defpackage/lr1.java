package defpackage;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr1  reason: default package */
/* loaded from: classes.dex */
public abstract class lr1 {
    public static final float a = ViewConfiguration.getScrollFriction();
    public static final double b;
    public static final double c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        b = log;
        c = log - 1.0d;
    }
}
