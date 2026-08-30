package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gf1  reason: default package */
/* loaded from: classes.dex */
public final class gf1 extends ViewOutlineProvider {
    public final /* synthetic */ int a;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Outline outline2;
        switch (this.a) {
            case 0:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(RecyclerView.A1);
                return;
            case 1:
                outline.setRect(0, 0, view.getWidth(), view.getHeight());
                outline.setAlpha(RecyclerView.A1);
                return;
            case 2:
                if ((view instanceof oa7) && (outline2 = ((oa7) view).c0) != null) {
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
