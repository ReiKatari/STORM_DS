package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zae extends zag {
    private final WeakReference zac;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj).zac.get();
        if (imageView2 != null && imageView != null && Objects.equal(imageView2, imageView)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z, boolean z2, boolean z3) {
        boolean z4;
        ImageView imageView = (ImageView) this.zac.get();
        if (imageView != null) {
            if (z2 || z) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 != null) {
                    if (drawable2 instanceof yz7) {
                        drawable2 = ((yz7) drawable2).g0;
                    }
                } else {
                    drawable2 = null;
                }
                yz7 yz7Var = new yz7(null);
                if (drawable2 == null) {
                    drawable2 = vz7.a;
                }
                yz7Var.f0 = drawable2;
                drawable2.setCallback(yz7Var);
                wz7 wz7Var = yz7Var.e0;
                wz7Var.b = drawable2.getChangingConfigurations() | wz7Var.b;
                if (drawable == null) {
                    drawable = vz7.a;
                }
                yz7Var.g0 = drawable;
                drawable.setCallback(yz7Var);
                wz7Var.b = drawable.getChangingConfigurations() | wz7Var.b;
                drawable = yz7Var;
            }
            imageView.setImageDrawable(drawable);
            if (drawable != null && z4) {
                yz7 yz7Var2 = (yz7) drawable;
                yz7Var2.L = yz7Var2.R;
                yz7Var2.Y = 0;
                yz7Var2.X = 250;
                yz7Var2.A = 1;
                yz7Var2.invalidateSelf();
            }
        }
    }

    public zae(ImageView imageView, Uri uri) {
        super(uri, 0);
        Asserts.checkNotNull(imageView);
        this.zac = new WeakReference(imageView);
    }
}
