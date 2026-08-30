package a0;

import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import j0.o1;
import j0.u0;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f3a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5c;

    public d(o1 o1Var, o1 o1Var2) {
        this.f3a = o1Var2.h(TextureViewIsClosedQuirk.class);
        this.f4b = o1Var.h(PreviewOrientationIncorrectQuirk.class);
        this.f5c = o1Var.h(ConfigureSurfaceToSecondarySessionFailQuirk.class);
    }

    public final void a(ArrayList arrayList) {
        if ((this.f3a || this.f4b || this.f5c) && arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ((u0) obj).a();
            }
            aj.g.o("ForceCloseDeferrableSurface", "deferrableSurface closed");
        }
    }
}
