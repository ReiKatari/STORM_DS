package qa;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends na.h {

    /* renamed from: r  reason: collision with root package name */
    public final RectF f12423r;

    public e(e eVar) {
        super(eVar);
        this.f12423r = eVar.f12423r;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [na.j, qa.f, android.graphics.drawable.Drawable] */
    @Override // na.h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        ?? jVar = new na.j(this);
        jVar.A0 = this;
        jVar.invalidateSelf();
        return jVar;
    }

    public e(na.n nVar, RectF rectF) {
        super(nVar);
        this.f12423r = rectF;
    }
}
