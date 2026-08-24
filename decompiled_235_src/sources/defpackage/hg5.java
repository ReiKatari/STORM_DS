package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hg5  reason: default package */
/* loaded from: classes.dex */
public class hg5 extends ViewGroup.MarginLayoutParams {
    public wg5 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public hg5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hg5(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hg5(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hg5(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public hg5(hg5 hg5Var) {
        super((ViewGroup.LayoutParams) hg5Var);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
