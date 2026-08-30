package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jl6  reason: default package */
/* loaded from: classes.dex */
public final class jl6 extends View {
    public final /* synthetic */ ViewGroup A;
    public final /* synthetic */ ll6 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl6(ll6 ll6Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.B = ll6Var;
        this.A = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        ll6 ll6Var = this.B;
        ArrayList arrayList = ll6Var.b;
        Drawable background = this.A.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        if (ll6Var.e != i) {
            ll6Var.e = i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ev4) arrayList.get(size)).b(i);
            }
        }
    }
}
