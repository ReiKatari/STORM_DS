package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: me6  reason: default package */
/* loaded from: classes.dex */
public final class me6 {
    public q60 a = new Object();
    public q60 b = new Object();
    public q60 c = new Object();
    public q60 d = new Object();
    public f61 e = new t(RecyclerView.B1);
    public f61 f = new t(RecyclerView.B1);
    public f61 g = new t(RecyclerView.B1);
    public f61 h = new t(RecyclerView.B1);
    public cs1 i = new cs1(0);
    public cs1 j = new cs1(0);
    public cs1 k = new cs1(0);
    public cs1 l = new cs1(0);

    public static le6 a(Context context, int i, int i2, t tVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(a75.y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            f61 c = c(obtainStyledAttributes, 5, tVar);
            f61 c2 = c(obtainStyledAttributes, 8, c);
            f61 c3 = c(obtainStyledAttributes, 9, c);
            f61 c4 = c(obtainStyledAttributes, 7, c);
            f61 c5 = c(obtainStyledAttributes, 6, c);
            le6 le6Var = new le6();
            le6Var.a = jx2.r(i4);
            le6Var.e = c2;
            le6Var.b = jx2.r(i5);
            le6Var.f = c3;
            le6Var.c = jx2.r(i6);
            le6Var.g = c4;
            le6Var.d = jx2.r(i7);
            le6Var.h = c5;
            return le6Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static le6 b(Context context, AttributeSet attributeSet, int i, int i2) {
        t tVar = new t(RecyclerView.B1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a75.r, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, tVar);
    }

    public static f61 c(TypedArray typedArray, int i, f61 f61Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new t(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new ei5(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return f61Var;
    }

    public final boolean d() {
        if ((this.b instanceof a26) && (this.a instanceof a26) && (this.c instanceof a26) && (this.d instanceof a26)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.l.getClass().equals(cs1.class) && this.j.getClass().equals(cs1.class) && this.i.getClass().equals(cs1.class) && this.k.getClass().equals(cs1.class)) {
            z = true;
        } else {
            z = false;
        }
        float a = this.e.a(rectF);
        if (this.f.a(rectF) == a && this.h.a(rectF) == a && this.g.a(rectF) == a) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || !z2 || !d()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, le6] */
    public final le6 f() {
        ?? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        obj.i = this.i;
        obj.j = this.j;
        obj.k = this.k;
        obj.l = this.l;
        return obj;
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
