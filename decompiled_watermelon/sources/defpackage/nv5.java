package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nv5  reason: default package */
/* loaded from: classes.dex */
public abstract class nv5 extends id3 {
    @Override // defpackage.id3
    public final View a(Context context) {
        View view = new View(context);
        view.setBackground(c(context));
        return view;
    }

    @Override // defpackage.id3
    public float b() {
        return 1.3333334f;
    }

    public abstract Drawable c(Context context);
}
