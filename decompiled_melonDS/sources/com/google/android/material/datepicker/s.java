package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView A;
    public final /* synthetic */ u B;

    public s(u uVar, MaterialCalendarGridView materialCalendarGridView) {
        this.B = uVar;
        this.A = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        MaterialCalendarGridView materialCalendarGridView = this.A;
        r a10 = materialCalendarGridView.a();
        if (i2 >= a10.a() && i2 <= a10.c()) {
            if (materialCalendarGridView.a().getItem(i2).longValue() < ((m) this.B.f3062e.B).L.L.A) {
                return;
            }
            throw null;
        }
    }
}
