package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import j7.u0;
import j7.x0;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends x0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f3035a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f3036b;

    public k(m mVar, u uVar) {
        this.f3036b = mVar;
        this.f3035a = uVar;
    }

    @Override // j7.x0
    public final void b(RecyclerView recyclerView, int i2, int i10) {
        int N0;
        b bVar = this.f3035a.f3061d;
        m mVar = this.f3036b;
        RecyclerView recyclerView2 = mVar.f3037b0;
        if (i2 < 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView2.getLayoutManager();
            View P0 = linearLayoutManager.P0(0, false, linearLayoutManager.v());
            if (P0 == null) {
                N0 = -1;
            } else {
                N0 = u0.G(P0);
            }
        } else {
            N0 = ((LinearLayoutManager) recyclerView2.getLayoutManager()).N0();
        }
        Calendar a10 = x.a(bVar.A.A);
        a10.add(2, N0);
        q qVar = new q(a10);
        mVar.R = qVar;
        MaterialButton materialButton = mVar.f3042g0;
        Calendar a11 = x.a(bVar.A.A);
        a11.add(2, N0);
        a11.set(5, 1);
        Calendar a12 = x.a(a11);
        a12.get(2);
        a12.get(1);
        a12.getMaximum(7);
        a12.getActualMaximum(5);
        a12.getTimeInMillis();
        long timeInMillis = a12.getTimeInMillis();
        Locale locale = Locale.getDefault();
        AtomicReference atomicReference = x.f3064a;
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
        materialButton.setText(instanceForSkeleton.format(new Date(timeInMillis)));
        mVar.j(bVar.A.d(qVar));
    }
}
