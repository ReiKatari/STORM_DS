package j7;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a  reason: collision with root package name */
    public int f7541a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7542b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f7543c;

    public e0(u0 u0Var) {
        this.f7541a = Integer.MIN_VALUE;
        this.f7543c = new Rect();
        this.f7542b = u0Var;
    }

    public static e0 b(u0 u0Var, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new d0(u0Var, 1);
            }
            a0.j.h("invalid orientation");
            return null;
        }
        return new d0(u0Var, 0);
    }

    public abstract void a(t7.a aVar);

    public abstract void c(t7.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i2);

    public abstract void r(t7.a aVar);

    public abstract void s(t7.a aVar);

    public abstract void t(t7.a aVar);

    public abstract void u(t7.a aVar);

    public abstract a0.l v(t7.a aVar);

    public e0(String str, int i2, String str2) {
        this.f7541a = i2;
        this.f7542b = str;
        this.f7543c = str2;
    }

    public e0(m6.h hVar) {
        this.f7541a = 0;
        this.f7543c = new m6.d();
        this.f7542b = hVar;
    }
}
