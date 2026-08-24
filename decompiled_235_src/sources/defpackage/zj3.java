package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zj3  reason: default package */
/* loaded from: classes.dex */
public final class zj3 {
    public final View a;
    public final nj3 b;
    public float c;
    public boolean d;

    public zj3(View view, nj3 nj3Var) {
        view.getClass();
        nj3Var.getClass();
        this.a = view;
        this.b = nj3Var;
        this.c = 1.0f;
    }

    public final my4 a() {
        my4 my4Var = new my4(0, 0);
        View view = this.a;
        my4Var.a = (int) view.getX();
        my4Var.b = (int) view.getY();
        return my4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Rect b() {
        FrameLayout.LayoutParams layoutParams;
        int i;
        int i2;
        float x;
        int i3;
        float y;
        int i4;
        View view = this.a;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        int i5 = 0;
        if (width > 0) {
            i = width;
        } else if (layoutParams == null || (i = layoutParams.width) < 0) {
            i = 0;
        }
        if (height > 0) {
            i5 = height;
        } else if (layoutParams != null && (i2 = layoutParams.height) >= 0) {
            i5 = i2;
        }
        if (width > 0) {
            x = view.getX();
        } else if (layoutParams != null) {
            i3 = layoutParams.leftMargin;
            if (height <= 0) {
                y = view.getY();
            } else if (layoutParams != null) {
                i4 = layoutParams.topMargin;
                return new Rect(i3, i4, i, i5);
            } else {
                y = view.getY();
            }
            i4 = (int) y;
            return new Rect(i3, i4, i, i5);
        } else {
            x = view.getX();
        }
        i3 = (int) x;
        if (height <= 0) {
        }
        i4 = (int) y;
        return new Rect(i3, i4, i, i5);
    }

    public final void c(boolean z) {
        this.a.setSelected(z);
    }
}
