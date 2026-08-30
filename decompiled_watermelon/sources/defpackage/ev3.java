package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ev3  reason: default package */
/* loaded from: classes.dex */
public class ev3 extends Drawable.ConstantState {
    public a36 a;
    public ie6 b;
    public fo1 c;
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

    public ev3(ev3 ev3Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = RecyclerView.A1;
        this.n = RecyclerView.A1;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = ev3Var.a;
        this.b = ev3Var.b;
        this.c = ev3Var.c;
        this.k = ev3Var.k;
        this.d = ev3Var.d;
        this.e = ev3Var.e;
        this.g = ev3Var.g;
        this.f = ev3Var.f;
        this.l = ev3Var.l;
        this.i = ev3Var.i;
        this.p = ev3Var.p;
        this.j = ev3Var.j;
        this.m = ev3Var.m;
        this.n = ev3Var.n;
        this.o = ev3Var.o;
        this.q = ev3Var.q;
        if (ev3Var.h != null) {
            this.h = new Rect(ev3Var.h);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        gv3 gv3Var = new gv3(this);
        gv3Var.Y = true;
        gv3Var.Z = true;
        return gv3Var;
    }

    public ev3(a36 a36Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = RecyclerView.A1;
        this.n = RecyclerView.A1;
        this.o = 0;
        this.p = 0;
        this.q = Paint.Style.FILL_AND_STROKE;
        this.a = a36Var;
        this.c = null;
    }
}
