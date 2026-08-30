package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tn6  reason: default package */
/* loaded from: classes.dex */
public final class tn6 extends yf2 {
    public final /* synthetic */ Context e;
    public final /* synthetic */ TextPaint f;
    public final /* synthetic */ yf2 g;
    public final /* synthetic */ un6 h;

    public tn6(un6 un6Var, Context context, TextPaint textPaint, yf2 yf2Var) {
        this.h = un6Var;
        this.e = context;
        this.f = textPaint;
        this.g = yf2Var;
    }

    @Override // defpackage.yf2
    public final void J(int i) {
        this.g.J(i);
    }

    @Override // defpackage.yf2
    public final void K(Typeface typeface, boolean z) {
        this.h.f(this.e, this.f, typeface);
        this.g.K(typeface, z);
    }
}
