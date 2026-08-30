package f1;

import android.view.ViewConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f4563a = ViewConfiguration.getScrollFriction();

    /* renamed from: b  reason: collision with root package name */
    public static final double f4564b;

    /* renamed from: c  reason: collision with root package name */
    public static final double f4565c;

    static {
        double log = Math.log(0.78d) / Math.log(0.9d);
        f4564b = log;
        f4565c = log - 1.0d;
    }
}
