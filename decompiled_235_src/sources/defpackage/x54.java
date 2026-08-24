package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x54  reason: default package */
/* loaded from: classes.dex */
public final class x54 implements y54 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ x54(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y54
    public final int a() {
        switch (this.a) {
            case 0:
                return 14;
            default:
                return 16;
        }
    }

    @Override // defpackage.y54
    public final void b() {
        File file;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kx5 kx5Var = (kx5) obj;
                kx5Var.c.evictAll();
                File externalCacheDir = kx5Var.a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    file = new File(externalCacheDir, "rom_icons");
                } else {
                    file = null;
                }
                if (file != null && file.isDirectory()) {
                    jc2.x0(file);
                    return;
                }
                return;
            default:
                ((xb2) ((p06) obj)).q();
                return;
        }
    }

    @Override // defpackage.y54
    public final int c() {
        switch (this.a) {
            case 0:
                return 15;
            default:
                return 17;
        }
    }
}
