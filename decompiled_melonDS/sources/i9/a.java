package i9;

import java.io.File;
import m9.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f7030a;

    public a(boolean z10) {
        this.f7030a = z10;
    }

    @Override // i9.b
    public final String a(Object obj, n nVar) {
        File file = (File) obj;
        if (this.f7030a) {
            return file.getPath() + ':' + file.lastModified();
        }
        return file.getPath();
    }
}
