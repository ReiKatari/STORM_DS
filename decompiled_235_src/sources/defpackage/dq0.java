package defpackage;

import java.io.InputStream;
import java.util.zip.CRC32;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq0  reason: default package */
/* loaded from: classes.dex */
public final class dq0 extends w1 {
    public CRC32 w;
    public long x;
    public long y;

    public final eq0 l0() {
        f1 f1Var = this.t;
        if (f1Var != null) {
            return new eq0((InputStream) f1Var.t, this.w, this.y, this.x);
        }
        i.m("origin == null");
        return null;
    }
}
