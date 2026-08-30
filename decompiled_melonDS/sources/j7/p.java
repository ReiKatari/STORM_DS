package j7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends r0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7645d = {16843284};

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f7646a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7647b;

    /* renamed from: c  reason: collision with root package name */
    public final Rect f7648c = new Rect();

    public p(Context context, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f7645d);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.f7646a = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        if (i2 != 0 && i2 != 1) {
            a0.j.h("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
            throw null;
        } else {
            this.f7647b = i2;
        }
    }

    @Override // j7.r0
    public final void a(Rect rect, View view, RecyclerView recyclerView, f1 f1Var) {
        Drawable drawable = this.f7646a;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f7647b == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // j7.r0
    public final void b(Canvas canvas, RecyclerView recyclerView) {
        Drawable drawable;
        int height;
        int i2;
        int width;
        int i10;
        if (recyclerView.getLayoutManager() != null && (drawable = this.f7646a) != null) {
            int i11 = 0;
            int i12 = this.f7647b;
            Rect rect = this.f7648c;
            if (i12 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i10 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i10, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i10 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i11 < childCount) {
                    View childAt = recyclerView.getChildAt(i11);
                    RecyclerView.N(childAt, rect);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    drawable.setBounds(i10, round - drawable.getIntrinsicHeight(), width, round);
                    drawable.draw(canvas);
                    i11++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i2 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i11);
                recyclerView.getLayoutManager().y(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                drawable.setBounds(round2 - drawable.getIntrinsicWidth(), i2, round2, height);
                drawable.draw(canvas);
                i11++;
            }
            canvas.restore();
        }
    }
}
