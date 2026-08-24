package defpackage;

import android.view.MotionEvent;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ma6  reason: default package */
/* loaded from: classes.dex */
public abstract class ma6 {
    public static final fa6 a = xd5.p0;

    public static final boolean a(oy4 oy4Var) {
        MotionEvent a2;
        List list = oy4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (((vy4) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = oy4Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = oy4Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
