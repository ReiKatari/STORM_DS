package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public abstract class hs {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) is.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
