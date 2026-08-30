package a6;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a  reason: collision with root package name */
    public final pd.g f489a;

    /* renamed from: b  reason: collision with root package name */
    public List f490b;

    /* renamed from: c  reason: collision with root package name */
    public ArrayList f491c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f492d;

    public m1(pd.g gVar) {
        super(gVar.B);
        this.f492d = new HashMap();
        this.f489a = gVar;
    }

    public final p1 a(WindowInsetsAnimation windowInsetsAnimation) {
        p1 p1Var = (p1) this.f492d.get(windowInsetsAnimation);
        if (p1Var == null) {
            p1Var = new p1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                p1Var.f502a = new n1(windowInsetsAnimation);
            }
            this.f492d.put(windowInsetsAnimation, p1Var);
        }
        return p1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f489a.a(a(windowInsetsAnimation));
        this.f492d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f489a.b(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f491c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f491c = arrayList2;
            this.f490b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation j2 = c0.j(list.get(size));
            p1 a10 = a(j2);
            fraction = j2.getFraction();
            a10.f502a.e(fraction);
            this.f491c.add(a10);
        }
        return this.f489a.c(i2.g(null, windowInsets), this.f490b).f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        a0.g d4 = this.f489a.d(a(windowInsetsAnimation), new a0.g(bounds));
        d4.getClass();
        c0.l();
        return c0.h(((q5.b) d4.B).e(), ((q5.b) d4.L).e());
    }
}
