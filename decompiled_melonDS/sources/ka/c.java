package ka;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import l0.f;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends f {

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Context f8112c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ TextPaint f8113d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ f f8114e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ d f8115f0;

    public c(d dVar, Context context, TextPaint textPaint, f fVar) {
        this.f8115f0 = dVar;
        this.f8112c0 = context;
        this.f8113d0 = textPaint;
        this.f8114e0 = fVar;
    }

    @Override // l0.f
    public final void x(int i2) {
        this.f8114e0.x(i2);
    }

    @Override // l0.f
    public final void y(Typeface typeface, boolean z10) {
        this.f8115f0.f(this.f8112c0, this.f8113d0, typeface);
        this.f8114e0.y(typeface, z10);
    }
}
