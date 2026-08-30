package ka;

import android.graphics.Typeface;
import d2.t;
import l0.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: c0  reason: collision with root package name */
    public final Typeface f8107c0;

    /* renamed from: d0  reason: collision with root package name */
    public final t f8108d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f8109e0;

    public a(t tVar, Typeface typeface) {
        this.f8107c0 = typeface;
        this.f8108d0 = tVar;
    }

    @Override // l0.f
    public final void x(int i2) {
        if (!this.f8109e0) {
            ha.b bVar = (ha.b) this.f8108d0.B;
            if (bVar.l(this.f8107c0)) {
                bVar.j(false);
            }
        }
    }

    @Override // l0.f
    public final void y(Typeface typeface, boolean z10) {
        if (!this.f8109e0) {
            ha.b bVar = (ha.b) this.f8108d0.B;
            if (bVar.l(typeface)) {
                bVar.j(false);
            }
        }
    }
}
