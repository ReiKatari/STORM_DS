package g3;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f5512a = new int[2];

    /* renamed from: b  reason: collision with root package name */
    public static final Rect f5513b = new Rect();

    public static final h3.c a(View view, b4.x xVar) {
        Rect rect;
        int[] iArr = f5512a;
        view.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i10 = iArr[1];
        xVar.getLocationInWindow(iArr);
        int i11 = iArr[0];
        float f8 = i10 - iArr[1];
        view.getFocusedRect(f5513b);
        float f10 = (i2 - i11) + rect.left;
        return new h3.c(f10, rect.top + f8, rect.width() + f10, f8 + rect.top + rect.height());
    }

    public static final f b(int i2) {
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                return null;
                            }
                            return new f(6);
                        }
                        return new f(4);
                    }
                    return new f(5);
                }
                return new f(3);
            }
            return new f(1);
        }
        return new f(2);
    }
}
