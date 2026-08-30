package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gn1  reason: default package */
/* loaded from: classes.dex */
public final class gn1 {
    public final Context a;
    public final int b;
    public long c = 0;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;

    public gn1(Context context, int i) {
        this.a = context;
        this.b = i;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f;
        boolean z = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f = ip.e(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.A1) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(jf4 jf4Var) {
        EdgeEffect lm2Var;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            lm2Var = ip.a(context);
        } else {
            lm2Var = new lm2(context);
        }
        lm2Var.setColor(this.b);
        if (!i33.b(this.c, 0L)) {
            jf4 jf4Var2 = jf4.Vertical;
            long j = this.c;
            if (jf4Var == jf4Var2) {
                lm2Var.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return lm2Var;
            }
            lm2Var.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return lm2Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a = a(jf4.Vertical);
            this.e = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect a = a(jf4.Horizontal);
            this.f = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect a = a(jf4.Horizontal);
            this.g = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect a = a(jf4.Vertical);
            this.d = a;
            return a;
        }
        return edgeEffect;
    }
}
