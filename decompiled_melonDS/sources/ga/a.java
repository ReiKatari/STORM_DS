package ga;

import android.content.Context;
import k0.d;
import l0.f;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final int f5630f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5631a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5632b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5633c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5634d;

    /* renamed from: e  reason: collision with root package name */
    public final float f5635e;

    public a(Context context) {
        boolean J = d.J(context, R.attr.elevationOverlayEnabled, false);
        int l10 = f.l(context, R.attr.elevationOverlayColor, 0);
        int l11 = f.l(context, R.attr.elevationOverlayAccentColor, 0);
        int l12 = f.l(context, R.attr.colorSurface, 0);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f5631a = J;
        this.f5632b = l10;
        this.f5633c = l11;
        this.f5634d = l12;
        this.f5635e = f8;
    }
}
