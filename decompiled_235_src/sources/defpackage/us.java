package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: us  reason: default package */
/* loaded from: classes.dex */
public abstract class us {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) vs.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
