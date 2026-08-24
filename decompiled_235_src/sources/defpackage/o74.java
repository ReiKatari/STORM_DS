package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o74  reason: default package */
/* loaded from: classes.dex */
public final class o74 implements n74 {
    public final Context A;
    public o41 B;
    public final rs4 L = new rs4(1.0f);
    public ap6 R;

    public o74(Context context) {
        this.A = context;
    }

    @Override // defpackage.l61
    public final l61 D(k61 k61Var) {
        return jw2.w(this, k61Var);
    }

    @Override // defpackage.n74
    public final float F() {
        rp6 rp6Var;
        if (this.R == null) {
            Context context = this.A;
            ja4 ja4Var = uv7.a;
            synchronized (ja4Var) {
                try {
                    Object g = ja4Var.g(context);
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        v80 c = nb3.c(-1, null, null, 6);
                        g21 g21Var = new g21(new ja1(contentResolver, uriFor, new x71(c, uj2.u(Looper.getMainLooper())), c, context, null), 7);
                        gu6 c2 = oi2.c();
                        xe1 xe1Var = xk1.a;
                        g = f04.R(g21Var, new o41(jw2.y(c2, e04.a)), new mp6(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        ja4Var.m(context, g);
                    }
                    rp6Var = (rp6) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.L.i(((Number) rp6Var.getValue()).floatValue());
            o41 o41Var = this.B;
            if (o41Var != null) {
                this.R = hv.L(o41Var, null, null, new xd1(rp6Var, this, null, 27), 3);
            } else {
                i.m("MotionDurationScale scale factor requested before recomposer loop start");
                return RecyclerView.B1;
            }
        }
        return this.L.h();
    }

    @Override // defpackage.l61
    public final l61 N(l61 l61Var) {
        return jw2.y(this, l61Var);
    }

    @Override // defpackage.l61
    public final j61 Z(k61 k61Var) {
        return jw2.p(this, k61Var);
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }
}
