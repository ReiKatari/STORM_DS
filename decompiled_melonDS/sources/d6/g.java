package d6;

import a6.p0;
import a6.x0;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e f3913a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f3914b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public q5.b f3915c;

    /* renamed from: d  reason: collision with root package name */
    public q5.b f3916d;

    /* renamed from: e  reason: collision with root package name */
    public int f3917e;

    public g(ViewGroup viewGroup) {
        int i2;
        q5.b bVar = q5.b.f12282e;
        this.f3915c = bVar;
        this.f3916d = bVar;
        Drawable background = viewGroup.getBackground();
        if (background instanceof ColorDrawable) {
            i2 = ((ColorDrawable) background).getColor();
        } else {
            i2 = 0;
        }
        this.f3917e = i2;
        e eVar = new e(this, viewGroup.getContext(), viewGroup);
        this.f3913a = eVar;
        eVar.setWillNotDraw(true);
        ah.e eVar2 = new ah.e(8, this);
        WeakHashMap weakHashMap = x0.f533a;
        p0.k(eVar, eVar2);
        x0.q(eVar, new f(this));
        viewGroup.addView(eVar, 0);
    }
}
