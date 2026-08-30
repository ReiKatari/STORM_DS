package defpackage;

import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs4  reason: default package */
/* loaded from: classes.dex */
public final class hs4 extends i65 {
    public final rs4 a;
    public final RecyclerView b;
    public final Preference c;
    public final String d;

    public hs4(rs4 rs4Var, RecyclerView recyclerView, Preference preference, String str) {
        this.a = rs4Var;
        this.b = recyclerView;
        this.c = preference;
        this.d = str;
    }

    @Override // defpackage.i65
    public final void a() {
        c();
    }

    @Override // defpackage.i65
    public final void b(int i, int i2, Object obj) {
        c();
    }

    public final void c() {
        int l;
        rs4 rs4Var = this.a;
        rs4Var.a.unregisterObserver(this);
        Preference preference = this.c;
        if (preference != null) {
            l = rs4Var.k(preference);
        } else {
            l = rs4Var.l(this.d);
        }
        if (l != -1) {
            this.b.h0(l);
        }
    }
}
