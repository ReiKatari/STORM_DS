package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b extends g75 {
    public final TextView u;
    public final MaterialCalendarGridView v;

    public b(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.u = textView;
        WeakHashMap weakHashMap = aa7.a;
        new o97(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).f(textView, Boolean.TRUE);
        this.v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
