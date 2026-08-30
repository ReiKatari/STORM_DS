package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh2  reason: default package */
/* loaded from: classes.dex */
public final class gh2 implements hx6 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public gh2(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.hx6
    public final void a(ix6 ix6Var) {
        ix6Var.D(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.hx6
    public final void d(ix6 ix6Var) {
        ix6Var.D(this);
        ix6Var.a(this);
    }

    @Override // defpackage.hx6
    public final void b() {
    }

    @Override // defpackage.hx6
    public final void c() {
    }

    @Override // defpackage.hx6
    public final void e(ix6 ix6Var) {
    }
}
