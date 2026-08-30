package f1;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f4577a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4578b;

    /* renamed from: c  reason: collision with root package name */
    public long f4579c = 0;

    /* renamed from: d  reason: collision with root package name */
    public EdgeEffect f4580d;

    /* renamed from: e  reason: collision with root package name */
    public EdgeEffect f4581e;

    /* renamed from: f  reason: collision with root package name */
    public EdgeEffect f4582f;

    /* renamed from: g  reason: collision with root package name */
    public EdgeEffect f4583g;

    /* renamed from: h  reason: collision with root package name */
    public EdgeEffect f4584h;

    /* renamed from: i  reason: collision with root package name */
    public EdgeEffect f4585i;

    /* renamed from: j  reason: collision with root package name */
    public EdgeEffect f4586j;

    /* renamed from: k  reason: collision with root package name */
    public EdgeEffect f4587k;

    public i0(Context context, int i2) {
        this.f4577a = context;
        this.f4578b = i2;
    }

    public static boolean f(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    public static boolean g(EdgeEffect edgeEffect) {
        float f8;
        boolean z10 = false;
        if (edgeEffect == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            f8 = l.b(edgeEffect);
        } else {
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            z10 = true;
        }
        return !z10;
    }

    public final EdgeEffect a(h1.n1 n1Var) {
        EdgeEffect n0Var;
        int i2 = Build.VERSION.SDK_INT;
        Context context = this.f4577a;
        if (i2 >= 31) {
            n0Var = l.a(context);
        } else {
            n0Var = new n0(context);
        }
        n0Var.setColor(this.f4578b);
        if (!x4.l.b(this.f4579c, 0L)) {
            h1.n1 n1Var2 = h1.n1.Vertical;
            long j2 = this.f4579c;
            if (n1Var == n1Var2) {
                n0Var.setSize((int) (j2 >> 32), (int) (j2 & 4294967295L));
                return n0Var;
            }
            n0Var.setSize((int) (4294967295L & j2), (int) (j2 >> 32));
        }
        return n0Var;
    }

    public final EdgeEffect b() {
        EdgeEffect edgeEffect = this.f4581e;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(h1.n1.Vertical);
            this.f4581e = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect c() {
        EdgeEffect edgeEffect = this.f4582f;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(h1.n1.Horizontal);
            this.f4582f = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect d() {
        EdgeEffect edgeEffect = this.f4583g;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(h1.n1.Horizontal);
            this.f4583g = a10;
            return a10;
        }
        return edgeEffect;
    }

    public final EdgeEffect e() {
        EdgeEffect edgeEffect = this.f4580d;
        if (edgeEffect == null) {
            EdgeEffect a10 = a(h1.n1.Vertical);
            this.f4580d = a10;
            return a10;
        }
        return edgeEffect;
    }
}
