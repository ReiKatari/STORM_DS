package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class a implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView A;
    public final /* synthetic */ c B;

    public a(c cVar, MaterialCalendarGridView materialCalendarGridView) {
        this.B = cVar;
        this.A = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        MaterialCalendarGridView materialCalendarGridView = this.A;
        iz3 a = materialCalendarGridView.a();
        if (i >= a.a() && i <= a.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() < ((wu3) this.B.e.B).L.L.A) {
                return;
            }
            throw null;
        }
    }
}
