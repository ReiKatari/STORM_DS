package defpackage;

import android.content.Context;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ps1  reason: default package */
/* loaded from: classes.dex */
public final class ps1 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ps1(Context context) {
        boolean N = qo2.N(context, R.attr.elevationOverlayEnabled, false);
        int A = mp2.A(context, R.attr.elevationOverlayColor, 0);
        int A2 = mp2.A(context, R.attr.elevationOverlayAccentColor, 0);
        int A3 = mp2.A(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = N;
        this.b = A;
        this.c = A2;
        this.d = A3;
        this.e = f2;
    }
}
