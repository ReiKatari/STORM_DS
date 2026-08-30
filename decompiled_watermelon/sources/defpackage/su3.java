package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: su3  reason: default package */
/* loaded from: classes.dex */
public final class su3 implements View.OnClickListener {
    public final /* synthetic */ int A;
    public final Object B;
    public final /* synthetic */ Object L;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, z7] */
    public su3(yv6 yv6Var) {
        this.A = 2;
        this.L = yv6Var;
        Context context = yv6Var.a.getContext();
        CharSequence charSequence = yv6Var.h;
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
                wu3 wu3Var = (wu3) obj2;
                Calendar a = z57.a(((c) obj).d.A.A);
                a.add(2, ((LinearLayoutManager) wu3Var.c0.getLayoutManager()).N0() - 1);
                wu3Var.h(new hz3(a));
                return;
            case 1:
                wu3 wu3Var2 = (wu3) obj2;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) wu3Var2.c0.getLayoutManager();
                View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
                if (P0 == null) {
                    G = -1;
                } else {
                    G = q65.G(P0);
                }
                Calendar a2 = z57.a(((c) obj).d.A.A);
                a2.add(2, G + 1);
                wu3Var2.h(new hz3(a2));
                return;
            default:
                yv6 yv6Var = (yv6) obj2;
                Window.Callback callback = yv6Var.k;
                if (callback != null && yv6Var.l) {
                    callback.onMenuItemSelected(0, (z7) obj);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ su3(wu3 wu3Var, c cVar, int i) {
        this.A = i;
        this.L = wu3Var;
        this.B = cVar;
    }
}
