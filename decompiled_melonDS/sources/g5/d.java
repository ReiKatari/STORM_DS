package g5;

import android.view.View;
import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: g  reason: collision with root package name */
    public float[] f5566g;

    /* renamed from: h  reason: collision with root package name */
    public i5.b f5567h;

    @Override // g5.g
    public final void c(i5.b bVar) {
        this.f5567h = bVar;
    }

    @Override // g5.g
    public final void d(View view, float f8) {
        float[] fArr = this.f5566g;
        fArr[0] = a(f8);
        r.T(this.f5567h, view, fArr);
    }
}
