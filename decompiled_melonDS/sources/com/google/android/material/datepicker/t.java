package com.google.android.material.datepicker;

import a6.k0;
import a6.x0;
import android.widget.LinearLayout;
import android.widget.TextView;
import j7.j1;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t extends j1 {

    /* renamed from: u  reason: collision with root package name */
    public final TextView f3059u;

    /* renamed from: v  reason: collision with root package name */
    public final MaterialCalendarGridView f3060v;

    public t(LinearLayout linearLayout, boolean z10) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3059u = textView;
        WeakHashMap weakHashMap = x0.f533a;
        new k0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.f3060v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z10) {
            textView.setVisibility(8);
        }
    }
}
