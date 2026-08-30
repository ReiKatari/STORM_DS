package defpackage;

import android.content.Context;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fo1  reason: default package */
/* loaded from: classes.dex */
public final class fo1 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public fo1(Context context) {
        boolean P = hk2.P(context, R.attr.elevationOverlayEnabled, false);
        int w = jk2.w(context, R.attr.elevationOverlayColor, 0);
        int w2 = jk2.w(context, R.attr.elevationOverlayAccentColor, 0);
        int w3 = jk2.w(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = P;
        this.b = w;
        this.c = w2;
        this.d = w3;
        this.e = f2;
    }
}
