package k0;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Typeface;
import nc.k;
import p4.j;
import p4.l;
import p4.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class g implements l9.e, cc.f, o, u7.e, u7.b {
    public static g A;

    public static Typeface f(String str, j jVar, int i2) {
        Typeface create;
        Typeface create2;
        if (i2 == 0 && k.a(jVar, j.R) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        boolean z10 = false;
        if (str == null) {
            create = Typeface.DEFAULT;
        } else {
            create = Typeface.create(str, 0);
        }
        int i10 = jVar.A;
        if (i2 == 1) {
            z10 = true;
        }
        create2 = Typeface.create(create, i10, z10);
        return create2;
    }

    @Override // p4.o
    public Typeface b(l lVar, j jVar, int i2) {
        lVar.getClass();
        return f("monospace", jVar, i2);
    }

    @Override // l9.e
    public boolean c() {
        return true;
    }

    @Override // p4.o
    public Typeface d(j jVar, int i2) {
        return f(null, jVar, i2);
    }

    @Override // u7.b
    public u7.c e(u7.a aVar) {
        return new v7.h(aVar.f13497a, aVar.f13498b, aVar.f13499c, aVar.f13500d, aVar.f13501e);
    }

    public Signature[] g(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // u7.e
    public String h() {
        return "SELECT COUNT(*) FROM game";
    }

    @Override // l9.e
    public void shutdown() {
    }

    @Override // u7.e
    public void a(u7.d dVar) {
    }
}
