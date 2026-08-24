package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a76  reason: default package */
/* loaded from: classes.dex */
public abstract class a76 extends ak3 {
    @Override // defpackage.ak3
    public final View a(Context context) {
        View view = new View(context);
        view.setBackground(c(context));
        return view;
    }

    @Override // defpackage.ak3
    public float b() {
        return 1.3333334f;
    }

    public abstract Drawable c(Context context);
}
