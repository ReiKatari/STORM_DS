package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fc2  reason: default package */
/* loaded from: classes.dex */
public abstract class fc2 {
    public static final int[] a = new int[2];
    public static final Rect b = new Rect();

    public static final y55 a(View view, ee eeVar) {
        Rect rect;
        int[] iArr = a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        eeVar.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(b);
        float f2 = (i - i3) + rect.left;
        return new y55(f2, rect.top + f, rect.width() + f2, f + rect.top + rect.height());
    }

    public static final zb2 b(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i != 130) {
                                return null;
                            }
                            return new zb2(6);
                        }
                        return new zb2(4);
                    }
                    return new zb2(5);
                }
                return new zb2(3);
            }
            return new zb2(1);
        }
        return new zb2(2);
    }
}
