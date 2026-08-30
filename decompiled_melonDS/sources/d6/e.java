package d6;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends View {
    public final /* synthetic */ ViewGroup A;
    public final /* synthetic */ g B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.B = gVar;
        this.A = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i2;
        g gVar = this.B;
        ArrayList arrayList = gVar.f3914b;
        Drawable background = this.A.getBackground();
        if (background instanceof ColorDrawable) {
            i2 = ((ColorDrawable) background).getColor();
        } else {
            i2 = 0;
        }
        if (gVar.f3917e != i2) {
            gVar.f3917e = i2;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).b(i2);
            }
        }
    }
}
