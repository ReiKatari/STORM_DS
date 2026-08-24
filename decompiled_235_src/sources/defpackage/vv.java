package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vv  reason: default package */
/* loaded from: classes.dex */
public final class vv extends Drawable {
    public final String a;
    public final w31 b;
    public int c;
    public float d;
    public boolean e;

    public vv(String str, nb3 nb3Var, w31 w31Var) {
        this.a = str;
        this.b = w31Var;
        nb3Var.getClass();
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
        return xg6.r(sb, this.e, '}');
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
