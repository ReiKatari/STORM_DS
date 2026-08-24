package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rd1  reason: default package */
/* loaded from: classes.dex */
public final class rd1 extends w31 {
    @Override // defpackage.w31
    public final Signature[] r(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
