package androidx.preference;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import j7.f1;
import j7.j1;
import j7.r0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends r0 {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f1597a;

    /* renamed from: b  reason: collision with root package name */
    public int f1598b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f1599c = true;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ a0 f1600d;

    public y(a0 a0Var) {
        this.f1600d = a0Var;
    }

    @Override // j7.r0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f1 f1Var) {
        if (d(view, recyclerView)) {
            rect.bottom = this.f1598b;
        }
    }

    @Override // j7.r0
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        if (this.f1597a != null) {
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = recyclerView.getChildAt(i2);
                if (d(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f1597a.setBounds(0, height, width, this.f1598b + height);
                    this.f1597a.draw(canvas);
                }
            }
        }
    }

    public final boolean d(View view, RecyclerView recyclerView) {
        j1 L = recyclerView.L(view);
        if ((L instanceof i0) && ((i0) L).f1569y) {
            boolean z10 = this.f1599c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild < recyclerView.getChildCount() - 1) {
                j1 L2 = recyclerView.L(recyclerView.getChildAt(indexOfChild + 1));
                if ((L2 instanceof i0) && ((i0) L2).f1568x) {
                    return true;
                }
                return false;
            }
            return z10;
        }
        return false;
    }
}
