package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dv  reason: default package */
/* loaded from: classes.dex */
public final class dv extends Drawable {
    public final String a;
    public final vn1 b;
    public int c;
    public float d;
    public boolean e;

    public dv(String str, pu puVar, vn1 vn1Var) {
        this.a = str;
        this.b = vn1Var;
        puVar.getClass();
    }

    public final boolean a() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (!a()) {
            return;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (!a()) {
            return 1;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (!a()) {
            return 1;
        }
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!a()) {
            return -2;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AsyncDrawable{destination='");
        sb.append(this.a);
        sb.append("', imageSize=null, result=");
        sb.append((Object) null);
        sb.append(", canvasWidth=");
        sb.append(this.c);
        sb.append(", textSize=");
        sb.append(this.d);
        sb.append(", waitingForDimensions=");
        return ej6.h(sb, this.e, '}');
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
