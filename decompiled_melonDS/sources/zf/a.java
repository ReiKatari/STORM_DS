package zf;

import android.content.SharedPreferences;
import java.io.File;
import kf.g1;
import kf.l0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zb.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15063a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15064b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f15063a = i2;
        this.f15064b = obj;
    }

    @Override // zf.k
    public final int a() {
        switch (this.f15063a) {
            case 0:
                return 14;
            case DSiCameraSource.FrontCamera /* 1 */:
                return 16;
            default:
                return 6;
        }
    }

    @Override // zf.k
    public final int b() {
        switch (this.f15063a) {
            case 0:
                return 15;
            case DSiCameraSource.FrontCamera /* 1 */:
                return 17;
            default:
                return 7;
        }
    }

    @Override // zf.k
    public final void c() {
        File file;
        switch (this.f15063a) {
            case 0:
                g1 g1Var = (g1) this.f15064b;
                g1Var.f8225c.clear();
                File externalCacheDir = g1Var.f8223a.getExternalCacheDir();
                if (externalCacheDir != null) {
                    file = new File(externalCacheDir, "rom_icons");
                } else {
                    file = null;
                }
                if (file != null && file.isDirectory()) {
                    jc.j.R(file);
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((l0) ((cf.c) this.f15064b)).f();
                return;
            default:
                SharedPreferences.Editor edit = ((SharedPreferences) this.f15064b).edit();
                s sVar = s.A;
                edit.putStringSet("bios_dir", sVar);
                edit.putStringSet("rom_search_dirs", sVar);
                edit.putStringSet("sram_dir", sVar);
                edit.apply();
                return;
        }
    }
}
