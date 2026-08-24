package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml0  reason: default package */
/* loaded from: classes.dex */
public final class ml0 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ml0(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                pl0 pl0Var = (pl0) obj;
                return null;
            case 1:
                pl0 pl0Var2 = (pl0) obj;
                return null;
            case 2:
                View view = (View) obj;
                return null;
            case 3:
                View view2 = (View) obj;
                return null;
            case 4:
                View view3 = (View) obj;
                return null;
            case 5:
                return Float.valueOf(((SwitchCompat) obj).y0);
            case 6:
                return Float.valueOf(dq7.a.K((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                pl0 pl0Var = (pl0) obj;
                PointF pointF = (PointF) obj2;
                pl0Var.getClass();
                pl0Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                pl0Var.b = round;
                int i = pl0Var.f + 1;
                pl0Var.f = i;
                if (i == pl0Var.g) {
                    dq7.a(pl0Var.e, pl0Var.a, round, pl0Var.c, pl0Var.d);
                    pl0Var.f = 0;
                    pl0Var.g = 0;
                    return;
                }
                return;
            case 1:
                pl0 pl0Var2 = (pl0) obj;
                PointF pointF2 = (PointF) obj2;
                pl0Var2.getClass();
                pl0Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                pl0Var2.d = round2;
                int i2 = pl0Var2.g + 1;
                pl0Var2.g = i2;
                if (pl0Var2.f == i2) {
                    dq7.a(pl0Var2.e, pl0Var2.a, pl0Var2.b, pl0Var2.c, round2);
                    pl0Var2.f = 0;
                    pl0Var2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                dq7.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                dq7.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                dq7.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case 6:
                float floatValue = ((Float) obj2).floatValue();
                dq7.a.Y((View) obj, floatValue);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
