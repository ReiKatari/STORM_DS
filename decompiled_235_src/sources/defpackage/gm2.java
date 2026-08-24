package defpackage;

import android.view.View;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm2  reason: default package */
/* loaded from: classes.dex */
public final class gm2 implements da7 {
    public final /* synthetic */ View a;
    public final /* synthetic */ ArrayList b;

    public gm2(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.da7
    public final void a(ea7 ea7Var) {
        ea7Var.D(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.da7
    public final void c(ea7 ea7Var) {
        ea7Var.D(this);
        ea7Var.a(this);
    }

    @Override // defpackage.da7
    public final void b() {
    }

    @Override // defpackage.da7
    public final void e() {
    }

    @Override // defpackage.da7
    public final void f(ea7 ea7Var) {
    }
}
