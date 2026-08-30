package j8;

import android.os.Build;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m implements l {

    /* renamed from: b  reason: collision with root package name */
    public final n8.e f7782b;

    public m() {
        n8.e eVar;
        if (Build.VERSION.SDK_INT >= 34) {
            eVar = n8.f.f10108b;
        } else {
            eVar = n8.c.f10103f;
        }
        this.f7782b = eVar;
        t.b(1, 2, 4, 8, 16, 32, 64, 128);
    }
}
