package defpackage;

import java.io.InputStream;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tn0  reason: default package */
/* loaded from: classes.dex */
public final class tn0 extends v1 {
    public CRC32 x;
    public long y;
    public long z;

    public final un0 p0() {
        e1 e1Var = this.u;
        if (e1Var != null) {
            return new un0((InputStream) e1Var.u, this.x, this.z, this.y);
        }
        i.n("origin == null");
        return null;
    }
}
