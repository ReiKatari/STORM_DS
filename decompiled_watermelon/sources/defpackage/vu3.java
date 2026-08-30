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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vu3  reason: default package */
/* loaded from: classes.dex */
public final class vu3 extends t65 {
    public final /* synthetic */ c a;
    public final /* synthetic */ wu3 b;

    public vu3(wu3 wu3Var, c cVar) {
        this.b = wu3Var;
        this.a = cVar;
    }

    @Override // defpackage.t65
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int N0;
        x80 x80Var = this.a.d;
        wu3 wu3Var = this.b;
        RecyclerView recyclerView2 = wu3Var.c0;
        if (i < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
            if (P0 == null) {
                N0 = -1;
            } else {
                N0 = q65.G(P0);
            }
        } else {
            N0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).N0();
        }
        Calendar a = z57.a(x80Var.A.A);
        a.add(2, N0);
        hz3 hz3Var = new hz3(a);
        wu3Var.R = hz3Var;
        MaterialButton materialButton = wu3Var.h0;
        Calendar a2 = z57.a(x80Var.A.A);
        a2.add(2, N0);
        a2.set(5, 1);
        Calendar a3 = z57.a(a2);
        a3.get(2);
        a3.get(1);
        a3.getMaximum(7);
        a3.getActualMaximum(5);
        a3.getTimeInMillis();
        long timeInMillis = a3.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = z57.a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        wu3Var.j(x80Var.A.d(hz3Var));
    }
}
