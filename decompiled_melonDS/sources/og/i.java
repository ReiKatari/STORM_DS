package og;

import android.view.View;
import oe.a0;
import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final View f11005a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.c f11006b;

    /* renamed from: c  reason: collision with root package name */
    public float f11007c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f11008d;

    public i(View view, ve.c cVar) {
        view.getClass();
        cVar.getClass();
        this.f11005a = view;
        this.f11006b = cVar;
        this.f11007c = 1.0f;
    }

    public final a0 a() {
        a0 a0Var = new a0(0, 0);
        View view = this.f11005a;
        a0Var.f10908a = (int) view.getX();
        a0Var.f10909b = (int) view.getY();
        return a0Var;
    }

    public final b0 b() {
        View view = this.f11005a;
        return new b0((int) view.getX(), (int) view.getY(), view.getWidth(), view.getHeight());
    }
}
