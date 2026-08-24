package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f07  reason: default package */
/* loaded from: classes.dex */
public final class f07 extends gi2 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ gi2 g;
    public final /* synthetic */ g07 h;

    public f07(g07 g07Var, Context context, TextPaint textPaint, gi2 gi2Var) {
        this.h = g07Var;
        this.e = context;
        this.f = textPaint;
        this.g = gi2Var;
    }

    @Override // defpackage.gi2
    public final void K(int i) {
        this.g.K(i);
    }

    @Override // defpackage.gi2
    public final void M(Typeface typeface, boolean z) {
        this.h.f(this.e, this.f, typeface);
        this.g.M(typeface, z);
    }
}
