package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kj1  reason: default package */
/* loaded from: classes.dex */
public final class kj1 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(RecyclerView.B1);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(RecyclerView.B1);
                return;
            case 2:
                if ((view instanceof oo7) && (outline2 = ((oo7) view).d0) != null) {
                    outline.set(outline2);
                    return;
                }
                return;
            default:
                view.getClass();
                throw new ClassCastException();
        }
    }
}
