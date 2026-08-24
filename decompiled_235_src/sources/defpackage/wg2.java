package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg2  reason: default package */
/* loaded from: classes.dex */
public abstract class wg2 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final of5 a(View view, te teVar) {
        Rect rect;
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        teVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + rect.left;
        return new of5(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final qg2 b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new qg2(6);
                        }
                        return new qg2(4);
                    }
                    return new qg2(5);
                }
                return new qg2(3);
            }
            return new qg2(1);
        }
        return new qg2(2);
    }
}
