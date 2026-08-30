package lj;

import a6.g1;
import androidx.appcompat.widget.ActionBarContextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements g1 {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9168a;

    /* renamed from: b  reason: collision with root package name */
    public int f9169b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f9170c;

    public b() {
        this.f9170c = new byte[65536];
    }

    @Override // a6.g1
    public void a() {
        if (this.f9168a) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f9170c;
        actionBarContextView.f910c0 = null;
        super/*android.view.View*/.setVisibility(this.f9169b);
    }

    @Override // a6.g1
    public void b() {
        this.f9168a = true;
    }

    @Override // a6.g1
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f9168a = false;
    }

    public b(ActionBarContextView actionBarContextView) {
        this.f9170c = actionBarContextView;
        this.f9168a = false;
    }
}
