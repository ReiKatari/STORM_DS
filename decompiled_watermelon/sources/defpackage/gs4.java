package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gs4  reason: default package */
/* loaded from: classes.dex */
public final class gs4 extends n65 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ is4 d;

    public gs4(is4 is4Var) {
        this.d = is4Var;
    }

    @Override // defpackage.n65
    public final void a(Rect rect, View view, RecyclerView recyclerView, c75 c75Var) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.n65
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (d(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.a.setBounds(0, height, width, this.b + height);
                    this.a.draw(canvas);
                }
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        g75 M = recyclerView.M(view);
        if ((M instanceof vs4) && ((vs4) M).y) {
            boolean z = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                g75 M2 = recyclerView.M(recyclerView.getChildAt(indexOfChild + 1));
                if ((M2 instanceof vs4) && ((vs4) M2).x) {
                    return true;
                }
                return false;
            }
            return z;
        }
        return false;
    }
}
