package m6;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends k0.g {
    @Override // k0.g
    public final Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
