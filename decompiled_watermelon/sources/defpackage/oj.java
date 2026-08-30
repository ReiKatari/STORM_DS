package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oj  reason: default package */
/* loaded from: classes.dex */
public abstract class oj {
    public static final tv0 a = new tv0(te.e0);
    public static final tv0 b = new tv0(te.d0);

    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.cr4 r24, defpackage.ki2 r25, defpackage.dr4 r26, defpackage.et0 r27, defpackage.tu0 r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oj.a(cr4, ki2, dr4, et0, tu0, int, int):void");
    }

    public static final boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }
}
