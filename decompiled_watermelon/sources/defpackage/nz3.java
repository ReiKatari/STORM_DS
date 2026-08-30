package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nz3  reason: default package */
/* loaded from: classes.dex */
public final class nz3 implements mz3 {
    public final Context A;
    public g11 B;
    public final pj4 L = new pj4(1.0f);
    public kd6 R;

    public nz3(Context context) {
        this.A = context;
    }

    @Override // defpackage.e31
    public final e31 C(e31 e31Var) {
        return se.O(this, e31Var);
    }

    @Override // defpackage.e31
    public final c31 I(d31 d31Var) {
        return se.z(this, d31Var);
    }

    @Override // defpackage.e31
    public final Object N(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.e31
    public final e31 T(d31 d31Var) {
        return se.J(this, d31Var);
    }

    @Override // defpackage.mz3
    public final float V() {
        ce6 ce6Var;
        if (this.R == null) {
            Context context = this.A;
            d24 d24Var = ug7.a;
            synchronized (d24Var) {
                try {
                    Object g = d24Var.g(context);
                    if (g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        q60 f = n40.f(-1, null, null, 6);
                        bz0 bz0Var = new bz0(6, new my1(contentResolver, uriFor, new n41(f, me2.n(Looper.getMainLooper())), f, context, null));
                        mi6 c = hi2.c();
                        bb1 bb1Var = tg1.a;
                        g = se.V(bz0Var, new g11(se.O(c, bt3.a)), new xd6(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        d24Var.m(context, g);
                    }
                    ce6Var = (ce6) g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.L.i(((Number) ce6Var.getValue()).floatValue());
            g11 g11Var = this.B;
            if (g11Var != null) {
                this.R = tq5.w(g11Var, null, null, new ba1(ce6Var, this, null, 26), 3);
            } else {
                i.n("MotionDurationScale scale factor requested before recomposer loop start");
                return RecyclerView.A1;
            }
        }
        return this.L.h();
    }
}
