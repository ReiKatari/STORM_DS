package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx6  reason: default package */
/* loaded from: classes.dex */
public final class fx6 extends View {
    public final /* synthetic */ ViewGroup A;
    public final /* synthetic */ hx6 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx6(hx6 hx6Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.B = hx6Var;
        this.A = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        hx6 hx6Var = this.B;
        ArrayList arrayList = hx6Var.b;
        Drawable background = this.A.getBackground();
        if (background instanceof ColorDrawable) {
            i = ((ColorDrawable) background).getColor();
        } else {
            i = 0;
        }
        if (hx6Var.e != i) {
            hx6Var.e = i;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l45) arrayList.get(size)).b(i);
            }
        }
    }
}
