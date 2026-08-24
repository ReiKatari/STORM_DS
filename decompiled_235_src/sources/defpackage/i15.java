package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i15  reason: default package */
/* loaded from: classes.dex */
public final class i15 extends dg5 {
    public Drawable a;
    public int b;
    public boolean c = true;
    public final /* synthetic */ k15 d;

    public i15(k15 k15Var) {
        this.d = k15Var;
    }

    @Override // defpackage.dg5
    public final void a(Rect rect, View view, RecyclerView recyclerView, sg5 sg5Var) {
        if (d(view, recyclerView)) {
            rect.bottom = this.b;
        }
    }

    @Override // defpackage.dg5
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
        wg5 M = recyclerView.M(view);
        if ((M instanceof x15) && ((x15) M).y) {
            boolean z = this.c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                wg5 M2 = recyclerView.M(recyclerView.getChildAt(indexOfChild + 1));
                if ((M2 instanceof x15) && ((x15) M2).x) {
                    return true;
                }
                return false;
            }
            return z;
        }
        return false;
    }
}
