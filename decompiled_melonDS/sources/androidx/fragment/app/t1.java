package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends Transition.EpicenterCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1416a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Rect f1417b;

    public /* synthetic */ t1(int i2, Rect rect) {
        this.f1416a = i2;
        this.f1417b = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public final Rect onGetEpicenter(Transition transition) {
        switch (this.f1416a) {
            case 0:
                return this.f1417b;
            default:
                Rect rect = this.f1417b;
                if (rect.isEmpty()) {
                    return null;
                }
                return rect;
        }
    }
}
