package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v91  reason: default package */
/* loaded from: classes.dex */
public final class v91 extends nj7 {
    @Override // defpackage.nj7
    public final Signature[] a(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }
}
