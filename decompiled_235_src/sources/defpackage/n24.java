package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n24  reason: default package */
/* loaded from: classes.dex */
public class n24 extends Drawable.ConstantState {
    public me6 a;
    public xp6 b;
    public ps1 c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public final Paint.Style q;

    public n24(n24 n24Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = RecyclerView.B1;
        this.n = RecyclerView.B1;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = n24Var.a;
        this.b = n24Var.b;
        this.c = n24Var.c;
        this.k = n24Var.k;
        this.d = n24Var.d;
        this.e = n24Var.e;
        this.g = n24Var.g;
        this.f = n24Var.f;
        this.l = n24Var.l;
        this.i = n24Var.i;
        this.p = n24Var.p;
        this.j = n24Var.j;
        this.m = n24Var.m;
        this.n = n24Var.n;
        this.o = n24Var.o;
        this.q = n24Var.q;
        if (n24Var.h != null) {
            this.h = new Rect(n24Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        p24 p24Var = new p24(this);
        p24Var.Y = true;
        p24Var.Z = true;
        return p24Var;
    }

    public n24(me6 me6Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = RecyclerView.B1;
        this.n = RecyclerView.B1;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = me6Var;
        this.c = null;
    }
}
