package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er6  reason: default package */
/* loaded from: classes.dex */
public final class er6 extends s35 {
    public static boolean I() {
        if (si1.a().b(PixelJpegRSupportedQuirk.class) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s35
    public final Integer[] w() {
        Integer[] w = super.w();
        if (I()) {
            if (w != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : w) {
                    if (num.intValue() != 4101) {
                        arrayList.add(num);
                    }
                }
                return (Integer[]) arrayList.toArray(new Integer[0]);
            }
            return null;
        }
        return w;
    }

    @Override // defpackage.s35
    public final long x(int i, Size size) {
        size.getClass();
        if (i == 4101 && I()) {
            return 0L;
        }
        return super.x(i, size);
    }

    @Override // defpackage.s35
    public final Size[] y(int i) {
        if (i == 4101 && I()) {
            return null;
        }
        return super.y(i);
    }
}
