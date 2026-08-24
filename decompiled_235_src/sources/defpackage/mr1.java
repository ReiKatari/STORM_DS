package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mr1  reason: default package */
/* loaded from: classes.dex */
public final class mr1 {
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

    public mr1(Context context, int i) {
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
            f = up.e(edgeEffect);
        } else {
            f = 0.0f;
        }
        if (f == RecyclerView.B1) {
            z = true;
        }
        return !z;
    }

    public final EdgeEffect a(lo4 lo4Var) {
        EdgeEffect qs2Var;
        int i = Build.VERSION.SDK_INT;
        Context context = this.a;
        if (i >= 31) {
            qs2Var = up.a(context);
        } else {
            qs2Var = new qs2(context);
        }
        qs2Var.setColor(this.b);
        if (!q93.b(this.c, 0L)) {
            lo4 lo4Var2 = lo4.Vertical;
            long j = this.c;
            if (lo4Var == lo4Var2) {
                qs2Var.setSize((int) (j >> 32), (int) (j & 4294967295L));
                return qs2Var;
            }
            qs2Var.setSize((int) (4294967295L & j), (int) (j >> 32));
        }
        return qs2Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.e;
        if (edgeEffect == null) {
            EdgeEffect a = a(lo4.Vertical);
            this.e = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f;
        if (edgeEffect == null) {
            EdgeEffect a = a(lo4.Horizontal);
            this.f = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.g;
        if (edgeEffect == null) {
            EdgeEffect a = a(lo4.Horizontal);
            this.g = a;
            return a;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.d;
        if (edgeEffect == null) {
            EdgeEffect a = a(lo4.Vertical);
            this.d = a;
            return a;
        }
        return edgeEffect;
    }
}
