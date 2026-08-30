package c8;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f2665a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2666b;

    public k(View view, ArrayList arrayList) {
        this.f2665a = view;
        this.f2666b = arrayList;
    }

    @Override // c8.r
    public final void a(t tVar) {
        tVar.D(this);
        this.f2665a.setVisibility(8);
        ArrayList arrayList = this.f2666b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((View) arrayList.get(i2)).setVisibility(0);
        }
    }

    @Override // c8.r
    public final void f(t tVar) {
        tVar.D(this);
        tVar.a(this);
    }

    @Override // c8.r
    public final void b() {
    }

    @Override // c8.r
    public final void c() {
    }

    @Override // c8.r
    public final void e(t tVar) {
    }
}
