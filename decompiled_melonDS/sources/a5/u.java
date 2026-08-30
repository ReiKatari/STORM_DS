package a5;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.b0 f433a = new n2.b0(g.X);

    /* renamed from: b  reason: collision with root package name */
    public static final n2.b0 f434b = new n2.b0(g.R);

    /* JADX WARN: Removed duplicated region for block: B:104:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(a5.q0 r23, mc.a r24, a5.r0 r25, v2.c r26, n2.m r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.u.a(a5.q0, mc.a, a5.r0, v2.c, n2.m, int, int):void");
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
