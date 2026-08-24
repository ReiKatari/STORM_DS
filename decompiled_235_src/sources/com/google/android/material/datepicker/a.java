package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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
        j74 a = materialCalendarGridView.a();
        if (i >= a.a() && i <= a.c()) {
            if (materialCalendarGridView.a().getItem(i).longValue() < ((f24) this.B.e.B).L.L.A) {
                return;
            }
            throw null;
        }
    }
}
