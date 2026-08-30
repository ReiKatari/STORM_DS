package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yb5  reason: default package */
/* loaded from: classes.dex */
public final class yb5 {
    public final ColorStateList a;
    public final Configuration b;
    public final int c;

    public yb5(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.a = colorStateList;
        this.b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.c = hashCode;
    }
}
