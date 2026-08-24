package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xt7  reason: default package */
/* loaded from: classes.dex */
public final class xt7 extends WindowInsetsAnimation$Callback {
    public final f55 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public xt7(f55 f55Var) {
        super(f55Var.A);
        this.d = new HashMap();
        this.a = f55Var;
    }

    public final au7 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        au7 au7Var = (au7) hashMap.get(windowInsetsAnimation);
        if (au7Var == null) {
            au7 au7Var2 = new au7(0, null, 0L);
            au7Var2.a = new yt7(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, au7Var2);
            return au7Var2;
        }
        return au7Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.i0(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.j0(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j = zm6.j(list.get(size));
            au7 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.k0(vu7.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        rr6 l0 = this.a.l0(a(windowInsetsAnimation), new rr6(bounds));
        l0.getClass();
        zm6.l();
        return zm6.h(((e83) l0.B).e(), ((e83) l0.L).e());
    }
}
