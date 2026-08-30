package ka;

import android.graphics.Typeface;
import l0.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends p5.b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ f f8110h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ d f8111i;

    public b(d dVar, f fVar) {
        this.f8111i = dVar;
        this.f8110h = fVar;
    }

    @Override // p5.b
    public final void i(int i2) {
        this.f8111i.f8128n = true;
        this.f8110h.x(i2);
    }

    @Override // p5.b
    public final void j(Typeface typeface) {
        d dVar = this.f8111i;
        Typeface create = Typeface.create(typeface, dVar.f8119d);
        dVar.f8130p = create;
        dVar.f8128n = true;
        this.f8110h.y(create, false);
    }
}
