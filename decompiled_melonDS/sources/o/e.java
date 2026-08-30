package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p.a0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ActionMode {

    /* renamed from: a  reason: collision with root package name */
    public final Context f10452a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10453b;

    public e(Context context, a aVar) {
        this.f10452a = context;
        this.f10453b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f10453b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f10453b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new a0(this.f10452a, this.f10453b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f10453b.f();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f10453b.g();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f10453b.A;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f10453b.h();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f10453b.B;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f10453b.i();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f10453b.j();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f10453b.k(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f10453b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f10453b.A = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f10453b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z10) {
        this.f10453b.p(z10);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i2) {
        this.f10453b.l(i2);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i2) {
        this.f10453b.n(i2);
    }
}
