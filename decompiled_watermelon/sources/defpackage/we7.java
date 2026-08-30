package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we7  reason: default package */
/* loaded from: classes.dex */
public final class we7 extends WindowInsetsAnimation$Callback {
    public final yv4 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public we7(yv4 yv4Var) {
        super(yv4Var.A);
        this.d = new HashMap();
        this.a = yv4Var;
    }

    public final ze7 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap hashMap = this.d;
        ze7 ze7Var = (ze7) hashMap.get(windowInsetsAnimation);
        if (ze7Var == null) {
            ze7 ze7Var2 = new ze7(0, null, 0L);
            ze7Var2.a = new xe7(windowInsetsAnimation);
            hashMap.put(windowInsetsAnimation, ze7Var2);
            return ze7Var2;
        }
        return ze7Var;
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
            WindowInsetsAnimation j = ve7.j(list.get(size));
            ze7 a = a(j);
            fraction = j.getFraction();
            a.a.e(fraction);
            this.c.add(a);
        }
        return this.a.k0(vf7.g(null, windowInsets), this.b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        wv6 l0 = this.a.l0(a(windowInsetsAnimation), new wv6(bounds));
        l0.getClass();
        ve7.l();
        return ve7.h(((x13) l0.B).e(), ((x13) l0.L).e());
    }
}
