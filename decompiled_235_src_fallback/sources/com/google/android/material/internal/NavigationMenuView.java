package com.google.android.material.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements defpackage.d54 {
    public NavigationMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r3 = 1
            r2.<init>(r3, r0)
            r1.setLayoutManager(r2)
            return
    }

    @Override // defpackage.d54
    public final void b(defpackage.i44 r1) {
            r0 = this;
            return
    }

    public int getWindowAnimations() {
            r0 = this;
            r0 = 0
            return r0
    }
}
