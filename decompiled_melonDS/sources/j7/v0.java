package j7;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class v0 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a  reason: collision with root package name */
    public j1 f7722a;

    /* renamed from: b  reason: collision with root package name */
    public final Rect f7723b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f7724c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7725d;

    public v0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7723b = new Rect();
        this.f7724c = true;
        this.f7725d = false;
    }

    public v0(int i2, int i10) {
        super(i2, i10);
        this.f7723b = new Rect();
        this.f7724c = true;
        this.f7725d = false;
    }

    public v0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f7723b = new Rect();
        this.f7724c = true;
        this.f7725d = false;
    }

    public v0(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7723b = new Rect();
        this.f7724c = true;
        this.f7725d = false;
    }

    public v0(v0 v0Var) {
        super((ViewGroup.LayoutParams) v0Var);
        this.f7723b = new Rect();
        this.f7724c = true;
        this.f7725d = false;
    }
}
