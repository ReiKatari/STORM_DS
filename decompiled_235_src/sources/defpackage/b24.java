package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b24  reason: default package */
/* loaded from: classes.dex */
public final class b24 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final Object B;
    public final /* synthetic */ Object L;

    /* JADX WARN: Type inference failed for: r0v1, types: [a8, java.lang.Object] */
    public b24(l87 l87Var) {
        this.A = 2;
        this.L = l87Var;
        Context context = l87Var.a.getContext();
        CharSequence charSequence = l87Var.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.g = 4096;
        obj.l = null;
        obj.m = null;
        obj.n = false;
        obj.o = false;
        obj.p = 16;
        obj.i = context;
        obj.a = charSequence;
        this.B = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int G;
        int i = this.A;
        Object obj = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                f24 f24Var = (f24) obj2;
                Calendar a = uj7.a(((c) obj).d.A.A);
                a.add(2, ((LinearLayoutManager) f24Var.d0.getLayoutManager()).N0() - 1);
                f24Var.h(new i74(a));
                return;
            case 1:
                f24 f24Var2 = (f24) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) f24Var2.d0.getLayoutManager();
                View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
                if (P0 == null) {
                    G = -1;
                } else {
                    G = gg5.G(P0);
                }
                Calendar a2 = uj7.a(((c) obj).d.A.A);
                a2.add(2, G + 1);
                f24Var2.h(new i74(a2));
                return;
            default:
                l87 l87Var = (l87) obj2;
                Window.Callback callback = l87Var.k;
                if (callback != null && l87Var.l) {
                    callback.onMenuItemSelected(0, (a8) obj);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ b24(f24 f24Var, c cVar, int i) {
        this.A = i;
        this.L = f24Var;
        this.B = cVar;
    }
}
