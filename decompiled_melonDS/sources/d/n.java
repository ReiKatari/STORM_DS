package d;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static q8.r f3306a;

    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(128, 27, 27, 27);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(l.i iVar, c0 c0Var) {
        q8.r rVar;
        a7.a aVar = new a7.a(14);
        c0 c0Var2 = new c0(0, 0, aVar);
        View decorView = iVar.getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean booleanValue = ((Boolean) aVar.k(resources)).booleanValue();
        mc.l lVar = c0Var.f3289c;
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean booleanValue2 = ((Boolean) lVar.k(resources2)).booleanValue();
        q8.r rVar2 = f3306a;
        q8.r rVar3 = rVar2;
        if (rVar2 == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 35) {
                rVar = new Object();
            } else if (i2 >= 30) {
                rVar = new Object();
            } else if (i2 >= 29) {
                rVar = new Object();
            } else if (i2 >= 28) {
                rVar = new Object();
            } else if (i2 >= 26) {
                rVar = new Object();
            } else {
                rVar = new Object();
            }
            f3306a = rVar;
            rVar3 = rVar;
        }
        q8.r rVar4 = rVar3;
        Window window = iVar.getWindow();
        window.getClass();
        rVar4.U(c0Var2, c0Var, window, decorView, booleanValue, booleanValue2);
        Window window2 = iVar.getWindow();
        window2.getClass();
        rVar4.i(window2);
    }
}
