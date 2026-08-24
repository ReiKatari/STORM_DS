package defpackage;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e24  reason: default package */
/* loaded from: classes.dex */
public final class e24 extends jg5 {
    public final /* synthetic */ c a;
    public final /* synthetic */ f24 b;

    public e24(f24 f24Var, c cVar) {
        this.b = f24Var;
        this.a = cVar;
    }

    @Override // defpackage.jg5
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int N0;
        fb0 fb0Var = this.a.d;
        f24 f24Var = this.b;
        RecyclerView recyclerView2 = f24Var.d0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
            if (P0 == null) {
                N0 = -1;
            } else {
                N0 = gg5.G(P0);
            }
        } else {
            N0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).N0();
        }
        Calendar a = uj7.a(fb0Var.A.A);
        a.add(2, N0);
        i74 i74Var = new i74(a);
        f24Var.R = i74Var;
        MaterialButton materialButton = f24Var.i0;
        Calendar a2 = uj7.a(fb0Var.A.A);
        a2.add(2, N0);
        a2.set(5, 1);
        Calendar a3 = uj7.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        long timeInMillis = a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = uj7.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        f24Var.j(fb0Var.A.d(i74Var));
    }
}
