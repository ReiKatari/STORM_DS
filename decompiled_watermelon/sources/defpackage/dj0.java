package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dj0  reason: default package */
/* loaded from: classes.dex */
public final class dj0 extends Property {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj0(String str, int i, Class cls) {
        super(cls, str);
        this.a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                gj0 gj0Var = (gj0) obj;
                return null;
            case 1:
                gj0 gj0Var2 = (gj0) obj;
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
                return Float.valueOf(((SwitchCompat) obj).x0);
            case ig7.b /* 6 */:
                return Float.valueOf(cc7.a.C((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                gj0 gj0Var = (gj0) obj;
                PointF pointF = (PointF) obj2;
                gj0Var.getClass();
                gj0Var.a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                gj0Var.b = round;
                int i = gj0Var.f + 1;
                gj0Var.f = i;
                if (i == gj0Var.g) {
                    cc7.a(gj0Var.e, gj0Var.a, round, gj0Var.c, gj0Var.d);
                    gj0Var.f = 0;
                    gj0Var.g = 0;
                    return;
                }
                return;
            case 1:
                gj0 gj0Var2 = (gj0) obj;
                PointF pointF2 = (PointF) obj2;
                gj0Var2.getClass();
                gj0Var2.c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                gj0Var2.d = round2;
                int i2 = gj0Var2.g + 1;
                gj0Var2.g = i2;
                if (gj0Var2.f == i2) {
                    cc7.a(gj0Var2.e, gj0Var2.a, gj0Var2.b, gj0Var2.c, round2);
                    gj0Var2.f = 0;
                    gj0Var2.g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                cc7.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                cc7.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                cc7.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case 5:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
            case ig7.b /* 6 */:
                float floatValue = ((Float) obj2).floatValue();
                cc7.a.O((View) obj, floatValue);
                return;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
        }
    }
}
