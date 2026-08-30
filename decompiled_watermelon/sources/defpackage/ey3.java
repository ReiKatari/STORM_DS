package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ey3  reason: default package */
/* loaded from: classes.dex */
public final class ey3 implements fy3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ey3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fy3
    public final int a() {
        switch (this.a) {
            case 0:
                return 14;
            default:
                return 16;
        }
    }

    @Override // defpackage.fy3
    public final int b() {
        switch (this.a) {
            case 0:
                return 15;
            default:
                return 17;
        }
    }

    @Override // defpackage.fy3
    public final void c() {
        File file;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                vm5 vm5Var = (vm5) obj;
                vm5Var.c.evictAll();
                File externalCacheDir = vm5Var.a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    file = new File(externalCacheDir, "rom_icons");
                } else {
                    file = null;
                }
                if (file != null && file.isDirectory()) {
                    q72.H(file);
                    return;
                }
                return;
            default:
                ((d72) ((vp5) obj)).o();
                return;
        }
    }
}
