package defpackage;

import android.util.Size;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: of6  reason: default package */
/* loaded from: classes.dex */
public final class of6 extends dz4 {
    public static boolean B() {
        if (oe1.a().b(PixelJpegRSupportedQuirk.class) != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.dz4
    public final Integer[] s() {
        Integer[] s = super.s();
        if (B()) {
            if (s != null) {
                ArrayList arrayList = new ArrayList();
                for (Integer num : s) {
                    if (num.intValue() != 4101) {
                        arrayList.add(num);
                    }
                }
                return (Integer[]) arrayList.toArray(new Integer[0]);
            }
            return null;
        }
        return s;
    }

    @Override // defpackage.dz4
    public final long t(int i, Size size) {
        size.getClass();
        if (i == 4101 && B()) {
            return 0L;
        }
        return super.t(i, size);
    }

    @Override // defpackage.dz4
    public final Size[] u(int i) {
        if (i == 4101 && B()) {
            return null;
        }
        return super.u(i);
    }
}
