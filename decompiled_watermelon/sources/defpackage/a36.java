package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a36  reason: default package */
/* loaded from: classes.dex */
public final class a36 {
    public dk7 a = new Object();
    public dk7 b = new Object();
    public dk7 c = new Object();
    public dk7 d = new Object();
    public y21 e = new s(RecyclerView.A1);
    public y21 f = new s(RecyclerView.A1);
    public y21 g = new s(RecyclerView.A1);
    public y21 h = new s(RecyclerView.A1);
    public sn1 i = new sn1(0);
    public sn1 j = new sn1(0);
    public sn1 k = new sn1(0);
    public sn1 l = new sn1(0);

    public static z26 a(Context context, int i, int i2, s sVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ay4.y);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            y21 c = c(obtainStyledAttributes, 5, sVar);
            y21 c2 = c(obtainStyledAttributes, 8, c);
            y21 c3 = c(obtainStyledAttributes, 9, c);
            y21 c4 = c(obtainStyledAttributes, 7, c);
            y21 c5 = c(obtainStyledAttributes, 6, c);
            z26 z26Var = new z26();
            z26Var.a = nl2.H(i4);
            z26Var.e = c2;
            z26Var.b = nl2.H(i5);
            z26Var.f = c3;
            z26Var.c = nl2.H(i6);
            z26Var.g = c4;
            z26Var.d = nl2.H(i7);
            z26Var.h = c5;
            return z26Var;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static z26 b(Context context, AttributeSet attributeSet, int i, int i2) {
        s sVar = new s(RecyclerView.A1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ay4.r, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, sVar);
    }

    public static y21 c(TypedArray typedArray, int i, y21 y21Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue != null) {
            int i2 = peekValue.type;
            if (i2 == 5) {
                return new s(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new p85(peekValue.getFraction(1.0f, 1.0f));
            }
        }
        return y21Var;
    }

    public final boolean d() {
        if ((this.b instanceof hr5) && (this.a instanceof hr5) && (this.c instanceof hr5) && (this.d instanceof hr5)) {
            return true;
        }
        return false;
    }

    public final boolean e(RectF rectF) {
        boolean z;
        boolean z2;
        if (this.l.getClass().equals(sn1.class) && this.j.getClass().equals(sn1.class) && this.i.getClass().equals(sn1.class) && this.k.getClass().equals(sn1.class)) {
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, z26] */
    public final z26 f() {
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
