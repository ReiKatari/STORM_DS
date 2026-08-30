package f1;

import android.view.View;
import android.widget.Magnifier;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q1 implements o1 {

    /* renamed from: b  reason: collision with root package name */
    public static final q1 f4642b = new q1(0);

    /* renamed from: c  reason: collision with root package name */
    public static final q1 f4643c = new q1(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4644a;

    public /* synthetic */ q1(int i2) {
        this.f4644a = i2;
    }

    @Override // f1.o1
    public final boolean a() {
        switch (this.f4644a) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // f1.o1
    public final n1 b(View view, x4.c cVar) {
        switch (this.f4644a) {
            case 0:
                return new p1(new Magnifier(view));
            default:
                return new p1(new Magnifier(view));
        }
    }
}
