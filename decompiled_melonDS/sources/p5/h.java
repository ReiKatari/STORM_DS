package p5;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final ColorStateList f11347a;

    /* renamed from: b  reason: collision with root package name */
    public final Configuration f11348b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11349c;

    public h(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        int hashCode;
        this.f11347a = colorStateList;
        this.f11348b = configuration;
        if (theme == null) {
            hashCode = 0;
        } else {
            hashCode = theme.hashCode();
        }
        this.f11349c = hashCode;
    }
}
