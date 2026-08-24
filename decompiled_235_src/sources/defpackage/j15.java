package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j15  reason: default package */
/* loaded from: classes.dex */
public final class j15 extends yf5 {
    public final t15 a;
    public final RecyclerView b;
    public final Preference c;
    public final String d;

    public j15(t15 t15Var, RecyclerView recyclerView, Preference preference, String str) {
        this.a = t15Var;
        this.b = recyclerView;
        this.c = preference;
        this.d = str;
    }

    @Override // defpackage.yf5
    public final void a() {
        c();
    }

    @Override // defpackage.yf5
    public final void b(Object obj, int i, int i2) {
        c();
    }

    public final void c() {
        int l;
        t15 t15Var = this.a;
        t15Var.a.unregisterObserver(this);
        Preference preference = this.c;
        if (preference != null) {
            l = t15Var.k(preference);
        } else {
            l = t15Var.l(this.d);
        }
        if (l != -1) {
            this.b.h0(l);
        }
    }
}
