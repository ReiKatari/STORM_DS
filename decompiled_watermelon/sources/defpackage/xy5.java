package defpackage;

import android.view.MotionEvent;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy5  reason: default package */
/* loaded from: classes.dex */
public abstract class xy5 {
    public static final c44 a = k45.k0;

    public static final boolean a(kp4 kp4Var) {
        MotionEvent a2;
        List list = kp4Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (((rp4) list.get(i)).i == 2) {
                i++;
            } else {
                MotionEvent a3 = kp4Var.a();
                if ((a3 == null || !a3.isFromSource(8194)) && ((a2 = kp4Var.a()) == null || !a2.isFromSource(1048584))) {
                    return false;
                }
            }
        }
        return true;
    }
}
