package c8;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends Property {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Class cls, String str, int i2) {
        super(cls, str);
        this.f2619a = i2;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f2619a) {
            case 0:
                e eVar = (e) obj;
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                e eVar2 = (e) obj;
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
            case l1.c.f8511g /* 5 */:
                return Float.valueOf(e0.f2636a.p((View) obj));
            case l1.c.f8509e /* 6 */:
                return ((View) obj).getClipBounds();
            default:
                return Float.valueOf(((SwitchCompat) obj).f1003w0);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f2619a) {
            case 0:
                e eVar = (e) obj;
                PointF pointF = (PointF) obj2;
                eVar.getClass();
                eVar.f2629a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                eVar.f2630b = round;
                int i2 = eVar.f2634f + 1;
                eVar.f2634f = i2;
                if (i2 == eVar.f2635g) {
                    e0.a(eVar.f2633e, eVar.f2629a, round, eVar.f2631c, eVar.f2632d);
                    eVar.f2634f = 0;
                    eVar.f2635g = 0;
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                e eVar2 = (e) obj;
                PointF pointF2 = (PointF) obj2;
                eVar2.getClass();
                eVar2.f2631c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                eVar2.f2632d = round2;
                int i10 = eVar2.f2635g + 1;
                eVar2.f2635g = i10;
                if (eVar2.f2634f == i10) {
                    e0.a(eVar2.f2633e, eVar2.f2629a, eVar2.f2630b, eVar2.f2631c, round2);
                    eVar2.f2634f = 0;
                    eVar2.f2635g = 0;
                    return;
                }
                return;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                e0.a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                return;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                e0.a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                return;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                e0.a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                return;
            case l1.c.f8511g /* 5 */:
                float floatValue = ((Float) obj2).floatValue();
                e0.f2636a.E((View) obj, floatValue);
                return;
            case l1.c.f8509e /* 6 */:
                ((View) obj).setClipBounds((Rect) obj2);
                return;
            default:
                ((SwitchCompat) obj).setThumbPosition(((Float) obj2).floatValue());
                return;
        }
    }
}
